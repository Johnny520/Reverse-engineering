package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c22 extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ b72 f1115i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ d22 f1116j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ d11 f1117k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long f1118l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ long f1119m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c22(b72 b72Var, d22 d22Var, d11 d11Var, long j, long j2) {
        super(0);
        this.f1115i = b72Var;
        this.f1116j = d22Var;
        this.f1117k = d11Var;
        this.f1118l = j;
        this.f1119m = j2;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        d22 d22Var = this.f1116j;
        this.f1115i.f722h = d22Var.getPositionProvider().mo1788a(this.f1117k, this.f1118l, d22Var.getParentLayoutDirection(), this.f1119m);
        return a83.f116a;
    }
}
