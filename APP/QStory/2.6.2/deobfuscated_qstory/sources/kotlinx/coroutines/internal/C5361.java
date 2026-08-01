package kotlinx.coroutines.internal;

import com.alibaba.fastjson2.C2941;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.AbstractC5398;
import p291.AbstractC8501;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5361 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ long f14945;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ long f14946;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ long f14947;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14948;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14949;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14950 = AtomicReferenceFieldUpdater.newUpdater(C5361.class, Object.class, "_next$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = AbstractC8501.f23600;
        f14946 = unsafe.objectFieldOffset(C5361.class.getDeclaredField("_next$volatile"));
        f14948 = AtomicReferenceFieldUpdater.newUpdater(C5361.class, Object.class, "_prev$volatile");
        f14945 = unsafe.objectFieldOffset(C5361.class.getDeclaredField("_prev$volatile"));
        f14949 = AtomicReferenceFieldUpdater.newUpdater(C5361.class, Object.class, "_removedRef$volatile");
        f14947 = unsafe.objectFieldOffset(C5361.class.getDeclaredField("_removedRef$volatile"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C5361 m10386(C5361 c5361) {
        while (c5361.mo10392()) {
            f14948.getClass();
            c5361 = (C5361) AbstractC8501.f23600.getObjectVolatile(c5361, f14945);
        }
        return c5361;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
            public Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + AbstractC5398.m10497(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.C5361 m10387() {
        /*
            r15 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C5361.f14948
            r0.getClass()
            sun.misc.Unsafe r0 = p291.AbstractC8501.f23600
            long r1 = kotlinx.coroutines.internal.C5361.f14945
            java.lang.Object r0 = r0.getObjectVolatile(r15, r1)
            r7 = r0
            kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲 r7 = (kotlinx.coroutines.internal.C5361) r7
            r0 = 0
            r9 = r0
            r8 = r7
        L13:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.C5361.f14950
            r3.getClass()
            if (r8 == 0) goto L85
            sun.misc.Unsafe r3 = p291.AbstractC8501.f23600
            long r4 = kotlinx.coroutines.internal.C5361.f14946
            java.lang.Object r6 = r3.getObjectVolatile(r8, r4)
            if (r6 != r15) goto L40
            if (r7 != r8) goto L27
            goto L34
        L27:
            sun.misc.Unsafe r3 = p291.AbstractC8501.f23600
            long r5 = kotlinx.coroutines.internal.C5361.f14945
            r4 = r15
            boolean r15 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r14 = r7
            r7 = r4
            if (r15 == 0) goto L35
        L34:
            return r8
        L35:
            java.lang.Object r15 = r3.getObjectVolatile(r7, r1)
            if (r15 == r14) goto L3d
        L3b:
            r15 = r7
            goto L0
        L3d:
            r15 = r7
            r7 = r14
            goto L27
        L40:
            r14 = r7
            r7 = r15
            boolean r15 = r7.mo10392()
            if (r15 == 0) goto L49
            return r0
        L49:
            boolean r15 = r6 instanceof kotlinx.coroutines.internal.C5356
            if (r15 == 0) goto L7c
            if (r9 == 0) goto L6c
            kotlinx.coroutines.internal.飘花落叶言子楪哲世苏兰 r6 = (kotlinx.coroutines.internal.C5356) r6
            kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲 r13 = r6.f14939
        L53:
            r12 = r8
            sun.misc.Unsafe r8 = p291.AbstractC8501.f23600
            long r10 = kotlinx.coroutines.internal.C5361.f14946
            boolean r15 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r3 = r8
            r8 = r12
            if (r15 == 0) goto L65
            r15 = r7
            r8 = r9
            r7 = r14
            r9 = r0
            goto L13
        L65:
            java.lang.Object r15 = r3.getObjectVolatile(r9, r4)
            if (r15 == r8) goto L53
            goto L3b
        L6c:
            if (r8 == 0) goto L78
            java.lang.Object r15 = r3.getObjectVolatile(r8, r1)
            r8 = r15
            kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲 r8 = (kotlinx.coroutines.internal.C5361) r8
        L75:
            r15 = r7
            r7 = r14
            goto L13
        L78:
            com.alibaba.fastjson2.C2941.m6336()
            return r0
        L7c:
            r6.getClass()
            r15 = r6
            kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲 r15 = (kotlinx.coroutines.internal.C5361) r15
            r9 = r8
            r8 = r15
            goto L75
        L85:
            com.alibaba.fastjson2.C2941.m6336()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C5361.m10387():kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10388(kotlinx.coroutines.C5457 r10) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C5361.f14948
            r0.getClass()
            sun.misc.Unsafe r0 = p291.AbstractC8501.f23600
            long r1 = kotlinx.coroutines.internal.C5361.f14945
            r0.putObjectVolatile(r10, r1, r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C5361.f14950
            r1.getClass()
            long r1 = kotlinx.coroutines.internal.C5361.f14946
            r0.putObjectVolatile(r10, r1, r9)
        L16:
            java.lang.Object r0 = r9.m10397()
            if (r0 == r9) goto L1d
            return
        L1d:
            sun.misc.Unsafe r3 = p291.AbstractC8501.f23600
            long r5 = kotlinx.coroutines.internal.C5361.f14946
            r7 = r9
            r4 = r9
            r8 = r10
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2e
            r8.m10396(r4)
            return
        L2e:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r4) goto L37
            r9 = r4
            r10 = r8
            goto L16
        L37:
            r9 = r4
            r10 = r8
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C5361.m10388(kotlinx.coroutines.飘花落叶言子苏兰楪世哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m10389(C5361 c5361, C5361 c53612) {
        f14948.getClass();
        Unsafe unsafe = AbstractC8501.f23600;
        unsafe.putObjectVolatile(c5361, f14945, this);
        f14950.getClass();
        long j = f14946;
        unsafe.putObjectVolatile(c5361, j, c53612);
        while (true) {
            Unsafe unsafe2 = AbstractC8501.f23600;
            C5361 c53613 = this;
            C5361 c53614 = c5361;
            C5361 c53615 = c53612;
            if (unsafe2.compareAndSwapObject(c53613, f14946, c53615, c53614)) {
                c53614.m10396(c53615);
                return true;
            }
            if (unsafe2.getObjectVolatile(c53613, j) != c53615) {
                return false;
            }
            this = c53613;
            c53612 = c53615;
            c5361 = c53614;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m10390(C5361 c5361, int i) {
        C5361 c5361M10395;
        do {
            c5361M10395 = m10395();
            if (c5361M10395 instanceof C5362) {
                return (((C5362) c5361M10395).f14951 & i) == 0 && c5361M10395.m10390(c5361, i);
            }
        } while (!c5361M10395.m10389(c5361, this));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C5361 m10391() {
        C5361 c5361;
        while (true) {
            Object objM10397 = this.m10397();
            if (objM10397 instanceof C5356) {
                return ((C5356) objM10397).f14939;
            }
            if (objM10397 == this) {
                return (C5361) objM10397;
            }
            objM10397.getClass();
            C5361 c53612 = (C5361) objM10397;
            C5356 c5356M10393 = c53612.m10393();
            while (true) {
                f14950.getClass();
                Unsafe unsafe = AbstractC8501.f23600;
                long j = f14946;
                c5361 = this;
                if (unsafe.compareAndSwapObject(c5361, j, objM10397, c5356M10393)) {
                    c53612.m10387();
                    return null;
                }
                if (unsafe.getObjectVolatile(c5361, j) != objM10397) {
                    break;
                }
                this = c5361;
            }
            this = c5361;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean mo10392() {
        return m10397() instanceof C5356;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C5356 m10393() {
        f14949.getClass();
        Unsafe unsafe = AbstractC8501.f23600;
        long j = f14947;
        C5356 c5356 = (C5356) unsafe.getObjectVolatile(this, j);
        if (c5356 != null) {
            return c5356;
        }
        C5356 c53562 = new C5356(this);
        unsafe.putObjectVolatile(this, j, c53562);
        return c53562;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C5361 m10394() {
        Object objM10397 = m10397();
        C5356 c5356 = objM10397 instanceof C5356 ? (C5356) objM10397 : null;
        if (c5356 != null) {
            return c5356.f14939;
        }
        objM10397.getClass();
        return (C5361) objM10397;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C5361 m10395() {
        C5361 c5361M10387 = m10387();
        if (c5361M10387 != null) {
            return c5361M10387;
        }
        f14948.getClass();
        return m10386((C5361) AbstractC8501.f23600.getObjectVolatile(this, f14945));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10396(C5361 c5361) {
        C5361 c53612;
        while (true) {
            f14948.getClass();
            if (c5361 == null) {
                C2941.m6336();
                return;
            }
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f14945;
            C5361 c53613 = (C5361) unsafe.getObjectVolatile(c5361, j);
            if (this.m10397() != c5361) {
                return;
            }
            while (c5361 != null) {
                Unsafe unsafe2 = AbstractC8501.f23600;
                c53612 = this;
                C5361 c53614 = c5361;
                if (unsafe2.compareAndSwapObject(c53614, f14945, c53613, c53612)) {
                    if (c53612.mo10392()) {
                        c53614.m10387();
                        return;
                    }
                    return;
                } else {
                    if (c53614 == null) {
                        C2941.m6336();
                        return;
                    }
                    c5361 = c53614;
                    if (unsafe2.getObjectVolatile(c53614, j) != c53613) {
                        break;
                    } else {
                        this = c53612;
                    }
                }
            }
            C2941.m6336();
            return;
            this = c53612;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m10397() {
        f14950.getClass();
        return AbstractC8501.f23600.getObjectVolatile(this, f14946);
    }
}
