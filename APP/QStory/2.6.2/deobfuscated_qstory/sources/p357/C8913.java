package p357;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import p358.AbstractC8919;
import p358.C8916;
import p362.C8939;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏子世兰哲楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8913 extends AbstractC8910 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f25101;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f25102;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f25103;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f25104;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C8916 f25105;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8913(C8914 c8914) {
        C8939 c8939 = c8914.f25144;
        if (c8939 == null) {
            C5919.m11250("origin == null");
            throw null;
        }
        super(c8939.f25145, c8914);
        this.f25102 = 0L;
        this.f25104 = c8914.f25108;
        this.f25103 = c8914.f25106;
        this.f25105 = c8914.f25107;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C8914 m14532() {
        C8914 c8914 = new C8914();
        Charset.defaultCharset();
        Charset.defaultCharset();
        c8914.f25108 = -1L;
        c8914.f25107 = AbstractC8919.f25110;
        c8914.f25106 = true;
        return c8914;
    }

    @Override // p357.AbstractC8910, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (!m14533()) {
            return ((FilterInputStream) this).in.available();
        }
        m14534();
        this.f25105.getClass();
        return 0;
    }

    @Override // p357.AbstractC8910, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f25103) {
            super.close();
        }
    }

    @Override // p357.AbstractC8910, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f25101 = this.f25102;
    }

    @Override // p357.AbstractC8910, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // p357.AbstractC8910, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (m14533()) {
            m14534();
            this.f25105.getClass();
            return -1;
        }
        long jMin = i2;
        long j = this.f25104;
        if (j >= 0) {
            jMin = Math.min(jMin, j - m14534());
        }
        return super.read(bArr, i, (int) jMin);
    }

    @Override // p357.AbstractC8910, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        ((FilterInputStream) this).in.reset();
        this.f25102 = this.f25101;
    }

    @Override // p357.AbstractC8910, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long jSkip;
        long j2 = this.f25104;
        if (j2 >= 0) {
            j = Math.min(j, j2 - m14534());
        }
        jSkip = super.skip(j);
        this.f25102 += jSkip;
        return jSkip;
    }

    public final String toString() {
        return ((FilterInputStream) this).in.toString();
    }

    @Override // p357.AbstractC8910
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final synchronized void mo14531(int i) {
        if (i != -1) {
            try {
                this.f25102 += (long) i;
            } catch (Throwable th) {
                throw th;
            }
        }
        super.mo14531(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m14533() {
        long j = this.f25104;
        return j >= 0 && m14534() >= j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final synchronized long m14534() {
        return this.f25102;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8913(InputStream inputStream, long j) {
        C8914 c8914M14532 = m14532();
        c8914M14532.f25108 = Math.max(-1L, j);
        super(inputStream, c8914M14532);
        this.f25102 = 0L;
        this.f25104 = c8914M14532.f25108;
        this.f25103 = c8914M14532.f25106;
        this.f25105 = c8914M14532.f25107;
    }

    @Override // p357.AbstractC8910, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // p357.AbstractC8910, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (m14533()) {
            m14534();
            this.f25105.getClass();
            return -1;
        }
        return super.read();
    }
}
