package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ kw i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ o0(kw kwVar) {
        this.h = 6;
        this.i = kwVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        kw kwVar = this.i;
        px pxVar = (px) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                se.e(kwVar, pxVar, pp0.N(7));
                break;
            case 1:
                num.getClass();
                s11.d(kwVar, pxVar, pp0.N(7));
                break;
            case 2:
                num.getClass();
                t11.h(kwVar, pxVar, pp0.N(7));
                break;
            case 3:
                num.getClass();
                pp0.d(kwVar, pxVar, pp0.N(49));
                break;
            case 4:
                num.getClass();
                ci0.p(kwVar, pxVar, pp0.N(7));
                break;
            case 5:
                num.getClass();
                op0.b(kwVar, pxVar, pp0.N(7));
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                int iIntValue = num.intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    kwVar.g(go0Var, 0);
                }
                break;
            default:
                num.getClass();
                se.k(kwVar, pxVar, pp0.N(7));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ o0(kw kwVar, int i, int i2) {
        this.h = i2;
        this.i = kwVar;
    }
}
