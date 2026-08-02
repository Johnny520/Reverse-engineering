package p000;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: renamed from: nb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0492nb implements zy2 {

    /* JADX INFO: renamed from: a */
    public final View f7091a;

    /* JADX INFO: renamed from: b */
    public final in0 f7092b;

    /* JADX INFO: renamed from: c */
    public final xm0 f7093c;

    /* JADX INFO: renamed from: d */
    public final gl1 f7094d = new gl1();

    /* JADX INFO: renamed from: e */
    public final ts2 f7095e = new ts2(new C0234gb(this, 0));

    /* JADX INFO: renamed from: f */
    public final C0234gb f7096f = new C0234gb(this, 1);

    /* JADX INFO: renamed from: g */
    public final C0234gb f7097g = new C0234gb(this, 2);

    /* JADX INFO: renamed from: h */
    public ActionMode f7098h;

    /* JADX INFO: renamed from: i */
    public RunnableC0418lb f7099i;

    /* JADX INFO: renamed from: j */
    public Runnable f7100j;

    public C0492nb(View view, in0 in0Var, xm0 xm0Var) {
        this.f7091a = view;
        this.f7092b = in0Var;
        this.f7093c = xm0Var;
    }

    @Override // p000.zy2
    /* JADX INFO: renamed from: a */
    public final Object mo1928a(ry2 ry2Var, tw2 tw2Var) {
        t00 t00Var = null;
        C0455mb c0455mb = new C0455mb(this, ry2Var, t00Var, 0);
        gl1 gl1Var = this.f7094d;
        gl1Var.getClass();
        Object objM5238u = AbstractC0731te.m5238u(new C0729tc(gl1Var, c0455mb, t00Var, 1), tw2Var);
        return objM5238u == k20.f5323h ? objM5238u : a83.f116a;
    }
}
