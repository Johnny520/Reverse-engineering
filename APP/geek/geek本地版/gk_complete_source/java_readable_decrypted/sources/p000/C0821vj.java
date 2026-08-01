package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: vj */
/* JADX INFO: loaded from: classes.dex */
public final class C0821vj extends AbstractC0652qz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0858wj f4859a;

    public C0821vj(C0858wj c0858wj) {
        this.f4859a = c0858wj;
    }

    @Override // p000.AbstractC0652qz
    /* JADX INFO: renamed from: b */
    public final void mo2185b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0858wj c0858wj = this.f4859a;
        int i3 = c0858wj.f4971a;
        int iComputeVerticalScrollRange = c0858wj.f4989s.computeVerticalScrollRange();
        int i4 = c0858wj.f4988r;
        c0858wj.f4990t = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = c0858wj.f4989s.computeHorizontalScrollRange();
        int i5 = c0858wj.f4987q;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        c0858wj.f4991u = z;
        boolean z2 = c0858wj.f4990t;
        if (!z2 && !z) {
            if (c0858wj.f4992v != 0) {
                c0858wj.m2573f(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            c0858wj.f4982l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c0858wj.f4981k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (c0858wj.f4991u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            c0858wj.f4985o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            c0858wj.f4984n = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = c0858wj.f4992v;
        if (i6 == 0 || i6 == 1) {
            c0858wj.m2573f(1);
        }
    }
}
