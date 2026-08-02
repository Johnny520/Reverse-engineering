package p000;

/* JADX INFO: renamed from: ia */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0307ia extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ d22 f4503i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xm0 f4504j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ h22 f4505k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f4506l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ d61 f4507m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0307ia(d22 d22Var, xm0 xm0Var, h22 h22Var, String str, d61 d61Var) {
        super(1);
        this.f4503i = d22Var;
        this.f4504j = xm0Var;
        this.f4505k = h22Var;
        this.f4506l = str;
        this.f4507m = d61Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        d22 d22Var = this.f4503i;
        d22Var.f1838w.addView(d22Var, d22Var.f1839x);
        d22Var.m931o(this.f4504j, this.f4505k, this.f4506l, this.f4507m);
        return new C0194f8(1, d22Var);
    }
}
