package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e60 implements bm2 {
    public final in0 a;
    public final d60 b = new d60(this);
    public final gl1 c = new gl1();
    public final nx1 d;
    public final nx1 e;
    public final nx1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e60(in0 in0Var) {
        this.a = in0Var;
        Boolean bool = Boolean.FALSE;
        this.d = op0.u(bool);
        this.e = op0.u(bool);
        this.f = op0.u(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final Object d(bl1 bl1Var, mn0 mn0Var, u00 u00Var) {
        Object objU = te.u(new b2(this, bl1Var, mn0Var, null, 6), u00Var);
        return objU == k20.h ? objU : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final float e(float f) {
        return ((Number) this.a.j(Float.valueOf(f))).floatValue();
    }
}
