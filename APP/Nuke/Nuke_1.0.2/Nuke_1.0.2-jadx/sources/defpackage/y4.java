package defpackage;

import android.app.AlertDialog;
import android.os.Process;
import android.view.MotionEvent;
import java.lang.ref.ReferenceQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y4 implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ y4(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        ey2 ey2VarB;
        long jNanoTime;
        switch (this.h) {
            case 0:
                Process.setThreadPriority(10);
                ((Runnable) this.i).run();
                return;
            case 1:
                b5 b5Var = (b5) this.i;
                while (true) {
                    try {
                        b5Var.k((a5) ((ReferenceQueue) b5Var.j).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 2:
                b7 b7Var = (b7) this.i;
                b7Var.removeCallbacks(this);
                MotionEvent motionEvent = b7Var.D0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i = 2;
                }
                b7Var.J(motionEvent, i, b7Var.E0, false);
                return;
            case 3:
                o72 o72Var = (o72) this.i;
                Object obj = o72Var.i;
                if (obj == null) {
                    t11.S("dialog");
                    throw null;
                }
                if (((AlertDialog) obj).isShowing()) {
                    Object obj2 = o72Var.i;
                    if (obj2 != null) {
                        ((AlertDialog) obj2).dismiss();
                        return;
                    } else {
                        t11.S("dialog");
                        throw null;
                    }
                }
                return;
            case 4:
                x82 x82Var = (x82) this.i;
                x82Var.j.t(x82Var);
                return;
            default:
                iy2 iy2Var = (iy2) this.i;
                synchronized (iy2Var) {
                    iy2Var.g++;
                    ey2VarB = iy2Var.b();
                }
                if (ey2VarB == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    ey2 ey2Var = ey2VarB;
                    try {
                        threadCurrentThread.setName(ey2Var.a);
                        Logger logger = ((iy2) this.i).b;
                        hy2 hy2Var = ey2Var.c;
                        hy2Var.getClass();
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            op0.g(logger, ey2Var, hy2Var, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jA = ey2Var.a();
                            if (zIsLoggable) {
                                op0.g(logger, ey2Var, hy2Var, "finished run in " + op0.o(System.nanoTime() - jNanoTime));
                            }
                            iy2 iy2Var2 = (iy2) this.i;
                            synchronized (iy2Var2) {
                                iy2.a(iy2Var2, ey2Var, jA, true);
                                ey2VarB = iy2Var2.b();
                            }
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                op0.g(logger, ey2Var, hy2Var, "failed a run in " + op0.o(System.nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            iy2 iy2Var3 = (iy2) this.i;
                            synchronized (iy2Var3) {
                                iy2.a(iy2Var3, ey2Var, -1L, false);
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
                } while (ey2VarB != null);
                threadCurrentThread.setName(name);
                return;
        }
    }
}
