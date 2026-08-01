package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.foundation.interaction.InterfaceC0582;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5397;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {322}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class FocusableNode$emitWithFallback$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5397 $handler;
    final /* synthetic */ InterfaceC0582 $interaction;
    final /* synthetic */ InterfaceC0580 $this_emitWithFallback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$emitWithFallback$1(InterfaceC0580 interfaceC0580, InterfaceC0582 interfaceC0582, InterfaceC5397 interfaceC5397, InterfaceC4356<? super FocusableNode$emitWithFallback$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_emitWithFallback = interfaceC0580;
        this.$interaction = interfaceC0582;
        this.$handler = interfaceC5397;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new FocusableNode$emitWithFallback$1(this.$this_emitWithFallback, this.$interaction, this.$handler, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((FocusableNode$emitWithFallback$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC0580 interfaceC0580 = this.$this_emitWithFallback;
            InterfaceC0582 interfaceC0582 = this.$interaction;
            this.label = 1;
            if (((C0573) interfaceC0580).m1344(interfaceC0582, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        InterfaceC5397 interfaceC5397 = this.$handler;
        if (interfaceC5397 != null) {
            interfaceC5397.dispose();
        }
        return C5175.f14739;
    }
}
