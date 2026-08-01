package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p063.InterfaceC6862;
import p291.AbstractC8501;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.coroutines.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4361 implements InterfaceC4356, InterfaceC6862 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f12933 = AtomicReferenceFieldUpdater.newUpdater(C4361.class, Object.class, "result");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f12934 = AbstractC8501.f23600.objectFieldOffset(C4361.class.getDeclaredField("result"));
    private volatile Object result;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4356 f12935;

    public C4361(InterfaceC4356 interfaceC4356, CoroutineSingletons coroutineSingletons) {
        this.f12935 = interfaceC4356;
        this.result = coroutineSingletons;
    }

    @Override // p063.InterfaceC6862
    public final InterfaceC6862 getCallerFrame() {
        InterfaceC4356 interfaceC4356 = this.f12935;
        if (interfaceC4356 instanceof InterfaceC6862) {
            return (InterfaceC6862) interfaceC4356;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final InterfaceC4359 getContext() {
        return this.f12935.getContext();
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final void resumeWith(Object obj) {
        C4361 c4361;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj3 == coroutineSingletons) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12933;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = AbstractC8501.f23600;
                    long j2 = f12934;
                    c4361 = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(c4361, j2, coroutineSingletons, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(c4361, j2) != coroutineSingletons) {
                        break;
                    }
                    this = c4361;
                    obj = obj2;
                }
            } else {
                c4361 = this;
                obj2 = obj;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj3 != coroutineSingletons2) {
                    C5919.m11250("Already resumed");
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12933;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.RESUMED;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = AbstractC8501.f23600;
                    j = f12934;
                    if (unsafe.compareAndSwapObject(c4361, j, coroutineSingletons2, coroutineSingletons3)) {
                        c4361.f12935.resumeWith(obj2);
                        return;
                    }
                } while (unsafe.getObjectVolatile(c4361, j) == coroutineSingletons2);
            }
            this = c4361;
            obj = obj2;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f12935;
    }
}
