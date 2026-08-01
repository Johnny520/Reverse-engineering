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
import kotlin.C5176;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.C5459;
import kotlinx.coroutines.internal.C5351;
import p052.InterfaceC6558;
import p205.C7905;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollCaptureCallbackC1932 implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1929 f5684;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5351 f5685;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f5686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1928 f5687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7905 f5688;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1953 f5689;

    public ScrollCaptureCallbackC1932(C1953 c1953, C7905 c7905, C5351 c5351, C1928 c1928, ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f5689 = c1953;
        this.f5688 = c7905;
        this.f5687 = c1928;
        this.f5686 = viewTreeObserverOnGlobalLayoutListenerC1884;
        this.f5685 = new C5351(c5351.f14921.plus(C1930.f5682));
        this.f5684 = new C1929(c7905.f21875 - c7905.f21877, new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3638(androidx.compose.ui.scrollcapture.ScrollCaptureCallbackC1932 r11, android.view.ScrollCaptureSession r12, p205.C7905 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.ScrollCaptureCallbackC1932.m3638(androidx.compose.ui.scrollcapture.飘花落叶言子楪世苏哲兰, android.view.ScrollCaptureSession, 飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏兰世哲, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC5399.m10477(this.f5685, C5459.f15108, null, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, final CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final C5417 c5417M10477 = AbstractC5399.m10477(this.f5685, null, null, new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this, scrollCaptureSession, rect, consumer, null), 3);
        c5417M10477.mo10559(new InterfaceC6558() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C5176.f14739;
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
                c5417M10477.mo10256(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC1581.m2888(this.f5688));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f5684.f5679 = 0.0f;
        ((AbstractC1347) this.f5687.f5678).setValue(Boolean.TRUE);
        runnable.run();
    }
}
