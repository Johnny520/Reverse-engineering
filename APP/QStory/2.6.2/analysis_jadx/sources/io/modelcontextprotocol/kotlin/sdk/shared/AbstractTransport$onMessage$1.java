package io.modelcontextprotocol.kotlin.sdk.shared;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p056.InterfaceC6660;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.shared.AbstractTransport$onMessage$1", f = "Transport.kt", l = {93, 94}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世楪兰苏;", "message", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世楪兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class AbstractTransport$onMessage$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $block;
    final /* synthetic */ InterfaceC6553 $old;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTransport$onMessage$1(InterfaceC6553 interfaceC6553, InterfaceC6553 interfaceC65532, InterfaceC4356<? super AbstractTransport$onMessage$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$old = interfaceC6553;
        this.$block = interfaceC65532;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        AbstractTransport$onMessage$1 abstractTransport$onMessage$1 = new AbstractTransport$onMessage$1(this.$old, this.$block, interfaceC4356);
        abstractTransport$onMessage$1.L$0 = obj;
        return abstractTransport$onMessage$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC6660 interfaceC6660, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((AbstractTransport$onMessage$1) create(interfaceC6660, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
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
            kotlin.AbstractC5184.m10206(r6)
            goto L41
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r2
        L17:
            java.lang.Object r1 = r5.L$0
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲世楪兰苏 r1 = (p056.InterfaceC6660) r1
            kotlin.AbstractC5184.m10206(r6)
            goto L34
        L1f:
            kotlin.AbstractC5184.m10206(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲世楪兰苏 r1 = (p056.InterfaceC6660) r1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r6 = r5.$old
            r5.L$0 = r1
            r5.label = r4
            java.lang.Object r6 = r6.invoke(r1, r5)
            if (r6 != r0) goto L34
            goto L40
        L34:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r6 = r5.$block
            r5.L$0 = r2
            r5.label = r3
            java.lang.Object r5 = r6.invoke(r1, r5)
            if (r5 != r0) goto L41
        L40:
            return r0
        L41:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.shared.AbstractTransport$onMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
