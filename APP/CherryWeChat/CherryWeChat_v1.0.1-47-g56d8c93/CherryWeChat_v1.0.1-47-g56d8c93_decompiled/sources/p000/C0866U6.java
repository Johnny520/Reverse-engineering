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
    public final /* synthetic */ int f2736a = 1;

    public /* synthetic */ C0866U6(Context context) {
        super(context);
    }

    @Override // p000.C2201lo
    public int calculateDxToMakeVisible(View view, int i) {
        switch (this.f2736a) {
            case 0:
                return 0;
            default:
                return super.calculateDxToMakeVisible(view, i);
        }
    }

    @Override // p000.C2201lo
    public int calculateDyToMakeVisible(View view, int i) {
        switch (this.f2736a) {
            case 0:
                return 0;
            default:
                return super.calculateDyToMakeVisible(view, i);
        }
    }

    @Override // p000.C2201lo
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        switch (this.f2736a) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.calculateSpeedPerPixel(displayMetrics);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1164m
    public PointF computeScrollVectorForPosition(int i) {
        switch (this.f2736a) {
            case 0:
                return null;
            default:
                return super.computeScrollVectorForPosition(i);
        }
    }

    public C0866U6(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
