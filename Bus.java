class Bus{
  private String destination;
  private int number;
  private People[] seats;

  public Bus(String destination, int number){
    this.destination = destination;
    this.number = number;
    this.seats = new People[30];
  }

  public String getDestination(){
    return this.destination;
  }

  public int getRouteNumber(){
    return this.number;
  }

  public int passengerCount(){
    int count = 0;
    for(People people : seats){
      if(people != null) {
        count++;
      }
    }
    return count;
  }

  public void pickUp(People people) {
    // if (isBusFull()) {
    //   return;
    // }
    int passengerCount = passengerCount();
    seats[passengerCount] = people;
  }

  public boolean isBusFull(){
    return passengerCount() == seats.length;
  }

  public void getoff(){
    for (int i = 0; i < seats.length; i++) {
      seats[i] = null;
    }
  }
}
