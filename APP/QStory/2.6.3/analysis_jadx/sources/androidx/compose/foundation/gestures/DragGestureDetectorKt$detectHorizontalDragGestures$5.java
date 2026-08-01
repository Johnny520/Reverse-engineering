package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", l = {727, 730, 738}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class DragGestureDetectorKt$detectHorizontalDragGestures$5 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6543 $onDragCancel;
    final /* synthetic */ InterfaceC6543 $onDragEnd;
    final /* synthetic */ InterfaceC6558 $onDragStart;
    final /* synthetic */ InterfaceC6554 $onHorizontalDrag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectHorizontalDragGestures$5(InterfaceC6558 interfaceC6558, InterfaceC6554 interfaceC6554, InterfaceC6543 interfaceC6543, InterfaceC6543 interfaceC65432, InterfaceC4357<? super DragGestureDetectorKt$detectHorizontalDragGestures$5> interfaceC4357) {
        super(2, interfaceC4357);
        this.$onDragStart = interfaceC6558;
        this.$onHorizontalDrag = interfaceC6554;
        this.$onDragEnd = interfaceC6543;
        this.$onDragCancel = interfaceC65432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(Ref$FloatRef ref$FloatRef, C1643 c1643, float f) {
        c1643.m3024();
        ref$FloatRef.element = f;
        return C5176.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$1(InterfaceC6554 interfaceC6554, C1643 c1643) {
        interfaceC6554.invoke(c1643, Float.valueOf(Float.intBitsToFloat((int) (AbstractC1646.m3031(c1643, false) >> 32))));
        c1643.m3024();
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        DragGestureDetectorKt$detectHorizontalDragGestures$5 dragGestureDetectorKt$detectHorizontalDragGestures$5 = new DragGestureDetectorKt$detectHorizontalDragGestures$5(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, interfaceC4357);
        dragGestureDetectorKt$detectHorizontalDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectHorizontalDragGestures$5;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DragGestureDetectorKt$detectHorizontalDragGestures$5) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r13 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L32
            if (r1 == r5) goto L29
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L16
            kotlin.AbstractC5185.m10210(r13)
            r11 = r12
            goto L97
        L16:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r12)
            return r2
        L1c:
            java.lang.Object r1 = r12.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref$FloatRef) r1
            java.lang.Object r4 = r12.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r4 = (androidx.compose.ui.input.pointer.InterfaceC1633) r4
            kotlin.AbstractC5185.m10210(r13)
            r11 = r12
            goto L65
        L29:
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5185.m10210(r13)
        L30:
            r6 = r1
            goto L45
        L32:
            kotlin.AbstractC5185.m10210(r13)
            java.lang.Object r13 = r12.L$0
            r1 = r13
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            r12.L$0 = r1
            r12.label = r5
            java.lang.Object r13 = androidx.compose.foundation.gestures.AbstractC0503.m1275(r1, r2, r12, r4)
            if (r13 != r0) goto L30
            goto L96
        L45:
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r13 = (androidx.compose.ui.input.pointer.C1643) r13
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            long r7 = r13.f4809
            int r9 = r13.f4819
            androidx.compose.foundation.gestures.飘花落叶言子世哲兰楪苏 r10 = new androidx.compose.foundation.gestures.飘花落叶言子世哲兰楪苏
            r13 = 0
            r10.<init>(r1, r13)
            r12.L$0 = r6
            r12.L$1 = r1
            r12.label = r4
            r11 = r12
            java.lang.Object r13 = androidx.compose.foundation.gestures.AbstractC0468.m1238(r6, r7, r9, r10, r11)
            if (r13 != r0) goto L64
            goto L96
        L64:
            r4 = r6
        L65:
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r13 = (androidx.compose.ui.input.pointer.C1643) r13
            if (r13 == 0) goto Laa
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r12 = r11.$onDragStart
            long r6 = r13.f4807
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲 r8 = new 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲
            r8.<init>(r6)
            r12.invoke(r8)
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r12 = r11.$onHorizontalDrag
            float r1 = r1.element
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r1)
            r12.invoke(r13, r6)
            long r12 = r13.f4809
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r1 = r11.$onHorizontalDrag
            androidx.compose.foundation.gestures.飘花落叶言子世哲苏兰楪 r6 = new androidx.compose.foundation.gestures.飘花落叶言子世哲苏兰楪
            r6.<init>(r5, r1)
            r11.L$0 = r2
            r11.L$1 = r2
            r11.label = r3
            java.lang.Object r13 = androidx.compose.foundation.gestures.AbstractC0468.m1246(r4, r12, r6, r11)
            if (r13 != r0) goto L97
        L96:
            return r0
        L97:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r12 = r13.booleanValue()
            if (r12 == 0) goto La5
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r12 = r11.$onDragEnd
            r12.invoke()
            goto Laa
        La5:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r12 = r11.$onDragCancel
            r12.invoke()
        Laa:
            kotlin.飘花落叶言子楪兰苏哲世 r12 = kotlin.C5176.f14739
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
