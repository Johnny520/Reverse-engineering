package sg;

import bsh.C0353j;
import com.alibaba.fastjson2.codec.FieldInfo;
import gg.AbstractC1416l;
import gg.AbstractC1428x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okio.C3193a;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;
import p162l3.C2463q;
import p162l3.InterfaceC2461o;
import p218og.AbstractC3149m;
import p249qg.AbstractC3603v;
import p249qg.C3564g;
import p249qg.InterfaceC3561f;
import p249qg.InterfaceC3590o1;
import p276sf.C3959f;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import vg.AbstractC4552a;
import vg.AbstractC4553b;
import vg.AbstractC4568q;
import vg.AbstractC4569r;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: sg.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3971c implements InterfaceC3975g {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f12986h = AtomicLongFieldUpdater.newUpdater(C3971c.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f12987i = AtomicLongFieldUpdater.newUpdater(C3971c.class, "receivers$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicLongFieldUpdater f12988j = AtomicLongFieldUpdater.newUpdater(C3971c.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicLongFieldUpdater f12989k = AtomicLongFieldUpdater.newUpdater(C3971c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12990l = AtomicReferenceFieldUpdater.newUpdater(C3971c.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12991m = AtomicReferenceFieldUpdater.newUpdater(C3971c.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12992n = AtomicReferenceFieldUpdater.newUpdater(C3971c.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12993o = AtomicReferenceFieldUpdater.newUpdater(C3971c.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12994p = AtomicReferenceFieldUpdater.newUpdater(C3971c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: g */
    public final int f12995g;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3971c(int i9) {
        this.f12995g = i9;
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        C3979k c3979k = AbstractC3973e.f12997a;
        this.bufferEnd$volatile = i9 != 0 ? i9 != Integer.MAX_VALUE ? i9 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f12988j.get(this);
        C3979k c3979k2 = new C3979k(0L, null, this, 3);
        this.sendSegment$volatile = c3979k2;
        this.receiveSegment$volatile = c3979k2;
        if (m8214w()) {
            c3979k2 = AbstractC3973e.f12997a;
            c3979k2.getClass();
        }
        this.bufferEndSegment$volatile = c3979k2;
        this._closeCause$volatile = AbstractC3973e.f13015s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static boolean m8187B(Object obj) {
        if (!(obj instanceof InterfaceC3561f)) {
            C3193a.m6826p(obj, "Unexpected waiter: ");
            return false;
        }
        InterfaceC3561f interfaceC3561f = (InterfaceC3561f) obj;
        C3979k c3979k = AbstractC3973e.f12997a;
        C2463q c2463qMo7499j = interfaceC3561f.mo7499j(C3967n.f12976a, null);
        if (c2463qMo7499j == null) {
            return false;
        }
        interfaceC3561f.mo7498A(c2463qMo7499j);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C3979k m8188b(C3971c c3971c, long j3, C3979k c3979k) {
        Object objM8983b;
        C3971c c3971c2;
        C3979k c3979k2 = AbstractC3973e.f12997a;
        C3972d c3972d = C3972d.f12996n;
        loop0: while (true) {
            objM8983b = AbstractC4552a.m8983b(c3979k, j3, c3972d);
            if (!AbstractC4552a.m8986e(objM8983b)) {
                AbstractC4568q abstractC4568qM8984c = AbstractC4552a.m8984c(objM8983b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12990l;
                    AbstractC4568q abstractC4568q = (AbstractC4568q) atomicReferenceFieldUpdater.get(c3971c);
                    if (abstractC4568q.f15053c >= abstractC4568qM8984c.f15053c) {
                        break loop0;
                    }
                    if (!abstractC4568qM8984c.m9016i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c3971c, abstractC4568q, abstractC4568qM8984c)) {
                        if (atomicReferenceFieldUpdater.get(c3971c) != abstractC4568q) {
                            if (abstractC4568qM8984c.m9014e()) {
                                abstractC4568qM8984c.m8997d();
                            }
                        }
                    }
                    if (abstractC4568q.m9014e()) {
                        abstractC4568q.m8997d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM8986e = AbstractC4552a.m8986e(objM8983b);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12987i;
        if (zM8986e) {
            c3971c.m8212u();
            if (c3979k.f15053c * ((long) AbstractC3973e.f12998b) < atomicLongFieldUpdater.get(c3971c)) {
                c3979k.m8994a();
                return null;
            }
        } else {
            C3979k c3979k3 = (C3979k) AbstractC4552a.m8984c(objM8983b);
            long j4 = c3979k3.f15053c;
            if (j4 <= j3) {
                return c3979k3;
            }
            long j5 = ((long) AbstractC3973e.f12998b) * j4;
            while (true) {
                long j10 = f12986h.get(c3971c);
                long j11 = 1152921504606846975L & j10;
                if (j11 >= j5) {
                    c3971c2 = c3971c;
                    break;
                }
                c3971c2 = c3971c;
                if (f12986h.compareAndSet(c3971c2, j10, (((long) ((int) (j10 >> 60))) << 60) + j11)) {
                    break;
                }
                c3971c = c3971c2;
            }
            if (j4 * ((long) AbstractC3973e.f12998b) < atomicLongFieldUpdater.get(c3971c2)) {
                c3979k3.m8994a();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m8189c(C3971c c3971c, Object obj, C3564g c3564g) {
        c3564g.resumeWith(new C3959f(c3971c.m8207o()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m8190e(C3971c c3971c, C3979k c3979k, int i9, Object obj, long j3, Object obj2, boolean z9) {
        c3979k.m8224m(i9, obj);
        if (z9) {
            return c3971c.m8194D(c3979k, i9, obj, j3, obj2, z9);
        }
        Object objM8222k = c3979k.m8222k(i9);
        if (objM8222k == null) {
            if (c3971c.m8199g(j3)) {
                if (c3979k.m8221j(null, i9, AbstractC3973e.f13000d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c3979k.m8221j(null, i9, obj2)) {
                    return 2;
                }
            }
        } else if (objM8222k instanceof InterfaceC3590o1) {
            c3979k.m8224m(i9, null);
            if (c3971c.m8192A(objM8222k, obj)) {
                c3979k.m8225n(i9, AbstractC3973e.f13005i);
                return 0;
            }
            C2463q c2463q = AbstractC3973e.f13007k;
            if (c3979k.f13022f.getAndSet((i9 * 2) + 1, c2463q) == c2463q) {
                return 5;
            }
            c3979k.m8223l(i9, true);
            return 5;
        }
        return c3971c.m8194D(c3979k, i9, obj, j3, obj2, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static void m8191s(C3971c c3971c) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12989k;
        if ((atomicLongFieldUpdater.addAndGet(c3971c, 1L) & FieldInfo.RECORD) != 0) {
            while ((atomicLongFieldUpdater.get(c3971c) & FieldInfo.RECORD) != 0) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final boolean m8192A(Object obj, Object obj2) {
        if (!(obj instanceof C3970b)) {
            if (!(obj instanceof InterfaceC3561f)) {
                C3193a.m6826p(obj, "Unexpected receiver type: ");
                return false;
            }
            InterfaceC3561f interfaceC3561f = (InterfaceC3561f) obj;
            C3979k c3979k = AbstractC3973e.f12997a;
            C2463q c2463qMo7499j = interfaceC3561f.mo7499j(obj2, null);
            if (c2463qMo7499j == null) {
                return false;
            }
            interfaceC3561f.mo7498A(c2463qMo7499j);
            return true;
        }
        C3970b c3970b = (C3970b) obj;
        C3564g c3564g = c3970b.f12984h;
        c3564g.getClass();
        c3970b.f12984h = null;
        c3970b.f12983g = obj2;
        Boolean bool = Boolean.TRUE;
        c3970b.f12985i.getClass();
        C3979k c3979k2 = AbstractC3973e.f12997a;
        C2463q c2463qMo7499j2 = c3564g.mo7499j(bool, null);
        if (c2463qMo7499j2 == null) {
            return false;
        }
        c3564g.mo7498A(c2463qMo7499j2);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final Object m8193C(C3979k c3979k, int i9, long j3, Object obj) {
        AtomicReferenceArray atomicReferenceArray = c3979k.f13022f;
        Object objM8222k = c3979k.m8222k(i9);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12986h;
        if (objM8222k == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC3973e.f13010n;
                }
                if (c3979k.m8221j(objM8222k, i9, obj)) {
                    m8203k();
                    return AbstractC3973e.f13009m;
                }
            }
        } else if (objM8222k == AbstractC3973e.f13000d && c3979k.m8221j(objM8222k, i9, AbstractC3973e.f13005i)) {
            m8203k();
            Object obj2 = atomicReferenceArray.get(i9 * 2);
            c3979k.m8224m(i9, null);
            return obj2;
        }
        while (true) {
            Object objM8222k2 = c3979k.m8222k(i9);
            if (objM8222k2 == null || objM8222k2 == AbstractC3973e.f13001e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c3979k.m8221j(objM8222k2, i9, AbstractC3973e.f13004h)) {
                        m8203k();
                        return AbstractC3973e.f13011o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC3973e.f13010n;
                    }
                    if (c3979k.m8221j(objM8222k2, i9, obj)) {
                        m8203k();
                        return AbstractC3973e.f13009m;
                    }
                }
            } else if (objM8222k2 != AbstractC3973e.f13000d) {
                C2463q c2463q = AbstractC3973e.f13006j;
                if (objM8222k2 == c2463q) {
                    return AbstractC3973e.f13011o;
                }
                if (objM8222k2 == AbstractC3973e.f13004h) {
                    return AbstractC3973e.f13011o;
                }
                if (objM8222k2 == AbstractC3973e.f13008l) {
                    m8203k();
                    return AbstractC3973e.f13011o;
                }
                if (objM8222k2 != AbstractC3973e.f13003g && c3979k.m8221j(objM8222k2, i9, AbstractC3973e.f13002f)) {
                    boolean z9 = objM8222k2 instanceof C3985q;
                    if (z9) {
                        objM8222k2 = ((C3985q) objM8222k2).f13025a;
                    }
                    if (m8187B(objM8222k2)) {
                        c3979k.m8225n(i9, AbstractC3973e.f13005i);
                        m8203k();
                        Object obj3 = atomicReferenceArray.get(i9 * 2);
                        c3979k.m8224m(i9, null);
                        return obj3;
                    }
                    c3979k.m8225n(i9, c2463q);
                    c3979k.m9015h();
                    if (z9) {
                        m8203k();
                    }
                    return AbstractC3973e.f13011o;
                }
            } else if (c3979k.m8221j(objM8222k2, i9, AbstractC3973e.f13005i)) {
                m8203k();
                Object obj4 = atomicReferenceArray.get(i9 * 2);
                c3979k.m8224m(i9, null);
                return obj4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final int m8194D(C3979k c3979k, int i9, Object obj, long j3, Object obj2, boolean z9) {
        while (true) {
            Object objM8222k = c3979k.m8222k(i9);
            if (objM8222k == null) {
                if (!m8199g(j3) || z9) {
                    if (z9) {
                        if (c3979k.m8221j(null, i9, AbstractC3973e.f13006j)) {
                            c3979k.m9015h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c3979k.m8221j(null, i9, obj2)) {
                            return 2;
                        }
                    }
                } else if (c3979k.m8221j(null, i9, AbstractC3973e.f13000d)) {
                    break;
                }
            } else {
                if (objM8222k != AbstractC3973e.f13001e) {
                    C2463q c2463q = AbstractC3973e.f13007k;
                    if (objM8222k == c2463q) {
                        c3979k.m8224m(i9, null);
                        return 5;
                    }
                    if (objM8222k == AbstractC3973e.f13004h) {
                        c3979k.m8224m(i9, null);
                        return 5;
                    }
                    if (objM8222k == AbstractC3973e.f13008l) {
                        c3979k.m8224m(i9, null);
                        m8212u();
                        return 4;
                    }
                    c3979k.m8224m(i9, null);
                    if (objM8222k instanceof C3985q) {
                        objM8222k = ((C3985q) objM8222k).f13025a;
                    }
                    if (m8192A(objM8222k, obj)) {
                        c3979k.m8225n(i9, AbstractC3973e.f13005i);
                        return 0;
                    }
                    if (c3979k.f13022f.getAndSet((i9 * 2) + 1, c2463q) != c2463q) {
                        c3979k.m8223l(i9, true);
                    }
                    return 5;
                }
                if (c3979k.m8221j(objM8222k, i9, AbstractC3973e.f13000d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final void m8195E(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C3971c c3971c = this;
        if (c3971c.m8214w()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f12988j;
            if (atomicLongFieldUpdater.get(c3971c) > j3) {
                break;
            } else {
                c3971c = this;
            }
        }
        int i9 = AbstractC3973e.f12999c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f12989k;
            if (i10 < i9) {
                long j4 = atomicLongFieldUpdater.get(c3971c);
                if (j4 == (4611686018427387903L & atomicLongFieldUpdater2.get(c3971c)) && j4 == atomicLongFieldUpdater.get(c3971c)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                while (true) {
                    long j5 = atomicLongFieldUpdater2.get(c3971c);
                    if (atomicLongFieldUpdater2.compareAndSet(c3971c, j5, (j5 & 4611686018427387903L) + FieldInfo.RECORD)) {
                        break;
                    } else {
                        c3971c = this;
                    }
                }
                while (true) {
                    long j10 = atomicLongFieldUpdater.get(c3971c);
                    long j11 = atomicLongFieldUpdater2.get(c3971c);
                    long j12 = j11 & 4611686018427387903L;
                    boolean z9 = (j11 & FieldInfo.RECORD) != 0;
                    if (j10 == j12 && j10 == atomicLongFieldUpdater.get(c3971c)) {
                        break;
                    }
                    if (z9) {
                        c3971c = this;
                    } else {
                        c3971c = this;
                        atomicLongFieldUpdater2.compareAndSet(c3971c, j11, FieldInfo.RECORD + j12);
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater2.get(c3971c);
                    if (atomicLongFieldUpdater2.compareAndSet(c3971c, j13, j13 & 4611686018427387903L)) {
                        return;
                    } else {
                        c3971c = this;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sg.InterfaceC3975g
    /* JADX INFO: renamed from: a */
    public final void mo8196a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m8200h(cancellationException, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sg.InterfaceC3975g
    /* JADX INFO: renamed from: d */
    public final Object mo8197d() {
        C3979k c3979k;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12987i;
        long j3 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f12986h;
        long j4 = atomicLongFieldUpdater2.get(this);
        if (m8211t(j4, true)) {
            return new C3976h(m8205m());
        }
        long j5 = j4 & 1152921504606846975L;
        C3977i c3977i = AbstractC3978j.f13020a;
        if (j3 >= j5) {
            return c3977i;
        }
        Object obj = AbstractC3973e.f13007k;
        C3979k c3979k2 = (C3979k) f12991m.get(this);
        while (!m8211t(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = AbstractC3973e.f12998b;
            long j11 = andIncrement / j10;
            int i9 = (int) (andIncrement % j10);
            if (c3979k2.f15053c != j11) {
                C3979k c3979kM8204l = m8204l(j11, c3979k2);
                if (c3979kM8204l == null) {
                    continue;
                } else {
                    c3979k = c3979kM8204l;
                }
            } else {
                c3979k = c3979k2;
            }
            Object objM8193C = m8193C(c3979k, i9, andIncrement, obj);
            C3979k c3979k3 = c3979k;
            if (objM8193C == AbstractC3973e.f13009m) {
                InterfaceC3590o1 interfaceC3590o1 = obj instanceof InterfaceC3590o1 ? (InterfaceC3590o1) obj : null;
                if (interfaceC3590o1 != null) {
                    interfaceC3590o1.mo7505a(c3979k3, i9);
                }
                m8195E(andIncrement);
                c3979k3.m9015h();
                return c3977i;
            }
            if (objM8193C != AbstractC3973e.f13011o) {
                if (objM8193C != AbstractC3973e.f13010n) {
                    c3979k3.m8994a();
                    return objM8193C;
                }
                C2104o.m5276A("unexpected");
                return null;
            }
            if (andIncrement < m8210r()) {
                c3979k3.m8994a();
            }
            c3979k2 = c3979k3;
        }
        return new C3976h(m8205m());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sg.InterfaceC3975g
    /* JADX INFO: renamed from: f */
    public final Object mo8198f(InterfaceC5557c interfaceC5557c) throws Throwable {
        C3979k c3979kM8204l;
        C3971c c3971c = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12991m;
        C3979k c3979k = (C3979k) atomicReferenceFieldUpdater.get(c3971c);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12986h;
            boolean z9 = true;
            if (c3971c.m8211t(atomicLongFieldUpdater.get(c3971c), true)) {
                Throwable thM8206n = m8206n();
                int i9 = AbstractC4569r.f15054a;
                throw thM8206n;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f12987i;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(c3971c);
            long j3 = AbstractC3973e.f12998b;
            long j4 = andIncrement / j3;
            int i10 = (int) (andIncrement % j3);
            if (c3979k.f15053c != j4) {
                C3979k c3979kM8204l2 = c3971c.m8204l(j4, c3979k);
                if (c3979kM8204l2 == null) {
                    continue;
                } else {
                    c3979k = c3979kM8204l2;
                }
            }
            Object objM8193C = c3971c.m8193C(c3979k, i10, andIncrement, null);
            C2463q c2463q = AbstractC3973e.f13009m;
            if (objM8193C == c2463q) {
                C2104o.m5276A("unexpected");
                return null;
            }
            C2463q c2463q2 = AbstractC3973e.f13011o;
            if (objM8193C != c2463q2) {
                if (objM8193C != AbstractC3973e.f13010n) {
                    c3979k.m8994a();
                    return objM8193C;
                }
                C3564g c3564gM7558l = AbstractC3603v.m7558l(AbstractC1184v0.m3214x(interfaceC5557c));
                C3971c c3971c2 = this;
                try {
                    Object objM8193C2 = c3971c2.m8193C(c3979k, i10, andIncrement, c3564gM7558l);
                    if (objM8193C2 == c2463q) {
                        c3564gM7558l.mo7505a(c3979k, i10);
                    } else if (objM8193C2 == c2463q2) {
                        if (andIncrement < c3971c2.m8210r()) {
                            c3979k.m8994a();
                        }
                        C3979k c3979k2 = (C3979k) atomicReferenceFieldUpdater.get(c3971c2);
                        while (true) {
                            if (c3971c2.m8211t(atomicLongFieldUpdater.get(c3971c2), z9)) {
                                c3564gM7558l.resumeWith(new C3959f(c3971c2.m8206n()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(c3971c2);
                            long j5 = AbstractC3973e.f12998b;
                            long j10 = andIncrement2 / j5;
                            int i11 = (int) (andIncrement2 % j5);
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            if (c3979k2.f15053c != j10) {
                                c3979kM8204l = c3971c2.m8204l(j10, c3979k2);
                                if (c3979kM8204l == null) {
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    z9 = true;
                                }
                            } else {
                                c3979kM8204l = c3979k2;
                            }
                            Object objM8193C3 = c3971c2.m8193C(c3979kM8204l, i11, andIncrement2, c3564gM7558l);
                            if (objM8193C3 == AbstractC3973e.f13009m) {
                                c3564gM7558l.mo7505a(c3979kM8204l, i11);
                                break;
                            }
                            if (objM8193C3 == AbstractC3973e.f13011o) {
                                if (andIncrement2 < m8210r()) {
                                    c3979kM8204l.m8994a();
                                }
                                z9 = true;
                                c3971c2 = this;
                                c3979k2 = c3979kM8204l;
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                            } else {
                                if (objM8193C3 == AbstractC3973e.f13010n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c3979kM8204l.m8994a();
                                c3564gM7558l.m7520y(objM8193C3, null);
                            }
                        }
                    } else {
                        c3979k.m8994a();
                        c3564gM7558l.m7520y(objM8193C2, null);
                    }
                    return c3564gM7558l.m7512o();
                } catch (Throwable th2) {
                    c3564gM7558l.m7519x();
                    throw th2;
                }
            }
            if (andIncrement < m8210r()) {
                c3979k.m8994a();
            }
            c3971c = this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m8199g(long j3) {
        return j3 < f12988j.get(this) || j3 < f12987i.get(this) + ((long) this.f12995g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m8200h(Throwable th2, boolean z9) {
        C3971c c3971c;
        boolean z10;
        long j3;
        long j4;
        long j5;
        Object obj;
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12986h;
        if (!z9) {
            c3971c = this;
            break;
        }
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (((int) (j11 >> 60)) != 0) {
                c3971c = this;
                break;
            }
            C3979k c3979k = AbstractC3973e.f12997a;
            c3971c = this;
        } while (!atomicLongFieldUpdater.compareAndSet(c3971c, j11, (j11 & 1152921504606846975L) + (((long) 1) << 60)));
        C2463q c2463q = AbstractC3973e.f13015s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12993o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c2463q, th2)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c2463q) {
                z10 = false;
                break;
            }
        }
        if (z9) {
            do {
                j10 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(c3971c, j10, (((long) 3) << 60) + (j10 & 1152921504606846975L)));
        } else {
            do {
                j3 = atomicLongFieldUpdater.get(this);
                int i9 = (int) (j3 >> 60);
                if (i9 == 0) {
                    j4 = j3 & 1152921504606846975L;
                    j5 = 2;
                } else {
                    if (i9 != 1) {
                        break;
                    }
                    j4 = j3 & 1152921504606846975L;
                    j5 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c3971c, j3, (j5 << 60) + j4));
        }
        m8212u();
        if (z10) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12994p;
                obj = atomicReferenceFieldUpdater2.get(this);
                C2463q c2463q2 = obj == null ? AbstractC3973e.f13013q : AbstractC3973e.f13014r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c2463q2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                AbstractC1428x.m3838c(1, obj);
                ((InterfaceC1231l) obj).invoke(m8205m());
                return z10;
            }
        }
        return z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (sg.C3979k) ((vg.AbstractC4553b) vg.AbstractC4553b.f15021b.get(r1));
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3979k m8201i(long j3) {
        Object objM8987f;
        long j4;
        Object obj = f12992n.get(this);
        C3979k c3979k = (C3979k) f12990l.get(this);
        if (c3979k.f15053c > ((C3979k) obj).f15053c) {
            obj = c3979k;
        }
        C3979k c3979k2 = (C3979k) f12991m.get(this);
        if (c3979k2.f15053c > ((C3979k) obj).f15053c) {
            obj = c3979k2;
        }
        AbstractC4553b abstractC4553b = (AbstractC4553b) obj;
        loop0: while (true) {
            abstractC4553b.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC4553b.f15020a;
            Object obj2 = atomicReferenceFieldUpdater.get(abstractC4553b);
            C2463q c2463q = AbstractC4552a.f15013a;
            objM8987f = null;
            if (obj2 == c2463q) {
                break;
            }
            AbstractC4553b abstractC4553b2 = (AbstractC4553b) obj2;
            if (abstractC4553b2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC4553b, null, c2463q)) {
                    if (atomicReferenceFieldUpdater.get(abstractC4553b) != null) {
                        break;
                    }
                }
                break loop0;
            }
            abstractC4553b = abstractC4553b2;
        }
        C3979k c3979k3 = (C3979k) abstractC4553b;
        if (mo8213v()) {
            C3979k c3979k4 = c3979k3;
            loop2: do {
                int i9 = AbstractC3973e.f12998b - 1;
                while (true) {
                    if (-1 >= i9) {
                        break;
                    }
                    j4 = (c3979k4.f15053c * ((long) AbstractC3973e.f12998b)) + ((long) i9);
                    if (j4 < f12987i.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object objM8222k = c3979k4.m8222k(i9);
                        if (objM8222k != null && objM8222k != AbstractC3973e.f13001e) {
                            if (objM8222k == AbstractC3973e.f13000d) {
                                break loop2;
                            }
                        } else {
                            if (c3979k4.m8221j(objM8222k, i9, AbstractC3973e.f13008l)) {
                                c3979k4.m9015h();
                                break;
                            }
                        }
                    }
                    i9--;
                }
            } while (c3979k4 != null);
            j4 = -1;
            if (j4 != -1) {
                m8202j(j4);
            }
        }
        loop5: for (C3979k c3979k5 = c3979k3; c3979k5 != null; c3979k5 = (C3979k) ((AbstractC4553b) AbstractC4553b.f15021b.get(c3979k5))) {
            for (int i10 = AbstractC3973e.f12998b - 1; -1 < i10; i10--) {
                if ((c3979k5.f15053c * ((long) AbstractC3973e.f12998b)) + ((long) i10) < j3) {
                    break loop5;
                }
                while (true) {
                    Object objM8222k2 = c3979k5.m8222k(i10);
                    if (objM8222k2 != null && objM8222k2 != AbstractC3973e.f13001e) {
                        if (!(objM8222k2 instanceof C3985q)) {
                            if (!(objM8222k2 instanceof InterfaceC3590o1)) {
                                break;
                            }
                            if (c3979k5.m8221j(objM8222k2, i10, AbstractC3973e.f13008l)) {
                                objM8987f = AbstractC4552a.m8987f(objM8987f, objM8222k2);
                                c3979k5.m8223l(i10, true);
                                break;
                            }
                        } else {
                            if (c3979k5.m8221j(objM8222k2, i10, AbstractC3973e.f13008l)) {
                                objM8987f = AbstractC4552a.m8987f(objM8987f, ((C3985q) objM8222k2).f13025a);
                                c3979k5.m8223l(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (c3979k5.m8221j(objM8222k2, i10, AbstractC3973e.f13008l)) {
                            c3979k5.m9015h();
                            break;
                        }
                    }
                }
            }
        }
        if (objM8987f != null) {
            if (!(objM8987f instanceof ArrayList)) {
                m8217z((InterfaceC3590o1) objM8987f, true);
                return c3979k3;
            }
            ArrayList arrayList = (ArrayList) objM8987f;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m8217z((InterfaceC3590o1) arrayList.get(size), true);
            }
        }
        return c3979k3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sg.InterfaceC3975g
    public final C3970b iterator() {
        return new C3970b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m8202j(long j3) {
        C3979k c3979k = (C3979k) f12991m.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12987i;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(((long) this.f12995g) + j4, f12988j.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, 1 + j4)) {
                long j5 = AbstractC3973e.f12998b;
                long j10 = j4 / j5;
                int i9 = (int) (j4 % j5);
                if (c3979k.f15053c != j10) {
                    C3979k c3979kM8204l = m8204l(j10, c3979k);
                    if (c3979kM8204l != null) {
                        c3979k = c3979kM8204l;
                    }
                }
                C3979k c3979k2 = c3979k;
                if (m8193C(c3979k2, i9, j4, null) != AbstractC3973e.f13011o || j4 < m8210r()) {
                    c3979k2.m8994a();
                }
                c3979k = c3979k2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017b, code lost:
    
        m8191s(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x017e, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8203k() {
        Object objM8983b;
        if (m8214w()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12992n;
        C3979k c3979k = (C3979k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f12988j.getAndIncrement(this);
            long j3 = andIncrement / ((long) AbstractC3973e.f12998b);
            if (m8210r() <= andIncrement) {
                if (c3979k.f15053c < j3 && c3979k.m8995b() != null) {
                    m8215x(j3, c3979k);
                }
                m8191s(this);
                return;
            }
            if (c3979k.f15053c != j3) {
                C3972d c3972d = C3972d.f12996n;
                while (true) {
                    objM8983b = AbstractC4552a.m8983b(c3979k, j3, c3972d);
                    if (!AbstractC4552a.m8986e(objM8983b)) {
                        AbstractC4568q abstractC4568qM8984c = AbstractC4552a.m8984c(objM8983b);
                        while (true) {
                            AbstractC4568q abstractC4568q = (AbstractC4568q) atomicReferenceFieldUpdater.get(this);
                            if (abstractC4568q.f15053c >= abstractC4568qM8984c.f15053c) {
                                break;
                            }
                            if (!abstractC4568qM8984c.m9016i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC4568q, abstractC4568qM8984c)) {
                                if (atomicReferenceFieldUpdater.get(this) != abstractC4568q) {
                                    if (abstractC4568qM8984c.m9014e()) {
                                        abstractC4568qM8984c.m8997d();
                                    }
                                }
                            }
                            if (abstractC4568q.m9014e()) {
                                abstractC4568q.m8997d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                C3979k c3979k2 = null;
                if (AbstractC4552a.m8986e(objM8983b)) {
                    m8212u();
                    m8215x(j3, c3979k);
                    m8191s(this);
                } else {
                    C3979k c3979k3 = (C3979k) AbstractC4552a.m8984c(objM8983b);
                    long j4 = c3979k3.f15053c;
                    if (j4 > j3) {
                        long j5 = j4 * ((long) AbstractC3973e.f12998b);
                        if (f12988j.compareAndSet(this, 1 + andIncrement, j5)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f12989k;
                            if ((atomicLongFieldUpdater.addAndGet(this, j5 - andIncrement) & FieldInfo.RECORD) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & FieldInfo.RECORD) != 0) {
                                }
                            }
                        } else {
                            m8191s(this);
                        }
                    } else {
                        c3979k2 = c3979k3;
                    }
                }
                if (c3979k2 == null) {
                    continue;
                } else {
                    c3979k = c3979k2;
                }
            }
            int i9 = (int) (andIncrement % ((long) AbstractC3973e.f12998b));
            Object objM8222k = c3979k.m8222k(i9);
            boolean z9 = objM8222k instanceof InterfaceC3590o1;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f12987i;
            if (!z9 || andIncrement < atomicLongFieldUpdater2.get(this) || !c3979k.m8221j(objM8222k, i9, AbstractC3973e.f13003g)) {
                while (true) {
                    Object objM8222k2 = c3979k.m8222k(i9);
                    if (!(objM8222k2 instanceof InterfaceC3590o1)) {
                        if (objM8222k2 != AbstractC3973e.f13006j) {
                            if (objM8222k2 != null) {
                                if (objM8222k2 == AbstractC3973e.f13000d || objM8222k2 == AbstractC3973e.f13004h || objM8222k2 == AbstractC3973e.f13005i || objM8222k2 == AbstractC3973e.f13007k || objM8222k2 == AbstractC3973e.f13008l) {
                                    break loop0;
                                } else if (objM8222k2 != AbstractC3973e.f13002f) {
                                    C3193a.m6826p(objM8222k2, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (c3979k.m8221j(objM8222k2, i9, AbstractC3973e.f13001e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (c3979k.m8221j(objM8222k2, i9, new C3985q((InterfaceC3590o1) objM8222k2))) {
                            break loop0;
                        }
                    } else if (c3979k.m8221j(objM8222k2, i9, AbstractC3973e.f13003g)) {
                        if (m8187B(objM8222k2)) {
                            c3979k.m8225n(i9, AbstractC3973e.f13000d);
                            break;
                        } else {
                            c3979k.m8225n(i9, AbstractC3973e.f13006j);
                            c3979k.m9015h();
                        }
                    }
                }
            } else if (m8187B(objM8222k)) {
                c3979k.m8225n(i9, AbstractC3973e.f13000d);
                break;
            } else {
                c3979k.m8225n(i9, AbstractC3973e.f13006j);
                c3979k.m9015h();
                m8191s(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final C3979k m8204l(long j3, C3979k c3979k) {
        Object objM8983b;
        long j4;
        C3979k c3979k2 = AbstractC3973e.f12997a;
        C3972d c3972d = C3972d.f12996n;
        loop0: while (true) {
            objM8983b = AbstractC4552a.m8983b(c3979k, j3, c3972d);
            if (!AbstractC4552a.m8986e(objM8983b)) {
                AbstractC4568q abstractC4568qM8984c = AbstractC4552a.m8984c(objM8983b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12991m;
                    AbstractC4568q abstractC4568q = (AbstractC4568q) atomicReferenceFieldUpdater.get(this);
                    if (abstractC4568q.f15053c >= abstractC4568qM8984c.f15053c) {
                        break loop0;
                    }
                    if (!abstractC4568qM8984c.m9016i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC4568q, abstractC4568qM8984c)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC4568q) {
                            if (abstractC4568qM8984c.m9014e()) {
                                abstractC4568qM8984c.m8997d();
                            }
                        }
                    }
                    if (abstractC4568q.m9014e()) {
                        abstractC4568q.m8997d();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC4552a.m8986e(objM8983b)) {
            m8212u();
            if (c3979k.f15053c * ((long) AbstractC3973e.f12998b) < m8210r()) {
                c3979k.m8994a();
                return null;
            }
        } else {
            C3979k c3979k3 = (C3979k) AbstractC4552a.m8984c(objM8983b);
            long j5 = c3979k3.f15053c;
            if (!m8214w() && j3 <= f12988j.get(this) / ((long) AbstractC3973e.f12998b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12992n;
                    AbstractC4568q abstractC4568q2 = (AbstractC4568q) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC4568q2.f15053c >= j5 || !c3979k3.m9016i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC4568q2, c3979k3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != abstractC4568q2) {
                            if (c3979k3.m9014e()) {
                                c3979k3.m8997d();
                            }
                        }
                    }
                    if (abstractC4568q2.m9014e()) {
                        abstractC4568q2.m8997d();
                    }
                }
            }
            if (j5 <= j3) {
                return c3979k3;
            }
            long j10 = j5 * ((long) AbstractC3973e.f12998b);
            do {
                j4 = f12987i.get(this);
                if (j4 >= j10) {
                    break;
                }
            } while (!f12987i.compareAndSet(this, j4, j10));
            if (j5 * ((long) AbstractC3973e.f12998b) < m8210r()) {
                c3979k3.m8994a();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Throwable m8205m() {
        return (Throwable) f12993o.get(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Throwable m8206n() {
        Throwable thM8205m = m8205m();
        return thM8205m == null ? new C3980l("Channel was closed") : thM8205m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final Throwable m8207o() {
        Throwable thM8205m = m8205m();
        return thM8205m == null ? new C3981m("Channel was closed") : thM8205m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd A[SYNTHETIC] */
    @Override // sg.InterfaceC3984p
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8208p(Object obj) {
        int iM8190e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12986h;
        boolean z9 = false;
        long j3 = 1152921504606846975L;
        boolean z10 = m8211t(atomicLongFieldUpdater.get(this), false) ? false : !m8199g(r1 & 1152921504606846975L);
        C3977i c3977i = AbstractC3978j.f13020a;
        if (z10) {
            return c3977i;
        }
        InterfaceC2461o interfaceC2461o = AbstractC3973e.f13006j;
        C3979k c3979k = (C3979k) f12990l.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & j3;
            boolean zM8211t = m8211t(andIncrement, z9);
            int i9 = AbstractC3973e.f12998b;
            long j5 = i9;
            long j10 = j4 / j5;
            int i10 = (int) (j4 % j5);
            if (c3979k.f15053c == j10) {
                iM8190e = m8190e(this, c3979k, i10, obj, j4, interfaceC2461o, zM8211t);
                C3967n c3967n = C3967n.f12976a;
                if (iM8190e != 0) {
                    c3979k.m8994a();
                    return c3967n;
                }
                if (iM8190e == 1) {
                    return c3967n;
                }
                if (iM8190e == 2) {
                    if (zM8211t) {
                        c3979k.m9015h();
                        return new C3976h(m8207o());
                    }
                    InterfaceC3590o1 interfaceC3590o1 = interfaceC2461o instanceof InterfaceC3590o1 ? (InterfaceC3590o1) interfaceC2461o : null;
                    if (interfaceC3590o1 != null) {
                        interfaceC3590o1.mo7505a(c3979k, i10 + i9);
                    }
                    c3979k.m9015h();
                    return c3977i;
                }
                if (iM8190e == 3) {
                    C2104o.m5276A("unexpected");
                    return null;
                }
                if (iM8190e == 4) {
                    if (j4 < f12987i.get(this)) {
                        c3979k.m8994a();
                    }
                    return new C3976h(m8207o());
                }
                if (iM8190e == 5) {
                    c3979k.m8994a();
                }
                z9 = false;
            } else {
                C3979k c3979kM8188b = m8188b(this, j10, c3979k);
                if (c3979kM8188b != null) {
                    c3979k = c3979kM8188b;
                    iM8190e = m8190e(this, c3979k, i10, obj, j4, interfaceC2461o, zM8211t);
                    C3967n c3967n2 = C3967n.f12976a;
                    if (iM8190e != 0) {
                    }
                } else {
                    if (zM8211t) {
                        return new C3976h(m8207o());
                    }
                    z9 = false;
                }
            }
            j3 = 1152921504606846975L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        m8189c(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163 A[RETURN] */
    @Override // sg.InterfaceC3984p
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8209q(Object obj, InterfaceC5557c interfaceC5557c) throws Throwable {
        int iM8190e;
        Object objM7512o;
        Object obj2;
        C3971c c3971c;
        C3979k c3979k;
        int i9;
        C3971c c3971c2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12990l;
        C3979k c3979k2 = (C3979k) atomicReferenceFieldUpdater.get(c3971c2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12986h;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c3971c2);
            long j3 = andIncrement & 1152921504606846975L;
            boolean zM8211t = c3971c2.m8211t(andIncrement, false);
            int i10 = AbstractC3973e.f12998b;
            long j4 = i10;
            long j5 = j3 / j4;
            int i11 = (int) (j3 % j4);
            long j10 = c3979k2.f15053c;
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            C3967n c3967n = C3967n.f12976a;
            if (j10 != j5) {
                C3979k c3979kM8188b = m8188b(c3971c2, j5, c3979k2);
                if (c3979kM8188b != null) {
                    c3979k2 = c3979kM8188b;
                } else if (zM8211t) {
                    Object objM8216y = m8216y(obj, interfaceC5557c);
                    if (objM8216y == enumC5799a) {
                        return objM8216y;
                    }
                }
            }
            int iM8190e2 = m8190e(c3971c2, c3979k2, i11, obj, j3, null, zM8211t);
            if (iM8190e2 == 0) {
                c3979k2.m8994a();
                return c3967n;
            }
            if (iM8190e2 == 1) {
                break;
            }
            if (iM8190e2 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f12987i;
                if (iM8190e2 == 3) {
                    C3564g c3564gM7558l = AbstractC3603v.m7558l(AbstractC1184v0.m3214x(interfaceC5557c));
                    Object obj3 = obj;
                    try {
                        iM8190e = m8190e(c3971c2, c3979k2, i11, obj3, j3, c3564gM7558l, false);
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (iM8190e != 0) {
                        if (iM8190e == 1) {
                            c3564gM7558l.resumeWith(c3967n);
                        } else if (iM8190e != 2) {
                            if (iM8190e != 4) {
                                String str = "unexpected";
                                if (iM8190e != 5) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c3979k2.m8994a();
                                C3979k c3979k3 = (C3979k) atomicReferenceFieldUpdater.get(c3971c2);
                                while (true) {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c3971c2);
                                    long j11 = andIncrement2 & 1152921504606846975L;
                                    boolean zM8211t2 = c3971c2.m8211t(andIncrement2, false);
                                    int i12 = AbstractC3973e.f12998b;
                                    long j12 = i12;
                                    String str2 = str;
                                    long j13 = j11 / j12;
                                    int i13 = (int) (j11 % j12);
                                    if (c3979k3.f15053c != j13) {
                                        C3979k c3979kM8188b2 = m8188b(c3971c2, j13, c3979k3);
                                        if (c3979kM8188b2 != null) {
                                            i9 = i12;
                                            c3979k = c3979kM8188b2;
                                        } else {
                                            if (zM8211t2) {
                                                break;
                                            }
                                            str = str2;
                                        }
                                    } else {
                                        c3979k = c3979k3;
                                        i9 = i12;
                                    }
                                    int iM8190e3 = m8190e(c3971c2, c3979k, i13, obj3, j11, c3564gM7558l, zM8211t2);
                                    Object obj4 = obj3;
                                    c3971c = c3971c2;
                                    C3979k c3979k4 = c3979k;
                                    obj2 = obj4;
                                    if (iM8190e3 == 0) {
                                        c3979k4.m8994a();
                                        break;
                                    }
                                    if (iM8190e3 == 1) {
                                        break;
                                    }
                                    if (iM8190e3 != 2) {
                                        if (iM8190e3 == 3) {
                                            throw new IllegalStateException(str2);
                                        }
                                        if (iM8190e3 != 4) {
                                            if (iM8190e3 == 5) {
                                                c3979k4.m8994a();
                                            }
                                            c3979k3 = c3979k4;
                                            c3971c2 = c3971c;
                                            str = str2;
                                            obj3 = obj2;
                                        } else if (j11 < atomicLongFieldUpdater2.get(c3971c)) {
                                            c3979k4.m8994a();
                                        }
                                    } else if (zM8211t2) {
                                        c3979k4.m9015h();
                                    } else {
                                        c3564gM7558l.mo7505a(c3979k4, i13 + i9);
                                    }
                                }
                                c3564gM7558l.m7519x();
                                throw th;
                            }
                            obj2 = obj3;
                            c3971c = c3971c2;
                            if (j3 < atomicLongFieldUpdater2.get(c3971c)) {
                                c3979k2.m8994a();
                            }
                            m8189c(c3971c, obj2, c3564gM7558l);
                        } else {
                            c3564gM7558l.mo7505a(c3979k2, i11 + i10);
                        }
                        objM7512o = c3564gM7558l.m7512o();
                        if (objM7512o != enumC5799a) {
                            objM7512o = c3967n;
                        }
                        if (objM7512o != enumC5799a) {
                            return objM7512o;
                        }
                    } else {
                        c3979k2.m8994a();
                    }
                    c3564gM7558l.resumeWith(c3967n);
                    objM7512o = c3564gM7558l.m7512o();
                    if (objM7512o != enumC5799a) {
                    }
                    if (objM7512o != enumC5799a) {
                    }
                } else if (iM8190e2 == 4) {
                    if (j3 < atomicLongFieldUpdater2.get(c3971c2)) {
                        c3979k2.m8994a();
                    }
                    Object objM8216y2 = m8216y(obj, interfaceC5557c);
                    if (objM8216y2 == enumC5799a) {
                        return objM8216y2;
                    }
                } else if (iM8190e2 == 5) {
                    c3979k2.m8994a();
                }
            } else if (zM8211t) {
                c3979k2.m9015h();
                Object objM8216y3 = m8216y(obj, interfaceC5557c);
                if (objM8216y3 == enumC5799a) {
                    return objM8216y3;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final long m8210r() {
        return f12986h.get(this) & 1152921504606846975L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (sg.C3979k) ((vg.AbstractC4553b) vg.AbstractC4553b.f15021b.get(r0));
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8211t(long j3, boolean z9) {
        int i9 = (int) (j3 >> 60);
        if (i9 != 0 && i9 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12987i;
            if (i9 == 2) {
                m8201i(1152921504606846975L & j3);
                if (z9) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12991m;
                        C3979k c3979kM8204l = (C3979k) atomicReferenceFieldUpdater.get(this);
                        long j4 = atomicLongFieldUpdater.get(this);
                        if (m8210r() <= j4) {
                            break;
                        }
                        long j5 = AbstractC3973e.f12998b;
                        long j10 = j4 / j5;
                        if (c3979kM8204l.f15053c != j10 && (c3979kM8204l = m8204l(j10, c3979kM8204l)) == null) {
                            if (((C3979k) atomicReferenceFieldUpdater.get(this)).f15053c < j10) {
                                break;
                            }
                        } else {
                            c3979kM8204l.m8994a();
                            int i10 = (int) (j4 % j5);
                            while (true) {
                                Object objM8222k = c3979kM8204l.m8222k(i10);
                                if (objM8222k != null && objM8222k != AbstractC3973e.f13001e) {
                                    if (objM8222k == AbstractC3973e.f13000d || (objM8222k != AbstractC3973e.f13006j && objM8222k != AbstractC3973e.f13008l && objM8222k != AbstractC3973e.f13005i && objM8222k != AbstractC3973e.f13004h && (objM8222k == AbstractC3973e.f13003g || (objM8222k != AbstractC3973e.f13002f && j4 == atomicLongFieldUpdater.get(this))))) {
                                        break;
                                    }
                                } else {
                                    if (c3979kM8204l.m8221j(objM8222k, i10, AbstractC3973e.f13004h)) {
                                        m8203k();
                                        break;
                                    }
                                }
                            }
                            f12987i.compareAndSet(this, j4, j4 + 1);
                        }
                    }
                }
            } else {
                if (i9 != 3) {
                    C0086a.m449h(AbstractC0921a.m2249l(i9, "unexpected close status: "));
                    return false;
                }
                C3979k c3979kM8201i = m8201i(1152921504606846975L & j3);
                Object objM8987f = null;
                loop0: do {
                    int i11 = AbstractC3973e.f12998b - 1;
                    while (true) {
                        if (-1 >= i11) {
                            break;
                        }
                        long j11 = (c3979kM8201i.f15053c * ((long) AbstractC3973e.f12998b)) + ((long) i11);
                        while (true) {
                            Object objM8222k2 = c3979kM8201i.m8222k(i11);
                            if (objM8222k2 == AbstractC3973e.f13005i) {
                                break loop0;
                            }
                            if (objM8222k2 != AbstractC3973e.f13000d) {
                                if (objM8222k2 != AbstractC3973e.f13001e && objM8222k2 != null) {
                                    if (!(objM8222k2 instanceof InterfaceC3590o1) && !(objM8222k2 instanceof C3985q)) {
                                        C2463q c2463q = AbstractC3973e.f13003g;
                                        if (objM8222k2 == c2463q || objM8222k2 == AbstractC3973e.f13002f) {
                                            break loop0;
                                        }
                                        if (objM8222k2 != c2463q) {
                                            break;
                                        }
                                    } else {
                                        if (j11 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        InterfaceC3590o1 interfaceC3590o1 = objM8222k2 instanceof C3985q ? ((C3985q) objM8222k2).f13025a : (InterfaceC3590o1) objM8222k2;
                                        if (c3979kM8201i.m8221j(objM8222k2, i11, AbstractC3973e.f13008l)) {
                                            objM8987f = AbstractC4552a.m8987f(objM8987f, interfaceC3590o1);
                                            c3979kM8201i.m8224m(i11, null);
                                            c3979kM8201i.m9015h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (c3979kM8201i.m8221j(objM8222k2, i11, AbstractC3973e.f13008l)) {
                                        c3979kM8201i.m9015h();
                                        break;
                                    }
                                }
                            } else {
                                if (j11 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (c3979kM8201i.m8221j(objM8222k2, i11, AbstractC3973e.f13008l)) {
                                    c3979kM8201i.m8224m(i11, null);
                                    c3979kM8201i.m9015h();
                                    break;
                                }
                            }
                        }
                        i11--;
                    }
                } while (c3979kM8201i != null);
                if (objM8987f != null) {
                    if (objM8987f instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM8987f;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            m8217z((InterfaceC3590o1) arrayList.get(size), false);
                        }
                    } else {
                        m8217z((InterfaceC3590o1) objM8987f, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: sg.k[] */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
    
        r16 = r7;
        r3 = (sg.C3979k) r3.m8995b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
    
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z9;
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i9 = (int) (f12986h.get(this) >> 60);
        if (i9 == 2) {
            sb2.append("closed,");
        } else if (i9 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f12995g + ',');
        sb2.append("data=[");
        int i10 = 0;
        boolean z10 = true;
        List listM101y0 = AbstractC0000a.m101y0(f12991m.get(this), f12990l.get(this), f12992n.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM101y0) {
            if (((C3979k) obj) != AbstractC3973e.f12997a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            C0353j.m1307e();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j3 = ((C3979k) next).f15053c;
            do {
                Object next2 = it.next();
                long j4 = ((C3979k) next2).f15053c;
                if (j3 > j4) {
                    next = next2;
                    j3 = j4;
                }
            } while (it.hasNext());
        }
        C3979k c3979k = (C3979k) next;
        long j5 = f12987i.get(this);
        long jM8210r = m8210r();
        loop2: while (true) {
            int i11 = AbstractC3973e.f12998b;
            int i12 = i10;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                long j10 = (c3979k.f15053c * ((long) AbstractC3973e.f12998b)) + ((long) i12);
                if (j10 >= jM8210r && j10 >= j5) {
                    break loop2;
                }
                Object objM8222k = c3979k.m8222k(i12);
                boolean z11 = z10;
                Object obj2 = c3979k.f13022f.get(i12 * 2);
                if (objM8222k instanceof InterfaceC3561f) {
                    string = (j10 >= j5 || j10 < jM8210r) ? (j10 >= jM8210r || j10 < j5) ? "cont" : "send" : "receive";
                } else if (objM8222k instanceof C3985q) {
                    string = "EB(" + objM8222k + ')';
                } else if (AbstractC1416l.m3825a(objM8222k, AbstractC3973e.f13002f) || AbstractC1416l.m3825a(objM8222k, AbstractC3973e.f13003g)) {
                    string = "resuming_sender";
                } else if (objM8222k == null || objM8222k.equals(AbstractC3973e.f13001e) || objM8222k.equals(AbstractC3973e.f13005i) || objM8222k.equals(AbstractC3973e.f13004h) || objM8222k.equals(AbstractC3973e.f13007k) || objM8222k.equals(AbstractC3973e.f13006j) || objM8222k.equals(AbstractC3973e.f13008l)) {
                    i12++;
                    z10 = z11;
                } else {
                    string = objM8222k.toString();
                }
                if (obj2 != null) {
                    sb2.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb2.append(string + ',');
                }
                i12++;
                z10 = z11;
            }
            z10 = z9;
            i10 = 0;
        }
        if (AbstractC3149m.m6722u0(sb2) == ',') {
            sb2.deleteCharAt(sb2.length() - 1).getClass();
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final boolean m8212u() {
        return m8211t(f12986h.get(this), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public boolean mo8213v() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final boolean m8214w() {
        long j3 = f12988j.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8215x(long j3, C3979k c3979k) {
        C3979k c3979k2;
        C3979k c3979k3;
        while (c3979k.f15053c < j3 && (c3979k3 = (C3979k) c3979k.m8995b()) != null) {
            c3979k = c3979k3;
        }
        while (true) {
            if (!c3979k.mo8996c() || (c3979k2 = (C3979k) c3979k.m8995b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12992n;
                    AbstractC4568q abstractC4568q = (AbstractC4568q) atomicReferenceFieldUpdater.get(this);
                    if (abstractC4568q.f15053c >= c3979k.f15053c) {
                        return;
                    }
                    if (!c3979k.m9016i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC4568q, c3979k)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC4568q) {
                            if (c3979k.m9014e()) {
                                c3979k.m8997d();
                            }
                        }
                    }
                    if (abstractC4568q.m9014e()) {
                        abstractC4568q.m8997d();
                        return;
                    }
                    return;
                }
            }
            c3979k = c3979k2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final Object m8216y(Object obj, InterfaceC5557c interfaceC5557c) {
        C3564g c3564g = new C3564g(1, AbstractC1184v0.m3214x(interfaceC5557c));
        c3564g.m7513p();
        c3564g.resumeWith(new C3959f(m8207o()));
        Object objM7512o = c3564g.m7512o();
        return objM7512o == EnumC5799a.f23547g ? objM7512o : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m8217z(InterfaceC3590o1 interfaceC3590o1, boolean z9) {
        if (interfaceC3590o1 instanceof InterfaceC3561f) {
            ((InterfaceC5557c) interfaceC3590o1).resumeWith(new C3959f(z9 ? m8206n() : m8207o()));
            return;
        }
        if (!(interfaceC3590o1 instanceof C3970b)) {
            C3193a.m6826p(interfaceC3590o1, "Unexpected waiter: ");
            return;
        }
        C3970b c3970b = (C3970b) interfaceC3590o1;
        C3564g c3564g = c3970b.f12984h;
        c3564g.getClass();
        c3970b.f12984h = null;
        c3970b.f12983g = AbstractC3973e.f13008l;
        Throwable thM8205m = c3970b.f12985i.m8205m();
        if (thM8205m == null) {
            c3564g.resumeWith(Boolean.FALSE);
        } else {
            c3564g.resumeWith(new C3959f(thM8205m));
        }
    }
}
