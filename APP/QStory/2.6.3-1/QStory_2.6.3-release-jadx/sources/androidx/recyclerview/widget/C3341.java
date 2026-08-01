package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3341 extends AbstractC3366 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3340 f7888;

    public C3341(C3340 c3340) {
        this.f7888 = c3340;
    }

    @Override // androidx.recyclerview.widget.AbstractC3366
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5458(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C3340 c3340 = this.f7888;
        int i3 = c3340.f7869;
        int iComputeVerticalScrollRange = c3340.f7871.computeVerticalScrollRange();
        int i4 = c3340.f7879;
        c3340.f7870 = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = c3340.f7871.computeHorizontalScrollRange();
        int i5 = c3340.f7878;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        c3340.f7874 = z;
        boolean z2 = c3340.f7870;
        if (!z2 && !z) {
            if (c3340.f7875 != 0) {
                c3340.m5538(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            c3340.f7885 = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c3340.f7884 = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (c3340.f7874) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            c3340.f7880 = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            c3340.f7876 = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = c3340.f7875;
        if (i6 == 0 || i6 == 1) {
            c3340.m5538(1);
        }
    }
}
