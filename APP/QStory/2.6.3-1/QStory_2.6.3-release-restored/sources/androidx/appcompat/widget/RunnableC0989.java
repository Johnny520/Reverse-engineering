package androidx.appcompat.widget;

import p206.C8629;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0989 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f949;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f950;

    public /* synthetic */ RunnableC0989(Toolbar toolbar, int i) {
        this.f950 = i;
        this.f949 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f950;
        Toolbar toolbar = this.f949;
        switch (i) {
            case 0:
                C1006 c1006 = toolbar.f867;
                C8629 c8629 = c1006 == null ? null : c1006.f988;
                if (c8629 != null) {
                    c8629.collapseActionView();
                }
                break;
            default:
                toolbar.m1064();
                break;
        }
    }
}
