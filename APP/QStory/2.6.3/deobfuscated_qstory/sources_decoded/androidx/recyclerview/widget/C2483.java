package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2483 extends AbstractC2533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2452 f7436;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f7437 = false;

    public C2483(C2452 c2452) {
        this.f7436 = c2452;
    }

    @Override // androidx.recyclerview.widget.AbstractC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo4898(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f7437 = true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo4899(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f7437) {
            this.f7437 = false;
            this.f7436.m4822();
        }
    }
}
