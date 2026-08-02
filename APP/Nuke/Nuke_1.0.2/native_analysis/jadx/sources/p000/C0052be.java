package p000;

/* JADX INFO: renamed from: be */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0052be implements qo0 {

    /* JADX INFO: renamed from: a */
    public static final C0052be f818a;
    private static final yo2 descriptor;

    static {
        C0052be c0052be = new C0052be();
        f818a = c0052be;
        b12 b12Var = new b12("nuke.module.wechat.item.chat.AntiRevoke.AntiRevokeConf", c0052be, 2);
        b12Var.m359l("pattern", true);
        b12Var.m359l("timeFormat", true);
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
        String strMo4563n2 = null;
        while (z) {
            int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
            if (iMo901j == -1) {
                z = false;
            } else if (iMo901j == 0) {
                strMo4563n = interfaceC0826vxMo895b.mo4563n(yo2Var, 0);
                i |= 1;
            } else {
                if (iMo901j != 1) {
                    throw new e83(iMo901j);
                }
                strMo4563n2 = interfaceC0826vxMo895b.mo4563n(yo2Var, 1);
                i |= 2;
            }
        }
        interfaceC0826vxMo895b.mo894a(yo2Var);
        return new C0127de(i, strMo4563n, strMo4563n2);
    }

    @Override // p000.qo0
    /* JADX INFO: renamed from: b */
    public final w41[] mo166b() {
        nv2 nv2Var = nv2.f7346a;
        return new w41[]{nv2Var, nv2Var};
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        C0127de c0127de = (C0127de) obj;
        c0127de.getClass();
        String str = c0127de.f2004b;
        String str2 = c0127de.f2003a;
        yo2 yo2Var = descriptor;
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(str2, "\"$sender\"尝试撤回一条消息")) {
            ((dv2) interfaceC0863wxMo1177b).m1199x(yo2Var, 0, str2);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(str, "yyyy/MM/dd HH:mm:ss")) {
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
