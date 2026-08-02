package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u33 {

    /* JADX INFO: renamed from: a */
    public final n43 f11094a;

    /* JADX INFO: renamed from: b */
    public final nx1 f11095b = op0.m3598u(null);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ y33 f11096c;

    public u33(y33 y33Var, n43 n43Var, String str) {
        this.f11096c = y33Var;
        this.f11094a = n43Var;
    }

    /* JADX INFO: renamed from: a */
    public final t33 m5462a(in0 in0Var, in0 in0Var2) {
        nx1 nx1Var = this.f11095b;
        t33 t33Var = (t33) nx1Var.getValue();
        y33 y33Var = this.f11096c;
        if (t33Var == null) {
            Object objMo5j = in0Var2.mo5j(y33Var.m6213c());
            Object objMo5j2 = in0Var2.mo5j(y33Var.m6213c());
            n43 n43Var = this.f11094a;
            AbstractC0494nd abstractC0494nd = (AbstractC0494nd) n43Var.f7004a.mo5j(objMo5j2);
            abstractC0494nd.mo2480d();
            w33 w33Var = new w33(y33Var, objMo5j, abstractC0494nd, n43Var);
            t33Var = new t33(this, w33Var, in0Var, in0Var2);
            nx1Var.setValue(t33Var);
            y33Var.f13297i.add(w33Var);
        }
        t33Var.f10535j = in0Var2;
        t33Var.f10534i = in0Var;
        t33Var.m5115a(y33Var.m6216f());
        return t33Var;
    }
}
