package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.AbstractC5398;
import p291.AbstractC8501;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5379 extends C5384 implements InterfaceC5382 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14991 = AtomicReferenceFieldUpdater.newUpdater(C5379.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ long f14992 = AbstractC8501.f23600.objectFieldOffset(C5379.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile = AbstractC5378.f14990;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC5398.m10497(this));
        sb.append("[isLocked=");
        sb.append(m10424());
        sb.append(",owner=");
        f14991.getClass();
        sb.append(AbstractC8501.f23600.getObjectVolatile(this, f14992));
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r6 = kotlinx.coroutines.sync.C5379.f14991;
        r2 = r0.f14996;
        r6.set(r2, null);
        r6 = r0.f14997;
        r6.m10534(r1, r6.f15031, new androidx.compose.foundation.C1093(new androidx.compose.foundation.C1067(r2, 24, r0), r3));
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10423(kotlin.coroutines.InterfaceC4356 r7) {
        /*
            r6 = this;
            boolean r0 = r6.m10427()
            kotlin.飘花落叶言子楪兰苏哲世 r1 = kotlin.C5175.f14739
            if (r0 == 0) goto L9
            goto L50
        L9:
            kotlin.coroutines.飘花落叶言子楪世哲苏兰 r7 = com.bumptech.glide.AbstractC3054.m6602(r7)
            kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r7 = kotlinx.coroutines.AbstractC5398.m10488(r7)
            kotlinx.coroutines.sync.飘花落叶言子楪世苏兰哲 r0 = new kotlinx.coroutines.sync.飘花落叶言子楪世苏兰哲     // Catch: java.lang.Throwable -> L51
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L51
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.sync.C5384.f15004     // Catch: java.lang.Throwable -> L51
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L51
            r3 = 1
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.sync.C5379.f14991     // Catch: java.lang.Throwable -> L51
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
            r6.m10534(r1, r0, r2)     // Catch: java.lang.Throwable -> L51
            goto L43
        L3d:
            boolean r2 = r6.m10435(r0)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L16
        L43:
            java.lang.Object r6 = r7.m10536()
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
            r7.m10529()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C5379.m10423(kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m10424() {
        return Math.max(C5384.f15004.get(this), 0) == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m10425(Object obj) {
        while (m10424()) {
            f14991.getClass();
            Object objectVolatile = AbstractC8501.f23600.getObjectVolatile(this, f14992);
            if (objectVolatile != AbstractC5378.f14990) {
                return objectVolatile == obj ? 1 : 2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m10426() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C5384.f15004;
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
                    AbstractC8501.f23600.putObjectVolatile(this, f14992, (Object) null);
                    return 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m10427() {
        int iM10426 = m10426();
        if (iM10426 == 0) {
            return true;
        }
        if (iM10426 == 1) {
            return false;
        }
        if (iM10426 != 2) {
            C5919.m11250("unexpected");
            return false;
        }
        C5919.m11251("This mutex is already locked by the specified owner: null");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10428(Object obj) {
        while (this.m10424()) {
            f14991.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f14992;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            C4484 c4484 = AbstractC5378.f14990;
            if (objectVolatile != c4484) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = AbstractC8501.f23600;
                    C5379 c5379 = this;
                    if (unsafe2.compareAndSwapObject(c5379, f14992, objectVolatile, c4484)) {
                        c5379.m10434();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(c5379, j) != objectVolatile) {
                            this = c5379;
                            break;
                        }
                        this = c5379;
                    }
                }
            }
        }
        C5919.m11250("This mutex is not locked");
    }
}
