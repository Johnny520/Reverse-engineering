package androidx.core.widget;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.view.C2246;
import p150.AbstractC7583;
import p155.C7607;
import p155.C7610;

/* JADX INFO: renamed from: androidx.core.widget.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2292 extends C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f6664;

    public C2292(AbstractC7583 abstractC7583) {
        this.f6664 = 5;
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3591(View view, C7607 c7607) {
        int scrollRange;
        int i = this.f6664;
        View.AccessibilityDelegate accessibilityDelegate = this.f6547;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c7607.f20630);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c7607.m12843(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    c7607.m12837(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c7607.m12834(C7610.f20642);
                        c7607.m12834(C7610.f20634);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c7607.m12834(C7610.f20638);
                        c7607.m12834(C7610.f20636);
                    }
                    break;
                }
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c7607.f20630);
                c7607.m12840(null);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c7607.f20630);
                c7607.m12837(false);
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c7607.f20630);
                c7607.m12840(null);
                break;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo = c7607.f20630;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(false);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c7607.f20630);
                c7607.m12843(AbstractC7583.class.getName());
                c7607.m12837(false);
                break;
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo4197(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f6664) {
            case 0:
                super.mo4197(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            case 5:
                super.mo4197(view, accessibilityEvent);
                accessibilityEvent.setClassName(AbstractC7583.class.getName());
                accessibilityEvent.setScrollable(false);
                accessibilityEvent.getEventType();
                break;
            default:
                super.mo4197(view, accessibilityEvent);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo4200(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            int r0 = r3.f6664
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L11;
                case 5: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r3 = super.mo4200(r4, r5, r6)
            return r3
        Lc:
            boolean r3 = super.mo4200(r4, r5, r6)
            return r3
        L11:
            boolean r3 = super.mo4200(r4, r5, r6)
            if (r3 == 0) goto L19
            goto La6
        L19:
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            if (r3 != 0) goto L23
            goto La5
        L23:
            int r3 = r4.getHeight()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Matrix r0 = r4.getMatrix()
            boolean r0 = r0.isIdentity()
            if (r0 == 0) goto L40
            boolean r0 = r4.getGlobalVisibleRect(r6)
            if (r0 == 0) goto L40
            int r3 = r6.height()
        L40:
            r6 = 4096(0x1000, float:5.74E-42)
            if (r5 == r6) goto L7a
            r6 = 8192(0x2000, float:1.148E-41)
            if (r5 == r6) goto L53
            r6 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r6) goto L53
            r6 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r6) goto L7a
            goto La5
        L53:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r2)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La5
            int r5 = r4.getScrollX()
            int r2 = r2 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.m4293(r2, r3, r1)
            goto La6
        L7a:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.getScrollRange()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La5
            int r5 = r4.getScrollX()
            int r2 = r2 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.m4293(r2, r3, r1)
            goto La6
        La5:
            r1 = r2
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C2292.mo4200(android.view.View, int, android.os.Bundle):boolean");
    }

    public /* synthetic */ C2292(int i) {
        this.f6664 = i;
    }
}
