class BookingServiceImpl{

  private boolean bookMyClass(Member member, Class class, BookingRequest bookingRequest){
    ZonedDateTime todaysDate = System.now().getZonedDateTime();
    while(bookingRequest.getParticipationDate > todaysDate){
      if(class.getMembersEnrolled.size() <= class.getMaxCapacity){
        List<Member> membersEnrolled = class.getMembersEnrolled().stream().filter(member -> member.getId() == bookingRequest.getMemberId()).collect(Collectors.toList());
        if(membersEnrolled.contains(bookingRequest.getMemberId){
          // log message - member already enrolled in requested class
          return false;
        }else{
          class.getMembersEnrolled.add(member);
          return true;
        }
      }else{
        // log message - Class already reached maximum capacity
        return false;
      }
    }
}
