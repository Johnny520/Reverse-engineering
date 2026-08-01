package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", l = {31, 37}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class PressDownGestureKt$detectPressDownGesture$2 extends RestrictedSuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC0847 $onDown;
    final /* synthetic */ InterfaceC6542 $onUp;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressDownGestureKt$detectPressDownGesture$2(InterfaceC0847 interfaceC0847, InterfaceC6542 interfaceC6542, InterfaceC4356<? super PressDownGestureKt$detectPressDownGesture$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$onDown = interfaceC0847;
        this.$onUp = interfaceC6542;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        PressDownGestureKt$detectPressDownGesture$2 pressDownGestureKt$detectPressDownGesture$2 = new PressDownGestureKt$detectPressDownGesture$2(this.$onDown, this.$onUp, interfaceC4356);
        pressDownGestureKt$detectPressDownGesture$2.L$0 = obj;
        return pressDownGestureKt$detectPressDownGesture$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((PressDownGestureKt$detectPressDownGesture$2) create(interfaceC1633, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r12 == r0) goto L24;
     */
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
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L5d
            if (r1 == r4) goto L55
            if (r1 != r2) goto L4f
            java.lang.Object r1 = r11.L$1
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r1 = (androidx.compose.ui.input.pointer.C1643) r1
            java.lang.Object r3 = r11.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r3 = (androidx.compose.ui.input.pointer.InterfaceC1633) r3
            kotlin.AbstractC5184.m10206(r12)
        L18:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r12 = (androidx.compose.ui.input.pointer.C1652) r12
            java.util.List r12 = r12.f4851
            int r4 = r12.size()
            r5 = 0
        L21:
            if (r5 >= r4) goto L47
            java.lang.Object r6 = r12.get(r5)
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r6 = (androidx.compose.ui.input.pointer.C1643) r6
            long r7 = r6.f4808
            long r9 = r1.f4808
            boolean r7 = androidx.compose.ui.input.pointer.AbstractC1646.m3016(r7, r9)
            if (r7 == 0) goto L44
            boolean r6 = r6.f4805
            if (r6 == 0) goto L44
            r11.L$0 = r3
            r11.L$1 = r1
            r11.label = r2
            java.lang.Object r12 = androidx.compose.ui.input.pointer.InterfaceC1633.m3006(r3, r11)
            if (r12 != r0) goto L18
            goto L6e
        L44:
            int r5 = r5 + 1
            goto L21
        L47:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r11 = r11.$onUp
            r11.invoke()
            kotlin.飘花落叶言子楪兰苏哲世 r11 = kotlin.C5175.f14739
            return r11
        L4f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            return r3
        L55:
            java.lang.Object r0 = r11.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r0 = (androidx.compose.ui.input.pointer.InterfaceC1633) r0
            kotlin.AbstractC5184.m10206(r12)
            goto L6f
        L5d:
            kotlin.AbstractC5184.m10206(r12)
            java.lang.Object r12 = r11.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r12 = (androidx.compose.ui.input.pointer.InterfaceC1633) r12
            r11.L$0 = r12
            r11.label = r4
            java.lang.Object r12 = androidx.compose.foundation.gestures.AbstractC0503.m1265(r12, r3, r11, r2)
            if (r12 != r0) goto L6f
        L6e:
            return r0
        L6f:
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r12 = (androidx.compose.ui.input.pointer.C1643) r12
            androidx.compose.foundation.text.input.internal.selection.飘花落叶言子楪世苏哲兰 r11 = r11.$onDown
            long r0 = r12.f4806
            io.ktor.client.plugins.api.飘花落叶言子楪世苏兰哲 r11 = (io.ktor.client.plugins.api.C3885) r11
            r11.getClass()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
