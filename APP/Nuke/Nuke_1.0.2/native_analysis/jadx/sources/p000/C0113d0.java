package p000;

import java.util.Set;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: d0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0113d0 implements qo0 {

    /* JADX INFO: renamed from: a */
    public static final C0113d0 f1797a;
    private static final yo2 descriptor;

    static {
        C0113d0 c0113d0 = new C0113d0();
        f1797a = c0113d0;
        b12 b12Var = new b12("nuke.module.wechat.ai.AIChatConfig", c0113d0, 10);
        b12Var.m359l("baseUrl", true);
        b12Var.m359l("apiKey", true);
        b12Var.m359l("model", true);
        b12Var.m359l("systemPrompt", true);
        b12Var.m359l("temperature", true);
        b12Var.m359l("maxTokens", true);
        b12Var.m359l("contextRounds", true);
        b12Var.m359l("replyDelayMs", true);
        b12Var.m359l("listMode", true);
        b12Var.m359l("targetIds", true);
        descriptor = b12Var;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
        j71[] j71VarArr = AIChatConfig.$childSerializers;
        EnumC0075c1 enumC0075c1 = null;
        int i = 0;
        int iMo4566u = 0;
        int iMo4566u2 = 0;
        String strMo4563n = null;
        String strMo4563n2 = null;
        String strMo4563n3 = null;
        String strMo4563n4 = null;
        float fMo4559i = 0.0f;
        long jMo4568z = 0;
        boolean z = true;
        Set set = null;
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
                    strMo4563n3 = interfaceC0826vxMo895b.mo4563n(yo2Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo4563n4 = interfaceC0826vxMo895b.mo4563n(yo2Var, 3);
                    i |= 8;
                    break;
                case 4:
                    fMo4559i = interfaceC0826vxMo895b.mo4559i(yo2Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo4566u = interfaceC0826vxMo895b.mo4566u(yo2Var, 5);
                    i |= 32;
                    break;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    iMo4566u2 = interfaceC0826vxMo895b.mo4566u(yo2Var, 6);
                    i |= 64;
                    break;
                case 7:
                    jMo4568z = interfaceC0826vxMo895b.mo4568z(yo2Var, 7);
                    i |= 128;
                    break;
                case 8:
                    enumC0075c1 = (EnumC0075c1) interfaceC0826vxMo895b.mo907t(yo2Var, 8, (w41) j71VarArr[8].getValue(), enumC0075c1);
                    i |= 256;
                    break;
                case 9:
                    set = (Set) interfaceC0826vxMo895b.mo907t(yo2Var, 9, (w41) j71VarArr[9].getValue(), set);
                    i |= AIChatConfig.DefaultMaxTokens;
                    break;
                default:
                    throw new e83(iMo901j);
            }
        }
        interfaceC0826vxMo895b.mo894a(yo2Var);
        return new AIChatConfig(i, strMo4563n, strMo4563n2, strMo4563n3, strMo4563n4, fMo4559i, iMo4566u, iMo4566u2, jMo4568z, enumC0075c1, set, (dp2) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.qo0
    /* JADX INFO: renamed from: b */
    public final w41[] mo166b() {
        j71[] j71VarArr = AIChatConfig.$childSerializers;
        nv2 nv2Var = nv2.f7346a;
        f11 f11Var = f11.f2733a;
        return new w41[]{nv2Var, nv2Var, nv2Var, nv2Var, vj0.f11988a, f11Var, f11Var, ed1.f2399a, j71VarArr[8].getValue(), j71VarArr[9].getValue()};
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        AIChatConfig aIChatConfig = (AIChatConfig) obj;
        aIChatConfig.getClass();
        yo2 yo2Var = descriptor;
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
        AIChatConfig.write$Self$app(aIChatConfig, interfaceC0863wxMo1177b, yo2Var);
        interfaceC0863wxMo1177b.mo1176a(yo2Var);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return descriptor;
    }
}
