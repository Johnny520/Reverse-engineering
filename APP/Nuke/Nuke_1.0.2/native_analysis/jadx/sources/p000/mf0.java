package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mf0 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f6599i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xm0 f6600j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf0(boolean z, xm0 xm0Var) {
        super(1);
        this.f6599i = z;
        this.f6600j = xm0Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        ((ca2) obj).m722g(!this.f6599i && ((Boolean) this.f6600j.mo6a()).booleanValue());
        return a83.f116a;
    }
}
