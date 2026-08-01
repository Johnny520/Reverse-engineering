package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d00 extends defpackage.x {
    public final androidx.recyclerview.widget.RecyclerView d;
    public final defpackage.c00 e;

    public d00(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            c00 r1 = r0.e
            if (r1 == 0) goto Lc
            r0.e = r1
            return
        Lc:
            c00 r1 = new c00
            r1.<init>(r0)
            r0.e = r1
            return
    }

    @Override // defpackage.x
    public final void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            super.c(r2, r3)
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L1e
            androidx.recyclerview.widget.RecyclerView r0 = r1.d
            boolean r0 = r0.K()
            if (r0 != 0) goto L1e
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            nz r0 = r2.getLayoutManager()
            if (r0 == 0) goto L1e
            nz r2 = r2.getLayoutManager()
            r2.R(r3)
        L1e:
            return
    }

    @Override // defpackage.x
    public final void d(android.view.View r7, defpackage.j0 r8) {
            r6 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.a
            android.view.View$AccessibilityDelegate r1 = r6.a
            r1.onInitializeAccessibilityNodeInfo(r7, r0)
            androidx.recyclerview.widget.RecyclerView r7 = r6.d
            boolean r1 = r7.K()
            if (r1 != 0) goto L5f
            nz r1 = r7.getLayoutManager()
            if (r1 == 0) goto L5f
            nz r7 = r7.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r1 = r7.b
            tz r2 = r1.b
            yz r3 = r1.c0
            r4 = -1
            boolean r1 = r1.canScrollVertically(r4)
            r5 = 1
            if (r1 != 0) goto L2f
            androidx.recyclerview.widget.RecyclerView r1 = r7.b
            boolean r1 = r1.canScrollHorizontally(r4)
            if (r1 == 0) goto L37
        L2f:
            r1 = 8192(0x2000, float:1.148E-41)
            r8.a(r1)
            r0.setScrollable(r5)
        L37:
            androidx.recyclerview.widget.RecyclerView r1 = r7.b
            boolean r1 = r1.canScrollVertically(r5)
            if (r1 != 0) goto L47
            androidx.recyclerview.widget.RecyclerView r1 = r7.b
            boolean r1 = r1.canScrollHorizontally(r5)
            if (r1 == 0) goto L4f
        L47:
            r1 = 4096(0x1000, float:5.74E-42)
            r8.a(r1)
            r0.setScrollable(r5)
        L4f:
            int r8 = r7.H(r2, r3)
            int r7 = r7.x(r2, r3)
            r1 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r7 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r8, r7, r1, r1)
            r0.setCollectionInfo(r7)
        L5f:
            return
    }

    @Override // defpackage.x
    public final boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
            r3 = this;
            boolean r4 = super.g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.d
            boolean r0 = r4.K()
            r1 = 0
            if (r0 != 0) goto L8c
            nz r0 = r4.getLayoutManager()
            if (r0 == 0) goto L8c
            nz r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            tz r2 = r0.b
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L58
            r2 = 8192(0x2000, float:1.148E-41)
            if (r5 == r2) goto L2a
            r5 = r1
            r0 = r5
            goto L81
        L2a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L3f
            int r0 = r4.o
            int r2 = r4.E()
            int r0 = r0 - r2
            int r2 = r4.B()
            int r0 = r0 - r2
            int r0 = -r0
            goto L40
        L3f:
            r0 = r1
        L40:
            androidx.recyclerview.widget.RecyclerView r2 = r4.b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L56
            int r5 = r4.n
            int r2 = r4.C()
            int r5 = r5 - r2
            int r2 = r4.D()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            r5 = r1
            goto L81
        L58:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.o
            int r0 = r4.E()
            int r5 = r5 - r0
            int r0 = r4.B()
            int r5 = r5 - r0
            r0 = r5
            goto L6d
        L6c:
            r0 = r1
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L56
            int r5 = r4.n
            int r2 = r4.C()
            int r5 = r5 - r2
            int r2 = r4.D()
            int r5 = r5 - r2
        L81:
            if (r0 != 0) goto L86
            if (r5 != 0) goto L86
            goto L8c
        L86:
            androidx.recyclerview.widget.RecyclerView r4 = r4.b
            r4.Z(r5, r0, r6)
            return r6
        L8c:
            return r1
    }
}
