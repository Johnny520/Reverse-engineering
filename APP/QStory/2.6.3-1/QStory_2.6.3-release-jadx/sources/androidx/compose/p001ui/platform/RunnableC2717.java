package androidx.compose.p001ui.platform;

import android.os.Trace;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2717 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f5754;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5755;

    public /* synthetic */ RunnableC2717(Object obj, int i) {
        this.f5755 = i;
        this.f5754 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5755;
        Object obj = this.f5754;
        switch (i) {
            case 0:
                ((AbstractC2716) obj).m4058();
                return;
            default:
                ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720 = (ViewOnAttachStateChangeListenerC2720) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    viewOnAttachStateChangeListenerC2720.f5877.m4102(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        viewOnAttachStateChangeListenerC2720.m4141();
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC2720.f5882 = false;
                        return;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
