package p000;

/* JADX INFO: renamed from: es */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0177es implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2579h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f2580i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xm0 f2581j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ in0 f2582k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f2583l;

    public /* synthetic */ C0177es(String str, xm0 xm0Var, in0 in0Var, int i, int i2) {
        this.f2579h = i2;
        this.f2580i = str;
        this.f2581j = xm0Var;
        this.f2582k = in0Var;
        this.f2583l = i;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f2579h;
        a83 a83Var = a83.f116a;
        int i2 = this.f2583l;
        in0 in0Var = this.f2582k;
        xm0 xm0Var = this.f2581j;
        String str = this.f2580i;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                rg3.m4467c(str, xm0Var, in0Var, interfaceC0596px, pp0.m3902N(i2 | 1));
                break;
            default:
                num.getClass();
                ci0.m802c(str, xm0Var, in0Var, interfaceC0596px, pp0.m3902N(i2 | 1));
                break;
        }
        return a83Var;
    }
}
