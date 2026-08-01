package androidx.compose.foundation.text.contextmenu.gestures;

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
@InterfaceC6862(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", f = "RightClickGestures.kt", l = {32, 35}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class RightClickGesturesKt$onRightClickDown$2 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6558 $onDown;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightClickGesturesKt$onRightClickDown$2(InterfaceC6558 interfaceC6558, InterfaceC4357<? super RightClickGesturesKt$onRightClickDown$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$onDown = interfaceC6558;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        RightClickGesturesKt$onRightClickDown$2 rightClickGesturesKt$onRightClickDown$2 = new RightClickGesturesKt$onRightClickDown$2(this.$onDown, interfaceC4357);
        rightClickGesturesKt$onRightClickDown$2.L$0 = obj;
        return rightClickGesturesKt$onRightClickDown$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((RightClickGesturesKt$onRightClickDown$2) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r2) goto L11
            kotlin.AbstractC5185.m10210(r8)
            goto L52
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r3
        L17:
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5185.m10210(r8)
            goto L32
        L1f:
            kotlin.AbstractC5185.m10210(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = androidx.compose.foundation.text.contextmenu.gestures.AbstractC0785.m1590(r1, r7)
            if (r8 != r0) goto L32
            goto L51
        L32:
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r8 = (androidx.compose.ui.input.pointer.C1643) r8
            r8.m3024()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r4 = r7.$onDown
            long r5 = r8.f4807
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲 r8 = new 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲
            r8.<init>(r5)
            r4.invoke(r8)
            r7.L$0 = r3
            r7.label = r2
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r8 = androidx.compose.foundation.gestures.AbstractC0503.f1500
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            java.lang.Object r8 = androidx.compose.foundation.gestures.AbstractC0503.m1279(r1, r8, r7)
            if (r8 != r0) goto L52
        L51:
            return r0
        L52:
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r8 = (androidx.compose.ui.input.pointer.C1643) r8
            if (r8 == 0) goto L59
            r8.m3024()
        L59:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
