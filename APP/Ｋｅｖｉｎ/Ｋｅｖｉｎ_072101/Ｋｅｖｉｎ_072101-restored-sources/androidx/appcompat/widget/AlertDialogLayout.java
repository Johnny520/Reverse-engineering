package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class AlertDialogLayout extends androidx.appcompat.widget.LinearLayoutCompat {
    public AlertDialogLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public AlertDialogLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void forceUniformWidth(int r12, int r13) {
            r11 = this;
            int r0 = r11.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 0
        Lc:
            if (r1 >= r12) goto L3c
            android.view.View r8 = r11.getChildAt(r1)
            int r2 = r8.getVisibility()
            r3 = 8
            if (r2 == r3) goto L39
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            r9 = r2
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r9 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r9
            int r2 = r9.width
            r3 = -1
            if (r2 != r3) goto L39
            int r10 = r9.height
            int r2 = r8.getMeasuredHeight()
            r9.height = r2
            r5 = 0
            r7 = 0
            r2 = r11
            r3 = r8
            r4 = r0
            r6 = r13
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r9.height = r10
        L39:
            int r1 = r1 + 1
            goto Lc
        L3c:
            return
    }

    private static int resolveMinimumHeight(android.view.View r5) {
            int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r5)
            if (r0 <= 0) goto L7
            return r0
        L7:
            boolean r1 = r5 instanceof android.view.ViewGroup
            r2 = 0
            if (r1 == 0) goto L1f
            r1 = r5
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r3 = r1.getChildCount()
            r4 = 1
            if (r3 != r4) goto L1f
            android.view.View r2 = r1.getChildAt(r2)
            int r2 = resolveMinimumHeight(r2)
            return r2
        L1f:
            return r2
    }

    private void setChildFrame(android.view.View r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r0 = r4 + r6
            int r1 = r5 + r7
            r3.layout(r4, r5, r0, r1)
            return
    }

    private boolean tryOnMeasure(int r25, int r26) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = 0
            r4 = 0
            r5 = 0
            int r6 = r24.getChildCount()
            r7 = 0
        Le:
            r8 = 8
            r9 = 0
            if (r7 >= r6) goto L3f
            android.view.View r10 = r0.getChildAt(r7)
            int r11 = r10.getVisibility()
            if (r11 != r8) goto L1e
            goto L3c
        L1e:
            int r8 = r10.getId()
            int r11 = androidx.appcompat.C0015R.id.topPanel
            if (r8 != r11) goto L28
            r3 = r10
            goto L3c
        L28:
            int r11 = androidx.appcompat.C0015R.id.buttonPanel
            if (r8 != r11) goto L2e
            r4 = r10
            goto L3c
        L2e:
            int r11 = androidx.appcompat.C0015R.id.contentPanel
            if (r8 == r11) goto L38
            int r11 = androidx.appcompat.C0015R.id.customPanel
            if (r8 != r11) goto L37
            goto L38
        L37:
            return r9
        L38:
            if (r5 == 0) goto L3b
            return r9
        L3b:
            r5 = r10
        L3c:
            int r7 = r7 + 1
            goto Le
        L3f:
            int r7 = android.view.View.MeasureSpec.getMode(r26)
            int r10 = android.view.View.MeasureSpec.getSize(r26)
            int r11 = android.view.View.MeasureSpec.getMode(r25)
            r12 = 0
            int r13 = r24.getPaddingTop()
            int r14 = r24.getPaddingBottom()
            int r13 = r13 + r14
            if (r3 == 0) goto L67
            r3.measure(r1, r9)
            int r14 = r3.getMeasuredHeight()
            int r13 = r13 + r14
            int r14 = r3.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r14)
        L67:
            r14 = 0
            r15 = 0
            if (r4 == 0) goto L81
            r4.measure(r1, r9)
            int r14 = resolveMinimumHeight(r4)
            int r16 = r4.getMeasuredHeight()
            int r15 = r16 - r14
            int r13 = r13 + r14
            int r8 = r4.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r8)
        L81:
            r8 = 0
            if (r5 == 0) goto Lac
            if (r7 != 0) goto L8f
            r17 = 0
            r23 = r17
            r17 = r3
            r3 = r23
            goto L9b
        L8f:
            r17 = r3
            int r3 = r10 - r13
            int r3 = java.lang.Math.max(r9, r3)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7)
        L9b:
            r5.measure(r1, r3)
            int r8 = r5.getMeasuredHeight()
            int r13 = r13 + r8
            int r9 = r5.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r9)
            goto Lae
        Lac:
            r17 = r3
        Lae:
            int r3 = r10 - r13
            r9 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto Ld8
            int r13 = r13 - r14
            int r18 = java.lang.Math.min(r3, r15)
            if (r18 <= 0) goto Lbf
            int r3 = r3 - r18
            int r14 = r14 + r18
        Lbf:
            r19 = r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            r4.measure(r1, r3)
            int r20 = r4.getMeasuredHeight()
            int r13 = r13 + r20
            int r9 = r4.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r9)
            r3 = r19
        Ld8:
            if (r5 == 0) goto Lfb
            if (r3 <= 0) goto Lfb
            int r13 = r13 - r8
            r9 = r3
            int r3 = r3 - r9
            int r8 = r8 + r9
            r18 = r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r7)
            r5.measure(r1, r3)
            int r19 = r5.getMeasuredHeight()
            int r13 = r13 + r19
            r19 = r3
            int r3 = r5.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r3)
            r3 = r18
        Lfb:
            r9 = 0
            r18 = 0
            r23 = r18
            r18 = r3
            r3 = r23
        L104:
            if (r3 >= r6) goto L126
            android.view.View r19 = r0.getChildAt(r3)
            r21 = r4
            int r4 = r19.getVisibility()
            r22 = r5
            r5 = 8
            if (r4 == r5) goto L11f
            int r4 = r19.getMeasuredWidth()
            int r4 = java.lang.Math.max(r9, r4)
            r9 = r4
        L11f:
            int r3 = r3 + 1
            r4 = r21
            r5 = r22
            goto L104
        L126:
            r21 = r4
            r22 = r5
            int r3 = r24.getPaddingLeft()
            int r4 = r24.getPaddingRight()
            int r3 = r3 + r4
            int r9 = r9 + r3
            int r3 = android.view.View.resolveSizeAndState(r9, r1, r12)
            r4 = 0
            int r4 = android.view.View.resolveSizeAndState(r13, r2, r4)
            r0.setMeasuredDimension(r3, r4)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r11 == r5) goto L147
            r0.forceUniformWidth(r6, r2)
        L147:
            r5 = 1
            return r5
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r28, int r29, int r30, int r31, int r32) {
            r27 = this;
            r6 = r27
            int r7 = r27.getPaddingLeft()
            int r8 = r31 - r29
            int r0 = r27.getPaddingRight()
            int r9 = r8 - r0
            int r0 = r8 - r7
            int r1 = r27.getPaddingRight()
            int r10 = r0 - r1
            int r11 = r27.getMeasuredHeight()
            int r12 = r27.getChildCount()
            int r13 = r27.getGravity()
            r14 = r13 & 112(0x70, float:1.57E-43)
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r15 = r13 & r0
            switch(r14) {
                case 16: goto L3b;
                case 80: goto L31;
                default: goto L2c;
            }
        L2c:
            int r0 = r27.getPaddingTop()
            goto L46
        L31:
            int r0 = r27.getPaddingTop()
            int r0 = r0 + r32
            int r0 = r0 - r30
            int r0 = r0 - r11
            goto L46
        L3b:
            int r0 = r27.getPaddingTop()
            int r1 = r32 - r30
            int r1 = r1 - r11
            int r1 = r1 / 2
            int r0 = r0 + r1
        L46:
            android.graphics.drawable.Drawable r16 = r27.getDividerDrawable()
            if (r16 != 0) goto L4e
            r1 = 0
            goto L52
        L4e:
            int r1 = r16.getIntrinsicHeight()
        L52:
            r17 = r1
            r1 = 0
            r5 = r1
        L56:
            if (r5 >= r12) goto Ldd
            android.view.View r18 = r6.getChildAt(r5)
            if (r18 == 0) goto Ld5
            int r1 = r18.getVisibility()
            r2 = 8
            if (r1 == r2) goto Ld5
            int r19 = r18.getMeasuredWidth()
            int r20 = r18.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r18.getLayoutParams()
            r4 = r1
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            int r1 = r4.gravity
            if (r1 >= 0) goto L7d
            r1 = r15
            r3 = r1
            goto L7e
        L7d:
            r3 = r1
        L7e:
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r27)
            int r21 = androidx.core.view.GravityCompat.getAbsoluteGravity(r3, r2)
            r1 = r21 & 7
            switch(r1) {
                case 1: goto L9d;
                case 5: goto L93;
                default: goto L8b;
            }
        L8b:
            r22 = r2
            int r1 = r4.leftMargin
            int r1 = r1 + r7
            r23 = r1
            goto Lac
        L93:
            int r1 = r9 - r19
            r22 = r2
            int r2 = r4.rightMargin
            int r1 = r1 - r2
            r23 = r1
            goto Lac
        L9d:
            r22 = r2
            int r1 = r10 - r19
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r4.leftMargin
            int r1 = r1 + r2
            int r2 = r4.rightMargin
            int r1 = r1 - r2
            r23 = r1
        Lac:
            boolean r1 = r6.hasDividerBeforeChildAt(r5)
            if (r1 == 0) goto Lb4
            int r0 = r0 + r17
        Lb4:
            int r1 = r4.topMargin
            int r24 = r0 + r1
            r0 = r27
            r1 = r18
            r2 = r23
            r25 = r3
            r3 = r24
            r6 = r4
            r4 = r19
            r26 = r5
            r5 = r20
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r6.bottomMargin
            int r0 = r20 + r0
            int r24 = r24 + r0
            r0 = r24
            goto Ld7
        Ld5:
            r26 = r5
        Ld7:
            int r5 = r26 + 1
            r6 = r27
            goto L56
        Ldd:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.tryOnMeasure(r2, r3)
            if (r0 != 0) goto L9
            super.onMeasure(r2, r3)
        L9:
            return
    }
}
