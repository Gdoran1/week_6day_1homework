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
}
