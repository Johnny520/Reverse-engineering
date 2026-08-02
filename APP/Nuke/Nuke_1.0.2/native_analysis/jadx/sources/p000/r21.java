package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class r21 implements k21 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9330h = AtomicReferenceFieldUpdater.newUpdater(r21.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9331i = AtomicReferenceFieldUpdater.newUpdater(r21.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public r21(boolean z) {
        this._state$volatile = z ? AbstractC0179eu.f2637k : AbstractC0179eu.f2636j;
    }

    /* JADX INFO: renamed from: W */
    public static C0511ns m4306W(oc1 oc1Var) {
        while (oc1Var.mo580i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = oc1.f7626i;
            oc1 oc1VarM3557f = oc1Var.m3557f();
            if (oc1VarM3557f == null) {
                Object obj = atomicReferenceFieldUpdater.get(oc1Var);
                while (true) {
                    oc1Var = (oc1) obj;
                    if (!oc1Var.mo580i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(oc1Var);
                }
            } else {
                oc1Var = oc1VarM3557f;
            }
        }
        while (true) {
            oc1Var = oc1Var.m3559h();
            if (!oc1Var.mo580i()) {
                if (oc1Var instanceof C0511ns) {
                    return (C0511ns) oc1Var;
                }
                if (oc1Var instanceof bo1) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static String m4307d0(Object obj) {
        if (!(obj instanceof q21)) {
            return obj instanceof cy0 ? ((cy0) obj).mo302b() ? "Active" : "New" : obj instanceof C0557ov ? "Cancelled" : "Completed";
        }
        q21 q21Var = (q21) obj;
        return q21Var.m4044e() ? "Cancelling" : q21.f8707i.get(q21Var) == 1 ? "Completing" : "Active";
    }

    @Override // p000.k21
    /* JADX INFO: renamed from: A */
    public final Object mo1701A(u00 u00Var) {
        Object obj;
        a83 a83Var;
        do {
            obj = f9330h.get(this);
            boolean z = obj instanceof cy0;
            a83Var = a83.f116a;
            if (!z) {
                xe1.m6135n(u00Var.mo2508f());
                return a83Var;
            }
        } while (m4322c0(obj) < 0);
        int i = 1;
        C0469mp c0469mp = new C0469mp(1, gf1.m1908z(u00Var));
        c0469mp.m3151u();
        c0469mp.m3154x(new C0285hp(i, xe1.m6090H(this, true, new C0435ls(c0469mp, i))));
        Object objM3150t = c0469mp.m3150t();
        k20 k20Var = k20.f5323h;
        if (objM3150t != k20Var) {
            objM3150t = a83Var;
        }
        return objM3150t == k20Var ? objM3150t : a83Var;
    }

    @Override // p000.k21
    /* JADX INFO: renamed from: B */
    public final ca0 mo1702B(boolean z, boolean z2, C0151e2 c0151e2) {
        return m4316R(z2, z ? new e21(c0151e2) : new fa0(1, c0151e2));
    }

    /* JADX INFO: renamed from: D */
    public void mo3477D(CancellationException cancellationException) {
        m4326z(cancellationException);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m4308E(Throwable th) {
        if (mo2143S()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0472ms interfaceC0472ms = (InterfaceC0472ms) f9331i.get(this);
        return (interfaceC0472ms == null || interfaceC0472ms == go1.f3642h) ? z : interfaceC0472ms.mo2005c(th) || z;
    }

    /* JADX INFO: renamed from: F */
    public String mo3677F() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: G */
    public boolean mo2979G(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m4326z(th) && mo3027L();
    }

    /* JADX INFO: renamed from: H */
    public final void m4309H(cy0 cy0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9331i;
        InterfaceC0472ms interfaceC0472ms = (InterfaceC0472ms) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0472ms != null) {
            interfaceC0472ms.mo717a();
            atomicReferenceFieldUpdater.set(this, go1.f3642h);
        }
        C0594pv c0594pv = null;
        C0557ov c0557ov = obj instanceof C0557ov ? (C0557ov) obj : null;
        Throwable th = c0557ov != null ? c0557ov.f7856a : null;
        if (cy0Var instanceof n21) {
            try {
                ((n21) cy0Var).mo1215l(th);
                return;
            } catch (Throwable th2) {
                mo3678P(new C0594pv("Exception in completion handler " + cy0Var + " for " + this, th2));
                return;
            }
        }
        bo1 bo1VarMo303d = cy0Var.mo303d();
        if (bo1VarMo303d != null) {
            bo1VarMo303d.m3556e(new qb1(1), 1);
            Object obj2 = oc1.f7625h.get(bo1VarMo303d);
            obj2.getClass();
            for (oc1 oc1VarM3559h = (oc1) obj2; !oc1VarM3559h.equals(bo1VarMo303d); oc1VarM3559h = oc1VarM3559h.m3559h()) {
                if (oc1VarM3559h instanceof n21) {
                    try {
                        ((n21) oc1VarM3559h).mo1215l(th);
                    } catch (Throwable th3) {
                        if (c0594pv != null) {
                            fg1.m1638m(c0594pv, th3);
                        } else {
                            c0594pv = new C0594pv("Exception in completion handler " + oc1VarM3559h + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0594pv != null) {
                mo3678P(c0594pv);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final Throwable m4310I(Object obj) {
        Throwable thM4043c;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        r21 r21Var = (r21) obj;
        Object obj2 = f9330h.get(r21Var);
        if (obj2 instanceof q21) {
            thM4043c = ((q21) obj2).m4043c();
        } else if (obj2 instanceof C0557ov) {
            thM4043c = ((C0557ov) obj2).f7856a;
        } else {
            if (obj2 instanceof cy0) {
                c80.m677u("Cannot be cancelling child in this state: ", obj2);
                return null;
            }
            thM4043c = null;
        }
        CancellationException cancellationException = thM4043c instanceof CancellationException ? (CancellationException) thM4043c : null;
        return cancellationException == null ? new l21("Parent job is ".concat(m4307d0(obj2)), thM4043c, r21Var) : cancellationException;
    }

    /* JADX INFO: renamed from: J */
    public final Object m4311J(q21 q21Var, Object obj) {
        Throwable thM4312K;
        C0557ov c0557ov = obj instanceof C0557ov ? (C0557ov) obj : null;
        Throwable th = c0557ov != null ? c0557ov.f7856a : null;
        synchronized (q21Var) {
            q21Var.m4044e();
            ArrayList<Throwable> arrayListM4045f = q21Var.m4045f(th);
            thM4312K = m4312K(q21Var, arrayListM4045f);
            if (thM4312K != null && arrayListM4045f.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM4045f.size()));
                for (Throwable th2 : arrayListM4045f) {
                    if (th2 != thM4312K && th2 != thM4312K && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        fg1.m1638m(thM4312K, th2);
                    }
                }
            }
        }
        if (thM4312K != null && thM4312K != th) {
            obj = new C0557ov(thM4312K, false);
        }
        if (thM4312K != null && (m4308E(thM4312K) || mo4314O(thM4312K))) {
            obj.getClass();
            C0557ov.f7855b.compareAndSet((C0557ov) obj, 0, 1);
        }
        mo3679Y(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9330h;
        Object dy0Var = obj instanceof cy0 ? new dy0((cy0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, q21Var, dy0Var) && atomicReferenceFieldUpdater.get(this) == q21Var) {
        }
        m4309H(q21Var, obj);
        return obj;
    }

    /* JADX INFO: renamed from: K */
    public final Throwable m4312K(q21 q21Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (q21Var.m4044e()) {
                return new l21(mo3677F(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof p23) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof p23)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX INFO: renamed from: L */
    public boolean mo3027L() {
        return true;
    }

    /* JADX INFO: renamed from: M */
    public boolean mo3028M() {
        return this instanceof C0291hv;
    }

    /* JADX INFO: renamed from: N */
    public final bo1 m4313N(cy0 cy0Var) {
        bo1 bo1VarMo303d = cy0Var.mo303d();
        if (bo1VarMo303d != null) {
            return bo1VarMo303d;
        }
        if (cy0Var instanceof xd0) {
            return new bo1();
        }
        if (cy0Var instanceof n21) {
            m4321b0((n21) cy0Var);
            return null;
        }
        c80.m677u("State should have list: ", cy0Var);
        return null;
    }

    /* JADX INFO: renamed from: O */
    public boolean mo4314O(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public final void m4315Q(k21 k21Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9331i;
        go1 go1Var = go1.f3642h;
        if (k21Var == null) {
            atomicReferenceFieldUpdater.set(this, go1Var);
            return;
        }
        k21Var.start();
        InterfaceC0472ms interfaceC0472msMo1705j = k21Var.mo1705j(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0472msMo1705j);
        if (f9330h.get(this) instanceof cy0) {
            return;
        }
        interfaceC0472msMo1705j.mo717a();
        atomicReferenceFieldUpdater.set(this, go1Var);
    }

    /* JADX INFO: renamed from: R */
    public final ca0 m4316R(boolean z, n21 n21Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        go1 go1Var;
        boolean z2;
        boolean zM3556e;
        n21Var.f6970k = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f9330h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof xd0;
            go1Var = go1.f3642h;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof cy0)) {
                    z2 = false;
                    break;
                }
                cy0 cy0Var = (cy0) obj;
                bo1 bo1VarMo303d = cy0Var.mo303d();
                if (bo1VarMo303d == null) {
                    m4321b0((n21) obj);
                } else {
                    if (n21Var.mo1214k()) {
                        q21 q21Var = cy0Var instanceof q21 ? (q21) cy0Var : null;
                        Throwable thM4043c = q21Var != null ? q21Var.m4043c() : null;
                        if (thM4043c == null) {
                            zM3556e = bo1VarMo303d.m3556e(n21Var, 5);
                        } else if (z) {
                            n21Var.mo1215l(thM4043c);
                            return go1Var;
                        }
                    } else {
                        zM3556e = bo1VarMo303d.m3556e(n21Var, 1);
                    }
                    if (zM3556e) {
                        break;
                    }
                }
            } else {
                xd0 xd0Var = (xd0) obj;
                if (xd0Var.f12970h) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n21Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m4320a0(xd0Var);
            }
        }
        if (z2) {
            return n21Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0557ov c0557ov = obj2 instanceof C0557ov ? (C0557ov) obj2 : null;
            n21Var.mo1215l(c0557ov != null ? c0557ov.f7856a : null);
        }
        return go1Var;
    }

    /* JADX INFO: renamed from: S */
    public boolean mo2143S() {
        return this instanceof C0244gl;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m4317T(Object obj) {
        Object objM4324e0;
        do {
            objM4324e0 = m4324e0(f9330h.get(this), obj);
            if (objM4324e0 == AbstractC0179eu.f2631e) {
                return false;
            }
            if (objM4324e0 == AbstractC0179eu.f2632f) {
                return true;
            }
        } while (objM4324e0 == AbstractC0179eu.f2633g);
        mo1937x(objM4324e0);
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final Object m4318U(Object obj) {
        Object objM4324e0;
        do {
            objM4324e0 = m4324e0(f9330h.get(this), obj);
            if (objM4324e0 == AbstractC0179eu.f2631e) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0557ov c0557ov = obj instanceof C0557ov ? (C0557ov) obj : null;
                throw new IllegalStateException(str, c0557ov != null ? c0557ov.f7856a : null);
            }
        } while (objM4324e0 == AbstractC0179eu.f2633g);
        return objM4324e0;
    }

    /* JADX INFO: renamed from: V */
    public String mo4047V() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: X */
    public final void m4319X(bo1 bo1Var, Throwable th) {
        bo1Var.m3556e(new qb1(4), 4);
        Object obj = oc1.f7625h.get(bo1Var);
        obj.getClass();
        C0594pv c0594pv = null;
        for (oc1 oc1VarM3559h = (oc1) obj; !oc1VarM3559h.equals(bo1Var); oc1VarM3559h = oc1VarM3559h.m3559h()) {
            if ((oc1VarM3559h instanceof n21) && ((n21) oc1VarM3559h).mo1214k()) {
                try {
                    ((n21) oc1VarM3559h).mo1215l(th);
                } catch (Throwable th2) {
                    if (c0594pv != null) {
                        fg1.m1638m(c0594pv, th2);
                    } else {
                        c0594pv = new C0594pv("Exception in completion handler " + oc1VarM3559h + " for " + this, th2);
                    }
                }
            }
        }
        if (c0594pv != null) {
            mo3678P(c0594pv);
        }
        m4308E(th);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m4320a0(xd0 xd0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        bo1 bo1Var = new bo1();
        Object ay0Var = bo1Var;
        if (!xd0Var.f12970h) {
            ay0Var = new ay0(bo1Var);
        }
        do {
            atomicReferenceFieldUpdater = f9330h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, xd0Var, ay0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == xd0Var);
    }

    @Override // p000.k21
    /* JADX INFO: renamed from: b */
    public boolean mo1703b() {
        Object obj = f9330h.get(this);
        return (obj instanceof cy0) && ((cy0) obj).mo302b();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m4321b0(n21 n21Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        bo1 bo1Var = new bo1();
        n21Var.getClass();
        oc1.f7626i.set(bo1Var, n21Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = oc1.f7625h;
        atomicReferenceFieldUpdater2.set(bo1Var, n21Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(n21Var) == n21Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(n21Var, n21Var, bo1Var)) {
                    if (atomicReferenceFieldUpdater2.get(n21Var) != n21Var) {
                        break;
                    }
                }
                bo1Var.m3558g(n21Var);
                break loop0;
            }
            break;
        }
        oc1 oc1VarM3559h = n21Var.m3559h();
        do {
            atomicReferenceFieldUpdater = f9330h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, n21Var, oc1VarM3559h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == n21Var);
    }

    @Override // p000.k21
    /* JADX INFO: renamed from: c */
    public void mo1704c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new l21(mo3677F(), null, this);
        }
        mo3477D(cancellationException);
    }

    /* JADX INFO: renamed from: c0 */
    public final int m4322c0(Object obj) {
        boolean z = obj instanceof xd0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9330h;
        if (z) {
            if (((xd0) obj).f12970h) {
                return 0;
            }
            xd0 xd0Var = AbstractC0179eu.f2637k;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, xd0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo2138Z();
            return 1;
        }
        if (!(obj instanceof ay0)) {
            return 0;
        }
        bo1 bo1Var = ((ay0) obj).f442h;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bo1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        mo2138Z();
        return 1;
    }

    /* JADX INFO: renamed from: e */
    public Object m4323e() throws Throwable {
        Object obj = f9330h.get(this);
        if (obj instanceof cy0) {
            C0676s.m4653l("This job has not completed yet");
            return null;
        }
        if (obj instanceof C0557ov) {
            throw ((C0557ov) obj).f7856a;
        }
        return AbstractC0179eu.m1455e0(obj);
    }

    /* JADX INFO: renamed from: e0 */
    public final Object m4324e0(Object obj, Object obj2) {
        if (!(obj instanceof cy0)) {
            return AbstractC0179eu.f2631e;
        }
        if (((obj instanceof xd0) || (obj instanceof n21)) && !(obj instanceof C0511ns) && !(obj2 instanceof C0557ov)) {
            cy0 cy0Var = (cy0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9330h;
            Object dy0Var = obj2 instanceof cy0 ? new dy0((cy0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, cy0Var, dy0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != cy0Var) {
                    return AbstractC0179eu.f2633g;
                }
            }
            mo3679Y(obj2);
            m4309H(cy0Var, obj2);
            return obj2;
        }
        cy0 cy0Var2 = (cy0) obj;
        bo1 bo1VarM4313N = m4313N(cy0Var2);
        if (bo1VarM4313N == null) {
            return AbstractC0179eu.f2633g;
        }
        q21 q21Var = cy0Var2 instanceof q21 ? (q21) cy0Var2 : null;
        if (q21Var == null) {
            q21Var = new q21(bo1VarM4313N, null);
        }
        synchronized (q21Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = q21.f8707i;
            if (atomicIntegerFieldUpdater.get(q21Var) == 1) {
                return AbstractC0179eu.f2631e;
            }
            atomicIntegerFieldUpdater.set(q21Var, 1);
            if (q21Var != cy0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9330h;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, cy0Var2, q21Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != cy0Var2) {
                        return AbstractC0179eu.f2633g;
                    }
                }
            }
            boolean zM4044e = q21Var.m4044e();
            C0557ov c0557ov = obj2 instanceof C0557ov ? (C0557ov) obj2 : null;
            if (c0557ov != null) {
                q21Var.m4042a(c0557ov.f7856a);
            }
            Throwable thM4043c = zM4044e ? null : q21Var.m4043c();
            if (thM4043c != null) {
                m4319X(bo1VarM4313N, thM4043c);
            }
            C0511ns c0511nsM4306W = m4306W(bo1VarM4313N);
            if (c0511nsM4306W != null && m4325f0(q21Var, c0511nsM4306W, obj2)) {
                return AbstractC0179eu.f2632f;
            }
            bo1VarM4313N.m3556e(new qb1(2), 2);
            C0511ns c0511nsM4306W2 = m4306W(bo1VarM4313N);
            return (c0511nsM4306W2 == null || !m4325f0(q21Var, c0511nsM4306W2, obj2)) ? m4311J(q21Var, obj2) : AbstractC0179eu.f2632f;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m4325f0(q21 q21Var, C0511ns c0511ns, Object obj) {
        while (xe1.m6090H(c0511ns.f7307l, false, new p21(this, q21Var, c0511ns, obj)) == go1.f3642h) {
            c0511ns = m4306W(c0511ns);
            if (c0511ns == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.y10
    public final z10 getKey() {
        return C0700sn.f10207K;
    }

    @Override // p000.k21
    /* JADX INFO: renamed from: j */
    public final InterfaceC0472ms mo1705j(r21 r21Var) {
        C0511ns c0511ns = new C0511ns(r21Var);
        c0511ns.f6970k = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9330h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof xd0) {
                xd0 xd0Var = (xd0) obj;
                if (xd0Var.f12970h) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0511ns)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                m4320a0(xd0Var);
            } else {
                boolean z = obj instanceof cy0;
                go1 go1Var = go1.f3642h;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0557ov c0557ov = obj2 instanceof C0557ov ? (C0557ov) obj2 : null;
                    c0511ns.mo1215l(c0557ov != null ? c0557ov.f7856a : null);
                    return go1Var;
                }
                bo1 bo1VarMo303d = ((cy0) obj).mo303d();
                if (bo1VarMo303d == null) {
                    m4321b0((n21) obj);
                } else if (!bo1VarMo303d.m3556e(c0511ns, 7)) {
                    boolean zM3556e = bo1VarMo303d.m3556e(c0511ns, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof q21) {
                        thM4043c = ((q21) obj3).m4043c();
                    } else {
                        C0557ov c0557ov2 = obj3 instanceof C0557ov ? (C0557ov) obj3 : null;
                        if (c0557ov2 != null) {
                            thM4043c = c0557ov2.f7856a;
                        }
                    }
                    c0511ns.mo1215l(thM4043c);
                    if (zM3556e) {
                        break loop0;
                    }
                    return go1Var;
                }
            }
        }
        return c0511ns;
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: k */
    public final a20 mo14k(a20 a20Var) {
        return xe1.m6120f0(this, a20Var);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: o */
    public final y10 mo15o(z10 z10Var) {
        return xe1.m6144u(this, z10Var);
    }

    @Override // p000.k21
    /* JADX INFO: renamed from: q */
    public final CancellationException mo1706q() {
        CancellationException cancellationException;
        Object obj = f9330h.get(this);
        if (obj instanceof q21) {
            Throwable thM4043c = ((q21) obj).m4043c();
            if (thM4043c == null) {
                c80.m677u("Job is still new or active: ", this);
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thM4043c instanceof CancellationException ? (CancellationException) thM4043c : null;
            return cancellationException == null ? new l21(strConcat, thM4043c, this) : cancellationException;
        }
        if (obj instanceof cy0) {
            c80.m677u("Job is still new or active: ", this);
            return null;
        }
        if (!(obj instanceof C0557ov)) {
            return new l21(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((C0557ov) obj).f7856a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new l21(mo3677F(), th, this) : cancellationException;
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: r */
    public final Object mo16r(mn0 mn0Var, Object obj) {
        return mn0Var.mo12g(obj, this);
    }

    @Override // p000.k21
    public final boolean start() {
        int iM4322c0;
        do {
            iM4322c0 = m4322c0(f9330h.get(this));
            if (iM4322c0 == 0) {
                return false;
            }
        } while (iM4322c0 != 1);
        return true;
    }

    @Override // p000.k21
    /* JADX INFO: renamed from: t */
    public final ca0 mo1707t(in0 in0Var) {
        return m4316R(true, new fa0(1, in0Var));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo4047V() + '{' + m4307d0(f9330h.get(this)) + '}');
        sb.append('@');
        sb.append(p40.m3740x(this));
        return sb.toString();
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: u */
    public final a20 mo17u(z10 z10Var) {
        return xe1.m6105W(this, z10Var);
    }

    /* JADX INFO: renamed from: y */
    public void mo2146y(Object obj) {
        mo1937x(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4326z(Object obj) {
        hh1 hh1Var;
        Object objM4324e0 = AbstractC0179eu.f2631e;
        if (mo3028M()) {
            do {
                Object obj2 = f9330h.get(this);
                if (obj2 instanceof cy0) {
                    if (obj2 instanceof q21) {
                        if (q21.f8707i.get((q21) obj2) == 1) {
                        }
                    }
                    objM4324e0 = m4324e0(obj2, new C0557ov(m4310I(obj), false));
                }
                objM4324e0 = AbstractC0179eu.f2631e;
                break;
            } while (objM4324e0 == AbstractC0179eu.f2633g);
            if (objM4324e0 != AbstractC0179eu.f2632f) {
                if (objM4324e0 == AbstractC0179eu.f2631e) {
                    Throwable thM4310I = null;
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9330h;
                        Object obj3 = atomicReferenceFieldUpdater.get(this);
                        if (!(obj3 instanceof q21)) {
                            if (!(obj3 instanceof cy0)) {
                                hh1Var = AbstractC0179eu.f2634h;
                                break;
                            }
                            if (thM4310I == null) {
                                thM4310I = m4310I(obj);
                            }
                            cy0 cy0Var = (cy0) obj3;
                            if (cy0Var.mo302b()) {
                                bo1 bo1VarM4313N = m4313N(cy0Var);
                                if (bo1VarM4313N != null) {
                                    q21 q21Var = new q21(bo1VarM4313N, thM4310I);
                                    while (!atomicReferenceFieldUpdater.compareAndSet(this, cy0Var, q21Var)) {
                                        if (atomicReferenceFieldUpdater.get(this) != cy0Var) {
                                            break;
                                        }
                                    }
                                    m4319X(bo1VarM4313N, thM4310I);
                                    hh1Var = AbstractC0179eu.f2631e;
                                    break loop1;
                                }
                                continue;
                            } else {
                                Object objM4324e02 = m4324e0(obj3, new C0557ov(thM4310I, false));
                                if (objM4324e02 == AbstractC0179eu.f2631e) {
                                    c80.m677u("Cannot happen in ", obj3);
                                    return false;
                                }
                                if (objM4324e02 != AbstractC0179eu.f2633g) {
                                    objM4324e0 = objM4324e02;
                                    break;
                                }
                            }
                        } else {
                            synchronized (obj3) {
                                if (q21.f8709k.get((q21) obj3) == AbstractC0179eu.f2635i) {
                                    hh1Var = AbstractC0179eu.f2634h;
                                } else {
                                    boolean zM4044e = ((q21) obj3).m4044e();
                                    if (thM4310I == null) {
                                        thM4310I = m4310I(obj);
                                    }
                                    ((q21) obj3).m4042a(thM4310I);
                                    Throwable thM4043c = zM4044e ? null : ((q21) obj3).m4043c();
                                    if (thM4043c != null) {
                                        m4319X(((q21) obj3).f8710h, thM4043c);
                                    }
                                    hh1Var = AbstractC0179eu.f2631e;
                                }
                            }
                        }
                    }
                }
                if (objM4324e0 != AbstractC0179eu.f2631e && objM4324e0 != AbstractC0179eu.f2632f) {
                    if (objM4324e0 == AbstractC0179eu.f2634h) {
                        return false;
                    }
                    mo1937x(objM4324e0);
                    return true;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public void mo2138Z() {
    }

    /* JADX INFO: renamed from: P */
    public void mo3678P(C0594pv c0594pv) {
        throw c0594pv;
    }

    /* JADX INFO: renamed from: Y */
    public void mo3679Y(Object obj) {
    }

    /* JADX INFO: renamed from: x */
    public void mo1937x(Object obj) {
    }
}
