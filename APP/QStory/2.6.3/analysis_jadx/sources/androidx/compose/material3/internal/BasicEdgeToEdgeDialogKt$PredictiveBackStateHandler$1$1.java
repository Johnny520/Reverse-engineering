package androidx.compose.material3.internal;

import androidx.compose.runtime.InterfaceC1333;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC5319;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1", f = "BasicEdgeToEdgeDialog.kt", l = {100}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;", "Landroidx/activity/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/material3/internal/BackEventCompat;", "progress", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;)V"}, k = 3, mv = {2, 0, 0})
final class BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC1333 $currentOnBack$delegate;
    final /* synthetic */ InterfaceC1123 $state;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(InterfaceC1123 interfaceC1123, InterfaceC1333 interfaceC1333, InterfaceC4357<? super BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$currentOnBack$delegate = interfaceC1333;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 = new BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(null, this.$currentOnBack$delegate, interfaceC4357);
        basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1.L$0 = obj;
        return basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5319 interfaceC5319, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1) create(interfaceC5319, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        throw null;
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
            r3 = 1
            if (r1 == 0) goto L15
            if (r1 == r3) goto L11
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            r5 = 0
            return r5
        L11:
            kotlin.AbstractC5185.m10210(r6)     // Catch: java.util.concurrent.CancellationException -> L2c
            goto L2b
        L15:
            kotlin.AbstractC5185.m10210(r6)
            java.lang.Object r6 = r5.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r6 = (kotlinx.coroutines.flow.InterfaceC5319) r6
            androidx.compose.foundation.text.input.internal.飘花落叶言子楪世兰苏哲 r1 = new androidx.compose.foundation.text.input.internal.飘花落叶言子楪世兰苏哲     // Catch: java.util.concurrent.CancellationException -> L2c
            r4 = 3
            r1.<init>(r4)     // Catch: java.util.concurrent.CancellationException -> L2c
            r5.label = r3     // Catch: java.util.concurrent.CancellationException -> L2c
            java.lang.Object r5 = r6.mo8453(r1, r5)     // Catch: java.util.concurrent.CancellationException -> L2c
            if (r5 != r0) goto L2b
            return r0
        L2b:
            throw r2
        L2c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
