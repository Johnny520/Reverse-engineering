package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class j40 implements c40 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2716d = AtomicReferenceFieldUpdater.newUpdater(j40.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2717e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f2718f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ long f2719g;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Unsafe unsafe = uw0.f6315a;
        f2719g = unsafe.objectFieldOffset(j40.class.getDeclaredField("_state$volatile"));
        f2717e = AtomicReferenceFieldUpdater.newUpdater(j40.class, Object.class, "_parentHandle$volatile");
        f2718f = unsafe.objectFieldOffset(j40.class.getDeclaredField("_parentHandle$volatile"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j40(boolean z) {
        this._state$volatile = z ? s91.f5716r : s91.f5715q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static C0169ee m1610V(hb0 hb0Var) {
        while (hb0Var.mo1295n()) {
            hb0Var = hb0Var.m1294m();
        }
        while (true) {
            hb0Var = hb0Var.m1293l();
            if (!hb0Var.mo1295n()) {
                if (hb0Var instanceof C0169ee) {
                    return (C0169ee) hb0Var;
                }
                if (hb0Var instanceof sj0) {
                    return null;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static String m1611e0(Object obj) {
        if (!(obj instanceof i40)) {
            return obj instanceof y00 ? ((y00) obj).mo599b() ? "Active" : "New" : obj instanceof C0688rg ? "Cancelled" : "Completed";
        }
        i40 i40Var = (i40) obj;
        return i40Var.m1554f() ? "Cancelling" : i40.f2441e.get(i40Var) != 0 ? "Completing" : "Active";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[PHI: r0
  0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1612A(Object obj) {
        C1014zr c1014zr;
        Object objM1638h0 = s91.f5710l;
        if (mo781K()) {
            do {
                Object objM1622N = m1622N();
                if (objM1622N instanceof y00) {
                    if (objM1622N instanceof i40) {
                        if (i40.f2441e.get((i40) objM1622N) != 0) {
                        }
                    }
                    objM1638h0 = m1638h0(objM1622N, new C0688rg(m1617G(obj), false));
                }
                objM1638h0 = s91.f5710l;
                break;
            } while (objM1638h0 == s91.f5712n);
            if (objM1638h0 != s91.f5711m) {
                if (objM1638h0 == s91.f5710l) {
                    Throwable thM1617G = null;
                    while (true) {
                        Object objM1622N2 = m1622N();
                        if (!(objM1622N2 instanceof i40)) {
                            if (!(objM1622N2 instanceof y00)) {
                                c1014zr = s91.f5713o;
                                break;
                            }
                            if (thM1617G == null) {
                                thM1617G = m1617G(obj);
                            }
                            y00 y00Var = (y00) objM1622N2;
                            if (!y00Var.mo599b()) {
                                Object objM1638h02 = m1638h0(objM1622N2, new C0688rg(thM1617G, false));
                                if (objM1638h02 == s91.f5710l) {
                                    C0921xc.m5130k(objM1622N2, "Cannot happen in ");
                                    return false;
                                }
                                if (objM1638h02 != s91.f5712n) {
                                    objM1638h0 = objM1638h02;
                                    break;
                                }
                            } else if (m1637g0(y00Var, thM1617G)) {
                                c1014zr = s91.f5710l;
                                break;
                            }
                        } else {
                            synchronized (objM1622N2) {
                                if (((i40) objM1622N2).m1552c() == s91.f5714p) {
                                    c1014zr = s91.f5713o;
                                } else {
                                    boolean zM1554f = ((i40) objM1622N2).m1554f();
                                    if (thM1617G == null) {
                                        thM1617G = m1617G(obj);
                                    }
                                    ((i40) objM1622N2).m1551a(thM1617G);
                                    Throwable thM1553e = zM1554f ? null : ((i40) objM1622N2).m1553e();
                                    if (thM1553e != null) {
                                        m1629W(((i40) objM1622N2).f2446d, thM1553e);
                                    }
                                    c1014zr = s91.f5710l;
                                }
                            }
                        }
                    }
                }
                if (objM1638h0 != s91.f5710l && objM1638h0 != s91.f5711m) {
                    if (objM1638h0 == s91.f5713o) {
                        return false;
                    }
                    mo1172y(objM1638h0);
                    return true;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public void mo1613B(CancellationException cancellationException) {
        m1612A(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final boolean m1614C(Throwable th) {
        if (mo1266S()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0126de interfaceC0126deM1621M = m1621M();
        return (interfaceC0126deM1621M == null || interfaceC0126deM1621M == xj0.f7353d) ? z : interfaceC0126deM1621M.mo685c(th) || z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public String mo1615D() {
        return "Job was cancelled";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public boolean mo487E(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m1612A(th) && mo780J();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m1616F(y00 y00Var, Object obj) {
        InterfaceC0126de interfaceC0126deM1621M = m1621M();
        if (interfaceC0126deM1621M != null) {
            interfaceC0126deM1621M.mo623a();
            m1634c0(xj0.f7353d);
        }
        C0725sg c0725sg = null;
        C0688rg c0688rg = obj instanceof C0688rg ? (C0688rg) obj : null;
        Throwable th = c0688rg != null ? c0688rg.f5416a : null;
        if (y00Var instanceof f40) {
            try {
                ((f40) y00Var).mo19s(th);
                return;
            } catch (Throwable th2) {
                mo1624P(new C0725sg("Exception in completion handler " + y00Var + " for " + this, th2));
                return;
            }
        }
        sj0 sj0VarMo600d = y00Var.mo600d();
        if (sj0VarMo600d != null) {
            sj0VarMo600d.m1287e(new xa0(1), 1);
            Object objM1292k = sj0VarMo600d.m1292k();
            objM1292k.getClass();
            for (hb0 hb0VarM1293l = (hb0) objM1292k; !hb0VarM1293l.equals(sj0VarMo600d); hb0VarM1293l = hb0VarM1293l.m1293l()) {
                if (hb0VarM1293l instanceof f40) {
                    try {
                        ((f40) hb0VarM1293l).mo19s(th);
                    } catch (Throwable th3) {
                        if (c0725sg != null) {
                            AbstractC0398kl.m1920f(c0725sg, th3);
                        } else {
                            c0725sg = new C0725sg("Exception in completion handler " + hb0VarM1293l + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0725sg != null) {
                mo1624P(c0725sg);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final Throwable m1617G(Object obj) {
        Throwable thM1553e;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        j40 j40Var = (j40) obj;
        Object objM1622N = j40Var.m1622N();
        if (objM1622N instanceof i40) {
            thM1553e = ((i40) objM1622N).m1553e();
        } else if (objM1622N instanceof C0688rg) {
            thM1553e = ((C0688rg) objM1622N).f5416a;
        } else {
            if (objM1622N instanceof y00) {
                C0921xc.m5130k(objM1622N, "Cannot be cancelling child in this state: ");
                return null;
            }
            thM1553e = null;
        }
        CancellationException cancellationException = thM1553e instanceof CancellationException ? (CancellationException) thM1553e : null;
        return cancellationException == null ? new d40("Parent job is ".concat(m1611e0(objM1622N)), thM1553e, j40Var) : cancellationException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final Object m1618H(i40 i40Var, Object obj) throws Throwable {
        i40 i40Var2;
        Throwable th;
        Throwable thM1619I;
        j40 j40Var;
        i40 i40Var3;
        C0688rg c0688rg = obj instanceof C0688rg ? (C0688rg) obj : null;
        Throwable th2 = c0688rg != null ? c0688rg.f5416a : null;
        synchronized (i40Var) {
            try {
                i40Var.m1554f();
                ArrayList<Throwable> arrayListM1555g = i40Var.m1555g(th2);
                thM1619I = m1619I(i40Var, arrayListM1555g);
                if (thM1619I != null) {
                    try {
                        if (arrayListM1555g.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM1555g.size()));
                            for (Throwable th3 : arrayListM1555g) {
                                if (th3 != thM1619I && th3 != thM1619I && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    AbstractC0398kl.m1920f(thM1619I, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        i40Var2 = i40Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                i40Var2 = i40Var;
                th = th5;
            }
        }
        if (thM1619I != null && thM1619I != th2) {
            obj = new C0688rg(thM1619I, false);
        }
        if (thM1619I != null && (m1614C(thM1619I) || mo1623O(thM1619I))) {
            obj.getClass();
            C0688rg.f5415b.compareAndSet((C0688rg) obj, 0, 1);
        }
        mo1630X(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2716d;
        Object z00Var = obj instanceof y00 ? new z00((y00) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f2719g;
            j40Var = this;
            i40Var3 = i40Var;
            if (unsafe.compareAndSwapObject(j40Var, j, i40Var3, z00Var) || unsafe.getObjectVolatile(j40Var, j) != i40Var3) {
                break;
            }
            this = j40Var;
            i40Var = i40Var3;
        }
        j40Var.m1616F(i40Var3, obj);
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final Throwable m1619I(i40 i40Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (i40Var.m1554f()) {
                return new d40(mo1615D(), null, this);
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
        if (th2 instanceof j81) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof j81)) {
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
    /* JADX INFO: renamed from: J */
    public boolean mo780J() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public boolean mo781K() {
        return this instanceof C0550og;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final sj0 m1620L(y00 y00Var) {
        sj0 sj0VarMo600d = y00Var.mo600d();
        if (sj0VarMo600d != null) {
            return sj0VarMo600d;
        }
        if (y00Var instanceof C0103cs) {
            return new sj0();
        }
        if (y00Var instanceof f40) {
            m1632a0((f40) y00Var);
            return null;
        }
        C0921xc.m5130k(y00Var, "State should have list: ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final InterfaceC0126de m1621M() {
        f2717e.getClass();
        return (InterfaceC0126de) uw0.f6315a.getObjectVolatile(this, f2718f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final Object m1622N() {
        f2716d.getClass();
        return uw0.f6315a.getObjectVolatile(this, f2719g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public boolean mo1623O(Throwable th) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final void m1625Q(c40 c40Var) {
        xj0 xj0Var = xj0.f7353d;
        if (c40Var == null) {
            m1634c0(xj0Var);
            return;
        }
        c40Var.start();
        InterfaceC0126de interfaceC0126deMo480g = c40Var.mo480g(this);
        m1634c0(interfaceC0126deMo480g);
        if (m1622N() instanceof y00) {
            return;
        }
        interfaceC0126deMo480g.mo623a();
        m1634c0(xj0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0622po m1626R(boolean z, f40 f40Var) {
        j40 j40Var;
        f40 f40Var2;
        boolean zM1287e;
        f40Var.f1576j = this;
        loop0: while (true) {
            Object objM1622N = this.m1622N();
            if (objM1622N instanceof C0103cs) {
                C0103cs c0103cs = (C0103cs) objM1622N;
                if (c0103cs.f884d) {
                    while (true) {
                        f2716d.getClass();
                        Unsafe unsafe = uw0.f6315a;
                        long j = f2719g;
                        j40Var = this;
                        f40Var2 = f40Var;
                        if (unsafe.compareAndSwapObject(j40Var, j, objM1622N, f40Var2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(j40Var, j) != objM1622N) {
                            break;
                        }
                        this = j40Var;
                        f40Var = f40Var2;
                    }
                } else {
                    j40Var = this;
                    f40Var2 = f40Var;
                    j40Var.m1631Z(c0103cs);
                }
                this = j40Var;
                f40Var = f40Var2;
            } else {
                j40Var = this;
                f40Var2 = f40Var;
                boolean z2 = objM1622N instanceof y00;
                xj0 xj0Var = xj0.f7353d;
                if (z2) {
                    y00 y00Var = (y00) objM1622N;
                    sj0 sj0VarMo600d = y00Var.mo600d();
                    if (sj0VarMo600d == null) {
                        j40Var.m1632a0((f40) objM1622N);
                    } else {
                        if (f40Var2.mo18r()) {
                            i40 i40Var = y00Var instanceof i40 ? (i40) y00Var : null;
                            Throwable thM1553e = i40Var != null ? i40Var.m1553e() : null;
                            if (thM1553e == null) {
                                zM1287e = sj0VarMo600d.m1287e(f40Var2, 5);
                            } else if (z) {
                                f40Var2.mo19s(thM1553e);
                                return xj0Var;
                            }
                        } else {
                            zM1287e = sj0VarMo600d.m1287e(f40Var2, 1);
                        }
                        if (zM1287e) {
                            break;
                        }
                    }
                    this = j40Var;
                    f40Var = f40Var2;
                } else if (z) {
                    Object objM1622N2 = j40Var.m1622N();
                    C0688rg c0688rg = objM1622N2 instanceof C0688rg ? (C0688rg) objM1622N2 : null;
                    f40Var2.mo19s(c0688rg != null ? c0688rg.f5416a : null);
                }
            }
        }
        return f40Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public boolean mo1266S() {
        return this instanceof C0467ma;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final Object m1627T(Object obj) {
        Object objM1638h0;
        do {
            objM1638h0 = m1638h0(m1622N(), obj);
            if (objM1638h0 == s91.f5710l) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0688rg c0688rg = obj instanceof C0688rg ? (C0688rg) obj : null;
                throw new IllegalStateException(str, c0688rg != null ? c0688rg.f5416a : null);
            }
        } while (objM1638h0 == s91.f5712n);
        return objM1638h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public String mo1628U() {
        return getClass().getSimpleName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public final void m1629W(sj0 sj0Var, Throwable th) {
        sj0Var.m1287e(new xa0(4), 4);
        Object objM1292k = sj0Var.m1292k();
        objM1292k.getClass();
        C0725sg c0725sg = null;
        for (hb0 hb0VarM1293l = (hb0) objM1292k; !hb0VarM1293l.equals(sj0Var); hb0VarM1293l = hb0VarM1293l.m1293l()) {
            if ((hb0VarM1293l instanceof f40) && ((f40) hb0VarM1293l).mo18r()) {
                try {
                    ((f40) hb0VarM1293l).mo19s(th);
                } catch (Throwable th2) {
                    if (c0725sg != null) {
                        AbstractC0398kl.m1920f(c0725sg, th2);
                    } else {
                        c0725sg = new C0725sg("Exception in completion handler " + hb0VarM1293l + " for " + this, th2);
                    }
                }
            }
        }
        if (c0725sg != null) {
            mo1624P(c0725sg);
        }
        m1614C(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public final void m1631Z(C0103cs c0103cs) {
        sj0 sj0Var = new sj0();
        Object x00Var = c0103cs.f884d ? sj0Var : new x00(sj0Var);
        while (true) {
            f2716d.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f2719g;
            j40 j40Var = this;
            C0103cs c0103cs2 = c0103cs;
            if (unsafe.compareAndSwapObject(j40Var, j, c0103cs2, x00Var) || unsafe.getObjectVolatile(j40Var, j) != c0103cs2) {
                return;
            }
            this = j40Var;
            c0103cs = c0103cs2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.c40
    /* JADX INFO: renamed from: a */
    public void mo478a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new d40(mo1615D(), null, this);
        }
        mo1613B(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final void m1632a0(f40 f40Var) {
        f40Var.m1289g(new sj0());
        hb0 hb0VarM1293l = f40Var.m1293l();
        while (true) {
            f2716d.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f2719g;
            j40 j40Var = this;
            f40 f40Var2 = f40Var;
            if (unsafe.compareAndSwapObject(j40Var, j, f40Var2, hb0VarM1293l) || unsafe.getObjectVolatile(j40Var, j) != f40Var2) {
                return;
            }
            this = j40Var;
            f40Var = f40Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.c40
    /* JADX INFO: renamed from: b */
    public boolean mo479b() {
        Object objM1622N = m1622N();
        return (objM1622N instanceof y00) && ((y00) objM1622N).mo599b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final void m1633b0(f40 f40Var) {
        j40 j40Var;
        while (true) {
            Object objM1622N = this.m1622N();
            if (!(objM1622N instanceof f40)) {
                if (!(objM1622N instanceof y00) || ((y00) objM1622N).mo600d() == null) {
                    return;
                }
                f40Var.m1296o();
                return;
            }
            if (objM1622N != f40Var) {
                return;
            }
            C0103cs c0103cs = s91.f5716r;
            while (true) {
                f2716d.getClass();
                Unsafe unsafe = uw0.f6315a;
                long j = f2719g;
                j40Var = this;
                if (unsafe.compareAndSwapObject(j40Var, j, objM1622N, c0103cs)) {
                    return;
                }
                if (unsafe.getObjectVolatile(j40Var, j) != objM1622N) {
                    break;
                } else {
                    this = j40Var;
                }
            }
            this = j40Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final void m1634c0(InterfaceC0126de interfaceC0126de) {
        f2717e.getClass();
        uw0.f6315a.putObjectVolatile(this, f2718f, interfaceC0126de);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final int m1635d0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof C0103cs;
        long j = f2719g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2716d;
        if (z) {
            if (((C0103cs) obj).f884d) {
                return 0;
            }
            C0103cs c0103cs = s91.f5716r;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = uw0.f6315a;
                if (unsafe2.compareAndSwapObject(this, f2719g, obj, c0103cs)) {
                    mo1233Y();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof x00)) {
            return 0;
        }
        sj0 sj0Var = ((x00) obj).f7229d;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = uw0.f6315a;
            if (unsafe.compareAndSwapObject(this, f2719g, obj, sj0Var)) {
                mo1233Y();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public final boolean m1636f0(y00 y00Var, Object obj) {
        Object z00Var = obj instanceof y00 ? new z00((y00) obj) : obj;
        while (true) {
            f2716d.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f2719g;
            j40 j40Var = this;
            y00 y00Var2 = y00Var;
            if (unsafe.compareAndSwapObject(j40Var, j, y00Var2, z00Var)) {
                j40Var.mo1630X(obj);
                j40Var.m1616F(y00Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(j40Var, j) != y00Var2) {
                return false;
            }
            this = j40Var;
            y00Var = y00Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        return r5;
     */
    @Override // p000.c40
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0126de mo480g(j40 j40Var) {
        j40 j40Var2;
        C0169ee c0169ee = new C0169ee(j40Var);
        c0169ee.f1576j = this;
        loop0: while (true) {
            Object objM1622N = this.m1622N();
            if (objM1622N instanceof C0103cs) {
                C0103cs c0103cs = (C0103cs) objM1622N;
                if (c0103cs.f884d) {
                    while (true) {
                        f2716d.getClass();
                        Unsafe unsafe = uw0.f6315a;
                        long j = f2719g;
                        j40Var2 = this;
                        if (unsafe.compareAndSwapObject(j40Var2, j, objM1622N, c0169ee)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(j40Var2, j) != objM1622N) {
                            break;
                        }
                        this = j40Var2;
                    }
                } else {
                    j40Var2 = this;
                    j40Var2.m1631Z(c0103cs);
                }
                this = j40Var2;
            } else {
                j40Var2 = this;
                boolean z = objM1622N instanceof y00;
                xj0 xj0Var = xj0.f7353d;
                if (!z) {
                    Object objM1622N2 = j40Var2.m1622N();
                    C0688rg c0688rg = objM1622N2 instanceof C0688rg ? (C0688rg) objM1622N2 : null;
                    c0169ee.mo19s(c0688rg != null ? c0688rg.f5416a : null);
                    return xj0Var;
                }
                sj0 sj0VarMo600d = ((y00) objM1622N).mo600d();
                if (sj0VarMo600d == null) {
                    j40Var2.m1632a0((f40) objM1622N);
                    this = j40Var2;
                } else if (!sj0VarMo600d.m1287e(c0169ee, 7)) {
                    boolean zM1287e = sj0VarMo600d.m1287e(c0169ee, 3);
                    Object objM1622N3 = j40Var2.m1622N();
                    if (objM1622N3 instanceof i40) {
                        thM1553e = ((i40) objM1622N3).m1553e();
                    } else {
                        C0688rg c0688rg2 = objM1622N3 instanceof C0688rg ? (C0688rg) objM1622N3 : null;
                        if (c0688rg2 != null) {
                            thM1553e = c0688rg2.f5416a;
                        }
                    }
                    c0169ee.mo19s(thM1553e);
                    if (zM1287e) {
                        break loop0;
                    }
                    return xj0Var;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public final boolean m1637g0(y00 y00Var, Throwable th) {
        sj0 sj0VarM1620L = m1620L(y00Var);
        if (sj0VarM1620L == null) {
            return false;
        }
        i40 i40Var = new i40(sj0VarM1620L, th);
        while (true) {
            f2716d.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f2719g;
            j40 j40Var = this;
            y00 y00Var2 = y00Var;
            if (unsafe.compareAndSwapObject(j40Var, j, y00Var2, i40Var)) {
                j40Var.m1629W(sj0VarM1620L, th);
                return true;
            }
            if (unsafe.getObjectVolatile(j40Var, j) != y00Var2) {
                return false;
            }
            this = j40Var;
            y00Var = y00Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0515nk
    public final InterfaceC0554ok getKey() {
        return C0496n2.f4129I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: h */
    public final InterfaceC0618pk mo63h(InterfaceC0618pk interfaceC0618pk) {
        return pf1.m3034J(this, interfaceC0618pk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public final Object m1638h0(Object obj, Object obj2) {
        if (!(obj instanceof y00)) {
            return s91.f5710l;
        }
        if (((obj instanceof C0103cs) || (obj instanceof f40)) && !(obj instanceof C0169ee) && !(obj2 instanceof C0688rg)) {
            return m1636f0((y00) obj, obj2) ? obj2 : s91.f5712n;
        }
        y00 y00Var = (y00) obj;
        sj0 sj0VarM1620L = m1620L(y00Var);
        if (sj0VarM1620L == null) {
            return s91.f5712n;
        }
        i40 i40Var = y00Var instanceof i40 ? (i40) y00Var : null;
        if (i40Var == null) {
            i40Var = new i40(sj0VarM1620L, null);
        }
        synchronized (i40Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i40.f2441e;
            if (atomicIntegerFieldUpdater.get(i40Var) != 0) {
                return s91.f5710l;
            }
            atomicIntegerFieldUpdater.set(i40Var, 1);
            if (i40Var != y00Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2716d;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, y00Var, i40Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != y00Var) {
                        return s91.f5712n;
                    }
                }
            }
            boolean zM1554f = i40Var.m1554f();
            C0688rg c0688rg = obj2 instanceof C0688rg ? (C0688rg) obj2 : null;
            if (c0688rg != null) {
                i40Var.m1551a(c0688rg.f5416a);
            }
            Throwable thM1553e = zM1554f ? null : i40Var.m1553e();
            if (thM1553e != null) {
                m1629W(sj0VarM1620L, thM1553e);
            }
            C0169ee c0169eeM1610V = m1610V(sj0VarM1620L);
            if (c0169eeM1610V != null && m1639i0(i40Var, c0169eeM1610V, obj2)) {
                return s91.f5711m;
            }
            sj0VarM1620L.m1287e(new xa0(2), 2);
            C0169ee c0169eeM1610V2 = m1610V(sj0VarM1620L);
            return (c0169eeM1610V2 == null || !m1639i0(i40Var, c0169eeM1610V2, obj2)) ? m1618H(i40Var, obj2) : s91.f5711m;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public final boolean m1639i0(i40 i40Var, C0169ee c0169ee, Object obj) {
        while (pf1.m3027C(c0169ee.f1425k, false, new h40(this, i40Var, c0169ee, obj)) == xj0.f7353d) {
            c0169ee = m1610V(c0169ee);
            if (c0169ee == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: l */
    public final InterfaceC0515nk mo64l(InterfaceC0554ok interfaceC0554ok) {
        return pf1.m3062v(this, interfaceC0554ok);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.c40
    /* JADX INFO: renamed from: o */
    public final CancellationException mo481o() {
        CancellationException cancellationException;
        Object objM1622N = m1622N();
        if (objM1622N instanceof i40) {
            Throwable thM1553e = ((i40) objM1622N).m1553e();
            if (thM1553e == null) {
                C0921xc.m5130k(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thM1553e instanceof CancellationException ? (CancellationException) thM1553e : null;
            return cancellationException == null ? new d40(strConcat, thM1553e, this) : cancellationException;
        }
        if (objM1622N instanceof y00) {
            C0921xc.m5130k(this, "Job is still new or active: ");
            return null;
        }
        if (!(objM1622N instanceof C0688rg)) {
            return new d40(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((C0688rg) objM1622N).f5416a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new d40(mo1615D(), th, this) : cancellationException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: p */
    public final Object mo65p(InterfaceC0904ww interfaceC0904ww, Object obj) {
        return interfaceC0904ww.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.c40
    /* JADX INFO: renamed from: r */
    public final InterfaceC0622po mo482r(InterfaceC0742sw interfaceC0742sw) {
        return m1626R(true, new a40(interfaceC0742sw));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.c40
    public final boolean start() {
        int iM1635d0;
        do {
            iM1635d0 = m1635d0(m1622N());
            if (iM1635d0 == 0) {
                return false;
            }
        } while (iM1635d0 != 1);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: t */
    public final InterfaceC0618pk mo66t(InterfaceC0554ok interfaceC0554ok) {
        return pf1.m3030F(this, interfaceC0554ok);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo1628U() + '{' + m1611e0(m1622N()) + '}');
        sb.append('@');
        sb.append(AbstractC0398kl.m1927m(this));
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.c40
    /* JADX INFO: renamed from: v */
    public final Object mo483v(AbstractC0358jk abstractC0358jk) {
        Object objM1622N;
        na1 na1Var;
        do {
            objM1622N = m1622N();
            boolean z = objM1622N instanceof y00;
            na1Var = na1.f4229a;
            if (!z) {
                pf1.m3060t(abstractC0358jk.mo540e());
                return na1Var;
            }
        } while (m1635d0(objM1622N) < 0);
        C0884wc c0884wc = new C0884wc(1, rd0.m3497z(abstractC0358jk));
        c0884wc.m4992v();
        c0884wc.m4995z(new C0684rc(1, pf1.m3027C(this, true, new ev0(c0884wc))));
        Object objM4990t = c0884wc.m4990t();
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (objM4990t != enumC1007zk) {
            objM4990t = na1Var;
        }
        return objM4990t == enumC1007zk ? objM4990t : na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.c40
    /* JADX INFO: renamed from: w */
    public final InterfaceC0622po mo484w(boolean z, boolean z2, C0191f c0191f) {
        return m1626R(z2, z ? new z30(c0191f) : new a40(c0191f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public void mo1173z(Object obj) {
        mo1172y(obj);
    }

    /* JADX INFO: renamed from: Y */
    public void mo1233Y() {
    }

    /* JADX INFO: renamed from: P */
    public void mo1624P(C0725sg c0725sg) {
        throw c0725sg;
    }

    /* JADX INFO: renamed from: X */
    public void mo1630X(Object obj) {
    }

    /* JADX INFO: renamed from: y */
    public void mo1172y(Object obj) {
    }
}
