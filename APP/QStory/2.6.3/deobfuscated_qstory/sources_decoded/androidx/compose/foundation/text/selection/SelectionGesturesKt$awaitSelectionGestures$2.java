package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.InterfaceC1013;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2", f = "SelectionGestures.kt", l = {111, 119, 122, 124}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class SelectionGesturesKt$awaitSelectionGestures$2 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C0927 $clicksCounter;
    final /* synthetic */ InterfaceC0926 $mouseSelectionObserver;
    final /* synthetic */ InterfaceC1013 $textDragObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$awaitSelectionGestures$2(C0927 c0927, InterfaceC0926 interfaceC0926, InterfaceC1013 interfaceC1013, InterfaceC4357<? super SelectionGesturesKt$awaitSelectionGestures$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$clicksCounter = c0927;
        this.$mouseSelectionObserver = interfaceC0926;
        this.$textDragObserver = interfaceC1013;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SelectionGesturesKt$awaitSelectionGestures$2 selectionGesturesKt$awaitSelectionGestures$2 = new SelectionGesturesKt$awaitSelectionGestures$2(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, interfaceC4357);
        selectionGesturesKt$awaitSelectionGestures$2.L$0 = obj;
        return selectionGesturesKt$awaitSelectionGestures$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SelectionGesturesKt$awaitSelectionGestures$2) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (androidx.compose.foundation.text.selection.AbstractC0895.m1810(r2, r3, r4, r8, r18) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        if (androidx.compose.foundation.text.selection.AbstractC0895.m1811(r2, r4, r8, r18) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (androidx.compose.foundation.text.selection.AbstractC0895.m1814(r2, r4, r8, r3, r18) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
