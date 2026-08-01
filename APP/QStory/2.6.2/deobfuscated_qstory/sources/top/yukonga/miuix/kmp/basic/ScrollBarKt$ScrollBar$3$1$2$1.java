package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$3$1$2$1", f = "ScrollBar.kt", l = {308, 309}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class ScrollBarKt$ScrollBar$3$1$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1397 $opacity$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollBarKt$ScrollBar$3$1$2$1(InterfaceC1397 interfaceC1397, InterfaceC4356<? super ScrollBarKt$ScrollBar$3$1$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$opacity$delegate = interfaceC1397;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(InterfaceC1397 interfaceC1397, float f, float f2) {
        ((AbstractC1349) interfaceC1397).m2425(f);
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ScrollBarKt$ScrollBar$3$1$2$1(this.$opacity$delegate, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ScrollBarKt$ScrollBar$3$1$2$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (androidx.compose.animation.core.AbstractC0330.m1023(1.0f, 0.0f, r7, r8, r11, 4) == r0) goto L15;
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
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            kotlin.AbstractC5184.m10206(r12)
            goto L45
        L11:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            return r2
        L17:
            kotlin.AbstractC5184.m10206(r12)
            goto L29
        L1b:
            kotlin.AbstractC5184.m10206(r12)
            r11.label = r4
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r12 = kotlinx.coroutines.AbstractC5398.m10495(r5, r11)
            if (r12 != r0) goto L29
            goto L44
        L29:
            r12 = 500(0x1f4, float:7.0E-43)
            r1 = 6
            androidx.compose.animation.core.飘花落叶言子苏兰楪哲世 r7 = androidx.compose.animation.core.AbstractC0330.m1012(r12, r1, r2)
            androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r12 = r11.$opacity$delegate
            top.yukonga.miuix.kmp.basic.飘花落叶言子世苏兰楪哲 r8 = new top.yukonga.miuix.kmp.basic.飘花落叶言子世苏兰楪哲
            r8.<init>(r12, r4)
            r11.label = r3
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r10 = 4
            r9 = r11
            java.lang.Object r11 = androidx.compose.animation.core.AbstractC0330.m1023(r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L45
        L44:
            return r0
        L45:
            kotlin.飘花落叶言子楪兰苏哲世 r11 = kotlin.C5175.f14739
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$3$1$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
