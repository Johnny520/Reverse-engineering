package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class iu0 implements eq2 {

    /* JADX INFO: renamed from: b */
    public static final iu0 f4784b = new iu0(0);

    /* JADX INFO: renamed from: c */
    public static final iu0 f4785c = new iu0(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4786a;

    public /* synthetic */ iu0(int i) {
        this.f4786a = i;
    }

    @Override // p000.eq2
    /* JADX INFO: renamed from: a */
    public final AbstractC0731te mo248a(long j, d61 d61Var, e70 e70Var) {
        switch (this.f4786a) {
            case 0:
                float fMo692T = e70Var.mo692T(30.0f);
                return new tv1(new o62(0.0f, -fMo692T, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fMo692T));
            case 1:
                float fMo692T2 = e70Var.mo692T(30.0f);
                return new tv1(new o62(-fMo692T2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fMo692T2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new tv1(AbstractC0179eu.m1467q(0L, j));
        }
    }

    public String toString() {
        switch (this.f4786a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
