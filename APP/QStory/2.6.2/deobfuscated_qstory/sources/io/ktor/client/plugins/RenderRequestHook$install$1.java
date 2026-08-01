package io.ktor.client.plugins;

import io.ktor.util.pipeline.AbstractC4193;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.RenderRequestHook$install$1", f = "HttpPlainText.kt", l = {145, 146}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class RenderRequestHook$install$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6550 $handler;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderRequestHook$install$1(InterfaceC6550 interfaceC6550, InterfaceC4356<? super RenderRequestHook$install$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$handler = interfaceC6550;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        RenderRequestHook$install$1 renderRequestHook$install$1 = new RenderRequestHook$install$1(this.$handler, interfaceC4356);
        renderRequestHook$install$1.L$0 = abstractC4193;
        renderRequestHook$install$1.L$1 = obj;
        return renderRequestHook$install$1.invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r1.mo8580(r8, r7) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.AbstractC5184.m10206(r8)
            goto L47
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r2
        L17:
            java.lang.Object r1 = r7.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r1 = (io.ktor.util.pipeline.AbstractC4193) r1
            kotlin.AbstractC5184.m10206(r8)
            goto L38
        L1f:
            kotlin.AbstractC5184.m10206(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r1 = (io.ktor.util.pipeline.AbstractC4193) r1
            java.lang.Object r8 = r7.L$1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r5 = r7.$handler
            java.lang.Object r6 = r1.f12660
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = r5.invoke(r6, r8, r7)
            if (r8 != r0) goto L38
            goto L46
        L38:
            io.ktor.http.content.飘花落叶言子楪哲世苏兰 r8 = (io.ktor.http.content.AbstractC3986) r8
            if (r8 == 0) goto L47
            r7.L$0 = r2
            r7.label = r3
            java.lang.Object r7 = r1.mo8580(r8, r7)
            if (r7 != r0) goto L47
        L46:
            return r0
        L47:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5175.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.RenderRequestHook$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
