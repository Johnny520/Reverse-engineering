package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.p055lu.wxmask272.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p099y.AbstractC1048L;
import p099y.AbstractC1094z;
import p099y.C1075g0;

/* JADX INFO: renamed from: androidx.fragment.app.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0439q extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public ArrayList f1404b;

    /* JADX INFO: renamed from: c */
    public ArrayList f1405c;

    /* JADX INFO: renamed from: d */
    public View.OnApplyWindowInsetsListener f1406d;

    /* JADX INFO: renamed from: e */
    public boolean f1407e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m851a(View view) {
        ArrayList arrayList = this.f1405c;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f1404b == null) {
            this.f1404b = new ArrayList();
        }
        this.f1404b.add(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0434l ? (AbstractComponentCallbacksC0434l) tag : null) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0434l ? (AbstractComponentCallbacksC0434l) tag : null) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z2);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C1075g0 c1075g0M2342c;
        C1075g0 c1075g0M2342c2 = C1075g0.m2342c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1406d;
        if (onApplyWindowInsetsListener != null) {
            c1075g0M2342c = C1075g0.m2342c(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), null);
        } else {
            WeakHashMap weakHashMap = AbstractC1048L.f3662a;
            WindowInsets windowInsetsM2343b = c1075g0M2342c2.m2343b();
            if (windowInsetsM2343b != null) {
                WindowInsets windowInsetsM2365b = AbstractC1094z.m2365b(this, windowInsetsM2343b);
                if (!windowInsetsM2365b.equals(windowInsetsM2343b)) {
                    c1075g0M2342c2 = C1075g0.m2342c(windowInsetsM2365b, this);
                }
            }
            c1075g0M2342c = c1075g0M2342c2;
        }
        if (!c1075g0M2342c.f3705a.mo2325i()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                WeakHashMap weakHashMap2 = AbstractC1048L.f3662a;
                WindowInsets windowInsetsM2343b2 = c1075g0M2342c.m2343b();
                if (windowInsetsM2343b2 != null) {
                    WindowInsets windowInsetsM2364a = AbstractC1094z.m2364a(childAt, windowInsetsM2343b2);
                    if (!windowInsetsM2364a.equals(windowInsetsM2343b2)) {
                        C1075g0.m2342c(windowInsetsM2364a, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f1407e && this.f1404b != null) {
            for (int i2 = 0; i2 < this.f1404b.size(); i2++) {
                super.drawChild(canvas, (View) this.f1404b.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList arrayList;
        if (!this.f1407e || (arrayList = this.f1404b) == null || arrayList.size() <= 0 || !this.f1404b.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f1405c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f1404b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1407e = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m851a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        if (z2) {
            m851a(view);
        }
        super.removeDetachedView(view, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        m851a(view);
        super.removeView(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void removeViewAt(int i2) {
        m851a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        m851a(view);
        super.removeViewInLayout(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            m851a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            m851a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setDrawDisappearingViewsLast(boolean z2) {
        this.f1407e = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1406d = onApplyWindowInsetsListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1405c == null) {
                this.f1405c = new ArrayList();
            }
            this.f1405c.add(view);
        }
        super.startViewTransition(view);
    }
}
