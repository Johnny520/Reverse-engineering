package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
                actionBarOverlayLayout.m474();
                actionBarOverlayLayout.f424 = actionBarOverlayLayout.f441.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f427);
                break;
            default:
                actionBarOverlayLayout.m474();
                actionBarOverlayLayout.f424 = actionBarOverlayLayout.f441.animate().translationY(-actionBarOverlayLayout.f441.getHeight()).setListener(actionBarOverlayLayout.f427);
                break;
        }
    }
}
