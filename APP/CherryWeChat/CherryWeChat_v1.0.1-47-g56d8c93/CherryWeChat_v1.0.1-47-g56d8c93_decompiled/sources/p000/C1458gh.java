package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: gh */
/* JADX INFO: loaded from: classes.dex */
public final class C1458gh extends AbstractC2603uv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1545ih f5177a;

    public C1458gh(C1545ih c1545ih) {
        this.f5177a = c1545ih;
    }

    @Override // p000.AbstractC2603uv
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C1545ih c1545ih = this.f5177a;
        int i3 = c1545ih.f5470a;
        int iComputeVerticalScrollRange = c1545ih.f5488s.computeVerticalScrollRange();
        int i4 = c1545ih.f5487r;
        c1545ih.f5489t = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = c1545ih.f5488s.computeHorizontalScrollRange();
        int i5 = c1545ih.f5486q;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        c1545ih.f5490u = z;
        boolean z2 = c1545ih.f5489t;
        if (!z2 && !z) {
            if (c1545ih.f5491v != 0) {
                c1545ih.m2967g(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            c1545ih.f5481l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c1545ih.f5480k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (c1545ih.f5490u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            c1545ih.f5484o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            c1545ih.f5483n = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = c1545ih.f5491v;
        if (i6 == 0 || i6 == 1) {
            c1545ih.m2967g(1);
        }
    }
}
