package org.isaagents.webvalley.bioimage;

import org.isaagents.isacreator.ontologiser.logic.impl.AnnotatorSearchClient;
import org.isaagents.isacreator.ontologymanager.bioportal.model.AnnotatorResult;

import java.util.Map;
import java.util.Set;

/**
 * Created by the ISA team
 *
 * @author Eamonn Maguire (eamonnmag@gmail.com)
 *         <p/>
 *         Date: 28/06/2012
 *         Time: 12:46
 */
public class AnnotationTagger {

    public Map<String, Map<String, AnnotatorResult>> annotateTerms(Set<String> termsToAnnotate) {
        AnnotatorSearchClient sc = new AnnotatorSearchClient();

        return sc.searchForTerms(termsToAnnotate);
    }
}
