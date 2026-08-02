package p000;

/* JADX INFO: renamed from: zr */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0972zr implements qo0 {

    /* JADX INFO: renamed from: a */
    public static final C0972zr f14072a;
    private static final yo2 descriptor;

    static {
        C0972zr c0972zr = new C0972zr();
        f14072a = c0972zr;
        b12 b12Var = new b12("nuke.module.wechat.item.entertain.ChatAvatarRotator.ChatAvatarRotatorConf", c0972zr, 1);
        b12Var.m359l("duration", true);
        descriptor = b12Var;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
        long jMo4568z = 0;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
            if (iMo901j == -1) {
                z = false;
            } else {
                if (iMo901j != 0) {
                    throw new e83(iMo901j);
                }
                jMo4568z = interfaceC0826vxMo895b.mo4568z(yo2Var, 0);
                i = 1;
            }
        }
        interfaceC0826vxMo895b.mo894a(yo2Var);
        return new C0066bs(jMo4568z, i);
    }

    @Override // p000.qo0
    /* JADX INFO: renamed from: b */
    public final w41[] mo166b() {
        return new w41[]{ed1.f2399a};
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        C0066bs c0066bs = (C0066bs) obj;
        c0066bs.getClass();
        long j = c0066bs.f1000a;
        yo2 yo2Var = descriptor;
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || j != 1000) {
            ((dv2) interfaceC0863wxMo1177b).m1197v(yo2Var, 0, j);
        }
        interfaceC0863wxMo1177b.mo1176a(yo2Var);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return descriptor;
    }
}
