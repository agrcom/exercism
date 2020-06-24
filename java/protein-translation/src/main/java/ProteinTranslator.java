import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import java.util.List;

class ProteinTranslator {

    ImmutableMap<String, String> codonProtein = ImmutableMap.<String, String>builder()
            .put("AUG", "Methionine")
            .put("UUU", "Phenylalanine")
            .put("UUC", "Phenylalanine")
            .put("UUA", "Leucine")
            .put("UUG", "Leucine")
            .put("UCU", "Serine")
            .put("UCC", "Serine")
            .put("UCA", "Serine")
            .put("UCG", "Serine")
            .put("UAU", "Tyrosine")
            .put("UAC", "Tyrosine")
            .put("UGU", "Cysteine")
            .put("UGC", "Cysteine")
            .put("UGG", "Tryptophan")
            .put("UAA", "STOP")
            .put("UAG", "STOP")
            .put("UGA", "STOP")
            .build();

    List<String> translate(String rnaSequence) {
        List<String> resultList = Lists.newArrayList();

        Iterable<String> rnaSequenceSplitted = Splitter.fixedLength(3).split(rnaSequence);

        for (String rna : rnaSequenceSplitted) {
            if (codonProtein.get(rna).equals("STOP")) {
                break;
            }
            resultList.add(codonProtein.get(rna));
        }

        return resultList;
    }
}