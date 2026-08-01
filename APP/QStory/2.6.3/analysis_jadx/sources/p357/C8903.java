package p357;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import p358.AbstractC8909;
import p358.C8906;
import p377.C8991;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏子世兰楪哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8903 extends AbstractC8900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f25090;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f25091;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f25092;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f25093;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C8906 f25094;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8903(C8904 c8904) {
        C8991 c8991 = c8904.f25218;
        if (c8991 == null) {
            C5925.m11311("origin == null");
            throw null;
        }
        super(c8991.f25219, c8904);
        this.f25091 = 0L;
        this.f25093 = c8904.f25095;
        this.f25092 = c8904.f25097;
        this.f25094 = c8904.f25096;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C8904 m14545() {
        C8904 c8904 = new C8904();
        Charset.defaultCharset();
        Charset.defaultCharset();
        c8904.f25095 = -1L;
        c8904.f25096 = AbstractC8909.f25099;
        c8904.f25097 = true;
        return c8904;
    }

    @Override // p357.AbstractC8900, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (!m14546()) {
            return ((FilterInputStream) this).in.available();
        }
        m14547();
        this.f25094.getClass();
        return 0;
    }

    @Override // p357.AbstractC8900, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f25092) {
            super.close();
        }
    }

    @Override // p357.AbstractC8900, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f25090 = this.f25091;
    }

    @Override // p357.AbstractC8900, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // p357.AbstractC8900, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (m14546()) {
            m14547();
            this.f25094.getClass();
            return -1;
        }
        long jMin = i2;
        long j = this.f25093;
        if (j >= 0) {
            jMin = Math.min(jMin, j - m14547());
        }
        return super.read(bArr, i, (int) jMin);
    }

    @Override // p357.AbstractC8900, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        ((FilterInputStream) this).in.reset();
        this.f25091 = this.f25090;
    }

    @Override // p357.AbstractC8900, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long jSkip;
        long j2 = this.f25093;
        if (j2 >= 0) {
            j = Math.min(j, j2 - m14547());
        }
        jSkip = super.skip(j);
        this.f25091 += jSkip;
        return jSkip;
    }

    public final String toString() {
        return ((FilterInputStream) this).in.toString();
    }

    @Override // p357.AbstractC8900
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final synchronized void mo14544(int i) {
        if (i != -1) {
            try {
                this.f25091 += (long) i;
            } catch (Throwable th) {
                throw th;
            }
        }
        super.mo14544(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m14546() {
        long j = this.f25093;
        return j >= 0 && m14547() >= j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final synchronized long m14547() {
        return this.f25091;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8903(InputStream inputStream, long j) {
        C8904 c8904M14545 = m14545();
        c8904M14545.f25095 = Math.max(-1L, j);
        super(inputStream, c8904M14545);
        this.f25091 = 0L;
        this.f25093 = c8904M14545.f25095;
        this.f25092 = c8904M14545.f25097;
        this.f25094 = c8904M14545.f25096;
    }

    @Override // p357.AbstractC8900, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // p357.AbstractC8900, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (m14546()) {
            m14547();
            this.f25094.getClass();
            return -1;
        }
        return super.read();
    }
}
