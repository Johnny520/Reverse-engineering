package androidx.lifecycle;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5398;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", l = {94}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;"}, k = 3, mv = {2, 0, 0})
final class LiveDataScopeImpl$emitSource$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC2375 $source;
    int label;
    final /* synthetic */ AbstractC2377 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emitSource$2(AbstractC2377 abstractC2377, AbstractC2375 abstractC2375, InterfaceC4357<? super LiveDataScopeImpl$emitSource$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = abstractC2377;
        this.$source = abstractC2375;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new LiveDataScopeImpl$emitSource$2(this.this$0, this.$source, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super InterfaceC5398> interfaceC4357) {
        return ((LiveDataScopeImpl$emitSource$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            this.this$0.getClass();
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            AbstractC5185.m10210(obj);
            return obj;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
