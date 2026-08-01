package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zy0 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8054d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ dz0 f8055e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ zy0(dz0 dz0Var, int i) {
        this.f8054d = i;
        this.f8055e = dz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        int i = this.f8054d;
        dz0 dz0Var = this.f8055e;
        switch (i) {
            case 0:
                return Boolean.valueOf(dz0Var.f4542q);
            default:
                C0149dv c0149dv = dz0Var.f1233S;
                if (!c0149dv.f4529d.f4542q) {
                    return null;
                }
                EnumC0106cv enumC0106cvM727B0 = c0149dv.m727B0();
                int iOrdinal = enumC0106cvM727B0.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    C0921xc.m5129j();
                    return null;
                }
                if (enumC0106cvM727B0.m603a()) {
                    return c0149dv.m735z0(null);
                }
                C0149dv c0149dvM5612f = ((C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(c0149dv)).getFocusOwner()).m5612f();
                if (c0149dvM5612f != null) {
                    return c0149dvM5612f.m735z0(pf1.m3038P(c0149dv));
                }
                return null;
        }
    }
}
