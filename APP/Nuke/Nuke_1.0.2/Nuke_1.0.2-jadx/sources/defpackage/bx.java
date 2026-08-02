package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bx extends tw2 implements mn0 {
    public int l;
    public /* synthetic */ float m;
    public final /* synthetic */ cx n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(cx cxVar, t00 t00Var) {
        super(2, t00Var);
        this.n = cxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((bx) p((t00) obj2, Float.valueOf(((Number) obj).floatValue()))).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        bx bxVar = new bx(this.n, t00Var);
        bxVar.m = ((Number) obj).floatValue();
        return bxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        if (i == 0) {
            fg1.T(obj);
            float f = this.m;
            cx cxVar = this.n;
            Object objG = cxVar.a.d.h.g(kn2.e);
            mn0 mn0Var = (mn0) (objG != null ? objG : null);
            if (mn0Var == null) {
                throw vi0.e("Required value was null.");
            }
            rs1 rs1Var = new rs1((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.l = 1;
            obj = mn0Var.g(rs1Var, this);
            k20 k20Var = k20.h;
            if (obj == k20Var) {
                return k20Var;
            }
        } else {
            if (i != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((rs1) obj).a & 4294967295L)));
    }
}
