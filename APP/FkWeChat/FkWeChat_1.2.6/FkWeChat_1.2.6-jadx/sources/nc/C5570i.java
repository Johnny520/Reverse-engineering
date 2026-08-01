package nc;

import ec.InterfaceC2109a3;
import ec.InterfaceC2156m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p024b9.C1055q;
import p097g8.AbstractC2543b;
import p145jc.AbstractC3794a;
import p145jc.AbstractC3795a0;
import p145jc.AbstractC3797b0;
import p172l8.C4700i0;
import p193n3.AbstractC5489b;
import p228p8.InterfaceC5980j;
import p314vb.C8897d;
import p376zd.C10030z0;

/* JADX INFO: renamed from: nc.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C5570i {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17435c = AtomicReferenceFieldUpdater.newUpdater(C5570i.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f17436d = AtomicLongFieldUpdater.newUpdater(C5570i.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17437e = AtomicReferenceFieldUpdater.newUpdater(C5570i.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f17438f = AtomicLongFieldUpdater.newUpdater(C5570i.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17439g = AtomicIntegerFieldUpdater.newUpdater(C5570i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final int f17440a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0189q f17441b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: nc.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a extends C1055q implements InterfaceC0188p {

        /* JADX INFO: renamed from: y */
        public static final a f17442y = new a();

        public a() {
            super(2, AbstractC5571j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m22644y(((Number) obj).longValue(), (C5572k) obj2);
        }

        /* JADX INFO: renamed from: y */
        public final C5572k m22644y(long j10, C5572k c5572k) {
            return AbstractC5571j.m22653h(j10, c5572k);
        }
    }

    /* JADX INFO: renamed from: nc.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b extends C1055q implements InterfaceC0188p {

        /* JADX INFO: renamed from: y */
        public static final b f17443y = new b();

        public b() {
            super(2, AbstractC5571j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m22645y(((Number) obj).longValue(), (C5572k) obj2);
        }

        /* JADX INFO: renamed from: y */
        public final C5572k m22645y(long j10, C5572k c5572k) {
            return AbstractC5571j.m22653h(j10, c5572k);
        }
    }

    public C5570i(int i10, int i11) {
        this.f17440a = i10;
        if (i10 <= 0) {
            C10030z0.m38853a("Semaphore should have at least 1 permit, but had ", i10);
            throw null;
        }
        if (i11 < 0 || i11 > i10) {
            C10030z0.m38853a("The number of acquired permits should be in 0..", i10);
            throw null;
        }
        C5572k c5572k = new C5572k(0L, null, 2);
        this.head$volatile = c5572k;
        this.tail$volatile = c5572k;
        this._availablePermits$volatile = i10 - i11;
        this.f17441b = new InterfaceC0189q() { // from class: nc.h
            @Override // p010a9.InterfaceC0189q
            /* JADX INFO: renamed from: e */
            public final Object mo236e(Object obj, Object obj2, Object obj3) {
                return C5570i.m22629e(this.f17434q, (Throwable) obj, (C4700i0) obj2, (InterfaceC5980j) obj3);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static C4700i0 m22629e(C5570i c5570i, Throwable th, C4700i0 c4700i0, InterfaceC5980j interfaceC5980j) {
        c5570i.m22640p();
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: f */
    public final void m22635f(InterfaceC2156m interfaceC2156m) {
        while (m22638i() <= 0) {
            interfaceC2156m.getClass();
            if (m22636g((InterfaceC2109a3) interfaceC2156m)) {
                return;
            }
        }
        interfaceC2156m.mo7836v(C4700i0.f13910a, this.f17441b);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m22636g(InterfaceC2109a3 interfaceC2109a3) {
        Object objM15125c;
        C5572k c5572k = (C5572k) f17437e.get(this);
        long andIncrement = f17438f.getAndIncrement(this);
        a aVar = a.f17442y;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17437e;
        long j10 = andIncrement / ((long) AbstractC5571j.f17449f);
        loop0: while (true) {
            objM15125c = AbstractC3794a.m15125c(c5572k, j10, aVar);
            if (!AbstractC3797b0.m15146c(objM15125c)) {
                AbstractC3795a0 abstractC3795a0M15145b = AbstractC3797b0.m15145b(objM15125c);
                while (true) {
                    AbstractC3795a0 abstractC3795a0 = (AbstractC3795a0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC3795a0.f10969c >= abstractC3795a0M15145b.f10969c) {
                        break loop0;
                    }
                    if (!abstractC3795a0M15145b.m15130u()) {
                        break;
                    }
                    if (AbstractC5489b.m22334a(atomicReferenceFieldUpdater, this, abstractC3795a0, abstractC3795a0M15145b)) {
                        if (abstractC3795a0.m15128p()) {
                            abstractC3795a0.m15142n();
                        }
                    } else if (abstractC3795a0M15145b.m15128p()) {
                        abstractC3795a0M15145b.m15142n();
                    }
                }
            } else {
                break;
            }
        }
        C5572k c5572k2 = (C5572k) AbstractC3797b0.m15145b(objM15125c);
        int i10 = (int) (andIncrement % ((long) AbstractC5571j.f17449f));
        if (AbstractC2543b.m9063a(c5572k2.m22654v(), i10, null, interfaceC2109a3)) {
            interfaceC2109a3.mo7618a(c5572k2, i10);
            return true;
        }
        if (!AbstractC2543b.m9063a(c5572k2.m22654v(), i10, AbstractC5571j.f17445b, AbstractC5571j.f17446c)) {
            return false;
        }
        if (!(interfaceC2109a3 instanceof InterfaceC2156m)) {
            C8897d.m34134a("unexpected: ", interfaceC2109a3);
            return false;
        }
        interfaceC2109a3.getClass();
        ((InterfaceC2156m) interfaceC2109a3).mo7836v(C4700i0.f13910a, this.f17441b);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m22637h() {
        int i10;
        do {
            i10 = f17439g.get(this);
            if (i10 <= this.f17440a) {
                return;
            }
        } while (!f17439g.compareAndSet(this, i10, this.f17440a));
    }

    /* JADX INFO: renamed from: i */
    public final int m22638i() {
        int andDecrement;
        do {
            andDecrement = f17439g.getAndDecrement(this);
        } while (andDecrement > this.f17440a);
        return andDecrement;
    }

    /* JADX INFO: renamed from: j */
    public final int m22639j() {
        return Math.max(f17439g.get(this), 0);
    }

    /* JADX INFO: renamed from: p */
    public final void m22640p() {
        do {
            int andIncrement = f17439g.getAndIncrement(this);
            if (andIncrement >= this.f17440a) {
                m22637h();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f17440a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m22643s());
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22641q() {
        while (true) {
            int i10 = f17439g.get(this);
            if (i10 > this.f17440a) {
                m22637h();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f17439g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22642r(Object obj) {
        if (!(obj instanceof InterfaceC2156m)) {
            C8897d.m34134a("unexpected: ", obj);
            return false;
        }
        InterfaceC2156m interfaceC2156m = (InterfaceC2156m) obj;
        Object objMo7835o = interfaceC2156m.mo7835o(C4700i0.f13910a, null, this.f17441b);
        if (objMo7835o == null) {
            return false;
        }
        interfaceC2156m.mo7832Q(objMo7835o);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m22643s() {
        Object objM15125c;
        C5572k c5572k = (C5572k) f17435c.get(this);
        long andIncrement = f17436d.getAndIncrement(this);
        long j10 = andIncrement / ((long) AbstractC5571j.f17449f);
        b bVar = b.f17443y;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17435c;
        loop0: while (true) {
            objM15125c = AbstractC3794a.m15125c(c5572k, j10, bVar);
            if (AbstractC3797b0.m15146c(objM15125c)) {
                break;
            }
            AbstractC3795a0 abstractC3795a0M15145b = AbstractC3797b0.m15145b(objM15125c);
            while (true) {
                AbstractC3795a0 abstractC3795a0 = (AbstractC3795a0) atomicReferenceFieldUpdater.get(this);
                if (abstractC3795a0.f10969c >= abstractC3795a0M15145b.f10969c) {
                    break loop0;
                }
                if (!abstractC3795a0M15145b.m15130u()) {
                    break;
                }
                if (AbstractC5489b.m22334a(atomicReferenceFieldUpdater, this, abstractC3795a0, abstractC3795a0M15145b)) {
                    if (abstractC3795a0.m15128p()) {
                        abstractC3795a0.m15142n();
                    }
                } else if (abstractC3795a0M15145b.m15128p()) {
                    abstractC3795a0M15145b.m15142n();
                }
            }
        }
        C5572k c5572k2 = (C5572k) AbstractC3797b0.m15145b(objM15125c);
        c5572k2.m15134c();
        if (c5572k2.f10969c > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) AbstractC5571j.f17449f));
        Object andSet = c5572k2.m22654v().getAndSet(i10, AbstractC5571j.f17445b);
        if (andSet != null) {
            if (andSet == AbstractC5571j.f17448e) {
                return false;
            }
            return m22642r(andSet);
        }
        int i11 = AbstractC5571j.f17444a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (c5572k2.m22654v().get(i10) == AbstractC5571j.f17446c) {
                return true;
            }
        }
        return !AbstractC2543b.m9063a(c5572k2.m22654v(), i10, AbstractC5571j.f17445b, AbstractC5571j.f17447d);
    }
}
