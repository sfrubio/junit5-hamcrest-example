import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Refrigerator {

    public List<String> whatDoIHaveOnFirstRow() {
        return RefrigeratorItems.getItemsOnRow(1).stream()
                .map(RefrigeratorItems::getDescription)
                .collect(Collectors.toList());
    }

    public List<String> whatDoIHaveOnRow(Integer row) {
        return RefrigeratorItems.getItemsOnRow(row).stream()
                .map(RefrigeratorItems::getDescription)
                .collect(Collectors.toList());
    }

    public Boolean doIHaveAn(String item) {
        return Arrays.stream(RefrigeratorItems.values())
                .anyMatch(value -> value.getDescription().equals(item));
    }

    public Integer howManyRowsDoItHas() {
        return Arrays.stream(RefrigeratorItems.values())
                .mapToInt(RefrigeratorItems::getRow)
                .max().orElse(0);
    }
}