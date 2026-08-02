package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;
    public final /* synthetic */ bk1 n;
    public final /* synthetic */ z22 o;
    public final /* synthetic */ kt p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(bk1 bk1Var, z22 z22Var, kt ktVar, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.n = bk1Var;
        this.o = z22Var;
        this.p = ktVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((h2) p(t00Var, j20Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        switch (this.l) {
            case 0:
                return new h2(this.n, this.o, this.p, t00Var, 0);
            default:
                return new h2(this.n, this.o, this.p, t00Var, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L31;
     */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        kt ktVar = this.p;
        bk1 bk1Var = this.n;
        k20 k20Var = k20.h;
        z22 z22Var = this.o;
        switch (i) {
            case 0:
                int i2 = this.m;
                if (i2 == 0) {
                    fg1.T(obj);
                    long j = lt.a;
                    this.m = 1;
                    if (eu.F(j, this) != k20Var) {
                    }
                } else if (i2 == 1) {
                    fg1.T(obj);
                } else if (i2 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                    ktVar.K = z22Var;
                }
                this.m = 2;
                break;
            default:
                int i3 = this.m;
                if (i3 == 0) {
                    fg1.T(obj);
                    long j2 = lt.a;
                    this.m = 1;
                    if (eu.F(j2, this) != k20Var) {
                    }
                } else if (i3 == 1) {
                    fg1.T(obj);
                } else if (i3 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                    ktVar.G = z22Var;
                }
                this.m = 2;
                break;
        }
        return a83Var;
    }
}
