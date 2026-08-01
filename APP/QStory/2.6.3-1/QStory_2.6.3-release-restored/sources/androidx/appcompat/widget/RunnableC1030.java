package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1030 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1029 f1080;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1081;

    public /* synthetic */ RunnableC1030(C1029 c1029, int i) {
        this.f1081 = i;
        this.f1080 = c1029;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1081;
        C1029 c1029 = this.f1080;
        switch (i) {
            case 0:
                C1024 c1024 = c1029.f1078;
                if (c1024 != null) {
                    c1024.setListSelectionHidden(true);
                    c1024.requestLayout();
                }
                break;
            default:
                C1024 c10242 = c1029.f1078;
                if (c10242 != null && c10242.isAttachedToWindow() && c1029.f1078.getCount() > c1029.f1078.getChildCount() && c1029.f1078.getChildCount() <= c1029.f1061) {
                    c1029.f1054.setInputMethodMode(2);
                    c1029.show();
                    break;
                }
                break;
        }
    }
}
