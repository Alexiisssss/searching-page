package searchengine.dto.statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndexingStatusResponse {
    @NonNull
    boolean result;
    String error;

    @Override
    public String toString() {
        return "{\"result\": " + this.result + ", \"error\": \"" + this.error + "\"}";
    }
}
