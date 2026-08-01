package androidx.compose.ui.scrollcapture;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.semantics.C1953;
import java.util.function.Consumer;
import kotlin.C5175;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.C5458;
import kotlinx.coroutines.internal.C5350;
import p052.InterfaceC6557;
import p205.C7904;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollCaptureCallbackC1932 implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1929 f5683;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5350 f5684;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f5685;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1928 f5686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7904 f5687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1953 f5688;

    public ScrollCaptureCallbackC1932(C1953 c1953, C7904 c7904, C5350 c5350, C1928 c1928, ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f5688 = c1953;
        this.f5687 = c7904;
        this.f5686 = c1928;
        this.f5685 = viewTreeObserverOnGlobalLayoutListenerC1884;
        this.f5684 = new C5350(c5350.f14921.plus(C1930.f5681));
        this.f5683 = new C1929(c7904.f21878 - c7904.f21880, new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3628(androidx.compose.ui.scrollcapture.ScrollCaptureCallbackC1932 r11, android.view.ScrollCaptureSession r12, p205.C7904 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.ScrollCaptureCallbackC1932.m3628(androidx.compose.ui.scrollcapture.飘花落叶言子楪世苏哲兰, android.view.ScrollCaptureSession, 飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏兰世哲, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC5398.m10473(this.f5684, C5458.f15108, null, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, final CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final C5416 c5416M10473 = AbstractC5398.m10473(this.f5684, null, null, new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this, scrollCaptureSession, rect, consumer, null), 3);
        c5416M10473.mo10554(new InterfaceC6557() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C5175.f14739;
            }

            public final void invoke(Throwable th) {
                if (th != null) {
                    cancellationSignal.cancel();
                }
            }
        });
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.ui.scrollcapture.飘花落叶言子楪世苏兰哲
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                c5416M10473.mo10252(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC1581.m2878(this.f5687));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f5683.f5678 = 0.0f;
        ((AbstractC1347) this.f5686.f5677).setValue(Boolean.TRUE);
        runnable.run();
    }
}
