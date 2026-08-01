package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* JADX INFO: renamed from: ᛷᛲᲁᛳ, reason: contains not printable characters */
    public static final java.util.Set f289 = null;

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public boolean f290;

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public final android.util.SparseIntArray f291;

    /* JADX INFO: renamed from: ᛳᛸᛱᲇ, reason: contains not printable characters */
    public int f292;

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public final int f293;

    /* JADX INFO: renamed from: ᛷᛵᛷᛷ, reason: contains not printable characters */
    public final defpackage.C0682 f294;

    /* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
    public final android.util.SparseIntArray f295;

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public android.view.View[] f296;

    /* JADX INFO: renamed from: ᛷᲇᛷᛶ, reason: contains not printable characters */
    public final android.graphics.Rect f297;

    /* JADX INFO: renamed from: ᛸᛱᲈᛳ, reason: contains not printable characters */
    public int f298;

    /* JADX INFO: renamed from: ᲇᛶᛱᛱ, reason: contains not printable characters */
    public int f299;

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public int[] f300;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 66
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 33
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 130(0x82, float:1.82E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer[] r1 = new java.lang.Integer[]{r1, r2, r3, r4}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            androidx.recyclerview.widget.GridLayoutManager.f289 = r0
            return
    }

    public GridLayoutManager(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>(r4, r5, r6, r7)
            r0 = 0
            r3.f290 = r0
            r0 = -1
            r3.f293 = r0
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r3.f291 = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r3.f295 = r1
            ᛴᛵᲇᲇ r1 = new ᛴᛵᲇᲇ
            r2 = 24
            r1.<init>(r2)
            r3.f294 = r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3.f297 = r2
            r3.f292 = r0
            r3.f299 = r0
            r3.f298 = r0
            ᲁᲀᛱᛸ r4 = defpackage.AbstractC1270.m2369(r4, r5, r6, r7)
            int r4 = r4.f8269
            int r5 = r3.f293
            if (r4 != r5) goto L38
            return
        L38:
            r5 = 1
            r3.f290 = r5
            if (r4 < r5) goto L46
            r3.f293 = r4
            r1.m1545()
            r3.m2383()
            return
        L46:
            java.lang.String r3 = "Span count should be at least 1. Provided "
            java.lang.String r3 = defpackage.AbstractC1124.m2145(r4, r3)
            defpackage.C2264.m3684(r3)
            r3 = 0
            throw r3
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛱᲀᛲᛱ, reason: contains not printable characters */
    public final void mo114(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L7
            r1 = 0
            super.mo114(r1)
            return
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "GridLayoutManager does not support stack from end. Consider using reverse layout"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final int mo115(defpackage.C1000 r1) {
            r0 = this;
            int r0 = r0.m189(r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final int mo116(defpackage.C1000 r1) {
            r0 = this;
            int r0 = r0.m187(r1)
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛲᛵᲁᛲ, reason: contains not printable characters */
    public final void mo117(defpackage.C1633 r10, defpackage.C1000 r11, android.view.View r12, defpackage.C2060 r13) {
            r9 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r13.f8857
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            boolean r2 = r1 instanceof defpackage.C2068
            if (r2 != 0) goto Le
            r9.m2381(r12, r13)
            return
        Le:
            ᲇᛶᛷᲀ r1 = (defpackage.C2068) r1
            ᲈᛸᲈᛷ r12 = r1.f3863
            int r12 = r12.m3782()
            int r2 = r9.m153(r12, r10, r11)
            int r9 = r9.f314
            int r4 = r1.f8883
            int r3 = r1.f8884
            if (r9 != 0) goto L30
            r6 = 0
            r7 = 0
            r5 = 1
            r8 = r4
            r4 = r2
            r2 = r8
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r9 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r2, r3, r4, r5, r6, r7)
            r0.setCollectionItemInfo(r9)
            return
        L30:
            r6 = 0
            r7 = 0
            r5 = r3
            r3 = 1
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r9 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r2, r3, r4, r5, r6, r7)
            r0.setCollectionItemInfo(r9)
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛲᲈᛶᲇ, reason: contains not printable characters */
    public final void mo118(int r1, int r2) {
            r0 = this;
            ᛴᛵᲇᲇ r0 = r0.f294
            r0.m1545()
            java.lang.Object r0 = r0.f3285
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            r0.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛳᛳᛵᛲ, reason: contains not printable characters */
    public final int mo119(int r1, defpackage.C1633 r2, defpackage.C1000 r3) {
            r0 = this;
            r0.m136()
            r0.m135()
            int r0 = super.mo119(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛳᛷᛳᲇ, reason: contains not printable characters */
    public final void m120(android.view.View r9, int r10, boolean r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            ᲇᛶᛷᲀ r0 = (defpackage.C2068) r0
            android.graphics.Rect r1 = r0.f3864
            int r2 = r1.top
            int r3 = r1.bottom
            int r2 = r2 + r3
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            int r3 = r1.left
            int r1 = r1.right
            int r3 = r3 + r1
            int r1 = r0.leftMargin
            int r3 = r3 + r1
            int r1 = r0.rightMargin
            int r3 = r3 + r1
            int r1 = r0.f8883
            int r4 = r0.f8884
            int r1 = r8.m133(r1, r4)
            int r4 = r8.f314
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L41
            int r4 = r0.width
            int r10 = defpackage.AbstractC1270.m2373(r5, r1, r10, r3, r4)
            ᲇᲁᛱᛱ r1 = r8.f312
            int r1 = r1.mo1939()
            int r3 = r8.f5685
            int r0 = r0.height
            int r0 = defpackage.AbstractC1270.m2373(r6, r1, r3, r2, r0)
            goto L58
        L41:
            int r4 = r0.height
            int r10 = defpackage.AbstractC1270.m2373(r5, r1, r10, r2, r4)
            ᲇᲁᛱᛱ r1 = r8.f312
            int r1 = r1.mo1939()
            int r2 = r8.f5681
            int r0 = r0.width
            int r0 = defpackage.AbstractC1270.m2373(r6, r1, r2, r3, r0)
            r7 = r0
            r0 = r10
            r10 = r7
        L58:
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            ᛵᛲᲁᛴ r1 = (defpackage.C0840) r1
            if (r11 == 0) goto L65
            boolean r8 = r8.m2395(r9, r10, r0, r1)
            goto L69
        L65:
            boolean r8 = r8.m2394(r9, r10, r0, r1)
        L69:
            if (r8 == 0) goto L6e
            r9.measure(r10, r0)
        L6e:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final defpackage.C0840 mo121(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            boolean r2 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            r0 = 0
            r1 = -1
            if (r2 == 0) goto L12
            ᲇᛶᛷᲀ r2 = new ᲇᛶᛷᲀ
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            r2.<init>(r3)
            r2.f8883 = r1
            r2.f8884 = r0
            return r2
        L12:
            ᲇᛶᛷᲀ r2 = new ᲇᛶᛷᲀ
            r2.<init>(r3)
            r2.f8883 = r1
            r2.f8884 = r0
            return r2
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᛴᲈᛵ, reason: contains not printable characters */
    public final void mo122() {
            r0 = this;
            ᛴᛵᲇᲇ r0 = r0.f294
            r0.m1545()
            java.lang.Object r0 = r0.f3285
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            r0.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᛶᛸᲈ, reason: contains not printable characters */
    public final void mo123(defpackage.C1633 r1, defpackage.C1000 r2, defpackage.C2060 r3) {
            r0 = this;
            super.mo123(r1, r2, r3)
            java.lang.String r1 = "android.widget.GridView"
            android.view.accessibility.AccessibilityNodeInfo r2 = r3.f8857
            r2.setClassName(r1)
            ᛱᛳᛶᛱ r0 = r0.f5691
            ᛶᲈᲀᲇ r0 = r0.f633
            if (r0 == 0) goto L1c
            int r0 = r0.getItemCount()
            r1 = 1
            if (r0 <= r1) goto L1c
            ᛳᛳᛳᲈ r0 = defpackage.C0436.f2137
            r3.m3460(r0)
        L1c:
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final int mo124(defpackage.C1000 r1) {
            r0 = this;
            int r0 = r0.m187(r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛴᛸᲈᛷ, reason: contains not printable characters */
    public final void mo125(defpackage.C1633 r5, defpackage.C1000 r6, defpackage.C0137 r7, int r8) {
            r4 = this;
            r4.m136()
            int r0 = r6.m1957()
            if (r0 <= 0) goto L40
            boolean r0 = r6.f4458
            if (r0 != 0) goto L40
            r0 = 1
            if (r8 != r0) goto L12
            r8 = r0
            goto L13
        L12:
            r8 = 0
        L13:
            int r1 = r7.f1084
            int r1 = r4.m132(r1, r5, r6)
            if (r8 == 0) goto L2a
        L1b:
            if (r1 <= 0) goto L40
            int r8 = r7.f1084
            if (r8 <= 0) goto L40
            int r8 = r8 + (-1)
            r7.f1084 = r8
            int r1 = r4.m132(r8, r5, r6)
            goto L1b
        L2a:
            int r8 = r6.m1957()
            int r8 = r8 - r0
            int r0 = r7.f1084
        L31:
            if (r0 >= r8) goto L3e
            int r2 = r0 + 1
            int r3 = r4.m132(r2, r5, r6)
            if (r3 <= r1) goto L3e
            r0 = r2
            r1 = r3
            goto L31
        L3e:
            r7.f1084 = r0
        L40:
            r4.m135()
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final defpackage.C0840 mo126(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            ᲇᛶᛷᲀ r0 = new ᲇᛶᛷᲀ
            r0.<init>(r1, r2)
            r1 = -1
            r0.f8883 = r1
            r1 = 0
            r0.f8884 = r1
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛲᛷᛶ, reason: contains not printable characters */
    public final java.util.HashSet m127(int r4, int r5) {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            ᛱᛳᛶᛱ r1 = r3.f5691
            ᲀᛲᲁᛳ r2 = r1.f637
            ᛵᲈᲁᲀ r1 = r1.f623
            int r3 = r3.m141(r5, r2, r1)
            r5 = r4
        L10:
            int r1 = r4 + r3
            if (r5 >= r1) goto L1e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.add(r1)
            int r5 = r5 + 1
            goto L10
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛲᲁᲇ, reason: contains not printable characters */
    public final void m128(int r8) {
            r7 = this;
            int[] r0 = r7.f300
            int r1 = r7.f293
            r2 = 1
            if (r0 == 0) goto L12
            int r3 = r0.length
            int r4 = r1 + 1
            if (r3 != r4) goto L12
            int r3 = r0.length
            int r3 = r3 - r2
            r3 = r0[r3]
            if (r3 == r8) goto L16
        L12:
            int r0 = r1 + 1
            int[] r0 = new int[r0]
        L16:
            r3 = 0
            r0[r3] = r3
            int r4 = r8 / r1
            int r8 = r8 % r1
            r5 = r3
        L1d:
            if (r2 > r1) goto L31
            int r3 = r3 + r8
            if (r3 <= 0) goto L2a
            int r6 = r1 - r3
            if (r6 >= r8) goto L2a
            int r6 = r4 + 1
            int r3 = r3 - r1
            goto L2b
        L2a:
            r6 = r4
        L2b:
            int r5 = r5 + r6
            r0[r2] = r5
            int r2 = r2 + 1
            goto L1d
        L31:
            r7.f300 = r0
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᛵᛴᛴᛳ, reason: contains not printable characters */
    public final void mo129(defpackage.C1000 r7, defpackage.C0361 r8, defpackage.C0128 r9) {
            r6 = this;
            int r0 = r6.f293
            r1 = 0
            r3 = r0
            r2 = r1
        L5:
            if (r2 >= r0) goto L2f
            int r4 = r8.f1860
            if (r4 < 0) goto L2f
            int r5 = r7.m1957()
            if (r4 >= r5) goto L2f
            if (r3 <= 0) goto L2f
            int r4 = r8.f1860
            int r5 = r8.f1866
            int r5 = java.lang.Math.max(r1, r5)
            r9.m642(r4, r5)
            ᛴᛵᲇᲇ r4 = r6.f294
            r4.getClass()
            int r3 = r3 + (-1)
            int r4 = r8.f1860
            int r5 = r8.f1859
            int r4 = r4 + r5
            r8.f1860 = r4
            int r2 = r2 + 1
            goto L5
        L2f:
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛵᛵᲀᛲ, reason: contains not printable characters */
    public final android.view.View mo130(android.view.View r23, int r24, defpackage.C1633 r25, defpackage.C1000 r26) {
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            ᛱᛳᛶᛱ r3 = r0.f5691
            r4 = 0
            if (r3 != 0) goto Le
            r5 = r23
            goto L23
        Le:
            r5 = r23
            android.view.View r3 = r3.m434(r5)
            if (r3 != 0) goto L17
            goto L23
        L17:
            ᲈᛷᲀᲀ r6 = r0.f5688
            java.lang.Object r6 = r6.f9714
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L24
        L23:
            r3 = r4
        L24:
            if (r3 != 0) goto L27
            goto L38
        L27:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            ᲇᛶᛷᲀ r6 = (defpackage.C2068) r6
            int r7 = r6.f8883
            int r6 = r6.f8884
            int r6 = r6 + r7
            android.view.View r5 = super.mo130(r23, r24, r25, r26)
            if (r5 != 0) goto L39
        L38:
            return r4
        L39:
            r5 = r24
            int r5 = r0.m195(r5)
            r9 = 1
            if (r5 != r9) goto L44
            r5 = r9
            goto L45
        L44:
            r5 = 0
        L45:
            boolean r10 = r0.f301
            r11 = -1
            if (r5 == r10) goto L52
            int r5 = r0.m2393()
            int r5 = r5 - r9
            r10 = r11
            r12 = r10
            goto L59
        L52:
            int r5 = r0.m2393()
            r10 = r5
            r12 = r9
            r5 = 0
        L59:
            int r13 = r0.f314
            if (r13 != r9) goto L65
            boolean r13 = r0.m169()
            if (r13 == 0) goto L65
            r13 = r9
            goto L66
        L65:
            r13 = 0
        L66:
            int r14 = r0.m153(r5, r1, r2)
            r16 = r4
            r8 = r11
            r15 = r8
            r9 = 0
            r11 = r5
            r4 = 0
            r5 = r16
        L73:
            r17 = r5
            if (r11 == r10) goto L13f
            int r5 = r0.m153(r11, r1, r2)
            android.view.View r1 = r0.m2382(r11)
            if (r1 != r3) goto L83
            goto L13f
        L83:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L97
            if (r5 == r14) goto L97
            if (r16 == 0) goto L8f
            goto L13f
        L8f:
            r18 = r3
            r19 = r9
            r21 = r10
            goto L130
        L97:
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            ᲇᛶᛷᲀ r5 = (defpackage.C2068) r5
            int r2 = r5.f8883
            r18 = r3
            int r3 = r5.f8884
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Laf
            if (r2 != r7) goto Laf
            if (r3 != r6) goto Laf
            return r1
        Laf:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Lb7
            if (r16 == 0) goto Lbf
        Lb7:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto Lc4
            if (r17 != 0) goto Lc4
        Lbf:
            r19 = r9
            r21 = r10
            goto L109
        Lc4:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r10
            int r10 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Le8
            if (r10 <= r9) goto Ldb
        Ld8:
            r19 = r9
            goto L109
        Ldb:
            if (r10 != r9) goto Le5
            if (r2 <= r15) goto Le1
            r10 = 1
            goto Le2
        Le1:
            r10 = 0
        Le2:
            if (r13 != r10) goto Le5
            goto Ld8
        Le5:
            r19 = r9
            goto L130
        Le8:
            if (r16 != 0) goto Le5
            r19 = r9
            ᲁᛷᛵ r9 = r0.f5687
            boolean r9 = r9.m3308(r1)
            if (r9 == 0) goto Lfd
            ᲁᛷᛵ r9 = r0.f5686
            boolean r9 = r9.m3308(r1)
            if (r9 == 0) goto Lfd
            goto L130
        Lfd:
            if (r10 <= r4) goto L100
            goto L109
        L100:
            if (r10 != r4) goto L130
            if (r2 <= r8) goto L106
            r9 = 1
            goto L107
        L106:
            r9 = 0
        L107:
            if (r13 != r9) goto L130
        L109:
            boolean r9 = r1.hasFocusable()
            int r5 = r5.f8883
            if (r9 == 0) goto L121
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r9 = r3 - r2
            r16 = r1
            r15 = r5
            r5 = r17
            goto L134
        L121:
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r4 = r3 - r2
            r8 = r5
            r9 = r19
            r5 = r1
            goto L134
        L130:
            r5 = r17
            r9 = r19
        L134:
            int r11 = r11 + r12
            r1 = r25
            r2 = r26
            r3 = r18
            r10 = r21
            goto L73
        L13f:
            if (r16 == 0) goto L142
            return r16
        L142:
            return r17
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛵᲀᛸᲈ, reason: contains not printable characters */
    public final boolean mo131(int r12, android.os.Bundle r13) {
            r11 = this;
            ᛳᛳᛳᲈ r0 = defpackage.C0436.f2137
            java.lang.Object r0 = r0.f2143
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
            int r0 = r0.getId()
            r1 = 1
            r2 = 0
            r3 = -1
            if (r12 != r0) goto L285
            if (r12 == r3) goto L285
            r12 = r2
        L12:
            int r0 = r11.m2393()
            if (r12 >= r0) goto L2a
            android.view.View r0 = r11.m2382(r12)
            boolean r0 = r0.isAccessibilityFocused()
            if (r0 == 0) goto L27
            android.view.View r12 = r11.m2382(r12)
            goto L2b
        L27:
            int r12 = r12 + 1
            goto L12
        L2a:
            r12 = 0
        L2b:
            if (r12 != 0) goto L2f
            goto L2d4
        L2f:
            if (r13 != 0) goto L33
            goto L2d4
        L33:
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_DIRECTION_INT"
            int r13 = r13.getInt(r0, r3)
            java.util.Set r0 = androidx.recyclerview.widget.GridLayoutManager.f289
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L47
            goto L2d4
        L47:
            ᛱᛳᛶᛱ r0 = r11.f5691
            ᲈᛸᲈᛷ r12 = r0.m439(r12)
            if (r12 != 0) goto L51
            goto L2d4
        L51:
            int r12 = r12.m3789()
            int r0 = r11.m140(r12)
            int r4 = r11.m139(r12)
            if (r0 < 0) goto L2d4
            if (r4 >= 0) goto L63
            goto L2d4
        L63:
            java.util.HashSet r5 = r11.m134(r12)
            int r6 = r11.f299
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L87
            int r5 = r11.m139(r12)
            java.util.HashSet r5 = r11.m127(r5, r12)
            int r6 = r11.f298
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L8b
        L87:
            r11.f299 = r0
            r11.f298 = r4
        L8b:
            int r5 = r11.f299
            if (r5 != r3) goto L90
            r5 = r0
        L90:
            int r6 = r11.f298
            if (r6 != r3) goto L95
            goto L96
        L95:
            r4 = r6
        L96:
            r6 = 66
            r7 = 17
            if (r13 == r7) goto L16a
            r8 = 33
            if (r13 == r8) goto L127
            if (r13 == r6) goto Lec
            r8 = 130(0x82, float:1.82E-43)
            if (r13 == r8) goto La8
            goto L2d4
        La8:
            int r12 = r12 + r1
        La9:
            int r8 = r11.m2387()
            if (r12 >= r8) goto Le9
            int r8 = r11.m140(r12)
            int r9 = r11.m139(r12)
            if (r8 < 0) goto Le9
            if (r9 >= 0) goto Lbc
            goto Le9
        Lbc:
            int r10 = r11.f314
            if (r10 != r1) goto Lda
            if (r8 <= r5) goto Le6
            if (r9 == r4) goto Ld6
            int r9 = r11.m139(r12)
            java.util.HashSet r9 = r11.m127(r9, r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto Le6
        Ld6:
            r11.f299 = r8
            goto L1a0
        Lda:
            if (r8 <= r5) goto Le6
            if (r9 != r4) goto Le6
            int r4 = r11.m140(r12)
            r11.f299 = r4
            goto L1a0
        Le6:
            int r12 = r12 + 1
            goto La9
        Le9:
            r12 = r3
            goto L1a0
        Lec:
            int r12 = r12 + r1
        Led:
            int r8 = r11.m2387()
            if (r12 >= r8) goto Le9
            int r8 = r11.m140(r12)
            int r9 = r11.m139(r12)
            if (r8 < 0) goto Le9
            if (r9 >= 0) goto L100
            goto Le9
        L100:
            int r10 = r11.f314
            if (r10 != r1) goto L110
            if (r8 != r5) goto L108
            if (r9 > r4) goto L10a
        L108:
            if (r8 <= r5) goto L124
        L10a:
            r11.f299 = r8
            r11.f298 = r9
            goto L1a0
        L110:
            if (r9 <= r4) goto L124
            java.util.HashSet r8 = r11.m134(r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r8 = r8.contains(r10)
            if (r8 == 0) goto L124
            r11.f298 = r9
            goto L1a0
        L124:
            int r12 = r12 + 1
            goto Led
        L127:
            int r12 = r12 - r1
        L128:
            if (r12 < 0) goto Le9
            int r8 = r11.m140(r12)
            int r9 = r11.m139(r12)
            if (r8 < 0) goto Le9
            if (r9 >= 0) goto L137
            goto Le9
        L137:
            int r10 = r11.f314
            if (r10 != r1) goto L152
            if (r8 >= r5) goto L167
            int r9 = r11.m139(r12)
            java.util.HashSet r9 = r11.m127(r9, r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L167
            r11.f299 = r8
            goto L1a0
        L152:
            if (r8 >= r5) goto L167
            if (r9 != r4) goto L167
            java.util.HashSet r4 = r11.m134(r12)
            java.lang.Object r4 = java.util.Collections.max(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r11.f299 = r4
            goto L1a0
        L167:
            int r12 = r12 + (-1)
            goto L128
        L16a:
            int r12 = r12 - r1
        L16b:
            if (r12 < 0) goto Le9
            int r8 = r11.m140(r12)
            int r9 = r11.m139(r12)
            if (r8 < 0) goto Le9
            if (r9 >= 0) goto L17b
            goto Le9
        L17b:
            int r10 = r11.f314
            if (r10 != r1) goto L18a
            if (r8 != r5) goto L183
            if (r9 < r4) goto L185
        L183:
            if (r8 >= r5) goto L19d
        L185:
            r11.f299 = r8
            r11.f298 = r9
            goto L1a0
        L18a:
            java.util.HashSet r8 = r11.m134(r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r8 = r8.contains(r10)
            if (r8 == 0) goto L19d
            if (r9 >= r4) goto L19d
            r11.f298 = r9
            goto L1a0
        L19d:
            int r12 = r12 + (-1)
            goto L16b
        L1a0:
            if (r12 != r3) goto L27d
            int r4 = r11.f314
            if (r4 != 0) goto L27d
            if (r13 != r7) goto L214
            if (r0 >= 0) goto L1ad
        L1aa:
            r12 = r3
            goto L27d
        L1ad:
            if (r4 != r1) goto L1b0
            goto L1aa
        L1b0:
            java.util.TreeMap r12 = new java.util.TreeMap
            java.util.Comparator r13 = java.util.Collections.reverseOrder()
            r12.<init>(r13)
            r13 = r2
        L1ba:
            int r4 = r11.m2387()
            if (r13 >= r4) goto L1e6
            java.util.HashSet r4 = r11.m134(r13)
            java.util.Iterator r4 = r4.iterator()
        L1c8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1e3
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            if (r6 >= 0) goto L1db
            goto L1aa
        L1db:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r12.put(r5, r6)
            goto L1c8
        L1e3:
            int r13 = r13 + 1
            goto L1ba
        L1e6:
            java.util.Set r13 = r12.keySet()
            java.util.Iterator r13 = r13.iterator()
        L1ee:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L1aa
            java.lang.Object r4 = r13.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            if (r5 >= r0) goto L1ee
            java.lang.Object r12 = r12.get(r4)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.f299 = r5
            int r13 = r11.m139(r12)
            r11.f298 = r13
            goto L27d
        L214:
            if (r13 != r6) goto L27d
            if (r0 >= 0) goto L219
            goto L1aa
        L219:
            if (r4 != r1) goto L21c
            goto L1aa
        L21c:
            java.util.TreeMap r12 = new java.util.TreeMap
            r12.<init>()
            r13 = r2
        L222:
            int r4 = r11.m2387()
            if (r13 >= r4) goto L255
            java.util.HashSet r4 = r11.m134(r13)
            java.util.Iterator r4 = r4.iterator()
        L230:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L252
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            if (r6 >= 0) goto L244
            goto L1aa
        L244:
            boolean r6 = r12.containsKey(r5)
            if (r6 != 0) goto L230
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r12.put(r5, r6)
            goto L230
        L252:
            int r13 = r13 + 1
            goto L222
        L255:
            java.util.Set r13 = r12.keySet()
            java.util.Iterator r13 = r13.iterator()
        L25d:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L1aa
            java.lang.Object r4 = r13.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            if (r5 <= r0) goto L25d
            java.lang.Object r12 = r12.get(r4)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.f299 = r5
            r11.f298 = r2
        L27d:
            if (r12 == r3) goto L2d4
            r11.mo168(r12)
            r11.f292 = r12
            return r1
        L285:
            r0 = 16908343(0x1020037, float:2.3877383E-38)
            if (r12 != r0) goto L2d5
            if (r13 == 0) goto L2d5
            java.lang.String r12 = "android.view.accessibility.action.ARGUMENT_ROW_INT"
            int r12 = r13.getInt(r12, r3)
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT"
            int r13 = r13.getInt(r0, r3)
            if (r12 == r3) goto L2d4
            if (r13 != r3) goto L29d
            goto L2d4
        L29d:
            ᛱᛳᛶᛱ r0 = r11.f5691
            ᛶᲈᲀᲇ r0 = r0.f633
            int r0 = r0.getItemCount()
            r4 = r2
        L2a6:
            if (r4 >= r0) goto L2cd
            ᛱᛳᛶᛱ r5 = r11.f5691
            ᲀᛲᲁᛳ r6 = r5.f637
            ᛵᲈᲁᲀ r5 = r5.f623
            int r5 = r11.m132(r4, r6, r5)
            ᛱᛳᛶᛱ r6 = r11.f5691
            ᲀᛲᲁᛳ r7 = r6.f637
            ᛵᲈᲁᲀ r6 = r6.f623
            int r6 = r11.m153(r4, r7, r6)
            int r7 = r11.f314
            if (r7 != r1) goto L2c5
            if (r5 != r13) goto L2ca
            if (r6 != r12) goto L2ca
            goto L2ce
        L2c5:
            if (r5 != r12) goto L2ca
            if (r6 != r13) goto L2ca
            goto L2ce
        L2ca:
            int r4 = r4 + 1
            goto L2a6
        L2cd:
            r4 = r3
        L2ce:
            if (r4 <= r3) goto L2d4
            r11.m190(r4, r2)
            return r1
        L2d4:
            return r2
        L2d5:
            boolean r11 = super.mo131(r12, r13)
            return r11
    }

    /* JADX INFO: renamed from: ᛶᛲᛱᛸ, reason: contains not printable characters */
    public final int m132(int r3, defpackage.C1633 r4, defpackage.C1000 r5) {
            r2 = this;
            boolean r5 = r5.f4458
            int r0 = r2.f293
            ᛴᛵᲇᲇ r1 = r2.f294
            if (r5 != 0) goto Ld
            r1.getClass()
            int r3 = r3 % r0
            return r3
        Ld:
            android.util.SparseIntArray r2 = r2.f295
            r5 = -1
            int r2 = r2.get(r3, r5)
            if (r2 == r5) goto L17
            return r2
        L17:
            int r2 = r4.m3009(r3)
            if (r2 != r5) goto L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            r2 = 0
            return r2
        L32:
            r1.getClass()
            int r2 = r2 % r0
            return r2
    }

    /* JADX INFO: renamed from: ᛶᛵᲇᛸ, reason: contains not printable characters */
    public final int m133(int r3, int r4) {
            r2 = this;
            int r0 = r2.f314
            r1 = 1
            if (r0 != r1) goto L19
            boolean r0 = r2.m169()
            if (r0 == 0) goto L19
            int[] r0 = r2.f300
            int r2 = r2.f293
            int r1 = r2 - r3
            r1 = r0[r1]
            int r2 = r2 - r3
            int r2 = r2 - r4
            r2 = r0[r2]
            int r1 = r1 - r2
            return r1
        L19:
            int[] r2 = r2.f300
            int r4 = r4 + r3
            r4 = r2[r4]
            r2 = r2[r3]
            int r4 = r4 - r2
            return r4
    }

    /* JADX INFO: renamed from: ᛶᛶᛴ, reason: contains not printable characters */
    public final java.util.HashSet m134(int r2) {
            r1 = this;
            int r0 = r1.m140(r2)
            java.util.HashSet r1 = r1.m127(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ᛶᲁᲁ, reason: contains not printable characters */
    public final void m135() {
            r2 = this;
            android.view.View[] r0 = r2.f296
            if (r0 == 0) goto Lb
            int r0 = r0.length
            int r1 = r2.f293
            if (r0 == r1) goto La
            goto Lb
        La:
            return
        Lb:
            int r0 = r2.f293
            android.view.View[] r0 = new android.view.View[r0]
            r2.f296 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛱᛵᛶ, reason: contains not printable characters */
    public final void m136() {
            r2 = this;
            int r0 = r2.f314
            r1 = 1
            if (r0 != r1) goto L12
            int r0 = r2.f5690
            int r1 = r2.m2389()
            int r0 = r0 - r1
            int r1 = r2.m2380()
        L10:
            int r0 = r0 - r1
            goto L1e
        L12:
            int r0 = r2.f5683
            int r1 = r2.m2397()
            int r0 = r0 - r1
            int r1 = r2.m2402()
            goto L10
        L1e:
            r2.m128(r0)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛲᛶᲀ, reason: contains not printable characters */
    public final void mo137(defpackage.C1633 r8, defpackage.C1000 r9) {
            r7 = this;
            boolean r0 = r9.f4458
            android.util.SparseIntArray r1 = r7.f295
            android.util.SparseIntArray r2 = r7.f291
            if (r0 == 0) goto L2c
            int r0 = r7.m2393()
            r3 = 0
        Ld:
            if (r3 >= r0) goto L2c
            android.view.View r4 = r7.m2382(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            ᲇᛶᛷᲀ r4 = (defpackage.C2068) r4
            ᲈᛸᲈᛷ r5 = r4.f3863
            int r5 = r5.m3782()
            int r6 = r4.f8884
            r2.put(r5, r6)
            int r4 = r4.f8883
            r1.put(r5, r4)
            int r3 = r3 + 1
            goto Ld
        L2c:
            super.mo137(r8, r9)
            r2.clear()
            r1.clear()
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
    public final int mo138(defpackage.C1633 r3, defpackage.C1000 r4) {
            r2 = this;
            int r0 = r2.f314
            if (r0 != 0) goto Lf
            int r3 = r2.f293
            int r2 = r2.m2387()
            int r2 = java.lang.Math.min(r3, r2)
            return r2
        Lf:
            int r0 = r4.m1957()
            r1 = 1
            if (r0 >= r1) goto L18
            r2 = 0
            return r2
        L18:
            int r0 = r4.m1957()
            int r0 = r0 - r1
            int r2 = r2.m153(r0, r3, r4)
            int r2 = r2 + r1
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛶᛸᛳ, reason: contains not printable characters */
    public final int m139(int r3) {
            r2 = this;
            int r0 = r2.f314
            ᛱᛳᛶᛱ r1 = r2.f5691
            if (r0 != 0) goto Lf
            ᲀᛲᲁᛳ r0 = r1.f637
            ᛵᲈᲁᲀ r1 = r1.f623
            int r2 = r2.m153(r3, r0, r1)
            return r2
        Lf:
            ᲀᛲᲁᛳ r0 = r1.f637
            ᛵᲈᲁᲀ r1 = r1.f623
            int r2 = r2.m132(r3, r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛶᲇᲈ, reason: contains not printable characters */
    public final int m140(int r4) {
            r3 = this;
            int r0 = r3.f314
            ᛱᛳᛶᛱ r1 = r3.f5691
            r2 = 1
            if (r0 != r2) goto L10
            ᲀᛲᲁᛳ r0 = r1.f637
            ᛵᲈᲁᲀ r1 = r1.f623
            int r3 = r3.m153(r4, r0, r1)
            return r3
        L10:
            ᲀᛲᲁᛳ r0 = r1.f637
            ᛵᲈᲁᲀ r1 = r1.f623
            int r3 = r3.m132(r4, r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ᲀᛱᛵᛵ, reason: contains not printable characters */
    public final int m141(int r3, defpackage.C1633 r4, defpackage.C1000 r5) {
            r2 = this;
            boolean r5 = r5.f4458
            ᛴᛵᲇᲇ r0 = r2.f294
            r1 = 1
            if (r5 != 0) goto Lb
            r0.getClass()
            return r1
        Lb:
            android.util.SparseIntArray r2 = r2.f291
            r5 = -1
            int r2 = r2.get(r3, r5)
            if (r2 == r5) goto L15
            return r2
        L15:
            int r2 = r4.m3009(r3)
            if (r2 != r5) goto L2f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            return r1
        L2f:
            r0.getClass()
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᲀᛲᲈᛵ, reason: contains not printable characters */
    public final android.view.View mo142(defpackage.C1633 r10, defpackage.C1000 r11, boolean r12, boolean r13) {
            r9 = this;
            int r12 = r9.m2393()
            r0 = 1
            if (r13 == 0) goto Lf
            int r12 = r9.m2393()
            int r12 = r12 - r0
            r13 = -1
            r0 = r13
            goto L13
        Lf:
            r13 = 0
            r8 = r13
            r13 = r12
            r12 = r8
        L13:
            int r1 = r11.m1957()
            r9.m166()
            ᲇᲁᛱᛱ r2 = r9.f312
            int r2 = r2.mo1936()
            ᲇᲁᛱᛱ r3 = r9.f312
            int r3 = r3.mo1933()
            r4 = 0
            r5 = r4
        L28:
            if (r12 == r13) goto L66
            android.view.View r6 = r9.m2382(r12)
            int r7 = defpackage.AbstractC1270.m2371(r6)
            if (r7 < 0) goto L64
            if (r7 >= r1) goto L64
            int r7 = r9.m132(r7, r10, r11)
            if (r7 == 0) goto L3d
            goto L64
        L3d:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            ᛵᛲᲁᛴ r7 = (defpackage.C0840) r7
            ᲈᛸᲈᛷ r7 = r7.f3863
            boolean r7 = r7.m3785()
            if (r7 == 0) goto L4f
            if (r5 != 0) goto L64
            r5 = r6
            goto L64
        L4f:
            ᲇᲁᛱᛱ r7 = r9.f312
            int r7 = r7.mo1943(r6)
            if (r7 >= r3) goto L61
            ᲇᲁᛱᛱ r7 = r9.f312
            int r7 = r7.mo1937(r6)
            if (r7 >= r2) goto L60
            goto L61
        L60:
            return r6
        L61:
            if (r4 != 0) goto L64
            r4 = r6
        L64:
            int r12 = r12 + r0
            goto L28
        L66:
            if (r4 == 0) goto L69
            return r4
        L69:
            return r5
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final int mo143(defpackage.C1000 r1) {
            r0 = this;
            int r0 = r0.m189(r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᛴᲀ, reason: contains not printable characters */
    public final int mo144(int r1, defpackage.C1633 r2, defpackage.C1000 r3) {
            r0 = this;
            r0.m136()
            r0.m135()
            int r0 = super.mo144(r1, r2, r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᛵᛳᛵ, reason: contains not printable characters */
    public final boolean mo145() {
            r1 = this;
            ᛸᲈᛵᛶ r0 = r1.f313
            if (r0 != 0) goto La
            boolean r1 = r1.f290
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᛷᛲᛴ, reason: contains not printable characters */
    public final void mo146(int r1, int r2) {
            r0 = this;
            ᛴᛵᲇᲇ r0 = r0.f294
            r0.m1545()
            java.lang.Object r0 = r0.f3285
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            r0.clear()
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᲀᲇᛴ, reason: contains not printable characters */
    public final void mo147(int r1, int r2) {
            r0 = this;
            ᛴᛵᲇᲇ r0 = r0.f294
            r0.m1545()
            java.lang.Object r0 = r0.f3285
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            r0.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᲈᛵᛳ, reason: contains not printable characters */
    public final void mo148(defpackage.C1000 r3) {
            r2 = this;
            super.mo148(r3)
            r3 = 0
            r2.f290 = r3
            int r3 = r2.f292
            r0 = -1
            if (r3 == r0) goto L18
            android.view.View r3 = r2.mo191(r3)
            if (r3 == 0) goto L18
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r3.sendAccessibilityEvent(r1)
            r2.f292 = r0
        L18:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public final int mo149(defpackage.C1633 r3, defpackage.C1000 r4) {
            r2 = this;
            int r0 = r2.f314
            r1 = 1
            if (r0 != r1) goto L10
            int r3 = r2.f293
            int r2 = r2.m2387()
            int r2 = java.lang.Math.min(r3, r2)
            return r2
        L10:
            int r0 = r4.m1957()
            if (r0 >= r1) goto L18
            r2 = 0
            return r2
        L18:
            int r0 = r4.m1957()
            int r0 = r0 - r1
            int r2 = r2.m153(r0, r3, r4)
            int r2 = r2 + r1
            return r2
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲁᛸᛴᛶ, reason: contains not printable characters */
    public final void mo150(int r1, int r2) {
            r0 = this;
            ᛴᛵᲇᲇ r0 = r0.f294
            r0.m1545()
            java.lang.Object r0 = r0.f3285
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            r0.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final defpackage.C0840 mo151() {
            r2 = this;
            int r2 = r2.f314
            r0 = -1
            r1 = -2
            if (r2 != 0) goto Lc
            ᲇᛶᛷᲀ r2 = new ᲇᛶᛷᲀ
            r2.<init>(r1, r0)
            return r2
        Lc:
            ᲇᛶᛷᲀ r2 = new ᲇᛶᛷᲀ
            r2.<init>(r0, r1)
            return r2
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲇᛲᛷᛳ, reason: contains not printable characters */
    public final void mo152(android.graphics.Rect r5, int r6, int r7) {
            r4 = this;
            int[] r0 = r4.f300
            if (r0 != 0) goto L7
            super.mo152(r5, r6, r7)
        L7:
            int r0 = r4.m2380()
            int r1 = r4.m2389()
            int r1 = r1 + r0
            int r0 = r4.m2402()
            int r2 = r4.m2397()
            int r2 = r2 + r0
            int r0 = r4.f314
            r3 = 1
            if (r0 != r3) goto L41
            int r5 = r5.height()
            int r5 = r5 + r2
            ᛱᛳᛶᛱ r0 = r4.f5691
            java.util.WeakHashMap r2 = defpackage.AbstractC0858.f3911
            int r0 = r0.getMinimumHeight()
            int r5 = defpackage.AbstractC1270.m2378(r7, r5, r0)
            int[] r7 = r4.f300
            int r0 = r7.length
            int r0 = r0 - r3
            r7 = r7[r0]
            int r7 = r7 + r1
            ᛱᛳᛶᛱ r0 = r4.f5691
            int r0 = r0.getMinimumWidth()
            int r6 = defpackage.AbstractC1270.m2378(r6, r7, r0)
            goto L63
        L41:
            int r5 = r5.width()
            int r5 = r5 + r1
            ᛱᛳᛶᛱ r0 = r4.f5691
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            int r0 = r0.getMinimumWidth()
            int r6 = defpackage.AbstractC1270.m2378(r6, r5, r0)
            int[] r5 = r4.f300
            int r0 = r5.length
            int r0 = r0 - r3
            r5 = r5[r0]
            int r5 = r5 + r2
            ᛱᛳᛶᛱ r0 = r4.f5691
            int r0 = r0.getMinimumHeight()
            int r5 = defpackage.AbstractC1270.m2378(r7, r5, r0)
        L63:
            ᛱᛳᛶᛱ r4 = r4.f5691
            defpackage.C0055.m408(r4, r6, r5)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᛴᲀ, reason: contains not printable characters */
    public final int m153(int r2, defpackage.C1633 r3, defpackage.C1000 r4) {
            r1 = this;
            boolean r4 = r4.f4458
            int r0 = r1.f293
            ᛴᛵᲇᲇ r1 = r1.f294
            if (r4 != 0) goto L10
            r1.getClass()
            int r1 = defpackage.C0682.m1538(r2, r0)
            return r1
        L10:
            int r3 = r3.m3009(r2)
            r4 = -1
            if (r3 != r4) goto L2c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot find span size for pre layout position. "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "GridLayoutManager"
            android.util.Log.w(r2, r1)
            r1 = 0
            return r1
        L2c:
            r1.getClass()
            int r1 = defpackage.C0682.m1538(r3, r0)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: ᲇᛸᛵᛲ, reason: contains not printable characters */
    public final void mo154(defpackage.C1633 r20, defpackage.C1000 r21, defpackage.C0361 r22, defpackage.C0903 r23) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            ᲇᲁᛱᛱ r5 = r0.f312
            int r5 = r5.mo1932()
            r6 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r8) goto L17
            r9 = r6
            goto L18
        L17:
            r9 = 0
        L18:
            int r10 = r0.m2393()
            int r11 = r0.f293
            if (r10 <= 0) goto L25
            int[] r10 = r0.f300
            r10 = r10[r11]
            goto L26
        L25:
            r10 = 0
        L26:
            if (r9 == 0) goto L2b
            r0.m136()
        L2b:
            int r12 = r3.f1859
            if (r12 != r6) goto L31
            r12 = r6
            goto L32
        L31:
            r12 = 0
        L32:
            if (r12 != 0) goto L43
            int r13 = r3.f1860
            int r13 = r0.m132(r13, r1, r2)
            int r14 = r3.f1860
            int r14 = r0.m141(r14, r1, r2)
            int r14 = r14 + r13
        L41:
            r13 = 0
            goto L45
        L43:
            r14 = r11
            goto L41
        L45:
            if (r13 >= r11) goto L98
            int r15 = r3.f1860
            if (r15 < 0) goto L98
            int r8 = r2.m1957()
            if (r15 >= r8) goto L98
            if (r14 <= 0) goto L98
            int r8 = r3.f1860
            int r15 = r0.m141(r8, r1, r2)
            if (r15 > r11) goto L6f
            int r14 = r14 - r15
            if (r14 >= 0) goto L5f
            goto L98
        L5f:
            android.view.View r8 = r3.m1089(r1)
            if (r8 != 0) goto L66
            goto L98
        L66:
            android.view.View[] r15 = r0.f296
            r15[r13] = r8
            int r13 = r13 + 1
            r8 = 1073741824(0x40000000, float:2.0)
            goto L45
        L6f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Item at position "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L98:
            if (r13 != 0) goto L9d
            r4.f4111 = r6
            return
        L9d:
            if (r12 == 0) goto La4
            r16 = r6
            r15 = r13
            r14 = 0
            goto La9
        La4:
            int r14 = r13 + (-1)
            r15 = -1
            r16 = -1
        La9:
            r6 = 0
        Laa:
            if (r14 == r15) goto Lc8
            android.view.View[] r7 = r0.f296
            r7 = r7[r14]
            android.view.ViewGroup$LayoutParams r17 = r7.getLayoutParams()
            r8 = r17
            ᲇᛶᛷᲀ r8 = (defpackage.C2068) r8
            int r7 = defpackage.AbstractC1270.m2371(r7)
            int r7 = r0.m141(r7, r1, r2)
            r8.f8884 = r7
            r8.f8883 = r6
            int r6 = r6 + r7
            int r14 = r14 + r16
            goto Laa
        Lc8:
            r1 = 0
            r2 = 0
            r6 = 0
        Lcb:
            if (r2 >= r13) goto L129
            android.view.View[] r7 = r0.f296
            r7 = r7[r2]
            java.util.List r8 = r3.f1856
            if (r8 != 0) goto Le3
            if (r12 == 0) goto Ldd
            r8 = -1
            r14 = 0
            r0.m2399(r7, r8, r14)
            goto Lf0
        Ldd:
            r8 = -1
            r14 = 0
            r0.m2399(r7, r14, r14)
            goto Lf0
        Le3:
            r8 = -1
            r14 = 0
            if (r12 == 0) goto Lec
            r15 = 1
            r0.m2399(r7, r8, r15)
            goto Lf0
        Lec:
            r15 = 1
            r0.m2399(r7, r14, r15)
        Lf0:
            ᛱᛳᛶᛱ r8 = r0.f5691
            android.graphics.Rect r15 = r0.f297
            if (r8 != 0) goto Lfa
            r15.set(r14, r14, r14, r14)
            goto L101
        Lfa:
            android.graphics.Rect r8 = r8.m461(r7)
            r15.set(r8)
        L101:
            r0.m120(r7, r5, r14)
            ᲇᲁᛱᛱ r8 = r0.f312
            int r8 = r8.mo1935(r7)
            if (r8 <= r6) goto L10d
            r6 = r8
        L10d:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            ᲇᛶᛷᲀ r8 = (defpackage.C2068) r8
            ᲇᲁᛱᛱ r14 = r0.f312
            int r7 = r14.mo1941(r7)
            float r7 = (float) r7
            r14 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 * r14
            int r8 = r8.f8884
            float r8 = (float) r8
            float r7 = r7 / r8
            int r8 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r8 <= 0) goto L126
            r1 = r7
        L126:
            int r2 = r2 + 1
            goto Lcb
        L129:
            if (r9 == 0) goto L152
            float r2 = (float) r11
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            int r1 = java.lang.Math.max(r1, r10)
            r0.m128(r1)
            r6 = 0
            r14 = 0
        L13a:
            if (r14 >= r13) goto L152
            android.view.View[] r1 = r0.f296
            r1 = r1[r14]
            r2 = 1073741824(0x40000000, float:2.0)
            r15 = 1
            r0.m120(r1, r2, r15)
            ᲇᲁᛱᛱ r2 = r0.f312
            int r1 = r2.mo1935(r1)
            if (r1 <= r6) goto L14f
            r6 = r1
        L14f:
            int r14 = r14 + 1
            goto L13a
        L152:
            r14 = 0
        L153:
            if (r14 >= r13) goto L1c2
            android.view.View[] r1 = r0.f296
            r1 = r1[r14]
            ᲇᲁᛱᛱ r2 = r0.f312
            int r2 = r2.mo1935(r1)
            if (r2 == r6) goto L1bc
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            ᲇᛶᛷᲀ r2 = (defpackage.C2068) r2
            android.graphics.Rect r5 = r2.f3864
            int r7 = r5.top
            int r8 = r5.bottom
            int r7 = r7 + r8
            int r8 = r2.topMargin
            int r7 = r7 + r8
            int r8 = r2.bottomMargin
            int r7 = r7 + r8
            int r8 = r5.left
            int r5 = r5.right
            int r8 = r8 + r5
            int r5 = r2.leftMargin
            int r8 = r8 + r5
            int r5 = r2.rightMargin
            int r8 = r8 + r5
            int r5 = r2.f8883
            int r9 = r2.f8884
            int r5 = r0.m133(r5, r9)
            int r9 = r0.f314
            r15 = 1
            if (r9 != r15) goto L19c
            int r2 = r2.width
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            int r2 = defpackage.AbstractC1270.m2373(r9, r5, r10, r8, r2)
            int r5 = r6 - r7
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L1ac
        L19c:
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            int r8 = r6 - r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
            int r2 = r2.height
            int r5 = defpackage.AbstractC1270.m2373(r9, r5, r10, r7, r2)
            r2 = r8
        L1ac:
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            ᛵᛲᲁᛴ r7 = (defpackage.C0840) r7
            boolean r7 = r0.m2395(r1, r2, r5, r7)
            if (r7 == 0) goto L1bf
            r1.measure(r2, r5)
            goto L1bf
        L1bc:
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
        L1bf:
            int r14 = r14 + 1
            goto L153
        L1c2:
            r9 = 0
            r4.f4110 = r6
            int r1 = r0.f314
            int r2 = r3.f1865
            int r14 = r3.f1864
            r15 = 1
            if (r1 != r15) goto L1de
            r8 = -1
            if (r2 != r8) goto L1d7
            int r1 = r14 - r6
            r3 = r1
            r1 = r9
            r2 = r1
            goto L1ed
        L1d7:
            int r1 = r14 + r6
            r2 = r9
            r3 = r14
            r14 = r1
            r1 = r2
            goto L1ed
        L1de:
            r8 = -1
            if (r2 != r8) goto L1e7
            int r1 = r14 - r6
            r3 = r9
            r2 = r14
        L1e5:
            r14 = r3
            goto L1ed
        L1e7:
            int r1 = r14 + r6
            r2 = r1
            r3 = r9
            r1 = r14
            goto L1e5
        L1ed:
            r7 = r9
        L1ee:
            android.view.View[] r5 = r0.f296
            if (r7 >= r13) goto L26b
            r5 = r5[r7]
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            ᲇᛶᛷᲀ r6 = (defpackage.C2068) r6
            int r8 = r0.f314
            r15 = 1
            if (r8 != r15) goto L233
            boolean r1 = r0.m169()
            if (r1 == 0) goto L220
            int r1 = r0.m2380()
            int[] r2 = r0.f300
            int r8 = r6.f8883
            int r8 = r11 - r8
            r2 = r2[r8]
            int r1 = r1 + r2
            ᲇᲁᛱᛱ r2 = r0.f312
            int r2 = r2.mo1941(r5)
            int r2 = r1 - r2
            r18 = r2
            r2 = r1
            r1 = r18
            goto L246
        L220:
            int r1 = r0.m2380()
            int[] r2 = r0.f300
            int r8 = r6.f8883
            r2 = r2[r8]
            int r1 = r1 + r2
            ᲇᲁᛱᛱ r2 = r0.f312
            int r2 = r2.mo1941(r5)
            int r2 = r2 + r1
            goto L246
        L233:
            int r3 = r0.m2402()
            int[] r8 = r0.f300
            int r9 = r6.f8883
            r8 = r8[r9]
            int r3 = r3 + r8
            ᲇᲁᛱᛱ r8 = r0.f312
            int r8 = r8.mo1941(r5)
            int r8 = r8 + r3
            r14 = r8
        L246:
            defpackage.AbstractC1270.m2372(r5, r1, r3, r2, r14)
            ᲈᛸᲈᛷ r8 = r6.f3863
            boolean r8 = r8.m3785()
            if (r8 != 0) goto L259
            ᲈᛸᲈᛷ r6 = r6.f3863
            boolean r6 = r6.m3781()
            if (r6 == 0) goto L25b
        L259:
            r15 = 1
            goto L25d
        L25b:
            r15 = 1
            goto L25f
        L25d:
            r4.f4109 = r15
        L25f:
            boolean r6 = r4.f4108
            boolean r5 = r5.hasFocusable()
            r5 = r5 | r6
            r4.f4108 = r5
            int r7 = r7 + 1
            goto L1ee
        L26b:
            r0 = 0
            java.util.Arrays.fill(r5, r0)
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean mo155(defpackage.C0840 r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.C2068
            return r0
    }
}
