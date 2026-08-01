package kotlinx.coroutines.flow;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6544;
import p052.InterfaceC6551;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", l = {329, 258}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {2, 2, 0})
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6544 $transform$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2(InterfaceC4357 interfaceC4357, InterfaceC6544 interfaceC6544) {
        super(3, interfaceC4357);
        this.$transform$inlined = interfaceC6544;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(InterfaceC5318 interfaceC5318, Object[] objArr, InterfaceC4357<? super C5176> interfaceC4357) {
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 = new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2(interfaceC4357, this.$transform$inlined);
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.L$0 = interfaceC5318;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.L$1 = objArr;
        return flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (r0.emit(r15, r13) == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r0 = (kotlinx.coroutines.flow.InterfaceC5318) r0
            java.lang.Object r1 = r14.L$1
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r14.label
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L30
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L19
            kotlin.AbstractC5185.m10210(r15)
            goto L6b
        L19:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r14)
            return r6
        L1f:
            java.lang.Object r0 = r14.L$4
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object r0 = r14.L$3
            kotlin.coroutines.飘花落叶言子楪世哲苏兰 r0 = (kotlin.coroutines.InterfaceC4357) r0
            java.lang.Object r0 = r14.L$2
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r0 = (kotlinx.coroutines.flow.InterfaceC5318) r0
            kotlin.AbstractC5185.m10210(r15)
            r13 = r14
            goto L58
        L30:
            kotlin.AbstractC5185.m10210(r15)
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪兰世哲苏 r7 = r14.$transform$inlined
            r15 = 0
            r8 = r1[r15]
            r9 = r1[r5]
            r10 = r1[r4]
            r3 = 3
            r11 = r1[r3]
            r3 = 4
            r12 = r1[r3]
            r14.L$0 = r6
            r14.L$1 = r6
            r14.L$2 = r0
            r14.L$3 = r6
            r14.L$4 = r6
            r14.I$0 = r15
            r14.label = r5
            r13 = r14
            java.lang.Object r15 = r7.invoke(r8, r9, r10, r11, r12, r13)
            if (r15 != r2) goto L58
            goto L6a
        L58:
            r13.L$0 = r6
            r13.L$1 = r6
            r13.L$2 = r6
            r13.L$3 = r6
            r13.L$4 = r6
            r13.label = r4
            java.lang.Object r14 = r0.emit(r15, r13)
            if (r14 != r2) goto L6b
        L6a:
            return r2
        L6b:
            kotlin.飘花落叶言子楪兰苏哲世 r14 = kotlin.C5176.f14739
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
