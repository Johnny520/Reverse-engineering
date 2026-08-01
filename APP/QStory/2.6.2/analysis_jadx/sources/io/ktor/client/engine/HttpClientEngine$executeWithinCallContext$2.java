package io.ktor.client.engine;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p241.C8136;
import p241.C8138;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", l = {99}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;"}, k = 3, mv = {2, 0, 0})
final class HttpClientEngine$executeWithinCallContext$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C8138 $requestData;
    int label;
    final /* synthetic */ InterfaceC3880 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientEngine$executeWithinCallContext$2(InterfaceC3880 interfaceC3880, C8138 c8138, InterfaceC4356<? super HttpClientEngine$executeWithinCallContext$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$requestData = c8138;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new HttpClientEngine$executeWithinCallContext$2(null, this.$requestData, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C8136> interfaceC4356) {
        return ((HttpClientEngine$executeWithinCallContext$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC5184.m10206(obj);
            return obj;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
