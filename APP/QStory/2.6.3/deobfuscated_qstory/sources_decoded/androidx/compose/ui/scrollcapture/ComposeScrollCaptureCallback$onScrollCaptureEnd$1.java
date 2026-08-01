package androidx.compose.ui.scrollcapture;

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
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {188}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class ComposeScrollCaptureCallback$onScrollCaptureEnd$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Runnable $onReady;
    int label;
    final /* synthetic */ ScrollCaptureCallbackC1932 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureEnd$1(ScrollCaptureCallbackC1932 scrollCaptureCallbackC1932, Runnable runnable, InterfaceC4357<? super ComposeScrollCaptureCallback$onScrollCaptureEnd$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = scrollCaptureCallbackC1932;
        this.$onReady = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this.this$0, this.$onReady, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureEnd$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C1929 c1929 = this.this$0.f5684;
            this.label = 1;
            Object objM3637 = c1929.m3637(0.0f - c1929.f5679, this);
            if (objM3637 != coroutineSingletons) {
                objM3637 = c5176;
            }
            if (objM3637 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        ((AbstractC1347) this.this$0.f5687.f5678).setValue(Boolean.FALSE);
        this.$onReady.run();
        return c5176;
    }
}
