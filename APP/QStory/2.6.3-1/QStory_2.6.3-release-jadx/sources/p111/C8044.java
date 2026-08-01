package p111;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import p307.AbstractC9322;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8044 {
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReferenceArray f19602 = new AtomicReferenceArray(128);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19601 = AtomicReferenceFieldUpdater.newUpdater(C8044.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ long f19597 = AbstractC9322.f23936.objectFieldOffset(C8044.class.getDeclaredField("lastScheduledTask$volatile"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19600 = AtomicIntegerFieldUpdater.newUpdater(C8044.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19599 = AtomicIntegerFieldUpdater.newUpdater(C8044.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19598 = AtomicIntegerFieldUpdater.newUpdater(C8044.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractRunnableC8041 m13015() {
        AbstractRunnableC8041 abstractRunnableC8041;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19599;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f19600.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC8041 = (AbstractRunnableC8041) this.f19602.getAndSet(i2, null)) != null) {
                if (abstractRunnableC8041.f19593) {
                    f19598.decrementAndGet(this);
                }
                return abstractRunnableC8041;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractRunnableC8041 m13016() {
        f19601.getClass();
        AbstractRunnableC8041 abstractRunnableC8041 = (AbstractRunnableC8041) AbstractC9322.f23936.getAndSetObject(this, f19597, (Object) null);
        return abstractRunnableC8041 == null ? m13015() : abstractRunnableC8041;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13017(C8035 c8035) {
        f19601.getClass();
        AbstractRunnableC8041 abstractRunnableC8041 = (AbstractRunnableC8041) AbstractC9322.f23936.getAndSetObject(this, f19597, (Object) null);
        if (abstractRunnableC8041 != null) {
            c8035.m10969(abstractRunnableC8041);
        }
        while (true) {
            AbstractRunnableC8041 abstractRunnableC8041M13015 = m13015();
            if (abstractRunnableC8041M13015 == null) {
                return;
            } else {
                c8035.m10969(abstractRunnableC8041M13015);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m13018() {
        f19601.getClass();
        Object objectVolatile = AbstractC9322.f23936.getObjectVolatile(this, f19597);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19599;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f19600;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractRunnableC8041 m13019(AbstractRunnableC8041 abstractRunnableC8041) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19600;
        if (atomicIntegerFieldUpdater.get(this) - f19599.get(this) == 127) {
            return abstractRunnableC8041;
        }
        if (abstractRunnableC8041.f19593) {
            f19598.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f19602;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, abstractRunnableC8041);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractRunnableC8041 m13020(AbstractRunnableC8041 abstractRunnableC8041, boolean z) {
        if (z) {
            return m13019(abstractRunnableC8041);
        }
        f19601.getClass();
        AbstractRunnableC8041 abstractRunnableC80412 = (AbstractRunnableC8041) AbstractC9322.f23936.getAndSetObject(this, f19597, abstractRunnableC8041);
        if (abstractRunnableC80412 == null) {
            return null;
        }
        return m13019(abstractRunnableC80412);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractRunnableC8041 m13021(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f19602;
        AbstractRunnableC8041 abstractRunnableC8041 = (AbstractRunnableC8041) atomicReferenceArray.get(i2);
        if (abstractRunnableC8041 != null && abstractRunnableC8041.f19593 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC8041, null)) {
                if (atomicReferenceArray.get(i2) != abstractRunnableC8041) {
                }
            }
            if (z) {
                f19598.decrementAndGet(this);
            }
            return abstractRunnableC8041;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r9 = p111.C8044.f19599.get(r4);
        r1 = p111.C8044.f19600.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (p111.C8044.f19598.get(r4) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r1 = r1 - 1;
        r2 = r4.m13021(r1, true);
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
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC8041 m13022() {
        C8044 c8044;
        while (true) {
            f19601.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f19597;
            AbstractRunnableC8041 abstractRunnableC8041 = (AbstractRunnableC8041) unsafe.getObjectVolatile(this, j);
            if (abstractRunnableC8041 == null || !abstractRunnableC8041.f19593) {
                break;
            }
            while (true) {
                Unsafe unsafe2 = AbstractC9322.f23936;
                c8044 = this;
                if (unsafe2.compareAndSwapObject(c8044, f19597, abstractRunnableC8041, (Object) null)) {
                    return abstractRunnableC8041;
                }
                if (unsafe2.getObjectVolatile(c8044, j) != abstractRunnableC8041) {
                    break;
                }
                this = c8044;
            }
            this = c8044;
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Object, 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long m13023(Ref$ObjectRef ref$ObjectRef, int i) {
        C8044 c8044;
        while (true) {
            f19601.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f19597;
            ?? r7 = (AbstractRunnableC8041) unsafe.getObjectVolatile(this, j);
            if (r7 == 0) {
                return -2L;
            }
            if (((r7.f19593 ? 1 : 2) & i) == 0) {
                return -2L;
            }
            AbstractC8046.f19604.getClass();
            long jNanoTime = System.nanoTime() - r7.f19594;
            long j2 = AbstractC8046.f19608;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = AbstractC9322.f23936;
                c8044 = this;
                if (unsafe2.compareAndSwapObject(c8044, f19597, (Object) r7, (Object) null)) {
                    ref$ObjectRef.element = r7;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(c8044, j) != r7) {
                    break;
                }
                this = c8044;
            }
            this = c8044;
        }
    }
}
