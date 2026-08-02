package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wt1 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f12638i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ pl0 f12639j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ pl0 f12640k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f12641l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0161ec f12642m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f12643n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt1(pl0 pl0Var, pl0 pl0Var2, Object obj, int i, C0161ec c0161ec, int i2) {
        super(1);
        this.f12638i = i2;
        this.f12639j = pl0Var;
        this.f12640k = pl0Var2;
        this.f12643n = obj;
        this.f12641l = i;
        this.f12642m = c0161ec;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f12638i;
        C0161ec c0161ec = this.f12642m;
        int i2 = this.f12641l;
        Object obj2 = this.f12643n;
        pl0 pl0Var = this.f12640k;
        pl0 pl0Var2 = this.f12639j;
        switch (i) {
            case 0:
                InterfaceC0501nk interfaceC0501nk = (InterfaceC0501nk) obj;
                if (pl0Var2 != ((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pl0Var)).getFocusOwner()).m561f()) {
                    return Boolean.TRUE;
                }
                boolean zM5064P = t11.m5064P(pl0Var, (pl0) obj2, i2, c0161ec);
                Boolean boolValueOf = Boolean.valueOf(zM5064P);
                if (zM5064P || !interfaceC0501nk.mo3311a()) {
                    return boolValueOf;
                }
                return null;
            default:
                InterfaceC0501nk interfaceC0501nk2 = (InterfaceC0501nk) obj;
                if (pl0Var2 != ((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pl0Var)).getFocusOwner()).m561f()) {
                    return Boolean.TRUE;
                }
                boolean zM1008p = dd3.m1008p(i2, c0161ec, pl0Var, (o62) obj2);
                Boolean boolValueOf2 = Boolean.valueOf(zM1008p);
                if (zM1008p || !interfaceC0501nk2.mo3311a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
