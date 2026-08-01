package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class v81 implements w31 {

    /* JADX INFO: renamed from: d */
    public final y81 f6462d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0742sw f6463e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0742sw f6464f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ w81 f6465g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v81(w81 w81Var, y81 y81Var, InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
        this.f6465g = w81Var;
        this.f6462d = y81Var;
        this.f6463e = interfaceC0742sw;
        this.f6464f = interfaceC0742sw2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4422a(x81 x81Var) {
        y81 y81Var = this.f6462d;
        gp0 gp0Var = y81Var.f7573h;
        gp0 gp0Var2 = y81Var.f7570e;
        cp0 cp0Var = y81Var.f7574i;
        gp0 gp0Var3 = y81Var.f7576k;
        Object objInvoke = this.f6464f.invoke(x81Var.f7286b);
        if (this.f6465g.f7048c.m332g()) {
            y81Var.m5221f(this.f6464f.invoke(x81Var.f7285a), objInvoke, (InterfaceC0778tt) this.f6463e.invoke(x81Var));
            return;
        }
        InterfaceC0778tt interfaceC0778tt = (InterfaceC0778tt) this.f6463e.invoke(x81Var);
        if (y81Var.f7575j && p30.m3002l(objInvoke, null)) {
            return;
        }
        if (p30.m3002l(gp0Var2.getValue(), objInvoke) && cp0Var.m596g() == -1.0f) {
            return;
        }
        gp0Var2.setValue(objInvoke);
        y81Var.f7571f.setValue(interfaceC0778tt);
        y81Var.m5220e(cp0Var.m596g() == -3.0f ? objInvoke : gp0Var3.getValue(), !((Boolean) gp0Var.getValue()).booleanValue());
        gp0Var.setValue(Boolean.valueOf(cp0Var.m596g() == -3.0f));
        if (cp0Var.m596g() >= 0.0f) {
            gp0Var3.setValue(y81Var.m5217a().mo2024b((long) (cp0Var.m596g() * y81Var.m5217a().mo2025c())));
        } else if (cp0Var.m596g() == -3.0f) {
            gp0Var3.setValue(objInvoke);
        }
        y81Var.f7575j = false;
        cp0Var.m597h(-1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.w31
    public final Object getValue() {
        m4422a(this.f6465g.f7048c.m331f());
        return this.f6462d.f7576k.getValue();
    }
}
