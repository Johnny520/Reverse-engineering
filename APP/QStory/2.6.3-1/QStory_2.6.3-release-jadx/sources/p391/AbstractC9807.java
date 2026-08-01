package p391;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.nio.charset.Charset;
import p392.AbstractC9813;

/* JADX INFO: renamed from: 飘花落叶言苏子楪世哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9807 extends FilterInputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f25547;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte[] f25548;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9807(BufferedInputStream bufferedInputStream, String str) {
        super(bufferedInputStream);
        int i = AbstractC9813.f25557;
        Charset charsetForName = str != null ? Charset.forName(str) : Charset.defaultCharset();
        this.f25548 = new byte[1];
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
        byte[] bArr = this.f25548;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & DefaultClassResolver.NAME;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m15139(long j) {
        if (j != -1) {
            this.f25547 += j;
        }
    }
}
