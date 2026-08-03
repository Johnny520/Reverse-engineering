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

    public /* synthetic */ C0079Bt(AbstractC0127Cy r1, Context r2, int r3) {
        this.f188a = r3;
        this.f189b = r1;
        super(r2);
    }

    @Override // p000.C2201lo
    public final float calculateSpeedPerPixel(DisplayMetrics r2) {
        switch(this.f188a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        int r22 = r2.densityDpi;
    L6:
        return 100.0f / r22;
    L7:
        r22 = r2.densityDpi;
        goto L6
    }

    @Override // p000.C2201lo
    public int calculateTimeForScrolling(int r2) {
        switch(this.f188a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.calculateTimeForScrolling(r2);
    L7:
        return Math.min(100, super.calculateTimeForScrolling(r2));
    }

    @Override // p000.C2201lo, androidx.recyclerview.widget.AbstractC1164m
    public final void onTargetFound(View r4, C0038Av r5, C1163l r6) {
        switch(this.f188a) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        AbstractC0127Cy r52 = this.f189b;
        RecyclerView r0 = r52.mRecyclerView;
        if (r0 == null) goto L16;
        int[] r42 = r52.calculateDistanceToFinalSnap(r0.getLayoutManager(), r4);
        int r53 = r42[0];
        int r43 = r42[1];
        int r1 = calculateTimeForDeceleration(Math.max(Math.abs(r53), Math.abs(r43)));
        if (r1 <= 0) goto L15;
        DecelerateInterpolator r2 = this.mDecelerateInterpolator;
        r6.f4048a = r53;
        r6.f4049b = r43;
        r6.f4050c = r1;
        r6.f4052e = r2;
        r6.f4053f = true;
        return;
    L15:
        return;
    L16:
        return;
    L11:
        C0122Ct r54 = (C0122Ct) this.f189b;
        int[] r44 = r54.calculateDistanceToFinalSnap(r54.mRecyclerView.getLayoutManager(), r4);
        int r55 = r44[0];
        int r45 = r44[1];
        int r12 = calculateTimeForDeceleration(Math.max(Math.abs(r55), Math.abs(r45)));
        if (r12 <= 0) goto L17;
        DecelerateInterpolator r22 = this.mDecelerateInterpolator;
        r6.f4048a = r55;
        r6.f4049b = r45;
        r6.f4050c = r12;
        r6.f4052e = r22;
        r6.f4053f = true;
        return;
    }
}
