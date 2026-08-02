package defpackage;

import java.util.List;
import java.util.Set;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xq implements qo0 {
    public static final xq a;
    private static final yo2 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        xq xqVar = new xq();
        a = xqVar;
        b12 b12Var = new b12("nuke.module.wechat.item.chat.ChatAutoReply.AutoReplyTask", xqVar, 14);
        b12Var.l("id", true);
        b12Var.l("name", true);
        b12Var.l("isEnabled", true);
        b12Var.l("matchMode", true);
        b12Var.l("keywords", true);
        b12Var.l("ignoreCase", true);
        b12Var.l("listMode", true);
        b12Var.l("targetIds", true);
        b12Var.l("replyType", true);
        b12Var.l("replyContent", true);
        b12Var.l("voiceDurationMs", true);
        b12Var.l("delayMs", true);
        b12Var.l("cooldownMs", true);
        b12Var.l("stopAfterMatch", true);
        descriptor = b12Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        vx vxVarB = y40Var.b(yo2Var);
        j71[] j71VarArr = zq.o;
        er erVar = null;
        String strN = null;
        String strN2 = null;
        gr grVar = null;
        List list = null;
        String strN3 = null;
        long jZ = 0;
        long jZ2 = 0;
        boolean z = true;
        int i = 0;
        boolean zQ = false;
        boolean zQ2 = false;
        int iU = 0;
        boolean zQ3 = false;
        Set set = null;
        ir irVar = null;
        while (z) {
            int iJ = vxVarB.j(yo2Var);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strN = vxVarB.n(yo2Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strN2 = vxVarB.n(yo2Var, 1);
                    i |= 2;
                    break;
                case 2:
                    zQ = vxVarB.q(yo2Var, 2);
                    i |= 4;
                    break;
                case 3:
                    grVar = (gr) vxVarB.t(yo2Var, 3, (w41) j71VarArr[3].getValue(), grVar);
                    i |= 8;
                    break;
                case 4:
                    list = (List) vxVarB.t(yo2Var, 4, (w41) j71VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    zQ2 = vxVarB.q(yo2Var, 5);
                    i |= 32;
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    erVar = (er) vxVarB.t(yo2Var, 6, (w41) j71VarArr[6].getValue(), erVar);
                    i |= 64;
                    break;
                case 7:
                    set = (Set) vxVarB.t(yo2Var, 7, (w41) j71VarArr[7].getValue(), set);
                    i |= 128;
                    break;
                case 8:
                    irVar = (ir) vxVarB.t(yo2Var, 8, (w41) j71VarArr[8].getValue(), irVar);
                    i |= 256;
                    break;
                case 9:
                    strN3 = vxVarB.n(yo2Var, 9);
                    i |= AIChatConfig.DefaultMaxTokens;
                    break;
                case 10:
                    iU = vxVarB.u(yo2Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    jZ = vxVarB.z(yo2Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    jZ2 = vxVarB.z(yo2Var, 12);
                    i |= 4096;
                    break;
                case 13:
                    zQ3 = vxVarB.q(yo2Var, 13);
                    i |= 8192;
                    break;
                default:
                    throw new e83(iJ);
            }
        }
        vxVarB.a(yo2Var);
        return new zq(i, strN, strN2, zQ, grVar, list, zQ2, erVar, set, irVar, strN3, iU, jZ, jZ2, zQ3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: w41[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qo0
    public final w41[] b() {
        j71[] j71VarArr = zq.o;
        nv2 nv2Var = nv2.a;
        ll llVar = ll.a;
        ed1 ed1Var = ed1.a;
        return new w41[]{nv2Var, nv2Var, llVar, j71VarArr[3].getValue(), j71VarArr[4].getValue(), llVar, j71VarArr[6].getValue(), j71VarArr[7].getValue(), j71VarArr[8].getValue(), nv2Var, f11.a, ed1Var, ed1Var, llVar};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    @Override // defpackage.w41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ve0 ve0Var, Object obj) {
        j71[] j71VarArr;
        long j;
        boolean z;
        zq zqVar = (zq) obj;
        zqVar.getClass();
        boolean z2 = zqVar.n;
        long j2 = zqVar.m;
        long j3 = zqVar.l;
        int i = zqVar.k;
        String str = zqVar.j;
        ir irVar = zqVar.i;
        Set set = zqVar.h;
        er erVar = zqVar.g;
        boolean z3 = zqVar.f;
        List list = zqVar.e;
        gr grVar = zqVar.d;
        boolean z4 = zqVar.c;
        String str2 = zqVar.b;
        String str3 = zqVar.a;
        yo2 yo2Var = descriptor;
        wx wxVarB = ve0Var.b(yo2Var);
        j71[] j71VarArr2 = zq.o;
        if (!wxVarB.d(yo2Var)) {
            j71VarArr = j71VarArr2;
            if (t11.l(str3, yr.f())) {
                j = j3;
            }
            if (!wxVarB.d(yo2Var) || !t11.l(str2, "")) {
                ((dv2) wxVarB).x(yo2Var, 1, str2);
            }
            if (!wxVarB.d(yo2Var) || !z4) {
                ((dv2) wxVarB).r(yo2Var, 2, z4);
            }
            if (!wxVarB.d(yo2Var) || grVar != gr.i) {
                ((dv2) wxVarB).w(yo2Var, 3, (w41) j71VarArr[3].getValue(), grVar);
            }
            if (!wxVarB.d(yo2Var) || !t11.l(list, be0.h)) {
                ((dv2) wxVarB).w(yo2Var, 4, (w41) j71VarArr[4].getValue(), list);
            }
            if (!wxVarB.d(yo2Var) || !z3) {
                ((dv2) wxVarB).r(yo2Var, 5, z3);
            }
            if (!wxVarB.d(yo2Var) || erVar != er.i) {
                ((dv2) wxVarB).w(yo2Var, 6, (w41) j71VarArr[6].getValue(), erVar);
            }
            if (!wxVarB.d(yo2Var) || !t11.l(set, fe0.h)) {
                ((dv2) wxVarB).w(yo2Var, 7, (w41) j71VarArr[7].getValue(), set);
            }
            if (!wxVarB.d(yo2Var) || irVar != ir.i) {
                ((dv2) wxVarB).w(yo2Var, 8, (w41) j71VarArr[8].getValue(), irVar);
            }
            if (!wxVarB.d(yo2Var) || !t11.l(str, "")) {
                ((dv2) wxVarB).x(yo2Var, 9, str);
            }
            if (!wxVarB.d(yo2Var) || i != 1000) {
                ((dv2) wxVarB).u(10, i, yo2Var);
            }
            if (!wxVarB.d(yo2Var) || j != 0) {
                ((dv2) wxVarB).v(yo2Var, 11, j);
            }
            if (!wxVarB.d(yo2Var) || j2 != 0) {
                ((dv2) wxVarB).v(yo2Var, 12, j2);
            }
            if (wxVarB.d(yo2Var)) {
                z = z2;
                if (!z) {
                }
                wxVarB.a(yo2Var);
            }
            z = z2;
            ((dv2) wxVarB).r(yo2Var, 13, z);
            wxVarB.a(yo2Var);
        }
        j71VarArr = j71VarArr2;
        j = j3;
        ((dv2) wxVarB).x(yo2Var, 0, str3);
        if (!wxVarB.d(yo2Var)) {
            ((dv2) wxVarB).x(yo2Var, 1, str2);
        }
        if (!wxVarB.d(yo2Var)) {
            ((dv2) wxVarB).r(yo2Var, 2, z4);
        }
        if (!wxVarB.d(yo2Var)) {
            ((dv2) wxVarB).w(yo2Var, 3, (w41) j71VarArr[3].getValue(), grVar);
        }
        if (!wxVarB.d(yo2Var)) {
            ((dv2) wxVarB).w(yo2Var, 4, (w41) j71VarArr[4].getValue(), list);
        }
        if (!wxVarB.d(yo2Var)) {
            ((dv2) wxVarB).r(yo2Var, 5, z3);
        }
        if (!wxVarB.d(yo2Var)) {
            ((dv2) wxVarB).w(yo2Var, 6, (w41) j71VarArr[6].getValue(), erVar);
        }
        if (!wxVarB.d(yo2Var)) {
            ((dv2) wxVarB).w(yo2Var, 7, (w41) j71VarArr[7].getValue(), set);
        }
        if (!wxVarB.d(yo2Var)) {
            ((dv2) wxVarB).w(yo2Var, 8, (w41) j71VarArr[8].getValue(), irVar);
        }
        if (!wxVarB.d(yo2Var)) {
            ((dv2) wxVarB).x(yo2Var, 9, str);
        }
        if (!wxVarB.d(yo2Var)) {
            ((dv2) wxVarB).u(10, i, yo2Var);
        }
        if (!wxVarB.d(yo2Var)) {
            ((dv2) wxVarB).v(yo2Var, 11, j);
        }
        if (!wxVarB.d(yo2Var)) {
            ((dv2) wxVarB).v(yo2Var, 12, j2);
        }
        if (wxVarB.d(yo2Var)) {
        }
        ((dv2) wxVarB).r(yo2Var, 13, z);
        wxVarB.a(yo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return descriptor;
    }
}
