package galvanize;

class Proposal {
  private String name = "";
  public void setName(String name){
    this.name = name;
  };
  public String getName(){
    return this.name;
  };
}

class Encap2 {
  public static void main(String[] args){
    Proposal prop = new Proposal();
    // prop.name = "Some thing";
    prop.setName("Some Thing");
    System.out.println(prop.getName());
  }
}
