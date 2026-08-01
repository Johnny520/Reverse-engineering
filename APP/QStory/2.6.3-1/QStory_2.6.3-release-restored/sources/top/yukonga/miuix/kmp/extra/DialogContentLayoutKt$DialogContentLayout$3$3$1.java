package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C1177;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2232;
import androidx.navigationevent.compose.AbstractC3270;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$3$3$1", m556f = "DialogContentLayout.kt", m557l = {188}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class DialogContentLayoutKt$DialogContentLayout$3$3$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1177 $backProgress;
    final /* synthetic */ InterfaceC2232 $dimAlpha;
    final /* synthetic */ AbstractC3270 $navigationEventState;
    float F$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogContentLayoutKt$DialogContentLayout$3$3$1(AbstractC3270 abstractC3270, C1177 c1177, InterfaceC2232 interfaceC2232, InterfaceC5189<? super DialogContentLayoutKt$DialogContentLayout$3$3$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$navigationEventState = abstractC3270;
        this.$backProgress = c1177;
        this.$dimAlpha = interfaceC2232;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new DialogContentLayoutKt$DialogContentLayout$3$3$1(this.$navigationEventState, this.$backProgress, this.$dimAlpha, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DialogContentLayoutKt$DialogContentLayout$3$3$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.$navigationEventState.getClass();
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        float f = this.F$0;
        AbstractC6017.m10769(obj);
        ((AbstractC2184) this.$dimAlpha).m2995(1.0f - f);
        return C6008.f15084;
    }
}
