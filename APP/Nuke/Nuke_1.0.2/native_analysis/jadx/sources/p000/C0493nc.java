package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: renamed from: nc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0493nc extends ViewGroup {

    /* JADX INFO: renamed from: h */
    public final HashMap f7107h;

    /* JADX INFO: renamed from: i */
    public final HashMap f7108i;

    public C0493nc(Context context) {
        super(context);
        setClipChildren(false);
        this.f7107h = new HashMap();
        this.f7108i = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC0309ic, r61> getHolderToLayoutNode() {
        return this.f7107h;
    }

    public final HashMap<r61, AbstractC0309ic> getLayoutNodeToHolder() {
        return this.f7108i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (AbstractC0309ic abstractC0309ic : this.f7107h.keySet()) {
            abstractC0309ic.layout(abstractC0309ic.getLeft(), abstractC0309ic.getTop(), abstractC0309ic.getRight(), abstractC0309ic.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            kz0.m2763a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            kz0.m2763a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (AbstractC0309ic abstractC0309ic : this.f7107h.keySet()) {
            int i4 = abstractC0309ic.f4527C;
            if (i4 != Integer.MIN_VALUE && (i3 = abstractC0309ic.f4528D) != Integer.MIN_VALUE) {
                abstractC0309ic.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            r61 r61Var = (r61) this.f7107h.get(childAt);
            if (childAt.isLayoutRequested() && r61Var != null) {
                r61.m4341V(r61Var, false, 7);
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
