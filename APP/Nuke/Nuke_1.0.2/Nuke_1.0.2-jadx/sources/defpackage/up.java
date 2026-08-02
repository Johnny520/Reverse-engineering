package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class up implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ up(String str, uh1 uh1Var, int i, int i2) {
        this.h = 6;
        this.k = str;
        this.j = uh1Var;
        this.i = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        int i2 = this.i;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                eu.b((uh1) obj4, (in0) obj3, (px) obj, pp0.N(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((kw) obj4).h(obj3, (px) obj, pp0.N(i2) | 1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ci0.a((f42) obj4, (kw) obj3, (px) obj, pp0.N(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ci0.b((f42[]) obj4, (mn0) obj3, (px) obj, pp0.N(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                fg1.d((String) obj4, (xm0) obj3, (px) obj, pp0.N(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                s11.h((String) obj4, (zt0) obj3, (px) obj, pp0.N(i2 | 1));
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((Integer) obj2).getClass();
                qp0.e((String) obj3, (uh1) obj4, (px) obj, pp0.N(1), i2);
                break;
            default:
                ((Integer) obj2).intValue();
                fg1.f((xm0) obj4, (in0) obj3, (px) obj, pp0.N(i2 | 1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ up(int i, int i2, Object obj, Object obj2) {
        this.h = i2;
        this.j = obj;
        this.k = obj2;
        this.i = i;
    }
}
