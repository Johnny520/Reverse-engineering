package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jm1 {

    /* JADX INFO: renamed from: a */
    public fm1 f5105a;

    /* JADX INFO: renamed from: b */
    public boolean f5106b;

    /* JADX INFO: renamed from: a */
    public final void m2515a() {
        fm1 fm1Var = this.f5105a;
        if (fm1Var == null) {
            C0676s.m4653l("This input is not added to any dispatcher.");
            return;
        }
        if (!this.f5106b) {
            fm1Var.m1665d(this, null);
        }
        km1 km1Var = fm1Var.f3056b;
        C0330iz c0330iz = fm1Var.f3055a;
        km1Var.getClass();
        if (equals(km1Var.f5644h) && -1 == km1Var.f5643g) {
            hm1 hm1VarM2725c = km1Var.f5642f;
            if (hm1VarM2725c == null) {
                hm1VarM2725c = km1Var.m2725c(-1);
            }
            km1Var.f5642f = null;
            km1Var.f5643g = 0;
            km1Var.f5644h = null;
            if (hm1VarM2725c == null) {
                ((ot1) c0330iz.f4846i).f7842a.run();
            } else {
                hm1VarM2725c.mo1357b();
            }
            ju2 ju2Var = km1Var.f5637a;
            lm1 lm1Var = lm1.f6196f;
            ju2Var.getClass();
            ju2Var.m2576h(null, lm1Var);
        }
        this.f5106b = false;
    }

    /* JADX INFO: renamed from: b */
    public void mo2230b(boolean z) {
    }
}
