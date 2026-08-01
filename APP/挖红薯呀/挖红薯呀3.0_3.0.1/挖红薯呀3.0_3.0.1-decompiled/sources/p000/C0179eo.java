package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: eo */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0179eo extends AbstractC0253go implements InterfaceC0022al, InterfaceC0322ik {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1487k = AtomicReferenceFieldUpdater.newUpdater(C0179eo.class, Object.class, "_reusableCancellableContinuation$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ long f1488l = uw0.f6315a.objectFieldOffset(C0179eo.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: g */
    public final AbstractC0692rk f1489g;

    /* JADX INFO: renamed from: h */
    public final AbstractC0358jk f1490h;

    /* JADX INFO: renamed from: i */
    public Object f1491i;

    /* JADX INFO: renamed from: j */
    public final Object f1492j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0179eo(AbstractC0692rk abstractC0692rk, AbstractC0358jk abstractC0358jk) {
        super(-1);
        this.f1489g = abstractC0692rk;
        this.f1490h = abstractC0358jk;
        this.f1491i = pf1.f4838d;
        this.f1492j = s91.m4029P(abstractC0358jk.mo540e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0022al
    /* JADX INFO: renamed from: d */
    public final InterfaceC0022al mo180d() {
        return this.f1490h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: e */
    public final InterfaceC0618pk mo540e() {
        return this.f1490h.mo540e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: i */
    public final void mo541i(Object obj) {
        Throwable thM604a = cv0.m604a(obj);
        Object c0688rg = thM604a == null ? obj : new C0688rg(thM604a, false);
        AbstractC0358jk abstractC0358jk = this.f1490h;
        InterfaceC0618pk interfaceC0618pkMo540e = abstractC0358jk.mo540e();
        AbstractC0692rk abstractC0692rk = this.f1489g;
        if (abstractC0692rk.mo1509f(interfaceC0618pkMo540e)) {
            this.f1491i = c0688rg;
            this.f2025f = 0;
            abstractC0692rk.mo358e(abstractC0358jk.mo540e(), this);
            return;
        }
        AbstractC0030at abstractC0030atM5216a = y71.m5216a();
        if (abstractC0030atM5216a.f261f >= 4294967296L) {
            this.f1491i = c0688rg;
            this.f2025f = 0;
            abstractC0030atM5216a.m202k(this);
            return;
        }
        abstractC0030atM5216a.m203m(true);
        try {
            InterfaceC0618pk interfaceC0618pkMo540e2 = abstractC0358jk.mo540e();
            Object objM4035V = s91.m4035V(interfaceC0618pkMo540e2, this.f1492j);
            try {
                abstractC0358jk.mo541i(obj);
                while (abstractC0030atM5216a.m205s()) {
                }
            } finally {
                s91.m4026M(interfaceC0618pkMo540e2, objM4035V);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0253go
    /* JADX INFO: renamed from: l */
    public final Object mo942l() {
        Object obj = this.f1491i;
        this.f1491i = pf1.f4838d;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m943m() {
        do {
            f1487k.getClass();
        } while (uw0.f6315a.getObjectVolatile(this, f1488l) == pf1.f4839e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final C0884wc m944n() {
        C0179eo c0179eo;
        C1014zr c1014zr = pf1.f4839e;
        while (true) {
            f1487k.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f1488l;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, c1014zr);
                return null;
            }
            if (objectVolatile instanceof C0884wc) {
                while (true) {
                    Unsafe unsafe2 = uw0.f6315a;
                    C0179eo c0179eo2 = this;
                    boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(c0179eo2, f1488l, objectVolatile, c1014zr);
                    c0179eo = c0179eo2;
                    if (zCompareAndSwapObject) {
                        return (C0884wc) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(c0179eo, j) != objectVolatile) {
                        break;
                    }
                    this = c0179eo;
                }
            } else {
                c0179eo = this;
                if (objectVolatile != c1014zr && !(objectVolatile instanceof Throwable)) {
                    C0921xc.m5130k(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = c0179eo;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final C0884wc m945o() {
        f1487k.getClass();
        Object objectVolatile = uw0.f6315a.getObjectVolatile(this, f1488l);
        if (objectVolatile instanceof C0884wc) {
            return (C0884wc) objectVolatile;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final boolean m946p() {
        f1487k.getClass();
        return uw0.f6315a.getObjectVolatile(this, f1488l) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final boolean m947q(Throwable th) {
        C0179eo c0179eo;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            f1487k.getClass();
            Unsafe unsafe2 = uw0.f6315a;
            long j = f1488l;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            C1014zr c1014zr = pf1.f4839e;
            if (p30.m3002l(objectVolatile, c1014zr)) {
                while (true) {
                    Unsafe unsafe3 = uw0.f6315a;
                    C0179eo c0179eo2 = this;
                    th2 = th;
                    c0179eo = c0179eo2;
                    if (unsafe3.compareAndSwapObject(c0179eo2, f1488l, c1014zr, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(c0179eo, j) != c1014zr) {
                        break;
                    }
                    this = c0179eo;
                    th = th2;
                }
            } else {
                c0179eo = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = uw0.f6315a;
                    if (unsafe.compareAndSwapObject(c0179eo, f1488l, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(c0179eo, j) == objectVolatile);
            }
            this = c0179eo;
            th = th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final Throwable m948r(C0884wc c0884wc) {
        Unsafe unsafe;
        C0179eo c0179eo;
        C0884wc c0884wc2;
        while (true) {
            f1487k.getClass();
            Unsafe unsafe2 = uw0.f6315a;
            long j = f1488l;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            C1014zr c1014zr = pf1.f4839e;
            if (objectVolatile != c1014zr) {
                C0179eo c0179eo2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    C0921xc.m5130k(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = uw0.f6315a;
                    if (unsafe.compareAndSwapObject(c0179eo2, f1488l, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(c0179eo2, j) == objectVolatile);
                C0921xc.m5131l("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = uw0.f6315a;
                c0179eo = this;
                c0884wc2 = c0884wc;
                if (unsafe3.compareAndSwapObject(c0179eo, f1488l, c1014zr, c0884wc2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(c0179eo, j) != c1014zr) {
                    break;
                }
                this = c0179eo;
                c0884wc = c0884wc2;
            }
            this = c0179eo;
            c0884wc = c0884wc2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DispatchedContinuation[" + this.f1489g + ", " + AbstractC0398kl.m1911B(this.f1490h) + ']';
    }

    @Override // p000.AbstractC0253go
    /* JADX INFO: renamed from: c */
    public final InterfaceC0322ik mo941c() {
        return this;
    }
}
