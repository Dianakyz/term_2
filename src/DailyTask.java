import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyTask extends Task{

    public DailyTask(String title, String description, LocalDateTime taskDateTime, TaskType taskType) {
        super(title, description, taskDateTime, taskType);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        LocalDate taskDate = this.getTaskDateTime().toLocalDate();
        return localDate.equals(taskDate) || localDate.isAfter(taskDate);
    }

    @Override
    public Repeatability getRepeatabilityType() {
        return Repeatability.DAILY;
    }
}
