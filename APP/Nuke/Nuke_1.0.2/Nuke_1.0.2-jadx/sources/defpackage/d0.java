package defpackage;

import java.util.Set;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements qo0 {
    public static final d0 a;
    private static final yo2 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        d0 d0Var = new d0();
        a = d0Var;
        b12 b12Var = new b12("nuke.module.wechat.ai.AIChatConfig", d0Var, 10);
        b12Var.l("baseUrl", true);
        b12Var.l("apiKey", true);
        b12Var.l("model", true);
        b12Var.l("systemPrompt", true);
        b12Var.l("temperature", true);
        b12Var.l("maxTokens", true);
        b12Var.l("contextRounds", true);
        b12Var.l("replyDelayMs", true);
        b12Var.l("listMode", true);
        b12Var.l("targetIds", true);
        descriptor = b12Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final Object a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        vx vxVarB = y40Var.b(yo2Var);
        j71[] j71VarArr = AIChatConfig.$childSerializers;
        c1 c1Var = null;
        int i = 0;
        int iU = 0;
        int iU2 = 0;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        String strN4 = null;
        float fI = 0.0f;
        long jZ = 0;
        boolean z = true;
        Set set = null;
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
                    strN3 = vxVarB.n(yo2Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strN4 = vxVarB.n(yo2Var, 3);
                    i |= 8;
                    break;
                case 4:
                    fI = vxVarB.i(yo2Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iU = vxVarB.u(yo2Var, 5);
                    i |= 32;
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    iU2 = vxVarB.u(yo2Var, 6);
                    i |= 64;
                    break;
                case 7:
                    jZ = vxVarB.z(yo2Var, 7);
                    i |= 128;
                    break;
                case 8:
                    c1Var = (c1) vxVarB.t(yo2Var, 8, (w41) j71VarArr[8].getValue(), c1Var);
                    i |= 256;
                    break;
                case 9:
                    set = (Set) vxVarB.t(yo2Var, 9, (w41) j71VarArr[9].getValue(), set);
                    i |= AIChatConfig.DefaultMaxTokens;
                    break;
                default:
                    throw new e83(iJ);
            }
        }
        vxVarB.a(yo2Var);
        return new AIChatConfig(i, strN, strN2, strN3, strN4, fI, iU, iU2, jZ, c1Var, set, (dp2) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: w41[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qo0
    public final w41[] b() {
        j71[] j71VarArr = AIChatConfig.$childSerializers;
        nv2 nv2Var = nv2.a;
        f11 f11Var = f11.a;
        return new w41[]{nv2Var, nv2Var, nv2Var, nv2Var, vj0.a, f11Var, f11Var, ed1.a, j71VarArr[8].getValue(), j71VarArr[9].getValue()};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        AIChatConfig aIChatConfig = (AIChatConfig) obj;
        aIChatConfig.getClass();
        yo2 yo2Var = descriptor;
        wx wxVarB = ve0Var.b(yo2Var);
        AIChatConfig.write$Self$app(aIChatConfig, wxVarB, yo2Var);
        wxVarB.a(yo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return descriptor;
    }
}
