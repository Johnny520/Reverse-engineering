package io.ktor.network.selector;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p307.AbstractC9322;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4837 {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AtomicReferenceArray f12610;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12611;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f12612;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4834 f12606 = new C4834();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12608 = AtomicReferenceFieldUpdater.newUpdater(C4837.class, Object.class, "_next");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f12609 = AbstractC9322.f23936.objectFieldOffset(C4837.class.getDeclaredField("_next"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f12607 = AtomicLongFieldUpdater.newUpdater(C4837.class, "_state");

    public C4837(int i) {
        this.f12612 = i;
        int i2 = i - 1;
        this.f12611 = i2;
        this.f12610 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            C6755.m11870("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        C6755.m11870("Check failed.");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m8967() {
        Object obj;
        C4837 c4837M8968 = this;
        long j = c4837M8968._state;
        if ((j & 1152921504606846976L) != 0) {
            return f12606;
        }
        int i = (int) (j & 1073741823);
        int i2 = c4837M8968.f12611;
        int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
        int i4 = i2 & i;
        if (i3 == i4 || (obj = c4837M8968.f12610.get(i4)) == null || (obj instanceof C4830)) {
            return null;
        }
        long j2 = (i + 1) & 1073741823;
        if (f12607.compareAndSet(c4837M8968, j, (j & (-1073741824)) | j2)) {
            c4837M8968.f12610.set(c4837M8968.f12611 & i, null);
            return obj;
        }
        while (true) {
            long j3 = c4837M8968._state;
            int i5 = (int) (j3 & 1073741823);
            if (i5 != i) {
                C6755.m11870("This queue can have only one consumer");
                return null;
            }
            if ((j3 & 1152921504606846976L) != 0) {
                c4837M8968 = c4837M8968.m8968();
            } else {
                C4837 c4837 = c4837M8968;
                if (f12607.compareAndSet(c4837, j3, (j3 & (-1073741824)) | j2)) {
                    c4837.f12610.set(i5 & c4837.f12611, null);
                    c4837M8968 = null;
                } else {
                    c4837M8968 = c4837;
                }
            }
            if (c4837M8968 == null) {
                return obj;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4837 m8968() {
        long j;
        C4837 c4837;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                c4837 = this;
                break;
            }
            long j2 = j | 1152921504606846976L;
            c4837 = this;
            if (f12607.compareAndSet(c4837, j, j2)) {
                j = j2;
                break;
            }
            this = c4837;
        }
        return c4837.m8971(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m8969() {
        long j = this._state;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m8970() {
        while (true) {
            long j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            C4837 c4837 = this;
            if (f12607.compareAndSet(c4837, j, j | 2305843009213693952L)) {
                return true;
            }
            this = c4837;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4837 m8971(long j) {
        C4837 c4837;
        while (true) {
            C4837 c48372 = (C4837) this._next;
            if (c48372 != null) {
                return c48372;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12608;
            C4837 c48373 = new C4837(this.f12612 * 2);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f12611;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                AtomicReferenceArray atomicReferenceArray = c48373.f12610;
                int i5 = c48373.f12611 & i;
                Object c4830 = this.f12610.get(i4);
                if (c4830 == null) {
                    c4830 = new C4830(i);
                }
                atomicReferenceArray.set(i5, c4830);
                i++;
            }
            c48373._state = (-1152921504606846977L) & j;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC9322.f23936;
                long j2 = f12609;
                c4837 = this;
                if (!unsafe.compareAndSwapObject(c4837, j2, (Object) null, c48373) && unsafe.getObjectVolatile(c4837, j2) == null) {
                    this = c4837;
                }
            }
            this = c4837;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m8972(Object obj) {
        obj.getClass();
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f12611;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            C4837 c4837 = this;
            if (f12607.compareAndSet(c4837, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                c4837.f12610.set(c4837.f12611 & i2, obj);
                C4837 c4837M8968 = c4837;
                while ((c4837M8968._state & 1152921504606846976L) != 0) {
                    c4837M8968 = c4837M8968.m8968();
                    AtomicReferenceArray atomicReferenceArray = c4837M8968.f12610;
                    int i4 = c4837M8968.f12611 & i2;
                    Object obj2 = atomicReferenceArray.get(i4);
                    if ((obj2 instanceof C4830) && ((C4830) obj2).f12593 == i2) {
                        atomicReferenceArray.set(i4, obj);
                    } else {
                        c4837M8968 = null;
                    }
                    if (c4837M8968 == null) {
                        return 0;
                    }
                }
                return 0;
            }
            this = c4837;
        }
    }
}
