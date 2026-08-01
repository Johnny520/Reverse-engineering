package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2508 extends AbstractC2533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2507 f7543;

    public C2508(C2507 c2507) {
        this.f7543 = c2507;
    }

    @Override // androidx.recyclerview.widget.AbstractC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo4898(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C2507 c2507 = this.f7543;
        int i3 = c2507.f7524;
        int iComputeVerticalScrollRange = c2507.f7526.computeVerticalScrollRange();
        int i4 = c2507.f7534;
        c2507.f7525 = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = c2507.f7526.computeHorizontalScrollRange();
        int i5 = c2507.f7533;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        c2507.f7529 = z;
        boolean z2 = c2507.f7525;
        if (!z2 && !z) {
            if (c2507.f7530 != 0) {
                c2507.m4978(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            c2507.f7540 = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c2507.f7539 = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (c2507.f7529) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            c2507.f7535 = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            c2507.f7531 = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = c2507.f7530;
        if (i6 == 0 || i6 == 1) {
            c2507.m4978(1);
        }
    }
}
