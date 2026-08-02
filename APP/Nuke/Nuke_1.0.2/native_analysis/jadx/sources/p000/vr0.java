package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vr0 extends c20 implements r60 {

    /* JADX INFO: renamed from: j */
    public final Handler f12141j;

    /* JADX INFO: renamed from: k */
    public final String f12142k;

    /* JADX INFO: renamed from: l */
    public final boolean f12143l;

    /* JADX INFO: renamed from: m */
    public final vr0 f12144m;

    public vr0(Handler handler, String str, boolean z) {
        this.f12141j = handler;
        this.f12142k = str;
        this.f12143l = z;
        this.f12144m = z ? this : new vr0(handler, str, true);
    }

    @Override // p000.c20
    /* JADX INFO: renamed from: D */
    public final void mo612D(a20 a20Var, Runnable runnable) {
        if (this.f12141j.post(runnable)) {
            return;
        }
        m5779G(a20Var, runnable);
    }

    @Override // p000.c20
    /* JADX INFO: renamed from: E */
    public final boolean mo613E(a20 a20Var) {
        return (this.f12143l && t11.m5086l(Looper.myLooper(), this.f12141j.getLooper())) ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public final void m5779G(a20 a20Var, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        k21 k21Var = (k21) a20Var.mo15o(C0700sn.f10207K);
        if (k21Var != null) {
            k21Var.mo1704c(cancellationException);
        }
        c60 c60Var = o90.f7590a;
        t50.f10560j.mo612D(a20Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vr0)) {
            return false;
        }
        vr0 vr0Var = (vr0) obj;
        return vr0Var.f12141j == this.f12141j && vr0Var.f12143l == this.f12143l;
    }

    @Override // p000.r60
    /* JADX INFO: renamed from: g */
    public final ca0 mo2605g(long j, final q23 q23Var, a20 a20Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f12141j.postDelayed(q23Var, j)) {
            return new ca0() { // from class: ur0
                @Override // p000.ca0
                /* JADX INFO: renamed from: a */
                public final void mo717a() {
                    this.f11450h.f12141j.removeCallbacks(q23Var);
                }
            };
        }
        m5779G(a20Var, q23Var);
        return go1.f3642h;
    }

    @Override // p000.r60
    /* JADX INFO: renamed from: h */
    public final void mo4185h(long j, C0469mp c0469mp) {
        RunnableC0724t7 runnableC0724t7 = new RunnableC0724t7(3, c0469mp, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f12141j.postDelayed(runnableC0724t7, j)) {
            c0469mp.m3153w(new C0115d2(14, this, runnableC0724t7));
        } else {
            m5779G(c0469mp.f6743l, runnableC0724t7);
        }
    }

    public final int hashCode() {
        return (this.f12143l ? 1231 : 1237) ^ System.identityHashCode(this.f12141j);
    }

    @Override // p000.c20
    public final String toString() {
        vr0 vr0Var;
        String str;
        c60 c60Var = o90.f7590a;
        vr0 vr0Var2 = ie1.f4583a;
        if (this == vr0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                vr0Var = vr0Var2.f12144m;
            } catch (UnsupportedOperationException unused) {
                vr0Var = null;
            }
            str = this == vr0Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f12142k;
        if (string == null) {
            string = this.f12141j.toString();
        }
        return this.f12143l ? hk1.m2209h(string, ".immediate") : string;
    }

    public vr0(Handler handler) {
        this(handler, null, false);
    }
}
