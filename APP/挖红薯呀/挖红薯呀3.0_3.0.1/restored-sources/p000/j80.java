package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j80 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2770d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ m80 f2771e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j80(m80 m80Var, int i) {
        this.f2770d = i;
        this.f2771e = m80Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f2770d;
        int i2 = 0;
        m80 m80Var = this.f2771e;
        switch (i) {
            case 0:
                o70 o70Var = (o70) m80Var.f3859r.invoke();
                int iMo2791a = o70Var.mo2791a();
                while (true) {
                    if (i2 >= iMo2791a) {
                        i2 = -1;
                    } else if (!o70Var.mo2793c(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int iIntValue = ((Integer) obj).intValue();
                o70 o70Var2 = (o70) m80Var.f3859r.invoke();
                if (iIntValue < 0 || iIntValue >= o70Var2.mo2791a()) {
                    z10.m5361a("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + o70Var2.mo2791a() + ')');
                }
                AbstractC0307i4.m1547w(m80Var.m2879k0(), null, new l80(m80Var, iIntValue, null, 0), 3);
                return Boolean.TRUE;
        }
    }
}
