package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.sync.C6212;
import kotlinx.coroutines.sync.InterfaceC6215;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", m556f = "InternalMutatorMutex.kt", m557l = {178, 165}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m151d2 = {"R", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class MutatorMutex$mutateWith$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ Object $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C1150 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, C1150 c1150, InterfaceC7383 interfaceC7383, Object obj, InterfaceC5189<? super MutatorMutex$mutateWith$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$priority = mutatePriority;
        this.this$0 = c1150;
        this.$block = interfaceC7383;
        this.$receiver = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, interfaceC5189);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<Object> interfaceC5189) {
        return ((MutatorMutex$mutateWith$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C1151 c1151;
        C1150 c1150;
        InterfaceC7383 interfaceC7383;
        Object obj2;
        InterfaceC6215 interfaceC6215;
        C1150 c11502;
        Throwable th;
        C1151 c11512;
        InterfaceC6215 interfaceC62152;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    AbstractC6017.m10769(obj);
                    InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    InterfaceC5186 interfaceC5186 = interfaceC6233.mo2990().get(C6285.f15450);
                    interfaceC5186.getClass();
                    c1151 = new C1151(mutatePriority, (InterfaceC6284) interfaceC5186);
                    C1150.m1493(this.this$0, c1151);
                    c1150 = this.this$0;
                    C6212 c6212 = c1150.f1381;
                    interfaceC7383 = this.$block;
                    Object obj3 = this.$receiver;
                    this.L$0 = c1151;
                    this.L$1 = c6212;
                    this.L$2 = interfaceC7383;
                    this.L$3 = obj3;
                    this.L$4 = c1150;
                    this.label = 1;
                    if (c6212.m10986(this) != coroutineSingletons) {
                        obj2 = obj3;
                        interfaceC6215 = c6212;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c11502 = (C1150) this.L$2;
                    InterfaceC6215 interfaceC62153 = (InterfaceC6215) this.L$1;
                    c11512 = (C1151) this.L$0;
                    try {
                        AbstractC6017.m10769(obj);
                        interfaceC62152 = interfaceC62153;
                        atomicReference2 = c11502.f1382;
                        while (!atomicReference2.compareAndSet(c11512, null) && atomicReference2.get() == c11512) {
                        }
                        ((C6212) interfaceC62152).m10991(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = c11502.f1382;
                        while (!atomicReference.compareAndSet(c11512, null)) {
                        }
                        throw th;
                    }
                }
                C1150 c11503 = (C1150) this.L$4;
                obj2 = this.L$3;
                InterfaceC7383 interfaceC73832 = (InterfaceC7383) this.L$2;
                InterfaceC6215 interfaceC62154 = (InterfaceC6215) this.L$1;
                C1151 c11513 = (C1151) this.L$0;
                AbstractC6017.m10769(obj);
                interfaceC7383 = interfaceC73832;
                interfaceC6215 = interfaceC62154;
                c1150 = c11503;
                c1151 = c11513;
                this.L$0 = c1151;
                this.L$1 = interfaceC6215;
                this.L$2 = c1150;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                Object objInvoke = interfaceC7383.invoke(obj2, this);
                if (objInvoke != coroutineSingletons) {
                    c11502 = c1150;
                    obj = objInvoke;
                    c11512 = c1151;
                    interfaceC62152 = interfaceC6215;
                    atomicReference2 = c11502.f1382;
                    while (!atomicReference2.compareAndSet(c11512, null)) {
                    }
                    ((C6212) interfaceC62152).m10991(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                c11502 = c1150;
                th = th3;
                c11512 = c1151;
                atomicReference = c11502.f1382;
                while (!atomicReference.compareAndSet(c11512, null) && atomicReference.get() == c11512) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((C6212) r1).m10991(null);
            throw th4;
        }
    }
}
