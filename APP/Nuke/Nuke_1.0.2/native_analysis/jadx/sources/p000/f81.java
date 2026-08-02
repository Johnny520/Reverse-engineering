package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f81 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2855h = 0;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0402kw f2856i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2857j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f2858k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2859l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f2860m;

    public /* synthetic */ f81(uh1 uh1Var, String str, C0402kw c0402kw, int i, int i2) {
        this.f2859l = uh1Var;
        this.f2860m = str;
        this.f2856i = c0402kw;
        this.f2857j = i;
        this.f2858k = i2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f2855h;
        a83 a83Var = a83.f116a;
        Object obj3 = this.f2860m;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM3902N = pp0.m3902N(this.f2858k | 1);
                p40.m3716a(this.f2859l, this.f2857j, (g81) obj3, this.f2856i, (InterfaceC0596px) obj, iM3902N);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM3902N2 = pp0.m3902N(this.f2857j | 1);
                AbstractC0179eu.m1464n((uh1) this.f2859l, (String) obj3, this.f2856i, (InterfaceC0596px) obj, iM3902N2, this.f2858k);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ f81(Object obj, int i, g81 g81Var, C0402kw c0402kw, int i2) {
        this.f2859l = obj;
        this.f2857j = i;
        this.f2860m = g81Var;
        this.f2856i = c0402kw;
        this.f2858k = i2;
    }
}
