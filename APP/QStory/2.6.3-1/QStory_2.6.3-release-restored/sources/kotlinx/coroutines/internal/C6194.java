package kotlinx.coroutines.internal;

import com.alibaba.fastjson2.C3775;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6290;
import p307.AbstractC9322;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6194 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ long f15290;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15291;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15292;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15293;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15294;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15295 = AtomicReferenceFieldUpdater.newUpdater(C6194.class, Object.class, "_next$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = AbstractC9322.f23936;
        f15291 = unsafe.objectFieldOffset(C6194.class.getDeclaredField("_next$volatile"));
        f15293 = AtomicReferenceFieldUpdater.newUpdater(C6194.class, Object.class, "_prev$volatile");
        f15290 = unsafe.objectFieldOffset(C6194.class.getDeclaredField("_prev$volatile"));
        f15294 = AtomicReferenceFieldUpdater.newUpdater(C6194.class, Object.class, "_removedRef$volatile");
        f15292 = unsafe.objectFieldOffset(C6194.class.getDeclaredField("_removedRef$volatile"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C6194 m10949(C6194 c6194) {
        while (c6194.mo10955()) {
            f15293.getClass();
            c6194 = (C6194) AbstractC9322.f23936.getObjectVolatile(c6194, f15290);
        }
        return c6194;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
            public Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + AbstractC6231.m11060(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6194 m10950() {
        C6194 c6194;
        Unsafe unsafe;
        loop0: while (true) {
            f15293.getClass();
            Unsafe unsafe2 = AbstractC9322.f23936;
            long j = f15290;
            C6194 c61942 = (C6194) unsafe2.getObjectVolatile(this, j);
            C6194 c61943 = null;
            C6194 c61944 = c61942;
            while (true) {
                f15295.getClass();
                if (c61944 == null) {
                    C3775.m6954();
                    return null;
                }
                Unsafe unsafe3 = AbstractC9322.f23936;
                long j2 = f15291;
                Object objectVolatile = unsafe3.getObjectVolatile(c61944, j2);
                if (objectVolatile != this) {
                    C6194 c61945 = c61942;
                    c6194 = this;
                    if (c6194.mo10955()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof C6189)) {
                        objectVolatile.getClass();
                        c61943 = c61944;
                        c61944 = (C6194) objectVolatile;
                    } else if (c61943 != null) {
                        C6194 c61946 = ((C6189) objectVolatile).f15284;
                        do {
                            C6194 c61947 = c61944;
                            unsafe = AbstractC9322.f23936;
                            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c61943, f15291, c61947, c61946);
                            c61944 = c61947;
                            if (zCompareAndSwapObject) {
                                this = c6194;
                                c61944 = c61943;
                                c61942 = c61945;
                                c61943 = null;
                            }
                        } while (unsafe.getObjectVolatile(c61943, j2) == c61944);
                    } else {
                        if (c61944 == null) {
                            C3775.m6954();
                            return null;
                        }
                        c61944 = (C6194) unsafe3.getObjectVolatile(c61944, j);
                    }
                    this = c6194;
                    c61942 = c61945;
                } else {
                    if (c61942 == c61944) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = AbstractC9322.f23936;
                        C6194 c61948 = this;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(c61948, f15290, c61942, c61944);
                        C6194 c61949 = c61942;
                        c6194 = c61948;
                        if (zCompareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(c6194, j) != c61949) {
                            break;
                        }
                        this = c6194;
                        c61942 = c61949;
                    }
                }
            }
            this = c6194;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10951(C6290 c6290) {
        f15293.getClass();
        Unsafe unsafe = AbstractC9322.f23936;
        unsafe.putObjectVolatile(c6290, f15290, this);
        f15295.getClass();
        long j = f15291;
        unsafe.putObjectVolatile(c6290, j, this);
        while (this.m10960() == this) {
            while (true) {
                Unsafe unsafe2 = AbstractC9322.f23936;
                C6194 c6194 = this;
                C6290 c62902 = c6290;
                if (unsafe2.compareAndSwapObject(c6194, f15291, this, c62902)) {
                    c62902.m10959(c6194);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(c6194, j) != c6194) {
                        break;
                    }
                    this = c6194;
                    c6290 = c62902;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m10952(C6194 c6194, C6194 c61942) {
        f15293.getClass();
        Unsafe unsafe = AbstractC9322.f23936;
        unsafe.putObjectVolatile(c6194, f15290, this);
        f15295.getClass();
        long j = f15291;
        unsafe.putObjectVolatile(c6194, j, c61942);
        while (true) {
            Unsafe unsafe2 = AbstractC9322.f23936;
            C6194 c61943 = this;
            C6194 c61944 = c6194;
            C6194 c61945 = c61942;
            if (unsafe2.compareAndSwapObject(c61943, f15291, c61945, c61944)) {
                c61944.m10959(c61945);
                return true;
            }
            if (unsafe2.getObjectVolatile(c61943, j) != c61945) {
                return false;
            }
            this = c61943;
            c61942 = c61945;
            c6194 = c61944;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m10953(C6194 c6194, int i) {
        C6194 c6194M10958;
        do {
            c6194M10958 = m10958();
            if (c6194M10958 instanceof C6195) {
                return (((C6195) c6194M10958).f15296 & i) == 0 && c6194M10958.m10953(c6194, i);
            }
        } while (!c6194M10958.m10952(c6194, this));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C6194 m10954() {
        C6194 c6194;
        while (true) {
            Object objM10960 = this.m10960();
            if (objM10960 instanceof C6189) {
                return ((C6189) objM10960).f15284;
            }
            if (objM10960 == this) {
                return (C6194) objM10960;
            }
            objM10960.getClass();
            C6194 c61942 = (C6194) objM10960;
            C6189 c6189M10956 = c61942.m10956();
            while (true) {
                f15295.getClass();
                Unsafe unsafe = AbstractC9322.f23936;
                long j = f15291;
                c6194 = this;
                if (unsafe.compareAndSwapObject(c6194, j, objM10960, c6189M10956)) {
                    c61942.m10950();
                    return null;
                }
                if (unsafe.getObjectVolatile(c6194, j) != objM10960) {
                    break;
                }
                this = c6194;
            }
            this = c6194;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean mo10955() {
        return m10960() instanceof C6189;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C6189 m10956() {
        f15294.getClass();
        Unsafe unsafe = AbstractC9322.f23936;
        long j = f15292;
        C6189 c6189 = (C6189) unsafe.getObjectVolatile(this, j);
        if (c6189 != null) {
            return c6189;
        }
        C6189 c61892 = new C6189(this);
        unsafe.putObjectVolatile(this, j, c61892);
        return c61892;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C6194 m10957() {
        Object objM10960 = m10960();
        C6189 c6189 = objM10960 instanceof C6189 ? (C6189) objM10960 : null;
        if (c6189 != null) {
            return c6189.f15284;
        }
        objM10960.getClass();
        return (C6194) objM10960;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C6194 m10958() {
        C6194 c6194M10950 = m10950();
        if (c6194M10950 != null) {
            return c6194M10950;
        }
        f15293.getClass();
        return m10949((C6194) AbstractC9322.f23936.getObjectVolatile(this, f15290));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10959(C6194 c6194) {
        C6194 c61942;
        while (true) {
            f15293.getClass();
            if (c6194 == null) {
                C3775.m6954();
                return;
            }
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15290;
            C6194 c61943 = (C6194) unsafe.getObjectVolatile(c6194, j);
            if (this.m10960() != c6194) {
                return;
            }
            while (c6194 != null) {
                Unsafe unsafe2 = AbstractC9322.f23936;
                c61942 = this;
                C6194 c61944 = c6194;
                if (unsafe2.compareAndSwapObject(c61944, f15290, c61943, c61942)) {
                    if (c61942.mo10955()) {
                        c61944.m10950();
                        return;
                    }
                    return;
                } else {
                    if (c61944 == null) {
                        C3775.m6954();
                        return;
                    }
                    c6194 = c61944;
                    if (unsafe2.getObjectVolatile(c61944, j) != c61943) {
                        break;
                    } else {
                        this = c61942;
                    }
                }
            }
            C3775.m6954();
            return;
            this = c61942;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m10960() {
        f15295.getClass();
        return AbstractC9322.f23936.getObjectVolatile(this, f15291);
    }
}
