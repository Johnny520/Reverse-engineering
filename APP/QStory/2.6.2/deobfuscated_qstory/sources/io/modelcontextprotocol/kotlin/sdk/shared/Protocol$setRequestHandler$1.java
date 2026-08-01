package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p056.C6610;
import p056.C6677;
import p056.InterfaceC6795;
import p056.InterfaceC6839;
import p063.InterfaceC6861;
import p089.InterfaceC7183;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$setRequestHandler$1", f = "Protocol.kt", l = {453}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;", "request", "Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;", "extraHandler", "L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;)L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;"}, k = 3, mv = {2, 1, 0})
final class Protocol$setRequestHandler$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6550 $block;
    final /* synthetic */ InterfaceC7183 $serializer;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$setRequestHandler$1(InterfaceC7183 interfaceC7183, InterfaceC6550 interfaceC6550, InterfaceC4356<? super Protocol$setRequestHandler$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$serializer = interfaceC7183;
        this.$block = interfaceC6550;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C6677 c6677, C4311 c4311, InterfaceC4356<? super InterfaceC6795> interfaceC4356) {
        Protocol$setRequestHandler$1 protocol$setRequestHandler$1 = new Protocol$setRequestHandler$1(this.$serializer, this.$block, interfaceC4356);
        protocol$setRequestHandler$1.L$0 = c6677;
        protocol$setRequestHandler$1.L$1 = c4311;
        return protocol$setRequestHandler$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C6677 c6677 = (C6677) this.L$0;
            C4311 c4311 = (C4311) this.L$1;
            Object objM12400 = AbstractC4310.m8753().m12400(this.$serializer, c6677.f18087);
            if (objM12400 == null) {
                return new C6610();
            }
            this.L$0 = null;
            this.label = 1;
            obj = this.$block.invoke((InterfaceC6839) objM12400, c4311, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return (InterfaceC6795) obj;
    }
}
