package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import com.google.protobuf.DescriptorProtos$Edition;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", l = {DescriptorProtos$Edition.EDITION_2024_VALUE, 1007}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class SelectionManager$onClearSelectionRequested$1$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6542 $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0899 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$onClearSelectionRequested$1$1(AbstractC0899 abstractC0899, InterfaceC6542 interfaceC6542, InterfaceC4356<? super SelectionManager$onClearSelectionRequested$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$block = interfaceC6542;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        SelectionManager$onClearSelectionRequested$1$1 selectionManager$onClearSelectionRequested$1$1 = new SelectionManager$onClearSelectionRequested$1$1(null, this.$block, interfaceC4356);
        selectionManager$onClearSelectionRequested$1$1.L$0 = obj;
        return selectionManager$onClearSelectionRequested$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SelectionManager$onClearSelectionRequested$1$1) create(interfaceC1633, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r6 == r0) goto L15;
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
            kotlin.AbstractC5184.m10206(r6)
            goto L45
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r2
        L17:
            java.lang.Object r1 = r5.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5184.m10206(r6)
            goto L36
        L1f:
            kotlin.AbstractC5184.m10206(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            r5.L$0 = r1
            r5.label = r4
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r6 = androidx.compose.foundation.gestures.AbstractC0503.f1499
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            java.lang.Object r6 = androidx.compose.foundation.gestures.AbstractC0503.m1264(r1, r6, r5)
            if (r6 != r0) goto L36
            goto L44
        L36:
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r6 = (androidx.compose.ui.input.pointer.C1643) r6
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r5.L$0 = r2
            r5.label = r3
            java.lang.Object r6 = androidx.compose.foundation.gestures.AbstractC0468.m1230(r1, r6, r4, r5)
            if (r6 != r0) goto L45
        L44:
            return r0
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L50
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        L50:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
