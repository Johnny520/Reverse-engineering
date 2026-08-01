package kotlinx.coroutines.flow;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "", "", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/Array;)V"}, k = 3, mv = {2, 2, 0})
final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6550 $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$1$1(InterfaceC6550 interfaceC6550, InterfaceC4356<? super FlowKt__ZipKt$combine$1$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$transform = interfaceC6550;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(InterfaceC5317 interfaceC5317, Object[] objArr, InterfaceC4356<? super C5175> interfaceC4356) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.$transform, interfaceC4356);
        flowKt__ZipKt$combine$1$1.L$0 = interfaceC5317;
        flowKt__ZipKt$combine$1$1.L$1 = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r0.emit(r8, r7) == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r0 = (kotlinx.coroutines.flow.InterfaceC5317) r0
            java.lang.Object r1 = r7.L$1
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r7.label
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L27
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L19
            kotlin.AbstractC5184.m10206(r8)
            goto L4f
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r6
        L1f:
            java.lang.Object r0 = r7.L$2
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r0 = (kotlinx.coroutines.flow.InterfaceC5317) r0
            kotlin.AbstractC5184.m10206(r8)
            goto L40
        L27:
            kotlin.AbstractC5184.m10206(r8)
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r8 = r7.$transform
            r3 = 0
            r3 = r1[r3]
            r1 = r1[r5]
            r7.L$0 = r6
            r7.L$1 = r6
            r7.L$2 = r0
            r7.label = r5
            java.lang.Object r8 = r8.invoke(r3, r1, r7)
            if (r8 != r2) goto L40
            goto L4e
        L40:
            r7.L$0 = r6
            r7.L$1 = r6
            r7.L$2 = r6
            r7.label = r4
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r2) goto L4f
        L4e:
            return r2
        L4f:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5175.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
