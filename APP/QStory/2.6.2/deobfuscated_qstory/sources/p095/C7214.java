package p095;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import p291.AbstractC8501;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7214 {
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReferenceArray f19262 = new AtomicReferenceArray(128);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19261 = AtomicReferenceFieldUpdater.newUpdater(C7214.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ long f19257 = AbstractC8501.f23600.objectFieldOffset(C7214.class.getDeclaredField("lastScheduledTask$volatile"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19260 = AtomicIntegerFieldUpdater.newUpdater(C7214.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19259 = AtomicIntegerFieldUpdater.newUpdater(C7214.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19258 = AtomicIntegerFieldUpdater.newUpdater(C7214.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractRunnableC7211 m12429() {
        AbstractRunnableC7211 abstractRunnableC7211;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19259;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f19260.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC7211 = (AbstractRunnableC7211) this.f19262.getAndSet(i2, null)) != null) {
                if (abstractRunnableC7211.f19253) {
                    f19258.decrementAndGet(this);
                }
                return abstractRunnableC7211;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractRunnableC7211 m12430() {
        f19261.getClass();
        AbstractRunnableC7211 abstractRunnableC7211 = (AbstractRunnableC7211) AbstractC8501.f23600.getAndSetObject(this, f19257, (Object) null);
        return abstractRunnableC7211 == null ? m12429() : abstractRunnableC7211;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12431(C7205 c7205) {
        f19261.getClass();
        AbstractRunnableC7211 abstractRunnableC7211 = (AbstractRunnableC7211) AbstractC8501.f23600.getAndSetObject(this, f19257, (Object) null);
        if (abstractRunnableC7211 != null) {
            c7205.m10406(abstractRunnableC7211);
        }
        while (true) {
            AbstractRunnableC7211 abstractRunnableC7211M12429 = m12429();
            if (abstractRunnableC7211M12429 == null) {
                return;
            } else {
                c7205.m10406(abstractRunnableC7211M12429);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m12432() {
        f19261.getClass();
        Object objectVolatile = AbstractC8501.f23600.getObjectVolatile(this, f19257);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19259;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f19260;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractRunnableC7211 m12433(AbstractRunnableC7211 abstractRunnableC7211) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19260;
        if (atomicIntegerFieldUpdater.get(this) - f19259.get(this) == 127) {
            return abstractRunnableC7211;
        }
        if (abstractRunnableC7211.f19253) {
            f19258.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f19262;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, abstractRunnableC7211);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractRunnableC7211 m12434(AbstractRunnableC7211 abstractRunnableC7211, boolean z) {
        if (z) {
            return m12433(abstractRunnableC7211);
        }
        f19261.getClass();
        AbstractRunnableC7211 abstractRunnableC72112 = (AbstractRunnableC7211) AbstractC8501.f23600.getAndSetObject(this, f19257, abstractRunnableC7211);
        if (abstractRunnableC72112 == null) {
            return null;
        }
        return m12433(abstractRunnableC72112);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractRunnableC7211 m12435(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f19262;
        AbstractRunnableC7211 abstractRunnableC7211 = (AbstractRunnableC7211) atomicReferenceArray.get(i2);
        if (abstractRunnableC7211 != null && abstractRunnableC7211.f19253 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC7211, null)) {
                if (atomicReferenceArray.get(i2) != abstractRunnableC7211) {
                }
            }
            if (z) {
                f19258.decrementAndGet(this);
            }
            return abstractRunnableC7211;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r9 = p095.C7214.f19259.get(r4);
        r1 = p095.C7214.f19260.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (p095.C7214.f19258.get(r4) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r1 = r1 - 1;
        r2 = r4.m12435(r1, true);
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
    public final p095.AbstractRunnableC7211 m12436() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p095.C7214.f19261
            r0.getClass()
            sun.misc.Unsafe r0 = p291.AbstractC8501.f23600
            long r1 = p095.C7214.f19257
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲 r7 = (p095.AbstractRunnableC7211) r7
            r0 = 1
            if (r7 != 0) goto L15
        L13:
            r4 = r9
            goto L30
        L15:
            boolean r3 = r7.f19253
            if (r3 != r0) goto L13
        L19:
            sun.misc.Unsafe r3 = p291.AbstractC8501.f23600
            long r5 = p095.C7214.f19257
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = p095.C7214.f19259
            int r9 = r9.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p095.C7214.f19260
            int r1 = r1.get(r4)
        L3c:
            if (r9 == r1) goto L50
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = p095.C7214.f19258
            int r2 = r2.get(r4)
            if (r2 != 0) goto L47
            goto L50
        L47:
            int r1 = r1 + (-1)
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲 r2 = r4.m12435(r1, r0)
            if (r2 == 0) goto L3c
            return r2
        L50:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p095.C7214.m12436():飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲");
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Object, 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long m12437(Ref$ObjectRef ref$ObjectRef, int i) {
        C7214 c7214;
        while (true) {
            f19261.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f19257;
            ?? r7 = (AbstractRunnableC7211) unsafe.getObjectVolatile(this, j);
            if (r7 == 0) {
                return -2L;
            }
            if (((r7.f19253 ? 1 : 2) & i) == 0) {
                return -2L;
            }
            AbstractC7216.f19264.getClass();
            long jNanoTime = System.nanoTime() - r7.f19254;
            long j2 = AbstractC7216.f19268;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = AbstractC8501.f23600;
                c7214 = this;
                if (unsafe2.compareAndSwapObject(c7214, f19257, (Object) r7, (Object) null)) {
                    ref$ObjectRef.element = r7;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(c7214, j) != r7) {
                    break;
                }
                this = c7214;
            }
            this = c7214;
        }
    }
}
