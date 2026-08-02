package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: jn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class C0356jn implements InterfaceC0212fq {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f5112i = AtomicLongFieldUpdater.newUpdater(C0356jn.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicLongFieldUpdater f5113j = AtomicLongFieldUpdater.newUpdater(C0356jn.class, "receivers$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicLongFieldUpdater f5114k = AtomicLongFieldUpdater.newUpdater(C0356jn.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicLongFieldUpdater f5115l = AtomicLongFieldUpdater.newUpdater(C0356jn.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5116m = AtomicReferenceFieldUpdater.newUpdater(C0356jn.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5117n = AtomicReferenceFieldUpdater.newUpdater(C0356jn.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5118o = AtomicReferenceFieldUpdater.newUpdater(C0356jn.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5119p = AtomicReferenceFieldUpdater.newUpdater(C0356jn.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5120q = AtomicReferenceFieldUpdater.newUpdater(C0356jn.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: h */
    public final int f5121h;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public C0356jn(int i) {
        this.f5121h = i;
        if (i < 0) {
            C0676s.m4645c(hk1.m2208g(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        C0589pq c0589pq = AbstractC0430ln.f6199a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f5114k.get(this);
        C0589pq c0589pq2 = new C0589pq(0L, null, this, 3);
        this.sendSegment$volatile = c0589pq2;
        this.receiveSegment$volatile = c0589pq2;
        if (m2543v()) {
            c0589pq2 = AbstractC0430ln.f6199a;
            c0589pq2.getClass();
        }
        this.bufferEndSegment$volatile = c0589pq2;
        this._closeCause$volatile = AbstractC0430ln.f6217s;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m2521B(Object obj) {
        if (!(obj instanceof InterfaceC0432lp)) {
            c80.m677u("Unexpected waiter: ", obj);
            return false;
        }
        InterfaceC0432lp interfaceC0432lp = (InterfaceC0432lp) obj;
        C0589pq c0589pq = AbstractC0430ln.f6199a;
        hh1 hh1VarMo2511l = interfaceC0432lp.mo2511l(a83.f116a, null);
        if (hh1VarMo2511l == null) {
            return false;
        }
        interfaceC0432lp.mo2507C(hh1VarMo2511l);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final C0589pq m2522b(C0356jn c0356jn, long j, C0589pq c0589pq) {
        Object objM6141r;
        C0356jn c0356jn2;
        C0589pq c0589pq2 = AbstractC0430ln.f6199a;
        C0393kn c0393kn = C0393kn.f5654o;
        loop0: while (true) {
            objM6141r = xe1.m6141r(c0589pq, j, c0393kn);
            if (!AbstractC0731te.m5189R(objM6141r)) {
                lm2 lm2VarM5181J = AbstractC0731te.m5181J(objM6141r);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5116m;
                    lm2 lm2Var = (lm2) atomicReferenceFieldUpdater.get(c0356jn);
                    if (lm2Var.f6198c >= lm2VarM5181J.f6198c) {
                        break loop0;
                    }
                    if (!lm2VarM5181J.m2946j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c0356jn, lm2Var, lm2VarM5181J)) {
                        if (atomicReferenceFieldUpdater.get(c0356jn) != lm2Var) {
                            if (lm2VarM5181J.m2944f()) {
                                lm2VarM5181J.m3668e();
                            }
                        }
                    }
                    if (lm2Var.m2944f()) {
                        lm2Var.m3668e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM5189R = AbstractC0731te.m5189R(objM6141r);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5113j;
        if (zM5189R) {
            c0356jn.m2541t();
            if (c0589pq.f6198c * ((long) AbstractC0430ln.f6200b) < atomicLongFieldUpdater.get(c0356jn)) {
                c0589pq.m3666b();
                return null;
            }
        } else {
            C0589pq c0589pq3 = (C0589pq) AbstractC0731te.m5181J(objM6141r);
            long j2 = c0589pq3.f6198c;
            if (j2 <= j) {
                return c0589pq3;
            }
            long j3 = ((long) AbstractC0430ln.f6200b) * j2;
            while (true) {
                long j4 = f5112i.get(c0356jn);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    c0356jn2 = c0356jn;
                    break;
                }
                c0356jn2 = c0356jn;
                if (f5112i.compareAndSet(c0356jn2, j4, (((long) ((int) (j4 >> 60))) << 60) + j5)) {
                    break;
                }
                c0356jn = c0356jn2;
            }
            if (j2 * ((long) AbstractC0430ln.f6200b) < atomicLongFieldUpdater.get(c0356jn2)) {
                c0589pq3.m3666b();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m2523d(C0356jn c0356jn, Object obj, C0469mp c0469mp) {
        c0469mp.mo2509h(new x92(c0356jn.m2538o()));
    }

    /* JADX INFO: renamed from: e */
    public static final int m2524e(C0356jn c0356jn, C0589pq c0589pq, int i, Object obj, long j, Object obj2, boolean z) {
        c0589pq.m3941n(i, obj);
        if (z) {
            return c0356jn.m2528D(c0589pq, i, obj, j, obj2, z);
        }
        Object objM3939l = c0589pq.m3939l(i);
        if (objM3939l == null) {
            if (c0356jn.m2530f(j)) {
                if (c0589pq.m3938k(i, null, AbstractC0430ln.f6202d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c0589pq.m3938k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM3939l instanceof gc3) {
            c0589pq.m3941n(i, null);
            if (c0356jn.m2526A(objM3939l, obj)) {
                c0589pq.m3942o(i, AbstractC0430ln.f6207i);
                return 0;
            }
            hh1 hh1Var = AbstractC0430ln.f6209k;
            if (c0589pq.f8453f.getAndSet((i * 2) + 1, hh1Var) == hh1Var) {
                return 5;
            }
            c0589pq.m3940m(i, true);
            return 5;
        }
        return c0356jn.m2528D(c0589pq, i, obj, j, obj2, z);
    }

    /* JADX INFO: renamed from: q */
    public static void m2525q(C0356jn c0356jn) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5115l;
        if ((atomicLongFieldUpdater.addAndGet(c0356jn, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c0356jn) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m2526A(Object obj, Object obj2) throws j90 {
        if (!(obj instanceof C0319in)) {
            if (!(obj instanceof InterfaceC0432lp)) {
                c80.m677u("Unexpected receiver type: ", obj);
                return false;
            }
            InterfaceC0432lp interfaceC0432lp = (InterfaceC0432lp) obj;
            C0589pq c0589pq = AbstractC0430ln.f6199a;
            hh1 hh1VarMo2511l = interfaceC0432lp.mo2511l(obj2, null);
            if (hh1VarMo2511l == null) {
                return false;
            }
            interfaceC0432lp.mo2507C(hh1VarMo2511l);
            return true;
        }
        C0319in c0319in = (C0319in) obj;
        C0469mp c0469mp = c0319in.f4701i;
        c0469mp.getClass();
        c0319in.f4701i = null;
        c0319in.f4700h = obj2;
        Boolean bool = Boolean.TRUE;
        c0319in.f4702j.getClass();
        C0589pq c0589pq2 = AbstractC0430ln.f6199a;
        hh1 hh1VarMo2511l2 = c0469mp.mo2511l(bool, null);
        if (hh1VarMo2511l2 == null) {
            return false;
        }
        c0469mp.mo2507C(hh1VarMo2511l2);
        return true;
    }

    /* JADX INFO: renamed from: C */
    public final Object m2527C(C0589pq c0589pq, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = c0589pq.f8453f;
        Object objM3939l = c0589pq.m3939l(i);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5112i;
        if (objM3939l == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC0430ln.f6212n;
                }
                if (c0589pq.m3938k(i, objM3939l, obj)) {
                    m2534j();
                    return AbstractC0430ln.f6211m;
                }
            }
        } else if (objM3939l == AbstractC0430ln.f6202d && c0589pq.m3938k(i, objM3939l, AbstractC0430ln.f6207i)) {
            m2534j();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c0589pq.m3941n(i, null);
            return obj2;
        }
        while (true) {
            Object objM3939l2 = c0589pq.m3939l(i);
            if (objM3939l2 == null || objM3939l2 == AbstractC0430ln.f6203e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c0589pq.m3938k(i, objM3939l2, AbstractC0430ln.f6206h)) {
                        m2534j();
                        return AbstractC0430ln.f6213o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC0430ln.f6212n;
                    }
                    if (c0589pq.m3938k(i, objM3939l2, obj)) {
                        m2534j();
                        return AbstractC0430ln.f6211m;
                    }
                }
            } else if (objM3939l2 != AbstractC0430ln.f6202d) {
                hh1 hh1Var = AbstractC0430ln.f6208j;
                if (objM3939l2 == hh1Var) {
                    return AbstractC0430ln.f6213o;
                }
                if (objM3939l2 == AbstractC0430ln.f6206h) {
                    return AbstractC0430ln.f6213o;
                }
                if (objM3939l2 == AbstractC0430ln.f6210l) {
                    m2534j();
                    return AbstractC0430ln.f6213o;
                }
                if (objM3939l2 != AbstractC0430ln.f6205g && c0589pq.m3938k(i, objM3939l2, AbstractC0430ln.f6204f)) {
                    boolean z = objM3939l2 instanceof hc3;
                    if (z) {
                        objM3939l2 = ((hc3) objM3939l2).f3954a;
                    }
                    if (m2521B(objM3939l2)) {
                        c0589pq.m3942o(i, AbstractC0430ln.f6207i);
                        m2534j();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        c0589pq.m3941n(i, null);
                        return obj3;
                    }
                    c0589pq.m3942o(i, hh1Var);
                    c0589pq.m2945i();
                    if (z) {
                        m2534j();
                    }
                    return AbstractC0430ln.f6213o;
                }
            } else if (c0589pq.m3938k(i, objM3939l2, AbstractC0430ln.f6207i)) {
                m2534j();
                Object obj4 = atomicReferenceArray.get(i * 2);
                c0589pq.m3941n(i, null);
                return obj4;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final int m2528D(C0589pq c0589pq, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objM3939l = c0589pq.m3939l(i);
            if (objM3939l == null) {
                if (!m2530f(j) || z) {
                    if (z) {
                        if (c0589pq.m3938k(i, null, AbstractC0430ln.f6208j)) {
                            c0589pq.m2945i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c0589pq.m3938k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c0589pq.m3938k(i, null, AbstractC0430ln.f6202d)) {
                    break;
                }
            } else {
                if (objM3939l != AbstractC0430ln.f6203e) {
                    hh1 hh1Var = AbstractC0430ln.f6209k;
                    if (objM3939l == hh1Var) {
                        c0589pq.m3941n(i, null);
                        return 5;
                    }
                    if (objM3939l == AbstractC0430ln.f6206h) {
                        c0589pq.m3941n(i, null);
                        return 5;
                    }
                    if (objM3939l == AbstractC0430ln.f6210l) {
                        c0589pq.m3941n(i, null);
                        m2541t();
                        return 4;
                    }
                    c0589pq.m3941n(i, null);
                    if (objM3939l instanceof hc3) {
                        objM3939l = ((hc3) objM3939l).f3954a;
                    }
                    if (m2526A(objM3939l, obj)) {
                        c0589pq.m3942o(i, AbstractC0430ln.f6207i);
                        return 0;
                    }
                    if (c0589pq.f8453f.getAndSet((i * 2) + 1, hh1Var) != hh1Var) {
                        c0589pq.m3940m(i, true);
                    }
                    return 5;
                }
                if (c0589pq.m3938k(i, objM3939l, AbstractC0430ln.f6202d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: E */
    public final void m2529E(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C0356jn c0356jn = this;
        if (c0356jn.m2543v()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f5114k;
            if (atomicLongFieldUpdater.get(c0356jn) > j) {
                break;
            } else {
                c0356jn = this;
            }
        }
        int i = AbstractC0430ln.f6201c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5115l;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(c0356jn);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(c0356jn)) && j2 == atomicLongFieldUpdater.get(c0356jn)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(c0356jn);
                    if (atomicLongFieldUpdater2.compareAndSet(c0356jn, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c0356jn = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(c0356jn);
                    long j5 = atomicLongFieldUpdater2.get(c0356jn);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(c0356jn)) {
                        break;
                    }
                    if (z) {
                        c0356jn = this;
                    } else {
                        c0356jn = this;
                        atomicLongFieldUpdater2.compareAndSet(c0356jn, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(c0356jn);
                    if (atomicLongFieldUpdater2.compareAndSet(c0356jn, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        c0356jn = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144 A[RETURN] */
    @Override // p000.ho2
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo2224a(t00 t00Var, Object obj) {
        a83 a83Var;
        Object objM3150t;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5116m;
        C0589pq c0589pq = (C0589pq) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5112i;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM2540r = m2540r(andIncrement, false);
            int i = AbstractC0430ln.f6200b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = c0589pq.f6198c;
            k20 k20Var = k20.f5323h;
            a83Var = a83.f116a;
            if (j4 != j3) {
                C0589pq c0589pqM2522b = m2522b(this, j3, c0589pq);
                if (c0589pqM2522b != null) {
                    c0589pq = c0589pqM2522b;
                } else if (zM2540r) {
                    Object objM2545y = m2545y(t00Var, obj);
                    if (objM2545y == k20Var) {
                        return objM2545y;
                    }
                }
            }
            int iM2524e = m2524e(this, c0589pq, i2, obj, j, null, zM2540r);
            if (iM2524e == 0) {
                c0589pq.m3666b();
                return a83Var;
            }
            if (iM2524e == 1) {
                break;
            }
            if (iM2524e != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5113j;
                if (iM2524e == 3) {
                    C0469mp c0469mpM4221B = qp0.m4221B(gf1.m1908z(t00Var));
                    try {
                        int iM2524e2 = m2524e(this, c0589pq, i2, obj, j, c0469mpM4221B, false);
                        if (iM2524e2 == 0) {
                            c0589pq.m3666b();
                        } else if (iM2524e2 != 1) {
                            if (iM2524e2 != 2) {
                                if (iM2524e2 != 4) {
                                    String str = "unexpected";
                                    if (iM2524e2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    c0589pq.m3666b();
                                    C0589pq c0589pq2 = (C0589pq) atomicReferenceFieldUpdater.get(this);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean zM2540r2 = m2540r(andIncrement2, false);
                                        int i3 = AbstractC0430ln.f6200b;
                                        long j6 = i3;
                                        String str2 = str;
                                        long j7 = j5 / j6;
                                        int i4 = (int) (j5 % j6);
                                        if (c0589pq2.f6198c != j7) {
                                            C0589pq c0589pqM2522b2 = m2522b(this, j7, c0589pq2);
                                            if (c0589pqM2522b2 != null) {
                                                c0589pq2 = c0589pqM2522b2;
                                            } else {
                                                if (zM2540r2) {
                                                    break;
                                                }
                                                str = str2;
                                            }
                                        }
                                        int iM2524e3 = m2524e(this, c0589pq2, i4, obj, j5, c0469mpM4221B, zM2540r2);
                                        if (iM2524e3 == 0) {
                                            c0589pq2.m3666b();
                                            break;
                                        }
                                        if (iM2524e3 == 1) {
                                            break;
                                        }
                                        if (iM2524e3 != 2) {
                                            if (iM2524e3 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (iM2524e3 != 4) {
                                                if (iM2524e3 == 5) {
                                                    c0589pq2.m3666b();
                                                }
                                                str = str2;
                                            } else if (j5 < atomicLongFieldUpdater2.get(this)) {
                                                c0589pq2.m3666b();
                                            }
                                        } else if (zM2540r2) {
                                            c0589pq2.m2945i();
                                        } else {
                                            c0469mpM4221B.mo1829a(c0589pq2, i4 + i3);
                                        }
                                    }
                                } else if (j < atomicLongFieldUpdater2.get(this)) {
                                    c0589pq.m3666b();
                                }
                                m2523d(this, obj, c0469mpM4221B);
                            } else {
                                c0469mpM4221B.mo1829a(c0589pq, i2 + i);
                            }
                            objM3150t = c0469mpM4221B.m3150t();
                            if (objM3150t != k20Var) {
                                objM3150t = a83Var;
                            }
                            if (objM3150t != k20Var) {
                                return objM3150t;
                            }
                        }
                        c0469mpM4221B.mo2509h(a83Var);
                        objM3150t = c0469mpM4221B.m3150t();
                        if (objM3150t != k20Var) {
                        }
                        if (objM3150t != k20Var) {
                            break;
                        }
                    } catch (Throwable th) {
                        c0469mpM4221B.m3140D();
                        throw th;
                    }
                } else if (iM2524e == 4) {
                    if (j < atomicLongFieldUpdater2.get(this)) {
                        c0589pq.m3666b();
                    }
                    Object objM2545y2 = m2545y(t00Var, obj);
                    if (objM2545y2 == k20Var) {
                        return objM2545y2;
                    }
                } else if (iM2524e == 5) {
                    c0589pq.m3666b();
                }
            } else if (zM2540r) {
                c0589pq.m2945i();
                Object objM2545y3 = m2545y(t00Var, obj);
                if (objM2545y3 == k20Var) {
                    return objM2545y3;
                }
            }
        }
        return a83Var;
    }

    @Override // p000.InterfaceC0212fq
    /* JADX INFO: renamed from: c */
    public final void mo1712c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m2531g(cancellationException, true);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2530f(long j) {
        return j < f5114k.get(this) || j < f5113j.get(this) + ((long) this.f5121h);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2531g(Throwable th, boolean z) {
        C0356jn c0356jn;
        boolean z2;
        long j;
        long j2;
        Object obj;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5112i;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                C0589pq c0589pq = AbstractC0430ln.f6199a;
                c0356jn = this;
                if (atomicLongFieldUpdater.compareAndSet(c0356jn, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = c0356jn;
            }
        } else {
            c0356jn = this;
        }
        hh1 hh1Var = AbstractC0430ln.f6217s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5119p;
            if (atomicReferenceFieldUpdater.compareAndSet(c0356jn, hh1Var, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(c0356jn) != hh1Var) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(c0356jn);
            } while (!atomicLongFieldUpdater.compareAndSet(c0356jn, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(c0356jn);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c0356jn, j, j2));
        }
        c0356jn.m2541t();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5120q;
                obj = atomicReferenceFieldUpdater2.get(c0356jn);
                hh1 hh1Var2 = obj == null ? AbstractC0430ln.f6215q : AbstractC0430ln.f6216r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(c0356jn, obj, hh1Var2)) {
                    if (atomicReferenceFieldUpdater2.get(c0356jn) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                xe1.m6119f(1, obj);
                ((in0) obj).mo5j(c0356jn.m2536l());
                return z2;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (p000.C0589pq) ((p000.AbstractC0560oy) p000.AbstractC0560oy.f7874b.get(r1));
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0589pq m2532h(long j) {
        Object objM4549j0;
        long j2;
        Object obj = f5118o.get(this);
        C0589pq c0589pq = (C0589pq) f5116m.get(this);
        if (c0589pq.f6198c > ((C0589pq) obj).f6198c) {
            obj = c0589pq;
        }
        C0589pq c0589pq2 = (C0589pq) f5117n.get(this);
        if (c0589pq2.f6198c > ((C0589pq) obj).f6198c) {
            obj = c0589pq2;
        }
        AbstractC0560oy abstractC0560oy = (AbstractC0560oy) obj;
        loop0: while (true) {
            abstractC0560oy.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0560oy.f7873a;
            Object obj2 = atomicReferenceFieldUpdater.get(abstractC0560oy);
            hh1 hh1Var = xe1.f12996e;
            objM4549j0 = null;
            if (obj2 == hh1Var) {
                break;
            }
            AbstractC0560oy abstractC0560oy2 = (AbstractC0560oy) obj2;
            if (abstractC0560oy2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0560oy, null, hh1Var)) {
                    if (atomicReferenceFieldUpdater.get(abstractC0560oy) != null) {
                        break;
                    }
                }
                break loop0;
            }
            abstractC0560oy = abstractC0560oy2;
        }
        C0589pq c0589pq3 = (C0589pq) abstractC0560oy;
        if (mo2542u()) {
            C0589pq c0589pq4 = c0589pq3;
            loop2: do {
                int i = AbstractC0430ln.f6200b - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (c0589pq4.f6198c * ((long) AbstractC0430ln.f6200b)) + ((long) i);
                    if (j2 < f5113j.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object objM3939l = c0589pq4.m3939l(i);
                        if (objM3939l != null && objM3939l != AbstractC0430ln.f6203e) {
                            if (objM3939l == AbstractC0430ln.f6202d) {
                                break loop2;
                            }
                        } else {
                            if (c0589pq4.m3938k(i, objM3939l, AbstractC0430ln.f6210l)) {
                                c0589pq4.m2945i();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (c0589pq4 != null);
            j2 = -1;
            if (j2 != -1) {
                m2533i(j2);
            }
        }
        loop5: for (C0589pq c0589pq5 = c0589pq3; c0589pq5 != null; c0589pq5 = (C0589pq) ((AbstractC0560oy) AbstractC0560oy.f7874b.get(c0589pq5))) {
            for (int i2 = AbstractC0430ln.f6200b - 1; -1 < i2; i2--) {
                if ((c0589pq5.f6198c * ((long) AbstractC0430ln.f6200b)) + ((long) i2) < j) {
                    break loop5;
                }
                while (true) {
                    Object objM3939l2 = c0589pq5.m3939l(i2);
                    if (objM3939l2 != null && objM3939l2 != AbstractC0430ln.f6203e) {
                        if (!(objM3939l2 instanceof hc3)) {
                            if (!(objM3939l2 instanceof gc3)) {
                                break;
                            }
                            if (c0589pq5.m3938k(i2, objM3939l2, AbstractC0430ln.f6210l)) {
                                objM4549j0 = rp0.m4549j0(objM4549j0, objM3939l2);
                                c0589pq5.m3940m(i2, true);
                                break;
                            }
                        } else {
                            if (c0589pq5.m3938k(i2, objM3939l2, AbstractC0430ln.f6210l)) {
                                objM4549j0 = rp0.m4549j0(objM4549j0, ((hc3) objM3939l2).f3954a);
                                c0589pq5.m3940m(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (c0589pq5.m3938k(i2, objM3939l2, AbstractC0430ln.f6210l)) {
                            c0589pq5.m2945i();
                            break;
                        }
                    }
                }
            }
        }
        if (objM4549j0 != null) {
            if (!(objM4549j0 instanceof ArrayList)) {
                m2546z((gc3) objM4549j0, true);
                return c0589pq3;
            }
            ArrayList arrayList = (ArrayList) objM4549j0;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m2546z((gc3) arrayList.get(size), true);
            }
        }
        return c0589pq3;
    }

    /* JADX INFO: renamed from: i */
    public final void m2533i(long j) {
        C0589pq c0589pq = (C0589pq) f5117n.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5113j;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f5121h) + j2, f5114k.get(this))) {
                return;
            }
            C0356jn c0356jn = this;
            if (atomicLongFieldUpdater.compareAndSet(c0356jn, j2, 1 + j2)) {
                long j3 = AbstractC0430ln.f6200b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c0589pq.f6198c != j4) {
                    C0589pq c0589pqM2535k = c0356jn.m2535k(j4, c0589pq);
                    if (c0589pqM2535k != null) {
                        c0589pq = c0589pqM2535k;
                    }
                }
                C0589pq c0589pq2 = c0589pq;
                if (c0356jn.m2527C(c0589pq2, i, j2, null) != AbstractC0430ln.f6213o || j2 < c0356jn.m2539p()) {
                    c0589pq2.m3666b();
                }
                this = c0356jn;
                c0589pq = c0589pq2;
            }
            this = c0356jn;
        }
    }

    @Override // p000.InterfaceC0212fq
    public final C0319in iterator() {
        return new C0319in(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017b, code lost:
    
        m2525q(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x017e, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2534j() {
        Object objM6141r;
        if (m2543v()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5118o;
        C0589pq c0589pq = (C0589pq) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f5114k.getAndIncrement(this);
            long j = andIncrement / ((long) AbstractC0430ln.f6200b);
            if (m2539p() <= andIncrement) {
                if (c0589pq.f6198c < j && c0589pq.m3667c() != null) {
                    m2544x(j, c0589pq);
                }
                m2525q(this);
                return;
            }
            if (c0589pq.f6198c != j) {
                C0393kn c0393kn = C0393kn.f5654o;
                while (true) {
                    objM6141r = xe1.m6141r(c0589pq, j, c0393kn);
                    if (!AbstractC0731te.m5189R(objM6141r)) {
                        lm2 lm2VarM5181J = AbstractC0731te.m5181J(objM6141r);
                        while (true) {
                            lm2 lm2Var = (lm2) atomicReferenceFieldUpdater.get(this);
                            if (lm2Var.f6198c >= lm2VarM5181J.f6198c) {
                                break;
                            }
                            if (!lm2VarM5181J.m2946j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, lm2Var, lm2VarM5181J)) {
                                if (atomicReferenceFieldUpdater.get(this) != lm2Var) {
                                    if (lm2VarM5181J.m2944f()) {
                                        lm2VarM5181J.m3668e();
                                    }
                                }
                            }
                            if (lm2Var.m2944f()) {
                                lm2Var.m3668e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                C0589pq c0589pq2 = null;
                if (AbstractC0731te.m5189R(objM6141r)) {
                    m2541t();
                    m2544x(j, c0589pq);
                    m2525q(this);
                } else {
                    C0589pq c0589pq3 = (C0589pq) AbstractC0731te.m5181J(objM6141r);
                    long j2 = c0589pq3.f6198c;
                    if (j2 > j) {
                        long j3 = j2 * ((long) AbstractC0430ln.f6200b);
                        if (f5114k.compareAndSet(this, 1 + andIncrement, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f5115l;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            m2525q(this);
                        }
                    } else {
                        c0589pq2 = c0589pq3;
                    }
                }
                if (c0589pq2 == null) {
                    continue;
                } else {
                    c0589pq = c0589pq2;
                }
            }
            int i = (int) (andIncrement % ((long) AbstractC0430ln.f6200b));
            Object objM3939l = c0589pq.m3939l(i);
            boolean z = objM3939l instanceof gc3;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5113j;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !c0589pq.m3938k(i, objM3939l, AbstractC0430ln.f6205g)) {
                while (true) {
                    Object objM3939l2 = c0589pq.m3939l(i);
                    if (!(objM3939l2 instanceof gc3)) {
                        if (objM3939l2 != AbstractC0430ln.f6208j) {
                            if (objM3939l2 != null) {
                                if (objM3939l2 == AbstractC0430ln.f6202d || objM3939l2 == AbstractC0430ln.f6206h || objM3939l2 == AbstractC0430ln.f6207i || objM3939l2 == AbstractC0430ln.f6209k || objM3939l2 == AbstractC0430ln.f6210l) {
                                    break loop0;
                                } else if (objM3939l2 != AbstractC0430ln.f6204f) {
                                    c80.m677u("Unexpected cell state: ", objM3939l2);
                                    return;
                                }
                            } else if (c0589pq.m3938k(i, objM3939l2, AbstractC0430ln.f6203e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (c0589pq.m3938k(i, objM3939l2, new hc3((gc3) objM3939l2))) {
                            break loop0;
                        }
                    } else if (c0589pq.m3938k(i, objM3939l2, AbstractC0430ln.f6205g)) {
                        if (m2521B(objM3939l2)) {
                            c0589pq.m3942o(i, AbstractC0430ln.f6202d);
                            break;
                        } else {
                            c0589pq.m3942o(i, AbstractC0430ln.f6208j);
                            c0589pq.m2945i();
                        }
                    }
                }
            } else if (m2521B(objM3939l)) {
                c0589pq.m3942o(i, AbstractC0430ln.f6202d);
                break;
            } else {
                c0589pq.m3942o(i, AbstractC0430ln.f6208j);
                c0589pq.m2945i();
                m2525q(this);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final C0589pq m2535k(long j, C0589pq c0589pq) {
        Object objM6141r;
        C0356jn c0356jn;
        C0589pq c0589pq2 = AbstractC0430ln.f6199a;
        C0393kn c0393kn = C0393kn.f5654o;
        loop0: while (true) {
            objM6141r = xe1.m6141r(c0589pq, j, c0393kn);
            if (!AbstractC0731te.m5189R(objM6141r)) {
                lm2 lm2VarM5181J = AbstractC0731te.m5181J(objM6141r);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5117n;
                    lm2 lm2Var = (lm2) atomicReferenceFieldUpdater.get(this);
                    if (lm2Var.f6198c >= lm2VarM5181J.f6198c) {
                        break loop0;
                    }
                    if (!lm2VarM5181J.m2946j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, lm2Var, lm2VarM5181J)) {
                        if (atomicReferenceFieldUpdater.get(this) != lm2Var) {
                            if (lm2VarM5181J.m2944f()) {
                                lm2VarM5181J.m3668e();
                            }
                        }
                    }
                    if (lm2Var.m2944f()) {
                        lm2Var.m3668e();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC0731te.m5189R(objM6141r)) {
            m2541t();
            if (c0589pq.f6198c * ((long) AbstractC0430ln.f6200b) < m2539p()) {
                c0589pq.m3666b();
                return null;
            }
        } else {
            C0589pq c0589pq3 = (C0589pq) AbstractC0731te.m5181J(objM6141r);
            long j2 = c0589pq3.f6198c;
            if (!m2543v() && j <= f5114k.get(this) / ((long) AbstractC0430ln.f6200b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5118o;
                    lm2 lm2Var2 = (lm2) atomicReferenceFieldUpdater2.get(this);
                    if (lm2Var2.f6198c >= j2 || !c0589pq3.m2946j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, lm2Var2, c0589pq3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != lm2Var2) {
                            if (c0589pq3.m2944f()) {
                                c0589pq3.m3668e();
                            }
                        }
                    }
                    if (lm2Var2.m2944f()) {
                        lm2Var2.m3668e();
                    }
                }
            }
            if (j2 <= j) {
                return c0589pq3;
            }
            long j3 = j2 * ((long) AbstractC0430ln.f6200b);
            while (true) {
                long j4 = f5113j.get(this);
                if (j4 >= j3) {
                    c0356jn = this;
                    break;
                }
                c0356jn = this;
                if (f5113j.compareAndSet(c0356jn, j4, j3)) {
                    break;
                }
                this = c0356jn;
            }
            if (j2 * ((long) AbstractC0430ln.f6200b) < c0356jn.m2539p()) {
                c0589pq3.m3666b();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final Throwable m2536l() {
        return (Throwable) f5119p.get(this);
    }

    @Override // p000.InterfaceC0212fq
    /* JADX INFO: renamed from: m */
    public final Object mo1713m() {
        C0589pq c0589pq;
        C0552oq c0552oq = AbstractC0691se.f10068a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5113j;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5112i;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (m2540r(j2, true)) {
            return new C0509nq(m2536l());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return c0552oq;
        }
        Object obj = AbstractC0430ln.f6209k;
        C0589pq c0589pq2 = (C0589pq) f5117n.get(this);
        while (!this.m2540r(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = AbstractC0430ln.f6200b;
            long j4 = andIncrement / j3;
            int i = (int) (andIncrement % j3);
            if (c0589pq2.f6198c != j4) {
                C0589pq c0589pqM2535k = this.m2535k(j4, c0589pq2);
                if (c0589pqM2535k == null) {
                    continue;
                } else {
                    c0589pq = c0589pqM2535k;
                }
            } else {
                c0589pq = c0589pq2;
            }
            C0356jn c0356jn = this;
            Object objM2527C = c0356jn.m2527C(c0589pq, i, andIncrement, obj);
            c0589pq2 = c0589pq;
            if (objM2527C == AbstractC0430ln.f6211m) {
                gc3 gc3Var = obj instanceof gc3 ? (gc3) obj : null;
                if (gc3Var != null) {
                    gc3Var.mo1829a(c0589pq2, i);
                }
                c0356jn.m2529E(andIncrement);
                c0589pq2.m2945i();
                return c0552oq;
            }
            if (objM2527C != AbstractC0430ln.f6213o) {
                if (objM2527C != AbstractC0430ln.f6212n) {
                    c0589pq2.m3666b();
                    return objM2527C;
                }
                C0676s.m4653l("unexpected");
                return null;
            }
            if (andIncrement < c0356jn.m2539p()) {
                c0589pq2.m3666b();
            }
            this = c0356jn;
        }
        return new C0509nq(this.m2536l());
    }

    /* JADX INFO: renamed from: n */
    public final Throwable m2537n() {
        Throwable thM2536l = m2536l();
        return thM2536l == null ? new C0785ut("Channel was closed") : thM2536l;
    }

    /* JADX INFO: renamed from: o */
    public final Throwable m2538o() {
        Throwable thM2536l = m2536l();
        return thM2536l == null ? new C0822vt("Channel was closed") : thM2536l;
    }

    /* JADX INFO: renamed from: p */
    public final long m2539p() {
        return f5112i.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (p000.C0589pq) ((p000.AbstractC0560oy) p000.AbstractC0560oy.f7874b.get(r0));
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2540r(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5113j;
            if (i == 2) {
                m2532h(1152921504606846975L & j);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5117n;
                        C0589pq c0589pqM2535k = (C0589pq) atomicReferenceFieldUpdater.get(this);
                        long j2 = atomicLongFieldUpdater.get(this);
                        if (m2539p() <= j2) {
                            break;
                        }
                        long j3 = AbstractC0430ln.f6200b;
                        long j4 = j2 / j3;
                        if (c0589pqM2535k.f6198c != j4 && (c0589pqM2535k = m2535k(j4, c0589pqM2535k)) == null) {
                            if (((C0589pq) atomicReferenceFieldUpdater.get(this)).f6198c < j4) {
                                break;
                            }
                        } else {
                            c0589pqM2535k.m3666b();
                            int i2 = (int) (j2 % j3);
                            while (true) {
                                Object objM3939l = c0589pqM2535k.m3939l(i2);
                                if (objM3939l != null && objM3939l != AbstractC0430ln.f6203e) {
                                    if (objM3939l == AbstractC0430ln.f6202d || (objM3939l != AbstractC0430ln.f6208j && objM3939l != AbstractC0430ln.f6210l && objM3939l != AbstractC0430ln.f6207i && objM3939l != AbstractC0430ln.f6206h && (objM3939l == AbstractC0430ln.f6205g || (objM3939l != AbstractC0430ln.f6204f && j2 == atomicLongFieldUpdater.get(this))))) {
                                        break;
                                    }
                                } else {
                                    if (c0589pqM2535k.m3938k(i2, objM3939l, AbstractC0430ln.f6206h)) {
                                        m2534j();
                                        break;
                                    }
                                }
                            }
                            f5113j.compareAndSet(this, j2, j2 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    c80.m665h(vi0.m5688g("unexpected close status: ", i));
                    return false;
                }
                C0589pq c0589pqM2532h = m2532h(1152921504606846975L & j);
                Object objM4549j0 = null;
                loop0: do {
                    int i3 = AbstractC0430ln.f6200b - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j5 = (c0589pqM2532h.f6198c * ((long) AbstractC0430ln.f6200b)) + ((long) i3);
                        while (true) {
                            Object objM3939l2 = c0589pqM2532h.m3939l(i3);
                            if (objM3939l2 == AbstractC0430ln.f6207i) {
                                break loop0;
                            }
                            if (objM3939l2 != AbstractC0430ln.f6202d) {
                                if (objM3939l2 != AbstractC0430ln.f6203e && objM3939l2 != null) {
                                    if (!(objM3939l2 instanceof gc3) && !(objM3939l2 instanceof hc3)) {
                                        hh1 hh1Var = AbstractC0430ln.f6205g;
                                        if (objM3939l2 == hh1Var || objM3939l2 == AbstractC0430ln.f6204f) {
                                            break loop0;
                                        }
                                        if (objM3939l2 != hh1Var) {
                                            break;
                                        }
                                    } else {
                                        if (j5 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        gc3 gc3Var = objM3939l2 instanceof hc3 ? ((hc3) objM3939l2).f3954a : (gc3) objM3939l2;
                                        if (c0589pqM2532h.m3938k(i3, objM3939l2, AbstractC0430ln.f6210l)) {
                                            objM4549j0 = rp0.m4549j0(objM4549j0, gc3Var);
                                            c0589pqM2532h.m3941n(i3, null);
                                            c0589pqM2532h.m2945i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (c0589pqM2532h.m3938k(i3, objM3939l2, AbstractC0430ln.f6210l)) {
                                        c0589pqM2532h.m2945i();
                                        break;
                                    }
                                }
                            } else {
                                if (j5 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (c0589pqM2532h.m3938k(i3, objM3939l2, AbstractC0430ln.f6210l)) {
                                    c0589pqM2532h.m3941n(i3, null);
                                    c0589pqM2532h.m2945i();
                                    break;
                                }
                            }
                        }
                        i3--;
                    }
                } while (c0589pqM2532h != null);
                if (objM4549j0 != null) {
                    if (objM4549j0 instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM4549j0;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            m2546z((gc3) arrayList.get(size), false);
                        }
                    } else {
                        m2546z((gc3) objM4549j0, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc A[SYNTHETIC] */
    @Override // p000.ho2
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo2225s(Object obj) {
        int iM2524e;
        C0552oq c0552oq = AbstractC0691se.f10068a;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5112i;
        boolean z = false;
        long j = 1152921504606846975L;
        if (m2540r(atomicLongFieldUpdater.get(this), false) ? false : !m2530f(r1 & 1152921504606846975L)) {
            return c0552oq;
        }
        aa3 aa3Var = AbstractC0430ln.f6208j;
        C0589pq c0589pq = (C0589pq) f5116m.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean zM2540r = m2540r(andIncrement, z);
            int i = AbstractC0430ln.f6200b;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (c0589pq.f6198c == j4) {
                iM2524e = m2524e(this, c0589pq, i2, obj, j2, aa3Var, zM2540r);
                a83 a83Var = a83.f116a;
                if (iM2524e != 0) {
                    c0589pq.m3666b();
                    return a83Var;
                }
                if (iM2524e == 1) {
                    return a83Var;
                }
                if (iM2524e == 2) {
                    if (zM2540r) {
                        c0589pq.m2945i();
                        return new C0509nq(m2538o());
                    }
                    gc3 gc3Var = aa3Var instanceof gc3 ? (gc3) aa3Var : null;
                    if (gc3Var != null) {
                        gc3Var.mo1829a(c0589pq, i2 + i);
                    }
                    c0589pq.m2945i();
                    return c0552oq;
                }
                if (iM2524e == 3) {
                    C0676s.m4653l("unexpected");
                    return null;
                }
                if (iM2524e == 4) {
                    if (j2 < f5113j.get(this)) {
                        c0589pq.m3666b();
                    }
                    return new C0509nq(m2538o());
                }
                if (iM2524e == 5) {
                    c0589pq.m3666b();
                }
                z = false;
            } else {
                C0589pq c0589pqM2522b = m2522b(this, j4, c0589pq);
                if (c0589pqM2522b != null) {
                    c0589pq = c0589pqM2522b;
                    iM2524e = m2524e(this, c0589pq, i2, obj, j2, aa3Var, zM2540r);
                    a83 a83Var2 = a83.f116a;
                    if (iM2524e != 0) {
                    }
                } else {
                    if (zM2540r) {
                        return new C0509nq(m2538o());
                    }
                    z = false;
                }
            }
            j = 1152921504606846975L;
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2541t() {
        return m2540r(f5112i.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
    
        r16 = null;
        r3 = (p000.C0589pq) r3.m3667c();
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
        int i = (int) (f5112i.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f5121h + ',');
        sb.append("data=[");
        int i2 = 0;
        List listM1435P = AbstractC0179eu.m1435P(f5117n.get(this), f5116m.get(this), f5118o.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1435P) {
            if (((C0589pq) obj) != AbstractC0430ln.f6199a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            um2.m5513b();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((C0589pq) next).f6198c;
            do {
                Object next2 = it.next();
                long j2 = ((C0589pq) next2).f6198c;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        C0589pq c0589pq = (C0589pq) next;
        long j3 = f5113j.get(this);
        long jM2539p = m2539p();
        loop2: while (true) {
            int i3 = AbstractC0430ln.f6200b;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j4 = (c0589pq.f6198c * ((long) AbstractC0430ln.f6200b)) + ((long) i4);
                if (j4 >= jM2539p && j4 >= j3) {
                    str = null;
                    break loop2;
                }
                Object objM3939l = c0589pq.m3939l(i4);
                Object obj2 = c0589pq.f8453f.get(i4 * 2);
                if (objM3939l instanceof InterfaceC0432lp) {
                    string = (jM2539p > j4 || j4 >= j3) ? (j3 > j4 || j4 >= jM2539p) ? "cont" : "send" : "receive";
                } else if (objM3939l instanceof hc3) {
                    string = "EB(" + objM3939l + ')';
                } else if (t11.m5086l(objM3939l, AbstractC0430ln.f6204f) || t11.m5086l(objM3939l, AbstractC0430ln.f6205g)) {
                    string = "resuming_sender";
                } else if (objM3939l == null || objM3939l.equals(AbstractC0430ln.f6203e) || objM3939l.equals(AbstractC0430ln.f6207i) || objM3939l.equals(AbstractC0430ln.f6206h) || objM3939l.equals(AbstractC0430ln.f6209k) || objM3939l.equals(AbstractC0430ln.f6208j) || objM3939l.equals(AbstractC0430ln.f6210l)) {
                    i4++;
                } else {
                    string = objM3939l.toString();
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i4++;
            }
            i2 = 0;
        }
        if (sb.length() == 0) {
            um2.m5519i("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public boolean mo2542u() {
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m2543v() {
        long j = f5114k.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    @Override // p000.InterfaceC0212fq
    /* JADX INFO: renamed from: w */
    public final Object mo1714w(t00 t00Var) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5117n;
        C0589pq c0589pq = (C0589pq) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5112i;
            boolean z = true;
            if (m2540r(atomicLongFieldUpdater.get(this), true)) {
                Throwable thM2537n = m2537n();
                int i = yt2.f13617a;
                throw thM2537n;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5113j;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j = AbstractC0430ln.f6200b;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (c0589pq.f6198c != j2) {
                C0589pq c0589pqM2535k = m2535k(j2, c0589pq);
                if (c0589pqM2535k == null) {
                    continue;
                } else {
                    c0589pq = c0589pqM2535k;
                }
            }
            Object objM2527C = m2527C(c0589pq, i2, andIncrement, null);
            Object obj = AbstractC0430ln.f6211m;
            if (objM2527C == obj) {
                C0676s.m4653l("unexpected");
                return null;
            }
            Object obj2 = AbstractC0430ln.f6213o;
            if (objM2527C != obj2) {
                if (objM2527C != AbstractC0430ln.f6212n) {
                    c0589pq.m3666b();
                    return objM2527C;
                }
                C0469mp c0469mpM4221B = qp0.m4221B(gf1.m1908z(t00Var));
                try {
                    Object objM2527C2 = m2527C(c0589pq, i2, andIncrement, c0469mpM4221B);
                    if (objM2527C2 == obj) {
                        c0469mpM4221B.mo1829a(c0589pq, i2);
                    } else if (objM2527C2 == obj2) {
                        if (andIncrement < m2539p()) {
                            c0589pq.m3666b();
                        }
                        C0589pq c0589pq2 = (C0589pq) atomicReferenceFieldUpdater.get(this);
                        while (true) {
                            if (m2540r(atomicLongFieldUpdater.get(this), z)) {
                                c0469mpM4221B.mo2509h(new x92(m2537n()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                            long j3 = AbstractC0430ln.f6200b;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            long j4 = andIncrement2 / j3;
                            int i3 = (int) (andIncrement2 % j3);
                            if (c0589pq2.f6198c != j4) {
                                C0589pq c0589pqM2535k2 = m2535k(j4, c0589pq2);
                                if (c0589pqM2535k2 == null) {
                                    continue;
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    z = true;
                                } else {
                                    c0589pq2 = c0589pqM2535k2;
                                }
                            }
                            Object objM2527C3 = m2527C(c0589pq2, i3, andIncrement2, c0469mpM4221B);
                            if (objM2527C3 == AbstractC0430ln.f6211m) {
                                c0469mpM4221B.mo1829a(c0589pq2, i3);
                                break;
                            }
                            if (objM2527C3 == AbstractC0430ln.f6213o) {
                                if (andIncrement2 < m2539p()) {
                                    c0589pq2.m3666b();
                                }
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                z = true;
                            } else {
                                if (objM2527C3 == AbstractC0430ln.f6212n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c0589pq2.m3666b();
                                c0469mpM4221B.mo2510i(objM2527C3, null);
                            }
                        }
                    } else {
                        c0589pq.m3666b();
                        c0469mpM4221B.mo2510i(objM2527C2, null);
                    }
                    return c0469mpM4221B.m3150t();
                } catch (Throwable th) {
                    c0469mpM4221B.m3140D();
                    throw th;
                }
            }
            if (andIncrement < m2539p()) {
                c0589pq.m3666b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2544x(long j, C0589pq c0589pq) {
        C0589pq c0589pq2;
        C0589pq c0589pq3;
        while (c0589pq.f6198c < j && (c0589pq3 = (C0589pq) c0589pq.m3667c()) != null) {
            c0589pq = c0589pq3;
        }
        while (true) {
            if (!c0589pq.mo2943d() || (c0589pq2 = (C0589pq) c0589pq.m3667c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5118o;
                    lm2 lm2Var = (lm2) atomicReferenceFieldUpdater.get(this);
                    if (lm2Var.f6198c >= c0589pq.f6198c) {
                        return;
                    }
                    if (!c0589pq.m2946j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, lm2Var, c0589pq)) {
                        if (atomicReferenceFieldUpdater.get(this) != lm2Var) {
                            if (c0589pq.m2944f()) {
                                c0589pq.m3668e();
                            }
                        }
                    }
                    if (lm2Var.m2944f()) {
                        lm2Var.m3668e();
                        return;
                    }
                    return;
                }
            }
            c0589pq = c0589pq2;
        }
    }

    /* JADX INFO: renamed from: y */
    public final Object m2545y(t00 t00Var, Object obj) {
        C0469mp c0469mp = new C0469mp(1, gf1.m1908z(t00Var));
        c0469mp.m3151u();
        c0469mp.mo2509h(new x92(m2538o()));
        Object objM3150t = c0469mp.m3150t();
        return objM3150t == k20.f5323h ? objM3150t : a83.f116a;
    }

    /* JADX INFO: renamed from: z */
    public final void m2546z(gc3 gc3Var, boolean z) {
        if (gc3Var instanceof InterfaceC0432lp) {
            ((t00) gc3Var).mo2509h(new x92(z ? m2537n() : m2538o()));
            return;
        }
        if (!(gc3Var instanceof C0319in)) {
            c80.m677u("Unexpected waiter: ", gc3Var);
            return;
        }
        C0319in c0319in = (C0319in) gc3Var;
        C0469mp c0469mp = c0319in.f4701i;
        c0469mp.getClass();
        c0319in.f4701i = null;
        c0319in.f4700h = AbstractC0430ln.f6210l;
        Throwable thM2536l = c0319in.f4702j.m2536l();
        if (thM2536l == null) {
            c0469mp.mo2509h(Boolean.FALSE);
        } else {
            c0469mp.mo2509h(new x92(thM2536l));
        }
    }
}
