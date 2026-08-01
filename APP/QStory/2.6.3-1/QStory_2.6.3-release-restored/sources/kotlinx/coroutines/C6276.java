package kotlinx.coroutines;

import io.ktor.util.C5043;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6008;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.internal.AbstractC6185;
import kotlinx.coroutines.internal.AbstractC6193;
import kotlinx.coroutines.internal.C6181;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p079.InterfaceC7692;
import p307.AbstractC9322;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6276 extends AbstractC6228 implements InterfaceC6279, InterfaceC7692, InterfaceC6244 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f15435;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15436;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f15437;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15438 = AtomicIntegerFieldUpdater.newUpdater(C6276.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15439 = AtomicReferenceFieldUpdater.newUpdater(C6276.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5192 f15440;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC5189 f15441;

    static {
        Unsafe unsafe = AbstractC9322.f23936;
        f15435 = unsafe.objectFieldOffset(C6276.class.getDeclaredField("_state$volatile"));
        f15436 = AtomicReferenceFieldUpdater.newUpdater(C6276.class, Object.class, "_parentHandle$volatile");
        f15437 = unsafe.objectFieldOffset(C6276.class.getDeclaredField("_parentHandle$volatile"));
    }

    public C6276(int i, InterfaceC5189 interfaceC5189) {
        super(i);
        this.f15441 = interfaceC5189;
        this.f15440 = interfaceC5189.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C6260.f15417;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m11089(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static Object m11090(InterfaceC6286 interfaceC6286, Object obj, int i, InterfaceC7380 interfaceC7380) {
        if (obj instanceof C6262) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC7380 != null || (interfaceC6286 instanceof InterfaceC6278)) {
            return new C6263(obj, interfaceC6286 instanceof InterfaceC6278 ? (InterfaceC6278) interfaceC6286 : null, interfaceC7380, (Throwable) null, 16);
        }
        return obj;
    }

    @Override // p079.InterfaceC7692
    public final InterfaceC7692 getCallerFrame() {
        InterfaceC5189 interfaceC5189 = this.f15441;
        if (interfaceC5189 instanceof InterfaceC7692) {
            return (InterfaceC7692) interfaceC5189;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final InterfaceC5192 getContext() {
        return this.f15440;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final void resumeWith(Object obj) {
        Throwable thM9307exceptionOrNullimpl = Result.m9307exceptionOrNullimpl(obj);
        if (thM9307exceptionOrNullimpl != null) {
            obj = new C6262(thM9307exceptionOrNullimpl, false);
        }
        m11097(obj, this.f15376, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo11093());
        sb.append('(');
        sb.append(AbstractC6231.m11041(this.f15441));
        sb.append("){");
        Object objM11098 = m11098();
        sb.append(objM11098 instanceof InterfaceC6286 ? "Active" : objM11098 instanceof C6277 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC6231.m11060(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean m11091() {
        f15439.getClass();
        Unsafe unsafe = AbstractC9322.f23936;
        long j = f15435;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof C6263) && ((C6263) objectVolatile).f15422 != null) {
            m11105();
            return false;
        }
        f15438.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, C6260.f15417);
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC6279
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo10992(Object obj) throws DispatchException {
        m11107(this.f15376);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m11092() {
        Throwable thM10907;
        InterfaceC5189 interfaceC5189 = this.f15441;
        C6181 c6181 = interfaceC5189 instanceof C6181 ? (C6181) interfaceC5189 : null;
        if (c6181 == null || (thM10907 = c6181.m10907(this)) == null) {
            return;
        }
        m11105();
        mo10994(thM10907);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public String mo11093() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m11094() {
        return this.f15376 == 2 && ((C6181) this.f15441).m10906();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C5317 m11095(Object obj, InterfaceC7380 interfaceC7380) {
        C6276 c6276;
        C5317 c5317 = AbstractC6231.f15383;
        while (true) {
            f15439.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15435;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC6286)) {
                return null;
            }
            Object objM11090 = m11090((InterfaceC6286) objectVolatile, obj, this.f15376, interfaceC7380);
            while (true) {
                Unsafe unsafe2 = AbstractC9322.f23936;
                c6276 = this;
                if (unsafe2.compareAndSwapObject(c6276, f15435, objectVolatile, objM11090)) {
                    c6276.m11104();
                    return c5317;
                }
                if (unsafe2.getObjectVolatile(c6276, j) != objectVolatile) {
                    break;
                }
                this = c6276;
            }
            this = c6276;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m11096(AbstractC6264 abstractC6264) {
        InterfaceC5189 interfaceC5189 = this.f15441;
        C6181 c6181 = interfaceC5189 instanceof C6181 ? (C6181) interfaceC5189 : null;
        m11097(C6008.f15084, (c6181 != null ? c6181.f15262 : null) == abstractC6264 ? 4 : this.f15376, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m11097(Object obj, int i, InterfaceC7380 interfaceC7380) throws DispatchException {
        C6276 c6276;
        while (true) {
            f15439.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15435;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC6286)) {
                C6276 c62762 = this;
                if (objectVolatile instanceof C6277) {
                    C6277 c6277 = (C6277) objectVolatile;
                    if (C6277.f15442.compareAndSet(c6277, 0, 1)) {
                        if (interfaceC7380 != null) {
                            c62762.m11109(interfaceC7380, c6277.f15420, obj);
                            return;
                        }
                        return;
                    }
                }
                C5043.m9151(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objM11090 = m11090((InterfaceC6286) objectVolatile, obj, i, interfaceC7380);
            while (true) {
                Unsafe unsafe2 = AbstractC9322.f23936;
                c6276 = this;
                if (unsafe2.compareAndSwapObject(c6276, f15435, objectVolatile, objM11090)) {
                    c6276.m11104();
                    c6276.m11107(i);
                    return;
                } else if (unsafe2.getObjectVolatile(c6276, j) != objectVolatile) {
                    break;
                } else {
                    this = c6276;
                }
            }
            this = c6276;
        }
    }

    @Override // kotlinx.coroutines.AbstractC6228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Throwable mo11023(Object obj) {
        Throwable thMo11023 = super.mo11023(obj);
        if (thMo11023 != null) {
            return thMo11023;
        }
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC6279
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo10993(Object obj, InterfaceC7380 interfaceC7380) throws DispatchException {
        m11097(obj, this.f15376, interfaceC7380);
    }

    @Override // kotlinx.coroutines.AbstractC6228
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC5189 mo10904() {
        return this.f15441;
    }

    @Override // kotlinx.coroutines.AbstractC6228
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11024(CancellationException cancellationException) {
        CancellationException cancellationException2;
        C6276 c6276;
        while (true) {
            f15439.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15435;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof InterfaceC6286) {
                C6755.m11870("Not completed");
                return;
            }
            if (objectVolatile instanceof C6262) {
                return;
            }
            if (objectVolatile instanceof C6263) {
                C6263 c6263 = (C6263) objectVolatile;
                if (c6263.f15421 != null) {
                    C6755.m11870("Must be called at most once");
                    return;
                }
                C6263 c6263M11085 = C6263.m11085(c6263, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = AbstractC9322.f23936;
                    C6276 c62762 = this;
                    if (unsafe2.compareAndSwapObject(c62762, f15435, objectVolatile, c6263M11085)) {
                        InterfaceC6278 interfaceC6278 = c6263.f15424;
                        if (interfaceC6278 != null) {
                            c62762.m11111(interfaceC6278, cancellationException);
                        }
                        InterfaceC7380 interfaceC7380 = c6263.f15423;
                        if (interfaceC7380 != null) {
                            c62762.m11109(interfaceC7380, cancellationException, c6263.f15425);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(c62762, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        c6276 = c62762;
                        break;
                    }
                    this = c62762;
                }
            } else {
                C6276 c62763 = this;
                CancellationException cancellationException3 = cancellationException;
                C6263 c62632 = new C6263(objectVolatile, (InterfaceC6278) null, (InterfaceC7380) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    C6263 c62633 = c62632;
                    Unsafe unsafe3 = AbstractC9322.f23936;
                    c6276 = c62763;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(c6276, f15435, objectVolatile, c62633);
                    c62632 = c62633;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(c6276, j) != objectVolatile) {
                        break;
                    } else {
                        c62763 = c6276;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = c6276;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC6244
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10822(AbstractC6193 abstractC6193, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f15438;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                C6755.m11870("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m11101(abstractC6193);
    }

    @Override // kotlinx.coroutines.InterfaceC6279
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo10994(Throwable th) throws DispatchException {
        Throwable cancellationException;
        C6276 c6276;
        while (true) {
            f15439.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15435;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC6286)) {
                return false;
            }
            boolean z = (objectVolatile instanceof InterfaceC6278) || (objectVolatile instanceof AbstractC6193);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C6277 c6277 = new C6277(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = AbstractC9322.f23936;
                c6276 = this;
                if (unsafe2.compareAndSwapObject(c6276, f15435, objectVolatile, c6277)) {
                    InterfaceC6286 interfaceC6286 = (InterfaceC6286) objectVolatile;
                    if (interfaceC6286 instanceof InterfaceC6278) {
                        c6276.m11111((InterfaceC6278) objectVolatile, th);
                    } else if (interfaceC6286 instanceof AbstractC6193) {
                        c6276.m11110((AbstractC6193) objectVolatile, th);
                    }
                    c6276.m11104();
                    c6276.m11107(c6276.f15376);
                    return true;
                }
                if (unsafe2.getObjectVolatile(c6276, j) != objectVolatile) {
                    break;
                }
                this = c6276;
            }
            this = c6276;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object m11098() {
        f15439.getClass();
        return AbstractC9322.f23936.getObjectVolatile(this, f15435);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object m11099() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        InterfaceC6284 interfaceC6284;
        boolean zM11094 = m11094();
        do {
            atomicIntegerFieldUpdater = f15438;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    C6755.m11870("Already suspended");
                    return null;
                }
                if (zM11094) {
                    m11092();
                }
                Object objM11098 = m11098();
                if (objM11098 instanceof C6262) {
                    throw ((C6262) objM11098).f15420;
                }
                int i3 = this.f15376;
                if ((i3 != 1 && i3 != 2) || (interfaceC6284 = (InterfaceC6284) this.f15440.get(C6285.f15450)) == null || interfaceC6284.mo11121()) {
                    return mo11026(objM11098);
                }
                CancellationException cancellationExceptionMo11122 = interfaceC6284.mo11122();
                mo11024(cancellationExceptionMo11122);
                throw cancellationExceptionMo11122;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (m11106() == null) {
            m11103();
        }
        if (zM11094) {
            m11092();
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m11100(InterfaceC7387 interfaceC7387) {
        m11101(new C6274(interfaceC7387, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
    
        m11089(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11101(InterfaceC6286 interfaceC6286) {
        C6276 c6276;
        Unsafe unsafe;
        C6276 c62762;
        while (true) {
            f15439.getClass();
            Unsafe unsafe2 = AbstractC9322.f23936;
            long j = f15435;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof C6260) {
                while (true) {
                    Unsafe unsafe3 = AbstractC9322.f23936;
                    c6276 = this;
                    if (unsafe3.compareAndSwapObject(c6276, f15435, objectVolatile, interfaceC6286)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(c6276, j) != objectVolatile) {
                        break;
                    } else {
                        this = c6276;
                    }
                }
            } else {
                c6276 = this;
                if ((objectVolatile instanceof InterfaceC6278) || (objectVolatile instanceof AbstractC6193)) {
                    break;
                }
                if (objectVolatile instanceof C6262) {
                    C6262 c6262 = (C6262) objectVolatile;
                    if (!C6262.f15419.compareAndSet(c6262, 0, 1)) {
                        m11089(interfaceC6286, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof C6277) {
                        Throwable th = c6262.f15420;
                        if (interfaceC6286 instanceof InterfaceC6278) {
                            c6276.m11111((InterfaceC6278) interfaceC6286, th);
                            return;
                        } else {
                            interfaceC6286.getClass();
                            c6276.m11110((AbstractC6193) interfaceC6286, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof C6263) {
                    C6263 c6263 = (C6263) objectVolatile;
                    if (c6263.f15424 != null) {
                        m11089(interfaceC6286, objectVolatile);
                        throw null;
                    }
                    if (interfaceC6286 instanceof AbstractC6193) {
                        return;
                    }
                    interfaceC6286.getClass();
                    InterfaceC6278 interfaceC6278 = (InterfaceC6278) interfaceC6286;
                    Throwable th2 = c6263.f15421;
                    if (th2 != null) {
                        c6276.m11111(interfaceC6278, th2);
                        return;
                    }
                    C6263 c6263M11085 = C6263.m11085(c6263, interfaceC6278, null, 29);
                    do {
                        unsafe = AbstractC9322.f23936;
                        c62762 = c6276;
                        if (unsafe.compareAndSwapObject(c6276, f15435, objectVolatile, c6263M11085)) {
                            return;
                        } else {
                            c6276 = c62762;
                        }
                    } while (unsafe.getObjectVolatile(c62762, j) == objectVolatile);
                } else {
                    C6276 c62763 = c6276;
                    if (interfaceC6286 instanceof AbstractC6193) {
                        return;
                    }
                    interfaceC6286.getClass();
                    C6263 c62632 = new C6263(objectVolatile, (InterfaceC6278) interfaceC6286, (InterfaceC7380) null, (Throwable) null, 28);
                    while (true) {
                        C6263 c62633 = c62632;
                        Unsafe unsafe4 = AbstractC9322.f23936;
                        c6276 = c62763;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(c6276, f15435, objectVolatile, c62633);
                        c62632 = c62633;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(c6276, j) != objectVolatile) {
                            break;
                        } else {
                            c62763 = c6276;
                        }
                    }
                }
            }
            this = c6276;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m11102() {
        InterfaceC6230 interfaceC6230M11103 = m11103();
        if (interfaceC6230M11103 == null || (m11098() instanceof InterfaceC6286)) {
            return;
        }
        interfaceC6230M11103.dispose();
        f15436.getClass();
        AbstractC9322.f23936.putObjectVolatile(this, f15437, C6287.f15451);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC6230 m11103() {
        InterfaceC6284 interfaceC6284 = (InterfaceC6284) this.f15440.get(C6285.f15450);
        if (interfaceC6284 == null) {
            return null;
        }
        InterfaceC6230 interfaceC6230M11056 = AbstractC6231.m11056(interfaceC6284, new C6269(this));
        while (true) {
            f15436.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15437;
            C6276 c6276 = this;
            if (unsafe.compareAndSwapObject(c6276, j, (Object) null, interfaceC6230M11056) || unsafe.getObjectVolatile(c6276, j) != null) {
                break;
            }
            this = c6276;
        }
        return interfaceC6230M11056;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m11104() {
        if (m11094()) {
            return;
        }
        m11105();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m11105() {
        InterfaceC6230 interfaceC6230M11106 = m11106();
        if (interfaceC6230M11106 == null) {
            return;
        }
        interfaceC6230M11106.dispose();
        f15436.getClass();
        AbstractC9322.f23936.putObjectVolatile(this, f15437, C6287.f15451);
    }

    @Override // kotlinx.coroutines.InterfaceC6279
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C5317 mo10995(Object obj, InterfaceC7380 interfaceC7380) {
        return m11095(obj, interfaceC7380);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6230 m11106() {
        f15436.getClass();
        return (InterfaceC6230) AbstractC9322.f23936.getObjectVolatile(this, f15437);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m11107(int i) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f15438;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    C6755.m11870("Already resumed");
                    return;
                }
                boolean z = i == 4;
                InterfaceC5189 interfaceC5189 = this.f15441;
                if (!z && (interfaceC5189 instanceof C6181)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f15376;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C6181 c6181 = (C6181) interfaceC5189;
                        AbstractC6264 abstractC6264 = c6181.f15262;
                        InterfaceC5192 context = c6181.f15261.getContext();
                        if (AbstractC6185.m10934(abstractC6264, context)) {
                            AbstractC6185.m10933(abstractC6264, context, this);
                            return;
                        }
                        AbstractC6226 abstractC6226M11078 = AbstractC6252.m11078();
                        if (abstractC6226M11078.f15372 >= 4294967296L) {
                            abstractC6226M11078.m11021(this);
                            return;
                        }
                        abstractC6226M11078.m11019(true);
                        try {
                            AbstractC6231.m11033(this, interfaceC5189, true);
                            do {
                            } while (abstractC6226M11078.m11022());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC6231.m11033(this, interfaceC5189, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Throwable mo11108(C6292 c6292) {
        return c6292.mo11122();
    }

    @Override // kotlinx.coroutines.AbstractC6228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo11026(Object obj) {
        return obj instanceof C6263 ? ((C6263) obj).f15425 : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11109(InterfaceC7380 interfaceC7380, Throwable th, Object obj) {
        InterfaceC5192 interfaceC5192 = this.f15440;
        try {
            interfaceC7380.invoke(th, obj, interfaceC5192);
        } catch (Throwable th2) {
            AbstractC6231.m11055(interfaceC5192, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11110(AbstractC6193 abstractC6193, Throwable th) {
        InterfaceC5192 interfaceC5192 = this.f15440;
        int i = f15438.get(this) & 536870911;
        if (i == 536870911) {
            C6755.m11870("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            abstractC6193.mo10826(i, interfaceC5192);
        } catch (Throwable th2) {
            AbstractC6231.m11055(interfaceC5192, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.AbstractC6228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo10910() {
        return m11098();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11111(InterfaceC6278 interfaceC6278, Throwable th) {
        try {
            interfaceC6278.mo10974(th);
        } catch (Throwable th2) {
            AbstractC6231.m11055(this.f15440, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }
}
