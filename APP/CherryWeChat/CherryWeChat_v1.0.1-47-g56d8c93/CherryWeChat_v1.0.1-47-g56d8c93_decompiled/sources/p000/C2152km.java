package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: km */
/* JADX INFO: loaded from: classes.dex */
public class C2152km implements InterfaceC1332dm, InterfaceC0423Jt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7529a = AtomicReferenceFieldUpdater.newUpdater(C2152km.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7530b = AtomicReferenceFieldUpdater.newUpdater(C2152km.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C2152km(boolean z) {
        this._state$volatile = z ? AbstractC0295Gu.f1003h : AbstractC0295Gu.f1002g;
    }

    /* JADX INFO: renamed from: F */
    public static C1531i9 m4341F(C1291cp c1291cp) {
        while (c1291cp.mo1687i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1291cp.f4721b;
            C1291cp c1291cpM2527f = c1291cp.m2527f();
            if (c1291cpM2527f == null) {
                Object obj = atomicReferenceFieldUpdater.get(c1291cp);
                while (true) {
                    c1291cp = (C1291cp) obj;
                    if (!c1291cp.mo1687i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c1291cp);
                }
            } else {
                c1291cp = c1291cpM2527f;
            }
        }
        while (true) {
            c1291cp = c1291cp.m2529h();
            if (!c1291cp.mo1687i()) {
                if (c1291cp instanceof C1531i9) {
                    return (C1531i9) c1291cp;
                }
                if (c1291cp instanceof C0851Ts) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static String m4342L(Object obj) {
        if (!(obj instanceof C2108jm)) {
            return obj instanceof InterfaceC1418fl ? ((InterfaceC1418fl) obj).mo564d() ? "Active" : "New" : obj instanceof C0189Ea ? "Cancelled" : "Completed";
        }
        C2108jm c2108jm = (C2108jm) obj;
        return c2108jm.m4296c() ? "Cancelling" : C2108jm.f7408b.get(c2108jm) == 1 ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: A */
    public void mo4343A(C0232Fa c0232Fa) {
        throw c0232Fa;
    }

    /* JADX INFO: renamed from: B */
    public final void m4344B(InterfaceC1332dm interfaceC1332dm) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7530b;
        C0937Vs c0937Vs = C0937Vs.f2926a;
        if (interfaceC1332dm == null) {
            atomicReferenceFieldUpdater.set(this, c0937Vs);
            return;
        }
        interfaceC1332dm.start();
        InterfaceC1487h9 interfaceC1487h9Mo1746i = interfaceC1332dm.mo1746i(this);
        atomicReferenceFieldUpdater.set(this, interfaceC1487h9Mo1746i);
        if (f7529a.get(this) instanceof InterfaceC1418fl) {
            return;
        }
        interfaceC1487h9Mo1746i.mo1795a();
        atomicReferenceFieldUpdater.set(this, c0937Vs);
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC2100je m4345C(boolean z, AbstractC1507hm abstractC1507hm) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0937Vs c0937Vs;
        boolean z2;
        boolean zM2526c;
        abstractC1507hm.f5343d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f7529a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof C0280Gf;
            c0937Vs = C0937Vs.f2926a;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC1418fl)) {
                    z2 = false;
                    break;
                }
                InterfaceC1418fl interfaceC1418fl = (InterfaceC1418fl) obj;
                C0851Ts c0851TsMo565e = interfaceC1418fl.mo565e();
                if (c0851TsMo565e == null) {
                    m4352K((AbstractC1507hm) obj);
                } else {
                    if (abstractC1507hm.mo1505j()) {
                        C2108jm c2108jm = interfaceC1418fl instanceof C2108jm ? (C2108jm) interfaceC1418fl : null;
                        Throwable thM4295b = c2108jm != null ? c2108jm.m4295b() : null;
                        if (thM4295b == null) {
                            zM2526c = c0851TsMo565e.m2526c(abstractC1507hm, 5);
                        } else if (z) {
                            abstractC1507hm.mo1506k(thM4295b);
                            return c0937Vs;
                        }
                    } else {
                        zM2526c = c0851TsMo565e.m2526c(abstractC1507hm, 1);
                    }
                    if (zM2526c) {
                        break;
                    }
                }
            } else {
                C0280Gf c0280Gf = (C0280Gf) obj;
                if (c0280Gf.f907a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC1507hm)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m4351J(c0280Gf);
            }
        }
        if (z2) {
            return abstractC1507hm;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0189Ea c0189Ea = obj2 instanceof C0189Ea ? (C0189Ea) obj2 : null;
            abstractC1507hm.mo1506k(c0189Ea != null ? c0189Ea.f575a : null);
        }
        return c0937Vs;
    }

    /* JADX INFO: renamed from: D */
    public boolean mo4346D() {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final Object m4347E(Object obj) {
        Object objM4353M;
        do {
            objM4353M = m4353M(f7529a.get(this), obj);
            if (objM4353M == AbstractC0295Gu.f997b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0189Ea c0189Ea = obj instanceof C0189Ea ? (C0189Ea) obj : null;
                throw new IllegalStateException(str, c0189Ea != null ? c0189Ea.f575a : null);
            }
        } while (objM4353M == AbstractC0295Gu.f999d);
        return objM4353M;
    }

    /* JADX INFO: renamed from: G */
    public final void m4348G(C0851Ts c0851Ts, Throwable th) {
        c0851Ts.m2526c(new C2510so(4), 4);
        C0232Fa c0232Fa = null;
        for (C1291cp c1291cpM2529h = (C1291cp) C1291cp.f4720a.get(c0851Ts); !AbstractC0585Nj.m1134a(c1291cpM2529h, c0851Ts); c1291cpM2529h = c1291cpM2529h.m2529h()) {
            if ((c1291cpM2529h instanceof AbstractC1507hm) && ((AbstractC1507hm) c1291cpM2529h).mo1505j()) {
                try {
                    ((AbstractC1507hm) c1291cpM2529h).mo1506k(th);
                } catch (Throwable th2) {
                    if (c0232Fa != null) {
                        AbstractC0148Dc.m268b(c0232Fa, th2);
                    } else {
                        c0232Fa = new C0232Fa("Exception in completion handler " + c1291cpM2529h + " for " + this, th2);
                    }
                }
            }
        }
        if (c0232Fa != null) {
            mo4343A(c0232Fa);
        }
        m4356j(th);
    }

    /* JADX INFO: renamed from: H */
    public void mo4349H(Object obj) {
    }

    /* JADX INFO: renamed from: I */
    public void m4350I() {
    }

    /* JADX INFO: renamed from: J */
    public final void m4351J(C0280Gf c0280Gf) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0851Ts c0851Ts = new C0851Ts();
        Object c1374el = c0851Ts;
        if (!c0280Gf.f907a) {
            c1374el = new C1374el(c0851Ts);
        }
        do {
            atomicReferenceFieldUpdater = f7529a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c0280Gf, c1374el)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c0280Gf);
    }

    /* JADX INFO: renamed from: K */
    public final void m4352K(AbstractC1507hm abstractC1507hm) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0851Ts c0851Ts = new C0851Ts();
        abstractC1507hm.getClass();
        C1291cp.f4721b.set(c0851Ts, abstractC1507hm);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1291cp.f4720a;
        atomicReferenceFieldUpdater2.set(c0851Ts, abstractC1507hm);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(abstractC1507hm) == abstractC1507hm) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC1507hm, abstractC1507hm, c0851Ts)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC1507hm) != abstractC1507hm) {
                        break;
                    }
                }
                c0851Ts.m2528g(abstractC1507hm);
                break loop0;
            }
            break;
        }
        C1291cp c1291cpM2529h = abstractC1507hm.m2529h();
        do {
            atomicReferenceFieldUpdater = f7529a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC1507hm, c1291cpM2529h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC1507hm);
    }

    /* JADX INFO: renamed from: M */
    public final Object m4353M(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC1418fl)) {
            return AbstractC0295Gu.f997b;
        }
        if (((obj instanceof C0280Gf) || (obj instanceof AbstractC1507hm)) && !(obj instanceof C1531i9) && !(obj2 instanceof C0189Ea)) {
            InterfaceC1418fl interfaceC1418fl = (InterfaceC1418fl) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7529a;
            Object c1462gl = obj2 instanceof InterfaceC1418fl ? new C1462gl((InterfaceC1418fl) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1418fl, c1462gl)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC1418fl) {
                    return AbstractC0295Gu.f999d;
                }
            }
            mo4349H(obj2);
            m4358t(interfaceC1418fl, obj2);
            return obj2;
        }
        InterfaceC1418fl interfaceC1418fl2 = (InterfaceC1418fl) obj;
        C0851Ts c0851TsM4361y = m4361y(interfaceC1418fl2);
        if (c0851TsM4361y == null) {
            return AbstractC0295Gu.f999d;
        }
        C2108jm c2108jm = interfaceC1418fl2 instanceof C2108jm ? (C2108jm) interfaceC1418fl2 : null;
        if (c2108jm == null) {
            c2108jm = new C2108jm(c0851TsM4361y, null);
        }
        synchronized (c2108jm) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C2108jm.f7408b;
            if (atomicIntegerFieldUpdater.get(c2108jm) == 1) {
                return AbstractC0295Gu.f997b;
            }
            atomicIntegerFieldUpdater.set(c2108jm, 1);
            if (c2108jm != interfaceC1418fl2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7529a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC1418fl2, c2108jm)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC1418fl2) {
                        return AbstractC0295Gu.f999d;
                    }
                }
            }
            boolean zM4296c = c2108jm.m4296c();
            C0189Ea c0189Ea = obj2 instanceof C0189Ea ? (C0189Ea) obj2 : null;
            if (c0189Ea != null) {
                c2108jm.m4294a(c0189Ea.f575a);
            }
            Throwable thM4295b = zM4296c ? null : c2108jm.m4295b();
            if (thM4295b != null) {
                m4348G(c0851TsM4361y, thM4295b);
            }
            C1531i9 c1531i9M4341F = m4341F(c0851TsM4361y);
            if (c1531i9M4341F != null && m4354N(c2108jm, c1531i9M4341F, obj2)) {
                return AbstractC0295Gu.f998c;
            }
            c0851TsM4361y.m2526c(new C2510so(2), 2);
            C1531i9 c1531i9M4341F2 = m4341F(c0851TsM4361y);
            return (c1531i9M4341F2 == null || !m4354N(c2108jm, c1531i9M4341F2, obj2)) ? m4360v(c2108jm, obj2) : AbstractC0295Gu.f998c;
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m4354N(C2108jm c2108jm, C1531i9 c1531i9, Object obj) {
        while (AbstractC0671Pj.m1354r(c1531i9.f5413e, false, new C1550im(this, c2108jm, c1531i9, obj)) == C0937Vs.f2926a) {
            c1531i9 = m4341F(c1531i9);
            if (c1531i9 == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void mo2728b(Object obj) {
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: d */
    public boolean mo1745d() {
        Object obj = f7529a.get(this);
        return (obj instanceof InterfaceC1418fl) && ((InterfaceC1418fl) obj).mo564d();
    }

    /* JADX INFO: renamed from: g */
    public void mo2729g(Object obj) {
        mo2728b(obj);
    }

    @Override // p000.InterfaceC1049Yb
    public final InterfaceC1092Zb getKey() {
        return C1456gf.f5162f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4355h(Object obj) {
        C2610v1 c2610v1;
        Object objM4353M = AbstractC0295Gu.f997b;
        if (mo2731x()) {
            do {
                Object obj2 = f7529a.get(this);
                if (obj2 instanceof InterfaceC1418fl) {
                    if (obj2 instanceof C2108jm) {
                        if (C2108jm.f7408b.get((C2108jm) obj2) == 1) {
                        }
                    }
                    objM4353M = m4353M(obj2, new C0189Ea(m4359u(obj), false));
                }
                objM4353M = AbstractC0295Gu.f997b;
                break;
            } while (objM4353M == AbstractC0295Gu.f999d);
            if (objM4353M != AbstractC0295Gu.f998c) {
                if (objM4353M == AbstractC0295Gu.f997b) {
                    Throwable thM4359u = null;
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7529a;
                        Object obj3 = atomicReferenceFieldUpdater.get(this);
                        if (!(obj3 instanceof C2108jm)) {
                            if (!(obj3 instanceof InterfaceC1418fl)) {
                                c2610v1 = AbstractC0295Gu.f1000e;
                                break;
                            }
                            if (thM4359u == null) {
                                thM4359u = m4359u(obj);
                            }
                            InterfaceC1418fl interfaceC1418fl = (InterfaceC1418fl) obj3;
                            if (interfaceC1418fl.mo564d()) {
                                C0851Ts c0851TsM4361y = m4361y(interfaceC1418fl);
                                if (c0851TsM4361y != null) {
                                    C2108jm c2108jm = new C2108jm(c0851TsM4361y, thM4359u);
                                    while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1418fl, c2108jm)) {
                                        if (atomicReferenceFieldUpdater.get(this) != interfaceC1418fl) {
                                            break;
                                        }
                                    }
                                    m4348G(c0851TsM4361y, thM4359u);
                                    c2610v1 = AbstractC0295Gu.f997b;
                                    break loop1;
                                }
                                continue;
                            } else {
                                Object objM4353M2 = m4353M(obj3, new C0189Ea(thM4359u, false));
                                if (objM4353M2 == AbstractC0295Gu.f997b) {
                                    throw new IllegalStateException(("Cannot happen in " + obj3).toString());
                                }
                                if (objM4353M2 != AbstractC0295Gu.f999d) {
                                    objM4353M = objM4353M2;
                                    break;
                                }
                            }
                        } else {
                            synchronized (obj3) {
                                if (C2108jm.f7410d.get((C2108jm) obj3) == AbstractC0295Gu.f1001f) {
                                    c2610v1 = AbstractC0295Gu.f1000e;
                                } else {
                                    boolean zM4296c = ((C2108jm) obj3).m4296c();
                                    if (obj != null || !zM4296c) {
                                        if (thM4359u == null) {
                                            thM4359u = m4359u(obj);
                                        }
                                        ((C2108jm) obj3).m4294a(thM4359u);
                                    }
                                    Throwable thM4295b = zM4296c ? null : ((C2108jm) obj3).m4295b();
                                    if (thM4295b != null) {
                                        m4348G(((C2108jm) obj3).f7411a, thM4295b);
                                    }
                                    c2610v1 = AbstractC0295Gu.f997b;
                                }
                            }
                        }
                    }
                    objM4353M = c2610v1;
                }
                if (objM4353M != AbstractC0295Gu.f997b && objM4353M != AbstractC0295Gu.f998c) {
                    if (objM4353M == AbstractC0295Gu.f1000e) {
                        return false;
                    }
                    mo2728b(objM4353M);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: i */
    public final InterfaceC1487h9 mo1746i(C2152km c2152km) {
        C1531i9 c1531i9 = new C1531i9(c2152km);
        c1531i9.f5343d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7529a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0280Gf) {
                C0280Gf c0280Gf = (C0280Gf) obj;
                if (c0280Gf.f907a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1531i9)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m4351J(c0280Gf);
            } else {
                boolean z = obj instanceof InterfaceC1418fl;
                C0937Vs c0937Vs = C0937Vs.f2926a;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0189Ea c0189Ea = obj2 instanceof C0189Ea ? (C0189Ea) obj2 : null;
                    c1531i9.mo1506k(c0189Ea != null ? c0189Ea.f575a : null);
                    return c0937Vs;
                }
                C0851Ts c0851TsMo565e = ((InterfaceC1418fl) obj).mo565e();
                if (c0851TsMo565e == null) {
                    m4352K((AbstractC1507hm) obj);
                } else if (!c0851TsMo565e.m2526c(c1531i9, 7)) {
                    boolean zM2526c = c0851TsMo565e.m2526c(c1531i9, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C2108jm) {
                        thM4295b = ((C2108jm) obj3).m4295b();
                    } else {
                        C0189Ea c0189Ea2 = obj3 instanceof C0189Ea ? (C0189Ea) obj3 : null;
                        if (c0189Ea2 != null) {
                            thM4295b = c0189Ea2.f575a;
                        }
                    }
                    c1531i9.mo1506k(thM4295b);
                    if (zM2526c) {
                        break loop0;
                    }
                    return c0937Vs;
                }
            }
        }
        return c1531i9;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4356j(Throwable th) {
        if (mo4346D()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC1487h9 interfaceC1487h9 = (InterfaceC1487h9) f7530b.get(this);
        return (interfaceC1487h9 == null || interfaceC1487h9 == C0937Vs.f2926a) ? z : interfaceC1487h9.mo1796b(th) || z;
    }

    /* JADX INFO: renamed from: k */
    public String mo4357k() {
        return "Job was cancelled";
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: l */
    public final InterfaceC1137ac mo23l(InterfaceC1137ac interfaceC1137ac) {
        return AbstractC1406fG.m2700Z(this, interfaceC1137ac);
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: m */
    public final InterfaceC1049Yb mo24m(InterfaceC1092Zb interfaceC1092Zb) {
        if (AbstractC0585Nj.m1134a(C1456gf.f5162f, interfaceC1092Zb)) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo729n(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m4355h(th) && mo2730w();
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: o */
    public final InterfaceC2100je mo1747o(boolean z, boolean z2, C1463gm c1463gm) {
        return m4345C(z2, z ? new C0716Ql(c1463gm) : new C1443g9(1, c1463gm));
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: p */
    public final CancellationException mo1748p() {
        CancellationException cancellationException;
        Object obj = f7529a.get(this);
        if (!(obj instanceof C2108jm)) {
            if (obj instanceof InterfaceC1418fl) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0189Ea)) {
                return new C1375em(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0189Ea) obj).f575a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C1375em(mo4357k(), th, this) : cancellationException;
        }
        Throwable thM4295b = ((C2108jm) obj).m4295b();
        if (thM4295b == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM4295b instanceof CancellationException ? (CancellationException) thM4295b : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo4357k();
        }
        return new C1375em(strConcat, thM4295b, this);
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: q */
    public final Object mo25q(Object obj, Function2 function2) {
        return function2.mo446d(obj, this);
    }

    @Override // p000.InterfaceC1332dm
    /* JADX INFO: renamed from: r */
    public final void mo1749r(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C1375em(mo4357k(), null, this);
        }
        m4355h(cancellationException);
    }

    @Override // p000.InterfaceC1137ac
    /* JADX INFO: renamed from: s */
    public final InterfaceC1137ac mo26s(InterfaceC1092Zb interfaceC1092Zb) {
        return AbstractC0585Nj.m1134a(C1456gf.f5162f, interfaceC1092Zb) ? C0366If.f1247a : this;
    }

    @Override // p000.InterfaceC1332dm
    public final boolean start() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7529a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0280Gf) {
                if (((C0280Gf) obj).f907a) {
                    return false;
                }
                C0280Gf c0280Gf = AbstractC0295Gu.f1003h;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0280Gf)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof C1374el)) {
                return false;
            }
            C0851Ts c0851Ts = ((C1374el) obj).f4909a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0851Ts)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m4358t(InterfaceC1418fl interfaceC1418fl, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7530b;
        InterfaceC1487h9 interfaceC1487h9 = (InterfaceC1487h9) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1487h9 != null) {
            interfaceC1487h9.mo1795a();
            atomicReferenceFieldUpdater.set(this, C0937Vs.f2926a);
        }
        C0232Fa c0232Fa = null;
        C0189Ea c0189Ea = obj instanceof C0189Ea ? (C0189Ea) obj : null;
        Throwable th = c0189Ea != null ? c0189Ea.f575a : null;
        if (interfaceC1418fl instanceof AbstractC1507hm) {
            try {
                ((AbstractC1507hm) interfaceC1418fl).mo1506k(th);
                return;
            } catch (Throwable th2) {
                mo4343A(new C0232Fa("Exception in completion handler " + interfaceC1418fl + " for " + this, th2));
                return;
            }
        }
        C0851Ts c0851TsMo565e = interfaceC1418fl.mo565e();
        if (c0851TsMo565e != null) {
            c0851TsMo565e.m2526c(new C2510so(1), 1);
            for (C1291cp c1291cpM2529h = (C1291cp) C1291cp.f4720a.get(c0851TsMo565e); !AbstractC0585Nj.m1134a(c1291cpM2529h, c0851TsMo565e); c1291cpM2529h = c1291cpM2529h.m2529h()) {
                if (c1291cpM2529h instanceof AbstractC1507hm) {
                    try {
                        ((AbstractC1507hm) c1291cpM2529h).mo1506k(th);
                    } catch (Throwable th3) {
                        if (c0232Fa != null) {
                            AbstractC0148Dc.m268b(c0232Fa, th3);
                        } else {
                            c0232Fa = new C0232Fa("Exception in completion handler " + c1291cpM2529h + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0232Fa != null) {
                mo4343A(c0232Fa);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m4342L(f7529a.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0148Dc.m278l(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final Throwable m4359u(Object obj) {
        Throwable thM4295b;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C1375em(mo4357k(), null, this) : th;
        }
        C2152km c2152km = (C2152km) ((InterfaceC0423Jt) obj);
        c2152km.getClass();
        Object obj2 = f7529a.get(c2152km);
        if (obj2 instanceof C2108jm) {
            thM4295b = ((C2108jm) obj2).m4295b();
        } else if (obj2 instanceof C0189Ea) {
            thM4295b = ((C0189Ea) obj2).f575a;
        } else {
            if (obj2 instanceof InterfaceC1418fl) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thM4295b = null;
        }
        CancellationException cancellationException = thM4295b instanceof CancellationException ? (CancellationException) thM4295b : null;
        return cancellationException == null ? new C1375em("Parent job is ".concat(m4342L(obj2)), thM4295b, c2152km) : cancellationException;
    }

    /* JADX INFO: renamed from: v */
    public final Object m4360v(C2108jm c2108jm, Object obj) {
        Object obj2 = null;
        Throwable c1375em = null;
        C0189Ea c0189Ea = obj instanceof C0189Ea ? (C0189Ea) obj : null;
        Throwable th = c0189Ea != null ? c0189Ea.f575a : null;
        synchronized (c2108jm) {
            c2108jm.m4296c();
            ArrayList<Throwable> arrayListM4297f = c2108jm.m4297f(th);
            if (!arrayListM4297f.isEmpty()) {
                Iterator it = arrayListM4297f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        obj2 = next;
                        break;
                    }
                }
                c1375em = (Throwable) obj2;
                if (c1375em == null) {
                    c1375em = (Throwable) arrayListM4297f.get(0);
                }
            } else if (c2108jm.m4296c()) {
                c1375em = new C1375em(mo4357k(), null, this);
            }
            if (c1375em != null && arrayListM4297f.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM4297f.size()));
                for (Throwable th2 : arrayListM4297f) {
                    if (th2 != c1375em && th2 != c1375em && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC0148Dc.m268b(c1375em, th2);
                    }
                }
            }
        }
        if (c1375em != null && c1375em != th) {
            obj = new C0189Ea(c1375em, false);
        }
        if (c1375em != null && (m4356j(c1375em) || mo1799z(c1375em))) {
            C0189Ea c0189Ea2 = (C0189Ea) obj;
            c0189Ea2.getClass();
            C0189Ea.f574b.compareAndSet(c0189Ea2, 0, 1);
        }
        mo4349H(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7529a;
        Object c1462gl = obj instanceof InterfaceC1418fl ? new C1462gl((InterfaceC1418fl) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c2108jm, c1462gl) && atomicReferenceFieldUpdater.get(this) == c2108jm) {
        }
        m4358t(c2108jm, obj);
        return obj;
    }

    /* JADX INFO: renamed from: w */
    public boolean mo2730w() {
        return true;
    }

    /* JADX INFO: renamed from: x */
    public boolean mo2731x() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final C0851Ts m4361y(InterfaceC1418fl interfaceC1418fl) {
        C0851Ts c0851TsMo565e = interfaceC1418fl.mo565e();
        if (c0851TsMo565e != null) {
            return c0851TsMo565e;
        }
        if (interfaceC1418fl instanceof C0280Gf) {
            return new C0851Ts();
        }
        if (interfaceC1418fl instanceof AbstractC1507hm) {
            m4352K((AbstractC1507hm) interfaceC1418fl);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1418fl).toString());
    }

    /* JADX INFO: renamed from: z */
    public boolean mo1799z(Throwable th) {
        return false;
    }
}
