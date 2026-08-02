package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zl2 extends tw2 implements mn0 {
    public int l;
    public final /* synthetic */ am2 m;
    public final /* synthetic */ float n;
    public final /* synthetic */ float o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl2(am2 am2Var, float f, float f2, t00 t00Var) {
        super(2, t00Var);
        this.m = am2Var;
        this.n = f;
        this.o = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((zl2) p((t00) obj2, (j20) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        return new zl2(this.m, this.n, this.o, t00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        if (i == 0) {
            fg1.T(obj);
            im2 im2Var = this.m.U;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.n)) << 32) | (((long) Float.floatToRawIntBits(this.o)) & 4294967295L);
            this.l = 1;
            Object objA = ul2.a(im2Var, jFloatToRawIntBits, this);
            k20 k20Var = k20.h;
            if (objA == k20Var) {
                return k20Var;
            }
        } else {
            if (i != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
        }
        return a83.a;
    }
}
