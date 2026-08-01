package p138b4;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p000A.C0038T0;
import p007B0.C0173F;
import p173h4.AbstractC2263d;

/* JADX INFO: renamed from: b4.k */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1866k implements Runnable {

    /* JADX INFO: renamed from: d */
    public final C0038T0 f6321d;

    /* JADX INFO: renamed from: e */
    public volatile AtomicInteger f6322e = new AtomicInteger(0);

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1869n f6323f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC1866k(C1869n c1869n, C0038T0 c0038t0) {
        this.f6323f = c1869n;
        this.f6321d = c0038t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C0173F c0173f;
        String str = "OkHttp " + this.f6323f.f6327e.f5712a.m3052g();
        C1869n c1869n = this.f6323f;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            c1869n.f6330h.m4696h();
            boolean z5 = false;
            try {
                try {
                    try {
                        this.f6321d.m27A(c1869n.m3353j());
                        c0173f = c1869n.f6326d.f5917a;
                    } catch (IOException e5) {
                        e = e5;
                        z5 = true;
                        if (z5) {
                            AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
                            AbstractC2263d.f7404a.mo4116h("Callback failure for " + C1869n.m3348a(c1869n), 4, e);
                        } else {
                            this.f6321d.m52u(e);
                        }
                        c0173f = c1869n.f6326d.f5917a;
                    } catch (Throwable th) {
                        th = th;
                        z5 = true;
                        c1869n.cancel();
                        if (!z5) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.f6321d.m52u(iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        c0173f = c1869n.f6326d.f5917a;
                    }
                } catch (Throwable th2) {
                    C0173F c0173f2 = c1869n.f6326d.f5917a;
                    c0173f2.getClass();
                    C0173F.m246l(c0173f2, null, null, this, 3);
                    throw th2;
                }
            } catch (IOException e6) {
                e = e6;
            } catch (Throwable th3) {
                th = th3;
            }
            c0173f.getClass();
            C0173F.m246l(c0173f, null, null, this, 3);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
