package p035;

import java.io.InterruptedIOException;
import java.util.TimeZone;
import p020.C6919;
import p020.C6921;
import p020.InterfaceC6932;
import p029.AbstractC7059;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7096 implements InterfaceC6932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C7098 f17600;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6921 f17601 = new C6921();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f17602;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f17603;

    public C7096(C7098 c7098, boolean z) {
        this.f17600 = c7098;
        this.f17603 = z;
    }

    @Override // p020.InterfaceC6932, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C7098 c7098 = this.f17600;
        TimeZone timeZone = AbstractC7059.f17512;
        synchronized (c7098) {
            if (this.f17602) {
                return;
            }
            boolean z = c7098.m12351() == null;
            C7098 c70982 = this.f17600;
            if (!c70982.f17615.f17603) {
                if (this.f17601.f16992 > 0) {
                    while (this.f17601.f16992 > 0) {
                        m12339(true);
                    }
                } else if (z) {
                    c70982.f17618.m12371(c70982.f17620, true, null, 0L);
                }
            }
            C7098 c70983 = this.f17600;
            synchronized (c70983) {
                this.f17602 = true;
                c70983.notifyAll();
            }
            this.f17600.f17618.flush();
            this.f17600.m12349();
        }
    }

    @Override // p020.InterfaceC6932, java.io.Flushable
    public final void flush() {
        C7098 c7098 = this.f17600;
        TimeZone timeZone = AbstractC7059.f17512;
        synchronized (c7098) {
            c7098.m12348();
        }
        while (this.f17601.f16992 > 0) {
            m12339(false);
            this.f17600.f17618.flush();
        }
    }

    @Override // p020.InterfaceC6932
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6919 mo11493() {
        return this.f17600.f17610;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12339(boolean z) {
        long jMin;
        boolean z2;
        C7098 c7098 = this.f17600;
        synchronized (c7098) {
            c7098.f17610.m12053();
            while (c7098.f17613 >= c7098.f17612 && !this.f17603 && !this.f17602 && c7098.m12351() == null) {
                try {
                    try {
                        c7098.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    c7098.f17610.m12362();
                    throw th;
                }
            }
            c7098.f17610.m12362();
            c7098.m12348();
            jMin = Math.min(c7098.f17612 - c7098.f17613, this.f17601.f16992);
            c7098.f17613 += jMin;
            z2 = z && jMin == this.f17601.f16992;
        }
        this.f17600.f17610.m12053();
        try {
            C7098 c70982 = this.f17600;
            c70982.f17618.m12371(c70982.f17620, z2, this.f17601, jMin);
        } finally {
            this.f17600.f17610.m12362();
        }
    }

    @Override // p020.InterfaceC6932
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo11494(C6921 c6921, long j) {
        TimeZone timeZone = AbstractC7059.f17512;
        C6921 c69212 = this.f17601;
        c69212.mo11494(c6921, j);
        while (c69212.f16992 >= 16384) {
            m12339(false);
        }
    }
}
