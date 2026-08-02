package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o81 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ q81 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ o81(q81 q81Var, int i) {
        this.h = i;
        this.i = q81Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        q81 q81Var = this.i;
        switch (i) {
            case 0:
                d91 d91Var = q81Var.w.b;
                return Float.valueOf((((kx1) d91Var.e.b).g() * 500) + ((kx1) d91Var.e.c).g());
            case 1:
                d91 d91Var2 = q81Var.w.b;
                int iG = ((kx1) d91Var2.e.b).g();
                int iG2 = ((kx1) d91Var2.e.c).g();
                return Float.valueOf(d91Var2.c() ? (iG * 500) + iG2 + 100.0f : (iG * 500) + iG2);
            default:
                d91 d91Var3 = q81Var.w.b;
                int iG3 = (int) (d91Var3.g().o == qv1.h ? d91Var3.g().g() & 4294967295L : d91Var3.g().g() >> 32);
                d91 d91Var4 = q81Var.w.b;
                return Float.valueOf(iG3 - ((-d91Var4.g().l) + d91Var4.g().p));
        }
    }
}
