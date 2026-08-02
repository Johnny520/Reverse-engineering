package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pf0 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f8297i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ rf0 f8298j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f8299k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf0(rf0 rf0Var, long j, int i) {
        super(1);
        this.f8297i = i;
        this.f8298j = rf0Var;
        this.f8299k = j;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int iOrdinal;
        int i = this.f8297i;
        rf0 rf0Var = this.f8298j;
        switch (i) {
            case 0:
                int iOrdinal2 = ((if0) obj).ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        c80.m675s();
                        return null;
                    }
                    z33 z33Var = rf0Var.f9540z.f8350a;
                }
                return new h11(this.f8299k);
            default:
                if0 if0Var = (if0) obj;
                if (rf0Var.f9534D != null && rf0Var.m4445M0() != null && !t11.m5086l(rf0Var.f9534D, rf0Var.m4445M0()) && (iOrdinal = if0Var.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        c80.m675s();
                        return null;
                    }
                    z33 z33Var2 = rf0Var.f9540z.f8350a;
                }
                return new z01(0L);
        }
    }
}
