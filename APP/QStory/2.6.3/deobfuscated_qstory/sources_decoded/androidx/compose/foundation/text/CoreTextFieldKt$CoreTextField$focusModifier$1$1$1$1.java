package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.C0774;
import androidx.compose.foundation.relocation.InterfaceC0776;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.InterfaceC2022;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {346}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0776 $bringIntoViewRequester;
    final /* synthetic */ C0963 $layoutResult;
    final /* synthetic */ InterfaceC2022 $offsetMapping;
    final /* synthetic */ C0943 $state;
    final /* synthetic */ C2013 $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(InterfaceC0776 interfaceC0776, C2013 c2013, C0943 c0943, C0963 c0963, InterfaceC2022 interfaceC2022, InterfaceC4357<? super CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$bringIntoViewRequester = interfaceC0776;
        this.$value = c2013;
        this.$state = c0943;
        this.$layoutResult = c0963;
        this.$offsetMapping = interfaceC2022;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, this.$layoutResult, this.$offsetMapping, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        InterfaceC0776 interfaceC0776 = this.$bringIntoViewRequester;
        C2013 c2013 = this.$value;
        C1009 c1009 = this.$state.f2670;
        C2033 c2033 = this.$layoutResult.f2745;
        InterfaceC2022 interfaceC2022 = this.$offsetMapping;
        this.label = 1;
        int iM3750 = C2035.m3750(c2013.f5946);
        interfaceC2022.mo1882(iM3750);
        Object objM1578 = ((C0774) interfaceC0776).m1578(iM3750 < c2033.f5991.f5997.f6129.length() ? c2033.m3744(iM3750) : iM3750 != 0 ? c2033.m3744(iM3750 - 1) : new C7328(0.0f, 0.0f, 1.0f, (int) (AbstractC0996.m1916(c1009.f2955, c1009.f2958, c1009.f2957, AbstractC0996.f2916, 1) & 4294967295L)), this);
        if (objM1578 != coroutineSingletons) {
            objM1578 = c5176;
        }
        return objM1578 == coroutineSingletons ? coroutineSingletons : c5176;
    }
}
