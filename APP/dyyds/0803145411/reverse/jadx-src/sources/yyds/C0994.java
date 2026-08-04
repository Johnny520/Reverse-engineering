package yyds;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛴᲈᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0994 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final /* synthetic */ long f4510;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4511;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f4512;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4513;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final /* synthetic */ long f4514;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final /* synthetic */ long f4515;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final AtomicReferenceArray f4516 = new AtomicReferenceArray(128);

    static {
        Unsafe unsafe = AbstractC2112.f10448;
        f4514 = unsafe.objectFieldOffset(C0994.class.getDeclaredField("lastScheduledTask$volatile"));
        f4511 = AtomicIntegerFieldUpdater.newUpdater(C0994.class, "producerIndex$volatile");
        f4512 = unsafe.objectFieldOffset(C0994.class.getDeclaredField("producerIndex$volatile"));
        f4510 = unsafe.objectFieldOffset(C0994.class.getDeclaredField("consumerIndex$volatile"));
        f4513 = AtomicIntegerFieldUpdater.newUpdater(C0994.class, "blockingTasksInBuffer$volatile");
        f4515 = unsafe.objectFieldOffset(C0994.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m2176() {
        return AbstractC2112.f10448.getIntVolatile(this, f4512) - AbstractC2112.f10448.getIntVolatile(this, f4510);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final AbstractRunnableC2764 m2177() {
        AbstractRunnableC2764 abstractRunnableC2764;
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f4510;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, f4512) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            C0994 c0994 = this;
            if (unsafe.compareAndSwapInt(c0994, j, intVolatile, intVolatile + 1) && (abstractRunnableC2764 = (AbstractRunnableC2764) c0994.f4516.getAndSet(i, null)) != null) {
                if (abstractRunnableC2764.f13497) {
                    f4513.decrementAndGet(c0994);
                }
                return abstractRunnableC2764;
            }
            this = c0994;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final AbstractRunnableC2764 m2178(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f4516;
        AbstractRunnableC2764 abstractRunnableC2764 = (AbstractRunnableC2764) atomicReferenceArray.get(i2);
        if (abstractRunnableC2764 != null && abstractRunnableC2764.f13497 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC2764, null)) {
                if (atomicReferenceArray.get(i2) != abstractRunnableC2764) {
                }
            }
            if (z) {
                f4513.decrementAndGet(this);
            }
            return abstractRunnableC2764;
        }
        return null;
    }
}
