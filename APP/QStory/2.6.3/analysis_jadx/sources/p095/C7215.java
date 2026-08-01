package p095;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import p291.AbstractC8493;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7215 {
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReferenceArray f19257 = new AtomicReferenceArray(128);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19256 = AtomicReferenceFieldUpdater.newUpdater(C7215.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ long f19252 = AbstractC8493.f23591.objectFieldOffset(C7215.class.getDeclaredField("lastScheduledTask$volatile"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19255 = AtomicIntegerFieldUpdater.newUpdater(C7215.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19254 = AtomicIntegerFieldUpdater.newUpdater(C7215.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19253 = AtomicIntegerFieldUpdater.newUpdater(C7215.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractRunnableC7212 m12456() {
        AbstractRunnableC7212 abstractRunnableC7212;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19254;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f19255.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC7212 = (AbstractRunnableC7212) this.f19257.getAndSet(i2, null)) != null) {
                if (abstractRunnableC7212.f19248) {
                    f19253.decrementAndGet(this);
                }
                return abstractRunnableC7212;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractRunnableC7212 m12457() {
        f19256.getClass();
        AbstractRunnableC7212 abstractRunnableC7212 = (AbstractRunnableC7212) AbstractC8493.f23591.getAndSetObject(this, f19252, (Object) null);
        return abstractRunnableC7212 == null ? m12456() : abstractRunnableC7212;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12458(C7206 c7206) {
        f19256.getClass();
        AbstractRunnableC7212 abstractRunnableC7212 = (AbstractRunnableC7212) AbstractC8493.f23591.getAndSetObject(this, f19252, (Object) null);
        if (abstractRunnableC7212 != null) {
            c7206.m10410(abstractRunnableC7212);
        }
        while (true) {
            AbstractRunnableC7212 abstractRunnableC7212M12456 = m12456();
            if (abstractRunnableC7212M12456 == null) {
                return;
            } else {
                c7206.m10410(abstractRunnableC7212M12456);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m12459() {
        f19256.getClass();
        Object objectVolatile = AbstractC8493.f23591.getObjectVolatile(this, f19252);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19254;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f19255;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractRunnableC7212 m12460(AbstractRunnableC7212 abstractRunnableC7212) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19255;
        if (atomicIntegerFieldUpdater.get(this) - f19254.get(this) == 127) {
            return abstractRunnableC7212;
        }
        if (abstractRunnableC7212.f19248) {
            f19253.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f19257;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, abstractRunnableC7212);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractRunnableC7212 m12461(AbstractRunnableC7212 abstractRunnableC7212, boolean z) {
        if (z) {
            return m12460(abstractRunnableC7212);
        }
        f19256.getClass();
        AbstractRunnableC7212 abstractRunnableC72122 = (AbstractRunnableC7212) AbstractC8493.f23591.getAndSetObject(this, f19252, abstractRunnableC7212);
        if (abstractRunnableC72122 == null) {
            return null;
        }
        return m12460(abstractRunnableC72122);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractRunnableC7212 m12462(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f19257;
        AbstractRunnableC7212 abstractRunnableC7212 = (AbstractRunnableC7212) atomicReferenceArray.get(i2);
        if (abstractRunnableC7212 != null && abstractRunnableC7212.f19248 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC7212, null)) {
                if (atomicReferenceArray.get(i2) != abstractRunnableC7212) {
                }
            }
            if (z) {
                f19253.decrementAndGet(this);
            }
            return abstractRunnableC7212;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r9 = p095.C7215.f19254.get(r4);
        r1 = p095.C7215.f19255.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (p095.C7215.f19253.get(r4) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r1 = r1 - 1;
        r2 = r4.m12462(r1, true);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final p095.AbstractRunnableC7212 m12463() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p095.C7215.f19256
            r0.getClass()
            sun.misc.Unsafe r0 = p291.AbstractC8493.f23591
            long r1 = p095.C7215.f19252
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲 r7 = (p095.AbstractRunnableC7212) r7
            r0 = 1
            if (r7 != 0) goto L15
        L13:
            r4 = r9
            goto L30
        L15:
            boolean r3 = r7.f19248
            if (r3 != r0) goto L13
        L19:
            sun.misc.Unsafe r3 = p291.AbstractC8493.f23591
            long r5 = p095.C7215.f19252
            r8 = 0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L26
            return r7
        L26:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L2e
            r9 = r4
            goto L0
        L2e:
            r9 = r4
            goto L19
        L30:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = p095.C7215.f19254
            int r9 = r9.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p095.C7215.f19255
            int r1 = r1.get(r4)
        L3c:
            if (r9 == r1) goto L50
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = p095.C7215.f19253
            int r2 = r2.get(r4)
            if (r2 != 0) goto L47
            goto L50
        L47:
            int r1 = r1 + (-1)
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲 r2 = r4.m12462(r1, r0)
            if (r2 == 0) goto L3c
            return r2
        L50:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p095.C7215.m12463():飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲");
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Object, 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long m12464(Ref$ObjectRef ref$ObjectRef, int i) {
        C7215 c7215;
        while (true) {
            f19256.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f19252;
            ?? r7 = (AbstractRunnableC7212) unsafe.getObjectVolatile(this, j);
            if (r7 == 0) {
                return -2L;
            }
            if (((r7.f19248 ? 1 : 2) & i) == 0) {
                return -2L;
            }
            AbstractC7217.f19259.getClass();
            long jNanoTime = System.nanoTime() - r7.f19249;
            long j2 = AbstractC7217.f19263;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = AbstractC8493.f23591;
                c7215 = this;
                if (unsafe2.compareAndSwapObject(c7215, f19252, (Object) r7, (Object) null)) {
                    ref$ObjectRef.element = r7;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(c7215, j) != r7) {
                    break;
                }
                this = c7215;
            }
            this = c7215;
        }
    }
}
