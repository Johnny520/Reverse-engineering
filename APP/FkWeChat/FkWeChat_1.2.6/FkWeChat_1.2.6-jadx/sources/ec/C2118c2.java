package ec;

import ec.InterfaceC2198w1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p024b9.C1050n0;
import p145jc.C3822o;
import p172l8.AbstractC4693f;
import p172l8.C4700i0;
import p193n3.AbstractC5489b;
import p215oc.C5725t;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6539h;
import p257r8.AbstractC6542k;
import p314vb.C8897d;
import p376zd.C10010p0;
import sb.AbstractC7284j;
import sb.AbstractC7285k;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: ec.c2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2118c2 implements InterfaceC2198w1, InterfaceC2192v, InterfaceC2155l2 {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5918q = AtomicReferenceFieldUpdater.newUpdater(C2118c2.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5919r = AtomicReferenceFieldUpdater.newUpdater(C2118c2.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: ec.c2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends C2164o {

        /* JADX INFO: renamed from: y */
        public final C2118c2 f5920y;

        public a(InterfaceC5976f interfaceC5976f, C2118c2 c2118c2) {
            super(interfaceC5976f, 1);
            this.f5920y = c2118c2;
        }

        @Override // ec.C2164o
        /* JADX INFO: renamed from: K */
        public String mo7705K() {
            return "AwaitContinuation";
        }

        @Override // ec.C2164o
        /* JADX INFO: renamed from: t */
        public Throwable mo7706t(InterfaceC2198w1 interfaceC2198w1) {
            Throwable thM7713f;
            Object objM7699p0 = this.f5920y.m7699p0();
            return (!(objM7699p0 instanceof c) || (thM7713f = ((c) objM7699p0).m7713f()) == null) ? objM7699p0 instanceof C2111b0 ? ((C2111b0) objM7699p0).f5913a : interfaceC2198w1.mo7669T() : thM7713f;
        }
    }

    /* JADX INFO: renamed from: ec.c2$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC2113b2 {

        /* JADX INFO: renamed from: u */
        public final C2118c2 f5921u;

        /* JADX INFO: renamed from: v */
        public final c f5922v;

        /* JADX INFO: renamed from: w */
        public final C2188u f5923w;

        /* JADX INFO: renamed from: x */
        public final Object f5924x;

        public b(C2118c2 c2118c2, c cVar, C2188u c2188u, Object obj) {
            this.f5921u = c2118c2;
            this.f5922v = cVar;
            this.f5923w = c2188u;
            this.f5924x = obj;
        }

        @Override // ec.AbstractC2113b2
        /* JADX INFO: renamed from: w */
        public boolean mo7632w() {
            return false;
        }

        @Override // ec.AbstractC2113b2
        /* JADX INFO: renamed from: x */
        public void mo7633x(Throwable th) {
            this.f5921u.m7678Z(this.f5922v, this.f5923w, this.f5924x);
        }
    }

    /* JADX INFO: renamed from: ec.c2$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC2182s1 {

        /* JADX INFO: renamed from: r */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f5925r = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f5926s = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f5927t = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: q */
        public final C2139h2 f5928q;

        public c(C2139h2 c2139h2, boolean z10, Throwable th) {
            this.f5928q = c2139h2;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        /* JADX INFO: renamed from: a */
        public final void m7710a(Throwable th) {
            Throwable thM7713f = m7713f();
            if (thM7713f == null) {
                m7720p(th);
                return;
            }
            if (th == thM7713f) {
                return;
            }
            Object objM7712e = m7712e();
            if (objM7712e == null) {
                m7719o(th);
                return;
            }
            if (!(objM7712e instanceof Throwable)) {
                if (objM7712e instanceof ArrayList) {
                    ((ArrayList) objM7712e).add(th);
                    return;
                } else {
                    C8897d.m34134a("State is ", objM7712e);
                    return;
                }
            }
            if (th == objM7712e) {
                return;
            }
            ArrayList arrayListM7711d = m7711d();
            arrayListM7711d.add(objM7712e);
            arrayListM7711d.add(th);
            m7719o(arrayListM7711d);
        }

        @Override // ec.InterfaceC2182s1
        /* JADX INFO: renamed from: b */
        public C2139h2 mo7629b() {
            return this.f5928q;
        }

        @Override // ec.InterfaceC2182s1
        /* JADX INFO: renamed from: c */
        public boolean mo7630c() {
            return m7713f() == null;
        }

        /* JADX INFO: renamed from: d */
        public final ArrayList m7711d() {
            return new ArrayList(4);
        }

        /* JADX INFO: renamed from: e */
        public final Object m7712e() {
            return f5927t.get(this);
        }

        /* JADX INFO: renamed from: f */
        public final Throwable m7713f() {
            return (Throwable) f5926s.get(this);
        }

        /* JADX INFO: renamed from: j */
        public final boolean m7714j() {
            return m7713f() != null;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m7715k() {
            return f5925r.get(this) == 1;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m7716l() {
            return m7712e() == AbstractC2123d2.f5942e;
        }

        /* JADX INFO: renamed from: m */
        public final List m7717m(Throwable th) {
            ArrayList arrayListM7711d;
            Object objM7712e = m7712e();
            if (objM7712e == null) {
                arrayListM7711d = m7711d();
            } else if (objM7712e instanceof Throwable) {
                ArrayList arrayListM7711d2 = m7711d();
                arrayListM7711d2.add(objM7712e);
                arrayListM7711d = arrayListM7711d2;
            } else {
                if (!(objM7712e instanceof ArrayList)) {
                    C8897d.m34134a("State is ", objM7712e);
                    return null;
                }
                arrayListM7711d = (ArrayList) objM7712e;
            }
            Throwable thM7713f = m7713f();
            if (thM7713f != null) {
                arrayListM7711d.add(0, thM7713f);
            }
            if (th != null && !AbstractC1061t.m3842c(th, thM7713f)) {
                arrayListM7711d.add(th);
            }
            m7719o(AbstractC2123d2.f5942e);
            return arrayListM7711d;
        }

        /* JADX INFO: renamed from: n */
        public final void m7718n(boolean z10) {
            f5925r.set(this, z10 ? 1 : 0);
        }

        /* JADX INFO: renamed from: o */
        public final void m7719o(Object obj) {
            f5927t.set(this, obj);
        }

        /* JADX INFO: renamed from: p */
        public final void m7720p(Throwable th) {
            f5926s.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + m7714j() + ", completing=" + m7715k() + ", rootCause=" + m7713f() + ", exceptions=" + m7712e() + ", list=" + mo7629b() + ']';
        }
    }

    /* JADX INFO: renamed from: ec.c2$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6542k implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public Object f5929r;

        /* JADX INFO: renamed from: s */
        public Object f5930s;

        /* JADX INFO: renamed from: t */
        public int f5931t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f5932u;

        public d(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            d dVar = C2118c2.this.new d(interfaceC5976f);
            dVar.f5932u = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        
            if (r6.mo28871x(r1, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
        
            if (r4.mo28871x(r6, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:27:0x007e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please report as a decompilation issue!!! */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r5.f5931t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r5.f5930s
                jc.o r1 = (p145jc.C3822o) r1
                java.lang.Object r3 = r5.f5929r
                jc.n r3 = (p145jc.AbstractC3820n) r3
                java.lang.Object r4 = r5.f5932u
                sb.j r4 = (sb.AbstractC7284j) r4
                p172l8.AbstractC4713t.m18808b(r6)
                goto L7e
            L1e:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r6)
                r6 = 0
                return r6
            L25:
                p172l8.AbstractC4713t.m18808b(r6)
                goto L83
            L29:
                p172l8.AbstractC4713t.m18808b(r6)
                java.lang.Object r6 = r5.f5932u
                sb.j r6 = (sb.AbstractC7284j) r6
                ec.c2 r1 = ec.C2118c2.this
                java.lang.Object r1 = r1.m7699p0()
                boolean r4 = r1 instanceof ec.C2188u
                if (r4 == 0) goto L47
                ec.u r1 = (ec.C2188u) r1
                ec.v r1 = r1.f6014u
                r5.f5931t = r3
                java.lang.Object r6 = r6.mo28871x(r1, r5)
                if (r6 != r0) goto L83
                goto L7d
            L47:
                boolean r3 = r1 instanceof ec.InterfaceC2182s1
                if (r3 == 0) goto L83
                ec.s1 r1 = (ec.InterfaceC2182s1) r1
                ec.h2 r1 = r1.mo7629b()
                if (r1 == 0) goto L83
                java.lang.Object r3 = r1.m15227l()
                r3.getClass()
                jc.o r3 = (p145jc.C3822o) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L60:
                boolean r6 = p024b9.AbstractC1061t.m3842c(r1, r3)
                if (r6 != 0) goto L83
                boolean r6 = r1 instanceof ec.C2188u
                if (r6 == 0) goto L7e
                r6 = r1
                ec.u r6 = (ec.C2188u) r6
                ec.v r6 = r6.f6014u
                r5.f5932u = r4
                r5.f5929r = r3
                r5.f5930s = r1
                r5.f5931t = r2
                java.lang.Object r6 = r4.mo28871x(r6, r5)
                if (r6 != r0) goto L7e
            L7d:
                return r0
            L7e:
                jc.o r1 = r1.m15228m()
                goto L60
            L83:
                l8.i0 r6 = p172l8.C4700i0.f13910a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ec.C2118c2.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC7284j abstractC7284j, InterfaceC5976f interfaceC5976f) {
            return ((d) create(abstractC7284j, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C2118c2(boolean z10) {
        this._state$volatile = z10 ? AbstractC2123d2.f5944g : AbstractC2123d2.f5943f;
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ CancellationException m7641Z0(C2118c2 c2118c2, Throwable th, String str, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: toCancellationException");
            return null;
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return c2118c2.m7677Y0(th, str);
    }

    /* JADX INFO: renamed from: A0 */
    public boolean mo7646A0() {
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m7647B0() {
        Object objM7699p0;
        do {
            objM7699p0 = m7699p0();
            if (!(objM7699p0 instanceof InterfaceC2182s1)) {
                return false;
            }
        } while (m7674W0(objM7699p0) < 0);
        return true;
    }

    /* JADX INFO: renamed from: C0 */
    public final Object m7648C0(InterfaceC5976f interfaceC5976f) {
        C2164o c2164o = new C2164o(AbstractC6324b.m24989d(interfaceC5976f), 1);
        c2164o.m7851E();
        AbstractC2172q.m7887a(c2164o, AbstractC2108a2.m7615o(this, false, new C2163n2(c2164o), 1, null));
        Object objM7875w = c2164o.m7875w();
        if (objM7875w == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM7875w == AbstractC6325c.m24992g() ? objM7875w : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: D */
    public final Object m7649D(InterfaceC5976f interfaceC5976f) throws Throwable {
        Object objM7699p0;
        do {
            objM7699p0 = m7699p0();
            if (!(objM7699p0 instanceof InterfaceC2182s1)) {
                if (objM7699p0 instanceof C2111b0) {
                    throw ((C2111b0) objM7699p0).f5913a;
                }
                return AbstractC2123d2.m7737h(objM7699p0);
            }
        } while (m7674W0(objM7699p0) < 0);
        return m7651E(interfaceC5976f);
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: D0 */
    public final InterfaceC2126e1 mo7650D0(InterfaceC0184l interfaceC0184l) {
        return m7704z0(true, new C2194v1(interfaceC0184l));
    }

    /* JADX INFO: renamed from: E */
    public final Object m7651E(InterfaceC5976f interfaceC5976f) {
        a aVar = new a(AbstractC6324b.m24989d(interfaceC5976f), this);
        aVar.m7851E();
        AbstractC2172q.m7887a(aVar, AbstractC2108a2.m7615o(this, false, new C2159m2(aVar), 1, null));
        Object objM7875w = aVar.m7875w();
        if (objM7875w == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM7875w;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m7652H(Throwable th) {
        return m7654I(th);
    }

    /* JADX INFO: renamed from: H0 */
    public final Object m7653H0(Object obj) throws Throwable {
        Throwable thM7679a0 = null;
        while (true) {
            Object objM7699p0 = m7699p0();
            if (objM7699p0 instanceof c) {
                synchronized (objM7699p0) {
                    if (((c) objM7699p0).m7716l()) {
                        return AbstractC2123d2.f5941d;
                    }
                    boolean zM7714j = ((c) objM7699p0).m7714j();
                    if (obj != null || !zM7714j) {
                        if (thM7679a0 == null) {
                            thM7679a0 = m7679a0(obj);
                        }
                        ((c) objM7699p0).m7710a(thM7679a0);
                    }
                    Throwable thM7713f = zM7714j ? null : ((c) objM7699p0).m7713f();
                    if (thM7713f != null) {
                        m7662N0(((c) objM7699p0).mo7629b(), thM7713f);
                    }
                    return AbstractC2123d2.f5938a;
                }
            }
            if (!(objM7699p0 instanceof InterfaceC2182s1)) {
                return AbstractC2123d2.f5941d;
            }
            if (thM7679a0 == null) {
                thM7679a0 = m7679a0(obj);
            }
            InterfaceC2182s1 interfaceC2182s1 = (InterfaceC2182s1) objM7699p0;
            if (!interfaceC2182s1.mo7630c()) {
                Object objM7683d1 = m7683d1(objM7699p0, new C2111b0(thM7679a0, false, 2, null));
                if (objM7683d1 == AbstractC2123d2.f5938a) {
                    C8897d.m34134a("Cannot happen in ", objM7699p0);
                    return null;
                }
                if (objM7683d1 != AbstractC2123d2.f5940c) {
                    return objM7683d1;
                }
            } else if (m7682c1(interfaceC2182s1, thM7679a0)) {
                return AbstractC2123d2.f5938a;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m7654I(Object obj) throws Throwable {
        Object objM7653H0 = AbstractC2123d2.f5938a;
        if (mo7692k0() && (objM7653H0 = m7659M(obj)) == AbstractC2123d2.f5939b) {
            return true;
        }
        if (objM7653H0 == AbstractC2123d2.f5938a) {
            objM7653H0 = m7653H0(obj);
        }
        if (objM7653H0 == AbstractC2123d2.f5938a || objM7653H0 == AbstractC2123d2.f5939b) {
            return true;
        }
        if (objM7653H0 == AbstractC2123d2.f5941d) {
            return false;
        }
        mo7599C(objM7653H0);
        return true;
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m7655I0(Object obj) {
        Object objM7683d1;
        do {
            objM7683d1 = m7683d1(m7699p0(), obj);
            if (objM7683d1 == AbstractC2123d2.f5938a) {
                return false;
            }
            if (objM7683d1 == AbstractC2123d2.f5939b) {
                return true;
            }
        } while (objM7683d1 == AbstractC2123d2.f5940c);
        mo7599C(objM7683d1);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public void mo7656J(Throwable th) throws Throwable {
        m7654I(th);
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: J0 */
    public final Object mo7657J0(InterfaceC5976f interfaceC5976f) {
        if (m7647B0()) {
            Object objM7648C0 = m7648C0(interfaceC5976f);
            return objM7648C0 == AbstractC6325c.m24992g() ? objM7648C0 : C4700i0.f13910a;
        }
        AbstractC2210z1.m7959l(interfaceC5976f.getContext());
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: K0 */
    public final Object m7658K0(Object obj) {
        Object objM7683d1;
        do {
            objM7683d1 = m7683d1(m7699p0(), obj);
            if (objM7683d1 == AbstractC2123d2.f5938a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m7689g0(obj));
            }
        } while (objM7683d1 == AbstractC2123d2.f5940c);
        return objM7683d1;
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: L */
    public InterfaceC5980j mo1649L(InterfaceC5980j.c cVar) {
        return InterfaceC2198w1.a.m7923d(this, cVar);
    }

    /* JADX INFO: renamed from: L0 */
    public String mo7583L0() {
        return AbstractC2181s0.m7898a(this);
    }

    /* JADX INFO: renamed from: M */
    public final Object m7659M(Object obj) {
        Object objM7683d1;
        do {
            Object objM7699p0 = m7699p0();
            if (!(objM7699p0 instanceof InterfaceC2182s1) || ((objM7699p0 instanceof c) && ((c) objM7699p0).m7715k())) {
                return AbstractC2123d2.f5938a;
            }
            objM7683d1 = m7683d1(objM7699p0, new C2111b0(m7679a0(obj), false, 2, null));
        } while (objM7683d1 == AbstractC2123d2.f5940c);
        return objM7683d1;
    }

    /* JADX INFO: renamed from: M0 */
    public final C2188u m7660M0(C3822o c3822o) {
        while (c3822o.mo15216r()) {
            c3822o = c3822o.m15229n();
        }
        while (true) {
            c3822o = c3822o.m15228m();
            if (!c3822o.mo15216r()) {
                if (c3822o instanceof C2188u) {
                    return (C2188u) c3822o;
                }
                if (c3822o instanceof C2139h2) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m7661N(Throwable th) {
        if (mo7646A0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        InterfaceC2184t interfaceC2184tM7698o0 = m7698o0();
        return (interfaceC2184tM7698o0 == null || interfaceC2184tM7698o0 == C2147j2.f5979q) ? z10 : interfaceC2184tM7698o0.mo7813h(th) || z10;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m7662N0(C2139h2 c2139h2, Throwable th) throws Throwable {
        m7665P0(th);
        c2139h2.m15223g(4);
        Object objM15227l = c2139h2.m15227l();
        objM15227l.getClass();
        C2116c0 c2116c0 = null;
        for (C3822o c3822oM15228m = (C3822o) objM15227l; !AbstractC1061t.m3842c(c3822oM15228m, c2139h2); c3822oM15228m = c3822oM15228m.m15228m()) {
            if ((c3822oM15228m instanceof AbstractC2113b2) && ((AbstractC2113b2) c3822oM15228m).mo7632w()) {
                try {
                    ((AbstractC2113b2) c3822oM15228m).mo7633x(th);
                } catch (Throwable th2) {
                    if (c2116c0 != null) {
                        AbstractC4693f.m18753a(c2116c0, th2);
                    } else {
                        c2116c0 = new C2116c0("Exception in completion handler " + c3822oM15228m + " for " + this, th2);
                        C4700i0 c4700i0 = C4700i0.f13910a;
                    }
                }
            }
        }
        if (c2116c0 != null) {
            mo7591x0(c2116c0);
        }
        m7661N(th);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m7663O0(C2139h2 c2139h2, Throwable th) throws Throwable {
        c2139h2.m15223g(1);
        Object objM15227l = c2139h2.m15227l();
        objM15227l.getClass();
        C2116c0 c2116c0 = null;
        for (C3822o c3822oM15228m = (C3822o) objM15227l; !AbstractC1061t.m3842c(c3822oM15228m, c2139h2); c3822oM15228m = c3822oM15228m.m15228m()) {
            if (c3822oM15228m instanceof AbstractC2113b2) {
                try {
                    ((AbstractC2113b2) c3822oM15228m).mo7633x(th);
                } catch (Throwable th2) {
                    if (c2116c0 != null) {
                        AbstractC4693f.m18753a(c2116c0, th2);
                    } else {
                        c2116c0 = new C2116c0("Exception in completion handler " + c3822oM15228m + " for " + this, th2);
                        C4700i0 c4700i0 = C4700i0.f13910a;
                    }
                }
            }
        }
        if (c2116c0 != null) {
            mo7591x0(c2116c0);
        }
    }

    @Override // ec.InterfaceC2192v
    /* JADX INFO: renamed from: P */
    public final void mo7664P(InterfaceC2155l2 interfaceC2155l2) throws Throwable {
        m7654I(interfaceC2155l2);
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: R */
    public final InterfaceC2184t mo7666R(InterfaceC2192v interfaceC2192v) {
        C2188u c2188u = new C2188u(interfaceC2192v);
        c2188u.m7634z(this);
        while (true) {
            Object objM7699p0 = m7699p0();
            if (objM7699p0 instanceof C2138h1) {
                C2138h1 c2138h1 = (C2138h1) objM7699p0;
                if (!c2138h1.mo7630c()) {
                    m7668S0(c2138h1);
                } else if (AbstractC5489b.m22334a(f5918q, this, objM7699p0, c2188u)) {
                    return c2188u;
                }
            } else {
                if (!(objM7699p0 instanceof InterfaceC2182s1)) {
                    Object objM7699p02 = m7699p0();
                    C2111b0 c2111b0 = objM7699p02 instanceof C2111b0 ? (C2111b0) objM7699p02 : null;
                    c2188u.mo7633x(c2111b0 != null ? c2111b0.f5913a : null);
                    return C2147j2.f5979q;
                }
                C2139h2 c2139h2Mo7629b = ((InterfaceC2182s1) objM7699p0).mo7629b();
                if (c2139h2Mo7629b != null) {
                    if (!c2139h2Mo7629b.m15220d(c2188u, 7)) {
                        boolean zM15220d = c2139h2Mo7629b.m15220d(c2188u, 3);
                        Object objM7699p03 = m7699p0();
                        if (objM7699p03 instanceof c) {
                            thM7713f = ((c) objM7699p03).m7713f();
                        } else {
                            C2111b0 c2111b02 = objM7699p03 instanceof C2111b0 ? (C2111b0) objM7699p03 : null;
                            if (c2111b02 != null) {
                                thM7713f = c2111b02.f5913a;
                            }
                        }
                        c2188u.mo7633x(thM7713f);
                        if (!zM15220d) {
                            return C2147j2.f5979q;
                        }
                    }
                    return c2188u;
                }
                m7670T0((AbstractC2113b2) objM7699p0);
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public String mo7585S() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: S0 */
    public final void m7668S0(C2138h1 c2138h1) {
        C2139h2 c2139h2 = new C2139h2();
        Object c2178r1 = c2139h2;
        if (!c2138h1.mo7630c()) {
            c2178r1 = new C2178r1(c2139h2);
        }
        AbstractC5489b.m22334a(f5918q, this, c2138h1, c2178r1);
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: T */
    public final CancellationException mo7669T() {
        Object objM7699p0 = m7699p0();
        if (!(objM7699p0 instanceof c)) {
            if (objM7699p0 instanceof InterfaceC2182s1) {
                C8897d.m34134a("Job is still new or active: ", this);
                return null;
            }
            if (objM7699p0 instanceof C2111b0) {
                return m7641Z0(this, ((C2111b0) objM7699p0).f5913a, null, 1, null);
            }
            return new C2202x1(AbstractC2181s0.m7898a(this) + " has completed normally", null, this);
        }
        Throwable thM7713f = ((c) objM7699p0).m7713f();
        if (thM7713f != null) {
            CancellationException cancellationExceptionM7677Y0 = m7677Y0(thM7713f, AbstractC2181s0.m7898a(this) + " is cancelling");
            if (cancellationExceptionM7677Y0 != null) {
                return cancellationExceptionM7677Y0;
            }
        }
        C8897d.m34134a("Job is still new or active: ", this);
        return null;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m7670T0(AbstractC2113b2 abstractC2113b2) {
        abstractC2113b2.m15222f(new C2139h2());
        AbstractC5489b.m22334a(f5918q, this, abstractC2113b2, abstractC2113b2.m15228m());
    }

    /* JADX INFO: renamed from: U */
    public boolean mo7671U(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m7654I(th) && mo7691i0();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m7672U0(AbstractC2113b2 abstractC2113b2) {
        Object objM7699p0;
        do {
            objM7699p0 = m7699p0();
            if (!(objM7699p0 instanceof AbstractC2113b2)) {
                if (!(objM7699p0 instanceof InterfaceC2182s1) || ((InterfaceC2182s1) objM7699p0).mo7629b() == null) {
                    return;
                }
                abstractC2113b2.m15230s();
                return;
            }
            if (objM7699p0 != abstractC2113b2) {
                return;
            }
        } while (!AbstractC5489b.m22334a(f5918q, this, objM7699p0, AbstractC2123d2.f5944g));
    }

    /* JADX INFO: renamed from: V0 */
    public final void m7673V0(InterfaceC2184t interfaceC2184t) {
        f5919r.set(this, interfaceC2184t);
    }

    /* JADX INFO: renamed from: W0 */
    public final int m7674W0(Object obj) {
        if (obj instanceof C2138h1) {
            if (((C2138h1) obj).mo7630c()) {
                return 0;
            }
            if (!AbstractC5489b.m22334a(f5918q, this, obj, AbstractC2123d2.f5944g)) {
                return -1;
            }
            mo7667R0();
            return 1;
        }
        if (!(obj instanceof C2178r1)) {
            return 0;
        }
        if (!AbstractC5489b.m22334a(f5918q, this, obj, ((C2178r1) obj).mo7629b())) {
            return -1;
        }
        mo7667R0();
        return 1;
    }

    /* JADX INFO: renamed from: X0 */
    public final String m7675X0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC2182s1 ? ((InterfaceC2182s1) obj).mo7630c() ? "Active" : "New" : obj instanceof C2111b0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.m7714j() ? "Cancelling" : cVar.m7715k() ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: Y */
    public final void m7676Y(InterfaceC2182s1 interfaceC2182s1, Object obj) throws Throwable {
        InterfaceC2184t interfaceC2184tM7698o0 = m7698o0();
        if (interfaceC2184tM7698o0 != null) {
            interfaceC2184tM7698o0.mo7628a();
            m7673V0(C2147j2.f5979q);
        }
        C2111b0 c2111b0 = obj instanceof C2111b0 ? (C2111b0) obj : null;
        Throwable th = c2111b0 != null ? c2111b0.f5913a : null;
        if (!(interfaceC2182s1 instanceof AbstractC2113b2)) {
            C2139h2 c2139h2Mo7629b = interfaceC2182s1.mo7629b();
            if (c2139h2Mo7629b != null) {
                m7663O0(c2139h2Mo7629b, th);
                return;
            }
            return;
        }
        try {
            ((AbstractC2113b2) interfaceC2182s1).mo7633x(th);
        } catch (Throwable th2) {
            mo7591x0(new C2116c0("Exception in completion handler " + interfaceC2182s1 + " for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final CancellationException m7677Y0(Throwable th, String str) {
        CancellationException c2202x1 = th instanceof CancellationException ? (CancellationException) th : null;
        if (c2202x1 == null) {
            if (str == null) {
                str = mo7585S();
            }
            c2202x1 = new C2202x1(str, th, this);
        }
        return c2202x1;
    }

    /* JADX INFO: renamed from: Z */
    public final void m7678Z(c cVar, C2188u c2188u, Object obj) {
        C2188u c2188uM7660M0 = m7660M0(c2188u);
        if (c2188uM7660M0 == null || !m7688f1(cVar, c2188uM7660M0, obj)) {
            cVar.mo7629b().m15223g(2);
            C2188u c2188uM7660M02 = m7660M0(c2188u);
            if (c2188uM7660M02 == null || !m7688f1(cVar, c2188uM7660M02, obj)) {
                mo7599C(m7684e0(cVar, obj));
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final Throwable m7679a0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C2202x1(mo7585S(), null, this) : th;
        }
        obj.getClass();
        return ((InterfaceC2155l2) obj).mo7701w0();
    }

    /* JADX INFO: renamed from: a1 */
    public final String m7680a1() {
        return mo7583L0() + '{' + m7675X0(m7699p0()) + '}';
    }

    /* JADX INFO: renamed from: b1 */
    public final boolean m7681b1(InterfaceC2182s1 interfaceC2182s1, Object obj) throws Throwable {
        if (!AbstractC5489b.m22334a(f5918q, this, interfaceC2182s1, AbstractC2123d2.m7736g(obj))) {
            return false;
        }
        m7665P0(null);
        mo7584Q0(obj);
        m7676Y(interfaceC2182s1, obj);
        return true;
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: c */
    public boolean mo7586c() {
        Object objM7699p0 = m7699p0();
        return (objM7699p0 instanceof InterfaceC2182s1) && ((InterfaceC2182s1) objM7699p0).mo7630c();
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: c0 */
    public InterfaceC5980j mo1651c0(InterfaceC5980j interfaceC5980j) {
        return InterfaceC2198w1.a.m7924e(this, interfaceC5980j);
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m7682c1(InterfaceC2182s1 interfaceC2182s1, Throwable th) throws Throwable {
        C2139h2 c2139h2M7694l0 = m7694l0(interfaceC2182s1);
        if (c2139h2M7694l0 == null) {
            return false;
        }
        if (!AbstractC5489b.m22334a(f5918q, this, interfaceC2182s1, new c(c2139h2M7694l0, false, th))) {
            return false;
        }
        m7662N0(c2139h2M7694l0, th);
        return true;
    }

    /* JADX INFO: renamed from: d1 */
    public final Object m7683d1(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC2182s1) ? AbstractC2123d2.f5938a : ((!(obj instanceof C2138h1) && !(obj instanceof AbstractC2113b2)) || (obj instanceof C2188u) || (obj2 instanceof C2111b0)) ? m7685e1((InterfaceC2182s1) obj, obj2) : m7681b1((InterfaceC2182s1) obj, obj2) ? obj2 : AbstractC2123d2.f5940c;
    }

    /* JADX INFO: renamed from: e0 */
    public final Object m7684e0(c cVar, Object obj) throws Throwable {
        boolean zM7714j;
        Throwable thM7690h0;
        C2111b0 c2111b0 = obj instanceof C2111b0 ? (C2111b0) obj : null;
        Throwable th = c2111b0 != null ? c2111b0.f5913a : null;
        synchronized (cVar) {
            zM7714j = cVar.m7714j();
            List listM7717m = cVar.m7717m(th);
            thM7690h0 = m7690h0(cVar, listM7717m);
            if (thM7690h0 != null) {
                m7702y(thM7690h0, listM7717m);
            }
        }
        if (thM7690h0 != null && thM7690h0 != th) {
            obj = new C2111b0(thM7690h0, false, 2, null);
        }
        if (thM7690h0 != null && (m7661N(thM7690h0) || mo7700u0(thM7690h0))) {
            obj.getClass();
            ((C2111b0) obj).m7621c();
        }
        if (!zM7714j) {
            m7665P0(thM7690h0);
        }
        mo7584Q0(obj);
        AbstractC5489b.m22334a(f5918q, this, cVar, AbstractC2123d2.m7736g(obj));
        m7676Y(cVar, obj);
        return obj;
    }

    /* JADX INFO: renamed from: e1 */
    public final Object m7685e1(InterfaceC2182s1 interfaceC2182s1, Object obj) throws Throwable {
        C2139h2 c2139h2M7694l0 = m7694l0(interfaceC2182s1);
        if (c2139h2M7694l0 == null) {
            return AbstractC2123d2.f5940c;
        }
        c cVar = interfaceC2182s1 instanceof c ? (c) interfaceC2182s1 : null;
        if (cVar == null) {
            cVar = new c(c2139h2M7694l0, false, null);
        }
        C1050n0 c1050n0 = new C1050n0();
        synchronized (cVar) {
            if (cVar.m7715k()) {
                return AbstractC2123d2.f5938a;
            }
            cVar.m7718n(true);
            if (cVar != interfaceC2182s1 && !AbstractC5489b.m22334a(f5918q, this, interfaceC2182s1, cVar)) {
                return AbstractC2123d2.f5940c;
            }
            boolean zM7714j = cVar.m7714j();
            C2111b0 c2111b0 = obj instanceof C2111b0 ? (C2111b0) obj : null;
            if (c2111b0 != null) {
                cVar.m7710a(c2111b0.f5913a);
            }
            Throwable thM7713f = zM7714j ? null : cVar.m7713f();
            c1050n0.f3208q = thM7713f;
            C4700i0 c4700i0 = C4700i0.f13910a;
            if (thM7713f != null) {
                m7662N0(c2139h2M7694l0, thM7713f);
            }
            C2188u c2188uM7660M0 = m7660M0(c2139h2M7694l0);
            if (c2188uM7660M0 != null && m7688f1(cVar, c2188uM7660M0, obj)) {
                return AbstractC2123d2.f5939b;
            }
            c2139h2M7694l0.m15223g(2);
            C2188u c2188uM7660M02 = m7660M0(c2139h2M7694l0);
            return (c2188uM7660M02 == null || !m7688f1(cVar, c2188uM7660M02, obj)) ? m7684e0(cVar, obj) : AbstractC2123d2.f5939b;
        }
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: f */
    public final InterfaceC7282h mo7686f() {
        return AbstractC7285k.m28874b(new d(null));
    }

    /* JADX INFO: renamed from: f0 */
    public final Object m7687f0() throws Throwable {
        Object objM7699p0 = m7699p0();
        if (objM7699p0 instanceof InterfaceC2182s1) {
            C10010p0.m38820a("This job has not completed yet");
            return null;
        }
        if (objM7699p0 instanceof C2111b0) {
            throw ((C2111b0) objM7699p0).f5913a;
        }
        return AbstractC2123d2.m7737h(objM7699p0);
    }

    /* JADX INFO: renamed from: f1 */
    public final boolean m7688f1(c cVar, C2188u c2188u, Object obj) {
        while (AbstractC2210z1.m7961n(c2188u.f6014u, false, new b(this, cVar, c2188u, obj)) == C2147j2.f5979q) {
            c2188u = m7660M0(c2188u);
            if (c2188u == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    public final Throwable m7689g0(Object obj) {
        C2111b0 c2111b0 = obj instanceof C2111b0 ? (C2111b0) obj : null;
        if (c2111b0 != null) {
            return c2111b0.f5913a;
        }
        return null;
    }

    @Override // p228p8.InterfaceC5980j.b
    public final InterfaceC5980j.c getKey() {
        return InterfaceC2198w1.f6022g;
    }

    @Override // p228p8.InterfaceC5980j.b, p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: h */
    public InterfaceC5980j.b mo1654h(InterfaceC5980j.c cVar) {
        return InterfaceC2198w1.a.m7922c(this, cVar);
    }

    /* JADX INFO: renamed from: h0 */
    public final Throwable m7690h0(c cVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.m7714j()) {
                return new C2202x1(mo7585S(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
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
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof C2191u2) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof C2191u2)) {
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

    /* JADX INFO: renamed from: i0 */
    public boolean mo7691i0() {
        return true;
    }

    @Override // ec.InterfaceC2198w1
    public final boolean isCancelled() {
        Object objM7699p0 = m7699p0();
        if (objM7699p0 instanceof C2111b0) {
            return true;
        }
        return (objM7699p0 instanceof c) && ((c) objM7699p0).m7714j();
    }

    /* JADX INFO: renamed from: k0 */
    public boolean mo7692k0() {
        return false;
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: l */
    public final boolean mo7693l() {
        return !(m7699p0() instanceof InterfaceC2182s1);
    }

    /* JADX INFO: renamed from: l0 */
    public final C2139h2 m7694l0(InterfaceC2182s1 interfaceC2182s1) {
        C2139h2 c2139h2Mo7629b = interfaceC2182s1.mo7629b();
        if (c2139h2Mo7629b != null) {
            return c2139h2Mo7629b;
        }
        if (interfaceC2182s1 instanceof C2138h1) {
            return new C2139h2();
        }
        if (interfaceC2182s1 instanceof AbstractC2113b2) {
            m7670T0((AbstractC2113b2) interfaceC2182s1);
            return null;
        }
        C8897d.m34134a("State should have list: ", interfaceC2182s1);
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public InterfaceC2198w1 m7695m0() {
        InterfaceC2184t interfaceC2184tM7698o0 = m7698o0();
        if (interfaceC2184tM7698o0 != null) {
            return interfaceC2184tM7698o0.getParent();
        }
        return null;
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: n */
    public void mo7696n(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new C2202x1(mo7585S(), null, this);
        }
        mo7656J(cancellationException);
    }

    @Override // ec.InterfaceC2198w1
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC2126e1 mo7697n0(boolean z10, boolean z11, InterfaceC0184l interfaceC0184l) {
        return m7704z0(z11, z10 ? new C2190u1(interfaceC0184l) : new C2194v1(interfaceC0184l));
    }

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC2184t m7698o0() {
        return (InterfaceC2184t) f5919r.get(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final Object m7699p0() {
        return f5918q.get(this);
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: q */
    public Object mo1655q(Object obj, InterfaceC0188p interfaceC0188p) {
        return InterfaceC2198w1.a.m7921b(this, obj, interfaceC0188p);
    }

    @Override // ec.InterfaceC2198w1
    public final boolean start() {
        int iM7674W0;
        do {
            iM7674W0 = m7674W0(m7699p0());
            if (iM7674W0 == 0) {
                return false;
            }
        } while (iM7674W0 != 1);
        return true;
    }

    public String toString() {
        return m7680a1() + '@' + AbstractC2181s0.m7899b(this);
    }

    /* JADX INFO: renamed from: u0 */
    public boolean mo7700u0(Throwable th) {
        return false;
    }

    @Override // ec.InterfaceC2155l2
    /* JADX INFO: renamed from: w0 */
    public CancellationException mo7701w0() {
        Throwable thM7713f;
        Object objM7699p0 = m7699p0();
        if (objM7699p0 instanceof c) {
            thM7713f = ((c) objM7699p0).m7713f();
        } else if (objM7699p0 instanceof C2111b0) {
            thM7713f = ((C2111b0) objM7699p0).f5913a;
        } else {
            if (objM7699p0 instanceof InterfaceC2182s1) {
                C8897d.m34134a("Cannot be cancelling child in this state: ", objM7699p0);
                return null;
            }
            thM7713f = null;
        }
        CancellationException cancellationException = thM7713f instanceof CancellationException ? (CancellationException) thM7713f : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new C2202x1("Parent job is " + m7675X0(objM7699p0), thM7713f, this);
    }

    /* JADX INFO: renamed from: y */
    public final void m7702y(Throwable th, List list) throws IllegalAccessException, InvocationTargetException {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                AbstractC4693f.m18753a(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m7703y0(InterfaceC2198w1 interfaceC2198w1) {
        if (interfaceC2198w1 == null) {
            m7673V0(C2147j2.f5979q);
            return;
        }
        interfaceC2198w1.start();
        InterfaceC2184t interfaceC2184tMo7666R = interfaceC2198w1.mo7666R(this);
        m7673V0(interfaceC2184tMo7666R);
        if (mo7693l()) {
            interfaceC2184tMo7666R.mo7628a();
            m7673V0(C2147j2.f5979q);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final InterfaceC2126e1 m7704z0(boolean z10, AbstractC2113b2 abstractC2113b2) {
        boolean z11;
        boolean zM15220d;
        abstractC2113b2.m7634z(this);
        while (true) {
            Object objM7699p0 = m7699p0();
            z11 = true;
            if (!(objM7699p0 instanceof C2138h1)) {
                if (!(objM7699p0 instanceof InterfaceC2182s1)) {
                    z11 = false;
                    break;
                }
                InterfaceC2182s1 interfaceC2182s1 = (InterfaceC2182s1) objM7699p0;
                C2139h2 c2139h2Mo7629b = interfaceC2182s1.mo7629b();
                if (c2139h2Mo7629b == null) {
                    m7670T0((AbstractC2113b2) objM7699p0);
                } else {
                    if (abstractC2113b2.mo7632w()) {
                        c cVar = interfaceC2182s1 instanceof c ? (c) interfaceC2182s1 : null;
                        Throwable thM7713f = cVar != null ? cVar.m7713f() : null;
                        if (thM7713f != null) {
                            if (z10) {
                                abstractC2113b2.mo7633x(thM7713f);
                            }
                            return C2147j2.f5979q;
                        }
                        zM15220d = c2139h2Mo7629b.m15220d(abstractC2113b2, 5);
                    } else {
                        zM15220d = c2139h2Mo7629b.m15220d(abstractC2113b2, 1);
                    }
                    if (zM15220d) {
                        break;
                    }
                }
            } else {
                C2138h1 c2138h1 = (C2138h1) objM7699p0;
                if (!c2138h1.mo7630c()) {
                    m7668S0(c2138h1);
                } else if (AbstractC5489b.m22334a(f5918q, this, objM7699p0, abstractC2113b2)) {
                    break;
                }
            }
        }
        if (z11) {
            return abstractC2113b2;
        }
        if (z10) {
            Object objM7699p02 = m7699p0();
            C2111b0 c2111b0 = objM7699p02 instanceof C2111b0 ? (C2111b0) objM7699p02 : null;
            abstractC2113b2.mo7633x(c2111b0 != null ? c2111b0.f5913a : null);
        }
        return C2147j2.f5979q;
    }

    /* JADX INFO: renamed from: R0 */
    public void mo7667R0() {
    }

    /* JADX INFO: renamed from: C */
    public void mo7599C(Object obj) {
    }

    /* JADX INFO: renamed from: P0 */
    public void m7665P0(Throwable th) {
    }

    /* JADX INFO: renamed from: Q0 */
    public void mo7584Q0(Object obj) {
    }

    /* JADX INFO: renamed from: x0 */
    public void mo7591x0(Throwable th) throws Throwable {
        throw th;
    }
}
