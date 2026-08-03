package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends androidx.appcompat.widget.b {
    public AlertDialogLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static int l(android.view.View r3) {
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            int r0 = r3.getMinimumHeight()
            if (r0 <= 0) goto L9
            return r0
        L9:
            boolean r0 = r3 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L20
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r2 = 1
            if (r0 != r2) goto L20
            android.view.View r3 = r3.getChildAt(r1)
            int r3 = l(r3)
            return r3
        L20:
            return r1
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L39
            r4 = 80
            if (r3 == r4) goto L30
            int r12 = r9.getPaddingTop()
            goto L43
        L30:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L43
        L39:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L43:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L4c
            r14 = r0
            goto L50
        L4c:
            int r14 = r14.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Lb0
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto Lad
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto Lad
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.appcompat.widget.b$a r6 = (androidx.appcompat.widget.b.a) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L73
            r7 = r2
        L73:
            int r8 = r9.getLayoutDirection()
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L8d
            r8 = 5
            if (r7 == r8) goto L87
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L98
        L87:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
        L8b:
            int r7 = r7 - r8
            goto L98
        L8d:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
            goto L8b
        L98:
            boolean r8 = r9.k(r0)
            if (r8 == 0) goto L9f
            int r12 = r12 + r14
        L9f:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r12 + r5
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        Lad:
            int r0 = r0 + 1
            goto L50
        Lb0:
            return
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public final void onMeasure(int r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            int r6 = r0.getChildCount()
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r4
            r7 = r3
        Ld:
            r8 = 8
            if (r7 >= r6) goto L3e
            android.view.View r9 = r0.getChildAt(r7)
            int r10 = r9.getVisibility()
            if (r10 != r8) goto L1c
            goto L3b
        L1c:
            int r8 = r9.getId()
            int r10 = androidx.appcompat.R.id.topPanel
            if (r8 != r10) goto L26
            r2 = r9
            goto L3b
        L26:
            int r10 = androidx.appcompat.R.id.buttonPanel
            if (r8 != r10) goto L2c
            r4 = r9
            goto L3b
        L2c:
            int r10 = androidx.appcompat.R.id.contentPanel
            if (r8 == r10) goto L34
            int r10 = androidx.appcompat.R.id.customPanel
            if (r8 != r10) goto L36
        L34:
            if (r5 == 0) goto L3a
        L36:
            super.onMeasure(r17, r18)
            return
        L3a:
            r5 = r9
        L3b:
            int r7 = r7 + 1
            goto Ld
        L3e:
            int r7 = android.view.View.MeasureSpec.getMode(r18)
            int r9 = android.view.View.MeasureSpec.getSize(r18)
            int r10 = android.view.View.MeasureSpec.getMode(r1)
            int r11 = r0.getPaddingTop()
            int r12 = r0.getPaddingBottom()
            int r12 = r12 + r11
            if (r2 == 0) goto L66
            r2.measure(r1, r3)
            int r11 = r2.getMeasuredHeight()
            int r12 = r12 + r11
            int r2 = r2.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r3, r2)
            goto L67
        L66:
            r2 = r3
        L67:
            if (r4 == 0) goto L7f
            r4.measure(r1, r3)
            int r11 = l(r4)
            int r13 = r4.getMeasuredHeight()
            int r13 = r13 - r11
            int r12 = r12 + r11
            int r14 = r4.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r2, r14)
            goto L81
        L7f:
            r11 = r3
            r13 = r11
        L81:
            if (r5 == 0) goto La2
            if (r7 != 0) goto L87
            r14 = r3
            goto L91
        L87:
            int r14 = r9 - r12
            int r14 = java.lang.Math.max(r3, r14)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r7)
        L91:
            r5.measure(r1, r14)
            int r14 = r5.getMeasuredHeight()
            int r12 = r12 + r14
            int r15 = r5.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r2, r15)
            goto La3
        La2:
            r14 = r3
        La3:
            int r9 = r9 - r12
            r15 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto Lc5
            int r12 = r12 - r11
            int r13 = java.lang.Math.min(r9, r13)
            if (r13 <= 0) goto Lb1
            int r9 = r9 - r13
            int r11 = r11 + r13
        Lb1:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r15)
            r4.measure(r1, r11)
            int r11 = r4.getMeasuredHeight()
            int r12 = r12 + r11
            int r4 = r4.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r2, r4)
        Lc5:
            if (r5 == 0) goto Ldf
            if (r9 <= 0) goto Ldf
            int r12 = r12 - r14
            int r14 = r14 + r9
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r7)
            r5.measure(r1, r4)
            int r4 = r5.getMeasuredHeight()
            int r12 = r12 + r4
            int r4 = r5.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r2, r4)
        Ldf:
            r4 = r3
            r5 = r4
        Le1:
            if (r4 >= r6) goto Lf8
            android.view.View r7 = r0.getChildAt(r4)
            int r9 = r7.getVisibility()
            if (r9 == r8) goto Lf5
            int r7 = r7.getMeasuredWidth()
            int r5 = java.lang.Math.max(r5, r7)
        Lf5:
            int r4 = r4 + 1
            goto Le1
        Lf8:
            int r4 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r7 = r7 + r4
            int r7 = r7 + r5
            int r1 = android.view.View.resolveSizeAndState(r7, r1, r2)
            r4 = r18
            int r2 = android.view.View.resolveSizeAndState(r12, r4, r3)
            r0.setMeasuredDimension(r1, r2)
            if (r10 == r15) goto L148
            int r1 = r0.getMeasuredWidth()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r15)
            r7 = r3
        L11a:
            if (r7 >= r6) goto L148
            android.view.View r1 = r0.getChildAt(r7)
            int r3 = r1.getVisibility()
            if (r3 == r8) goto L141
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r9 = r3
            androidx.appcompat.widget.b$a r9 = (androidx.appcompat.widget.b.a) r9
            int r3 = r9.width
            r5 = -1
            if (r3 != r5) goto L141
            int r10 = r9.height
            int r3 = r1.getMeasuredHeight()
            r9.height = r3
            r3 = 0
            r5 = 0
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r9.height = r10
        L141:
            int r7 = r7 + 1
            r0 = r16
            r4 = r18
            goto L11a
        L148:
            return
    }
}
