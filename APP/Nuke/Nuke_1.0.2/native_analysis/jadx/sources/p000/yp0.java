package p000;

import android.os.StrictMode;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yp0 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13551h;

    /* JADX INFO: renamed from: i */
    public Object f13552i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f13553j;

    public yp0(s51 s51Var, Throwable th) {
        this.f13551h = 1;
        this.f13552i = s51Var;
        this.f13553j = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13551h) {
            case 0:
                zp0 zp0Var = (zp0) this.f13553j;
                if (zp0Var.f14005d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f13552i).run();
                    return;
                } catch (Throwable th) {
                    zp0Var.f14004c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 1:
                gf1.m1908z((s51) this.f13552i).mo2509h(fg1.m1644s((Throwable) this.f13553j));
                return;
            default:
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.f13552i).run();
                    } catch (Throwable th2) {
                        AbstractC0691se.m4824M(zd0.f13837h, th2);
                    }
                    Runnable runnableM4779G = ((sa1) this.f13553j).m4779G();
                    if (runnableM4779G == null) {
                        return;
                    }
                    try {
                        this.f13552i = runnableM4779G;
                        i++;
                        if (i >= 16) {
                            sa1 sa1Var = (sa1) this.f13553j;
                            if (p40.m3708S(sa1Var.f10009k, sa1Var)) {
                                sa1 sa1Var2 = (sa1) this.f13553j;
                                p40.m3707R(sa1Var2.f10009k, sa1Var2, this);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        sa1 sa1Var3 = (sa1) this.f13553j;
                        synchronized (sa1Var3.f10012n) {
                            sa1.f10007o.decrementAndGet(sa1Var3);
                            throw th3;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yp0(Object obj, Runnable runnable, int i) {
        this.f13551h = i;
        this.f13553j = obj;
        this.f13552i = runnable;
    }
}
