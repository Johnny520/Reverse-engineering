package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gp1 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xm0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gp1(xm0 xm0Var, int i) {
        this.h = i;
        this.i = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        xm0 xm0Var = this.i;
        switch (i) {
            case 0:
                xm0Var.a();
                return a83Var;
            case 1:
                zn2 zn2Var = (zn2) obj;
                Object objA = xm0Var.a();
                if (Float.isNaN(((Number) objA).floatValue())) {
                    objA = null;
                }
                Float f = (Float) objA;
                s32 s32Var = new s32(f != null ? f.floatValue() : 0.0f, new tt(1.0f));
                v41[] v41VarArr = xn2.a;
                yn2 yn2Var = vn2.c;
                v41 v41Var = xn2.a[1];
                zn2Var.a(yn2Var, s32Var);
                return a83Var;
            default:
                return (rs1) xm0Var.a();
        }
    }
}
