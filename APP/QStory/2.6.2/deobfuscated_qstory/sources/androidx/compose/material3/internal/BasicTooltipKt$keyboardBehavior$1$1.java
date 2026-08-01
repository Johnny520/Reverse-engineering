package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.InterfaceC1165;
import androidx.compose.ui.focus.InterfaceC1456;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1", f = "BasicTooltip.kt", l = {301}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class BasicTooltipKt$keyboardBehavior$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1456 $it;
    final /* synthetic */ InterfaceC1165 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$keyboardBehavior$1$1(InterfaceC1456 interfaceC1456, InterfaceC1165 interfaceC1165, InterfaceC4356<? super BasicTooltipKt$keyboardBehavior$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$it = interfaceC1456;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new BasicTooltipKt$keyboardBehavior$1$1(this.$it, null, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((BasicTooltipKt$keyboardBehavior$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5184.m10206(obj);
            throw null;
        }
        AbstractC5184.m10206(obj);
        if (!this.$it.isFocused()) {
            throw null;
        }
        MutatePriority mutatePriority = MutatePriority.Default;
        this.label = 1;
        throw null;
    }
}
