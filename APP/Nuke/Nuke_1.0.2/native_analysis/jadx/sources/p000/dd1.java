package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd1 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2000h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ kz2 f2001i;

    public /* synthetic */ dd1(kz2 kz2Var, int i) {
        this.f2000h = i;
        this.f2001i = kz2Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f2000h;
        a83 a83Var = a83.f116a;
        kz2 kz2Var = this.f2001i;
        switch (i) {
            case 0:
                kz2Var.mo2776a();
                break;
            default:
                kz2Var.onCancel();
                break;
        }
        return a83Var;
    }
}
