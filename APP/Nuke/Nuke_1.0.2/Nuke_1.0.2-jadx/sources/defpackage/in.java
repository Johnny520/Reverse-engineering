package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class in implements gc3 {
    public Object h = ln.p;
    public mp i;
    public final /* synthetic */ jn j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public in(jn jnVar) {
        this.j = jnVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gc3
    public final void a(lm2 lm2Var, int i) {
        mp mpVar = this.i;
        if (mpVar != null) {
            mpVar.a(lm2Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(u00 u00Var) throws Throwable {
        pq pqVarK;
        Object obj = this.h;
        boolean z = true;
        if (obj == ln.p || obj == ln.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jn.n;
            jn jnVar = this.j;
            pq pqVar = (pq) atomicReferenceFieldUpdater.get(jnVar);
            while (true) {
                jnVar.getClass();
                if (jnVar.r(jn.i.get(jnVar), true)) {
                    this.h = ln.l;
                    Throwable thL = jnVar.l();
                    if (thL != null) {
                        int i = yt2.a;
                        throw thL;
                    }
                    z = false;
                } else {
                    long andIncrement = jn.j.getAndIncrement(jnVar);
                    long j = ln.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (pqVar.c != j2) {
                        pqVarK = jnVar.k(j2, pqVar);
                        if (pqVarK == null) {
                            continue;
                        }
                    } else {
                        pqVarK = pqVar;
                    }
                    Object objC = jnVar.C(pqVarK, i2, andIncrement, null);
                    hh1 hh1Var = ln.m;
                    if (objC == hh1Var) {
                        s.l("unreachable");
                        return null;
                    }
                    hh1 hh1Var2 = ln.o;
                    if (objC == hh1Var2) {
                        if (andIncrement < jnVar.p()) {
                            pqVarK.b();
                        }
                        pqVar = pqVarK;
                    } else {
                        if (objC == ln.n) {
                            jn jnVar2 = this.j;
                            mp mpVarB = qp0.B(gf1.z(u00Var));
                            try {
                                this.i = mpVarB;
                                Object objC2 = jnVar2.C(pqVarK, i2, andIncrement, this);
                                if (objC2 == hh1Var) {
                                    a(pqVarK, i2);
                                } else {
                                    if (objC2 == hh1Var2) {
                                        if (andIncrement < jnVar2.p()) {
                                            pqVarK.b();
                                        }
                                        pq pqVar2 = (pq) jn.n.get(jnVar2);
                                        while (true) {
                                            if (jnVar2.r(jn.i.get(jnVar2), true)) {
                                                mp mpVar = this.i;
                                                mpVar.getClass();
                                                this.i = null;
                                                this.h = ln.l;
                                                Throwable thL2 = jnVar.l();
                                                if (thL2 == null) {
                                                    mpVar.h(Boolean.FALSE);
                                                } else {
                                                    mpVar.h(new x92(thL2));
                                                }
                                            } else {
                                                long andIncrement2 = jn.j.getAndIncrement(jnVar2);
                                                long j3 = ln.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (pqVar2.c != j4) {
                                                    pq pqVarK2 = jnVar2.k(j4, pqVar2);
                                                    if (pqVarK2 != null) {
                                                        pqVar2 = pqVarK2;
                                                    }
                                                }
                                                Object objC3 = jnVar2.C(pqVar2, i3, andIncrement2, this);
                                                if (objC3 == ln.m) {
                                                    a(pqVar2, i3);
                                                    break;
                                                }
                                                if (objC3 == ln.o) {
                                                    if (andIncrement2 < jnVar2.p()) {
                                                        pqVar2.b();
                                                    }
                                                } else {
                                                    if (objC3 == ln.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    pqVar2.b();
                                                    this.h = objC3;
                                                    this.i = null;
                                                }
                                            }
                                        }
                                    } else {
                                        pqVarK.b();
                                        this.h = objC2;
                                        this.i = null;
                                    }
                                    mpVarB.i(Boolean.TRUE, null);
                                }
                                return mpVarB.t();
                            } catch (Throwable th) {
                                mpVarB.D();
                                throw th;
                            }
                        }
                        pqVarK.b();
                        this.h = objC;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c() throws Throwable {
        Object obj = this.h;
        hh1 hh1Var = ln.p;
        if (obj == hh1Var) {
            s.l("`hasNext()` has not been invoked");
            return null;
        }
        this.h = hh1Var;
        if (obj != ln.l) {
            return obj;
        }
        Throwable thN = this.j.n();
        int i = yt2.a;
        throw thN;
    }
}
