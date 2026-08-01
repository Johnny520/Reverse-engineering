package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.C0774;
import androidx.compose.foundation.relocation.InterfaceC0776;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.InterfaceC2022;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7327;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {346}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC0776 $bringIntoViewRequester;
    final /* synthetic */ C0963 $layoutResult;
    final /* synthetic */ InterfaceC2022 $offsetMapping;
    final /* synthetic */ C0943 $state;
    final /* synthetic */ C2013 $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(InterfaceC0776 interfaceC0776, C2013 c2013, C0943 c0943, C0963 c0963, InterfaceC2022 interfaceC2022, InterfaceC4356<? super CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$bringIntoViewRequester = interfaceC0776;
        this.$value = c2013;
        this.$state = c0943;
        this.$layoutResult = c0963;
        this.$offsetMapping = interfaceC2022;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, this.$layoutResult, this.$offsetMapping, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC0776 interfaceC0776 = this.$bringIntoViewRequester;
        C2013 c2013 = this.$value;
        C1009 c1009 = this.$state.f2669;
        C2033 c2033 = this.$layoutResult.f2744;
        InterfaceC2022 interfaceC2022 = this.$offsetMapping;
        this.label = 1;
        int iM3740 = C2035.m3740(c2013.f5945);
        interfaceC2022.mo1872(iM3740);
        Object objM1568 = ((C0774) interfaceC0776).m1568(iM3740 < c2033.f5990.f5996.f6128.length() ? c2033.m3734(iM3740) : iM3740 != 0 ? c2033.m3734(iM3740 - 1) : new C7327(0.0f, 0.0f, 1.0f, (int) (AbstractC0996.m1906(c1009.f2954, c1009.f2957, c1009.f2956, AbstractC0996.f2915, 1) & 4294967295L)), this);
        if (objM1568 != coroutineSingletons) {
            objM1568 = c5175;
        }
        return objM1568 == coroutineSingletons ? coroutineSingletons : c5175;
    }
}
