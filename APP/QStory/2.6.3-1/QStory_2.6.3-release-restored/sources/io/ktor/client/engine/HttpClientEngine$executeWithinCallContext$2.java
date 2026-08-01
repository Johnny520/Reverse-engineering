package io.ktor.client.engine;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p257.C8966;
import p257.C8968;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", m556f = "HttpClientEngine.kt", m557l = {99}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpClientEngine$executeWithinCallContext$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C8968 $requestData;
    int label;
    final /* synthetic */ InterfaceC4713 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientEngine$executeWithinCallContext$2(InterfaceC4713 interfaceC4713, C8968 c8968, InterfaceC5189<? super HttpClientEngine$executeWithinCallContext$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$requestData = c8968;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new HttpClientEngine$executeWithinCallContext$2(null, this.$requestData, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C8966> interfaceC5189) {
        return ((HttpClientEngine$executeWithinCallContext$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return obj;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
