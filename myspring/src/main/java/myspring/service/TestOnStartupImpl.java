package myspring.service;

public class TestOnStartupImpl implements TestOnStartup {
    @Override
    public void hello() {
        System.out.println("hello");
    }
}
