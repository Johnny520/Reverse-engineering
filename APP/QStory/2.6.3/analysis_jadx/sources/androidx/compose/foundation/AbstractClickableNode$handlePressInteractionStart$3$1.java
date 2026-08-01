package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.InterfaceC0580;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$3$1", f = "Clickable.kt", l = {2112, 2113}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class AbstractClickableNode$handlePressInteractionStart$3$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ boolean $indirectPointer;
    final /* synthetic */ InterfaceC0580 $interactionSource;
    final /* synthetic */ C0575 $press;
    int label;
    final /* synthetic */ AbstractC1054 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionStart$3$1(InterfaceC0580 interfaceC0580, C0575 c0575, boolean z, AbstractC1054 abstractC1054, InterfaceC4357<? super AbstractClickableNode$handlePressInteractionStart$3$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$interactionSource = interfaceC0580;
        this.$press = c0575;
        this.$indirectPointer = z;
        this.this$0 = abstractC1054;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new AbstractClickableNode$handlePressInteractionStart$3$1(this.$interactionSource, this.$press, this.$indirectPointer, this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AbstractClickableNode$handlePressInteractionStart$3$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (((androidx.compose.foundation.interaction.C0573) r7).m1354(r1, r6) == r0) goto L15;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            kotlin.AbstractC5185.m10210(r7)
            goto L38
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            r6 = 0
            return r6
        L17:
            kotlin.AbstractC5185.m10210(r7)
            goto L29
        L1b:
            kotlin.AbstractC5185.m10210(r7)
            long r4 = androidx.compose.foundation.AbstractC1032.f3029
            r6.label = r3
            java.lang.Object r7 = kotlinx.coroutines.AbstractC5399.m10499(r4, r6)
            if (r7 != r0) goto L29
            goto L37
        L29:
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r7 = r6.$interactionSource
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r1 = r6.$press
            r6.label = r2
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r7 = (androidx.compose.foundation.interaction.C0573) r7
            java.lang.Object r7 = r7.m1354(r1, r6)
            if (r7 != r0) goto L38
        L37:
            return r0
        L38:
            boolean r7 = r6.$indirectPointer
            androidx.compose.foundation.飘花落叶言子楪世苏兰哲 r0 = r6.this$0
            if (r7 == 0) goto L43
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r6 = r6.$press
            r0.f3114 = r6
            goto L47
        L43:
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r6 = r6.$press
            r0.f3115 = r6
        L47:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
