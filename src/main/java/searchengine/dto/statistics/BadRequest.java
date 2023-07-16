package searchengine.dto.statistics;

import lombok.Value;

@Value
public class BadRequest {
    boolean gotResult;
    String error;
}
