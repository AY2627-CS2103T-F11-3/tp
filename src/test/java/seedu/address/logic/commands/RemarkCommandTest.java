package seedu.address.logic.commands;

public class RemarkCommandTest {
    @Test
    public void execute() {
        assertCommandFailure(new RemarkCommand(), model, MESSAGE_NOT_IMPLEMENTED_YET);
    }
}