package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class xl0 extends pm0 {

    /* JADX INFO: renamed from: d */
    public static final xl0 f7369d;

    /* JADX INFO: renamed from: e */
    public static final xl0 f7370e;

    /* JADX INFO: renamed from: f */
    public static final xl0 f7371f;

    /* JADX INFO: renamed from: g */
    public static final xl0 f7372g;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f7373c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f7369d = new xl0(i, 2, 0);
        int i2 = 1;
        f7370e = new xl0(i2, i2, 1);
        f7371f = new xl0(i, 2, 2);
        int i3 = 1;
        f7372g = new xl0(i3, i3, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xl0(int i, int i2, int i3) {
        super(i, i2);
        this.f7373c = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pm0
    /* JADX INFO: renamed from: a */
    public final void mo186a(rm0 rm0Var, InterfaceC0643q8 interfaceC0643q8, z11 z11Var, iu0 iu0Var, qm0 qm0Var) {
        switch (this.f7373c) {
            case 0:
                Object objInvoke = ((InterfaceC0298hw) rm0Var.m3517b(0)).invoke();
                C0788u2 c0788u2 = (C0788u2) rm0Var.m3517b(1);
                int iM3516a = rm0Var.m3516a(0);
                c0788u2.getClass();
                z11Var.m5387U(z11Var.m5390c(c0788u2), objInvoke);
                interfaceC0643q8.mo1684d(iM3516a, objInvoke);
                interfaceC0643q8.mo1682b(objInvoke);
                break;
            case 1:
                C0788u2 c0788u22 = (C0788u2) rm0Var.m3517b(0);
                int iM3516a2 = rm0Var.m3516a(0);
                interfaceC0643q8.mo1689j();
                c0788u22.getClass();
                interfaceC0643q8.mo1681a(iM3516a2, z11Var.m5370D(z11Var.m5390c(c0788u22)));
                break;
            case 2:
                Object objM3517b = rm0Var.m3517b(0);
                C0788u2 c0788u23 = (C0788u2) rm0Var.m3517b(1);
                int iM3516a3 = rm0Var.m3516a(0);
                if (objM3517b instanceof ku0) {
                    ku0 ku0Var = (ku0) objM3517b;
                    iu0Var.f2622e.m4072b(ku0Var);
                    iu0Var.f2621d.m1890a(ku0Var);
                }
                Object objM5377K = z11Var.m5377K(z11Var.m5390c(c0788u23), iM3516a3, objM3517b);
                if (objM5377K instanceof ku0) {
                    iu0Var.m1602e((ku0) objM5377K);
                } else if (objM5377K instanceof ht0) {
                    ((ht0) objM5377K).m1505c();
                }
                break;
            default:
                Object objM3517b2 = rm0Var.m3517b(0);
                int iM3516a4 = rm0Var.m3516a(0);
                if (objM3517b2 instanceof ku0) {
                    ku0 ku0Var2 = (ku0) objM3517b2;
                    iu0Var.f2622e.m4072b(ku0Var2);
                    iu0Var.f2621d.m1890a(ku0Var2);
                }
                Object objM5377K2 = z11Var.m5377K(z11Var.f7770t, iM3516a4, objM3517b2);
                if (objM5377K2 instanceof ku0) {
                    iu0Var.m1602e((ku0) objM5377K2);
                } else if (objM5377K2 instanceof ht0) {
                    ((ht0) objM5377K2).m1505c();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pm0
    /* JADX INFO: renamed from: b */
    public C0788u2 mo3143b(rm0 rm0Var) {
        switch (this.f7373c) {
            case 0:
                return (C0788u2) rm0Var.m3517b(1);
            case 1:
                return (C0788u2) rm0Var.m3517b(0);
            default:
                return super.mo3143b(rm0Var);
        }
    }
}
