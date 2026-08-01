package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.interaction.C0569;
import androidx.compose.foundation.interaction.C0570;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import p108.C7315;
import p108.InterfaceC7317;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.SwitchKt$Switch$2$6$1", f = "Switch.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;F)V"}, k = 3, mv = {2, 3, 0})
final class SwitchKt$Switch$2$6$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ boolean $checked;
    final /* synthetic */ InterfaceC1395 $currentDragInteraction$delegate;
    final /* synthetic */ InterfaceC1333 $currentOnCheckedChange$delegate;
    final /* synthetic */ InterfaceC1397 $dragOffset$delegate;
    final /* synthetic */ InterfaceC7317 $hapticFeedback;
    final /* synthetic */ InterfaceC1395 $hasVibratedOnce$delegate;
    final /* synthetic */ InterfaceC0580 $interactionSource;
    final /* synthetic */ InterfaceC1397 $rawDragOffset$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$2$6$1(boolean z, InterfaceC7317 interfaceC7317, InterfaceC1397 interfaceC1397, InterfaceC1333 interfaceC1333, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC0580 interfaceC0580, InterfaceC1397 interfaceC13972, InterfaceC4357<? super SwitchKt$Switch$2$6$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$checked = z;
        this.$hapticFeedback = interfaceC7317;
        this.$dragOffset$delegate = interfaceC1397;
        this.$currentOnCheckedChange$delegate = interfaceC1333;
        this.$hasVibratedOnce$delegate = interfaceC1395;
        this.$currentDragInteraction$delegate = interfaceC13952;
        this.$interactionSource = interfaceC0580;
        this.$rawDragOffset$delegate = interfaceC13972;
    }

    public final Object invoke(InterfaceC5401 interfaceC5401, float f, InterfaceC4357<? super C5176> interfaceC4357) {
        return new SwitchKt$Switch$2$6$1(this.$checked, this.$hapticFeedback, this.$dragOffset$delegate, this.$currentOnCheckedChange$delegate, this.$hasVibratedOnce$delegate, this.$currentDragInteraction$delegate, this.$interactionSource, this.$rawDragOffset$delegate, interfaceC4357).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6558 interfaceC6558;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        if (Math.abs(((AbstractC1349) this.$dragOffset$delegate).m2434()) > 10.5f && (interfaceC6558 = (InterfaceC6558) this.$currentOnCheckedChange$delegate.getValue()) != null) {
            interfaceC6558.invoke(Boolean.valueOf(!this.$checked));
        }
        if (!((Boolean) this.$hasVibratedOnce$delegate.getValue()).booleanValue() && Math.abs(((AbstractC1349) this.$dragOffset$delegate).m2434()) >= 1.0f) {
            if ((this.$checked && ((AbstractC1349) this.$dragOffset$delegate).m2434() <= -11.0f) || (!this.$checked && ((AbstractC1349) this.$dragOffset$delegate).m2434() <= 10.0f)) {
                ((C7315) this.$hapticFeedback).m12509(22);
            } else if ((this.$checked && ((AbstractC1349) this.$dragOffset$delegate).m2434() >= -10.0f) || (!this.$checked && ((AbstractC1349) this.$dragOffset$delegate).m2434() >= 11.0f)) {
                ((C7315) this.$hapticFeedback).m12509(21);
            }
        }
        C0570 c0570 = (C0570) this.$currentDragInteraction$delegate.getValue();
        if (c0570 != null) {
            ((C0573) this.$interactionSource).m1353(new C0569(c0570));
        }
        ((AbstractC1349) this.$dragOffset$delegate).m2435(0.0f);
        ((AbstractC1349) this.$rawDragOffset$delegate).m2435(0.0f);
        return C5176.f14739;
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC5401) obj, ((Number) obj2).floatValue(), (InterfaceC4357<? super C5176>) obj3);
    }
}
