package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nf implements mn0 {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ in0 j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ nf(c73 c73Var, boolean z, in0 in0Var, in0 in0Var2, int i) {
        this.k = c73Var;
        this.i = z;
        this.j = in0Var;
        this.l = in0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj3 = this.l;
        Object obj4 = this.k;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iN = pp0.N(9);
                te.d((c73) obj4, this.i, this.j, (in0) obj3, (px) obj, iN);
                break;
            default:
                ((Integer) obj2).getClass();
                int iN2 = pp0.N(1);
                yr.b((String) obj4, (String) obj3, this.i, this.j, (px) obj, iN2);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ nf(String str, String str2, boolean z, in0 in0Var, int i) {
        this.k = str;
        this.l = str2;
        this.i = z;
        this.j = in0Var;
    }
}
