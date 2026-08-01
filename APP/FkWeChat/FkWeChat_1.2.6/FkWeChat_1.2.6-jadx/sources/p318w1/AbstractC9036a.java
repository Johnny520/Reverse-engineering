package p318w1;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p265s1.AbstractC7072f0;
import p265s1.AbstractC7166y2;
import p265s1.InterfaceC7088i1;

/* JADX INFO: renamed from: w1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9036a extends ViewGroup {

    /* JADX INFO: renamed from: q */
    public boolean f31034q;

    public AbstractC9036a(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(AbstractC7166y2.f23695a, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: a */
    public final void m35062a(InterfaceC7088i1 interfaceC7088i1, View view, long j10) {
        super.drawChild(AbstractC7072f0.m27862d(interfaceC7088i1), view, j10);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f31034q) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
