package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C0331;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1397;
import androidx.navigationevent.compose.AbstractC2437;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$3$3$1", f = "DialogContentLayout.kt", l = {188}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class DialogContentLayoutKt$DialogContentLayout$3$3$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0331 $backProgress;
    final /* synthetic */ InterfaceC1397 $dimAlpha;
    final /* synthetic */ AbstractC2437 $navigationEventState;
    float F$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogContentLayoutKt$DialogContentLayout$3$3$1(AbstractC2437 abstractC2437, C0331 c0331, InterfaceC1397 interfaceC1397, InterfaceC4356<? super DialogContentLayoutKt$DialogContentLayout$3$3$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$navigationEventState = abstractC2437;
        this.$backProgress = c0331;
        this.$dimAlpha = interfaceC1397;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new DialogContentLayoutKt$DialogContentLayout$3$3$1(this.$navigationEventState, this.$backProgress, this.$dimAlpha, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DialogContentLayoutKt$DialogContentLayout$3$3$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            this.$navigationEventState.getClass();
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        float f = this.F$0;
        AbstractC5184.m10206(obj);
        ((AbstractC1349) this.$dimAlpha).m2425(1.0f - f);
        return C5175.f14739;
    }
}
