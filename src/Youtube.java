public class Youtube {

    public static void main(String[] args) {
        Channel iitdu = new Channel();

        Subscriber s1 = new Subscriber("Siam");
        Subscriber s2 = new Subscriber("Galib");
        Subscriber s3 = new Subscriber("Inzamam");

        iitdu.subscribe(s1);
        iitdu.subscribe(s2);
        iitdu.subscribe(s3);

        s1.subscribeChannel(iitdu);
        s2.subscribeChannel(iitdu);
        s3.subscribeChannel(iitdu);

        iitdu.upload(" Freshers' flash Mob");

    }
}
