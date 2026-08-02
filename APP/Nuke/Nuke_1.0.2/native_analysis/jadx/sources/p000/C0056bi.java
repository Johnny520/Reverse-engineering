package p000;

import java.util.Set;

/* JADX INFO: renamed from: bi */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0056bi implements qo0 {

    /* JADX INFO: renamed from: a */
    public static final C0056bi f863a;
    private static final yo2 descriptor;

    static {
        C0056bi c0056bi = new C0056bi();
        f863a = c0056bi;
        b12 b12Var = new b12("nuke.module.wechat.item.chat.AutoReceiveTransferMoney.AutoReceiveTransferMoneyConf", c0056bi, 5);
        b12Var.m359l("waitTime", true);
        b12Var.m359l("useWhitelist", true);
        b12Var.m359l("whitelist", true);
        b12Var.m359l("blacklist", true);
        b12Var.m359l("autoReplyConf", true);
        descriptor = b12Var;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
        j71[] j71VarArr = C0131di.f2056f;
        int i = 0;
        boolean zMo4565q = false;
        long jMo4568z = 0;
        Set set = null;
        Set set2 = null;
        C0241gi c0241gi = null;
        boolean z = true;
        while (z) {
            int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
            if (iMo901j == -1) {
                z = false;
            } else if (iMo901j == 0) {
                jMo4568z = interfaceC0826vxMo895b.mo4568z(yo2Var, 0);
                i |= 1;
            } else if (iMo901j == 1) {
                zMo4565q = interfaceC0826vxMo895b.mo4565q(yo2Var, 1);
                i |= 2;
            } else if (iMo901j == 2) {
                set = (Set) interfaceC0826vxMo895b.mo907t(yo2Var, 2, (w41) j71VarArr[2].getValue(), set);
                i |= 4;
            } else if (iMo901j == 3) {
                set2 = (Set) interfaceC0826vxMo895b.mo907t(yo2Var, 3, (w41) j71VarArr[3].getValue(), set2);
                i |= 8;
            } else {
                if (iMo901j != 4) {
                    throw new e83(iMo901j);
                }
                c0241gi = (C0241gi) interfaceC0826vxMo895b.mo907t(yo2Var, 4, C0167ei.f2449a, c0241gi);
                i |= 16;
            }
        }
        interfaceC0826vxMo895b.mo894a(yo2Var);
        return new C0131di(i, jMo4568z, zMo4565q, set, set2, c0241gi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.qo0
    /* JADX INFO: renamed from: b */
    public final w41[] mo166b() {
        j71[] j71VarArr = C0131di.f2056f;
        return new w41[]{ed1.f2399a, C0428ll.f6184a, j71VarArr[2].getValue(), j71VarArr[3].getValue(), C0167ei.f2449a};
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        C0131di c0131di = (C0131di) obj;
        c0131di.getClass();
        C0241gi c0241gi = c0131di.f2061e;
        Set set = c0131di.f2060d;
        Set set2 = c0131di.f2059c;
        boolean z = c0131di.f2058b;
        long j = c0131di.f2057a;
        yo2 yo2Var = descriptor;
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
        j71[] j71VarArr = C0131di.f2056f;
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || j != 0) {
            ((dv2) interfaceC0863wxMo1177b).m1197v(yo2Var, 0, j);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || z) {
            ((dv2) interfaceC0863wxMo1177b).m1193r(yo2Var, 1, z);
        }
        boolean zMo1179d = interfaceC0863wxMo1177b.mo1179d(yo2Var);
        fe0 fe0Var = fe0.f2918h;
        if (zMo1179d || !t11.m5086l(set2, fe0Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 2, (w41) j71VarArr[2].getValue(), set2);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(set, fe0Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 3, (w41) j71VarArr[3].getValue(), set);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(c0241gi, new C0241gi())) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 4, C0167ei.f2449a, c0241gi);
        }
        interfaceC0863wxMo1177b.mo1176a(yo2Var);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return descriptor;
    }
}
