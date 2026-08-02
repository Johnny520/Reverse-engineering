package defpackage;

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
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(r21.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(r21.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r21(boolean z) {
        this._state$volatile = z ? eu.k : eu.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:7:0x0014 */
    public static ns W(oc1 oc1Var) {
        while (oc1Var.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = oc1.i;
            oc1 oc1VarF = oc1Var.f();
            if (oc1VarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(oc1Var);
                while (true) {
                    oc1Var = (oc1) obj;
                    if (!oc1Var.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(oc1Var);
                }
            } else {
                oc1Var = oc1VarF;
            }
        }
        while (true) {
            oc1Var = oc1Var.h();
            if (!oc1Var.i()) {
                if (oc1Var instanceof ns) {
                    return (ns) oc1Var;
                }
                if (oc1Var instanceof bo1) {
                    return null;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d0(Object obj) {
        if (!(obj instanceof q21)) {
            return obj instanceof cy0 ? ((cy0) obj).b() ? "Active" : "New" : obj instanceof ov ? "Cancelled" : "Completed";
        }
        q21 q21Var = (q21) obj;
        return q21Var.e() ? "Cancelling" : q21.i.get(q21Var) == 1 ? "Completing" : "Active";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k21
    public final Object A(u00 u00Var) {
        Object obj;
        a83 a83Var;
        do {
            obj = h.get(this);
            boolean z = obj instanceof cy0;
            a83Var = a83.a;
            if (!z) {
                xe1.n(u00Var.f());
                return a83Var;
            }
        } while (c0(obj) < 0);
        int i2 = 1;
        mp mpVar = new mp(1, gf1.z(u00Var));
        mpVar.u();
        mpVar.x(new hp(i2, xe1.H(this, true, new ls(mpVar, i2))));
        Object objT = mpVar.t();
        k20 k20Var = k20.h;
        if (objT != k20Var) {
            objT = a83Var;
        }
        return objT == k20Var ? objT : a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k21
    public final ca0 B(boolean z, boolean z2, e2 e2Var) {
        return R(z2, z ? new e21(e2Var) : new fa0(1, e2Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void D(CancellationException cancellationException) {
        z(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean E(Throwable th) {
        if (S()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ms msVar = (ms) i.get(this);
        return (msVar == null || msVar == go1.h) ? z : msVar.c(th) || z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String F() {
        return "Job was cancelled";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean G(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return z(th) && L();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(cy0 cy0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        ms msVar = (ms) atomicReferenceFieldUpdater.get(this);
        if (msVar != null) {
            msVar.a();
            atomicReferenceFieldUpdater.set(this, go1.h);
        }
        pv pvVar = null;
        ov ovVar = obj instanceof ov ? (ov) obj : null;
        Throwable th = ovVar != null ? ovVar.a : null;
        if (cy0Var instanceof n21) {
            try {
                ((n21) cy0Var).l(th);
                return;
            } catch (Throwable th2) {
                P(new pv("Exception in completion handler " + cy0Var + " for " + this, th2));
                return;
            }
        }
        bo1 bo1VarD = cy0Var.d();
        if (bo1VarD != null) {
            bo1VarD.e(new qb1(1), 1);
            Object obj2 = oc1.h.get(bo1VarD);
            obj2.getClass();
            for (oc1 oc1VarH = (oc1) obj2; !oc1VarH.equals(bo1VarD); oc1VarH = oc1VarH.h()) {
                if (oc1VarH instanceof n21) {
                    try {
                        ((n21) oc1VarH).l(th);
                    } catch (Throwable th3) {
                        if (pvVar != null) {
                            fg1.m(pvVar, th3);
                        } else {
                            pvVar = new pv("Exception in completion handler " + oc1VarH + " for " + this, th3);
                        }
                    }
                }
            }
            if (pvVar != null) {
                P(pvVar);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Throwable I(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        r21 r21Var = (r21) obj;
        Object obj2 = h.get(r21Var);
        if (obj2 instanceof q21) {
            thC = ((q21) obj2).c();
        } else if (obj2 instanceof ov) {
            thC = ((ov) obj2).a;
        } else {
            if (obj2 instanceof cy0) {
                c80.u("Cannot be cancelling child in this state: ", obj2);
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new l21("Parent job is ".concat(d0(obj2)), thC, r21Var) : cancellationException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object J(q21 q21Var, Object obj) {
        Throwable thK;
        ov ovVar = obj instanceof ov ? (ov) obj : null;
        Throwable th = ovVar != null ? ovVar.a : null;
        synchronized (q21Var) {
            q21Var.e();
            ArrayList<Throwable> arrayListF = q21Var.f(th);
            thK = K(q21Var, arrayListF);
            if (thK != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th2 : arrayListF) {
                    if (th2 != thK && th2 != thK && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        fg1.m(thK, th2);
                    }
                }
            }
        }
        if (thK != null && thK != th) {
            obj = new ov(thK, false);
        }
        if (thK != null && (E(thK) || O(thK))) {
            obj.getClass();
            ov.b.compareAndSet((ov) obj, 0, 1);
        }
        Y(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        Object dy0Var = obj instanceof cy0 ? new dy0((cy0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, q21Var, dy0Var) && atomicReferenceFieldUpdater.get(this) == q21Var) {
        }
        H(q21Var, obj);
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Throwable K(q21 q21Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (q21Var.e()) {
                return new l21(F(), null, this);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean L() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean M() {
        return this instanceof hv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final bo1 N(cy0 cy0Var) {
        bo1 bo1VarD = cy0Var.d();
        if (bo1VarD != null) {
            return bo1VarD;
        }
        if (cy0Var instanceof xd0) {
            return new bo1();
        }
        if (cy0Var instanceof n21) {
            b0((n21) cy0Var);
            return null;
        }
        c80.u("State should have list: ", cy0Var);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean O(Throwable th) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q(k21 k21Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        go1 go1Var = go1.h;
        if (k21Var == null) {
            atomicReferenceFieldUpdater.set(this, go1Var);
            return;
        }
        k21Var.start();
        ms msVarJ = k21Var.j(this);
        atomicReferenceFieldUpdater.set(this, msVarJ);
        if (h.get(this) instanceof cy0) {
            return;
        }
        msVarJ.a();
        atomicReferenceFieldUpdater.set(this, go1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ca0 R(boolean z, n21 n21Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        go1 go1Var;
        boolean z2;
        boolean zE;
        n21Var.k = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof xd0;
            go1Var = go1.h;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof cy0)) {
                    z2 = false;
                    break;
                }
                cy0 cy0Var = (cy0) obj;
                bo1 bo1VarD = cy0Var.d();
                if (bo1VarD == null) {
                    b0((n21) obj);
                } else {
                    if (n21Var.k()) {
                        q21 q21Var = cy0Var instanceof q21 ? (q21) cy0Var : null;
                        Throwable thC = q21Var != null ? q21Var.c() : null;
                        if (thC == null) {
                            zE = bo1VarD.e(n21Var, 5);
                        } else if (z) {
                            n21Var.l(thC);
                            return go1Var;
                        }
                    } else {
                        zE = bo1VarD.e(n21Var, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                xd0 xd0Var = (xd0) obj;
                if (xd0Var.h) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n21Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                a0(xd0Var);
            }
        }
        if (z2) {
            return n21Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            ov ovVar = obj2 instanceof ov ? (ov) obj2 : null;
            n21Var.l(ovVar != null ? ovVar.a : null);
        }
        return go1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean S() {
        return this instanceof gl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean T(Object obj) {
        Object objE0;
        do {
            objE0 = e0(h.get(this), obj);
            if (objE0 == eu.e) {
                return false;
            }
            if (objE0 == eu.f) {
                return true;
            }
        } while (objE0 == eu.g);
        x(objE0);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object U(Object obj) {
        Object objE0;
        do {
            objE0 = e0(h.get(this), obj);
            if (objE0 == eu.e) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                ov ovVar = obj instanceof ov ? (ov) obj : null;
                throw new IllegalStateException(str, ovVar != null ? ovVar.a : null);
            }
        } while (objE0 == eu.g);
        return objE0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String V() {
        return getClass().getSimpleName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X(bo1 bo1Var, Throwable th) {
        bo1Var.e(new qb1(4), 4);
        Object obj = oc1.h.get(bo1Var);
        obj.getClass();
        pv pvVar = null;
        for (oc1 oc1VarH = (oc1) obj; !oc1VarH.equals(bo1Var); oc1VarH = oc1VarH.h()) {
            if ((oc1VarH instanceof n21) && ((n21) oc1VarH).k()) {
                try {
                    ((n21) oc1VarH).l(th);
                } catch (Throwable th2) {
                    if (pvVar != null) {
                        fg1.m(pvVar, th2);
                    } else {
                        pvVar = new pv("Exception in completion handler " + oc1VarH + " for " + this, th2);
                    }
                }
            }
        }
        if (pvVar != null) {
            P(pvVar);
        }
        E(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a0(xd0 xd0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        bo1 bo1Var = new bo1();
        Object ay0Var = bo1Var;
        if (!xd0Var.h) {
            ay0Var = new ay0(bo1Var);
        }
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, xd0Var, ay0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == xd0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k21
    public boolean b() {
        Object obj = h.get(this);
        return (obj instanceof cy0) && ((cy0) obj).b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b0(n21 n21Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        bo1 bo1Var = new bo1();
        n21Var.getClass();
        oc1.i.set(bo1Var, n21Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = oc1.h;
        atomicReferenceFieldUpdater2.set(bo1Var, n21Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(n21Var) == n21Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(n21Var, n21Var, bo1Var)) {
                    if (atomicReferenceFieldUpdater2.get(n21Var) != n21Var) {
                        break;
                    }
                }
                bo1Var.g(n21Var);
                break loop0;
            }
            break;
        }
        oc1 oc1VarH = n21Var.h();
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, n21Var, oc1VarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == n21Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k21
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new l21(F(), null, this);
        }
        D(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c0(Object obj) {
        boolean z = obj instanceof xd0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        if (z) {
            if (((xd0) obj).h) {
                return 0;
            }
            xd0 xd0Var = eu.k;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, xd0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Z();
            return 1;
        }
        if (!(obj instanceof ay0)) {
            return 0;
        }
        bo1 bo1Var = ((ay0) obj).h;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bo1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Z();
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object e() throws Throwable {
        Object obj = h.get(this);
        if (obj instanceof cy0) {
            s.l("This job has not completed yet");
            return null;
        }
        if (obj instanceof ov) {
            throw ((ov) obj).a;
        }
        return eu.e0(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object e0(Object obj, Object obj2) {
        if (!(obj instanceof cy0)) {
            return eu.e;
        }
        if (((obj instanceof xd0) || (obj instanceof n21)) && !(obj instanceof ns) && !(obj2 instanceof ov)) {
            cy0 cy0Var = (cy0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object dy0Var = obj2 instanceof cy0 ? new dy0((cy0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, cy0Var, dy0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != cy0Var) {
                    return eu.g;
                }
            }
            Y(obj2);
            H(cy0Var, obj2);
            return obj2;
        }
        cy0 cy0Var2 = (cy0) obj;
        bo1 bo1VarN = N(cy0Var2);
        if (bo1VarN == null) {
            return eu.g;
        }
        q21 q21Var = cy0Var2 instanceof q21 ? (q21) cy0Var2 : null;
        if (q21Var == null) {
            q21Var = new q21(bo1VarN, null);
        }
        synchronized (q21Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = q21.i;
            if (atomicIntegerFieldUpdater.get(q21Var) == 1) {
                return eu.e;
            }
            atomicIntegerFieldUpdater.set(q21Var, 1);
            if (q21Var != cy0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, cy0Var2, q21Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != cy0Var2) {
                        return eu.g;
                    }
                }
            }
            boolean zE = q21Var.e();
            ov ovVar = obj2 instanceof ov ? (ov) obj2 : null;
            if (ovVar != null) {
                q21Var.a(ovVar.a);
            }
            Throwable thC = zE ? null : q21Var.c();
            if (thC != null) {
                X(bo1VarN, thC);
            }
            ns nsVarW = W(bo1VarN);
            if (nsVarW != null && f0(q21Var, nsVarW, obj2)) {
                return eu.f;
            }
            bo1VarN.e(new qb1(2), 2);
            ns nsVarW2 = W(bo1VarN);
            return (nsVarW2 == null || !f0(q21Var, nsVarW2, obj2)) ? J(q21Var, obj2) : eu.f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f0(q21 q21Var, ns nsVar, Object obj) {
        while (xe1.H(nsVar.l, false, new p21(this, q21Var, nsVar, obj)) == go1.h) {
            nsVar = W(nsVar);
            if (nsVar == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y10
    public final z10 getKey() {
        return sn.K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k21
    public final ms j(r21 r21Var) {
        ns nsVar = new ns(r21Var);
        nsVar.k = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof xd0) {
                xd0 xd0Var = (xd0) obj;
                if (xd0Var.h) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nsVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                a0(xd0Var);
            } else {
                boolean z = obj instanceof cy0;
                go1 go1Var = go1.h;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    ov ovVar = obj2 instanceof ov ? (ov) obj2 : null;
                    nsVar.l(ovVar != null ? ovVar.a : null);
                    return go1Var;
                }
                bo1 bo1VarD = ((cy0) obj).d();
                if (bo1VarD == null) {
                    b0((n21) obj);
                } else if (!bo1VarD.e(nsVar, 7)) {
                    boolean zE = bo1VarD.e(nsVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof q21) {
                        thC = ((q21) obj3).c();
                    } else {
                        ov ovVar2 = obj3 instanceof ov ? (ov) obj3 : null;
                        if (ovVar2 != null) {
                            thC = ovVar2.a;
                        }
                    }
                    nsVar.l(thC);
                    if (zE) {
                        break loop0;
                    }
                    return go1Var;
                }
            }
        }
        return nsVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final a20 k(a20 a20Var) {
        return xe1.f0(this, a20Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final y10 o(z10 z10Var) {
        return xe1.u(this, z10Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k21
    public final CancellationException q() {
        CancellationException cancellationException;
        Object obj = h.get(this);
        if (obj instanceof q21) {
            Throwable thC = ((q21) obj).c();
            if (thC == null) {
                c80.u("Job is still new or active: ", this);
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
            return cancellationException == null ? new l21(strConcat, thC, this) : cancellationException;
        }
        if (obj instanceof cy0) {
            c80.u("Job is still new or active: ", this);
            return null;
        }
        if (!(obj instanceof ov)) {
            return new l21(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((ov) obj).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new l21(F(), th, this) : cancellationException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final Object r(mn0 mn0Var, Object obj) {
        return mn0Var.g(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k21
    public final boolean start() {
        int iC0;
        do {
            iC0 = c0(h.get(this));
            if (iC0 == 0) {
                return false;
            }
        } while (iC0 != 1);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k21
    public final ca0 t(in0 in0Var) {
        return R(true, new fa0(1, in0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V() + '{' + d0(h.get(this)) + '}');
        sb.append('@');
        sb.append(p40.x(this));
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final a20 u(z10 z10Var) {
        return xe1.W(this, z10Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void y(Object obj) {
        x(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
  0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(Object obj) {
        hh1 hh1Var;
        Object objE0 = eu.e;
        if (M()) {
            do {
                Object obj2 = h.get(this);
                if (obj2 instanceof cy0) {
                    if (obj2 instanceof q21) {
                        if (q21.i.get((q21) obj2) == 1) {
                        }
                    }
                    objE0 = e0(obj2, new ov(I(obj), false));
                }
                objE0 = eu.e;
                break;
            } while (objE0 == eu.g);
            if (objE0 != eu.f) {
                if (objE0 == eu.e) {
                    Throwable thI = null;
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                        Object obj3 = atomicReferenceFieldUpdater.get(this);
                        if (!(obj3 instanceof q21)) {
                            if (!(obj3 instanceof cy0)) {
                                hh1Var = eu.h;
                                break;
                            }
                            if (thI == null) {
                                thI = I(obj);
                            }
                            cy0 cy0Var = (cy0) obj3;
                            if (cy0Var.b()) {
                                bo1 bo1VarN = N(cy0Var);
                                if (bo1VarN != null) {
                                    q21 q21Var = new q21(bo1VarN, thI);
                                    while (!atomicReferenceFieldUpdater.compareAndSet(this, cy0Var, q21Var)) {
                                        if (atomicReferenceFieldUpdater.get(this) != cy0Var) {
                                            break;
                                        }
                                    }
                                    X(bo1VarN, thI);
                                    hh1Var = eu.e;
                                    break loop1;
                                }
                                continue;
                            } else {
                                Object objE02 = e0(obj3, new ov(thI, false));
                                if (objE02 == eu.e) {
                                    c80.u("Cannot happen in ", obj3);
                                    return false;
                                }
                                if (objE02 != eu.g) {
                                    objE0 = objE02;
                                    break;
                                }
                            }
                        } else {
                            synchronized (obj3) {
                                if (q21.k.get((q21) obj3) == eu.i) {
                                    hh1Var = eu.h;
                                } else {
                                    boolean zE = ((q21) obj3).e();
                                    if (thI == null) {
                                        thI = I(obj);
                                    }
                                    ((q21) obj3).a(thI);
                                    Throwable thC = zE ? null : ((q21) obj3).c();
                                    if (thC != null) {
                                        X(((q21) obj3).h, thC);
                                    }
                                    hh1Var = eu.e;
                                }
                            }
                        }
                    }
                }
                if (objE0 != eu.e && objE0 != eu.f) {
                    if (objE0 == eu.h) {
                        return false;
                    }
                    x(objE0);
                    return true;
                }
            }
        }
        return true;
    }

    public void Z() {
    }

    public void P(pv pvVar) {
        throw pvVar;
    }

    public void Y(Object obj) {
    }

    public void x(Object obj) {
    }
}
