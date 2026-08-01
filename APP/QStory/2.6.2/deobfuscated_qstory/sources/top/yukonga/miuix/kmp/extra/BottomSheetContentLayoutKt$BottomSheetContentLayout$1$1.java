package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C0331;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContentLayout$1$1", f = "BottomSheetContentLayout.kt", l = {139, 140, 148, 151}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class BottomSheetContentLayoutKt$BottomSheetContentLayout$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0331 $animationProgress;
    final /* synthetic */ InterfaceC1333 $currentOnDismissFinished$delegate;
    final /* synthetic */ C0331 $dragOffsetY;
    final /* synthetic */ InterfaceC1395 $internalVisible;
    final /* synthetic */ boolean $show;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetContentLayoutKt$BottomSheetContentLayout$1$1(boolean z, InterfaceC1395 interfaceC1395, C0331 c0331, C0331 c03312, InterfaceC1333 interfaceC1333, InterfaceC4356<? super BottomSheetContentLayoutKt$BottomSheetContentLayout$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$show = z;
        this.$internalVisible = interfaceC1395;
        this.$dragOffsetY = c0331;
        this.$animationProgress = c03312;
        this.$currentOnDismissFinished$delegate = interfaceC1333;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new BottomSheetContentLayoutKt$BottomSheetContentLayout$1$1(this.$show, this.$internalVisible, this.$dragOffsetY, this.$animationProgress, this.$currentOnDismissFinished$delegate, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((BottomSheetContentLayoutKt$BottomSheetContentLayout$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        if (r0.m1030(r1, r12) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        if (androidx.compose.animation.core.C0331.m1028(r0, r4, r2, null, null, r12, 12) == r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r12.label
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5175.f14739
            r1 = 1052938076(0x3ec28f5c, float:0.38)
            r2 = 1063675494(0x3f666666, float:0.9)
            r3 = 4
            r4 = 3
            r6 = 2
            r9 = 1
            if (r0 == 0) goto L2e
            if (r0 == r9) goto L2a
            if (r0 == r6) goto L26
            if (r0 == r4) goto L1a
            if (r0 != r3) goto L1f
        L1a:
            kotlin.AbstractC5184.m10206(r13)
            goto Laf
        L1f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r0)
            r0 = 0
            return r0
        L26:
            kotlin.AbstractC5184.m10206(r13)
            return r8
        L2a:
            kotlin.AbstractC5184.m10206(r13)
            goto L4d
        L2e:
            kotlin.AbstractC5184.m10206(r13)
            boolean r0 = r12.$show
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r10 = r12.$internalVisible
            r11 = 0
            if (r0 == 0) goto L69
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.setValue(r0)
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r0 = r12.$dragOffsetY
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r11)
            r12.label = r9
            java.lang.Object r0 = r0.m1030(r3, r12)
            if (r0 != r7) goto L4d
            goto Lae
        L4d:
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r0 = r12.$animationProgress
            java.lang.Float r3 = new java.lang.Float
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4)
            androidx.compose.animation.core.飘花落叶言子世兰苏楪哲 r2 = p340.AbstractC8815.m14460(r2, r1)
            r12.label = r6
            r1 = r3
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r12
            java.lang.Object r0 = androidx.compose.animation.core.C0331.m1028(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto Lc3
            goto Lae
        L69:
            java.lang.Object r0 = r10.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L76
            goto Lc3
        L76:
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r0 = r12.$dragOffsetY
            java.lang.Object r0 = r0.m1032()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            r6 = r0
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r0 = r12.$animationProgress
            if (r6 <= 0) goto L97
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r11)
            r12.label = r4
            java.lang.Object r0 = r0.m1030(r1, r12)
            if (r0 != r7) goto Laf
            goto Lae
        L97:
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r11)
            androidx.compose.animation.core.飘花落叶言子世兰苏楪哲 r2 = p340.AbstractC8815.m14460(r2, r1)
            r12.label = r3
            r3 = 0
            r1 = r4
            r4 = 0
            r6 = 12
            r5 = r12
            java.lang.Object r0 = androidx.compose.animation.core.C0331.m1028(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto Laf
        Lae:
            return r7
        Laf:
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r0 = r12.$internalVisible
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            androidx.compose.runtime.飘花落叶言子哲兰世楪苏 r0 = r12.$currentOnDismissFinished$delegate
            java.lang.Object r0 = r0.getValue()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r0 = (p052.InterfaceC6542) r0
            if (r0 == 0) goto Lc3
            r0.invoke()
        Lc3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContentLayout$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
