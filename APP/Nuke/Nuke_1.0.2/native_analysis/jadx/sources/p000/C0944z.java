package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: z */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0944z implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13687h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xm0 f13688i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xm0 f13689j;

    public /* synthetic */ C0944z(xm0 xm0Var, xm0 xm0Var2, int i) {
        this.f13687h = i;
        this.f13688i = xm0Var;
        this.f13689j = xm0Var2;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f13687h;
        a83 a83Var = a83.f116a;
        xm0 xm0Var = this.f13689j;
        xm0 xm0Var2 = this.f13688i;
        switch (i) {
            case 0:
                AIChatConfig aIChatConfig = (AIChatConfig) obj;
                aIChatConfig.getClass();
                pp1 pp1Var = pp1.f8445a;
                pp1.m3931c().m3607d(AIChatConfig.Companion.serializer(), aIChatConfig, "AIChat/config");
                xm0Var2.mo6a();
                xm0Var.mo6a();
                break;
            case 1:
                C0127de c0127de = (C0127de) obj;
                c0127de.getClass();
                pp1 pp1Var2 = pp1.f8445a;
                pp1.m3931c().m3607d(C0127de.Companion.serializer(), c0127de, "AntiRevoke/config");
                xm0Var2.mo6a();
                xm0Var.mo6a();
                break;
            case 2:
                C0091ch c0091ch = (C0091ch) obj;
                c0091ch.getClass();
                pp1 pp1Var3 = pp1.f8445a;
                pp1.m3931c().m3607d(C0091ch.Companion.serializer(), c0091ch, "AutoReceiveRedPacket/config");
                xm0Var2.mo6a();
                xm0Var.mo6a();
                break;
            case 3:
                C0131di c0131di = (C0131di) obj;
                c0131di.getClass();
                pp1 pp1Var4 = pp1.f8445a;
                pp1.m3931c().m3607d(C0131di.Companion.serializer(), c0131di, "AutoReceiveTransferMoney/config");
                xm0Var2.mo6a();
                xm0Var.mo6a();
                break;
            case 4:
                C0103cr c0103cr = (C0103cr) obj;
                c0103cr.getClass();
                pp1 pp1Var5 = pp1.f8445a;
                pp1.m3931c().m3607d(C0103cr.Companion.serializer(), c0103cr, "ChatAutoReply/config");
                xm0Var2.mo6a();
                xm0Var.mo6a();
                break;
            case 5:
                long jLongValue = ((Long) obj).longValue();
                pp1 pp1Var6 = pp1.f8445a;
                pp1.m3931c().m3607d(C0066bs.Companion.serializer(), new C0066bs(jLongValue), "ChatAvatarRotator/config");
                xm0Var2.mo6a();
                xm0Var.mo6a();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                String str = (String) obj;
                str.getClass();
                pp1 pp1Var7 = pp1.f8445a;
                op1 op1VarM3931c = pp1.m3931c();
                op1VarM3931c.getClass();
                op1VarM3931c.m3608e("CustomInputHint/text", str);
                xm0Var2.mo6a();
                xm0Var.mo6a();
                break;
            case 7:
                ci1 ci1Var = (ci1) obj;
                ci1Var.getClass();
                pp1 pp1Var8 = pp1.f8445a;
                pp1.m3931c().m3607d(ci1.Companion.serializer(), ci1Var, "ModifyFriendsCount/config");
                xm0Var2.mo6a();
                xm0Var.mo6a();
                break;
            default:
                cz2 cz2Var = (cz2) obj;
                xm0Var2.mo6a();
                if (xm0Var != null ? ((Boolean) xm0Var.mo6a()).booleanValue() : true) {
                    cz2Var.close();
                }
                break;
        }
        return a83Var;
    }
}
