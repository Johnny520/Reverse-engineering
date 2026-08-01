package androidx.compose.p001ui.platform;

import android.os.Trace;
import android.view.MotionEvent;
import kotlin.collections.C5183;
import p068.InterfaceC7372;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2732 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2719 f5908;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5909;

    public /* synthetic */ RunnableC2732(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, int i) {
        this.f5909 = i;
        this.f5908 = viewTreeObserverOnGlobalLayoutListenerC2719;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5909;
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f5908;
        switch (i) {
            case 0:
                C5183 c5183 = viewTreeObserverOnGlobalLayoutListenerC2719.f5821;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!c5183.isEmpty()) {
                    try {
                        ((InterfaceC7372) c5183.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                    break;
                }
                return;
            case 1:
                viewTreeObserverOnGlobalLayoutListenerC2719.f5805 = false;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC2719.f5813;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    viewTreeObserverOnGlobalLayoutListenerC2719.m4093(motionEvent);
                    return;
                } else {
                    C6755.m11870("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                ViewTreeObserverOnGlobalLayoutListenerC2719.m4074(viewTreeObserverOnGlobalLayoutListenerC2719.getRoot());
                return;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC2719.m4074(viewTreeObserverOnGlobalLayoutListenerC2719.getRoot());
                return;
        }
    }
}
