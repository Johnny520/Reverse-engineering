package p222;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7984 extends InputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f22065 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ByteBuffer f22066;

    public C7984(ByteBuffer byteBuffer) {
        this.f22066 = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f22066.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f22065 = this.f22066.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f22066;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.f22065;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f22066.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.f22066;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j, byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f22066;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & DefaultClassResolver.NAME;
        }
        return -1;
    }
}
