package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p079.InterfaceC7692;
import p307.AbstractC9322;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.coroutines.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5194 implements InterfaceC5189, InterfaceC7692 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f13282 = AtomicReferenceFieldUpdater.newUpdater(C5194.class, Object.class, "result");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f13283 = AbstractC9322.f23936.objectFieldOffset(C5194.class.getDeclaredField("result"));
    private volatile Object result;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5189 f13284;

    public C5194(InterfaceC5189 interfaceC5189, CoroutineSingletons coroutineSingletons) {
        this.f13284 = interfaceC5189;
        this.result = coroutineSingletons;
    }

    @Override // p079.InterfaceC7692
    public final InterfaceC7692 getCallerFrame() {
        InterfaceC5189 interfaceC5189 = this.f13284;
        if (interfaceC5189 instanceof InterfaceC7692) {
            return (InterfaceC7692) interfaceC5189;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final InterfaceC5192 getContext() {
        return this.f13284.getContext();
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final void resumeWith(Object obj) {
        C5194 c5194;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj3 == coroutineSingletons) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13282;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = AbstractC9322.f23936;
                    long j2 = f13283;
                    c5194 = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(c5194, j2, coroutineSingletons, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(c5194, j2) != coroutineSingletons) {
                        break;
                    }
                    this = c5194;
                    obj = obj2;
                }
            } else {
                c5194 = this;
                obj2 = obj;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj3 != coroutineSingletons2) {
                    C6755.m11870("Already resumed");
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13282;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.RESUMED;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = AbstractC9322.f23936;
                    j = f13283;
                    if (unsafe.compareAndSwapObject(c5194, j, coroutineSingletons2, coroutineSingletons3)) {
                        c5194.f13284.resumeWith(obj2);
                        return;
                    }
                } while (unsafe.getObjectVolatile(c5194, j) == coroutineSingletons2);
            }
            this = c5194;
            obj = obj2;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f13284;
    }
}
