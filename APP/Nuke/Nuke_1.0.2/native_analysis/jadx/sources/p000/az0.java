package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class az0 implements gu2 {

    /* JADX INFO: renamed from: h */
    public Float f445h;

    /* JADX INFO: renamed from: i */
    public Float f446i;

    /* JADX INFO: renamed from: j */
    public final nx1 f447j;

    /* JADX INFO: renamed from: k */
    public cy2 f448k;

    /* JADX INFO: renamed from: l */
    public boolean f449l;

    /* JADX INFO: renamed from: m */
    public boolean f450m;

    /* JADX INFO: renamed from: n */
    public long f451n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ cz0 f452o;

    public az0(cz0 cz0Var, Float f, Float f2, zy0 zy0Var) {
        this.f452o = cz0Var;
        this.f445h = f;
        this.f446i = f2;
        this.f447j = op0.m3598u(f);
        this.f448k = new cy2(zy0Var, rg3.f9572n, this.f445h, this.f446i, null);
    }

    @Override // p000.gu2
    public final Object getValue() {
        return this.f447j.getValue();
    }
}
