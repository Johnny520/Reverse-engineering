package io.ktor.network.selector;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p291.AbstractC8501;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4004 {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AtomicReferenceArray f12261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f12263;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4001 f12257 = new C4001();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12259 = AtomicReferenceFieldUpdater.newUpdater(C4004.class, Object.class, "_next");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f12260 = AbstractC8501.f23600.objectFieldOffset(C4004.class.getDeclaredField("_next"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f12258 = AtomicLongFieldUpdater.newUpdater(C4004.class, "_state");

    public C4004(int i) {
        this.f12263 = i;
        int i2 = i - 1;
        this.f12262 = i2;
        this.f12261 = new AtomicReferenceArray(i);
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m8418() {
        Object obj;
        C4004 c4004M8419 = this;
        long j = c4004M8419._state;
        if ((j & 1152921504606846976L) != 0) {
            return f12257;
        }
        int i = (int) (j & 1073741823);
        int i2 = c4004M8419.f12262;
        int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
        int i4 = i2 & i;
        if (i3 == i4 || (obj = c4004M8419.f12261.get(i4)) == null || (obj instanceof C3997)) {
            return null;
        }
        long j2 = (i + 1) & 1073741823;
        if (f12258.compareAndSet(c4004M8419, j, (j & (-1073741824)) | j2)) {
            c4004M8419.f12261.set(c4004M8419.f12262 & i, null);
            return obj;
        }
        while (true) {
            long j3 = c4004M8419._state;
            int i5 = (int) (j3 & 1073741823);
            if (i5 != i) {
                C5919.m11250("This queue can have only one consumer");
                return null;
            }
            if ((j3 & 1152921504606846976L) != 0) {
                c4004M8419 = c4004M8419.m8419();
            } else {
                C4004 c4004 = c4004M8419;
                if (f12258.compareAndSet(c4004, j3, (j3 & (-1073741824)) | j2)) {
                    c4004.f12261.set(i5 & c4004.f12262, null);
                    c4004M8419 = null;
                } else {
                    c4004M8419 = c4004;
                }
            }
            if (c4004M8419 == null) {
                return obj;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4004 m8419() {
        long j;
        C4004 c4004;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                c4004 = this;
                break;
            }
            long j2 = j | 1152921504606846976L;
            c4004 = this;
            if (f12258.compareAndSet(c4004, j, j2)) {
                j = j2;
                break;
            }
            this = c4004;
        }
        return c4004.m8422(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m8420() {
        long j = this._state;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m8421() {
        while (true) {
            long j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            C4004 c4004 = this;
            if (f12258.compareAndSet(c4004, j, j | 2305843009213693952L)) {
                return true;
            }
            this = c4004;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4004 m8422(long j) {
        C4004 c4004;
        while (true) {
            C4004 c40042 = (C4004) this._next;
            if (c40042 != null) {
                return c40042;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12259;
            C4004 c40043 = new C4004(this.f12263 * 2);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f12262;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                AtomicReferenceArray atomicReferenceArray = c40043.f12261;
                int i5 = c40043.f12262 & i;
                Object c3997 = this.f12261.get(i4);
                if (c3997 == null) {
                    c3997 = new C3997(i);
                }
                atomicReferenceArray.set(i5, c3997);
                i++;
            }
            c40043._state = (-1152921504606846977L) & j;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8501.f23600;
                long j2 = f12260;
                c4004 = this;
                if (!unsafe.compareAndSwapObject(c4004, j2, (Object) null, c40043) && unsafe.getObjectVolatile(c4004, j2) == null) {
                    this = c4004;
                }
            }
            this = c4004;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m8423(Object obj) {
        obj.getClass();
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f12262;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            C4004 c4004 = this;
            if (f12258.compareAndSet(c4004, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                c4004.f12261.set(c4004.f12262 & i2, obj);
                C4004 c4004M8419 = c4004;
                while ((c4004M8419._state & 1152921504606846976L) != 0) {
                    c4004M8419 = c4004M8419.m8419();
                    AtomicReferenceArray atomicReferenceArray = c4004M8419.f12261;
                    int i4 = c4004M8419.f12262 & i2;
                    Object obj2 = atomicReferenceArray.get(i4);
                    if ((obj2 instanceof C3997) && ((C3997) obj2).f12244 == i2) {
                        atomicReferenceArray.set(i4, obj);
                    } else {
                        c4004M8419 = null;
                    }
                    if (c4004M8419 == null) {
                        return 0;
                    }
                }
                return 0;
            }
            this = c4004;
        }
    }
}
