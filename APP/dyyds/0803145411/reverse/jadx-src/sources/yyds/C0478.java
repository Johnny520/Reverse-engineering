package yyds;

/* JADX INFO: renamed from: yyds.ᛲᲇᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0478 extends AbstractC2362 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2385;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f2386;

    public /* synthetic */ C0478(int i, Object obj) {
        this.f2385 = i;
        this.f2386 = obj;
    }

    @Override // yyds.AbstractC2362
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo1335(C1213 c1213, int i, int i2) {
        int i3 = this.f2385;
        Object obj = this.f2386;
        switch (i3) {
            case 0:
                C2777 c2777 = (C2777) obj;
                int iComputeHorizontalScrollOffset = c1213.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = c1213.computeVerticalScrollOffset();
                int i4 = c2777.f13540;
                int iComputeVerticalScrollRange = c2777.f13555.computeVerticalScrollRange();
                int i5 = c2777.f13543;
                c2777.f13541 = iComputeVerticalScrollRange - i5 > 0 && i5 >= i4;
                int iComputeHorizontalScrollRange = c2777.f13555.computeHorizontalScrollRange();
                int i6 = c2777.f13547;
                boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i4;
                c2777.f13550 = z;
                boolean z2 = c2777.f13541;
                if (z2 || z) {
                    if (z2) {
                        float f = i5;
                        c2777.f13552 = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                        c2777.f13551 = Math.min(i5, (i5 * i5) / iComputeVerticalScrollRange);
                    }
                    if (c2777.f13550) {
                        float f2 = iComputeHorizontalScrollOffset;
                        float f3 = i6;
                        c2777.f13542 = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                        c2777.f13533 = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
                    }
                    int i7 = c2777.f13549;
                    if (i7 == 0 || i7 == 1) {
                        c2777.m4900(1);
                    }
                } else if (c2777.f13549 != 0) {
                    c2777.m4900(0);
                }
                break;
            default:
                ((RunnableC1272) obj).run();
                break;
        }
    }
}
