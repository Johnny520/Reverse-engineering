package io.modelcontextprotocol.kotlin.sdk.server;

import io.modelcontextprotocol.kotlin.sdk.shared.C5144;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p072.C7479;
import p072.C7480;
import p072.InterfaceC7625;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.server.Server$10", m556f = "Server.kt", m557l = {100}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子兰楪苏世哲;", "<unused var>", "Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;", "L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子兰楪苏世哲;Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;)L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;"}, m152k = 3, m153mv = {2, 1, 0})
final class Server$10 extends SuspendLambda implements InterfaceC7380 {
    int label;
    final /* synthetic */ C5128 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Server$10(C5128 c5128, InterfaceC5189<? super Server$10> interfaceC5189) {
        super(3, interfaceC5189);
        this.this$0 = c5128;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C7480 c7480, C5144 c5144, InterfaceC5189<? super InterfaceC7625> interfaceC5189) {
        return new Server$10(this.this$0, interfaceC5189).invokeSuspend(C6008.f15084);
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
        C5128 c5128 = this.this$0;
        this.label = 1;
        c5128.getClass();
        C7479 c7479 = new C7479(EmptyList.INSTANCE);
        return c7479 == coroutineSingletons ? coroutineSingletons : c7479;
    }
}
