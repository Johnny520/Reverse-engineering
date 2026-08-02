package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gp1 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3650h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xm0 f3651i;

    public /* synthetic */ gp1(xm0 xm0Var, int i) {
        this.f3650h = i;
        this.f3651i = xm0Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f3650h;
        a83 a83Var = a83.f116a;
        xm0 xm0Var = this.f3651i;
        switch (i) {
            case 0:
                xm0Var.mo6a();
                return a83Var;
            case 1:
                zn2 zn2Var = (zn2) obj;
                Object objMo6a = xm0Var.mo6a();
                if (Float.isNaN(((Number) objMo6a).floatValue())) {
                    objMo6a = null;
                }
                Float f = (Float) objMo6a;
                s32 s32Var = new s32(f != null ? f.floatValue() : 0.0f, new C0748tt(1.0f));
                v41[] v41VarArr = xn2.f13086a;
                yn2 yn2Var = vn2.f12060c;
                v41 v41Var = xn2.f13086a[1];
                zn2Var.mo1533a(yn2Var, s32Var);
                return a83Var;
            default:
                return (rs1) xm0Var.mo6a();
        }
    }
}
