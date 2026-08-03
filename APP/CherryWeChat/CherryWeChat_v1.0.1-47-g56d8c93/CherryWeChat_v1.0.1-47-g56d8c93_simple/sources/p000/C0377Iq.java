package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: Iq */
/* JADX INFO: loaded from: classes.dex */
public final class C0377Iq extends C0645P {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1308d;

    public /* synthetic */ C0377Iq(int r1) {
        this.f1308d = r1;
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: c */
    public void mo318c(View r2, AccessibilityEvent r3) {
        switch(this.f1308d) {
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        super.mo318c(r2, r3);
        return;
    L6:
        super.mo318c(r2, r3);
        NestedScrollView r22 = (NestedScrollView) r2;
        r3.setClassName(ScrollView.class.getName());
        if (r22.getScrollRange() <= 0) goto L9;
        boolean r0 = true;
    L10:
        r3.setScrollable(r0);
        r3.setScrollX(r22.getScrollX());
        r3.setScrollY(r22.getScrollY());
        r3.setMaxScrollX(r22.getScrollX());
        r3.setMaxScrollY(r22.getScrollRange());
        return;
    L9:
        r0 = false;
        goto L10
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: d */
    public final void mo319d(View r3, C1118a0 r4) {
        switch(this.f1308d) {
            case 0: goto L21;
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        AccessibilityNodeInfo r42 = r4.f3530a;
        this.f2082a.onInitializeAccessibilityNodeInfo(r3, r42);
        r42.setVisibleToUser(false);
        return;
    L6:
        this.f2082a.onInitializeAccessibilityNodeInfo(r3, r4.f3530a);
        NestedScrollView r32 = (NestedScrollView) r3;
        r4.m2046h(ScrollView.class.getName());
        if (r32.isEnabled() == false) goto L23;
        int r0 = r32.getScrollRange();
        if (r0 <= 0) goto L24;
        r4.m2048j(true);
        if (r32.getScrollY() <= 0) goto L14;
        r4.m2041b(C0902V.f2804g);
        r4.m2041b(C0902V.f2808k);
    L14:
        if (r32.getScrollY() >= r0) goto L25;
        r4.m2041b(C0902V.f2803f);
        r4.m2041b(C0902V.f2809l);
        return;
    L25:
        return;
    L24:
        return;
    L23:
        return;
    L17:
        this.f2082a.onInitializeAccessibilityNodeInfo(r3, r4.f3530a);
        r4.m2047i(null);
        return;
    L19:
        this.f2082a.onInitializeAccessibilityNodeInfo(r3, r4.f3530a);
        r4.m2048j(false);
        return;
    L21:
        this.f2082a.onInitializeAccessibilityNodeInfo(r3, r4.f3530a);
        r4.m2047i(null);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: g */
    public boolean mo322g(View r5, int r6, Bundle r7) {
        switch(this.f1308d) {
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        return super.mo322g(r5, r6, r7);
    L7:
        if (super.mo322g(r5, r6, r7) == true) goto L36;
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
        r52.m2160v(0 - r52.getScrollX(), r62 - r52.getScrollY(), true);
        return true;
    L20:
        if (r6 != 8192) goto L22;
    L26:
        int r74 = (r72 - r52.getPaddingBottom()) - r52.getPaddingTop();
        int r63 = Math.max(r52.getScrollY() - r74, 0);
        if (r63 == r52.getScrollY()) goto L33;
        r52.m2160v(0 - r52.getScrollX(), r63 - r52.getScrollY(), true);
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
