package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ij */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0321ij {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2575a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0321ij.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2576b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ long f2577c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ long f2578d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Unsafe unsafe = uw0.f6315a;
        f2577c = unsafe.objectFieldOffset(AbstractC0321ij.class.getDeclaredField("_next$volatile"));
        f2576b = AtomicReferenceFieldUpdater.newUpdater(AbstractC0321ij.class, Object.class, "_prev$volatile");
        f2578d = unsafe.objectFieldOffset(AbstractC0321ij.class.getDeclaredField("_prev$volatile"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0321ij(nz0 nz0Var) {
        this._prev$volatile = nz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1582a() {
        f2576b.getClass();
        uw0.f6315a.putObjectVolatile(this, f2578d, (Object) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final AbstractC0321ij m1583b() {
        AbstractC0321ij abstractC0321ijM1586e = m1586e();
        while (abstractC0321ijM1586e != null && abstractC0321ijM1586e.mo1587f()) {
            f2576b.getClass();
            abstractC0321ijM1586e = (AbstractC0321ij) uw0.f6315a.getObjectVolatile(abstractC0321ijM1586e, f2578d);
        }
        return abstractC0321ijM1586e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final AbstractC0321ij m1584c() {
        Object objM1585d = m1585d();
        if (objM1585d == AbstractC0398kl.f3199j) {
            return null;
        }
        return (AbstractC0321ij) objM1585d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m1585d() {
        f2575a.getClass();
        return uw0.f6315a.getObjectVolatile(this, f2577c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final AbstractC0321ij m1586e() {
        f2576b.getClass();
        return (AbstractC0321ij) uw0.f6315a.getObjectVolatile(this, f2578d);
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo1587f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m1588g() {
        C1014zr c1014zr = AbstractC0398kl.f3199j;
        while (true) {
            f2575a.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f2577c;
            AbstractC0321ij abstractC0321ij = this;
            if (unsafe.compareAndSwapObject(abstractC0321ij, j, (Object) null, c1014zr)) {
                return true;
            }
            if (unsafe.getObjectVolatile(abstractC0321ij, j) != null) {
                return false;
            }
            this = abstractC0321ij;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m1589h() {
        AbstractC0321ij abstractC0321ij;
        Unsafe unsafe;
        if (m1584c() == null) {
            return;
        }
        while (true) {
            AbstractC0321ij abstractC0321ijM1583b = m1583b();
            AbstractC0321ij abstractC0321ijM1584c = m1584c();
            abstractC0321ijM1584c.getClass();
            do {
                abstractC0321ij = abstractC0321ijM1584c;
                if (!abstractC0321ij.mo1587f()) {
                    break;
                } else {
                    abstractC0321ijM1584c = abstractC0321ij.m1584c();
                }
            } while (abstractC0321ijM1584c != null);
            while (true) {
                f2576b.getClass();
                Unsafe unsafe2 = uw0.f6315a;
                long j = f2578d;
                Object objectVolatile = unsafe2.getObjectVolatile(abstractC0321ij, j);
                AbstractC0321ij abstractC0321ij2 = ((AbstractC0321ij) objectVolatile) == null ? null : abstractC0321ijM1583b;
                do {
                    unsafe = uw0.f6315a;
                    if (unsafe.compareAndSwapObject(abstractC0321ij, f2578d, objectVolatile, abstractC0321ij2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(abstractC0321ij, j) == objectVolatile);
            }
            if (abstractC0321ijM1583b != null) {
                f2575a.getClass();
                unsafe.putObjectVolatile(abstractC0321ijM1583b, f2577c, abstractC0321ij);
            }
            if (!abstractC0321ij.mo1587f() || abstractC0321ij.m1584c() == null) {
                if (abstractC0321ijM1583b == null || !abstractC0321ijM1583b.mo1587f()) {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m1590i(nz0 nz0Var) {
        while (true) {
            f2575a.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f2577c;
            AbstractC0321ij abstractC0321ij = this;
            nz0 nz0Var2 = nz0Var;
            if (unsafe.compareAndSwapObject(abstractC0321ij, j, (Object) null, nz0Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(abstractC0321ij, j) != null) {
                return false;
            }
            this = abstractC0321ij;
            nz0Var = nz0Var2;
        }
    }
}
