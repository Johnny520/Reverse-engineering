package p222;

import com.bumptech.glide.load.resource.bitmap.C3032;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7980 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ArrayDeque f22058 = new ArrayDeque(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public IOException f22059;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C3032 f22060;

    @Override // java.io.InputStream
    public final int available() {
        return this.f22060.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f22060.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f22060.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f22060.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f22060.read();
        } catch (IOException e) {
            this.f22059 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f22060.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f22060.skip(j);
        } catch (IOException e) {
            this.f22059 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f22060.read(bArr);
        } catch (IOException e) {
            this.f22059 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f22060.read(bArr, i, i2);
        } catch (IOException e) {
            this.f22059 = e;
            throw e;
        }
    }
}
