class Stop{
  private String location;
  private Person[] space;

  public Stop(String location) {
  this.location = location;
  this.space = new Person[10];
  }

  public String getLocation(){
    return this.location;
  }

  public int peopleCount(){
    int count = 0;
    for(Person person : space){
      if(person !=null){
        count++;
      }
    }
    return count;
  }






//
}
