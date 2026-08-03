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
import androidx.fragment.C1098R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p000a.AbstractC0553e7;
import p000a.ActivityC0422X6;
import p000a.C0181Jg;
import p000a.C0327S1;
import p000a.C0631i9;
import p000a.C0734nh;
import p000a.C0866ug;
import p000a.C0944z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3303d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "La/Wf;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/b;", "F", "getFragment", "()Landroidx/fragment/app/b;", "fragment_release"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final ArrayList f4514a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f4515b;

    /* JADX INFO: renamed from: c */
    public View.OnApplyWindowInsetsListener f4516c;

    /* JADX INFO: renamed from: d */
    public boolean f4517d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        C0631i9.m1482e(context, "context");
        this.f4514a = new ArrayList();
        this.f4515b = new ArrayList();
        this.f4517d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = C1098R.styleable.FragmentContainerView;
            C0631i9.m1481d(iArr, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(C1098R.styleable.FragmentContainerView_android_name);
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
    public final void m2513a(View view) {
        if (this.f4515b.contains(view)) {
            this.f4514a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C0631i9.m1482e(view, "child");
        Object tag = view.getTag(C1098R.id.fragment_container_view_tag);
        if ((tag instanceof ComponentCallbacksC1100b ? (ComponentCallbacksC1100b) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0734nh c0734nhM1690g;
        C0631i9.m1482e(windowInsets, "insets");
        C0734nh c0734nhM1690g2 = C0734nh.m1690g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4516c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            C0631i9.m1481d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c0734nhM1690g = C0734nh.m1690g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            WindowInsets windowInsetsM1695f = c0734nhM1690g2.m1695f();
            if (windowInsetsM1695f != null) {
                WindowInsets windowInsetsM2007b = C0866ug.c.m2007b(this, windowInsetsM1695f);
                if (!windowInsetsM2007b.equals(windowInsetsM1695f)) {
                    c0734nhM1690g2 = C0734nh.m1690g(this, windowInsetsM2007b);
                }
            }
            c0734nhM1690g = c0734nhM1690g2;
        }
        if (!c0734nhM1690g.f2857a.mo1721m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                WindowInsets windowInsetsM1695f2 = c0734nhM1690g.m1695f();
                if (windowInsetsM1695f2 != null) {
                    WindowInsets windowInsetsM2006a = C0866ug.c.m2006a(childAt, windowInsetsM1695f2);
                    if (!windowInsetsM2006a.equals(windowInsetsM1695f2)) {
                        C0734nh.m1690g(childAt, windowInsetsM2006a);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0631i9.m1482e(canvas, "canvas");
        if (this.f4517d) {
            Iterator it = this.f4514a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C0631i9.m1482e(canvas, "canvas");
        C0631i9.m1482e(view, "child");
        if (this.f4517d) {
            ArrayList arrayList = this.f4514a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        C0631i9.m1482e(view, "view");
        this.f4515b.remove(view);
        if (this.f4514a.remove(view)) {
            this.f4517d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends ComponentCallbacksC1100b> F getFragment() {
        ActivityC0422X6 activityC0422X6;
        ComponentCallbacksC1100b componentCallbacksC1100b;
        AbstractC0553e7 supportFragmentManager;
        View view = this;
        while (true) {
            activityC0422X6 = null;
            if (view == null) {
                componentCallbacksC1100b = null;
                break;
            }
            Object tag = view.getTag(C1098R.id.fragment_container_view_tag);
            componentCallbacksC1100b = tag instanceof ComponentCallbacksC1100b ? (ComponentCallbacksC1100b) tag : null;
            if (componentCallbacksC1100b != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (componentCallbacksC1100b == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof ActivityC0422X6) {
                    activityC0422X6 = (ActivityC0422X6) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activityC0422X6 == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = activityC0422X6.getSupportFragmentManager();
        } else {
            if (!componentCallbacksC1100b.m2536i()) {
                throw new IllegalStateException("The Fragment " + componentCallbacksC1100b + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = componentCallbacksC1100b.m2530c();
        }
        return (F) supportFragmentManager.m1337C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C0631i9.m1482e(windowInsets, "insets");
        return windowInsets;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
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
                C0631i9.m1481d(childAt, "view");
                m2513a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        C0631i9.m1482e(view, "view");
        m2513a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C0631i9.m1481d(childAt, "view");
        m2513a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        C0631i9.m1482e(view, "view");
        m2513a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C0631i9.m1481d(childAt, "view");
            m2513a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C0631i9.m1481d(childAt, "view");
            m2513a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f4517d = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        C0631i9.m1482e(listener, "listener");
        this.f4516c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        C0631i9.m1482e(view, "view");
        if (view.getParent() == this) {
            this.f4515b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, AbstractC0553e7 abstractC0553e7) {
        View view;
        super(context, attributeSet);
        C0631i9.m1482e(context, "context");
        C0631i9.m1482e(attributeSet, "attrs");
        this.f4514a = new ArrayList();
        this.f4515b = new ArrayList();
        this.f4517d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = C1098R.styleable.FragmentContainerView;
        C0631i9.m1481d(iArr, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(C1098R.styleable.FragmentContainerView_android_name) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(C1098R.styleable.FragmentContainerView_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        ComponentCallbacksC1100b componentCallbacksC1100bM1337C = abstractC0553e7.m1337C(id);
        if (classAttribute != null && componentCallbacksC1100bM1337C == null) {
            if (id == -1) {
                throw new IllegalStateException(C0944z.m2227g("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C1102d c1102dM1340G = abstractC0553e7.m1340G();
            context.getClassLoader();
            ComponentCallbacksC1100b componentCallbacksC1100bMo1391a = c1102dM1340G.mo1391a(classAttribute);
            C0631i9.m1481d(componentCallbacksC1100bMo1391a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            componentCallbacksC1100bMo1391a.f4580x = id;
            componentCallbacksC1100bMo1391a.f4581y = id;
            componentCallbacksC1100bMo1391a.f4582z = string;
            componentCallbacksC1100bMo1391a.f4576t = abstractC0553e7;
            ActivityC0422X6.a aVar = abstractC0553e7.f2079v;
            componentCallbacksC1100bMo1391a.f4577u = aVar;
            componentCallbacksC1100bMo1391a.f4541E = true;
            if ((aVar == null ? null : aVar.f1722a) != null) {
                componentCallbacksC1100bMo1391a.f4541E = true;
            }
            C0327S1 c0327s1 = new C0327S1(abstractC0553e7);
            c0327s1.f3014o = true;
            componentCallbacksC1100bMo1391a.f4542F = this;
            componentCallbacksC1100bMo1391a.f4572p = true;
            c0327s1.m905e(getId(), componentCallbacksC1100bMo1391a, string, 1);
            if (!c0327s1.f3006g) {
                c0327s1.f1161q.m1335A(c0327s1, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        for (C1103e c1103e : abstractC0553e7.f2060c.m25e()) {
            ComponentCallbacksC1100b componentCallbacksC1100b = c1103e.f4607c;
            if (componentCallbacksC1100b.f4581y == getId() && (view = componentCallbacksC1100b.f4543G) != null && view.getParent() == null) {
                componentCallbacksC1100b.f4542F = this;
                c1103e.m2546b();
                c1103e.m2555k();
            }
        }
    }
}
