package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p291.AbstractC8501;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5365 {
    private volatile /* synthetic */ Object _cur$volatile = new C5363(8, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14962 = AtomicReferenceFieldUpdater.newUpdater(C5365.class, Object.class, "_cur$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f14961 = AbstractC8501.f23600.objectFieldOffset(C5365.class.getDeclaredField("_cur$volatile"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m10403() {
        C5365 c5365;
        while (true) {
            f14962.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f14961;
            C5363 c5363 = (C5363) unsafe.getObjectVolatile(this, j);
            Object objM10398 = c5363.m10398();
            if (objM10398 != C5363.f14955) {
                return objM10398;
            }
            C5363 c5363M10399 = c5363.m10399();
            while (true) {
                Unsafe unsafe2 = AbstractC8501.f23600;
                c5365 = this;
                if (!unsafe2.compareAndSwapObject(c5365, f14961, c5363, c5363M10399) && unsafe2.getObjectVolatile(c5365, j) == c5363) {
                    this = c5365;
                }
            }
            this = c5365;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m10404() {
        f14962.getClass();
        C5363 c5363 = (C5363) AbstractC8501.f23600.getObjectVolatile(this, f14961);
        c5363.getClass();
        long j = C5363.f14952.get(c5363);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m10405() {
        C5365 c5365;
        while (true) {
            f14962.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f14961;
            C5363 c5363 = (C5363) unsafe.getObjectVolatile(this, j);
            if (c5363.m10400()) {
                return;
            }
            C5363 c5363M10399 = c5363.m10399();
            while (true) {
                Unsafe unsafe2 = AbstractC8501.f23600;
                c5365 = this;
                if (!unsafe2.compareAndSwapObject(c5365, f14961, c5363, c5363M10399) && unsafe2.getObjectVolatile(c5365, j) == c5363) {
                    this = c5365;
                }
            }
            this = c5365;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m10406(Runnable runnable) {
        C5365 c5365;
        while (true) {
            f14962.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f14961;
            C5363 c5363 = (C5363) unsafe.getObjectVolatile(this, j);
            int iM10402 = c5363.m10402(runnable);
            if (iM10402 == 0) {
                return true;
            }
            if (iM10402 == 1) {
                C5363 c5363M10399 = c5363.m10399();
                while (true) {
                    Unsafe unsafe2 = AbstractC8501.f23600;
                    c5365 = this;
                    if (!unsafe2.compareAndSwapObject(c5365, f14961, c5363, c5363M10399) && unsafe2.getObjectVolatile(c5365, j) == c5363) {
                        this = c5365;
                    }
                }
            } else {
                if (iM10402 == 2) {
                    return false;
                }
                c5365 = this;
            }
            this = c5365;
        }
    }
}
