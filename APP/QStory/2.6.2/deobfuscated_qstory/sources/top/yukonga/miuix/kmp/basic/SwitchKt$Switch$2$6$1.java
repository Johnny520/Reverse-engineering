package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.interaction.C0569;
import androidx.compose.foundation.interaction.C0570;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p108.C7314;
import p108.InterfaceC7316;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.SwitchKt$Switch$2$6$1", f = "Switch.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;F)V"}, k = 3, mv = {2, 3, 0})
final class SwitchKt$Switch$2$6$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ boolean $checked;
    final /* synthetic */ InterfaceC1395 $currentDragInteraction$delegate;
    final /* synthetic */ InterfaceC1333 $currentOnCheckedChange$delegate;
    final /* synthetic */ InterfaceC1397 $dragOffset$delegate;
    final /* synthetic */ InterfaceC7316 $hapticFeedback;
    final /* synthetic */ InterfaceC1395 $hasVibratedOnce$delegate;
    final /* synthetic */ InterfaceC0580 $interactionSource;
    final /* synthetic */ InterfaceC1397 $rawDragOffset$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$2$6$1(boolean z, InterfaceC7316 interfaceC7316, InterfaceC1397 interfaceC1397, InterfaceC1333 interfaceC1333, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC0580 interfaceC0580, InterfaceC1397 interfaceC13972, InterfaceC4356<? super SwitchKt$Switch$2$6$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$checked = z;
        this.$hapticFeedback = interfaceC7316;
        this.$dragOffset$delegate = interfaceC1397;
        this.$currentOnCheckedChange$delegate = interfaceC1333;
        this.$hasVibratedOnce$delegate = interfaceC1395;
        this.$currentDragInteraction$delegate = interfaceC13952;
        this.$interactionSource = interfaceC0580;
        this.$rawDragOffset$delegate = interfaceC13972;
    }

    public final Object invoke(InterfaceC5400 interfaceC5400, float f, InterfaceC4356<? super C5175> interfaceC4356) {
        return new SwitchKt$Switch$2$6$1(this.$checked, this.$hapticFeedback, this.$dragOffset$delegate, this.$currentOnCheckedChange$delegate, this.$hasVibratedOnce$delegate, this.$currentDragInteraction$delegate, this.$interactionSource, this.$rawDragOffset$delegate, interfaceC4356).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6557 interfaceC6557;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        if (Math.abs(((AbstractC1349) this.$dragOffset$delegate).m2424()) > 10.5f && (interfaceC6557 = (InterfaceC6557) this.$currentOnCheckedChange$delegate.getValue()) != null) {
            interfaceC6557.invoke(Boolean.valueOf(!this.$checked));
        }
        if (!((Boolean) this.$hasVibratedOnce$delegate.getValue()).booleanValue() && Math.abs(((AbstractC1349) this.$dragOffset$delegate).m2424()) >= 1.0f) {
            if ((this.$checked && ((AbstractC1349) this.$dragOffset$delegate).m2424() <= -11.0f) || (!this.$checked && ((AbstractC1349) this.$dragOffset$delegate).m2424() <= 10.0f)) {
                ((C7314) this.$hapticFeedback).m12482(22);
            } else if ((this.$checked && ((AbstractC1349) this.$dragOffset$delegate).m2424() >= -10.0f) || (!this.$checked && ((AbstractC1349) this.$dragOffset$delegate).m2424() >= 11.0f)) {
                ((C7314) this.$hapticFeedback).m12482(21);
            }
        }
        C0570 c0570 = (C0570) this.$currentDragInteraction$delegate.getValue();
        if (c0570 != null) {
            ((C0573) this.$interactionSource).m1343(new C0569(c0570));
        }
        ((AbstractC1349) this.$dragOffset$delegate).m2425(0.0f);
        ((AbstractC1349) this.$rawDragOffset$delegate).m2425(0.0f);
        return C5175.f14739;
    }

    @Override // p052.InterfaceC6550
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC5400) obj, ((Number) obj2).floatValue(), (InterfaceC4356<? super C5175>) obj3);
    }
}
