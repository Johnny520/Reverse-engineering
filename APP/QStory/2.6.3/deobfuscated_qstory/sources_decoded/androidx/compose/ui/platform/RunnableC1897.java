package androidx.compose.ui.platform;

import android.os.Trace;
import android.view.MotionEvent;
import kotlin.collections.C4351;
import p052.InterfaceC6543;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1897 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1884 f5563;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5564;

    public /* synthetic */ RunnableC1897(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, int i) {
        this.f5564 = i;
        this.f5563 = viewTreeObserverOnGlobalLayoutListenerC1884;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5564;
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5563;
        switch (i) {
            case 0:
                C4351 c4351 = viewTreeObserverOnGlobalLayoutListenerC1884.f5476;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!c4351.isEmpty()) {
                    try {
                        ((InterfaceC6543) c4351.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                    break;
                }
                return;
            case 1:
                viewTreeObserverOnGlobalLayoutListenerC1884.f5460 = false;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC1884.f5468;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    viewTreeObserverOnGlobalLayoutListenerC1884.m3533(motionEvent);
                    return;
                } else {
                    C5925.m11311("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                ViewTreeObserverOnGlobalLayoutListenerC1884.m3514(viewTreeObserverOnGlobalLayoutListenerC1884.getRoot());
                return;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC1884.m3514(viewTreeObserverOnGlobalLayoutListenerC1884.getRoot());
                return;
        }
    }
}
