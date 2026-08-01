package androidx.compose.material3;

import androidx.compose.animation.core.C0331;
import androidx.compose.foundation.interaction.InterfaceC0582;
import androidx.compose.runtime.InterfaceC1395;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2$1", f = "Chip.kt", l = {2562, 2564}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class SelectableChipElevation$animateElevation$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0331 $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC0582 $interaction;
    final /* synthetic */ InterfaceC1395 $lastInteraction$delegate;
    final /* synthetic */ float $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableChipElevation$animateElevation$2$1(C0331 c0331, float f, boolean z, InterfaceC0582 interfaceC0582, InterfaceC1395 interfaceC1395, InterfaceC4356<? super SelectableChipElevation$animateElevation$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$animatable = c0331;
        this.$target = f;
        this.$enabled = z;
        this.$interaction = interfaceC0582;
        this.$lastInteraction$delegate = interfaceC1395;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new SelectableChipElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.$interaction, this.$lastInteraction$delegate, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SelectableChipElevation$animateElevation$2$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r6.m1030(r2, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (androidx.compose.material3.internal.AbstractC1127.m2007(r1, r3, r6, r4, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            r5 = 0
            return r5
        L14:
            kotlin.AbstractC5184.m10206(r6)
            goto L5e
        L18:
            kotlin.AbstractC5184.m10206(r6)
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r6 = r5.$animatable
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r6 = r6.f1125
            androidx.compose.runtime.飘花落叶言子哲苏兰世楪 r6 = (androidx.compose.runtime.AbstractC1347) r6
            java.lang.Object r6 = r6.getValue()
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪世兰哲苏 r6 = (p205.C7892) r6
            float r6 = r6.f21862
            float r1 = r5.$target
            boolean r6 = p205.C7892.m13290(r6, r1)
            if (r6 != 0) goto L65
            boolean r6 = r5.$enabled
            if (r6 != 0) goto L47
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r6 = r5.$animatable
            float r1 = r5.$target
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪世兰哲苏 r2 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世兰哲苏
            r2.<init>(r1)
            r5.label = r3
            java.lang.Object r6 = r6.m1030(r2, r5)
            if (r6 != r0) goto L5e
            goto L5d
        L47:
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r6 = r5.$lastInteraction$delegate
            java.lang.Object r6 = r6.getValue()
            androidx.compose.foundation.interaction.飘花落叶言子楪苏哲兰世 r6 = (androidx.compose.foundation.interaction.InterfaceC0582) r6
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r1 = r5.$animatable
            float r3 = r5.$target
            androidx.compose.foundation.interaction.飘花落叶言子楪苏哲兰世 r4 = r5.$interaction
            r5.label = r2
            java.lang.Object r6 = androidx.compose.material3.internal.AbstractC1127.m2007(r1, r3, r6, r4, r5)
            if (r6 != r0) goto L5e
        L5d:
            return r0
        L5e:
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r6 = r5.$lastInteraction$delegate
            androidx.compose.foundation.interaction.飘花落叶言子楪苏哲兰世 r5 = r5.$interaction
            r6.setValue(r5)
        L65:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SelectableChipElevation$animateElevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
