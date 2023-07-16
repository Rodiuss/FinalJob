package searchengine.dto.statistics;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class SearchResults {
    private boolean result;
    private int count;
    private List<StatisticsSearch> data;

    public SearchResults(boolean result){
        this.result = result;
    }

    public SearchResults(boolean result, int count, List<StatisticsSearch> data) {
        this.result = result;
        this.count = count;
        this.data = data;
    }
}
