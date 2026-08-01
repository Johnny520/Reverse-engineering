package androidx.compose.p001ui.scrollcapture;

import androidx.compose.runtime.AbstractC2182;
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
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", m556f = "ComposeScrollCaptureCallback.android.kt", m557l = {188}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class ComposeScrollCaptureCallback$onScrollCaptureEnd$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Runnable $onReady;
    int label;
    final /* synthetic */ ScrollCaptureCallbackC2767 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureEnd$1(ScrollCaptureCallbackC2767 scrollCaptureCallbackC2767, Runnable runnable, InterfaceC5189<? super ComposeScrollCaptureCallback$onScrollCaptureEnd$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = scrollCaptureCallbackC2767;
        this.$onReady = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this.this$0, this.$onReady, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureEnd$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C2764 c2764 = this.this$0.f6029;
            this.label = 1;
            Object objM4197 = c2764.m4197(0.0f - c2764.f6024, this);
            if (objM4197 != coroutineSingletons) {
                objM4197 = c6008;
            }
            if (objM4197 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        ((AbstractC2182) this.this$0.f6032.f6023).setValue(Boolean.FALSE);
        this.$onReady.run();
        return c6008;
    }
}
