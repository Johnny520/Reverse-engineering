package p172h3;

import com.bumptech.glide.AbstractC1923e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p011B4.AbstractC0231b;
import p056K2.C0891q;
import p061L2.AbstractC0972l;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p121Y1.C1753n;
import p127Z2.AbstractC1784a;
import p149d3.AbstractC1976d;
import p160f3.AbstractC2162v;
import p160f3.C2135g;
import p160f3.InterfaceC2133f;
import p160f3.InterfaceC2158r0;
import p178i3.InterfaceC2323d;
import p190k3.AbstractC2453a;
import p190k3.AbstractC2454b;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m4072d(C2243c c2243c, Object obj, C2135g c2135g) {
        c2135g.mo278i(AbstractC1784a.m3229o(c2243c.m4093r()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static void m4074t(C2243c c2243c) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7361h;
        if ((atomicLongFieldUpdater.addAndGet(c2243c, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c2243c) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    */
    public Object mo4079a(InterfaceC1046d interfaceC1046d, Object obj) throws Throwable {
        int iM4073e;
        Object objM3967r;
        Object obj2;
        C2243c c2243c;
        C2251k c2251k;
        int i5;
        C2243c c2243c2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7362i;
        C2251k c2251k2 = (C2251k) atomicReferenceFieldUpdater.get(c2243c2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7358e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c2243c2);
            long j5 = andIncrement & 1152921504606846975L;
            boolean zM4095u = c2243c2.m4095u(andIncrement, false);
            int i6 = AbstractC2245e.f7370b;
            long j6 = i6;
            long j7 = j5 / j6;
            int i7 = (int) (j5 % j6);
            long j8 = c2251k2.f7958c;
            EnumC1152a enumC1152a = EnumC1152a.f3788d;
            C0891q c0891q = C0891q.f2780a;
            if (j8 != j7) {
                C2251k c2251kM4071b = m4071b(c2243c2, j7, c2251k2);
                if (c2251kM4071b != null) {
                    c2251k2 = c2251kM4071b;
                } else if (zM4095u) {
                    Object objM4099y = m4099y(interfaceC1046d, obj);
                    if (objM4099y == enumC1152a) {
                        return objM4099y;
                    }
                }
            }
            int iM4073e2 = m4073e(c2243c2, c2251k2, i7, obj, j5, null, zM4095u);
            if (iM4073e2 == 0) {
                c2251k2.m4385a();
                return c0891q;
            }
            if (iM4073e2 == 1) {
                break;
            }
            if (iM4073e2 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7359f;
                if (iM4073e2 == 3) {
                    C2135g c2135gM3989k = AbstractC2162v.m3989k(AbstractC1923e.m3448G(interfaceC1046d));
                    Object obj3 = obj;
                    try {
                        iM4073e = m4073e(c2243c2, c2251k2, i7, obj3, j5, c2135gM3989k, false);
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (iM4073e != 0) {
                        if (iM4073e == 1) {
                            c2135gM3989k.mo278i(c0891q);
                        } else if (iM4073e != 2) {
                            if (iM4073e != 4) {
                                String str = "unexpected";
                                if (iM4073e != 5) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c2251k2.m4385a();
                                C2251k c2251k3 = (C2251k) atomicReferenceFieldUpdater.get(c2243c2);
                                while (true) {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c2243c2);
                                    long j9 = andIncrement2 & 1152921504606846975L;
                                    boolean zM4095u2 = c2243c2.m4095u(andIncrement2, false);
                                    int i8 = AbstractC2245e.f7370b;
                                    long j10 = i8;
                                    String str2 = str;
                                    long j11 = j9 / j10;
                                    int i9 = (int) (j9 % j10);
                                    if (c2251k3.f7958c != j11) {
                                        C2251k c2251kM4071b2 = m4071b(c2243c2, j11, c2251k3);
                                        if (c2251kM4071b2 != null) {
                                            i5 = i8;
                                            c2251k = c2251kM4071b2;
                                        } else {
                                            if (zM4095u2) {
                                                break;
                                            }
                                            str = str2;
                                        }
                                    } else {
                                        c2251k = c2251k3;
                                        i5 = i8;
                                    }
                                    int iM4073e3 = m4073e(c2243c2, c2251k, i9, obj3, j9, c2135gM3989k, zM4095u2);
                                    Object obj4 = obj3;
                                    c2243c = c2243c2;
                                    C2251k c2251k4 = c2251k;
                                    obj2 = obj4;
                                    if (iM4073e3 == 0) {
                                        c2251k4.m4385a();
                                        break;
                                    }
                                    if (iM4073e3 == 1) {
                                        break;
                                    }
                                    if (iM4073e3 != 2) {
                                        if (iM4073e3 == 3) {
                                            throw new IllegalStateException(str2);
                                        }
                                        if (iM4073e3 != 4) {
                                            if (iM4073e3 == 5) {
                                                c2251k4.m4385a();
                                            }
                                            c2251k3 = c2251k4;
                                            c2243c2 = c2243c;
                                            str = str2;
                                            obj3 = obj2;
                                        } else if (j9 < atomicLongFieldUpdater2.get(c2243c)) {
                                            c2251k4.m4385a();
                                        }
                                    } else if (zM4095u2) {
                                        c2251k4.m4406h();
                                    } else {
                                        c2135gM3989k.mo3961a(c2251k4, i9 + i5);
                                    }
                                }
                                c2135gM3989k.m3957B();
                                throw th;
                            }
                            obj2 = obj3;
                            c2243c = c2243c2;
                            if (j5 < atomicLongFieldUpdater2.get(c2243c)) {
                                c2251k2.m4385a();
                            }
                            m4072d(c2243c, obj2, c2135gM3989k);
                        } else {
                            c2135gM3989k.mo3961a(c2251k2, i7 + i6);
                        }
                        objM3967r = c2135gM3989k.m3967r();
                        if (objM3967r != enumC1152a) {
                            objM3967r = c0891q;
                        }
                        if (objM3967r != enumC1152a) {
                            return objM3967r;
                        }
                    } else {
                        c2251k2.m4385a();
                    }
                    c2135gM3989k.mo278i(c0891q);
                    objM3967r = c2135gM3989k.m3967r();
                    if (objM3967r != enumC1152a) {
                    }
                    if (objM3967r != enumC1152a) {
                    }
                } else if (iM4073e2 == 4) {
                    if (j5 < atomicLongFieldUpdater2.get(c2243c2)) {
                        c2251k2.m4385a();
                    }
                    Object objM4099y2 = m4099y(interfaceC1046d, obj);
                    if (objM4099y2 == enumC1152a) {
                        return objM4099y2;
                    }
                } else if (iM4073e2 == 5) {
                    c2251k2.m4385a();
                }
            } else if (zM4095u) {
                c2251k2.m4406h();
                Object objM4099y3 = m4099y(interfaceC1046d, obj);
                if (objM4099y3 == enumC1152a) {
                    return objM4099y3;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172h3.InterfaceC2257q
    /* JADX INFO: renamed from: c */
    public final void mo4080c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m4083h(cancellationException, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m4081f(long j5) {
        return j5 < f7360g.get(this) || j5 < f7359f.get(this) + ((long) this.f7367d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (p172h3.C2251k) ((p190k3.AbstractC2454b) p190k3.AbstractC2454b.f7925b.get(r1));
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2251k m4084i(long j5) {
        Object objM4378f;
        long j6;
        Object obj = f7364k.get(this);
        C2251k c2251k = (C2251k) f7362i.get(this);
        if (c2251k.f7958c > ((C2251k) obj).f7958c) {
            obj = c2251k;
        }
        C2251k c2251k2 = (C2251k) f7363j.get(this);
        if (c2251k2.f7958c > ((C2251k) obj).f7958c) {
            obj = c2251k2;
        }
        AbstractC2454b abstractC2454b = (AbstractC2454b) obj;
        loop0: while (true) {
            abstractC2454b.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC2454b.f7924a;
            Object obj2 = atomicReferenceFieldUpdater.get(abstractC2454b);
            C1753n c1753n = AbstractC2453a.f7917a;
            objM4378f = null;
            if (obj2 == c1753n) {
                break;
            }
            AbstractC2454b abstractC2454b2 = (AbstractC2454b) obj2;
            if (abstractC2454b2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC2454b, null, c1753n)) {
                    if (atomicReferenceFieldUpdater.get(abstractC2454b) != null) {
                        break;
                    }
                }
                break loop0;
            }
            abstractC2454b = abstractC2454b2;
        }
        C2251k c2251k3 = (C2251k) abstractC2454b;
        if (mo4096v()) {
            C2251k c2251k4 = c2251k3;
            loop2: do {
                int i5 = AbstractC2245e.f7370b - 1;
                while (true) {
                    if (-1 >= i5) {
                        break;
                    }
                    j6 = (c2251k4.f7958c * ((long) AbstractC2245e.f7370b)) + ((long) i5);
                    if (j6 < f7359f.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object objM4105k = c2251k4.m4105k(i5);
                        if (objM4105k != null && objM4105k != AbstractC2245e.f7373e) {
                            if (objM4105k == AbstractC2245e.f7372d) {
                                break loop2;
                            }
                        } else {
                            if (c2251k4.m4104j(i5, objM4105k, AbstractC2245e.f7380l)) {
                                c2251k4.m4406h();
                                break;
                            }
                        }
                    }
                    i5--;
                }
            } while (c2251k4 != null);
            j6 = -1;
            if (j6 != -1) {
                m4086k(j6);
            }
        }
        loop5: for (C2251k c2251k5 = c2251k3; c2251k5 != null; c2251k5 = (C2251k) ((AbstractC2454b) AbstractC2454b.f7925b.get(c2251k5))) {
            for (int i6 = AbstractC2245e.f7370b - 1; -1 < i6; i6--) {
                if ((c2251k5.f7958c * ((long) AbstractC2245e.f7370b)) + ((long) i6) < j5) {
                    break loop5;
                }
                while (true) {
                    Object objM4105k2 = c2251k5.m4105k(i6);
                    if (objM4105k2 != null && objM4105k2 != AbstractC2245e.f7373e) {
                        if (!(objM4105k2 instanceof C2259s)) {
                            if (!(objM4105k2 instanceof InterfaceC2158r0)) {
                                break;
                            }
                            if (c2251k5.m4104j(i6, objM4105k2, AbstractC2245e.f7380l)) {
                                objM4378f = AbstractC2453a.m4378f(objM4378f, objM4105k2);
                                c2251k5.m4106l(i6, true);
                                break;
                            }
                        } else {
                            if (c2251k5.m4104j(i6, objM4105k2, AbstractC2245e.f7380l)) {
                                objM4378f = AbstractC2453a.m4378f(objM4378f, ((C2259s) objM4105k2).f7397a);
                                c2251k5.m4106l(i6, true);
                                break;
                            }
                        }
                    } else {
                        if (c2251k5.m4104j(i6, objM4105k2, AbstractC2245e.f7380l)) {
                            c2251k5.m4406h();
                            break;
                        }
                    }
                }
            }
        }
        if (objM4378f != null) {
            if (!(objM4378f instanceof ArrayList)) {
                m4100z((InterfaceC2158r0) objM4378f, true);
                return c2251k3;
            }
            ArrayList arrayList = (ArrayList) objM4378f;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m4100z((InterfaceC2158r0) arrayList.get(size), true);
            }
        }
        return c2251k3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172h3.InterfaceC2257q
    public final C2242b iterator() {
        return new C2242b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m4085j() {
        m4095u(f7358e.get(this), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        m4074t(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4087l() {
        Object objM4374b;
        if (m4097w()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7364k;
        C2251k c2251k = (C2251k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f7360g.getAndIncrement(this);
            long j5 = andIncrement / ((long) AbstractC2245e.f7370b);
            if (m4094s() <= andIncrement) {
                if (c2251k.f7958c < j5 && c2251k.m4386b() != null) {
                    m4098x(j5, c2251k);
                }
                m4074t(this);
                return;
            }
            if (c2251k.f7958c != j5) {
                C2244d c2244d = C2244d.f7368k;
                while (true) {
                    objM4374b = AbstractC2453a.m4374b(c2251k, j5, c2244d);
                    if (!AbstractC2453a.m4377e(objM4374b)) {
                        AbstractC2470r abstractC2470rM4375c = AbstractC2453a.m4375c(objM4374b);
                        while (true) {
                            AbstractC2470r abstractC2470r = (AbstractC2470r) atomicReferenceFieldUpdater.get(this);
                            if (abstractC2470r.f7958c >= abstractC2470rM4375c.f7958c) {
                                break;
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
                C2251k c2251k2 = null;
                if (AbstractC2453a.m4377e(objM4374b)) {
                    m4085j();
                    m4098x(j5, c2251k);
                    m4074t(this);
                } else {
                    C2251k c2251k3 = (C2251k) AbstractC2453a.m4375c(objM4374b);
                    long j6 = c2251k3.f7958c;
                    if (j6 > j5) {
                        long j7 = j6 * ((long) AbstractC2245e.f7370b);
                        if (f7360g.compareAndSet(this, 1 + andIncrement, j7)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f7361h;
                            if ((atomicLongFieldUpdater.addAndGet(this, j7 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            m4074t(this);
                        }
                    } else {
                        c2251k2 = c2251k3;
                    }
                }
                if (c2251k2 == null) {
                    continue;
                } else {
                    c2251k = c2251k2;
                }
            }
            int i5 = (int) (andIncrement % ((long) AbstractC2245e.f7370b));
            Object objM4105k = c2251k.m4105k(i5);
            boolean z5 = objM4105k instanceof InterfaceC2158r0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7359f;
            if (!z5 || andIncrement < atomicLongFieldUpdater2.get(this) || !c2251k.m4104j(i5, objM4105k, AbstractC2245e.f7375g)) {
                while (true) {
                    Object objM4105k2 = c2251k.m4105k(i5);
                    if (!(objM4105k2 instanceof InterfaceC2158r0)) {
                        if (objM4105k2 != AbstractC2245e.f7378j) {
                            if (objM4105k2 != null) {
                                if (objM4105k2 == AbstractC2245e.f7372d || objM4105k2 == AbstractC2245e.f7376h || objM4105k2 == AbstractC2245e.f7377i || objM4105k2 == AbstractC2245e.f7379k || objM4105k2 == AbstractC2245e.f7380l) {
                                    break loop0;
                                }
                                if (objM4105k2 != AbstractC2245e.f7374f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + objM4105k2).toString());
                                }
                            } else if (c2251k.m4104j(i5, objM4105k2, AbstractC2245e.f7373e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (c2251k.m4104j(i5, objM4105k2, new C2259s((InterfaceC2158r0) objM4105k2))) {
                            break loop0;
                        }
                    } else if (c2251k.m4104j(i5, objM4105k2, AbstractC2245e.f7375g)) {
                        if (m4070B(objM4105k2)) {
                            c2251k.m4108n(i5, AbstractC2245e.f7372d);
                            break;
                        } else {
                            c2251k.m4108n(i5, AbstractC2245e.f7378j);
                            c2251k.m4406h();
                        }
                    }
                }
            } else if (m4070B(objM4105k)) {
                c2251k.m4108n(i5, AbstractC2245e.f7372d);
                break;
            } else {
                c2251k.m4108n(i5, AbstractC2245e.f7378j);
                c2251k.m4406h();
                m4074t(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Throwable m4089n() {
        return (Throwable) f7365l.get(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // p172h3.InterfaceC2258r
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo4090o(Object obj) {
        int iM4073e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7358e;
        boolean z5 = false;
        long j5 = 1152921504606846975L;
        boolean z6 = m4095u(atomicLongFieldUpdater.get(this), false) ? false : !m4081f(r1 & 1152921504606846975L);
        C2249i c2249i = AbstractC2250j.f7392a;
        if (z6) {
            return c2249i;
        }
        InterfaceC2323d interfaceC2323d = AbstractC2245e.f7378j;
        C2251k c2251k = (C2251k) f7362i.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j6 = andIncrement & j5;
            boolean zM4095u = m4095u(andIncrement, z5);
            int i5 = AbstractC2245e.f7370b;
            long j7 = i5;
            long j8 = j6 / j7;
            int i6 = (int) (j6 % j7);
            if (c2251k.f7958c == j8) {
                iM4073e = m4073e(this, c2251k, i6, obj, j6, interfaceC2323d, zM4095u);
                C0891q c0891q = C0891q.f2780a;
                if (iM4073e != 0) {
                    c2251k.m4385a();
                    return c0891q;
                }
                if (iM4073e == 1) {
                    return c0891q;
                }
                if (iM4073e == 2) {
                    if (zM4095u) {
                        c2251k.m4406h();
                        return new C2248h(m4093r());
                    }
                    InterfaceC2158r0 interfaceC2158r0 = interfaceC2323d instanceof InterfaceC2158r0 ? (InterfaceC2158r0) interfaceC2323d : null;
                    if (interfaceC2158r0 != null) {
                        interfaceC2158r0.mo3961a(c2251k, i6 + i5);
                    }
                    c2251k.m4406h();
                    return c2249i;
                }
                if (iM4073e == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iM4073e == 4) {
                    if (j6 < f7359f.get(this)) {
                        c2251k.m4385a();
                    }
                    return new C2248h(m4093r());
                }
                if (iM4073e == 5) {
                    c2251k.m4385a();
                }
                z5 = false;
            } else {
                C2251k c2251kM4071b = m4071b(this, j8, c2251k);
                if (c2251kM4071b != null) {
                    c2251k = c2251kM4071b;
                    iM4073e = m4073e(this, c2251k, i6, obj, j6, interfaceC2323d, zM4095u);
                    C0891q c0891q2 = C0891q.f2780a;
                    if (iM4073e != 0) {
                    }
                } else {
                    if (zM4095u) {
                        return new C2248h(m4093r());
                    }
                    z5 = false;
                }
            }
            j5 = 1152921504606846975L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final Throwable m4092q() {
        Throwable thM4089n = m4089n();
        return thM4089n == null ? new C2252l("Channel was closed") : thM4089n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final Throwable m4093r() {
        Throwable thM4089n = m4089n();
        return thM4089n == null ? new C2253m("Channel was closed") : thM4089n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final long m4094s() {
        return f7358e.get(this) & 1152921504606846975L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: h3.k[] */
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
    */
    public final String toString() {
        boolean z5;
        String string;
        StringBuilder sb = new StringBuilder();
        int i5 = (int) (f7358e.get(this) >> 60);
        if (i5 == 2) {
            sb.append("closed,");
        } else if (i5 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f7367d + ',');
        sb.append("data=[");
        int i6 = 0;
        boolean z6 = true;
        List listM1987K = AbstractC0972l.m1987K(new C2251k[]{f7363j.get(this), f7362i.get(this), f7364k.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1987K) {
            if (((C2251k) obj) != AbstractC2245e.f7369a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j5 = ((C2251k) next).f7958c;
            do {
                Object next2 = it.next();
                long j6 = ((C2251k) next2).f7958c;
                if (j5 > j6) {
                    next = next2;
                    j5 = j6;
                }
            } while (it.hasNext());
        }
        C2251k c2251k = (C2251k) next;
        long j7 = f7359f.get(this);
        long jM4094s = m4094s();
        loop2: while (true) {
            int i7 = AbstractC2245e.f7370b;
            int i8 = i6;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                long j8 = (c2251k.f7958c * ((long) AbstractC2245e.f7370b)) + ((long) i8);
                if (j8 >= jM4094s && j8 >= j7) {
                    break loop2;
                }
                Object objM4105k = c2251k.m4105k(i8);
                boolean z7 = z6;
                Object obj2 = c2251k.f7394f.get(i8 * 2);
                if (objM4105k instanceof InterfaceC2133f) {
                    string = (j8 >= j7 || j8 < jM4094s) ? (j8 >= jM4094s || j8 < j7) ? "cont" : "send" : "receive";
                } else if (objM4105k instanceof C2259s) {
                    string = "EB(" + objM4105k + ')';
                } else if (AbstractC1665j.m2981a(objM4105k, AbstractC2245e.f7374f) || AbstractC1665j.m2981a(objM4105k, AbstractC2245e.f7375g)) {
                    string = "resuming_sender";
                } else if (objM4105k == null || objM4105k.equals(AbstractC2245e.f7373e) || objM4105k.equals(AbstractC2245e.f7377i) || objM4105k.equals(AbstractC2245e.f7376h) || objM4105k.equals(AbstractC2245e.f7379k) || objM4105k.equals(AbstractC2245e.f7378j) || objM4105k.equals(AbstractC2245e.f7380l)) {
                    i8++;
                    z6 = z7;
                } else {
                    string = objM4105k.toString();
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i8++;
                z6 = z7;
            }
            z6 = z5;
            i6 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(AbstractC1976d.m3632Z(sb)) == ',') {
            AbstractC1665j.m2984d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (p172h3.C2251k) ((p190k3.AbstractC2454b) p190k3.AbstractC2454b.f7925b.get(r0));
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4095u(long j5, boolean z5) {
        int i5 = (int) (j5 >> 60);
        if (i5 != 0 && i5 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7359f;
            if (i5 == 2) {
                m4084i(1152921504606846975L & j5);
                if (z5) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7363j;
                        C2251k c2251kM4088m = (C2251k) atomicReferenceFieldUpdater.get(this);
                        long j6 = atomicLongFieldUpdater.get(this);
                        if (m4094s() <= j6) {
                            break;
                        }
                        long j7 = AbstractC2245e.f7370b;
                        long j8 = j6 / j7;
                        if (c2251kM4088m.f7958c != j8 && (c2251kM4088m = m4088m(j8, c2251kM4088m)) == null) {
                            if (((C2251k) atomicReferenceFieldUpdater.get(this)).f7958c < j8) {
                                break;
                            }
                        } else {
                            c2251kM4088m.m4385a();
                            int i6 = (int) (j6 % j7);
                            while (true) {
                                Object objM4105k = c2251kM4088m.m4105k(i6);
                                if (objM4105k != null && objM4105k != AbstractC2245e.f7373e) {
                                    if (objM4105k == AbstractC2245e.f7372d || (objM4105k != AbstractC2245e.f7378j && objM4105k != AbstractC2245e.f7380l && objM4105k != AbstractC2245e.f7377i && objM4105k != AbstractC2245e.f7376h && (objM4105k == AbstractC2245e.f7375g || (objM4105k != AbstractC2245e.f7374f && j6 == atomicLongFieldUpdater.get(this))))) {
                                        break;
                                    }
                                } else {
                                    if (c2251kM4088m.m4104j(i6, objM4105k, AbstractC2245e.f7376h)) {
                                        m4087l();
                                        break;
                                    }
                                }
                            }
                            f7359f.compareAndSet(this, j6, j6 + 1);
                        }
                    }
                }
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException(AbstractC0231b.m398i("unexpected close status: ", i5).toString());
                }
                C2251k c2251kM4084i = m4084i(1152921504606846975L & j5);
                Object objM4378f = null;
                loop0: do {
                    int i7 = AbstractC2245e.f7370b - 1;
                    while (true) {
                        if (-1 >= i7) {
                            break;
                        }
                        long j9 = (c2251kM4084i.f7958c * ((long) AbstractC2245e.f7370b)) + ((long) i7);
                        while (true) {
                            Object objM4105k2 = c2251kM4084i.m4105k(i7);
                            if (objM4105k2 == AbstractC2245e.f7377i) {
                                break loop0;
                            }
                            if (objM4105k2 != AbstractC2245e.f7372d) {
                                if (objM4105k2 != AbstractC2245e.f7373e && objM4105k2 != null) {
                                    if (!(objM4105k2 instanceof InterfaceC2158r0) && !(objM4105k2 instanceof C2259s)) {
                                        C1753n c1753n = AbstractC2245e.f7375g;
                                        if (objM4105k2 == c1753n || objM4105k2 == AbstractC2245e.f7374f) {
                                            break loop0;
                                        }
                                        if (objM4105k2 != c1753n) {
                                            break;
                                        }
                                    } else {
                                        if (j9 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        InterfaceC2158r0 interfaceC2158r0 = objM4105k2 instanceof C2259s ? ((C2259s) objM4105k2).f7397a : (InterfaceC2158r0) objM4105k2;
                                        if (c2251kM4084i.m4104j(i7, objM4105k2, AbstractC2245e.f7380l)) {
                                            objM4378f = AbstractC2453a.m4378f(objM4378f, interfaceC2158r0);
                                            c2251kM4084i.m4107m(i7, null);
                                            c2251kM4084i.m4406h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (c2251kM4084i.m4104j(i7, objM4105k2, AbstractC2245e.f7380l)) {
                                        c2251kM4084i.m4406h();
                                        break;
                                    }
                                }
                            } else {
                                if (j9 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (c2251kM4084i.m4104j(i7, objM4105k2, AbstractC2245e.f7380l)) {
                                    c2251kM4084i.m4107m(i7, null);
                                    c2251kM4084i.m4406h();
                                    break;
                                }
                            }
                        }
                        i7--;
                    }
                } while (c2251kM4084i != null);
                if (objM4378f != null) {
                    if (objM4378f instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM4378f;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            m4100z((InterfaceC2158r0) arrayList.get(size), false);
                        }
                    } else {
                        m4100z((InterfaceC2158r0) objM4378f, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public boolean mo4096v() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final boolean m4097w() {
        long j5 = f7360g.get(this);
        return j5 == 0 || j5 == Long.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4098x(long j5, C2251k c2251k) {
        C2251k c2251k2;
        C2251k c2251k3;
        while (c2251k.f7958c < j5 && (c2251k3 = (C2251k) c2251k.m4386b()) != null) {
            c2251k = c2251k3;
        }
        while (true) {
            if (!c2251k.mo4387c() || (c2251k2 = (C2251k) c2251k.m4386b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7364k;
                    AbstractC2470r abstractC2470r = (AbstractC2470r) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2470r.f7958c >= c2251k.f7958c) {
                        return;
                    }
                    if (!c2251k.m4407i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC2470r, c2251k)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC2470r) {
                            if (c2251k.m4405e()) {
                                c2251k.m4388d();
                            }
                        }
                    }
                    if (abstractC2470r.m4405e()) {
                        abstractC2470r.m4388d();
                        return;
                    }
                    return;
                }
            }
            c2251k = c2251k2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final Object m4099y(InterfaceC1046d interfaceC1046d, Object obj) {
        C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(interfaceC1046d));
        c2135g.m3968t();
        c2135g.mo278i(AbstractC1784a.m3229o(m4093r()));
        Object objM3967r = c2135g.m3967r();
        return objM3967r == EnumC1152a.f3788d ? objM3967r : C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
