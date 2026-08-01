package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public android.util.TypedValue f117;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final android.graphics.Rect f118;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.util.TypedValue f119;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public android.util.TypedValue f120;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.util.TypedValue f121;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public defpackage.InterfaceC0805 f122;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.util.TypedValue f123;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public android.util.TypedValue f124;

    public ContentFrameLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ContentFrameLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.f118 = r2
            return
    }

    public android.util.TypedValue getFixedHeightMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f124
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f124 = r0
        Lb:
            return r0
    }

    public android.util.TypedValue getFixedHeightMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f117
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f117 = r0
        Lb:
            return r0
    }

    public android.util.TypedValue getFixedWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f119
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f119 = r0
        Lb:
            return r0
    }

    public android.util.TypedValue getFixedWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f123
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f123 = r0
        Lb:
            return r0
    }

    public android.util.TypedValue getMinWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f121
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f121 = r0
        Lb:
            return r0
    }

    public android.util.TypedValue getMinWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.f120
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.f120 = r0
        Lb:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            ᛵᛱᛱᲇ r0 = r0.f122
            if (r0 == 0) goto La
            r0.getClass()
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            ᛵᛱᛱᲇ r2 = r2.f122
            if (r2 == 0) goto L65
            ᛷᲇᛱ r2 = (defpackage.C1378) r2
            ᛸᛱᛱᛲ r2 = r2.f6017
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r2.f6148
            if (r0 == 0) goto L32
            r0.m29()
            ᛸᲁᛲᛲ r0 = r0.f102
            ᛲᛱᛶᛲ r0 = (defpackage.C0235) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f1415
            androidx.appcompat.widget.ActionMenuView r0 = r0.f195
            if (r0 == 0) goto L32
            ᲁᲀᛴᛷ r0 = r0.f107
            if (r0 == 0) goto L32
            r0.m3340()
            ᛲᲈᛸᛲ r0 = r0.f8293
            if (r0 == 0) goto L32
            boolean r1 = r0.m3339()
            if (r1 == 0) goto L32
            ᛶᲇᲀᛵ r0 = r0.f8273
            r0.dismiss()
        L32:
            android.widget.PopupWindow r0 = r2.f6172
            if (r0 == 0) goto L51
            android.view.Window r0 = r2.f6165
            android.view.View r0 = r0.getDecorView()
            ᛴᛷᛸᲀ r1 = r2.f6180
            r0.removeCallbacks(r1)
            android.widget.PopupWindow r0 = r2.f6172
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L4e
            android.widget.PopupWindow r0 = r2.f6172     // Catch: java.lang.IllegalArgumentException -> L4e
            r0.dismiss()     // Catch: java.lang.IllegalArgumentException -> L4e
        L4e:
            r0 = 0
            r2.f6172 = r0
        L51:
            ᲇᲇᛱᛳ r0 = r2.f6177
            if (r0 == 0) goto L58
            r0.m3556()
        L58:
            r0 = 0
            ᛱᛳᲈᛵ r2 = r2.m2576(r0)
            ᲀᛷᛱᲇ r2 = r2.f723
            if (r2 == 0) goto L65
            r0 = 1
            r2.m3082(r0)
        L65:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r17, int r18) {
            r16 = this;
            r0 = r16
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r2 = r1.widthPixels
            int r3 = r1.heightPixels
            r4 = 1
            r5 = 0
            if (r2 >= r3) goto L18
            r2 = r4
            goto L19
        L18:
            r2 = r5
        L19:
            int r3 = android.view.View.MeasureSpec.getMode(r17)
            int r6 = android.view.View.MeasureSpec.getMode(r18)
            android.graphics.Rect r7 = r0.f118
            r8 = 6
            r9 = 5
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r3 != r10) goto L62
            if (r2 == 0) goto L30
            android.util.TypedValue r12 = r0.f123
            goto L32
        L30:
            android.util.TypedValue r12 = r0.f119
        L32:
            if (r12 == 0) goto L62
            int r13 = r12.type
            if (r13 == 0) goto L62
            if (r13 != r9) goto L40
            float r12 = r12.getDimension(r1)
        L3e:
            int r12 = (int) r12
            goto L4c
        L40:
            if (r13 != r8) goto L4b
            int r13 = r1.widthPixels
            float r14 = (float) r13
            float r13 = (float) r13
            float r12 = r12.getFraction(r14, r13)
            goto L3e
        L4b:
            r12 = r5
        L4c:
            if (r12 <= 0) goto L62
            int r13 = r7.left
            int r14 = r7.right
            int r13 = r13 + r14
            int r12 = r12 - r13
            int r13 = android.view.View.MeasureSpec.getSize(r17)
            int r12 = java.lang.Math.min(r12, r13)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r11)
            r13 = r4
            goto L65
        L62:
            r12 = r17
            r13 = r5
        L65:
            if (r6 != r10) goto L9d
            if (r2 == 0) goto L6c
            android.util.TypedValue r6 = r0.f124
            goto L6e
        L6c:
            android.util.TypedValue r6 = r0.f117
        L6e:
            if (r6 == 0) goto L9d
            int r14 = r6.type
            if (r14 == 0) goto L9d
            if (r14 != r9) goto L7c
            float r6 = r6.getDimension(r1)
        L7a:
            int r6 = (int) r6
            goto L88
        L7c:
            if (r14 != r8) goto L87
            int r14 = r1.heightPixels
            float r15 = (float) r14
            float r14 = (float) r14
            float r6 = r6.getFraction(r15, r14)
            goto L7a
        L87:
            r6 = r5
        L88:
            if (r6 <= 0) goto L9d
            int r14 = r7.top
            int r15 = r7.bottom
            int r14 = r14 + r15
            int r6 = r6 - r14
            int r14 = android.view.View.MeasureSpec.getSize(r18)
            int r6 = java.lang.Math.min(r6, r14)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            goto L9f
        L9d:
            r6 = r18
        L9f:
            super.onMeasure(r12, r6)
            int r12 = r0.getMeasuredWidth()
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r11)
            if (r13 != 0) goto Lde
            if (r3 != r10) goto Lde
            if (r2 == 0) goto Lb3
            android.util.TypedValue r2 = r0.f120
            goto Lb5
        Lb3:
            android.util.TypedValue r2 = r0.f121
        Lb5:
            if (r2 == 0) goto Lde
            int r3 = r2.type
            if (r3 == 0) goto Lde
            if (r3 != r9) goto Lc3
            float r1 = r2.getDimension(r1)
        Lc1:
            int r1 = (int) r1
            goto Lcf
        Lc3:
            if (r3 != r8) goto Lce
            int r1 = r1.widthPixels
            float r3 = (float) r1
            float r1 = (float) r1
            float r1 = r2.getFraction(r3, r1)
            goto Lc1
        Lce:
            r1 = r5
        Lcf:
            if (r1 <= 0) goto Ld7
            int r2 = r7.left
            int r3 = r7.right
            int r2 = r2 + r3
            int r1 = r1 - r2
        Ld7:
            if (r12 >= r1) goto Lde
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r11)
            goto Ldf
        Lde:
            r4 = r5
        Ldf:
            if (r4 == 0) goto Le4
            super.onMeasure(r14, r6)
        Le4:
            return
    }

    public void setAttachListener(defpackage.InterfaceC0805 r1) {
            r0 = this;
            r0.f122 = r1
            return
    }
}
