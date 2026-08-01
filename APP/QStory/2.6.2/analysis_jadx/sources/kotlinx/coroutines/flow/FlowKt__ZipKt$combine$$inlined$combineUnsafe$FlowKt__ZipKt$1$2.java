package kotlinx.coroutines.flow;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p052.InterfaceC6551;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {329, 258}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {2, 2, 0})
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6551 $transform$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2(InterfaceC4356 interfaceC4356, InterfaceC6551 interfaceC6551) {
        super(3, interfaceC4356);
        this.$transform$inlined = interfaceC6551;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(InterfaceC5317 interfaceC5317, Object[] objArr, InterfaceC4356<? super C5175> interfaceC4356) {
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 = new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2(interfaceC4356, this.$transform$inlined);
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.L$0 = interfaceC5317;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.L$1 = objArr;
        return flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r0.emit(r10, r9) == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r0 = (kotlinx.coroutines.flow.InterfaceC5317) r0
            java.lang.Object r1 = r9.L$1
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r9.label
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L2f
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L19
            kotlin.AbstractC5184.m10206(r10)
            goto L63
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r9)
            return r6
        L1f:
            java.lang.Object r0 = r9.L$4
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object r0 = r9.L$3
            kotlin.coroutines.飘花落叶言子楪世哲苏兰 r0 = (kotlin.coroutines.InterfaceC4356) r0
            java.lang.Object r0 = r9.L$2
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r0 = (kotlinx.coroutines.flow.InterfaceC5317) r0
            kotlin.AbstractC5184.m10206(r10)
            goto L50
        L2f:
            kotlin.AbstractC5184.m10206(r10)
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰苏世 r10 = r9.$transform$inlined
            r3 = 0
            r7 = r1[r3]
            r8 = r1[r5]
            r1 = r1[r4]
            r9.L$0 = r6
            r9.L$1 = r6
            r9.L$2 = r0
            r9.L$3 = r6
            r9.L$4 = r6
            r9.I$0 = r3
            r9.label = r5
            java.lang.Object r10 = r10.invoke(r7, r8, r1, r9)
            if (r10 != r2) goto L50
            goto L62
        L50:
            r9.L$0 = r6
            r9.L$1 = r6
            r9.L$2 = r6
            r9.L$3 = r6
            r9.L$4 = r6
            r9.label = r4
            java.lang.Object r9 = r0.emit(r10, r9)
            if (r9 != r2) goto L63
        L62:
            return r2
        L63:
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5175.f14739
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
