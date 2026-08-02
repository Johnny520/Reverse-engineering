package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nb implements zy2 {
    public final View a;
    public final in0 b;
    public final xm0 c;
    public final gl1 d = new gl1();
    public final ts2 e = new ts2(new gb(this, 0));
    public final gb f = new gb(this, 1);
    public final gb g = new gb(this, 2);
    public ActionMode h;
    public lb i;
    public Runnable j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nb(View view, in0 in0Var, xm0 xm0Var) {
        this.a = view;
        this.b = in0Var;
        this.c = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zy2
    public final Object a(ry2 ry2Var, tw2 tw2Var) {
        t00 t00Var = null;
        mb mbVar = new mb(this, ry2Var, t00Var, 0);
        gl1 gl1Var = this.d;
        gl1Var.getClass();
        Object objU = te.u(new tc(gl1Var, mbVar, t00Var, 1), tw2Var);
        return objU == k20.h ? objU : a83.a;
    }
}
