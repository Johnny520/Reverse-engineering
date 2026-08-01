package io.ktor.network.selector;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p291.AbstractC8493;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4005 {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AtomicReferenceArray f12265;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12266;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f12267;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4002 f12261 = new C4002();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12263 = AtomicReferenceFieldUpdater.newUpdater(C4005.class, Object.class, "_next");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f12264 = AbstractC8493.f23591.objectFieldOffset(C4005.class.getDeclaredField("_next"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f12262 = AtomicLongFieldUpdater.newUpdater(C4005.class, "_state");

    public C4005(int i) {
        this.f12267 = i;
        int i2 = i - 1;
        this.f12266 = i2;
        this.f12265 = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            C5925.m11311("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        C5925.m11311("Check failed.");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m8408() {
        Object obj;
        C4005 c4005M8409 = this;
        long j = c4005M8409._state;
        if ((j & 1152921504606846976L) != 0) {
            return f12261;
        }
        int i = (int) (j & 1073741823);
        int i2 = c4005M8409.f12266;
        int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
        int i4 = i2 & i;
        if (i3 == i4 || (obj = c4005M8409.f12265.get(i4)) == null || (obj instanceof C3998)) {
            return null;
        }
        long j2 = (i + 1) & 1073741823;
        if (f12262.compareAndSet(c4005M8409, j, (j & (-1073741824)) | j2)) {
            c4005M8409.f12265.set(c4005M8409.f12266 & i, null);
            return obj;
        }
        while (true) {
            long j3 = c4005M8409._state;
            int i5 = (int) (j3 & 1073741823);
            if (i5 != i) {
                C5925.m11311("This queue can have only one consumer");
                return null;
            }
            if ((j3 & 1152921504606846976L) != 0) {
                c4005M8409 = c4005M8409.m8409();
            } else {
                C4005 c4005 = c4005M8409;
                if (f12262.compareAndSet(c4005, j3, (j3 & (-1073741824)) | j2)) {
                    c4005.f12265.set(i5 & c4005.f12266, null);
                    c4005M8409 = null;
                } else {
                    c4005M8409 = c4005;
                }
            }
            if (c4005M8409 == null) {
                return obj;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4005 m8409() {
        long j;
        C4005 c4005;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                c4005 = this;
                break;
            }
            long j2 = j | 1152921504606846976L;
            c4005 = this;
            if (f12262.compareAndSet(c4005, j, j2)) {
                j = j2;
                break;
            }
            this = c4005;
        }
        return c4005.m8412(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m8410() {
        long j = this._state;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m8411() {
        while (true) {
            long j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            C4005 c4005 = this;
            if (f12262.compareAndSet(c4005, j, j | 2305843009213693952L)) {
                return true;
            }
            this = c4005;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4005 m8412(long j) {
        C4005 c4005;
        while (true) {
            C4005 c40052 = (C4005) this._next;
            if (c40052 != null) {
                return c40052;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12263;
            C4005 c40053 = new C4005(this.f12267 * 2);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f12266;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                AtomicReferenceArray atomicReferenceArray = c40053.f12265;
                int i5 = c40053.f12266 & i;
                Object c3998 = this.f12265.get(i4);
                if (c3998 == null) {
                    c3998 = new C3998(i);
                }
                atomicReferenceArray.set(i5, c3998);
                i++;
            }
            c40053._state = (-1152921504606846977L) & j;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8493.f23591;
                long j2 = f12264;
                c4005 = this;
                if (!unsafe.compareAndSwapObject(c4005, j2, (Object) null, c40053) && unsafe.getObjectVolatile(c4005, j2) == null) {
                    this = c4005;
                }
            }
            this = c4005;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m8413(Object obj) {
        obj.getClass();
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f12266;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            C4005 c4005 = this;
            if (f12262.compareAndSet(c4005, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                c4005.f12265.set(c4005.f12266 & i2, obj);
                C4005 c4005M8409 = c4005;
                while ((c4005M8409._state & 1152921504606846976L) != 0) {
                    c4005M8409 = c4005M8409.m8409();
                    AtomicReferenceArray atomicReferenceArray = c4005M8409.f12265;
                    int i4 = c4005M8409.f12266 & i2;
                    Object obj2 = atomicReferenceArray.get(i4);
                    if ((obj2 instanceof C3998) && ((C3998) obj2).f12248 == i2) {
                        atomicReferenceArray.set(i4, obj);
                    } else {
                        c4005M8409 = null;
                    }
                    if (c4005M8409 == null) {
                        return 0;
                    }
                }
                return 0;
            }
            this = c4005;
        }
    }
}
