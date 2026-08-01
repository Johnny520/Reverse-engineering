package p019;

import java.io.InterruptedIOException;
import java.util.TimeZone;
import p004.C6090;
import p004.C6092;
import p004.InterfaceC6103;
import p013.AbstractC6230;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6267 implements InterfaceC6103 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C6269 f17255;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6092 f17256 = new C6092();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f17257;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f17258;

    public C6267(C6269 c6269, boolean z) {
        this.f17255 = c6269;
        this.f17258 = z;
    }

    @Override // p004.InterfaceC6103, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C6269 c6269 = this.f17255;
        TimeZone timeZone = AbstractC6230.f17167;
        synchronized (c6269) {
            if (this.f17257) {
                return;
            }
            boolean z = c6269.m11792() == null;
            C6269 c62692 = this.f17255;
            if (!c62692.f17270.f17258) {
                if (this.f17256.f16647 > 0) {
                    while (this.f17256.f16647 > 0) {
                        m11780(true);
                    }
                } else if (z) {
                    c62692.f17273.m11812(c62692.f17275, true, null, 0L);
                }
            }
            C6269 c62693 = this.f17255;
            synchronized (c62693) {
                this.f17257 = true;
                c62693.notifyAll();
            }
            this.f17255.f17273.flush();
            this.f17255.m11790();
        }
    }

    @Override // p004.InterfaceC6103, java.io.Flushable
    public final void flush() {
        C6269 c6269 = this.f17255;
        TimeZone timeZone = AbstractC6230.f17167;
        synchronized (c6269) {
            c6269.m11789();
        }
        while (this.f17256.f16647 > 0) {
            m11780(false);
            this.f17255.f17273.flush();
        }
    }

    @Override // p004.InterfaceC6103
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6090 mo10934() {
        return this.f17255.f17265;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11780(boolean z) {
        long jMin;
        boolean z2;
        C6269 c6269 = this.f17255;
        synchronized (c6269) {
            c6269.f17265.m11494();
            while (c6269.f17268 >= c6269.f17267 && !this.f17258 && !this.f17257 && c6269.m11792() == null) {
                try {
                    try {
                        c6269.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    c6269.f17265.m11803();
                    throw th;
                }
            }
            c6269.f17265.m11803();
            c6269.m11789();
            jMin = Math.min(c6269.f17267 - c6269.f17268, this.f17256.f16647);
            c6269.f17268 += jMin;
            z2 = z && jMin == this.f17256.f16647;
        }
        this.f17255.f17265.m11494();
        try {
            C6269 c62692 = this.f17255;
            c62692.f17273.m11812(c62692.f17275, z2, this.f17256, jMin);
        } finally {
            this.f17255.f17265.m11803();
        }
    }

    @Override // p004.InterfaceC6103
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo10935(C6092 c6092, long j) {
        TimeZone timeZone = AbstractC6230.f17167;
        C6092 c60922 = this.f17256;
        c60922.mo10935(c6092, j);
        while (c60922.f16647 >= 16384) {
            m11780(false);
        }
    }
}
