
class Calculator {
  int x;
  int y;

  Calculator(int x, int y){
    this.x = x;
    this.y = y;
  }
}

class Adder extends Calculator {
  Adder(int x, int y) {
    super(x, y);
  };
  int add() {
    return x + y;
  }
}

class Subtractor  extends Calculator{
  Subtractor(int x, int y) {
    super(x, y);
  };
  int subtract() {
    return x - y;
  }
}

class Multiplier extends Calculator{
  Multiplier(int x, int y){
    super(x,y);
  };
    int multiply() {
    return x * y;
  }
}

class Inheritance04 {
  public static void main(String[] args){
    Adder adder = new Adder(5, 1);
    System.out.println(adder.add());

    Subtractor subtractor = new Subtractor(5, 1);
    System.out.println(subtractor.subtract());

    Multiplier multiplier = new Multiplier(5, 1);
    System.out.println(multiplier.multiply());
  }
}
