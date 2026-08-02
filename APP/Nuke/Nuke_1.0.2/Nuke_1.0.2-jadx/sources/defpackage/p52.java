package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p52 implements Runnable {
    public final dp h;
    public volatile AtomicInteger i = new AtomicInteger(0);
    public final /* synthetic */ s52 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p52(s52 s52Var, dp dpVar) {
        this.j = s52Var;
        this.h = dpVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        kj1 kj1Var;
        String strConcat = "OkHttp ".concat(this.j.i.a.g());
        s52 s52Var = this.j;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            s52Var.l.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.h.a(s52Var, s52Var.j());
                        kj1Var = s52Var.h.a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            zz1 zz1Var = zz1.a;
                            zz1.a.g("Callback failure for ".concat(s52.a(s52Var)), 4, e);
                        } else {
                            this.h.j(s52Var, e);
                        }
                        kj1Var = s52Var.h.a;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        s52Var.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.h.j(s52Var, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        kj1Var = s52Var.h.a;
                    }
                } catch (Throwable th2) {
                    kj1 kj1Var2 = s52Var.h.a;
                    kj1Var2.getClass();
                    kj1.H(kj1Var2, null, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            kj1Var.getClass();
            kj1.H(kj1Var, null, null, this, 3);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
