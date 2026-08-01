package androidx.compose.material3;

import androidx.compose.animation.core.C1177;
import androidx.compose.foundation.interaction.InterfaceC1423;
import androidx.compose.runtime.AbstractC2182;
import com.google.protobuf.DescriptorProtos$Edition;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p221.C8722;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", m556f = "Button.kt", m557l = {DescriptorProtos$Edition.EDITION_PROTO2_VALUE, 1007}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ButtonElevation$animateElevation$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1177 $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC1423 $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ AbstractC2010 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$2$1(C1177 c1177, float f, boolean z, AbstractC2010 abstractC2010, InterfaceC1423 interfaceC1423, InterfaceC5189<? super ButtonElevation$animateElevation$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$animatable = c1177;
        this.$target = f;
        this.$enabled = z;
        this.$interaction = interfaceC1423;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ButtonElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, null, this.$interaction, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ButtonElevation$animateElevation$2$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (!C8722.m13877(((C8722) ((AbstractC2182) this.$animatable.f1470).getValue()).f22204, this.$target)) {
                boolean z = this.$enabled;
                C1177 c1177 = this.$animatable;
                if (z) {
                    float f = ((C8722) ((AbstractC2182) c1177.f1470).getValue()).f22204;
                    throw null;
                }
                C8722 c8722 = new C8722(this.$target);
                this.label = 1;
                if (c1177.m1591(c8722, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
