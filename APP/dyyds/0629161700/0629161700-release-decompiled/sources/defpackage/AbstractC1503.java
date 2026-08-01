package defpackage;

/* JADX INFO: renamed from: ᛸᛶᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1503 implements defpackage.InterfaceC2128 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f6613;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public boolean f6614;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f6615;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f6616;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public final defpackage.C1190 f6617;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final defpackage.ViewOnTouchListenerC1658 f6618;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final int f6619;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final defpackage.RunnableC1548 f6620;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0398 f6621;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public boolean f6622;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public android.widget.ListAdapter f6623;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public final defpackage.RunnableC1548 f6624;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.content.Context f6625;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final int f6626;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public int f6627;

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public final android.os.Handler f6628;

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public final android.graphics.Rect f6629;

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public final defpackage.C0579 f6630;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public android.view.View f6631;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public android.widget.AdapterView.OnItemClickListener f6632;

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public boolean f6633;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int f6634;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public defpackage.C2039 f6635;

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public android.graphics.Rect f6636;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f6637;

    public AbstractC1503(android.content.Context r5, android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>()
            r0 = -2
            r4.f6634 = r0
            r4.f6637 = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            r4.f6626 = r0
            r0 = 0
            r4.f6627 = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r4.f6619 = r1
            ᛸᛸᲀᛸ r1 = new ᛸᛸᲀᛸ
            r2 = 1
            r1.<init>(r4, r2)
            r4.f6620 = r1
            ᲀᛴᛳᛲ r1 = new ᲀᛴᛳᛲ
            r1.<init>(r2, r4)
            r4.f6618 = r1
            ᛶᲈᲀᲀ r1 = new ᛶᲈᲀᲀ
            r1.<init>(r4)
            r4.f6617 = r1
            ᛸᛸᲀᛸ r1 = new ᛸᛸᲀᛸ
            r1.<init>(r4, r0)
            r4.f6624 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.f6629 = r1
            r4.f6625 = r5
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r3 = r5.getMainLooper()
            r1.<init>(r3)
            r4.f6628 = r1
            int[] r1 = defpackage.AbstractC1070.f4785
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1, r7, r0)
            int r3 = r1.getDimensionPixelOffset(r0, r0)
            r4.f6613 = r3
            int r3 = r1.getDimensionPixelOffset(r2, r0)
            r4.f6616 = r3
            if (r3 == 0) goto L5b
            r4.f6614 = r2
        L5b:
            r1.recycle()
            ᛳᲇᲇᛲ r1 = new ᛳᲇᲇᛲ
            r1.<init>(r5, r6, r7, r0)
            int[] r3 = defpackage.AbstractC1070.f4786
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r3, r7, r0)
            r7 = 2
            boolean r3 = r6.hasValue(r7)
            if (r3 == 0) goto L77
            boolean r7 = r6.getBoolean(r7, r0)
            r1.setOverlapAnchor(r7)
        L77:
            boolean r7 = r6.hasValue(r0)
            if (r7 == 0) goto L88
            int r7 = r6.getResourceId(r0, r0)
            if (r7 == 0) goto L88
            android.graphics.drawable.Drawable r5 = defpackage.AbstractC1592.m2873(r5, r7)
            goto L8c
        L88:
            android.graphics.drawable.Drawable r5 = r6.getDrawable(r0)
        L8c:
            r1.setBackgroundDrawable(r5)
            r6.recycle()
            r4.f6630 = r1
            r1.setInputMethodMode(r2)
            return
    }

    @Override // defpackage.InterfaceC2128
    public final void dismiss() {
            r2 = this;
            ᛳᲇᲇᛲ r0 = r2.f6630
            r0.dismiss()
            r1 = 0
            r0.setContentView(r1)
            r2.f6621 = r1
            android.os.Handler r0 = r2.f6628
            ᛸᛸᲀᛸ r2 = r2.f6620
            r0.removeCallbacks(r2)
            return
    }

    @Override // defpackage.InterfaceC2128
    public final void show() {
            r13 = this;
            ᛲᲈᲁᛸ r0 = r13.f6621
            android.content.Context r1 = r13.f6625
            r2 = 1
            ᛳᲇᲇᛲ r3 = r13.f6630
            r4 = 0
            if (r0 != 0) goto L40
            boolean r0 = r13.f6633
            r0 = r0 ^ r2
            ᛲᲈᲁᛸ r0 = r13.mo2731(r1, r0)
            r13.f6621 = r0
            android.widget.ListAdapter r5 = r13.f6623
            r0.setAdapter(r5)
            ᛲᲈᲁᛸ r0 = r13.f6621
            android.widget.AdapterView$OnItemClickListener r5 = r13.f6632
            r0.setOnItemClickListener(r5)
            ᛲᲈᲁᛸ r0 = r13.f6621
            r0.setFocusable(r2)
            ᛲᲈᲁᛸ r0 = r13.f6621
            r0.setFocusableInTouchMode(r2)
            ᛲᲈᲁᛸ r0 = r13.f6621
            ᲀᛳᲁᛳ r5 = new ᲀᛳᲁᛳ
            r5.<init>(r4, r13)
            r0.setOnItemSelectedListener(r5)
            ᛲᲈᲁᛸ r0 = r13.f6621
            ᛶᲈᲀᲀ r5 = r13.f6617
            r0.setOnScrollListener(r5)
            ᛲᲈᲁᛸ r0 = r13.f6621
            r3.setContentView(r0)
            goto L46
        L40:
            android.view.View r0 = r3.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L46:
            android.graphics.drawable.Drawable r0 = r3.getBackground()
            android.graphics.Rect r5 = r13.f6629
            if (r0 == 0) goto L5e
            r0.getPadding(r5)
            int r0 = r5.top
            int r6 = r5.bottom
            int r6 = r6 + r0
            boolean r7 = r13.f6614
            if (r7 != 0) goto L62
            int r0 = -r0
            r13.f6616 = r0
            goto L62
        L5e:
            r5.setEmpty()
            r6 = r4
        L62:
            int r0 = r3.getInputMethodMode()
            r7 = 2
            if (r0 != r7) goto L6b
            r0 = r2
            goto L6c
        L6b:
            r0 = r4
        L6c:
            android.view.View r8 = r13.f6631
            int r9 = r13.f6616
            int r0 = defpackage.AbstractC1728.m3107(r3, r8, r9, r0)
            int r8 = r13.f6634
            r9 = -2
            r10 = -1
            if (r8 != r10) goto L7c
            int r0 = r0 + r6
            goto Lcd
        L7c:
            int r11 = r13.f6637
            if (r11 == r9) goto L9e
            r12 = 1073741824(0x40000000, float:2.0)
            if (r11 == r10) goto L89
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
            goto Lb4
        L89:
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r11 = r5.left
            int r5 = r5.right
            int r11 = r11 + r5
            int r1 = r1 - r11
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r12)
            goto Lb4
        L9e:
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r11 = r5.left
            int r5 = r5.right
            int r11 = r11 + r5
            int r1 = r1 - r11
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
        Lb4:
            ᛲᲈᲁᛸ r5 = r13.f6621
            int r0 = r5.m1159(r1, r0)
            if (r0 <= 0) goto Lcb
            ᛲᲈᲁᛸ r1 = r13.f6621
            int r1 = r1.getPaddingTop()
            ᛲᲈᲁᛸ r5 = r13.f6621
            int r5 = r5.getPaddingBottom()
            int r5 = r5 + r1
            int r5 = r5 + r6
            goto Lcc
        Lcb:
            r5 = r4
        Lcc:
            int r0 = r0 + r5
        Lcd:
            int r1 = r3.getInputMethodMode()
            if (r1 != r7) goto Ld5
            r1 = r2
            goto Ld6
        Ld5:
            r1 = r4
        Ld6:
            int r5 = r13.f6626
            r3.setWindowLayoutType(r5)
            boolean r5 = r3.isShowing()
            if (r5 == 0) goto L135
            android.view.View r5 = r13.f6631
            java.util.WeakHashMap r6 = defpackage.AbstractC0858.f3911
            boolean r5 = r5.isAttachedToWindow()
            if (r5 != 0) goto Led
            goto L19a
        Led:
            int r5 = r13.f6637
            if (r5 != r10) goto Lf3
            r5 = r10
            goto Lfb
        Lf3:
            if (r5 != r9) goto Lfb
            android.view.View r5 = r13.f6631
            int r5 = r5.getWidth()
        Lfb:
            if (r8 != r10) goto L11c
            if (r1 == 0) goto L101
            r8 = r0
            goto L102
        L101:
            r8 = r10
        L102:
            int r0 = r13.f6637
            if (r1 == 0) goto L112
            if (r0 != r10) goto L10a
            r0 = r10
            goto L10b
        L10a:
            r0 = r4
        L10b:
            r3.setWidth(r0)
            r3.setHeight(r4)
            goto L11f
        L112:
            if (r0 != r10) goto L115
            r4 = r10
        L115:
            r3.setWidth(r4)
            r3.setHeight(r10)
            goto L11f
        L11c:
            if (r8 != r9) goto L11f
            r8 = r0
        L11f:
            r3.setOutsideTouchable(r2)
            android.view.View r4 = r13.f6631
            r0 = r5
            int r5 = r13.f6613
            int r6 = r13.f6616
            if (r0 >= 0) goto L12d
            r7 = r10
            goto L12e
        L12d:
            r7 = r0
        L12e:
            if (r8 >= 0) goto L131
            r8 = r10
        L131:
            r3.update(r4, r5, r6, r7, r8)
            return
        L135:
            int r1 = r13.f6637
            if (r1 != r10) goto L13b
            r1 = r10
            goto L143
        L13b:
            if (r1 != r9) goto L143
            android.view.View r1 = r13.f6631
            int r1 = r1.getWidth()
        L143:
            if (r8 != r10) goto L147
            r8 = r10
            goto L14a
        L147:
            if (r8 != r9) goto L14a
            r8 = r0
        L14a:
            r3.setWidth(r1)
            r3.setHeight(r8)
            defpackage.AbstractC2201.m3601(r3, r2)
            r3.setOutsideTouchable(r2)
            ᲀᛴᛳᛲ r0 = r13.f6618
            r3.setTouchInterceptor(r0)
            boolean r0 = r13.f6622
            if (r0 == 0) goto L164
            boolean r0 = r13.f6615
            r3.setOverlapAnchor(r0)
        L164:
            android.graphics.Rect r0 = r13.f6636
            defpackage.AbstractC2201.m3600(r3, r0)
            android.view.View r0 = r13.f6631
            int r1 = r13.f6613
            int r4 = r13.f6616
            int r5 = r13.f6627
            r3.showAsDropDown(r0, r1, r4, r5)
            ᛲᲈᲁᛸ r0 = r13.f6621
            r0.setSelection(r10)
            boolean r0 = r13.f6633
            if (r0 == 0) goto L185
            ᛲᲈᲁᛸ r0 = r13.f6621
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L18f
        L185:
            ᛲᲈᲁᛸ r0 = r13.f6621
            if (r0 == 0) goto L18f
            r0.setListSelectionHidden(r2)
            r0.requestLayout()
        L18f:
            boolean r0 = r13.f6633
            if (r0 != 0) goto L19a
            android.os.Handler r0 = r13.f6628
            ᛸᛸᲀᛸ r13 = r13.f6624
            r0.post(r13)
        L19a:
            return
    }

    @Override // defpackage.InterfaceC2128
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final defpackage.C0398 mo2603() {
            r0 = this;
            ᛲᲈᲁᛸ r0 = r0.f6621
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final void m2724(int r1) {
            r0 = this;
            r0.f6613 = r1
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public void mo1581(android.widget.ListAdapter r3) {
            r2 = this;
            ᲇᛴᛷᲀ r0 = r2.f6635
            if (r0 != 0) goto Ld
            ᲇᛴᛷᲀ r0 = new ᲇᛴᛷᲀ
            r1 = 1
            r0.<init>(r1, r2)
            r2.f6635 = r0
            goto L14
        Ld:
            android.widget.ListAdapter r1 = r2.f6623
            if (r1 == 0) goto L14
            r1.unregisterDataSetObserver(r0)
        L14:
            r2.f6623 = r3
            if (r3 == 0) goto L1d
            ᲇᛴᛷᲀ r0 = r2.f6635
            r3.registerDataSetObserver(r0)
        L1d:
            ᛲᲈᲁᛸ r3 = r2.f6621
            if (r3 == 0) goto L26
            android.widget.ListAdapter r2 = r2.f6623
            r3.setAdapter(r2)
        L26:
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m2725(android.graphics.drawable.Drawable r1) {
            r0 = this;
            ᛳᲇᲇᛲ r0 = r0.f6630
            r0.setBackgroundDrawable(r1)
            return
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final int m2726() {
            r1 = this;
            boolean r0 = r1.f6614
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            int r1 = r1.f6616
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m2727() {
            r0 = this;
            ᛳᲇᲇᛲ r0 = r0.f6630
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
    }

    @Override // defpackage.InterfaceC2128
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo2605() {
            r0 = this;
            ᛳᲇᲇᛲ r0 = r0.f6630
            boolean r0 = r0.isShowing()
            return r0
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final void m2728(int r3) {
            r2 = this;
            ᛳᲇᲇᛲ r0 = r2.f6630
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L16
            android.graphics.Rect r1 = r2.f6629
            r0.getPadding(r1)
            int r0 = r1.left
            int r1 = r1.right
            int r0 = r0 + r1
            int r0 = r0 + r3
            r2.f6637 = r0
            return
        L16:
            r2.f6637 = r3
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int m2729() {
            r0 = this;
            int r0 = r0.f6613
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m2730(int r1) {
            r0 = this;
            r0.f6616 = r1
            r1 = 1
            r0.f6614 = r1
            return
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public defpackage.C0398 mo2731(android.content.Context r1, boolean r2) {
            r0 = this;
            ᛲᲈᲁᛸ r0 = new ᛲᲈᲁᛸ
            r0.<init>(r1, r2)
            return r0
    }
}
