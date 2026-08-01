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
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1817 extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final HashMap f5296;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final HashMap f5297;

    public C1817(Context context) {
        super(context);
        setClipChildren(false);
        this.f5297 = new HashMap();
        this.f5296 = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC2076, C1748> getHolderToLayoutNode() {
        return this.f5297;
    }

    public final HashMap<C1748, AbstractC2076> getLayoutNodeToHolder() {
        return this.f5296;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (AbstractC2076 abstractC2076 : this.f5297.keySet()) {
            abstractC2076.layout(abstractC2076.getLeft(), abstractC2076.getTop(), abstractC2076.getRight(), abstractC2076.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            AbstractC7936.m13425("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            AbstractC7936.m13425("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (AbstractC2076 abstractC2076 : this.f5297.keySet()) {
            int i4 = abstractC2076.f6148;
            if (i4 != Integer.MIN_VALUE && (i3 = abstractC2076.f6147) != Integer.MIN_VALUE) {
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
            C1748 c1748 = (C1748) this.f5297.get(childAt);
            if (childAt.isLayoutRequested() && c1748 != null) {
                C1748.m3224(c1748, false, 7);
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
