package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p072.C7440;
import p072.C7507;
import p072.InterfaceC7625;
import p072.InterfaceC7669;
import p079.InterfaceC7691;
import p105.InterfaceC8013;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$setRequestHandler$1", m556f = "Protocol.kt", m557l = {453}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;", "request", "Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;", "extraHandler", "L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲兰世;)L飘花落叶言世子楪兰苏哲/飘花落叶言楪哲子苏兰世;"}, m152k = 3, m153mv = {2, 1, 0})
final class Protocol$setRequestHandler$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7380 $block;
    final /* synthetic */ InterfaceC8013 $serializer;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$setRequestHandler$1(InterfaceC8013 interfaceC8013, InterfaceC7380 interfaceC7380, InterfaceC5189<? super Protocol$setRequestHandler$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$serializer = interfaceC8013;
        this.$block = interfaceC7380;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C7507 c7507, C5144 c5144, InterfaceC5189<? super InterfaceC7625> interfaceC5189) {
        Protocol$setRequestHandler$1 protocol$setRequestHandler$1 = new Protocol$setRequestHandler$1(this.$serializer, this.$block, interfaceC5189);
        protocol$setRequestHandler$1.L$0 = c7507;
        protocol$setRequestHandler$1.L$1 = c5144;
        return protocol$setRequestHandler$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C7507 c7507 = (C7507) this.L$0;
            C5144 c5144 = (C5144) this.L$1;
            Object objM12986 = AbstractC5143.m9302().m12986(this.$serializer, c7507.f18427);
            if (objM12986 == null) {
                return new C7440();
            }
            this.L$0 = null;
            this.label = 1;
            obj = this.$block.invoke((InterfaceC7669) objM12986, c5144, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return (InterfaceC7625) obj;
    }
}
