package io.ktor.client.plugins.api;

import io.ktor.client.AbstractC4781;
import io.ktor.client.call.C4700;
import io.ktor.client.plugins.InterfaceC4746;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p257.C8969;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.api.Send$install$1", m556f = "CommonHooks.kt", m557l = {46}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/client/plugins/飘花落叶言子世楪哲兰苏;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/飘花落叶言子世楪哲兰苏;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, m152k = 3, m153mv = {2, 0, 0})
final class Send$install$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ AbstractC4781 $client;
    final /* synthetic */ InterfaceC7380 $handler;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Send$install$1(InterfaceC7380 interfaceC7380, AbstractC4781 abstractC4781, InterfaceC5189<? super Send$install$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$handler = interfaceC7380;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(InterfaceC4746 interfaceC4746, C8969 c8969, InterfaceC5189<? super C4700> interfaceC5189) {
        Send$install$1 send$install$1 = new Send$install$1(this.$handler, null, interfaceC5189);
        send$install$1.L$0 = interfaceC4746;
        send$install$1.L$1 = c8969;
        return send$install$1.invokeSuspend(C6008.f15084);
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
