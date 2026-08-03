package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.AbstractC1160i;
import androidx.recyclerview.widget.AbstractC1164m;
import androidx.recyclerview.widget.C1163l;

/* JADX INFO: renamed from: lo */
/* JADX INFO: loaded from: classes.dex */
public class C2201lo extends AbstractC1164m {
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    protected final DecelerateInterpolator mDecelerateInterpolator;
    private final DisplayMetrics mDisplayMetrics;
    private boolean mHasCalculatedMillisPerPixel;
    protected int mInterimTargetDx;
    protected int mInterimTargetDy;
    protected final LinearInterpolator mLinearInterpolator;
    private float mMillisPerPixel;

    @SuppressLint({"UnknownNullness"})
    protected PointF mTargetVector;

    public C2201lo(Context r2) {
        this.mLinearInterpolator = new LinearInterpolator();
        this.mDecelerateInterpolator = new DecelerateInterpolator();
        this.mHasCalculatedMillisPerPixel = false;
        this.mInterimTargetDx = 0;
        this.mInterimTargetDy = 0;
        this.mDisplayMetrics = r2.getResources().getDisplayMetrics();
    }

    public int calculateDtToFit(int r2, int r3, int r4, int r5, int r6) {
        if (r6 == (-1)) goto L20;
        if (r6 != 0) goto L6;
        int r42 = r4 - r2;
        if (r42 <= 0) goto L14;
        return r42;
    L14:
        int r52 = r5 - r3;
        if (r52 >= 0) goto L17;
        return r52;
    L17:
        return 0;
    L6:
        if (r6 != 1) goto L10;
        return r5 - r3;
    L10:
        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
    L20:
        return r4 - r2;
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDxToMakeVisible(View r11, int r12) {
        AbstractC1160i r0 = getLayoutManager();
        if (r0 != null) goto L5;
        return 0;
    L5:
        if (r0.canScrollHorizontally() == false) goto L11;
        C2431qv r1 = (C2431qv) r11.getLayoutParams();
        return calculateDtToFit(r0.getDecoratedLeft(r11) - ((ViewGroup.MarginLayoutParams) r1).leftMargin, r0.getDecoratedRight(r11) + ((ViewGroup.MarginLayoutParams) r1).rightMargin, r0.getPaddingLeft(), r0.getWidth() - r0.getPaddingRight(), r12);
    L11:
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDyToMakeVisible(View r11, int r12) {
        AbstractC1160i r0 = getLayoutManager();
        if (r0 != null) goto L5;
        return 0;
    L5:
        if (r0.canScrollVertically() == false) goto L11;
        C2431qv r1 = (C2431qv) r11.getLayoutParams();
        return calculateDtToFit(r0.getDecoratedTop(r11) - ((ViewGroup.MarginLayoutParams) r1).topMargin, r0.getDecoratedBottom(r11) + ((ViewGroup.MarginLayoutParams) r1).bottomMargin, r0.getPaddingTop(), r0.getHeight() - r0.getPaddingBottom(), r12);
    L11:
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public float calculateSpeedPerPixel(DisplayMetrics r2) {
        return MILLISECONDS_PER_INCH / r2.densityDpi;
    }

    public int calculateTimeForDeceleration(int r5) {
        return (int) Math.ceil(((double) calculateTimeForScrolling(r5)) / 0.3356d);
    }

    public int calculateTimeForScrolling(int r3) {
        float r32 = Math.abs(r3);
        if (this.mHasCalculatedMillisPerPixel == true) goto L6;
        this.mMillisPerPixel = calculateSpeedPerPixel(this.mDisplayMetrics);
        this.mHasCalculatedMillisPerPixel = true;
    L6:
        return (int) Math.ceil(r32 * this.mMillisPerPixel);
    }

    public int getHorizontalSnapPreference() {
        PointF r0 = this.mTargetVector;
        if (r0 == null) goto L13;
        float r02 = r0.x;
        if (r02 != 0.0f) goto L8;
        return 0;
    L8:
        if (r02 <= 0.0f) goto L11;
        return 1;
    L11:
        return -1;
    L13:
        return 0;
    }

    public int getVerticalSnapPreference() {
        PointF r0 = this.mTargetVector;
        if (r0 == null) goto L13;
        float r02 = r0.y;
        if (r02 != 0.0f) goto L8;
        return 0;
    L8:
        if (r02 <= 0.0f) goto L11;
        return 1;
    L11:
        return -1;
    L13:
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1164m
    @SuppressLint({"UnknownNullness"})
    public void onSeekTargetStep(int r2, int r3, C0038Av r4, C1163l r5) {
        if (getChildCount() != 0) goto L6;
        stop();
        return;
    L6:
        int r42 = this.mInterimTargetDx;
        int r22 = r42 - r2;
        int r0 = 0;
        if ((r42 * r22) > 0) goto L9;
        r22 = 0;
    L9:
        this.mInterimTargetDx = r22;
        int r43 = this.mInterimTargetDy;
        int r32 = r43 - r3;
        if ((r43 * r32) <= 0) goto L13;
        r0 = r32;
    L13:
        this.mInterimTargetDy = r0;
        if (r22 != 0) goto L18;
        if (r0 != 0) goto L19;
        updateActionForInterimTarget(r5);
        return;
    L19:
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1164m
    public void onStart() {
    }

    @Override // androidx.recyclerview.widget.AbstractC1164m
    public void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1164m
    @SuppressLint({"UnknownNullness"})
    public void onTargetFound(View r3, C0038Av r4, C1163l r5) {
        int r42 = calculateDxToMakeVisible(r3, getHorizontalSnapPreference());
        int r32 = calculateDyToMakeVisible(r3, getVerticalSnapPreference());
        int r1 = r32 * r32;
        int r0 = calculateTimeForDeceleration((int) Math.sqrt(r1 + (r42 * r42)));
        if (r0 <= 0) goto L6;
        DecelerateInterpolator r12 = this.mDecelerateInterpolator;
        r5.f4048a = -r42;
        r5.f4049b = -r32;
        r5.f4050c = r0;
        r5.f4052e = r12;
        r5.f4053f = true;
        return;
    }

    @SuppressLint({"UnknownNullness"})
    public void updateActionForInterimTarget(C1163l r5) {
        PointF r0 = computeScrollVectorForPosition(getTargetPosition());
        if (r0 != null) goto L5;
    L11:
        r5.f4051d = getTargetPosition();
        stop();
        return;
    L5:
        if (r0.x == 0.0f) goto L7;
    L9:
        normalize(r0);
        this.mTargetVector = r0;
        this.mInterimTargetDx = (int) (r0.x * 10000.0f);
        this.mInterimTargetDy = (int) (r0.y * 10000.0f);
        int r02 = calculateTimeForScrolling(10000);
        int r1 = (int) (this.mInterimTargetDx * TARGET_SEEK_EXTRA_SCROLL_RATIO);
        int r3 = (int) (this.mInterimTargetDy * TARGET_SEEK_EXTRA_SCROLL_RATIO);
        int r03 = (int) (r02 * TARGET_SEEK_EXTRA_SCROLL_RATIO);
        LinearInterpolator r2 = this.mLinearInterpolator;
        r5.f4048a = r1;
        r5.f4049b = r3;
        r5.f4050c = r03;
        r5.f4052e = r2;
        r5.f4053f = true;
        return;
    L7:
        if (r0.y != 0.0f) goto L9;
        goto L9
    }
}
