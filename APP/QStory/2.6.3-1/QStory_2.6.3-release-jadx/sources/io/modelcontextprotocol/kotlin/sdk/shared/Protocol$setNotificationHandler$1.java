package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p072.AbstractC7433;
import p072.C7489;
import p072.InterfaceC7642;
import p079.InterfaceC7691;
import p104.AbstractC7988;
import p104.AbstractC8005;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$setNotificationHandler$1", m556f = "Protocol.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世兰苏楪;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世兰苏楪;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class Protocol$setNotificationHandler$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7387 $handler;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$setNotificationHandler$1(InterfaceC7387 interfaceC7387, InterfaceC5189<? super Protocol$setNotificationHandler$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$handler = interfaceC7387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        Protocol$setNotificationHandler$1 protocol$setNotificationHandler$1 = new Protocol$setNotificationHandler$1(this.$handler, interfaceC5189);
        protocol$setNotificationHandler$1.L$0 = obj;
        return protocol$setNotificationHandler$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C7489 c7489, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((Protocol$setNotificationHandler$1) create(c7489, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C7489 c7489 = (C7489) this.L$0;
        InterfaceC7387 interfaceC7387 = this.$handler;
        String[] strArr = AbstractC7433.f18324;
        c7489.getClass();
        AbstractC7988 abstractC7988M9302 = AbstractC5143.m9302();
        AbstractC8005 abstractC8005 = c7489.f18404;
        abstractC7988M9302.getClass();
        InterfaceC7642 interfaceC7642 = (InterfaceC7642) abstractC7988M9302.m12986(InterfaceC7642.Companion.serializer(), abstractC8005);
        interfaceC7642.getClass();
        interfaceC7387.invoke(interfaceC7642);
        return C6008.f15084;
    }
}
