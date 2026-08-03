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

    public FragmentContainerView(Context r4, AttributeSet r5) {
        AbstractC0307g.m703e(r4, "context");
        super(r4, r5, 0);
        this.f1408a = new ArrayList();
        this.f1409b = new ArrayList();
        this.f1411d = true;
        if (r5 == null) goto L15;
        String r1 = r5.getClassAttribute();
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0272a.f569a, 0, 0);
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
        throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + r52 + "=\"" + r1 + '\"');
    L7:
        r52 = "class";
        goto L8
    }

    /* JADX INFO: renamed from: a */
    public final void m1223a(View r2) {
        if (this.f1409b.contains(r2) == false) goto L6;
        this.f1408a.add(r2);
        return;
    }

    @Override // android.view.ViewGroup
    public final void addView(View r3, int r4, ViewGroup.LayoutParams r5) {
        AbstractC0307g.m703e(r3, "child");
        Object r02 = r3.getTag(C1031R.id.fragment_container_view_tag);
        if ((r02 instanceof AbstractComponentCallbacksC0505e) == false) goto L5;
        AbstractComponentCallbacksC0505e r03 = (AbstractComponentCallbacksC0505e) r02;
    L6:
        if (r03 == null) goto L10;
        super.addView(r3, r4, r5);
        return;
    L10:
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + r3 + " is not associated with a Fragment.").toString());
    L5:
        r03 = null;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets r7) {
        AbstractC0307g.m703e(r7, "insets");
        C0122q0 r1 = C0122q0.m429d(null, r7);
        View.OnApplyWindowInsetsListener r2 = this.f1410c;
        if (r2 == null) goto L5;
        WindowInsets r12 = r2.onApplyWindowInsets(this, r7);
        AbstractC0307g.m702d(r12, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
        C0122q0 r02 = C0122q0.m429d(null, r12);
    L12:
        if (r02.f309a.mo392m() == true) goto L21;
        int r13 = getChildCount();
        int r22 = 0;
    L14:
        if (r22 >= r13) goto L21;
        View r3 = getChildAt(r22);
        Field r4 = AbstractC0080Q.f219a;
        WindowInsets r42 = r02.m431c();
        if (r42 == null) goto L20;
        WindowInsets r5 = AbstractC0068E.m208a(r3, r42);
        if (r5.equals(r42) == true) goto L20;
        C0122q0.m429d(r3, r5);
    L20:
        r22 = r22 + 1;
    L21:
        return r7;
    L5:
        Field r03 = AbstractC0080Q.f219a;
        WindowInsets r04 = r1.m431c();
        if (r04 == null) goto L10;
        WindowInsets r23 = AbstractC0068E.m209b(this, r04);
        if (r23.equals(r04) == true) goto L10;
        r1 = C0122q0.m429d(this, r23);
    L10:
        r02 = r1;
        goto L12
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r5) {
        AbstractC0307g.m703e(r5, "canvas");
        if (this.f1411d == false) goto L8;
        Iterator r02 = this.f1408a.iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        super.drawChild(r5, (View) r02.next(), getDrawingTime());
    L8:
        super.dispatchDraw(r5);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas r3, View r4, long r5) {
        AbstractC0307g.m703e(r3, "canvas");
        AbstractC0307g.m703e(r4, "child");
        if (this.f1411d == false) goto L11;
        ArrayList r02 = this.f1408a;
        if ((!r02.isEmpty()) == false) goto L11;
        if (r02.contains(r4) == false) goto L11;
        return false;
    L11:
        return super.drawChild(r3, r4, r5);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View r2) {
        AbstractC0307g.m703e(r2, "view");
        this.f1409b.remove(r2);
        if (this.f1408a.remove(r2) == false) goto L5;
        this.f1411d = true;
    L5:
        super.endViewTransition(r2);
    }

    public final <F extends AbstractComponentCallbacksC0505e> F getFragment() {
        View r02 = this;
    L3:
        AbstractComponentCallbacksC0505e r1 = null;
        if (r02 == null) goto L15;
        Object r2 = r02.getTag(C1031R.id.fragment_container_view_tag);
        if ((r2 instanceof AbstractComponentCallbacksC0505e) == false) goto L8;
        AbstractComponentCallbacksC0505e r22 = (AbstractComponentCallbacksC0505e) r2;
    L9:
        if (r22 != null) goto L10;
        Object r03 = r02.getParent();
        if ((r03 instanceof View) == true) goto L13;
        r02 = null;
        goto L3
    L13:
        r02 = (View) r03;
        goto L3
    L10:
        r1 = r22;
        goto L15
    L8:
        r22 = null;
    L15:
        if (r1 != null) goto L23;
        Context r04 = getContext();
    L18:
        if ((r04 instanceof ContextWrapper) == false) goto L21;
        r04 = ((ContextWrapper) r04).getBaseContext();
        goto L18
    L21:
        throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
    L23:
        throw new IllegalStateException("The Fragment " + r1 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets r2) {
        AbstractC0307g.m703e(r2, "insets");
        return r2;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int r02 = getChildCount();
    L3:
        r02 = r02 - 1;
        if ((-1) >= r02) goto L6;
        View r1 = getChildAt(r02);
        AbstractC0307g.m702d(r1, "view");
        m1223a(r1);
        goto L3
    L6:
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View r2) {
        AbstractC0307g.m703e(r2, "view");
        m1223a(r2);
        super.removeView(r2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int r3) {
        View r02 = getChildAt(r3);
        AbstractC0307g.m702d(r02, "view");
        m1223a(r02);
        super.removeViewAt(r3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View r2) {
        AbstractC0307g.m703e(r2, "view");
        m1223a(r2);
        super.removeViewInLayout(r2);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int r5, int r6) {
        int r02 = r5 + r6;
        int r1 = r5;
    L3:
        if (r1 >= r02) goto L5;
        View r2 = getChildAt(r1);
        AbstractC0307g.m702d(r2, "view");
        m1223a(r2);
        r1 = r1 + 1;
        goto L3
    L5:
        super.removeViews(r5, r6);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int r5, int r6) {
        int r02 = r5 + r6;
        int r1 = r5;
    L3:
        if (r1 >= r02) goto L5;
        View r2 = getChildAt(r1);
        AbstractC0307g.m702d(r2, "view");
        m1223a(r2);
        r1 = r1 + 1;
        goto L3
    L5:
        super.removeViewsInLayout(r5, r6);
    }

    public final void setDrawDisappearingViewsLast(boolean r1) {
        this.f1411d = r1;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition r2) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener r2) {
        AbstractC0307g.m703e(r2, "listener");
        this.f1410c = r2;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View r2) {
        AbstractC0307g.m703e(r2, "view");
        if (r2.getParent() != this) goto L5;
        this.f1409b.add(r2);
    L5:
        super.startViewTransition(r2);
    }
}
