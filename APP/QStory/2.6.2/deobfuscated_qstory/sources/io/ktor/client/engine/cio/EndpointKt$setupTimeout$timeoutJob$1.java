package io.ktor.client.engine.cio;

import io.ktor.client.plugins.HttpRequestTimeoutException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p241.C8138;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.cio.EndpointKt$setupTimeout$timeoutJob$1", f = "Endpoint.kt", l = {308}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class EndpointKt$setupTimeout$timeoutJob$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC4359 $callContext;
    final /* synthetic */ C8138 $request;
    final /* synthetic */ long $timeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndpointKt$setupTimeout$timeoutJob$1(long j, InterfaceC4359 interfaceC4359, C8138 c8138, InterfaceC4356<? super EndpointKt$setupTimeout$timeoutJob$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$timeout = j;
        this.$callContext = interfaceC4359;
        this.$request = c8138;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new EndpointKt$setupTimeout$timeoutJob$1(this.$timeout, this.$callContext, this.$request, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((EndpointKt$setupTimeout$timeoutJob$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            long j = this.$timeout;
            this.label = 1;
            if (AbstractC5398.m10495(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        AbstractC5398.m10504("Request is timed out", new HttpRequestTimeoutException(this.$request), AbstractC5398.m10489(this.$callContext));
        return C5175.f14739;
    }
}
