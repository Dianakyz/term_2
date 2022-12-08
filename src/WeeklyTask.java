import java.time.LocalDate;
import java.time.LocalDateTime;

public class WeeklyTask extends Task{
    public WeeklyTask(String title, String description, LocalDateTime taskDateTime, TaskType taskType) {
        super(title, description, taskDateTime, taskType);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        LocalDate taskDate = this.getTaskDateTime().toLocalDate();
        return localDate.equals(taskDate) ||
                (localDate.isAfter(taskDate) && localDate.getDayOfWeek().equals(taskDate.getDayOfWeek()));
    }

    @Override
    public Repeatability getRepeatabilityType() {
        return Repeatability.WEEKLY;
    }
}
