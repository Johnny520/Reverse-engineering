package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hb implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ nb i;
    public final /* synthetic */ ry2 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ hb(nb nbVar, ry2 ry2Var, int i) {
        this.h = i;
        this.i = nbVar;
        this.j = ry2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        int i2 = 1;
        ry2 ry2Var = this.j;
        nb nbVar = this.i;
        switch (i) {
            case 0:
                gb gbVar = nbVar.f;
                ta taVar = new ta(i2, ry2Var);
                o72 o72Var = new o72();
                nbVar.e.c("dataBuilder", gbVar, new r1(i2, o72Var, taVar));
                Object obj = o72Var.i;
                if (obj != null) {
                    return (qy2) obj;
                }
                t11.S("result");
                throw null;
            case 1:
                gb gbVar2 = nbVar.g;
                hb hbVar = new hb(nbVar, ry2Var, 2);
                o72 o72Var2 = new o72();
                nbVar.e.c("positioner", gbVar2, new r1(i2, o72Var2, hbVar));
                Object obj2 = o72Var2.i;
                if (obj2 != null) {
                    return (o62) obj2;
                }
                t11.S("result");
                throw null;
            default:
                Object objA = nbVar.c.a();
                c61 c61Var = (c61) (((c61) objA).w() ? objA : null);
                return c61Var == null ? o62.e : ry2Var.n(c61Var).i(c61Var.M(0L));
        }
    }
}
