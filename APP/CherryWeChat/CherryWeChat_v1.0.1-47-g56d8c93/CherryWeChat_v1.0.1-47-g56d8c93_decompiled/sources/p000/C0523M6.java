package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: M6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0523M6 extends AbstractC1455ge implements InterfaceC0190Eb, InterfaceC1497hc {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1707f = AtomicIntegerFieldUpdater.newUpdater(C0523M6.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1708g = AtomicReferenceFieldUpdater.newUpdater(C0523M6.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1709h = AtomicReferenceFieldUpdater.newUpdater(C0523M6.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0190Eb f1710d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1137ac f1711e;

    public C0523M6(InterfaceC0190Eb interfaceC0190Eb) {
        super(1);
        this.f1710d = interfaceC0190Eb;
        this.f1711e = interfaceC0190Eb.mo263e();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0388J0.f1324a;
    }

    /* JADX INFO: renamed from: o */
    public static void m1008o(C0394J6 c0394j6, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0394j6 + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: q */
    public static void m1009q(C0523M6 c0523m6, Object obj, int i) throws C1324de {
        Object c0103Ca;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1708g;
            Object obj2 = atomicReferenceFieldUpdater.get(c0523m6);
            if (!(obj2 instanceof InterfaceC0980Ws)) {
                if (obj2 instanceof C0652P6) {
                    if (C0652P6.f2091c.compareAndSet((C0652P6) obj2, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            InterfaceC0980Ws interfaceC0980Ws = (InterfaceC0980Ws) obj2;
            if (!(obj instanceof C0189Ea) && ((i == 1 || i == 2) && (interfaceC0980Ws instanceof C0394J6))) {
                c0103Ca = new C0103Ca(obj, interfaceC0980Ws instanceof C0394J6 ? (C0394J6) interfaceC0980Ws : null, null, 16);
            } else {
                c0103Ca = obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c0523m6, obj2, c0103Ca)) {
                if (atomicReferenceFieldUpdater.get(c0523m6) != obj2) {
                    break;
                }
            }
            if (!c0523m6.m1020n()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1709h;
                InterfaceC2100je interfaceC2100je = (InterfaceC2100je) atomicReferenceFieldUpdater2.get(c0523m6);
                if (interfaceC2100je != null) {
                    interfaceC2100je.mo1795a();
                    atomicReferenceFieldUpdater2.set(c0523m6, C0937Vs.f2926a);
                }
            }
            c0523m6.m1018l(i);
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC1455ge
    /* JADX INFO: renamed from: a */
    public final void mo1010a(CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1708g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC0980Ws) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0189Ea) {
                return;
            }
            C0394J6 c0394j6 = null;
            if (!(obj instanceof C0103Ca)) {
                C0103Ca c0103Ca = new C0103Ca(obj, c0394j6, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0103Ca)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0103Ca c0103Ca2 = (C0103Ca) obj;
            if (c0103Ca2.f247e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0103Ca c0103CaM151a = C0103Ca.m151a(c0103Ca2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0103CaM151a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            C0394J6 c0394j62 = c0103Ca2.f244b;
            if (c0394j62 != null) {
                m1016j(c0394j62, cancellationException);
            }
            C0373Im c0373Im = c0103Ca2.f245c;
            if (c0373Im != null) {
                Object obj2 = c0103Ca2.f243a;
                InterfaceC1137ac interfaceC1137ac = this.f1711e;
                try {
                    c0373Im.getClass();
                    C0373Im c0373Im2 = new C0373Im(c0373Im.f1302e, (InterfaceC0190Eb) interfaceC1137ac);
                    c0373Im2.f1301d = (C0535Mc) cancellationException;
                    c0373Im2.mo448i(C0829TC.f2620a);
                    return;
                } catch (Throwable th) {
                    AbstractC0628Oj.m1222B(interfaceC1137ac, new C0232Fa("Exception in resume onCancellation handler for " + this, th));
                    return;
                }
            }
            return;
        }
    }

    @Override // p000.AbstractC1455ge
    /* JADX INFO: renamed from: b */
    public final InterfaceC0190Eb mo1011b() {
        return this.f1710d;
    }

    @Override // p000.InterfaceC1497hc
    /* JADX INFO: renamed from: c */
    public final InterfaceC1497hc mo1012c() {
        InterfaceC0190Eb interfaceC0190Eb = this.f1710d;
        if (interfaceC0190Eb instanceof InterfaceC1497hc) {
            return (InterfaceC1497hc) interfaceC0190Eb;
        }
        return null;
    }

    @Override // p000.AbstractC1455ge
    /* JADX INFO: renamed from: d */
    public final Throwable mo1013d(Object obj) {
        Throwable thMo1013d = super.mo1013d(obj);
        if (thMo1013d != null) {
            return thMo1013d;
        }
        return null;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: e */
    public final InterfaceC1137ac mo263e() {
        return this.f1711e;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: f */
    public final void mo264f(Object obj) throws C1324de {
        Throwable thM726a = C0340Hw.m726a(obj);
        if (thM726a != null) {
            obj = new C0189Ea(thM726a, false);
        }
        m1009q(this, obj, this.f5157c);
    }

    @Override // p000.AbstractC1455ge
    /* JADX INFO: renamed from: g */
    public final Object mo1014g(Object obj) {
        return obj instanceof C0103Ca ? ((C0103Ca) obj).f243a : obj;
    }

    @Override // p000.AbstractC1455ge
    /* JADX INFO: renamed from: i */
    public final Object mo1015i() {
        return f1708g.get(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m1016j(C0394J6 c0394j6, Throwable th) {
        try {
            switch (c0394j6.f1331a) {
                case 0:
                    ((C2240mk) c0394j6.f1332b).mo90g(th);
                    break;
                default:
                    ((C2416qg) c0394j6.f1332b).mo1795a();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC0628Oj.m1222B(this.f1711e, new C0232Fa("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1017k(Throwable th) throws C1324de {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1708g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC0980Ws) {
                boolean z = obj instanceof C0394J6;
                if (th == null) {
                    cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
                } else {
                    cancellationException = th;
                }
                C0652P6 c0652p6 = new C0652P6(cancellationException, z);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0652p6)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((InterfaceC0980Ws) obj) instanceof C0394J6) {
                    m1016j((C0394J6) obj, th);
                }
                if (!m1020n()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1709h;
                    InterfaceC2100je interfaceC2100je = (InterfaceC2100je) atomicReferenceFieldUpdater2.get(this);
                    if (interfaceC2100je != null) {
                        interfaceC2100je.mo1795a();
                        atomicReferenceFieldUpdater2.set(this, C0937Vs.f2926a);
                    }
                }
                m1018l(this.f5157c);
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1018l(int i) throws C1324de {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f1707f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                InterfaceC0190Eb interfaceC0190Eb = this.f1710d;
                if (!z && (interfaceC0190Eb instanceof C1367ee)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f5157c;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C1367ee c1367ee = (C1367ee) interfaceC0190Eb;
                        AbstractC1217bc abstractC1217bc = c1367ee.f4894d;
                        InterfaceC1137ac interfaceC1137ac = c1367ee.f4895e.f731b;
                        try {
                            if (abstractC1217bc.mo2333u(interfaceC1137ac)) {
                                AbstractC1406fG.m2713m0(abstractC1217bc, interfaceC1137ac, this);
                                return;
                            }
                            AbstractC2588ug abstractC2588ugM2050a = AbstractC1129aB.m2050a();
                            if (abstractC2588ugM2050a.f8957b < 4294967296L) {
                                abstractC2588ugM2050a.m5096y(true);
                                try {
                                    AbstractC0828TB.m1625A(this, interfaceC0190Eb, true);
                                    do {
                                    } while (abstractC2588ugM2050a.m5097z());
                                } finally {
                                    try {
                                    } finally {
                                    }
                                }
                                return;
                            }
                            C0134D4 c0134d4 = abstractC2588ugM2050a.f8959d;
                            if (c0134d4 == null) {
                                c0134d4 = new C0134D4();
                                abstractC2588ugM2050a.f8959d = c0134d4;
                            }
                            c0134d4.addLast(this);
                            return;
                        } catch (Throwable th) {
                            throw new C1324de(th, abstractC1217bc, interfaceC1137ac);
                        }
                    }
                }
                AbstractC0828TB.m1625A(this, interfaceC0190Eb, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC2100je m1019m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1332dm interfaceC1332dm = (InterfaceC1332dm) this.f1711e.mo24m(C1456gf.f5162f);
        if (interfaceC1332dm == null) {
            return null;
        }
        InterfaceC2100je interfaceC2100jeM1354r = AbstractC0671Pj.m1354r(interfaceC1332dm, true, new C1443g9(0, this));
        do {
            atomicReferenceFieldUpdater = f1709h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC2100jeM1354r)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC2100jeM1354r;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1020n() {
        if (this.f5157c != 2) {
            return false;
        }
        C1367ee c1367ee = (C1367ee) this.f1710d;
        c1367ee.getClass();
        return C1367ee.f4893h.get(c1367ee) != null;
    }

    /* JADX INFO: renamed from: p */
    public final void m1021p() {
        InterfaceC0190Eb interfaceC0190Eb = this.f1710d;
        Throwable th = null;
        C1367ee c1367ee = interfaceC0190Eb instanceof C1367ee ? (C1367ee) interfaceC0190Eb : null;
        if (c1367ee != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1367ee.f4893h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c1367ee);
                C2610v1 c2610v1 = AbstractC1406fG.f4984c;
                if (obj == c2610v1) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c1367ee, c2610v1, this)) {
                        if (atomicReferenceFieldUpdater.get(c1367ee) != c2610v1) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c1367ee, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c1367ee) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1709h;
            InterfaceC2100je interfaceC2100je = (InterfaceC2100je) atomicReferenceFieldUpdater2.get(this);
            if (interfaceC2100je != null) {
                interfaceC2100je.mo1795a();
                atomicReferenceFieldUpdater2.set(this, C0937Vs.f2926a);
            }
            m1017k(th);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1022r(AbstractC1217bc abstractC1217bc) {
        InterfaceC0190Eb interfaceC0190Eb = this.f1710d;
        C1367ee c1367ee = interfaceC0190Eb instanceof C1367ee ? (C1367ee) interfaceC0190Eb : null;
        m1009q(this, C0829TC.f2620a, (c1367ee != null ? c1367ee.f4894d : null) == abstractC1217bc ? 4 : this.f5157c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0148Dc.m287u(this.f1710d));
        sb.append("){");
        Object obj = f1708g.get(this);
        sb.append(obj instanceof InterfaceC0980Ws ? "Active" : obj instanceof C0652P6 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0148Dc.m278l(this));
        return sb.toString();
    }
}
