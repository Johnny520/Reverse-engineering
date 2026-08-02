package defpackage;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bc2 implements a82 {
    public wc2 h;
    public fc2 i;
    public String j;
    public Object k;
    public Object[] l;
    public ec2 m;
    public final ta n = new ta(18, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bc2(wc2 wc2Var, fc2 fc2Var, String str, Object obj, Object[] objArr) {
        this.h = wc2Var;
        this.i = fc2Var;
        this.j = str;
        this.k = obj;
        this.l = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a82
    public final void a() throws PendingIntent.CanceledException {
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() throws PendingIntent.CanceledException {
        String strU;
        fc2 fc2Var = this.i;
        if (this.m != null) {
            c80.n("entry(", this.m, ") is not null");
            return;
        }
        if (fc2Var != null) {
            ta taVar = this.n;
            Object objA = taVar.a();
            if (objA == null || fc2Var.b(objA)) {
                this.m = fc2Var.a(this.j, taVar);
                return;
            }
            if (objA instanceof is2) {
                is2 is2Var = (is2) objA;
                if (is2Var.d() == gd3.C || is2Var.d() == sn.T || is2Var.d() == sn.P) {
                    strU = "MutableState containing " + is2Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strU = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strU = gf1.u(objA);
            }
            throw new IllegalArgumentException(strU);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a82
    public final void d() {
        ec2 ec2Var = this.m;
        if (ec2Var != null) {
            ((b5) ec2Var).H();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a82
    public final void f() {
        ec2 ec2Var = this.m;
        if (ec2Var != null) {
            ((b5) ec2Var).H();
        }
    }
}
