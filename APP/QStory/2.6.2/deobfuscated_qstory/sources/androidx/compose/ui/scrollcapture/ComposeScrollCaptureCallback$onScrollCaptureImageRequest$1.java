package androidx.compose.ui.scrollcapture;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.graphics.AbstractC1581;
import java.util.function.Consumer;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p205.C7904;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {120}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Rect $captureArea;
    final /* synthetic */ Consumer<Rect> $onComplete;
    final /* synthetic */ ScrollCaptureSession $session;
    int label;
    final /* synthetic */ ScrollCaptureCallbackC1932 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(ScrollCaptureCallbackC1932 scrollCaptureCallbackC1932, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, InterfaceC4356<? super ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = scrollCaptureCallbackC1932;
        this.$session = scrollCaptureSession;
        this.$captureArea = rect;
        this.$onComplete = consumer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this.this$0, this.$session, this.$captureArea, this.$onComplete, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            ScrollCaptureCallbackC1932 scrollCaptureCallbackC1932 = this.this$0;
            ScrollCaptureSession scrollCaptureSession = this.$session;
            Rect rect = this.$captureArea;
            C7904 c7904 = new C7904(rect.left, rect.top, rect.right, rect.bottom);
            this.label = 1;
            obj = ScrollCaptureCallbackC1932.m3628(scrollCaptureCallbackC1932, scrollCaptureSession, c7904, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        this.$onComplete.accept(AbstractC1581.m2878((C7904) obj));
        return C5175.f14739;
    }
}
