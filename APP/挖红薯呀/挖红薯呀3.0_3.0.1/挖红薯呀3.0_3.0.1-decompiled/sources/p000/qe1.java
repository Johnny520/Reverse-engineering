package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class qe1 {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f5137a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5132b = AtomicReferenceFieldUpdater.newUpdater(qe1.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f5136f = uw0.f6315a.objectFieldOffset(qe1.class.getDeclaredField("lastScheduledTask$volatile"));

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5133c = AtomicIntegerFieldUpdater.newUpdater(qe1.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5134d = AtomicIntegerFieldUpdater.newUpdater(qe1.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5135e = AtomicIntegerFieldUpdater.newUpdater(qe1.class, "blockingTasksInBuffer$volatile");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final o61 m3233a(o61 o61Var, boolean z) {
        if (z) {
            return m3234b(o61Var);
        }
        f5132b.getClass();
        o61 o61Var2 = (o61) uw0.f6315a.getAndSetObject(this, f5136f, o61Var);
        if (o61Var2 == null) {
            return null;
        }
        return m3234b(o61Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final o61 m3234b(o61 o61Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5133c;
        if (atomicIntegerFieldUpdater.get(this) - f5134d.get(this) == 127) {
            return o61Var;
        }
        if (o61Var.f4470e) {
            f5135e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f5137a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, o61Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m3235c() {
        f5132b.getClass();
        Object objectVolatile = uw0.f6315a.getObjectVolatile(this, f5136f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5134d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f5133c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m3236d(C0594ox c0594ox) {
        f5132b.getClass();
        o61 o61Var = (o61) uw0.f6315a.getAndSetObject(this, f5136f, (Object) null);
        if (o61Var != null) {
            c0594ox.m1572a(o61Var);
        }
        while (true) {
            o61 o61VarM3238f = m3238f();
            if (o61VarM3238f == null) {
                return;
            } else {
                c0594ox.m1572a(o61VarM3238f);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final o61 m3237e() {
        f5132b.getClass();
        o61 o61Var = (o61) uw0.f6315a.getAndSetObject(this, f5136f, (Object) null);
        return o61Var == null ? m3238f() : o61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final o61 m3238f() {
        o61 o61Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5134d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f5133c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (o61Var = (o61) this.f5137a.getAndSet(i2, null)) != null) {
                if (o61Var.f4470e) {
                    f5135e.decrementAndGet(this);
                }
                return o61Var;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r9 = p000.qe1.f5134d.get(r4);
        r1 = p000.qe1.f5133c.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (p000.qe1.f5135e.get(r4) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r1 = r1 - 1;
        r2 = r4.m3240h(r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        r4 = r9;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o61 m3239g() {
        qe1 qe1Var;
        while (true) {
            f5132b.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f5136f;
            o61 o61Var = (o61) unsafe.getObjectVolatile(this, j);
            if (o61Var == null || !o61Var.f4470e) {
                break;
            }
            while (true) {
                Unsafe unsafe2 = uw0.f6315a;
                qe1Var = this;
                if (unsafe2.compareAndSwapObject(qe1Var, f5136f, o61Var, (Object) null)) {
                    return o61Var;
                }
                if (unsafe2.getObjectVolatile(qe1Var, j) != o61Var) {
                    break;
                }
                this = qe1Var;
            }
            this = qe1Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final o61 m3240h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f5137a;
        o61 o61Var = (o61) atomicReferenceArray.get(i2);
        if (o61Var != null && o61Var.f4470e == z) {
            while (!atomicReferenceArray.compareAndSet(i2, o61Var, null)) {
                if (atomicReferenceArray.get(i2) != o61Var) {
                }
            }
            if (z) {
                f5135e.decrementAndGet(this);
            }
            return o61Var;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final long m3241i(int i, zt0 zt0Var) {
        qe1 qe1Var;
        while (true) {
            f5132b.getClass();
            Unsafe unsafe = uw0.f6315a;
            long j = f5136f;
            o61 o61Var = (o61) unsafe.getObjectVolatile(this, j);
            if (o61Var == null) {
                return -2L;
            }
            if (((o61Var.f4470e ? 1 : 2) & i) == 0) {
                return -2L;
            }
            q61.f5077f.getClass();
            long jNanoTime = System.nanoTime() - o61Var.f4469d;
            long j2 = q61.f5073b;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = uw0.f6315a;
                qe1Var = this;
                if (unsafe2.compareAndSwapObject(qe1Var, f5136f, o61Var, (Object) null)) {
                    zt0Var.f7995d = o61Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(qe1Var, j) != o61Var) {
                    break;
                }
                this = qe1Var;
            }
            this = qe1Var;
        }
    }
}
