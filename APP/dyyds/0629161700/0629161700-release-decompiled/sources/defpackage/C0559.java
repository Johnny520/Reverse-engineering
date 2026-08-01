package defpackage;

/* JADX INFO: renamed from: ᛳᲁᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0559 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int f2751;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.C1454 f2752;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f2753;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final android.view.View f2754;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public final android.graphics.Rect f2755;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final defpackage.RunnableC2022 f2756;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public float f2757;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public boolean f2758;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1875 f2759;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public int f2760;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1884 f2761;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final com.android.app.CustomRecyclerView f2762;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f2763;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final android.view.View f2764;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public float f2765;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public float f2766;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public int f2767;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f2768;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int f2769;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public float f2770;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final int f2771;

    public C0559(com.android.app.CustomRecyclerView r4, defpackage.C1884 r5, android.graphics.drawable.Drawable r6, android.graphics.drawable.Drawable r7, defpackage.InterfaceC1521 r8, defpackage.C1875 r9) {
            r3 = this;
            java.lang.Object r0 = r5.f8180
            ᛱᛳᛶᛱ r0 = (defpackage.C0055) r0
            r3.<init>()
            ᲇᛳᛷᲇ r1 = new ᲇᛳᛷᲇ
            r2 = 0
            r1.<init>(r3, r2)
            r3.f2756 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.f2755 = r1
            android.content.res.Resources r1 = r4.getResources()
            r2 = 1711734872(0x66070058, float:1.5938145E23)
            int r1 = r1.getDimensionPixelSize(r2)
            r3.f2763 = r1
            android.content.Context r1 = r4.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r1)
            int r2 = r2.getScaledTouchSlop()
            r3.f2768 = r2
            r3.f2762 = r4
            r3.f2761 = r5
            r3.f2759 = r9
            int r5 = r6.getIntrinsicWidth()
            r9 = 0
            if (r5 < 0) goto Lcf
            r3.f2769 = r5
            int r5 = r7.getIntrinsicWidth()
            if (r5 < 0) goto Lc9
            r3.f2771 = r5
            int r5 = r7.getIntrinsicHeight()
            if (r5 < 0) goto Lc3
            r3.f2751 = r5
            android.view.View r5 = new android.view.View
            r5.<init>(r1)
            r3.f2754 = r5
            r5.setBackground(r6)
            android.view.View r6 = new android.view.View
            r6.<init>(r1)
            r3.f2764 = r6
            r6.setBackground(r7)
            ᛸᛳᛳᲈ r7 = new ᛸᛳᛳᲈ
            r7.<init>(r1, r9)
            r3.f2752 = r7
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r9.<init>(r1, r1)
            r7.setLayoutParams(r9)
            r8.accept(r7)
            android.view.ViewGroupOverlay r4 = r4.getOverlay()
            r4.add(r5)
            r4.add(r6)
            r4.add(r7)
            r3.m1353()
            r4 = 0
            r7.setAlpha(r4)
            ᲇᛳᛷᲇ r4 = new ᲇᛳᛷᲇ
            r5 = 1
            r4.<init>(r3, r5)
            ᛸᛶᲁ r6 = new ᛸᛶᲁ
            r6.<init>(r4)
            r0.m409(r6)
            ᲇᛳᛷᲇ r4 = new ᲇᛳᛷᲇ
            r6 = 2
            r4.<init>(r3, r6)
            ᛵᛱᛴᲁ r6 = new ᛵᛱᛴᲁ
            r6.<init>(r5, r4)
            java.util.ArrayList r4 = r0.f614
            if (r4 != 0) goto Laf
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.f614 = r4
        Laf:
            r4.add(r6)
            ᛱᲇᛴᛲ r4 = new ᛱᲇᛴᛲ
            r6 = 3
            r4.<init>(r6, r3)
            ᛲᛶᛴᛶ r3 = new ᛲᛶᛴᛶ
            r3.<init>(r5, r4)
            java.util.ArrayList r4 = r0.f634
            r4.add(r3)
            return
        Lc3:
            java.lang.String r3 = "thumbDrawable.getIntrinsicHeight() < 0"
            defpackage.C2264.m3684(r3)
            throw r9
        Lc9:
            java.lang.String r3 = "thumbDrawable.getIntrinsicWidth() < 0"
            defpackage.C2264.m3684(r3)
            throw r9
        Lcf:
            java.lang.String r3 = "trackDrawable.getIntrinsicWidth() < 0"
            defpackage.C2264.m3684(r3)
            throw r9
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void m1346(boolean r7) {
            r6 = this;
            boolean r0 = r6.f2758
            if (r0 != r7) goto L5
            goto L53
        L5:
            r6.f2758 = r7
            com.android.app.CustomRecyclerView r0 = r6.f2762
            r1 = 1
            if (r7 == 0) goto L13
            android.view.ViewParent r7 = r0.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
        L13:
            boolean r7 = r6.f2758
            android.view.View r2 = r6.f2754
            r2.setPressed(r7)
            boolean r7 = r6.f2758
            android.view.View r3 = r6.f2764
            r3.setPressed(r7)
            boolean r7 = r6.f2758
            ᛸᛳᛳᲈ r4 = r6.f2752
            ᲁᛶᲀᛷ r5 = r6.f2759
            if (r7 == 0) goto L4c
            ᲇᛳᛷᲇ r6 = r6.f2756
            r0.removeCallbacks(r6)
            r5.m3278(r2, r3)
            boolean r6 = r5.f8133
            if (r6 == 0) goto L36
            goto L53
        L36:
            r5.f8133 = r1
            android.view.ViewPropertyAnimator r6 = r4.animate()
            r7 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r6 = r6.alpha(r7)
            r0 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r0)
            r6.start()
            return
        L4c:
            r6.m1353()
            boolean r6 = r5.f8133
            if (r6 != 0) goto L54
        L53:
            return
        L54:
            r6 = 0
            r5.f8133 = r6
            android.view.ViewPropertyAnimator r6 = r4.animate()
            r7 = 0
            android.view.ViewPropertyAnimator r6 = r6.alpha(r7)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r0)
            r6.start()
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m1347() {
            r10 = this;
            int r0 = r10.m1352()
            r1 = 0
            if (r0 <= 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = r1
        La:
            r10.f2753 = r2
            if (r2 == 0) goto L79
            android.graphics.Rect r2 = r10.m1351()
            com.android.app.CustomRecyclerView r3 = r10.f2762
            int r3 = r3.getHeight()
            int r4 = r2.top
            int r3 = r3 - r4
            int r2 = r2.bottom
            int r3 = r3 - r2
            int r2 = r10.f2751
            int r3 = r3 - r2
            long r2 = (long) r3
            ᲁᛷᛵ r4 = r10.f2761
            java.lang.Object r5 = r4.f8180
            ᛱᛳᛶᛱ r5 = (defpackage.C0055) r5
            int r6 = r5.getChildCount()
            r7 = -1
            if (r6 != 0) goto L30
            goto L3a
        L30:
            android.view.View r6 = r5.getChildAt(r1)
            androidx.recyclerview.widget.LinearLayoutManager r8 = r4.m3302()
            if (r8 != 0) goto L3c
        L3a:
            r6 = r7
            goto L40
        L3c:
            int r6 = defpackage.AbstractC1270.m2371(r6)
        L40:
            androidx.recyclerview.widget.LinearLayoutManager r8 = r4.m3302()
            if (r8 != 0) goto L48
            r6 = r7
            goto L51
        L48:
            boolean r9 = r8 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r9 == 0) goto L51
            androidx.recyclerview.widget.GridLayoutManager r8 = (androidx.recyclerview.widget.GridLayoutManager) r8
            int r8 = r8.f293
            int r6 = r6 / r8
        L51:
            if (r6 != r7) goto L54
            goto L74
        L54:
            int r8 = r4.m3316()
            java.lang.Object r4 = r4.f8179
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            int r9 = r5.getChildCount()
            if (r9 != 0) goto L63
            goto L6c
        L63:
            android.view.View r1 = r5.getChildAt(r1)
            defpackage.C0055.m398(r4, r1)
            int r7 = r4.top
        L6c:
            int r1 = r5.getPaddingTop()
            int r6 = r6 * r8
            int r6 = r6 + r1
            int r1 = r6 - r7
        L74:
            long r4 = (long) r1
            long r2 = r2 * r4
            long r0 = (long) r0
            long r2 = r2 / r0
            int r1 = (int) r2
        L79:
            r10.f2760 = r1
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m1348(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            com.android.app.CustomRecyclerView r1 = r1.f2762
            int r0 = r1.getScrollX()
            int r1 = r1.getScrollY()
            int r3 = r3 + r0
            int r4 = r4 + r1
            int r0 = r0 + r5
            int r1 = r1 + r6
            r2.layout(r3, r4, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean m1349(android.view.View r6, float r7, float r8) {
            r5 = this;
            com.android.app.CustomRecyclerView r0 = r5.f2762
            int r1 = r0.getScrollX()
            int r2 = r0.getScrollY()
            int r3 = r6.getLeft()
            int r3 = r3 - r1
            int r4 = r6.getRight()
            int r4 = r4 - r1
            int r1 = r0.getWidth()
            boolean r7 = r5.m1350(r7, r3, r4, r1)
            if (r7 == 0) goto L34
            int r7 = r6.getTop()
            int r7 = r7 - r2
            int r6 = r6.getBottom()
            int r6 = r6 - r2
            int r0 = r0.getHeight()
            boolean r5 = r5.m1350(r8, r7, r6, r0)
            if (r5 == 0) goto L34
            r5 = 1
            return r5
        L34:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean m1350(float r3, int r4, int r5, int r6) {
            r2 = this;
            int r0 = r5 - r4
            r1 = 0
            int r2 = r2.f2763
            if (r0 < r2) goto L12
            float r2 = (float) r4
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L31
            float r2 = (float) r5
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L31
            goto L2f
        L12:
            int r5 = r2 - r0
            int r5 = r5 / 2
            int r4 = r4 - r5
            if (r4 >= 0) goto L1a
            r4 = r1
        L1a:
            int r5 = r4 + r2
            if (r5 <= r6) goto L24
            int r4 = r6 - r2
            if (r4 >= 0) goto L25
            r4 = r1
            goto L25
        L24:
            r6 = r5
        L25:
            float r2 = (float) r4
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L31
            float r2 = (float) r6
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L31
        L2f:
            r2 = 1
            return r2
        L31:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.graphics.Rect m1351() {
            r4 = this;
            com.android.app.CustomRecyclerView r0 = r4.f2762
            int r1 = r0.getPaddingLeft()
            int r2 = r0.getPaddingTop()
            int r3 = r0.getPaddingRight()
            int r0 = r0.getPaddingBottom()
            android.graphics.Rect r4 = r4.f2755
            r4.set(r1, r2, r3, r0)
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int m1352() {
            r6 = this;
            ᲁᛷᛵ r0 = r6.f2761
            java.lang.Object r1 = r0.f8180
            ᛱᛳᛶᛱ r1 = (defpackage.C0055) r1
            androidx.recyclerview.widget.LinearLayoutManager r2 = r0.m3302()
            r3 = 0
            if (r2 != 0) goto Lf
        Ld:
            r4 = r3
            goto L23
        Lf:
            int r4 = r2.m2387()
            if (r4 != 0) goto L16
            goto Ld
        L16:
            boolean r5 = r2 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r5 == 0) goto L23
            androidx.recyclerview.widget.GridLayoutManager r2 = (androidx.recyclerview.widget.GridLayoutManager) r2
            int r4 = r4 + (-1)
            int r2 = r2.f293
            int r4 = r4 / r2
            int r4 = r4 + 1
        L23:
            if (r4 != 0) goto L26
            goto L39
        L26:
            int r0 = r0.m3316()
            if (r0 != 0) goto L2d
            goto L39
        L2d:
            int r2 = r1.getPaddingTop()
            int r4 = r4 * r0
            int r4 = r4 + r2
            int r0 = r1.getPaddingBottom()
            int r3 = r0 + r4
        L39:
            com.android.app.CustomRecyclerView r6 = r6.f2762
            int r6 = r6.getHeight()
            int r3 = r3 - r6
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m1353() {
            r4 = this;
            com.android.app.CustomRecyclerView r0 = r4.f2762
            ᲇᛳᛷᲇ r1 = r4.f2756
            r0.removeCallbacks(r1)
            ᲁᛶᲀᛷ r4 = r4.f2759
            r4.getClass()
            r2 = 1500(0x5dc, double:7.41E-321)
            r0.postDelayed(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m1354(int r7) {
            r6 = this;
            android.graphics.Rect r0 = r6.m1351()
            com.android.app.CustomRecyclerView r1 = r6.f2762
            int r1 = r1.getHeight()
            int r2 = r0.top
            int r1 = r1 - r2
            int r0 = r0.bottom
            int r1 = r1 - r0
            int r0 = r6.f2751
            int r1 = r1 - r0
            r0 = 0
            if (r7 >= 0) goto L18
            r7 = r0
            goto L1b
        L18:
            if (r7 <= r1) goto L1b
            r7 = r1
        L1b:
            int r2 = r6.m1352()
            long r2 = (long) r2
            long r4 = (long) r7
            long r2 = r2 * r4
            long r4 = (long) r1
            long r2 = r2 / r4
            int r7 = (int) r2
            ᲁᛷᛵ r6 = r6.f2761
            java.lang.Object r1 = r6.f8180
            ᛱᛳᛶᛱ r1 = (defpackage.C0055) r1
            r1.m423()
            int r2 = r1.getPaddingTop()
            int r7 = r7 - r2
            int r2 = r6.m3316()
            int r3 = r7 / r2
            int r0 = java.lang.Math.max(r0, r3)
            int r2 = r2 * r0
            int r2 = r2 - r7
            androidx.recyclerview.widget.LinearLayoutManager r6 = r6.m3302()
            if (r6 != 0) goto L46
            return
        L46:
            boolean r7 = r6 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r7 == 0) goto L50
            r7 = r6
            androidx.recyclerview.widget.GridLayoutManager r7 = (androidx.recyclerview.widget.GridLayoutManager) r7
            int r7 = r7.f293
            int r0 = r0 * r7
        L50:
            int r7 = r1.getPaddingTop()
            int r2 = r2 - r7
            r6.m190(r0, r2)
            return
    }
}
