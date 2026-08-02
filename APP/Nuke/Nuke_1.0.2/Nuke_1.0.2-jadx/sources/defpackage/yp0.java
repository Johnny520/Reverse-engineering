package defpackage;

import android.os.StrictMode;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yp0 implements Runnable {
    public final /* synthetic */ int h;
    public Object i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yp0(s51 s51Var, Throwable th) {
        this.h = 1;
        this.i = s51Var;
        this.j = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                zp0 zp0Var = (zp0) this.j;
                if (zp0Var.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.i).run();
                    return;
                } catch (Throwable th) {
                    zp0Var.c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 1:
                gf1.z((s51) this.i).h(fg1.s((Throwable) this.j));
                return;
            default:
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.i).run();
                    } catch (Throwable th2) {
                        se.M(zd0.h, th2);
                    }
                    Runnable runnableG = ((sa1) this.j).G();
                    if (runnableG == null) {
                        return;
                    }
                    try {
                        this.i = runnableG;
                        i++;
                        if (i >= 16) {
                            sa1 sa1Var = (sa1) this.j;
                            if (p40.S(sa1Var.k, sa1Var)) {
                                sa1 sa1Var2 = (sa1) this.j;
                                p40.R(sa1Var2.k, sa1Var2, this);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        sa1 sa1Var3 = (sa1) this.j;
                        synchronized (sa1Var3.n) {
                            sa1.o.decrementAndGet(sa1Var3);
                            throw th3;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yp0(Object obj, Runnable runnable, int i) {
        this.h = i;
        this.j = obj;
        this.i = runnable;
    }
}
