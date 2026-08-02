package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w63 implements qo0 {

    /* JADX INFO: renamed from: a */
    public static final w63 f12367a;
    private static final yo2 descriptor;

    static {
        w63 w63Var = new w63();
        f12367a = w63Var;
        b12 b12Var = new b12("nuke.ui.model.UIConfig", w63Var, 4);
        b12Var.m359l("appearanceMode", true);
        b12Var.m359l("languageMode", true);
        b12Var.m359l("clickHapticEnabled", true);
        b12Var.m359l("theme", true);
        descriptor = b12Var;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
        int i = 0;
        int iMo4566u = 0;
        int iMo4566u2 = 0;
        boolean zMo4565q = false;
        b73 b73Var = null;
        boolean z = true;
        while (z) {
            int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
            if (iMo901j == -1) {
                z = false;
            } else if (iMo901j == 0) {
                iMo4566u = interfaceC0826vxMo895b.mo4566u(yo2Var, 0);
                i |= 1;
            } else if (iMo901j == 1) {
                iMo4566u2 = interfaceC0826vxMo895b.mo4566u(yo2Var, 1);
                i |= 2;
            } else if (iMo901j == 2) {
                zMo4565q = interfaceC0826vxMo895b.mo4565q(yo2Var, 2);
                i |= 4;
            } else {
                if (iMo901j != 3) {
                    throw new e83(iMo901j);
                }
                b73Var = (b73) interfaceC0826vxMo895b.mo907t(yo2Var, 3, z63.f13746a, b73Var);
                i |= 8;
            }
        }
        interfaceC0826vxMo895b.mo894a(yo2Var);
        return new c73(i, iMo4566u, iMo4566u2, zMo4565q, b73Var);
    }

    @Override // p000.qo0
    /* JADX INFO: renamed from: b */
    public final w41[] mo166b() {
        f11 f11Var = f11.f2733a;
        return new w41[]{f11Var, f11Var, C0428ll.f6184a, z63.f13746a};
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        c73 c73Var = (c73) obj;
        c73Var.getClass();
        b73 b73Var = c73Var.f1224d;
        boolean z = c73Var.f1223c;
        int i = c73Var.f1222b;
        int i2 = c73Var.f1221a;
        yo2 yo2Var = descriptor;
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || i2 != 0) {
            ((dv2) interfaceC0863wxMo1177b).m1196u(0, i2, yo2Var);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || i != 0) {
            ((dv2) interfaceC0863wxMo1177b).m1196u(1, i, yo2Var);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || z) {
            ((dv2) interfaceC0863wxMo1177b).m1193r(yo2Var, 2, z);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(b73Var, new b73())) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 3, z63.f13746a, b73Var);
        }
        interfaceC0863wxMo1177b.mo1176a(yo2Var);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return descriptor;
    }
}
