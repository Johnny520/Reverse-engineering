package androidx.compose.p001ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.viewinterop.AbstractC2909;
import java.util.HashMap;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2652 extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final HashMap f5641;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final HashMap f5642;

    public C2652(Context context) {
        super(context);
        setClipChildren(false);
        this.f5642 = new HashMap();
        this.f5641 = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC2909, C2583> getHolderToLayoutNode() {
        return this.f5642;
    }

    public final HashMap<C2583, AbstractC2909> getLayoutNodeToHolder() {
        return this.f5641;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (AbstractC2909 abstractC2909 : this.f5642.keySet()) {
            abstractC2909.layout(abstractC2909.getLeft(), abstractC2909.getTop(), abstractC2909.getRight(), abstractC2909.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            AbstractC8765.m13984("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            AbstractC8765.m13984("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (AbstractC2909 abstractC2909 : this.f5642.keySet()) {
            int i4 = abstractC2909.f6493;
            if (i4 != Integer.MIN_VALUE && (i3 = abstractC2909.f6492) != Integer.MIN_VALUE) {
                abstractC2909.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C2583 c2583 = (C2583) this.f5642.get(childAt);
            if (childAt.isLayoutRequested() && c2583 != null) {
                C2583.m3784(c2583, false, 7);
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
