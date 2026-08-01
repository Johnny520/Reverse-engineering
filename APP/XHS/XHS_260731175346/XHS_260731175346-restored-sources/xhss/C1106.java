package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲈᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1106 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public android.view.ViewParent f3574;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final androidx.core.widget.NestedScrollView f3575;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int[] f3576;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public android.view.ViewParent f3577;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f3578;

    public C1106(androidx.core.widget.NestedScrollView r1) {
            r0 = this;
            r0.<init>()
            r0.f3575 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean m1802(int r13, int r14, int r15, int r16, int[] r17, int r18, int[] r19) {
            r12 = this;
            r6 = r16
            r7 = r17
            r0 = r18
            boolean r1 = r12.f3578
            r8 = 0
            if (r1 == 0) goto L98
            android.view.ViewParent r1 = r12.m1803(r0)
            if (r1 != 0) goto L13
            goto L98
        L13:
            r9 = 1
            if (r13 != 0) goto L24
            if (r14 != 0) goto L24
            if (r15 != 0) goto L24
            if (r6 == 0) goto L1d
            goto L24
        L1d:
            if (r7 == 0) goto L98
            r7[r8] = r8
            r7[r9] = r8
            return r8
        L24:
            androidx.core.widget.NestedScrollView r2 = r12.f3575
            if (r7 == 0) goto L32
            r2.getLocationInWindow(r7)
            r3 = r7[r8]
            r4 = r7[r9]
            r10 = r3
            r11 = r4
            goto L34
        L32:
            r10 = r8
            r11 = r10
        L34:
            if (r19 != 0) goto L44
            int[] r3 = r12.f3576
            if (r3 != 0) goto L3f
            r3 = 2
            int[] r3 = new int[r3]
            r12.f3576 = r3
        L3f:
            r3[r8] = r8
            r3[r9] = r8
            goto L46
        L44:
            r3 = r19
        L46:
            boolean r12 = r1 instanceof androidx.core.widget.NestedScrollView
            if (r12 == 0) goto L50
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1.m14(r6, r0, r3)
            goto L88
        L50:
            r12 = r3[r8]
            int r12 = r12 + r15
            r3[r8] = r12
            r12 = r3[r9]
            int r12 = r12 + r6
            r3[r9] = r12
            boolean r12 = r1 instanceof androidx.core.widget.NestedScrollView
            if (r12 == 0) goto L65
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r12 = 0
            r1.m14(r6, r0, r12)
            goto L88
        L65:
            if (r0 != 0) goto L88
            r3 = r13
            r4 = r14
            r5 = r15
            r1.onNestedScroll(r2, r3, r4, r5, r6)     // Catch: java.lang.AbstractMethodError -> L6e
            goto L88
        L6e:
            r0 = move-exception
            r12 = r0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "ViewParent "
            r13.<init>(r14)
            r13.append(r1)
            java.lang.String r14 = " does not implement interface method onNestedScroll"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "ViewParentCompat"
            android.util.Log.e(r14, r13, r12)
        L88:
            if (r7 == 0) goto L97
            r2.getLocationInWindow(r7)
            r12 = r7[r8]
            int r12 = r12 - r10
            r7[r8] = r12
            r12 = r7[r9]
            int r12 = r12 - r11
            r7[r9] = r12
        L97:
            return r9
        L98:
            return r8
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final android.view.ViewParent m1803(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            if (r2 == r0) goto L7
            r1 = 0
            return r1
        L7:
            android.view.ViewParent r1 = r1.f3574
            return r1
        La:
            android.view.ViewParent r1 = r1.f3577
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean m1804(int r13, int r14, int r15, int[] r16, int[] r17) {
            r12 = this;
            r6 = r17
            boolean r1 = r12.f3578
            r7 = 0
            if (r1 == 0) goto L86
            android.view.ViewParent r1 = r12.m1803(r15)
            if (r1 != 0) goto Lf
            goto L86
        Lf:
            r8 = 1
            if (r13 != 0) goto L1c
            if (r14 == 0) goto L15
            goto L1c
        L15:
            if (r6 == 0) goto L86
            r6[r7] = r7
            r6[r8] = r7
            return r7
        L1c:
            androidx.core.widget.NestedScrollView r9 = r12.f3575
            if (r6 == 0) goto L2a
            r9.getLocationInWindow(r6)
            r2 = r6[r7]
            r4 = r6[r8]
            r10 = r2
            r11 = r4
            goto L2c
        L2a:
            r10 = r7
            r11 = r10
        L2c:
            if (r16 != 0) goto L39
            int[] r2 = r12.f3576
            if (r2 != 0) goto L37
            r2 = 2
            int[] r2 = new int[r2]
            r12.f3576 = r2
        L37:
            r4 = r2
            goto L3b
        L39:
            r4 = r16
        L3b:
            r4[r7] = r7
            r4[r8] = r7
            boolean r0 = r1 instanceof androidx.core.widget.NestedScrollView
            if (r0 == 0) goto L4f
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r5 = 0
            xhss.ᲇᲈᛶᛸ r0 = r1.f30
            r1 = r13
            r2 = r14
            r3 = r15
            r0.m1804(r1, r2, r3, r4, r5)
            goto L6e
        L4f:
            if (r15 != 0) goto L6e
            r1.onNestedPreScroll(r9, r13, r14, r4)     // Catch: java.lang.AbstractMethodError -> L55
            goto L6e
        L55:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ViewParent "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " does not implement interface method onNestedPreScroll"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r1, r0)
        L6e:
            if (r6 == 0) goto L7d
            r9.getLocationInWindow(r6)
            r0 = r6[r7]
            int r0 = r0 - r10
            r6[r7] = r0
            r0 = r6[r8]
            int r0 = r0 - r11
            r6[r8] = r0
        L7d:
            r0 = r4[r7]
            if (r0 != 0) goto L85
            r0 = r4[r8]
            if (r0 == 0) goto L86
        L85:
            r7 = r8
        L86:
            return r7
    }
}
