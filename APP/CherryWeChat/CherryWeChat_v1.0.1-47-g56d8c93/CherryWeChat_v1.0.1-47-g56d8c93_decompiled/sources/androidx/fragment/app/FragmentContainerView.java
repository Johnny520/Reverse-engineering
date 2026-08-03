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
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractActivityC2148ki;
import p000.AbstractC0767Ru;
import p000.AbstractC2185lE;
import p000.AbstractC2374ph;
import p000.AbstractC2805zi;
import p000.AbstractComponentCallbacksC1503hi;
import p000.C0326Hi;
import p000.C0489LF;
import p000.C1483h5;
import p000.C2104ji;
import p000.C2547ti;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final ArrayList f3960a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f3961b;

    /* JADX INFO: renamed from: c */
    public View.OnApplyWindowInsetsListener f3962c;

    /* JADX INFO: renamed from: d */
    public boolean f3963d;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        this.f3960a = new ArrayList();
        this.f3961b = new ArrayList();
        this.f3963d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0767Ru.f2439b, 0, 0);
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
    public final void m2166a(View view) {
        if (this.f3961b.contains(view)) {
            this.f3960a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC1503hi ? (AbstractComponentCallbacksC1503hi) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0489LF c0489lfM939h = C0489LF.m939h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3962c;
        C0489LF c0489lfM939h2 = onApplyWindowInsetsListener != null ? C0489LF.m939h(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : AbstractC2185lE.m4394g(this, c0489lfM939h);
        if (!c0489lfM939h2.f1602a.mo94n()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                AbstractC2185lE.m4389b(getChildAt(i), c0489lfM939h2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f3963d) {
            Iterator it = this.f3960a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.f3963d) {
            ArrayList arrayList = this.f3960a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        this.f3961b.remove(view);
        if (this.f3960a.remove(view)) {
            this.f3963d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC1503hi> F getFragment() {
        AbstractActivityC2148ki abstractActivityC2148ki;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi;
        AbstractC2805zi supportFragmentManager;
        View view = this;
        while (true) {
            abstractActivityC2148ki = null;
            if (view == null) {
                abstractComponentCallbacksC1503hi = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC1503hi = tag instanceof AbstractComponentCallbacksC1503hi ? (AbstractComponentCallbacksC1503hi) tag : null;
            if (abstractComponentCallbacksC1503hi != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC1503hi == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC2148ki) {
                    abstractActivityC2148ki = (AbstractActivityC2148ki) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC2148ki == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = abstractActivityC2148ki.getSupportFragmentManager();
        } else {
            if (!abstractComponentCallbacksC1503hi.m2875i()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC1503hi + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = abstractComponentCallbacksC1503hi.m2869c();
        }
        return (F) supportFragmentManager.m5379B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
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
            }
            m2166a(getChildAt(childCount));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        m2166a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        m2166a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        m2166a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m2166a(getChildAt(i4));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m2166a(getChildAt(i4));
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f3963d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f3962c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            this.f3961b.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, AbstractC2805zi abstractC2805zi) {
        View view;
        super(context, attributeSet);
        this.f3960a = new ArrayList();
        this.f3961b = new ArrayList();
        this.f3963d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0767Ru.f2439b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hiM5379B = abstractC2805zi.m5379B(id);
        if (classAttribute != null && abstractComponentCallbacksC1503hiM5379B == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC2374ph.m4814k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C2547ti c2547tiM5382E = abstractC2805zi.m5382E();
            context.getClassLoader();
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hiM5033a = c2547tiM5382E.m5033a(classAttribute);
            abstractComponentCallbacksC1503hiM5033a.f5294C = true;
            C2104ji c2104ji = abstractComponentCallbacksC1503hiM5033a.f5328s;
            if ((c2104ji == null ? null : c2104ji.f7400l) != null) {
                abstractComponentCallbacksC1503hiM5033a.f5294C = true;
            }
            C1483h5 c1483h5 = new C1483h5(abstractC2805zi);
            c1483h5.f5250o = true;
            abstractComponentCallbacksC1503hiM5033a.f5295D = this;
            c1483h5.m2842e(getId(), abstractComponentCallbacksC1503hiM5033a, string, 1);
            if (!c1483h5.f5242g) {
                c1483h5.f5251p.m5428z(c1483h5, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        for (C0326Hi c0326Hi : abstractC2805zi.f9494c.m4879q()) {
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c0326Hi.f1110c;
            if (abstractComponentCallbacksC1503hi.f5332w == getId() && (view = abstractComponentCallbacksC1503hi.f5296E) != null && view.getParent() == null) {
                abstractComponentCallbacksC1503hi.f5295D = this;
                c0326Hi.m695b();
            }
        }
    }
}
