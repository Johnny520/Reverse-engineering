package io.modelcontextprotocol.kotlin.sdk.server;

import io.modelcontextprotocol.kotlin.sdk.shared.C4312;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p056.C6650;
import p056.C6651;
import p056.InterfaceC6796;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.server.Server$10", f = "Server.kt", l = {100}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子兰楪苏世哲;", "<unused var>", "Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;", "L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子兰楪苏世哲;Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;)L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;"}, k = 3, mv = {2, 1, 0})
final class Server$10 extends SuspendLambda implements InterfaceC6551 {
    int label;
    final /* synthetic */ C4296 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Server$10(C4296 c4296, InterfaceC4357<? super Server$10> interfaceC4357) {
        super(3, interfaceC4357);
        this.this$0 = c4296;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C6651 c6651, C4312 c4312, InterfaceC4357<? super InterfaceC6796> interfaceC4357) {
        return new Server$10(this.this$0, interfaceC4357).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return obj;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C4296 c4296 = this.this$0;
        this.label = 1;
        c4296.getClass();
        C6650 c6650 = new C6650(EmptyList.INSTANCE);
        return c6650 == coroutineSingletons ? coroutineSingletons : c6650;
    }
}
