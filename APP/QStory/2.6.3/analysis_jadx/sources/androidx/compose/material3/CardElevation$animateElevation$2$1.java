package androidx.compose.material3;

import androidx.compose.animation.core.C0331;
import androidx.compose.foundation.interaction.InterfaceC0582;
import androidx.compose.runtime.AbstractC1347;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p205.C7893;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", l = {727, 737}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class CardElevation$animateElevation$2$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C0331 $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC0582 $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ AbstractC1174 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardElevation$animateElevation$2$1(C0331 c0331, float f, boolean z, AbstractC1174 abstractC1174, InterfaceC0582 interfaceC0582, InterfaceC4357<? super CardElevation$animateElevation$2$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$animatable = c0331;
        this.$target = f;
        this.$enabled = z;
        this.$interaction = interfaceC0582;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new CardElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, null, this.$interaction, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CardElevation$animateElevation$2$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            if (!C7893.m13318(((C7893) ((AbstractC1347) this.$animatable.f1125).getValue()).f21859, this.$target)) {
                boolean z = this.$enabled;
                C0331 c0331 = this.$animatable;
                if (z) {
                    float f = ((C7893) ((AbstractC1347) c0331.f1125).getValue()).f21859;
                    throw null;
                }
                C7893 c7893 = new C7893(this.$target);
                this.label = 1;
                if (c0331.m1031(c7893, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
