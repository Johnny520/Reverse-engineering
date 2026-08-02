package p000;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c01 extends wd3 implements Runnable, gt1, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j */
    public final ff3 f1091j;

    /* JADX INFO: renamed from: k */
    public boolean f1092k;

    /* JADX INFO: renamed from: l */
    public boolean f1093l;

    /* JADX INFO: renamed from: m */
    public cf3 f1094m;

    public c01(ff3 ff3Var) {
        super(!ff3Var.f2972s ? 1 : 0);
        this.f1091j = ff3Var;
    }

    @Override // p000.wd3
    /* JADX INFO: renamed from: a */
    public final void mo332a(ge3 ge3Var) {
        this.f1092k = false;
        this.f1093l = false;
        cf3 cf3Var = this.f1094m;
        if (ge3Var.f3471a.mo1345b() > 0 && cf3Var != null) {
            ye3 ye3Var = cf3Var.f1518a;
            ff3 ff3Var = this.f1091j;
            ff3Var.f2971r.m3542f(kf3.m2666a(ye3Var.mo4165i(8)));
            ff3Var.f2970q.m3542f(kf3.m2666a(ye3Var.mo4165i(8)));
            ff3.m1609a(ff3Var, cf3Var);
        }
        this.f1094m = null;
    }

    @Override // p000.gt1
    /* JADX INFO: renamed from: b */
    public final cf3 mo333b(View view, cf3 cf3Var) {
        this.f1094m = cf3Var;
        ff3 ff3Var = this.f1091j;
        o93 o93Var = ff3Var.f2970q;
        ye3 ye3Var = cf3Var.f1518a;
        o93Var.m3542f(kf3.m2666a(ye3Var.mo4165i(8)));
        if (this.f1092k) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f1093l) {
            ff3Var.f2971r.m3542f(kf3.m2666a(ye3Var.mo4165i(8)));
            ff3.m1609a(ff3Var, cf3Var);
        }
        return ff3Var.f2972s ? cf3.f1517b : cf3Var;
    }

    @Override // p000.wd3
    /* JADX INFO: renamed from: c */
    public final void mo334c(ge3 ge3Var) {
        this.f1092k = true;
        this.f1093l = true;
    }

    @Override // p000.wd3
    /* JADX INFO: renamed from: d */
    public final cf3 mo127d(cf3 cf3Var, List list) {
        ff3 ff3Var = this.f1091j;
        ff3.m1609a(ff3Var, cf3Var);
        return ff3Var.f2972s ? cf3.f1517b : cf3Var;
    }

    @Override // p000.wd3
    /* JADX INFO: renamed from: e */
    public final dq1 mo128e(ge3 ge3Var, dq1 dq1Var) {
        this.f1092k = false;
        return dq1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1092k) {
            this.f1092k = false;
            this.f1093l = false;
            cf3 cf3Var = this.f1094m;
            if (cf3Var != null) {
                ff3 ff3Var = this.f1091j;
                ff3Var.f2971r.m3542f(kf3.m2666a(cf3Var.f1518a.mo4165i(8)));
                ff3.m1609a(ff3Var, cf3Var);
                this.f1094m = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
