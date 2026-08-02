package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vb extends c20 {
    public static final hx2 t = new hx2(q7.s);
    public static final tb u = new tb(0);
    public final Choreographer j;
    public final Handler k;
    public boolean p;
    public boolean q;
    public final xb s;
    public final Object l = new Object();
    public final ag m = new ag();
    public ArrayList n = new ArrayList();
    public ArrayList o = new ArrayList();
    public final ub r = new ub(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vb(Choreographer choreographer, Handler handler) {
        this.j = choreographer;
        this.k = handler;
        this.s = new xb(choreographer, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void G(vb vbVar) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (vbVar.l) {
                ag agVar = vbVar.m;
                runnable = (Runnable) (agVar.isEmpty() ? null : agVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (vbVar.l) {
                    ag agVar2 = vbVar.m;
                    runnable = (Runnable) (agVar2.isEmpty() ? null : agVar2.removeFirst());
                }
            }
            synchronized (vbVar.l) {
                if (vbVar.m.isEmpty()) {
                    z = false;
                    vbVar.p = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c20
    public final void D(a20 a20Var, Runnable runnable) {
        synchronized (this.l) {
            this.m.addLast(runnable);
            if (!this.p) {
                this.p = true;
                this.k.post(this.r);
                if (!this.q) {
                    this.q = true;
                    this.j.postFrameCallback(this.r);
                }
            }
        }
    }
}
