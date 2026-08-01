package p375;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.nio.charset.Charset;
import p376.AbstractC8984;

/* JADX INFO: renamed from: 飘花落叶言苏子楪世哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8978 extends FilterInputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f25202;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte[] f25203;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8978(BufferedInputStream bufferedInputStream, String str) {
        super(bufferedInputStream);
        int i = AbstractC8984.f25212;
        Charset charsetForName = str != null ? Charset.forName(str) : Charset.defaultCharset();
        this.f25203 = new byte[1];
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
        byte[] bArr = this.f25203;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & DefaultClassResolver.NAME;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14580(long j) {
        if (j != -1) {
            this.f25202 += j;
        }
    }
}
