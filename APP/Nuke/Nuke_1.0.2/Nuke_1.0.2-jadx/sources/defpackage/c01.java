package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c01 extends wd3 implements Runnable, gt1, View.OnAttachStateChangeListener {
    public final ff3 j;
    public boolean k;
    public boolean l;
    public cf3 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c01(ff3 ff3Var) {
        super(!ff3Var.s ? 1 : 0);
        this.j = ff3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wd3
    public final void a(ge3 ge3Var) {
        this.k = false;
        this.l = false;
        cf3 cf3Var = this.m;
        if (ge3Var.a.b() > 0 && cf3Var != null) {
            ye3 ye3Var = cf3Var.a;
            ff3 ff3Var = this.j;
            ff3Var.r.f(kf3.a(ye3Var.i(8)));
            ff3Var.q.f(kf3.a(ye3Var.i(8)));
            ff3.a(ff3Var, cf3Var);
        }
        this.m = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gt1
    public final cf3 b(View view, cf3 cf3Var) {
        this.m = cf3Var;
        ff3 ff3Var = this.j;
        o93 o93Var = ff3Var.q;
        ye3 ye3Var = cf3Var.a;
        o93Var.f(kf3.a(ye3Var.i(8)));
        if (this.k) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.l) {
            ff3Var.r.f(kf3.a(ye3Var.i(8)));
            ff3.a(ff3Var, cf3Var);
        }
        return ff3Var.s ? cf3.b : cf3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wd3
    public final void c(ge3 ge3Var) {
        this.k = true;
        this.l = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wd3
    public final cf3 d(cf3 cf3Var, List list) {
        ff3 ff3Var = this.j;
        ff3.a(ff3Var, cf3Var);
        return ff3Var.s ? cf3.b : cf3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wd3
    public final dq1 e(ge3 ge3Var, dq1 dq1Var) {
        this.k = false;
        return dq1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.k) {
            this.k = false;
            this.l = false;
            cf3 cf3Var = this.m;
            if (cf3Var != null) {
                ff3 ff3Var = this.j;
                ff3Var.r.f(kf3.a(cf3Var.a.i(8)));
                ff3.a(ff3Var, cf3Var);
                this.m = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
