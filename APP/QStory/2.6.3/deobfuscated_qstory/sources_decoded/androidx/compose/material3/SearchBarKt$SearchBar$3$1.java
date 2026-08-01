package androidx.compose.material3;

import androidx.compose.animation.core.C0331;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.SearchBarKt$SearchBar$3$1", f = "SearchBar.kt", l = {559}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class SearchBarKt$SearchBar$3$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C0331 $animationProgress;
    final /* synthetic */ InterfaceC1395 $currentBackEvent;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ InterfaceC1397 $finalBackProgress;
    final /* synthetic */ InterfaceC1395 $firstBackEvent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$3$1(C0331 c0331, boolean z, InterfaceC1397 interfaceC1397, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC4357<? super SearchBarKt$SearchBar$3$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$animationProgress = c0331;
        this.$expanded = z;
        this.$finalBackProgress = interfaceC1397;
        this.$firstBackEvent = interfaceC1395;
        this.$currentBackEvent = interfaceC13952;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new SearchBarKt$SearchBar$3$1(this.$animationProgress, this.$expanded, this.$finalBackProgress, this.$firstBackEvent, this.$currentBackEvent, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SearchBarKt$SearchBar$3$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
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
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 != r3) goto Le
            kotlin.AbstractC5185.m10210(r13)
            goto L5d
        Le:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r12)
            return r2
        L14:
            kotlin.AbstractC5185.m10210(r13)
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r13 = r12.$animationProgress
            java.lang.Object r13 = r13.m1033()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            r1 = 0
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r13 <= 0) goto L3e
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r13 = r12.$animationProgress
            java.lang.Object r13 = r13.m1033()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L3e
            androidx.compose.animation.core.飘花落叶言子苏兰楪哲世 r13 = androidx.compose.material3.AbstractC1216.f3497
        L3c:
            r7 = r13
            goto L48
        L3e:
            boolean r13 = r12.$expanded
            if (r13 == 0) goto L45
            androidx.compose.animation.core.飘花落叶言子苏兰楪哲世 r13 = androidx.compose.material3.AbstractC1216.f3499
            goto L3c
        L45:
            androidx.compose.animation.core.飘花落叶言子苏兰楪哲世 r13 = androidx.compose.material3.AbstractC1216.f3498
            goto L3c
        L48:
            boolean r13 = r12.$expanded
            if (r13 == 0) goto L4d
            r1 = r4
        L4d:
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r13 = r12.$animationProgress
            java.lang.Object r13 = r13.m1033()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 != 0) goto L5f
        L5d:
            r10 = r12
            goto L74
        L5f:
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r5 = r12.$animationProgress
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r1)
            r12.label = r3
            r8 = 0
            r9 = 0
            r11 = 12
            r10 = r12
            java.lang.Object r12 = androidx.compose.animation.core.C0331.m1029(r5, r6, r7, r8, r9, r10, r11)
            if (r12 != r0) goto L74
            return r0
        L74:
            boolean r12 = r10.$expanded
            if (r12 != 0) goto L8b
            androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r12 = r10.$finalBackProgress
            r13 = 2143289344(0x7fc00000, float:NaN)
            androidx.compose.runtime.飘花落叶言子哲苏楪世兰 r12 = (androidx.compose.runtime.AbstractC1349) r12
            r12.m2435(r13)
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r12 = r10.$firstBackEvent
            r12.setValue(r2)
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r12 = r10.$currentBackEvent
            r12.setValue(r2)
        L8b:
            kotlin.飘花落叶言子楪兰苏哲世 r12 = kotlin.C5176.f14739
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt$SearchBar$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
