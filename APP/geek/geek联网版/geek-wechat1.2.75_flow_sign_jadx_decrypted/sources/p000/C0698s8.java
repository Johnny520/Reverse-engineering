package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: s8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0698s8 extends AbstractC0892xg implements InterfaceC0814vd, InterfaceC0667re {

    /* JADX INFO: renamed from: f */
    public static final AtomicIntegerFieldUpdater f4213f = AtomicIntegerFieldUpdater.newUpdater(C0698s8.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: g */
    public static final AtomicReferenceFieldUpdater f4214g = AtomicReferenceFieldUpdater.newUpdater(C0698s8.class, Object.class, "_state");

    /* JADX INFO: renamed from: h */
    public static final AtomicReferenceFieldUpdater f4215h = AtomicReferenceFieldUpdater.newUpdater(C0698s8.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0814vd f4216d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0295he f4217e;

    public C0698s8(InterfaceC0814vd interfaceC0814vd) {
        super(1);
        this.f4216d = interfaceC0814vd;
        this.f4217e = interfaceC0814vd.mo1117d();
        this._decisionAndIndex = 536870911;
        this._state = C0543o1.f3356a;
    }

    /* JADX INFO: renamed from: p */
    public static void m2311p(C0104ch c0104ch, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0104ch + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: r */
    public static void m2312r(C0698s8 c0698s8, Object obj, int i) {
        Object c0775ub;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4214g;
            Object obj2 = atomicReferenceFieldUpdater.get(c0698s8);
            if (!(obj2 instanceof InterfaceC0871ww)) {
                if (obj2 instanceof C0809v8) {
                    if (C0809v8.f4918c.compareAndSet((C0809v8) obj2, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            InterfaceC0871ww interfaceC0871ww = (InterfaceC0871ww) obj2;
            if (!(obj instanceof C0850wb) && ((i == 1 || i == 2) && (interfaceC0871ww instanceof C0104ch))) {
                c0775ub = new C0775ub(obj, interfaceC0871ww instanceof C0104ch ? (C0104ch) interfaceC0871ww : null, null, 16);
            } else {
                c0775ub = obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c0698s8, obj2, c0775ub)) {
                if (atomicReferenceFieldUpdater.get(c0698s8) != obj2) {
                    break;
                }
            }
            if (!c0698s8.m2323o()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4215h;
                InterfaceC0068bh interfaceC0068bh = (InterfaceC0068bh) atomicReferenceFieldUpdater2.get(c0698s8);
                if (interfaceC0068bh != null) {
                    interfaceC0068bh.mo522b();
                    atomicReferenceFieldUpdater2.set(c0698s8, C0833vw.f5012a);
                }
            }
            c0698s8.m2320l(i);
            return;
        }
    }

    @Override // p000.AbstractC0892xg
    /* JADX INFO: renamed from: a */
    public final void mo2313a(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4214g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC0871ww) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0850wb) {
                return;
            }
            C0104ch c0104ch = null;
            if (!(obj2 instanceof C0775ub)) {
                C0775ub c0775ub = new C0775ub(obj2, c0104ch, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0775ub)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0775ub c0775ub2 = (C0775ub) obj2;
            if (c0775ub2.f4679e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0775ub c0775ubM2450a = C0775ub.m2450a(c0775ub2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0775ubM2450a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            C0104ch c0104ch2 = c0775ub2.f4676b;
            if (c0104ch2 != null) {
                m2318j(c0104ch2, cancellationException);
            }
            InterfaceC0786um interfaceC0786um = c0775ub2.f4677c;
            if (interfaceC0786um != null) {
                try {
                    interfaceC0786um.mo26f(cancellationException);
                    return;
                } catch (Throwable th) {
                    g80.m1202q(this.f4217e, new C0924yb("Exception in resume onCancellation handler for " + this, th));
                    return;
                }
            }
            return;
        }
    }

    @Override // p000.AbstractC0892xg
    /* JADX INFO: renamed from: b */
    public final InterfaceC0814vd mo2314b() {
        return this.f4216d;
    }

    @Override // p000.InterfaceC0667re
    /* JADX INFO: renamed from: c */
    public final InterfaceC0667re mo824c() {
        InterfaceC0814vd interfaceC0814vd = this.f4216d;
        if (interfaceC0814vd instanceof InterfaceC0667re) {
            return (InterfaceC0667re) interfaceC0814vd;
        }
        return null;
    }

    @Override // p000.InterfaceC0814vd
    /* JADX INFO: renamed from: d */
    public final InterfaceC0295he mo1117d() {
        return this.f4217e;
    }

    @Override // p000.AbstractC0892xg
    /* JADX INFO: renamed from: e */
    public final Throwable mo2315e(Object obj) {
        Throwable thMo2315e = super.mo2315e(obj);
        if (thMo2315e != null) {
            return thMo2315e;
        }
        return null;
    }

    @Override // p000.InterfaceC0814vd
    /* JADX INFO: renamed from: f */
    public final void mo1118f(Object obj) {
        Throwable thM1794a = m10.m1794a(obj);
        if (thM1794a != null) {
            obj = new C0850wb(thM1794a, false);
        }
        m2312r(this, obj, this.f5245c);
    }

    @Override // p000.AbstractC0892xg
    /* JADX INFO: renamed from: g */
    public final Object mo2316g(Object obj) {
        return obj instanceof C0775ub ? ((C0775ub) obj).f4675a : obj;
    }

    @Override // p000.AbstractC0892xg
    /* JADX INFO: renamed from: i */
    public final Object mo2317i() {
        return f4214g.get(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m2318j(C0104ch c0104ch, Throwable th) {
        try {
            c0104ch.m634a(th);
        } catch (Throwable th2) {
            g80.m1202q(this.f4217e, new C0924yb("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2319k(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4214g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC0871ww) {
                C0809v8 c0809v8 = new C0809v8(this, th, obj instanceof C0104ch);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0809v8)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((InterfaceC0871ww) obj) instanceof C0104ch) {
                    m2318j((C0104ch) obj, th);
                }
                if (!m2323o()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4215h;
                    InterfaceC0068bh interfaceC0068bh = (InterfaceC0068bh) atomicReferenceFieldUpdater2.get(this);
                    if (interfaceC0068bh != null) {
                        interfaceC0068bh.mo522b();
                        atomicReferenceFieldUpdater2.set(this, C0833vw.f5012a);
                    }
                }
                m2320l(this.f5245c);
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2320l(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f4213f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                InterfaceC0814vd interfaceC0814vd = this.f4216d;
                if (!z && (interfaceC0814vd instanceof C0817vg)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f5245c;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C0817vg c0817vg = (C0817vg) interfaceC0814vd;
                        AbstractC0445le abstractC0445le = c0817vg.f4955d;
                        InterfaceC0295he interfaceC0295he = c0817vg.f4956e.f4415b;
                        AbstractC0493mp.m1854d(interfaceC0295he);
                        if (abstractC0445le.mo1760e()) {
                            abstractC0445le.mo584d(interfaceC0295he, this);
                            return;
                        }
                        AbstractC0487mj abstractC0487mjM2797a = z60.m2797a();
                        if (abstractC0487mjM2797a.f3149c < 4294967296L) {
                            abstractC0487mjM2797a.m1825k(true);
                            try {
                                AbstractC0259gf.m1235S(this, interfaceC0814vd, true);
                                do {
                                } while (abstractC0487mjM2797a.m1826l());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            return;
                        }
                        C0400k6 c0400k6 = abstractC0487mjM2797a.f3151e;
                        if (c0400k6 == null) {
                            c0400k6 = new C0400k6();
                            abstractC0487mjM2797a.f3151e = c0400k6;
                        }
                        c0400k6.addLast(this);
                        return;
                    }
                }
                AbstractC0259gf.m1235S(this, interfaceC0814vd, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC0068bh m2321m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0641qp interfaceC0641qp = (InterfaceC0641qp) this.f4217e.mo447b(C0893xh.f5252h);
        if (interfaceC0641qp == null) {
            return null;
        }
        InterfaceC0068bh interfaceC0068bhM1203r = g80.m1203r(interfaceC0641qp, new C0404ka(this), 2);
        do {
            atomicReferenceFieldUpdater = f4215h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC0068bhM1203r)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC0068bhM1203r;
    }

    /* JADX INFO: renamed from: n */
    public final void m2322n(InterfaceC0786um interfaceC0786um) {
        C0104ch c0104ch = interfaceC0786um instanceof C0104ch ? (C0104ch) interfaceC0786um : new C0104ch(1, interfaceC0786um);
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4214g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0543o1) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0104ch)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            CancellationException cancellationException = null;
            if (obj instanceof C0104ch) {
                m2311p(c0104ch, obj);
                throw null;
            }
            if (obj instanceof C0850wb) {
                C0850wb c0850wb = (C0850wb) obj;
                if (!C0850wb.f5078b.compareAndSet(c0850wb, 0, 1)) {
                    m2311p(c0104ch, obj);
                    throw null;
                }
                if (obj instanceof C0809v8) {
                    m2318j(c0104ch, c0850wb.f5079a);
                    return;
                }
                return;
            }
            if (!(obj instanceof C0775ub)) {
                C0775ub c0775ub = new C0775ub(obj, c0104ch, cancellationException, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0775ub)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0775ub c0775ub2 = (C0775ub) obj;
            if (c0775ub2.f4676b != null) {
                m2311p(c0104ch, obj);
                throw null;
            }
            Throwable th = c0775ub2.f4679e;
            if (th != null) {
                m2318j(c0104ch, th);
                return;
            }
            C0775ub c0775ubM2450a = C0775ub.m2450a(c0775ub2, c0104ch, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0775ubM2450a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2323o() {
        if (this.f5245c != 2) {
            return false;
        }
        InterfaceC0814vd interfaceC0814vd = this.f4216d;
        AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", interfaceC0814vd);
        return C0817vg.f4954h.get((C0817vg) interfaceC0814vd) != null;
    }

    /* JADX INFO: renamed from: q */
    public final void m2324q() {
        InterfaceC0814vd interfaceC0814vd = this.f4216d;
        Throwable th = null;
        C0817vg c0817vg = interfaceC0814vd instanceof C0817vg ? (C0817vg) interfaceC0814vd : null;
        if (c0817vg != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0817vg.f4954h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c0817vg);
                C0431l0 c0431l0 = g80.f1911e;
                if (obj == c0431l0) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c0817vg, c0431l0, this)) {
                        if (atomicReferenceFieldUpdater.get(c0817vg) != c0431l0) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c0817vg, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c0817vg) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4215h;
            InterfaceC0068bh interfaceC0068bh = (InterfaceC0068bh) atomicReferenceFieldUpdater2.get(this);
            if (interfaceC0068bh != null) {
                interfaceC0068bh.mo522b();
                atomicReferenceFieldUpdater2.set(this, C0833vw.f5012a);
            }
            m2319k(th);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2325s(AbstractC0445le abstractC0445le) {
        C0893xh c0893xh = C0893xh.f5258n;
        InterfaceC0814vd interfaceC0814vd = this.f4216d;
        C0817vg c0817vg = interfaceC0814vd instanceof C0817vg ? (C0817vg) interfaceC0814vd : null;
        m2312r(this, c0893xh, (c0817vg != null ? c0817vg.f4955d : null) == abstractC0445le ? 4 : this.f5245c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0259gf.m1240Y(this.f4216d));
        sb.append("){");
        Object obj = f4214g.get(this);
        sb.append(obj instanceof InterfaceC0871ww ? "Active" : obj instanceof C0809v8 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0259gf.m1262x(this));
        return sb.toString();
    }
}
