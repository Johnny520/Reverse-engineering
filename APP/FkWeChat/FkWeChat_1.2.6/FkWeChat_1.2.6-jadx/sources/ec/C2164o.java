package ec;

import ec.InterfaceC2152l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0189q;
import p145jc.AbstractC3795a0;
import p145jc.C3801d0;
import p145jc.C3808h;
import p172l8.C4700i0;
import p193n3.AbstractC5489b;
import p215oc.C5706c;
import p215oc.C5725t;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.InterfaceC6536e;
import p376zd.C10010p0;

/* JADX INFO: renamed from: ec.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2164o extends AbstractC2112b1 implements InterfaceC2156m, InterfaceC6536e, InterfaceC2109a3 {

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5991v = AtomicIntegerFieldUpdater.newUpdater(C2164o.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5992w = AtomicReferenceFieldUpdater.newUpdater(C2164o.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5993x = AtomicReferenceFieldUpdater.newUpdater(C2164o.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: t */
    public final InterfaceC5976f f5994t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC5980j f5995u;

    public C2164o(InterfaceC5976f interfaceC5976f, int i10) {
        super(i10);
        this.f5994t = interfaceC5976f;
        this.f5995u = interfaceC5976f.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C2120d.f5934a;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m7849S(C2164o c2164o, Object obj, int i10, InterfaceC0189q interfaceC0189q, int i11, Object obj2) {
        if (obj2 != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: resumeImpl");
            return;
        }
        if ((i11 & 4) != 0) {
            interfaceC0189q = null;
        }
        c2164o.m7861R(obj, i10, interfaceC0189q);
    }

    /* JADX INFO: renamed from: i */
    public static C4700i0 m7850i(InterfaceC0184l interfaceC0184l, Throwable th, Object obj, InterfaceC5980j interfaceC5980j) {
        interfaceC0184l.mo27m(th);
        return C4700i0.f13910a;
    }

    @Override // ec.InterfaceC2156m
    /* JADX INFO: renamed from: B */
    public void mo7830B(InterfaceC0184l interfaceC0184l) {
        AbstractC2172q.m7889c(this, new InterfaceC2152l.a(interfaceC0184l));
    }

    /* JADX INFO: renamed from: E */
    public void m7851E() {
        InterfaceC2126e1 interfaceC2126e1M7852F = m7852F();
        if (interfaceC2126e1M7852F != null && mo7834l()) {
            interfaceC2126e1M7852F.mo7628a();
            f5993x.set(this, C2147j2.f5979q);
        }
    }

    /* JADX INFO: renamed from: F */
    public final InterfaceC2126e1 m7852F() {
        InterfaceC2198w1 interfaceC2198w1 = (InterfaceC2198w1) getContext().mo1654h(InterfaceC2198w1.f6022g);
        if (interfaceC2198w1 == null) {
            return null;
        }
        InterfaceC2126e1 interfaceC2126e1M7615o = AbstractC2108a2.m7615o(interfaceC2198w1, false, new C2180s(this), 1, null);
        AbstractC5489b.m22334a(f5993x, this, null, interfaceC2126e1M7615o);
        return interfaceC2126e1M7615o;
    }

    /* JADX INFO: renamed from: G */
    public final void m7853G(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5992w;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C2120d) {
                if (AbstractC5489b.m22334a(f5992w, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof InterfaceC2152l) || (obj2 instanceof AbstractC3795a0)) {
                m7856J(obj, obj2);
            } else {
                if (obj2 instanceof C2111b0) {
                    C2111b0 c2111b0 = (C2111b0) obj2;
                    if (!c2111b0.m7621c()) {
                        m7856J(obj, obj2);
                    }
                    if (obj2 instanceof C2176r) {
                        Throwable th = c2111b0.f5913a;
                        if (obj instanceof InterfaceC2152l) {
                            m7867k((InterfaceC2152l) obj, th);
                            return;
                        } else {
                            obj.getClass();
                            m7869n((AbstractC3795a0) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof C2106a0) {
                    C2106a0 c2106a0 = (C2106a0) obj2;
                    if (c2106a0.f5907b != null) {
                        m7856J(obj, obj2);
                    }
                    if (obj instanceof AbstractC3795a0) {
                        return;
                    }
                    obj.getClass();
                    InterfaceC2152l interfaceC2152l = (InterfaceC2152l) obj;
                    if (c2106a0.m7594c()) {
                        m7867k(interfaceC2152l, c2106a0.f5910e);
                        return;
                    } else {
                        if (AbstractC5489b.m22334a(f5992w, this, obj2, C2106a0.m7592b(c2106a0, null, interfaceC2152l, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof AbstractC3795a0) {
                        return;
                    }
                    obj.getClass();
                    if (AbstractC5489b.m22334a(f5992w, this, obj2, new C2106a0(obj2, (InterfaceC2152l) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m7854H(InterfaceC2152l interfaceC2152l) {
        m7853G(interfaceC2152l);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m7855I() {
        if (!AbstractC2117c1.m7638c(this.f5914s)) {
            return false;
        }
        InterfaceC5976f interfaceC5976f = this.f5994t;
        interfaceC5976f.getClass();
        return ((C3808h) interfaceC5976f).m15174p();
    }

    /* JADX INFO: renamed from: J */
    public final void m7856J(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: renamed from: K */
    public String mo7705K() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: L */
    public final void m7857L(Throwable th) {
        if (m7870p(th)) {
            return;
        }
        mo7833g(th);
        m7872r();
    }

    /* JADX INFO: renamed from: M */
    public final void m7858M() {
        Throwable thM15177s;
        InterfaceC5976f interfaceC5976f = this.f5994t;
        C3808h c3808h = interfaceC5976f instanceof C3808h ? (C3808h) interfaceC5976f : null;
        if (c3808h == null || (thM15177s = c3808h.m15177s(this)) == null) {
            return;
        }
        m7871q();
        mo7833g(thM15177s);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m7859N() {
        Object obj = f5992w.get(this);
        if ((obj instanceof C2106a0) && ((C2106a0) obj).f5909d != null) {
            m7871q();
            return false;
        }
        f5991v.set(this, 536870911);
        f5992w.set(this, C2120d.f5934a);
        return true;
    }

    @Override // ec.InterfaceC2156m
    /* JADX INFO: renamed from: O */
    public void mo7831O(AbstractC2149k0 abstractC2149k0, Object obj) {
        InterfaceC5976f interfaceC5976f = this.f5994t;
        C3808h c3808h = interfaceC5976f instanceof C3808h ? (C3808h) interfaceC5976f : null;
        m7849S(this, obj, (c3808h != null ? c3808h.f10981t : null) == abstractC2149k0 ? 4 : this.f5914s, null, 4, null);
    }

    /* JADX INFO: renamed from: P */
    public void m7860P(Object obj, final InterfaceC0184l interfaceC0184l) {
        m7861R(obj, this.f5914s, interfaceC0184l != null ? new InterfaceC0189q() { // from class: ec.n
            @Override // p010a9.InterfaceC0189q
            /* JADX INFO: renamed from: e */
            public final Object mo236e(Object obj2, Object obj3, Object obj4) {
                return C2164o.m7850i(interfaceC0184l, (Throwable) obj2, obj3, (InterfaceC5980j) obj4);
            }
        } : null);
    }

    @Override // ec.InterfaceC2156m
    /* JADX INFO: renamed from: Q */
    public void mo7832Q(Object obj) {
        m7873s(this.f5914s);
    }

    /* JADX INFO: renamed from: R */
    public final void m7861R(Object obj, int i10, InterfaceC0189q interfaceC0189q) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5992w;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC2151k2)) {
                Object obj3 = obj;
                InterfaceC0189q interfaceC0189q2 = interfaceC0189q;
                if (obj2 instanceof C2176r) {
                    C2176r c2176r = (C2176r) obj2;
                    if (c2176r.m7894e()) {
                        if (interfaceC0189q2 != null) {
                            m7868m(interfaceC0189q2, c2176r.f5913a, obj3);
                            return;
                        }
                        return;
                    }
                }
                m7866j(obj3);
                C5706c.m23089a();
                return;
            }
            Object obj4 = obj;
            int i11 = i10;
            InterfaceC0189q interfaceC0189q3 = interfaceC0189q;
            if (AbstractC5489b.m22334a(f5992w, this, obj2, m7862T((InterfaceC2151k2) obj2, obj4, i11, interfaceC0189q3, null))) {
                m7872r();
                m7873s(i11);
                return;
            } else {
                obj = obj4;
                i10 = i11;
                interfaceC0189q = interfaceC0189q3;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final Object m7862T(InterfaceC2151k2 interfaceC2151k2, Object obj, int i10, InterfaceC0189q interfaceC0189q, Object obj2) {
        if (obj instanceof C2111b0) {
            return obj;
        }
        if ((AbstractC2117c1.m7637b(i10) || obj2 != null) && !(interfaceC0189q == null && !(interfaceC2151k2 instanceof InterfaceC2152l) && obj2 == null)) {
            return new C2106a0(obj, interfaceC2151k2 instanceof InterfaceC2152l ? (InterfaceC2152l) interfaceC2151k2 : null, interfaceC0189q, obj2, null, 16, null);
        }
        return obj;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m7863U() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5991v;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                C10010p0.m38820a("Already resumed");
                return false;
            }
        } while (!f5991v.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final C3801d0 m7864V(Object obj, Object obj2, InterfaceC0189q interfaceC0189q) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5992w;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC2151k2)) {
                Object obj4 = obj2;
                if ((obj3 instanceof C2106a0) && obj4 != null && ((C2106a0) obj3).f5909d == obj4) {
                    return AbstractC2168p.f5996a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            InterfaceC0189q interfaceC0189q2 = interfaceC0189q;
            if (AbstractC5489b.m22334a(f5992w, this, obj3, m7862T((InterfaceC2151k2) obj3, obj5, this.f5914s, interfaceC0189q2, obj6))) {
                m7872r();
                return AbstractC2168p.f5996a;
            }
            obj = obj5;
            interfaceC0189q = interfaceC0189q2;
            obj2 = obj6;
        }
    }

    /* JADX INFO: renamed from: W */
    public final boolean m7865W() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5991v;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                C10010p0.m38820a("Already suspended");
                return false;
            }
        } while (!f5991v.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    @Override // ec.InterfaceC2109a3
    /* JADX INFO: renamed from: a */
    public void mo7618a(AbstractC3795a0 abstractC3795a0, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5991v;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                C10010p0.m38820a("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        m7853G(abstractC3795a0);
    }

    @Override // ec.AbstractC2112b1
    /* JADX INFO: renamed from: b */
    public void mo7622b(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5992w;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC2151k2) {
                C10010p0.m38820a("Not completed");
                return;
            }
            if (obj2 instanceof C2111b0) {
                return;
            }
            if (obj2 instanceof C2106a0) {
                C2106a0 c2106a0 = (C2106a0) obj2;
                if (c2106a0.m7594c()) {
                    C10010p0.m38820a("Must be called at most once");
                    return;
                }
                Throwable th3 = th;
                th2 = th3;
                if (AbstractC5489b.m22334a(f5992w, this, obj2, C2106a0.m7592b(c2106a0, null, null, null, null, th3, 15, null))) {
                    c2106a0.m7595d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (AbstractC5489b.m22334a(f5992w, this, obj2, new C2106a0(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // ec.AbstractC2112b1
    /* JADX INFO: renamed from: c */
    public final InterfaceC5976f mo7623c() {
        return this.f5994t;
    }

    @Override // ec.AbstractC2112b1
    /* JADX INFO: renamed from: d */
    public Throwable mo7624d(Object obj) {
        Throwable thMo7624d = super.mo7624d(obj);
        if (thMo7624d != null) {
            return thMo7624d;
        }
        return null;
    }

    @Override // ec.AbstractC2112b1
    /* JADX INFO: renamed from: e */
    public Object mo7625e(Object obj) {
        return obj instanceof C2106a0 ? ((C2106a0) obj).f5906a : obj;
    }

    @Override // ec.InterfaceC2156m
    /* JADX INFO: renamed from: g */
    public boolean mo7833g(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5992w;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC2151k2)) {
                return false;
            }
        } while (!AbstractC5489b.m22334a(f5992w, this, obj, new C2176r(this, th, (obj instanceof InterfaceC2152l) || (obj instanceof AbstractC3795a0))));
        InterfaceC2151k2 interfaceC2151k2 = (InterfaceC2151k2) obj;
        if (interfaceC2151k2 instanceof InterfaceC2152l) {
            m7867k((InterfaceC2152l) obj, th);
        } else if (interfaceC2151k2 instanceof AbstractC3795a0) {
            m7869n((AbstractC3795a0) obj, th);
        }
        m7872r();
        m7873s(this.f5914s);
        return true;
    }

    @Override // p257r8.InterfaceC6536e
    public InterfaceC6536e getCallerFrame() {
        InterfaceC5976f interfaceC5976f = this.f5994t;
        if (interfaceC5976f instanceof InterfaceC6536e) {
            return (InterfaceC6536e) interfaceC5976f;
        }
        return null;
    }

    @Override // p228p8.InterfaceC5976f
    public InterfaceC5980j getContext() {
        return this.f5995u;
    }

    @Override // ec.AbstractC2112b1
    /* JADX INFO: renamed from: h */
    public Object mo7627h() {
        return m7876x();
    }

    @Override // ec.InterfaceC2156m
    public boolean isCancelled() {
        return m7876x() instanceof C2176r;
    }

    /* JADX INFO: renamed from: j */
    public final Void m7866j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* JADX INFO: renamed from: k */
    public final void m7867k(InterfaceC2152l interfaceC2152l, Throwable th) {
        try {
            interfaceC2152l.mo7747a(th);
        } catch (Throwable th2) {
            AbstractC2157m0.m7839a(getContext(), new C2116c0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // ec.InterfaceC2156m
    /* JADX INFO: renamed from: l */
    public boolean mo7834l() {
        return !(m7876x() instanceof InterfaceC2151k2);
    }

    /* JADX INFO: renamed from: m */
    public final void m7868m(InterfaceC0189q interfaceC0189q, Throwable th, Object obj) {
        try {
            interfaceC0189q.mo236e(th, obj, getContext());
        } catch (Throwable th2) {
            AbstractC2157m0.m7839a(getContext(), new C2116c0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m7869n(AbstractC3795a0 abstractC3795a0, Throwable th) {
        int i10 = f5991v.get(this) & 536870911;
        if (i10 == 536870911) {
            C10010p0.m38820a("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            abstractC3795a0.mo9857s(i10, th, getContext());
        } catch (Throwable th2) {
            AbstractC2157m0.m7839a(getContext(), new C2116c0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // ec.InterfaceC2156m
    /* JADX INFO: renamed from: o */
    public Object mo7835o(Object obj, Object obj2, InterfaceC0189q interfaceC0189q) {
        return m7864V(obj, obj2, interfaceC0189q);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m7870p(Throwable th) {
        if (!m7855I()) {
            return false;
        }
        InterfaceC5976f interfaceC5976f = this.f5994t;
        interfaceC5976f.getClass();
        return ((C3808h) interfaceC5976f).m15175q(th);
    }

    /* JADX INFO: renamed from: q */
    public final void m7871q() {
        InterfaceC2126e1 interfaceC2126e1M7874u = m7874u();
        if (interfaceC2126e1M7874u == null) {
            return;
        }
        interfaceC2126e1M7874u.mo7628a();
        f5993x.set(this, C2147j2.f5979q);
    }

    /* JADX INFO: renamed from: r */
    public final void m7872r() {
        if (m7855I()) {
            return;
        }
        m7871q();
    }

    @Override // p228p8.InterfaceC5976f
    public void resumeWith(Object obj) {
        m7849S(this, AbstractC2121d0.m7725c(obj, this), this.f5914s, null, 4, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m7873s(int i10) {
        if (m7863U()) {
            return;
        }
        AbstractC2117c1.m7636a(this, i10);
    }

    /* JADX INFO: renamed from: t */
    public Throwable mo7706t(InterfaceC2198w1 interfaceC2198w1) {
        return interfaceC2198w1.mo7669T();
    }

    public String toString() {
        return mo7705K() + '(' + AbstractC2181s0.m7900c(this.f5994t) + "){" + m7877y() + "}@" + AbstractC2181s0.m7899b(this);
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC2126e1 m7874u() {
        return (InterfaceC2126e1) f5993x.get(this);
    }

    @Override // ec.InterfaceC2156m
    /* JADX INFO: renamed from: v */
    public void mo7836v(Object obj, InterfaceC0189q interfaceC0189q) {
        m7861R(obj, this.f5914s, interfaceC0189q);
    }

    /* JADX INFO: renamed from: w */
    public final Object m7875w() {
        InterfaceC2198w1 interfaceC2198w1;
        boolean zM7855I = m7855I();
        if (m7865W()) {
            if (m7874u() == null) {
                m7852F();
            }
            if (zM7855I) {
                m7858M();
            }
            return AbstractC6325c.m24992g();
        }
        if (zM7855I) {
            m7858M();
        }
        Object objM7876x = m7876x();
        if (objM7876x instanceof C2111b0) {
            throw ((C2111b0) objM7876x).f5913a;
        }
        if (!AbstractC2117c1.m7637b(this.f5914s) || (interfaceC2198w1 = (InterfaceC2198w1) getContext().mo1654h(InterfaceC2198w1.f6022g)) == null || interfaceC2198w1.mo7586c()) {
            return mo7625e(objM7876x);
        }
        CancellationException cancellationExceptionMo7669T = interfaceC2198w1.mo7669T();
        mo7622b(objM7876x, cancellationExceptionMo7669T);
        throw cancellationExceptionMo7669T;
    }

    /* JADX INFO: renamed from: x */
    public final Object m7876x() {
        return f5992w.get(this);
    }

    /* JADX INFO: renamed from: y */
    public final String m7877y() {
        Object objM7876x = m7876x();
        return objM7876x instanceof InterfaceC2151k2 ? "Active" : objM7876x instanceof C2176r ? "Cancelled" : "Completed";
    }

    @Override // ec.InterfaceC2156m
    /* JADX INFO: renamed from: z */
    public Object mo7837z(Throwable th) {
        return m7864V(new C2111b0(th, false, 2, null), null, null);
    }
}
