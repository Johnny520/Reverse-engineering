package androidx.compose.p001ui.scrollcapture;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.compose.p001ui.graphics.AbstractC2416;
import java.util.function.Consumer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p221.C8734;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", m556f = "ComposeScrollCaptureCallback.android.kt", m557l = {120}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Rect $captureArea;
    final /* synthetic */ Consumer<Rect> $onComplete;
    final /* synthetic */ ScrollCaptureSession $session;
    int label;
    final /* synthetic */ ScrollCaptureCallbackC2767 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(ScrollCaptureCallbackC2767 scrollCaptureCallbackC2767, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, InterfaceC5189<? super ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = scrollCaptureCallbackC2767;
        this.$session = scrollCaptureSession;
        this.$captureArea = rect;
        this.$onComplete = consumer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this.this$0, this.$session, this.$captureArea, this.$onComplete, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            ScrollCaptureCallbackC2767 scrollCaptureCallbackC2767 = this.this$0;
            ScrollCaptureSession scrollCaptureSession = this.$session;
            Rect rect = this.$captureArea;
            C8734 c8734 = new C8734(rect.left, rect.top, rect.right, rect.bottom);
            this.label = 1;
            obj = ScrollCaptureCallbackC2767.m4198(scrollCaptureCallbackC2767, scrollCaptureSession, c8734, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        this.$onComplete.accept(AbstractC2416.m3448((C8734) obj));
        return C6008.f15084;
    }
}
