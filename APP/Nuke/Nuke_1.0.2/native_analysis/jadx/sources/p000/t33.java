package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t33 implements gu2 {

    /* JADX INFO: renamed from: h */
    public final w33 f10533h;

    /* JADX INFO: renamed from: i */
    public in0 f10534i;

    /* JADX INFO: renamed from: j */
    public in0 f10535j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ u33 f10536k;

    public t33(u33 u33Var, w33 w33Var, in0 in0Var, in0 in0Var2) {
        this.f10536k = u33Var;
        this.f10533h = w33Var;
        this.f10534i = in0Var;
        this.f10535j = in0Var2;
    }

    /* JADX INFO: renamed from: a */
    public final void m5115a(v33 v33Var) {
        w33 w33Var = this.f10533h;
        nx1 nx1Var = w33Var.f12304l;
        nx1 nx1Var2 = w33Var.f12301i;
        jx1 jx1Var = w33Var.f12305m;
        nx1 nx1Var3 = w33Var.f12307o;
        Object objMo5j = this.f10535j.mo5j(v33Var.f11675b);
        if (this.f10536k.f11096c.m6217g()) {
            w33Var.m5836f(this.f10535j.mo5j(v33Var.f11674a), objMo5j, (fj0) this.f10534i.mo5j(v33Var));
            return;
        }
        fj0 fj0Var = (fj0) this.f10534i.mo5j(v33Var);
        if (w33Var.f12306n && t11.m5086l(objMo5j, null)) {
            return;
        }
        if (t11.m5086l(nx1Var2.getValue(), objMo5j) && jx1Var.m2591g() == -1.0f) {
            return;
        }
        nx1Var2.setValue(objMo5j);
        w33Var.f12302j.setValue(fj0Var);
        w33Var.m5835e(jx1Var.m2591g() == -3.0f ? objMo5j : nx1Var3.getValue(), !((Boolean) nx1Var.getValue()).booleanValue());
        nx1Var.setValue(Boolean.valueOf(jx1Var.m2591g() == -3.0f));
        if (jx1Var.m2591g() >= 0.0f) {
            nx1Var3.setValue(w33Var.m5832a().mo915b((long) (jx1Var.m2591g() * w33Var.m5832a().mo916c())));
        } else if (jx1Var.m2591g() == -3.0f) {
            nx1Var3.setValue(objMo5j);
        }
        w33Var.f12306n = false;
        jx1Var.m2592h(-1.0f);
    }

    @Override // p000.gu2
    public final Object getValue() {
        m5115a(this.f10536k.f11096c.m6216f());
        return this.f10533h.f12307o.getValue();
    }
}
