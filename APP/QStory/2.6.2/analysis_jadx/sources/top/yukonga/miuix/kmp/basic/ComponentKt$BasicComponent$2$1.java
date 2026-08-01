package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.interaction.InterfaceC0580;
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
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.ComponentKt$BasicComponent$2$1", f = "Component.kt", l = {142, 145, 147}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class ComponentKt$BasicComponent$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1395 $holdDown;
    final /* synthetic */ boolean $holdDownState;
    final /* synthetic */ InterfaceC0580 $interactionSource;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentKt$BasicComponent$2$1(boolean z, InterfaceC1395 interfaceC1395, InterfaceC0580 interfaceC0580, InterfaceC4356<? super ComponentKt$BasicComponent$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$holdDownState = z;
        this.$holdDown = interfaceC1395;
        this.$interactionSource = interfaceC0580;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invokeSuspend$releaseHoldDown(androidx.compose.runtime.InterfaceC1395 r5, androidx.compose.foundation.interaction.InterfaceC0580 r6, kotlin.coroutines.InterfaceC4356<? super kotlin.C5175> r7) {
        /*
            boolean r0 = r7 instanceof top.yukonga.miuix.kmp.basic.ComponentKt$BasicComponent$2$1$releaseHoldDown$1
            if (r0 == 0) goto L13
            r0 = r7
            top.yukonga.miuix.kmp.basic.ComponentKt$BasicComponent$2$1$releaseHoldDown$1 r0 = (top.yukonga.miuix.kmp.basic.ComponentKt$BasicComponent$2$1$releaseHoldDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            top.yukonga.miuix.kmp.basic.ComponentKt$BasicComponent$2$1$releaseHoldDown$1 r0 = new top.yukonga.miuix.kmp.basic.ComponentKt$BasicComponent$2$1$releaseHoldDown$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.L$2
            top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏哲兰 r5 = (top.yukonga.miuix.kmp.interfaces.C6041) r5
            java.lang.Object r5 = r0.L$1
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r5 = (androidx.compose.foundation.interaction.InterfaceC0580) r5
            java.lang.Object r5 = r0.L$0
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r5 = (androidx.compose.runtime.InterfaceC1395) r5
            kotlin.AbstractC5184.m10206(r7)
            goto L5e
        L34:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r4
        L3a:
            kotlin.AbstractC5184.m10206(r7)
            java.lang.Object r7 = r5.getValue()
            top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏哲兰 r7 = (top.yukonga.miuix.kmp.interfaces.C6041) r7
            if (r7 == 0) goto L61
            top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏兰哲 r2 = new top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏兰哲
            r2.<init>(r7)
            r0.L$0 = r5
            r0.L$1 = r4
            r0.L$2 = r4
            r7 = 0
            r0.I$0 = r7
            r0.label = r3
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r6 = (androidx.compose.foundation.interaction.C0573) r6
            java.lang.Object r6 = r6.m1344(r2, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r5.setValue(r4)
        L61:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.basic.ComponentKt$BasicComponent$2$1.invokeSuspend$releaseHoldDown(androidx.compose.runtime.飘花落叶言子苏楪兰世哲, androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ComponentKt$BasicComponent$2$1(this.$holdDownState, this.$holdDown, this.$interactionSource, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ComponentKt$BasicComponent$2$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (((androidx.compose.foundation.interaction.C0573) r1).m1344(r7, r6) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (invokeSuspend$releaseHoldDown(r1, r7, r6) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            goto L1b
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r2
        L17:
            java.lang.Object r6 = r6.L$0
            top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏哲兰 r6 = (top.yukonga.miuix.kmp.interfaces.C6041) r6
        L1b:
            kotlin.AbstractC5184.m10206(r7)
            goto L5b
        L1f:
            kotlin.AbstractC5184.m10206(r7)
            goto L37
        L23:
            kotlin.AbstractC5184.m10206(r7)
            boolean r7 = r6.$holdDownState
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r1 = r6.$holdDown
            if (r7 == 0) goto L50
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r7 = r6.$interactionSource
            r6.label = r5
            java.lang.Object r7 = invokeSuspend$releaseHoldDown(r1, r7, r6)
            if (r7 != r0) goto L37
            goto L5a
        L37:
            top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏哲兰 r7 = new top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏哲兰
            r7.<init>()
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r1 = r6.$holdDown
            r1.setValue(r7)
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r1 = r6.$interactionSource
            r6.L$0 = r2
            r6.label = r4
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r1 = (androidx.compose.foundation.interaction.C0573) r1
            java.lang.Object r6 = r1.m1344(r7, r6)
            if (r6 != r0) goto L5b
            goto L5a
        L50:
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r7 = r6.$interactionSource
            r6.label = r3
            java.lang.Object r6 = invokeSuspend$releaseHoldDown(r1, r7, r6)
            if (r6 != r0) goto L5b
        L5a:
            return r0
        L5b:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.basic.ComponentKt$BasicComponent$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
