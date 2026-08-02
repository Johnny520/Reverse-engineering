package p000;

/* JADX INFO: renamed from: i8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0305i8 extends w51 implements mn0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f4480i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4481j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ un0 f4482k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f4483l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ un0 f4484m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0305i8(un0 un0Var, Object obj, un0 un0Var2, int i, int i2) {
        super(2);
        this.f4480i = i2;
        this.f4482k = un0Var;
        this.f4483l = obj;
        this.f4484m = un0Var2;
        this.f4481j = i;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f4480i;
        a83 a83Var = a83.f116a;
        int i2 = this.f4481j;
        un0 un0Var = this.f4484m;
        Object obj3 = this.f4483l;
        un0 un0Var2 = this.f4482k;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC0731te.m5208f((xm0) un0Var2, (n80) obj3, (C0402kw) un0Var, interfaceC0596px, pp0.m3902N(i2 | 1));
                break;
            default:
                pp0.m3903a((in0) un0Var2, (uh1) obj3, (in0) un0Var, interfaceC0596px, pp0.m3902N(i2 | 1));
                break;
        }
        return a83Var;
    }
}
