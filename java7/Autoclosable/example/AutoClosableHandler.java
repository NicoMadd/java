package java7.Autoclosable.example;

import java7.Autoclosable.Handler;

public class AutoClosableHandler extends Handler implements AutoCloseable {

    @Override
    public void close() throws Exception {
        this.closeConnection();
    }

}
