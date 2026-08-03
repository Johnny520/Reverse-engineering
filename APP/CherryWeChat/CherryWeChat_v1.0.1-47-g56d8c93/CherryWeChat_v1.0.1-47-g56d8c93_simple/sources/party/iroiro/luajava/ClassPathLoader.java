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

        public BufferOutputStream(ByteBuffer r1) {
            this.buffer = r1;
        }

        @Override // java.io.OutputStream
        public void write(int r2) {
            this.buffer.put((byte) r2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] r2, int r3, int r4) {
            this.buffer.put(r2, r3, r4);
        }
    }

    public ClassPathLoader() {
        this(ClassUtils.getDefaultClassLoader());
    }

    public String getPath(String r4) {
        return r4.replace('.', '/') + ".lua";
    }

    @Override // party.iroiro.luajava.ExternalLoader
    public Buffer load(String r5, Lua r6) {
        InputStream r52 = this.classLoader.getResourceAsStream(getPath(r5));     // Catch: Exception -> L18
        Objects.requireNonNull(r52);     // Catch: Exception -> L18
        ByteArrayOutputStream r62 = new ByteArrayOutputStream();     // Catch: Throwable -> L7
        byte[] r0 = new byte[4096];     // Catch: Throwable -> L7
    L4:
        int r1 = r52.read(r0);     // Catch: Throwable -> L7
        if (r1 == (-1)) goto L9;
        r62.write(r0, 0, r1);     // Catch: Throwable -> L7
    L9:
        if (r1 != (-1)) goto L4;
        ByteBuffer r02 = ByteBuffer.allocateDirect(r62.size());     // Catch: Throwable -> L7
        r62.writeTo(new BufferOutputStream(r02));     // Catch: Throwable -> L7
        r02.flip();     // Catch: Throwable -> L7
        r52.close();     // Catch: Exception -> L18
        return r02;
    L7:
        th = move-exception;
        r52.close();     // Catch: Throwable -> L15
    L17:
        throw th;     // Catch: Exception -> L18
    L15:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Exception -> L18
    L18:
        return null;
    }

    public ClassPathLoader(ClassLoader r1) {
        this.classLoader = r1;
    }
}
