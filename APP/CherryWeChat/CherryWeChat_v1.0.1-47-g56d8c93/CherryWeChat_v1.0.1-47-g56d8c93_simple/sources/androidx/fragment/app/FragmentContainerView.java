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
import p000.AbstractActivityC1244c3;
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

    public FragmentContainerView(Context r4, AttributeSet r5) {
        super(r4, r5, 0);
        this.f3960a = new ArrayList();
        this.f3961b = new ArrayList();
        this.f3963d = true;
        if (r5 == null) goto L15;
        String r1 = r5.getClassAttribute();
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC0767Ru.f2439b, 0, 0);
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
    public final void m2166a(View r2) {
        if (this.f3961b.contains(r2) == false) goto L6;
        this.f3960a.add(r2);
        return;
    }

    @Override // android.view.ViewGroup
    public final void addView(View r3, int r4, ViewGroup.LayoutParams r5) {
        Object r0 = r3.getTag(R.id.fragment_container_view_tag);
        if ((r0 instanceof AbstractComponentCallbacksC1503hi) == false) goto L5;
        AbstractComponentCallbacksC1503hi r02 = (AbstractComponentCallbacksC1503hi) r0;
    L6:
        if (r02 == null) goto L10;
        super.addView(r3, r4, r5);
        return;
    L10:
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + r3 + " is not associated with a Fragment.").toString());
    L5:
        r02 = null;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets r5) {
        C0489LF r1 = C0489LF.m939h(null, r5);
        View.OnApplyWindowInsetsListener r2 = this.f3962c;
        if (r2 == null) goto L5;
        C0489LF r0 = C0489LF.m939h(null, r2.onApplyWindowInsets(this, r5));
    L7:
        if (r0.f1602a.mo94n() == true) goto L11;
        int r12 = getChildCount();
        int r22 = 0;
    L9:
        if (r22 >= r12) goto L11;
        AbstractC2185lE.m4389b(getChildAt(r22), r0);
        r22 = r22 + 1;
    L11:
        return r5;
    L5:
        r0 = AbstractC2185lE.m4394g(this, r1);
        goto L7
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r5) {
        if (this.f3963d == false) goto L8;
        Iterator r0 = this.f3960a.iterator();
    L6:
        if (r0.hasNext() == false) goto L8;
        super.drawChild(r5, (View) r0.next(), getDrawingTime());
    L8:
        super.dispatchDraw(r5);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas r3, View r4, long r5) {
        if (this.f3963d == false) goto L11;
        ArrayList r0 = this.f3960a;
        if (r0.isEmpty() == true) goto L11;
        if (r0.contains(r4) == false) goto L11;
        return false;
    L11:
        return super.drawChild(r3, r4, r5);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View r2) {
        this.f3961b.remove(r2);
        if (this.f3960a.remove(r2) == false) goto L5;
        this.f3963d = true;
    L5:
        super.endViewTransition(r2);
    }

    public final <F extends AbstractComponentCallbacksC1503hi> F getFragment() {
        View r0 = this;
    L3:
        AbstractActivityC2148ki r1 = null;
        if (r0 == null) goto L15;
        Object r2 = r0.getTag(R.id.fragment_container_view_tag);
        if ((r2 instanceof AbstractComponentCallbacksC1503hi) == false) goto L8;
        AbstractComponentCallbacksC1503hi r22 = (AbstractComponentCallbacksC1503hi) r2;
    L9:
        if (r22 != null) goto L16;
        Object r02 = r0.getParent();
        if ((r02 instanceof View) == true) goto L13;
        r0 = null;
        goto L3
    L13:
        r0 = (View) r02;
    L16:
        if (r22 != null) goto L18;
        Context r03 = getContext();
    L24:
        if ((r03 instanceof ContextWrapper) == false) goto L29;
        if ((r03 instanceof AbstractActivityC2148ki) == true) goto L27;
        r03 = ((ContextWrapper) r03).getBaseContext();
        goto L24
    L27:
        r1 = (AbstractActivityC2148ki) r03;
    L29:
        if (r1 == null) goto L34;
        AbstractC2805zi r04 = r1.getSupportFragmentManager();
    L32:
        return (F) r04.m5379B(getId());
    L34:
        throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
    L18:
        if (r22.m2875i() == false) goto L21;
        r04 = r22.m2869c();
        goto L32
    L21:
        throw new IllegalStateException("The Fragment " + r22 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
    L8:
        r22 = null;
        goto L9
    L15:
        r22 = null;
        goto L16
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets r1) {
        return r1;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int r0 = getChildCount();
    L3:
        r0 = r0 - 1;
        if ((-1) >= r0) goto L6;
        m2166a(getChildAt(r0));
        goto L3
    L6:
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View r1) {
        m2166a(r1);
        super.removeView(r1);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int r2) {
        m2166a(getChildAt(r2));
        super.removeViewAt(r2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View r1) {
        m2166a(r1);
        super.removeViewInLayout(r1);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int r4, int r5) {
        int r0 = r4 + r5;
        int r1 = r4;
    L3:
        if (r1 >= r0) goto L5;
        m2166a(getChildAt(r1));
        r1 = r1 + 1;
        goto L3
    L5:
        super.removeViews(r4, r5);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int r4, int r5) {
        int r0 = r4 + r5;
        int r1 = r4;
    L3:
        if (r1 >= r0) goto L5;
        m2166a(getChildAt(r1));
        r1 = r1 + 1;
        goto L3
    L5:
        super.removeViewsInLayout(r4, r5);
    }

    public final void setDrawDisappearingViewsLast(boolean r1) {
        this.f3963d = r1;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition r2) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener r1) {
        this.f3962c = r1;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View r2) {
        if (r2.getParent() != this) goto L5;
        this.f3961b.add(r2);
    L5:
        super.startViewTransition(r2);
    }

    public FragmentContainerView(Context r5, AttributeSet r6, AbstractC2805zi r7) {
        super(r5, r6);
        this.f3960a = new ArrayList();
        this.f3961b = new ArrayList();
        this.f3963d = true;
        String r1 = r6.getClassAttribute();
        TypedArray r62 = r5.obtainStyledAttributes(r6, AbstractC0767Ru.f2439b, 0, 0);
        if (r1 != null) goto L5;
        r1 = r62.getString(0);
    L5:
        String r2 = r62.getString(1);
        r62.recycle();
        int r63 = getId();
        AbstractComponentCallbacksC1503hi r3 = r7.m5379B(r63);
        if (r1 == null) goto L26;
        if (r3 != null) goto L26;
        if (r63 != (-1)) goto L15;
        if (r2 == null) goto L12;
        String r52 = " with tag ".concat(r2);
    L14:
        throw new IllegalStateException(AbstractC2374ph.m4814k("FragmentContainerView must have an android:id to add Fragment ", r1, r52));
    L12:
        r52 = "";
        goto L14
    L15:
        C2547ti r64 = r7.m5382E();
        r5.getClassLoader();
        AbstractComponentCallbacksC1503hi r53 = r64.m5033a(r1);
        r53.f5294C = true;
        C2104ji r65 = r53.f5328s;
        if (r65 != null) goto L18;
        AbstractActivityC1244c3 r66 = null;
    L19:
        if (r66 == null) goto L21;
        r53.f5294C = true;
    L21:
        C1483h5 r67 = new C1483h5(r7);
        r67.f5250o = true;
        r53.f5295D = this;
        r67.m2842e(getId(), r53, r2, 1);
        if (r67.f5242g == true) goto L25;
        r67.f5251p.m5428z(r67, true);
        goto L26
    L25:
        throw new IllegalStateException("This transaction is already being added to the back stack");
    L18:
        r66 = r65.f7400l;
    L26:
        Iterator r54 = r7.f9494c.m4879q().iterator();
    L28:
        if (r54.hasNext() == false) goto L36;
        C0326Hi r68 = (C0326Hi) r54.next();
        AbstractComponentCallbacksC1503hi r72 = r68.f1110c;
        if (r72.f5332w != getId()) goto L28;
        View r0 = r72.f5296E;
        if (r0 == null) goto L28;
        if (r0.getParent() != null) goto L28;
        r72.f5295D = this;
        r68.m695b();
        goto L28
    }
}
