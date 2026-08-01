package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p056.AbstractC6603;
import p056.C6659;
import p056.InterfaceC6812;
import p063.InterfaceC6861;
import p088.AbstractC7158;
import p088.AbstractC7175;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$setNotificationHandler$1", f = "Protocol.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世兰苏楪;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世兰苏楪;)V"}, k = 3, mv = {2, 1, 0})
final class Protocol$setNotificationHandler$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6557 $handler;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$setNotificationHandler$1(InterfaceC6557 interfaceC6557, InterfaceC4356<? super Protocol$setNotificationHandler$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$handler = interfaceC6557;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        Protocol$setNotificationHandler$1 protocol$setNotificationHandler$1 = new Protocol$setNotificationHandler$1(this.$handler, interfaceC4356);
        protocol$setNotificationHandler$1.L$0 = obj;
        return protocol$setNotificationHandler$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C6659 c6659, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((Protocol$setNotificationHandler$1) create(c6659, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C6659 c6659 = (C6659) this.L$0;
        InterfaceC6557 interfaceC6557 = this.$handler;
        String[] strArr = AbstractC6603.f17984;
        c6659.getClass();
        AbstractC7158 abstractC7158M8753 = AbstractC4310.m8753();
        AbstractC7175 abstractC7175 = c6659.f18064;
        abstractC7158M8753.getClass();
        InterfaceC6812 interfaceC6812 = (InterfaceC6812) abstractC7158M8753.m12400(InterfaceC6812.Companion.serializer(), abstractC7175);
        interfaceC6812.getClass();
        interfaceC6557.invoke(interfaceC6812);
        return C5175.f14739;
    }
}
