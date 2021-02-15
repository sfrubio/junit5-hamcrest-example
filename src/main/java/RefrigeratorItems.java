import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum RefrigeratorItems {

    RICE("rice", 1),
    BEANS("beans", 1),
    COTTAGE("cottage", 1),
    CARROT("carrot", 1),
    BUTTER("butter", 2),
    CHEESE("cheese", 2),
    HAM("ham", 2),
    ORANGE("orange", 3),
    APPLE("apple", 3),
    JUICE("juice", 4),
    BEER("beer", 4);

    private String description;
    private Integer row;

    RefrigeratorItems(String description, Integer row) {
        this.description = description;
        this.row = row;
    }

    public String getDescription() {
        return description;
    }

    public Integer getRow() {
        return row;
    }

    public static List<RefrigeratorItems> getItemsOnRow(Integer row) {
        return Arrays.stream(RefrigeratorItems.values())
                .filter(item -> item.getRow().equals(row))
                .collect(Collectors.toList());
    }
}
