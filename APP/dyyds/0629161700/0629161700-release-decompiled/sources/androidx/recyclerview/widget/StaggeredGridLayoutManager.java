package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends defpackage.AbstractC1270 implements defpackage.InterfaceC2256 {

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public boolean f316;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public int f317;

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public final boolean f318;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final int f319;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final defpackage.AbstractC2126 f320;

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public final defpackage.C1884 f321;

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public final int f322;

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public defpackage.C2240 f323;

    /* JADX INFO: renamed from: ᛷᛵᛷᛷ, reason: contains not printable characters */
    public final defpackage.RunnableC0439 f324;

    /* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
    public int[] f325;

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public final defpackage.C1554 f326;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public final defpackage.C2272 f327;

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public boolean f328;

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public boolean f329;

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public boolean f330;

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public int f331;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final defpackage.C2301[] f332;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final defpackage.AbstractC2126 f333;

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public int f334;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final int f335;

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public final java.util.BitSet f336;

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public final android.graphics.Rect f337;

    public StaggeredGridLayoutManager(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9) {
            r5 = this;
            r5.<init>()
            r0 = -1
            r5.f335 = r0
            r1 = 0
            r5.f328 = r1
            r5.f330 = r1
            r5.f334 = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5.f331 = r0
            ᲁᛷᛵ r0 = new ᲁᛷᛵ
            r2 = 9
            r0.<init>(r2)
            r5.f321 = r0
            r2 = 2
            r5.f322 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r5.f337 = r2
            ᛸᲀᛲᛵ r2 = new ᛸᲀᛲᛵ
            r2.<init>(r5)
            r5.f326 = r2
            r2 = 1
            r5.f318 = r2
            ᛳᛳᛵᛲ r3 = new ᛳᛳᛵᛲ
            r4 = 15
            r3.<init>(r4, r5)
            r5.f324 = r3
            ᲁᲀᛱᛸ r6 = defpackage.AbstractC1270.m2369(r6, r7, r8, r9)
            int r7 = r6.f8268
            r8 = 0
            if (r7 == 0) goto L49
            if (r7 != r2) goto L43
            goto L49
        L43:
            java.lang.String r5 = "invalid orientation."
            defpackage.C2264.m3684(r5)
            throw r8
        L49:
            r5.mo177(r8)
            int r9 = r5.f319
            if (r7 != r9) goto L51
            goto L5e
        L51:
            r5.f319 = r7
            ᲇᲁᛱᛱ r7 = r5.f333
            ᲇᲁᛱᛱ r9 = r5.f320
            r5.f333 = r9
            r5.f320 = r7
            r5.m2383()
        L5e:
            int r7 = r6.f8269
            r5.mo177(r8)
            int r9 = r5.f335
            if (r7 == r9) goto L92
            r0.m3307()
            r5.m2383()
            r5.f335 = r7
            java.util.BitSet r7 = new java.util.BitSet
            int r9 = r5.f335
            r7.<init>(r9)
            r5.f336 = r7
            int r7 = r5.f335
            ᲈᛸᛲᛵ[] r7 = new defpackage.C2301[r7]
            r5.f332 = r7
            r7 = r1
        L7f:
            int r9 = r5.f335
            if (r7 >= r9) goto L8f
            ᲈᛸᛲᛵ[] r9 = r5.f332
            ᲈᛸᛲᛵ r0 = new ᲈᛸᛲᛵ
            r0.<init>(r5, r7)
            r9[r7] = r0
            int r7 = r7 + 1
            goto L7f
        L8f:
            r5.m2383()
        L92:
            boolean r6 = r6.f8267
            r5.mo177(r8)
            ᲈᛵᛴᲇ r7 = r5.f323
            if (r7 == 0) goto La1
            boolean r8 = r7.f9545
            if (r8 == r6) goto La1
            r7.f9545 = r6
        La1:
            r5.f328 = r6
            r5.m2383()
            ᲈᛶᲁᛵ r6 = new ᲈᛶᲁᛵ
            r6.<init>()
            r6.f9616 = r2
            r6.f9618 = r1
            r6.f9619 = r1
            r5.f327 = r6
            int r6 = r5.f319
            ᲇᲁᛱᛱ r6 = defpackage.AbstractC2126.m3549(r5, r6)
            r5.f333 = r6
            int r6 = r5.f319
            int r2 = r2 - r6
            ᲇᲁᛱᛱ r6 = defpackage.AbstractC2126.m3549(r5, r2)
            r5.f320 = r6
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᛴᛱ, reason: contains not printable characters */
    public static int m198(int r2, int r3, int r4) {
            if (r3 != 0) goto L5
            if (r4 != 0) goto L5
            goto L12
        L5:
            int r0 = android.view.View.MeasureSpec.getMode(r2)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L13
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L12
            goto L13
        L12:
            return r2
        L13:
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            int r2 = r2 - r3
            int r2 = r2 - r4
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛲᛴᲇ, reason: contains not printable characters */
    public final int m199(int r4) {
            r3 = this;
            ᲈᛸᛲᛵ[] r0 = r3.f332
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.m3735(r4)
            r1 = 1
        La:
            int r2 = r3.f335
            if (r1 >= r2) goto L1c
            ᲈᛸᛲᛵ[] r2 = r3.f332
            r2 = r2[r1]
            int r2 = r2.m3735(r4)
            if (r2 <= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛲᛶᲈ, reason: contains not printable characters */
    public final void m200(defpackage.C1633 r3, defpackage.C1000 r4, boolean r5) {
            r2 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r2.m205(r0)
            if (r1 != r0) goto La
            goto L22
        La:
            ᲇᲁᛱᛱ r0 = r2.f333
            int r0 = r0.mo1936()
            int r1 = r1 - r0
            if (r1 <= 0) goto L22
            int r3 = r2.m217(r1, r3, r4)
            int r1 = r1 - r3
            if (r5 == 0) goto L22
            if (r1 <= 0) goto L22
            ᲇᲁᛱᛱ r2 = r2.f333
            int r3 = -r1
            r2.mo1940(r3)
        L22:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final void mo159(int r7, int r8, defpackage.C1000 r9, defpackage.C0128 r10) {
            r6 = this;
            int r0 = r6.f319
            if (r0 != 0) goto L5
            goto L6
        L5:
            r7 = r8
        L6:
            int r8 = r6.m2393()
            if (r8 == 0) goto L72
            if (r7 != 0) goto Lf
            goto L72
        Lf:
            r6.m224(r7, r9)
            int[] r7 = r6.f325
            int r8 = r6.f335
            if (r7 == 0) goto L1b
            int r7 = r7.length
            if (r7 >= r8) goto L1f
        L1b:
            int[] r7 = new int[r8]
            r6.f325 = r7
        L1f:
            r7 = 0
            r0 = r7
            r1 = r0
        L22:
            ᲈᛶᲁᛵ r2 = r6.f327
            if (r0 >= r8) goto L4e
            int r3 = r2.f9614
            r4 = -1
            ᲈᛸᛲᛵ[] r5 = r6.f332
            if (r3 != r4) goto L37
            int r2 = r2.f9618
            r3 = r5[r0]
            int r3 = r3.m3733(r2)
            int r2 = r2 - r3
            goto L43
        L37:
            r3 = r5[r0]
            int r4 = r2.f9619
            int r3 = r3.m3735(r4)
            int r2 = r2.f9619
            int r2 = r3 - r2
        L43:
            if (r2 < 0) goto L4b
            int[] r3 = r6.f325
            r3[r1] = r2
            int r1 = r1 + 1
        L4b:
            int r0 = r0 + 1
            goto L22
        L4e:
            int[] r8 = r6.f325
            java.util.Arrays.sort(r8, r7, r1)
        L53:
            if (r7 >= r1) goto L72
            int r8 = r2.f9615
            if (r8 < 0) goto L72
            int r0 = r9.m1957()
            if (r8 >= r0) goto L72
            int r8 = r2.f9615
            int[] r0 = r6.f325
            r0 = r0[r7]
            r10.m642(r8, r0)
            int r8 = r2.f9615
            int r0 = r2.f9614
            int r8 = r8 + r0
            r2.f9615 = r8
            int r7 = r7 + 1
            goto L53
        L72:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛱᛳᛷ, reason: contains not printable characters */
    public final void mo201(int r5) {
            r4 = this;
            super.mo201(r5)
            r0 = 0
        L4:
            int r1 = r4.f335
            if (r0 >= r1) goto L1f
            ᲈᛸᛲᛵ[] r1 = r4.f332
            r1 = r1[r0]
            int r2 = r1.f9732
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.f9732 = r2
        L15:
            int r2 = r1.f9730
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.f9730 = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    /* JADX INFO: renamed from: ᛱᲀᛲᛱ, reason: contains not printable characters */
    public final void m202(defpackage.C2301 r6, int r7, int r8) {
            r5 = this;
            int r0 = r6.f9729
            int r1 = r6.f9728
            r2 = -1
            java.util.BitSet r5 = r5.f336
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            if (r7 != r2) goto L39
            int r7 = r6.f9732
            if (r7 == r3) goto L11
            goto L32
        L11:
            java.lang.Object r7 = r6.f9733
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = r7.get(r4)
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            ᛱᲇᛲ r2 = (defpackage.C0193) r2
            java.lang.Object r3 = r6.f9734
            androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r3
            ᲇᲁᛱᛱ r3 = r3.f333
            int r7 = r3.mo1943(r7)
            r6.f9732 = r7
            r2.getClass()
            int r7 = r6.f9732
        L32:
            int r7 = r7 + r0
            if (r7 > r8) goto L49
            r5.set(r1, r4)
            return
        L39:
            int r7 = r6.f9730
            if (r7 == r3) goto L3e
            goto L43
        L3e:
            r6.m3738()
            int r7 = r6.f9730
        L43:
            int r7 = r7 - r0
            if (r7 < r8) goto L49
            r5.set(r1, r4)
        L49:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛱᲈᛷᲀ, reason: contains not printable characters */
    public final void mo203(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r0.m211()
        L5:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final int mo115(defpackage.C1000 r1) {
            r0 = this;
            int r0 = r0.m228(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᲀᛸ, reason: contains not printable characters */
    public final void m204(defpackage.C1633 r7, int r8) {
            r6 = this;
        L0:
            int r0 = r6.m2393()
            if (r0 <= 0) goto L74
            r0 = 0
            android.view.View r1 = r6.m2382(r0)
            ᲇᲁᛱᛱ r2 = r6.f333
            int r3 = r2.mo1937(r1)
            if (r3 > r8) goto L74
            int r2 = r2.mo1934(r1)
            if (r2 > r8) goto L74
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            ᛱᲇᛲ r2 = (defpackage.C0193) r2
            r2.getClass()
            ᲈᛸᛲᛵ r3 = r2.f1260
            java.lang.Object r3 = r3.f9733
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L30
            goto L74
        L30:
            ᲈᛸᛲᛵ r2 = r2.f1260
            java.lang.Object r3 = r2.f9733
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r0 = r3.remove(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            ᛱᲇᛲ r4 = (defpackage.C0193) r4
            r5 = 0
            r4.f1260 = r5
            int r3 = r3.size()
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L4f
            r2.f9730 = r5
        L4f:
            ᲈᛸᲈᛷ r3 = r4.f3863
            boolean r3 = r3.m3785()
            if (r3 != 0) goto L5f
            ᲈᛸᲈᛷ r3 = r4.f3863
            boolean r3 = r3.m3781()
            if (r3 == 0) goto L6e
        L5f:
            int r3 = r2.f9729
            java.lang.Object r4 = r2.f9734
            androidx.recyclerview.widget.StaggeredGridLayoutManager r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r4
            ᲇᲁᛱᛱ r4 = r4.f333
            int r0 = r4.mo1935(r0)
            int r3 = r3 - r0
            r2.f9729 = r3
        L6e:
            r2.f9732 = r5
            r6.m2396(r1, r7)
            goto L0
        L74:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final int mo116(defpackage.C1000 r8) {
            r7 = this;
            int r0 = r7.m2393()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r7.f318
            r0 = r0 ^ 1
            android.view.View r3 = r7.m226(r0)
            android.view.View r4 = r7.m219(r0)
            boolean r6 = r7.f318
            ᲇᲁᛱᛱ r2 = r7.f333
            r5 = r7
            r1 = r8
            int r7 = defpackage.C0292.m950(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛲᛵᲁᛲ */
    public final void mo117(defpackage.C1633 r7, defpackage.C1000 r8, android.view.View r9, defpackage.C2060 r10) {
            r6 = this;
            android.view.accessibility.AccessibilityNodeInfo r7 = r10.f8857
            android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
            boolean r0 = r8 instanceof defpackage.C0193
            if (r0 != 0) goto Le
            r6.m2381(r9, r10)
            return
        Le:
            ᛱᲇᛲ r8 = (defpackage.C0193) r8
            ᲈᛸᛲᛵ r8 = r8.f1260
            r9 = -1
            int r6 = r6.f319
            if (r6 != 0) goto L2b
            if (r8 != 0) goto L1b
        L19:
            r0 = r9
            goto L1e
        L1b:
            int r9 = r8.f9728
            goto L19
        L1e:
            r4 = 0
            r5 = 0
            r1 = 1
            r2 = -1
            r3 = -1
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r6 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r0, r1, r2, r3, r4, r5)
            r7.setCollectionItemInfo(r6)
            return
        L2b:
            if (r8 != 0) goto L2f
        L2d:
            r2 = r9
            goto L32
        L2f:
            int r9 = r8.f9728
            goto L2d
        L32:
            r4 = 0
            r5 = 0
            r0 = -1
            r1 = -1
            r3 = 1
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r6 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r0, r1, r2, r3, r4, r5)
            r7.setCollectionItemInfo(r6)
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛲᲈᛶᲇ */
    public final void mo118(int r2, int r3) {
            r1 = this;
            r0 = 4
            r1.m216(r2, r3, r0)
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛲᲈᛸᛲ */
    public final void mo162(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C2240
            if (r0 == 0) goto L20
            ᲈᛵᛴᲇ r3 = (defpackage.C2240) r3
            r2.f323 = r3
            int r0 = r2.f334
            r1 = -1
            if (r0 == r1) goto L1d
            r3.f9544 = r1
            r3.f9543 = r1
            r0 = 0
            r3.f9546 = r0
            r1 = 0
            r3.f9542 = r1
            r3.f9547 = r1
            r3.f9538 = r0
            r3.f9541 = r0
        L1d:
            r2.m2383()
        L20:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛳᛳᛵᛲ */
    public final int mo119(int r1, defpackage.C1633 r2, defpackage.C1000 r3) {
            r0 = this;
            int r0 = r0.m217(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛳᛴᲈᲁ, reason: contains not printable characters */
    public final int m205(int r4) {
            r3 = this;
            ᲈᛸᛲᛵ[] r0 = r3.f332
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.m3733(r4)
            r1 = 1
        La:
            int r2 = r3.f335
            if (r1 >= r2) goto L1c
            ᲈᛸᛲᛵ[] r2 = r3.f332
            r2 = r2[r1]
            int r2 = r2.m3733(r4)
            if (r2 >= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛳᛸᛱᲇ */
    public final boolean mo164() {
            r0 = this;
            boolean r0 = r0.f328
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛳᲁᲈᲁ */
    public final defpackage.C0840 mo121(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            ᛱᲇᛲ r0 = new ᛱᲇᛲ
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        Lc:
            ᛱᲇᛲ r0 = new ᛱᲇᛲ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲈᲇᛷ, reason: contains not printable characters */
    public final int m206() {
            r1 = this;
            int r0 = r1.m2393()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r0 + (-1)
            android.view.View r1 = r1.m2382(r0)
            int r1 = defpackage.AbstractC1270.m2371(r1)
            return r1
    }

    /* JADX INFO: renamed from: ᛴᛲᛷᲁ, reason: contains not printable characters */
    public final void m207(defpackage.C1633 r3, defpackage.C1000 r4, boolean r5) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r2.m199(r0)
            if (r1 != r0) goto L9
            goto L22
        L9:
            ᲇᲁᛱᛱ r0 = r2.f333
            int r0 = r0.mo1933()
            int r0 = r0 - r1
            if (r0 <= 0) goto L22
            int r1 = -r0
            int r3 = r2.m217(r1, r3, r4)
            int r3 = -r3
            int r0 = r0 - r3
            if (r5 == 0) goto L22
            if (r0 <= 0) goto L22
            ᲇᲁᛱᛱ r2 = r2.f333
            r2.mo1940(r0)
        L22:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᛴᛲᲈ, reason: contains not printable characters */
    public final void mo208() {
            r2 = this;
            ᲁᛷᛵ r0 = r2.f321
            r0.m3307()
            r0 = 0
        L6:
            int r1 = r2.f335
            if (r0 >= r1) goto L14
            ᲈᛸᛲᛵ[] r1 = r2.f332
            r1 = r1[r0]
            r1.m3740()
            int r0 = r0 + 1
            goto L6
        L14:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᛴᲈᛵ */
    public final void mo122() {
            r1 = this;
            ᲁᛷᛵ r0 = r1.f321
            r0.m3307()
            r1.m2383()
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᛵᛸᛴ */
    public final void mo167(defpackage.C0055 r2, int r3) {
            r1 = this;
            ᛱᛶᛲ r0 = new ᛱᛶᛲ
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            r0.f948 = r3
            r1.m2390(r0)
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᛶᛸᲈ */
    public final void mo123(defpackage.C1633 r1, defpackage.C1000 r2, defpackage.C2060 r3) {
            r0 = this;
            super.mo123(r1, r2, r3)
            java.lang.String r0 = "androidx.recyclerview.widget.StaggeredGridLayoutManager"
            android.view.accessibility.AccessibilityNodeInfo r1 = r3.f8857
            r1.setClassName(r0)
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public final int mo124(defpackage.C1000 r8) {
            r7 = this;
            int r0 = r7.m2393()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r7.f318
            r0 = r0 ^ 1
            android.view.View r3 = r7.m226(r0)
            android.view.View r4 = r7.m219(r0)
            boolean r6 = r7.f318
            ᲇᲁᛱᛱ r2 = r7.f333
            r5 = r7
            r1 = r8
            int r7 = defpackage.C0292.m950(r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᛷ, reason: contains not printable characters */
    public final void m209(defpackage.C1633 r7, defpackage.C2272 r8) {
            r6 = this;
            boolean r0 = r8.f9616
            if (r0 == 0) goto L76
            boolean r0 = r8.f9612
            if (r0 == 0) goto La
            goto L76
        La:
            int r0 = r8.f9617
            int r1 = r8.f9613
            r2 = -1
            if (r0 != 0) goto L1f
            if (r1 != r2) goto L19
            int r8 = r8.f9619
            r6.m214(r7, r8)
            return
        L19:
            int r8 = r8.f9618
            r6.m204(r7, r8)
            return
        L1f:
            int r0 = r6.f335
            ᲈᛸᛲᛵ[] r3 = r6.f332
            r4 = 1
            r5 = 0
            if (r1 != r2) goto L4e
            int r1 = r8.f9618
            r2 = r3[r5]
            int r2 = r2.m3733(r1)
        L2f:
            if (r4 >= r0) goto L3d
            r5 = r3[r4]
            int r5 = r5.m3733(r1)
            if (r5 <= r2) goto L3a
            r2 = r5
        L3a:
            int r4 = r4 + 1
            goto L2f
        L3d:
            int r1 = r1 - r2
            int r0 = r8.f9619
            if (r1 >= 0) goto L43
            goto L4a
        L43:
            int r8 = r8.f9617
            int r8 = java.lang.Math.min(r1, r8)
            int r0 = r0 - r8
        L4a:
            r6.m214(r7, r0)
            return
        L4e:
            int r1 = r8.f9619
            r2 = r3[r5]
            int r2 = r2.m3735(r1)
        L56:
            if (r4 >= r0) goto L64
            r5 = r3[r4]
            int r5 = r5.m3735(r1)
            if (r5 >= r2) goto L61
            r2 = r5
        L61:
            int r4 = r4 + 1
            goto L56
        L64:
            int r0 = r8.f9619
            int r2 = r2 - r0
            int r0 = r8.f9618
            if (r2 >= 0) goto L6c
            goto L73
        L6c:
            int r8 = r8.f9617
            int r8 = java.lang.Math.min(r2, r8)
            int r0 = r0 + r8
        L73:
            r6.m204(r7, r0)
        L76:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ */
    public final defpackage.C0840 mo126(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            ᛱᲇᛲ r0 = new ᛱᲇᛲ
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛴᲁᲇᛲ */
    public final void mo168(int r3) {
            r2 = this;
            ᲈᛵᛴᲇ r0 = r2.f323
            if (r0 == 0) goto L13
            int r1 = r0.f9544
            if (r1 == r3) goto L13
            r1 = 0
            r0.f9546 = r1
            r1 = 0
            r0.f9542 = r1
            r1 = -1
            r0.f9544 = r1
            r0.f9543 = r1
        L13:
            r2.f334 = r3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.f331 = r3
            r2.m2383()
            return
    }

    /* JADX INFO: renamed from: ᛴᲈᲀᲇ, reason: contains not printable characters */
    public final boolean m210(int r5) {
            r4 = this;
            int r0 = r4.f319
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L12
            if (r5 != r1) goto Lb
            r5 = r3
            goto Lc
        Lb:
            r5 = r2
        Lc:
            boolean r4 = r4.f330
            if (r5 == r4) goto L11
            return r3
        L11:
            return r2
        L12:
            if (r5 != r1) goto L16
            r5 = r3
            goto L17
        L16:
            r5 = r2
        L17:
            boolean r0 = r4.f330
            if (r5 != r0) goto L1d
            r5 = r3
            goto L1e
        L1d:
            r5 = r2
        L1e:
            boolean r4 = r4.m223()
            if (r5 != r4) goto L25
            return r3
        L25:
            return r2
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final boolean mo170() {
            r1 = this;
            int r1 = r1.f319
            r0 = 1
            if (r1 != r0) goto L6
            return r0
        L6:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛴᛴᛳ, reason: contains not printable characters */
    public final boolean m211() {
            r2 = this;
            int r0 = r2.m2393()
            r1 = 0
            if (r0 == 0) goto L37
            int r0 = r2.f322
            if (r0 == 0) goto L37
            boolean r0 = r2.f5693
            if (r0 != 0) goto L10
            goto L37
        L10:
            boolean r0 = r2.f330
            if (r0 == 0) goto L1c
            int r0 = r2.m206()
            r2.m218()
            goto L23
        L1c:
            int r0 = r2.m218()
            r2.m206()
        L23:
            if (r0 != 0) goto L37
            android.view.View r0 = r2.m213()
            if (r0 == 0) goto L37
            ᲁᛷᛵ r0 = r2.f321
            r0.m3307()
            r0 = 1
            r2.f5692 = r0
            r2.m2383()
            return r0
        L37:
            return r1
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛵᛵᲀᛲ */
    public final android.view.View mo130(android.view.View r9, int r10, defpackage.C1633 r11, defpackage.C1000 r12) {
            r8 = this;
            int r0 = r8.m2393()
            r1 = 0
            if (r0 != 0) goto L9
            goto L146
        L9:
            ᛱᛳᛶᛱ r0 = r8.f5691
            if (r0 != 0) goto Le
            goto L21
        Le:
            android.view.View r9 = r0.m434(r9)
            if (r9 != 0) goto L15
            goto L21
        L15:
            ᲈᛷᲀᲀ r0 = r8.f5688
            java.lang.Object r0 = r0.f9714
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L22
        L21:
            r9 = r1
        L22:
            if (r9 != 0) goto L26
            goto L146
        L26:
            r8.m225()
            int r0 = r8.f319
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = -1
            r4 = 1
            if (r10 == r4) goto L5e
            r5 = 2
            if (r10 == r5) goto L54
            r5 = 17
            if (r10 == r5) goto L51
            r5 = 33
            if (r10 == r5) goto L4d
            r5 = 66
            if (r10 == r5) goto L4a
            r5 = 130(0x82, float:1.82E-43)
            if (r10 == r5) goto L46
        L44:
            r10 = r2
            goto L68
        L46:
            if (r0 != r4) goto L44
        L48:
            r10 = r4
            goto L68
        L4a:
            if (r0 != 0) goto L44
            goto L48
        L4d:
            if (r0 != r4) goto L44
        L4f:
            r10 = r3
            goto L68
        L51:
            if (r0 != 0) goto L44
        L53:
            goto L4f
        L54:
            if (r0 != r4) goto L57
            goto L48
        L57:
            boolean r10 = r8.m223()
            if (r10 == 0) goto L48
            goto L4f
        L5e:
            if (r0 != r4) goto L61
            goto L53
        L61:
            boolean r10 = r8.m223()
            if (r10 == 0) goto L4f
            goto L48
        L68:
            if (r10 != r2) goto L6c
            goto L146
        L6c:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            ᛱᲇᛲ r0 = (defpackage.C0193) r0
            r0.getClass()
            ᲈᛸᛲᛵ r0 = r0.f1260
            if (r10 != r4) goto L7e
            int r2 = r8.m206()
            goto L82
        L7e:
            int r2 = r8.m218()
        L82:
            r8.m222(r2, r12)
            r8.m221(r10)
            ᲈᛶᲁᛵ r5 = r8.f327
            int r6 = r5.f9614
            int r6 = r6 + r2
            r5.f9615 = r6
            ᲇᲁᛱᛱ r6 = r8.f333
            int r6 = r6.mo1939()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.f9617 = r6
            r5.f9611 = r4
            r6 = 0
            r5.f9616 = r6
            r8.m220(r11, r5, r12)
            boolean r11 = r8.f330
            r8.f329 = r11
            android.view.View r11 = r0.m3739(r2, r10)
            if (r11 == 0) goto Lb2
            if (r11 == r9) goto Lb2
            return r11
        Lb2:
            boolean r11 = r8.m210(r10)
            ᲈᛸᛲᛵ[] r12 = r8.f332
            int r5 = r8.f335
            if (r11 == 0) goto Lce
            int r11 = r5 + (-1)
        Lbe:
            if (r11 < 0) goto Ldf
            r7 = r12[r11]
            android.view.View r7 = r7.m3739(r2, r10)
            if (r7 == 0) goto Lcb
            if (r7 == r9) goto Lcb
            return r7
        Lcb:
            int r11 = r11 + (-1)
            goto Lbe
        Lce:
            r11 = r6
        Lcf:
            if (r11 >= r5) goto Ldf
            r7 = r12[r11]
            android.view.View r7 = r7.m3739(r2, r10)
            if (r7 == 0) goto Ldc
            if (r7 == r9) goto Ldc
            return r7
        Ldc:
            int r11 = r11 + 1
            goto Lcf
        Ldf:
            boolean r11 = r8.f328
            r11 = r11 ^ r4
            if (r10 != r3) goto Le6
            r2 = r4
            goto Le7
        Le6:
            r2 = r6
        Le7:
            if (r11 != r2) goto Leb
            r11 = r4
            goto Lec
        Leb:
            r11 = r6
        Lec:
            if (r11 == 0) goto Lf3
            int r2 = r0.m3736()
            goto Lf7
        Lf3:
            int r2 = r0.m3741()
        Lf7:
            android.view.View r2 = r8.mo191(r2)
            if (r2 == 0) goto L100
            if (r2 == r9) goto L100
            return r2
        L100:
            boolean r10 = r8.m210(r10)
            if (r10 == 0) goto L129
            int r5 = r5 - r4
        L107:
            if (r5 < 0) goto L146
            int r10 = r0.f9728
            if (r5 != r10) goto L10e
            goto L126
        L10e:
            if (r11 == 0) goto L117
            r10 = r12[r5]
            int r10 = r10.m3736()
            goto L11d
        L117:
            r10 = r12[r5]
            int r10 = r10.m3741()
        L11d:
            android.view.View r10 = r8.mo191(r10)
            if (r10 == 0) goto L126
            if (r10 == r9) goto L126
            return r10
        L126:
            int r5 = r5 + (-1)
            goto L107
        L129:
            if (r6 >= r5) goto L146
            if (r11 == 0) goto L134
            r10 = r12[r6]
            int r10 = r10.m3736()
            goto L13a
        L134:
            r10 = r12[r6]
            int r10 = r10.m3741()
        L13a:
            android.view.View r10 = r8.mo191(r10)
            if (r10 == 0) goto L143
            if (r10 == r9) goto L143
            return r10
        L143:
            int r6 = r6 + 1
            goto L129
        L146:
            return r1
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final int mo171(defpackage.C1000 r8) {
            r7 = this;
            int r0 = r7.m2393()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r7.f318
            r0 = r0 ^ 1
            android.view.View r3 = r7.m226(r0)
            android.view.View r4 = r7.m219(r0)
            boolean r6 = r7.f318
            ᲇᲁᛱᛱ r2 = r7.f333
            r5 = r7
            r1 = r8
            int r7 = defpackage.C0292.m941(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛲᛶᲀ */
    public final void mo137(defpackage.C1633 r2, defpackage.C1000 r3) {
            r1 = this;
            r0 = 1
            r1.m227(r2, r3, r0)
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛲᲁᛳ, reason: contains not printable characters */
    public final void mo212(int r5) {
            r4 = this;
            super.mo212(r5)
            r0 = 0
        L4:
            int r1 = r4.f335
            if (r0 >= r1) goto L1f
            ᲈᛸᛲᛵ[] r1 = r4.f332
            r1 = r1[r0]
            int r2 = r1.f9732
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.f9732 = r2
        L15:
            int r2 = r1.f9730
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.f9730 = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final boolean mo172() {
            r0 = this;
            int r0 = r0.f319
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛴᲈ */
    public final void mo173(defpackage.C0055 r3) {
            r2 = this;
            ᛱᛳᛶᛱ r0 = r2.f5691
            if (r0 == 0) goto L9
            ᛳᛳᛵᛲ r1 = r2.f324
            r0.removeCallbacks(r1)
        L9:
            r0 = 0
        La:
            int r1 = r2.f335
            if (r0 >= r1) goto L18
            ᲈᛸᛲᛵ[] r1 = r2.f332
            r1 = r1[r0]
            r1.m3740()
            int r0 = r0 + 1
            goto La
        L18:
            r3.requestLayout()
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛵᲇᛶ */
    public final int mo138(defpackage.C1633 r1, defpackage.C1000 r2) {
            r0 = this;
            int r1 = r0.f319
            if (r1 != 0) goto Lf
            int r0 = r0.f335
            int r1 = r2.m1957()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        Lf:
            r0 = -1
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛷᛱᲁ */
    public final android.os.Parcelable mo174() {
            r7 = this;
            ᲈᛵᛴᲇ r0 = r7.f323
            if (r0 == 0) goto L32
            ᲈᛵᛴᲇ r7 = new ᲈᛵᛴᲇ
            r7.<init>()
            int r1 = r0.f9542
            r7.f9542 = r1
            int r1 = r0.f9544
            r7.f9544 = r1
            int r1 = r0.f9543
            r7.f9543 = r1
            int[] r1 = r0.f9546
            r7.f9546 = r1
            int r1 = r0.f9547
            r7.f9547 = r1
            int[] r1 = r0.f9538
            r7.f9538 = r1
            boolean r1 = r0.f9545
            r7.f9545 = r1
            boolean r1 = r0.f9539
            r7.f9539 = r1
            boolean r1 = r0.f9540
            r7.f9540 = r1
            java.util.ArrayList r0 = r0.f9541
            r7.f9541 = r0
            return r7
        L32:
            ᲈᛵᛴᲇ r0 = new ᲈᛵᛴᲇ
            r0.<init>()
            boolean r1 = r7.f328
            r0.f9545 = r1
            boolean r1 = r7.f329
            r0.f9539 = r1
            boolean r1 = r7.f316
            r0.f9540 = r1
            r1 = 0
            ᲁᛷᛵ r2 = r7.f321
            if (r2 == 0) goto L5a
            java.lang.Object r3 = r2.f8180
            int[] r3 = (int[]) r3
            if (r3 == 0) goto L5a
            r0.f9538 = r3
            int r3 = r3.length
            r0.f9547 = r3
            java.lang.Object r2 = r2.f8179
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r0.f9541 = r2
            goto L5c
        L5a:
            r0.f9547 = r1
        L5c:
            int r2 = r7.m2393()
            r3 = -1
            if (r2 <= 0) goto Lc0
            boolean r2 = r7.f329
            if (r2 == 0) goto L6c
            int r2 = r7.m206()
            goto L70
        L6c:
            int r2 = r7.m218()
        L70:
            r0.f9544 = r2
            boolean r2 = r7.f330
            r4 = 1
            if (r2 == 0) goto L7c
            android.view.View r2 = r7.m219(r4)
            goto L80
        L7c:
            android.view.View r2 = r7.m226(r4)
        L80:
            if (r2 != 0) goto L83
            goto L87
        L83:
            int r3 = defpackage.AbstractC1270.m2371(r2)
        L87:
            r0.f9543 = r3
            int r2 = r7.f335
            r0.f9542 = r2
            int[] r3 = new int[r2]
            r0.f9546 = r3
        L91:
            if (r1 >= r2) goto Lbf
            boolean r3 = r7.f329
            ᲇᲁᛱᛱ r4 = r7.f333
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            ᲈᛸᛲᛵ[] r6 = r7.f332
            if (r3 == 0) goto Lab
            r3 = r6[r1]
            int r3 = r3.m3735(r5)
            if (r3 == r5) goto Lb8
            int r4 = r4.mo1933()
        La9:
            int r3 = r3 - r4
            goto Lb8
        Lab:
            r3 = r6[r1]
            int r3 = r3.m3733(r5)
            if (r3 == r5) goto Lb8
            int r4 = r4.mo1936()
            goto La9
        Lb8:
            int[] r4 = r0.f9546
            r4[r1] = r3
            int r1 = r1 + 1
            goto L91
        Lbf:
            return r0
        Lc0:
            r0.f9544 = r3
            r0.f9543 = r3
            r0.f9542 = r1
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛷᛳᛶ, reason: contains not printable characters */
    public final android.view.View m213() {
            r15 = this;
            int r0 = r15.m2393()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r15.f335
            r2.<init>(r3)
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r15.f319
            r6 = -1
            if (r3 != r5) goto L1f
            boolean r3 = r15.m223()
            if (r3 == 0) goto L1f
            r3 = r5
            goto L20
        L1f:
            r3 = r6
        L20:
            boolean r7 = r15.f330
            if (r7 == 0) goto L26
            r0 = r6
            goto L27
        L26:
            r1 = r4
        L27:
            if (r1 >= r0) goto L2a
            r6 = r5
        L2a:
            if (r1 == r0) goto Lf8
            android.view.View r7 = r15.m2382(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            ᛱᲇᛲ r8 = (defpackage.C0193) r8
            ᲈᛸᛲᛵ r9 = r8.f1260
            int r9 = r9.f9728
            boolean r9 = r2.get(r9)
            ᲇᲁᛱᛱ r10 = r15.f333
            if (r9 == 0) goto Lb6
            ᲈᛸᛲᛵ r9 = r8.f1260
            boolean r11 = r15.f330
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L73
            int r11 = r9.f9730
            if (r11 == r12) goto L4f
            goto L54
        L4f:
            r9.m3738()
            int r11 = r9.f9730
        L54:
            int r12 = r10.mo1933()
            if (r11 >= r12) goto Laf
            java.lang.Object r15 = r9.f9733
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            int r0 = r15.size()
            int r0 = r0 - r5
            java.lang.Object r15 = r15.get(r0)
            android.view.View r15 = (android.view.View) r15
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            ᛱᲇᛲ r15 = (defpackage.C0193) r15
            r15.getClass()
            return r7
        L73:
            int r11 = r9.f9732
            java.lang.Object r13 = r9.f9733
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            if (r11 == r12) goto L7c
            goto L99
        L7c:
            java.lang.Object r11 = r13.get(r4)
            android.view.View r11 = (android.view.View) r11
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            ᛱᲇᛲ r12 = (defpackage.C0193) r12
            java.lang.Object r14 = r9.f9734
            androidx.recyclerview.widget.StaggeredGridLayoutManager r14 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r14
            ᲇᲁᛱᛱ r14 = r14.f333
            int r11 = r14.mo1943(r11)
            r9.f9732 = r11
            r12.getClass()
            int r11 = r9.f9732
        L99:
            int r9 = r10.mo1936()
            if (r11 <= r9) goto Laf
            java.lang.Object r15 = r13.get(r4)
            android.view.View r15 = (android.view.View) r15
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            ᛱᲇᛲ r15 = (defpackage.C0193) r15
            r15.getClass()
            return r7
        Laf:
            ᲈᛸᛲᛵ r9 = r8.f1260
            int r9 = r9.f9728
            r2.clear(r9)
        Lb6:
            int r1 = r1 + r6
            if (r1 == r0) goto L2a
            android.view.View r9 = r15.m2382(r1)
            boolean r11 = r15.f330
            if (r11 == 0) goto Lcf
            int r11 = r10.mo1937(r7)
            int r10 = r10.mo1937(r9)
            if (r11 >= r10) goto Lcc
            goto Lf7
        Lcc:
            if (r11 != r10) goto L2a
            goto Ldc
        Lcf:
            int r11 = r10.mo1943(r7)
            int r10 = r10.mo1943(r9)
            if (r11 <= r10) goto Lda
            goto Lf7
        Lda:
            if (r11 != r10) goto L2a
        Ldc:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            ᛱᲇᛲ r9 = (defpackage.C0193) r9
            ᲈᛸᛲᛵ r8 = r8.f1260
            int r8 = r8.f9728
            ᲈᛸᛲᛵ r9 = r9.f1260
            int r9 = r9.f9728
            int r8 = r8 - r9
            if (r8 >= 0) goto Lef
            r8 = r5
            goto Lf0
        Lef:
            r8 = r4
        Lf0:
            if (r3 >= 0) goto Lf4
            r9 = r5
            goto Lf5
        Lf4:
            r9 = r4
        Lf5:
            if (r8 == r9) goto L2a
        Lf7:
            return r7
        Lf8:
            r15 = 0
            return r15
    }

    /* JADX INFO: renamed from: ᛷᛷᛳᲁ, reason: contains not printable characters */
    public final void m214(defpackage.C1633 r9, int r10) {
            r8 = this;
            int r0 = r8.m2393()
            r1 = 1
            int r0 = r0 - r1
        L6:
            if (r0 < 0) goto L78
            android.view.View r2 = r8.m2382(r0)
            ᲇᲁᛱᛱ r3 = r8.f333
            int r4 = r3.mo1943(r2)
            if (r4 < r10) goto L78
            int r3 = r3.mo1942(r2)
            if (r3 < r10) goto L78
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            ᛱᲇᛲ r3 = (defpackage.C0193) r3
            r3.getClass()
            ᲈᛸᛲᛵ r4 = r3.f1260
            java.lang.Object r4 = r4.f9733
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            if (r4 != r1) goto L30
            goto L78
        L30:
            ᲈᛸᛲᛵ r3 = r3.f1260
            java.lang.Object r4 = r3.f9733
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            int r6 = r5 + (-1)
            java.lang.Object r4 = r4.remove(r6)
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            ᛱᲇᛲ r6 = (defpackage.C0193) r6
            r7 = 0
            r6.f1260 = r7
            ᲈᛸᲈᛷ r7 = r6.f3863
            boolean r7 = r7.m3785()
            if (r7 != 0) goto L5b
            ᲈᛸᲈᛷ r6 = r6.f3863
            boolean r6 = r6.m3781()
            if (r6 == 0) goto L6a
        L5b:
            int r6 = r3.f9729
            java.lang.Object r7 = r3.f9734
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r7
            ᲇᲁᛱᛱ r7 = r7.f333
            int r4 = r7.mo1935(r4)
            int r6 = r6 - r4
            r3.f9729 = r6
        L6a:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r1) goto L70
            r3.f9732 = r4
        L70:
            r3.f9730 = r4
            r8.m2396(r2, r9)
            int r0 = r0 + (-1)
            goto L6
        L78:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo177(java.lang.String r2) {
            r1 = this;
            ᲈᛵᛴᲇ r0 = r1.f323
            if (r0 != 0) goto Lb
            ᛱᛳᛶᛱ r1 = r1.f5691
            if (r1 == 0) goto Lb
            r1.m416(r2)
        Lb:
            return
    }

    @Override // defpackage.InterfaceC2256
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final android.graphics.PointF mo178(int r4) {
            r3 = this;
            int r0 = r3.m2393()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f330
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.m218()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f330
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r3 = 0
            return r3
        L24:
            int r3 = r3.f319
            r0 = 0
            if (r3 != 0) goto L2f
            float r3 = (float) r1
            r4.x = r3
            r4.y = r0
            return r4
        L2f:
            r4.x = r0
            float r3 = (float) r1
            r4.y = r3
            return r4
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛷᲇᛷᛶ */
    public final boolean mo179() {
            r0 = this;
            int r0 = r0.f322
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final int mo181(defpackage.C1000 r8) {
            r7 = this;
            int r0 = r7.m2393()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r7.f318
            r0 = r0 ^ 1
            android.view.View r3 = r7.m226(r0)
            android.view.View r4 = r7.m219(r0)
            boolean r6 = r7.f318
            ᲇᲁᛱᛱ r2 = r7.f333
            r5 = r7
            r1 = r8
            int r7 = defpackage.C0292.m941(r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: ᛸᛶᛵᲀ, reason: contains not printable characters */
    public final void m215(android.view.View r6, int r7, int r8) {
            r5 = this;
            ᛱᛳᛶᛱ r0 = r5.f5691
            android.graphics.Rect r1 = r5.f337
            if (r0 != 0) goto Lb
            r0 = 0
            r1.set(r0, r0, r0, r0)
            goto L12
        Lb:
            android.graphics.Rect r0 = r0.m461(r6)
            r1.set(r0)
        L12:
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            ᛱᲇᛲ r0 = (defpackage.C0193) r0
            int r2 = r0.leftMargin
            int r3 = r1.left
            int r2 = r2 + r3
            int r3 = r0.rightMargin
            int r4 = r1.right
            int r3 = r3 + r4
            int r7 = m198(r7, r2, r3)
            int r2 = r0.topMargin
            int r3 = r1.top
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r1 = r1.bottom
            int r3 = r3 + r1
            int r8 = m198(r8, r2, r3)
            boolean r5 = r5.m2394(r6, r7, r8, r0)
            if (r5 == 0) goto L3d
            r6.measure(r7, r8)
        L3d:
            return
    }

    /* JADX INFO: renamed from: ᲀᛲᲈᛵ, reason: contains not printable characters */
    public final void m216(int r11, int r12, int r13) {
            r10 = this;
            boolean r0 = r10.f330
            if (r0 == 0) goto L9
            int r0 = r10.m206()
            goto Ld
        L9:
            int r0 = r10.m218()
        Ld:
            r1 = 8
            if (r13 != r1) goto L1b
            if (r11 >= r12) goto L17
            int r2 = r12 + 1
        L15:
            r3 = r11
            goto L1e
        L17:
            int r2 = r11 + 1
            r3 = r12
            goto L1e
        L1b:
            int r2 = r11 + r12
            goto L15
        L1e:
            ᲁᛷᛵ r4 = r10.f321
            java.lang.Object r5 = r4.f8180
            int[] r5 = (int[]) r5
            r6 = 1
            if (r5 != 0) goto L29
            goto Laa
        L29:
            int r5 = r5.length
            if (r3 < r5) goto L2e
            goto Laa
        L2e:
            java.lang.Object r5 = r4.f8179
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r7 = -1
            if (r5 != 0) goto L37
        L35:
            r5 = r7
            goto L8d
        L37:
            int r5 = r5.size()
            int r5 = r5 - r6
        L3c:
            if (r5 < 0) goto L50
            java.lang.Object r8 = r4.f8179
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r5)
            ᛵᛶᲁᲇ r8 = (defpackage.C0917) r8
            int r9 = r8.f4159
            if (r9 != r3) goto L4d
            goto L51
        L4d:
            int r5 = r5 + (-1)
            goto L3c
        L50:
            r8 = 0
        L51:
            if (r8 == 0) goto L5a
            java.lang.Object r5 = r4.f8179
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.remove(r8)
        L5a:
            java.lang.Object r5 = r4.f8179
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            r8 = 0
        L63:
            if (r8 >= r5) goto L77
            java.lang.Object r9 = r4.f8179
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r9 = r9.get(r8)
            ᛵᛶᲁᲇ r9 = (defpackage.C0917) r9
            int r9 = r9.f4159
            if (r9 < r3) goto L74
            goto L78
        L74:
            int r8 = r8 + 1
            goto L63
        L77:
            r8 = r7
        L78:
            if (r8 == r7) goto L35
            java.lang.Object r5 = r4.f8179
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r8)
            ᛵᛶᲁᲇ r5 = (defpackage.C0917) r5
            java.lang.Object r9 = r4.f8179
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.remove(r8)
            int r5 = r5.f4159
        L8d:
            java.lang.Object r8 = r4.f8180
            int[] r8 = (int[]) r8
            if (r5 != r7) goto L9d
            int r5 = r8.length
            java.util.Arrays.fill(r8, r3, r5, r7)
            java.lang.Object r5 = r4.f8180
            int[] r5 = (int[]) r5
            int r5 = r5.length
            goto Laa
        L9d:
            int r5 = r5 + r6
            int r8 = r8.length
            int r5 = java.lang.Math.min(r5, r8)
            java.lang.Object r8 = r4.f8180
            int[] r8 = (int[]) r8
            java.util.Arrays.fill(r8, r3, r5, r7)
        Laa:
            if (r13 == r6) goto Lbd
            r5 = 2
            if (r13 == r5) goto Lb9
            if (r13 == r1) goto Lb2
            goto Lc0
        Lb2:
            r4.m3317(r11, r6)
            r4.m3313(r12, r6)
            goto Lc0
        Lb9:
            r4.m3317(r11, r12)
            goto Lc0
        Lbd:
            r4.m3313(r11, r12)
        Lc0:
            if (r2 > r0) goto Lc3
            goto Ld5
        Lc3:
            boolean r11 = r10.f330
            if (r11 == 0) goto Lcc
            int r11 = r10.m218()
            goto Ld0
        Lcc:
            int r11 = r10.m206()
        Ld0:
            if (r3 > r11) goto Ld5
            r10.m2383()
        Ld5:
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final int mo143(defpackage.C1000 r1) {
            r0 = this;
            int r0 = r0.m228(r1)
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᛴᲀ */
    public final int mo144(int r1, defpackage.C1633 r2, defpackage.C1000 r3) {
            r0 = this;
            int r0 = r0.m217(r1, r2, r3)
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᛵᛳᛵ */
    public final boolean mo145() {
            r0 = this;
            ᲈᛵᛴᲇ r0 = r0.f323
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᛷᛲᛴ */
    public final void mo146(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.m216(r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ᲀᛸᛴᛲ, reason: contains not printable characters */
    public final int m217(int r4, defpackage.C1633 r5, defpackage.C1000 r6) {
            r3 = this;
            int r0 = r3.m2393()
            r1 = 0
            if (r0 == 0) goto L2d
            if (r4 != 0) goto La
            goto L2d
        La:
            r3.m224(r4, r6)
            ᲈᛶᲁᛵ r0 = r3.f327
            int r6 = r3.m220(r5, r0, r6)
            int r2 = r0.f9617
            if (r2 >= r6) goto L18
            goto L1d
        L18:
            if (r4 >= 0) goto L1c
            int r4 = -r6
            goto L1d
        L1c:
            r4 = r6
        L1d:
            ᲇᲁᛱᛱ r6 = r3.f333
            int r2 = -r4
            r6.mo1940(r2)
            boolean r6 = r3.f330
            r3.f329 = r6
            r0.f9617 = r1
            r3.m209(r5, r0)
            return r4
        L2d:
            return r1
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᲀᛲᛸ */
    public final void mo185(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            super.mo185(r3)
            int r0 = r2.m2393()
            if (r0 <= 0) goto L2e
            r0 = 0
            android.view.View r1 = r2.m226(r0)
            android.view.View r2 = r2.m219(r0)
            if (r1 == 0) goto L2e
            if (r2 != 0) goto L17
            goto L2e
        L17:
            int r0 = defpackage.AbstractC1270.m2371(r1)
            int r2 = defpackage.AbstractC1270.m2371(r2)
            if (r0 >= r2) goto L28
            r3.setFromIndex(r0)
            r3.setToIndex(r2)
            return
        L28:
            r3.setFromIndex(r2)
            r3.setToIndex(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᛵᛸ, reason: contains not printable characters */
    public final int m218() {
            r2 = this;
            int r0 = r2.m2393()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r2 = r2.m2382(r1)
            int r2 = defpackage.AbstractC1270.m2371(r2)
            return r2
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᲀᲇᛴ */
    public final void mo147(int r2, int r3) {
            r1 = this;
            r0 = 2
            r1.m216(r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛶ, reason: contains not printable characters */
    public final android.view.View m219(boolean r9) {
            r8 = this;
            ᲇᲁᛱᛱ r0 = r8.f333
            int r1 = r0.mo1936()
            int r2 = r0.mo1933()
            int r3 = r8.m2393()
            int r3 = r3 + (-1)
            r4 = 0
        L11:
            if (r3 < 0) goto L31
            android.view.View r5 = r8.m2382(r3)
            int r6 = r0.mo1943(r5)
            int r7 = r0.mo1937(r5)
            if (r7 <= r1) goto L2e
            if (r6 < r2) goto L24
            goto L2e
        L24:
            if (r7 <= r2) goto L2d
            if (r9 != 0) goto L29
            goto L2d
        L29:
            if (r4 != 0) goto L2e
            r4 = r5
            goto L2e
        L2d:
            return r5
        L2e:
            int r3 = r3 + (-1)
            goto L11
        L31:
            return r4
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲀᲈᛵᛳ */
    public final void mo148(defpackage.C1000 r1) {
            r0 = this;
            r1 = -1
            r0.f334 = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f331 = r1
            r1 = 0
            r0.f323 = r1
            ᛸᲀᛲᛵ r0 = r0.f326
            r0.m2827()
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲁᛴᛵᛲ */
    public final int mo149(defpackage.C1633 r2, defpackage.C1000 r3) {
            r1 = this;
            int r2 = r1.f319
            r0 = 1
            if (r2 != r0) goto L10
            int r1 = r1.f335
            int r2 = r3.m1957()
            int r1 = java.lang.Math.min(r1, r2)
            return r1
        L10:
            r1 = -1
            return r1
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲁᛸᛴᛶ */
    public final void mo150(int r2, int r3) {
            r1 = this;
            r0 = 8
            r1.m216(r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ᲁᲀᛵᛳ, reason: contains not printable characters */
    public final int m220(defpackage.C1633 r25, defpackage.C2272 r26, defpackage.C1000 r27) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.util.BitSet r3 = r0.f336
            r4 = 0
            int r5 = r0.f335
            r6 = 1
            r3.set(r4, r5, r6)
            ᲈᛶᲁᛵ r7 = r0.f327
            boolean r8 = r7.f9612
            if (r8 == 0) goto L20
            int r8 = r2.f9613
            if (r8 != r6) goto L1d
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L2f
        L1d:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L2f
        L20:
            int r8 = r2.f9613
            if (r8 != r6) goto L2a
            int r11 = r2.f9619
            int r12 = r2.f9617
            int r11 = r11 + r12
            goto L2f
        L2a:
            int r11 = r2.f9618
            int r12 = r2.f9617
            int r11 = r11 - r12
        L2f:
            r12 = r4
        L30:
            ᲈᛸᛲᛵ[] r13 = r0.f332
            if (r12 >= r5) goto L49
            r14 = r13[r12]
            java.lang.Object r14 = r14.f9733
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L41
            goto L46
        L41:
            r13 = r13[r12]
            r0.m202(r13, r8, r11)
        L46:
            int r12 = r12 + 1
            goto L30
        L49:
            boolean r8 = r0.f330
            ᲇᲁᛱᛱ r12 = r0.f333
            if (r8 == 0) goto L54
            int r8 = r12.mo1933()
            goto L58
        L54:
            int r8 = r12.mo1936()
        L58:
            r14 = r4
        L59:
            int r15 = r2.f9615
            if (r15 < 0) goto L273
            int r9 = r27.m1957()
            if (r15 >= r9) goto L273
            boolean r9 = r7.f9612
            if (r9 != 0) goto L6d
            boolean r9 = r3.isEmpty()
            if (r9 != 0) goto L273
        L6d:
            int r9 = r2.f9615
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            ᲈᛸᲈᛷ r9 = r1.m3000(r14, r9)
            android.view.View r9 = r9.f9791
            int r14 = r2.f9615
            int r15 = r2.f9614
            int r14 = r14 + r15
            r2.f9615 = r14
            android.view.ViewGroup$LayoutParams r14 = r9.getLayoutParams()
            ᛱᲇᛲ r14 = (defpackage.C0193) r14
            ᲈᛸᲈᛷ r15 = r14.f3863
            int r15 = r15.m3782()
            ᲁᛷᛵ r4 = r0.f321
            java.lang.Object r6 = r4.f8180
            int[] r6 = (int[]) r6
            if (r6 == 0) goto L9d
            int r10 = r6.length
            if (r15 < r10) goto L99
            goto L9d
        L99:
            r6 = r6[r15]
        L9b:
            r10 = -1
            goto L9f
        L9d:
            r6 = -1
            goto L9b
        L9f:
            if (r6 != r10) goto L112
            int r6 = r2.f9613
            boolean r6 = r0.m210(r6)
            if (r6 == 0) goto Lb2
            int r6 = r5 + (-1)
            r18 = r5
            r19 = r6
            r5 = -1
            r10 = -1
            goto Lb7
        Lb2:
            r18 = r5
            r10 = 1
            r19 = 0
        Lb7:
            int r6 = r2.f9613
            r20 = 0
            r21 = r10
            r10 = 1
            if (r6 != r10) goto Le6
            int r6 = r12.mo1936()
            r22 = r13
            r10 = r19
            r13 = 2147483647(0x7fffffff, float:NaN)
        Lcb:
            if (r10 == r5) goto Le1
            r19 = r10
            r10 = r22[r19]
            r23 = r3
            int r3 = r10.m3735(r6)
            if (r3 >= r13) goto Ldc
            r13 = r3
            r20 = r10
        Ldc:
            int r10 = r19 + r21
            r3 = r23
            goto Lcb
        Le1:
            r23 = r3
        Le3:
            r3 = r20
            goto L106
        Le6:
            r23 = r3
            r22 = r13
            int r3 = r12.mo1933()
            r6 = r19
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        Lf2:
            if (r6 == r5) goto Le3
            r13 = r22[r6]
            r19 = r5
            int r5 = r13.m3733(r3)
            if (r5 <= r10) goto L101
            r10 = r5
            r20 = r13
        L101:
            int r6 = r6 + r21
            r5 = r19
            goto Lf2
        L106:
            r4.m3300(r15)
            java.lang.Object r4 = r4.f8180
            int[] r4 = (int[]) r4
            int r5 = r3.f9728
            r4[r15] = r5
            goto L11a
        L112:
            r23 = r3
            r18 = r5
            r22 = r13
            r3 = r22[r6]
        L11a:
            r14.f1260 = r3
            int r4 = r2.f9613
            r10 = 1
            if (r4 != r10) goto L127
            r4 = -1
            r5 = 0
            r0.m2399(r9, r4, r5)
            goto L12b
        L127:
            r5 = 0
            r0.m2399(r9, r5, r5)
        L12b:
            int r4 = r0.f319
            if (r4 != r10) goto L151
            int r6 = r0.f317
            int r13 = r0.f5681
            int r15 = r14.width
            int r6 = defpackage.AbstractC1270.m2373(r5, r6, r13, r5, r15)
            int r5 = r0.f5683
            int r13 = r0.f5685
            int r15 = r0.m2402()
            int r17 = r0.m2397()
            int r15 = r17 + r15
            int r1 = r14.height
            int r1 = defpackage.AbstractC1270.m2373(r10, r5, r13, r15, r1)
            r0.m215(r9, r6, r1)
            goto L172
        L151:
            int r1 = r0.f5690
            int r5 = r0.f5681
            int r6 = r0.m2380()
            int r13 = r0.m2389()
            int r13 = r13 + r6
            int r6 = r14.width
            int r1 = defpackage.AbstractC1270.m2373(r10, r1, r5, r13, r6)
            int r5 = r0.f317
            int r6 = r0.f5685
            int r13 = r14.height
            r15 = 0
            int r5 = defpackage.AbstractC1270.m2373(r15, r5, r6, r15, r13)
            r0.m215(r9, r1, r5)
        L172:
            int r1 = r2.f9613
            if (r1 != r10) goto L180
            int r1 = r3.m3735(r8)
            int r5 = r12.mo1935(r9)
            int r5 = r5 + r1
            goto L18a
        L180:
            int r5 = r3.m3733(r8)
            int r1 = r12.mo1935(r9)
            int r1 = r5 - r1
        L18a:
            int r6 = r2.f9613
            ᲈᛸᛲᛵ r13 = r14.f1260
            if (r6 != r10) goto L1d0
            r13.getClass()
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            ᛱᲇᛲ r6 = (defpackage.C0193) r6
            r6.f1260 = r13
            java.lang.Object r14 = r13.f9733
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            r14.add(r9)
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r13.f9730 = r15
            int r14 = r14.size()
            if (r14 != r10) goto L1ae
            r13.f9732 = r15
        L1ae:
            ᲈᛸᲈᛷ r10 = r6.f3863
            boolean r10 = r10.m3785()
            if (r10 != 0) goto L1be
            ᲈᛸᲈᛷ r6 = r6.f3863
            boolean r6 = r6.m3781()
            if (r6 == 0) goto L1cd
        L1be:
            int r6 = r13.f9729
            java.lang.Object r10 = r13.f9734
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r10
            ᲇᲁᛱᛱ r10 = r10.f333
            int r10 = r10.mo1935(r9)
            int r10 = r10 + r6
            r13.f9729 = r10
        L1cd:
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L20f
        L1d0:
            r13.getClass()
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            ᛱᲇᛲ r6 = (defpackage.C0193) r6
            r6.f1260 = r13
            java.lang.Object r10 = r13.f9733
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r15 = 0
            r10.add(r15, r9)
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r13.f9732 = r15
            int r10 = r10.size()
            r14 = 1
            if (r10 != r14) goto L1f0
            r13.f9730 = r15
        L1f0:
            ᲈᛸᲈᛷ r10 = r6.f3863
            boolean r10 = r10.m3785()
            if (r10 != 0) goto L200
            ᲈᛸᲈᛷ r6 = r6.f3863
            boolean r6 = r6.m3781()
            if (r6 == 0) goto L20f
        L200:
            int r6 = r13.f9729
            java.lang.Object r10 = r13.f9734
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r10
            ᲇᲁᛱᛱ r10 = r10.f333
            int r10 = r10.mo1935(r9)
            int r10 = r10 + r6
            r13.f9729 = r10
        L20f:
            boolean r6 = r0.m223()
            ᲇᲁᛱᛱ r10 = r0.f320
            if (r6 == 0) goto L22f
            r14 = 1
            if (r4 != r14) goto L22f
            int r6 = r10.mo1933()
            int r13 = r18 + (-1)
            int r14 = r3.f9728
            int r13 = r13 - r14
            int r14 = r0.f317
            int r13 = r13 * r14
            int r6 = r6 - r13
            int r10 = r10.mo1935(r9)
            int r10 = r6 - r10
        L22d:
            r14 = 1
            goto L242
        L22f:
            int r6 = r3.f9728
            int r13 = r0.f317
            int r6 = r6 * r13
            int r13 = r10.mo1936()
            int r6 = r6 + r13
            int r10 = r10.mo1935(r9)
            int r10 = r10 + r6
            r14 = r10
            r10 = r6
            r6 = r14
            goto L22d
        L242:
            if (r4 != r14) goto L248
            defpackage.AbstractC1270.m2372(r9, r10, r1, r6, r5)
            goto L24b
        L248:
            defpackage.AbstractC1270.m2372(r9, r1, r10, r5, r6)
        L24b:
            int r1 = r7.f9613
            r0.m202(r3, r1, r11)
            r1 = r25
            r0.m209(r1, r7)
            boolean r4 = r7.f9611
            if (r4 == 0) goto L268
            boolean r4 = r9.hasFocusable()
            if (r4 == 0) goto L268
            int r3 = r3.f9728
            r4 = r23
            r5 = 0
            r4.set(r3, r5)
            goto L26a
        L268:
            r4 = r23
        L26a:
            r3 = r4
            r6 = r14
            r5 = r18
            r13 = r22
            r4 = 0
            goto L59
        L273:
            if (r14 != 0) goto L278
            r0.m209(r1, r7)
        L278:
            int r1 = r7.f9613
            r4 = -1
            if (r1 != r4) goto L28b
            int r1 = r12.mo1936()
            int r0 = r0.m205(r1)
            int r1 = r12.mo1936()
            int r1 = r1 - r0
            goto L299
        L28b:
            int r1 = r12.mo1933()
            int r0 = r0.m199(r1)
            int r1 = r12.mo1933()
            int r1 = r0 - r1
        L299:
            if (r1 <= 0) goto L2a2
            int r0 = r2.f9617
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L2a2:
            r16 = 0
            return r16
    }

    /* JADX INFO: renamed from: ᲁᲇᛱᲈ, reason: contains not printable characters */
    public final void m221(int r4) {
            r3 = this;
            ᲈᛶᲁᛵ r0 = r3.f327
            r0.f9613 = r4
            boolean r3 = r3.f330
            r1 = 1
            r2 = -1
            if (r4 != r2) goto Lc
            r4 = r1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            if (r3 != r4) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            r0.f9614 = r1
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲇᛱᛸᲇ */
    public final defpackage.C0840 mo151() {
            r2 = this;
            int r2 = r2.f319
            r0 = -1
            r1 = -2
            if (r2 != 0) goto Lc
            ᛱᲇᛲ r2 = new ᛱᲇᛲ
            r2.<init>(r1, r0)
            return r2
        Lc:
            ᛱᲇᛲ r2 = new ᛱᲇᛲ
            r2.<init>(r0, r1)
            return r2
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲇᛲᛷᛳ */
    public final void mo152(android.graphics.Rect r6, int r7, int r8) {
            r5 = this;
            int r0 = r5.m2380()
            int r1 = r5.m2389()
            int r1 = r1 + r0
            int r0 = r5.m2402()
            int r2 = r5.m2397()
            int r2 = r2 + r0
            int r0 = r5.f319
            r3 = 1
            int r4 = r5.f335
            if (r0 != r3) goto L39
            int r6 = r6.height()
            int r6 = r6 + r2
            ᛱᛳᛶᛱ r0 = r5.f5691
            java.util.WeakHashMap r2 = defpackage.AbstractC0858.f3911
            int r0 = r0.getMinimumHeight()
            int r6 = defpackage.AbstractC1270.m2378(r8, r6, r0)
            int r8 = r5.f317
            int r8 = r8 * r4
            int r8 = r8 + r1
            ᛱᛳᛶᛱ r0 = r5.f5691
            int r0 = r0.getMinimumWidth()
            int r7 = defpackage.AbstractC1270.m2378(r7, r8, r0)
            goto L58
        L39:
            int r6 = r6.width()
            int r6 = r6 + r1
            ᛱᛳᛶᛱ r0 = r5.f5691
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            int r0 = r0.getMinimumWidth()
            int r7 = defpackage.AbstractC1270.m2378(r7, r6, r0)
            int r6 = r5.f317
            int r6 = r6 * r4
            int r6 = r6 + r2
            ᛱᛳᛶᛱ r0 = r5.f5691
            int r0 = r0.getMinimumHeight()
            int r6 = defpackage.AbstractC1270.m2378(r8, r6, r0)
        L58:
            ᛱᛳᛶᛱ r5 = r5.f5691
            defpackage.C0055.m408(r5, r7, r6)
            return
    }

    /* JADX INFO: renamed from: ᲇᛳᛸᲈ, reason: contains not printable characters */
    public final void m222(int r6, defpackage.C1000 r7) {
            r5 = this;
            ᲈᛶᲁᛵ r0 = r5.f327
            r1 = 0
            r0.f9617 = r1
            r0.f9615 = r6
            ᛱᛶᛲ r2 = r5.f5684
            ᲇᲁᛱᛱ r3 = r5.f333
            r4 = 1
            if (r2 == 0) goto L2d
            boolean r2 = r2.f944
            if (r2 == 0) goto L2d
            int r7 = r7.f4453
            r2 = -1
            if (r7 == r2) goto L2d
            boolean r2 = r5.f330
            if (r7 >= r6) goto L1d
            r6 = r4
            goto L1e
        L1d:
            r6 = r1
        L1e:
            if (r2 != r6) goto L26
            int r6 = r3.mo1939()
            r7 = r1
            goto L2f
        L26:
            int r6 = r3.mo1939()
            r7 = r6
            r6 = r1
            goto L2f
        L2d:
            r6 = r1
            r7 = r6
        L2f:
            ᛱᛳᛶᛱ r5 = r5.f5691
            if (r5 == 0) goto L46
            boolean r5 = r5.f660
            if (r5 == 0) goto L46
            int r5 = r3.mo1936()
            int r5 = r5 - r7
            r0.f9618 = r5
            int r5 = r3.mo1933()
            int r5 = r5 + r6
            r0.f9619 = r5
            goto L50
        L46:
            int r5 = r3.mo1930()
            int r5 = r5 + r6
            r0.f9619 = r5
            int r5 = -r7
            r0.f9618 = r5
        L50:
            r0.f9611 = r1
            r0.f9616 = r4
            int r5 = r3.mo1931()
            if (r5 != 0) goto L61
            int r5 = r3.mo1930()
            if (r5 != 0) goto L61
            r1 = r4
        L61:
            r0.f9612 = r1
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᲀᛸ, reason: contains not printable characters */
    public final boolean m223() {
            r1 = this;
            ᛱᛳᛶᛱ r1 = r1.f5691
            int r1 = r1.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto La
            return r0
        La:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᛵᛲ, reason: contains not printable characters */
    public final void m224(int r5, defpackage.C1000 r6) {
            r4 = this;
            r0 = 1
            if (r5 <= 0) goto L9
            int r1 = r4.m206()
            r2 = r0
            goto Le
        L9:
            int r1 = r4.m218()
            r2 = -1
        Le:
            ᲈᛶᲁᛵ r3 = r4.f327
            r3.f9616 = r0
            r4.m222(r1, r6)
            r4.m221(r2)
            int r4 = r3.f9614
            int r1 = r1 + r4
            r3.f9615 = r1
            int r4 = java.lang.Math.abs(r5)
            r3.f9617 = r4
            return
    }

    @Override // defpackage.AbstractC1270
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final boolean mo155(defpackage.C0840 r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.C0193
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛱᲀᛴ, reason: contains not printable characters */
    public final void m225() {
            r2 = this;
            int r0 = r2.f319
            r1 = 1
            if (r0 == r1) goto L12
            boolean r0 = r2.m223()
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r2.f328
            r0 = r0 ^ r1
            r2.f330 = r0
            return
        L12:
            boolean r0 = r2.f328
            r2.f330 = r0
            return
    }

    /* JADX INFO: renamed from: ᲈᛳᛳ, reason: contains not printable characters */
    public final android.view.View m226(boolean r10) {
            r9 = this;
            ᲇᲁᛱᛱ r0 = r9.f333
            int r1 = r0.mo1936()
            int r2 = r0.mo1933()
            int r3 = r9.m2393()
            r4 = 0
            r5 = 0
        L10:
            if (r5 >= r3) goto L30
            android.view.View r6 = r9.m2382(r5)
            int r7 = r0.mo1943(r6)
            int r8 = r0.mo1937(r6)
            if (r8 <= r1) goto L2d
            if (r7 < r2) goto L23
            goto L2d
        L23:
            if (r7 >= r1) goto L2c
            if (r10 != 0) goto L28
            goto L2c
        L28:
            if (r4 != 0) goto L2d
            r4 = r6
            goto L2d
        L2c:
            return r6
        L2d:
            int r5 = r5 + 1
            goto L10
        L30:
            return r4
    }

    /* JADX INFO: renamed from: ᲈᲈᛱᛴ, reason: contains not printable characters */
    public final void m227(defpackage.C1633 r18, defpackage.C1000 r19, boolean r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            ᲈᛵᛴᲇ r3 = r0.f323
            r4 = -1
            ᛸᲀᛲᛵ r5 = r0.f326
            if (r3 != 0) goto L11
            int r3 = r0.f334
            if (r3 == r4) goto L1e
        L11:
            int r3 = r2.m1957()
            if (r3 != 0) goto L1e
            r17.m2398(r18)
            r5.m2827()
            return
        L1e:
            boolean r3 = r5.f6881
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = r5.f6887
            r7 = 0
            if (r3 == 0) goto L30
            int r3 = r0.f334
            if (r3 != r4) goto L30
            ᲈᛵᛴᲇ r3 = r0.f323
            if (r3 == 0) goto L2e
            goto L30
        L2e:
            r3 = r7
            goto L31
        L30:
            r3 = 1
        L31:
            ᲈᛸᛲᛵ[] r9 = r0.f332
            int r10 = r0.f335
            ᲁᛷᛵ r11 = r0.f321
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L204
            r5.m2827()
            ᲈᛵᛴᲇ r13 = r0.f323
            ᲇᲁᛱᛱ r14 = r0.f333
            if (r13 == 0) goto Lbf
            int r15 = r13.f9542
            r8 = 0
            if (r15 <= 0) goto L82
            if (r15 != r10) goto L74
            r13 = r7
        L4c:
            if (r13 >= r10) goto L82
            r15 = r9[r13]
            r15.m3740()
            ᲈᛵᛴᲇ r15 = r0.f323
            int[] r4 = r15.f9546
            r4 = r4[r13]
            if (r4 == r12) goto L6a
            boolean r15 = r15.f9539
            if (r15 == 0) goto L65
            int r15 = r14.mo1933()
        L63:
            int r4 = r4 + r15
            goto L6a
        L65:
            int r15 = r14.mo1936()
            goto L63
        L6a:
            r15 = r9[r13]
            r15.f9732 = r4
            r15.f9730 = r4
            int r13 = r13 + 1
            r4 = -1
            goto L4c
        L74:
            r13.f9546 = r8
            r13.f9542 = r7
            r13.f9547 = r7
            r13.f9538 = r8
            r13.f9541 = r8
            int r4 = r13.f9543
            r13.f9544 = r4
        L82:
            ᲈᛵᛴᲇ r4 = r0.f323
            boolean r13 = r4.f9540
            r0.f316 = r13
            boolean r4 = r4.f9545
            r0.mo177(r8)
            ᲈᛵᛴᲇ r8 = r0.f323
            if (r8 == 0) goto L97
            boolean r13 = r8.f9545
            if (r13 == r4) goto L97
            r8.f9545 = r4
        L97:
            r0.f328 = r4
            r0.m2383()
            r0.m225()
            ᲈᛵᛴᲇ r4 = r0.f323
            int r8 = r4.f9544
            r13 = -1
            if (r8 == r13) goto Lad
            r0.f334 = r8
            boolean r8 = r4.f9539
            r5.f6883 = r8
            goto Lb1
        Lad:
            boolean r8 = r0.f330
            r5.f6883 = r8
        Lb1:
            int r8 = r4.f9547
            r13 = 1
            if (r8 <= r13) goto Lc6
            int[] r8 = r4.f9538
            r11.f8180 = r8
            java.util.ArrayList r4 = r4.f9541
            r11.f8179 = r4
            goto Lc6
        Lbf:
            r0.m225()
            boolean r4 = r0.f330
            r5.f6883 = r4
        Lc6:
            boolean r4 = r2.f4458
            if (r4 != 0) goto L1bc
            int r4 = r0.f334
            r13 = -1
            if (r4 != r13) goto Ld1
            goto L1bc
        Ld1:
            if (r4 < 0) goto L1b8
            int r8 = r2.m1957()
            if (r4 < r8) goto Ldb
            goto L1b8
        Ldb:
            ᲈᛵᛴᲇ r4 = r0.f323
            if (r4 == 0) goto Lf2
            int r8 = r4.f9544
            if (r8 == r13) goto Lf2
            int r4 = r4.f9542
            r13 = 1
            if (r4 >= r13) goto Le9
            goto Lf2
        Le9:
            r5.f6885 = r12
            int r4 = r0.f334
            r5.f6884 = r4
        Lef:
            r13 = 1
            goto L202
        Lf2:
            int r4 = r0.f334
            android.view.View r4 = r0.mo191(r4)
            if (r4 == 0) goto L169
            boolean r8 = r0.f330
            if (r8 == 0) goto L103
            int r8 = r0.m206()
            goto L107
        L103:
            int r8 = r0.m218()
        L107:
            r5.f6884 = r8
            int r8 = r0.f331
            if (r8 == r12) goto L12f
            boolean r8 = r5.f6883
            if (r8 == 0) goto L120
            int r8 = r14.mo1933()
            int r13 = r0.f331
            int r8 = r8 - r13
            int r4 = r14.mo1937(r4)
            int r8 = r8 - r4
            r5.f6885 = r8
            goto Lef
        L120:
            int r8 = r14.mo1936()
            int r13 = r0.f331
            int r8 = r8 + r13
            int r4 = r14.mo1943(r4)
            int r8 = r8 - r4
            r5.f6885 = r8
            goto Lef
        L12f:
            int r8 = r14.mo1935(r4)
            int r13 = r14.mo1939()
            if (r8 <= r13) goto L149
            boolean r4 = r5.f6883
            if (r4 == 0) goto L142
            int r4 = r14.mo1933()
            goto L146
        L142:
            int r4 = r14.mo1936()
        L146:
            r5.f6885 = r4
            goto Lef
        L149:
            int r8 = r14.mo1943(r4)
            int r13 = r14.mo1936()
            int r8 = r8 - r13
            if (r8 >= 0) goto L158
            int r4 = -r8
            r5.f6885 = r4
            goto Lef
        L158:
            int r8 = r14.mo1933()
            int r4 = r14.mo1937(r4)
            int r8 = r8 - r4
            if (r8 >= 0) goto L166
            r5.f6885 = r8
            goto Lef
        L166:
            r5.f6885 = r12
            goto Lef
        L169:
            int r4 = r0.f334
            r5.f6884 = r4
            int r8 = r0.f331
            if (r8 != r12) goto L19f
            int r8 = r0.m2393()
            if (r8 != 0) goto L17c
            boolean r4 = r0.f330
            if (r4 == 0) goto L189
            goto L18b
        L17c:
            int r8 = r0.m218()
            if (r4 >= r8) goto L184
            r4 = 1
            goto L185
        L184:
            r4 = r7
        L185:
            boolean r8 = r0.f330
            if (r4 == r8) goto L18b
        L189:
            r4 = r7
            goto L18c
        L18b:
            r4 = 1
        L18c:
            r5.f6883 = r4
            ᲇᲁᛱᛱ r8 = r6.f333
            if (r4 == 0) goto L197
            int r4 = r8.mo1933()
            goto L19b
        L197:
            int r4 = r8.mo1936()
        L19b:
            r5.f6885 = r4
        L19d:
            r13 = 1
            goto L1b5
        L19f:
            boolean r4 = r5.f6883
            ᲇᲁᛱᛱ r13 = r6.f333
            if (r4 == 0) goto L1ad
            int r4 = r13.mo1933()
            int r4 = r4 - r8
            r5.f6885 = r4
            goto L19d
        L1ad:
            int r4 = r13.mo1936()
            int r4 = r4 + r8
            r5.f6885 = r4
            goto L19d
        L1b5:
            r5.f6882 = r13
            goto L202
        L1b8:
            r0.f334 = r13
            r0.f331 = r12
        L1bc:
            boolean r4 = r0.f329
            if (r4 == 0) goto L1e0
            int r4 = r2.m1957()
            int r8 = r0.m2393()
            r16 = 1
            int r8 = r8 + (-1)
        L1cc:
            if (r8 < 0) goto L1de
            android.view.View r13 = r0.m2382(r8)
            int r13 = defpackage.AbstractC1270.m2371(r13)
            if (r13 < 0) goto L1db
            if (r13 >= r4) goto L1db
            goto L1fc
        L1db:
            int r8 = r8 + (-1)
            goto L1cc
        L1de:
            r13 = r7
            goto L1fc
        L1e0:
            int r4 = r2.m1957()
            int r8 = r0.m2393()
            r13 = r7
        L1e9:
            if (r13 >= r8) goto L1de
            android.view.View r14 = r0.m2382(r13)
            int r14 = defpackage.AbstractC1270.m2371(r14)
            if (r14 < 0) goto L1f9
            if (r14 >= r4) goto L1f9
            r13 = r14
            goto L1fc
        L1f9:
            int r13 = r13 + 1
            goto L1e9
        L1fc:
            r5.f6884 = r13
            r5.f6885 = r12
            goto Lef
        L202:
            r5.f6881 = r13
        L204:
            ᲈᛵᛴᲇ r4 = r0.f323
            if (r4 != 0) goto L21c
            int r4 = r0.f334
            r13 = -1
            if (r4 != r13) goto L21c
            boolean r4 = r5.f6883
            boolean r8 = r0.f329
            if (r4 != r8) goto L21e
            boolean r4 = r0.m223()
            boolean r8 = r0.f316
            if (r4 == r8) goto L21c
            goto L21e
        L21c:
            r13 = 1
            goto L224
        L21e:
            r11.m3307()
            r13 = 1
            r5.f6882 = r13
        L224:
            int r4 = r0.m2393()
            if (r4 <= 0) goto L2c1
            ᲈᛵᛴᲇ r4 = r0.f323
            if (r4 == 0) goto L232
            int r4 = r4.f9542
            if (r4 >= r13) goto L2c1
        L232:
            boolean r4 = r5.f6882
            if (r4 == 0) goto L24b
            r3 = r7
        L237:
            if (r3 >= r10) goto L2c1
            r4 = r9[r3]
            r4.m3740()
            int r4 = r5.f6885
            if (r4 == r12) goto L248
            r6 = r9[r3]
            r6.f9732 = r4
            r6.f9730 = r4
        L248:
            int r3 = r3 + 1
            goto L237
        L24b:
            if (r3 != 0) goto L265
            int[] r3 = r5.f6886
            if (r3 != 0) goto L252
            goto L265
        L252:
            r3 = r7
        L253:
            if (r3 >= r10) goto L2c1
            r4 = r9[r3]
            r4.m3740()
            int[] r6 = r5.f6886
            r6 = r6[r3]
            r4.f9732 = r6
            r4.f9730 = r6
            int r3 = r3 + 1
            goto L253
        L265:
            r3 = r7
        L266:
            if (r3 >= r10) goto L2a2
            r4 = r9[r3]
            boolean r8 = r0.f330
            int r11 = r5.f6885
            java.lang.Object r13 = r4.f9734
            androidx.recyclerview.widget.StaggeredGridLayoutManager r13 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r13
            if (r8 == 0) goto L279
            int r14 = r4.m3735(r12)
            goto L27d
        L279:
            int r14 = r4.m3733(r12)
        L27d:
            r4.m3740()
            if (r14 != r12) goto L283
            goto L29f
        L283:
            if (r8 == 0) goto L28d
            ᲇᲁᛱᛱ r15 = r13.f333
            int r15 = r15.mo1933()
            if (r14 < r15) goto L29f
        L28d:
            if (r8 != 0) goto L298
            ᲇᲁᛱᛱ r8 = r13.f333
            int r8 = r8.mo1936()
            if (r14 <= r8) goto L298
            goto L29f
        L298:
            if (r11 == r12) goto L29b
            int r14 = r14 + r11
        L29b:
            r4.f9730 = r14
            r4.f9732 = r14
        L29f:
            int r3 = r3 + 1
            goto L266
        L2a2:
            int r3 = r9.length
            int[] r4 = r5.f6886
            if (r4 == 0) goto L2aa
            int r4 = r4.length
            if (r4 >= r3) goto L2b1
        L2aa:
            ᲈᛸᛲᛵ[] r4 = r6.f332
            int r4 = r4.length
            int[] r4 = new int[r4]
            r5.f6886 = r4
        L2b1:
            r4 = r7
        L2b2:
            if (r4 >= r3) goto L2c1
            int[] r6 = r5.f6886
            r8 = r9[r4]
            int r8 = r8.m3733(r12)
            r6[r4] = r8
            int r4 = r4 + 1
            goto L2b2
        L2c1:
            r17.m2400(r18)
            ᲈᛶᲁᛵ r3 = r0.f327
            r3.f9616 = r7
            ᲇᲁᛱᛱ r4 = r0.f320
            int r6 = r4.mo1939()
            int r8 = r6 / r10
            r0.f317 = r8
            int r8 = r4.mo1931()
            android.view.View.MeasureSpec.makeMeasureSpec(r6, r8)
            int r6 = r5.f6884
            r0.m222(r6, r2)
            boolean r6 = r5.f6883
            if (r6 == 0) goto L2f8
            r13 = -1
            r0.m221(r13)
            r0.m220(r1, r3, r2)
            r6 = 1
            r0.m221(r6)
            int r8 = r5.f6884
            int r9 = r3.f9614
            int r8 = r8 + r9
            r3.f9615 = r8
            r0.m220(r1, r3, r2)
            goto L30d
        L2f8:
            r6 = 1
            r13 = -1
            r0.m221(r6)
            r0.m220(r1, r3, r2)
            r0.m221(r13)
            int r6 = r5.f6884
            int r8 = r3.f9614
            int r6 = r6 + r8
            r3.f9615 = r6
            r0.m220(r1, r3, r2)
        L30d:
            int r3 = r4.mo1931()
            r6 = 1073741824(0x40000000, float:2.0)
            if (r3 != r6) goto L317
            goto L3a6
        L317:
            int r3 = r0.m2393()
            r6 = 0
            r8 = r7
        L31d:
            if (r8 >= r3) goto L33d
            android.view.View r9 = r0.m2382(r8)
            int r11 = r4.mo1935(r9)
            float r11 = (float) r11
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 >= 0) goto L32d
            goto L33a
        L32d:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            ᛱᲇᛲ r9 = (defpackage.C0193) r9
            r9.getClass()
            float r6 = java.lang.Math.max(r6, r11)
        L33a:
            int r8 = r8 + 1
            goto L31d
        L33d:
            int r8 = r0.f317
            float r9 = (float) r10
            float r6 = r6 * r9
            int r6 = java.lang.Math.round(r6)
            int r9 = r4.mo1931()
            if (r9 != r12) goto L353
            int r9 = r4.mo1939()
            int r6 = java.lang.Math.min(r6, r9)
        L353:
            int r9 = r6 / r10
            r0.f317 = r9
            int r4 = r4.mo1931()
            android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            int r4 = r0.f317
            if (r4 != r8) goto L363
            goto L3a6
        L363:
            r4 = r7
        L364:
            if (r4 >= r3) goto L3a6
            android.view.View r6 = r0.m2382(r4)
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            ᛱᲇᛲ r9 = (defpackage.C0193) r9
            r9.getClass()
            boolean r11 = r0.m223()
            int r12 = r0.f319
            if (r11 == 0) goto L38f
            r13 = 1
            if (r12 != r13) goto L38f
            int r11 = r10 + (-1)
            ᲈᛸᛲᛵ r9 = r9.f1260
            int r9 = r9.f9728
            int r11 = r11 - r9
            int r9 = -r11
            int r11 = r0.f317
            int r11 = r11 * r9
            int r9 = r9 * r8
            int r11 = r11 - r9
            r6.offsetLeftAndRight(r11)
            goto L3a3
        L38f:
            ᲈᛸᛲᛵ r9 = r9.f1260
            int r9 = r9.f9728
            int r11 = r0.f317
            int r11 = r11 * r9
            int r9 = r9 * r8
            r13 = 1
            if (r12 != r13) goto L39f
            int r11 = r11 - r9
            r6.offsetLeftAndRight(r11)
            goto L3a3
        L39f:
            int r11 = r11 - r9
            r6.offsetTopAndBottom(r11)
        L3a3:
            int r4 = r4 + 1
            goto L364
        L3a6:
            int r3 = r0.m2393()
            if (r3 <= 0) goto L3c0
            boolean r3 = r0.f330
            if (r3 == 0) goto L3b8
            r13 = 1
            r0.m207(r1, r2, r13)
            r0.m200(r1, r2, r7)
            goto L3c1
        L3b8:
            r13 = 1
            r0.m200(r1, r2, r13)
            r0.m207(r1, r2, r7)
            goto L3c1
        L3c0:
            r13 = 1
        L3c1:
            if (r20 == 0) goto L3e8
            boolean r3 = r2.f4458
            if (r3 != 0) goto L3e8
            int r3 = r0.f322
            if (r3 == 0) goto L3e8
            int r3 = r0.m2393()
            if (r3 <= 0) goto L3e8
            android.view.View r3 = r0.m213()
            if (r3 == 0) goto L3e8
            ᛱᛳᛶᛱ r3 = r0.f5691
            if (r3 == 0) goto L3e0
            ᛳᛳᛵᛲ r4 = r0.f324
            r3.removeCallbacks(r4)
        L3e0:
            boolean r3 = r0.m211()
            if (r3 == 0) goto L3e8
            r8 = r13
            goto L3e9
        L3e8:
            r8 = r7
        L3e9:
            boolean r3 = r2.f4458
            if (r3 == 0) goto L3f0
            r5.m2827()
        L3f0:
            boolean r3 = r5.f6883
            r0.f329 = r3
            boolean r3 = r0.m223()
            r0.f316 = r3
            if (r8 == 0) goto L402
            r5.m2827()
            r0.m227(r1, r2, r7)
        L402:
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛵᛱ, reason: contains not printable characters */
    public final int m228(defpackage.C1000 r9) {
            r8 = this;
            int r0 = r8.m2393()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            boolean r0 = r8.f318
            r0 = r0 ^ 1
            android.view.View r3 = r8.m226(r0)
            android.view.View r4 = r8.m219(r0)
            boolean r6 = r8.f318
            boolean r7 = r8.f330
            ᲇᲁᛱᛱ r2 = r8.f333
            r5 = r8
            r1 = r9
            int r8 = defpackage.C0292.m949(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }
}
