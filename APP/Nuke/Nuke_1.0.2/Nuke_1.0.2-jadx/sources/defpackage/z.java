package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xm0 i;
    public final /* synthetic */ xm0 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ z(xm0 xm0Var, xm0 xm0Var2, int i) {
        this.h = i;
        this.i = xm0Var;
        this.j = xm0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        xm0 xm0Var = this.j;
        xm0 xm0Var2 = this.i;
        switch (i) {
            case 0:
                AIChatConfig aIChatConfig = (AIChatConfig) obj;
                aIChatConfig.getClass();
                pp1 pp1Var = pp1.a;
                pp1.c().d(AIChatConfig.Companion.serializer(), aIChatConfig, "AIChat/config");
                xm0Var2.a();
                xm0Var.a();
                break;
            case 1:
                de deVar = (de) obj;
                deVar.getClass();
                pp1 pp1Var2 = pp1.a;
                pp1.c().d(de.Companion.serializer(), deVar, "AntiRevoke/config");
                xm0Var2.a();
                xm0Var.a();
                break;
            case 2:
                ch chVar = (ch) obj;
                chVar.getClass();
                pp1 pp1Var3 = pp1.a;
                pp1.c().d(ch.Companion.serializer(), chVar, "AutoReceiveRedPacket/config");
                xm0Var2.a();
                xm0Var.a();
                break;
            case 3:
                di diVar = (di) obj;
                diVar.getClass();
                pp1 pp1Var4 = pp1.a;
                pp1.c().d(di.Companion.serializer(), diVar, "AutoReceiveTransferMoney/config");
                xm0Var2.a();
                xm0Var.a();
                break;
            case 4:
                cr crVar = (cr) obj;
                crVar.getClass();
                pp1 pp1Var5 = pp1.a;
                pp1.c().d(cr.Companion.serializer(), crVar, "ChatAutoReply/config");
                xm0Var2.a();
                xm0Var.a();
                break;
            case 5:
                long jLongValue = ((Long) obj).longValue();
                pp1 pp1Var6 = pp1.a;
                pp1.c().d(bs.Companion.serializer(), new bs(jLongValue), "ChatAvatarRotator/config");
                xm0Var2.a();
                xm0Var.a();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                String str = (String) obj;
                str.getClass();
                pp1 pp1Var7 = pp1.a;
                op1 op1VarC = pp1.c();
                op1VarC.getClass();
                op1VarC.e("CustomInputHint/text", str);
                xm0Var2.a();
                xm0Var.a();
                break;
            case 7:
                ci1 ci1Var = (ci1) obj;
                ci1Var.getClass();
                pp1 pp1Var8 = pp1.a;
                pp1.c().d(ci1.Companion.serializer(), ci1Var, "ModifyFriendsCount/config");
                xm0Var2.a();
                xm0Var.a();
                break;
            default:
                cz2 cz2Var = (cz2) obj;
                xm0Var2.a();
                if (xm0Var != null ? ((Boolean) xm0Var.a()).booleanValue() : true) {
                    cz2Var.close();
                }
                break;
        }
        return a83Var;
    }
}
