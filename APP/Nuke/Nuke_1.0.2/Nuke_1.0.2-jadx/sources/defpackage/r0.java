package defpackage;

import nuke.module.wechat.ai.AIModelInfo;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ r0(uh1 uh1Var, xm0 xm0Var, boolean z, int i) {
        this.h = 1;
        this.l = uh1Var;
        this.i = xm0Var;
        this.j = z;
        this.k = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        int i2 = this.k;
        Object obj3 = this.i;
        Object obj4 = this.l;
        boolean z = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                se.c((AIModelInfo) obj4, z, (xm0) obj3, (px) obj, pp0.N(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                rp0.M((uh1) obj4, (xm0) obj3, z, (px) obj, pp0.N(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ur1.a((lp1) obj4, z, (kw) obj3, (px) obj, pp0.N(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                up0.c(z, (c92) obj4, (b03) obj3, (px) obj, pp0.N(i2 | 1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ r0(Object obj, boolean z, un0 un0Var, int i, int i2) {
        this.h = i2;
        this.l = obj;
        this.j = z;
        this.i = un0Var;
        this.k = i;
    }

    public /* synthetic */ r0(boolean z, c92 c92Var, b03 b03Var, int i) {
        this.h = 3;
        this.j = z;
        this.l = c92Var;
        this.i = b03Var;
        this.k = i;
    }
}
