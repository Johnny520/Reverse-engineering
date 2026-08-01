package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.AbstractC0799uy;
import p000.AbstractComponentCallbacksC0489ml;
import p000.ja0;
import p000.w90;
import p000.wc0;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ArrayList f500a;

    /* JADX INFO: renamed from: b */
    public ArrayList f501b;

    /* JADX INFO: renamed from: c */
    public View.OnApplyWindowInsetsListener f502c;

    /* JADX INFO: renamed from: d */
    public boolean f503d;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        this.f503d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0799uy.f4783b);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m253a(View view) {
        ArrayList arrayList = this.f501b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f500a == null) {
            this.f500a = new ArrayList();
        }
        this.f500a.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0489ml ? (AbstractComponentCallbacksC0489ml) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0489ml ? (AbstractComponentCallbacksC0489ml) tag : null) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        wc0 wc0VarM2563g;
        wc0 wc0VarM2563g2 = wc0.m2563g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f502c;
        if (onApplyWindowInsetsListener != null) {
            wc0VarM2563g = wc0.m2563g(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = ja0.f2600a;
            WindowInsets windowInsetsM2568f = wc0VarM2563g2.m2568f();
            if (windowInsetsM2568f != null) {
                WindowInsets windowInsetsM2551b = w90.m2551b(this, windowInsetsM2568f);
                if (!windowInsetsM2551b.equals(windowInsetsM2568f)) {
                    wc0VarM2563g2 = wc0.m2563g(this, windowInsetsM2551b);
                }
            }
            wc0VarM2563g = wc0VarM2563g2;
        }
        if (!wc0VarM2563g.f4955a.mo2015m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = ja0.f2600a;
                WindowInsets windowInsetsM2568f2 = wc0VarM2563g.m2568f();
                if (windowInsetsM2568f2 != null) {
                    WindowInsets windowInsetsM2550a = w90.m2550a(childAt, windowInsetsM2568f2);
                    if (!windowInsetsM2550a.equals(windowInsetsM2568f2)) {
                        wc0.m2563g(childAt, windowInsetsM2550a);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f503d && this.f500a != null) {
            for (int i = 0; i < this.f500a.size(); i++) {
                super.drawChild(canvas, (View) this.f500a.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList arrayList;
        if (!this.f503d || (arrayList = this.f500a) == null || arrayList.size() <= 0 || !this.f500a.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f501b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f500a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f503d = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m253a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        if (z) {
            m253a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        m253a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        m253a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        m253a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m253a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m253a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f503d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f502c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f501b == null) {
                this.f501b = new ArrayList();
            }
            this.f501b.add(view);
        }
        super.startViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }
}
