package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class py extends jn {
    public final hn r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public py(int i, hn hnVar) {
        super(i);
        this.r = hnVar;
        if (hnVar == hn.h) {
            c80.n("This implementation does not support suspension for senders, use ", d72.a(jn.class).c(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        s.c(hk1.g(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(Object obj, boolean z) {
        hn hnVar = this.r;
        hn hnVar2 = hn.j;
        a83 a83Var = a83.a;
        if (hnVar == hnVar2) {
            Object objS = super.s(obj);
            return (!(objS instanceof oq) || (objS instanceof nq)) ? objS : a83Var;
        }
        aa3 aa3Var = ln.d;
        pq pqVar = (pq) jn.m.get(this);
        while (true) {
            long andIncrement = jn.i.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zR = r(andIncrement, false);
            int i = ln.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (pqVar.c != j3) {
                pq pqVarB = jn.b(this, j3, pqVar);
                if (pqVarB != null) {
                    pqVar = pqVarB;
                } else if (zR) {
                    return new nq(o());
                }
            }
            int iE = jn.e(this, pqVar, i2, obj, j, aa3Var, zR);
            if (iE == 0) {
                pqVar.b();
                return a83Var;
            }
            if (iE == 1) {
                break;
            }
            if (iE != 2) {
                if (iE == 3) {
                    s.l("unexpected");
                    return null;
                }
                if (iE == 4) {
                    if (j < jn.j.get(this)) {
                        pqVar.b();
                    }
                    return new nq(o());
                }
                if (iE == 5) {
                    pqVar.b();
                }
            } else {
                if (zR) {
                    pqVar.i();
                    return new nq(o());
                }
                gc3 gc3Var = aa3Var instanceof gc3 ? (gc3) aa3Var : null;
                if (gc3Var != null) {
                    gc3Var.a(pqVar, i2 + i);
                }
                i((pqVar.c * j2) + ((long) i2));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jn, defpackage.ho2
    public final Object a(t00 t00Var, Object obj) throws Throwable {
        if (F(obj, true) instanceof nq) {
            throw o();
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jn, defpackage.ho2
    public final Object s(Object obj) {
        return F(obj, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jn
    public final boolean u() {
        return this.r == hn.i;
    }
}
