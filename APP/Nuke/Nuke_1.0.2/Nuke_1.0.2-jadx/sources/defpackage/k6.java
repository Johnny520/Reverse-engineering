package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ b7 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ k6(b7 b7Var, int i) {
        this.h = i;
        this.i = b7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.h;
        b7 b7Var = this.i;
        switch (i) {
            case 0:
                ag agVar = b7Var.p;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!agVar.isEmpty()) {
                    try {
                        ((xm0) agVar.removeLast()).a();
                    } finally {
                        Trace.endSection();
                    }
                    break;
                }
                return;
            case 1:
                b7Var.L0 = false;
                MotionEvent motionEvent = b7Var.D0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    b7Var.I(motionEvent);
                    return;
                } else {
                    s.l("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                b7.n(b7Var.getRoot());
                return;
            default:
                b7.n(b7Var.getRoot());
                return;
        }
    }
}
