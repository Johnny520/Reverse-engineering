package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class w81 {

    /* JADX INFO: renamed from: a */
    public final q91 f7046a;

    /* JADX INFO: renamed from: b */
    public final gp0 f7047b = r60.m3419u(null);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b91 f7048c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w81(b91 b91Var, q91 q91Var, String str) {
        this.f7048c = b91Var;
        this.f7046a = q91Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final v81 m4925a(InterfaceC0742sw interfaceC0742sw, InterfaceC0742sw interfaceC0742sw2) {
        gp0 gp0Var = this.f7047b;
        v81 v81Var = (v81) gp0Var.getValue();
        b91 b91Var = this.f7048c;
        if (v81Var == null) {
            Object objInvoke = interfaceC0742sw2.invoke(b91Var.m328c());
            Object objInvoke2 = interfaceC0742sw2.invoke(b91Var.m328c());
            q91 q91Var = this.f7046a;
            AbstractC0046b8 abstractC0046b8 = (AbstractC0046b8) q91Var.f5089a.invoke(objInvoke2);
            abstractC0046b8.mo29d();
            y81 y81Var = new y81(b91Var, objInvoke, abstractC0046b8, q91Var);
            v81Var = new v81(this, y81Var, interfaceC0742sw, interfaceC0742sw2);
            gp0Var.setValue(v81Var);
            b91Var.f467i.add(y81Var);
        }
        v81Var.f6464f = interfaceC0742sw2;
        v81Var.f6463e = interfaceC0742sw;
        v81Var.m4422a(b91Var.m331f());
        return v81Var;
    }
}
