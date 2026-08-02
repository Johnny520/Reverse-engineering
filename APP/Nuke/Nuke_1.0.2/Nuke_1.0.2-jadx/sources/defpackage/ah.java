package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ah implements qo0 {
    public static final ah a;
    private static final yo2 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ah ahVar = new ah();
        a = ahVar;
        b12 b12Var = new b12("nuke.module.wechat.item.chat.AutoReceiveRedPacket.AutoReceiveRedPacketConf", ahVar, 6);
        b12Var.l("waitTime", true);
        b12Var.l("receiveMode", true);
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
        j71[] j71VarArr = ch.g;
        fh fhVar = null;
        int i = 0;
        int iU = 0;
        boolean zQ = false;
        long jZ = 0;
        Set set = null;
        Set set2 = null;
        boolean z = true;
        while (z) {
            int iJ = vxVarB.j(yo2Var);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jZ = vxVarB.z(yo2Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iU = vxVarB.u(yo2Var, 1);
                    i |= 2;
                    break;
                case 2:
                    zQ = vxVarB.q(yo2Var, 2);
                    i |= 4;
                    break;
                case 3:
                    set = (Set) vxVarB.t(yo2Var, 3, (w41) j71VarArr[3].getValue(), set);
                    i |= 8;
                    break;
                case 4:
                    set2 = (Set) vxVarB.t(yo2Var, 4, (w41) j71VarArr[4].getValue(), set2);
                    i |= 16;
                    break;
                case 5:
                    fhVar = (fh) vxVarB.t(yo2Var, 5, dh.a, fhVar);
                    i |= 32;
                    break;
                default:
                    throw new e83(iJ);
            }
        }
        vxVarB.a(yo2Var);
        return new ch(i, jZ, iU, zQ, set, set2, fhVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: w41[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qo0
    public final w41[] b() {
        j71[] j71VarArr = ch.g;
        return new w41[]{ed1.a, f11.a, ll.a, j71VarArr[3].getValue(), j71VarArr[4].getValue(), dh.a};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        ch chVar = (ch) obj;
        chVar.getClass();
        fh fhVar = chVar.f;
        Set set = chVar.e;
        Set set2 = chVar.d;
        boolean z = chVar.c;
        int i = chVar.b;
        long j = chVar.a;
        yo2 yo2Var = descriptor;
        wx wxVarB = ve0Var.b(yo2Var);
        j71[] j71VarArr = ch.g;
        if (wxVarB.d(yo2Var) || j != 0) {
            ((dv2) wxVarB).v(yo2Var, 0, j);
        }
        if (wxVarB.d(yo2Var) || i != 1) {
            ((dv2) wxVarB).u(1, i, yo2Var);
        }
        if (wxVarB.d(yo2Var) || z) {
            ((dv2) wxVarB).r(yo2Var, 2, z);
        }
        boolean zD = wxVarB.d(yo2Var);
        fe0 fe0Var = fe0.h;
        if (zD || !t11.l(set2, fe0Var)) {
            ((dv2) wxVarB).w(yo2Var, 3, (w41) j71VarArr[3].getValue(), set2);
        }
        if (wxVarB.d(yo2Var) || !t11.l(set, fe0Var)) {
            ((dv2) wxVarB).w(yo2Var, 4, (w41) j71VarArr[4].getValue(), set);
        }
        if (wxVarB.d(yo2Var) || !t11.l(fhVar, new fh())) {
            ((dv2) wxVarB).w(yo2Var, 5, dh.a, fhVar);
        }
        wxVarB.a(yo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return descriptor;
    }
}
