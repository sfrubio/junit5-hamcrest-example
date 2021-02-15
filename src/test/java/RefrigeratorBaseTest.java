import org.junit.jupiter.api.BeforeAll;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class RefrigeratorBaseTest {

    static Refrigerator refrigerator;
    List<String> items;
    Boolean existentItem;

    @BeforeAll
    static void setup() {
        refrigerator = new Refrigerator();
    }

    void whenCheckWhichItemsIHaveOnFirstRow() {
        items = refrigerator.whatDoIHaveOnFirstRow();
    }

    void whenCheckWhichItemsIHaveOnRow(Integer row) {
        items = refrigerator.whatDoIHaveOnRow(row);
    }

    void whenICheckIfIHaveItem(String item) {
        existentItem = refrigerator.doIHaveAn(item);
    }

    void thenFirstRowItemsMustBe(String... expectedItems) {
        assertThat("It must have rice, beans, cottage and carrot",
                items, containsInAnyOrder(expectedItems));
    }

    void thenItMustNotHaveItems() {
        assertThat("It must not have items",
                items, hasSize(lessThan(1)));
    }

    void thenItemMustExist(String item) {
        assertThat("It must exist item " + item, existentItem, is(true));
    }

    void thenItemMustNotExist(String item) {
        assertThat("It must exist item " + item, existentItem, is(false));
    }
}
