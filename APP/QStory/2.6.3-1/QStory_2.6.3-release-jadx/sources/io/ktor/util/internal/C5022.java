package io.ktor.util.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p256.C8963;
import p307.AbstractC9322;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.util.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5022 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ long f13002;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ long f13003;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13004;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13005;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13006 = AtomicReferenceFieldUpdater.newUpdater(C5022.class, Object.class, "_next");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    static {
        Unsafe unsafe = AbstractC9322.f23936;
        f13003 = unsafe.objectFieldOffset(C5022.class.getDeclaredField("_next"));
        f13004 = AtomicReferenceFieldUpdater.newUpdater(C5022.class, Object.class, "_prev");
        f13002 = unsafe.objectFieldOffset(C5022.class.getDeclaredField("_prev"));
        f13005 = AtomicReferenceFieldUpdater.newUpdater(C5022.class, Object.class, "_removedRef");
    }

    public void dispose() {
        m9124();
    }

    public final String toString() {
        return AbstractC5228.f13320.mo9476(getClass()).getSimpleName() + '@' + hashCode();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5022 m9116() {
        return AbstractC5894.m10569(this._next);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m9117() {
        return this._next;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m9118(C5022 c5022) {
        C5022 c50222;
        while (true) {
            Object obj = c5022._prev;
            if ((obj instanceof C5021) || this._next != c5022) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13004;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC9322.f23936;
                long j = f13002;
                c50222 = this;
                C5022 c50223 = c5022;
                if (unsafe.compareAndSwapObject(c50223, j, obj, c50222)) {
                    if (c50222._next instanceof C5021) {
                        obj.getClass();
                        c50223.m9119((C5022) obj);
                        return;
                    }
                    return;
                }
                c5022 = c50223;
                if (unsafe.getObjectVolatile(c50223, j) != obj) {
                    break;
                } else {
                    this = c50222;
                }
            }
            this = c50222;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        r11 = r2;
        r2 = r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9119(C5022 c5022) {
        C5022 c50222;
        C5022 c5022M10569 = c5022;
        C5022 c50223 = null;
        while (true) {
            Object obj = c5022M10569._next;
            if (obj == null) {
                return;
            }
            if (!(obj instanceof C5021)) {
                C5022 c50224 = c50223;
                C5022 c50225 = c5022M10569;
                Object obj2 = this._prev;
                if (obj2 instanceof C5021) {
                    return;
                }
                if (obj != this) {
                    obj.getClass();
                    c5022M10569 = (C5022) obj;
                    c50223 = c50225;
                } else {
                    if (obj2 == c50225) {
                        return;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13004;
                    while (true) {
                        atomicReferenceFieldUpdater.getClass();
                        Unsafe unsafe = AbstractC9322.f23936;
                        long j = f13002;
                        C5022 c50226 = this;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(c50226, j, obj2, c50225);
                        Object obj3 = obj2;
                        c5022M10569 = c50225;
                        if (zCompareAndSwapObject) {
                            if (!(c5022M10569._prev instanceof C5021)) {
                                return;
                            }
                        } else {
                            if (unsafe.getObjectVolatile(c50226, j) != obj3) {
                                break;
                            }
                            this = c50226;
                            c50225 = c5022M10569;
                            obj2 = obj3;
                        }
                    }
                }
            } else if (c50223 != null) {
                c5022M10569.m9123();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13006;
                C5022 c50227 = ((C5021) obj).f13001;
                while (true) {
                    atomicReferenceFieldUpdater2.getClass();
                    Unsafe unsafe2 = AbstractC9322.f23936;
                    long j2 = f13003;
                    c50222 = c50223;
                    if (unsafe2.compareAndSwapObject(c50223, j2, c5022M10569, c50227) || unsafe2.getObjectVolatile(c50222, j2) != c5022M10569) {
                        break;
                    } else {
                        c50223 = c50222;
                    }
                }
                c50223 = null;
                c5022M10569 = c50222;
            } else {
                c5022M10569 = AbstractC5894.m10569(c5022M10569._prev);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m9120(C8963 c8963, C5023 c5023) {
        c5023.getClass();
        f13004.lazySet(c8963, this);
        f13006.lazySet(c8963, c5023);
        while (true) {
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f13003;
            C5022 c5022 = this;
            C8963 c89632 = c8963;
            C5023 c50232 = c5023;
            if (unsafe.compareAndSwapObject(c5022, j, c50232, c89632)) {
                c89632.m9118(c50232);
                return true;
            }
            if (unsafe.getObjectVolatile(c5022, j) != c50232) {
                return false;
            }
            this = c5022;
            c5023 = c50232;
            c8963 = c89632;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m9121(C8963 c8963) {
        while (true) {
            Object obj = this._prev;
            if (!(obj instanceof C5021)) {
                obj.getClass();
                C5022 c5022 = (C5022) obj;
                if (c5022._next != this) {
                    m9119(c5022);
                }
            }
            if (((C5022) obj).m9120(c8963, (C5023) this)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m9122() {
        C5022 c5022;
        C5022 c50222;
        C5022 c5022M9123 = m9123();
        Object obj = this._next;
        obj.getClass();
        C5022 c50223 = ((C5021) obj).f13001;
        C5022 c5022M10569 = c5022M9123;
        C5022 c50224 = null;
        while (true) {
            Object obj2 = c50223._next;
            if (obj2 instanceof C5021) {
                c50223.m9123();
                c50223 = ((C5021) obj2).f13001;
            } else {
                Object obj3 = c5022M10569._next;
                if (!(obj3 instanceof C5021)) {
                    c50222 = c50224;
                    if (obj3 != this) {
                        obj3.getClass();
                        C5022 c50225 = (C5022) obj3;
                        if (c50225 == c50223) {
                            return;
                        }
                        C5022 c50226 = c5022M10569;
                        c5022M10569 = c50225;
                        c50224 = c50226;
                    } else {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13006;
                        while (true) {
                            atomicReferenceFieldUpdater.getClass();
                            Unsafe unsafe = AbstractC9322.f23936;
                            long j = f13003;
                            C5022 c50227 = this;
                            C5022 c50228 = c50223;
                            if (unsafe.compareAndSwapObject(c5022M10569, j, c50227, c50228)) {
                                return;
                            }
                            if (unsafe.getObjectVolatile(c5022M10569, j) != c50227) {
                                this = c50227;
                                c50223 = c50228;
                                break;
                            } else {
                                this = c50227;
                                c50223 = c50228;
                            }
                        }
                        c50224 = c50222;
                    }
                } else if (c50224 != null) {
                    c5022M10569.m9123();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13006;
                    C5022 c50229 = ((C5021) obj3).f13001;
                    while (true) {
                        atomicReferenceFieldUpdater2.getClass();
                        Unsafe unsafe2 = AbstractC9322.f23936;
                        long j2 = f13003;
                        C5022 c502210 = c5022M10569;
                        c5022 = c50224;
                        boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(c5022, j2, c502210, c50229);
                        c5022M10569 = c502210;
                        if (zCompareAndSwapObject || unsafe2.getObjectVolatile(c5022, j2) != c5022M10569) {
                            break;
                        } else {
                            c50224 = c5022;
                        }
                    }
                    c50224 = null;
                    c5022M10569 = c5022;
                } else {
                    c50222 = c50224;
                    c5022M10569 = AbstractC5894.m10569(c5022M10569._prev);
                    c50224 = c50222;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5022 m9123() {
        C5022 c5022M10569;
        C5022 c5022;
        while (true) {
            Object obj = this._prev;
            if (obj instanceof C5021) {
                return ((C5021) obj).f13001;
            }
            if (obj == this) {
                c5022M10569 = this;
                while (!(c5022M10569 instanceof C5023)) {
                    c5022M10569 = AbstractC5894.m10569(c5022M10569._next);
                    if (c5022M10569 == this) {
                        C6755.m11870("Cannot loop to this while looking for list head");
                        return null;
                    }
                }
            } else {
                obj.getClass();
                c5022M10569 = (C5022) obj;
            }
            C5021 c5021 = (C5021) c5022M10569._removedRef;
            if (c5021 == null) {
                c5021 = new C5021(c5022M10569);
                f13005.lazySet(c5022M10569, c5021);
            }
            C5021 c50212 = c5021;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13004;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC9322.f23936;
                long j = f13002;
                c5022 = this;
                if (unsafe.compareAndSwapObject(c5022, j, obj, c50212)) {
                    return (C5022) obj;
                }
                if (unsafe.getObjectVolatile(c5022, j) != obj) {
                    break;
                }
                this = c5022;
            }
            this = c5022;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m9124() {
        C5022 c5022;
        while (true) {
            Object obj = this._next;
            if ((obj instanceof C5021) || obj == this) {
                return false;
            }
            obj.getClass();
            C5022 c50222 = (C5022) obj;
            C5021 c5021 = (C5021) c50222._removedRef;
            if (c5021 == null) {
                c5021 = new C5021(c50222);
                f13005.lazySet(c50222, c5021);
            }
            C5021 c50212 = c5021;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13006;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC9322.f23936;
                long j = f13003;
                c5022 = this;
                if (unsafe.compareAndSwapObject(c5022, j, obj, c50212)) {
                    c5022.m9122();
                    c50222.m9119(AbstractC5894.m10569(c5022._prev));
                    return true;
                }
                if (unsafe.getObjectVolatile(c5022, j) != obj) {
                    break;
                }
                this = c5022;
            }
            this = c5022;
        }
    }
}
