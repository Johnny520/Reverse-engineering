package p000;

import java.util.Set;

/* JADX INFO: renamed from: ah */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0018ah implements qo0 {

    /* JADX INFO: renamed from: a */
    public static final C0018ah f198a;
    private static final yo2 descriptor;

    static {
        C0018ah c0018ah = new C0018ah();
        f198a = c0018ah;
        b12 b12Var = new b12("nuke.module.wechat.item.chat.AutoReceiveRedPacket.AutoReceiveRedPacketConf", c0018ah, 6);
        b12Var.m359l("waitTime", true);
        b12Var.m359l("receiveMode", true);
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
        j71[] j71VarArr = C0091ch.f1533g;
        C0203fh c0203fh = null;
        int i = 0;
        int iMo4566u = 0;
        boolean zMo4565q = false;
        long jMo4568z = 0;
        Set set = null;
        Set set2 = null;
        boolean z = true;
        while (z) {
            int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
            switch (iMo901j) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jMo4568z = interfaceC0826vxMo895b.mo4568z(yo2Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iMo4566u = interfaceC0826vxMo895b.mo4566u(yo2Var, 1);
                    i |= 2;
                    break;
                case 2:
                    zMo4565q = interfaceC0826vxMo895b.mo4565q(yo2Var, 2);
                    i |= 4;
                    break;
                case 3:
                    set = (Set) interfaceC0826vxMo895b.mo907t(yo2Var, 3, (w41) j71VarArr[3].getValue(), set);
                    i |= 8;
                    break;
                case 4:
                    set2 = (Set) interfaceC0826vxMo895b.mo907t(yo2Var, 4, (w41) j71VarArr[4].getValue(), set2);
                    i |= 16;
                    break;
                case 5:
                    c0203fh = (C0203fh) interfaceC0826vxMo895b.mo907t(yo2Var, 5, C0130dh.f2051a, c0203fh);
                    i |= 32;
                    break;
                default:
                    throw new e83(iMo901j);
            }
        }
        interfaceC0826vxMo895b.mo894a(yo2Var);
        return new C0091ch(i, jMo4568z, iMo4566u, zMo4565q, set, set2, c0203fh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.qo0
    /* JADX INFO: renamed from: b */
    public final w41[] mo166b() {
        j71[] j71VarArr = C0091ch.f1533g;
        return new w41[]{ed1.f2399a, f11.f2733a, C0428ll.f6184a, j71VarArr[3].getValue(), j71VarArr[4].getValue(), C0130dh.f2051a};
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        C0091ch c0091ch = (C0091ch) obj;
        c0091ch.getClass();
        C0203fh c0203fh = c0091ch.f1539f;
        Set set = c0091ch.f1538e;
        Set set2 = c0091ch.f1537d;
        boolean z = c0091ch.f1536c;
        int i = c0091ch.f1535b;
        long j = c0091ch.f1534a;
        yo2 yo2Var = descriptor;
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
        j71[] j71VarArr = C0091ch.f1533g;
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || j != 0) {
            ((dv2) interfaceC0863wxMo1177b).m1197v(yo2Var, 0, j);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || i != 1) {
            ((dv2) interfaceC0863wxMo1177b).m1196u(1, i, yo2Var);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || z) {
            ((dv2) interfaceC0863wxMo1177b).m1193r(yo2Var, 2, z);
        }
        boolean zMo1179d = interfaceC0863wxMo1177b.mo1179d(yo2Var);
        fe0 fe0Var = fe0.f2918h;
        if (zMo1179d || !t11.m5086l(set2, fe0Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 3, (w41) j71VarArr[3].getValue(), set2);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(set, fe0Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 4, (w41) j71VarArr[4].getValue(), set);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(c0203fh, new C0203fh())) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 5, C0130dh.f2051a, c0203fh);
        }
        interfaceC0863wxMo1177b.mo1176a(yo2Var);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return descriptor;
    }
}
