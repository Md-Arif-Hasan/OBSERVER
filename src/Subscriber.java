public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
       super();
       this.name = name;
    }


    public void update(){
        System.out.println( "Hello "+ name+ ", New video uploaded! ");
    }

    public  void subscribeChannel( Channel ch )
    {
        channel = ch;
    }
}
