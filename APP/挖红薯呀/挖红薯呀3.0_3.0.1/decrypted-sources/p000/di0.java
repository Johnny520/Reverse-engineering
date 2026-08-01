package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class di0 extends k01 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1112i = AtomicReferenceFieldUpdater.newUpdater(di0.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ long f1113j = uw0.f6315a.objectFieldOffset(di0.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile = pf1.f4841g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m711d() {
        return Math.max(k01.f2981f.get(this), 0) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r5 = p000.di0.f1112i;
        r3 = r0.f818e;
        r5.set(r3, null);
        r5 = r0.f817d;
        r5.m4981G(r1, r5.f2025f, new p000.C0835vc(0, new p000.C0532o(11, r3, r0)));
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m712e(AbstractC0358jk abstractC0358jk) {
        int iM713f = m713f();
        na1 na1Var = na1.f4229a;
        if (iM713f != 0) {
            if (iM713f != 1) {
                if (iM713f == 2) {
                    throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
                }
                C0921xc.m5134o("unexpected");
                return null;
            }
            C0884wc c0884wcM3496y = rd0.m3496y(rd0.m3497z(abstractC0358jk));
            try {
                ci0 ci0Var = new ci0(this, c0884wcM3496y);
                while (true) {
                    int andDecrement = k01.f2981f.getAndDecrement(this);
                    if (andDecrement <= 1) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (m1747a(ci0Var)) {
                            break;
                        }
                    }
                }
                Object objM4990t = c0884wcM3496y.m4990t();
                EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                if (objM4990t != enumC1007zk) {
                    objM4990t = na1Var;
                }
                if (objM4990t == enumC1007zk) {
                    return objM4990t;
                }
            } catch (Throwable th) {
                c0884wcM3496y.m4978D();
                throw th;
            }
        }
        return na1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m713f() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k01.f2981f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    f1112i.getClass();
                    uw0.f6315a.putObjectVolatile(this, f1113j, (Object) null);
                    return 0;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m714g(Object obj) {
        while (this.m711d()) {
            f1112i.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f1113j;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            C1014zr c1014zr = pf1.f4841g;
            if (objectVolatile != c1014zr) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = uw0.f6315a;
                    di0 di0Var = this;
                    if (unsafe2.compareAndSwapObject(di0Var, f1113j, objectVolatile, c1014zr)) {
                        di0Var.m1748b();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(di0Var, j) != objectVolatile) {
                            this = di0Var;
                            break;
                        }
                        this = di0Var;
                    }
                }
            }
        }
        C0921xc.m5134o("This mutex is not locked");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0398kl.m1927m(this));
        sb.append("[isLocked=");
        sb.append(m711d());
        sb.append(",owner=");
        f1112i.getClass();
        sb.append(uw0.f6315a.getObjectVolatile(this, f1113j));
        sb.append(']');
        return sb.toString();
    }
}
