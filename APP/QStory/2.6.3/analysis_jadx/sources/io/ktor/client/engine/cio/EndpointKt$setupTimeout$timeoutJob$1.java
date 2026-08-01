package io.ktor.client.engine.cio;

import io.ktor.client.plugins.HttpRequestTimeoutException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p241.C8139;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.cio.EndpointKt$setupTimeout$timeoutJob$1", f = "Endpoint.kt", l = {308}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class EndpointKt$setupTimeout$timeoutJob$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC4360 $callContext;
    final /* synthetic */ C8139 $request;
    final /* synthetic */ long $timeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndpointKt$setupTimeout$timeoutJob$1(long j, InterfaceC4360 interfaceC4360, C8139 c8139, InterfaceC4357<? super EndpointKt$setupTimeout$timeoutJob$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$timeout = j;
        this.$callContext = interfaceC4360;
        this.$request = c8139;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new EndpointKt$setupTimeout$timeoutJob$1(this.$timeout, this.$callContext, this.$request, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((EndpointKt$setupTimeout$timeoutJob$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            long j = this.$timeout;
            this.label = 1;
            if (AbstractC5399.m10499(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        AbstractC5399.m10508("Request is timed out", new HttpRequestTimeoutException(this.$request), AbstractC5399.m10493(this.$callContext));
        return C5176.f14739;
    }
}
