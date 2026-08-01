package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: xj */
/* JADX INFO: loaded from: classes.dex */
public final class C0895xj extends AbstractC0911xz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0932yj f5262a;

    public C0895xj(C0932yj c0932yj) {
        this.f5262a = c0932yj;
    }

    @Override // p000.AbstractC0911xz
    /* JADX INFO: renamed from: b */
    public final void mo866b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0932yj c0932yj = this.f5262a;
        int i3 = c0932yj.f5437a;
        int iComputeVerticalScrollRange = c0932yj.f5455s.computeVerticalScrollRange();
        int i4 = c0932yj.f5454r;
        c0932yj.f5456t = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = c0932yj.f5455s.computeHorizontalScrollRange();
        int i5 = c0932yj.f5453q;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        c0932yj.f5457u = z;
        boolean z2 = c0932yj.f5456t;
        if (!z2 && !z) {
            if (c0932yj.f5458v != 0) {
                c0932yj.m2768f(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            c0932yj.f5448l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c0932yj.f5447k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (c0932yj.f5457u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            c0932yj.f5451o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            c0932yj.f5450n = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = c0932yj.f5458v;
        if (i6 == 0 || i6 == 1) {
            c0932yj.m2768f(1);
        }
    }
}
