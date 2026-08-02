package p000;

import android.app.AlertDialog;
import android.os.Process;
import android.view.MotionEvent;
import java.lang.ref.ReferenceQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: y4 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0910y4 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13300h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f13301i;

    public /* synthetic */ RunnableC0910y4(int i, Object obj) {
        this.f13300h = i;
        this.f13301i = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        ey2 ey2VarM2419b;
        long jNanoTime;
        switch (this.f13300h) {
            case 0:
                Process.setThreadPriority(10);
                ((Runnable) this.f13301i).run();
                return;
            case 1:
                C0043b5 c0043b5 = (C0043b5) this.f13301i;
                while (true) {
                    try {
                        c0043b5.m424k((C0006a5) ((ReferenceQueue) c0043b5.f563j).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 2:
                ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = (ViewTreeObserverOnGlobalLayoutListenerC0045b7) this.f13301i;
                viewTreeObserverOnGlobalLayoutListenerC0045b7.removeCallbacks(this);
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0045b7.f633D0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i = 2;
                }
                viewTreeObserverOnGlobalLayoutListenerC0045b7.m463J(motionEvent, i, viewTreeObserverOnGlobalLayoutListenerC0045b7.f635E0, false);
                return;
            case 3:
                o72 o72Var = (o72) this.f13301i;
                Object obj = o72Var.f7574i;
                if (obj == null) {
                    t11.m5067S("dialog");
                    throw null;
                }
                if (((AlertDialog) obj).isShowing()) {
                    Object obj2 = o72Var.f7574i;
                    if (obj2 != null) {
                        ((AlertDialog) obj2).dismiss();
                        return;
                    } else {
                        t11.m5067S("dialog");
                        throw null;
                    }
                }
                return;
            case 4:
                x82 x82Var = (x82) this.f13301i;
                x82Var.f12894j.m1331t(x82Var);
                return;
            default:
                iy2 iy2Var = (iy2) this.f13301i;
                synchronized (iy2Var) {
                    iy2Var.f4841g++;
                    ey2VarM2419b = iy2Var.m2419b();
                }
                if (ey2VarM2419b == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    ey2 ey2Var = ey2VarM2419b;
                    try {
                        threadCurrentThread.setName(ey2Var.f2685a);
                        Logger logger = ((iy2) this.f13301i).f4836b;
                        hy2 hy2Var = ey2Var.f2687c;
                        hy2Var.getClass();
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            op0.m3585g(logger, ey2Var, hy2Var, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jMo1485a = ey2Var.mo1485a();
                            if (zIsLoggable) {
                                op0.m3585g(logger, ey2Var, hy2Var, "finished run in " + op0.m3592o(System.nanoTime() - jNanoTime));
                            }
                            iy2 iy2Var2 = (iy2) this.f13301i;
                            synchronized (iy2Var2) {
                                iy2.m2418a(iy2Var2, ey2Var, jMo1485a, true);
                                ey2VarM2419b = iy2Var2.m2419b();
                            }
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                op0.m3585g(logger, ey2Var, hy2Var, "failed a run in " + op0.m3592o(System.nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            iy2 iy2Var3 = (iy2) this.f13301i;
                            synchronized (iy2Var3) {
                                iy2.m2418a(iy2Var3, ey2Var, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th3) {
                            threadCurrentThread.setName(name);
                            throw th3;
                        }
                    }
                } while (ey2VarM2419b != null);
                threadCurrentThread.setName(name);
                return;
        }
    }
}
