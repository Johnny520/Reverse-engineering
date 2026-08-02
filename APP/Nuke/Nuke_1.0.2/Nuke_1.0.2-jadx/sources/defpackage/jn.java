package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class jn implements fq {
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(jn.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(jn.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(jn.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(jn.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(jn.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(jn.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(jn.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(jn.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(jn.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int h;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jn(int i2) {
        this.h = i2;
        if (i2 < 0) {
            s.c(hk1.g(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        pq pqVar = ln.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = k.get(this);
        pq pqVar2 = new pq(0L, null, this, 3);
        this.sendSegment$volatile = pqVar2;
        this.receiveSegment$volatile = pqVar2;
        if (v()) {
            pqVar2 = ln.a;
            pqVar2.getClass();
        }
        this.bufferEndSegment$volatile = pqVar2;
        this._closeCause$volatile = ln.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean B(Object obj) {
        if (!(obj instanceof lp)) {
            c80.u("Unexpected waiter: ", obj);
            return false;
        }
        lp lpVar = (lp) obj;
        pq pqVar = ln.a;
        hh1 hh1VarL = lpVar.l(a83.a, null);
        if (hh1VarL == null) {
            return false;
        }
        lpVar.C(hh1VarL);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final pq b(jn jnVar, long j2, pq pqVar) {
        Object objR;
        jn jnVar2;
        pq pqVar2 = ln.a;
        kn knVar = kn.o;
        loop0: while (true) {
            objR = xe1.r(pqVar, j2, knVar);
            if (!te.R(objR)) {
                lm2 lm2VarJ = te.J(objR);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
                    lm2 lm2Var = (lm2) atomicReferenceFieldUpdater.get(jnVar);
                    if (lm2Var.c >= lm2VarJ.c) {
                        break loop0;
                    }
                    if (!lm2VarJ.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(jnVar, lm2Var, lm2VarJ)) {
                        if (atomicReferenceFieldUpdater.get(jnVar) != lm2Var) {
                            if (lm2VarJ.f()) {
                                lm2VarJ.e();
                            }
                        }
                    }
                    if (lm2Var.f()) {
                        lm2Var.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zR = te.R(objR);
        AtomicLongFieldUpdater atomicLongFieldUpdater = j;
        if (zR) {
            jnVar.t();
            if (pqVar.c * ((long) ln.b) < atomicLongFieldUpdater.get(jnVar)) {
                pqVar.b();
                return null;
            }
        } else {
            pq pqVar3 = (pq) te.J(objR);
            long j3 = pqVar3.c;
            if (j3 <= j2) {
                return pqVar3;
            }
            long j4 = ((long) ln.b) * j3;
            while (true) {
                long j5 = i.get(jnVar);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    jnVar2 = jnVar;
                    break;
                }
                jnVar2 = jnVar;
                if (i.compareAndSet(jnVar2, j5, (((long) ((int) (j5 >> 60))) << 60) + j6)) {
                    break;
                }
                jnVar = jnVar2;
            }
            if (j3 * ((long) ln.b) < atomicLongFieldUpdater.get(jnVar2)) {
                pqVar3.b();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(jn jnVar, Object obj, mp mpVar) {
        mpVar.h(new x92(jnVar.o()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int e(jn jnVar, pq pqVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        pqVar.n(i2, obj);
        if (z) {
            return jnVar.D(pqVar, i2, obj, j2, obj2, z);
        }
        Object objL = pqVar.l(i2);
        if (objL == null) {
            if (jnVar.f(j2)) {
                if (pqVar.k(i2, null, ln.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pqVar.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof gc3) {
            pqVar.n(i2, null);
            if (jnVar.A(objL, obj)) {
                pqVar.o(i2, ln.i);
                return 0;
            }
            hh1 hh1Var = ln.k;
            if (pqVar.f.getAndSet((i2 * 2) + 1, hh1Var) == hh1Var) {
                return 5;
            }
            pqVar.m(i2, true);
            return 5;
        }
        return jnVar.D(pqVar, i2, obj, j2, obj2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void q(jn jnVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        if ((atomicLongFieldUpdater.addAndGet(jnVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(jnVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean A(Object obj, Object obj2) throws j90 {
        if (!(obj instanceof in)) {
            if (!(obj instanceof lp)) {
                c80.u("Unexpected receiver type: ", obj);
                return false;
            }
            lp lpVar = (lp) obj;
            pq pqVar = ln.a;
            hh1 hh1VarL = lpVar.l(obj2, null);
            if (hh1VarL == null) {
                return false;
            }
            lpVar.C(hh1VarL);
            return true;
        }
        in inVar = (in) obj;
        mp mpVar = inVar.i;
        mpVar.getClass();
        inVar.i = null;
        inVar.h = obj2;
        Boolean bool = Boolean.TRUE;
        inVar.j.getClass();
        pq pqVar2 = ln.a;
        hh1 hh1VarL2 = mpVar.l(bool, null);
        if (hh1VarL2 == null) {
            return false;
        }
        mpVar.C(hh1VarL2);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object C(pq pqVar, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = pqVar.f;
        Object objL = pqVar.l(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if (objL == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return ln.n;
                }
                if (pqVar.k(i2, objL, obj)) {
                    j();
                    return ln.m;
                }
            }
        } else if (objL == ln.d && pqVar.k(i2, objL, ln.i)) {
            j();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            pqVar.n(i2, null);
            return obj2;
        }
        while (true) {
            Object objL2 = pqVar.l(i2);
            if (objL2 == null || objL2 == ln.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (pqVar.k(i2, objL2, ln.h)) {
                        j();
                        return ln.o;
                    }
                } else {
                    if (obj == null) {
                        return ln.n;
                    }
                    if (pqVar.k(i2, objL2, obj)) {
                        j();
                        return ln.m;
                    }
                }
            } else if (objL2 != ln.d) {
                hh1 hh1Var = ln.j;
                if (objL2 == hh1Var) {
                    return ln.o;
                }
                if (objL2 == ln.h) {
                    return ln.o;
                }
                if (objL2 == ln.l) {
                    j();
                    return ln.o;
                }
                if (objL2 != ln.g && pqVar.k(i2, objL2, ln.f)) {
                    boolean z = objL2 instanceof hc3;
                    if (z) {
                        objL2 = ((hc3) objL2).a;
                    }
                    if (B(objL2)) {
                        pqVar.o(i2, ln.i);
                        j();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        pqVar.n(i2, null);
                        return obj3;
                    }
                    pqVar.o(i2, hh1Var);
                    pqVar.i();
                    if (z) {
                        j();
                    }
                    return ln.o;
                }
            } else if (pqVar.k(i2, objL2, ln.i)) {
                j();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                pqVar.n(i2, null);
                return obj4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int D(pq pqVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objL = pqVar.l(i2);
            if (objL == null) {
                if (!f(j2) || z) {
                    if (z) {
                        if (pqVar.k(i2, null, ln.j)) {
                            pqVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (pqVar.k(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (pqVar.k(i2, null, ln.d)) {
                    break;
                }
            } else {
                if (objL != ln.e) {
                    hh1 hh1Var = ln.k;
                    if (objL == hh1Var) {
                        pqVar.n(i2, null);
                        return 5;
                    }
                    if (objL == ln.h) {
                        pqVar.n(i2, null);
                        return 5;
                    }
                    if (objL == ln.l) {
                        pqVar.n(i2, null);
                        t();
                        return 4;
                    }
                    pqVar.n(i2, null);
                    if (objL instanceof hc3) {
                        objL = ((hc3) objL).a;
                    }
                    if (A(objL, obj)) {
                        pqVar.o(i2, ln.i);
                        return 0;
                    }
                    if (pqVar.f.getAndSet((i2 * 2) + 1, hh1Var) != hh1Var) {
                        pqVar.m(i2, true);
                    }
                    return 5;
                }
                if (pqVar.k(i2, objL, ln.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        jn jnVar = this;
        if (jnVar.v()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = k;
            if (atomicLongFieldUpdater.get(jnVar) > j2) {
                break;
            } else {
                jnVar = this;
            }
        }
        int i2 = ln.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = l;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(jnVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(jnVar)) && j3 == atomicLongFieldUpdater.get(jnVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(jnVar);
                    if (atomicLongFieldUpdater2.compareAndSet(jnVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        jnVar = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(jnVar);
                    long j6 = atomicLongFieldUpdater2.get(jnVar);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(jnVar)) {
                        break;
                    }
                    if (z) {
                        jnVar = this;
                    } else {
                        jnVar = this;
                        atomicLongFieldUpdater2.compareAndSet(jnVar, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(jnVar);
                    if (atomicLongFieldUpdater2.compareAndSet(jnVar, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        jnVar = this;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144 A[RETURN] */
    @Override // defpackage.ho2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(t00 t00Var, Object obj) {
        a83 a83Var;
        Object objT;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        pq pqVar = (pq) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zR = r(andIncrement, false);
            int i2 = ln.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = pqVar.c;
            k20 k20Var = k20.h;
            a83Var = a83.a;
            if (j5 != j4) {
                pq pqVarB = b(this, j4, pqVar);
                if (pqVarB != null) {
                    pqVar = pqVarB;
                } else if (zR) {
                    Object objY = y(t00Var, obj);
                    if (objY == k20Var) {
                        return objY;
                    }
                }
            }
            int iE = e(this, pqVar, i3, obj, j2, null, zR);
            if (iE == 0) {
                pqVar.b();
                return a83Var;
            }
            if (iE == 1) {
                break;
            }
            if (iE != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = j;
                if (iE == 3) {
                    mp mpVarB = qp0.B(gf1.z(t00Var));
                    try {
                        int iE2 = e(this, pqVar, i3, obj, j2, mpVarB, false);
                        if (iE2 == 0) {
                            pqVar.b();
                        } else if (iE2 != 1) {
                            if (iE2 != 2) {
                                if (iE2 != 4) {
                                    String str = "unexpected";
                                    if (iE2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    pqVar.b();
                                    pq pqVar2 = (pq) atomicReferenceFieldUpdater.get(this);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j6 = andIncrement2 & 1152921504606846975L;
                                        boolean zR2 = r(andIncrement2, false);
                                        int i4 = ln.b;
                                        long j7 = i4;
                                        String str2 = str;
                                        long j8 = j6 / j7;
                                        int i5 = (int) (j6 % j7);
                                        if (pqVar2.c != j8) {
                                            pq pqVarB2 = b(this, j8, pqVar2);
                                            if (pqVarB2 != null) {
                                                pqVar2 = pqVarB2;
                                            } else {
                                                if (zR2) {
                                                    break;
                                                }
                                                str = str2;
                                            }
                                        }
                                        int iE3 = e(this, pqVar2, i5, obj, j6, mpVarB, zR2);
                                        if (iE3 == 0) {
                                            pqVar2.b();
                                            break;
                                        }
                                        if (iE3 == 1) {
                                            break;
                                        }
                                        if (iE3 != 2) {
                                            if (iE3 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (iE3 != 4) {
                                                if (iE3 == 5) {
                                                    pqVar2.b();
                                                }
                                                str = str2;
                                            } else if (j6 < atomicLongFieldUpdater2.get(this)) {
                                                pqVar2.b();
                                            }
                                        } else if (zR2) {
                                            pqVar2.i();
                                        } else {
                                            mpVarB.a(pqVar2, i5 + i4);
                                        }
                                    }
                                } else if (j2 < atomicLongFieldUpdater2.get(this)) {
                                    pqVar.b();
                                }
                                d(this, obj, mpVarB);
                            } else {
                                mpVarB.a(pqVar, i3 + i2);
                            }
                            objT = mpVarB.t();
                            if (objT != k20Var) {
                                objT = a83Var;
                            }
                            if (objT != k20Var) {
                                return objT;
                            }
                        }
                        mpVarB.h(a83Var);
                        objT = mpVarB.t();
                        if (objT != k20Var) {
                        }
                        if (objT != k20Var) {
                            break;
                        }
                    } catch (Throwable th) {
                        mpVarB.D();
                        throw th;
                    }
                } else if (iE == 4) {
                    if (j2 < atomicLongFieldUpdater2.get(this)) {
                        pqVar.b();
                    }
                    Object objY2 = y(t00Var, obj);
                    if (objY2 == k20Var) {
                        return objY2;
                    }
                } else if (iE == 5) {
                    pqVar.b();
                }
            } else if (zR) {
                pqVar.i();
                Object objY3 = y(t00Var, obj);
                if (objY3 == k20Var) {
                    return objY3;
                }
            }
        }
        return a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fq
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f(long j2) {
        return j2 < k.get(this) || j2 < j.get(this) + ((long) this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g(Throwable th, boolean z) {
        jn jnVar;
        boolean z2;
        long j2;
        long j3;
        Object obj;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if (z) {
            while (true) {
                long j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) != 0) {
                    break;
                }
                pq pqVar = ln.a;
                jnVar = this;
                if (atomicLongFieldUpdater.compareAndSet(jnVar, j5, (j5 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = jnVar;
            }
        } else {
            jnVar = this;
        }
        hh1 hh1Var = ln.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p;
            if (atomicReferenceFieldUpdater.compareAndSet(jnVar, hh1Var, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(jnVar) != hh1Var) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(jnVar);
            } while (!atomicLongFieldUpdater.compareAndSet(jnVar, j4, 3458764513820540928L + (j4 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(jnVar);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = (j2 & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (j2 & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(jnVar, j2, j3));
        }
        jnVar.t();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = q;
                obj = atomicReferenceFieldUpdater2.get(jnVar);
                hh1 hh1Var2 = obj == null ? ln.q : ln.r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(jnVar, obj, hh1Var2)) {
                    if (atomicReferenceFieldUpdater2.get(jnVar) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                xe1.f(1, obj);
                ((in0) obj).j(jnVar.l());
                return z2;
            }
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (defpackage.pq) ((defpackage.oy) defpackage.oy.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pq h(long j2) {
        Object objJ0;
        long j3;
        Object obj = o.get(this);
        pq pqVar = (pq) m.get(this);
        if (pqVar.c > ((pq) obj).c) {
            obj = pqVar;
        }
        pq pqVar2 = (pq) n.get(this);
        if (pqVar2.c > ((pq) obj).c) {
            obj = pqVar2;
        }
        oy oyVar = (oy) obj;
        loop0: while (true) {
            oyVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = oy.a;
            Object obj2 = atomicReferenceFieldUpdater.get(oyVar);
            hh1 hh1Var = xe1.e;
            objJ0 = null;
            if (obj2 == hh1Var) {
                break;
            }
            oy oyVar2 = (oy) obj2;
            if (oyVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(oyVar, null, hh1Var)) {
                    if (atomicReferenceFieldUpdater.get(oyVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            oyVar = oyVar2;
        }
        pq pqVar3 = (pq) oyVar;
        if (u()) {
            pq pqVar4 = pqVar3;
            loop2: do {
                int i2 = ln.b - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    j3 = (pqVar4.c * ((long) ln.b)) + ((long) i2);
                    if (j3 < j.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object objL = pqVar4.l(i2);
                        if (objL != null && objL != ln.e) {
                            if (objL == ln.d) {
                                break loop2;
                            }
                        } else {
                            if (pqVar4.k(i2, objL, ln.l)) {
                                pqVar4.i();
                                break;
                            }
                        }
                    }
                    i2--;
                }
            } while (pqVar4 != null);
            j3 = -1;
            if (j3 != -1) {
                i(j3);
            }
        }
        loop5: for (pq pqVar5 = pqVar3; pqVar5 != null; pqVar5 = (pq) ((oy) oy.b.get(pqVar5))) {
            for (int i3 = ln.b - 1; -1 < i3; i3--) {
                if ((pqVar5.c * ((long) ln.b)) + ((long) i3) < j2) {
                    break loop5;
                }
                while (true) {
                    Object objL2 = pqVar5.l(i3);
                    if (objL2 != null && objL2 != ln.e) {
                        if (!(objL2 instanceof hc3)) {
                            if (!(objL2 instanceof gc3)) {
                                break;
                            }
                            if (pqVar5.k(i3, objL2, ln.l)) {
                                objJ0 = rp0.j0(objJ0, objL2);
                                pqVar5.m(i3, true);
                                break;
                            }
                        } else {
                            if (pqVar5.k(i3, objL2, ln.l)) {
                                objJ0 = rp0.j0(objJ0, ((hc3) objL2).a);
                                pqVar5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (pqVar5.k(i3, objL2, ln.l)) {
                            pqVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objJ0 != null) {
            if (!(objJ0 instanceof ArrayList)) {
                z((gc3) objJ0, true);
                return pqVar3;
            }
            ArrayList arrayList = (ArrayList) objJ0;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                z((gc3) arrayList.get(size), true);
            }
        }
        return pqVar3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(long j2) {
        pq pqVar = (pq) n.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = j;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.h) + j3, k.get(this))) {
                return;
            }
            jn jnVar = this;
            if (atomicLongFieldUpdater.compareAndSet(jnVar, j3, 1 + j3)) {
                long j4 = ln.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (pqVar.c != j5) {
                    pq pqVarK = jnVar.k(j5, pqVar);
                    if (pqVarK != null) {
                        pqVar = pqVarK;
                    }
                }
                pq pqVar2 = pqVar;
                if (jnVar.C(pqVar2, i2, j3, null) != ln.o || j3 < jnVar.p()) {
                    pqVar2.b();
                }
                this = jnVar;
                pqVar = pqVar2;
            }
            this = jnVar;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fq
    public final in iterator() {
        return new in(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017b, code lost:
    
        q(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x017e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        Object objR;
        if (v()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
        pq pqVar = (pq) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = k.getAndIncrement(this);
            long j2 = andIncrement / ((long) ln.b);
            if (p() <= andIncrement) {
                if (pqVar.c < j2 && pqVar.c() != null) {
                    x(j2, pqVar);
                }
                q(this);
                return;
            }
            if (pqVar.c != j2) {
                kn knVar = kn.o;
                while (true) {
                    objR = xe1.r(pqVar, j2, knVar);
                    if (!te.R(objR)) {
                        lm2 lm2VarJ = te.J(objR);
                        while (true) {
                            lm2 lm2Var = (lm2) atomicReferenceFieldUpdater.get(this);
                            if (lm2Var.c >= lm2VarJ.c) {
                                break;
                            }
                            if (!lm2VarJ.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, lm2Var, lm2VarJ)) {
                                if (atomicReferenceFieldUpdater.get(this) != lm2Var) {
                                    if (lm2VarJ.f()) {
                                        lm2VarJ.e();
                                    }
                                }
                            }
                            if (lm2Var.f()) {
                                lm2Var.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                pq pqVar2 = null;
                if (te.R(objR)) {
                    t();
                    x(j2, pqVar);
                    q(this);
                } else {
                    pq pqVar3 = (pq) te.J(objR);
                    long j3 = pqVar3.c;
                    if (j3 > j2) {
                        long j4 = j3 * ((long) ln.b);
                        if (k.compareAndSet(this, 1 + andIncrement, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = l;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        pqVar2 = pqVar3;
                    }
                }
                if (pqVar2 == null) {
                    continue;
                } else {
                    pqVar = pqVar2;
                }
            }
            int i2 = (int) (andIncrement % ((long) ln.b));
            Object objL = pqVar.l(i2);
            boolean z = objL instanceof gc3;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = j;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !pqVar.k(i2, objL, ln.g)) {
                while (true) {
                    Object objL2 = pqVar.l(i2);
                    if (!(objL2 instanceof gc3)) {
                        if (objL2 != ln.j) {
                            if (objL2 != null) {
                                if (objL2 == ln.d || objL2 == ln.h || objL2 == ln.i || objL2 == ln.k || objL2 == ln.l) {
                                    break loop0;
                                } else if (objL2 != ln.f) {
                                    c80.u("Unexpected cell state: ", objL2);
                                    return;
                                }
                            } else if (pqVar.k(i2, objL2, ln.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (pqVar.k(i2, objL2, new hc3((gc3) objL2))) {
                            break loop0;
                        }
                    } else if (pqVar.k(i2, objL2, ln.g)) {
                        if (B(objL2)) {
                            pqVar.o(i2, ln.d);
                            break;
                        } else {
                            pqVar.o(i2, ln.j);
                            pqVar.i();
                        }
                    }
                }
            } else if (B(objL)) {
                pqVar.o(i2, ln.d);
                break;
            } else {
                pqVar.o(i2, ln.j);
                pqVar.i();
                q(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final pq k(long j2, pq pqVar) {
        Object objR;
        jn jnVar;
        pq pqVar2 = ln.a;
        kn knVar = kn.o;
        loop0: while (true) {
            objR = xe1.r(pqVar, j2, knVar);
            if (!te.R(objR)) {
                lm2 lm2VarJ = te.J(objR);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                    lm2 lm2Var = (lm2) atomicReferenceFieldUpdater.get(this);
                    if (lm2Var.c >= lm2VarJ.c) {
                        break loop0;
                    }
                    if (!lm2VarJ.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, lm2Var, lm2VarJ)) {
                        if (atomicReferenceFieldUpdater.get(this) != lm2Var) {
                            if (lm2VarJ.f()) {
                                lm2VarJ.e();
                            }
                        }
                    }
                    if (lm2Var.f()) {
                        lm2Var.e();
                    }
                }
            } else {
                break;
            }
        }
        if (te.R(objR)) {
            t();
            if (pqVar.c * ((long) ln.b) < p()) {
                pqVar.b();
                return null;
            }
        } else {
            pq pqVar3 = (pq) te.J(objR);
            long j3 = pqVar3.c;
            if (!v() && j2 <= k.get(this) / ((long) ln.b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = o;
                    lm2 lm2Var2 = (lm2) atomicReferenceFieldUpdater2.get(this);
                    if (lm2Var2.c >= j3 || !pqVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, lm2Var2, pqVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != lm2Var2) {
                            if (pqVar3.f()) {
                                pqVar3.e();
                            }
                        }
                    }
                    if (lm2Var2.f()) {
                        lm2Var2.e();
                    }
                }
            }
            if (j3 <= j2) {
                return pqVar3;
            }
            long j4 = j3 * ((long) ln.b);
            while (true) {
                long j5 = j.get(this);
                if (j5 >= j4) {
                    jnVar = this;
                    break;
                }
                jnVar = this;
                if (j.compareAndSet(jnVar, j5, j4)) {
                    break;
                }
                this = jnVar;
            }
            if (j3 * ((long) ln.b) < jnVar.p()) {
                pqVar3.b();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Throwable l() {
        return (Throwable) p.get(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fq
    public final Object m() {
        pq pqVar;
        oq oqVar = se.a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = j;
        long j2 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = i;
        long j3 = atomicLongFieldUpdater2.get(this);
        if (r(j3, true)) {
            return new nq(l());
        }
        if (j2 >= (j3 & 1152921504606846975L)) {
            return oqVar;
        }
        Object obj = ln.k;
        pq pqVar2 = (pq) n.get(this);
        while (!this.r(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = ln.b;
            long j5 = andIncrement / j4;
            int i2 = (int) (andIncrement % j4);
            if (pqVar2.c != j5) {
                pq pqVarK = this.k(j5, pqVar2);
                if (pqVarK == null) {
                    continue;
                } else {
                    pqVar = pqVarK;
                }
            } else {
                pqVar = pqVar2;
            }
            jn jnVar = this;
            Object objC = jnVar.C(pqVar, i2, andIncrement, obj);
            pqVar2 = pqVar;
            if (objC == ln.m) {
                gc3 gc3Var = obj instanceof gc3 ? (gc3) obj : null;
                if (gc3Var != null) {
                    gc3Var.a(pqVar2, i2);
                }
                jnVar.E(andIncrement);
                pqVar2.i();
                return oqVar;
            }
            if (objC != ln.o) {
                if (objC != ln.n) {
                    pqVar2.b();
                    return objC;
                }
                s.l("unexpected");
                return null;
            }
            if (andIncrement < jnVar.p()) {
                pqVar2.b();
            }
            this = jnVar;
        }
        return new nq(this.l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Throwable n() {
        Throwable thL = l();
        return thL == null ? new ut("Channel was closed") : thL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Throwable o() {
        Throwable thL = l();
        return thL == null ? new vt("Channel was closed") : thL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long p() {
        return i.get(this) & 1152921504606846975L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (defpackage.pq) ((defpackage.oy) defpackage.oy.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = j;
            if (i2 == 2) {
                h(1152921504606846975L & j2);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                        pq pqVarK = (pq) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (p() <= j3) {
                            break;
                        }
                        long j4 = ln.b;
                        long j5 = j3 / j4;
                        if (pqVarK.c != j5 && (pqVarK = k(j5, pqVarK)) == null) {
                            if (((pq) atomicReferenceFieldUpdater.get(this)).c < j5) {
                                break;
                            }
                        } else {
                            pqVarK.b();
                            int i3 = (int) (j3 % j4);
                            while (true) {
                                Object objL = pqVarK.l(i3);
                                if (objL != null && objL != ln.e) {
                                    if (objL == ln.d || (objL != ln.j && objL != ln.l && objL != ln.i && objL != ln.h && (objL == ln.g || (objL != ln.f && j3 == atomicLongFieldUpdater.get(this))))) {
                                        break;
                                    }
                                } else {
                                    if (pqVarK.k(i3, objL, ln.h)) {
                                        j();
                                        break;
                                    }
                                }
                            }
                            j.compareAndSet(this, j3, j3 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    c80.h(vi0.g("unexpected close status: ", i2));
                    return false;
                }
                pq pqVarH = h(1152921504606846975L & j2);
                Object objJ0 = null;
                loop0: do {
                    int i4 = ln.b - 1;
                    while (true) {
                        if (-1 >= i4) {
                            break;
                        }
                        long j6 = (pqVarH.c * ((long) ln.b)) + ((long) i4);
                        while (true) {
                            Object objL2 = pqVarH.l(i4);
                            if (objL2 == ln.i) {
                                break loop0;
                            }
                            if (objL2 != ln.d) {
                                if (objL2 != ln.e && objL2 != null) {
                                    if (!(objL2 instanceof gc3) && !(objL2 instanceof hc3)) {
                                        hh1 hh1Var = ln.g;
                                        if (objL2 == hh1Var || objL2 == ln.f) {
                                            break loop0;
                                        }
                                        if (objL2 != hh1Var) {
                                            break;
                                        }
                                    } else {
                                        if (j6 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        gc3 gc3Var = objL2 instanceof hc3 ? ((hc3) objL2).a : (gc3) objL2;
                                        if (pqVarH.k(i4, objL2, ln.l)) {
                                            objJ0 = rp0.j0(objJ0, gc3Var);
                                            pqVarH.n(i4, null);
                                            pqVarH.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (pqVarH.k(i4, objL2, ln.l)) {
                                        pqVarH.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j6 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (pqVarH.k(i4, objL2, ln.l)) {
                                    pqVarH.n(i4, null);
                                    pqVarH.i();
                                    break;
                                }
                            }
                        }
                        i4--;
                    }
                } while (pqVarH != null);
                if (objJ0 != null) {
                    if (objJ0 instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objJ0;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            z((gc3) arrayList.get(size), false);
                        }
                    } else {
                        z((gc3) objJ0, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc A[SYNTHETIC] */
    @Override // defpackage.ho2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(Object obj) {
        int iE;
        oq oqVar = se.a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        boolean z = false;
        long j2 = 1152921504606846975L;
        if (r(atomicLongFieldUpdater.get(this), false) ? false : !f(r1 & 1152921504606846975L)) {
            return oqVar;
        }
        aa3 aa3Var = ln.j;
        pq pqVar = (pq) m.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zR = r(andIncrement, z);
            int i2 = ln.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (pqVar.c == j5) {
                iE = e(this, pqVar, i3, obj, j3, aa3Var, zR);
                a83 a83Var = a83.a;
                if (iE != 0) {
                    pqVar.b();
                    return a83Var;
                }
                if (iE == 1) {
                    return a83Var;
                }
                if (iE == 2) {
                    if (zR) {
                        pqVar.i();
                        return new nq(o());
                    }
                    gc3 gc3Var = aa3Var instanceof gc3 ? (gc3) aa3Var : null;
                    if (gc3Var != null) {
                        gc3Var.a(pqVar, i3 + i2);
                    }
                    pqVar.i();
                    return oqVar;
                }
                if (iE == 3) {
                    s.l("unexpected");
                    return null;
                }
                if (iE == 4) {
                    if (j3 < j.get(this)) {
                        pqVar.b();
                    }
                    return new nq(o());
                }
                if (iE == 5) {
                    pqVar.b();
                }
                z = false;
            } else {
                pq pqVarB = b(this, j5, pqVar);
                if (pqVarB != null) {
                    pqVar = pqVarB;
                    iE = e(this, pqVar, i3, obj, j3, aa3Var, zR);
                    a83 a83Var2 = a83.a;
                    if (iE != 0) {
                    }
                } else {
                    if (zR) {
                        return new nq(o());
                    }
                    z = false;
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean t() {
        return r(i.get(this), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: pq[] */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
    
        r16 = null;
        r3 = (defpackage.pq) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019f, code lost:
    
        if (r3 != null) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (i.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.h + ',');
        sb.append("data=[");
        int i3 = 0;
        List listP = eu.P(n.get(this), m.get(this), o.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((pq) obj) != ln.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            um2.b();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((pq) next).c;
            do {
                Object next2 = it.next();
                long j3 = ((pq) next2).c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        pq pqVar = (pq) next;
        long j4 = j.get(this);
        long jP = p();
        loop2: while (true) {
            int i4 = ln.b;
            int i5 = i3;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                long j5 = (pqVar.c * ((long) ln.b)) + ((long) i5);
                if (j5 >= jP && j5 >= j4) {
                    str = null;
                    break loop2;
                }
                Object objL = pqVar.l(i5);
                Object obj2 = pqVar.f.get(i5 * 2);
                if (objL instanceof lp) {
                    string = (jP > j5 || j5 >= j4) ? (j4 > j5 || j5 >= jP) ? "cont" : "send" : "receive";
                } else if (objL instanceof hc3) {
                    string = "EB(" + objL + ')';
                } else if (t11.l(objL, ln.f) || t11.l(objL, ln.g)) {
                    string = "resuming_sender";
                } else if (objL == null || objL.equals(ln.e) || objL.equals(ln.i) || objL.equals(ln.h) || objL.equals(ln.k) || objL.equals(ln.j) || objL.equals(ln.l)) {
                    i5++;
                } else {
                    string = objL.toString();
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i5++;
            }
            i3 = 0;
        }
        if (sb.length() == 0) {
            um2.i("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean u() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean v() {
        long j2 = k.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fq
    public final Object w(t00 t00Var) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        pq pqVar = (pq) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            boolean z = true;
            if (r(atomicLongFieldUpdater.get(this), true)) {
                Throwable thN = n();
                int i2 = yt2.a;
                throw thN;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = j;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j2 = ln.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (pqVar.c != j3) {
                pq pqVarK = k(j3, pqVar);
                if (pqVarK == null) {
                    continue;
                } else {
                    pqVar = pqVarK;
                }
            }
            Object objC = C(pqVar, i3, andIncrement, null);
            Object obj = ln.m;
            if (objC == obj) {
                s.l("unexpected");
                return null;
            }
            Object obj2 = ln.o;
            if (objC != obj2) {
                if (objC != ln.n) {
                    pqVar.b();
                    return objC;
                }
                mp mpVarB = qp0.B(gf1.z(t00Var));
                try {
                    Object objC2 = C(pqVar, i3, andIncrement, mpVarB);
                    if (objC2 == obj) {
                        mpVarB.a(pqVar, i3);
                    } else if (objC2 == obj2) {
                        if (andIncrement < p()) {
                            pqVar.b();
                        }
                        pq pqVar2 = (pq) atomicReferenceFieldUpdater.get(this);
                        while (true) {
                            if (r(atomicLongFieldUpdater.get(this), z)) {
                                mpVarB.h(new x92(n()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                            long j4 = ln.b;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            long j5 = andIncrement2 / j4;
                            int i4 = (int) (andIncrement2 % j4);
                            if (pqVar2.c != j5) {
                                pq pqVarK2 = k(j5, pqVar2);
                                if (pqVarK2 == null) {
                                    continue;
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    z = true;
                                } else {
                                    pqVar2 = pqVarK2;
                                }
                            }
                            Object objC3 = C(pqVar2, i4, andIncrement2, mpVarB);
                            if (objC3 == ln.m) {
                                mpVarB.a(pqVar2, i4);
                                break;
                            }
                            if (objC3 == ln.o) {
                                if (andIncrement2 < p()) {
                                    pqVar2.b();
                                }
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                z = true;
                            } else {
                                if (objC3 == ln.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                pqVar2.b();
                                mpVarB.i(objC3, null);
                            }
                        }
                    } else {
                        pqVar.b();
                        mpVarB.i(objC2, null);
                    }
                    return mpVarB.t();
                } catch (Throwable th) {
                    mpVarB.D();
                    throw th;
                }
            }
            if (andIncrement < p()) {
                pqVar.b();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(long j2, pq pqVar) {
        pq pqVar2;
        pq pqVar3;
        while (pqVar.c < j2 && (pqVar3 = (pq) pqVar.c()) != null) {
            pqVar = pqVar3;
        }
        while (true) {
            if (!pqVar.d() || (pqVar2 = (pq) pqVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
                    lm2 lm2Var = (lm2) atomicReferenceFieldUpdater.get(this);
                    if (lm2Var.c >= pqVar.c) {
                        return;
                    }
                    if (!pqVar.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, lm2Var, pqVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != lm2Var) {
                            if (pqVar.f()) {
                                pqVar.e();
                            }
                        }
                    }
                    if (lm2Var.f()) {
                        lm2Var.e();
                        return;
                    }
                    return;
                }
            }
            pqVar = pqVar2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object y(t00 t00Var, Object obj) {
        mp mpVar = new mp(1, gf1.z(t00Var));
        mpVar.u();
        mpVar.h(new x92(o()));
        Object objT = mpVar.t();
        return objT == k20.h ? objT : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(gc3 gc3Var, boolean z) {
        if (gc3Var instanceof lp) {
            ((t00) gc3Var).h(new x92(z ? n() : o()));
            return;
        }
        if (!(gc3Var instanceof in)) {
            c80.u("Unexpected waiter: ", gc3Var);
            return;
        }
        in inVar = (in) gc3Var;
        mp mpVar = inVar.i;
        mpVar.getClass();
        inVar.i = null;
        inVar.h = ln.l;
        Throwable thL = inVar.j.l();
        if (thL == null) {
            mpVar.h(Boolean.FALSE);
        } else {
            mpVar.h(new x92(thL));
        }
    }
}
