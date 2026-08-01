package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import p307.AbstractC9322;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6196 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f15301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f15302;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f15303;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f15304;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15298 = AtomicReferenceFieldUpdater.newUpdater(C6196.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15299 = AbstractC9322.f23936.objectFieldOffset(C6196.class.getDeclaredField("_next$volatile"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f15297 = AtomicLongFieldUpdater.newUpdater(C6196.class, "_state$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5317 f15300 = new C5317("REMOVE_FROZEN", 1);

    public C6196(int i, boolean z) {
        this.f15304 = i;
        this.f15303 = z;
        int i2 = i - 1;
        this.f15302 = i2;
        this.f15301 = new AtomicReferenceArray(i);
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10961() {
        C6196 c6196M10962 = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15297;
            long j = atomicLongFieldUpdater.get(c6196M10962);
            if ((j & 1152921504606846976L) != 0) {
                return f15300;
            }
            int i = (int) (j & 1073741823);
            int i2 = c6196M10962.f15302;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = c6196M10962.f15301;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = c6196M10962.f15303;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof C6199) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f15297.compareAndSet(c6196M10962, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                c6196M10962 = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(c6196M10962);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            c6196M10962 = c6196M10962.m10962();
                        } else {
                            C6196 c6196 = c6196M10962;
                            if (f15297.compareAndSet(c6196, j3, (j3 & (-1073741824)) | j2)) {
                                c6196.f15301.set(i4 & c6196.f15302, null);
                                c6196M10962 = null;
                            } else {
                                c6196M10962 = c6196;
                            }
                        }
                        if (c6196M10962 == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6196 m10962() {
        long j;
        C6196 c6196;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15297;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                c6196 = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            c6196 = this;
            if (atomicLongFieldUpdater.compareAndSet(c6196, j, j2)) {
                j = j2;
                break;
            }
            this = c6196;
        }
        return c6196.m10964(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m10963() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15297;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            C6196 c6196 = this;
            if (atomicLongFieldUpdater.compareAndSet(c6196, j, 2305843009213693952L | j)) {
                return true;
            }
            this = c6196;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6196 m10964(long j) {
        C6196 c6196;
        while (true) {
            f15298.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j2 = f15299;
            C6196 c61962 = (C6196) unsafe.getObjectVolatile(this, j2);
            if (c61962 != null) {
                return c61962;
            }
            C6196 c61963 = new C6196(this.f15304 * 2, this.f15303);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f15302;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c6199 = this.f15301.get(i4);
                if (c6199 == null) {
                    c6199 = new C6199(i);
                }
                c61963.f15301.set(c61963.f15302 & i, c6199);
                i++;
            }
            f15297.set(c61963, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = AbstractC9322.f23936;
                c6196 = this;
                if (!unsafe2.compareAndSwapObject(c6196, f15299, (Object) null, c61963) && unsafe2.getObjectVolatile(c6196, j2) == null) {
                    this = c6196;
                }
            }
            this = c6196;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m10965(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f15297;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f15302;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.f15303;
            AtomicReferenceArray atomicReferenceArray = this.f15301;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                C6196 c6196 = this;
                if (f15297.compareAndSet(c6196, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C6196 c6196M10962 = c6196;
                    while ((atomicLongFieldUpdater.get(c6196M10962) & 1152921504606846976L) != 0) {
                        c6196M10962 = c6196M10962.m10962();
                        AtomicReferenceArray atomicReferenceArray2 = c6196M10962.f15301;
                        int i4 = c6196M10962.f15302 & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C6199) && ((C6199) obj2).f15308 == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c6196M10962 = null;
                        }
                        if (c6196M10962 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = c6196;
            } else {
                int i5 = this.f15304;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }
}
