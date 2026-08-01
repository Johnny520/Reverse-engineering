package p233s0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p211o0.AbstractC2744c;
import p211o0.InterfaceC2760s;

/* JADX INFO: renamed from: s0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3167a extends ViewGroup {
    /* JADX INFO: renamed from: a */
    public final void m5431a(InterfaceC2760s interfaceC2760s, View view, long j5) {
        super.drawChild(AbstractC2744c.m4858a(interfaceC2760s), view, j5);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
    }
}
