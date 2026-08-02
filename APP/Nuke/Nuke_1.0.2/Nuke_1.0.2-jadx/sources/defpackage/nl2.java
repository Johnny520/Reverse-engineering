package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nl2 implements bm2 {
    public static final dq1 j = new dq1(10, new yc2(24), new ml2(0));
    public final kx1 a;
    public float f;
    public final n70 h;
    public final n70 i;
    public final kx1 b = new kx1(0);
    public final kx1 c = new kx1(0);
    public final bk1 d = new bk1();
    public final kx1 e = new kx1(Integer.MAX_VALUE);
    public final e60 g = new e60(new v(27, this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nl2(int i) {
        this.a = new kx1(i);
        final int i2 = 0;
        this.h = op0.m(new xm0(this) { // from class: ll2
            public final /* synthetic */ nl2 i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                int i3 = i2;
                nl2 nl2Var = this.i;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(nl2Var.a.g() < nl2Var.e.g());
                    default:
                        return Boolean.valueOf(nl2Var.a.g() > 0);
                }
            }
        });
        final int i3 = 1;
        this.i = op0.m(new xm0(this) { // from class: ll2
            public final /* synthetic */ nl2 i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                int i32 = i3;
                nl2 nl2Var = this.i;
                switch (i32) {
                    case 0:
                        return Boolean.valueOf(nl2Var.a.g() < nl2Var.e.g());
                    default:
                        return Boolean.valueOf(nl2Var.a.g() > 0);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final boolean a() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final boolean b() {
        return this.g.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final boolean c() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final Object d(bl1 bl1Var, mn0 mn0Var, u00 u00Var) {
        Object objD = this.g.d(bl1Var, mn0Var, u00Var);
        return objD == k20.h ? objD : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bm2
    public final float e(float f) {
        return this.g.e(f);
    }
}
