class BookingServiceImpl{

  private boolean bookMyClass(Member member, Class class, BookingRequest bookingRequest){
    ZonedDateTime todaysDate = System.now().getZonedDateTime();
    while(bookingRequest.getParticipationDate > todaysDate){
      if(class.getMembersEnrolled.size() <= class.getMaxCapacity){

        class.getMembersEnrolled().stream().filter(member -> member.getId() != bookingRequest.getMemberId())
        return true;
      }else{
        // log message - Class already reached maximum capacity
        return false;
      }
    }
  
}
