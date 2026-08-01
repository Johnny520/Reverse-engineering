package io.ktor.client.plugins.api;

import io.ktor.util.pipeline.AbstractC4194;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6545;
import p052.InterfaceC6551;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.api.TransformRequestBodyHook$install$1", f = "KtorCallContexts.kt", l = {78, 79}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class TransformRequestBodyHook$install$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6545 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformRequestBodyHook$install$1(InterfaceC6545 interfaceC6545, InterfaceC4357<? super TransformRequestBodyHook$install$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$handler = interfaceC6545;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        TransformRequestBodyHook$install$1 transformRequestBodyHook$install$1 = new TransformRequestBodyHook$install$1(this.$handler, interfaceC4357);
        transformRequestBodyHook$install$1.L$0 = abstractC4194;
        return transformRequestBodyHook$install$1.invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r1.mo8570(r12, r10) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.AbstractC5185.m10210(r12)
            goto L61
        L11:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r11)
            return r2
        L17:
            java.lang.Object r1 = r11.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r1 = (io.ktor.util.pipeline.AbstractC4194) r1
            kotlin.AbstractC5185.m10210(r12)
            r10 = r11
            goto L52
        L20:
            kotlin.AbstractC5185.m10210(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r1 = (io.ktor.util.pipeline.AbstractC4194) r1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪兰世苏哲 r5 = r11.$handler
            io.ktor.client.plugins.api.飘花落叶言子楪世苏兰哲 r6 = new io.ktor.client.plugins.api.飘花落叶言子楪世苏兰哲
            r12 = 21
            r6.<init>(r12)
            java.lang.Object r7 = r1.f12664
            java.lang.Object r8 = r1.mo8567()
            java.lang.Object r12 = r1.f12664
            飘花落叶言楪兰世苏子哲.飘花落叶言子楪世苏兰哲 r12 = (p241.C8140) r12
            io.ktor.util.飘花落叶言子楪世兰哲苏 r12 = r12.f22455
            io.ktor.util.飘花落叶言子楪世苏哲兰 r9 = p241.AbstractC8136.f22445
            java.lang.Object r12 = r12.m8587(r9)
            r9 = r12
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r9 = (p059.C6857) r9
            r11.L$0 = r1
            r11.label = r4
            r10 = r11
            java.lang.Object r12 = r5.invoke(r6, r7, r8, r9, r10)
            if (r12 != r0) goto L52
            goto L60
        L52:
            io.ktor.http.content.飘花落叶言子楪哲世苏兰 r12 = (io.ktor.http.content.AbstractC3987) r12
            if (r12 == 0) goto L61
            r10.L$0 = r2
            r10.label = r3
            java.lang.Object r11 = r1.mo8570(r12, r10)
            if (r11 != r0) goto L61
        L60:
            return r0
        L61:
            kotlin.飘花落叶言子楪兰苏哲世 r11 = kotlin.C5176.f14739
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.TransformRequestBodyHook$install$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
