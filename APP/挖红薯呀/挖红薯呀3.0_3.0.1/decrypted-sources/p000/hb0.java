package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class hb0 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2188d = AtomicReferenceFieldUpdater.newUpdater(hb0.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2189e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2190f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ long f2191g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ long f2192h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ long f2193i;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Unsafe unsafe = uw0.f6315a;
        f2191g = unsafe.objectFieldOffset(hb0.class.getDeclaredField("_next$volatile"));
        f2189e = AtomicReferenceFieldUpdater.newUpdater(hb0.class, Object.class, "_prev$volatile");
        f2192h = unsafe.objectFieldOffset(hb0.class.getDeclaredField("_prev$volatile"));
        f2190f = AtomicReferenceFieldUpdater.newUpdater(hb0.class, Object.class, "_removedRef$volatile");
        f2193i = unsafe.objectFieldOffset(hb0.class.getDeclaredField("_removedRef$volatile"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static hb0 m1286i(hb0 hb0Var) {
        while (hb0Var.mo1295n()) {
            f2189e.getClass();
            hb0Var = (hb0) uw0.f6315a.getObjectVolatile(hb0Var, f2192h);
        }
        return hb0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m1287e(hb0 hb0Var, int i) {
        hb0 hb0VarM1294m;
        do {
            hb0VarM1294m = m1294m();
            if (hb0VarM1294m instanceof xa0) {
                return (((xa0) hb0VarM1294m).f7290j & i) == 0 && hb0VarM1294m.m1287e(hb0Var, i);
            }
        } while (!hb0VarM1294m.m1288f(hb0Var, this));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m1288f(hb0 hb0Var, hb0 hb0Var2) {
        f2189e.getClass();
        Unsafe unsafe = uw0.f6315a;
        unsafe.putObjectVolatile(hb0Var, f2192h, this);
        f2188d.getClass();
        long j = f2191g;
        unsafe.putObjectVolatile(hb0Var, j, hb0Var2);
        while (true) {
            Unsafe unsafe2 = uw0.f6315a;
            hb0 hb0Var3 = this;
            hb0 hb0Var4 = hb0Var;
            hb0 hb0Var5 = hb0Var2;
            if (unsafe2.compareAndSwapObject(hb0Var3, f2191g, hb0Var5, hb0Var4)) {
                hb0Var4.m1291j(hb0Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(hb0Var3, j) != hb0Var5) {
                return false;
            }
            this = hb0Var3;
            hb0Var2 = hb0Var5;
            hb0Var = hb0Var4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1289g(sj0 sj0Var) {
        f2189e.getClass();
        Unsafe unsafe = uw0.f6315a;
        unsafe.putObjectVolatile(sj0Var, f2192h, this);
        f2188d.getClass();
        long j = f2191g;
        unsafe.putObjectVolatile(sj0Var, j, this);
        while (this.m1292k() == this) {
            while (true) {
                Unsafe unsafe2 = uw0.f6315a;
                hb0 hb0Var = this;
                sj0 sj0Var2 = sj0Var;
                if (unsafe2.compareAndSwapObject(hb0Var, f2191g, this, sj0Var2)) {
                    sj0Var2.m1291j(hb0Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(hb0Var, j) != hb0Var) {
                        break;
                    }
                    this = hb0Var;
                    sj0Var = sj0Var2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hb0 m1290h() {
        hb0 hb0Var;
        Unsafe unsafe;
        loop0: while (true) {
            f2189e.getClass();
            Unsafe unsafe2 = uw0.f6315a;
            long j = f2192h;
            hb0 hb0Var2 = (hb0) unsafe2.getObjectVolatile(this, j);
            hb0 hb0Var3 = null;
            hb0 hb0Var4 = hb0Var2;
            while (true) {
                f2188d.getClass();
                if (hb0Var4 == null) {
                    C0921xc.m5123d();
                    return null;
                }
                Unsafe unsafe3 = uw0.f6315a;
                long j2 = f2191g;
                Object objectVolatile = unsafe3.getObjectVolatile(hb0Var4, j2);
                if (objectVolatile != this) {
                    hb0 hb0Var5 = hb0Var2;
                    hb0Var = this;
                    if (hb0Var.mo1295n()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof pu0)) {
                        objectVolatile.getClass();
                        hb0Var3 = hb0Var4;
                        hb0Var4 = (hb0) objectVolatile;
                    } else if (hb0Var3 != null) {
                        hb0 hb0Var6 = ((pu0) objectVolatile).f4968a;
                        do {
                            hb0 hb0Var7 = hb0Var4;
                            unsafe = uw0.f6315a;
                            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(hb0Var3, f2191g, hb0Var7, hb0Var6);
                            hb0Var4 = hb0Var7;
                            if (zCompareAndSwapObject) {
                                this = hb0Var;
                                hb0Var4 = hb0Var3;
                                hb0Var2 = hb0Var5;
                                hb0Var3 = null;
                            }
                        } while (unsafe.getObjectVolatile(hb0Var3, j2) == hb0Var4);
                    } else {
                        if (hb0Var4 == null) {
                            C0921xc.m5123d();
                            return null;
                        }
                        hb0Var4 = (hb0) unsafe3.getObjectVolatile(hb0Var4, j);
                    }
                    this = hb0Var;
                    hb0Var2 = hb0Var5;
                } else {
                    if (hb0Var2 == hb0Var4) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = uw0.f6315a;
                        hb0 hb0Var8 = this;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(hb0Var8, f2192h, hb0Var2, hb0Var4);
                        hb0 hb0Var9 = hb0Var2;
                        hb0Var = hb0Var8;
                        if (zCompareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(hb0Var, j) != hb0Var9) {
                            break;
                        }
                        this = hb0Var;
                        hb0Var2 = hb0Var9;
                    }
                }
            }
            this = hb0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m1291j(hb0 hb0Var) {
        hb0 hb0Var2;
        while (true) {
            f2189e.getClass();
            if (hb0Var == null) {
                C0921xc.m5123d();
                return;
            }
            Unsafe unsafe = uw0.f6315a;
            long j = f2192h;
            hb0 hb0Var3 = (hb0) unsafe.getObjectVolatile(hb0Var, j);
            if (this.m1292k() != hb0Var) {
                return;
            }
            while (hb0Var != null) {
                Unsafe unsafe2 = uw0.f6315a;
                hb0Var2 = this;
                hb0 hb0Var4 = hb0Var;
                if (unsafe2.compareAndSwapObject(hb0Var4, f2192h, hb0Var3, hb0Var2)) {
                    if (hb0Var2.mo1295n()) {
                        hb0Var4.m1290h();
                        return;
                    }
                    return;
                } else {
                    if (hb0Var4 == null) {
                        C0921xc.m5123d();
                        return;
                    }
                    hb0Var = hb0Var4;
                    if (unsafe2.getObjectVolatile(hb0Var4, j) != hb0Var3) {
                        break;
                    } else {
                        this = hb0Var2;
                    }
                }
            }
            C0921xc.m5123d();
            return;
            this = hb0Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Object m1292k() {
        f2188d.getClass();
        return uw0.f6315a.getObjectVolatile(this, f2191g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final hb0 m1293l() {
        Object objM1292k = m1292k();
        pu0 pu0Var = objM1292k instanceof pu0 ? (pu0) objM1292k : null;
        if (pu0Var != null) {
            return pu0Var.f4968a;
        }
        objM1292k.getClass();
        return (hb0) objM1292k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final hb0 m1294m() {
        hb0 hb0VarM1290h = m1290h();
        if (hb0VarM1290h != null) {
            return hb0VarM1290h;
        }
        f2189e.getClass();
        return m1286i((hb0) uw0.f6315a.getObjectVolatile(this, f2192h));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public boolean mo1295n() {
        return m1292k() instanceof pu0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final hb0 m1296o() {
        hb0 hb0Var;
        while (true) {
            Object objM1292k = this.m1292k();
            if (objM1292k instanceof pu0) {
                return ((pu0) objM1292k).f4968a;
            }
            if (objM1292k == this) {
                return (hb0) objM1292k;
            }
            objM1292k.getClass();
            hb0 hb0Var2 = (hb0) objM1292k;
            pu0 pu0VarM1297p = hb0Var2.m1297p();
            while (true) {
                f2188d.getClass();
                Unsafe unsafe = uw0.f6315a;
                long j = f2191g;
                hb0Var = this;
                if (unsafe.compareAndSwapObject(hb0Var, j, objM1292k, pu0VarM1297p)) {
                    hb0Var2.m1290h();
                    return null;
                }
                if (unsafe.getObjectVolatile(hb0Var, j) != objM1292k) {
                    break;
                }
                this = hb0Var;
            }
            this = hb0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final pu0 m1297p() {
        f2190f.getClass();
        Unsafe unsafe = uw0.f6315a;
        long j = f2193i;
        pu0 pu0Var = (pu0) unsafe.getObjectVolatile(this, j);
        if (pu0Var != null) {
            return pu0Var;
        }
        pu0 pu0Var2 = new pu0(this);
        unsafe.putObjectVolatile(this, j, pu0Var2);
        return pu0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return new x70(1, 2, AbstractC0398kl.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC0398kl.m1927m(this);
    }
}
