package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class iu0 implements eq2 {
    public static final iu0 b = new iu0(0);
    public static final iu0 c = new iu0(1);
    public final /* synthetic */ int a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [iu0.<clinit>():void, sp0.<clinit>():void] */
    public /* synthetic */ iu0(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.eq2
    public final te a(long j, d61 d61Var, e70 e70Var) {
        switch (this.a) {
            case 0:
                float fT = e70Var.T(30.0f);
                return new tv1(new o62(0.0f, -fT, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fT));
            case 1:
                float fT2 = e70Var.T(30.0f);
                return new tv1(new o62(-fT2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fT2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new tv1(eu.q(0L, j));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
