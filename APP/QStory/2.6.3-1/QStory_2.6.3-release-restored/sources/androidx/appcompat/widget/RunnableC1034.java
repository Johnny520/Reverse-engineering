package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1034 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ActionBarOverlayLayout f1083;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1084;

    public /* synthetic */ RunnableC1034(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f1084 = i;
        this.f1083 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1084;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1083;
        switch (i) {
            case 0:
                actionBarOverlayLayout.m1035();
                actionBarOverlayLayout.f769 = actionBarOverlayLayout.f786.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f772);
                break;
            default:
                actionBarOverlayLayout.m1035();
                actionBarOverlayLayout.f769 = actionBarOverlayLayout.f786.animate().translationY(-actionBarOverlayLayout.f786.getHeight()).setListener(actionBarOverlayLayout.f772);
                break;
        }
    }
}
