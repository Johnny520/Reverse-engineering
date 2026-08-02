package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: mp */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class C0469mp extends m90 implements InterfaceC0432lp, l20, gc3 {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6739m = AtomicIntegerFieldUpdater.newUpdater(C0469mp.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6740n = AtomicReferenceFieldUpdater.newUpdater(C0469mp.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6741o = AtomicReferenceFieldUpdater.newUpdater(C0469mp.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: k */
    public final t00 f6742k;

    /* JADX INFO: renamed from: l */
    public final a20 f6743l;

    public C0469mp(int i, t00 t00Var) {
        super(i);
        this.f6742k = t00Var;
        this.f6743l = t00Var.mo2508f();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0871x4.f12800a;
    }

    /* JADX INFO: renamed from: A */
    public static void m3137A(ko1 ko1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + ko1Var + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: G */
    public static Object m3138G(ko1 ko1Var, Object obj, int i, nn0 nn0Var) {
        if (obj instanceof C0557ov) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (nn0Var != null || (ko1Var instanceof InterfaceC0321ip)) {
            return new C0475mv(obj, ko1Var instanceof InterfaceC0321ip ? (InterfaceC0321ip) ko1Var : null, nn0Var, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: B */
    public String mo3139B() {
        return "CancellableContinuation";
    }

    @Override // p000.InterfaceC0432lp
    /* JADX INFO: renamed from: C */
    public final void mo2507C(Object obj) throws j90 {
        m3148r(this.f6520j);
    }

    /* JADX INFO: renamed from: D */
    public final void m3140D() {
        t00 t00Var = this.f6742k;
        Throwable th = null;
        k90 k90Var = t00Var instanceof k90 ? (k90) t00Var : null;
        if (k90Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k90.f5403o;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(k90Var);
                hh1 hh1Var = p40.f7969e;
                if (obj == hh1Var) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(k90Var, hh1Var, this)) {
                        if (atomicReferenceFieldUpdater.get(k90Var) != hh1Var) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        c80.m677u("Inconsistent state ", obj);
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(k90Var, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(k90Var) != obj) {
                            C0676s.m4651j("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            m3147q();
            mo2512n(th);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m3141E(Object obj, int i, nn0 nn0Var) throws j90 {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6740n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof ko1) {
                Object objM3138G = m3138G((ko1) obj2, obj, i, nn0Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM3138G)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!m3156z()) {
                    m3147q();
                }
                m3148r(i);
                return;
            }
            if (obj2 instanceof C0551op) {
                C0551op c0551op = (C0551op) obj2;
                if (C0551op.f7753c.compareAndSet(c0551op, 0, 1)) {
                    if (nn0Var != null) {
                        m3145o(nn0Var, c0551op.f7856a, obj);
                        return;
                    }
                    return;
                }
            }
            c80.m677u("Already resumed, but proposed with update ", obj);
            return;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m3142F(c20 c20Var) throws j90 {
        t00 t00Var = this.f6742k;
        k90 k90Var = t00Var instanceof k90 ? (k90) t00Var : null;
        m3141E(a83.f116a, (k90Var != null ? k90Var.f5404k : null) == c20Var ? 4 : this.f6520j, null);
    }

    /* JADX INFO: renamed from: H */
    public final hh1 m3143H(Object obj, nn0 nn0Var) {
        hh1 hh1Var = AbstractC0570p7.f7993b;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6740n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof ko1)) {
                return null;
            }
            Object objM3138G = m3138G((ko1) obj2, obj, this.f6520j, nn0Var);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM3138G)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!m3156z()) {
                m3147q();
            }
            return hh1Var;
        }
    }

    @Override // p000.gc3
    /* JADX INFO: renamed from: a */
    public final void mo1829a(lm2 lm2Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f6739m;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                C0676s.m4653l("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m3154x(lm2Var);
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: b */
    public final void mo3047b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6740n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof ko1) {
                C0676s.m4653l("Not completed");
                return;
            }
            if (obj instanceof C0557ov) {
                return;
            }
            if (!(obj instanceof C0475mv)) {
                cancellationException2 = cancellationException;
                C0475mv c0475mv = new C0475mv(obj, (InterfaceC0321ip) null, (nn0) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0475mv)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0475mv c0475mv2 = (C0475mv) obj;
            if (c0475mv2.f6891e != null) {
                C0676s.m4653l("Must be called at most once");
                return;
            }
            C0475mv c0475mvM3210a = C0475mv.m3210a(c0475mv2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0475mvM3210a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            InterfaceC0321ip interfaceC0321ip = c0475mv2.f6888b;
            if (interfaceC0321ip != null) {
                m3144m(interfaceC0321ip, cancellationException);
            }
            nn0 nn0Var = c0475mv2.f6889c;
            if (nn0Var != null) {
                m3145o(nn0Var, cancellationException, c0475mv2.f6887a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: c */
    public final t00 mo2616c() {
        return this.f6742k;
    }

    @Override // p000.l20
    /* JADX INFO: renamed from: d */
    public final l20 mo2144d() {
        t00 t00Var = this.f6742k;
        if (t00Var instanceof l20) {
            return (l20) t00Var;
        }
        return null;
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: e */
    public final Throwable mo3048e(Object obj) {
        Throwable thMo3048e = super.mo3048e(obj);
        if (thMo3048e != null) {
            return thMo3048e;
        }
        return null;
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: f */
    public final a20 mo2508f() {
        return this.f6743l;
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: g */
    public final Object mo3049g(Object obj) {
        return obj instanceof C0475mv ? ((C0475mv) obj).f6887a : obj;
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: h */
    public final void mo2509h(Object obj) {
        Throwable thM6237a = y92.m6237a(obj);
        if (thM6237a != null) {
            obj = new C0557ov(thM6237a, false);
        }
        m3141E(obj, this.f6520j, null);
    }

    @Override // p000.InterfaceC0432lp
    /* JADX INFO: renamed from: i */
    public final void mo2510i(Object obj, nn0 nn0Var) throws j90 {
        m3141E(obj, this.f6520j, nn0Var);
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: k */
    public final Object mo2617k() {
        return f6740n.get(this);
    }

    @Override // p000.InterfaceC0432lp
    /* JADX INFO: renamed from: l */
    public final hh1 mo2511l(Object obj, nn0 nn0Var) {
        return m3143H(obj, nn0Var);
    }

    /* JADX INFO: renamed from: m */
    public final void m3144m(InterfaceC0321ip interfaceC0321ip, Throwable th) {
        try {
            interfaceC0321ip.mo2226a(th);
        } catch (Throwable th2) {
            AbstractC0691se.m4824M(this.f6743l, new C0594pv("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // p000.InterfaceC0432lp
    /* JADX INFO: renamed from: n */
    public final boolean mo2512n(Throwable th) throws j90 {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6740n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof ko1)) {
                return false;
            }
            boolean z = (obj instanceof InterfaceC0321ip) || (obj instanceof lm2);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C0551op c0551op = new C0551op(cancellationException, z);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0551op)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ko1 ko1Var = (ko1) obj;
            if (ko1Var instanceof InterfaceC0321ip) {
                m3144m((InterfaceC0321ip) obj, th);
            } else if (ko1Var instanceof lm2) {
                m3146p((lm2) obj, th);
            }
            if (!m3156z()) {
                m3147q();
            }
            m3148r(this.f6520j);
            return true;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3145o(nn0 nn0Var, Throwable th, Object obj) {
        a20 a20Var = this.f6743l;
        try {
            nn0Var.mo489e(th, obj, a20Var);
        } catch (Throwable th2) {
            AbstractC0691se.m4824M(a20Var, new C0594pv("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m3146p(lm2 lm2Var, Throwable th) {
        a20 a20Var = this.f6743l;
        int i = f6739m.get(this) & 536870911;
        if (i == 536870911) {
            C0676s.m4653l("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            lm2Var.mo2007h(i, a20Var);
        } catch (Throwable th2) {
            AbstractC0691se.m4824M(a20Var, new C0594pv("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3147q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6741o;
        ca0 ca0Var = (ca0) atomicReferenceFieldUpdater.get(this);
        if (ca0Var == null) {
            return;
        }
        ca0Var.mo717a();
        atomicReferenceFieldUpdater.set(this, go1.f3642h);
    }

    /* JADX INFO: renamed from: r */
    public final void m3148r(int i) throws j90 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f6739m;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    C0676s.m4653l("Already resumed");
                    return;
                }
                boolean z = i == 4;
                t00 t00Var = this.f6742k;
                if (!z && (t00Var instanceof k90)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f6520j;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        k90 k90Var = (k90) t00Var;
                        c20 c20Var = k90Var.f5404k;
                        a20 a20VarMo2508f = k90Var.f5405l.mo2508f();
                        if (p40.m3708S(c20Var, a20VarMo2508f)) {
                            p40.m3707R(c20Var, a20VarMo2508f, this);
                            return;
                        }
                        lg0 lg0VarM20a = a23.m20a();
                        if (lg0VarM20a.f6107j >= 4294967296L) {
                            lg0VarM20a.m2905H(this);
                            return;
                        }
                        lg0VarM20a.m2906I(true);
                        try {
                            t11.m5062N(this, t00Var, true);
                            do {
                            } while (lg0VarM20a.m2908K());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                t11.m5062N(this, t00Var, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: s */
    public Throwable mo3149s(r21 r21Var) {
        return r21Var.mo1706q();
    }

    /* JADX INFO: renamed from: t */
    public final Object m3150t() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        k21 k21Var;
        boolean zM3156z = m3156z();
        do {
            atomicIntegerFieldUpdater = f6739m;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    C0676s.m4653l("Already suspended");
                    return null;
                }
                if (zM3156z) {
                    m3140D();
                }
                Object obj = f6740n.get(this);
                if (obj instanceof C0557ov) {
                    throw ((C0557ov) obj).f7856a;
                }
                int i3 = this.f6520j;
                if ((i3 != 1 && i3 != 2) || (k21Var = (k21) this.f6743l.mo15o(C0700sn.f10207K)) == null || k21Var.mo1703b()) {
                    return mo3049g(obj);
                }
                CancellationException cancellationExceptionMo1706q = k21Var.mo1706q();
                mo3047b(cancellationExceptionMo1706q);
                throw cancellationExceptionMo1706q;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((ca0) f6741o.get(this)) == null) {
            m3152v();
        }
        if (zM3156z) {
            m3140D();
        }
        return k20.f5323h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo3139B());
        sb.append('(');
        sb.append(p40.m3713X(this.f6742k));
        sb.append("){");
        Object obj = f6740n.get(this);
        sb.append(obj instanceof ko1 ? "Active" : obj instanceof C0551op ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(p40.m3740x(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m3151u() {
        ca0 ca0VarM3152v = m3152v();
        if (ca0VarM3152v == null || (f6740n.get(this) instanceof ko1)) {
            return;
        }
        ca0VarM3152v.mo717a();
        f6741o.set(this, go1.f3642h);
    }

    /* JADX INFO: renamed from: v */
    public final ca0 m3152v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k21 k21Var = (k21) this.f6743l.mo15o(C0700sn.f10207K);
        if (k21Var == null) {
            return null;
        }
        ca0 ca0VarM6090H = xe1.m6090H(k21Var, true, new C0435ls(this, 0));
        do {
            atomicReferenceFieldUpdater = f6741o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, ca0VarM6090H)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return ca0VarM6090H;
    }

    /* JADX INFO: renamed from: w */
    public final void m3153w(in0 in0Var) {
        m3154x(new C0285hp(0, in0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        m3137A(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3154x(ko1 ko1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6740n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0871x4) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ko1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof InterfaceC0321ip) || (obj instanceof lm2)) {
                break;
            }
            if (obj instanceof C0557ov) {
                C0557ov c0557ov = (C0557ov) obj;
                if (!C0557ov.f7855b.compareAndSet(c0557ov, 0, 1)) {
                    m3137A(ko1Var, obj);
                    throw null;
                }
                if (obj instanceof C0551op) {
                    Throwable th = c0557ov.f7856a;
                    if (ko1Var instanceof InterfaceC0321ip) {
                        m3144m((InterfaceC0321ip) ko1Var, th);
                        return;
                    } else {
                        m3146p((lm2) ko1Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0475mv)) {
                if (ko1Var instanceof lm2) {
                    return;
                }
                C0475mv c0475mv = new C0475mv(obj, (InterfaceC0321ip) ko1Var, (nn0) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0475mv)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0475mv c0475mv2 = (C0475mv) obj;
            if (c0475mv2.f6888b != null) {
                m3137A(ko1Var, obj);
                throw null;
            }
            if (ko1Var instanceof lm2) {
                return;
            }
            InterfaceC0321ip interfaceC0321ip = (InterfaceC0321ip) ko1Var;
            Throwable th2 = c0475mv2.f6891e;
            if (th2 != null) {
                m3144m(interfaceC0321ip, th2);
                return;
            }
            C0475mv c0475mvM3210a = C0475mv.m3210a(c0475mv2, interfaceC0321ip, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0475mvM3210a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m3155y() {
        return f6740n.get(this) instanceof ko1;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m3156z() {
        if (this.f6520j == 2) {
            return k90.f5403o.get((k90) this.f6742k) != null;
        }
        return false;
    }
}
