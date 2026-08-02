package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class al0 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ o72 f243i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f244j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al0(o72 o72Var, int i) {
        super(1);
        this.f243i = o72Var;
        this.f244j = i;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((pl0) obj).m3878T0(this.f244j));
        this.f243i.f7574i = boolValueOf;
        return boolValueOf;
    }
}
