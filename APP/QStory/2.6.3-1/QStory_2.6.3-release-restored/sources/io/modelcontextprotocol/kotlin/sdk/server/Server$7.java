package io.modelcontextprotocol.kotlin.sdk.server;

import com.alibaba.fastjson2.C3775;
import io.modelcontextprotocol.kotlin.sdk.shared.C5144;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p072.C7539;
import p072.InterfaceC7625;
import p079.InterfaceC7691;
import p160.C8376;
import p265.InterfaceC8989;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.server.Server$7", m556f = "Server.kt", m557l = {87}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子苏世哲楪兰;", "request", "Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;", "<unused var>", "L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子苏世哲楪兰;Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;)L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;"}, m152k = 3, m153mv = {2, 1, 0})
final class Server$7 extends SuspendLambda implements InterfaceC7380 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5128 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Server$7(C5128 c5128, InterfaceC5189<? super Server$7> interfaceC5189) {
        super(3, interfaceC5189);
        this.this$0 = c5128;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C7539 c7539, C5144 c5144, InterfaceC5189<? super InterfaceC7625> interfaceC5189) {
        Server$7 server$7 = new Server$7(this.this$0, interfaceC5189);
        server$7.L$0 = c7539;
        return server$7.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        final C7539 c7539 = (C7539) this.L$0;
        C5128 c5128 = this.this$0;
        this.label = 1;
        c5128.getClass();
        InterfaceC8989 interfaceC8989 = AbstractC5127.f13198;
        final int i3 = 0;
        interfaceC8989.mo9607(new InterfaceC7372() { // from class: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世兰苏哲
            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i4 = i3;
                C7539 c75392 = c7539;
                switch (i4) {
                    case 0:
                        return "Handling get prompt request for: " + c75392.f18479;
                    default:
                        return "Prompt not found: " + c75392.f18479;
                }
            }
        });
        if (c5128.f13200.get(c7539.f18479) != null) {
            C3775.m6954();
            return null;
        }
        interfaceC8989.mo9617(new InterfaceC7372() { // from class: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世兰苏哲
            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i4 = i2;
                C7539 c75392 = c7539;
                switch (i4) {
                    case 0:
                        return "Handling get prompt request for: " + c75392.f18479;
                    default:
                        return "Prompt not found: " + c75392.f18479;
                }
            }
        });
        C8376.m13323(c7539.f18479, "Prompt not found: ");
        return null;
    }
}
