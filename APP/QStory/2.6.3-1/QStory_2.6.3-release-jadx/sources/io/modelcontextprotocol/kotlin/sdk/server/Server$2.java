package io.modelcontextprotocol.kotlin.sdk.server;

import androidx.compose.foundation.C1868;
import io.modelcontextprotocol.kotlin.sdk.shared.C5144;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5179;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p072.AbstractC7433;
import p072.C7543;
import p072.C7544;
import p072.InterfaceC7625;
import p079.InterfaceC7691;
import p265.InterfaceC8989;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.server.Server$2", m556f = "Server.kt", m557l = {64}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;", "request", "Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;", "<unused var>", "L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;)L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;"}, m152k = 3, m153mv = {2, 1, 0})
final class Server$2 extends SuspendLambda implements InterfaceC7380 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5128 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Server$2(C5128 c5128, InterfaceC5189<? super Server$2> interfaceC5189) {
        super(3, interfaceC5189);
        this.this$0 = c5128;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C7543 c7543, C5144 c5144, InterfaceC5189<? super InterfaceC7625> interfaceC5189) {
        Server$2 server$2 = new Server$2(this.this$0, interfaceC5189);
        server$2.L$0 = c7543;
        return server$2.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C7543 c7543 = (C7543) this.L$0;
        C5128 c5128 = this.this$0;
        this.label = 1;
        c5128.getClass();
        InterfaceC8989 interfaceC8989 = AbstractC5127.f13198;
        interfaceC8989.mo9605(new C1868(c7543, 17));
        c5128.f13206 = c7543.f18485;
        String str = c7543.f18486;
        if (!AbstractC5179.m9396(str, AbstractC7433.f18324)) {
            interfaceC8989.mo9604(new C5125(str, 2));
            str = "2024-11-05";
        }
        C7544 c7544 = new C7544(str, c5128.f13203, c5128.f13202);
        return c7544 == coroutineSingletons ? coroutineSingletons : c7544;
    }
}
