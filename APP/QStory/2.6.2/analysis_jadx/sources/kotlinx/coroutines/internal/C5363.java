package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import p291.AbstractC8501;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5363 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f14956;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f14957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f14958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f14959;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14953 = AtomicReferenceFieldUpdater.newUpdater(C5363.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f14954 = AbstractC8501.f23600.objectFieldOffset(C5363.class.getDeclaredField("_next$volatile"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f14952 = AtomicLongFieldUpdater.newUpdater(C5363.class, "_state$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4484 f14955 = new C4484("REMOVE_FROZEN", 1);

    public C5363(int i, boolean z) {
        this.f14959 = i;
        this.f14958 = z;
        int i2 = i - 1;
        this.f14957 = i2;
        this.f14956 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            C5919.m11250("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        C5919.m11250("Check failed.");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10398() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = kotlinx.coroutines.internal.C5363.f14952
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r0 = kotlinx.coroutines.internal.C5363.f14955
            return r0
        L15:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r13 = 30
            long r4 = r4 >> r13
            int r4 = (int) r4
            int r5 = r1.f14957
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.f14956
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.f14958
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.C5366
            if (r7 == 0) goto L42
        L41:
            return r14
        L42:
            int r0 = r0 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r7
            r7 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r7
            r20 = r7
            long r7 = (long) r0
            long r18 = r18 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.C5363.f14952
            r28 = r18
            r18 = r4
            r19 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L66
            r15.set(r13, r14)
            return r18
        L66:
            r1 = r30
            if (r19 == 0) goto L2
        L6a:
            long r24 = r6.get(r1)
            long r2 = r24 & r11
            int r0 = (int) r2
            long r2 = r24 & r16
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L7d
            kotlinx.coroutines.internal.飘花落叶言子楪苏兰世哲 r0 = r1.m10399()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = kotlinx.coroutines.internal.C5363.f14952
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.f14956
            int r2 = r2.f14957
            r0 = r0 & r2
            r1.set(r0, r14)
            r1 = r14
        L96:
            if (r1 != 0) goto L6a
            return r18
        L99:
            r1 = r2
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C5363.m10398():java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5363 m10399() {
        long j;
        C5363 c5363;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14952;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                c5363 = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            c5363 = this;
            if (atomicLongFieldUpdater.compareAndSet(c5363, j, j2)) {
                j = j2;
                break;
            }
            this = c5363;
        }
        return c5363.m10401(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m10400() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14952;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            C5363 c5363 = this;
            if (atomicLongFieldUpdater.compareAndSet(c5363, j, 2305843009213693952L | j)) {
                return true;
            }
            this = c5363;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5363 m10401(long j) {
        C5363 c5363;
        while (true) {
            f14953.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j2 = f14954;
            C5363 c53632 = (C5363) unsafe.getObjectVolatile(this, j2);
            if (c53632 != null) {
                return c53632;
            }
            C5363 c53633 = new C5363(this.f14959 * 2, this.f14958);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f14957;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c5366 = this.f14956.get(i4);
                if (c5366 == null) {
                    c5366 = new C5366(i);
                }
                c53633.f14956.set(c53633.f14957 & i, c5366);
                i++;
            }
            f14952.set(c53633, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = AbstractC8501.f23600;
                c5363 = this;
                if (!unsafe2.compareAndSwapObject(c5363, f14954, (Object) null, c53633) && unsafe2.getObjectVolatile(c5363, j2) == null) {
                    this = c5363;
                }
            }
            this = c5363;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m10402(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f14952;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f14957;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.f14958;
            AtomicReferenceArray atomicReferenceArray = this.f14956;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                C5363 c5363 = this;
                if (f14952.compareAndSet(c5363, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C5363 c5363M10399 = c5363;
                    while ((atomicLongFieldUpdater.get(c5363M10399) & 1152921504606846976L) != 0) {
                        c5363M10399 = c5363M10399.m10399();
                        AtomicReferenceArray atomicReferenceArray2 = c5363M10399.f14956;
                        int i4 = c5363M10399.f14957 & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C5366) && ((C5366) obj2).f14963 == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c5363M10399 = null;
                        }
                        if (c5363M10399 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = c5363;
            } else {
                int i5 = this.f14959;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }
}
