package yyds;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.TimeZone;

/* JADX INFO: renamed from: yyds.ᛸᲀᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1856 implements InterfaceC1979 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f9334;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f9335;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C2521 f9336;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1507 f9337 = new C1507();

    public C1856(C2521 c2521, boolean z) {
        this.f9336 = c2521;
        this.f9335 = z;
    }

    @Override // yyds.InterfaceC1979, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws SocketTimeoutException {
        C2521 c2521 = this.f9336;
        TimeZone timeZone = AbstractC0795.f3653;
        synchronized (c2521) {
            if (this.f9334) {
                return;
            }
            boolean z = c2521.m4570() == 0;
            C2521 c25212 = this.f9336;
            if (!c25212.f12439.f9335) {
                if (this.f9337.f7087 > 0) {
                    while (this.f9337.f7087 > 0) {
                        m3637(true);
                    }
                } else if (z) {
                    c25212.f12444.m2058(c25212.f12442, true, null, 0L);
                }
            }
            C2521 c25213 = this.f9336;
            synchronized (c25213) {
                this.f9334 = true;
                c25213.notifyAll();
            }
            this.f9336.f12444.flush();
            this.f9336.m4568();
        }
    }

    @Override // yyds.InterfaceC1979, java.io.Flushable
    public final void flush() throws SocketTimeoutException {
        C2521 c2521 = this.f9336;
        TimeZone timeZone = AbstractC0795.f3653;
        synchronized (c2521) {
            c2521.m4569();
        }
        while (this.f9337.f7087 > 0) {
            m3637(false);
            this.f9336.f12444.flush();
        }
    }

    @Override // yyds.InterfaceC1979
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final void mo576(long j, C1507 c1507) throws SocketTimeoutException {
        TimeZone timeZone = AbstractC0795.f3653;
        C1507 c15072 = this.f9337;
        c15072.mo576(j, c1507);
        while (c15072.f7087 >= 16384) {
            m3637(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3637(boolean z) throws SocketTimeoutException {
        long jMin;
        boolean z2;
        C2521 c2521 = this.f9336;
        synchronized (c2521) {
            c2521.f12434.m977();
            while (c2521.f12443 >= c2521.f12438 && !this.f9335 && !this.f9334 && c2521.m4570() == 0) {
                try {
                    try {
                        c2521.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    c2521.f12434.m3357();
                    throw th;
                }
            }
            c2521.f12434.m3357();
            c2521.m4569();
            jMin = Math.min(c2521.f12438 - c2521.f12443, this.f9337.f7087);
            c2521.f12443 += jMin;
            z2 = z && jMin == this.f9337.f7087;
        }
        this.f9336.f12434.m977();
        try {
            C2521 c25212 = this.f9336;
            c25212.f12444.m2058(c25212.f12442, z2, this.f9337, jMin);
        } finally {
            this.f9336.f12434.m3357();
        }
    }

    @Override // yyds.InterfaceC1979
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo577() {
        return this.f9336.f12434;
    }
}
