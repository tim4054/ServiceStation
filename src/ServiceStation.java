public class ServiceStation {
    public void check(Transport transport) {
        System.out.println(transport.getModelName());
        transport.service();
    }
}