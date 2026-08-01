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
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol$connect$4", f = "Protocol.kt", l = {166, 167}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世楪兰苏;", "message", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世楪兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class Protocol$connect$4 extends SuspendLambda implements InterfaceC6553 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC4306 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$connect$4(AbstractC4306 abstractC4306, InterfaceC4356<? super Protocol$connect$4> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = abstractC4306;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        Protocol$connect$4 protocol$connect$4 = new Protocol$connect$4(this.this$0, interfaceC4356);
        protocol$connect$4.L$0 = obj;
        return protocol$connect$4;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC6660 interfaceC6660, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((Protocol$connect$4) create(interfaceC6660, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4306.m8745(r5.this$0, (p056.C6677) r6, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4306.m8746(r5.this$0, (p056.C6659) r6, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return r0;
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
            if (r1 == 0) goto L18
            if (r1 == r4) goto L14
            if (r1 != r3) goto Le
            goto L14
        Le:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r2
        L14:
            kotlin.AbstractC5184.m10206(r6)
            goto L58
        L18:
            kotlin.AbstractC5184.m10206(r6)
            java.lang.Object r6 = r5.L$0
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲世楪兰苏 r6 = (p056.InterfaceC6660) r6
            boolean r1 = r6 instanceof p056.C6678
            if (r1 == 0) goto L2b
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世兰哲 r5 = r5.this$0
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏兰世楪 r6 = (p056.C6678) r6
            io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4306.m8744(r5, r6, r2)
            goto L58
        L2b:
            boolean r1 = r6 instanceof p056.C6677
            if (r1 == 0) goto L3c
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世兰哲 r1 = r5.this$0
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏世楪兰 r6 = (p056.C6677) r6
            r5.label = r4
            java.lang.Object r5 = io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4306.m8745(r1, r6, r5)
            if (r5 != r0) goto L58
            goto L4c
        L3c:
            boolean r1 = r6 instanceof p056.C6659
            if (r1 == 0) goto L4d
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世兰哲 r1 = r5.this$0
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲世兰苏楪 r6 = (p056.C6659) r6
            r5.label = r3
            java.lang.Object r5 = io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4306.m8746(r1, r6, r5)
            if (r5 != r0) goto L58
        L4c:
            return r0
        L4d:
            boolean r0 = r6 instanceof p056.C6673
            if (r0 == 0) goto L5b
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世兰哲 r5 = r5.this$0
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲楪兰苏世 r6 = (p056.C6673) r6
            io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4306.m8744(r5, r2, r6)
        L58:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        L5b:
            io.ktor.util.C4210.m8621()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.shared.Protocol$connect$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
