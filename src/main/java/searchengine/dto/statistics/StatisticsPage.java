package searchengine.dto.statistics;

import lombok.Value;

@Value
public class StatisticsPage {
    String url;
    String content;
    int code;
}