/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
import com.marcobrador.tfm.cel.db.model.*;
import org.xembly.Directives;
import org.xembly.Xembler;
public class ConditionalCreator {

    public static void WriteContract(Contract c) throws Exception {
        Directives Core = new Directives().add("cel-core:Contract");
        Core.attr("xmlns:cel-core","urn:mpeg:mpeg21:cel:core:2015");
        Core.attr("xmlns:cel-ipre","urn:mpeg:mpeg21:cel:ipre:2015");
        Core.attr("xmlns:dc","http://purl.org/dc/elements/1.1/");
        Core.attr("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
        Core.attr("xmlns:dii","urn:mpeg:mpeg21:2002:01-DII-NS");
        Core.attr("xsi:schemaLocation","urn:mpeg:mpeg21:cel:core:2015 cel-core.xsd urn:mpeg:mpeg21:cel:ipre:2015 cel-ipre.xsd");
        Core.attr("xmlns:rel-r", "urn:mpeg:mpeg21:2003:01-REL-R-NS");
        
        
        Core.attr("contractId", c.getContractId());
        Core.push();
        Core.add("cel-core:TextVersion");
            Core.set(c.getTextVersion());
        Core.pop();
        //ADD ENCRYPTED
        //ADD METADATA
        //CONTRACTS RELATED   
        //PARTYS
        for(Party p : c.getParties()){
            Core.push();
            Core.add("cel-core:Party");
                Core.attr("Id", p.getId());
                PartyBasicGroup pbg = p.getPartyBasicGroup();
                if(pbg.getType().equals("Organization")){
                    Core.push();
                    Core.add("cel-core:Organization");
                        Core.push();
                        Core.add("cel-core:Name");
                            Core.set(pbg.getName());
                        Core.pop();
                        Core.push();
                        Core.add("dc:identifier");
                            Core.set(pbg.getIdentifier());
                        Core.pop();
                        Core.push();
                        Core.add("dc:description");
                            Core.set(pbg.getDescription());
                        Core.pop();
                        //ADD SIGNATORY
                    Core.pop();
                }
                else if(pbg.getType().equals("Person")){
                    Core.push();
                    Core.add("cel-core:Person");
                        Core.push();
                        Core.add("cel-core:Name");
                            Core.set(pbg.getName());
                        Core.pop();
                        Core.push();
                        Core.add("dc:identifier");
                            Core.set(pbg.getIdentifier());
                        Core.pop();
                        Core.push();
                        Core.add("dc:description");
                            Core.set(pbg.getDescription());
                        Core.pop();
                        //ADD SIGNATORY
                    Core.pop();
                }
                Core.push();
                Core.add("dc:Address");
                    Core.set(pbg.getDescription());
                Core.pop();
            Core.pop();
        }
        //BODY
        com.marcobrador.tfm.cel.db.model.Body b = c.getBody();
        Core.push();
        Core.add("cel-core:Body");
        OperativePart op = c.getBody().getOperativePart();
            Core.push();
            Core.add("cel-core:OperativePart");
            for (DeonticStructuredClause d : op.getClauses()){
                Core.push();
                Core.add(/*QUE COJONES VA AQUI? como se sabe si es ipre, permision, ...*/"");
                    Core.attr("id",d.getId());
                    //Core.attr("number", d.getNumber());
                    Core.push();
                    Core.add("cel-core:Subject");
                        //Core.attr("partyRef",d.get);
                    /* AQUI LA MOVIDA DE LAS CONDICIONES */
                    Core.pop();
                Core.pop();
            }
            Core.pop();
        Core.pop();    
    }
}
