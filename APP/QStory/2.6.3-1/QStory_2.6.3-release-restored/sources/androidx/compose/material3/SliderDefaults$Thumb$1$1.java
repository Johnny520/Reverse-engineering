package androidx.compose.material3;

import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.foundation.interaction.InterfaceC1423;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.C6119;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.SliderDefaults$Thumb$1$1", m556f = "Slider.kt", m557l = {1216}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class SliderDefaults$Thumb$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1421 $interactionSource;
    final /* synthetic */ SnapshotStateList<InterfaceC1423> $interactions;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Thumb$1$1(InterfaceC1421 interfaceC1421, SnapshotStateList<InterfaceC1423> snapshotStateList, InterfaceC5189<? super SliderDefaults$Thumb$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$interactionSource = interfaceC1421;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new SliderDefaults$Thumb$1$1(this.$interactionSource, this.$interactions, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SliderDefaults$Thumb$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C6119 c6119 = ((C1414) this.$interactionSource).f1970;
            C2011 c2011 = new C2011(this.$interactions, 4);
            this.label = 1;
            c6119.getClass();
            if (C6119.m10874(c6119, c2011, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
