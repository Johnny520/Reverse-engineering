package p172h3;

import com.bumptech.glide.AbstractC1923e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p011B4.AbstractC0231b;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p121Y1.C1753n;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.C2135g;
import p160f3.InterfaceC2133f;
import p160f3.InterfaceC2158r0;
import p190k3.AbstractC2453a;
import p190k3.AbstractC2470r;
import p190k3.AbstractC2471s;

/* JADX INFO: renamed from: h3.c */
/* JADX INFO: loaded from: classes.dex */
public class C2243c implements InterfaceC2247g {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f7358e = AtomicLongFieldUpdater.newUpdater(C2243c.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f7359f = AtomicLongFieldUpdater.newUpdater(C2243c.class, "receivers$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f7360g = AtomicLongFieldUpdater.newUpdater(C2243c.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f7361h = AtomicLongFieldUpdater.newUpdater(C2243c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7362i = AtomicReferenceFieldUpdater.newUpdater(C2243c.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7363j = AtomicReferenceFieldUpdater.newUpdater(C2243c.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7364k = AtomicReferenceFieldUpdater.newUpdater(C2243c.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7365l = AtomicReferenceFieldUpdater.newUpdater(C2243c.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7366m = AtomicReferenceFieldUpdater.newUpdater(C2243c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: d */
    public final int f7367d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public C2243c(int i5) {
        this.f7367d = i5;
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0231b.m397h(i5, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C2251k c2251k = AbstractC2245e.f7369a;
        this.bufferEnd$volatile = i5 != 0 ? i5 != Integer.MAX_VALUE ? i5 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f7360g.get(this);
        C2251k c2251k2 = new C2251k(0L, null, this, 3);
        this.sendSegment$volatile = c2251k2;
        this.receiveSegment$volatile = c2251k2;
        if (m4097w()) {
            c2251k2 = AbstractC2245e.f7369a;
            AbstractC1665j.m2983c(c2251k2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c2251k2;
        this._closeCause$volatile = AbstractC2245e.f7387s;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m4070B(Object obj) {
        if (!(obj instanceof InterfaceC2133f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        InterfaceC2133f interfaceC2133f = (InterfaceC2133f) obj;
        C2251k c2251k = AbstractC2245e.f7369a;
        C1753n c1753nMo3953s = interfaceC2133f.mo3953s(C0891q.f2780a, null);
        if (c1753nMo3953s == null) {
            return false;
        }
        interfaceC2133f.mo3954v(c1753nMo3953s);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final C2251k m4071b(C2243c c2243c, long j5, C2251k c2251k) {
        Object objM4374b;
        C2243c c2243c2;
        C2251k c2251k2 = AbstractC2245e.f7369a;
        C2244d c2244d = C2244d.f7368k;
        loop0: while (true) {
            objM4374b = AbstractC2453a.m4374b(c2251k, j5, c2244d);
            if (!AbstractC2453a.m4377e(objM4374b)) {
                AbstractC2470r abstractC2470rM4375c = AbstractC2453a.m4375c(objM4374b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7362i;
                    AbstractC2470r abstractC2470r = (AbstractC2470r) atomicReferenceFieldUpdater.get(c2243c);
                    if (abstractC2470r.f7958c >= abstractC2470rM4375c.f7958c) {
                        break loop0;
                    }
                    if (!abstractC2470rM4375c.m4407i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c2243c, abstractC2470r, abstractC2470rM4375c)) {
                        if (atomicReferenceFieldUpdater.get(c2243c) != abstractC2470r) {
                            if (abstractC2470rM4375c.m4405e()) {
                                abstractC2470rM4375c.m4388d();
                            }
                        }
                    }
                    if (abstractC2470r.m4405e()) {
                        abstractC2470r.m4388d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM4377e = AbstractC2453a.m4377e(objM4374b);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7359f;
        if (zM4377e) {
            c2243c.m4085j();
            if (c2251k.f7958c * ((long) AbstractC2245e.f7370b) < atomicLongFieldUpdater.get(c2243c)) {
                c2251k.m4385a();
                return null;
            }
        } else {
            C2251k c2251k3 = (C2251k) AbstractC2453a.m4375c(objM4374b);
            long j6 = c2251k3.f7958c;
            if (j6 <= j5) {
                return c2251k3;
            }
            long j7 = ((long) AbstractC2245e.f7370b) * j6;
            while (true) {
                long j8 = f7358e.get(c2243c);
                long j9 = 1152921504606846975L & j8;
                if (j9 >= j7) {
                    c2243c2 = c2243c;
                    break;
                }
                c2243c2 = c2243c;
                if (f7358e.compareAndSet(c2243c2, j8, (((long) ((int) (j8 >> 60))) << 60) + j9)) {
                    break;
                }
                c2243c = c2243c2;
            }
            if (j6 * ((long) AbstractC2245e.f7370b) < atomicLongFieldUpdater.get(c2243c2)) {
                c2251k3.m4385a();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m4072d(C2243c c2243c, Object obj, C2135g c2135g) {
        c2135g.mo278i(AbstractC1784a.m3229o(c2243c.m4093r()));
    }

    /* JADX INFO: renamed from: e */
    public static final int m4073e(C2243c c2243c, C2251k c2251k, int i5, Object obj, long j5, Object obj2, boolean z5) {
        c2251k.m4107m(i5, obj);
        if (z5) {
            return c2243c.m4077D(c2251k, i5, obj, j5, obj2, z5);
        }
        Object objM4105k = c2251k.m4105k(i5);
        if (objM4105k == null) {
            if (c2243c.m4081f(j5)) {
                if (c2251k.m4104j(i5, null, AbstractC2245e.f7372d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c2251k.m4104j(i5, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM4105k instanceof InterfaceC2158r0) {
            c2251k.m4107m(i5, null);
            if (c2243c.m4075A(objM4105k, obj)) {
                c2251k.m4108n(i5, AbstractC2245e.f7377i);
                return 0;
            }
            C1753n c1753n = AbstractC2245e.f7379k;
            if (c2251k.f7394f.getAndSet((i5 * 2) + 1, c1753n) == c1753n) {
                return 5;
            }
            c2251k.m4106l(i5, true);
            return 5;
        }
        return c2243c.m4077D(c2251k, i5, obj, j5, obj2, z5);
    }

    /* JADX INFO: renamed from: t */
    public static void m4074t(C2243c c2243c) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7361h;
        if ((atomicLongFieldUpdater.addAndGet(c2243c, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c2243c) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m4075A(Object obj, Object obj2) {
        if (!(obj instanceof C2242b)) {
            if (!(obj instanceof InterfaceC2133f)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            InterfaceC2133f interfaceC2133f = (InterfaceC2133f) obj;
            C2251k c2251k = AbstractC2245e.f7369a;
            C1753n c1753nMo3953s = interfaceC2133f.mo3953s(obj2, null);
            if (c1753nMo3953s == null) {
                return false;
            }
            interfaceC2133f.mo3954v(c1753nMo3953s);
            return true;
        }
        C2242b c2242b = (C2242b) obj;
        C2135g c2135g = c2242b.f7356e;
        AbstractC1665j.m2982b(c2135g);
        c2242b.f7356e = null;
        c2242b.f7355d = obj2;
        Boolean bool = Boolean.TRUE;
        c2242b.f7357f.getClass();
        C2251k c2251k2 = AbstractC2245e.f7369a;
        C1753n c1753nMo3953s2 = c2135g.mo3953s(bool, null);
        if (c1753nMo3953s2 == null) {
            return false;
        }
        c2135g.mo3954v(c1753nMo3953s2);
        return true;
    }

    /* JADX INFO: renamed from: C */
    public final Object m4076C(C2251k c2251k, int i5, long j5, Object obj) {
        AtomicReferenceArray atomicReferenceArray = c2251k.f7394f;
        Object objM4105k = c2251k.m4105k(i5);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7358e;
        if (objM4105k == null) {
            if (j5 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC2245e.f7382n;
                }
                if (c2251k.m4104j(i5, objM4105k, obj)) {
                    m4087l();
                    return AbstractC2245e.f7381m;
                }
            }
        } else if (objM4105k == AbstractC2245e.f7372d && c2251k.m4104j(i5, objM4105k, AbstractC2245e.f7377i)) {
            m4087l();
            Object obj2 = atomicReferenceArray.get(i5 * 2);
            c2251k.m4107m(i5, null);
            return obj2;
        }
        while (true) {
            Object objM4105k2 = c2251k.m4105k(i5);
            if (objM4105k2 == null || objM4105k2 == AbstractC2245e.f7373e) {
                if (j5 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c2251k.m4104j(i5, objM4105k2, AbstractC2245e.f7376h)) {
                        m4087l();
                        return AbstractC2245e.f7383o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC2245e.f7382n;
                    }
                    if (c2251k.m4104j(i5, objM4105k2, obj)) {
                        m4087l();
                        return AbstractC2245e.f7381m;
                    }
                }
            } else if (objM4105k2 != AbstractC2245e.f7372d) {
                C1753n c1753n = AbstractC2245e.f7378j;
                if (objM4105k2 == c1753n) {
                    return AbstractC2245e.f7383o;
                }
                if (objM4105k2 == AbstractC2245e.f7376h) {
                    return AbstractC2245e.f7383o;
                }
                if (objM4105k2 == AbstractC2245e.f7380l) {
                    m4087l();
                    return AbstractC2245e.f7383o;
                }
                if (objM4105k2 != AbstractC2245e.f7375g && c2251k.m4104j(i5, objM4105k2, AbstractC2245e.f7374f)) {
                    boolean z5 = objM4105k2 instanceof C2259s;
                    if (z5) {
                        objM4105k2 = ((C2259s) objM4105k2).f7397a;
                    }
                    if (m4070B(objM4105k2)) {
                        c2251k.m4108n(i5, AbstractC2245e.f7377i);
                        m4087l();
                        Object obj3 = atomicReferenceArray.get(i5 * 2);
                        c2251k.m4107m(i5, null);
                        return obj3;
                    }
                    c2251k.m4108n(i5, c1753n);
                    c2251k.m4406h();
                    if (z5) {
                        m4087l();
                    }
                    return AbstractC2245e.f7383o;
                }
            } else if (c2251k.m4104j(i5, objM4105k2, AbstractC2245e.f7377i)) {
                m4087l();
                Object obj4 = atomicReferenceArray.get(i5 * 2);
                c2251k.m4107m(i5, null);
                return obj4;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final int m4077D(C2251k c2251k, int i5, Object obj, long j5, Object obj2, boolean z5) {
        while (true) {
            Object objM4105k = c2251k.m4105k(i5);
            if (objM4105k == null) {
                if (!m4081f(j5) || z5) {
                    if (z5) {
                        if (c2251k.m4104j(i5, null, AbstractC2245e.f7378j)) {
                            c2251k.m4406h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c2251k.m4104j(i5, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c2251k.m4104j(i5, null, AbstractC2245e.f7372d)) {
                    break;
                }
            } else {
                if (objM4105k != AbstractC2245e.f7373e) {
                    C1753n c1753n = AbstractC2245e.f7379k;
                    if (objM4105k == c1753n) {
                        c2251k.m4107m(i5, null);
                        return 5;
                    }
                    if (objM4105k == AbstractC2245e.f7376h) {
                        c2251k.m4107m(i5, null);
                        return 5;
                    }
                    if (objM4105k == AbstractC2245e.f7380l) {
                        c2251k.m4107m(i5, null);
                        m4085j();
                        return 4;
                    }
                    c2251k.m4107m(i5, null);
                    if (objM4105k instanceof C2259s) {
                        objM4105k = ((C2259s) objM4105k).f7397a;
                    }
                    if (m4075A(objM4105k, obj)) {
                        c2251k.m4108n(i5, AbstractC2245e.f7377i);
                        return 0;
                    }
                    if (c2251k.f7394f.getAndSet((i5 * 2) + 1, c1753n) != c1753n) {
                        c2251k.m4106l(i5, true);
                    }
                    return 5;
                }
                if (c2251k.m4104j(i5, objM4105k, AbstractC2245e.f7372d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: E */
    public final void m4078E(long j5) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C2243c c2243c = this;
        if (c2243c.m4097w()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f7360g;
            if (atomicLongFieldUpdater.get(c2243c) > j5) {
                break;
            } else {
                c2243c = this;
            }
        }
        int i5 = AbstractC2245e.f7371c;
        int i6 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7361h;
            if (i6 < i5) {
                long j6 = atomicLongFieldUpdater.get(c2243c);
                if (j6 == (4611686018427387903L & atomicLongFieldUpdater2.get(c2243c)) && j6 == atomicLongFieldUpdater.get(c2243c)) {
                    return;
                } else {
                    i6++;
                }
            } else {
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(c2243c);
                    if (atomicLongFieldUpdater2.compareAndSet(c2243c, j7, (j7 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c2243c = this;
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater.get(c2243c);
                    long j9 = atomicLongFieldUpdater2.get(c2243c);
                    long j10 = j9 & 4611686018427387903L;
                    boolean z5 = (j9 & 4611686018427387904L) != 0;
                    if (j8 == j10 && j8 == atomicLongFieldUpdater.get(c2243c)) {
                        break;
                    }
                    if (z5) {
                        c2243c = this;
                    } else {
                        c2243c = this;
                        atomicLongFieldUpdater2.compareAndSet(c2243c, j9, 4611686018427387904L + j10);
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(c2243c);
                    if (atomicLongFieldUpdater2.compareAndSet(c2243c, j11, j11 & 4611686018427387903L)) {
                        return;
                    } else {
                        c2243c = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        m4072d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163 A[RETURN] */
    @Override // p172h3.InterfaceC2258r
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo4079a(p074O2.InterfaceC1046d r23, java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p172h3.C2243c.mo4079a(O2.d, java.lang.Object):java.lang.Object");
    }

    @Override // p172h3.InterfaceC2257q
    /* JADX INFO: renamed from: c */
    public final void mo4080c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m4083h(cancellationException, true);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4081f(long j5) {
        return j5 < f7360g.get(this) || j5 < f7359f.get(this) + ((long) this.f7367d);
    }

    @Override // p172h3.InterfaceC2257q
    /* JADX INFO: renamed from: g */
    public final Object mo4082g() {
        C2251k c2251k;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7359f;
        long j5 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7358e;
        long j6 = atomicLongFieldUpdater2.get(this);
        if (m4095u(j6, true)) {
            return new C2248h(m4089n());
        }
        long j7 = j6 & 1152921504606846975L;
        C2249i c2249i = AbstractC2250j.f7392a;
        if (j5 >= j7) {
            return c2249i;
        }
        Object obj = AbstractC2245e.f7379k;
        C2251k c2251k2 = (C2251k) f7363j.get(this);
        while (!m4095u(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j8 = AbstractC2245e.f7370b;
            long j9 = andIncrement / j8;
            int i5 = (int) (andIncrement % j8);
            if (c2251k2.f7958c != j9) {
                C2251k c2251kM4088m = m4088m(j9, c2251k2);
                if (c2251kM4088m == null) {
                    continue;
                } else {
                    c2251k = c2251kM4088m;
                }
            } else {
                c2251k = c2251k2;
            }
            Object objM4076C = m4076C(c2251k, i5, andIncrement, obj);
            C2251k c2251k3 = c2251k;
            if (objM4076C == AbstractC2245e.f7381m) {
                InterfaceC2158r0 interfaceC2158r0 = obj instanceof InterfaceC2158r0 ? (InterfaceC2158r0) obj : null;
                if (interfaceC2158r0 != null) {
                    interfaceC2158r0.mo3961a(c2251k3, i5);
                }
                m4078E(andIncrement);
                c2251k3.m4406h();
                return c2249i;
            }
            if (objM4076C != AbstractC2245e.f7383o) {
                if (objM4076C == AbstractC2245e.f7382n) {
                    throw new IllegalStateException("unexpected");
                }
                c2251k3.m4385a();
                return objM4076C;
            }
            if (andIncrement < m4094s()) {
                c2251k3.m4385a();
            }
            c2251k2 = c2251k3;
        }
        return new C2248h(m4089n());
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4083h(Throwable th, boolean z5) {
        C2243c c2243c;
        boolean z6;
        long j5;
        long j6;
        long j7;
        Object obj;
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7358e;
        if (!z5) {
            c2243c = this;
            break;
        }
        do {
            j9 = atomicLongFieldUpdater.get(this);
            if (((int) (j9 >> 60)) != 0) {
                c2243c = this;
                break;
            }
            C2251k c2251k = AbstractC2245e.f7369a;
            c2243c = this;
        } while (!atomicLongFieldUpdater.compareAndSet(c2243c, j9, (j9 & 1152921504606846975L) + (((long) 1) << 60)));
        C1753n c1753n = AbstractC2245e.f7387s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7365l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c1753n, th)) {
                z6 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c1753n) {
                z6 = false;
                break;
            }
        }
        if (z5) {
            do {
                j8 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(c2243c, j8, (((long) 3) << 60) + (j8 & 1152921504606846975L)));
        } else {
            do {
                j5 = atomicLongFieldUpdater.get(this);
                int i5 = (int) (j5 >> 60);
                if (i5 == 0) {
                    j6 = j5 & 1152921504606846975L;
                    j7 = 2;
                } else {
                    if (i5 != 1) {
                        break;
                    }
                    j6 = j5 & 1152921504606846975L;
                    j7 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c2243c, j5, (j7 << 60) + j6));
        }
        m4085j();
        if (z6) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7366m;
                obj = atomicReferenceFieldUpdater2.get(this);
                C1753n c1753n2 = obj == null ? AbstractC2245e.f7385q : AbstractC2245e.f7386r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c1753n2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                AbstractC1678w.m2998b(1, obj);
                ((InterfaceC1601c) obj).mo1h(m4089n());
                return z6;
            }
        }
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (p172h3.C2251k) ((p190k3.AbstractC2454b) p190k3.AbstractC2454b.f7925b.get(r1));
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p172h3.C2251k m4084i(long r13) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p172h3.C2243c.m4084i(long):h3.k");
    }

    @Override // p172h3.InterfaceC2257q
    public final C2242b iterator() {
        return new C2242b(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m4085j() {
        m4095u(f7358e.get(this), false);
    }

    /* JADX INFO: renamed from: k */
    public final void m4086k(long j5) {
        C2251k c2251k = (C2251k) f7363j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7359f;
            long j6 = atomicLongFieldUpdater.get(this);
            if (j5 < Math.max(((long) this.f7367d) + j6, f7360g.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j6, 1 + j6)) {
                long j7 = AbstractC2245e.f7370b;
                long j8 = j6 / j7;
                int i5 = (int) (j6 % j7);
                if (c2251k.f7958c != j8) {
                    C2251k c2251kM4088m = m4088m(j8, c2251k);
                    if (c2251kM4088m != null) {
                        c2251k = c2251kM4088m;
                    }
                }
                C2251k c2251k2 = c2251k;
                if (m4076C(c2251k2, i5, j6, null) != AbstractC2245e.f7383o || j6 < m4094s()) {
                    c2251k2.m4385a();
                }
                c2251k = c2251k2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        m4074t(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4087l() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p172h3.C2243c.m4087l():void");
    }

    /* JADX INFO: renamed from: m */
    public final C2251k m4088m(long j5, C2251k c2251k) {
        Object objM4374b;
        long j6;
        C2251k c2251k2 = AbstractC2245e.f7369a;
        C2244d c2244d = C2244d.f7368k;
        loop0: while (true) {
            objM4374b = AbstractC2453a.m4374b(c2251k, j5, c2244d);
            if (!AbstractC2453a.m4377e(objM4374b)) {
                AbstractC2470r abstractC2470rM4375c = AbstractC2453a.m4375c(objM4374b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7363j;
                    AbstractC2470r abstractC2470r = (AbstractC2470r) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2470r.f7958c >= abstractC2470rM4375c.f7958c) {
                        break loop0;
                    }
                    if (!abstractC2470rM4375c.m4407i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC2470r, abstractC2470rM4375c)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC2470r) {
                            if (abstractC2470rM4375c.m4405e()) {
                                abstractC2470rM4375c.m4388d();
                            }
                        }
                    }
                    if (abstractC2470r.m4405e()) {
                        abstractC2470r.m4388d();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC2453a.m4377e(objM4374b)) {
            m4085j();
            if (c2251k.f7958c * ((long) AbstractC2245e.f7370b) < m4094s()) {
                c2251k.m4385a();
                return null;
            }
        } else {
            C2251k c2251k3 = (C2251k) AbstractC2453a.m4375c(objM4374b);
            long j7 = c2251k3.f7958c;
            if (!m4097w() && j5 <= f7360g.get(this) / ((long) AbstractC2245e.f7370b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7364k;
                    AbstractC2470r abstractC2470r2 = (AbstractC2470r) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC2470r2.f7958c >= j7 || !c2251k3.m4407i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC2470r2, c2251k3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != abstractC2470r2) {
                            if (c2251k3.m4405e()) {
                                c2251k3.m4388d();
                            }
                        }
                    }
                    if (abstractC2470r2.m4405e()) {
                        abstractC2470r2.m4388d();
                    }
                }
            }
            if (j7 <= j5) {
                return c2251k3;
            }
            long j8 = j7 * ((long) AbstractC2245e.f7370b);
            do {
                j6 = f7359f.get(this);
                if (j6 >= j8) {
                    break;
                }
            } while (!f7359f.compareAndSet(this, j6, j8));
            if (j7 * ((long) AbstractC2245e.f7370b) < m4094s()) {
                c2251k3.m4385a();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final Throwable m4089n() {
        return (Throwable) f7365l.get(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // p172h3.InterfaceC2258r
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo4090o(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = p172h3.C2243c.f7358e
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.m4095u(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.m4081f(r1)
            r1 = r1 ^ r10
        L1b:
            h3.i r13 = p172h3.AbstractC2250j.f7392a
            if (r1 == 0) goto L20
            return r13
        L20:
            Y1.n r6 = p172h3.AbstractC2245e.f7378j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p172h3.C2243c.f7362i
            java.lang.Object r1 = r1.get(r15)
            h3.k r1 = (p172h3.C2251k) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.m4095u(r2, r9)
            int r14 = p172h3.AbstractC2245e.f7370b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f7958c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            h3.k r3 = m4071b(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.m4093r()
            h3.h r2 = new h3.h
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = m4073e(r0, r1, r2, r3, r4, r6, r7)
            K2.q r3 = p056K2.C0891q.f2780a
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.m4385a()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p172h3.C2243c.f7359f
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.m4385a()
        L8a:
            java.lang.Throwable r1 = r15.m4093r()
            h3.h r2 = new h3.h
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.m4406h()
            java.lang.Throwable r1 = r15.m4093r()
            h3.h r2 = new h3.h
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof p160f3.InterfaceC2158r0
            if (r3 == 0) goto Lb2
            f3.r0 r6 = (p160f3.InterfaceC2158r0) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.mo3961a(r1, r2)
        Lb9:
            r1.m4406h()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.m4385a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p172h3.C2243c.mo4090o(java.lang.Object):java.lang.Object");
    }

    @Override // p172h3.InterfaceC2257q
    /* JADX INFO: renamed from: p */
    public final Object mo4091p(InterfaceC1046d interfaceC1046d) throws Throwable {
        C2251k c2251kM4088m;
        C2243c c2243c = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7363j;
        C2251k c2251k = (C2251k) atomicReferenceFieldUpdater.get(c2243c);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7358e;
            if (c2243c.m4095u(atomicLongFieldUpdater.get(c2243c), true)) {
                Throwable thM4092q = m4092q();
                int i5 = AbstractC2471s.f7959a;
                throw thM4092q;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7359f;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(c2243c);
            long j5 = AbstractC2245e.f7370b;
            long j6 = andIncrement / j5;
            int i6 = (int) (andIncrement % j5);
            if (c2251k.f7958c != j6) {
                C2251k c2251kM4088m2 = c2243c.m4088m(j6, c2251k);
                if (c2251kM4088m2 == null) {
                    continue;
                } else {
                    c2251k = c2251kM4088m2;
                }
            }
            Object objM4076C = c2243c.m4076C(c2251k, i6, andIncrement, null);
            C1753n c1753n = AbstractC2245e.f7381m;
            if (objM4076C == c1753n) {
                throw new IllegalStateException("unexpected");
            }
            C1753n c1753n2 = AbstractC2245e.f7383o;
            if (objM4076C != c1753n2) {
                if (objM4076C != AbstractC2245e.f7382n) {
                    c2251k.m4385a();
                    return objM4076C;
                }
                C2135g c2135gM3989k = AbstractC2162v.m3989k(AbstractC1923e.m3448G(interfaceC1046d));
                C2243c c2243c2 = this;
                try {
                    Object objM4076C2 = c2243c2.m4076C(c2251k, i6, andIncrement, c2135gM3989k);
                    if (objM4076C2 == c1753n) {
                        c2135gM3989k.mo3961a(c2251k, i6);
                    } else if (objM4076C2 == c1753n2) {
                        if (andIncrement < c2243c2.m4094s()) {
                            c2251k.m4385a();
                        }
                        C2251k c2251k2 = (C2251k) atomicReferenceFieldUpdater.get(c2243c2);
                        while (true) {
                            if (c2243c2.m4095u(atomicLongFieldUpdater.get(c2243c2), true)) {
                                c2135gM3989k.mo278i(AbstractC1784a.m3229o(c2243c2.m4092q()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(c2243c2);
                            long j7 = AbstractC2245e.f7370b;
                            long j8 = andIncrement2 / j7;
                            int i7 = (int) (andIncrement2 % j7);
                            if (c2251k2.f7958c != j8) {
                                c2251kM4088m = c2243c2.m4088m(j8, c2251k2);
                                if (c2251kM4088m == null) {
                                }
                            } else {
                                c2251kM4088m = c2251k2;
                            }
                            Object objM4076C3 = c2243c2.m4076C(c2251kM4088m, i7, andIncrement2, c2135gM3989k);
                            if (objM4076C3 == AbstractC2245e.f7381m) {
                                c2135gM3989k.mo3961a(c2251kM4088m, i7);
                                break;
                            }
                            if (objM4076C3 == AbstractC2245e.f7383o) {
                                if (andIncrement2 < m4094s()) {
                                    c2251kM4088m.m4385a();
                                }
                                c2243c2 = this;
                                c2251k2 = c2251kM4088m;
                            } else {
                                if (objM4076C3 == AbstractC2245e.f7382n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c2251kM4088m.m4385a();
                                c2135gM3989k.m3958C(objM4076C3, null);
                            }
                        }
                    } else {
                        c2251k.m4385a();
                        c2135gM3989k.m3958C(objM4076C2, null);
                    }
                    return c2135gM3989k.m3967r();
                } catch (Throwable th) {
                    c2135gM3989k.m3957B();
                    throw th;
                }
            }
            if (andIncrement < m4094s()) {
                c2251k.m4385a();
            }
            c2243c = this;
        }
    }

    /* JADX INFO: renamed from: q */
    public final Throwable m4092q() {
        Throwable thM4089n = m4089n();
        return thM4089n == null ? new C2252l("Channel was closed") : thM4089n;
    }

    /* JADX INFO: renamed from: r */
    public final Throwable m4093r() {
        Throwable thM4089n = m4089n();
        return thM4089n == null ? new C2253m("Channel was closed") : thM4089n;
    }

    /* JADX INFO: renamed from: s */
    public final long m4094s() {
        return f7358e.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
    
        r16 = r7;
        r3 = (p172h3.C2251k) r3.m4386b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p172h3.C2243c.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (p172h3.C2251k) ((p190k3.AbstractC2454b) p190k3.AbstractC2454b.f7925b.get(r0));
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4095u(long r14, boolean r16) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p172h3.C2243c.m4095u(long, boolean):boolean");
    }

    /* JADX INFO: renamed from: v */
    public boolean mo4096v() {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m4097w() {
        long j5 = f7360g.get(this);
        return j5 == 0 || j5 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4098x(long r5, p172h3.C2251k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f7958c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            k3.b r0 = r7.m4386b()
            h3.k r0 = (p172h3.C2251k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.mo4387c()
            if (r5 == 0) goto L22
            k3.b r5 = r7.m4386b()
            h3.k r5 = (p172h3.C2251k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p172h3.C2243c.f7364k
            java.lang.Object r6 = r5.get(r4)
            k3.r r6 = (p190k3.AbstractC2470r) r6
            long r0 = r6.f7958c
            long r2 = r7.f7958c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.m4407i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.m4405e()
            if (r5 == 0) goto L49
            r6.m4388d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.m4405e()
            if (r5 == 0) goto L22
            r7.m4388d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: p172h3.C2243c.m4098x(long, h3.k):void");
    }

    /* JADX INFO: renamed from: y */
    public final Object m4099y(InterfaceC1046d interfaceC1046d, Object obj) {
        C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(interfaceC1046d));
        c2135g.m3968t();
        c2135g.mo278i(AbstractC1784a.m3229o(m4093r()));
        Object objM3967r = c2135g.m3967r();
        return objM3967r == EnumC1152a.f3788d ? objM3967r : C0891q.f2780a;
    }

    /* JADX INFO: renamed from: z */
    public final void m4100z(InterfaceC2158r0 interfaceC2158r0, boolean z5) {
        if (interfaceC2158r0 instanceof InterfaceC2133f) {
            ((InterfaceC1046d) interfaceC2158r0).mo278i(AbstractC1784a.m3229o(z5 ? m4092q() : m4093r()));
            return;
        }
        if (!(interfaceC2158r0 instanceof C2242b)) {
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC2158r0).toString());
        }
        C2242b c2242b = (C2242b) interfaceC2158r0;
        C2135g c2135g = c2242b.f7356e;
        AbstractC1665j.m2982b(c2135g);
        c2242b.f7356e = null;
        c2242b.f7355d = AbstractC2245e.f7380l;
        Throwable thM4089n = c2242b.f7357f.m4089n();
        if (thM4089n == null) {
            c2135g.mo278i(Boolean.FALSE);
        } else {
            c2135g.mo278i(AbstractC1784a.m3229o(thM4089n));
        }
    }
}
