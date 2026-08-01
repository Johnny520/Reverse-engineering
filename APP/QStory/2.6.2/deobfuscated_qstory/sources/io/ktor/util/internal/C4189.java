package io.ktor.util.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4395;
import p033.AbstractC6325;
import p240.C8133;
import p291.AbstractC8501;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.util.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ long f12653;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ long f12654;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12655;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12656;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12657 = AtomicReferenceFieldUpdater.newUpdater(C4189.class, Object.class, "_next");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    static {
        Unsafe unsafe = AbstractC8501.f23600;
        f12654 = unsafe.objectFieldOffset(C4189.class.getDeclaredField("_next"));
        f12655 = AtomicReferenceFieldUpdater.newUpdater(C4189.class, Object.class, "_prev");
        f12653 = unsafe.objectFieldOffset(C4189.class.getDeclaredField("_prev"));
        f12656 = AtomicReferenceFieldUpdater.newUpdater(C4189.class, Object.class, "_removedRef");
    }

    public void dispose() {
        m8575();
    }

    public final String toString() {
        return AbstractC4395.f12971.mo8927(getClass()).getSimpleName() + '@' + hashCode();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4189 m8567() {
        return AbstractC6325.m11841(this._next);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m8568() {
        return this._next;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8569(C4189 c4189) {
        C4189 c41892;
        while (true) {
            Object obj = c4189._prev;
            if ((obj instanceof C4188) || this._next != c4189) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12655;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8501.f23600;
                long j = f12653;
                c41892 = this;
                C4189 c41893 = c4189;
                if (unsafe.compareAndSwapObject(c41893, j, obj, c41892)) {
                    if (c41892._next instanceof C4188) {
                        obj.getClass();
                        c41893.m8570((C4189) obj);
                        return;
                    }
                    return;
                }
                c4189 = c41893;
                if (unsafe.getObjectVolatile(c41893, j) != obj) {
                    break;
                } else {
                    this = c41892;
                }
            }
            this = c41892;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        r11 = r2;
        r2 = r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8570(io.ktor.util.internal.C4189 r12) {
        /*
            r11 = this;
            r0 = 0
            r5 = r12
            r2 = r0
        L3:
            java.lang.Object r12 = r5._next
            if (r12 != 0) goto L9
            goto L6c
        L9:
            boolean r1 = r12 instanceof io.ktor.util.internal.C4188
            if (r1 == 0) goto L3b
            if (r2 == 0) goto L32
            r5.m8574()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = io.ktor.util.internal.C4189.f12657
            io.ktor.util.internal.飘花落叶言子楪世哲苏兰 r12 = (io.ktor.util.internal.C4188) r12
            io.ktor.util.internal.飘花落叶言子楪世苏兰哲 r6 = r12.f12652
        L18:
            r7.getClass()
            sun.misc.Unsafe r1 = p291.AbstractC8501.f23600
            long r3 = io.ktor.util.internal.C4189.f12654
            boolean r12 = r1.compareAndSwapObject(r2, r3, r5, r6)
            r8 = r2
            if (r12 == 0) goto L27
            goto L2d
        L27:
            java.lang.Object r12 = r1.getObjectVolatile(r8, r3)
            if (r12 == r5) goto L30
        L2d:
            r2 = r0
            r5 = r8
            goto L3
        L30:
            r2 = r8
            goto L18
        L32:
            r8 = r2
            java.lang.Object r12 = r5._prev
            io.ktor.util.internal.飘花落叶言子楪世苏兰哲 r12 = p033.AbstractC6325.m11841(r12)
            r5 = r12
            goto L3
        L3b:
            r8 = r2
            r6 = r5
            java.lang.Object r5 = r11._prev
            boolean r1 = r5 instanceof io.ktor.util.internal.C4188
            if (r1 == 0) goto L44
            goto L6c
        L44:
            if (r12 == r11) goto L4e
            r12.getClass()
            r5 = r12
            io.ktor.util.internal.飘花落叶言子楪世苏兰哲 r5 = (io.ktor.util.internal.C4189) r5
            r2 = r6
            goto L3
        L4e:
            if (r5 != r6) goto L51
            goto L6c
        L51:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = io.ktor.util.internal.C4189.f12655
        L53:
            r12.getClass()
            sun.misc.Unsafe r1 = p291.AbstractC8501.f23600
            long r3 = io.ktor.util.internal.C4189.f12653
            r2 = r11
            boolean r11 = r1.compareAndSwapObject(r2, r3, r5, r6)
            r9 = r3
            r3 = r1
            r1 = r5
            r5 = r6
            r6 = r9
            if (r11 == 0) goto L6d
            java.lang.Object r11 = r5._prev
            boolean r11 = r11 instanceof io.ktor.util.internal.C4188
            if (r11 != 0) goto L73
        L6c:
            return
        L6d:
            java.lang.Object r11 = r3.getObjectVolatile(r2, r6)
            if (r11 == r1) goto L76
        L73:
            r11 = r2
            r2 = r8
            goto L3
        L76:
            r11 = r2
            r6 = r5
            r5 = r1
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.internal.C4189.m8570(io.ktor.util.internal.飘花落叶言子楪世苏兰哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m8571(C8133 c8133, C4190 c4190) {
        c4190.getClass();
        f12655.lazySet(c8133, this);
        f12657.lazySet(c8133, c4190);
        while (true) {
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f12654;
            C4189 c4189 = this;
            C8133 c81332 = c8133;
            C4190 c41902 = c4190;
            if (unsafe.compareAndSwapObject(c4189, j, c41902, c81332)) {
                c81332.m8569(c41902);
                return true;
            }
            if (unsafe.getObjectVolatile(c4189, j) != c41902) {
                return false;
            }
            this = c4189;
            c4190 = c41902;
            c8133 = c81332;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8572(C8133 c8133) {
        while (true) {
            Object obj = this._prev;
            if (!(obj instanceof C4188)) {
                obj.getClass();
                C4189 c4189 = (C4189) obj;
                if (c4189._next != this) {
                    m8570(c4189);
                }
            }
            if (((C4189) obj).m8571(c8133, (C4190) this)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m8573() {
        C4189 c4189;
        C4189 c41892;
        C4189 c4189M8574 = m8574();
        Object obj = this._next;
        obj.getClass();
        C4189 c41893 = ((C4188) obj).f12652;
        C4189 c4189M11841 = c4189M8574;
        C4189 c41894 = null;
        while (true) {
            Object obj2 = c41893._next;
            if (obj2 instanceof C4188) {
                c41893.m8574();
                c41893 = ((C4188) obj2).f12652;
            } else {
                Object obj3 = c4189M11841._next;
                if (!(obj3 instanceof C4188)) {
                    c41892 = c41894;
                    if (obj3 != this) {
                        obj3.getClass();
                        C4189 c41895 = (C4189) obj3;
                        if (c41895 == c41893) {
                            return;
                        }
                        C4189 c41896 = c4189M11841;
                        c4189M11841 = c41895;
                        c41894 = c41896;
                    } else {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12657;
                        while (true) {
                            atomicReferenceFieldUpdater.getClass();
                            Unsafe unsafe = AbstractC8501.f23600;
                            long j = f12654;
                            C4189 c41897 = this;
                            C4189 c41898 = c41893;
                            if (unsafe.compareAndSwapObject(c4189M11841, j, c41897, c41898)) {
                                return;
                            }
                            if (unsafe.getObjectVolatile(c4189M11841, j) != c41897) {
                                this = c41897;
                                c41893 = c41898;
                                break;
                            } else {
                                this = c41897;
                                c41893 = c41898;
                            }
                        }
                        c41894 = c41892;
                    }
                } else if (c41894 != null) {
                    c4189M11841.m8574();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12657;
                    C4189 c41899 = ((C4188) obj3).f12652;
                    while (true) {
                        atomicReferenceFieldUpdater2.getClass();
                        Unsafe unsafe2 = AbstractC8501.f23600;
                        long j2 = f12654;
                        C4189 c418910 = c4189M11841;
                        c4189 = c41894;
                        boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(c4189, j2, c418910, c41899);
                        c4189M11841 = c418910;
                        if (zCompareAndSwapObject || unsafe2.getObjectVolatile(c4189, j2) != c4189M11841) {
                            break;
                        } else {
                            c41894 = c4189;
                        }
                    }
                    c41894 = null;
                    c4189M11841 = c4189;
                } else {
                    c41892 = c41894;
                    c4189M11841 = AbstractC6325.m11841(c4189M11841._prev);
                    c41894 = c41892;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4189 m8574() {
        C4189 c4189M11841;
        C4189 c4189;
        while (true) {
            Object obj = this._prev;
            if (obj instanceof C4188) {
                return ((C4188) obj).f12652;
            }
            if (obj == this) {
                c4189M11841 = this;
                while (!(c4189M11841 instanceof C4190)) {
                    c4189M11841 = AbstractC6325.m11841(c4189M11841._next);
                    if (c4189M11841 == this) {
                        C5919.m11250("Cannot loop to this while looking for list head");
                        return null;
                    }
                }
            } else {
                obj.getClass();
                c4189M11841 = (C4189) obj;
            }
            C4188 c4188 = (C4188) c4189M11841._removedRef;
            if (c4188 == null) {
                c4188 = new C4188(c4189M11841);
                f12656.lazySet(c4189M11841, c4188);
            }
            C4188 c41882 = c4188;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12655;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8501.f23600;
                long j = f12653;
                c4189 = this;
                if (unsafe.compareAndSwapObject(c4189, j, obj, c41882)) {
                    return (C4189) obj;
                }
                if (unsafe.getObjectVolatile(c4189, j) != obj) {
                    break;
                }
                this = c4189;
            }
            this = c4189;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m8575() {
        C4189 c4189;
        while (true) {
            Object obj = this._next;
            if ((obj instanceof C4188) || obj == this) {
                return false;
            }
            obj.getClass();
            C4189 c41892 = (C4189) obj;
            C4188 c4188 = (C4188) c41892._removedRef;
            if (c4188 == null) {
                c4188 = new C4188(c41892);
                f12656.lazySet(c41892, c4188);
            }
            C4188 c41882 = c4188;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12657;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8501.f23600;
                long j = f12654;
                c4189 = this;
                if (unsafe.compareAndSwapObject(c4189, j, obj, c41882)) {
                    c4189.m8573();
                    c41892.m8570(AbstractC6325.m11841(c4189._prev));
                    return true;
                }
                if (unsafe.getObjectVolatile(c4189, j) != obj) {
                    break;
                }
                this = c4189;
            }
            this = c4189;
        }
    }
}
