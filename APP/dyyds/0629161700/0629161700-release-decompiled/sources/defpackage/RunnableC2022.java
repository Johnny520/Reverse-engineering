package defpackage;

/* JADX INFO: renamed from: ᲇᛳᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2022 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0559 f8726;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8727;

    public /* synthetic */ RunnableC2022(defpackage.C0559 r1, int r2) {
            r0 = this;
            r0.f8727 = r2
            r0.f8726 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r18 = this;
            r0 = r18
            int r1 = r0.f8727
            r3 = 1
            ᛳᲁᛶᲀ r4 = r0.f8726
            switch(r1) {
                case 0: goto L175;
                case 1: goto L1f;
                default: goto La;
            }
        La:
            r4.m1347()
            boolean r0 = r4.f2753
            if (r0 != 0) goto L12
            goto L1e
        L12:
            ᲁᛶᲀᛷ r0 = r4.f2759
            android.view.View r1 = r4.f2754
            android.view.View r2 = r4.f2764
            r0.m3278(r1, r2)
            r4.m1353()
        L1e:
            return
        L1f:
            ᛳᲁᛶᲀ r5 = r0.f8726
            int r0 = r5.f2769
            int r1 = r5.f2751
            com.android.app.CustomRecyclerView r4 = r5.f2762
            int r11 = r5.f2771
            android.view.View r12 = r5.f2764
            ᛸᛳᛳᲈ r13 = r5.f2752
            r5.m1347()
            android.view.View r6 = r5.f2754
            boolean r7 = r5.f2753
            r14 = 4
            if (r7 == 0) goto L39
            r7 = 0
            goto L3a
        L39:
            r7 = r14
        L3a:
            r6.setVisibility(r7)
            boolean r7 = r5.f2753
            if (r7 == 0) goto L43
            r7 = 0
            goto L44
        L43:
            r7 = r14
        L44:
            r12.setVisibility(r7)
            boolean r7 = r5.f2753
            if (r7 != 0) goto L50
            r13.setVisibility(r14)
            goto L174
        L50:
            int r7 = r4.getLayoutDirection()
            r6.setLayoutDirection(r7)
            r12.setLayoutDirection(r7)
            r13.setLayoutDirection(r7)
            if (r7 != r3) goto L61
            r15 = r3
            goto L62
        L61:
            r15 = 0
        L62:
            int r7 = r4.getWidth()
            int r4 = r4.getHeight()
            android.graphics.Rect r8 = r5.m1351()
            if (r15 == 0) goto L73
            int r9 = r8.left
            goto L78
        L73:
            int r9 = r8.right
            int r9 = r7 - r9
            int r9 = r9 - r0
        L78:
            int r10 = r8.top
            int r0 = r0 + r9
            int r14 = r8.bottom
            int r14 = r4 - r14
            int r14 = java.lang.Math.max(r14, r10)
            r17 = r9
            r9 = r0
            r0 = r7
            r7 = r17
            r17 = r14
            r14 = r8
            r8 = r10
            r10 = r17
            r5.m1348(r6, r7, r8, r9, r10)
            if (r15 == 0) goto L98
            int r6 = r14.left
        L96:
            r7 = r6
            goto L9f
        L98:
            int r6 = r14.right
            int r7 = r0 - r6
            int r6 = r7 - r11
            goto L96
        L9f:
            int r6 = r14.top
            int r8 = r5.f2760
            int r8 = r8 + r6
            int r9 = r7 + r11
            int r10 = r8 + r1
            r6 = r12
            r5.m1348(r6, r7, r8, r9, r10)
            ᲁᛷᛵ r7 = r5.f2761
            java.lang.Object r7 = r7.f8180
            ᛱᛳᛶᛱ r7 = (defpackage.C0055) r7
            r7.getAdapter()
            r7 = 0
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto Lbe
            r10 = 0
            goto Lbf
        Lbe:
            r10 = 4
        Lbf:
            r13.setVisibility(r10)
            if (r9 != 0) goto L174
            android.view.ViewGroup$LayoutParams r9 = r13.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r9 = (android.widget.FrameLayout.LayoutParams) r9
            java.lang.CharSequence r10 = r13.getText()
            boolean r10 = java.util.Objects.equals(r10, r7)
            if (r10 != 0) goto L107
            r13.setText(r7)
            r7 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
            int r12 = r14.left
            int r2 = r14.right
            int r12 = r12 + r2
            int r12 = r12 + r11
            int r2 = r9.leftMargin
            int r12 = r12 + r2
            int r2 = r9.rightMargin
            int r12 = r12 + r2
            int r2 = r9.width
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r10, r12, r2)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r7)
            int r10 = r14.top
            int r12 = r14.bottom
            int r10 = r10 + r12
            int r12 = r9.topMargin
            int r10 = r10 + r12
            int r12 = r9.bottomMargin
            int r10 = r10 + r12
            int r12 = r9.height
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r10, r12)
            r13.measure(r2, r7)
        L107:
            int r2 = r13.getMeasuredWidth()
            int r7 = r13.getMeasuredHeight()
            if (r15 == 0) goto L118
            int r0 = r14.left
            int r0 = r0 + r11
            int r10 = r9.leftMargin
            int r0 = r0 + r10
            goto L120
        L118:
            int r10 = r14.right
            int r0 = r0 - r10
            int r0 = r0 - r11
            int r10 = r9.rightMargin
            int r0 = r0 - r10
            int r0 = r0 - r2
        L120:
            int r10 = r9.gravity
            r11 = r10 & 7
            if (r11 == r3) goto L12f
            r3 = 5
            if (r11 == r3) goto L12c
            r16 = 0
            goto L133
        L12c:
            r16 = r7
            goto L133
        L12f:
            int r3 = r7 / 2
            r16 = r3
        L133:
            r3 = r10 & 112(0x70, float:1.57E-43)
            r10 = 16
            if (r3 == r10) goto L148
            r10 = 80
            if (r3 == r10) goto L142
            int r1 = r6.getPaddingTop()
            goto L155
        L142:
            int r3 = r6.getPaddingBottom()
            int r1 = r1 - r3
            goto L155
        L148:
            int r3 = r6.getPaddingTop()
            int r1 = r1 - r3
            int r6 = r6.getPaddingBottom()
            int r1 = r1 - r6
            int r1 = r1 / 2
            int r1 = r1 + r3
        L155:
            int r8 = r8 + r1
            int r8 = r8 - r16
            int r1 = r14.top
            int r3 = r9.topMargin
            int r1 = r1 + r3
            int r3 = r14.bottom
            int r4 = r4 - r3
            int r3 = r9.bottomMargin
            int r4 = r4 - r3
            int r4 = r4 - r7
            if (r8 >= r1) goto L168
            r8 = r1
            goto L16b
        L168:
            if (r8 <= r4) goto L16b
            r8 = r4
        L16b:
            int r9 = r0 + r2
            int r10 = r8 + r7
            r7 = r0
            r6 = r13
            r5.m1348(r6, r7, r8, r9, r10)
        L174:
            return
        L175:
            boolean r0 = r4.f2758
            if (r0 == 0) goto L17b
            goto L1ea
        L17b:
            ᲁᛶᲀᛷ r0 = r4.f2759
            android.view.View r1 = r4.f2754
            android.view.View r2 = r4.f2764
            com.android.app.CustomRecyclerView r4 = r0.f8134
            boolean r5 = r0.f8135
            if (r5 != 0) goto L188
            goto L1ea
        L188:
            r5 = 0
            r0.f8135 = r5
            int r0 = r4.getLayoutDirection()
            if (r0 != r3) goto L192
            goto L193
        L192:
            r3 = r5
        L193:
            int r0 = r1.getWidth()
            int r5 = r2.getWidth()
            int r0 = java.lang.Math.max(r0, r5)
            r5 = 0
            if (r3 == 0) goto L1ad
            int r3 = r1.getLeft()
            if (r3 != 0) goto L1ab
            int r0 = -r0
        L1a9:
            float r0 = (float) r0
            goto L1b8
        L1ab:
            r0 = r5
            goto L1b8
        L1ad:
            int r3 = r1.getRight()
            int r4 = r4.getWidth()
            if (r3 != r4) goto L1ab
            goto L1a9
        L1b8:
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r5)
            android.view.ViewPropertyAnimator r1 = r1.translationX(r0)
            r3 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            ᛷᛶᛴᲁ r6 = defpackage.C1875.f8131
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r6)
            r1.start()
            android.view.ViewPropertyAnimator r1 = r2.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r5)
            android.view.ViewPropertyAnimator r0 = r1.translationX(r0)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r6)
            r0.start()
        L1ea:
            return
    }
}
