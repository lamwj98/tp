package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.ExpenditureExpert;
import seedu.address.model.expense.Expense;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalExpenses {

    /*
    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253")
            .withTags("friends").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withEmail("johnd@example.com").withPhone("98765432")
            .withTags("owesMoney", "friends").build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withAddress("wall street").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withAddress("10th street").withTags("friends").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").withAddress("michegan ave").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").withAddress("little tokyo").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").withAddress("4th street").build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withAddress("little india").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withAddress("chicago ave").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

     */

    public static final Expense ANNUAL_NETFLIX_FEES = new ExpenseBuilder().withDescription("Annual Netflix Fees")
            .withExpenseCategory("Entertainment").withAmount("200").build();
    public static final Expense BASEBALL_LESSON_FEES = new ExpenseBuilder().withDescription("Baseball Lesson Fees")
            .withExpenseCategory("Entertainment").withAmount("100").build();
    public static final Expense CAR_WASH = new ExpenseBuilder().withDescription("Car Wash")
            .withExpenseCategory("Miscellaneous").withAmount("20").build();
    public static final Expense DENTAL = new ExpenseBuilder().withDescription("Dental")
            .withExpenseCategory("Medical").withAmount("200").build();
    public static final Expense ELECTRICAL_APPLIANCES = new ExpenseBuilder().withDescription("Electrical Appliances")
            .withExpenseCategory("Miscellaneous").withAmount("50").build();
    public static final Expense FISHING_APPARATUS = new ExpenseBuilder().withDescription("Fishing Apparatus")
            .withExpenseCategory("Entertainment").withAmount("159.5").build();
    public static final Expense GROCERIES = new ExpenseBuilder().withDescription("Groceries")
            .withExpenseCategory("Groceries").withAmount("69.85").build();
    public static final Expense HOUSING_RENT = new ExpenseBuilder().withDescription("Housing Rent")
            .withExpenseCategory("Housing").withAmount("500").build();
    public static final Expense INTERNET_BILLS = new ExpenseBuilder().withDescription("Internet Bills")
            .withExpenseCategory("Bills").withAmount("69").build();


    public static final String KEYWORD_MATCHING_APPARATUS = "Apparatus"; // A keyword that matches APPARATUS

    private TypicalExpenses() {} // prevents instantiation

    /**
     * Returns an {@code Expenditure Expert} with all the typical expenses.
     */
    public static ExpenditureExpert getTypicalExpenditureExpert() {
        ExpenditureExpert ee = new ExpenditureExpert();
        for (Expense expense : getTypicalExpenses()) {
            ee.addExpense(expense);
        }
        return ee;
    }

    public static List<Expense> getTypicalExpenses() {
        return new ArrayList<>(Arrays.asList(ANNUAL_NETFLIX_FEES, BASEBALL_LESSON_FEES, CAR_WASH, DENTAL,
                ELECTRICAL_APPLIANCES, FISHING_APPARATUS, GROCERIES));
    }
}
