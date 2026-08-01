package p022;

import java.io.InterruptedIOException;
import java.util.TimeZone;
import p005.C6099;
import p005.C6101;
import p005.InterfaceC6112;
import p017.AbstractC6238;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6271 implements InterfaceC6112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C6273 f17273;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6101 f17274 = new C6101();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f17275;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f17276;

    public C6271(C6273 c6273, boolean z) {
        this.f17273 = c6273;
        this.f17276 = z;
    }

    @Override // p005.InterfaceC6112, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C6273 c6273 = this.f17273;
        TimeZone timeZone = AbstractC6238.f17190;
        synchronized (c6273) {
            if (this.f17275) {
                return;
            }
            boolean z = c6273.m11775() == null;
            C6273 c62732 = this.f17273;
            if (!c62732.f17288.f17276) {
                if (this.f17274.f16657 > 0) {
                    while (this.f17274.f16657 > 0) {
                        m11763(true);
                    }
                } else if (z) {
                    c62732.f17291.m11795(c62732.f17293, true, null, 0L);
                }
            }
            C6273 c62733 = this.f17273;
            synchronized (c62733) {
                this.f17275 = true;
                c62733.notifyAll();
            }
            this.f17273.f17291.flush();
            this.f17273.m11773();
        }
    }

    @Override // p005.InterfaceC6112, java.io.Flushable
    public final void flush() {
        C6273 c6273 = this.f17273;
        TimeZone timeZone = AbstractC6238.f17190;
        synchronized (c6273) {
            c6273.m11772();
        }
        while (this.f17274.f16657 > 0) {
            m11763(false);
            this.f17273.f17291.flush();
        }
    }

    @Override // p005.InterfaceC6112
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo10877(C6101 c6101, long j) {
        TimeZone timeZone = AbstractC6238.f17190;
        C6101 c61012 = this.f17274;
        c61012.mo10877(c6101, j);
        while (c61012.f16657 >= 16384) {
            m11763(false);
        }
    }

    @Override // p005.InterfaceC6112
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C6099 mo10878() {
        return this.f17273.f17283;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11763(boolean z) {
        long jMin;
        boolean z2;
        C6273 c6273 = this.f17273;
        synchronized (c6273) {
            c6273.f17283.m11501();
            while (c6273.f17286 >= c6273.f17285 && !this.f17276 && !this.f17275 && c6273.m11775() == null) {
                try {
                    try {
                        c6273.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    c6273.f17283.m11786();
                    throw th;
                }
            }
            c6273.f17283.m11786();
            c6273.m11772();
            jMin = Math.min(c6273.f17285 - c6273.f17286, this.f17274.f16657);
            c6273.f17286 += jMin;
            z2 = z && jMin == this.f17274.f16657;
        }
        this.f17273.f17283.m11501();
        try {
            C6273 c62732 = this.f17273;
            c62732.f17291.m11795(c62732.f17293, z2, this.f17274, jMin);
        } finally {
            this.f17273.f17283.m11786();
        }
    }
}
