package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.sync.C5380;
import kotlinx.coroutines.sync.InterfaceC5383;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {178, 126}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class MutatorMutex$mutate$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6558 $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C0304 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, C0304 c0304, InterfaceC6558 interfaceC6558, InterfaceC4357<? super MutatorMutex$mutate$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$priority = mutatePriority;
        this.this$0 = c0304;
        this.$block = interfaceC6558;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, interfaceC4357);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<Object> interfaceC4357) {
        return ((MutatorMutex$mutate$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C0305 c0305;
        C0304 c0304;
        InterfaceC6558 interfaceC6558;
        InterfaceC5383 interfaceC5383;
        C0304 c03042;
        Throwable th;
        C0305 c03052;
        InterfaceC5383 interfaceC53832;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    AbstractC5185.m10210(obj);
                    InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    InterfaceC4354 interfaceC4354 = interfaceC5401.mo2430().get(C5453.f15105);
                    interfaceC4354.getClass();
                    c0305 = new C0305(mutatePriority, (InterfaceC5452) interfaceC4354);
                    C0304.m933(this.this$0, c0305);
                    c0304 = this.this$0;
                    C5380 c5380 = c0304.f1036;
                    InterfaceC6558 interfaceC65582 = this.$block;
                    this.L$0 = c0305;
                    this.L$1 = c5380;
                    this.L$2 = interfaceC65582;
                    this.L$3 = c0304;
                    this.label = 1;
                    if (c5380.m10427(this) != coroutineSingletons) {
                        interfaceC6558 = interfaceC65582;
                        interfaceC5383 = c5380;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c03042 = (C0304) this.L$2;
                    InterfaceC5383 interfaceC53833 = (InterfaceC5383) this.L$1;
                    c03052 = (C0305) this.L$0;
                    try {
                        AbstractC5185.m10210(obj);
                        interfaceC53832 = interfaceC53833;
                        atomicReference2 = c03042.f1037;
                        while (!atomicReference2.compareAndSet(c03052, null) && atomicReference2.get() == c03052) {
                        }
                        ((C5380) interfaceC53832).m10432(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = c03042.f1037;
                        while (!atomicReference.compareAndSet(c03052, null)) {
                        }
                        throw th;
                    }
                }
                C0304 c03043 = (C0304) this.L$3;
                interfaceC6558 = (InterfaceC6558) this.L$2;
                InterfaceC5383 interfaceC53834 = (InterfaceC5383) this.L$1;
                C0305 c03053 = (C0305) this.L$0;
                AbstractC5185.m10210(obj);
                c0304 = c03043;
                c0305 = c03053;
                interfaceC5383 = interfaceC53834;
                this.L$0 = c0305;
                this.L$1 = interfaceC5383;
                this.L$2 = c0304;
                this.L$3 = null;
                this.label = 2;
                Object objInvoke = interfaceC6558.invoke(this);
                if (objInvoke != coroutineSingletons) {
                    c03042 = c0304;
                    obj = objInvoke;
                    c03052 = c0305;
                    interfaceC53832 = interfaceC5383;
                    atomicReference2 = c03042.f1037;
                    while (!atomicReference2.compareAndSet(c03052, null)) {
                    }
                    ((C5380) interfaceC53832).m10432(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                c03042 = c0304;
                th = th3;
                c03052 = c0305;
                atomicReference = c03042.f1037;
                while (!atomicReference.compareAndSet(c03052, null) && atomicReference.get() == c03052) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((C5380) r1).m10432(null);
            throw th4;
        }
    }
}
