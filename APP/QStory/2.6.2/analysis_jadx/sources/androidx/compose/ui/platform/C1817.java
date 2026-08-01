package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.viewinterop.AbstractC2076;
import java.util.HashMap;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1817 extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final HashMap f5295;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final HashMap f5296;

    public C1817(Context context) {
        super(context);
        setClipChildren(false);
        this.f5296 = new HashMap();
        this.f5295 = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC2076, C1748> getHolderToLayoutNode() {
        return this.f5296;
    }

    public final HashMap<C1748, AbstractC2076> getLayoutNodeToHolder() {
        return this.f5295;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (AbstractC2076 abstractC2076 : this.f5296.keySet()) {
            abstractC2076.layout(abstractC2076.getLeft(), abstractC2076.getTop(), abstractC2076.getRight(), abstractC2076.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            AbstractC7935.m13397("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            AbstractC7935.m13397("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (AbstractC2076 abstractC2076 : this.f5296.keySet()) {
            int i4 = abstractC2076.f6147;
            if (i4 != Integer.MIN_VALUE && (i3 = abstractC2076.f6146) != Integer.MIN_VALUE) {
                abstractC2076.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1748 c1748 = (C1748) this.f5296.get(childAt);
            if (childAt.isLayoutRequested() && c1748 != null) {
                C1748.m3214(c1748, false, 7);
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
