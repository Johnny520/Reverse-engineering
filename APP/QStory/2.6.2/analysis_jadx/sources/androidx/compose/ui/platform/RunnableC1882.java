package androidx.compose.ui.platform;

import android.os.Trace;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1882 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f5408;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5409;

    public /* synthetic */ RunnableC1882(Object obj, int i) {
        this.f5409 = i;
        this.f5408 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5409;
        Object obj = this.f5408;
        switch (i) {
            case 0:
                ((AbstractC1881) obj).m3488();
                return;
            default:
                ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = (ViewOnAttachStateChangeListenerC1885) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    viewOnAttachStateChangeListenerC1885.f5531.m3532(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        viewOnAttachStateChangeListenerC1885.m3571();
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC1885.f5536 = false;
                        return;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
