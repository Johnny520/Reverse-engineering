package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class qt extends x {
    public final /* synthetic */ int d;

    public /* synthetic */ qt(int r1) {
        this.d = r1;
    }

    @Override // defpackage.x
    public void c(View r2, AccessibilityEvent r3) {
        switch(this.d) {
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        super.c(r2, r3);
        return;
    L6:
        super.c(r2, r3);
        NestedScrollView r22 = (NestedScrollView) r2;
        r3.setClassName(ScrollView.class.getName());
        if (r22.getScrollRange() <= 0) goto L9;
        boolean r0 = true;
    L10:
        r3.setScrollable(r0);
        r3.setScrollX(r22.getScrollX());
        r3.setScrollY(r22.getScrollY());
        m0.c(r3, r22.getScrollX());
        m0.d(r3, r22.getScrollRange());
        return;
    L9:
        r0 = false;
        goto L10
    }

    @Override // defpackage.x
    public final void d(View r4, j0 r5) {
        switch(this.d) {
            case 0: goto L19;
            case 1: goto L17;
            case 2: goto L15;
            default: goto L4;
        };
    L4:
        AccessibilityNodeInfo r0 = r5.a;
        this.a.onInitializeAccessibilityNodeInfo(r4, r0);
        NestedScrollView r42 = (NestedScrollView) r4;
        r0.setClassName(ScrollView.class.getName());
        if (r42.isEnabled() == false) goto L21;
        int r1 = r42.getScrollRange();
        if (r1 <= 0) goto L22;
        r0.setScrollable(true);
        if (r42.getScrollY() <= 0) goto L12;
        r5.b(h0.g);
        r5.b(h0.k);
    L12:
        if (r42.getScrollY() >= r1) goto L23;
        r5.b(h0.f);
        r5.b(h0.l);
        return;
    L23:
        return;
    L22:
        return;
    L21:
        return;
    L15:
        AccessibilityNodeInfo r52 = r5.a;
        this.a.onInitializeAccessibilityNodeInfo(r4, r52);
        r52.setCollectionInfo(null);
        return;
    L17:
        AccessibilityNodeInfo r53 = r5.a;
        this.a.onInitializeAccessibilityNodeInfo(r4, r53);
        r53.setScrollable(false);
        return;
    L19:
        AccessibilityNodeInfo r54 = r5.a;
        this.a.onInitializeAccessibilityNodeInfo(r4, r54);
        r54.setCollectionInfo(null);
    }

    @Override // defpackage.x
    public boolean g(View r5, int r6, Bundle r7) {
        switch(this.d) {
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        return super.g(r5, r6, r7);
    L7:
        if (super.g(r5, r6, r7) == true) goto L36;
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
        r52.t(0 - r52.getScrollX(), r62 - r52.getScrollY(), true);
        return true;
    L20:
        if (r6 != 8192) goto L22;
    L26:
        int r74 = (r72 - r52.getPaddingBottom()) - r52.getPaddingTop();
        int r63 = Math.max(r52.getScrollY() - r74, 0);
        if (r63 == r52.getScrollY()) goto L33;
        r52.t(0 - r52.getScrollX(), r63 - r52.getScrollY(), true);
        return true;
    L22:
        if (r6 == 16908344) goto L26;
        if (r6 == 16908346) goto L29;
    L33:
        return false;
    L36:
        return true;
    }
}
