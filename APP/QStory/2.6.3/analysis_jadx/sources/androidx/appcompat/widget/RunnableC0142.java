package androidx.appcompat.widget;

import p190.C7800;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
                C7800 c7800 = c0159 == null ? null : c0159.f643;
                if (c7800 != null) {
                    c7800.collapseActionView();
                }
                break;
            default:
                toolbar.m504();
                break;
        }
    }
}
