package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class mp extends m90 implements lp, l20, gc3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(mp.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(mp.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(mp.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final t00 k;
    public final a20 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mp(int i, t00 t00Var) {
        super(i);
        this.k = t00Var;
        this.l = t00Var.f();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = x4.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void A(ko1 ko1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + ko1Var + ", already has " + obj).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object G(ko1 ko1Var, Object obj, int i, nn0 nn0Var) {
        if (obj instanceof ov) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (nn0Var != null || (ko1Var instanceof ip)) {
            return new mv(obj, ko1Var instanceof ip ? (ip) ko1Var : null, nn0Var, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String B() {
        return "CancellableContinuation";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lp
    public final void C(Object obj) throws j90 {
        r(this.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D() {
        t00 t00Var = this.k;
        Throwable th = null;
        k90 k90Var = t00Var instanceof k90 ? (k90) t00Var : null;
        if (k90Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k90.o;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(k90Var);
                hh1 hh1Var = p40.e;
                if (obj == hh1Var) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(k90Var, hh1Var, this)) {
                        if (atomicReferenceFieldUpdater.get(k90Var) != hh1Var) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        c80.u("Inconsistent state ", obj);
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(k90Var, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(k90Var) != obj) {
                            s.j("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            q();
            n(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(Object obj, int i, nn0 nn0Var) throws j90 {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof ko1) {
                Object objG = G((ko1) obj2, obj, i, nn0Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objG)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!z()) {
                    q();
                }
                r(i);
                return;
            }
            if (obj2 instanceof op) {
                op opVar = (op) obj2;
                if (op.c.compareAndSet(opVar, 0, 1)) {
                    if (nn0Var != null) {
                        o(nn0Var, opVar.a, obj);
                        return;
                    }
                    return;
                }
            }
            c80.u("Already resumed, but proposed with update ", obj);
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F(c20 c20Var) throws j90 {
        t00 t00Var = this.k;
        k90 k90Var = t00Var instanceof k90 ? (k90) t00Var : null;
        E(a83.a, (k90Var != null ? k90Var.k : null) == c20Var ? 4 : this.j, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final hh1 H(Object obj, nn0 nn0Var) {
        hh1 hh1Var = p7.b;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof ko1)) {
                return null;
            }
            Object objG = G((ko1) obj2, obj, this.j, nn0Var);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objG)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!z()) {
                q();
            }
            return hh1Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gc3
    public final void a(lm2 lm2Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = m;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                s.l("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        x(lm2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m90
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof ko1) {
                s.l("Not completed");
                return;
            }
            if (obj instanceof ov) {
                return;
            }
            if (!(obj instanceof mv)) {
                cancellationException2 = cancellationException;
                mv mvVar = new mv(obj, (ip) null, (nn0) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mvVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            mv mvVar2 = (mv) obj;
            if (mvVar2.e != null) {
                s.l("Must be called at most once");
                return;
            }
            mv mvVarA = mv.a(mvVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mvVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            ip ipVar = mvVar2.b;
            if (ipVar != null) {
                m(ipVar, cancellationException);
            }
            nn0 nn0Var = mvVar2.c;
            if (nn0Var != null) {
                o(nn0Var, cancellationException, mvVar2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m90
    public final t00 c() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l20
    public final l20 d() {
        t00 t00Var = this.k;
        if (t00Var instanceof l20) {
            return (l20) t00Var;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m90
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final a20 f() {
        return this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m90
    public final Object g(Object obj) {
        return obj instanceof mv ? ((mv) obj).a : obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t00
    public final void h(Object obj) {
        Throwable thA = y92.a(obj);
        if (thA != null) {
            obj = new ov(thA, false);
        }
        E(obj, this.j, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lp
    public final void i(Object obj, nn0 nn0Var) throws j90 {
        E(obj, this.j, nn0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m90
    public final Object k() {
        return n.get(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lp
    public final hh1 l(Object obj, nn0 nn0Var) {
        return H(obj, nn0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(ip ipVar, Throwable th) {
        try {
            ipVar.a(th);
        } catch (Throwable th2) {
            se.M(this.l, new pv("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lp
    public final boolean n(Throwable th) throws j90 {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof ko1)) {
                return false;
            }
            boolean z = (obj instanceof ip) || (obj instanceof lm2);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            op opVar = new op(cancellationException, z);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, opVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ko1 ko1Var = (ko1) obj;
            if (ko1Var instanceof ip) {
                m((ip) obj, th);
            } else if (ko1Var instanceof lm2) {
                p((lm2) obj, th);
            }
            if (!z()) {
                q();
            }
            r(this.j);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(nn0 nn0Var, Throwable th, Object obj) {
        a20 a20Var = this.l;
        try {
            nn0Var.e(th, obj, a20Var);
        } catch (Throwable th2) {
            se.M(a20Var, new pv("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(lm2 lm2Var, Throwable th) {
        a20 a20Var = this.l;
        int i = m.get(this) & 536870911;
        if (i == 536870911) {
            s.l("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            lm2Var.h(i, a20Var);
        } catch (Throwable th2) {
            se.M(a20Var, new pv("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
        ca0 ca0Var = (ca0) atomicReferenceFieldUpdater.get(this);
        if (ca0Var == null) {
            return;
        }
        ca0Var.a();
        atomicReferenceFieldUpdater.set(this, go1.h);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(int i) throws j90 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = m;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    s.l("Already resumed");
                    return;
                }
                boolean z = i == 4;
                t00 t00Var = this.k;
                if (!z && (t00Var instanceof k90)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.j;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        k90 k90Var = (k90) t00Var;
                        c20 c20Var = k90Var.k;
                        a20 a20VarF = k90Var.l.f();
                        if (p40.S(c20Var, a20VarF)) {
                            p40.R(c20Var, a20VarF, this);
                            return;
                        }
                        lg0 lg0VarA = a23.a();
                        if (lg0VarA.j >= 4294967296L) {
                            lg0VarA.H(this);
                            return;
                        }
                        lg0VarA.I(true);
                        try {
                            t11.N(this, t00Var, true);
                            do {
                            } while (lg0VarA.K());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                t11.N(this, t00Var, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Throwable s(r21 r21Var) {
        return r21Var.q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object t() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        k21 k21Var;
        boolean z = z();
        do {
            atomicIntegerFieldUpdater = m;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    s.l("Already suspended");
                    return null;
                }
                if (z) {
                    D();
                }
                Object obj = n.get(this);
                if (obj instanceof ov) {
                    throw ((ov) obj).a;
                }
                int i3 = this.j;
                if ((i3 != 1 && i3 != 2) || (k21Var = (k21) this.l.o(sn.K)) == null || k21Var.b()) {
                    return g(obj);
                }
                CancellationException cancellationExceptionQ = k21Var.q();
                b(cancellationExceptionQ);
                throw cancellationExceptionQ;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((ca0) o.get(this)) == null) {
            v();
        }
        if (z) {
            D();
        }
        return k20.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(B());
        sb.append('(');
        sb.append(p40.X(this.k));
        sb.append("){");
        Object obj = n.get(this);
        sb.append(obj instanceof ko1 ? "Active" : obj instanceof op ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(p40.x(this));
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u() {
        ca0 ca0VarV = v();
        if (ca0VarV == null || (n.get(this) instanceof ko1)) {
            return;
        }
        ca0VarV.a();
        o.set(this, go1.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ca0 v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k21 k21Var = (k21) this.l.o(sn.K);
        if (k21Var == null) {
            return null;
        }
        ca0 ca0VarH = xe1.H(k21Var, true, new ls(this, 0));
        do {
            atomicReferenceFieldUpdater = o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, ca0VarH)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return ca0VarH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(in0 in0Var) {
        x(new hp(0, in0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        A(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(ko1 ko1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof x4) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ko1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof ip) || (obj instanceof lm2)) {
                break;
            }
            if (obj instanceof ov) {
                ov ovVar = (ov) obj;
                if (!ov.b.compareAndSet(ovVar, 0, 1)) {
                    A(ko1Var, obj);
                    throw null;
                }
                if (obj instanceof op) {
                    Throwable th = ovVar.a;
                    if (ko1Var instanceof ip) {
                        m((ip) ko1Var, th);
                        return;
                    } else {
                        p((lm2) ko1Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof mv)) {
                if (ko1Var instanceof lm2) {
                    return;
                }
                mv mvVar = new mv(obj, (ip) ko1Var, (nn0) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mvVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            mv mvVar2 = (mv) obj;
            if (mvVar2.b != null) {
                A(ko1Var, obj);
                throw null;
            }
            if (ko1Var instanceof lm2) {
                return;
            }
            ip ipVar = (ip) ko1Var;
            Throwable th2 = mvVar2.e;
            if (th2 != null) {
                m(ipVar, th2);
                return;
            }
            mv mvVarA = mv.a(mvVar2, ipVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mvVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean y() {
        return n.get(this) instanceof ko1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean z() {
        if (this.j == 2) {
            return k90.o.get((k90) this.k) != null;
        }
        return false;
    }
}
