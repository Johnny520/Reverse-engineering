package androidx.compose.ui.platform;

import android.os.Trace;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1882 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f5409;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5410;

    public /* synthetic */ RunnableC1882(Object obj, int i) {
        this.f5410 = i;
        this.f5409 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5410;
        Object obj = this.f5409;
        switch (i) {
            case 0:
                ((AbstractC1881) obj).m3498();
                return;
            default:
                ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = (ViewOnAttachStateChangeListenerC1885) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    viewOnAttachStateChangeListenerC1885.f5532.m3542(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        viewOnAttachStateChangeListenerC1885.m3581();
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC1885.f5537 = false;
                        return;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
