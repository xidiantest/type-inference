package java.util.zip;
import checkers.inference.reim.quals.*;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.IOException;

public class InflaterInputStream extends FilterInputStream {
    public InflaterInputStream(InputStream in, Inflater inf, int size) {
        super(in);
        throw new RuntimeException("skeleton method");
    }

    public InflaterInputStream(InputStream in, Inflater inf) {
        super(in);
        throw new RuntimeException("skeleton method");
    }

    public InflaterInputStream(InputStream in) {
        super(in);
        throw new RuntimeException("skeleton method");
    }

    public int read() throws IOException {
        throw new RuntimeException("skeleton method");
    }

    public int read(byte[] b, int off, int len) throws IOException {
        throw new RuntimeException("skeleton method");
    }

    @ReadonlyThis public int available()  throws IOException {
        throw new RuntimeException("skeleton method");
    }

    public long skip(long n) throws IOException {
        throw new RuntimeException("skeleton method");
    }

    public void close() throws IOException {
        throw new RuntimeException("skeleton method");
    }

    @ReadonlyThis public boolean markSupported()  {
        throw new RuntimeException("skeleton method");
    }

    public synchronized void mark(int readlimit) {
        throw new RuntimeException("skeleton method");
    }

    public synchronized void reset() throws IOException {
        throw new RuntimeException("skeleton method");
    }
}
