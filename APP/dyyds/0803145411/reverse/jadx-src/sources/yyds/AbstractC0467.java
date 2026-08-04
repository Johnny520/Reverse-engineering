package yyds;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛲᲁᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0467 extends AbstractC0974 implements InterfaceC2800 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f2319;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f2320;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f2321;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int f2322 = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f2323;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0217 f2324;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public long f2325;

    static {
        Unsafe unsafe = AbstractC2112.f10448;
        f2320 = unsafe.objectFieldOffset(AbstractC0467.class.getDeclaredField("_queue$volatile"));
        f2321 = unsafe.objectFieldOffset(AbstractC0467.class.getDeclaredField("_delayed$volatile"));
        f2319 = unsafe.objectFieldOffset(AbstractC0467.class.getDeclaredField("_isCompleted$volatile"));
    }

    public void shutdown() {
        C0415 c0415;
        Unsafe unsafe;
        AbstractRunnableC1665 abstractRunnableC1665M2355;
        AbstractC2567.f12653.set(null);
        AbstractC2112.f10448.putIntVolatile(this, f2319, 1);
        C0415 c04152 = AbstractC1579.f8016;
        long j = f2320;
        loop0: while (true) {
            Object objectVolatile = AbstractC2112.f10448.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = AbstractC2112.f10448;
                    c0415 = c04152;
                    if (unsafe2.compareAndSwapObject(this, f2320, (Object) null, c04152)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) != null) {
                        break;
                    } else {
                        c04152 = c0415;
                    }
                }
                c04152 = c0415;
            } else {
                c0415 = c04152;
                if (objectVolatile instanceof C0071) {
                    ((C0071) objectVolatile).m446();
                    break;
                }
                if (objectVolatile == c0415) {
                    break;
                }
                C0071 c0071 = new C0071(8, true);
                c0071.m445((Runnable) objectVolatile);
                do {
                    unsafe = AbstractC2112.f10448;
                    if (unsafe.compareAndSwapObject(this, f2320, objectVolatile, c0071)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                c04152 = c0415;
            }
        }
        while (m1248() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C2092 c2092 = (C2092) AbstractC2112.f10448.getObjectVolatile(this, f2321);
            if (c2092 == null) {
                return;
            }
            synchronized (c2092) {
                abstractRunnableC1665M2355 = c2092.m2354() > 0 ? c2092.m2355(0) : null;
            }
            if (abstractRunnableC1665M2355 == null) {
                return;
            } else {
                mo1254(jNanoTime, abstractRunnableC1665M2355);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public final void m1242(boolean z) {
        long j = this.f2325 - (z ? 4294967296L : 1L);
        this.f2325 = j;
        if (j <= 0 && this.f2323) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public final boolean m1243() {
        C0217 c0217 = this.f2324;
        if (c0217 == null) {
            return false;
        }
        AbstractC2017 abstractC2017 = (AbstractC2017) (c0217.isEmpty() ? null : c0217.removeFirst());
        if (abstractC2017 == null) {
            return false;
        }
        abstractC2017.run();
        return true;
    }

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public final boolean m1244() {
        C0217 c0217 = this.f2324;
        if (c0217 != null ? c0217.isEmpty() : true) {
            Unsafe unsafe = AbstractC2112.f10448;
            C2092 c2092 = (C2092) unsafe.getObjectVolatile(this, f2321);
            if (c2092 != null && c2092.m2354() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, f2320);
            if (objectVolatile != null) {
                if (objectVolatile instanceof C0071) {
                    long longVolatile = unsafe.getLongVolatile((C0071) objectVolatile, C0071.f623);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == AbstractC1579.f8016) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public abstract Thread mo1245();

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public final void m1246(long j, AbstractRunnableC1665 abstractRunnableC1665) {
        AbstractC0467 abstractC0467;
        int iM3406;
        Unsafe unsafe;
        Thread threadMo1245;
        long j2 = f2321;
        Unsafe unsafe2 = AbstractC2112.f10448;
        if (unsafe2.getIntVolatile(this, f2319) != 0) {
            abstractC0467 = this;
            iM3406 = 1;
        } else {
            C2092 c2092 = (C2092) unsafe2.getObjectVolatile(this, j2);
            if (c2092 == null) {
                C2092 c20922 = new C2092();
                c20922.f10380 = j;
                while (true) {
                    unsafe = AbstractC2112.f10448;
                    abstractC0467 = this;
                    if (unsafe.compareAndSwapObject(abstractC0467, f2321, (Object) null, c20922) || unsafe.getObjectVolatile(abstractC0467, j2) != null) {
                        break;
                    } else {
                        this = abstractC0467;
                    }
                }
                c2092 = (C2092) unsafe.getObjectVolatile(abstractC0467, j2);
                unsafe2 = unsafe;
            } else {
                abstractC0467 = this;
            }
            iM3406 = abstractRunnableC1665.m3406(j, c2092, abstractC0467);
        }
        if (iM3406 != 0) {
            if (iM3406 == 1) {
                abstractC0467.mo1254(j, abstractRunnableC1665);
                return;
            } else {
                if (iM3406 == 2) {
                    return;
                }
                C0188.m800("unexpected result");
                return;
            }
        }
        C2092 c20923 = (C2092) unsafe2.getObjectVolatile(abstractC0467, j2);
        if (c20923 != null) {
            synchronized (c20923) {
                AbstractRunnableC1665[] abstractRunnableC1665Arr = c20923.f5367;
                abstractRunnableC1665 = abstractRunnableC1665Arr != null ? abstractRunnableC1665Arr[0] : null;
            }
        }
        if (abstractRunnableC1665 != abstractRunnableC1665 || Thread.currentThread() == (threadMo1245 = abstractC0467.mo1245())) {
            return;
        }
        LockSupport.unpark(threadMo1245);
    }

    @Override // yyds.InterfaceC2800
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final void mo1247(long j, C1853 c1853) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C0166 c0166 = new C0166(this, j2 + jNanoTime, c1853);
            m1246(jNanoTime, c0166);
            c1853.m3636(new C0385(2, c0166));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r6 = r3;
        r13 = null;
     */
    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m1248() {
        Unsafe unsafe;
        AbstractC0467 abstractC0467;
        Unsafe unsafe2;
        Runnable runnable;
        AbstractRunnableC1665 abstractRunnableC1665;
        C0415 c0415 = AbstractC1579.f8016;
        long j = f2320;
        if (!m1243()) {
            m1255();
            loop0: while (true) {
                unsafe = AbstractC2112.f10448;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile == null) {
                    abstractC0467 = this;
                    break;
                }
                if (objectVolatile instanceof C0071) {
                    C0071 c0071 = (C0071) objectVolatile;
                    Object objM448 = c0071.m448();
                    if (objM448 != C0071.f622) {
                        Runnable runnable2 = (Runnable) objM448;
                        abstractC0467 = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    C0071 c0071M447 = c0071.m447();
                    while (true) {
                        Unsafe unsafe3 = AbstractC2112.f10448;
                        abstractC0467 = this;
                        if (!unsafe3.compareAndSwapObject(abstractC0467, f2320, objectVolatile, c0071M447) && unsafe3.getObjectVolatile(abstractC0467, j) == objectVolatile) {
                            this = abstractC0467;
                        }
                    }
                    this = abstractC0467;
                } else {
                    abstractC0467 = this;
                    if (objectVolatile == c0415) {
                        break;
                    }
                    do {
                        unsafe2 = AbstractC2112.f10448;
                        if (unsafe2.compareAndSwapObject(abstractC0467, f2320, objectVolatile, (Object) null)) {
                            runnable = (Runnable) objectVolatile;
                            unsafe = unsafe2;
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(abstractC0467, j) == objectVolatile);
                    this = abstractC0467;
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C0217 c0217 = abstractC0467.f2324;
            if (((c0217 == null || c0217.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(abstractC0467, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof C0071) {
                        long longVolatile = unsafe2.getLongVolatile((C0071) objectVolatile2, C0071.f623);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == c0415) {
                        return Long.MAX_VALUE;
                    }
                }
                C2092 c2092 = (C2092) unsafe.getObjectVolatile(abstractC0467, f2321);
                if (c2092 != null) {
                    synchronized (c2092) {
                        AbstractRunnableC1665[] abstractRunnableC1665Arr = c2092.f5367;
                        abstractRunnableC1665 = abstractRunnableC1665Arr != null ? abstractRunnableC1665Arr[0] : null;
                    }
                    if (abstractRunnableC1665 != null) {
                        long jNanoTime = abstractRunnableC1665.f8518 - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1249(Runnable runnable) {
        AbstractC0467 abstractC0467;
        Runnable runnable2;
        Unsafe unsafe;
        Unsafe unsafe2;
        loop0: while (true) {
            Unsafe unsafe3 = AbstractC2112.f10448;
            long j = f2320;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (unsafe3.getIntVolatile(this, f2319) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe4 = AbstractC2112.f10448;
                    AbstractC0467 abstractC04672 = this;
                    runnable2 = runnable;
                    abstractC0467 = abstractC04672;
                    if (unsafe4.compareAndSwapObject(abstractC04672, f2320, (Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(abstractC0467, j) != null) {
                        break;
                    }
                    this = abstractC0467;
                    runnable = runnable2;
                }
                this = abstractC0467;
                runnable = runnable2;
            } else {
                abstractC0467 = this;
                runnable2 = runnable;
                if (objectVolatile instanceof C0071) {
                    C0071 c0071 = (C0071) objectVolatile;
                    int iM445 = c0071.m445(runnable2);
                    if (iM445 == 0) {
                        break;
                    }
                    if (iM445 == 1) {
                        C0071 c0071M447 = c0071.m447();
                        do {
                            unsafe2 = AbstractC2112.f10448;
                            if (unsafe2.compareAndSwapObject(abstractC0467, f2320, objectVolatile, c0071M447)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(abstractC0467, j) == objectVolatile);
                    } else if (iM445 == 2) {
                        break;
                    }
                    this = abstractC0467;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == AbstractC1579.f8016) {
                        break;
                    }
                    C0071 c00712 = new C0071(8, true);
                    c00712.m445((Runnable) objectVolatile);
                    c00712.m445(runnable2);
                    do {
                        unsafe = AbstractC2112.f10448;
                        if (unsafe.compareAndSwapObject(abstractC0467, f2320, objectVolatile, c00712)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(abstractC0467, j) == objectVolatile);
                    this = abstractC0467;
                    runnable = runnable2;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public final void m1250(boolean z) {
        this.f2325 = (z ? 4294967296L : 1L) + this.f2325;
        if (z) {
            return;
        }
        this.f2323 = true;
    }

    @Override // yyds.AbstractC0974
    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public final void mo1251(InterfaceC2213 interfaceC2213, Runnable runnable) {
        mo1252(runnable);
    }

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public void mo1252(Runnable runnable) {
        m1255();
        if (!m1249(runnable)) {
            RunnableC1433.f6788.mo1252(runnable);
            return;
        }
        Thread threadMo1245 = mo1245();
        if (Thread.currentThread() != threadMo1245) {
            LockSupport.unpark(threadMo1245);
        }
    }

    @Override // yyds.InterfaceC2800
    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public InterfaceC0970 mo1253(long j, RunnableC1993 runnableC1993, InterfaceC2213 interfaceC2213) {
        return AbstractC2465.f12170.mo1253(j, runnableC1993, interfaceC2213);
    }

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public void mo1254(long j, AbstractRunnableC1665 abstractRunnableC1665) {
        RunnableC1433.f6788.m1246(j, abstractRunnableC1665);
    }

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public final void m1255() {
        AbstractRunnableC1665 abstractRunnableC1665M2355;
        C2092 c2092 = (C2092) AbstractC2112.f10448.getObjectVolatile(this, f2321);
        if (c2092 == null || c2092.m2354() == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c2092) {
                try {
                    AbstractRunnableC1665[] abstractRunnableC1665Arr = c2092.f5367;
                    AbstractRunnableC1665 abstractRunnableC1665 = abstractRunnableC1665Arr != null ? abstractRunnableC1665Arr[0] : null;
                    if (abstractRunnableC1665 != null) {
                        abstractRunnableC1665M2355 = ((jNanoTime - abstractRunnableC1665.f8518) > 0L ? 1 : ((jNanoTime - abstractRunnableC1665.f8518) == 0L ? 0 : -1)) >= 0 ? m1249(abstractRunnableC1665) : false ? c2092.m2355(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC1665M2355 != null);
    }
}
