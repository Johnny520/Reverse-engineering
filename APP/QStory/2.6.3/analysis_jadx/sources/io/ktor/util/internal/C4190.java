package io.ktor.util.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p240.C8134;
import p291.AbstractC8493;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.util.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4190 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ long f12657;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ long f12658;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12661 = AtomicReferenceFieldUpdater.newUpdater(C4190.class, Object.class, "_next");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    static {
        Unsafe unsafe = AbstractC8493.f23591;
        f12658 = unsafe.objectFieldOffset(C4190.class.getDeclaredField("_next"));
        f12659 = AtomicReferenceFieldUpdater.newUpdater(C4190.class, Object.class, "_prev");
        f12657 = unsafe.objectFieldOffset(C4190.class.getDeclaredField("_prev"));
        f12660 = AtomicReferenceFieldUpdater.newUpdater(C4190.class, Object.class, "_removedRef");
    }

    public void dispose() {
        m8565();
    }

    public final String toString() {
        return AbstractC4396.f12975.mo8917(getClass()).getSimpleName() + '@' + hashCode();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4190 m8557() {
        return AbstractC5062.m10010(this._next);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m8558() {
        return this._next;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8559(C4190 c4190) {
        C4190 c41902;
        while (true) {
            Object obj = c4190._prev;
            if ((obj instanceof C4189) || this._next != c4190) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12659;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8493.f23591;
                long j = f12657;
                c41902 = this;
                C4190 c41903 = c4190;
                if (unsafe.compareAndSwapObject(c41903, j, obj, c41902)) {
                    if (c41902._next instanceof C4189) {
                        obj.getClass();
                        c41903.m8560((C4190) obj);
                        return;
                    }
                    return;
                }
                c4190 = c41903;
                if (unsafe.getObjectVolatile(c41903, j) != obj) {
                    break;
                } else {
                    this = c41902;
                }
            }
            this = c41902;
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
    public final void m8560(io.ktor.util.internal.C4190 r12) {
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
            boolean r1 = r12 instanceof io.ktor.util.internal.C4189
            if (r1 == 0) goto L3b
            if (r2 == 0) goto L32
            r5.m8564()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = io.ktor.util.internal.C4190.f12661
            io.ktor.util.internal.飘花落叶言子楪世哲苏兰 r12 = (io.ktor.util.internal.C4189) r12
            io.ktor.util.internal.飘花落叶言子楪世苏兰哲 r6 = r12.f12656
        L18:
            r7.getClass()
            sun.misc.Unsafe r1 = p291.AbstractC8493.f23591
            long r3 = io.ktor.util.internal.C4190.f12658
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
            io.ktor.util.internal.飘花落叶言子楪世苏兰哲 r12 = kotlin.reflect.jvm.internal.AbstractC5062.m10010(r12)
            r5 = r12
            goto L3
        L3b:
            r8 = r2
            r6 = r5
            java.lang.Object r5 = r11._prev
            boolean r1 = r5 instanceof io.ktor.util.internal.C4189
            if (r1 == 0) goto L44
            goto L6c
        L44:
            if (r12 == r11) goto L4e
            r12.getClass()
            r5 = r12
            io.ktor.util.internal.飘花落叶言子楪世苏兰哲 r5 = (io.ktor.util.internal.C4190) r5
            r2 = r6
            goto L3
        L4e:
            if (r5 != r6) goto L51
            goto L6c
        L51:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = io.ktor.util.internal.C4190.f12659
        L53:
            r12.getClass()
            sun.misc.Unsafe r1 = p291.AbstractC8493.f23591
            long r3 = io.ktor.util.internal.C4190.f12657
            r2 = r11
            boolean r11 = r1.compareAndSwapObject(r2, r3, r5, r6)
            r9 = r3
            r3 = r1
            r1 = r5
            r5 = r6
            r6 = r9
            if (r11 == 0) goto L6d
            java.lang.Object r11 = r5._prev
            boolean r11 = r11 instanceof io.ktor.util.internal.C4189
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
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.internal.C4190.m8560(io.ktor.util.internal.飘花落叶言子楪世苏兰哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m8561(C8134 c8134, C4191 c4191) {
        c4191.getClass();
        f12659.lazySet(c8134, this);
        f12661.lazySet(c8134, c4191);
        while (true) {
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f12658;
            C4190 c4190 = this;
            C8134 c81342 = c8134;
            C4191 c41912 = c4191;
            if (unsafe.compareAndSwapObject(c4190, j, c41912, c81342)) {
                c81342.m8559(c41912);
                return true;
            }
            if (unsafe.getObjectVolatile(c4190, j) != c41912) {
                return false;
            }
            this = c4190;
            c4191 = c41912;
            c8134 = c81342;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8562(C8134 c8134) {
        while (true) {
            Object obj = this._prev;
            if (!(obj instanceof C4189)) {
                obj.getClass();
                C4190 c4190 = (C4190) obj;
                if (c4190._next != this) {
                    m8560(c4190);
                }
            }
            if (((C4190) obj).m8561(c8134, (C4191) this)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m8563() {
        C4190 c4190;
        C4190 c41902;
        C4190 c4190M8564 = m8564();
        Object obj = this._next;
        obj.getClass();
        C4190 c41903 = ((C4189) obj).f12656;
        C4190 c4190M10010 = c4190M8564;
        C4190 c41904 = null;
        while (true) {
            Object obj2 = c41903._next;
            if (obj2 instanceof C4189) {
                c41903.m8564();
                c41903 = ((C4189) obj2).f12656;
            } else {
                Object obj3 = c4190M10010._next;
                if (!(obj3 instanceof C4189)) {
                    c41902 = c41904;
                    if (obj3 != this) {
                        obj3.getClass();
                        C4190 c41905 = (C4190) obj3;
                        if (c41905 == c41903) {
                            return;
                        }
                        C4190 c41906 = c4190M10010;
                        c4190M10010 = c41905;
                        c41904 = c41906;
                    } else {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12661;
                        while (true) {
                            atomicReferenceFieldUpdater.getClass();
                            Unsafe unsafe = AbstractC8493.f23591;
                            long j = f12658;
                            C4190 c41907 = this;
                            C4190 c41908 = c41903;
                            if (unsafe.compareAndSwapObject(c4190M10010, j, c41907, c41908)) {
                                return;
                            }
                            if (unsafe.getObjectVolatile(c4190M10010, j) != c41907) {
                                this = c41907;
                                c41903 = c41908;
                                break;
                            } else {
                                this = c41907;
                                c41903 = c41908;
                            }
                        }
                        c41904 = c41902;
                    }
                } else if (c41904 != null) {
                    c4190M10010.m8564();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12661;
                    C4190 c41909 = ((C4189) obj3).f12656;
                    while (true) {
                        atomicReferenceFieldUpdater2.getClass();
                        Unsafe unsafe2 = AbstractC8493.f23591;
                        long j2 = f12658;
                        C4190 c419010 = c4190M10010;
                        c4190 = c41904;
                        boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(c4190, j2, c419010, c41909);
                        c4190M10010 = c419010;
                        if (zCompareAndSwapObject || unsafe2.getObjectVolatile(c4190, j2) != c4190M10010) {
                            break;
                        } else {
                            c41904 = c4190;
                        }
                    }
                    c41904 = null;
                    c4190M10010 = c4190;
                } else {
                    c41902 = c41904;
                    c4190M10010 = AbstractC5062.m10010(c4190M10010._prev);
                    c41904 = c41902;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4190 m8564() {
        C4190 c4190M10010;
        C4190 c4190;
        while (true) {
            Object obj = this._prev;
            if (obj instanceof C4189) {
                return ((C4189) obj).f12656;
            }
            if (obj == this) {
                c4190M10010 = this;
                while (!(c4190M10010 instanceof C4191)) {
                    c4190M10010 = AbstractC5062.m10010(c4190M10010._next);
                    if (c4190M10010 == this) {
                        C5925.m11311("Cannot loop to this while looking for list head");
                        return null;
                    }
                }
            } else {
                obj.getClass();
                c4190M10010 = (C4190) obj;
            }
            C4189 c4189 = (C4189) c4190M10010._removedRef;
            if (c4189 == null) {
                c4189 = new C4189(c4190M10010);
                f12660.lazySet(c4190M10010, c4189);
            }
            C4189 c41892 = c4189;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12659;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8493.f23591;
                long j = f12657;
                c4190 = this;
                if (unsafe.compareAndSwapObject(c4190, j, obj, c41892)) {
                    return (C4190) obj;
                }
                if (unsafe.getObjectVolatile(c4190, j) != obj) {
                    break;
                }
                this = c4190;
            }
            this = c4190;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m8565() {
        C4190 c4190;
        while (true) {
            Object obj = this._next;
            if ((obj instanceof C4189) || obj == this) {
                return false;
            }
            obj.getClass();
            C4190 c41902 = (C4190) obj;
            C4189 c4189 = (C4189) c41902._removedRef;
            if (c4189 == null) {
                c4189 = new C4189(c41902);
                f12660.lazySet(c41902, c4189);
            }
            C4189 c41892 = c4189;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12661;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8493.f23591;
                long j = f12658;
                c4190 = this;
                if (unsafe.compareAndSwapObject(c4190, j, obj, c41892)) {
                    c4190.m8563();
                    c41902.m8560(AbstractC5062.m10010(c4190._prev));
                    return true;
                }
                if (unsafe.getObjectVolatile(c4190, j) != obj) {
                    break;
                }
                this = c4190;
            }
            this = c4190;
        }
    }
}
