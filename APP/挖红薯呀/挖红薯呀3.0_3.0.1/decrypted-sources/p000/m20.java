package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class m20 extends gd1 implements Runnable, rk0, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: e */
    public final de1 f3791e;

    /* JADX INFO: renamed from: f */
    public boolean f3792f;

    /* JADX INFO: renamed from: g */
    public boolean f3793g;

    /* JADX INFO: renamed from: h */
    public be1 f3794h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m20(de1 de1Var) {
        super(!de1Var.f1081s ? 1 : 0);
        this.f3791e = de1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.rk0
    /* JADX INFO: renamed from: a */
    public final be1 mo1964a(View view, be1 be1Var) {
        this.f3794h = be1Var;
        de1 de1Var = this.f3791e;
        db1 db1Var = de1Var.f1079q;
        yd1 yd1Var = be1Var.f503a;
        db1Var.m680f(u50.m4259C(yd1Var.mo3221h(8)));
        if (this.f3792f) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f3793g) {
            de1Var.f1080r.m680f(u50.m4259C(yd1Var.mo3221h(8)));
            de1.m687a(de1Var, be1Var);
        }
        return de1Var.f1081s ? be1.f502b : be1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gd1
    /* JADX INFO: renamed from: b */
    public final void mo1237b(id1 id1Var) {
        this.f3792f = false;
        this.f3793g = false;
        be1 be1Var = this.f3794h;
        if (((WindowInsetsAnimation) id1Var.f2526a.f5106d).getDurationMillis() > 0 && be1Var != null) {
            yd1 yd1Var = be1Var.f503a;
            de1 de1Var = this.f3791e;
            de1Var.f1080r.m680f(u50.m4259C(yd1Var.mo3221h(8)));
            de1Var.f1079q.m680f(u50.m4259C(yd1Var.mo3221h(8)));
            de1.m687a(de1Var, be1Var);
        }
        this.f3794h = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gd1
    /* JADX INFO: renamed from: c */
    public final void mo1238c(id1 id1Var) {
        this.f3792f = true;
        this.f3793g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gd1
    /* JADX INFO: renamed from: d */
    public final be1 mo1239d(be1 be1Var, List list) {
        de1 de1Var = this.f3791e;
        de1.m687a(de1Var, be1Var);
        return de1Var.f1081s ? be1.f502b : be1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gd1
    /* JADX INFO: renamed from: e */
    public final C0111d mo1240e(id1 id1Var, C0111d c0111d) {
        this.f3792f = false;
        return c0111d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3792f) {
            this.f3792f = false;
            this.f3793g = false;
            be1 be1Var = this.f3794h;
            if (be1Var != null) {
                de1 de1Var = this.f3791e;
                de1Var.f1080r.m680f(u50.m4259C(be1Var.f503a.mo3221h(8)));
                de1.m687a(de1Var, be1Var);
                this.f3794h = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
