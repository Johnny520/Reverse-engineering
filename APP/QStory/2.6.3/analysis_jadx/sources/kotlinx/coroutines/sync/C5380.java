package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.AbstractC5399;
import p291.AbstractC8493;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5380 extends C5385 implements InterfaceC5383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14991 = AtomicReferenceFieldUpdater.newUpdater(C5380.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ long f14992 = AbstractC8493.f23591.objectFieldOffset(C5380.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile = AbstractC5379.f14990;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC5399.m10501(this));
        sb.append("[isLocked=");
        sb.append(m10428());
        sb.append(",owner=");
        f14991.getClass();
        sb.append(AbstractC8493.f23591.getObjectVolatile(this, f14992));
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r6 = kotlinx.coroutines.sync.C5380.f14991;
        r2 = r0.f14996;
        r6.set(r2, null);
        r6 = r0.f14997;
        r6.m10538(r1, r6.f15031, new androidx.compose.foundation.C1093(new androidx.compose.foundation.C1067(r2, 24, r0), r3));
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10427(kotlin.coroutines.InterfaceC4357 r7) {
        /*
            r6 = this;
            boolean r0 = r6.m10431()
            kotlin.飘花落叶言子楪兰苏哲世 r1 = kotlin.C5176.f14739
            if (r0 == 0) goto L9
            goto L50
        L9:
            kotlin.coroutines.飘花落叶言子楪世哲苏兰 r7 = androidx.window.area.AbstractC2567.m5064(r7)
            kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r7 = kotlinx.coroutines.AbstractC5399.m10492(r7)
            kotlinx.coroutines.sync.飘花落叶言子楪世苏兰哲 r0 = new kotlinx.coroutines.sync.飘花落叶言子楪世苏兰哲     // Catch: java.lang.Throwable -> L51
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L51
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.sync.C5385.f15004     // Catch: java.lang.Throwable -> L51
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L51
            r3 = 1
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.sync.C5380.f14991     // Catch: java.lang.Throwable -> L51
            kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏 r2 = r0.f14996     // Catch: java.lang.Throwable -> L51
            r4 = 0
            r6.set(r2, r4)     // Catch: java.lang.Throwable -> L51
            kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r6 = r0.f14997     // Catch: java.lang.Throwable -> L51
            androidx.compose.foundation.飘花落叶言子楪哲苏兰世 r4 = new androidx.compose.foundation.飘花落叶言子楪哲苏兰世     // Catch: java.lang.Throwable -> L51
            r5 = 24
            r4.<init>(r2, r5, r0)     // Catch: java.lang.Throwable -> L51
            int r0 = r6.f15031     // Catch: java.lang.Throwable -> L51
            androidx.compose.foundation.飘花落叶言子苏楪世哲兰 r2 = new androidx.compose.foundation.飘花落叶言子苏楪世哲兰     // Catch: java.lang.Throwable -> L51
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L51
            r6.m10538(r1, r0, r2)     // Catch: java.lang.Throwable -> L51
            goto L43
        L3d:
            boolean r2 = r6.m10439(r0)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L16
        L43:
            java.lang.Object r6 = r7.m10540()
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r6 != r7) goto L4c
            goto L4d
        L4c:
            r6 = r1
        L4d:
            if (r6 != r7) goto L50
            return r6
        L50:
            return r1
        L51:
            r6 = move-exception
            r7.m10533()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C5380.m10427(kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m10428() {
        return Math.max(C5385.f15004.get(this), 0) == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m10429(Object obj) {
        while (m10428()) {
            f14991.getClass();
            Object objectVolatile = AbstractC8493.f23591.getObjectVolatile(this, f14992);
            if (objectVolatile != AbstractC5379.f14990) {
                return objectVolatile == obj ? 1 : 2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m10430() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C5385.f15004;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    f14991.getClass();
                    AbstractC8493.f23591.putObjectVolatile(this, f14992, (Object) null);
                    return 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m10431() {
        int iM10430 = m10430();
        if (iM10430 == 0) {
            return true;
        }
        if (iM10430 == 1) {
            return false;
        }
        if (iM10430 != 2) {
            C5925.m11311("unexpected");
            return false;
        }
        C5925.m11312("This mutex is already locked by the specified owner: null");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10432(Object obj) {
        while (this.m10428()) {
            f14991.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f14992;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            C4485 c4485 = AbstractC5379.f14990;
            if (objectVolatile != c4485) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = AbstractC8493.f23591;
                    C5380 c5380 = this;
                    if (unsafe2.compareAndSwapObject(c5380, f14992, objectVolatile, c4485)) {
                        c5380.m10438();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(c5380, j) != objectVolatile) {
                            this = c5380;
                            break;
                        }
                        this = c5380;
                    }
                }
            }
        }
        C5925.m11311("This mutex is not locked");
    }
}
