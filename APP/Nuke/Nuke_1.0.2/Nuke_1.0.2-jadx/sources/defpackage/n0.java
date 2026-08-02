package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ n0(String str, int i) {
        this.h = i;
        this.i = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        String str = this.i;
        px pxVar = (px) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                se.b(str, pxVar, pp0.N(1));
                break;
            case 1:
                num.getClass();
                se.f(str, pxVar, pp0.N(1));
                break;
            case 2:
                num.getClass();
                te.i(str, pxVar, pp0.N(1));
                break;
            case 3:
                num.getClass();
                rg3.b(str, pxVar, pp0.N(1));
                break;
            case 4:
                num.getClass();
                s11.c(str, pxVar, pp0.N(1));
                break;
            case 5:
                num.getClass();
                s11.e(str, pxVar, pp0.N(1));
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                num.getClass();
                t11.d(str, pxVar, pp0.N(1));
                break;
            case 7:
                num.getClass();
                t11.i(str, pxVar, pp0.N(1));
                break;
            case 8:
                num.getClass();
                yr.a(str, pxVar, pp0.N(1));
                break;
            case 9:
                int iIntValue = num.intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    ci0.m(str, go0Var, 0);
                }
                break;
            case 10:
                num.getClass();
                ci0.m(str, pxVar, pp0.N(1));
                break;
            case 11:
                int iIntValue2 = num.intValue();
                go0 go0Var2 = (go0) pxVar;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.R();
                } else {
                    gf1.h(p7.N(str), null, false, 22.0f, null, go0Var2, 3072, 22);
                }
                break;
            case 12:
                num.getClass();
                gf1.g(str, pxVar, pp0.N(1));
                break;
            default:
                num.getClass();
                se.l(str, pxVar, pp0.N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ n0(String str, int i, int i2) {
        this.h = i2;
        this.i = str;
    }
}
