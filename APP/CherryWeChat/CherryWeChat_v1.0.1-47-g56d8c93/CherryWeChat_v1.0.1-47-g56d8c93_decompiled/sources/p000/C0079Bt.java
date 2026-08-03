package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.C1163l;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: Bt */
/* JADX INFO: loaded from: classes.dex */
public final class C0079Bt extends C2201lo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f188a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0127Cy f189b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0079Bt(AbstractC0127Cy abstractC0127Cy, Context context, int i) {
        super(context);
        this.f188a = i;
        this.f189b = abstractC0127Cy;
    }

    @Override // p000.C2201lo
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        int i;
        switch (this.f188a) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }

    @Override // p000.C2201lo
    public int calculateTimeForScrolling(int i) {
        switch (this.f188a) {
            case 0:
                return Math.min(100, super.calculateTimeForScrolling(i));
            default:
                return super.calculateTimeForScrolling(i);
        }
    }

    @Override // p000.C2201lo, androidx.recyclerview.widget.AbstractC1164m
    public final void onTargetFound(View view, C0038Av c0038Av, C1163l c1163l) {
        switch (this.f188a) {
            case 0:
                C0122Ct c0122Ct = (C0122Ct) this.f189b;
                int[] iArrCalculateDistanceToFinalSnap = c0122Ct.calculateDistanceToFinalSnap(c0122Ct.mRecyclerView.getLayoutManager(), view);
                int i = iArrCalculateDistanceToFinalSnap[0];
                int i2 = iArrCalculateDistanceToFinalSnap[1];
                int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (iCalculateTimeForDeceleration > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
                    c1163l.f4048a = i;
                    c1163l.f4049b = i2;
                    c1163l.f4050c = iCalculateTimeForDeceleration;
                    c1163l.f4052e = decelerateInterpolator;
                    c1163l.f4053f = true;
                }
                break;
            default:
                AbstractC0127Cy abstractC0127Cy = this.f189b;
                RecyclerView recyclerView = abstractC0127Cy.mRecyclerView;
                if (recyclerView != null) {
                    int[] iArrCalculateDistanceToFinalSnap2 = abstractC0127Cy.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
                    int i3 = iArrCalculateDistanceToFinalSnap2[0];
                    int i4 = iArrCalculateDistanceToFinalSnap2[1];
                    int iCalculateTimeForDeceleration2 = calculateTimeForDeceleration(Math.max(Math.abs(i3), Math.abs(i4)));
                    if (iCalculateTimeForDeceleration2 > 0) {
                        DecelerateInterpolator decelerateInterpolator2 = this.mDecelerateInterpolator;
                        c1163l.f4048a = i3;
                        c1163l.f4049b = i4;
                        c1163l.f4050c = iCalculateTimeForDeceleration2;
                        c1163l.f4052e = decelerateInterpolator2;
                        c1163l.f4053f = true;
                    }
                    break;
                }
                break;
        }
    }
}
