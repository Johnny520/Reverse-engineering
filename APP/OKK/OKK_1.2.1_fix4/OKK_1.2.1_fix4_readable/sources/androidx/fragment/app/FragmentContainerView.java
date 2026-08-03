package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0068E;
import p006D.AbstractC0080Q;
import p006D.C0122q0;
import p027O.AbstractC0272a;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1408a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1409b;

    /* JADX INFO: renamed from: c */
    public View.OnApplyWindowInsetsListener f1410c;

    /* JADX INFO: renamed from: d */
    public boolean f1411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        AbstractC0307g.m703e(context, "context");
        this.f1408a = new ArrayList();
        this.f1409b = new ArrayList();
        this.f1411d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0272a.f569a, 0, 0);
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
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1223a(View view) {
        if (this.f1409b.contains(view)) {
            this.f1408a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        AbstractC0307g.m703e(view, "child");
        Object tag = view.getTag(C1031R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0505e ? (AbstractComponentCallbacksC0505e) tag : null) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0122q0 c0122q0M429d;
        AbstractC0307g.m703e(windowInsets, "insets");
        C0122q0 c0122q0M429d2 = C0122q0.m429d(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1410c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC0307g.m702d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c0122q0M429d = C0122q0.m429d(null, windowInsetsOnApplyWindowInsets);
        } else {
            Field field = AbstractC0080Q.f219a;
            WindowInsets windowInsetsM431c = c0122q0M429d2.m431c();
            if (windowInsetsM431c != null) {
                WindowInsets windowInsetsM209b = AbstractC0068E.m209b(this, windowInsetsM431c);
                if (!windowInsetsM209b.equals(windowInsetsM431c)) {
                    c0122q0M429d2 = C0122q0.m429d(this, windowInsetsM209b);
                }
            }
            c0122q0M429d = c0122q0M429d2;
        }
        if (!c0122q0M429d.f309a.mo392m()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                Field field2 = AbstractC0080Q.f219a;
                WindowInsets windowInsetsM431c2 = c0122q0M429d.m431c();
                if (windowInsetsM431c2 != null) {
                    WindowInsets windowInsetsM208a = AbstractC0068E.m208a(childAt, windowInsetsM431c2);
                    if (!windowInsetsM208a.equals(windowInsetsM431c2)) {
                        C0122q0.m429d(childAt, windowInsetsM208a);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC0307g.m703e(canvas, "canvas");
        if (this.f1411d) {
            Iterator it = this.f1408a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        AbstractC0307g.m703e(canvas, "canvas");
        AbstractC0307g.m703e(view, "child");
        if (this.f1411d) {
            ArrayList arrayList = this.f1408a;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC0307g.m703e(view, "view");
        this.f1409b.remove(view);
        if (this.f1408a.remove(view)) {
            this.f1411d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0505e> F getFragment() {
        AbstractComponentCallbacksC0505e abstractComponentCallbacksC0505e;
        View view = this;
        while (true) {
            abstractComponentCallbacksC0505e = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(C1031R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC0505e abstractComponentCallbacksC0505e2 = tag instanceof AbstractComponentCallbacksC0505e ? (AbstractComponentCallbacksC0505e) tag : null;
            if (abstractComponentCallbacksC0505e2 != null) {
                abstractComponentCallbacksC0505e = abstractComponentCallbacksC0505e2;
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0505e != null) {
            throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0505e + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
        }
        throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC0307g.m703e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                AbstractC0307g.m702d(childAt, "view");
                m1223a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC0307g.m703e(view, "view");
        m1223a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i2) {
        View childAt = getChildAt(i2);
        AbstractC0307g.m702d(childAt, "view");
        m1223a(childAt);
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC0307g.m703e(view, "view");
        m1223a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            AbstractC0307g.m702d(childAt, "view");
            m1223a(childAt);
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            AbstractC0307g.m702d(childAt, "view");
            m1223a(childAt);
        }
        super.removeViewsInLayout(i2, i3);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.f1411d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC0307g.m703e(onApplyWindowInsetsListener, "listener");
        this.f1410c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC0307g.m703e(view, "view");
        if (view.getParent() == this) {
            this.f1409b.add(view);
        }
        super.startViewTransition(view);
    }
}
