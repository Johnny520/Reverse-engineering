package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p056.C6611;
import p056.C6678;
import p056.InterfaceC6796;
import p056.InterfaceC6840;
import p063.InterfaceC6862;
import p089.InterfaceC7184;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$setRequestHandler$1", f = "Protocol.kt", l = {453}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;", "request", "Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;", "extraHandler", "L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;)L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;"}, k = 3, mv = {2, 1, 0})
final class Protocol$setRequestHandler$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6551 $block;
    final /* synthetic */ InterfaceC7184 $serializer;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$setRequestHandler$1(InterfaceC7184 interfaceC7184, InterfaceC6551 interfaceC6551, InterfaceC4357<? super Protocol$setRequestHandler$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$serializer = interfaceC7184;
        this.$block = interfaceC6551;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C6678 c6678, C4312 c4312, InterfaceC4357<? super InterfaceC6796> interfaceC4357) {
        Protocol$setRequestHandler$1 protocol$setRequestHandler$1 = new Protocol$setRequestHandler$1(this.$serializer, this.$block, interfaceC4357);
        protocol$setRequestHandler$1.L$0 = c6678;
        protocol$setRequestHandler$1.L$1 = c4312;
        return protocol$setRequestHandler$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C6678 c6678 = (C6678) this.L$0;
            C4312 c4312 = (C4312) this.L$1;
            Object objM12427 = AbstractC4311.m8743().m12427(this.$serializer, c6678.f18082);
            if (objM12427 == null) {
                return new C6611();
            }
            this.L$0 = null;
            this.label = 1;
            obj = this.$block.invoke((InterfaceC6840) objM12427, c4312, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return (InterfaceC6796) obj;
    }
}
