@Getter
@Setter
  class Class{
    private String name;
    private ZonedDateTime startDate;
    private ZonedDateTime endDate;
    private int duration;
    private int maxCapacity;
    private List<member> membersEnrolled;

    public class(String name, ZonedDateTime startDate, ZonedDateTime endDate, int duration, int maxCapacity){
      this.name = name;
      this.startDate = startDate;
      this.endDate = endDate;
      this.duration = duration;
      this.maxCapacity = maxCapacity;
    }
}
