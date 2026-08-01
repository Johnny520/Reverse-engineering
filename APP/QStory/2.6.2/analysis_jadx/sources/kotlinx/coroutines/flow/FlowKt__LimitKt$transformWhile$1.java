package kotlinx.coroutines.flow;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {152}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, k = 3, mv = {2, 2, 0})
final class FlowKt__LimitKt$transformWhile$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5318 $this_transformWhile;
    final /* synthetic */ InterfaceC6550 $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$transformWhile$1(InterfaceC5318 interfaceC5318, InterfaceC6550 interfaceC6550, InterfaceC4356<? super FlowKt__LimitKt$transformWhile$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_transformWhile = interfaceC5318;
        this.$transform = interfaceC6550;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.$this_transformWhile, this.$transform, interfaceC4356);
        flowKt__LimitKt$transformWhile$1.L$0 = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5317 interfaceC5317, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((FlowKt__LimitKt$transformWhile$1) create(interfaceC5317, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r0 = (kotlinx.coroutines.flow.InterfaceC5317) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r6.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L22
            if (r2 != r4) goto L1c
            java.lang.Object r0 = r6.L$2
            kotlinx.coroutines.flow.飘花落叶言子苏楪世哲兰 r0 = (kotlinx.coroutines.flow.C5342) r0
            java.lang.Object r1 = r6.L$1
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r1 = (kotlinx.coroutines.flow.InterfaceC5318) r1
            kotlin.AbstractC5184.m10206(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L1a
            goto L4d
        L1a:
            r7 = move-exception
            goto L42
        L1c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L22:
            kotlin.AbstractC5184.m10206(r7)
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r7 = r6.$this_transformWhile
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r2 = r6.$transform
            kotlinx.coroutines.flow.飘花落叶言子苏楪世哲兰 r5 = new kotlinx.coroutines.flow.飘花落叶言子苏楪世哲兰
            r5.<init>(r2, r0)
            r6.L$0 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L40
            r6.L$1 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L40
            r6.L$2 = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L40
            r0 = 0
            r6.I$0 = r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L40
            r6.label = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L40
            java.lang.Object r6 = r7.mo8463(r5, r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L40
            if (r6 != r1) goto L4d
            return r1
        L40:
            r7 = move-exception
            r0 = r5
        L42:
            java.lang.Object r1 = r7.owner
            if (r1 != r0) goto L50
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r6 = r6.getContext()
            kotlinx.coroutines.AbstractC5398.m10498(r6)
        L4d:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        L50:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
