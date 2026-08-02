package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ps0 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8549h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ qs0 f8550i;

    public /* synthetic */ ps0(qs0 qs0Var, int i) {
        this.f8549h = i;
        this.f8550i = qs0Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f8549h;
        a83 a83Var = a83.f116a;
        qs0 qs0Var = this.f8550i;
        switch (i) {
            case 0:
                if (qs0Var.f9146C == null) {
                    nz0.m3457b("Font resolution state is not set.");
                    C0676s.m4644b();
                }
                break;
            default:
                if (qs0Var.f9146C == null) {
                    nz0.m3457b("Font resolution state is not set.");
                    C0676s.m4644b();
                }
                break;
        }
        return null;
    }
}
