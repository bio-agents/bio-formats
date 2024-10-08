package org.isaagents.webvalley.bioimage;

import org.isaagents.isacreator.ontologiser.logic.impl.AnnotatorSearchClient;
import org.isaagents.isacreator.ontologymanager.bioportal.model.AnnotatorResult;
import org.junit.Test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by the ISA team
 *
 * @author Eamonn Maguire (eamonnmag@gmail.com)
 *         <p/>
 *         Date: 28/06/2012
 *         Time: 12:32
 */
public class AnnotatorTest {

    @Test
    public void testAnnotator() {
        Set<String> freeText = new HashSet<String>();

        freeText.add("cytoplasm");
        freeText.add("nucleus");
        freeText.add("plasma membrane");

        AnnotatorSearchClient sc = new AnnotatorSearchClient();

        Map<String, Map<String, AnnotatorResult>> result = sc.searchForTerms(freeText, "", true);


        int termsWithMatches = 0;
        for (String key : result.keySet()) {
            System.out.println(key);

            for (String match : result.get(key).keySet()) {
                AnnotatorResult annotatorResult = result.get(key).get(match);
                System.out.println("\t " + match + " " +
                        annotatorResult.getOntologyTerm().getOntologyPurl()
                        + " " + annotatorResult.getScore());
            }

        }

        System.out.println(termsWithMatches + "/" + freeText.size() + " terms have matches.");

    }
}
