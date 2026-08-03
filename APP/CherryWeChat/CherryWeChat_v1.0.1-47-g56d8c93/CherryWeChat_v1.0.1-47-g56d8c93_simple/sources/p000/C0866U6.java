package p000;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: U6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0866U6 extends C2201lo {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2736a;

    public /* synthetic */ C0866U6(Context r2) {
        this.f2736a = 1;
        super(r2);
    }

    @Override // p000.C2201lo
    public int calculateDxToMakeVisible(View r2, int r3) {
        switch(this.f2736a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return 0;
    L5:
        return super.calculateDxToMakeVisible(r2, r3);
    }

    @Override // p000.C2201lo
    public int calculateDyToMakeVisible(View r2, int r3) {
        switch(this.f2736a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return 0;
    L5:
        return super.calculateDyToMakeVisible(r2, r3);
    }

    @Override // p000.C2201lo
    public float calculateSpeedPerPixel(DisplayMetrics r2) {
        switch(this.f2736a) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.calculateSpeedPerPixel(r2);
    L7:
        return 100.0f / r2.densityDpi;
    }

    @Override // androidx.recyclerview.widget.AbstractC1164m
    public PointF computeScrollVectorForPosition(int r2) {
        switch(this.f2736a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return null;
    L5:
        return super.computeScrollVectorForPosition(r2);
    }

    public C0866U6(CarouselLayoutManager r1, Context r2) {
        this.f2736a = 0;
        super(r2);
    }
}
