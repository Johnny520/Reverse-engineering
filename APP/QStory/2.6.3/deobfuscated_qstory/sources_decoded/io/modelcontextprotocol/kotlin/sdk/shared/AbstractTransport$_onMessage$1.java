package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p056.InterfaceC6661;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.shared.AbstractTransport$_onMessage$1", f = "Transport.kt", l = {65, 66}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世楪兰苏;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世楪兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class AbstractTransport$_onMessage$1 extends SuspendLambda implements InterfaceC6554 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC4306 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTransport$_onMessage$1(AbstractC4306 abstractC4306, InterfaceC4357<? super AbstractTransport$_onMessage$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = abstractC4306;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        AbstractTransport$_onMessage$1 abstractTransport$_onMessage$1 = new AbstractTransport$_onMessage$1(this.this$0, interfaceC4357);
        abstractTransport$_onMessage$1.L$0 = obj;
        return abstractTransport$_onMessage$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC6661 interfaceC6661, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AbstractTransport$_onMessage$1) create(interfaceC6661, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r6.invoke(r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.AbstractC5185.m10210(r6)
            goto L45
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r2
        L17:
            java.lang.Object r1 = r5.L$0
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲世楪兰苏 r1 = (p056.InterfaceC6661) r1
            kotlin.AbstractC5185.m10210(r6)
            goto L36
        L1f:
            kotlin.AbstractC5185.m10210(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲世楪兰苏 r1 = (p056.InterfaceC6661) r1
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世苏哲兰 r6 = r5.this$0
            kotlinx.coroutines.飘花落叶言子楪哲兰世苏 r6 = r6.f12875
            r5.L$0 = r1
            r5.label = r4
            java.lang.Object r6 = r6.m10573(r5)
            if (r6 != r0) goto L36
            goto L44
        L36:
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世苏哲兰 r6 = r5.this$0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r6 = r6.f12874
            r5.L$0 = r2
            r5.label = r3
            java.lang.Object r5 = r6.invoke(r1, r5)
            if (r5 != r0) goto L45
        L44:
            return r0
        L45:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.shared.AbstractTransport$_onMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
