package p017J;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import p006D.C0091b;
import p008E.C0151e;
import p008E.C0156j;

/* JADX INFO: renamed from: J.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0219h extends C0091b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f462d;

    public /* synthetic */ C0219h(int r1) {
        this.f462d = r1;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: c */
    public void mo315c(View r2, AccessibilityEvent r3) {
        switch(this.f462d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.mo315c(r2, r3);
        return;
    L6:
        super.mo315c(r2, r3);
        NestedScrollView r22 = (NestedScrollView) r2;
        r3.setClassName(ScrollView.class.getName());
        if (r22.getScrollRange() <= 0) goto L9;
        boolean r02 = true;
    L10:
        r3.setScrollable(r02);
        r3.setScrollX(r22.getScrollX());
        r3.setScrollY(r22.getScrollY());
        r3.setMaxScrollX(r22.getScrollX());
        r3.setMaxScrollY(r22.getScrollRange());
        return;
    L9:
        r02 = false;
        goto L10
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View r4, C0156j r5) {
        switch(this.f462d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        View.AccessibilityDelegate r02 = this.f243a;
        AccessibilityNodeInfo r52 = r5.f357a;
        r02.onInitializeAccessibilityNodeInfo(r4, r52);
        r52.setCollectionInfo(null);
        return;
    L6:
        View.AccessibilityDelegate r03 = this.f243a;
        AccessibilityNodeInfo r1 = r5.f357a;
        r03.onInitializeAccessibilityNodeInfo(r4, r1);
        NestedScrollView r42 = (NestedScrollView) r4;
        r1.setClassName(ScrollView.class.getName());
        if (r42.isEnabled() == false) goto L17;
        int r04 = r42.getScrollRange();
        if (r04 <= 0) goto L18;
        r1.setScrollable(true);
        if (r42.getScrollY() <= 0) goto L14;
        r5.m506b(C0151e.f346g);
        r5.m506b(C0151e.f350k);
    L14:
        if (r42.getScrollY() >= r04) goto L19;
        r5.m506b(C0151e.f345f);
        r5.m506b(C0151e.f351l);
        return;
    L19:
        return;
    L18:
        return;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: g */
    public boolean mo317g(View r5, int r6, Bundle r7) {
        switch(this.f462d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.mo317g(r5, r6, r7);
    L7:
        if (super.mo317g(r5, r6, r7) == true) goto L35;
        NestedScrollView r52 = (NestedScrollView) r5;
        if (r52.isEnabled() == false) goto L33;
        int r72 = r52.getHeight();
        Rect r2 = new Rect();
        if (r52.getMatrix().isIdentity() == false) goto L18;
        if (r52.getGlobalVisibleRect(r2) == false) goto L18;
        r72 = r2.height();
    L18:
        if (r6 != 4096) goto L20;
    L29:
        int r73 = (r72 - r52.getPaddingBottom()) - r52.getPaddingTop();
        int r62 = Math.min(r52.getScrollY() + r73, r52.getScrollRange());
        if (r62 == r52.getScrollY()) goto L33;
        r52.m1192t(0 - r52.getScrollX(), r62 - r52.getScrollY(), true);
        return true;
    L20:
        if (r6 != 8192) goto L22;
    L26:
        int r74 = (r72 - r52.getPaddingBottom()) - r52.getPaddingTop();
        int r63 = Math.max(r52.getScrollY() - r74, 0);
        if (r63 == r52.getScrollY()) goto L33;
        r52.m1192t(0 - r52.getScrollX(), r63 - r52.getScrollY(), true);
        return true;
    L22:
        if (r6 == 16908344) goto L26;
        if (r6 == 16908346) goto L29;
    L33:
        return false;
    L35:
        return true;
    }
}
