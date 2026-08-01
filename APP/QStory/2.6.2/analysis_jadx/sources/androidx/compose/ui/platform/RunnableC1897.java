package androidx.compose.ui.platform;

import android.os.Trace;
import android.view.MotionEvent;
import kotlin.collections.C4350;
import p052.InterfaceC6542;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1897 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1884 f5562;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5563;

    public /* synthetic */ RunnableC1897(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, int i) {
        this.f5563 = i;
        this.f5562 = viewTreeObserverOnGlobalLayoutListenerC1884;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5563;
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5562;
        switch (i) {
            case 0:
                C4350 c4350 = viewTreeObserverOnGlobalLayoutListenerC1884.f5475;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!c4350.isEmpty()) {
                    try {
                        ((InterfaceC6542) c4350.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                    break;
                }
                return;
            case 1:
                viewTreeObserverOnGlobalLayoutListenerC1884.f5459 = false;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC1884.f5467;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    viewTreeObserverOnGlobalLayoutListenerC1884.m3523(motionEvent);
                    return;
                } else {
                    C5919.m11250("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                ViewTreeObserverOnGlobalLayoutListenerC1884.m3504(viewTreeObserverOnGlobalLayoutListenerC1884.getRoot());
                return;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC1884.m3504(viewTreeObserverOnGlobalLayoutListenerC1884.getRoot());
                return;
        }
    }
}
