package kotlinx.coroutines.internal;

import com.alibaba.fastjson2.C2942;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.AbstractC5399;
import p291.AbstractC8493;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5362 {

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
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14950 = AtomicReferenceFieldUpdater.newUpdater(C5362.class, Object.class, "_next$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = AbstractC8493.f23591;
        f14946 = unsafe.objectFieldOffset(C5362.class.getDeclaredField("_next$volatile"));
        f14948 = AtomicReferenceFieldUpdater.newUpdater(C5362.class, Object.class, "_prev$volatile");
        f14945 = unsafe.objectFieldOffset(C5362.class.getDeclaredField("_prev$volatile"));
        f14949 = AtomicReferenceFieldUpdater.newUpdater(C5362.class, Object.class, "_removedRef$volatile");
        f14947 = unsafe.objectFieldOffset(C5362.class.getDeclaredField("_removedRef$volatile"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C5362 m10390(C5362 c5362) {
        while (c5362.mo10396()) {
            f14948.getClass();
            c5362 = (C5362) AbstractC8493.f23591.getObjectVolatile(c5362, f14945);
        }
        return c5362;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
            public Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + AbstractC5399.m10501(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.C5362 m10391() {
        /*
            r15 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C5362.f14948
            r0.getClass()
            sun.misc.Unsafe r0 = p291.AbstractC8493.f23591
            long r1 = kotlinx.coroutines.internal.C5362.f14945
            java.lang.Object r0 = r0.getObjectVolatile(r15, r1)
            r7 = r0
            kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲 r7 = (kotlinx.coroutines.internal.C5362) r7
            r0 = 0
            r9 = r0
            r8 = r7
        L13:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.C5362.f14950
            r3.getClass()
            if (r8 == 0) goto L85
            sun.misc.Unsafe r3 = p291.AbstractC8493.f23591
            long r4 = kotlinx.coroutines.internal.C5362.f14946
            java.lang.Object r6 = r3.getObjectVolatile(r8, r4)
            if (r6 != r15) goto L40
            if (r7 != r8) goto L27
            goto L34
        L27:
            sun.misc.Unsafe r3 = p291.AbstractC8493.f23591
            long r5 = kotlinx.coroutines.internal.C5362.f14945
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
            boolean r15 = r7.mo10396()
            if (r15 == 0) goto L49
            return r0
        L49:
            boolean r15 = r6 instanceof kotlinx.coroutines.internal.C5357
            if (r15 == 0) goto L7c
            if (r9 == 0) goto L6c
            kotlinx.coroutines.internal.飘花落叶言子楪哲世苏兰 r6 = (kotlinx.coroutines.internal.C5357) r6
            kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲 r13 = r6.f14939
        L53:
            r12 = r8
            sun.misc.Unsafe r8 = p291.AbstractC8493.f23591
            long r10 = kotlinx.coroutines.internal.C5362.f14946
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
            kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲 r8 = (kotlinx.coroutines.internal.C5362) r8
        L75:
            r15 = r7
            r7 = r14
            goto L13
        L78:
            com.alibaba.fastjson2.C2942.m6394()
            return r0
        L7c:
            r6.getClass()
            r15 = r6
            kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲 r15 = (kotlinx.coroutines.internal.C5362) r15
            r9 = r8
            r8 = r15
            goto L75
        L85:
            com.alibaba.fastjson2.C2942.m6394()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C5362.m10391():kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲");
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
    public final void m10392(kotlinx.coroutines.C5458 r10) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C5362.f14948
            r0.getClass()
            sun.misc.Unsafe r0 = p291.AbstractC8493.f23591
            long r1 = kotlinx.coroutines.internal.C5362.f14945
            r0.putObjectVolatile(r10, r1, r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C5362.f14950
            r1.getClass()
            long r1 = kotlinx.coroutines.internal.C5362.f14946
            r0.putObjectVolatile(r10, r1, r9)
        L16:
            java.lang.Object r0 = r9.m10401()
            if (r0 == r9) goto L1d
            return
        L1d:
            sun.misc.Unsafe r3 = p291.AbstractC8493.f23591
            long r5 = kotlinx.coroutines.internal.C5362.f14946
            r7 = r9
            r4 = r9
            r8 = r10
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2e
            r8.m10400(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C5362.m10392(kotlinx.coroutines.飘花落叶言子苏兰楪世哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m10393(C5362 c5362, C5362 c53622) {
        f14948.getClass();
        Unsafe unsafe = AbstractC8493.f23591;
        unsafe.putObjectVolatile(c5362, f14945, this);
        f14950.getClass();
        long j = f14946;
        unsafe.putObjectVolatile(c5362, j, c53622);
        while (true) {
            Unsafe unsafe2 = AbstractC8493.f23591;
            C5362 c53623 = this;
            C5362 c53624 = c5362;
            C5362 c53625 = c53622;
            if (unsafe2.compareAndSwapObject(c53623, f14946, c53625, c53624)) {
                c53624.m10400(c53625);
                return true;
            }
            if (unsafe2.getObjectVolatile(c53623, j) != c53625) {
                return false;
            }
            this = c53623;
            c53622 = c53625;
            c5362 = c53624;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m10394(C5362 c5362, int i) {
        C5362 c5362M10399;
        do {
            c5362M10399 = m10399();
            if (c5362M10399 instanceof C5363) {
                return (((C5363) c5362M10399).f14951 & i) == 0 && c5362M10399.m10394(c5362, i);
            }
        } while (!c5362M10399.m10393(c5362, this));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C5362 m10395() {
        C5362 c5362;
        while (true) {
            Object objM10401 = this.m10401();
            if (objM10401 instanceof C5357) {
                return ((C5357) objM10401).f14939;
            }
            if (objM10401 == this) {
                return (C5362) objM10401;
            }
            objM10401.getClass();
            C5362 c53622 = (C5362) objM10401;
            C5357 c5357M10397 = c53622.m10397();
            while (true) {
                f14950.getClass();
                Unsafe unsafe = AbstractC8493.f23591;
                long j = f14946;
                c5362 = this;
                if (unsafe.compareAndSwapObject(c5362, j, objM10401, c5357M10397)) {
                    c53622.m10391();
                    return null;
                }
                if (unsafe.getObjectVolatile(c5362, j) != objM10401) {
                    break;
                }
                this = c5362;
            }
            this = c5362;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean mo10396() {
        return m10401() instanceof C5357;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C5357 m10397() {
        f14949.getClass();
        Unsafe unsafe = AbstractC8493.f23591;
        long j = f14947;
        C5357 c5357 = (C5357) unsafe.getObjectVolatile(this, j);
        if (c5357 != null) {
            return c5357;
        }
        C5357 c53572 = new C5357(this);
        unsafe.putObjectVolatile(this, j, c53572);
        return c53572;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C5362 m10398() {
        Object objM10401 = m10401();
        C5357 c5357 = objM10401 instanceof C5357 ? (C5357) objM10401 : null;
        if (c5357 != null) {
            return c5357.f14939;
        }
        objM10401.getClass();
        return (C5362) objM10401;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C5362 m10399() {
        C5362 c5362M10391 = m10391();
        if (c5362M10391 != null) {
            return c5362M10391;
        }
        f14948.getClass();
        return m10390((C5362) AbstractC8493.f23591.getObjectVolatile(this, f14945));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10400(C5362 c5362) {
        C5362 c53622;
        while (true) {
            f14948.getClass();
            if (c5362 == null) {
                C2942.m6394();
                return;
            }
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f14945;
            C5362 c53623 = (C5362) unsafe.getObjectVolatile(c5362, j);
            if (this.m10401() != c5362) {
                return;
            }
            while (c5362 != null) {
                Unsafe unsafe2 = AbstractC8493.f23591;
                c53622 = this;
                C5362 c53624 = c5362;
                if (unsafe2.compareAndSwapObject(c53624, f14945, c53623, c53622)) {
                    if (c53622.mo10396()) {
                        c53624.m10391();
                        return;
                    }
                    return;
                } else {
                    if (c53624 == null) {
                        C2942.m6394();
                        return;
                    }
                    c5362 = c53624;
                    if (unsafe2.getObjectVolatile(c53624, j) != c53623) {
                        break;
                    } else {
                        this = c53622;
                    }
                }
            }
            C2942.m6394();
            return;
            this = c53622;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m10401() {
        f14950.getClass();
        return AbstractC8493.f23591.getObjectVolatile(this, f14946);
    }
}
