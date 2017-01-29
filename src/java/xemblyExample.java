/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
import org.xembly.Directives;
import org.xembly.Xembler;
public class xemblyExample {
  public static void main(String[] args) throws Exception {
    /**String[] names = new String[] {
      "Jeffrey Lebowski",
      "Walter Sobchak",
      "Theodore Donald 'Donny' Kerabatsos",
    };
    Directives directives = new Directives().add("actors");
    for (String name : names) {
      directives.add("actor").set(name).up();
    }
    */
    
    //urn:mpeg:mpeg21:cel:core:2015
    Directives Core = new Directives().add("cel-core:Contract");
    Core.attr("xmlns:cel-core","urn:mpeg:mpeg21:cel:core:2015");
    Core.attr("xmlns:cel-ipre","urn:mpeg:mpeg21:cel:ipre:2015");
    Core.attr("xmlns:dc","http://purl.org/dc/elements/1.1/");
    Core.attr("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
    Core.attr("xmlns:dii","urn:mpeg:mpeg21:2002:01-DII-NS");
    Core.attr("xsi:schemaLocation","urn:mpeg:mpeg21:cel:core:2015 cel-core.xsd urn:mpeg:mpeg21:cel:ipre:2015 cel-ipre.xsd");
    Core.attr("xmlns:rel-r", "urn:mpeg:mpeg21:2003:01-REL-R-NS");
    Core.attr("contractId","contract Annex B Example 2");
    // METADATA Core.add("cel-core:Other");
    
    /**PARTYS**/
    Core.push();
    Core.add("cel-core:Party");
        Core.attr("Id", "RAI");
        Core.push();
        Core.add("cel-core:Organization");
            Core.push();
            Core.add("cel-core:Name");
                Core.set("RAI Radiotelevisione Italiana");
            Core.pop();
            Core.push();
            Core.add("dc:identifier");
                Core.set("urn:VATIN:IT06382641006");
            Core.pop();
            Core.push();
            Core.add("dc:description");
                Core.set("The Italian public broadcasting company");
            Core.pop();
            Core.push();
            Core.add("cel-core:Signatory");
                Core.push();
                Core.add("cel-core:Name");
                    Core.set("Mario Rossi");
                Core.pop();
                Core.push();
                Core.add("cel-core:Details");
                    Core.attr("xmlns:vCard", "http://www.w3.org/2001/vcard-rdf/3.0#");
                    Core.attr("xmlns:rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
                    Core.push();
                    Core.add("vCard:EMAIL");
                        Core.attr("rdf:parseType", "Resource");
                        Core.push();
                        Core.add("rdf:value");
                            Core.set("thee@nowhere.com");
                        Core.pop();
                        Core.push();
                        Core.add("rdf:type");
                            Core.attr("rdf:resource", "http://www.w3.org/2001/vcard-rdf/3.0#internet");
                        Core.pop();
                    Core.pop();
                Core.pop();
            Core.pop();
        Core.pop();
        Core.add("cel-core:Address");
        Core.set("Viale Mazzini 14, 00195 Roma, ITALY");
    Core.pop();
    Core.push();
    Core.add("cel-core:Party");
        Core.attr("Id", "JDOE");
        Core.push();
        Core.add("cel-core:Person");
            Core.push();
            Core.add("cel-core:Name");
                Core.set("John Dow");
            Core.pop();
            Core.push();
            Core.add("dc:identifier");
                Core.set("urn:VATIN:123456");
            Core.pop();
            Core.push();
            Core.add("dc:description");
                Core.set("Second party of the contract");
            Core.pop();
            Core.push();
            Core.add("cel-core:Details");
                Core.attr("xmlns:mpeg7", "urn:mpeg:mpeg7:schema:2001");
                Core.push();
                Core.add("mpeg7:Person");
                    Core.push();
                    Core.add("mpeg7:Name");
                        Core.push();
                        Core.add("mpeg7:GivenName");
                            Core.set("John");
                        Core.pop();
                        Core.push();
                        Core.add("mpeg7:FamilyName");
                            Core.set("Doe");
                        Core.pop();
                        Core.push();
                        Core.add("mpeg7:Title");
                            Core.set("Dr");
                        Core.pop();
                    Core.pop();
                    Core.push();
                    Core.add("mpeg7:Affiliation");
                        Core.add("mpeg7:Organization");
                            Core.set("John Doe Communications");
                    Core.pop();
                    Core.push();
                    Core.add("mpeg7:Citizenship");
                        Core.set("UK");
                    Core.pop();
                    Core.push();
                    Core.add("mpeg7:ElectronicAddress");
                        Core.push();
                        Core.add("mpeg7:Telephone");
                            Core.set("+12 345 6789100");
                        Core.pop();
                        Core.push();
                        Core.add("mpeg7:Email");
                            Core.set("johndoe@secondparty.com");
                        Core.pop();
                    Core.pop();
                Core.pop();   
            Core.pop();
        Core.pop();
        Core.add("cel-core:Address");
        Core.set("Viale Mazzini 14, 00195 Roma, ITALY");
    Core.pop();
    
   
    /*Core.push();
    Core.add("cel-core:TextClause");
        Core.attr("id", "TC002");
            Core.push();
            Core.add("cel-core:TextParagraph");
                Core.attr("id", "TP002h");
                Core.set("2.1 (Acquisition of 100% exploitation rights both by free of charge and upon any kind of payment communication to the public and/or by making the Program available to the public, both free of charge and upon any kind of payments, at the time and place chosen by the viewer, in Italy, Vatican City, Republic of San Marino and Principality of Monaco) Under this Agreement, Rai acquires ...");
            Core.pop();
            Core.push();
            Core.add("cel-core:TextParagraph");
                Core.attr("id", "TP002i");
                Core.set("i) by communication to the public through remote diffusion/broadcast, whether ");
            Core.pop();
            Core.push();
            Core.add("cel-core:TextParagraph");
                Core.attr("id", "TP002ii");
                Core.set("ii) by making the Program available to the public");
            Core.pop();
                
            Core.push();
            Core.add("cel-core:TextParagraph");
                Core.attr("id", "TC002R");
                Core.set("The following number of runs are hereby granted during the License Period:");
            Core.pop();
            Core.push();
            Core.add("cel-core:TextParagraph");
                Core.attr("id", "TP002Rh");
                Core.set("i) by communication to the public through remote diffusion/broadcast, whether ");
                Core.pop();
            Core.push();
            Core.add("cel-core:TextParagraph");
                Core.attr("id", "TP002R1");
                Core.set("- with reference to the communication to the public by unencrypted and free of charge television");
            Core.pop();   
    Core.pop();
    */
    Core.push();
    Core.add("cel-core:Body");
        Core.push();
        Core.add("cel-core:OperativePart");
            Core.push();
            Core.add("cel-core:Permission");
                Core.attr("id", "RAI");
                Core.push();
                Core.add("cel-core:Subject");
                    Core.attr("partyRef","JDOE");
                Core.pop();
                Core.push();
                Core.add("cel-core:Act");
                    Core.set("Blablabla");
                    /*Aqui tmb pot anar cel-core:Object*/
                Core.pop();
                Core.push();
                Core.add("cel-core:Object");
                    Core.set("miamumiasdijigbeijsdnfojnasoed");
                Core.pop();
            Core.pop();
            
    
    
    
    //urn:mpeg:mpeg21:cel:ipre:2015
    //urn:mpeg:mpeg21:cel:pane:2015
    //urn:mpeg:mpeg21:cel:rele:2015
    
    System.out.println(new Xembler(Core).xml());
  }
}
