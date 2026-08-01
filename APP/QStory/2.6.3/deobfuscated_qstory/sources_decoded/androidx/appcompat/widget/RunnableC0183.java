package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0183 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0182 f735;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f736;

    public /* synthetic */ RunnableC0183(C0182 c0182, int i) {
        this.f736 = i;
        this.f735 = c0182;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f736;
        C0182 c0182 = this.f735;
        switch (i) {
            case 0:
                C0177 c0177 = c0182.f733;
                if (c0177 != null) {
                    c0177.setListSelectionHidden(true);
                    c0177.requestLayout();
                }
                break;
            default:
                C0177 c01772 = c0182.f733;
                if (c01772 != null && c01772.isAttachedToWindow() && c0182.f733.getCount() > c0182.f733.getChildCount() && c0182.f733.getChildCount() <= c0182.f716) {
                    c0182.f709.setInputMethodMode(2);
                    c0182.show();
                    break;
                }
                break;
        }
    }
}
