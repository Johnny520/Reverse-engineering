package androidx.compose.ui.input.pointer;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {882, 883}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $timeMillis;
    int label;
    final /* synthetic */ C1621 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(long j, C1621 c1621, InterfaceC4356<? super SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$timeMillis = j;
        this.this$0 = c1621;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(this.$timeMillis, this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10495(8, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 8
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 != r4) goto L12
            kotlin.AbstractC5184.m10206(r9)
            goto L35
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            r8 = 0
            return r8
        L19:
            kotlin.AbstractC5184.m10206(r9)
            goto L2c
        L1d:
            kotlin.AbstractC5184.m10206(r9)
            long r6 = r8.$timeMillis
            long r6 = r6 - r2
            r8.label = r5
            java.lang.Object r9 = kotlinx.coroutines.AbstractC5398.m10495(r6, r8)
            if (r9 != r0) goto L2c
            goto L34
        L2c:
            r8.label = r4
            java.lang.Object r9 = kotlinx.coroutines.AbstractC5398.m10495(r2, r8)
            if (r9 != r0) goto L35
        L34:
            return r0
        L35:
            androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r9 = r8.this$0
            kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r9 = r9.f4742
            if (r9 == 0) goto L4e
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            long r1 = r8.$timeMillis
            r0.<init>(r1)
            kotlin.Result$Failure r8 = new kotlin.Result$Failure
            r8.<init>(r0)
            java.lang.Object r8 = kotlin.Result.m8755constructorimpl(r8)
            r9.resumeWith(r8)
        L4e:
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5175.f14739
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
