package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* JADX INFO: renamed from: ψ */
    public static final java.util.Set f1105 = null;

    /* JADX INFO: renamed from: τ */
    public final int f1106;

    /* JADX INFO: renamed from: υ */
    public int[] f1107;

    /* JADX INFO: renamed from: φ */
    public android.view.View[] f1108;

    /* JADX INFO: renamed from: χ */
    public final p000.C0568n f1109;

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
            androidx.recyclerview.widget.GridLayoutManager.f1105 = r0
            return
    }

    public GridLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>(r3, r4, r5, r6)
            r0 = -1
            r2.f1106 = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            n r0 = new n
            r1 = 20
            r0.<init>(r1)
            r2.f1109 = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            as0 r3 = p000.zl1.m7164(r3, r4, r5, r6)
            int r3 = r3.f1294
            int r4 = r2.f1106
            if (r3 != r4) goto L29
            return
        L29:
            r4 = 1
            if (r3 < r4) goto L39
            r2.f1106 = r3
            java.lang.Object r3 = r0.f7336
            android.util.SparseIntArray r3 = (android.util.SparseIntArray) r3
            r3.clear()
            r2.m7171()
            return
        L39:
            java.lang.String r2 = "Span count should be at least 1. Provided "
            java.lang.String r2 = p000.a12.m17(r2, r3)
            p000.C1080.m7275(r2)
            r2 = 0
            throw r2
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Β */
    public final int mo465(p000.fm1 r4, p000.km1 r5) {
            r3 = this;
            int r0 = r3.f1110
            r1 = 0
            if (r0 != 0) goto L13
            androidx.recyclerview.widget.RecyclerView r4 = r3.f13153
            if (r4 == 0) goto Lc
            r4.getAdapter()
        Lc:
            int r3 = r3.f1106
            int r3 = java.lang.Math.min(r3, r1)
            return r3
        L13:
            int r0 = r5.m3336()
            r2 = 1
            if (r0 >= r2) goto L1b
            return r1
        L1b:
            int r0 = r5.m3336()
            int r0 = r0 - r2
            int r3 = r3.m481(r0, r4, r5)
            int r3 = r3 + r2
            return r3
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.zl1
    /* JADX INFO: renamed from: Λ */
    public final void mo466(p000.fm1 r1, p000.km1 r2, p000.C1128 r3) {
            r0 = this;
            super.mo466(r1, r2, r3)
            java.lang.Class<android.widget.GridView> r1 = android.widget.GridView.class
            java.lang.String r1 = r1.getName()
            r3.m7358(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r0.f13153
            r0.getClass()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.zl1
    /* JADX INFO: renamed from: Ξ */
    public final boolean mo467(int r5, android.os.Bundle r6) {
            r4 = this;
            ч r0 = p000.C1125.f13475
            java.lang.Object r0 = r0.f13476
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r0
            int r0 = r0.getId()
            r1 = 0
            r2 = 0
            r3 = -1
            if (r5 != r0) goto L4c
            if (r5 == r3) goto L4c
            r5 = r2
        L12:
            int r0 = r4.m7175()
            if (r5 >= r0) goto L2d
            android.view.View r0 = r4.m7174(r5)
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.isAccessibilityFocused()
            if (r0 == 0) goto L2a
            android.view.View r1 = r4.m7174(r5)
            goto L2d
        L2a:
            int r5 = r5 + 1
            goto L12
        L2d:
            if (r1 != 0) goto L30
            goto L6a
        L30:
            if (r6 != 0) goto L33
            goto L6a
        L33:
            java.lang.String r5 = "android.view.accessibility.action.ARGUMENT_DIRECTION_INT"
            int r5 = r6.getInt(r5, r3)
            java.util.Set r6 = androidx.recyclerview.widget.GridLayoutManager.f1105
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L46
            goto L6a
        L46:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f13153
            r4.m532(r1)
            return r2
        L4c:
            r0 = 16908343(0x1020037, float:2.3877383E-38)
            if (r5 != r0) goto L6b
            if (r6 == 0) goto L6b
            java.lang.String r5 = "android.view.accessibility.action.ARGUMENT_ROW_INT"
            int r5 = r6.getInt(r5, r3)
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT"
            int r6 = r6.getInt(r0, r3)
            if (r5 == r3) goto L6a
            if (r6 != r3) goto L64
            goto L6a
        L64:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f13153
            r4.getClass()
            throw r1
        L6a:
            return r2
        L6b:
            boolean r4 = super.mo467(r5, r6)
            return r4
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.zl1
    /* JADX INFO: renamed from: Τ */
    public final int mo468(int r1, p000.fm1 r2, p000.km1 r3) {
            r0 = this;
            r0.m482()
            r0.m480()
            super.mo468(r1, r2, r3)
            r0 = 0
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.zl1
    /* JADX INFO: renamed from: Φ */
    public final int mo469(int r1, p000.fm1 r2, p000.km1 r3) {
            r0 = this;
            r0.m482()
            r0.m480()
            super.mo469(r1, r2, r3)
            r0 = 0
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: ε */
    public final boolean mo470(p000.am1 r1) {
            r0 = this;
            boolean r0 = r1 instanceof p000.cb0
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.zl1
    /* JADX INFO: renamed from: θ */
    public final void mo471(p000.km1 r1) {
            r0 = this;
            r0.m498(r1)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.zl1
    /* JADX INFO: renamed from: ι */
    public final int mo472(p000.km1 r1) {
            r0 = this;
            int r0 = r0.m499(r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.zl1
    /* JADX INFO: renamed from: λ */
    public final void mo473(p000.km1 r1) {
            r0 = this;
            r0.m498(r1)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.zl1
    /* JADX INFO: renamed from: μ */
    public final int mo474(p000.km1 r1) {
            r0 = this;
            int r0 = r0.m499(r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.zl1
    /* JADX INFO: renamed from: ξ */
    public final p000.am1 mo475() {
            r2 = this;
            int r2 = r2.f1110
            r0 = -1
            r1 = -2
            if (r2 != 0) goto Lc
            cb0 r2 = new cb0
            r2.<init>(r1, r0)
            return r2
        Lc:
            cb0 r2 = new cb0
            r2.<init>(r0, r1)
            return r2
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: ο */
    public final p000.am1 mo476(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            cb0 r0 = new cb0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: π */
    public final p000.am1 mo477(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            cb0 r0 = new cb0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        Lc:
            cb0 r0 = new cb0
            r0.<init>(r1)
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: τ */
    public final int mo478(p000.fm1 r4, p000.km1 r5) {
            r3 = this;
            r0 = 0
            int r1 = r3.f1110
            r2 = 1
            if (r1 != r2) goto L14
            androidx.recyclerview.widget.RecyclerView r4 = r3.f13153
            if (r4 == 0) goto Ld
            r4.getAdapter()
        Ld:
            int r3 = r3.f1106
            int r3 = java.lang.Math.min(r3, r0)
            return r3
        L14:
            int r1 = r5.m3336()
            if (r1 >= r2) goto L1b
            return r0
        L1b:
            int r0 = r5.m3336()
            int r0 = r0 - r2
            int r3 = r3.m481(r0, r4, r5)
            int r3 = r3 + r2
            return r3
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: и */
    public final void mo479(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L7
            r1 = 0
            super.mo479(r1)
            return
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "GridLayoutManager does not support stack from end. Consider using reverse layout"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: й */
    public final void m480() {
            r2 = this;
            android.view.View[] r0 = r2.f1108
            if (r0 == 0) goto Lb
            int r0 = r0.length
            int r1 = r2.f1106
            if (r0 == r1) goto La
            goto Lb
        La:
            return
        Lb:
            int r0 = r2.f1106
            android.view.View[] r0 = new android.view.View[r0]
            r2.f1108 = r0
            return
    }

    /* JADX INFO: renamed from: к */
    public final int m481(int r3, p000.fm1 r4, p000.km1 r5) {
            r2 = this;
            boolean r5 = r5.f6030
            n r0 = r2.f1109
            if (r5 != 0) goto L10
            r0.getClass()
            int r2 = r2.f1106
            int r2 = p000.C0568n.m3921(r3, r2)
            return r2
        L10:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f4025
            km1 r5 = r4.f1174
            if (r3 < 0) goto L4b
            int r1 = r5.m3336()
            if (r3 >= r1) goto L4b
            boolean r5 = r5.f6030
            if (r5 != 0) goto L22
            r4 = r3
            goto L29
        L22:
            m6 r4 = r4.f1153
            r5 = 0
            int r4 = r4.m3785(r3, r5)
        L29:
            r5 = -1
            if (r4 != r5) goto L41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot find span size for pre layout position. "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            r2 = 0
            return r2
        L41:
            r0.getClass()
            int r2 = r2.f1106
            int r2 = p000.C0568n.m3921(r4, r2)
            return r2
        L4b:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "invalid position "
            java.lang.String r1 = ". State item count is "
            java.lang.StringBuilder r3 = p000.a12.m19(r3, r0, r1)
            int r5 = r5.m3336()
            r3.append(r5)
            java.lang.String r4 = r4.m528()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: л */
    public final void m482() {
            r8 = this;
            int r0 = r8.f1110
            r1 = 1
            if (r0 != r1) goto L12
            int r0 = r8.f13160
            int r2 = r8.m7178()
            int r0 = r0 - r2
            int r2 = r8.m7177()
        L10:
            int r0 = r0 - r2
            goto L1e
        L12:
            int r0 = r8.f13161
            int r2 = r8.m7176()
            int r0 = r0 - r2
            int r2 = r8.m7179()
            goto L10
        L1e:
            int[] r2 = r8.f1107
            int r3 = r8.f1106
            if (r2 == 0) goto L2f
            int r4 = r2.length
            int r5 = r3 + 1
            if (r4 != r5) goto L2f
            int r4 = r2.length
            int r4 = r4 - r1
            r4 = r2[r4]
            if (r4 == r0) goto L33
        L2f:
            int r2 = r3 + 1
            int[] r2 = new int[r2]
        L33:
            r4 = 0
            r2[r4] = r4
            int r5 = r0 / r3
            int r0 = r0 % r3
            r6 = r4
        L3a:
            if (r1 > r3) goto L4e
            int r4 = r4 + r0
            if (r4 <= 0) goto L47
            int r7 = r3 - r4
            if (r7 >= r0) goto L47
            int r7 = r5 + 1
            int r4 = r4 - r3
            goto L48
        L47:
            r7 = r5
        L48:
            int r6 = r6 + r7
            r2[r1] = r6
            int r1 = r1 + 1
            goto L3a
        L4e:
            r8.f1107 = r2
            return
    }
}
