package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: qt */
/* JADX INFO: loaded from: classes.dex */
public final class C0646qt extends C0875x {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4119d;

    @Override // p000.C0875x
    /* JADX INFO: renamed from: c */
    public void mo65c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4119d) {
            case 3:
                super.mo65c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                AbstractC0468m0.m1775c(accessibilityEvent, nestedScrollView.getScrollX());
                AbstractC0468m0.m1776d(accessibilityEvent, nestedScrollView.getScrollRange());
                break;
            default:
                super.mo65c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: d */
    public final void mo66d(View view, C0357j0 c0357j0) {
        int scrollRange;
        switch (this.f4119d) {
            case Base64.DEFAULT /* 0 */:
                AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2513a;
                this.f5076a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            case Base64.NO_PADDING /* 1 */:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0357j0.f2513a;
                this.f5076a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setScrollable(false);
                break;
            case Base64.NO_WRAP /* 2 */:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c0357j0.f2513a;
                this.f5076a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCollectionInfo(null);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = c0357j0.f2513a;
                this.f5076a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityNodeInfo4.setClassName(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo4.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c0357j0.m1534b(C0281h0.f2182g);
                        c0357j0.m1534b(C0281h0.f2186k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c0357j0.m1534b(C0281h0.f2181f);
                        c0357j0.m1534b(C0281h0.f2187l);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // p000.C0875x
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo619g(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.f4119d
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.mo619g(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.mo619g(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L13
            goto La1
        L13:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L1e
            goto La0
        L1e:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L3b
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L3b
            int r7 = r2.height()
        L3b:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L75
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L4e
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L4e
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L75
            goto La0
        L4e:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.m246t(r1, r6, r0)
            goto La1
        L75:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.getScrollRange()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.m246t(r1, r6, r0)
            goto La1
        La0:
            r0 = r1
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0646qt.mo619g(android.view.View, int, android.os.Bundle):boolean");
    }
}
