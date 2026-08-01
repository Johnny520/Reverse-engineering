package androidx.compose.material3;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.DragHandleKt$pressable$1$1", f = "DragHandle.kt", l = {341, 343}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class DragHandleKt$pressable$1$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6543 $onPressed;
    final /* synthetic */ InterfaceC6543 $onReleasedOrCancelled;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragHandleKt$pressable$1$1(InterfaceC6543 interfaceC6543, InterfaceC6543 interfaceC65432, InterfaceC4357<? super DragHandleKt$pressable$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$onPressed = interfaceC6543;
        this.$onReleasedOrCancelled = interfaceC65432;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        DragHandleKt$pressable$1$1 dragHandleKt$pressable$1$1 = new DragHandleKt$pressable$1$1(this.$onPressed, this.$onReleasedOrCancelled, interfaceC4357);
        dragHandleKt$pressable$1$1.L$0 = obj;
        return dragHandleKt$pressable$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DragHandleKt$pressable$1$1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (androidx.compose.foundation.gestures.AbstractC0503.m1279(r1, r6, r5) == r0) goto L15;
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
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.AbstractC5185.m10210(r6)
            goto L46
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r2
        L17:
            java.lang.Object r1 = r5.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5185.m10210(r6)
            goto L34
        L1f:
            kotlin.AbstractC5185.m10210(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r5.L$0 = r1
            r5.label = r4
            java.lang.Object r6 = androidx.compose.foundation.gestures.AbstractC0503.m1275(r1, r6, r5, r4)
            if (r6 != r0) goto L34
            goto L45
        L34:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r6 = r5.$onPressed
            r6.invoke()
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r5.L$0 = r2
            r5.label = r3
            java.lang.Object r6 = androidx.compose.foundation.gestures.AbstractC0503.m1279(r1, r6, r5)
            if (r6 != r0) goto L46
        L45:
            return r0
        L46:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r5 = r5.$onReleasedOrCancelled
            r5.invoke()
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DragHandleKt$pressable$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
