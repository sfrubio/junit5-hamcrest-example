import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class RefrigeratorTest extends RefrigeratorBaseTest {

    @Test
    void checkFirstRowItems() {
        whenCheckWhichItemsIHaveOnFirstRow();
        thenFirstRowItemsMustBe("rice", "beans", "cottage", "carrot");
    }

    @Test
    void checkItemsOnExistentRow(){
        whenCheckWhichItemsIHaveOnRow(1);
        thenFirstRowItemsMustBe("rice", "beans", "cottage", "carrot");
    }

    @Test
    void checkItemsOnUnExistentRow(){
        whenCheckWhichItemsIHaveOnRow(5);
        thenItMustNotHaveItems();
    }

    @Test
    void checkItemsOnRow0(){
        whenCheckWhichItemsIHaveOnRow(0);
        thenItMustNotHaveItems();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "refrigerator-items.csv", numLinesToSkip = 1)
    void findAnExistentItem(String itemToCheck) {
        whenICheckIfIHaveItem(itemToCheck);
        thenItemMustExist(itemToCheck);
    }

    @Test
    void findAnUnExistentItemOnRefrigerator() {
        String itemToCheck = "watermelon";
        whenICheckIfIHaveItem(itemToCheck);
        thenItemMustNotExist(itemToCheck);
    }
}