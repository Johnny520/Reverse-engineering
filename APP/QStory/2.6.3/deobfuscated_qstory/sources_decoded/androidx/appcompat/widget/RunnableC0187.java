package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0187 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ActionBarOverlayLayout f738;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f739;

    public /* synthetic */ RunnableC0187(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f739 = i;
        this.f738 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f739;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f738;
        switch (i) {
            case 0:
                actionBarOverlayLayout.m475();
                actionBarOverlayLayout.f424 = actionBarOverlayLayout.f441.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f427);
                break;
            default:
                actionBarOverlayLayout.m475();
                actionBarOverlayLayout.f424 = actionBarOverlayLayout.f441.animate().translationY(-actionBarOverlayLayout.f441.getHeight()).setListener(actionBarOverlayLayout.f427);
                break;
        }
    }
}
