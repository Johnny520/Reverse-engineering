package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {Opcodes.AND_INT_LIT16, Opcodes.AND_INT_LIT16}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6554 $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$mapLatest$1(InterfaceC6554 interfaceC6554, InterfaceC4357<? super FlowKt__MergeKt$mapLatest$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$transform = interfaceC6554;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(InterfaceC5318 interfaceC5318, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.$transform, interfaceC4357);
        flowKt__MergeKt$mapLatest$1.L$0 = interfaceC5318;
        flowKt__MergeKt$mapLatest$1.L$1 = obj;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
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
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r0 = (kotlinx.coroutines.flow.InterfaceC5318) r0
            java.lang.Object r1 = r7.L$1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r7.label
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L25
            if (r3 == r5) goto L1d
            if (r3 != r4) goto L17
            kotlin.AbstractC5185.m10210(r8)
            goto L48
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r6
        L1d:
            java.lang.Object r0 = r7.L$2
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r0 = (kotlinx.coroutines.flow.InterfaceC5318) r0
            kotlin.AbstractC5185.m10210(r8)
            goto L39
        L25:
            kotlin.AbstractC5185.m10210(r8)
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r8 = r7.$transform
            r7.L$0 = r6
            r7.L$1 = r6
            r7.L$2 = r0
            r7.label = r5
            java.lang.Object r8 = r8.invoke(r1, r7)
            if (r8 != r2) goto L39
            goto L47
        L39:
            r7.L$0 = r6
            r7.L$1 = r6
            r7.L$2 = r6
            r7.label = r4
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r2) goto L48
        L47:
            return r2
        L48:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
