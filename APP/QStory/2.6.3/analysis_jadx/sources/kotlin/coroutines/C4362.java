package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p063.InterfaceC6863;
import p291.AbstractC8493;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.coroutines.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4362 implements InterfaceC4357, InterfaceC6863 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f12937 = AtomicReferenceFieldUpdater.newUpdater(C4362.class, Object.class, "result");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f12938 = AbstractC8493.f23591.objectFieldOffset(C4362.class.getDeclaredField("result"));
    private volatile Object result;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4357 f12939;

    public C4362(InterfaceC4357 interfaceC4357, CoroutineSingletons coroutineSingletons) {
        this.f12939 = interfaceC4357;
        this.result = coroutineSingletons;
    }

    @Override // p063.InterfaceC6863
    public final InterfaceC6863 getCallerFrame() {
        InterfaceC4357 interfaceC4357 = this.f12939;
        if (interfaceC4357 instanceof InterfaceC6863) {
            return (InterfaceC6863) interfaceC4357;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final InterfaceC4360 getContext() {
        return this.f12939.getContext();
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final void resumeWith(Object obj) {
        C4362 c4362;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj3 == coroutineSingletons) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12937;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = AbstractC8493.f23591;
                    long j2 = f12938;
                    c4362 = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(c4362, j2, coroutineSingletons, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(c4362, j2) != coroutineSingletons) {
                        break;
                    }
                    this = c4362;
                    obj = obj2;
                }
            } else {
                c4362 = this;
                obj2 = obj;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj3 != coroutineSingletons2) {
                    C5925.m11311("Already resumed");
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12937;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.RESUMED;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = AbstractC8493.f23591;
                    j = f12938;
                    if (unsafe.compareAndSwapObject(c4362, j, coroutineSingletons2, coroutineSingletons3)) {
                        c4362.f12939.resumeWith(obj2);
                        return;
                    }
                } while (unsafe.getObjectVolatile(c4362, j) == coroutineSingletons2);
            }
            this = c4362;
            obj = obj2;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f12939;
    }
}
