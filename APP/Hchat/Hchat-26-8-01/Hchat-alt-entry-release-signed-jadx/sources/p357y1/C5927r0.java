package p357y1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import p292u1.AbstractC4229a;
import p339x1.C5602f0;
import p340x2.AbstractC5673h;

/* JADX INFO: renamed from: y1.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5927r0 extends ViewGroup {

    /* JADX INFO: renamed from: g */
    public final HashMap f24039g;

    /* JADX INFO: renamed from: h */
    public final HashMap f24040h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5927r0(Context context) {
        super(context);
        setClipChildren(false);
        this.f24039g = new HashMap();
        this.f24040h = new HashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HashMap<AbstractC5673h, C5602f0> getHolderToLayoutNode() {
        return this.f24039g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HashMap<C5602f0, AbstractC5673h> getLayoutNodeToHolder() {
        return this.f24040h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        for (AbstractC5673h abstractC5673h : this.f24039g.keySet()) {
            abstractC5673h.layout(abstractC5673h.getLeft(), abstractC5673h.getTop(), abstractC5673h.getRight(), abstractC5673h.getBottom());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        if (!(View.MeasureSpec.getMode(i9) == 1073741824)) {
            AbstractC4229a.m8493a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            AbstractC4229a.m8493a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        for (AbstractC5673h abstractC5673h : this.f24039g.keySet()) {
            int i12 = abstractC5673h.f23080B;
            if (i12 != Integer.MIN_VALUE && (i11 = abstractC5673h.f23081C) != Integer.MIN_VALUE) {
                abstractC5673h.measure(i12, i11);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            C5602f0 c5602f0 = (C5602f0) this.f24039g.get(childAt);
            if (childAt.isLayoutRequested() && c5602f0 != null) {
                C5602f0.m10001V(c5602f0, false, 7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
