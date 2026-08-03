package p249qg;

import af.C0081d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okio.C3193a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p136j8.C2104o;
import p162l3.C2463q;
import p276sf.C3960g;
import p352xf.EnumC5799a;
import p370yf.InterfaceC6039d;
import vg.AbstractC4552a;
import vg.AbstractC4568q;
import vg.C4557f;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: qg.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3564g extends AbstractC3550b0 implements InterfaceC3561f, InterfaceC6039d, InterfaceC3590o1 {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11563l = AtomicIntegerFieldUpdater.newUpdater(C3564g.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11564m = AtomicReferenceFieldUpdater.newUpdater(C3564g.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11565n = AtomicReferenceFieldUpdater.newUpdater(C3564g.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5557c f11566j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5561g f11567k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3564g(int i9, InterfaceC5557c interfaceC5557c) {
        super(i9);
        this.f11566j = interfaceC5557c;
        this.f11567k = interfaceC5557c.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C3549b.f11550a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static Object m7502C(InterfaceC3557d1 interfaceC3557d1, Object obj, int i9, InterfaceC1236q interfaceC1236q) {
        if (obj instanceof C3585n) {
            return obj;
        }
        if (i9 != 1 && i9 != 2) {
            return obj;
        }
        if (interfaceC1236q != null || (interfaceC3557d1 instanceof C3558e)) {
            return new C3582m(obj, interfaceC3557d1 instanceof C3558e ? (C3558e) interfaceC3557d1 : null, interfaceC1236q, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static void m7503u(InterfaceC3557d1 interfaceC3557d1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC3557d1 + ", already has " + obj).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3561f
    /* JADX INFO: renamed from: A */
    public final void mo7498A(Object obj) {
        m7510m(this.f11551i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m7504B(AbstractC3591p abstractC3591p, Object obj) {
        InterfaceC5557c interfaceC5557c = this.f11566j;
        C4557f c4557f = interfaceC5557c instanceof C4557f ? (C4557f) interfaceC5557c : null;
        m7521z(obj, (c4557f != null ? c4557f.f15026j : null) == abstractC3591p ? 4 : this.f11551i, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3590o1
    /* JADX INFO: renamed from: a */
    public final void mo7505a(AbstractC4568q abstractC4568q, int i9) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f11563l;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                C2104o.m5276A("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i9));
        m7516s(abstractC4568q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3550b0
    /* JADX INFO: renamed from: b */
    public final void mo7479b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11564m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC3557d1) {
                C2104o.m5276A("Not completed");
                return;
            }
            if (obj instanceof C3585n) {
                return;
            }
            if (!(obj instanceof C3582m)) {
                cancellationException2 = cancellationException;
                C3582m c3582m = new C3582m(obj, (C3558e) null, (InterfaceC1236q) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3582m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C3582m c3582m2 = (C3582m) obj;
            if (c3582m2.f11596e != null) {
                C2104o.m5276A("Must be called at most once");
                return;
            }
            C3582m c3582mM7539a = C3582m.m7539a(c3582m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3582mM7539a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            C3558e c3558e = c3582m2.f11593b;
            if (c3558e != null) {
                m7506h(c3558e, cancellationException);
            }
            InterfaceC1236q interfaceC1236q = c3582m2.f11594c;
            if (interfaceC1236q != null) {
                m7507i(interfaceC1236q, cancellationException, c3582m2.f11592a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3550b0
    /* JADX INFO: renamed from: c */
    public final InterfaceC5557c mo7480c() {
        return this.f11566j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3550b0
    /* JADX INFO: renamed from: d */
    public final Throwable mo7481d(Object obj) {
        Throwable thMo7481d = super.mo7481d(obj);
        if (thMo7481d != null) {
            return thMo7481d;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3550b0
    /* JADX INFO: renamed from: e */
    public final Object mo7482e(Object obj) {
        return obj instanceof C3582m ? ((C3582m) obj).f11592a : obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3550b0
    /* JADX INFO: renamed from: g */
    public final Object mo7484g() {
        return f11564m.get(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.InterfaceC6039d
    public final InterfaceC6039d getCallerFrame() {
        InterfaceC5557c interfaceC5557c = this.f11566j;
        if (interfaceC5557c instanceof InterfaceC6039d) {
            return (InterfaceC6039d) interfaceC5557c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final InterfaceC5561g getContext() {
        return this.f11567k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m7506h(C3558e c3558e, Throwable th2) {
        try {
            switch (c3558e.f11558a) {
                case 0:
                    ((InterfaceC1231l) c3558e.f11559b).invoke(th2);
                    break;
                default:
                    ((InterfaceC3556d0) c3558e.f11559b).mo7492a();
                    break;
            }
        } catch (Throwable th3) {
            AbstractC3603v.m7559m(new C0081d("Exception in invokeOnCancellation handler for " + this, th3), this.f11567k);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m7507i(InterfaceC1236q interfaceC1236q, Throwable th2, Object obj) {
        InterfaceC5561g interfaceC5561g = this.f11567k;
        try {
            interfaceC1236q.mo734b(th2, obj, interfaceC5561g);
        } catch (Throwable th3) {
            AbstractC3603v.m7559m(new C0081d("Exception in resume onCancellation handler for " + this, th3), interfaceC5561g);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3561f
    /* JADX INFO: renamed from: j */
    public final C2463q mo7499j(Object obj, InterfaceC1236q interfaceC1236q) {
        C2463q c2463q = AbstractC3603v.f11619a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11564m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC3557d1)) {
                return null;
            }
            Object objM7502C = m7502C((InterfaceC3557d1) obj2, obj, this.f11551i, interfaceC1236q);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM7502C)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!m7517t()) {
                m7509l();
            }
            return c2463q;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m7508k(AbstractC4568q abstractC4568q, Throwable th2) {
        InterfaceC5561g interfaceC5561g = this.f11567k;
        int i9 = f11563l.get(this) & 536870911;
        if (i9 == 536870911) {
            C2104o.m5276A("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            abstractC4568q.mo8220g(i9, interfaceC5561g);
        } catch (Throwable th3) {
            AbstractC3603v.m7559m(new C0081d("Exception in invokeOnCancellation handler for " + this, th3), interfaceC5561g);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m7509l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11565n;
        InterfaceC3556d0 interfaceC3556d0 = (InterfaceC3556d0) atomicReferenceFieldUpdater.get(this);
        if (interfaceC3556d0 == null) {
            return;
        }
        interfaceC3556d0.mo7492a();
        atomicReferenceFieldUpdater.set(this, C3554c1.f11556g);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m7510m(int i9) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f11563l;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 1) {
                    C2104o.m5276A("Already resumed");
                    return;
                }
                boolean z9 = i9 == 4;
                InterfaceC5557c interfaceC5557c = this.f11566j;
                if (!z9 && (interfaceC5557c instanceof C4557f)) {
                    boolean z10 = i9 == 1 || i9 == 2;
                    int i12 = this.f11551i;
                    if (z10 == (i12 == 1 || i12 == 2)) {
                        C4557f c4557f = (C4557f) interfaceC5557c;
                        AbstractC3591p abstractC3591p = c4557f.f15026j;
                        InterfaceC5561g context = c4557f.f15027k.getContext();
                        if (abstractC3591p.mo7542x(context)) {
                            abstractC3591p.mo7538w(context, this);
                            return;
                        }
                        AbstractC3565g0 abstractC3565g0M7527a = AbstractC3569h1.m7527a();
                        if (abstractC3565g0M7527a.f11569i >= 4294967296L) {
                            abstractC3565g0M7527a.m7522A(this);
                            return;
                        }
                        abstractC3565g0M7527a.m7523B(true);
                        try {
                            AbstractC3603v.m7565s(this, interfaceC5557c, true);
                            do {
                            } while (abstractC3565g0M7527a.m7525D());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC3603v.m7565s(this, interfaceC5557c, z9);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public Throwable mo7511n(C3610y0 c3610y0) {
        return c3610y0.mo7489h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final Object m7512o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        InterfaceC3596r0 interfaceC3596r0;
        boolean zM7517t = m7517t();
        do {
            atomicIntegerFieldUpdater = f11563l;
            i9 = atomicIntegerFieldUpdater.get(this);
            int i10 = i9 >> 29;
            if (i10 != 0) {
                if (i10 != 2) {
                    C2104o.m5276A("Already suspended");
                    return null;
                }
                if (zM7517t) {
                    m7519x();
                }
                Object obj = f11564m.get(this);
                if (obj instanceof C3585n) {
                    throw ((C3585n) obj).f11599a;
                }
                int i11 = this.f11551i;
                if ((i11 != 1 && i11 != 2) || (interfaceC3596r0 = (InterfaceC3596r0) this.f11567k.mo2062s(C3593q.f11607h)) == null || interfaceC3596r0.mo7486b()) {
                    return mo7482e(obj);
                }
                CancellationException cancellationExceptionMo7489h = interfaceC3596r0.mo7489h();
                mo7479b(cancellationExceptionMo7489h);
                throw cancellationExceptionMo7489h;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 536870912 + (536870911 & i9)));
        if (((InterfaceC3556d0) f11565n.get(this)) == null) {
            m7514q();
        }
        if (zM7517t) {
            m7519x();
        }
        return EnumC5799a.f23547g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m7513p() {
        InterfaceC3556d0 interfaceC3556d0M7514q = m7514q();
        if (interfaceC3556d0M7514q == null || (f11564m.get(this) instanceof InterfaceC3557d1)) {
            return;
        }
        interfaceC3556d0M7514q.mo7492a();
        f11565n.set(this, C3554c1.f11556g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final InterfaceC3556d0 m7514q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) this.f11567k.mo2062s(C3593q.f11607h);
        if (interfaceC3596r0 == null) {
            return null;
        }
        InterfaceC3556d0 interfaceC3556d0M7560n = AbstractC3603v.m7560n(interfaceC3596r0, true, new C3570i(this, 0));
        do {
            atomicReferenceFieldUpdater = f11565n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC3556d0M7560n)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC3556d0M7560n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m7515r(InterfaceC1231l interfaceC1231l) {
        m7516s(new C3558e(interfaceC1231l, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final void resumeWith(Object obj) {
        Throwable thM8182b = C3960g.m8182b(obj);
        if (thM8182b != null) {
            obj = new C3585n(thM8182b, false);
        }
        m7521z(obj, this.f11551i, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        m7503u(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7516s(InterfaceC3557d1 interfaceC3557d1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11564m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C3549b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, interfaceC3557d1)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof C3558e) || (obj instanceof AbstractC4568q)) {
                break;
            }
            if (obj instanceof C3585n) {
                C3585n c3585n = (C3585n) obj;
                if (!C3585n.f11598b.compareAndSet(c3585n, 0, 1)) {
                    m7503u(interfaceC3557d1, obj);
                    throw null;
                }
                if (obj instanceof C3567h) {
                    Throwable th2 = c3585n.f11599a;
                    if (interfaceC3557d1 instanceof C3558e) {
                        m7506h((C3558e) interfaceC3557d1, th2);
                        return;
                    } else {
                        m7508k((AbstractC4568q) interfaceC3557d1, th2);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C3582m)) {
                if (interfaceC3557d1 instanceof AbstractC4568q) {
                    return;
                }
                C3582m c3582m = new C3582m(obj, (C3558e) interfaceC3557d1, (InterfaceC1236q) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3582m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C3582m c3582m2 = (C3582m) obj;
            if (c3582m2.f11593b != null) {
                m7503u(interfaceC3557d1, obj);
                throw null;
            }
            if (interfaceC3557d1 instanceof AbstractC4568q) {
                return;
            }
            C3558e c3558e = (C3558e) interfaceC3557d1;
            Throwable th3 = c3582m2.f11596e;
            if (th3 != null) {
                m7506h(c3558e, th3);
                return;
            }
            C3582m c3582mM7539a = C3582m.m7539a(c3582m2, c3558e, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3582mM7539a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final boolean m7517t() {
        if (this.f11551i == 2) {
            return C4557f.f15025n.get((C4557f) this.f11566j) != null;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo7518v());
        sb2.append('(');
        sb2.append(AbstractC3603v.m7567u(this.f11566j));
        sb2.append("){");
        Object obj = f11564m.get(this);
        sb2.append(obj instanceof InterfaceC3557d1 ? "Active" : obj instanceof C3567h ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(AbstractC3603v.m7556j(this));
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public String mo7518v() {
        return "CancellableContinuation";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3561f
    /* JADX INFO: renamed from: w */
    public final boolean mo7500w(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11564m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC3557d1)) {
                return false;
            }
            C3567h c3567h = new C3567h(this, th2, (obj instanceof C3558e) || (obj instanceof AbstractC4568q));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3567h)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            InterfaceC3557d1 interfaceC3557d1 = (InterfaceC3557d1) obj;
            if (interfaceC3557d1 instanceof C3558e) {
                m7506h((C3558e) obj, th2);
            } else if (interfaceC3557d1 instanceof AbstractC4568q) {
                m7508k((AbstractC4568q) obj, th2);
            }
            if (!m7517t()) {
                m7509l();
            }
            m7510m(this.f11551i);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m7519x() {
        InterfaceC5557c interfaceC5557c = this.f11566j;
        Throwable th2 = null;
        C4557f c4557f = interfaceC5557c instanceof C4557f ? (C4557f) interfaceC5557c : null;
        if (c4557f != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4557f.f15025n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c4557f);
                C2463q c2463q = AbstractC4552a.f15015c;
                if (obj == c2463q) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c4557f, c2463q, this)) {
                        if (atomicReferenceFieldUpdater.get(c4557f) != c2463q) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        C3193a.m6826p(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c4557f, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c4557f) != obj) {
                            C2104o.m5294t("Failed requirement.");
                            return;
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            m7509l();
            mo7500w(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m7520y(Object obj, InterfaceC1236q interfaceC1236q) {
        m7521z(obj, this.f11551i, interfaceC1236q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m7521z(Object obj, int i9, InterfaceC1236q interfaceC1236q) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11564m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC3557d1) {
                Object objM7502C = m7502C((InterfaceC3557d1) obj2, obj, i9, interfaceC1236q);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM7502C)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!m7517t()) {
                    m7509l();
                }
                m7510m(i9);
                return;
            }
            if (obj2 instanceof C3567h) {
                C3567h c3567h = (C3567h) obj2;
                if (C3567h.f11572c.compareAndSet(c3567h, 0, 1)) {
                    if (interfaceC1236q != null) {
                        m7507i(interfaceC1236q, c3567h.f11599a, obj);
                        return;
                    }
                    return;
                }
            }
            C3193a.m6826p(obj, "Already resumed, but proposed with update ");
            return;
        }
    }
}
