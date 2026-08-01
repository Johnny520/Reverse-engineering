package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C0331;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6557;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContentLayout$resetGesture$1$1", f = "BottomSheetContentLayout.kt", l = {176, 177}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 3, 0})
final class BottomSheetContentLayoutKt$BottomSheetContentLayout$resetGesture$1$1 extends SuspendLambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC1397 $dimAlpha;
    final /* synthetic */ C0331 $dragOffsetY;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetContentLayoutKt$BottomSheetContentLayout$resetGesture$1$1(C0331 c0331, InterfaceC1397 interfaceC1397, InterfaceC4356<? super BottomSheetContentLayoutKt$BottomSheetContentLayout$resetGesture$1$1> interfaceC4356) {
        super(1, interfaceC4356);
        this.$dragOffsetY = c0331;
        this.$dimAlpha = interfaceC1397;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(InterfaceC1397 interfaceC1397, float f, float f2) {
        ((AbstractC1349) interfaceC1397).m2425(f);
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
        return new BottomSheetContentLayoutKt$BottomSheetContentLayout$resetGesture$1$1(this.$dragOffsetY, this.$dimAlpha, interfaceC4356);
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(InterfaceC4356<? super C5175> interfaceC4356) {
        return ((BottomSheetContentLayoutKt$BottomSheetContentLayout$resetGesture$1$1) create(interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (androidx.compose.animation.core.AbstractC0330.m1023(r7, 1.0f, r9, r10, r11, 4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r14.label
            r2 = 6
            r3 = 150(0x96, float:2.1E-43)
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1a
            if (r1 != r4) goto L14
            kotlin.AbstractC5184.m10206(r15)
            goto L5d
        L14:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r14)
            return r6
        L1a:
            kotlin.AbstractC5184.m10206(r15)
            r11 = r14
            goto L3d
        L1f:
            kotlin.AbstractC5184.m10206(r15)
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r7 = r14.$dragOffsetY
            java.lang.Float r8 = new java.lang.Float
            r15 = 0
            r8.<init>(r15)
            androidx.compose.animation.core.飘花落叶言子苏兰楪哲世 r9 = androidx.compose.animation.core.AbstractC0330.m1012(r3, r2, r6)
            r14.label = r5
            r10 = 0
            r11 = 0
            r13 = 12
            r12 = r14
            java.lang.Object r14 = androidx.compose.animation.core.C0331.m1028(r7, r8, r9, r10, r11, r12, r13)
            r11 = r12
            if (r14 != r0) goto L3d
            goto L5c
        L3d:
            androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r14 = r11.$dimAlpha
            androidx.compose.runtime.飘花落叶言子哲苏楪世兰 r14 = (androidx.compose.runtime.AbstractC1349) r14
            float r7 = r14.m2424()
            androidx.compose.animation.core.飘花落叶言子苏兰楪哲世 r9 = androidx.compose.animation.core.AbstractC0330.m1012(r3, r2, r6)
            androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r14 = r11.$dimAlpha
            top.yukonga.miuix.kmp.extra.飘花落叶言子楪世哲苏兰 r10 = new top.yukonga.miuix.kmp.extra.飘花落叶言子楪世哲苏兰
            r15 = 0
            r10.<init>(r14, r15)
            r11.label = r4
            r8 = 1065353216(0x3f800000, float:1.0)
            r12 = 4
            java.lang.Object r14 = androidx.compose.animation.core.AbstractC0330.m1023(r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto L5d
        L5c:
            return r0
        L5d:
            kotlin.飘花落叶言子楪兰苏哲世 r14 = kotlin.C5175.f14739
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContentLayout$resetGesture$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
