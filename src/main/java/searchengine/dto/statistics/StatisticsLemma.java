package searchengine.dto.statistics;

import lombok.Value;

@Value
public class StatisticsLemma {
    String lemma;
    int frequency;
}