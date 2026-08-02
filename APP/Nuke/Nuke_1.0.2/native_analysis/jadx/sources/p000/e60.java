package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e60 implements bm2 {

    /* JADX INFO: renamed from: a */
    public final in0 f2321a;

    /* JADX INFO: renamed from: b */
    public final d60 f2322b = new d60(this);

    /* JADX INFO: renamed from: c */
    public final gl1 f2323c = new gl1();

    /* JADX INFO: renamed from: d */
    public final nx1 f2324d;

    /* JADX INFO: renamed from: e */
    public final nx1 f2325e;

    /* JADX INFO: renamed from: f */
    public final nx1 f2326f;

    public e60(in0 in0Var) {
        this.f2321a = in0Var;
        Boolean bool = Boolean.FALSE;
        this.f2324d = op0.m3598u(bool);
        this.f2325e = op0.m3598u(bool);
        this.f2326f = op0.m3598u(bool);
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: b */
    public final boolean mo568b() {
        return ((Boolean) this.f2324d.getValue()).booleanValue();
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: d */
    public final Object mo570d(bl1 bl1Var, mn0 mn0Var, u00 u00Var) {
        Object objM5238u = AbstractC0731te.m5238u(new C0040b2(this, bl1Var, mn0Var, null, 6), u00Var);
        return objM5238u == k20.f5323h ? objM5238u : a83.f116a;
    }

    @Override // p000.bm2
    /* JADX INFO: renamed from: e */
    public final float mo571e(float f) {
        return ((Number) this.f2321a.mo5j(Float.valueOf(f))).floatValue();
    }
}
