package io.modelcontextprotocol.kotlin.sdk.server;

import com.alibaba.fastjson2.C2942;
import io.modelcontextprotocol.kotlin.sdk.shared.C4312;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p056.C6710;
import p056.InterfaceC6796;
import p063.InterfaceC6862;
import p144.C7547;
import p249.InterfaceC8160;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.server.Server$7", f = "Server.kt", l = {87}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子苏世哲楪兰;", "request", "Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;", "<unused var>", "L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子苏世哲楪兰;Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;)L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;"}, k = 3, mv = {2, 1, 0})
final class Server$7 extends SuspendLambda implements InterfaceC6551 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C4296 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Server$7(C4296 c4296, InterfaceC4357<? super Server$7> interfaceC4357) {
        super(3, interfaceC4357);
        this.this$0 = c4296;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C6710 c6710, C4312 c4312, InterfaceC4357<? super InterfaceC6796> interfaceC4357) {
        Server$7 server$7 = new Server$7(this.this$0, interfaceC4357);
        server$7.L$0 = c6710;
        return server$7.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return obj;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        final C6710 c6710 = (C6710) this.L$0;
        C4296 c4296 = this.this$0;
        this.label = 1;
        c4296.getClass();
        InterfaceC8160 interfaceC8160 = AbstractC4295.f12853;
        final int i3 = 0;
        interfaceC8160.mo9048(new InterfaceC6543() { // from class: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世兰苏哲
            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i4 = i3;
                C6710 c67102 = c6710;
                switch (i4) {
                    case 0:
                        return "Handling get prompt request for: " + c67102.f18134;
                    default:
                        return "Prompt not found: " + c67102.f18134;
                }
            }
        });
        if (c4296.f12855.get(c6710.f18134) != null) {
            C2942.m6394();
            return null;
        }
        interfaceC8160.mo9058(new InterfaceC6543() { // from class: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世兰苏哲
            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i4 = i2;
                C6710 c67102 = c6710;
                switch (i4) {
                    case 0:
                        return "Handling get prompt request for: " + c67102.f18134;
                    default:
                        return "Prompt not found: " + c67102.f18134;
                }
            }
        });
        C7547.m12764(c6710.f18134, "Prompt not found: ");
        return null;
    }
}
