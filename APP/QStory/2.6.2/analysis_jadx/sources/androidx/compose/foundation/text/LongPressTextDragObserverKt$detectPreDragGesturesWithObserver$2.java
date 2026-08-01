package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {77, 81}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends RestrictedSuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1013 $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(InterfaceC1013 interfaceC1013, InterfaceC4356<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$observer = interfaceC1013;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.$observer, interfaceC4356);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create(interfaceC1633, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r12 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r12 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004f -> B:17:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L19
            java.lang.Object r1 = r11.L$1
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r1 = (androidx.compose.ui.input.pointer.C1643) r1
            java.lang.Object r2 = r11.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r2 = (androidx.compose.ui.input.pointer.InterfaceC1633) r2
            kotlin.AbstractC5184.m10206(r12)
            goto L52
        L19:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            return r2
        L1f:
            java.lang.Object r1 = r11.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5184.m10206(r12)
            goto L3a
        L27:
            kotlin.AbstractC5184.m10206(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            r11.L$0 = r1
            r11.label = r4
            java.lang.Object r12 = androidx.compose.foundation.gestures.AbstractC0503.m1265(r1, r2, r11, r3)
            if (r12 != r0) goto L3a
            goto L51
        L3a:
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r12 = (androidx.compose.ui.input.pointer.C1643) r12
            androidx.compose.foundation.text.飘花落叶言子苏楪哲世兰 r2 = r11.$observer
            long r4 = r12.f4806
            r2.mo1735()
            r2 = r1
            r1 = r12
        L45:
            r11.L$0 = r2
            r11.L$1 = r1
            r11.label = r3
            java.lang.Object r12 = androidx.compose.ui.input.pointer.InterfaceC1633.m3006(r2, r11)
            if (r12 != r0) goto L52
        L51:
            return r0
        L52:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r12 = (androidx.compose.ui.input.pointer.C1652) r12
            java.util.List r12 = r12.f4851
            int r4 = r12.size()
            r5 = 0
        L5b:
            if (r5 >= r4) goto L75
            java.lang.Object r6 = r12.get(r5)
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r6 = (androidx.compose.ui.input.pointer.C1643) r6
            long r7 = r6.f4808
            long r9 = r1.f4808
            boolean r7 = androidx.compose.ui.input.pointer.AbstractC1646.m3016(r7, r9)
            if (r7 == 0) goto L72
            boolean r6 = r6.f4805
            if (r6 == 0) goto L72
            goto L45
        L72:
            int r5 = r5 + 1
            goto L5b
        L75:
            androidx.compose.foundation.text.飘花落叶言子苏楪哲世兰 r11 = r11.$observer
            r11.mo1736()
            kotlin.飘花落叶言子楪兰苏哲世 r11 = kotlin.C5175.f14739
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
