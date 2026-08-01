package io.ktor.client.plugins.api;

import io.ktor.client.AbstractC3948;
import io.ktor.client.call.C3867;
import io.ktor.client.plugins.InterfaceC3913;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p241.C8139;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.api.Send$install$1", f = "CommonHooks.kt", l = {46}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/飘花落叶言子世楪哲兰苏;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/飘花落叶言子世楪哲兰苏;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, k = 3, mv = {2, 0, 0})
final class Send$install$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ AbstractC3948 $client;
    final /* synthetic */ InterfaceC6550 $handler;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Send$install$1(InterfaceC6550 interfaceC6550, AbstractC3948 abstractC3948, InterfaceC4356<? super Send$install$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$handler = interfaceC6550;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(InterfaceC3913 interfaceC3913, C8139 c8139, InterfaceC4356<? super C3867> interfaceC4356) {
        Send$install$1 send$install$1 = new Send$install$1(this.$handler, null, interfaceC4356);
        send$install$1.L$0 = interfaceC3913;
        send$install$1.L$1 = c8139;
        return send$install$1.invokeSuspend(C5175.f14739);
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
