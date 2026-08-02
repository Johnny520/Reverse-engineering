package p000;

/* JADX INFO: renamed from: ei */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0167ei implements qo0 {

    /* JADX INFO: renamed from: a */
    public static final C0167ei f2449a;
    private static final yo2 descriptor;

    static {
        C0167ei c0167ei = new C0167ei();
        f2449a = c0167ei;
        b12 b12Var = new b12("nuke.module.wechat.item.chat.AutoReceiveTransferMoney.TransferAutoReplyConf", c0167ei, 2);
        b12Var.m359l("isEnabled", true);
        b12Var.m359l("replyContent", true);
        descriptor = b12Var;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
        String strMo4563n = null;
        boolean z = true;
        int i = 0;
        boolean zMo4565q = false;
        while (z) {
            int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
            if (iMo901j == -1) {
                z = false;
            } else if (iMo901j == 0) {
                zMo4565q = interfaceC0826vxMo895b.mo4565q(yo2Var, 0);
                i |= 1;
            } else {
                if (iMo901j != 1) {
                    throw new e83(iMo901j);
                }
                strMo4563n = interfaceC0826vxMo895b.mo4563n(yo2Var, 1);
                i |= 2;
            }
        }
        interfaceC0826vxMo895b.mo894a(yo2Var);
        return new C0241gi(i, strMo4563n, zMo4565q);
    }

    @Override // p000.qo0
    /* JADX INFO: renamed from: b */
    public final w41[] mo166b() {
        return new w41[]{C0428ll.f6184a, nv2.f7346a};
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        C0241gi c0241gi = (C0241gi) obj;
        c0241gi.getClass();
        String str = c0241gi.f3530b;
        boolean z = c0241gi.f3529a;
        yo2 yo2Var = descriptor;
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || z) {
            ((dv2) interfaceC0863wxMo1177b).m1193r(yo2Var, 0, z);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(str, "")) {
            ((dv2) interfaceC0863wxMo1177b).m1199x(yo2Var, 1, str);
        }
        interfaceC0863wxMo1177b.mo1176a(yo2Var);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return descriptor;
    }
}
