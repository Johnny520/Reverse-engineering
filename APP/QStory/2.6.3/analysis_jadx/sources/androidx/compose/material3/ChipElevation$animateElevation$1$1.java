package androidx.compose.material3;

import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.foundation.interaction.InterfaceC0582;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.C5287;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.ChipElevation$animateElevation$1$1", f = "Chip.kt", l = {2366}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ChipElevation$animateElevation$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0579 $interactionSource;
    final /* synthetic */ SnapshotStateList<InterfaceC0582> $interactions;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipElevation$animateElevation$1$1(InterfaceC0579 interfaceC0579, SnapshotStateList<InterfaceC0582> snapshotStateList, InterfaceC4357<? super ChipElevation$animateElevation$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$interactionSource = interfaceC0579;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ChipElevation$animateElevation$1$1(this.$interactionSource, this.$interactions, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ChipElevation$animateElevation$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C5287 c5287 = ((C0573) this.$interactionSource).f1625;
            C1176 c1176 = new C1176(this.$interactions, 2);
            this.label = 1;
            c5287.getClass();
            if (C5287.m10315(c5287, c1176, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
