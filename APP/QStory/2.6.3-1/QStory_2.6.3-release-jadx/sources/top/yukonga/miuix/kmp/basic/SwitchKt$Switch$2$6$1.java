package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.interaction.C1410;
import androidx.compose.foundation.interaction.C1411;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2232;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p124.C8144;
import p124.InterfaceC8146;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.SwitchKt$Switch$2$6$1", m556f = "Switch.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;F)V"}, m152k = 3, m153mv = {2, 3, 0})
final class SwitchKt$Switch$2$6$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ boolean $checked;
    final /* synthetic */ InterfaceC2230 $currentDragInteraction$delegate;
    final /* synthetic */ InterfaceC2168 $currentOnCheckedChange$delegate;
    final /* synthetic */ InterfaceC2232 $dragOffset$delegate;
    final /* synthetic */ InterfaceC8146 $hapticFeedback;
    final /* synthetic */ InterfaceC2230 $hasVibratedOnce$delegate;
    final /* synthetic */ InterfaceC1421 $interactionSource;
    final /* synthetic */ InterfaceC2232 $rawDragOffset$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$2$6$1(boolean z, InterfaceC8146 interfaceC8146, InterfaceC2232 interfaceC2232, InterfaceC2168 interfaceC2168, InterfaceC2230 interfaceC2230, InterfaceC2230 interfaceC22302, InterfaceC1421 interfaceC1421, InterfaceC2232 interfaceC22322, InterfaceC5189<? super SwitchKt$Switch$2$6$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$checked = z;
        this.$hapticFeedback = interfaceC8146;
        this.$dragOffset$delegate = interfaceC2232;
        this.$currentOnCheckedChange$delegate = interfaceC2168;
        this.$hasVibratedOnce$delegate = interfaceC2230;
        this.$currentDragInteraction$delegate = interfaceC22302;
        this.$interactionSource = interfaceC1421;
        this.$rawDragOffset$delegate = interfaceC22322;
    }

    public final Object invoke(InterfaceC6233 interfaceC6233, float f, InterfaceC5189<? super C6008> interfaceC5189) {
        return new SwitchKt$Switch$2$6$1(this.$checked, this.$hapticFeedback, this.$dragOffset$delegate, this.$currentOnCheckedChange$delegate, this.$hasVibratedOnce$delegate, this.$currentDragInteraction$delegate, this.$interactionSource, this.$rawDragOffset$delegate, interfaceC5189).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC7387 interfaceC7387;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        if (Math.abs(((AbstractC2184) this.$dragOffset$delegate).m2994()) > 10.5f && (interfaceC7387 = (InterfaceC7387) this.$currentOnCheckedChange$delegate.getValue()) != null) {
            interfaceC7387.invoke(Boolean.valueOf(!this.$checked));
        }
        if (!((Boolean) this.$hasVibratedOnce$delegate.getValue()).booleanValue() && Math.abs(((AbstractC2184) this.$dragOffset$delegate).m2994()) >= 1.0f) {
            if ((this.$checked && ((AbstractC2184) this.$dragOffset$delegate).m2994() <= -11.0f) || (!this.$checked && ((AbstractC2184) this.$dragOffset$delegate).m2994() <= 10.0f)) {
                ((C8144) this.$hapticFeedback).m13068(22);
            } else if ((this.$checked && ((AbstractC2184) this.$dragOffset$delegate).m2994() >= -10.0f) || (!this.$checked && ((AbstractC2184) this.$dragOffset$delegate).m2994() >= 11.0f)) {
                ((C8144) this.$hapticFeedback).m13068(21);
            }
        }
        C1411 c1411 = (C1411) this.$currentDragInteraction$delegate.getValue();
        if (c1411 != null) {
            ((C1414) this.$interactionSource).m1913(new C1410(c1411));
        }
        ((AbstractC2184) this.$dragOffset$delegate).m2995(0.0f);
        ((AbstractC2184) this.$rawDragOffset$delegate).m2995(0.0f);
        return C6008.f15084;
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC6233) obj, ((Number) obj2).floatValue(), (InterfaceC5189<? super C6008>) obj3);
    }
}
