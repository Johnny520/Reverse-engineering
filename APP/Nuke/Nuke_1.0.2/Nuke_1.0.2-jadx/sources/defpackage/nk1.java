package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nk1 extends w92 implements mn0 {
    public ro0 j;
    public ok1 k;
    public long[] l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ ok1 p;
    public final /* synthetic */ ro0 q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk1(ok1 ok1Var, ro0 ro0Var, t00 t00Var) {
        super(2, t00Var);
        this.p = ok1Var;
        this.q = ro0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((nk1) p((t00) obj2, (vo2) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        nk1 nk1Var = new nk1(this.p, this.q, t00Var);
        nk1Var.o = obj;
        return nk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        vo2 vo2Var;
        ok1 ok1Var;
        long[] jArr;
        int i;
        ro0 ro0Var;
        int i2 = this.n;
        if (i2 == 0) {
            fg1.T(obj);
            vo2Var = (vo2) this.o;
            ok1Var = this.p;
            mk1 mk1Var = ok1Var.i;
            jArr = mk1Var.c;
            i = mk1Var.e;
            ro0Var = this.q;
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.m;
            jArr = this.l;
            ok1Var = this.k;
            ro0Var = this.j;
            vo2Var = (vo2) this.o;
            fg1.T(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return a83.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        ro0Var.i = i;
        Object obj2 = ok1Var.i.b[i];
        this.o = vo2Var;
        this.j = ro0Var;
        this.k = ok1Var;
        this.l = jArr;
        this.m = i3;
        this.n = 1;
        vo2Var.b(this, obj2);
        return k20.h;
    }
}
