package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p056.AbstractC6604;
import p056.C6660;
import p056.InterfaceC6813;
import p063.InterfaceC6862;
import p088.AbstractC7159;
import p088.AbstractC7176;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$setNotificationHandler$1", f = "Protocol.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世兰苏楪;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世兰苏楪;)V"}, k = 3, mv = {2, 1, 0})
final class Protocol$setNotificationHandler$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6558 $handler;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$setNotificationHandler$1(InterfaceC6558 interfaceC6558, InterfaceC4357<? super Protocol$setNotificationHandler$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$handler = interfaceC6558;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        Protocol$setNotificationHandler$1 protocol$setNotificationHandler$1 = new Protocol$setNotificationHandler$1(this.$handler, interfaceC4357);
        protocol$setNotificationHandler$1.L$0 = obj;
        return protocol$setNotificationHandler$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C6660 c6660, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((Protocol$setNotificationHandler$1) create(c6660, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C6660 c6660 = (C6660) this.L$0;
        InterfaceC6558 interfaceC6558 = this.$handler;
        String[] strArr = AbstractC6604.f17979;
        c6660.getClass();
        AbstractC7159 abstractC7159M8743 = AbstractC4311.m8743();
        AbstractC7176 abstractC7176 = c6660.f18059;
        abstractC7159M8743.getClass();
        InterfaceC6813 interfaceC6813 = (InterfaceC6813) abstractC7159M8743.m12427(InterfaceC6813.Companion.serializer(), abstractC7176);
        interfaceC6813.getClass();
        interfaceC6558.invoke(interfaceC6813);
        return C5176.f14739;
    }
}
