package p000;

/* JADX INFO: renamed from: g8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0231g8 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f3344i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ p80 f3345j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0231g8(p80 p80Var, int i) {
        super(1);
        this.f3344i = i;
        this.f3345j = p80Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f3344i;
        p80 p80Var = this.f3345j;
        switch (i) {
            case 0:
                p80Var.show();
                return new C0194f8(0, p80Var);
            default:
                if (p80Var.f8027m.f7042a) {
                    p80Var.f8026l.mo6a();
                }
                return a83.f116a;
        }
    }
}
