package p160f3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p027E4.C0330q;
import p056K2.AbstractC0885k;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.InterfaceC1179d;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p190k3.AbstractC2453a;
import p190k3.AbstractC2470r;
import p190k3.C2458f;

/* JADX INFO: renamed from: f3.g */
/* JADX INFO: loaded from: classes.dex */
public class C2135g extends AbstractC2099B implements InterfaceC2133f, InterfaceC1179d, InterfaceC2158r0 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7074i = AtomicIntegerFieldUpdater.newUpdater(C2135g.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7075j = AtomicReferenceFieldUpdater.newUpdater(C2135g.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7076k = AtomicReferenceFieldUpdater.newUpdater(C2135g.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1046d f7077g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1051i f7078h;

    public C2135g(int i5, InterfaceC1046d interfaceC1046d) {
        super(i5);
        this.f7077g = interfaceC1046d;
        this.f7078h = interfaceC1046d.mo275e();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C2125b.f7066a;
    }

    /* JADX INFO: renamed from: F */
    public static Object m3955F(InterfaceC2132e0 interfaceC2132e0, Object obj, int i5, InterfaceC1604f interfaceC1604f) {
        if (obj instanceof C2149n) {
            return obj;
        }
        if (i5 != 1 && i5 != 2) {
            return obj;
        }
        if (interfaceC1604f != null || (interfaceC2132e0 instanceof C2131e)) {
            return new C2147m(obj, interfaceC2132e0 instanceof C2131e ? (C2131e) interfaceC2132e0 : null, interfaceC1604f, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: z */
    public static void m3956z(InterfaceC2132e0 interfaceC2132e0, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC2132e0 + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: A */
    public String mo3914A() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: B */
    public final void m3957B() {
        InterfaceC1046d interfaceC1046d = this.f7077g;
        Throwable th = null;
        C2458f c2458f = interfaceC1046d instanceof C2458f ? (C2458f) interfaceC1046d : null;
        if (c2458f != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2458f.f7929k;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c2458f);
                C1753n c1753n = AbstractC2453a.f7919c;
                if (obj == c1753n) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c2458f, c1753n, this)) {
                        if (atomicReferenceFieldUpdater.get(c2458f) != c1753n) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c2458f, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c2458f) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            m3965o();
            mo3952k(th);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m3958C(Object obj, InterfaceC1604f interfaceC1604f) {
        m3959D(obj, this.f7028f, interfaceC1604f);
    }

    /* JADX INFO: renamed from: D */
    public final void m3959D(Object obj, int i5, InterfaceC1604f interfaceC1604f) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7075j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC2132e0) {
                Object objM3955F = m3955F((InterfaceC2132e0) obj2, obj, i5, interfaceC1604f);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM3955F)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!m3972y()) {
                    m3965o();
                }
                m3966p(i5);
                return;
            }
            if (obj2 instanceof C2137h) {
                C2137h c2137h = (C2137h) obj2;
                if (C2137h.f7079c.compareAndSet(c2137h, 0, 1)) {
                    if (interfaceC1604f != null) {
                        m3963m(interfaceC1604f, c2137h.f7092a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m3960E(AbstractC2153p abstractC2153p) {
        InterfaceC1046d interfaceC1046d = this.f7077g;
        C2458f c2458f = interfaceC1046d instanceof C2458f ? (C2458f) interfaceC1046d : null;
        m3959D(C0891q.f2780a, (c2458f != null ? c2458f.f7930g : null) == abstractC2153p ? 4 : this.f7028f, null);
    }

    @Override // p160f3.InterfaceC2158r0
    /* JADX INFO: renamed from: a */
    public final void mo3961a(AbstractC2470r abstractC2470r, int i5) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        do {
            atomicIntegerFieldUpdater = f7074i;
            i6 = atomicIntegerFieldUpdater.get(this);
            if ((i6 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, ((i6 >> 29) << 29) + i5));
        m3971x(abstractC2470r);
    }

    @Override // p160f3.AbstractC2099B
    /* JADX INFO: renamed from: b */
    public final void mo3877b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7075j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC2132e0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C2149n) {
                return;
            }
            if (!(obj instanceof C2147m)) {
                cancellationException2 = cancellationException;
                C2147m c2147m = new C2147m(obj, (C2131e) null, (InterfaceC1604f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2147m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C2147m c2147m2 = (C2147m) obj;
            if (c2147m2.f7089e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C2147m c2147mM3974a = C2147m.m3974a(c2147m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2147mM3974a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            C2131e c2131e = c2147m2.f7086b;
            if (c2131e != null) {
                m3962l(c2131e, cancellationException);
            }
            InterfaceC1604f interfaceC1604f = c2147m2.f7087c;
            if (interfaceC1604f != null) {
                m3963m(interfaceC1604f, cancellationException, c2147m2.f7085a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // p160f3.AbstractC2099B
    /* JADX INFO: renamed from: c */
    public final InterfaceC1046d mo3878c() {
        return this.f7077g;
    }

    @Override // p084Q2.InterfaceC1179d
    /* JADX INFO: renamed from: d */
    public final InterfaceC1179d mo2123d() {
        InterfaceC1046d interfaceC1046d = this.f7077g;
        if (interfaceC1046d instanceof InterfaceC1179d) {
            return (InterfaceC1179d) interfaceC1046d;
        }
        return null;
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i mo275e() {
        return this.f7078h;
    }

    @Override // p160f3.AbstractC2099B
    /* JADX INFO: renamed from: f */
    public final Throwable mo3879f(Object obj) {
        Throwable thMo3879f = super.mo3879f(obj);
        if (thMo3879f != null) {
            return thMo3879f;
        }
        return null;
    }

    @Override // p160f3.AbstractC2099B
    /* JADX INFO: renamed from: g */
    public final Object mo3880g(Object obj) {
        return obj instanceof C2147m ? ((C2147m) obj).f7085a : obj;
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: i */
    public final void mo278i(Object obj) {
        Throwable thM1902a = AbstractC0885k.m1902a(obj);
        if (thM1902a != null) {
            obj = new C2149n(thM1902a, false);
        }
        m3959D(obj, this.f7028f, null);
    }

    @Override // p160f3.AbstractC2099B
    /* JADX INFO: renamed from: j */
    public final Object mo3882j() {
        return f7075j.get(this);
    }

    @Override // p160f3.InterfaceC2133f
    /* JADX INFO: renamed from: k */
    public final boolean mo3952k(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7075j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC2132e0)) {
                return false;
            }
            C2137h c2137h = new C2137h(this, th, (obj instanceof C2131e) || (obj instanceof AbstractC2470r));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2137h)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC2132e0 interfaceC2132e0 = (InterfaceC2132e0) obj;
            if (interfaceC2132e0 instanceof C2131e) {
                m3962l((C2131e) obj, th);
            } else if (interfaceC2132e0 instanceof AbstractC2470r) {
                m3964n((AbstractC2470r) obj, th);
            }
            if (!m3972y()) {
                m3965o();
            }
            m3966p(this.f7028f);
            return true;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3962l(C2131e c2131e, Throwable th) {
        try {
            switch (c2131e.f7072a) {
                case 0:
                    ((InterfaceC1601c) c2131e.f7073b).mo1h(th);
                    break;
                default:
                    ((InterfaceC2101D) c2131e.f7073b).mo3883a();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC2162v.m3990l(this.f7078h, new C0330q("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3963m(InterfaceC1604f interfaceC1604f, Throwable th, Object obj) {
        InterfaceC1051i interfaceC1051i = this.f7078h;
        try {
            interfaceC1604f.mo5f(th, obj, interfaceC1051i);
        } catch (Throwable th2) {
            AbstractC2162v.m3990l(interfaceC1051i, new C0330q("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m3964n(AbstractC2470r abstractC2470r, Throwable th) {
        InterfaceC1051i interfaceC1051i = this.f7078h;
        int i5 = f7074i.get(this) & 536870911;
        if (i5 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC2470r.mo4103g(i5, interfaceC1051i);
        } catch (Throwable th2) {
            AbstractC2162v.m3990l(interfaceC1051i, new C0330q("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3965o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7076k;
        InterfaceC2101D interfaceC2101D = (InterfaceC2101D) atomicReferenceFieldUpdater.get(this);
        if (interfaceC2101D == null) {
            return;
        }
        interfaceC2101D.mo3883a();
        atomicReferenceFieldUpdater.set(this, C2130d0.f7071d);
    }

    /* JADX INFO: renamed from: p */
    public final void m3966p(int i5) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        do {
            atomicIntegerFieldUpdater = f7074i;
            i6 = atomicIntegerFieldUpdater.get(this);
            int i7 = i6 >> 29;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z5 = i5 == 4;
                InterfaceC1046d interfaceC1046d = this.f7077g;
                if (!z5 && (interfaceC1046d instanceof C2458f)) {
                    boolean z6 = i5 == 1 || i5 == 2;
                    int i8 = this.f7028f;
                    if (z6 == (i8 == 1 || i8 == 2)) {
                        C2458f c2458f = (C2458f) interfaceC1046d;
                        AbstractC2153p abstractC2153p = c2458f.f7930g;
                        InterfaceC1051i interfaceC1051iMo275e = c2458f.f7931h.mo275e();
                        if (abstractC2153p.mo3975E(interfaceC1051iMo275e)) {
                            abstractC2153p.mo1207D(interfaceC1051iMo275e, this);
                            return;
                        }
                        AbstractC2109L abstractC2109LM3973a = AbstractC2144k0.m3973a();
                        if (abstractC2109LM3973a.f7043f >= 4294967296L) {
                            abstractC2109LM3973a.m3899H(this);
                            return;
                        }
                        abstractC2109LM3973a.m3901J(true);
                        try {
                            AbstractC2162v.m3996r(this, interfaceC1046d, true);
                            do {
                            } while (abstractC2109LM3973a.m3902L());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC2162v.m3996r(this, interfaceC1046d, z5);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, 1073741824 + (536870911 & i6)));
    }

    /* JADX INFO: renamed from: q */
    public Throwable mo3915q(C2122Z c2122z) {
        return c2122z.mo3907n();
    }

    /* JADX INFO: renamed from: r */
    public final Object m3967r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        InterfaceC2115S interfaceC2115S;
        boolean zM3972y = m3972y();
        do {
            atomicIntegerFieldUpdater = f7074i;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i6 = i5 >> 29;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM3972y) {
                    m3957B();
                }
                Object obj = f7075j.get(this);
                if (obj instanceof C2149n) {
                    throw ((C2149n) obj).f7092a;
                }
                int i7 = this.f7028f;
                if ((i7 != 1 && i7 != 2) || (interfaceC2115S = (InterfaceC2115S) this.f7078h.mo1166C(C2155q.f7102e)) == null || interfaceC2115S.mo3904b()) {
                    return mo3880g(obj);
                }
                CancellationException cancellationExceptionMo3907n = interfaceC2115S.mo3907n();
                mo3877b(cancellationExceptionMo3907n);
                throw cancellationExceptionMo3907n;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 536870912 + (536870911 & i5)));
        if (((InterfaceC2101D) f7076k.get(this)) == null) {
            m3969u();
        }
        if (zM3972y) {
            m3957B();
        }
        return EnumC1152a.f3788d;
    }

    @Override // p160f3.InterfaceC2133f
    /* JADX INFO: renamed from: s */
    public final C1753n mo3953s(Object obj, InterfaceC1604f interfaceC1604f) {
        C1753n c1753n = AbstractC2162v.f7110a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7075j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC2132e0)) {
                return null;
            }
            Object objM3955F = m3955F((InterfaceC2132e0) obj2, obj, this.f7028f, interfaceC1604f);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM3955F)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!m3972y()) {
                m3965o();
            }
            return c1753n;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m3968t() {
        InterfaceC2101D interfaceC2101DM3969u = m3969u();
        if (interfaceC2101DM3969u == null || (f7075j.get(this) instanceof InterfaceC2132e0)) {
            return;
        }
        interfaceC2101DM3969u.mo3883a();
        f7076k.set(this, C2130d0.f7071d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo3914A());
        sb.append('(');
        sb.append(AbstractC2162v.m3998t(this.f7077g));
        sb.append("){");
        Object obj = f7075j.get(this);
        sb.append(obj instanceof InterfaceC2132e0 ? "Active" : obj instanceof C2137h ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC2162v.m3987i(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC2101D m3969u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC2115S interfaceC2115S = (InterfaceC2115S) this.f7078h.mo1166C(C2155q.f7102e);
        if (interfaceC2115S == null) {
            return null;
        }
        InterfaceC2101D interfaceC2101DM3991m = AbstractC2162v.m3991m(interfaceC2115S, true, new C2139i(this, 0));
        do {
            atomicReferenceFieldUpdater = f7076k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC2101DM3991m)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC2101DM3991m;
    }

    @Override // p160f3.InterfaceC2133f
    /* JADX INFO: renamed from: v */
    public final void mo3954v(Object obj) {
        m3966p(this.f7028f);
    }

    /* JADX INFO: renamed from: w */
    public final void m3970w(InterfaceC1601c interfaceC1601c) {
        m3971x(new C2131e(0, interfaceC1601c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        m3956z(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3971x(p160f3.InterfaceC2132e0 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p160f3.C2135g.f7075j
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof p160f3.C2125b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto L97
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof p160f3.C2131e
            r3 = 0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof p190k3.AbstractC2470r
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof p160f3.C2149n
            if (r1 == 0) goto L4d
            r0 = r2
            f3.n r0 = (p160f3.C2149n) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p160f3.C2149n.f7091b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof p160f3.C2137h
            if (r1 == 0) goto L97
            java.lang.Throwable r0 = r0.f7092a
            boolean r1 = r8 instanceof p160f3.C2131e
            if (r1 == 0) goto L43
            f3.e r8 = (p160f3.C2131e) r8
            r7.m3962l(r8, r0)
            return
        L43:
            k3.r r8 = (p190k3.AbstractC2470r) r8
            r7.m3964n(r8, r0)
            return
        L49:
            m3956z(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof p160f3.C2147m
            if (r1 == 0) goto L80
            r1 = r2
            f3.m r1 = (p160f3.C2147m) r1
            f3.e r4 = r1.f7086b
            if (r4 != 0) goto L7c
            boolean r4 = r8 instanceof p190k3.AbstractC2470r
            if (r4 == 0) goto L5d
            goto L97
        L5d:
            r4 = r8
            f3.e r4 = (p160f3.C2131e) r4
            java.lang.Throwable r5 = r1.f7089e
            if (r5 == 0) goto L68
            r7.m3962l(r4, r5)
            return
        L68:
            r5 = 29
            f3.m r1 = p160f3.C2147m.m3974a(r1, r4, r3, r5)
        L6e:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L75
            goto L97
        L75:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L6e
            goto L0
        L7c:
            m3956z(r8, r2)
            throw r3
        L80:
            boolean r1 = r8 instanceof p190k3.AbstractC2470r
            if (r1 == 0) goto L85
            goto L97
        L85:
            r3 = r8
            f3.e r3 = (p160f3.C2131e) r3
            f3.m r1 = new f3.m
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L91:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L98
        L97:
            return
        L98:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L91
            goto L0
        La0:
            m3956z(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p160f3.C2135g.m3971x(f3.e0):void");
    }

    /* JADX INFO: renamed from: y */
    public final boolean m3972y() {
        if (this.f7028f != 2) {
            return false;
        }
        InterfaceC1046d interfaceC1046d = this.f7077g;
        AbstractC1665j.m2983c(interfaceC1046d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return C2458f.f7929k.get((C2458f) interfaceC1046d) != null;
    }
}
