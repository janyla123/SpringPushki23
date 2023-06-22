package git;

public interface Payment {

  public default void payment1(String money1){
    System.out.println("Money");
  }
}

