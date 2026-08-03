package party.iroiro.luajava;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Objects;
import party.iroiro.luajava.util.ClassUtils;

/* JADX INFO: loaded from: classes.dex */
public class ClassPathLoader implements ExternalLoader {
    protected final ClassLoader classLoader;

    public static class BufferOutputStream extends OutputStream {
        private final ByteBuffer buffer;

        public BufferOutputStream(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer;
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.buffer.put((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.buffer.put(bArr, i, i2);
        }
    }

    public ClassPathLoader() {
        this(ClassUtils.getDefaultClassLoader());
    }

    public String getPath(String str) {
        return str.replace('.', '/') + ".lua";
    }

    @Override // party.iroiro.luajava.ExternalLoader
    public Buffer load(String str, Lua lua) {
        int i;
        try {
            InputStream resourceAsStream = this.classLoader.getResourceAsStream(getPath(str));
            Objects.requireNonNull(resourceAsStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                do {
                    i = resourceAsStream.read(bArr);
                    if (i != -1) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                } while (i != -1);
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
                byteArrayOutputStream.writeTo(new BufferOutputStream(byteBufferAllocateDirect));
                byteBufferAllocateDirect.flip();
                resourceAsStream.close();
                return byteBufferAllocateDirect;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public ClassPathLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }
}
