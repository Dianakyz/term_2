import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task{
    public YearlyTask(String title, String description, LocalDateTime taskDateTime, TaskType taskType) {
        super(title, description, taskDateTime, taskType);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        LocalDate taskDate = this.getTaskDateTime().toLocalDate();
        return localDate.equals(taskDate) ||
                localDate.getDayOfMonth() == taskDate.getDayOfMonth() &&
                localDate.getMonth().equals(taskDate.getMonth());
    }

    @Override
    public Repeatability getRepeatabilityType() {
        return Repeatability.YEARLY;
    }
}
