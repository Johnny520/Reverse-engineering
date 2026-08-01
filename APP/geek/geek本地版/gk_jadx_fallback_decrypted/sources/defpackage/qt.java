package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qt extends defpackage.x {
    public final /* synthetic */ int d;

    public /* synthetic */ qt(int r1) {
            r0 = this;
            r0.d = r1
            r0.<init>()
            return
    }

    @Override // defpackage.x
    public void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 3: goto L9;
                default: goto L5;
            }
        L5:
            super.c(r2, r3)
            return
        L9:
            super.c(r2, r3)
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
            java.lang.String r0 = r0.getName()
            r3.setClassName(r0)
            int r0 = r2.getScrollRange()
            if (r0 <= 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            r3.setScrollable(r0)
            int r0 = r2.getScrollX()
            r3.setScrollX(r0)
            int r0 = r2.getScrollY()
            r3.setScrollY(r0)
            int r0 = r2.getScrollX()
            defpackage.m0.c(r3, r0)
            int r2 = r2.getScrollRange()
            defpackage.m0.d(r3, r2)
            return
    }

    @Override // defpackage.x
    public final void d(android.view.View r4, defpackage.j0 r5) {
            r3 = this;
            int r0 = r3.d
            switch(r0) {
                case 0: goto L60;
                case 1: goto L54;
                case 2: goto L48;
                default: goto L5;
            }
        L5:
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.a
            android.view.View$AccessibilityDelegate r1 = r3.a
            r1.onInitializeAccessibilityNodeInfo(r4, r0)
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            java.lang.Class<android.widget.ScrollView> r1 = android.widget.ScrollView.class
            java.lang.String r1 = r1.getName()
            r0.setClassName(r1)
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L47
            int r1 = r4.getScrollRange()
            if (r1 <= 0) goto L47
            r2 = 1
            r0.setScrollable(r2)
            int r0 = r4.getScrollY()
            if (r0 <= 0) goto L37
            h0 r0 = defpackage.h0.g
            r5.b(r0)
            h0 r0 = defpackage.h0.k
            r5.b(r0)
        L37:
            int r4 = r4.getScrollY()
            if (r4 >= r1) goto L47
            h0 r4 = defpackage.h0.f
            r5.b(r4)
            h0 r4 = defpackage.h0.l
            r5.b(r4)
        L47:
            return
        L48:
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.a
            android.view.View$AccessibilityDelegate r0 = r3.a
            r0.onInitializeAccessibilityNodeInfo(r4, r5)
            r4 = 0
            r5.setCollectionInfo(r4)
            return
        L54:
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.a
            android.view.View$AccessibilityDelegate r0 = r3.a
            r0.onInitializeAccessibilityNodeInfo(r4, r5)
            r4 = 0
            r5.setScrollable(r4)
            return
        L60:
            android.view.accessibility.AccessibilityNodeInfo r5 = r5.a
            android.view.View$AccessibilityDelegate r0 = r3.a
            r0.onInitializeAccessibilityNodeInfo(r4, r5)
            r4 = 0
            r5.setCollectionInfo(r4)
            return
    }

    @Override // defpackage.x
    public boolean g(android.view.View r5, int r6, android.os.Bundle r7) {
            r4 = this;
            int r0 = r4.d
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.g(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.g(r5, r6, r7)
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
            r5.t(r1, r6, r0)
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
            r5.t(r1, r6, r0)
            goto La1
        La0:
            r0 = r1
        La1:
            return r0
    }
}
