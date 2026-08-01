package defpackage;

/* JADX INFO: renamed from: ᛷᛵᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1270 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final boolean f5679;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public boolean f5680;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public int f5681;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final boolean f5682;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public int f5683;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0108 f5684;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public int f5685;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1884 f5686;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1884 f5687;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C2295 f5688;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f5689;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public int f5690;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public defpackage.C0055 f5691;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f5692;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f5693;

    public AbstractC1270() {
            r3 = this;
            r3.<init>()
            ᛴᛳᲈᛱ r0 = new ᛴᛳᲈᛱ
            r1 = 0
            r0.<init>(r3, r1)
            ᛴᛳᲈᛱ r1 = new ᛴᛳᲈᛱ
            r2 = 1
            r1.<init>(r3, r2)
            ᲁᛷᛵ r2 = new ᲁᛷᛵ
            r2.<init>(r0)
            r3.f5687 = r2
            ᲁᛷᛵ r0 = new ᲁᛷᛵ
            r0.<init>(r1)
            r3.f5686 = r0
            r0 = 0
            r3.f5692 = r0
            r3.f5693 = r0
            r0 = 1
            r3.f5679 = r0
            r3.f5682 = r0
            return
    }

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public static defpackage.C1906 m2369(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            ᲁᲀᛱᛸ r0 = new ᲁᲀᛱᛸ
            r0.<init>()
            int[] r1 = defpackage.AbstractC0168.f1146
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r1, r4, r5)
            r3 = 0
            r4 = 1
            int r5 = r2.getInt(r3, r4)
            r0.f8268 = r5
            r5 = 10
            int r4 = r2.getInt(r5, r4)
            r0.f8269 = r4
            r4 = 9
            boolean r4 = r2.getBoolean(r4, r3)
            r0.f8267 = r4
            r4 = 11
            boolean r3 = r2.getBoolean(r4, r3)
            r0.f8266 = r3
            r2.recycle()
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public static int m2370(android.view.View r1) {
            int r0 = r1.getTop()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            ᛵᛲᲁᛴ r1 = (defpackage.C0840) r1
            android.graphics.Rect r1 = r1.f3864
            int r1 = r1.top
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public static int m2371(android.view.View r0) {
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            ᛵᛲᲁᛴ r0 = (defpackage.C0840) r0
            ᲈᛸᲈᛷ r0 = r0.f3863
            int r0 = r0.m3782()
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛱᲈᛳ, reason: contains not printable characters */
    public static void m2372(android.view.View r3, int r4, int r5, int r6, int r7) {
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            ᛵᛲᲁᛴ r0 = (defpackage.C0840) r0
            android.graphics.Rect r1 = r0.f3864
            int r2 = r1.left
            int r4 = r4 + r2
            int r2 = r0.leftMargin
            int r4 = r4 + r2
            int r2 = r1.top
            int r5 = r5 + r2
            int r2 = r0.topMargin
            int r5 = r5 + r2
            int r2 = r1.right
            int r6 = r6 - r2
            int r2 = r0.rightMargin
            int r6 = r6 - r2
            int r1 = r1.bottom
            int r7 = r7 - r1
            int r0 = r0.bottomMargin
            int r7 = r7 - r0
            r3.layout(r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public static int m2373(boolean r4, int r5, int r6, int r7, int r8) {
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
    }

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public static int m2374(android.view.View r1) {
            int r0 = r1.getRight()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            ᛵᛲᲁᛴ r1 = (defpackage.C0840) r1
            android.graphics.Rect r1 = r1.f3864
            int r1 = r1.right
            int r0 = r0 + r1
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public static int m2375(android.view.View r1) {
            int r0 = r1.getLeft()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            ᛵᛲᲁᛴ r1 = (defpackage.C0840) r1
            android.graphics.Rect r1 = r1.f3864
            int r1 = r1.left
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛱᛱ, reason: contains not printable characters */
    public static boolean m2376(int r3, int r4, int r5) {
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = 0
            if (r5 <= 0) goto Le
            if (r3 == r5) goto Le
            return r1
        Le:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            if (r0 == r5) goto L1f
            if (r0 == 0) goto L1e
            r5 = 1073741824(0x40000000, float:2.0)
            if (r0 == r5) goto L1a
            return r1
        L1a:
            if (r4 != r3) goto L1d
            return r2
        L1d:
            return r1
        L1e:
            return r2
        L1f:
            if (r4 < r3) goto L22
            return r2
        L22:
            return r1
    }

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public static int m2377(android.view.View r1) {
            int r0 = r1.getBottom()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            ᛵᛲᲁᛴ r1 = (defpackage.C0840) r1
            android.graphics.Rect r1 = r1.f3864
            int r1 = r1.bottom
            int r0 = r0 + r1
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static int m2378(int r2, int r3, int r4) {
            int r0 = android.view.View.MeasureSpec.getMode(r2)
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L15
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L14
            int r2 = java.lang.Math.max(r3, r4)
        L14:
            return r2
        L15:
            int r3 = java.lang.Math.max(r3, r4)
            int r2 = java.lang.Math.min(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public abstract void mo159(int r1, int r2, defpackage.C1000 r3, defpackage.C0128 r4);

    /* JADX INFO: renamed from: ᛱᛳᛷ */
    public void mo201(int r4) {
            r3 = this;
            ᛱᛳᛶᛱ r3 = r3.f5691
            if (r3 == 0) goto L19
            ᲈᛷᲀᲀ r0 = r3.f611
            int r0 = r0.m3713()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L19
            ᲈᛷᲀᲀ r2 = r3.f611
            android.view.View r2 = r2.m3722(r1)
            r2.offsetTopAndBottom(r4)
            int r1 = r1 + 1
            goto Lb
        L19:
            return
    }

    /* JADX INFO: renamed from: ᛱᲇᲀᛸ, reason: contains not printable characters */
    public final void m2379(int r6) {
            r5 = this;
            android.view.View r0 = r5.m2382(r6)
            if (r0 == 0) goto L53
            ᲈᛷᲀᲀ r5 = r5.f5688
            java.lang.Object r0 = r5.f9711
            ᲀᛴᛴᛸ r0 = (defpackage.C1662) r0
            int r1 = r5.f9712
            r2 = 1
            if (r1 == r2) goto L4e
            r3 = 2
            if (r1 == r3) goto L48
            r1 = 0
            r3 = 0
            int r6 = r5.m3714(r6)     // Catch: java.lang.Throwable -> L39
            ᛱᛳᛶᛱ r4 = r0.f7409     // Catch: java.lang.Throwable -> L39
            android.view.View r4 = r4.getChildAt(r6)     // Catch: java.lang.Throwable -> L39
            if (r4 != 0) goto L27
            r5.f9712 = r3
            r5.f9715 = r1
            return
        L27:
            r5.f9712 = r2     // Catch: java.lang.Throwable -> L39
            r5.f9715 = r4     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r5.f9710     // Catch: java.lang.Throwable -> L39
            ᛱᲀᛸᛴ r2 = (defpackage.C0167) r2     // Catch: java.lang.Throwable -> L39
            boolean r2 = r2.m704(r6)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L3b
            r5.m3724(r4)     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            r6 = move-exception
            goto L43
        L3b:
            r0.m3055(r6)     // Catch: java.lang.Throwable -> L39
            r5.f9712 = r3
            r5.f9715 = r1
            return
        L43:
            r5.f9712 = r3
            r5.f9715 = r1
            throw r6
        L48:
            java.lang.String r5 = "Cannot call removeView(At) within removeViewIfHidden"
            defpackage.C2264.m3676(r5)
            return
        L4e:
            java.lang.String r5 = "Cannot call removeView(At) within removeView(At)"
            defpackage.C2264.m3676(r5)
        L53:
            return
    }

    /* JADX INFO: renamed from: ᛱᲈᛷᲀ */
    public void mo203(int r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public abstract int mo115(defpackage.C1000 r1);

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public final int m2380() {
            r0 = this;
            ᛱᛳᛶᛱ r0 = r0.f5691
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingLeft()
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public abstract int mo116(defpackage.C1000 r1);

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public void mo161(int r1, defpackage.C0128 r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛲᛵᲁᛲ */
    public void mo117(defpackage.C1633 r7, defpackage.C1000 r8, android.view.View r9, defpackage.C2060 r10) {
            r6 = this;
            boolean r7 = r6.mo170()
            r8 = 0
            if (r7 == 0) goto Ld
            int r7 = m2371(r9)
            r0 = r7
            goto Le
        Ld:
            r0 = r8
        Le:
            boolean r6 = r6.mo172()
            if (r6 == 0) goto L18
            int r8 = m2371(r9)
        L18:
            r2 = r8
            r4 = 0
            r5 = 0
            r1 = 1
            r3 = 1
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r6 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r0, r1, r2, r3, r4, r5)
            android.view.accessibility.AccessibilityNodeInfo r7 = r10.f8857
            r7.setCollectionItemInfo(r6)
            return
    }

    /* JADX INFO: renamed from: ᛲᛶᛷᛲ, reason: contains not printable characters */
    public final void m2381(android.view.View r3, defpackage.C2060 r4) {
            r2 = this;
            ᲈᛸᲈᛷ r0 = defpackage.C0055.m405(r3)
            if (r0 == 0) goto L23
            boolean r1 = r0.m3785()
            if (r1 != 0) goto L23
            ᲈᛷᲀᲀ r1 = r2.f5688
            android.view.View r0 = r0.f9791
            java.lang.Object r1 = r1.f9714
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L23
            ᛱᛳᛶᛱ r0 = r2.f5691
            ᲀᛲᲁᛳ r1 = r0.f637
            ᛵᲈᲁᲀ r0 = r0.f623
            r2.mo117(r1, r0, r3, r4)
        L23:
            return
    }

    /* JADX INFO: renamed from: ᛲᲈᛶᲇ */
    public void mo118(int r1, int r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public final android.view.View m2382(int r1) {
            r0 = this;
            ᲈᛷᲀᲀ r0 = r0.f5688
            if (r0 == 0) goto L9
            android.view.View r0 = r0.m3722(r1)
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛲᲈᛸᛲ */
    public abstract void mo162(android.os.Parcelable r1);

    /* JADX INFO: renamed from: ᛳᛳᛵᛲ */
    public abstract int mo119(int r1, defpackage.C1633 r2, defpackage.C1000 r3);

    /* JADX INFO: renamed from: ᛳᛸᛱᲇ */
    public abstract boolean mo164();

    /* JADX INFO: renamed from: ᛳᛸᛲᛳ, reason: contains not printable characters */
    public final void m2383() {
            r0 = this;
            ᛱᛳᛶᛱ r0 = r0.f5691
            if (r0 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ */
    public defpackage.C0840 mo121(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.C0840
            if (r0 == 0) goto Lc
            ᛵᛲᲁᛴ r0 = new ᛵᛲᲁᛴ
            ᛵᛲᲁᛴ r1 = (defpackage.C0840) r1
            r0.<init>(r1)
            return r0
        Lc:
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            ᛵᛲᲁᛴ r0 = new ᛵᛲᲁᛴ
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        L18:
            ᛵᛲᲁᛴ r0 = new ᛵᛲᲁᛴ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛴᛲᲈ */
    public void mo208() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛴᛴᲇᲀ, reason: contains not printable characters */
    public final void m2384(defpackage.C0055 r2) {
            r1 = this;
            if (r2 != 0) goto Ld
            r2 = 0
            r1.f5691 = r2
            r1.f5688 = r2
            r2 = 0
            r1.f5690 = r2
            r1.f5683 = r2
            goto L1f
        Ld:
            r1.f5691 = r2
            ᲈᛷᲀᲀ r0 = r2.f611
            r1.f5688 = r0
            int r0 = r2.getWidth()
            r1.f5690 = r0
            int r2 = r2.getHeight()
            r1.f5683 = r2
        L1f:
            r2 = 1073741824(0x40000000, float:2.0)
            r1.f5681 = r2
            r1.f5685 = r2
            return
    }

    /* JADX INFO: renamed from: ᛴᛴᲈᛵ */
    public void mo122() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛴᛵᛸᛴ */
    public abstract void mo167(defpackage.C0055 r1, int r2);

    /* JADX INFO: renamed from: ᛴᛶᛸᲈ */
    public void mo123(defpackage.C1633 r5, defpackage.C1000 r6, defpackage.C2060 r7) {
            r4 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.f8857
            ᛱᛳᛶᛱ r1 = r4.f5691
            r2 = -1
            boolean r1 = r1.canScrollVertically(r2)
            r3 = 1
            if (r1 != 0) goto L14
            ᛱᛳᛶᛱ r1 = r4.f5691
            boolean r1 = r1.canScrollHorizontally(r2)
            if (r1 == 0) goto L1f
        L14:
            r1 = 8192(0x2000, float:1.148E-41)
            r0.addAction(r1)
            r0.setScrollable(r3)
            r7.m3458()
        L1f:
            ᛱᛳᛶᛱ r1 = r4.f5691
            boolean r1 = r1.canScrollVertically(r3)
            if (r1 != 0) goto L2f
            ᛱᛳᛶᛱ r1 = r4.f5691
            boolean r1 = r1.canScrollHorizontally(r3)
            if (r1 == 0) goto L3a
        L2f:
            r1 = 4096(0x1000, float:5.74E-42)
            r0.addAction(r1)
            r0.setScrollable(r3)
            r7.m3458()
        L3a:
            int r7 = r4.mo138(r5, r6)
            int r4 = r4.mo149(r5, r6)
            r5 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r4 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r7, r4, r5, r5)
            r0.setCollectionInfo(r4)
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public abstract int mo124(defpackage.C1000 r1);

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ */
    public defpackage.C0840 mo126(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            ᛵᛲᲁᛴ r0 = new ᛵᛲᲁᛴ
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲁᲇᛲ */
    public abstract void mo168(int r1);

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public abstract boolean mo170();

    /* JADX INFO: renamed from: ᛵᛳᲀᛵ, reason: contains not printable characters */
    public final void m2385(defpackage.C0055 r3) {
            r2 = this;
            int r0 = r3.getWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r3 = r3.getHeight()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r2.m2401(r0, r3)
            return
    }

    /* JADX INFO: renamed from: ᛵᛵᲀᛲ */
    public abstract android.view.View mo130(android.view.View r1, int r2, defpackage.C1633 r3, defpackage.C1000 r4);

    /* JADX INFO: renamed from: ᛵᲀᛸᲈ */
    public boolean mo131(int r10, android.os.Bundle r11) {
            r9 = this;
            ᛱᛳᛶᛱ r0 = r9.f5691
            ᲀᛲᲁᛳ r0 = r0.f637
            int r0 = r9.f5683
            int r1 = r9.f5690
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            ᛱᛳᛶᛱ r3 = r9.f5691
            android.graphics.Matrix r3 = r3.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L29
            ᛱᛳᛶᛱ r3 = r9.f5691
            boolean r3 = r3.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L29
            int r0 = r2.height()
            int r1 = r2.width()
        L29:
            r2 = 8192(0x2000, float:1.148E-41)
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = 1
            r5 = 0
            if (r10 == r3) goto L62
            if (r10 == r2) goto L36
            r0 = r5
            r1 = r0
            goto L88
        L36:
            ᛱᛳᛶᛱ r6 = r9.f5691
            r7 = -1
            boolean r6 = r6.canScrollVertically(r7)
            if (r6 == 0) goto L4b
            int r6 = r9.m2402()
            int r0 = r0 - r6
            int r6 = r9.m2397()
            int r0 = r0 - r6
            int r0 = -r0
            goto L4c
        L4b:
            r0 = r5
        L4c:
            ᛱᛳᛶᛱ r6 = r9.f5691
            boolean r6 = r6.canScrollHorizontally(r7)
            if (r6 == 0) goto L60
            int r6 = r9.m2380()
            int r1 = r1 - r6
            int r6 = r9.m2389()
            int r1 = r1 - r6
            int r1 = -r1
            goto L88
        L60:
            r1 = r5
            goto L88
        L62:
            ᛱᛳᛶᛱ r6 = r9.f5691
            boolean r6 = r6.canScrollVertically(r4)
            if (r6 == 0) goto L75
            int r6 = r9.m2402()
            int r0 = r0 - r6
            int r6 = r9.m2397()
            int r0 = r0 - r6
            goto L76
        L75:
            r0 = r5
        L76:
            ᛱᛳᛶᛱ r6 = r9.f5691
            boolean r6 = r6.canScrollHorizontally(r4)
            if (r6 == 0) goto L60
            int r6 = r9.m2380()
            int r1 = r1 - r6
            int r6 = r9.m2389()
            int r1 = r1 - r6
        L88:
            if (r0 != 0) goto L8d
            if (r1 != 0) goto L8d
            goto Lc9
        L8d:
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto Lba
            java.lang.String r8 = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT"
            float r11 = r11.getFloat(r8, r7)
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 >= 0) goto Lbb
            boolean r9 = defpackage.C0055.f603
            if (r9 != 0) goto La1
            goto Lc9
        La1:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value ("
            r10.<init>(r0)
            r10.append(r11)
            java.lang.String r11 = ")"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lba:
            r11 = r7
        Lbb:
            r8 = 2139095040(0x7f800000, float:Infinity)
            int r8 = java.lang.Float.compare(r11, r8)
            if (r8 != 0) goto Ldc
            ᛱᛳᛶᛱ r9 = r9.f5691
            ᛶᲈᲀᲇ r11 = r9.f633
            if (r11 != 0) goto Lca
        Lc9:
            return r5
        Lca:
            if (r10 == r3) goto Ld3
            if (r10 == r2) goto Lcf
            return r4
        Lcf:
            r9.m441(r5)
            return r4
        Ld3:
            int r10 = r11.getItemCount()
            int r10 = r10 - r4
            r9.m441(r10)
            return r4
        Ldc:
            int r10 = java.lang.Float.compare(r7, r11)
            if (r10 == 0) goto Lee
            int r10 = java.lang.Float.compare(r6, r11)
            if (r10 == 0) goto Lee
            float r10 = (float) r1
            float r10 = r10 * r11
            int r1 = (int) r10
            float r10 = (float) r0
            float r10 = r10 * r11
            int r0 = (int) r10
        Lee:
            ᛱᛳᛶᛱ r9 = r9.f5691
            r9.m456(r1, r0, r4)
            return r4
    }

    /* JADX INFO: renamed from: ᛶᛳᛷᲀ, reason: contains not printable characters */
    public final void m2386(int r9, int r10) {
            r8 = this;
            int r0 = r8.m2393()
            if (r0 != 0) goto Lc
            ᛱᛳᛶᛱ r8 = r8.f5691
            r8.m429(r9, r10)
            return
        Lc:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r4 = r2
            r5 = r3
            r2 = r1
            r3 = r4
        L16:
            if (r5 >= r0) goto L3a
            android.view.View r6 = r8.m2382(r5)
            ᛱᛳᛶᛱ r7 = r8.f5691
            android.graphics.Rect r7 = r7.f617
            defpackage.C0055.m398(r7, r6)
            int r6 = r7.left
            if (r6 >= r3) goto L28
            r3 = r6
        L28:
            int r6 = r7.right
            if (r6 <= r1) goto L2d
            r1 = r6
        L2d:
            int r6 = r7.top
            if (r6 >= r4) goto L32
            r4 = r6
        L32:
            int r6 = r7.bottom
            if (r6 <= r2) goto L37
            r2 = r6
        L37:
            int r5 = r5 + 1
            goto L16
        L3a:
            ᛱᛳᛶᛱ r0 = r8.f5691
            android.graphics.Rect r0 = r0.f617
            r0.set(r3, r4, r1, r2)
            ᛱᛳᛶᛱ r0 = r8.f5691
            android.graphics.Rect r0 = r0.f617
            r8.mo152(r0, r9, r10)
            return
    }

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public final int m2387() {
            r0 = this;
            ᛱᛳᛶᛱ r0 = r0.f5691
            if (r0 == 0) goto L9
            ᛶᲈᲀᲇ r0 = r0.getAdapter()
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L11
            int r0 = r0.getItemCount()
            return r0
        L11:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public abstract int mo171(defpackage.C1000 r1);

    /* JADX INFO: renamed from: ᛶᛷᛸᲈ, reason: contains not printable characters */
    public final boolean m2388(defpackage.C0055 r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            r8 = this;
            int r0 = r8.m2380()
            int r1 = r8.m2402()
            int r2 = r8.f5690
            int r3 = r8.m2389()
            int r2 = r2 - r3
            int r3 = r8.f5683
            int r4 = r8.m2397()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            ᛱᛳᛶᛱ r3 = r8.f5691
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L5e
            if (r2 == 0) goto L59
            goto L66
        L59:
            int r2 = java.lang.Math.max(r6, r10)
            goto L66
        L5e:
            if (r6 == 0) goto L61
            goto L65
        L61:
            int r6 = java.lang.Math.min(r4, r2)
        L65:
            r2 = r6
        L66:
            if (r1 == 0) goto L69
            goto L6d
        L69:
            int r1 = java.lang.Math.min(r5, r11)
        L6d:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb0
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7e
            goto Lb5
        L7e:
            int r1 = r8.m2380()
            int r2 = r8.m2402()
            int r3 = r8.f5690
            int r4 = r8.m2389()
            int r3 = r3 - r4
            int r4 = r8.f5683
            int r5 = r8.m2397()
            int r4 = r4 - r5
            ᛱᛳᛶᛱ r8 = r8.f5691
            android.graphics.Rect r8 = r8.f617
            defpackage.C0055.m398(r8, r13)
            int r13 = r8.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb5
            int r13 = r8.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb5
            int r13 = r8.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb5
            int r8 = r8.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lb0
            goto Lb5
        Lb0:
            if (r11 != 0) goto Lb6
            if (r10 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r0
        Lb6:
            if (r12 == 0) goto Lbc
            r9.scrollBy(r11, r10)
            return r7
        Lbc:
            r9.m456(r11, r10, r0)
            return r7
    }

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public final int m2389() {
            r0 = this;
            ᛱᛳᛶᛱ r0 = r0.f5691
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingRight()
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛱᛳᛴ, reason: contains not printable characters */
    public final void m2390(defpackage.C0108 r5) {
            r4 = this;
            ᛱᛶᛲ r0 = r4.f5684
            if (r0 == 0) goto Ld
            if (r5 == r0) goto Ld
            boolean r1 = r0.f944
            if (r1 == 0) goto Ld
            r0.m598()
        Ld:
            r4.f5684 = r5
            ᛱᛳᛶᛱ r0 = r4.f5691
            ᛷᛴᛳ r1 = r0.f621
            ᛱᛳᛶᛱ r2 = r1.f5584
            r2.removeCallbacks(r1)
            android.widget.OverScroller r1 = r1.f5585
            r1.abortAnimation()
            boolean r1 = r5.f939
            if (r1 == 0) goto L4b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "An instance of "
            r1.<init>(r2)
            java.lang.Class<ᛱᛶᛲ> r2 = defpackage.C0108.class
            java.lang.String r3 = r2.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = " was started more than once. Each instance of"
            r1.append(r3)
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = " is intended to only be used once. You should create a new instance for each use."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.w(r2, r1)
        L4b:
            r5.f951 = r0
            r5.f947 = r4
            int r4 = r5.f948
            r1 = -1
            if (r4 == r1) goto L6f
            ᛵᲈᲁᲀ r1 = r0.f623
            r1.f4453 = r4
            r1 = 1
            r5.f944 = r1
            r5.f946 = r1
            ᛷᛵᛱᲀ r0 = r0.f682
            android.view.View r4 = r0.mo191(r4)
            r5.f952 = r4
            ᛱᛳᛶᛱ r4 = r5.f951
            ᛷᛴᛳ r4 = r4.f621
            r4.m2358()
            r5.f939 = r1
            return
        L6f:
            java.lang.String r4 = "Invalid target position"
            defpackage.C2264.m3684(r4)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᛶᲀ */
    public abstract void mo137(defpackage.C1633 r1, defpackage.C1000 r2);

    /* JADX INFO: renamed from: ᛷᛲᲁᛳ */
    public void mo212(int r4) {
            r3 = this;
            ᛱᛳᛶᛱ r3 = r3.f5691
            if (r3 == 0) goto L19
            ᲈᛷᲀᲀ r0 = r3.f611
            int r0 = r0.m3713()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L19
            ᲈᛷᲀᲀ r2 = r3.f611
            android.view.View r2 = r2.m3722(r1)
            r2.offsetLeftAndRight(r4)
            int r1 = r1 + 1
            goto Lb
        L19:
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public abstract boolean mo172();

    /* JADX INFO: renamed from: ᛷᛴᲈ */
    public abstract void mo173(defpackage.C0055 r1);

    /* JADX INFO: renamed from: ᛷᛵᛷᛷ, reason: contains not printable characters */
    public final void m2391(android.graphics.Rect r6, android.view.View r7) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            ᛵᛲᲁᛴ r0 = (defpackage.C0840) r0
            android.graphics.Rect r0 = r0.f3864
            int r1 = r0.left
            int r1 = -r1
            int r2 = r0.top
            int r2 = -r2
            int r3 = r7.getWidth()
            int r4 = r0.right
            int r3 = r3 + r4
            int r4 = r7.getHeight()
            int r0 = r0.bottom
            int r4 = r4 + r0
            r6.set(r1, r2, r3, r4)
            ᛱᛳᛶᛱ r0 = r5.f5691
            if (r0 == 0) goto L5c
            android.graphics.Matrix r0 = r7.getMatrix()
            if (r0 == 0) goto L5c
            boolean r1 = r0.isIdentity()
            if (r1 != 0) goto L5c
            ᛱᛳᛶᛱ r5 = r5.f5691
            android.graphics.RectF r5 = r5.f661
            r5.set(r6)
            r0.mapRect(r5)
            float r0 = r5.left
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            float r1 = r5.top
            double r1 = (double) r1
            double r1 = java.lang.Math.floor(r1)
            int r1 = (int) r1
            float r2 = r5.right
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            float r5 = r5.bottom
            double r3 = (double) r5
            double r3 = java.lang.Math.ceil(r3)
            int r5 = (int) r3
            r6.set(r0, r1, r2, r5)
        L5c:
            int r5 = r7.getLeft()
            int r7 = r7.getTop()
            r6.offset(r5, r7)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᛶ */
    public int mo138(defpackage.C1633 r1, defpackage.C1000 r2) {
            r0 = this;
            ᛱᛳᛶᛱ r1 = r0.f5691
            if (r1 == 0) goto L18
            ᛶᲈᲀᲇ r1 = r1.f633
            if (r1 != 0) goto L9
            goto L18
        L9:
            boolean r1 = r0.mo170()
            if (r1 == 0) goto L18
            ᛱᛳᛶᛱ r0 = r0.f5691
            ᛶᲈᲀᲇ r0 = r0.f633
            int r0 = r0.getItemCount()
            return r0
        L18:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛶᲁᲀ, reason: contains not printable characters */
    public final void m2392(defpackage.C1633 r7) {
            r6 = this;
            java.util.ArrayList r0 = r7.f7313
            int r0 = r0.size()
            int r1 = r0 + (-1)
        L8:
            java.util.ArrayList r2 = r7.f7313
            if (r1 < 0) goto L50
            java.lang.Object r2 = r2.get(r1)
            ᲈᛸᲈᛷ r2 = (defpackage.AbstractC2316) r2
            android.view.View r2 = r2.f9791
            ᲈᛸᲈᛷ r3 = defpackage.C0055.m405(r2)
            boolean r4 = r3.m3787()
            if (r4 == 0) goto L1f
            goto L4d
        L1f:
            r4 = 0
            r3.m3791(r4)
            boolean r5 = r3.m3777()
            if (r5 == 0) goto L2e
            ᛱᛳᛶᛱ r5 = r6.f5691
            r5.removeDetachedView(r2, r4)
        L2e:
            ᛱᛳᛶᛱ r5 = r6.f5691
            ᛱᛳᛸᛶ r5 = r5.f658
            if (r5 == 0) goto L37
            r5.mo472(r3)
        L37:
            r5 = 1
            r3.m3791(r5)
            ᲈᛸᲈᛷ r2 = defpackage.C0055.m405(r2)
            r3 = 0
            r2.f9793 = r3
            r2.f9785 = r4
            int r3 = r2.f9792
            r3 = r3 & (-33)
            r2.f9792 = r3
            r7.m3002(r2)
        L4d:
            int r1 = r1 + (-1)
            goto L8
        L50:
            r2.clear()
            java.util.ArrayList r7 = r7.f7314
            if (r7 == 0) goto L5a
            r7.clear()
        L5a:
            if (r0 <= 0) goto L61
            ᛱᛳᛶᛱ r6 = r6.f5691
            r6.invalidate()
        L61:
            return
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᲁ */
    public abstract android.os.Parcelable mo174();

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public final int m2393() {
            r0 = this;
            ᲈᛷᲀᲀ r0 = r0.f5688
            if (r0 == 0) goto L9
            int r0 = r0.m3713()
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public abstract void mo177(java.lang.String r1);

    /* JADX INFO: renamed from: ᛷᲇᛷᛶ */
    public abstract boolean mo179();

    /* JADX INFO: renamed from: ᛸᛲᲇᛲ, reason: contains not printable characters */
    public final boolean m2394(android.view.View r2, int r3, int r4, defpackage.C0840 r5) {
            r1 = this;
            boolean r0 = r2.isLayoutRequested()
            if (r0 != 0) goto L25
            boolean r1 = r1.f5679
            if (r1 == 0) goto L25
            int r1 = r2.getWidth()
            int r0 = r5.width
            boolean r1 = m2376(r1, r3, r0)
            if (r1 == 0) goto L25
            int r1 = r2.getHeight()
            int r2 = r5.height
            boolean r1 = m2376(r1, r4, r2)
            if (r1 != 0) goto L23
            goto L25
        L23:
            r1 = 0
            return r1
        L25:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public abstract int mo181(defpackage.C1000 r1);

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public abstract int mo143(defpackage.C1000 r1);

    /* JADX INFO: renamed from: ᲀᛴᲀ */
    public abstract int mo144(int r1, defpackage.C1633 r2, defpackage.C1000 r3);

    /* JADX INFO: renamed from: ᲀᛵᛳᛵ */
    public abstract boolean mo145();

    /* JADX INFO: renamed from: ᲀᛶᛳᛴ, reason: contains not printable characters */
    public final boolean m2395(android.view.View r2, int r3, int r4, defpackage.C0840 r5) {
            r1 = this;
            boolean r1 = r1.f5679
            if (r1 == 0) goto L1f
            int r1 = r2.getMeasuredWidth()
            int r0 = r5.width
            boolean r1 = m2376(r1, r3, r0)
            if (r1 == 0) goto L1f
            int r1 = r2.getMeasuredHeight()
            int r2 = r5.height
            boolean r1 = m2376(r1, r4, r2)
            if (r1 != 0) goto L1d
            goto L1f
        L1d:
            r1 = 0
            return r1
        L1f:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᲀᛷᛲᛴ */
    public void mo146(int r1, int r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᛲᛸ */
    public void mo185(android.view.accessibility.AccessibilityEvent r4) {
            r3 = this;
            ᛱᛳᛶᛱ r0 = r3.f5691
            ᲀᛲᲁᛳ r1 = r0.f637
            if (r4 != 0) goto L7
            goto L39
        L7:
            r1 = 1
            boolean r0 = r0.canScrollVertically(r1)
            if (r0 != 0) goto L29
            ᛱᛳᛶᛱ r0 = r3.f5691
            r2 = -1
            boolean r0 = r0.canScrollVertically(r2)
            if (r0 != 0) goto L29
            ᛱᛳᛶᛱ r0 = r3.f5691
            boolean r0 = r0.canScrollHorizontally(r2)
            if (r0 != 0) goto L29
            ᛱᛳᛶᛱ r0 = r3.f5691
            boolean r0 = r0.canScrollHorizontally(r1)
            if (r0 == 0) goto L28
            goto L29
        L28:
            r1 = 0
        L29:
            r4.setScrollable(r1)
            ᛱᛳᛶᛱ r3 = r3.f5691
            ᛶᲈᲀᲇ r3 = r3.f633
            if (r3 == 0) goto L39
            int r3 = r3.getItemCount()
            r4.setItemCount(r3)
        L39:
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᲇᛴ */
    public void mo147(int r1, int r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛲᲇ, reason: contains not printable characters */
    public final void m2396(android.view.View r6, defpackage.C1633 r7) {
            r5 = this;
            ᲈᛷᲀᲀ r5 = r5.f5688
            java.lang.Object r0 = r5.f9711
            ᲀᛴᛴᛸ r0 = (defpackage.C1662) r0
            int r1 = r5.f9712
            r2 = 1
            if (r1 == r2) goto L44
            r3 = 2
            if (r1 == r3) goto L3e
            r1 = 0
            r3 = 0
            r5.f9712 = r2     // Catch: java.lang.Throwable -> L2f
            r5.f9715 = r6     // Catch: java.lang.Throwable -> L2f
            ᛱᛳᛶᛱ r2 = r0.f7409     // Catch: java.lang.Throwable -> L2f
            int r2 = r2.indexOfChild(r6)     // Catch: java.lang.Throwable -> L2f
            if (r2 >= 0) goto L21
        L1c:
            r5.f9712 = r3
            r5.f9715 = r1
            goto L35
        L21:
            java.lang.Object r4 = r5.f9710     // Catch: java.lang.Throwable -> L2f
            ᛱᲀᛸᛴ r4 = (defpackage.C0167) r4     // Catch: java.lang.Throwable -> L2f
            boolean r4 = r4.m704(r2)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L31
            r5.m3724(r6)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r6 = move-exception
            goto L39
        L31:
            r0.m3055(r2)     // Catch: java.lang.Throwable -> L2f
            goto L1c
        L35:
            r7.m2999(r6)
            return
        L39:
            r5.f9712 = r3
            r5.f9715 = r1
            throw r6
        L3e:
            java.lang.String r5 = "Cannot call removeView(At) within removeViewIfHidden"
            defpackage.C2264.m3676(r5)
            return
        L44:
            java.lang.String r5 = "Cannot call removeView(At) within removeView(At)"
            defpackage.C2264.m3676(r5)
            return
    }

    /* JADX INFO: renamed from: ᲀᲈᛵᛳ */
    public abstract void mo148(defpackage.C1000 r1);

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public final int m2397() {
            r0 = this;
            ᛱᛳᛶᛱ r0 = r0.f5691
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingBottom()
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛲᲇᛲ */
    public boolean mo188() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ */
    public int mo149(defpackage.C1633 r1, defpackage.C1000 r2) {
            r0 = this;
            ᛱᛳᛶᛱ r1 = r0.f5691
            if (r1 == 0) goto L18
            ᛶᲈᲀᲇ r1 = r1.f633
            if (r1 != 0) goto L9
            goto L18
        L9:
            boolean r1 = r0.mo172()
            if (r1 == 0) goto L18
            ᛱᛳᛶᛱ r0 = r0.f5691
            ᛶᲈᲀᲇ r0 = r0.f633
            int r0 = r0.getItemCount()
            return r0
        L18:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛸᛴᛶ */
    public void mo150(int r1, int r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲁᲀᛴᛷ, reason: contains not printable characters */
    public final void m2398(defpackage.C1633 r3) {
            r2 = this;
            int r0 = r2.m2393()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L23
            android.view.View r1 = r2.m2382(r0)
            ᲈᛸᲈᛷ r1 = defpackage.C0055.m405(r1)
            boolean r1 = r1.m3787()
            if (r1 != 0) goto L20
            android.view.View r1 = r2.m2382(r0)
            r2.m2379(r0)
            r3.m2999(r1)
        L20:
            int r0 = r0 + (-1)
            goto L6
        L23:
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ */
    public android.view.View mo191(int r6) {
            r5 = this;
            int r0 = r5.m2393()
            r1 = 0
        L5:
            if (r1 >= r0) goto L30
            android.view.View r2 = r5.m2382(r1)
            ᲈᛸᲈᛷ r3 = defpackage.C0055.m405(r2)
            if (r3 != 0) goto L12
            goto L2d
        L12:
            int r4 = r3.m3782()
            if (r4 != r6) goto L2d
            boolean r4 = r3.m3787()
            if (r4 != 0) goto L2d
            ᛱᛳᛶᛱ r4 = r5.f5691
            ᛵᲈᲁᲀ r4 = r4.f623
            boolean r4 = r4.f4458
            if (r4 != 0) goto L2c
            boolean r3 = r3.m3785()
            if (r3 != 0) goto L2d
        L2c:
            return r2
        L2d:
            int r1 = r1 + 1
            goto L5
        L30:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ */
    public abstract defpackage.C0840 mo151();

    /* JADX INFO: renamed from: ᲇᛲᛷᛳ */
    public void mo152(android.graphics.Rect r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.width()
            int r1 = r3.m2380()
            int r1 = r1 + r0
            int r0 = r3.m2389()
            int r0 = r0 + r1
            int r4 = r4.height()
            int r1 = r3.m2402()
            int r1 = r1 + r4
            int r4 = r3.m2397()
            int r4 = r4 + r1
            ᛱᛳᛶᛱ r1 = r3.f5691
            java.util.WeakHashMap r2 = defpackage.AbstractC0858.f3911
            int r1 = r1.getMinimumWidth()
            int r5 = m2378(r5, r0, r1)
            ᛱᛳᛶᛱ r0 = r3.f5691
            int r0 = r0.getMinimumHeight()
            int r4 = m2378(r6, r4, r0)
            ᛱᛳᛶᛱ r3 = r3.f5691
            defpackage.C0055.m408(r3, r5, r4)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m2399(android.view.View r9, int r10, boolean r11) {
            r8 = this;
            ᲈᛸᲈᛷ r0 = defpackage.C0055.m405(r9)
            r1 = 1
            if (r11 != 0) goto L16
            boolean r11 = r0.m3785()
            if (r11 == 0) goto Le
            goto L16
        Le:
            ᛱᛳᛶᛱ r11 = r8.f5691
            ᲁᛷᛵ r11 = r11.f618
            r11.m3299(r0)
            goto L32
        L16:
            ᛱᛳᛶᛱ r11 = r8.f5691
            ᲁᛷᛵ r11 = r11.f618
            java.lang.Object r11 = r11.f8180
            ᛸᲇᛲᛶ r11 = (defpackage.C1580) r11
            java.lang.Object r2 = r11.get(r0)
            ᲈᲈᲁᲀ r2 = (defpackage.C2375) r2
            if (r2 != 0) goto L2d
            ᲈᲈᲁᲀ r2 = defpackage.C2375.m3893()
            r11.put(r0, r2)
        L2d:
            int r11 = r2.f10264
            r11 = r11 | r1
            r2.f10264 = r11
        L32:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            ᛵᛲᲁᛴ r11 = (defpackage.C0840) r11
            boolean r2 = r0.m3788()
            java.lang.String r3 = "RecyclerView"
            r4 = 0
            if (r2 != 0) goto L139
            boolean r2 = r0.m3776()
            if (r2 == 0) goto L49
            goto L139
        L49:
            android.view.ViewParent r2 = r9.getParent()
            ᛱᛳᛶᛱ r5 = r8.f5691
            ᲈᛷᲀᲀ r6 = r8.f5688
            r7 = -1
            if (r2 != r5) goto L10d
            java.lang.Object r2 = r6.f9710
            ᛱᲀᛸᛴ r2 = (defpackage.C0167) r2
            java.lang.Object r5 = r6.f9711
            ᲀᛴᛴᛸ r5 = (defpackage.C1662) r5
            ᛱᛳᛶᛱ r5 = r5.f7409
            int r5 = r5.indexOfChild(r9)
            if (r5 != r7) goto L65
            goto L6b
        L65:
            boolean r6 = r2.m699(r5)
            if (r6 == 0) goto L6d
        L6b:
            r5 = r7
            goto L72
        L6d:
            int r2 = r2.m702(r5)
            int r5 = r5 - r2
        L72:
            if (r10 != r7) goto L7a
            ᲈᛷᲀᲀ r10 = r8.f5688
            int r10 = r10.m3713()
        L7a:
            if (r5 == r7) goto Lea
            if (r5 == r10) goto L154
            ᛱᛳᛶᛱ r8 = r8.f5691
            ᛷᛵᛱᲀ r8 = r8.f682
            android.view.View r9 = r8.m2382(r5)
            if (r9 == 0) goto Lcd
            r8.m2382(r5)
            ᲈᛷᲀᲀ r2 = r8.f5688
            r2.m3720(r5)
            android.view.ViewGroup$LayoutParams r2 = r9.getLayoutParams()
            ᛵᛲᲁᛴ r2 = (defpackage.C0840) r2
            ᲈᛸᲈᛷ r5 = defpackage.C0055.m405(r9)
            boolean r6 = r5.m3785()
            ᛱᛳᛶᛱ r7 = r8.f5691
            if (r6 == 0) goto Lbd
            ᲁᛷᛵ r6 = r7.f618
            java.lang.Object r6 = r6.f8180
            ᛸᲇᛲᛶ r6 = (defpackage.C1580) r6
            java.lang.Object r7 = r6.get(r5)
            ᲈᲈᲁᲀ r7 = (defpackage.C2375) r7
            if (r7 != 0) goto Lb7
            ᲈᲈᲁᲀ r7 = defpackage.C2375.m3893()
            r6.put(r5, r7)
        Lb7:
            int r6 = r7.f10264
            r1 = r1 | r6
            r7.f10264 = r1
            goto Lc2
        Lbd:
            ᲁᛷᛵ r1 = r7.f618
            r1.m3299(r5)
        Lc2:
            ᲈᛷᲀᲀ r8 = r8.f5688
            boolean r1 = r5.m3785()
            r8.m3725(r9, r10, r2, r1)
            goto L154
        Lcd:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            ᛱᛳᛶᛱ r8 = r8.f5691
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Cannot move a child from non-existing index:"
            r10.<init>(r11)
            r10.append(r5)
            java.lang.String r8 = r8.toString()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        Lea:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            ᛱᛳᛶᛱ r11 = r8.f5691
            int r9 = r11.indexOfChild(r9)
            ᛱᛳᛶᛱ r8 = r8.f5691
            java.lang.String r8 = r8.m457()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
            r11.<init>(r0)
            r11.append(r9)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8)
            throw r10
        L10d:
            r6.m3721(r9, r10, r4)
            r11.f3862 = r1
            ᛱᛶᛲ r8 = r8.f5684
            if (r8 == 0) goto L154
            boolean r10 = r8.f944
            if (r10 == 0) goto L154
            ᛱᛳᛶᛱ r10 = r8.f951
            r10.getClass()
            ᲈᛸᲈᛷ r10 = defpackage.C0055.m405(r9)
            if (r10 == 0) goto L129
            int r7 = r10.m3782()
        L129:
            int r10 = r8.f948
            if (r7 != r10) goto L154
            r8.f952 = r9
            boolean r8 = defpackage.C0055.f605
            if (r8 == 0) goto L154
            java.lang.String r8 = "smooth scroll target view has been attached"
            android.util.Log.d(r3, r8)
            goto L154
        L139:
            boolean r1 = r0.m3776()
            if (r1 == 0) goto L145
            ᲀᛲᲁᛳ r1 = r0.f9793
            r1.m3001(r0)
            goto L14b
        L145:
            int r1 = r0.f9792
            r1 = r1 & (-33)
            r0.f9792 = r1
        L14b:
            ᲈᛷᲀᲀ r8 = r8.f5688
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            r8.m3725(r9, r10, r1, r4)
        L154:
            boolean r8 = r11.f3861
            if (r8 == 0) goto L176
            boolean r8 = defpackage.C0055.f605
            if (r8 == 0) goto L16f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "consuming pending invalidate on child "
            r8.<init>(r9)
            ᲈᛸᲈᛷ r9 = r11.f3863
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r3, r8)
        L16f:
            android.view.View r8 = r0.f9791
            r8.invalidate()
            r11.f3861 = r4
        L176:
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public boolean mo155(defpackage.C0840 r1) {
            r0 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final void m2400(defpackage.C1633 r5) {
            r4 = this;
            int r0 = r4.m2393()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L60
            android.view.View r1 = r4.m2382(r0)
            ᲈᛸᲈᛷ r2 = defpackage.C0055.m405(r1)
            boolean r3 = r2.m3787()
            if (r3 == 0) goto L2e
            boolean r1 = defpackage.C0055.f605
            if (r1 == 0) goto L5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "ignoring view "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.d(r2, r1)
            goto L5d
        L2e:
            boolean r3 = r2.m3775()
            if (r3 == 0) goto L4b
            boolean r3 = r2.m3785()
            if (r3 != 0) goto L4b
            ᛱᛳᛶᛱ r3 = r4.f5691
            ᛶᲈᲀᲇ r3 = r3.f633
            boolean r3 = r3.hasStableIds()
            if (r3 != 0) goto L4b
            r4.m2379(r0)
            r5.m3002(r2)
            goto L5d
        L4b:
            r4.m2382(r0)
            ᲈᛷᲀᲀ r3 = r4.f5688
            r3.m3720(r0)
            r5.m3008(r1)
            ᛱᛳᛶᛱ r1 = r4.f5691
            ᲁᛷᛵ r1 = r1.f618
            r1.m3299(r2)
        L5d:
            int r0 = r0 + (-1)
            goto L6
        L60:
            return
    }

    /* JADX INFO: renamed from: ᲇᲇᛴᲈ, reason: contains not printable characters */
    public final void m2401(int r2, int r3) {
            r1 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r2)
            r1.f5690 = r0
            int r2 = android.view.View.MeasureSpec.getMode(r2)
            r1.f5681 = r2
            r0 = 0
            if (r2 != 0) goto L15
            boolean r2 = defpackage.C0055.f610
            if (r2 != 0) goto L15
            r1.f5690 = r0
        L15:
            int r2 = android.view.View.MeasureSpec.getSize(r3)
            r1.f5683 = r2
            int r2 = android.view.View.MeasureSpec.getMode(r3)
            r1.f5685 = r2
            if (r2 != 0) goto L29
            boolean r2 = defpackage.C0055.f610
            if (r2 != 0) goto L29
            r1.f5683 = r0
        L29:
            return
    }

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public final int m2402() {
            r0 = this;
            ᛱᛳᛶᛱ r0 = r0.f5691
            if (r0 == 0) goto L9
            int r0 = r0.getPaddingTop()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
