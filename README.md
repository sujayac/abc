# abc
Class.java:
Holds details of each class and also stores the members enrolled for that class

ClubOwner.java
Hold details of each club owner(name & id), also stores details of all classes owned by this clubOwner

Member.java
Hold details of each member and also stores details of all classes enrolled by that member

CreateClassService.java
Service layer that creates new class enabling club owner to create new classes

BookingService.java
Service layer to either book a class or search through existing bookings

BookingRequest.java
Request object that is sent to API when member tries to make a booking for a class.

Change to be made: class and member classes will have map object or memberid with classes enrolled instead of just a list of classes enrolled.   that way accessing and searching by member becomes more efficient.
