package io.modelcontextprotocol.kotlin.sdk.server;

import com.alibaba.fastjson2.C2941;
import io.modelcontextprotocol.kotlin.sdk.shared.C4311;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p056.C6831;
import p056.InterfaceC6795;
import p063.InterfaceC6861;
import p144.C7546;
import p249.InterfaceC8159;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.server.Server$9", f = "Server.kt", l = {97}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏世子哲兰;", "request", "Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;", "<unused var>", "L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏世子哲兰;Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;)L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;"}, k = 3, mv = {2, 1, 0})
final class Server$9 extends SuspendLambda implements InterfaceC6550 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C4295 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Server$9(C4295 c4295, InterfaceC4356<? super Server$9> interfaceC4356) {
        super(3, interfaceC4356);
        this.this$0 = c4295;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C6831 c6831, C4311 c4311, InterfaceC4356<? super InterfaceC6795> interfaceC4356) {
        Server$9 server$9 = new Server$9(this.this$0, interfaceC4356);
        server$9.L$0 = c6831;
        return server$9.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return obj;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        final C6831 c6831 = (C6831) this.L$0;
        C4295 c4295 = this.this$0;
        this.label = 1;
        c4295.getClass();
        InterfaceC8159 interfaceC8159 = AbstractC4294.f12849;
        final int i3 = 0;
        interfaceC8159.mo9058(new InterfaceC6542() { // from class: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世兰哲苏
            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i4 = i3;
                C6831 c68312 = c6831;
                switch (i4) {
                    case 0:
                        return "Handling read resource request for: " + c68312.f18279;
                    default:
                        return "Resource not found: " + c68312.f18279;
                }
            }
        });
        if (c4295.f12850.get(c6831.f18279) != null) {
            C2941.m6336();
            return null;
        }
        interfaceC8159.mo9068(new InterfaceC6542() { // from class: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世兰哲苏
            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i4 = i2;
                C6831 c68312 = c6831;
                switch (i4) {
                    case 0:
                        return "Handling read resource request for: " + c68312.f18279;
                    default:
                        return "Resource not found: " + c68312.f18279;
                }
            }
        });
        C7546.m12735(c6831.f18279, "Resource not found: ");
        return null;
    }
}
