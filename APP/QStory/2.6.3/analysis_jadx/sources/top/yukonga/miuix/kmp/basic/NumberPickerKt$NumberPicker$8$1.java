package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C0331;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p112.C7329;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.NumberPickerKt$NumberPicker$8$1", f = "NumberPicker.kt", l = {180, 183}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class NumberPickerKt$NumberPicker$8$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC1397 $dragOffset$delegate;
    final /* synthetic */ C0331 $flingAnimatable;
    final /* synthetic */ InterfaceC1395 $isDragging$delegate;
    final /* synthetic */ InterfaceC1395 $isUserScrolling$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberPickerKt$NumberPicker$8$1(C0331 c0331, InterfaceC1397 interfaceC1397, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC4357<? super NumberPickerKt$NumberPicker$8$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$flingAnimatable = c0331;
        this.$dragOffset$delegate = interfaceC1397;
        this.$isDragging$delegate = interfaceC1395;
        this.$isUserScrolling$delegate = interfaceC13952;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11370invoked4ec7I((InterfaceC5401) obj, ((C7329) obj2).f19541, (InterfaceC4357) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11370invoked4ec7I(InterfaceC5401 interfaceC5401, long j, InterfaceC4357<? super C5176> interfaceC4357) {
        return new NumberPickerKt$NumberPicker$8$1(this.$flingAnimatable, this.$dragOffset$delegate, this.$isDragging$delegate, this.$isUserScrolling$delegate, interfaceC4357).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r5.m1031(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            kotlin.AbstractC5185.m10210(r5)
            goto L52
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            r4 = 0
            return r4
        L17:
            kotlin.AbstractC5185.m10210(r5)
            goto L29
        L1b:
            kotlin.AbstractC5185.m10210(r5)
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r5 = r4.$flingAnimatable
            r4.label = r3
            java.lang.Object r5 = r5.m1036(r4)
            if (r5 != r0) goto L29
            goto L51
        L29:
            androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r5 = r4.$dragOffset$delegate
            androidx.compose.runtime.飘花落叶言子哲苏楪世兰 r5 = (androidx.compose.runtime.AbstractC1349) r5
            float r1 = r5.m2434()
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r3 = r4.$flingAnimatable
            java.lang.Object r3 = r3.m1033()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = r3 + r1
            r5.m2435(r3)
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r5 = r4.$flingAnimatable
            java.lang.Float r1 = new java.lang.Float
            r3 = 0
            r1.<init>(r3)
            r4.label = r2
            java.lang.Object r5 = r5.m1031(r1, r4)
            if (r5 != r0) goto L52
        L51:
            return r0
        L52:
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r5 = r4.$isDragging$delegate
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.setValue(r0)
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r4 = r4.$isUserScrolling$delegate
            r4.setValue(r0)
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.basic.NumberPickerKt$NumberPicker$8$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
