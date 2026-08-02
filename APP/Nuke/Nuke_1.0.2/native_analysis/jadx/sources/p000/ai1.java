package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ai1 implements qo0 {

    /* JADX INFO: renamed from: a */
    public static final ai1 f212a;
    private static final yo2 descriptor;

    static {
        ai1 ai1Var = new ai1();
        f212a = ai1Var;
        b12 b12Var = new b12("nuke.module.wechat.item.contact.ModifyFriendsCount.ModifyFriendsCountConf", ai1Var, 1);
        b12Var.m359l("count", true);
        descriptor = b12Var;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
        boolean z = true;
        int i = 0;
        int iMo4566u = 0;
        while (z) {
            int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
            if (iMo901j == -1) {
                z = false;
            } else {
                if (iMo901j != 0) {
                    throw new e83(iMo901j);
                }
                iMo4566u = interfaceC0826vxMo895b.mo4566u(yo2Var, 0);
                i = 1;
            }
        }
        interfaceC0826vxMo895b.mo894a(yo2Var);
        return new ci1(i, iMo4566u);
    }

    @Override // p000.qo0
    /* JADX INFO: renamed from: b */
    public final w41[] mo166b() {
        return new w41[]{f11.f2733a};
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        ci1 ci1Var = (ci1) obj;
        ci1Var.getClass();
        int i = ci1Var.f1571a;
        yo2 yo2Var = descriptor;
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || i != 10) {
            ((dv2) interfaceC0863wxMo1177b).m1196u(0, i, yo2Var);
        }
        interfaceC0863wxMo1177b.mo1176a(yo2Var);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return descriptor;
    }
}
