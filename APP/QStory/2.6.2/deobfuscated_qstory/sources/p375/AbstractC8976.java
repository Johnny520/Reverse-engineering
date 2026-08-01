package p375;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.nio.charset.Charset;
import p377.AbstractC8984;

/* JADX INFO: renamed from: 飘花落叶言苏子楪世兰哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8976 extends FilterInputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f25217;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte[] f25218;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8976(BufferedInputStream bufferedInputStream, String str) {
        super(bufferedInputStream);
        int i = AbstractC8984.f25233;
        Charset charsetForName = str != null ? Charset.forName(str) : Charset.defaultCharset();
        this.f25218 = new byte[1];
        if (charsetForName == null) {
            Charset.defaultCharset();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = this.f25218;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & DefaultClassResolver.NAME;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14561(long j) {
        if (j != -1) {
            this.f25217 += j;
        }
    }
}
