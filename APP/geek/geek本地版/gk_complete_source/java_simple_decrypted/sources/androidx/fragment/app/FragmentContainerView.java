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
import defpackage.ja0;
import defpackage.ml;
import defpackage.uy;
import defpackage.w90;
import defpackage.wc0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public ArrayList a;
    public ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    public FragmentContainerView(Context r4, AttributeSet r5) {
        super(r4, r5, 0);
        this.d = true;
        if (r5 == null) goto L15;
        String r1 = r5.getClassAttribute();
        TypedArray r42 = r4.obtainStyledAttributes(r5, uy.b);
        if (r1 != null) goto L7;
        r1 = r42.getString(0);
        String r52 = "android:name";
    L8:
        r42.recycle();
        if (r1 != null) goto L11;
        return;
    L11:
        if (isInEditMode() == false) goto L14;
        return;
    L14:
        throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + r52 + "=\"" + r1 + "\"");
    L7:
        r52 = "class";
        goto L8
    }

    public final void a(View r2) {
        ArrayList r0 = this.b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.contains(r2) == true) goto L7;
        return;
    L7:
        if (this.a != null) goto L9;
        this.a = new ArrayList();
    L9:
        this.a.add(r2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View r3, int r4, ViewGroup.LayoutParams r5) {
        Object r0 = r3.getTag(R.id.fragment_container_view_tag);
        if ((r0 instanceof ml) == false) goto L5;
        ml r02 = (ml) r0;
    L6:
        if (r02 == null) goto L10;
        super.addView(r3, r4, r5);
        return;
    L10:
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + r3 + " is not associated with a Fragment.");
    L5:
        r02 = null;
        goto L6
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View r3, int r4, ViewGroup.LayoutParams r5, boolean r6) {
        Object r0 = r3.getTag(R.id.fragment_container_view_tag);
        if ((r0 instanceof ml) == false) goto L5;
        ml r02 = (ml) r0;
    L6:
        if (r02 == null) goto L10;
        return super.addViewInLayout(r3, r4, r5, r6);
    L10:
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + r3 + " is not associated with a Fragment.");
    L5:
        r02 = null;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets r7) {
        wc0 r1 = wc0.g(null, r7);
        View.OnApplyWindowInsetsListener r2 = this.c;
        if (r2 == null) goto L5;
        wc0 r0 = wc0.g(null, r2.onApplyWindowInsets(this, r7));
    L12:
        if (r0.a.m() == true) goto L21;
        int r12 = getChildCount();
        int r22 = 0;
    L14:
        if (r22 >= r12) goto L21;
        View r3 = getChildAt(r22);
        WeakHashMap r4 = ja0.a;
        WindowInsets r42 = r0.f();
        if (r42 == null) goto L20;
        WindowInsets r5 = w90.a(r3, r42);
        if (r5.equals(r42) == true) goto L20;
        wc0.g(r3, r5);
    L20:
        r22 = r22 + 1;
    L21:
        return r7;
    L5:
        WeakHashMap r02 = ja0.a;
        WindowInsets r03 = r1.f();
        if (r03 == null) goto L10;
        WindowInsets r23 = w90.b(this, r03);
        if (r23.equals(r03) == true) goto L10;
        r1 = wc0.g(this, r23);
    L10:
        r0 = r1;
        goto L12
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r5) {
        if (this.d == true) goto L5;
    L10:
        super.dispatchDraw(r5);
        return;
    L5:
        if (this.a == null) goto L10;
        int r0 = 0;
    L8:
        if (r0 >= this.a.size()) goto L10;
        super.drawChild(r5, (View) this.a.get(r0), getDrawingTime());
        r0 = r0 + 1;
        goto L8
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas r2, View r3, long r4) {
        if (this.d == false) goto L13;
        ArrayList r0 = this.a;
        if (r0 == null) goto L13;
        if (r0.size() <= 0) goto L13;
        if (this.a.contains(r3) == false) goto L13;
        return false;
    L13:
        return super.drawChild(r2, r3, r4);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View r2) {
        ArrayList r0 = this.b;
        if (r0 == null) goto L9;
        r0.remove(r2);
        ArrayList r02 = this.a;
        if (r02 == null) goto L9;
        if (r02.remove(r2) == false) goto L9;
        this.d = true;
    L9:
        super.endViewTransition(r2);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int r0 = getChildCount() - 1;
    L3:
        if (r0 < 0) goto L5;
        a(getChildAt(r0));
        r0 = r0 - 1;
        goto L3
    L5:
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View r1, boolean r2) {
        if (r2 == false) goto L4;
        a(r1);
    L4:
        super.removeDetachedView(r1, r2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View r1) {
        a(r1);
        super.removeView(r1);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int r2) {
        a(getChildAt(r2));
        super.removeViewAt(r2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View r1) {
        a(r1);
        super.removeViewInLayout(r1);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int r3, int r4) {
        int r0 = r3;
    L4:
        if (r0 >= (r3 + r4)) goto L6;
        a(getChildAt(r0));
        r0 = r0 + 1;
        goto L4
    L6:
        super.removeViews(r3, r4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int r3, int r4) {
        int r0 = r3;
    L4:
        if (r0 >= (r3 + r4)) goto L6;
        a(getChildAt(r0));
        r0 = r0 + 1;
        goto L4
    L6:
        super.removeViewsInLayout(r3, r4);
    }

    public void setDrawDisappearingViewsLast(boolean r1) {
        this.d = r1;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition r2) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener r1) {
        this.c = r1;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View r2) {
        if (r2.getParent() == this) goto L5;
    L8:
        super.startViewTransition(r2);
        return;
    L5:
        if (this.b != null) goto L7;
        this.b = new ArrayList();
    L7:
        this.b.add(r2);
        goto L8
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets r1) {
        return r1;
    }
}
