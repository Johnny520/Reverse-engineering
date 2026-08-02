package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vr0 extends c20 implements r60 {
    public final Handler j;
    public final String k;
    public final boolean l;
    public final vr0 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vr0(Handler handler, String str, boolean z) {
        this.j = handler;
        this.k = str;
        this.l = z;
        this.m = z ? this : new vr0(handler, str, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c20
    public final void D(a20 a20Var, Runnable runnable) {
        if (this.j.post(runnable)) {
            return;
        }
        G(a20Var, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c20
    public final boolean E(a20 a20Var) {
        return (this.l && t11.l(Looper.myLooper(), this.j.getLooper())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G(a20 a20Var, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        k21 k21Var = (k21) a20Var.o(sn.K);
        if (k21Var != null) {
            k21Var.c(cancellationException);
        }
        c60 c60Var = o90.a;
        t50.j.D(a20Var, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof vr0)) {
            return false;
        }
        vr0 vr0Var = (vr0) obj;
        return vr0Var.j == this.j && vr0Var.l == this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r60
    public final ca0 g(long j, final q23 q23Var, a20 a20Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.j.postDelayed(q23Var, j)) {
            return new ca0() { // from class: ur0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.ca0
                public final void a() {
                    this.h.j.removeCallbacks(q23Var);
                }
            };
        }
        G(a20Var, q23Var);
        return go1.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r60
    public final void h(long j, mp mpVar) {
        t7 t7Var = new t7(3, mpVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.j.postDelayed(t7Var, j)) {
            mpVar.w(new d2(14, this, t7Var));
        } else {
            G(mpVar.l, t7Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.l ? 1231 : 1237) ^ System.identityHashCode(this.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c20
    public final String toString() {
        vr0 vr0Var;
        String str;
        c60 c60Var = o90.a;
        vr0 vr0Var2 = ie1.a;
        if (this == vr0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                vr0Var = vr0Var2.m;
            } catch (UnsupportedOperationException unused) {
                vr0Var = null;
            }
            str = this == vr0Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.k;
        if (string == null) {
            string = this.j.toString();
        }
        return this.l ? hk1.h(string, ".immediate") : string;
    }

    public vr0(Handler handler) {
        this(handler, null, false);
    }
}
