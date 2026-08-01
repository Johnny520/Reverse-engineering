package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.C1614;
import androidx.compose.foundation.relocation.InterfaceC1616;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8157;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", m556f = "CoreTextField.kt", m557l = {346}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1616 $bringIntoViewRequester;
    final /* synthetic */ C1801 $layoutResult;
    final /* synthetic */ InterfaceC2856 $offsetMapping;
    final /* synthetic */ C1781 $state;
    final /* synthetic */ C2847 $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(InterfaceC1616 interfaceC1616, C2847 c2847, C1781 c1781, C1801 c1801, InterfaceC2856 interfaceC2856, InterfaceC5189<? super CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$bringIntoViewRequester = interfaceC1616;
        this.$value = c2847;
        this.$state = c1781;
        this.$layoutResult = c1801;
        this.$offsetMapping = interfaceC2856;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, this.$layoutResult, this.$offsetMapping, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC1616 interfaceC1616 = this.$bringIntoViewRequester;
        C2847 c2847 = this.$value;
        C1847 c1847 = this.$state.f3015;
        C2867 c2867 = this.$layoutResult.f3090;
        InterfaceC2856 interfaceC2856 = this.$offsetMapping;
        this.label = 1;
        int iM4310 = C2869.m4310(c2847.f6291);
        interfaceC2856.mo2442(iM4310);
        Object objM2138 = ((C1614) interfaceC1616).m2138(iM4310 < c2867.f6336.f6342.f6474.length() ? c2867.m4304(iM4310) : iM4310 != 0 ? c2867.m4304(iM4310 - 1) : new C8157(0.0f, 0.0f, 1.0f, (int) (AbstractC1834.m2476(c1847.f3300, c1847.f3303, c1847.f3302, AbstractC1834.f3261, 1) & 4294967295L)), this);
        if (objM2138 != coroutineSingletons) {
            objM2138 = c6008;
        }
        return objM2138 == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
