package p047I0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import p023E0.AbstractC0277a;
import p041H0.C0564I;
import p170h1.AbstractC2218i;

/* JADX INFO: renamed from: I0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0720d0 extends ViewGroup {

    /* JADX INFO: renamed from: d */
    public final HashMap f2276d;

    /* JADX INFO: renamed from: e */
    public final HashMap f2277e;

    public C0720d0(Context context) {
        super(context);
        setClipChildren(false);
        this.f2276d = new HashMap();
        this.f2277e = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC2218i, C0564I> getHolderToLayoutNode() {
        return this.f2276d;
    }

    public final HashMap<C0564I, AbstractC2218i> getLayoutNodeToHolder() {
        return this.f2277e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        for (AbstractC2218i abstractC2218i : this.f2276d.keySet()) {
            abstractC2218i.layout(abstractC2218i.getLeft(), abstractC2218i.getTop(), abstractC2218i.getRight(), abstractC2218i.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        int i7;
        if (!(View.MeasureSpec.getMode(i5) == 1073741824)) {
            AbstractC0277a.m482a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i6) == 1073741824)) {
            AbstractC0277a.m482a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i5), View.MeasureSpec.getSize(i6));
        for (AbstractC2218i abstractC2218i : this.f2276d.keySet()) {
            int i8 = abstractC2218i.f7252y;
            if (i8 != Integer.MIN_VALUE && (i7 = abstractC2218i.f7253z) != Integer.MIN_VALUE) {
                abstractC2218i.measure(i8, i7);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0564I c0564i = (C0564I) this.f2276d.get(childAt);
            if (childAt.isLayoutRequested() && c0564i != null) {
                C0564I.m790V(c0564i, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
