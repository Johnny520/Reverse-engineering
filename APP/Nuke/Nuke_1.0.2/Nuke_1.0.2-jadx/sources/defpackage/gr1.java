package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gr1 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ un0 m;
    public final /* synthetic */ un0 n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gr1(Object obj, Object obj2, un0 un0Var, un0 un0Var2, boolean z, int i, int i2) {
        this.h = i2;
        this.k = obj;
        this.l = obj2;
        this.m = un0Var;
        this.n = un0Var2;
        this.i = z;
        this.j = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        int i2 = this.j;
        un0 un0Var = this.n;
        un0 un0Var2 = this.m;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iN = pp0.N(i2 | 1);
                eu.j((List) obj3, this.l, (in0) un0Var2, (in0) un0Var, this.i, (px) obj, iN);
                break;
            default:
                ((Integer) obj2).getClass();
                int iN2 = pp0.N(i2 | 1);
                sp0.h((String) obj3, (String) this.l, (mn0) un0Var2, (mn0) un0Var, this.i, (px) obj, iN2);
                break;
        }
        return a83Var;
    }
}
