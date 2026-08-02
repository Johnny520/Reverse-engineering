package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jm1 {
    public fm1 a;
    public boolean b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        fm1 fm1Var = this.a;
        if (fm1Var == null) {
            s.l("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            fm1Var.d(this, null);
        }
        km1 km1Var = fm1Var.b;
        iz izVar = fm1Var.a;
        km1Var.getClass();
        if (equals(km1Var.h) && -1 == km1Var.g) {
            hm1 hm1VarC = km1Var.f;
            if (hm1VarC == null) {
                hm1VarC = km1Var.c(-1);
            }
            km1Var.f = null;
            km1Var.g = 0;
            km1Var.h = null;
            if (hm1VarC == null) {
                ((ot1) izVar.i).a.run();
            } else {
                hm1VarC.b();
            }
            ju2 ju2Var = km1Var.a;
            lm1 lm1Var = lm1.f;
            ju2Var.getClass();
            ju2Var.h(null, lm1Var);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
