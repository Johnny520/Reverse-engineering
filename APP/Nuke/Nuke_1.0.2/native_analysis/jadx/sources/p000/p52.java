package p000;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p52 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final InterfaceC0137dp f7982h;

    /* JADX INFO: renamed from: i */
    public volatile AtomicInteger f7983i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ s52 f7984j;

    public p52(s52 s52Var, InterfaceC0137dp interfaceC0137dp) {
        this.f7984j = s52Var;
        this.f7982h = interfaceC0137dp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kj1 kj1Var;
        String strConcat = "OkHttp ".concat(this.f7984j.f9914i.f5390a.m6361g());
        s52 s52Var = this.f7984j;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            s52Var.f9917l.m5886h();
            boolean z = false;
            try {
                try {
                    try {
                        this.f7982h.mo1065a(s52Var, s52Var.m4734j());
                        kj1Var = s52Var.f9913h.f2600a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            zz1 zz1Var = zz1.f14161a;
                            zz1.f14161a.mo715g("Callback failure for ".concat(s52.m4728a(s52Var)), 4, e);
                        } else {
                            this.f7982h.mo1066j(s52Var, e);
                        }
                        kj1Var = s52Var.f9913h.f2600a;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        s52Var.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.f7982h.mo1066j(s52Var, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        kj1Var = s52Var.f9913h.f2600a;
                    }
                } catch (Throwable th2) {
                    kj1 kj1Var2 = s52Var.f9913h.f2600a;
                    kj1Var2.getClass();
                    kj1.m2696H(kj1Var2, null, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            kj1Var.getClass();
            kj1.m2696H(kj1Var, null, null, this, 3);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
