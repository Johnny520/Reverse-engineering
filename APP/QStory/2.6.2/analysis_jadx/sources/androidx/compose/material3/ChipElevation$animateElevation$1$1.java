package androidx.compose.material3;

import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.foundation.interaction.InterfaceC0582;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.C5286;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.ChipElevation$animateElevation$1$1", f = "Chip.kt", l = {2366}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ChipElevation$animateElevation$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC0579 $interactionSource;
    final /* synthetic */ SnapshotStateList<InterfaceC0582> $interactions;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipElevation$animateElevation$1$1(InterfaceC0579 interfaceC0579, SnapshotStateList<InterfaceC0582> snapshotStateList, InterfaceC4356<? super ChipElevation$animateElevation$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$interactionSource = interfaceC0579;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ChipElevation$animateElevation$1$1(this.$interactionSource, this.$interactions, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ChipElevation$animateElevation$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C5286 c5286 = ((C0573) this.$interactionSource).f1624;
            C1176 c1176 = new C1176(this.$interactions, 2);
            this.label = 1;
            c5286.getClass();
            if (C5286.m10311(c5286, c1176, this) == coroutineSingletons) {
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
