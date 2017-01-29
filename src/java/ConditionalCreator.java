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
public class ConditionalCreator {

    public static void main(String[] args) throws Exception {
        Directives Core = new Directives().add("cel-core:Contract");
        Core.attr("xmlns:cel-core","urn:mpeg:mpeg21:cel:core:2015");
        Core.attr("xmlns:cel-ipre","urn:mpeg:mpeg21:cel:ipre:2015");
        Core.attr("xmlns:dc","http://purl.org/dc/elements/1.1/");
        Core.attr("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
        Core.attr("xmlns:dii","urn:mpeg:mpeg21:2002:01-DII-NS");
        Core.attr("xsi:schemaLocation","urn:mpeg:mpeg21:cel:core:2015 cel-core.xsd urn:mpeg:mpeg21:cel:ipre:2015 cel-ipre.xsd");
        Core.attr("xmlns:rel-r", "urn:mpeg:mpeg21:2003:01-REL-R-NS");
        Core.attr("contractId","contract Annex B Example 2");
        
//        PARTYS
        Party[] partys;
        for(int i = 0; i < partys.size(); ++i){
            Party p = new Party(partys[i]);
            Core.push();
            Core.add("cel-core:Party");
                Core.attr("Id", p.Id);
                If (p.Type == "Organization") {
                    Core.push();
                    Core.add("cel-core:Organization");
                        Core.push();
                        Core.add("cel-core:Name");
                            Core.set(p.Name);
                        Core.pop();
                }
                Else if(p.Type == "Person"){
                    
                }
        }   
    }
}
