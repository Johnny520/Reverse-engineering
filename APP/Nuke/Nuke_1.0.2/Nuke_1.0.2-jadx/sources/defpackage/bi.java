package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bi implements qo0 {
    public static final bi a;
    private static final yo2 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        bi biVar = new bi();
        a = biVar;
        b12 b12Var = new b12("nuke.module.wechat.item.chat.AutoReceiveTransferMoney.AutoReceiveTransferMoneyConf", biVar, 5);
        b12Var.l("waitTime", true);
        b12Var.l("useWhitelist", true);
        b12Var.l("whitelist", true);
        b12Var.l("blacklist", true);
        b12Var.l("autoReplyConf", true);
        descriptor = b12Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        vx vxVarB = y40Var.b(yo2Var);
        j71[] j71VarArr = di.f;
        int i = 0;
        boolean zQ = false;
        long jZ = 0;
        Set set = null;
        Set set2 = null;
        gi giVar = null;
        boolean z = true;
        while (z) {
            int iJ = vxVarB.j(yo2Var);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                jZ = vxVarB.z(yo2Var, 0);
                i |= 1;
            } else if (iJ == 1) {
                zQ = vxVarB.q(yo2Var, 1);
                i |= 2;
            } else if (iJ == 2) {
                set = (Set) vxVarB.t(yo2Var, 2, (w41) j71VarArr[2].getValue(), set);
                i |= 4;
            } else if (iJ == 3) {
                set2 = (Set) vxVarB.t(yo2Var, 3, (w41) j71VarArr[3].getValue(), set2);
                i |= 8;
            } else {
                if (iJ != 4) {
                    throw new e83(iJ);
                }
                giVar = (gi) vxVarB.t(yo2Var, 4, ei.a, giVar);
                i |= 16;
            }
        }
        vxVarB.a(yo2Var);
        return new di(i, jZ, zQ, set, set2, giVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: w41[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qo0
    public final w41[] b() {
        j71[] j71VarArr = di.f;
        return new w41[]{ed1.a, ll.a, j71VarArr[2].getValue(), j71VarArr[3].getValue(), ei.a};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        di diVar = (di) obj;
        diVar.getClass();
        gi giVar = diVar.e;
        Set set = diVar.d;
        Set set2 = diVar.c;
        boolean z = diVar.b;
        long j = diVar.a;
        yo2 yo2Var = descriptor;
        wx wxVarB = ve0Var.b(yo2Var);
        j71[] j71VarArr = di.f;
        if (wxVarB.d(yo2Var) || j != 0) {
            ((dv2) wxVarB).v(yo2Var, 0, j);
        }
        if (wxVarB.d(yo2Var) || z) {
            ((dv2) wxVarB).r(yo2Var, 1, z);
        }
        boolean zD = wxVarB.d(yo2Var);
        fe0 fe0Var = fe0.h;
        if (zD || !t11.l(set2, fe0Var)) {
            ((dv2) wxVarB).w(yo2Var, 2, (w41) j71VarArr[2].getValue(), set2);
        }
        if (wxVarB.d(yo2Var) || !t11.l(set, fe0Var)) {
            ((dv2) wxVarB).w(yo2Var, 3, (w41) j71VarArr[3].getValue(), set);
        }
        if (wxVarB.d(yo2Var) || !t11.l(giVar, new gi())) {
            ((dv2) wxVarB).w(yo2Var, 4, ei.a, giVar);
        }
        wxVarB.a(yo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return descriptor;
    }
}
