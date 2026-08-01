package p373;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import p374.AbstractC9738;
import p374.C9735;
import p393.C9820;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏子世兰楪哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9732 extends AbstractC9729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f25435;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f25436;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f25437;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f25438;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C9735 f25439;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9732(C9733 c9733) {
        C9820 c9820 = c9733.f25563;
        if (c9820 == null) {
            C6755.m11870("origin == null");
            throw null;
        }
        super(c9820.f25564, c9733);
        this.f25436 = 0L;
        this.f25438 = c9733.f25440;
        this.f25437 = c9733.f25442;
        this.f25439 = c9733.f25441;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C9733 m15104() {
        C9733 c9733 = new C9733();
        Charset.defaultCharset();
        Charset.defaultCharset();
        c9733.f25440 = -1L;
        c9733.f25441 = AbstractC9738.f25444;
        c9733.f25442 = true;
        return c9733;
    }

    @Override // p373.AbstractC9729, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (!m15105()) {
            return ((FilterInputStream) this).in.available();
        }
        m15106();
        this.f25439.getClass();
        return 0;
    }

    @Override // p373.AbstractC9729, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f25437) {
            super.close();
        }
    }

    @Override // p373.AbstractC9729, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f25435 = this.f25436;
    }

    @Override // p373.AbstractC9729, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // p373.AbstractC9729, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (m15105()) {
            m15106();
            this.f25439.getClass();
            return -1;
        }
        long jMin = i2;
        long j = this.f25438;
        if (j >= 0) {
            jMin = Math.min(jMin, j - m15106());
        }
        return super.read(bArr, i, (int) jMin);
    }

    @Override // p373.AbstractC9729, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        ((FilterInputStream) this).in.reset();
        this.f25436 = this.f25435;
    }

    @Override // p373.AbstractC9729, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long jSkip;
        long j2 = this.f25438;
        if (j2 >= 0) {
            j = Math.min(j, j2 - m15106());
        }
        jSkip = super.skip(j);
        this.f25436 += jSkip;
        return jSkip;
    }

    public final String toString() {
        return ((FilterInputStream) this).in.toString();
    }

    @Override // p373.AbstractC9729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final synchronized void mo15103(int i) {
        if (i != -1) {
            try {
                this.f25436 += (long) i;
            } catch (Throwable th) {
                throw th;
            }
        }
        super.mo15103(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m15105() {
        long j = this.f25438;
        return j >= 0 && m15106() >= j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final synchronized long m15106() {
        return this.f25436;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9732(InputStream inputStream, long j) {
        C9733 c9733M15104 = m15104();
        c9733M15104.f25440 = Math.max(-1L, j);
        super(inputStream, c9733M15104);
        this.f25436 = 0L;
        this.f25438 = c9733M15104.f25440;
        this.f25437 = c9733M15104.f25442;
        this.f25439 = c9733M15104.f25441;
    }

    @Override // p373.AbstractC9729, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // p373.AbstractC9729, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (m15105()) {
            m15106();
            this.f25439.getClass();
            return -1;
        }
        return super.read();
    }
}
