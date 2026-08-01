package io.modelcontextprotocol.kotlin.sdk.server;

import androidx.compose.foundation.C1030;
import io.modelcontextprotocol.kotlin.sdk.shared.C4311;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.AbstractC4346;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p056.AbstractC6603;
import p056.C6713;
import p056.C6714;
import p056.InterfaceC6795;
import p063.InterfaceC6861;
import p249.InterfaceC8159;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.server.Server$2", f = "Server.kt", l = {64}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;", "request", "Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;", "<unused var>", "L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;)L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;"}, k = 3, mv = {2, 1, 0})
final class Server$2 extends SuspendLambda implements InterfaceC6550 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C4295 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Server$2(C4295 c4295, InterfaceC4356<? super Server$2> interfaceC4356) {
        super(3, interfaceC4356);
        this.this$0 = c4295;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C6713 c6713, C4311 c4311, InterfaceC4356<? super InterfaceC6795> interfaceC4356) {
        Server$2 server$2 = new Server$2(this.this$0, interfaceC4356);
        server$2.L$0 = c6713;
        return server$2.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return obj;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C6713 c6713 = (C6713) this.L$0;
        C4295 c4295 = this.this$0;
        this.label = 1;
        c4295.getClass();
        InterfaceC8159 interfaceC8159 = AbstractC4294.f12849;
        interfaceC8159.mo9056(new C1030(c6713, 17));
        c4295.f12857 = c6713.f18145;
        String str = c6713.f18146;
        if (!AbstractC4346.m8843(str, AbstractC6603.f17984)) {
            interfaceC8159.mo9055(new C4292(str, 2));
            str = "2024-11-05";
        }
        C6714 c6714 = new C6714(str, c4295.f12854, c4295.f12853);
        return c6714 == coroutineSingletons ? coroutineSingletons : c6714;
    }
}
