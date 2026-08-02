package p000;

import java.util.List;
import java.util.Set;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: xq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0895xq implements qo0 {

    /* JADX INFO: renamed from: a */
    public static final C0895xq f13109a;
    private static final yo2 descriptor;

    static {
        C0895xq c0895xq = new C0895xq();
        f13109a = c0895xq;
        b12 b12Var = new b12("nuke.module.wechat.item.chat.ChatAutoReply.AutoReplyTask", c0895xq, 14);
        b12Var.m359l("id", true);
        b12Var.m359l("name", true);
        b12Var.m359l("isEnabled", true);
        b12Var.m359l("matchMode", true);
        b12Var.m359l("keywords", true);
        b12Var.m359l("ignoreCase", true);
        b12Var.m359l("listMode", true);
        b12Var.m359l("targetIds", true);
        b12Var.m359l("replyType", true);
        b12Var.m359l("replyContent", true);
        b12Var.m359l("voiceDurationMs", true);
        b12Var.m359l("delayMs", true);
        b12Var.m359l("cooldownMs", true);
        b12Var.m359l("stopAfterMatch", true);
        descriptor = b12Var;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
        j71[] j71VarArr = C0971zq.f14021o;
        EnumC0176er enumC0176er = null;
        String strMo4563n = null;
        String strMo4563n2 = null;
        EnumC0250gr enumC0250gr = null;
        List list = null;
        String strMo4563n3 = null;
        long jMo4568z = 0;
        long jMo4568z2 = 0;
        boolean z = true;
        int i = 0;
        boolean zMo4565q = false;
        boolean zMo4565q2 = false;
        int iMo4566u = 0;
        boolean zMo4565q3 = false;
        Set set = null;
        EnumC0323ir enumC0323ir = null;
        while (z) {
            int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
            switch (iMo901j) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMo4563n = interfaceC0826vxMo895b.mo4563n(yo2Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo4563n2 = interfaceC0826vxMo895b.mo4563n(yo2Var, 1);
                    i |= 2;
                    break;
                case 2:
                    zMo4565q = interfaceC0826vxMo895b.mo4565q(yo2Var, 2);
                    i |= 4;
                    break;
                case 3:
                    enumC0250gr = (EnumC0250gr) interfaceC0826vxMo895b.mo907t(yo2Var, 3, (w41) j71VarArr[3].getValue(), enumC0250gr);
                    i |= 8;
                    break;
                case 4:
                    list = (List) interfaceC0826vxMo895b.mo907t(yo2Var, 4, (w41) j71VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    zMo4565q2 = interfaceC0826vxMo895b.mo4565q(yo2Var, 5);
                    i |= 32;
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    enumC0176er = (EnumC0176er) interfaceC0826vxMo895b.mo907t(yo2Var, 6, (w41) j71VarArr[6].getValue(), enumC0176er);
                    i |= 64;
                    break;
                case 7:
                    set = (Set) interfaceC0826vxMo895b.mo907t(yo2Var, 7, (w41) j71VarArr[7].getValue(), set);
                    i |= 128;
                    break;
                case 8:
                    enumC0323ir = (EnumC0323ir) interfaceC0826vxMo895b.mo907t(yo2Var, 8, (w41) j71VarArr[8].getValue(), enumC0323ir);
                    i |= 256;
                    break;
                case 9:
                    strMo4563n3 = interfaceC0826vxMo895b.mo4563n(yo2Var, 9);
                    i |= AIChatConfig.DefaultMaxTokens;
                    break;
                case 10:
                    iMo4566u = interfaceC0826vxMo895b.mo4566u(yo2Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    jMo4568z = interfaceC0826vxMo895b.mo4568z(yo2Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    jMo4568z2 = interfaceC0826vxMo895b.mo4568z(yo2Var, 12);
                    i |= 4096;
                    break;
                case 13:
                    zMo4565q3 = interfaceC0826vxMo895b.mo4565q(yo2Var, 13);
                    i |= 8192;
                    break;
                default:
                    throw new e83(iMo901j);
            }
        }
        interfaceC0826vxMo895b.mo894a(yo2Var);
        return new C0971zq(i, strMo4563n, strMo4563n2, zMo4565q, enumC0250gr, list, zMo4565q2, enumC0176er, set, enumC0323ir, strMo4563n3, iMo4566u, jMo4568z, jMo4568z2, zMo4565q3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.qo0
    /* JADX INFO: renamed from: b */
    public final w41[] mo166b() {
        j71[] j71VarArr = C0971zq.f14021o;
        nv2 nv2Var = nv2.f7346a;
        C0428ll c0428ll = C0428ll.f6184a;
        ed1 ed1Var = ed1.f2399a;
        return new w41[]{nv2Var, nv2Var, c0428ll, j71VarArr[3].getValue(), j71VarArr[4].getValue(), c0428ll, j71VarArr[6].getValue(), j71VarArr[7].getValue(), j71VarArr[8].getValue(), nv2Var, f11.f2733a, ed1Var, ed1Var, c0428ll};
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0170  */
    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo167d(ve0 ve0Var, Object obj) {
        j71[] j71VarArr;
        long j;
        boolean z;
        C0971zq c0971zq = (C0971zq) obj;
        c0971zq.getClass();
        boolean z2 = c0971zq.f14035n;
        long j2 = c0971zq.f14034m;
        long j3 = c0971zq.f14033l;
        int i = c0971zq.f14032k;
        String str = c0971zq.f14031j;
        EnumC0323ir enumC0323ir = c0971zq.f14030i;
        Set set = c0971zq.f14029h;
        EnumC0176er enumC0176er = c0971zq.f14028g;
        boolean z3 = c0971zq.f14027f;
        List list = c0971zq.f14026e;
        EnumC0250gr enumC0250gr = c0971zq.f14025d;
        boolean z4 = c0971zq.f14024c;
        String str2 = c0971zq.f14023b;
        String str3 = c0971zq.f14022a;
        yo2 yo2Var = descriptor;
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
        j71[] j71VarArr2 = C0971zq.f14021o;
        if (!interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
            j71VarArr = j71VarArr2;
            if (t11.m5086l(str3, AbstractC0933yr.m6317f())) {
                j = j3;
            }
            if (!interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(str2, "")) {
                ((dv2) interfaceC0863wxMo1177b).m1199x(yo2Var, 1, str2);
            }
            if (!interfaceC0863wxMo1177b.mo1179d(yo2Var) || !z4) {
                ((dv2) interfaceC0863wxMo1177b).m1193r(yo2Var, 2, z4);
            }
            if (!interfaceC0863wxMo1177b.mo1179d(yo2Var) || enumC0250gr != EnumC0250gr.f3670i) {
                ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 3, (w41) j71VarArr[3].getValue(), enumC0250gr);
            }
            if (!interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(list, be0.f819h)) {
                ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 4, (w41) j71VarArr[4].getValue(), list);
            }
            if (!interfaceC0863wxMo1177b.mo1179d(yo2Var) || !z3) {
                ((dv2) interfaceC0863wxMo1177b).m1193r(yo2Var, 5, z3);
            }
            if (!interfaceC0863wxMo1177b.mo1179d(yo2Var) || enumC0176er != EnumC0176er.f2563i) {
                ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 6, (w41) j71VarArr[6].getValue(), enumC0176er);
            }
            if (!interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(set, fe0.f2918h)) {
                ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 7, (w41) j71VarArr[7].getValue(), set);
            }
            if (!interfaceC0863wxMo1177b.mo1179d(yo2Var) || enumC0323ir != EnumC0323ir.f4751i) {
                ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 8, (w41) j71VarArr[8].getValue(), enumC0323ir);
            }
            if (!interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(str, "")) {
                ((dv2) interfaceC0863wxMo1177b).m1199x(yo2Var, 9, str);
            }
            if (!interfaceC0863wxMo1177b.mo1179d(yo2Var) || i != 1000) {
                ((dv2) interfaceC0863wxMo1177b).m1196u(10, i, yo2Var);
            }
            if (!interfaceC0863wxMo1177b.mo1179d(yo2Var) || j != 0) {
                ((dv2) interfaceC0863wxMo1177b).m1197v(yo2Var, 11, j);
            }
            if (!interfaceC0863wxMo1177b.mo1179d(yo2Var) || j2 != 0) {
                ((dv2) interfaceC0863wxMo1177b).m1197v(yo2Var, 12, j2);
            }
            if (interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
                z = z2;
                if (!z) {
                }
                interfaceC0863wxMo1177b.mo1176a(yo2Var);
            }
            z = z2;
            ((dv2) interfaceC0863wxMo1177b).m1193r(yo2Var, 13, z);
            interfaceC0863wxMo1177b.mo1176a(yo2Var);
        }
        j71VarArr = j71VarArr2;
        j = j3;
        ((dv2) interfaceC0863wxMo1177b).m1199x(yo2Var, 0, str3);
        if (!interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1199x(yo2Var, 1, str2);
        }
        if (!interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1193r(yo2Var, 2, z4);
        }
        if (!interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 3, (w41) j71VarArr[3].getValue(), enumC0250gr);
        }
        if (!interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 4, (w41) j71VarArr[4].getValue(), list);
        }
        if (!interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1193r(yo2Var, 5, z3);
        }
        if (!interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 6, (w41) j71VarArr[6].getValue(), enumC0176er);
        }
        if (!interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 7, (w41) j71VarArr[7].getValue(), set);
        }
        if (!interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 8, (w41) j71VarArr[8].getValue(), enumC0323ir);
        }
        if (!interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1199x(yo2Var, 9, str);
        }
        if (!interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1196u(10, i, yo2Var);
        }
        if (!interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1197v(yo2Var, 11, j);
        }
        if (!interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
            ((dv2) interfaceC0863wxMo1177b).m1197v(yo2Var, 12, j2);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var)) {
        }
        ((dv2) interfaceC0863wxMo1177b).m1193r(yo2Var, 13, z);
        interfaceC0863wxMo1177b.mo1176a(yo2Var);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return descriptor;
    }
}
