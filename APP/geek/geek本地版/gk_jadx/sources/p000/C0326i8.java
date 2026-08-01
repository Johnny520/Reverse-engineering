package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: i8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0326i8 extends AbstractC0818vg implements InterfaceC0444ld, InterfaceC0631qe {

    /* JADX INFO: renamed from: f */
    public static final AtomicIntegerFieldUpdater f2363f = AtomicIntegerFieldUpdater.newUpdater(C0326i8.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: g */
    public static final AtomicReferenceFieldUpdater f2364g = AtomicReferenceFieldUpdater.newUpdater(C0326i8.class, Object.class, "_state");

    /* JADX INFO: renamed from: h */
    public static final AtomicReferenceFieldUpdater f2365h = AtomicReferenceFieldUpdater.newUpdater(C0326i8.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0444ld f2366d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0258ge f2367e;

    public C0326i8(InterfaceC0444ld interfaceC0444ld) {
        super(1);
        this.f2366d = interfaceC0444ld;
        this.f2367e = interfaceC0444ld.mo1240d();
        this._decisionAndIndex = 536870911;
        this._state = C0543o1.f3470a;
    }

    /* JADX INFO: renamed from: p */
    public static void m1401p(C0018ah c0018ah, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0018ah + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: r */
    public static void m1402r(C0326i8 c0326i8, Object obj, int i) {
        Object c0442lb;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2364g;
            Object obj2 = atomicReferenceFieldUpdater.get(c0326i8);
            if (!(obj2 instanceof InterfaceC0574ow)) {
                if (obj2 instanceof C0439l8) {
                    if (C0439l8.f3028c.compareAndSet((C0439l8) obj2, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            InterfaceC0574ow interfaceC0574ow = (InterfaceC0574ow) obj2;
            if (!(obj instanceof C0516nb) && ((i == 1 || i == 2) && (interfaceC0574ow instanceof C0018ah))) {
                c0442lb = new C0442lb(obj, interfaceC0574ow instanceof C0018ah ? (C0018ah) interfaceC0574ow : null, null, 16);
            } else {
                c0442lb = obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c0326i8, obj2, c0442lb)) {
                if (atomicReferenceFieldUpdater.get(c0326i8) != obj2) {
                    break;
                }
            }
            if (!c0326i8.m1414o()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2365h;
                InterfaceC0966zg interfaceC0966zg = (InterfaceC0966zg) atomicReferenceFieldUpdater2.get(c0326i8);
                if (interfaceC0966zg != null) {
                    interfaceC0966zg.mo1361b();
                    atomicReferenceFieldUpdater2.set(c0326i8, C0537nw.f3454a);
                }
            }
            c0326i8.m1411l(i);
            return;
        }
    }

    @Override // p000.AbstractC0818vg
    /* JADX INFO: renamed from: a */
    public final void mo1403a(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2364g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC0574ow) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0516nb) {
                return;
            }
            C0018ah c0018ah = null;
            if (!(obj2 instanceof C0442lb)) {
                C0442lb c0442lb = new C0442lb(obj2, c0018ah, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0442lb)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0442lb c0442lb2 = (C0442lb) obj2;
            if (c0442lb2.f3038e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0442lb c0442lbM1756a = C0442lb.m1756a(c0442lb2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0442lbM1756a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            C0018ah c0018ah2 = c0442lb2.f3035b;
            if (c0018ah2 != null) {
                m1409j(c0018ah2, cancellationException);
            }
            InterfaceC0713sm interfaceC0713sm = c0442lb2.f3036c;
            if (interfaceC0713sm != null) {
                try {
                    interfaceC0713sm.mo96f(cancellationException);
                    return;
                } catch (Throwable th) {
                    AbstractC0222ff.m1199u(this.f2367e, new C0591pb("Exception in resume onCancellation handler for " + this, th));
                    return;
                }
            }
            return;
        }
    }

    @Override // p000.AbstractC0818vg
    /* JADX INFO: renamed from: b */
    public final InterfaceC0444ld mo1404b() {
        return this.f2366d;
    }

    @Override // p000.InterfaceC0631qe
    /* JADX INFO: renamed from: c */
    public final InterfaceC0631qe mo1405c() {
        InterfaceC0444ld interfaceC0444ld = this.f2366d;
        if (interfaceC0444ld instanceof InterfaceC0631qe) {
            return (InterfaceC0631qe) interfaceC0444ld;
        }
        return null;
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: d */
    public final InterfaceC0258ge mo1240d() {
        return this.f2367e;
    }

    @Override // p000.AbstractC0818vg
    /* JADX INFO: renamed from: e */
    public final Throwable mo1406e(Object obj) {
        Throwable thMo1406e = super.mo1406e(obj);
        if (thMo1406e != null) {
            return thMo1406e;
        }
        return null;
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: f */
    public final void mo1241f(Object obj) {
        Throwable thM1132a = f10.m1132a(obj);
        if (thM1132a != null) {
            obj = new C0516nb(thM1132a, false);
        }
        m1402r(this, obj, this.f4842c);
    }

    @Override // p000.AbstractC0818vg
    /* JADX INFO: renamed from: g */
    public final Object mo1407g(Object obj) {
        return obj instanceof C0442lb ? ((C0442lb) obj).f3034a : obj;
    }

    @Override // p000.AbstractC0818vg
    /* JADX INFO: renamed from: i */
    public final Object mo1408i() {
        return f2364g.get(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m1409j(C0018ah c0018ah, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            c0018ah.m95a(th);
        } catch (Throwable th2) {
            AbstractC0222ff.m1199u(this.f2367e, new C0591pb("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1410k(Throwable th) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2364g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC0574ow) {
                C0439l8 c0439l8 = new C0439l8(this, th, obj instanceof C0018ah);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0439l8)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((InterfaceC0574ow) obj) instanceof C0018ah) {
                    m1409j((C0018ah) obj, th);
                }
                if (!m1414o()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2365h;
                    InterfaceC0966zg interfaceC0966zg = (InterfaceC0966zg) atomicReferenceFieldUpdater2.get(this);
                    if (interfaceC0966zg != null) {
                        interfaceC0966zg.mo1361b();
                        atomicReferenceFieldUpdater2.set(this, C0537nw.f3454a);
                    }
                }
                m1411l(this.f4842c);
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1411l(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f2363f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                InterfaceC0444ld interfaceC0444ld = this.f2366d;
                if (!z && (interfaceC0444ld instanceof C0744tg)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f4842c;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C0744tg c0744tg = (C0744tg) interfaceC0444ld;
                        AbstractC0408ke abstractC0408ke = c0744tg.f4572d;
                        InterfaceC0258ge interfaceC0258ge = c0744tg.f4573e.f3143b;
                        AbstractC0346ip.m1500l(interfaceC0258ge);
                        if (abstractC0408ke.mo1605e()) {
                            abstractC0408ke.mo1598d(interfaceC0258ge, this);
                            return;
                        }
                        AbstractC0413kj abstractC0413kjM2362a = t60.m2362a();
                        if (abstractC0413kjM2362a.f2904c < 4294967296L) {
                            abstractC0413kjM2362a.m1702k(true);
                            try {
                                AbstractC0346ip.m1481S(this, interfaceC0444ld, true);
                                do {
                                } while (abstractC0413kjM2362a.m1703l());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            return;
                        }
                        C0400k6 c0400k6 = abstractC0413kjM2362a.f2906e;
                        if (c0400k6 == null) {
                            c0400k6 = new C0400k6();
                            abstractC0413kjM2362a.f2906e = c0400k6;
                        }
                        c0400k6.addLast(this);
                        return;
                    }
                }
                AbstractC0346ip.m1481S(this, interfaceC0444ld, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC0966zg m1412m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0493mp interfaceC0493mp = (InterfaceC0493mp) this.f2367e.mo1272b(C0819vh.f4849h);
        if (interfaceC0493mp == null) {
            return null;
        }
        InterfaceC0966zg interfaceC0966zgM51p = a80.m51p(interfaceC0493mp, new C0097ca(this), 2);
        do {
            atomicReferenceFieldUpdater = f2365h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC0966zgM51p)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC0966zgM51p;
    }

    /* JADX INFO: renamed from: n */
    public final void m1413n(InterfaceC0713sm interfaceC0713sm) {
        C0018ah c0018ah = interfaceC0713sm instanceof C0018ah ? (C0018ah) interfaceC0713sm : new C0018ah(1, interfaceC0713sm);
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2364g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0543o1) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0018ah)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            CancellationException cancellationException = null;
            if (obj instanceof C0018ah) {
                m1401p(c0018ah, obj);
                throw null;
            }
            if (obj instanceof C0516nb) {
                C0516nb c0516nb = (C0516nb) obj;
                if (!C0516nb.f3367b.compareAndSet(c0516nb, 0, 1)) {
                    m1401p(c0018ah, obj);
                    throw null;
                }
                if (obj instanceof C0439l8) {
                    m1409j(c0018ah, c0516nb.f3368a);
                    return;
                }
                return;
            }
            if (!(obj instanceof C0442lb)) {
                C0442lb c0442lb = new C0442lb(obj, c0018ah, cancellationException, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0442lb)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0442lb c0442lb2 = (C0442lb) obj;
            if (c0442lb2.f3035b != null) {
                m1401p(c0018ah, obj);
                throw null;
            }
            Throwable th = c0442lb2.f3038e;
            if (th != null) {
                m1409j(c0018ah, th);
                return;
            }
            C0442lb c0442lbM1756a = C0442lb.m1756a(c0442lb2, c0018ah, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0442lbM1756a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1414o() {
        if (this.f4842c != 2) {
            return false;
        }
        InterfaceC0444ld interfaceC0444ld = this.f2366d;
        AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", interfaceC0444ld);
        return C0744tg.f4571h.get((C0744tg) interfaceC0444ld) != null;
    }

    /* JADX INFO: renamed from: q */
    public final void m1415q() {
        InterfaceC0444ld interfaceC0444ld = this.f2366d;
        Throwable th = null;
        C0744tg c0744tg = interfaceC0444ld instanceof C0744tg ? (C0744tg) interfaceC0444ld : null;
        if (c0744tg != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0744tg.f4571h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c0744tg);
                C0431l0 c0431l0 = a80.f72e;
                if (obj == c0431l0) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c0744tg, c0431l0, this)) {
                        if (atomicReferenceFieldUpdater.get(c0744tg) != c0431l0) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c0744tg, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c0744tg) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2365h;
            InterfaceC0966zg interfaceC0966zg = (InterfaceC0966zg) atomicReferenceFieldUpdater2.get(this);
            if (interfaceC0966zg != null) {
                interfaceC0966zg.mo1361b();
                atomicReferenceFieldUpdater2.set(this, C0537nw.f3454a);
            }
            m1410k(th);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1416s(AbstractC0408ke abstractC0408ke) {
        C0819vh c0819vh = C0819vh.f4855n;
        InterfaceC0444ld interfaceC0444ld = this.f2366d;
        C0744tg c0744tg = interfaceC0444ld instanceof C0744tg ? (C0744tg) interfaceC0444ld : null;
        m1402r(this, c0819vh, (c0744tg != null ? c0744tg.f4572d : null) == abstractC0408ke ? 4 : this.f4842c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0222ff.m1174T(this.f2366d));
        sb.append("){");
        Object obj = f2364g.get(this);
        sb.append(obj instanceof InterfaceC0574ow ? "Active" : obj instanceof C0439l8 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0222ff.m1197s(this));
        return sb.toString();
    }
}
