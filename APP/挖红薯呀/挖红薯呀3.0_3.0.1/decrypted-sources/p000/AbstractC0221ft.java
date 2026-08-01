package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ft */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0221ft extends AbstractC0030at implements InterfaceC0657qm {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1803j = AtomicReferenceFieldUpdater.newUpdater(AbstractC0221ft.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1804k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1805l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ long f1806m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ long f1807n;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Unsafe unsafe = uw0.f6315a;
        f1807n = unsafe.objectFieldOffset(AbstractC0221ft.class.getDeclaredField("_queue$volatile"));
        f1804k = AtomicReferenceFieldUpdater.newUpdater(AbstractC0221ft.class, Object.class, "_delayed$volatile");
        f1806m = unsafe.objectFieldOffset(AbstractC0221ft.class.getDeclaredField("_delayed$volatile"));
        f1805l = AtomicIntegerFieldUpdater.newUpdater(AbstractC0221ft.class, "_isCompleted$volatile");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m1176A() {
        AbstractRunnableC0140dt abstractRunnableC0140dtM32b;
        f1804k.getClass();
        C0184et c0184et = (C0184et) uw0.f6315a.getObjectVolatile(this, f1806m);
        if (c0184et == null || a81.f70b.get(c0184et) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c0184et) {
                try {
                    AbstractRunnableC0140dt[] abstractRunnableC0140dtArr = c0184et.f71a;
                    AbstractRunnableC0140dt abstractRunnableC0140dt = abstractRunnableC0140dtArr != null ? abstractRunnableC0140dtArr[0] : null;
                    if (abstractRunnableC0140dt != null) {
                        abstractRunnableC0140dtM32b = ((jNanoTime - abstractRunnableC0140dt.f1171d) > 0L ? 1 : ((jNanoTime - abstractRunnableC0140dt.f1171d) == 0L ? 0 : -1)) >= 0 ? m1177B(abstractRunnableC0140dt) : false ? c0184et.m32b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC0140dtM32b != null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1177B(Runnable runnable) {
        AbstractC0221ft abstractC0221ft;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        loop0: while (true) {
            f1803j.getClass();
            Unsafe unsafe3 = uw0.f6315a;
            long j = f1807n;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (f1805l.get(this) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = uw0.f6315a;
                    AbstractC0221ft abstractC0221ft2 = this;
                    runnable2 = runnable;
                    abstractC0221ft = abstractC0221ft2;
                    if (unsafe4.compareAndSwapObject(abstractC0221ft2, f1807n, (Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(abstractC0221ft, j) != null) {
                        break;
                    }
                    this = abstractC0221ft;
                    runnable = runnable2;
                }
                this = abstractC0221ft;
                runnable = runnable2;
            } else {
                abstractC0221ft = this;
                runnable2 = runnable;
                if (objectVolatile instanceof kb0) {
                    kb0 kb0Var = (kb0) objectVolatile;
                    int iM1783a = kb0Var.m1783a(runnable2);
                    if (iM1783a == 0) {
                        break;
                    }
                    if (iM1783a == 1) {
                        kb0 kb0VarM1786d = kb0Var.m1786d();
                        do {
                            unsafe2 = uw0.f6315a;
                            if (unsafe2.compareAndSwapObject(abstractC0221ft, f1807n, objectVolatile, kb0VarM1786d)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(abstractC0221ft, j) == objectVolatile);
                    } else if (iM1783a == 2) {
                        break;
                    }
                    this = abstractC0221ft;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == AbstractC0307i4.f2424e) {
                        break;
                    }
                    kb0 kb0Var2 = new kb0(8, true);
                    kb0Var2.m1783a((Runnable) objectVolatile);
                    kb0Var2.m1783a(runnable2);
                    do {
                        unsafe = uw0.f6315a;
                        if (unsafe.compareAndSwapObject(abstractC0221ft, f1807n, objectVolatile, kb0Var2)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(abstractC0221ft, j) == objectVolatile);
                    this = abstractC0221ft;
                    runnable = runnable2;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final long m1178C() {
        AbstractRunnableC0140dt abstractRunnableC0140dt;
        C0917x8 c0917x8 = this.f263h;
        if (((c0917x8 == null || c0917x8.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            f1803j.getClass();
            Unsafe unsafe = uw0.f6315a;
            Object objectVolatile = unsafe.getObjectVolatile(this, f1807n);
            if (objectVolatile != null) {
                if (objectVolatile instanceof kb0) {
                    long j = kb0.f3059f.get((kb0) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == AbstractC0307i4.f2424e) {
                    return Long.MAX_VALUE;
                }
            }
            f1804k.getClass();
            C0184et c0184et = (C0184et) unsafe.getObjectVolatile(this, f1806m);
            if (c0184et != null) {
                synchronized (c0184et) {
                    AbstractRunnableC0140dt[] abstractRunnableC0140dtArr = c0184et.f71a;
                    abstractRunnableC0140dt = abstractRunnableC0140dtArr != null ? abstractRunnableC0140dtArr[0] : null;
                }
                if (abstractRunnableC0140dt != null) {
                    long jNanoTime = abstractRunnableC0140dt.f1171d - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: D */
    public abstract Thread mo1179D();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final boolean m1180E() {
        C0917x8 c0917x8 = this.f263h;
        if (c0917x8 != null ? c0917x8.isEmpty() : true) {
            f1804k.getClass();
            Unsafe unsafe = uw0.f6315a;
            C0184et c0184et = (C0184et) unsafe.getObjectVolatile(this, f1806m);
            if (c0184et != null && a81.f70b.get(c0184et) != 0) {
                return false;
            }
            f1803j.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, f1807n);
            if (objectVolatile != null) {
                if (objectVolatile instanceof kb0) {
                    long j = kb0.f3059f.get((kb0) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == AbstractC0307i4.f2424e) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public void mo1181F(long j, AbstractRunnableC0140dt abstractRunnableC0140dt) {
        RunnableC0730sl.f5778o.m1184I(j, abstractRunnableC0140dt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m1182G() {
        AbstractRunnableC0140dt abstractRunnableC0140dtM32b;
        long jNanoTime = System.nanoTime();
        while (true) {
            f1804k.getClass();
            C0184et c0184et = (C0184et) uw0.f6315a.getObjectVolatile(this, f1806m);
            if (c0184et == null) {
                return;
            }
            synchronized (c0184et) {
                abstractRunnableC0140dtM32b = a81.f70b.get(c0184et) > 0 ? c0184et.m32b(0) : null;
            }
            if (abstractRunnableC0140dtM32b == null) {
                return;
            } else {
                mo1181F(jNanoTime, abstractRunnableC0140dtM32b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final void m1183H() {
        f1803j.getClass();
        Unsafe unsafe = uw0.f6315a;
        unsafe.putObjectVolatile(this, f1807n, (Object) null);
        f1804k.getClass();
        unsafe.putObjectVolatile(this, f1806m, (Object) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final void m1184I(long j, AbstractRunnableC0140dt abstractRunnableC0140dt) {
        Thread threadMo1179D;
        int iM1185J = m1185J(j, abstractRunnableC0140dt);
        if (iM1185J == 0) {
            if (!m1186K(abstractRunnableC0140dt) || Thread.currentThread() == (threadMo1179D = mo1179D())) {
                return;
            }
            LockSupport.unpark(threadMo1179D);
            return;
        }
        if (iM1185J == 1) {
            mo1181F(j, abstractRunnableC0140dt);
        } else {
            if (iM1185J == 2) {
                return;
            }
            C0921xc.m5134o("unexpected result");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final int m1185J(long j, AbstractRunnableC0140dt abstractRunnableC0140dt) {
        AbstractC0221ft abstractC0221ft;
        Unsafe unsafe;
        if (f1805l.get(this) != 0) {
            return 1;
        }
        f1804k.getClass();
        Unsafe unsafe2 = uw0.f6315a;
        long j2 = f1806m;
        C0184et c0184et = (C0184et) unsafe2.getObjectVolatile(this, j2);
        if (c0184et == null) {
            C0184et c0184et2 = new C0184et();
            c0184et2.f1525c = j;
            while (true) {
                unsafe = uw0.f6315a;
                abstractC0221ft = this;
                if (unsafe.compareAndSwapObject(abstractC0221ft, f1806m, (Object) null, c0184et2) || unsafe.getObjectVolatile(abstractC0221ft, j2) != null) {
                    break;
                }
                this = abstractC0221ft;
            }
            Object objectVolatile = unsafe.getObjectVolatile(abstractC0221ft, j2);
            objectVolatile.getClass();
            c0184et = (C0184et) objectVolatile;
        } else {
            abstractC0221ft = this;
        }
        return abstractRunnableC0140dt.m723b(j, c0184et, abstractC0221ft);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final boolean m1186K(AbstractRunnableC0140dt abstractRunnableC0140dt) {
        f1804k.getClass();
        C0184et c0184et = (C0184et) uw0.f6315a.getObjectVolatile(this, f1806m);
        if (c0184et != null) {
            synchronized (c0184et) {
                AbstractRunnableC0140dt[] abstractRunnableC0140dtArr = c0184et.f71a;
                abstractRunnableC0140dt = abstractRunnableC0140dtArr != null ? abstractRunnableC0140dtArr[0] : null;
            }
        }
        return abstractRunnableC0140dt == abstractRunnableC0140dt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0657qm
    /* JADX INFO: renamed from: c */
    public InterfaceC0622po mo1073c(long j, k81 k81Var, InterfaceC0618pk interfaceC0618pk) {
        return AbstractC0768tl.f6011a.mo1073c(j, k81Var, interfaceC0618pk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0657qm
    /* JADX INFO: renamed from: d */
    public final void mo1074d(long j, C0884wc c0884wc) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C0067bt c0067bt = new C0067bt(this, j2 + jNanoTime, c0884wc);
            m1184I(jNanoTime, c0067bt);
            c0884wc.m4995z(new C0684rc(1, c0067bt));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0692rk
    /* JADX INFO: renamed from: e */
    public final void mo358e(InterfaceC0618pk interfaceC0618pk, Runnable runnable) {
        mo1189z(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0030at
    /* JADX INFO: renamed from: q */
    public final long mo204q() {
        if (m205s()) {
            return 0L;
        }
        m1176A();
        Runnable runnableM1188y = m1188y();
        if (runnableM1188y == null) {
            return m1178C();
        }
        runnableM1188y.run();
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0030at
    public void shutdown() {
        y71.f7566a.set(null);
        f1805l.set(this, 1);
        m1187x();
        while (mo204q() <= 0) {
        }
        m1182G();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m1187x() {
        AbstractC0221ft abstractC0221ft;
        Unsafe unsafe;
        C1014zr c1014zr = AbstractC0307i4.f2424e;
        while (true) {
            f1803j.getClass();
            Unsafe unsafe2 = uw0.f6315a;
            long j = f1807n;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = uw0.f6315a;
                    abstractC0221ft = this;
                    if (unsafe3.compareAndSwapObject(abstractC0221ft, f1807n, (Object) null, c1014zr)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(abstractC0221ft, j) != null) {
                        break;
                    } else {
                        this = abstractC0221ft;
                    }
                }
            } else {
                abstractC0221ft = this;
                if (objectVolatile instanceof kb0) {
                    ((kb0) objectVolatile).m1785c();
                    return;
                }
                if (objectVolatile == c1014zr) {
                    return;
                }
                kb0 kb0Var = new kb0(8, true);
                kb0Var.m1783a((Runnable) objectVolatile);
                do {
                    unsafe = uw0.f6315a;
                    if (unsafe.compareAndSwapObject(abstractC0221ft, f1807n, objectVolatile, kb0Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(abstractC0221ft, j) == objectVolatile);
            }
            this = abstractC0221ft;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final Runnable m1188y() {
        AbstractC0221ft abstractC0221ft;
        Unsafe unsafe;
        while (true) {
            f1803j.getClass();
            Unsafe unsafe2 = uw0.f6315a;
            long j = f1807n;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof kb0) {
                kb0 kb0Var = (kb0) objectVolatile;
                Object objM1787e = kb0Var.m1787e();
                if (objM1787e != kb0.f3060g) {
                    return (Runnable) objM1787e;
                }
                kb0 kb0VarM1786d = kb0Var.m1786d();
                while (true) {
                    Unsafe unsafe3 = uw0.f6315a;
                    abstractC0221ft = this;
                    if (!unsafe3.compareAndSwapObject(abstractC0221ft, f1807n, objectVolatile, kb0VarM1786d) && unsafe3.getObjectVolatile(abstractC0221ft, j) == objectVolatile) {
                        this = abstractC0221ft;
                    }
                }
            } else {
                abstractC0221ft = this;
                if (objectVolatile == AbstractC0307i4.f2424e) {
                    return null;
                }
                do {
                    unsafe = uw0.f6315a;
                    if (unsafe.compareAndSwapObject(abstractC0221ft, f1807n, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(abstractC0221ft, j) == objectVolatile);
            }
            this = abstractC0221ft;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public void mo1189z(Runnable runnable) {
        m1176A();
        if (!m1177B(runnable)) {
            RunnableC0730sl.f5778o.mo1189z(runnable);
            return;
        }
        Thread threadMo1179D = mo1179D();
        if (Thread.currentThread() != threadMo1179D) {
            LockSupport.unpark(threadMo1179D);
        }
    }
}
