class animal{
  void sound(){
    System.out.println("animal make sounds");
  }
}
class Lion extends animal{
  void sound(){
    System.out.println("Lion roars");
  }
}
class dog extends animal{
  void sound(){
    System.out.println("dog roars");
  }
}
public class overiding{
  public static void main(String[] args){
    Lion l=new Lion();
    dog s=new dog();
    l.sound();
    s.sound();
  }
}
  
  
  