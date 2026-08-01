package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: wc */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class C0884wc extends AbstractC0253go implements InterfaceC0798uc, InterfaceC0022al, yc1 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7071i = AtomicIntegerFieldUpdater.newUpdater(C0884wc.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7072j = AtomicReferenceFieldUpdater.newUpdater(C0884wc.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7073k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ long f7074l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ long f7075m;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik f7076g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0618pk f7077h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Unsafe unsafe = uw0.f6315a;
        f7075m = unsafe.objectFieldOffset(C0884wc.class.getDeclaredField("_state$volatile"));
        f7073k = AtomicReferenceFieldUpdater.newUpdater(C0884wc.class, Object.class, "_parentHandle$volatile");
        f7074l = unsafe.objectFieldOffset(C0884wc.class.getDeclaredField("_parentHandle$volatile"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0884wc(int i, InterfaceC0322ik interfaceC0322ik) {
        super(i);
        this.f7076g = interfaceC0322ik;
        this.f7077h = interfaceC0322ik.mo540e();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0495n1.f4116a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static void m4975B(zj0 zj0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + zj0Var + ", already has " + obj).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static Object m4976I(zj0 zj0Var, Object obj, int i, InterfaceC0941xw interfaceC0941xw) {
        if (obj instanceof C0688rg) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC0941xw != null || (zj0Var instanceof C0684rc)) {
            return new C0614pg(obj, zj0Var instanceof C0684rc ? (C0684rc) zj0Var : null, interfaceC0941xw, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final boolean m4977A() {
        return this.f2025f == 2 && ((C0179eo) this.f7076g).m946p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public String mo1200C() {
        return "CancellableContinuation";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final void m4978D() {
        Throwable thM948r;
        InterfaceC0322ik interfaceC0322ik = this.f7076g;
        C0179eo c0179eo = interfaceC0322ik instanceof C0179eo ? (C0179eo) interfaceC0322ik : null;
        if (c0179eo == null || (thM948r = c0179eo.m948r(this)) == null) {
            return;
        }
        m4987p();
        mo543k(thM948r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final boolean m4979E() {
        f7072j.getClass();
        Unsafe unsafe = uw0.f6315a;
        long j = f7075m;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof C0614pg) && ((C0614pg) objectVolatile).f4849d != null) {
            m4987p();
            return false;
        }
        f7071i.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, C0495n1.f4116a);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m4980F(Object obj, InterfaceC0941xw interfaceC0941xw) {
        m4981G(obj, this.f2025f, interfaceC0941xw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m4981G(Object obj, int i, InterfaceC0941xw interfaceC0941xw) {
        C0884wc c0884wc;
        while (true) {
            f7072j.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f7075m;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof zj0)) {
                C0884wc c0884wc2 = this;
                if (objectVolatile instanceof C0995zc) {
                    C0995zc c0995zc = (C0995zc) objectVolatile;
                    if (C0995zc.f7862c.compareAndSet(c0995zc, 0, 1)) {
                        if (interfaceC0941xw != null) {
                            c0884wc2.m4985n(interfaceC0941xw, c0995zc.f5416a, obj);
                            return;
                        }
                        return;
                    }
                }
                C0921xc.m5130k(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objM4976I = m4976I((zj0) objectVolatile, obj, i, interfaceC0941xw);
            while (true) {
                Unsafe unsafe2 = uw0.f6315a;
                c0884wc = this;
                if (unsafe2.compareAndSwapObject(c0884wc, f7075m, objectVolatile, objM4976I)) {
                    if (!c0884wc.m4977A()) {
                        c0884wc.m4987p();
                    }
                    c0884wc.m4988q(i);
                    return;
                } else if (unsafe2.getObjectVolatile(c0884wc, j) != objectVolatile) {
                    break;
                } else {
                    this = c0884wc;
                }
            }
            this = c0884wc;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final void m4982H(AbstractC0692rk abstractC0692rk) {
        InterfaceC0322ik interfaceC0322ik = this.f7076g;
        C0179eo c0179eo = interfaceC0322ik instanceof C0179eo ? (C0179eo) interfaceC0322ik : null;
        m4981G(na1.f4229a, (c0179eo != null ? c0179eo.f1489g : null) == abstractC0692rk ? 4 : this.f2025f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final C1014zr m4983J(Object obj, InterfaceC0941xw interfaceC0941xw) {
        C0884wc c0884wc;
        C1014zr c1014zr = o30.f4431a;
        while (true) {
            f7072j.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f7075m;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof zj0)) {
                return null;
            }
            Object objM4976I = m4976I((zj0) objectVolatile, obj, this.f2025f, interfaceC0941xw);
            while (true) {
                Unsafe unsafe2 = uw0.f6315a;
                c0884wc = this;
                if (unsafe2.compareAndSwapObject(c0884wc, f7075m, objectVolatile, objM4976I)) {
                    if (!c0884wc.m4977A()) {
                        c0884wc.m4987p();
                    }
                    return c1014zr;
                }
                if (unsafe2.getObjectVolatile(c0884wc, j) != objectVolatile) {
                    break;
                }
                this = c0884wc;
            }
            this = c0884wc;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yc1
    /* JADX INFO: renamed from: a */
    public final void mo539a(nz0 nz0Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f7071i;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                C0921xc.m5134o("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m4995z(nz0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0253go
    /* JADX INFO: renamed from: b */
    public final void mo1250b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        C0884wc c0884wc;
        while (true) {
            f7072j.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f7075m;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof zj0) {
                C0921xc.m5134o("Not completed");
                return;
            }
            if (objectVolatile instanceof C0688rg) {
                return;
            }
            if (objectVolatile instanceof C0614pg) {
                C0614pg c0614pg = (C0614pg) objectVolatile;
                if (c0614pg.f4850e != null) {
                    C0921xc.m5134o("Must be called at most once");
                    return;
                }
                C0614pg c0614pgM3067a = C0614pg.m3067a(c0614pg, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = uw0.f6315a;
                    C0884wc c0884wc2 = this;
                    if (unsafe2.compareAndSwapObject(c0884wc2, f7075m, objectVolatile, c0614pgM3067a)) {
                        C0684rc c0684rc = c0614pg.f4847b;
                        if (c0684rc != null) {
                            c0884wc2.m4984m(c0684rc, cancellationException);
                        }
                        InterfaceC0941xw interfaceC0941xw = c0614pg.f4848c;
                        if (interfaceC0941xw != null) {
                            c0884wc2.m4985n(interfaceC0941xw, cancellationException, c0614pg.f4846a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(c0884wc2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        c0884wc = c0884wc2;
                        break;
                    }
                    this = c0884wc2;
                }
            } else {
                C0884wc c0884wc3 = this;
                CancellationException cancellationException3 = cancellationException;
                C0614pg c0614pg2 = new C0614pg(objectVolatile, (C0684rc) null, (InterfaceC0941xw) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    C0614pg c0614pg3 = c0614pg2;
                    Unsafe unsafe3 = uw0.f6315a;
                    c0884wc = c0884wc3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(c0884wc, f7075m, objectVolatile, c0614pg3);
                    c0614pg2 = c0614pg3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(c0884wc, j) != objectVolatile) {
                        break;
                    } else {
                        c0884wc3 = c0884wc;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = c0884wc;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0253go
    /* JADX INFO: renamed from: c */
    public final InterfaceC0322ik mo941c() {
        return this.f7076g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0022al
    /* JADX INFO: renamed from: d */
    public final InterfaceC0022al mo180d() {
        InterfaceC0322ik interfaceC0322ik = this.f7076g;
        if (interfaceC0322ik instanceof InterfaceC0022al) {
            return (InterfaceC0022al) interfaceC0322ik;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: e */
    public final InterfaceC0618pk mo540e() {
        return this.f7077h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0253go
    /* JADX INFO: renamed from: f */
    public final Throwable mo1251f(Object obj) {
        Throwable thMo1251f = super.mo1251f(obj);
        if (thMo1251f != null) {
            return thMo1251f;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0253go
    /* JADX INFO: renamed from: g */
    public final Object mo1252g(Object obj) {
        return obj instanceof C0614pg ? ((C0614pg) obj).f4846a : obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: i */
    public final void mo541i(Object obj) {
        Throwable thM604a = cv0.m604a(obj);
        if (thM604a != null) {
            obj = new C0688rg(thM604a, false);
        }
        m4981G(obj, this.f2025f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0798uc
    /* JADX INFO: renamed from: j */
    public final C1014zr mo542j(Object obj, InterfaceC0941xw interfaceC0941xw) {
        return m4983J(obj, interfaceC0941xw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0798uc
    /* JADX INFO: renamed from: k */
    public final boolean mo543k(Throwable th) {
        C0884wc c0884wc;
        while (true) {
            f7072j.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f7075m;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof zj0)) {
                return false;
            }
            C0995zc c0995zc = new C0995zc(this, th, (objectVolatile instanceof C0684rc) || (objectVolatile instanceof nz0));
            while (true) {
                Unsafe unsafe2 = uw0.f6315a;
                c0884wc = this;
                if (unsafe2.compareAndSwapObject(c0884wc, f7075m, objectVolatile, c0995zc)) {
                    zj0 zj0Var = (zj0) objectVolatile;
                    if (zj0Var instanceof C0684rc) {
                        c0884wc.m4984m((C0684rc) objectVolatile, th);
                    } else if (zj0Var instanceof nz0) {
                        c0884wc.m4986o((nz0) objectVolatile, th);
                    }
                    if (!c0884wc.m4977A()) {
                        c0884wc.m4987p();
                    }
                    c0884wc.m4988q(c0884wc.f2025f);
                    return true;
                }
                if (unsafe2.getObjectVolatile(c0884wc, j) != objectVolatile) {
                    break;
                }
                this = c0884wc;
            }
            this = c0884wc;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0253go
    /* JADX INFO: renamed from: l */
    public final Object mo942l() {
        return m4991u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m4984m(C0684rc c0684rc, Throwable th) {
        try {
            switch (c0684rc.f5349a) {
                case 0:
                    ((InterfaceC0742sw) c0684rc.f5350b).invoke(th);
                    break;
                default:
                    ((InterfaceC0622po) c0684rc.f5350b).mo623a();
                    break;
            }
        } catch (Throwable th2) {
            o30.m2780t(this.f7077h, new C0725sg("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m4985n(InterfaceC0941xw interfaceC0941xw, Throwable th, Object obj) {
        InterfaceC0618pk interfaceC0618pk = this.f7077h;
        try {
            interfaceC0941xw.mo353a(th, obj, interfaceC0618pk);
        } catch (Throwable th2) {
            o30.m2780t(interfaceC0618pk, new C0725sg("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m4986o(nz0 nz0Var, Throwable th) {
        InterfaceC0618pk interfaceC0618pk = this.f7077h;
        int i = f7071i.get(this) & 536870911;
        if (i == 536870911) {
            C0921xc.m5134o("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            nz0Var.mo2403l(i, interfaceC0618pk);
        } catch (Throwable th2) {
            o30.m2780t(interfaceC0618pk, new C0725sg("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m4987p() {
        InterfaceC0622po interfaceC0622poM4989s = m4989s();
        if (interfaceC0622poM4989s == null) {
            return;
        }
        interfaceC0622poM4989s.mo623a();
        f7073k.getClass();
        uw0.f6315a.putObjectVolatile(this, f7074l, xj0.f7353d);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m4988q(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f7071i;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    C0921xc.m5134o("Already resumed");
                    return;
                }
                boolean z = i == 4;
                InterfaceC0322ik interfaceC0322ik = this.f7076g;
                if (!z && (interfaceC0322ik instanceof C0179eo)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f2025f;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C0179eo c0179eo = (C0179eo) interfaceC0322ik;
                        AbstractC0692rk abstractC0692rk = c0179eo.f1489g;
                        InterfaceC0618pk interfaceC0618pkMo540e = c0179eo.f1490h.mo540e();
                        if (abstractC0692rk.mo1509f(interfaceC0618pkMo540e)) {
                            abstractC0692rk.mo358e(interfaceC0618pkMo540e, this);
                            return;
                        }
                        AbstractC0030at abstractC0030atM5216a = y71.m5216a();
                        if (abstractC0030atM5216a.f261f >= 4294967296L) {
                            abstractC0030atM5216a.m202k(this);
                            return;
                        }
                        abstractC0030atM5216a.m203m(true);
                        try {
                            AbstractC0398kl.m1938x(this, interfaceC0322ik, true);
                            do {
                            } while (abstractC0030atM5216a.m205s());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC0398kl.m1938x(this, interfaceC0322ik, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public Throwable mo1201r(j40 j40Var) {
        return j40Var.mo481o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final InterfaceC0622po m4989s() {
        f7073k.getClass();
        return (InterfaceC0622po) uw0.f6315a.getObjectVolatile(this, f7074l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final Object m4990t() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        c40 c40Var;
        boolean zM4977A = m4977A();
        do {
            atomicIntegerFieldUpdater = f7071i;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    C0921xc.m5134o("Already suspended");
                    return null;
                }
                if (zM4977A) {
                    m4978D();
                }
                Object objM4991u = m4991u();
                if (objM4991u instanceof C0688rg) {
                    throw ((C0688rg) objM4991u).f5416a;
                }
                int i3 = this.f2025f;
                if ((i3 != 1 && i3 != 2) || (c40Var = (c40) this.f7077h.mo64l(C0496n2.f4129I)) == null || c40Var.mo479b()) {
                    return mo1252g(objM4991u);
                }
                CancellationException cancellationExceptionMo481o = c40Var.mo481o();
                mo1250b(cancellationExceptionMo481o);
                throw cancellationExceptionMo481o;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (m4989s() == null) {
            m4993w();
        }
        if (zM4977A) {
            m4978D();
        }
        return EnumC1007zk.f7916d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo1200C());
        sb.append('(');
        sb.append(AbstractC0398kl.m1911B(this.f7076g));
        sb.append("){");
        Object objM4991u = m4991u();
        sb.append(objM4991u instanceof zj0 ? "Active" : objM4991u instanceof C0995zc ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0398kl.m1927m(this));
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final Object m4991u() {
        f7072j.getClass();
        return uw0.f6315a.getObjectVolatile(this, f7075m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m4992v() {
        InterfaceC0622po interfaceC0622poM4993w = m4993w();
        if (interfaceC0622poM4993w == null || (m4991u() instanceof zj0)) {
            return;
        }
        interfaceC0622poM4993w.mo623a();
        f7073k.getClass();
        uw0.f6315a.putObjectVolatile(this, f7074l, xj0.f7353d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final InterfaceC0622po m4993w() {
        c40 c40Var = (c40) this.f7077h.mo64l(C0496n2.f4129I);
        if (c40Var == null) {
            return null;
        }
        InterfaceC0622po interfaceC0622poM3027C = pf1.m3027C(c40Var, true, new C0088ce(this));
        while (true) {
            f7073k.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f7074l;
            C0884wc c0884wc = this;
            if (unsafe.compareAndSwapObject(c0884wc, j, (Object) null, interfaceC0622poM3027C) || unsafe.getObjectVolatile(c0884wc, j) != null) {
                break;
            }
            this = c0884wc;
        }
        return interfaceC0622poM3027C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0798uc
    /* JADX INFO: renamed from: x */
    public final void mo544x(Object obj) {
        m4988q(this.f2025f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m4994y(InterfaceC0742sw interfaceC0742sw) {
        m4995z(new C0684rc(0, interfaceC0742sw));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c5, code lost:
    
        m4975B(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4995z(zj0 zj0Var) {
        C0884wc c0884wc;
        Unsafe unsafe;
        C0884wc c0884wc2;
        while (true) {
            f7072j.getClass();
            Unsafe unsafe2 = uw0.f6315a;
            long j = f7075m;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof C0495n1) {
                while (true) {
                    Unsafe unsafe3 = uw0.f6315a;
                    c0884wc = this;
                    if (unsafe3.compareAndSwapObject(c0884wc, f7075m, objectVolatile, zj0Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(c0884wc, j) != objectVolatile) {
                        break;
                    } else {
                        this = c0884wc;
                    }
                }
            } else {
                c0884wc = this;
                if ((objectVolatile instanceof C0684rc) || (objectVolatile instanceof nz0)) {
                    break;
                }
                if (objectVolatile instanceof C0688rg) {
                    C0688rg c0688rg = (C0688rg) objectVolatile;
                    if (!C0688rg.f5415b.compareAndSet(c0688rg, 0, 1)) {
                        m4975B(zj0Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof C0995zc) {
                        Throwable th = c0688rg.f5416a;
                        if (zj0Var instanceof C0684rc) {
                            c0884wc.m4984m((C0684rc) zj0Var, th);
                            return;
                        } else {
                            c0884wc.m4986o((nz0) zj0Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof C0614pg) {
                    C0614pg c0614pg = (C0614pg) objectVolatile;
                    if (c0614pg.f4847b != null) {
                        m4975B(zj0Var, objectVolatile);
                        throw null;
                    }
                    if (zj0Var instanceof nz0) {
                        return;
                    }
                    C0684rc c0684rc = (C0684rc) zj0Var;
                    Throwable th2 = c0614pg.f4850e;
                    if (th2 != null) {
                        c0884wc.m4984m(c0684rc, th2);
                        return;
                    }
                    C0614pg c0614pgM3067a = C0614pg.m3067a(c0614pg, c0684rc, null, 29);
                    do {
                        unsafe = uw0.f6315a;
                        c0884wc2 = c0884wc;
                        if (unsafe.compareAndSwapObject(c0884wc, f7075m, objectVolatile, c0614pgM3067a)) {
                            return;
                        } else {
                            c0884wc = c0884wc2;
                        }
                    } while (unsafe.getObjectVolatile(c0884wc2, j) == objectVolatile);
                } else {
                    C0884wc c0884wc3 = c0884wc;
                    if (zj0Var instanceof nz0) {
                        return;
                    }
                    C0614pg c0614pg2 = new C0614pg(objectVolatile, (C0684rc) zj0Var, (InterfaceC0941xw) null, (Throwable) null, 28);
                    while (true) {
                        C0614pg c0614pg3 = c0614pg2;
                        Unsafe unsafe4 = uw0.f6315a;
                        c0884wc = c0884wc3;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(c0884wc, f7075m, objectVolatile, c0614pg3);
                        c0614pg2 = c0614pg3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(c0884wc, j) != objectVolatile) {
                            break;
                        } else {
                            c0884wc3 = c0884wc;
                        }
                    }
                }
            }
            this = c0884wc;
        }
    }
}
