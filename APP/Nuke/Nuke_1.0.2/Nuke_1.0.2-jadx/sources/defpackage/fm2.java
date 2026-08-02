package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fm2 extends tw2 implements mn0 {
    public im2 l;
    public b72 m;
    public long n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ im2 q;
    public final /* synthetic */ b72 r;
    public final /* synthetic */ long s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm2(im2 im2Var, b72 b72Var, long j, t00 t00Var) {
        super(2, t00Var);
        this.q = im2Var;
        this.r = b72Var;
        this.s = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((fm2) p((t00) obj2, (gm2) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        fm2 fm2Var = new fm2(this.q, this.r, this.s, t00Var);
        fm2Var.p = obj;
        return fm2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws Throwable {
        im2 im2Var;
        b72 b72Var;
        im2 im2Var2;
        long j;
        int i = this.o;
        qv1 qv1Var = qv1.i;
        if (i == 0) {
            fg1.T(obj);
            gm2 gm2Var = (gm2) this.p;
            im2Var = this.q;
            em2 em2Var = new em2(im2Var, gm2Var);
            n50 n50Var = im2Var.c;
            b72Var = this.r;
            long j2 = b72Var.h;
            qv1 qv1Var2 = im2Var.d;
            long j3 = this.s;
            float fD = im2Var.d(qv1Var2 == qv1Var ? da3.b(j3) : da3.c(j3));
            this.p = im2Var;
            this.l = im2Var;
            this.m = b72Var;
            this.n = j2;
            this.o = 1;
            n50Var.getClass();
            obj = p7.R(n50Var.b, new m50(fD, n50Var, em2Var, null), this);
            k20 k20Var = k20.h;
            if (obj == k20Var) {
                return k20Var;
            }
            im2Var2 = im2Var;
            j = j2;
        } else {
            if (i != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.n;
            b72Var = this.m;
            im2Var = this.l;
            im2Var2 = (im2) this.p;
            fg1.T(obj);
        }
        float fD2 = im2Var2.d(((Number) obj).floatValue());
        b72Var.h = im2Var.d == qv1Var ? da3.a(j, fD2, 0.0f, 2) : da3.a(j, 0.0f, fD2, 1);
        return a83.a;
    }
}
