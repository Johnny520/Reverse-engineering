package androidx.appcompat.widget;

import p190.C7799;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0142 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f604;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f605;

    public /* synthetic */ RunnableC0142(Toolbar toolbar, int i) {
        this.f605 = i;
        this.f604 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f605;
        Toolbar toolbar = this.f604;
        switch (i) {
            case 0:
                C0159 c0159 = toolbar.f522;
                C7799 c7799 = c0159 == null ? null : c0159.f643;
                if (c7799 != null) {
                    c7799.collapseActionView();
                }
                break;
            default:
                toolbar.m503();
                break;
        }
    }
}
