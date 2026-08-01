package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", f = "DragGestureDetector.kt", l = {248, 249}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class DragGestureDetectorKt$detectDragGestures$13 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $onDrag;
    final /* synthetic */ InterfaceC6543 $onDragCancel;
    final /* synthetic */ InterfaceC6558 $onDragEnd;
    final /* synthetic */ InterfaceC6551 $onDragStart;
    final /* synthetic */ Orientation $orientationLock;
    final /* synthetic */ InterfaceC6543 $shouldAwaitTouchSlop;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$13(InterfaceC6543 interfaceC6543, Orientation orientation, InterfaceC6551 interfaceC6551, InterfaceC6554 interfaceC6554, InterfaceC6543 interfaceC65432, InterfaceC6558 interfaceC6558, InterfaceC4357<? super DragGestureDetectorKt$detectDragGestures$13> interfaceC4357) {
        super(2, interfaceC4357);
        this.$shouldAwaitTouchSlop = interfaceC6543;
        this.$orientationLock = orientation;
        this.$onDragStart = interfaceC6551;
        this.$onDrag = interfaceC6554;
        this.$onDragCancel = interfaceC65432;
        this.$onDragEnd = interfaceC6558;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        DragGestureDetectorKt$detectDragGestures$13 dragGestureDetectorKt$detectDragGestures$13 = new DragGestureDetectorKt$detectDragGestures$13(this.$shouldAwaitTouchSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, interfaceC4357);
        dragGestureDetectorKt$detectDragGestures$13.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$13;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DragGestureDetectorKt$detectDragGestures$13) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (androidx.compose.foundation.gestures.AbstractC0468.m1245(r4, (androidx.compose.ui.input.pointer.C1643) r14, r6, r7, r8, r9, r10, r11, r13) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.AbstractC5185.m10210(r14)
            goto L51
        L11:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r13)
            return r2
        L17:
            java.lang.Object r1 = r13.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5185.m10210(r14)
        L1e:
            r4 = r1
            goto L36
        L20:
            kotlin.AbstractC5185.m10210(r14)
            java.lang.Object r14 = r13.L$0
            r1 = r14
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            androidx.compose.ui.input.pointer.PointerEventPass r14 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r13.L$0 = r1
            r13.label = r4
            r4 = 0
            java.lang.Object r14 = androidx.compose.foundation.gestures.AbstractC0503.m1276(r1, r4, r14, r13)
            if (r14 != r0) goto L1e
            goto L50
        L36:
            r5 = r14
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r5 = (androidx.compose.ui.input.pointer.C1643) r5
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r6 = r13.$shouldAwaitTouchSlop
            androidx.compose.foundation.gestures.Orientation r7 = r13.$orientationLock
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r8 = r13.$onDragStart
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r9 = r13.$onDrag
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r10 = r13.$onDragCancel
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r11 = r13.$onDragEnd
            r13.L$0 = r2
            r13.label = r3
            r12 = r13
            java.lang.Object r13 = androidx.compose.foundation.gestures.AbstractC0468.m1245(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r0) goto L51
        L50:
            return r0
        L51:
            kotlin.飘花落叶言子楪兰苏哲世 r13 = kotlin.C5176.f14739
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
