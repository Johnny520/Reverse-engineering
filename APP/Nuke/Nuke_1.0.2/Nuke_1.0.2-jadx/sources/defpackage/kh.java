package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kh implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Set j;
    public final /* synthetic */ xm0 k;
    public final /* synthetic */ in0 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ kh(boolean z, Set set, xm0 xm0Var, in0 in0Var, int i, int i2) {
        this.h = i2;
        this.i = z;
        this.j = set;
        this.k = xm0Var;
        this.l = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iN = pp0.N(385);
                s11.q(this.i, this.j, this.k, this.l, (px) obj, iN);
                break;
            default:
                ((Integer) obj2).getClass();
                int iN2 = pp0.N(385);
                t11.g(this.i, this.j, this.k, this.l, (px) obj, iN2);
                break;
        }
        return a83Var;
    }
}
