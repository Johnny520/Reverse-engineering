package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hm2 extends tw2 implements mn0 {
    public long l;
    public int m;
    public /* synthetic */ long n;
    public final /* synthetic */ im2 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm2(im2 im2Var, t00 t00Var) {
        super(2, t00Var);
        this.o = im2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        long j = ((da3) obj).a;
        hm2 hm2Var = new hm2(this.o, (t00) obj2);
        hm2Var.n = j;
        return hm2Var.r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        hm2 hm2Var = new hm2(this.o, t00Var);
        hm2Var.n = ((da3) obj).a;
        return hm2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.m;
        im2 im2Var = this.o;
        k20 k20Var = k20.h;
        if (i == 0) {
            fg1.T(obj);
            j = this.n;
            tm1 tm1Var = im2Var.f;
            this.n = j;
            this.m = 1;
            obj = tm1Var.b(j, this);
            if (obj != k20Var) {
            }
            return k20Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = this.l;
                j3 = this.n;
                fg1.T(obj);
                return new da3(da3.d(j3, da3.d(j4, ((da3) obj).a)));
            }
            j2 = this.l;
            j = this.n;
            fg1.T(obj);
            long j5 = ((da3) obj).a;
            tm1 tm1Var2 = im2Var.f;
            long jD = da3.d(j2, j5);
            this.n = j;
            this.l = j5;
            this.m = 3;
            obj = tm1Var2.a(jD, j5, this);
            if (obj != k20Var) {
                j3 = j;
                j4 = j5;
                return new da3(da3.d(j3, da3.d(j4, ((da3) obj).a)));
            }
            return k20Var;
        }
        j = this.n;
        fg1.T(obj);
        long jD2 = da3.d(j, ((da3) obj).a);
        this.n = j;
        this.l = jD2;
        this.m = 2;
        obj = im2Var.a(jD2, this);
        if (obj != k20Var) {
            j2 = jD2;
            long j52 = ((da3) obj).a;
            tm1 tm1Var22 = im2Var.f;
            long jD3 = da3.d(j2, j52);
            this.n = j;
            this.l = j52;
            this.m = 3;
            obj = tm1Var22.a(jD3, j52, this);
            if (obj != k20Var) {
            }
        }
        return k20Var;
    }
}
