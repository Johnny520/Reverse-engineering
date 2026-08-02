package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q40 implements ed {
    public final kj1 a;
    public final n43 b;
    public final Object c;
    public final nd d;
    public final nd e;
    public final nd f;
    public final Object g;
    public final long h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q40(r40 r40Var, n43 n43Var, Object obj, nd ndVar) {
        kj1 kj1Var = new kj1(16, r40Var.a);
        this.a = kj1Var;
        this.b = n43Var;
        this.c = obj;
        nd ndVar2 = (nd) n43Var.a.j(obj);
        this.d = ndVar2;
        this.e = t11.r(ndVar);
        in0 in0Var = n43Var.b;
        if (((nd) kj1Var.l) == null) {
            kj1Var.l = ndVar2.c();
        }
        nd ndVar3 = (nd) kj1Var.l;
        if (ndVar3 == null) {
            t11.S("targetVector");
            throw null;
        }
        int iB = ndVar3.b();
        int i = 0;
        while (true) {
            nd ndVar4 = (nd) kj1Var.l;
            if (i >= iB) {
                if (ndVar4 == null) {
                    t11.S("targetVector");
                    throw null;
                }
                this.g = in0Var.j(ndVar4);
                kj1 kj1Var2 = this.a;
                nd ndVar5 = this.d;
                if (((nd) kj1Var2.k) == null) {
                    kj1Var2.k = ndVar5.c();
                }
                nd ndVar6 = (nd) kj1Var2.k;
                if (ndVar6 == null) {
                    t11.S("velocityVector");
                    throw null;
                }
                int iB2 = ndVar6.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    hh1 hh1Var = (hh1) kj1Var2.i;
                    ndVar5.getClass();
                    jMax = Math.max(jMax, ((long) (Math.exp(((oj0) hh1Var.i).b(ndVar.a(i2)) / (((double) pj0.a) - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.h = jMax;
                nd ndVarR = t11.r(this.a.A(jMax, this.d, ndVar));
                this.f = ndVarR;
                int iB3 = ndVarR.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    nd ndVar7 = this.f;
                    float fA = ndVar7.a(i3);
                    this.a.getClass();
                    this.a.getClass();
                    ndVar7.e(ci0.C(fA, -0.0f, 0.0f), i3);
                }
                return;
            }
            if (ndVar4 == null) {
                t11.S("targetVector");
                throw null;
            }
            hh1 hh1Var2 = (hh1) kj1Var.i;
            float fA2 = ndVar2.a(i);
            float fA3 = ndVar.a(i);
            oj0 oj0Var = (oj0) hh1Var2.i;
            double dB = oj0Var.b(fA3);
            double d = pj0.a;
            int i4 = i;
            ndVar4.e((Math.signum(fA3) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (oj0Var.a * oj0Var.b))))) + fA2, i4);
            i = i4 + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ed
    public final boolean a() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ed
    public final Object b(long j) {
        if (g(j)) {
            return this.g;
        }
        in0 in0Var = this.b.b;
        kj1 kj1Var = this.a;
        nd ndVar = (nd) kj1Var.j;
        nd ndVar2 = this.d;
        if (ndVar == null) {
            kj1Var.j = ndVar2.c();
        }
        nd ndVar3 = (nd) kj1Var.j;
        if (ndVar3 == null) {
            t11.S("valueVector");
            throw null;
        }
        int iB = ndVar3.b();
        int i = 0;
        while (true) {
            nd ndVar4 = (nd) kj1Var.j;
            if (i >= iB) {
                if (ndVar4 != null) {
                    return in0Var.j(ndVar4);
                }
                t11.S("valueVector");
                throw null;
            }
            if (ndVar4 == null) {
                t11.S("valueVector");
                throw null;
            }
            hh1 hh1Var = (hh1) kj1Var.i;
            float fA = ndVar2.a(i);
            long j2 = j / 1000000;
            nj0 nj0VarA = ((oj0) hh1Var.i).a(this.e.a(i));
            long j3 = nj0VarA.c;
            ndVar4.e((Math.signum(nj0VarA.a) * nj0VarA.b * x8.a(j3 > 0 ? j2 / j3 : 1.0f).a) + fA, i);
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ed
    public final long c() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ed
    public final n43 d() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ed
    public final Object e() {
        return this.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ed
    public final nd f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.a.A(j, this.d, this.e);
    }
}
