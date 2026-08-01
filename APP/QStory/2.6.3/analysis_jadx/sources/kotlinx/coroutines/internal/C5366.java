package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p291.AbstractC8493;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5366 {
    private volatile /* synthetic */ Object _cur$volatile = new C5364(8, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14962 = AtomicReferenceFieldUpdater.newUpdater(C5366.class, Object.class, "_cur$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f14961 = AbstractC8493.f23591.objectFieldOffset(C5366.class.getDeclaredField("_cur$volatile"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m10407() {
        C5366 c5366;
        while (true) {
            f14962.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f14961;
            C5364 c5364 = (C5364) unsafe.getObjectVolatile(this, j);
            Object objM10402 = c5364.m10402();
            if (objM10402 != C5364.f14955) {
                return objM10402;
            }
            C5364 c5364M10403 = c5364.m10403();
            while (true) {
                Unsafe unsafe2 = AbstractC8493.f23591;
                c5366 = this;
                if (!unsafe2.compareAndSwapObject(c5366, f14961, c5364, c5364M10403) && unsafe2.getObjectVolatile(c5366, j) == c5364) {
                    this = c5366;
                }
            }
            this = c5366;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m10408() {
        f14962.getClass();
        C5364 c5364 = (C5364) AbstractC8493.f23591.getObjectVolatile(this, f14961);
        c5364.getClass();
        long j = C5364.f14952.get(c5364);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m10409() {
        C5366 c5366;
        while (true) {
            f14962.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f14961;
            C5364 c5364 = (C5364) unsafe.getObjectVolatile(this, j);
            if (c5364.m10404()) {
                return;
            }
            C5364 c5364M10403 = c5364.m10403();
            while (true) {
                Unsafe unsafe2 = AbstractC8493.f23591;
                c5366 = this;
                if (!unsafe2.compareAndSwapObject(c5366, f14961, c5364, c5364M10403) && unsafe2.getObjectVolatile(c5366, j) == c5364) {
                    this = c5366;
                }
            }
            this = c5366;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m10410(Runnable runnable) {
        C5366 c5366;
        while (true) {
            f14962.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f14961;
            C5364 c5364 = (C5364) unsafe.getObjectVolatile(this, j);
            int iM10406 = c5364.m10406(runnable);
            if (iM10406 == 0) {
                return true;
            }
            if (iM10406 == 1) {
                C5364 c5364M10403 = c5364.m10403();
                while (true) {
                    Unsafe unsafe2 = AbstractC8493.f23591;
                    c5366 = this;
                    if (!unsafe2.compareAndSwapObject(c5366, f14961, c5364, c5364M10403) && unsafe2.getObjectVolatile(c5366, j) == c5364) {
                        this = c5366;
                    }
                }
            } else {
                if (iM10406 == 2) {
                    return false;
                }
                c5366 = this;
            }
            this = c5366;
        }
    }
}
