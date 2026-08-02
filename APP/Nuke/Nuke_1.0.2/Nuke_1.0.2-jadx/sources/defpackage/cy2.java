package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cy2 implements ed {
    public final x93 a;
    public final n43 b;
    public final Object c;
    public final Object d;
    public final nd e;
    public final nd f;
    public final nd g;
    public long h;
    public nd i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cy2(hd hdVar, n43 n43Var, Object obj, Object obj2, nd ndVar) {
        this.a = hdVar.a(n43Var);
        this.b = n43Var;
        this.c = obj2;
        this.d = obj;
        this.e = (nd) n43Var.a.j(obj);
        in0 in0Var = n43Var.a;
        this.f = (nd) in0Var.j(obj2);
        this.g = ndVar != null ? t11.r(ndVar) : ((nd) in0Var.j(obj)).c();
        this.h = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ed
    public final boolean a() {
        return this.a.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ed
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        nd ndVarS = this.a.s(j, this.e, this.f, this.g);
        int iB = ndVarS.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(ndVarS.a(i))) {
                l22.b("AnimationVector cannot contain a NaN. " + ndVarS + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.j(ndVarS);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ed
    public final long c() {
        if (this.h < 0) {
            this.h = this.a.b(this.e, this.f, this.g);
        }
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
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ed
    public final nd f(long j) {
        if (!g(j)) {
            return this.a.q(j, this.e, this.f, this.g);
        }
        nd ndVar = this.i;
        if (ndVar != null) {
            return ndVar;
        }
        nd ndVarT = this.a.t(this.e, this.f, this.g);
        this.i = ndVarT;
        return ndVarT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
