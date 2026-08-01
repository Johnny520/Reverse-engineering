package ec;

import ec.InterfaceC2201x0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p080f9.AbstractC2368o;
import p145jc.C3819m0;
import p145jc.C3826q;
import p145jc.InterfaceC3821n0;
import p172l8.C4700i0;
import p193n3.AbstractC5489b;
import p228p8.InterfaceC5980j;
import p376zd.C10010p0;
import p376zd.C9987e;

/* JADX INFO: renamed from: ec.j1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2146j1 extends AbstractC2150k1 implements InterfaceC2201x0 {

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5970v = AtomicReferenceFieldUpdater.newUpdater(AbstractC2146j1.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5971w = AtomicReferenceFieldUpdater.newUpdater(AbstractC2146j1.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5972x = AtomicIntegerFieldUpdater.newUpdater(AbstractC2146j1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: ec.j1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a extends c {

        /* JADX INFO: renamed from: s */
        public final InterfaceC2156m f5973s;

        public a(long j10, InterfaceC2156m interfaceC2156m) {
            super(j10);
            this.f5973s = interfaceC2156m;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5973s.mo7831O(AbstractC2146j1.this, C4700i0.f13910a);
        }

        @Override // ec.AbstractC2146j1.c
        public String toString() {
            return super.toString() + this.f5973s;
        }
    }

    /* JADX INFO: renamed from: ec.j1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends c {

        /* JADX INFO: renamed from: s */
        public final Runnable f5975s;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f5975s = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5975s.run();
        }

        @Override // ec.AbstractC2146j1.c
        public String toString() {
            return super.toString() + this.f5975s;
        }
    }

    /* JADX INFO: renamed from: ec.j1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class c implements Runnable, Comparable, InterfaceC2126e1, InterfaceC3821n0 {
        private volatile Object _heap;

        /* JADX INFO: renamed from: q */
        public long f5976q;

        /* JADX INFO: renamed from: r */
        public int f5977r = -1;

        public c(long j10) {
            this.f5976q = j10;
        }

        @Override // ec.InterfaceC2126e1
        /* JADX INFO: renamed from: a */
        public final void mo7628a() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC2158m1.f5984a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.m15209h(this);
                    }
                    this._heap = AbstractC2158m1.f5984a;
                    C4700i0 c4700i0 = C4700i0.f13910a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p145jc.InterfaceC3821n0
        /* JADX INFO: renamed from: c */
        public void mo7808c(C3819m0 c3819m0) {
            if (this._heap != AbstractC2158m1.f5984a) {
                this._heap = c3819m0;
            } else {
                C9987e.m38645a("Failed requirement.");
            }
        }

        @Override // p145jc.InterfaceC3821n0
        /* JADX INFO: renamed from: g */
        public C3819m0 mo7809g() {
            Object obj = this._heap;
            if (obj instanceof C3819m0) {
                return (C3819m0) obj;
            }
            return null;
        }

        @Override // p145jc.InterfaceC3821n0
        public int getIndex() {
            return this.f5977r;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f5976q - cVar.f5976q;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        /* JADX INFO: renamed from: j */
        public final int m7811j(long j10, d dVar, AbstractC2146j1 abstractC2146j1) {
            synchronized (this) {
                if (this._heap == AbstractC2158m1.f5984a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.m15204b();
                        if (abstractC2146j1.m7791l()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f5978c = j10;
                        } else {
                            long j11 = cVar.f5976q;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f5978c > 0) {
                                dVar.f5978c = j10;
                            }
                        }
                        long j12 = this.f5976q;
                        long j13 = dVar.f5978c;
                        if (j12 - j13 < 0) {
                            this.f5976q = j13;
                        }
                        dVar.m15203a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public final boolean m7812k(long j10) {
            return j10 - this.f5976q >= 0;
        }

        @Override // p145jc.InterfaceC3821n0
        public void setIndex(int i10) {
            this.f5977r = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f5976q + ']';
        }
    }

    /* JADX INFO: renamed from: ec.j1$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends C3819m0 {

        /* JADX INFO: renamed from: c */
        public long f5978c;

        public d(long j10) {
            this.f5978c = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final boolean m7791l() {
        return f5972x.get(this) == 1;
    }

    @Override // ec.AbstractC2142i1
    /* JADX INFO: renamed from: N0 */
    public long mo7777N0() {
        c cVar;
        if (super.mo7777N0() == 0) {
            return 0L;
        }
        Object obj = f5970v.get(this);
        if (obj != null) {
            if (!(obj instanceof C3826q)) {
                return obj == AbstractC2158m1.f5985b ? Long.MAX_VALUE : 0L;
            }
            if (!((C3826q) obj).m15248j()) {
                return 0L;
            }
        }
        d dVar = (d) f5971w.get(this);
        if (dVar == null || (cVar = (c) dVar.m15207f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f5976q;
        AbstractC2115c.m7635a();
        return AbstractC2368o.m8579f(j10 - System.nanoTime(), 0L);
    }

    @Override // ec.AbstractC2142i1
    /* JADX INFO: renamed from: S0 */
    public long mo7781S0() {
        if (m7782T0()) {
            return 0L;
        }
        m7795c1();
        Runnable runnableM7793a1 = m7793a1();
        if (runnableM7793a1 == null) {
            return mo7777N0();
        }
        runnableM7793a1.run();
        return 0L;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m7792Z0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5970v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (AbstractC5489b.m22334a(f5970v, this, null, AbstractC2158m1.f5985b)) {
                    return;
                }
            } else if (obj instanceof C3826q) {
                ((C3826q) obj).m15244d();
                return;
            } else {
                if (obj == AbstractC2158m1.f5985b) {
                    return;
                }
                C3826q c3826q = new C3826q(8, true);
                c3826q.m15241a((Runnable) obj);
                if (AbstractC5489b.m22334a(f5970v, this, obj, c3826q)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final Runnable m7793a1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5970v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C3826q) {
                C3826q c3826q = (C3826q) obj;
                Object objM15251m = c3826q.m15251m();
                if (objM15251m != C3826q.f11013h) {
                    return (Runnable) objM15251m;
                }
                AbstractC5489b.m22334a(f5970v, this, obj, c3826q.m15250l());
            } else {
                if (obj == AbstractC2158m1.f5985b) {
                    return null;
                }
                if (AbstractC5489b.m22334a(f5970v, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void mo7794b1(Runnable runnable) {
        m7795c1();
        if (m7796d1(runnable)) {
            m7824X0();
        } else {
            RunnableC2185t0.f6009y.mo7794b1(runnable);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m7795c1() {
        InterfaceC3821n0 interfaceC3821n0M15210i;
        d dVar = (d) f5971w.get(this);
        if (dVar == null || dVar.m15206e()) {
            return;
        }
        AbstractC2115c.m7635a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    InterfaceC3821n0 interfaceC3821n0M15204b = dVar.m15204b();
                    if (interfaceC3821n0M15204b != null) {
                        c cVar = (c) interfaceC3821n0M15204b;
                        interfaceC3821n0M15210i = cVar.m7812k(jNanoTime) ? m7796d1(cVar) : false ? dVar.m15210i(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((c) interfaceC3821n0M15210i) != null);
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m7796d1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5970v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m7791l()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC5489b.m22334a(f5970v, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C3826q) {
                C3826q c3826q = (C3826q) obj;
                int iM15241a = c3826q.m15241a(runnable);
                if (iM15241a == 0) {
                    return true;
                }
                if (iM15241a == 1) {
                    AbstractC5489b.m22334a(f5970v, this, obj, c3826q.m15250l());
                } else if (iM15241a == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC2158m1.f5985b) {
                    return false;
                }
                C3826q c3826q2 = new C3826q(8, true);
                c3826q2.m15241a((Runnable) obj);
                c3826q2.m15241a(runnable);
                if (AbstractC5489b.m22334a(f5970v, this, obj, c3826q2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m7797h1() {
        if (!m7780R0()) {
            return false;
        }
        d dVar = (d) f5971w.get(this);
        if (dVar != null && !dVar.m15206e()) {
            return false;
        }
        Object obj = f5970v.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof C3826q ? ((C3826q) obj).m15248j() : obj == AbstractC2158m1.f5985b;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m7798i1() {
        c cVar;
        AbstractC2115c.m7635a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f5971w.get(this);
            if (dVar == null || (cVar = (c) dVar.m15211j()) == null) {
                return;
            } else {
                mo7823W0(jNanoTime, cVar);
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m7799j1() {
        f5970v.set(this, null);
        f5971w.set(this, null);
    }

    @Override // ec.InterfaceC2201x0
    /* JADX INFO: renamed from: k */
    public InterfaceC2126e1 mo7800k(long j10, Runnable runnable, InterfaceC5980j interfaceC5980j) {
        return InterfaceC2201x0.a.m7931a(this, j10, runnable, interfaceC5980j);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m7801k1(long j10, c cVar) {
        int iM7802l1 = m7802l1(j10, cVar);
        if (iM7802l1 == 0) {
            if (m7806o1(cVar)) {
                m7824X0();
            }
        } else if (iM7802l1 == 1) {
            mo7823W0(j10, cVar);
        } else {
            if (iM7802l1 == 2) {
                return;
            }
            C10010p0.m38820a("unexpected result");
        }
    }

    /* JADX INFO: renamed from: l1 */
    public final int m7802l1(long j10, c cVar) {
        if (m7791l()) {
            return 1;
        }
        d dVar = (d) f5971w.get(this);
        if (dVar == null) {
            AbstractC5489b.m22334a(f5971w, this, null, new d(j10));
            Object obj = f5971w.get(this);
            obj.getClass();
            dVar = (d) obj;
        }
        return cVar.m7811j(j10, dVar, this);
    }

    @Override // ec.InterfaceC2201x0
    /* JADX INFO: renamed from: m */
    public void mo7803m(long j10, InterfaceC2156m interfaceC2156m) {
        long jM7843c = AbstractC2158m1.m7843c(j10);
        if (jM7843c < 4611686018427387903L) {
            AbstractC2115c.m7635a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jM7843c + jNanoTime, interfaceC2156m);
            m7801k1(jNanoTime, aVar);
            AbstractC2172q.m7887a(interfaceC2156m, aVar);
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final InterfaceC2126e1 m7804m1(long j10, Runnable runnable) {
        long jM7843c = AbstractC2158m1.m7843c(j10);
        if (jM7843c >= 4611686018427387903L) {
            return C2147j2.f5979q;
        }
        AbstractC2115c.m7635a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jM7843c + jNanoTime, runnable);
        m7801k1(jNanoTime, bVar);
        return bVar;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m7805n1(boolean z10) {
        f5972x.set(this, z10 ? 1 : 0);
    }

    /* JADX INFO: renamed from: o1 */
    public final boolean m7806o1(c cVar) {
        d dVar = (d) f5971w.get(this);
        return (dVar != null ? (c) dVar.m15207f() : null) == cVar;
    }

    @Override // ec.AbstractC2142i1
    public void shutdown() {
        C2187t2.f6012a.m7909c();
        m7805n1(true);
        m7792Z0();
        while (mo7781S0() <= 0) {
        }
        m7798i1();
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: x */
    public final void mo7807x(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        mo7794b1(runnable);
    }
}
