package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p307.AbstractC9322;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6198 {
    private volatile /* synthetic */ Object _cur$volatile = new C6196(8, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15307 = AtomicReferenceFieldUpdater.newUpdater(C6198.class, Object.class, "_cur$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15306 = AbstractC9322.f23936.objectFieldOffset(C6198.class.getDeclaredField("_cur$volatile"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m10966() {
        C6198 c6198;
        while (true) {
            f15307.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15306;
            C6196 c6196 = (C6196) unsafe.getObjectVolatile(this, j);
            Object objM10961 = c6196.m10961();
            if (objM10961 != C6196.f15300) {
                return objM10961;
            }
            C6196 c6196M10962 = c6196.m10962();
            while (true) {
                Unsafe unsafe2 = AbstractC9322.f23936;
                c6198 = this;
                if (!unsafe2.compareAndSwapObject(c6198, f15306, c6196, c6196M10962) && unsafe2.getObjectVolatile(c6198, j) == c6196) {
                    this = c6198;
                }
            }
            this = c6198;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m10967() {
        f15307.getClass();
        C6196 c6196 = (C6196) AbstractC9322.f23936.getObjectVolatile(this, f15306);
        c6196.getClass();
        long j = C6196.f15297.get(c6196);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m10968() {
        C6198 c6198;
        while (true) {
            f15307.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15306;
            C6196 c6196 = (C6196) unsafe.getObjectVolatile(this, j);
            if (c6196.m10963()) {
                return;
            }
            C6196 c6196M10962 = c6196.m10962();
            while (true) {
                Unsafe unsafe2 = AbstractC9322.f23936;
                c6198 = this;
                if (!unsafe2.compareAndSwapObject(c6198, f15306, c6196, c6196M10962) && unsafe2.getObjectVolatile(c6198, j) == c6196) {
                    this = c6198;
                }
            }
            this = c6198;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m10969(Runnable runnable) {
        C6198 c6198;
        while (true) {
            f15307.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15306;
            C6196 c6196 = (C6196) unsafe.getObjectVolatile(this, j);
            int iM10965 = c6196.m10965(runnable);
            if (iM10965 == 0) {
                return true;
            }
            if (iM10965 == 1) {
                C6196 c6196M10962 = c6196.m10962();
                while (true) {
                    Unsafe unsafe2 = AbstractC9322.f23936;
                    c6198 = this;
                    if (!unsafe2.compareAndSwapObject(c6198, f15306, c6196, c6196M10962) && unsafe2.getObjectVolatile(c6198, j) == c6196) {
                        this = c6198;
                    }
                }
            } else {
                if (iM10965 == 2) {
                    return false;
                }
                c6198 = this;
            }
            this = c6198;
        }
    }
}
