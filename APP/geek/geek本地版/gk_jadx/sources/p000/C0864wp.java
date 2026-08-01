package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: wp */
/* JADX INFO: loaded from: classes.dex */
public class C0864wp implements InterfaceC0493mp, InterfaceC0464lx {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater f5000a = AtomicReferenceFieldUpdater.newUpdater(C0864wp.class, Object.class, "_state");

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater f5001b = AtomicReferenceFieldUpdater.newUpdater(C0864wp.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public C0864wp(boolean z) {
        this._state = z ? AbstractC0346ip.f2483l : AbstractC0346ip.f2482k;
    }

    /* JADX INFO: renamed from: D */
    public static C0180ea m2576D(C0829vr c0829vr) {
        while (c0829vr.mo1877j()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0829vr.f4883b;
            C0829vr c0829vrM2521e = c0829vr.m2521e();
            if (c0829vrM2521e == null) {
                Object obj = atomicReferenceFieldUpdater.get(c0829vr);
                while (true) {
                    c0829vr = (C0829vr) obj;
                    if (!c0829vr.mo1877j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c0829vr);
                }
            } else {
                c0829vr = c0829vrM2521e;
            }
        }
        while (true) {
            c0829vr = c0829vr.m2524i();
            if (!c0829vr.mo1877j()) {
                if (c0829vr instanceof C0180ea) {
                    return (C0180ea) c0829vr;
                }
                if (c0829vr instanceof C0500mw) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static String m2577I(Object obj) {
        if (!(obj instanceof C0790up)) {
            return obj instanceof InterfaceC0826vo ? ((InterfaceC0826vo) obj).mo1875a() ? "Active" : "New" : obj instanceof C0516nb ? "Cancelled" : "Completed";
        }
        C0790up c0790up = (C0790up) obj;
        return c0790up.m2461e() ? "Cancelling" : c0790up.m2462f() ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: A */
    public final void m2578A(InterfaceC0493mp interfaceC0493mp) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5001b;
        C0537nw c0537nw = C0537nw.f3454a;
        if (interfaceC0493mp == null) {
            atomicReferenceFieldUpdater.set(this, c0537nw);
            return;
        }
        C0864wp c0864wp = (C0864wp) interfaceC0493mp;
        loop0: while (true) {
            Object objM2592x = c0864wp.m2592x();
            boolean z = objM2592x instanceof C0783ui;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5000a;
            if (!z) {
                if (!(objM2592x instanceof C0789uo)) {
                    break;
                }
                C0500mw c0500mw = ((C0789uo) objM2592x).f4745a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(c0864wp, objM2592x, c0500mw)) {
                    if (atomicReferenceFieldUpdater2.get(c0864wp) != objM2592x) {
                        break;
                    }
                }
                c0864wp.getClass();
                break loop0;
            }
            if (!((C0783ui) objM2592x).f4730a) {
                C0783ui c0783ui = AbstractC0346ip.f2483l;
                while (!atomicReferenceFieldUpdater2.compareAndSet(c0864wp, objM2592x, c0783ui)) {
                    if (atomicReferenceFieldUpdater2.get(c0864wp) != objM2592x) {
                        break;
                    }
                }
                c0864wp.getClass();
                break loop0;
            }
            break;
        }
        InterfaceC0144da interfaceC0144da = (InterfaceC0144da) a80.m51p(c0864wp, new C0180ea(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0144da);
        if (m2592x() instanceof InterfaceC0826vo) {
            return;
        }
        interfaceC0144da.mo1361b();
        atomicReferenceFieldUpdater.set(this, c0537nw);
    }

    /* JADX INFO: renamed from: B */
    public boolean mo2544B() {
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final Object m2579C(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objM2583J;
        do {
            objM2583J = m2583J(m2592x(), obj);
            if (objM2583J == AbstractC0346ip.f2477f) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0516nb c0516nb = obj instanceof C0516nb ? (C0516nb) obj : null;
                throw new IllegalStateException(str, c0516nb != null ? c0516nb.f3368a : null);
            }
        } while (objM2583J == AbstractC0346ip.f2479h);
        return objM2583J;
    }

    /* JADX INFO: renamed from: E */
    public final void m2580E(C0500mw c0500mw, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Object objM2523h = c0500mw.m2523h();
        AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objM2523h);
        C0591pb c0591pb = null;
        for (C0829vr c0829vrM2524i = (C0829vr) objM2523h; !c0829vrM2524i.equals(c0500mw); c0829vrM2524i = c0829vrM2524i.m2524i()) {
            if (c0829vrM2524i instanceof AbstractC0567op) {
                AbstractC0716sp abstractC0716sp = (AbstractC0716sp) c0829vrM2524i;
                try {
                    abstractC0716sp.mo647l(th);
                } catch (Throwable th2) {
                    if (c0591pb != null) {
                        AbstractC0346ip.m1494f(c0591pb, th2);
                    } else {
                        c0591pb = new C0591pb("Exception in completion handler " + abstractC0716sp + " for " + this, th2);
                    }
                }
            }
        }
        if (c0591pb != null) {
            mo1243z(c0591pb);
        }
        m2586n(th);
    }

    /* JADX INFO: renamed from: H */
    public final void m2582H(AbstractC0716sp abstractC0716sp) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0500mw c0500mw = new C0500mw();
        abstractC0716sp.getClass();
        C0829vr.f4883b.lazySet(c0500mw, abstractC0716sp);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0829vr.f4882a;
        atomicReferenceFieldUpdater2.lazySet(c0500mw, abstractC0716sp);
        loop0: while (true) {
            if (abstractC0716sp.m2523h() == abstractC0716sp) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC0716sp, abstractC0716sp, c0500mw)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC0716sp) != abstractC0716sp) {
                        break;
                    }
                }
                c0500mw.m2522g(abstractC0716sp);
                break loop0;
            }
            break;
        }
        C0829vr c0829vrM2524i = abstractC0716sp.m2524i();
        do {
            atomicReferenceFieldUpdater = f5000a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0716sp, c0829vrM2524i)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0716sp);
    }

    /* JADX INFO: renamed from: J */
    public final Object m2583J(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        if (!(obj instanceof InterfaceC0826vo)) {
            return AbstractC0346ip.f2477f;
        }
        if (((obj instanceof C0783ui) || (obj instanceof AbstractC0716sp)) && !(obj instanceof C0180ea) && !(obj2 instanceof C0516nb)) {
            InterfaceC0826vo interfaceC0826vo = (InterfaceC0826vo) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5000a;
            Object c0863wo = obj2 instanceof InterfaceC0826vo ? new C0863wo((InterfaceC0826vo) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0826vo, c0863wo)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC0826vo) {
                    return AbstractC0346ip.f2479h;
                }
            }
            mo1239F(obj2);
            m2587q(interfaceC0826vo, obj2);
            return obj2;
        }
        InterfaceC0826vo interfaceC0826vo2 = (InterfaceC0826vo) obj;
        C0500mw c0500mwM2591w = m2591w(interfaceC0826vo2);
        if (c0500mwM2591w == null) {
            return AbstractC0346ip.f2479h;
        }
        C0180ea c0180eaM2576D = null;
        C0790up c0790up = interfaceC0826vo2 instanceof C0790up ? (C0790up) interfaceC0826vo2 : null;
        if (c0790up == null) {
            c0790up = new C0790up(c0500mwM2591w, null);
        }
        synchronized (c0790up) {
            if (c0790up.m2462f()) {
                return AbstractC0346ip.f2477f;
            }
            C0790up.f4746b.set(c0790up, 1);
            if (c0790up != interfaceC0826vo2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5000a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0826vo2, c0790up)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC0826vo2) {
                        return AbstractC0346ip.f2479h;
                    }
                }
            }
            boolean zM2461e = c0790up.m2461e();
            C0516nb c0516nb = obj2 instanceof C0516nb ? (C0516nb) obj2 : null;
            if (c0516nb != null) {
                c0790up.m2459b(c0516nb.f3368a);
            }
            Throwable thM2460c = c0790up.m2460c();
            if (zM2461e) {
                thM2460c = null;
            }
            if (thM2460c != null) {
                m2580E(c0500mwM2591w, thM2460c);
            }
            C0180ea c0180ea = interfaceC0826vo2 instanceof C0180ea ? (C0180ea) interfaceC0826vo2 : null;
            if (c0180ea == null) {
                C0500mw c0500mwMo1876d = interfaceC0826vo2.mo1876d();
                if (c0500mwMo1876d != null) {
                    c0180eaM2576D = m2576D(c0500mwMo1876d);
                }
            } else {
                c0180eaM2576D = c0180ea;
            }
            if (c0180eaM2576D != null) {
                while (a80.m51p(c0180eaM2576D.f1765e, new C0753tp(this, c0790up, c0180eaM2576D, obj2), 1) == C0537nw.f3454a) {
                    c0180eaM2576D = m2576D(c0180eaM2576D);
                    if (c0180eaM2576D == null) {
                    }
                }
                return AbstractC0346ip.f2478g;
            }
            return m2589s(c0790up, obj2);
        }
    }

    @Override // p000.InterfaceC0493mp
    /* JADX INFO: renamed from: a */
    public boolean mo1853a() {
        Object objM2592x = m2592x();
        return (objM2592x instanceof InterfaceC0826vo) && ((InterfaceC0826vo) objM2592x).mo1875a();
    }

    @Override // p000.InterfaceC0258ge
    /* JADX INFO: renamed from: b */
    public final InterfaceC0184ee mo1272b(InterfaceC0221fe interfaceC0221fe) {
        AbstractC0346ip.m1503o("key", interfaceC0221fe);
        if (AbstractC0346ip.m1497i(C0819vh.f4849h, interfaceC0221fe)) {
            return this;
        }
        return null;
    }

    @Override // p000.InterfaceC0258ge
    /* JADX INFO: renamed from: g */
    public final InterfaceC0258ge mo1273g(InterfaceC0221fe interfaceC0221fe) {
        return AbstractC0222ff.m1159B(this, interfaceC0221fe);
    }

    @Override // p000.InterfaceC0184ee
    public final InterfaceC0221fe getKey() {
        return C0819vh.f4849h;
    }

    @Override // p000.InterfaceC0258ge
    /* JADX INFO: renamed from: h */
    public final Object mo1274h(Object obj, InterfaceC0861wm interfaceC0861wm) {
        return interfaceC0861wm.mo472e(obj, this);
    }

    @Override // p000.InterfaceC0258ge
    /* JADX INFO: renamed from: i */
    public final InterfaceC0258ge mo1275i(InterfaceC0258ge interfaceC0258ge) {
        return AbstractC0222ff.m1161E(this, interfaceC0258ge);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2584j(InterfaceC0826vo interfaceC0826vo, C0500mw c0500mw, AbstractC0716sp abstractC0716sp) {
        C0829vr c0829vrM2521e;
        C0827vp c0827vp = new C0827vp(abstractC0716sp, this, interfaceC0826vo);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0829vr.f4883b;
            c0829vrM2521e = c0500mw.m2521e();
            if (c0829vrM2521e == null) {
                Object obj = atomicReferenceFieldUpdater.get(c0500mw);
                while (true) {
                    c0829vrM2521e = (C0829vr) obj;
                    if (!c0829vrM2521e.mo1877j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c0829vrM2521e);
                }
            }
            C0829vr.f4883b.lazySet(abstractC0716sp, c0829vrM2521e);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0829vr.f4882a;
            atomicReferenceFieldUpdater2.lazySet(abstractC0716sp, c0500mw);
            c0827vp.f4875c = c0500mw;
            while (!atomicReferenceFieldUpdater2.compareAndSet(c0829vrM2521e, c0500mw, c0827vp)) {
                if (atomicReferenceFieldUpdater2.get(c0829vrM2521e) != c0500mw) {
                    break;
                }
            }
        }
        return c0827vp.mo961a(c0829vrM2521e) == null;
    }

    /* JADX INFO: renamed from: l */
    public void mo2003l(Object obj) {
        mo2454k(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2585m(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0864wp.m2585m(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2586n(Throwable th) {
        if (mo2544B()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0144da interfaceC0144da = (InterfaceC0144da) f5001b.get(this);
        return (interfaceC0144da == null || interfaceC0144da == C0537nw.f3454a) ? z : interfaceC0144da.mo928c(th) || z;
    }

    /* JADX INFO: renamed from: o */
    public String mo1242o() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: p */
    public boolean mo1265p(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m2585m(th) && mo2127u();
    }

    /* JADX INFO: renamed from: q */
    public final void m2587q(InterfaceC0826vo interfaceC0826vo, Object obj) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5001b;
        InterfaceC0144da interfaceC0144da = (InterfaceC0144da) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0144da != null) {
            interfaceC0144da.mo1361b();
            atomicReferenceFieldUpdater.set(this, C0537nw.f3454a);
        }
        C0591pb c0591pb = null;
        C0516nb c0516nb = obj instanceof C0516nb ? (C0516nb) obj : null;
        Throwable th = c0516nb != null ? c0516nb.f3368a : null;
        if (interfaceC0826vo instanceof AbstractC0716sp) {
            try {
                ((AbstractC0716sp) interfaceC0826vo).mo647l(th);
                return;
            } catch (Throwable th2) {
                mo1243z(new C0591pb("Exception in completion handler " + interfaceC0826vo + " for " + this, th2));
                return;
            }
        }
        C0500mw c0500mwMo1876d = interfaceC0826vo.mo1876d();
        if (c0500mwMo1876d != null) {
            Object objM2523h = c0500mwMo1876d.m2523h();
            AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", objM2523h);
            for (C0829vr c0829vrM2524i = (C0829vr) objM2523h; !c0829vrM2524i.equals(c0500mwMo1876d); c0829vrM2524i = c0829vrM2524i.m2524i()) {
                if (c0829vrM2524i instanceof AbstractC0716sp) {
                    AbstractC0716sp abstractC0716sp = (AbstractC0716sp) c0829vrM2524i;
                    try {
                        abstractC0716sp.mo647l(th);
                    } catch (Throwable th3) {
                        if (c0591pb != null) {
                            AbstractC0346ip.m1494f(c0591pb, th3);
                        } else {
                            c0591pb = new C0591pb("Exception in completion handler " + abstractC0716sp + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0591pb != null) {
                mo1243z(c0591pb);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final Throwable m2588r(Object obj) {
        Throwable thM2460c;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C0864wp c0864wp = (C0864wp) ((InterfaceC0464lx) obj);
        Object objM2592x = c0864wp.m2592x();
        if (objM2592x instanceof C0790up) {
            thM2460c = ((C0790up) objM2592x).m2460c();
        } else if (objM2592x instanceof C0516nb) {
            thM2460c = ((C0516nb) objM2592x).f3368a;
        } else {
            if (objM2592x instanceof InterfaceC0826vo) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM2592x).toString());
            }
            thM2460c = null;
        }
        CancellationException cancellationException = thM2460c instanceof CancellationException ? (CancellationException) thM2460c : null;
        return cancellationException == null ? new C0530np("Parent job is ".concat(m2577I(objM2592x)), thM2460c, c0864wp) : cancellationException;
    }

    /* JADX INFO: renamed from: s */
    public final Object m2589s(C0790up c0790up, Object obj) throws IllegalAccessException, InvocationTargetException {
        Object obj2 = null;
        Throwable c0530np = null;
        C0516nb c0516nb = obj instanceof C0516nb ? (C0516nb) obj : null;
        Throwable th = c0516nb != null ? c0516nb.f3368a : null;
        synchronized (c0790up) {
            c0790up.m2461e();
            ArrayList arrayListM2463g = c0790up.m2463g(th);
            if (!arrayListM2463g.isEmpty()) {
                int size = arrayListM2463g.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj3 = arrayListM2463g.get(i);
                    i++;
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                c0530np = (Throwable) obj2;
                if (c0530np == null) {
                    c0530np = (Throwable) arrayListM2463g.get(0);
                }
            } else if (c0790up.m2461e()) {
                c0530np = new C0530np(mo1242o(), null, this);
            }
            if (c0530np != null && arrayListM2463g.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM2463g.size()));
                int size2 = arrayListM2463g.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj4 = arrayListM2463g.get(i2);
                    i2++;
                    Throwable th2 = (Throwable) obj4;
                    if (th2 != c0530np && th2 != c0530np && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC0346ip.m1494f(c0530np, th2);
                    }
                }
            }
        }
        if (c0530np != null && c0530np != th) {
            obj = new C0516nb(c0530np, false);
        }
        if (c0530np != null && (m2586n(c0530np) || mo2036y(c0530np))) {
            AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally", obj);
            C0516nb.f3367b.compareAndSet((C0516nb) obj, 0, 1);
        }
        mo1239F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5000a;
        Object c0863wo = obj instanceof InterfaceC0826vo ? new C0863wo((InterfaceC0826vo) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c0790up, c0863wo) && atomicReferenceFieldUpdater.get(this) == c0790up) {
        }
        m2587q(c0790up, obj);
        return obj;
    }

    /* JADX INFO: renamed from: t */
    public final CancellationException m2590t() {
        CancellationException cancellationException;
        Object objM2592x = m2592x();
        if (!(objM2592x instanceof C0790up)) {
            if (objM2592x instanceof InterfaceC0826vo) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objM2592x instanceof C0516nb)) {
                return new C0530np(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0516nb) objM2592x).f3368a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C0530np(mo1242o(), th, this) : cancellationException;
        }
        Throwable thM2460c = ((C0790up) objM2592x).m2460c();
        if (thM2460c == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM2460c instanceof CancellationException ? (CancellationException) thM2460c : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo1242o();
        }
        return new C0530np(strConcat, thM2460c, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m2577I(m2592x()) + '}');
        sb.append('@');
        sb.append(AbstractC0222ff.m1197s(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public boolean mo2127u() {
        return true;
    }

    /* JADX INFO: renamed from: v */
    public boolean mo2128v() {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final C0500mw m2591w(InterfaceC0826vo interfaceC0826vo) {
        C0500mw c0500mwMo1876d = interfaceC0826vo.mo1876d();
        if (c0500mwMo1876d != null) {
            return c0500mwMo1876d;
        }
        if (interfaceC0826vo instanceof C0783ui) {
            return new C0500mw();
        }
        if (interfaceC0826vo instanceof AbstractC0716sp) {
            m2582H((AbstractC0716sp) interfaceC0826vo);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0826vo).toString());
    }

    /* JADX INFO: renamed from: x */
    public final Object m2592x() {
        while (true) {
            Object obj = f5000a.get(this);
            if (!(obj instanceof AbstractC0166dx)) {
                return obj;
            }
            ((AbstractC0166dx) obj).mo961a(this);
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean mo2036y(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: F */
    public void mo1239F(Object obj) {
    }

    /* JADX INFO: renamed from: k */
    public void mo2454k(Object obj) {
    }

    /* JADX INFO: renamed from: z */
    public void mo1243z(C0591pb c0591pb) {
        throw c0591pb;
    }

    /* JADX INFO: renamed from: G */
    public void m2581G() {
    }
}
