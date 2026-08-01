package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: vb */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class C0834vb implements InterfaceC0470md {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f6632e = AtomicLongFieldUpdater.newUpdater(C0834vb.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f6633f = AtomicLongFieldUpdater.newUpdater(C0834vb.class, "receivers$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f6634g = AtomicLongFieldUpdater.newUpdater(C0834vb.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f6635h = AtomicLongFieldUpdater.newUpdater(C0834vb.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6636i = AtomicReferenceFieldUpdater.newUpdater(C0834vb.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6637j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6638k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6639l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6640m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ long f6641n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ long f6642o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ long f6643p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ long f6644q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ long f6645r;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: d */
    public final int f6646d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Unsafe unsafe = uw0.f6315a;
        f6645r = unsafe.objectFieldOffset(C0834vb.class.getDeclaredField("sendSegment$volatile"));
        f6637j = AtomicReferenceFieldUpdater.newUpdater(C0834vb.class, Object.class, "receiveSegment$volatile");
        f6644q = unsafe.objectFieldOffset(C0834vb.class.getDeclaredField("receiveSegment$volatile"));
        f6638k = AtomicReferenceFieldUpdater.newUpdater(C0834vb.class, Object.class, "bufferEndSegment$volatile");
        f6642o = unsafe.objectFieldOffset(C0834vb.class.getDeclaredField("bufferEndSegment$volatile"));
        f6639l = AtomicReferenceFieldUpdater.newUpdater(C0834vb.class, Object.class, "_closeCause$volatile");
        f6641n = unsafe.objectFieldOffset(C0834vb.class.getDeclaredField("_closeCause$volatile"));
        f6640m = AtomicReferenceFieldUpdater.newUpdater(C0834vb.class, Object.class, "closeHandler$volatile");
        f6643p = unsafe.objectFieldOffset(C0834vb.class.getDeclaredField("closeHandler$volatile"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0834vb(int i) {
        this.f6646d = i;
        if (i < 0) {
            C0921xc.m5126g("Invalid channel capacity: ", i, ", should be >=0");
            throw null;
        }
        C0885wd c0885wd = AbstractC0920xb.f7295a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f6634g.get(this);
        C0885wd c0885wd2 = new C0885wd(0L, null, this, 3);
        this.sendSegment$volatile = c0885wd2;
        this.receiveSegment$volatile = c0885wd2;
        if (m4446A()) {
            c0885wd2 = AbstractC0920xb.f7295a;
            c0885wd2.getClass();
        }
        this.bufferEndSegment$volatile = c0885wd2;
        this._closeCause$volatile = AbstractC0920xb.f7313s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static Object m4440D(C0834vb c0834vb, m51 m51Var) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6637j;
        atomicReferenceFieldUpdater.getClass();
        if (c0834vb == null) {
            C0921xc.m5123d();
            return null;
        }
        C0885wd c0885wd = (C0885wd) uw0.f6315a.getObjectVolatile(c0834vb, f6644q);
        while (true) {
            c0834vb.getClass();
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6632e;
            boolean z = true;
            if (c0834vb.m4471y(atomicLongFieldUpdater.get(c0834vb), true)) {
                Throwable thM4466r = c0834vb.m4466r();
                int i = q31.f5038a;
                throw thM4466r;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6633f;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(c0834vb);
            long j = AbstractC0920xb.f7296b;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (c0885wd.f4374e != j2) {
                C0885wd c0885wdM4463n = c0834vb.m4463n(j2, c0885wd);
                if (c0885wdM4463n == null) {
                    continue;
                } else {
                    c0885wd = c0885wdM4463n;
                }
            }
            Object objM4452J = c0834vb.m4452J(c0885wd, i2, andIncrement, null);
            Object obj = AbstractC0920xb.f7307m;
            if (objM4452J == obj) {
                C0921xc.m5134o("unexpected");
                return null;
            }
            Object obj2 = AbstractC0920xb.f7309o;
            if (objM4452J != obj2) {
                if (objM4452J != AbstractC0920xb.f7308n) {
                    c0885wd.m1582a();
                    return objM4452J;
                }
                C0884wc c0884wcM3496y = rd0.m3496y(rd0.m3497z(m51Var));
                try {
                    Object objM4452J2 = c0834vb.m4452J(c0885wd, i2, andIncrement, c0884wcM3496y);
                    if (objM4452J2 == obj) {
                        c0884wcM3496y.mo539a(c0885wd, i2);
                    } else if (objM4452J2 == obj2) {
                        if (andIncrement < c0834vb.m4468u()) {
                            c0885wd.m1582a();
                        }
                        C0885wd c0885wd2 = (C0885wd) atomicReferenceFieldUpdater.get(c0834vb);
                        while (true) {
                            if (c0834vb.m4471y(atomicLongFieldUpdater.get(c0834vb), z)) {
                                c0884wcM3496y.mo541i(new bv0(c0834vb.m4466r()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(c0834vb);
                            long j3 = AbstractC0920xb.f7296b;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            long j4 = andIncrement2 / j3;
                            int i3 = (int) (andIncrement2 % j3);
                            if (c0885wd2.f4374e != j4) {
                                C0885wd c0885wdM4463n2 = c0834vb.m4463n(j4, c0885wd2);
                                if (c0885wdM4463n2 == null) {
                                    continue;
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    z = true;
                                } else {
                                    c0885wd2 = c0885wdM4463n2;
                                }
                            }
                            Object objM4452J3 = c0834vb.m4452J(c0885wd2, i3, andIncrement2, c0884wcM3496y);
                            if (objM4452J3 == AbstractC0920xb.f7307m) {
                                c0884wcM3496y.mo539a(c0885wd2, i3);
                                break;
                            }
                            if (objM4452J3 == AbstractC0920xb.f7309o) {
                                if (andIncrement2 < c0834vb.m4468u()) {
                                    c0885wd2.m1582a();
                                }
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                z = true;
                            } else {
                                if (objM4452J3 == AbstractC0920xb.f7308n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c0885wd2.m1582a();
                                c0884wcM3496y.m4980F(objM4452J3, null);
                            }
                        }
                    } else {
                        c0885wd.m1582a();
                        c0884wcM3496y.m4980F(objM4452J2, null);
                    }
                    return c0884wcM3496y.m4990t();
                } catch (Throwable th) {
                    c0884wcM3496y.m4978D();
                    throw th;
                }
            }
            if (andIncrement < c0834vb.m4468u()) {
                c0885wd.m1582a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0158 A[RETURN] */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m4441F(C0834vb c0834vb, Object obj, InterfaceC0322ik interfaceC0322ik) {
        na1 na1Var;
        EnumC1007zk enumC1007zk;
        Object objM4990t;
        EnumC1007zk enumC1007zk2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6636i;
        atomicReferenceFieldUpdater.getClass();
        C0885wd c0885wd = (C0885wd) uw0.f6315a.getObjectVolatile(c0834vb, f6645r);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6632e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c0834vb);
            long j = andIncrement & 1152921504606846975L;
            boolean zM4471y = c0834vb.m4471y(andIncrement, false);
            int i = AbstractC0920xb.f7296b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = c0885wd.f4374e;
            EnumC1007zk enumC1007zk3 = EnumC1007zk.f7916d;
            na1Var = na1.f4229a;
            if (j4 != j3) {
                C0885wd c0885wdM4464o = c0834vb.m4464o(j3, c0885wd);
                if (c0885wdM4464o != null) {
                    c0885wd = c0885wdM4464o;
                } else if (zM4471y) {
                    Object objM4448C = c0834vb.m4448C(interfaceC0322ik, obj);
                    if (objM4448C == enumC1007zk3) {
                        return objM4448C;
                    }
                }
            }
            int iM4444d = m4444d(c0834vb, c0885wd, i2, obj, j, null, zM4471y);
            if (iM4444d == 0) {
                c0885wd.m1582a();
                return na1Var;
            }
            if (iM4444d == 1) {
                break;
            }
            if (iM4444d != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6633f;
                if (iM4444d == 3) {
                    C0884wc c0884wcM3496y = rd0.m3496y(rd0.m3497z(interfaceC0322ik));
                    try {
                        int iM4444d2 = m4444d(c0834vb, c0885wd, i2, obj, j, c0884wcM3496y, false);
                        if (iM4444d2 != 0) {
                            if (iM4444d2 == 1) {
                                enumC1007zk = enumC1007zk3;
                                c0884wcM3496y.mo541i(na1Var);
                            } else if (iM4444d2 != 2) {
                                if (iM4444d2 == 4) {
                                    enumC1007zk = enumC1007zk3;
                                    if (j < atomicLongFieldUpdater2.get(c0834vb)) {
                                        c0885wd.m1582a();
                                    }
                                } else {
                                    if (iM4444d2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    c0885wd.m1582a();
                                    C0885wd c0885wd2 = (C0885wd) atomicReferenceFieldUpdater.get(c0834vb);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c0834vb);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean zM4471y2 = c0834vb.m4471y(andIncrement2, false);
                                        int i3 = AbstractC0920xb.f7296b;
                                        long j6 = i3;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j7 = j5 / j6;
                                        int i4 = (int) (j5 % j6);
                                        enumC1007zk = enumC1007zk3;
                                        if (c0885wd2.f4374e != j7) {
                                            C0885wd c0885wdM4464o2 = c0834vb.m4464o(j7, c0885wd2);
                                            if (c0885wdM4464o2 != null) {
                                                c0885wd2 = c0885wdM4464o2;
                                            } else {
                                                if (zM4471y2) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                enumC1007zk3 = enumC1007zk;
                                            }
                                        }
                                        int iM4444d3 = m4444d(c0834vb, c0885wd2, i4, obj, j5, c0884wcM3496y, zM4471y2);
                                        if (iM4444d3 == 0) {
                                            c0885wd2.m1582a();
                                            break;
                                        }
                                        if (iM4444d3 == 1) {
                                            break;
                                        }
                                        if (iM4444d3 != 2) {
                                            if (iM4444d3 == 3) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            if (iM4444d3 != 4) {
                                                if (iM4444d3 == 5) {
                                                    c0885wd2.m1582a();
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                enumC1007zk3 = enumC1007zk;
                                            } else if (j5 < atomicLongFieldUpdater2.get(c0834vb)) {
                                                c0885wd2.m1582a();
                                            }
                                        } else if (zM4471y2) {
                                            c0885wd2.m2746m();
                                        } else {
                                            c0884wcM3496y.mo539a(c0885wd2, i4 + i3);
                                        }
                                    }
                                }
                                m4443b(c0834vb, obj, c0884wcM3496y);
                            } else {
                                enumC1007zk = enumC1007zk3;
                                c0884wcM3496y.mo539a(c0885wd, i2 + i);
                            }
                            objM4990t = c0884wcM3496y.m4990t();
                            enumC1007zk2 = enumC1007zk;
                            if (objM4990t != enumC1007zk2) {
                                objM4990t = na1Var;
                            }
                            if (objM4990t != enumC1007zk2) {
                                return objM4990t;
                            }
                        } else {
                            enumC1007zk = enumC1007zk3;
                            c0885wd.m1582a();
                        }
                        c0884wcM3496y.mo541i(na1Var);
                        objM4990t = c0884wcM3496y.m4990t();
                        enumC1007zk2 = enumC1007zk;
                        if (objM4990t != enumC1007zk2) {
                        }
                        if (objM4990t != enumC1007zk2) {
                            break;
                        }
                    } catch (Throwable th) {
                        c0884wcM3496y.m4978D();
                        throw th;
                    }
                } else if (iM4444d == 4) {
                    if (j < atomicLongFieldUpdater2.get(c0834vb)) {
                        c0885wd.m1582a();
                    }
                    Object objM4448C2 = c0834vb.m4448C(interfaceC0322ik, obj);
                    if (objM4448C2 == enumC1007zk3) {
                        return objM4448C2;
                    }
                } else if (iM4444d == 5) {
                    c0885wd.m1582a();
                }
            } else if (zM4471y) {
                c0885wd.m2746m();
                Object objM4448C3 = c0834vb.m4448C(interfaceC0322ik, obj);
                if (objM4448C3 == enumC1007zk3) {
                    return objM4448C3;
                }
            }
        }
        return na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static boolean m4442H(Object obj) {
        if (!(obj instanceof InterfaceC0798uc)) {
            C0921xc.m5130k(obj, "Unexpected waiter: ");
            return false;
        }
        InterfaceC0798uc interfaceC0798uc = (InterfaceC0798uc) obj;
        C0885wd c0885wd = AbstractC0920xb.f7295a;
        C1014zr c1014zrMo542j = interfaceC0798uc.mo542j(na1.f4229a, null);
        if (c1014zrMo542j == null) {
            return false;
        }
        interfaceC0798uc.mo544x(c1014zrMo542j);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m4443b(C0834vb c0834vb, Object obj, C0884wc c0884wc) {
        c0884wc.mo541i(new bv0(c0834vb.m4467t()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final int m4444d(C0834vb c0834vb, C0885wd c0885wd, int i, Object obj, long j, Object obj2, boolean z) {
        c0885wd.m4999r(i, obj);
        if (z) {
            return c0834vb.m4453K(c0885wd, i, obj, j, obj2, z);
        }
        Object objM4997p = c0885wd.m4997p(i);
        if (objM4997p == null) {
            if (c0834vb.m4455e(j)) {
                if (c0885wd.m4996o(i, null, AbstractC0920xb.f7298d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c0885wd.m4996o(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM4997p instanceof yc1) {
            c0885wd.m4999r(i, null);
            if (c0834vb.m4450G(objM4997p, obj)) {
                c0885wd.m5000s(i, AbstractC0920xb.f7303i);
                return 0;
            }
            C1014zr c1014zr = AbstractC0920xb.f7305k;
            if (c0885wd.f7081h.getAndSet((i * 2) + 1, c1014zr) == c1014zr) {
                return 5;
            }
            c0885wd.m4998q(i, true);
            return 5;
        }
        return c0834vb.m4453K(c0885wd, i, obj, j, obj2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m4445w(C0834vb c0834vb) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6635h;
        if ((atomicLongFieldUpdater.addAndGet(c0834vb, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c0834vb) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final boolean m4446A() {
        long j = f6634g.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r5.m2745j() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        r5.m1589h();
     */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4447B(long j, C0885wd c0885wd) {
        C0834vb c0834vb;
        C0885wd c0885wd2;
        C0885wd c0885wd3;
        while (c0885wd.f4374e < j && (c0885wd3 = (C0885wd) c0885wd.m1584c()) != null) {
            c0885wd = c0885wd3;
        }
        while (true) {
            C0885wd c0885wd4 = c0885wd;
            while (c0885wd4.mo1587f() && (c0885wd2 = (C0885wd) c0885wd4.m1584c()) != null) {
                c0885wd4 = c0885wd2;
            }
            while (true) {
                f6638k.getClass();
                Unsafe unsafe = uw0.f6315a;
                long j2 = f6642o;
                nz0 nz0Var = (nz0) unsafe.getObjectVolatile(this, j2);
                if (nz0Var.f4374e >= c0885wd4.f4374e) {
                    return;
                }
                if (!c0885wd4.m2747n()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = uw0.f6315a;
                    c0834vb = this;
                    if (unsafe2.compareAndSwapObject(c0834vb, f6642o, nz0Var, c0885wd4)) {
                        if (nz0Var.m2745j()) {
                            nz0Var.m1589h();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(c0834vb, j2) != nz0Var) {
                        break;
                    } else {
                        this = c0834vb;
                    }
                }
                this = c0834vb;
            }
            c0885wd = c0885wd4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final Object m4448C(InterfaceC0322ik interfaceC0322ik, Object obj) {
        C0884wc c0884wc = new C0884wc(1, rd0.m3497z(interfaceC0322ik));
        c0884wc.m4992v();
        c0884wc.mo541i(new bv0(m4467t()));
        Object objM4990t = c0884wc.m4990t();
        return objM4990t == EnumC1007zk.f7916d ? objM4990t : na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final void m4449E(yc1 yc1Var, boolean z) {
        if (yc1Var instanceof InterfaceC0798uc) {
            ((InterfaceC0322ik) yc1Var).mo541i(new bv0(z ? m4466r() : m4467t()));
            return;
        }
        if (!(yc1Var instanceof C0797ub)) {
            C0921xc.m5130k(yc1Var, "Unexpected waiter: ");
            return;
        }
        C0797ub c0797ub = (C0797ub) yc1Var;
        C0884wc c0884wc = c0797ub.f6183e;
        c0884wc.getClass();
        c0797ub.f6183e = null;
        c0797ub.f6182d = AbstractC0920xb.f7306l;
        Throwable thM4465p = c0797ub.f6184f.m4465p();
        if (thM4465p == null) {
            c0884wc.mo541i(Boolean.FALSE);
        } else {
            c0884wc.mo541i(new bv0(thM4465p));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final boolean m4450G(Object obj, Object obj2) {
        if (!(obj instanceof C0797ub)) {
            if (!(obj instanceof InterfaceC0798uc)) {
                C0921xc.m5130k(obj, "Unexpected receiver type: ");
                return false;
            }
            InterfaceC0798uc interfaceC0798uc = (InterfaceC0798uc) obj;
            C0885wd c0885wd = AbstractC0920xb.f7295a;
            C1014zr c1014zrMo542j = interfaceC0798uc.mo542j(obj2, null);
            if (c1014zrMo542j == null) {
                return false;
            }
            interfaceC0798uc.mo544x(c1014zrMo542j);
            return true;
        }
        C0797ub c0797ub = (C0797ub) obj;
        C0884wc c0884wc = c0797ub.f6183e;
        c0884wc.getClass();
        c0797ub.f6183e = null;
        c0797ub.f6182d = obj2;
        Boolean bool = Boolean.TRUE;
        c0797ub.f6184f.getClass();
        C0885wd c0885wd2 = AbstractC0920xb.f7295a;
        C1014zr c1014zrMo542j2 = c0884wc.mo542j(bool, null);
        if (c1014zrMo542j2 == null) {
            return false;
        }
        c0884wc.mo544x(c1014zrMo542j2);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        return r1;
     */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4451I(Object obj) {
        C0885wd c0885wdM4464o;
        int i;
        C0834vb c0834vb;
        InterfaceC0973yr interfaceC0973yr = AbstractC0920xb.f7298d;
        f6636i.getClass();
        C0885wd c0885wd = (C0885wd) uw0.f6315a.getObjectVolatile(this, f6645r);
        while (true) {
            long andIncrement = f6632e.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM4471y = this.m4471y(andIncrement, false);
            int i2 = AbstractC0920xb.f7296b;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            if (c0885wd.f4374e != j3) {
                c0885wdM4464o = this.m4464o(j3, c0885wd);
                if (c0885wdM4464o != null) {
                    c0834vb = this;
                    i = i3;
                } else if (zM4471y) {
                    return new C0799ud(this.m4467t());
                }
            } else {
                c0885wdM4464o = c0885wd;
                i = i3;
                c0834vb = this;
            }
            Object obj2 = obj;
            int iM4444d = m4444d(c0834vb, c0885wdM4464o, i, obj2, j, interfaceC0973yr, zM4471y);
            C0834vb c0834vb2 = c0834vb;
            c0885wd = c0885wdM4464o;
            na1 na1Var = na1.f4229a;
            if (iM4444d == 0) {
                c0885wd.m1582a();
                return na1Var;
            }
            if (iM4444d == 1) {
                break;
            }
            if (iM4444d != 2) {
                if (iM4444d == 3) {
                    C0921xc.m5134o("unexpected");
                    return null;
                }
                if (iM4444d == 4) {
                    if (j < f6633f.get(c0834vb2)) {
                        c0885wd.m1582a();
                    }
                    return new C0799ud(c0834vb2.m4467t());
                }
                if (iM4444d == 5) {
                    c0885wd.m1582a();
                }
                this = c0834vb2;
                obj = obj2;
            } else {
                if (zM4471y) {
                    c0885wd.m2746m();
                    return new C0799ud(c0834vb2.m4467t());
                }
                yc1 yc1Var = interfaceC0973yr instanceof yc1 ? (yc1) interfaceC0973yr : null;
                if (yc1Var != null) {
                    yc1Var.mo539a(c0885wd, i + i2);
                }
                c0834vb2.m4460j((c0885wd.f4374e * j2) + ((long) i));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final Object m4452J(C0885wd c0885wd, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = c0885wd.f7081h;
        Object objM4997p = c0885wd.m4997p(i);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6632e;
        if (objM4997p == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC0920xb.f7308n;
                }
                if (c0885wd.m4996o(i, objM4997p, obj)) {
                    m4461k();
                    return AbstractC0920xb.f7307m;
                }
            }
        } else if (objM4997p == AbstractC0920xb.f7298d && c0885wd.m4996o(i, objM4997p, AbstractC0920xb.f7303i)) {
            m4461k();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c0885wd.m4999r(i, null);
            return obj2;
        }
        while (true) {
            Object objM4997p2 = c0885wd.m4997p(i);
            if (objM4997p2 == null || objM4997p2 == AbstractC0920xb.f7299e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c0885wd.m4996o(i, objM4997p2, AbstractC0920xb.f7302h)) {
                        m4461k();
                        return AbstractC0920xb.f7309o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC0920xb.f7308n;
                    }
                    if (c0885wd.m4996o(i, objM4997p2, obj)) {
                        m4461k();
                        return AbstractC0920xb.f7307m;
                    }
                }
            } else if (objM4997p2 != AbstractC0920xb.f7298d) {
                C1014zr c1014zr = AbstractC0920xb.f7304j;
                if (objM4997p2 == c1014zr) {
                    return AbstractC0920xb.f7309o;
                }
                if (objM4997p2 == AbstractC0920xb.f7302h) {
                    return AbstractC0920xb.f7309o;
                }
                if (objM4997p2 == AbstractC0920xb.f7306l) {
                    m4461k();
                    return AbstractC0920xb.f7309o;
                }
                if (objM4997p2 != AbstractC0920xb.f7301g && c0885wd.m4996o(i, objM4997p2, AbstractC0920xb.f7300f)) {
                    boolean z = objM4997p2 instanceof zc1;
                    if (z) {
                        objM4997p2 = ((zc1) objM4997p2).f7876a;
                    }
                    if (m4442H(objM4997p2)) {
                        c0885wd.m5000s(i, AbstractC0920xb.f7303i);
                        m4461k();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        c0885wd.m4999r(i, null);
                        return obj3;
                    }
                    c0885wd.m5000s(i, c1014zr);
                    c0885wd.m2746m();
                    if (z) {
                        m4461k();
                    }
                    return AbstractC0920xb.f7309o;
                }
            } else if (c0885wd.m4996o(i, objM4997p2, AbstractC0920xb.f7303i)) {
                m4461k();
                Object obj4 = atomicReferenceArray.get(i * 2);
                c0885wd.m4999r(i, null);
                return obj4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final int m4453K(C0885wd c0885wd, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objM4997p = c0885wd.m4997p(i);
            if (objM4997p == null) {
                if (!m4455e(j) || z) {
                    if (z) {
                        if (c0885wd.m4996o(i, null, AbstractC0920xb.f7304j)) {
                            c0885wd.m2746m();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c0885wd.m4996o(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c0885wd.m4996o(i, null, AbstractC0920xb.f7298d)) {
                    break;
                }
            } else {
                if (objM4997p != AbstractC0920xb.f7299e) {
                    C1014zr c1014zr = AbstractC0920xb.f7305k;
                    if (objM4997p == c1014zr) {
                        c0885wd.m4999r(i, null);
                        return 5;
                    }
                    if (objM4997p == AbstractC0920xb.f7302h) {
                        c0885wd.m4999r(i, null);
                        return 5;
                    }
                    if (objM4997p == AbstractC0920xb.f7306l) {
                        c0885wd.m4999r(i, null);
                        m4459i();
                        return 4;
                    }
                    c0885wd.m4999r(i, null);
                    if (objM4997p instanceof zc1) {
                        objM4997p = ((zc1) objM4997p).f7876a;
                    }
                    if (m4450G(objM4997p, obj)) {
                        c0885wd.m5000s(i, AbstractC0920xb.f7303i);
                        return 0;
                    }
                    if (c0885wd.f7081h.getAndSet((i * 2) + 1, c1014zr) != c1014zr) {
                        c0885wd.m4998q(i, true);
                    }
                    return 5;
                }
                if (c0885wd.m4996o(i, objM4997p, AbstractC0920xb.f7298d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final void m4454L(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C0834vb c0834vb = this;
        if (c0834vb.m4446A()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f6634g;
            if (atomicLongFieldUpdater.get(c0834vb) > j) {
                break;
            } else {
                c0834vb = this;
            }
        }
        int i = AbstractC0920xb.f7297c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6635h;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(c0834vb);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(c0834vb)) && j2 == atomicLongFieldUpdater.get(c0834vb)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(c0834vb);
                    if (atomicLongFieldUpdater2.compareAndSet(c0834vb, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c0834vb = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(c0834vb);
                    long j5 = atomicLongFieldUpdater2.get(c0834vb);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(c0834vb)) {
                        break;
                    }
                    if (z) {
                        c0834vb = this;
                    } else {
                        c0834vb = this;
                        atomicLongFieldUpdater2.compareAndSet(c0834vb, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(c0834vb);
                    if (atomicLongFieldUpdater2.compareAndSet(c0834vb, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        c0834vb = this;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0470md
    /* JADX INFO: renamed from: a */
    public final void mo2492a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m4457g(cancellationException, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.n01
    /* JADX INFO: renamed from: c */
    public Object mo1709c(InterfaceC0322ik interfaceC0322ik, Object obj) {
        return m4441F(this, obj, interfaceC0322ik);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m4455e(long j) {
        return j < f6634g.get(this) || j < f6633f.get(this) + ((long) this.f6646d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C0885wd m4456f() {
        f6638k.getClass();
        Unsafe unsafe = uw0.f6315a;
        Object objectVolatile = unsafe.getObjectVolatile(this, f6642o);
        f6636i.getClass();
        C0885wd c0885wd = (C0885wd) unsafe.getObjectVolatile(this, f6645r);
        if (c0885wd.f4374e > ((C0885wd) objectVolatile).f4374e) {
            objectVolatile = c0885wd;
        }
        f6637j.getClass();
        C0885wd c0885wd2 = (C0885wd) unsafe.getObjectVolatile(this, f6644q);
        if (c0885wd2.f4374e > ((C0885wd) objectVolatile).f4374e) {
            objectVolatile = c0885wd2;
        }
        AbstractC0321ij abstractC0321ij = (AbstractC0321ij) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0321ij.f2575a;
            Object objM1585d = abstractC0321ij.m1585d();
            if (objM1585d == AbstractC0398kl.f3199j) {
                break;
            }
            AbstractC0321ij abstractC0321ij2 = (AbstractC0321ij) objM1585d;
            if (abstractC0321ij2 != null) {
                abstractC0321ij = abstractC0321ij2;
            } else if (abstractC0321ij.m1588g()) {
                break;
            }
        }
        return (C0885wd) abstractC0321ij;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m4457g(Throwable th, boolean z) {
        C0834vb c0834vb;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6632e;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                C0885wd c0885wd = AbstractC0920xb.f7295a;
                c0834vb = this;
                if (atomicLongFieldUpdater.compareAndSet(c0834vb, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = c0834vb;
            }
        } else {
            c0834vb = this;
        }
        C1014zr c1014zr = AbstractC0920xb.f7313s;
        while (true) {
            f6639l.getClass();
            C0834vb c0834vb2 = c0834vb;
            Unsafe unsafe = uw0.f6315a;
            long j5 = f6641n;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c0834vb2, j5, c1014zr, th2);
            c0834vb = c0834vb2;
            if (zCompareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(c0834vb, j5) != c1014zr) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(c0834vb);
            } while (!atomicLongFieldUpdater.compareAndSet(c0834vb, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(c0834vb);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c0834vb, j, j2));
        }
        c0834vb.m4459i();
        if (z2) {
            c0834vb.m4470x();
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r1 = (p000.C0885wd) r1.m1586e();
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0885wd m4458h(long j) {
        long j2;
        C0885wd c0885wdM4456f = m4456f();
        if (mo1711z()) {
            C0885wd c0885wd = c0885wdM4456f;
            loop0: do {
                int i = AbstractC0920xb.f7296b - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (c0885wd.f4374e * ((long) AbstractC0920xb.f7296b)) + ((long) i);
                    if (j2 < f6633f.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        Object objM4997p = c0885wd.m4997p(i);
                        if (objM4997p != null && objM4997p != AbstractC0920xb.f7299e) {
                            if (objM4997p == AbstractC0920xb.f7298d) {
                                break loop0;
                            }
                        } else {
                            if (c0885wd.m4996o(i, objM4997p, AbstractC0920xb.f7306l)) {
                                c0885wd.m2746m();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (c0885wd != null);
            j2 = -1;
            if (j2 != -1) {
                m4460j(j2);
            }
        }
        Object objM3035K = null;
        loop3: for (C0885wd c0885wd2 = c0885wdM4456f; c0885wd2 != null; c0885wd2 = (C0885wd) c0885wd2.m1586e()) {
            for (int i2 = AbstractC0920xb.f7296b - 1; -1 < i2; i2--) {
                if ((c0885wd2.f4374e * ((long) AbstractC0920xb.f7296b)) + ((long) i2) < j) {
                    break loop3;
                }
                while (true) {
                    Object objM4997p2 = c0885wd2.m4997p(i2);
                    if (objM4997p2 != null && objM4997p2 != AbstractC0920xb.f7299e) {
                        if (!(objM4997p2 instanceof zc1)) {
                            if (!(objM4997p2 instanceof yc1)) {
                                break;
                            }
                            if (c0885wd2.m4996o(i2, objM4997p2, AbstractC0920xb.f7306l)) {
                                objM3035K = pf1.m3035K(objM3035K, objM4997p2);
                                c0885wd2.m4998q(i2, true);
                                break;
                            }
                        } else {
                            if (c0885wd2.m4996o(i2, objM4997p2, AbstractC0920xb.f7306l)) {
                                objM3035K = pf1.m3035K(objM3035K, ((zc1) objM4997p2).f7876a);
                                c0885wd2.m4998q(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (c0885wd2.m4996o(i2, objM4997p2, AbstractC0920xb.f7306l)) {
                            c0885wd2.m2746m();
                            break;
                        }
                    }
                }
            }
        }
        if (objM3035K != null) {
            if (!(objM3035K instanceof ArrayList)) {
                m4449E((yc1) objM3035K, true);
                return c0885wdM4456f;
            }
            ArrayList arrayList = (ArrayList) objM3035K;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m4449E((yc1) arrayList.get(size), true);
            }
        }
        return c0885wdM4456f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4459i() {
        m4471y(f6632e.get(this), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0470md
    public final C0797ub iterator() {
        return new C0797ub(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m4460j(long j) {
        f6637j.getClass();
        C0885wd c0885wd = (C0885wd) uw0.f6315a.getObjectVolatile(this, f6644q);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6633f;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f6646d) + j2, f6634g.get(this))) {
                return;
            }
            C0834vb c0834vb = this;
            if (atomicLongFieldUpdater.compareAndSet(c0834vb, j2, 1 + j2)) {
                long j3 = AbstractC0920xb.f7296b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c0885wd.f4374e != j4) {
                    C0885wd c0885wdM4463n = c0834vb.m4463n(j4, c0885wd);
                    if (c0885wdM4463n != null) {
                        c0885wd = c0885wdM4463n;
                    }
                }
                C0885wd c0885wd2 = c0885wd;
                if (c0834vb.m4452J(c0885wd2, i, j2, null) != AbstractC0920xb.f7309o || j2 < c0834vb.m4468u()) {
                    c0885wd2.m1582a();
                }
                this = c0834vb;
                c0885wd = c0885wd2;
            }
            this = c0834vb;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f1, code lost:
    
        m4445w(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4461k() {
        int i;
        boolean z;
        Object objM4997p;
        if (m4446A()) {
            return;
        }
        f6638k.getClass();
        C0885wd c0885wd = (C0885wd) uw0.f6315a.getObjectVolatile(this, f6642o);
        loop0: while (true) {
            long andIncrement = f6634g.getAndIncrement(this);
            long j = AbstractC0920xb.f7296b;
            long j2 = andIncrement / j;
            if (this.m4468u() <= andIncrement) {
                if (c0885wd.f4374e < j2 && c0885wd.m1584c() != null) {
                    this.m4447B(j2, c0885wd);
                }
                m4445w(this);
                return;
            }
            C0834vb c0834vb = this;
            if (c0885wd.f4374e == j2) {
                i = (int) (andIncrement % j);
                Object objM4997p2 = c0885wd.m4997p(i);
                z = objM4997p2 instanceof yc1;
                AtomicLongFieldUpdater atomicLongFieldUpdater = f6633f;
                if (z || andIncrement < atomicLongFieldUpdater.get(c0834vb) || !c0885wd.m4996o(i, objM4997p2, AbstractC0920xb.f7301g)) {
                    while (true) {
                        objM4997p = c0885wd.m4997p(i);
                        if (objM4997p instanceof yc1) {
                            if (objM4997p != AbstractC0920xb.f7304j) {
                                if (objM4997p != null) {
                                    if (objM4997p == AbstractC0920xb.f7298d || objM4997p == AbstractC0920xb.f7302h || objM4997p == AbstractC0920xb.f7303i || objM4997p == AbstractC0920xb.f7305k || objM4997p == AbstractC0920xb.f7306l) {
                                        break loop0;
                                    } else if (objM4997p != AbstractC0920xb.f7300f) {
                                        C0921xc.m5130k(objM4997p, "Unexpected cell state: ");
                                        return;
                                    }
                                } else if (c0885wd.m4996o(i, objM4997p, AbstractC0920xb.f7299e)) {
                                    break loop0;
                                }
                            } else {
                                break;
                            }
                        } else if (andIncrement < atomicLongFieldUpdater.get(c0834vb)) {
                            if (c0885wd.m4996o(i, objM4997p, new zc1((yc1) objM4997p))) {
                                break loop0;
                            }
                        } else if (c0885wd.m4996o(i, objM4997p, AbstractC0920xb.f7301g)) {
                            if (m4442H(objM4997p)) {
                                c0885wd.m5000s(i, AbstractC0920xb.f7298d);
                                break;
                            } else {
                                c0885wd.m5000s(i, AbstractC0920xb.f7304j);
                                c0885wd.m2746m();
                            }
                        }
                    }
                } else if (m4442H(objM4997p2)) {
                    c0885wd.m5000s(i, AbstractC0920xb.f7298d);
                    break;
                } else {
                    c0885wd.m5000s(i, AbstractC0920xb.f7304j);
                    c0885wd.m2746m();
                    m4445w(c0834vb);
                }
            } else {
                C0885wd c0885wdM4462l = c0834vb.m4462l(j2, c0885wd, andIncrement);
                if (c0885wdM4462l == null) {
                    continue;
                } else {
                    c0885wd = c0885wdM4462l;
                    i = (int) (andIncrement % j);
                    Object objM4997p22 = c0885wd.m4997p(i);
                    z = objM4997p22 instanceof yc1;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6633f;
                    if (z) {
                        while (true) {
                            objM4997p = c0885wd.m4997p(i);
                            if (objM4997p instanceof yc1) {
                            }
                        }
                    }
                }
            }
            this = c0834vb;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final C0885wd m4462l(long j, C0885wd c0885wd, long j2) {
        Object objM1926l;
        Unsafe unsafe;
        C0885wd c0885wd2 = AbstractC0920xb.f7295a;
        C0883wb c0883wb = C0883wb.f7057d;
        loop0: while (true) {
            objM1926l = AbstractC0398kl.m1926l(c0885wd, j, c0883wb);
            if (!g60.m1215n(objM1926l)) {
                nz0 nz0VarM1213l = g60.m1213l(objM1926l);
                while (true) {
                    f6638k.getClass();
                    Unsafe unsafe2 = uw0.f6315a;
                    long j3 = f6642o;
                    nz0 nz0Var = (nz0) unsafe2.getObjectVolatile(this, j3);
                    if (nz0Var.f4374e >= nz0VarM1213l.f4374e) {
                        break loop0;
                    }
                    if (!nz0VarM1213l.m2747n()) {
                        break;
                    }
                    do {
                        unsafe = uw0.f6315a;
                        if (unsafe.compareAndSwapObject(this, f6642o, nz0Var, nz0VarM1213l)) {
                            if (nz0Var.m2745j()) {
                                nz0Var.m1589h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == nz0Var);
                    if (nz0VarM1213l.m2745j()) {
                        nz0VarM1213l.m1589h();
                    }
                }
            } else {
                break;
            }
        }
        if (g60.m1215n(objM1926l)) {
            m4459i();
            m4447B(j, c0885wd);
            m4445w(this);
            return null;
        }
        C0885wd c0885wd3 = (C0885wd) g60.m1213l(objM1926l);
        long j4 = c0885wd3.f4374e;
        if (j4 <= j) {
            return c0885wd3;
        }
        long j5 = j4 * ((long) AbstractC0920xb.f7296b);
        if (!f6634g.compareAndSet(this, j2 + 1, j5)) {
            m4445w(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6635h;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0470md
    /* JADX INFO: renamed from: m */
    public final Object mo2493m(m51 m51Var) {
        return m4440D(this, m51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (r8.m2745j() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        r8.m1589h();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107 A[RETURN] */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0885wd m4463n(long j, C0885wd c0885wd) {
        Object objM1926l;
        C0885wd c0885wd2;
        long j2;
        Unsafe unsafe;
        C0885wd c0885wd3 = AbstractC0920xb.f7295a;
        C0883wb c0883wb = C0883wb.f7057d;
        loop0: while (true) {
            objM1926l = AbstractC0398kl.m1926l(c0885wd, j, c0883wb);
            if (!g60.m1215n(objM1926l)) {
                nz0 nz0VarM1213l = g60.m1213l(objM1926l);
                while (true) {
                    f6637j.getClass();
                    Unsafe unsafe2 = uw0.f6315a;
                    long j3 = f6644q;
                    nz0 nz0Var = (nz0) unsafe2.getObjectVolatile(this, j3);
                    if (nz0Var.f4374e >= nz0VarM1213l.f4374e) {
                        break loop0;
                    }
                    if (!nz0VarM1213l.m2747n()) {
                        break;
                    }
                    do {
                        unsafe = uw0.f6315a;
                        if (unsafe.compareAndSwapObject(this, f6644q, nz0Var, nz0VarM1213l)) {
                            if (nz0Var.m2745j()) {
                                nz0Var.m1589h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == nz0Var);
                    if (nz0VarM1213l.m2745j()) {
                        nz0VarM1213l.m1589h();
                    }
                }
            } else {
                break;
            }
        }
        if (g60.m1215n(objM1926l)) {
            m4459i();
            if (c0885wd.f4374e * ((long) AbstractC0920xb.f7296b) < m4468u()) {
                c0885wd.m1582a();
                return null;
            }
        } else {
            C0885wd c0885wd4 = (C0885wd) g60.m1213l(objM1926l);
            long j4 = c0885wd4.f4374e;
            if (m4446A() || j > f6634g.get(this) / ((long) AbstractC0920xb.f7296b)) {
                c0885wd2 = c0885wd4;
                if (j4 > j) {
                    return c0885wd2;
                }
                long j5 = j4 * ((long) AbstractC0920xb.f7296b);
                do {
                    j2 = f6633f.get(this);
                    if (j2 >= j5) {
                        break;
                    }
                } while (!f6633f.compareAndSet(this, j2, j5));
                if (j4 * ((long) AbstractC0920xb.f7296b) < m4468u()) {
                    c0885wd2.m1582a();
                }
            } else {
                while (true) {
                    f6638k.getClass();
                    Unsafe unsafe3 = uw0.f6315a;
                    long j6 = f6642o;
                    nz0 nz0Var2 = (nz0) unsafe3.getObjectVolatile(this, j6);
                    if (nz0Var2.f4374e >= j4 || !c0885wd4.m2747n()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = uw0.f6315a;
                        c0885wd2 = c0885wd4;
                        if (unsafe4.compareAndSwapObject(this, f6642o, nz0Var2, c0885wd4)) {
                            if (nz0Var2.m2745j()) {
                                nz0Var2.m1589h();
                            }
                        } else {
                            if (unsafe4.getObjectVolatile(this, j6) != nz0Var2) {
                                break;
                            }
                            c0885wd4 = c0885wd2;
                        }
                    }
                    c0885wd4 = c0885wd2;
                }
                if (j4 > j) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final C0885wd m4464o(long j, C0885wd c0885wd) {
        Object objM1926l;
        long j2;
        long j3;
        Unsafe unsafe;
        C0885wd c0885wd2 = AbstractC0920xb.f7295a;
        C0883wb c0883wb = C0883wb.f7057d;
        loop0: while (true) {
            objM1926l = AbstractC0398kl.m1926l(c0885wd, j, c0883wb);
            if (!g60.m1215n(objM1926l)) {
                nz0 nz0VarM1213l = g60.m1213l(objM1926l);
                while (true) {
                    f6636i.getClass();
                    Unsafe unsafe2 = uw0.f6315a;
                    long j4 = f6645r;
                    nz0 nz0Var = (nz0) unsafe2.getObjectVolatile(this, j4);
                    if (nz0Var.f4374e >= nz0VarM1213l.f4374e) {
                        break loop0;
                    }
                    if (!nz0VarM1213l.m2747n()) {
                        break;
                    }
                    do {
                        unsafe = uw0.f6315a;
                        if (unsafe.compareAndSwapObject(this, f6645r, nz0Var, nz0VarM1213l)) {
                            if (nz0Var.m2745j()) {
                                nz0Var.m1589h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == nz0Var);
                    if (nz0VarM1213l.m2745j()) {
                        nz0VarM1213l.m1589h();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM1215n = g60.m1215n(objM1926l);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6633f;
        if (zM1215n) {
            m4459i();
            if (c0885wd.f4374e * ((long) AbstractC0920xb.f7296b) < atomicLongFieldUpdater.get(this)) {
                c0885wd.m1582a();
                return null;
            }
        } else {
            C0885wd c0885wd3 = (C0885wd) g60.m1213l(objM1926l);
            long j5 = c0885wd3.f4374e;
            if (j5 <= j) {
                return c0885wd3;
            }
            long j6 = j5 * ((long) AbstractC0920xb.f7296b);
            do {
                j2 = f6632e.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!f6632e.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
            if (j5 * ((long) AbstractC0920xb.f7296b) < atomicLongFieldUpdater.get(this)) {
                c0885wd3.m1582a();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final Throwable m4465p() {
        f6639l.getClass();
        return (Throwable) uw0.f6315a.getObjectVolatile(this, f6641n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0470md
    /* JADX INFO: renamed from: q */
    public final Object mo2494q() {
        C0885wd c0885wd;
        C0836vd c0836vd = p30.f4735b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6633f;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f6632e;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (m4471y(j2, true)) {
            return new C0799ud(m4465p());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return c0836vd;
        }
        Object obj = AbstractC0920xb.f7305k;
        f6637j.getClass();
        C0885wd c0885wd2 = (C0885wd) uw0.f6315a.getObjectVolatile(this, f6644q);
        while (!this.m4471y(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = AbstractC0920xb.f7296b;
            long j4 = andIncrement / j3;
            int i = (int) (andIncrement % j3);
            if (c0885wd2.f4374e != j4) {
                C0885wd c0885wdM4463n = this.m4463n(j4, c0885wd2);
                if (c0885wdM4463n == null) {
                    continue;
                } else {
                    c0885wd = c0885wdM4463n;
                }
            } else {
                c0885wd = c0885wd2;
            }
            C0834vb c0834vb = this;
            Object objM4452J = c0834vb.m4452J(c0885wd, i, andIncrement, obj);
            c0885wd2 = c0885wd;
            if (objM4452J == AbstractC0920xb.f7307m) {
                yc1 yc1Var = obj instanceof yc1 ? (yc1) obj : null;
                if (yc1Var != null) {
                    yc1Var.mo539a(c0885wd2, i);
                }
                c0834vb.m4454L(andIncrement);
                c0885wd2.m2746m();
                return c0836vd;
            }
            if (objM4452J != AbstractC0920xb.f7309o) {
                if (objM4452J != AbstractC0920xb.f7308n) {
                    c0885wd2.m1582a();
                    return objM4452J;
                }
                C0921xc.m5134o("unexpected");
                return null;
            }
            if (andIncrement < c0834vb.m4468u()) {
                c0885wd2.m1582a();
            }
            this = c0834vb;
        }
        return new C0799ud(this.m4465p());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final Throwable m4466r() {
        Throwable thM4465p = m4465p();
        return thM4465p == null ? new C0837ve("Channel was closed") : thM4465p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3 A[SYNTHETIC] */
    @Override // p000.n01
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo1710s(Object obj) {
        int iM4444d;
        C0836vd c0836vd = p30.f4735b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6632e;
        boolean z = false;
        long j = 1152921504606846975L;
        if (m4471y(atomicLongFieldUpdater.get(this), false) ? false : !m4455e(r1 & 1152921504606846975L)) {
            return c0836vd;
        }
        InterfaceC0973yr interfaceC0973yr = AbstractC0920xb.f7304j;
        f6636i.getClass();
        C0885wd c0885wd = (C0885wd) uw0.f6315a.getObjectVolatile(this, f6645r);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean zM4471y = m4471y(andIncrement, z);
            int i = AbstractC0920xb.f7296b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (c0885wd.f4374e == j4) {
                iM4444d = m4444d(this, c0885wd, i2, obj, j2, interfaceC0973yr, zM4471y);
                na1 na1Var = na1.f4229a;
                if (iM4444d != 0) {
                    c0885wd.m1582a();
                    return na1Var;
                }
                if (iM4444d == 1) {
                    return na1Var;
                }
                if (iM4444d == 2) {
                    if (zM4471y) {
                        c0885wd.m2746m();
                        return new C0799ud(m4467t());
                    }
                    yc1 yc1Var = interfaceC0973yr instanceof yc1 ? (yc1) interfaceC0973yr : null;
                    if (yc1Var != null) {
                        yc1Var.mo539a(c0885wd, i2 + i);
                    }
                    c0885wd.m2746m();
                    return c0836vd;
                }
                if (iM4444d == 3) {
                    C0921xc.m5134o("unexpected");
                    return null;
                }
                if (iM4444d == 4) {
                    if (j2 < f6633f.get(this)) {
                        c0885wd.m1582a();
                    }
                    return new C0799ud(m4467t());
                }
                if (iM4444d == 5) {
                    c0885wd.m1582a();
                }
                z = false;
            } else {
                C0885wd c0885wdM4464o = m4464o(j4, c0885wd);
                if (c0885wdM4464o != null) {
                    c0885wd = c0885wdM4464o;
                    iM4444d = m4444d(this, c0885wd, i2, obj, j2, interfaceC0973yr, zM4471y);
                    na1 na1Var2 = na1.f4229a;
                    if (iM4444d != 0) {
                    }
                } else {
                    if (zM4471y) {
                        return new C0799ud(m4467t());
                    }
                    z = false;
                }
            }
            j = 1152921504606846975L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final Throwable m4467t() {
        Throwable thM4465p = m4465p();
        return thM4465p == null ? new C0886we("Channel was closed") : thM4465p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: wd[] */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019e, code lost:
    
        r15 = r8;
        r3 = (p000.C0885wd) r3.m1584c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a6, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i;
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f6632e.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f6646d + ',');
        sb.append("data=[");
        f6637j.getClass();
        Unsafe unsafe = uw0.f6315a;
        int i3 = 0;
        f6636i.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, f6645r);
        int i4 = 1;
        f6638k.getClass();
        List listM2783w = o30.m2783w(unsafe.getObjectVolatile(this, f6644q), objectVolatile, unsafe.getObjectVolatile(this, f6642o));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM2783w) {
            if (((C0885wd) obj) != AbstractC0920xb.f7295a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            C0921xc.m5132m();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((C0885wd) next).f4374e;
            do {
                Object next2 = it.next();
                long j2 = ((C0885wd) next2).f4374e;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        C0885wd c0885wd = (C0885wd) next;
        long j3 = f6633f.get(this);
        long jM4468u = m4468u();
        loop2: while (true) {
            int i5 = AbstractC0920xb.f7296b;
            int i6 = i3;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                i = i4;
                long j4 = (c0885wd.f4374e * ((long) AbstractC0920xb.f7296b)) + ((long) i6);
                if (j4 >= jM4468u && j4 >= j3) {
                    break loop2;
                }
                Object objM4997p = c0885wd.m4997p(i6);
                Object obj2 = c0885wd.f7081h.get(i6 * 2);
                if (objM4997p instanceof InterfaceC0798uc) {
                    string = (j4 >= j3 || j4 < jM4468u) ? (j4 >= jM4468u || j4 < j3) ? "cont" : "send" : "receive";
                } else if (objM4997p instanceof zc1) {
                    string = "EB(" + objM4997p + ')';
                } else if (p30.m3002l(objM4997p, AbstractC0920xb.f7300f) || p30.m3002l(objM4997p, AbstractC0920xb.f7301g)) {
                    string = "resuming_sender";
                } else if (objM4997p == null || objM4997p.equals(AbstractC0920xb.f7299e) || objM4997p.equals(AbstractC0920xb.f7303i) || objM4997p.equals(AbstractC0920xb.f7302h) || objM4997p.equals(AbstractC0920xb.f7305k) || objM4997p.equals(AbstractC0920xb.f7304j) || objM4997p.equals(AbstractC0920xb.f7306l)) {
                    i6++;
                    i4 = i;
                } else {
                    string = objM4997p.toString();
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i6++;
                i4 = i;
            }
            i4 = i;
            i3 = 0;
        }
        if (k41.m1770b0(sb) == ',') {
            sb.deleteCharAt(sb.length() - i).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final long m4468u() {
        return f6632e.get(this) & 1152921504606846975L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final boolean m4469v() {
        while (true) {
            f6637j.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f6644q;
            C0885wd c0885wdM4463n = (C0885wd) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = f6633f;
            long j2 = atomicLongFieldUpdater.get(this);
            if (m4468u() <= j2) {
                return false;
            }
            long j3 = AbstractC0920xb.f7296b;
            long j4 = j2 / j3;
            if (c0885wdM4463n.f4374e == j4 || (c0885wdM4463n = m4463n(j4, c0885wdM4463n)) != null) {
                c0885wdM4463n.m1582a();
                int i = (int) (j2 % j3);
                while (true) {
                    Object objM4997p = c0885wdM4463n.m4997p(i);
                    if (objM4997p == null || objM4997p == AbstractC0920xb.f7299e) {
                        if (c0885wdM4463n.m4996o(i, objM4997p, AbstractC0920xb.f7302h)) {
                            m4461k();
                            break;
                        }
                    } else {
                        if (objM4997p == AbstractC0920xb.f7298d) {
                            return true;
                        }
                        if (objM4997p != AbstractC0920xb.f7304j && objM4997p != AbstractC0920xb.f7306l && objM4997p != AbstractC0920xb.f7303i && objM4997p != AbstractC0920xb.f7302h) {
                            if (objM4997p == AbstractC0920xb.f7301g) {
                                return true;
                            }
                            if (objM4997p != AbstractC0920xb.f7300f && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                f6633f.compareAndSet(this, j2, j2 + 1);
            } else if (((C0885wd) unsafe.getObjectVolatile(this, j)).f4374e < j4) {
                return false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m4470x() {
        Object objectVolatile;
        C0834vb c0834vb;
        loop0: while (true) {
            f6640m.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f6643p;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            C1014zr c1014zr = objectVolatile == null ? AbstractC0920xb.f7311q : AbstractC0920xb.f7312r;
            while (true) {
                Unsafe unsafe2 = uw0.f6315a;
                c0834vb = this;
                if (unsafe2.compareAndSwapObject(c0834vb, f6643p, objectVolatile, c1014zr)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(c0834vb, j) != objectVolatile) {
                    break;
                } else {
                    this = c0834vb;
                }
            }
            this = c0834vb;
        }
        if (objectVolatile == null) {
            return;
        }
        s91.m4048m(1, objectVolatile);
        ((InterfaceC0742sw) objectVolatile).invoke(c0834vb.m4465p());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
    
        r10 = (p000.C0885wd) r10.m1586e();
     */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4471y(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                m4458h(j & 1152921504606846975L);
                if (!z || !m4469v()) {
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(AbstractC0748t1.m4154l("unexpected close status: ", i).toString());
                }
                C0885wd c0885wdM4458h = m4458h(j & 1152921504606846975L);
                Object objM3035K = null;
                loop0: do {
                    int i2 = AbstractC0920xb.f7296b - 1;
                    while (true) {
                        if (-1 >= i2) {
                            break;
                        }
                        long j2 = (c0885wdM4458h.f4374e * ((long) AbstractC0920xb.f7296b)) + ((long) i2);
                        while (true) {
                            Object objM4997p = c0885wdM4458h.m4997p(i2);
                            if (objM4997p == AbstractC0920xb.f7303i) {
                                break loop0;
                            }
                            C1014zr c1014zr = AbstractC0920xb.f7298d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f6633f;
                            if (objM4997p != c1014zr) {
                                if (objM4997p != AbstractC0920xb.f7299e && objM4997p != null) {
                                    if (!(objM4997p instanceof yc1) && !(objM4997p instanceof zc1)) {
                                        C1014zr c1014zr2 = AbstractC0920xb.f7301g;
                                        if (objM4997p == c1014zr2 || objM4997p == AbstractC0920xb.f7300f) {
                                            break loop0;
                                        }
                                        if (objM4997p != c1014zr2) {
                                            break;
                                        }
                                    } else {
                                        if (j2 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        yc1 yc1Var = objM4997p instanceof zc1 ? ((zc1) objM4997p).f7876a : (yc1) objM4997p;
                                        if (c0885wdM4458h.m4996o(i2, objM4997p, AbstractC0920xb.f7306l)) {
                                            objM3035K = pf1.m3035K(objM3035K, yc1Var);
                                            c0885wdM4458h.m4999r(i2, null);
                                            c0885wdM4458h.m2746m();
                                            break;
                                        }
                                    }
                                } else {
                                    if (c0885wdM4458h.m4996o(i2, objM4997p, AbstractC0920xb.f7306l)) {
                                        c0885wdM4458h.m2746m();
                                        break;
                                    }
                                }
                            } else {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (c0885wdM4458h.m4996o(i2, objM4997p, AbstractC0920xb.f7306l)) {
                                    c0885wdM4458h.m4999r(i2, null);
                                    c0885wdM4458h.m2746m();
                                    break;
                                }
                            }
                        }
                        i2--;
                    }
                } while (c0885wdM4458h != null);
                if (objM3035K != null) {
                    if (objM3035K instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM3035K;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            m4449E((yc1) arrayList.get(size), false);
                        }
                    } else {
                        m4449E((yc1) objM3035K, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public boolean mo1711z() {
        return false;
    }
}
