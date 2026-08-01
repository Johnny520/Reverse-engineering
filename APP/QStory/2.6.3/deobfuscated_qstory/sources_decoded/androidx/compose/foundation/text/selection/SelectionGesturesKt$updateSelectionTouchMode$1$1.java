package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {94}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class SelectionGesturesKt$updateSelectionTouchMode$1$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6558 $updateTouchMode;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$updateSelectionTouchMode$1$1(InterfaceC6558 interfaceC6558, InterfaceC4357<? super SelectionGesturesKt$updateSelectionTouchMode$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$updateTouchMode = interfaceC6558;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SelectionGesturesKt$updateSelectionTouchMode$1$1 selectionGesturesKt$updateSelectionTouchMode$1$1 = new SelectionGesturesKt$updateSelectionTouchMode$1$1(this.$updateTouchMode, interfaceC4357);
        selectionGesturesKt$updateSelectionTouchMode$1$1.L$0 = obj;
        return selectionGesturesKt$updateSelectionTouchMode$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SelectionGesturesKt$updateSelectionTouchMode$1$1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002e -> B:13:0x0031). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L11
            java.lang.Object r1 = r5.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5185.m10210(r6)
            goto L31
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            r5 = 0
            return r5
        L18:
            kotlin.AbstractC5185.m10210(r6)
            java.lang.Object r6 = r5.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r6 = (androidx.compose.ui.input.pointer.InterfaceC1633) r6
        L1f:
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r5.L$0 = r6
            r5.label = r2
            androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r6 = (androidx.compose.ui.input.pointer.C1621) r6
            java.lang.Object r1 = r6.m2999(r1, r5)
            if (r1 != r0) goto L2e
            return r0
        L2e:
            r4 = r1
            r1 = r6
            r6 = r4
        L31:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r6 = (androidx.compose.ui.input.pointer.C1652) r6
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r3 = r5.$updateTouchMode
            boolean r6 = androidx.compose.foundation.text.selection.AbstractC0894.m1800(r6)
            r6 = r6 ^ r2
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r3.invoke(r6)
            r6 = r1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
