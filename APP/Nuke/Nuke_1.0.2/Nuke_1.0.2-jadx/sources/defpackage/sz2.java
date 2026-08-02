package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sz2 implements bm2 {
    public final /* synthetic */ bm2 a;
    public final n70 b;
    public final n70 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sz2(bm2 bm2Var, final tz2 tz2Var) {
        this.a = bm2Var;
        final int i = 0;
        this.b = op0.m(new xm0() { // from class: rz2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                int i2 = i;
                tz2 tz2Var2 = tz2Var;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(tz2Var2.a.g() < tz2Var2.b.g());
                    default:
                        return Boolean.valueOf(tz2Var2.a.g() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.c = op0.m(new xm0() { // from class: rz2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                int i22 = i2;
                tz2 tz2Var2 = tz2Var;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(tz2Var2.a.g() < tz2Var2.b.g());
                    default:
                        return Boolean.valueOf(tz2Var2.a.g() > 0.0f);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final boolean b() {
        return this.a.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final Object d(bl1 bl1Var, mn0 mn0Var, u00 u00Var) {
        return this.a.d(bl1Var, mn0Var, u00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final float e(float f) {
        return this.a.e(f);
    }
}
