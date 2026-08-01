package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class k01 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2977b = AtomicReferenceFieldUpdater.newUpdater(k01.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicLongFieldUpdater f2978c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2979d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f2980e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2981f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ long f2982g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ long f2983h;
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final C0835vc f2984a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Unsafe unsafe = uw0.f6315a;
        f2982g = unsafe.objectFieldOffset(k01.class.getDeclaredField("head$volatile"));
        f2978c = AtomicLongFieldUpdater.newUpdater(k01.class, "deqIdx$volatile");
        f2979d = AtomicReferenceFieldUpdater.newUpdater(k01.class, Object.class, "tail$volatile");
        f2983h = unsafe.objectFieldOffset(k01.class.getDeclaredField("tail$volatile"));
        f2980e = AtomicLongFieldUpdater.newUpdater(k01.class, "enqIdx$volatile");
        f2981f = AtomicIntegerFieldUpdater.newUpdater(k01.class, "_availablePermits$volatile");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k01() {
        m01 m01Var = new m01(0L, null, 2);
        this.head$volatile = m01Var;
        this.tail$volatile = m01Var;
        this._availablePermits$volatile = 1;
        this.f2984a = new C0835vc(4, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m1747a(ci0 ci0Var) {
        Object objM1926l;
        Unsafe unsafe;
        k01 k01Var = this;
        f2979d.getClass();
        Unsafe unsafe2 = uw0.f6315a;
        long j = f2983h;
        m01 m01Var = (m01) unsafe2.getObjectVolatile(k01Var, j);
        long andIncrement = f2980e.getAndIncrement(k01Var);
        i01 i01Var = i01.f2390d;
        long j2 = andIncrement / ((long) l01.f3305f);
        loop0: while (true) {
            objM1926l = AbstractC0398kl.m1926l(m01Var, j2, i01Var);
            if (!g60.m1215n(objM1926l)) {
                nz0 nz0VarM1213l = g60.m1213l(objM1926l);
                while (true) {
                    nz0 nz0Var = (nz0) uw0.f6315a.getObjectVolatile(k01Var, j);
                    if (nz0Var.f4374e >= nz0VarM1213l.f4374e) {
                        break loop0;
                    }
                    if (!nz0VarM1213l.m2747n()) {
                        break;
                    }
                    do {
                        unsafe = uw0.f6315a;
                        k01Var = this;
                        if (unsafe.compareAndSwapObject(k01Var, f2983h, nz0Var, nz0VarM1213l)) {
                            if (nz0Var.m2745j()) {
                                nz0Var.m1589h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(k01Var, j) == nz0Var);
                    if (nz0VarM1213l.m2745j()) {
                        nz0VarM1213l.m1589h();
                    }
                }
            } else {
                break;
            }
            k01Var = this;
        }
        m01 m01Var2 = (m01) g60.m1213l(objM1926l);
        AtomicReferenceArray atomicReferenceArray = m01Var2.f3776g;
        int i = (int) (andIncrement % ((long) l01.f3305f));
        while (!atomicReferenceArray.compareAndSet(i, null, ci0Var)) {
            if (atomicReferenceArray.get(i) != null) {
                C1014zr c1014zr = l01.f3301b;
                C1014zr c1014zr2 = l01.f3302c;
                do {
                    int i2 = 0;
                    if (atomicReferenceArray.compareAndSet(i, c1014zr, c1014zr2)) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = di0.f1112i;
                        di0 di0Var = ci0Var.f818e;
                        atomicReferenceFieldUpdater.set(di0Var, null);
                        C0884wc c0884wc = ci0Var.f817d;
                        C0532o c0532o = new C0532o(11, di0Var, ci0Var);
                        c0884wc.m4981G(na1.f4229a, c0884wc.f2025f, new C0835vc(i2, c0532o));
                        return true;
                    }
                } while (atomicReferenceArray.get(i) == c1014zr);
                return false;
            }
        }
        ci0Var.mo539a(m01Var2, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1748b() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2981f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m1749c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m1749c() {
        Object objM1926l;
        Unsafe unsafe;
        f2977b.getClass();
        Unsafe unsafe2 = uw0.f6315a;
        long j = f2982g;
        m01 m01Var = (m01) unsafe2.getObjectVolatile(this, j);
        long andIncrement = f2978c.getAndIncrement(this);
        long j2 = andIncrement / ((long) l01.f3305f);
        j01 j01Var = j01.f2655d;
        loop0: while (true) {
            objM1926l = AbstractC0398kl.m1926l(m01Var, j2, j01Var);
            if (g60.m1215n(objM1926l)) {
                break;
            }
            nz0 nz0VarM1213l = g60.m1213l(objM1926l);
            while (true) {
                nz0 nz0Var = (nz0) uw0.f6315a.getObjectVolatile(this, j);
                if (nz0Var.f4374e >= nz0VarM1213l.f4374e) {
                    break loop0;
                }
                if (!nz0VarM1213l.m2747n()) {
                    break;
                }
                do {
                    unsafe = uw0.f6315a;
                    if (unsafe.compareAndSwapObject(this, f2982g, nz0Var, nz0VarM1213l)) {
                        if (nz0Var.m2745j()) {
                            nz0Var.m1589h();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == nz0Var);
                if (nz0VarM1213l.m2745j()) {
                    nz0VarM1213l.m1589h();
                }
            }
        }
        m01 m01Var2 = (m01) g60.m1213l(objM1926l);
        AtomicReferenceArray atomicReferenceArray = m01Var2.f3776g;
        m01Var2.m1582a();
        boolean z = false;
        if (m01Var2.f4374e <= j2) {
            int i = (int) (andIncrement % ((long) l01.f3305f));
            Object andSet = atomicReferenceArray.getAndSet(i, l01.f3301b);
            if (andSet == null) {
                int i2 = l01.f3300a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == l01.f3302c) {
                        return true;
                    }
                }
                C1014zr c1014zr = l01.f3301b;
                C1014zr c1014zr2 = l01.f3303d;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, c1014zr, c1014zr2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != c1014zr) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != l01.f3304e) {
                if (!(andSet instanceof InterfaceC0798uc)) {
                    C0921xc.m5130k(andSet, "unexpected: ");
                    return false;
                }
                InterfaceC0798uc interfaceC0798uc = (InterfaceC0798uc) andSet;
                C1014zr c1014zrMo542j = interfaceC0798uc.mo542j(na1.f4229a, this.f2984a);
                if (c1014zrMo542j != null) {
                    interfaceC0798uc.mo544x(c1014zrMo542j);
                    return true;
                }
            }
        }
        return false;
    }
}
