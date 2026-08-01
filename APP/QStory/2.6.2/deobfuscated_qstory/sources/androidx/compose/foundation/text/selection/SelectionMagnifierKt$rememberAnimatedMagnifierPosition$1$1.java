package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.C0348;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1333;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.C5283;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {83}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0331 $animatable;
    final /* synthetic */ InterfaceC1333 $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(InterfaceC1333 interfaceC1333, C0331 c0331, InterfaceC4356<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$targetValue$delegate = interfaceC1333;
        this.$animatable = c0331;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7328 invokeSuspend$lambda$0(InterfaceC1333 interfaceC1333) {
        C0348 c0348 = AbstractC0900.f2550;
        return new C7328(((C7328) interfaceC1333.getValue()).f19546);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(this.$targetValue$delegate, this.$animatable, interfaceC4356);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
            C5283 c5283M2461 = AbstractC1367.m2461(new C0902(this.$targetValue$delegate, 0));
            C0901 c0901 = new C0901(this.$animatable, interfaceC5400);
            this.label = 1;
            if (c5283M2461.mo8463(c0901, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
