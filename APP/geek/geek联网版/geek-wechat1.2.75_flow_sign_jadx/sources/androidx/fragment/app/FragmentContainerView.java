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
import p000.AbstractC0085bz;
import p000.AbstractComponentCallbacksC0563ol;
import p000.ba0;
import p000.bd0;
import p000.oa0;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ArrayList f463a;

    /* JADX INFO: renamed from: b */
    public ArrayList f464b;

    /* JADX INFO: renamed from: c */
    public View.OnApplyWindowInsetsListener f465c;

    /* JADX INFO: renamed from: d */
    public boolean f466d;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        this.f466d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0085bz.f791b);
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
    public final void m238a(View view) {
        ArrayList arrayList = this.f464b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f463a == null) {
            this.f463a = new ArrayList();
        }
        this.f463a.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0563ol ? (AbstractComponentCallbacksC0563ol) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0563ol ? (AbstractComponentCallbacksC0563ol) tag : null) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        bd0 bd0VarM515g;
        bd0 bd0VarM515g2 = bd0.m515g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f465c;
        if (onApplyWindowInsetsListener != null) {
            bd0VarM515g = bd0.m515g(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = oa0.f3426a;
            WindowInsets windowInsetsM520f = bd0VarM515g2.m520f();
            if (windowInsetsM520f != null) {
                WindowInsets windowInsetsM505b = ba0.m505b(this, windowInsetsM520f);
                if (!windowInsetsM505b.equals(windowInsetsM520f)) {
                    bd0VarM515g2 = bd0.m515g(this, windowInsetsM505b);
                }
            }
            bd0VarM515g = bd0VarM515g2;
        }
        if (!bd0VarM515g.f724a.mo2411m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = oa0.f3426a;
                WindowInsets windowInsetsM520f2 = bd0VarM515g.m520f();
                if (windowInsetsM520f2 != null) {
                    WindowInsets windowInsetsM504a = ba0.m504a(childAt, windowInsetsM520f2);
                    if (!windowInsetsM504a.equals(windowInsetsM520f2)) {
                        bd0.m515g(childAt, windowInsetsM504a);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f466d && this.f463a != null) {
            for (int i = 0; i < this.f463a.size(); i++) {
                super.drawChild(canvas, (View) this.f463a.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList arrayList;
        if (!this.f466d || (arrayList = this.f463a) == null || arrayList.size() <= 0 || !this.f463a.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f464b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f463a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f466d = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m238a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        if (z) {
            m238a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        m238a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        m238a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        m238a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m238a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m238a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f466d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f465c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f464b == null) {
                this.f464b = new ArrayList();
            }
            this.f464b.add(view);
        }
        super.startViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }
}
