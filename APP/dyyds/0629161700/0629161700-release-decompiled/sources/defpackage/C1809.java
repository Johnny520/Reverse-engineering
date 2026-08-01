package defpackage;

/* JADX INFO: renamed from: ᲁᛲᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1809 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int[] f7929;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f7930;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.view.ViewGroup f7931;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public android.view.ViewParent f7932;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public android.view.ViewParent f7933;

    public C1809(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>()
            r0.f7931 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void m3201(int r5) {
            r4 = this;
            android.view.ViewParent r0 = r4.m3202(r5)
            if (r0 == 0) goto L3d
            boolean r1 = r0 instanceof defpackage.InterfaceC0509
            android.view.ViewGroup r2 = r4.f7931
            if (r1 == 0) goto L12
            ᛳᛶᲁᛸ r0 = (defpackage.InterfaceC0509) r0
            r0.mo34(r2, r5)
            goto L31
        L12:
            if (r5 != 0) goto L31
            r0.onStopNestedScroll(r2)     // Catch: java.lang.AbstractMethodError -> L18
            goto L31
        L18:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ViewParent "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " does not implement interface method onStopNestedScroll"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r0, r1)
        L31:
            r0 = 0
            if (r5 == 0) goto L3b
            r1 = 1
            if (r5 == r1) goto L38
            goto L3d
        L38:
            r4.f7933 = r0
            goto L3d
        L3b:
            r4.f7932 = r0
        L3d:
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final android.view.ViewParent m3202(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            if (r2 == r0) goto L7
            r1 = 0
            return r1
        L7:
            android.view.ViewParent r1 = r1.f7933
            return r1
        La:
            android.view.ViewParent r1 = r1.f7932
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean m3203(int r15, int r16, int r17, int r18, int[] r19, int r20, int[] r21) {
            r14 = this;
            r1 = r19
            r8 = r20
            boolean r0 = r14.f7930
            r10 = 0
            if (r0 == 0) goto Lac
            android.view.ViewParent r2 = r14.m3202(r8)
            if (r2 != 0) goto L11
            goto Lac
        L11:
            r11 = 1
            if (r15 != 0) goto L22
            if (r16 != 0) goto L22
            if (r17 != 0) goto L22
            if (r18 == 0) goto L1b
            goto L22
        L1b:
            if (r1 == 0) goto Lac
            r1[r10] = r10
            r1[r11] = r10
            return r10
        L22:
            android.view.ViewGroup r3 = r14.f7931
            if (r1 == 0) goto L30
            r3.getLocationInWindow(r1)
            r0 = r1[r10]
            r4 = r1[r11]
            r12 = r0
            r13 = r4
            goto L32
        L30:
            r12 = r10
            r13 = r12
        L32:
            if (r21 != 0) goto L43
            int[] r0 = r14.f7929
            if (r0 != 0) goto L3d
            r0 = 2
            int[] r0 = new int[r0]
            r14.f7929 = r0
        L3d:
            r0[r10] = r10
            r0[r11] = r10
            r9 = r0
            goto L45
        L43:
            r9 = r21
        L45:
            boolean r14 = r2 instanceof defpackage.InterfaceC1471
            if (r14 == 0) goto L56
            ᛸᛴᛳᛸ r2 = (defpackage.InterfaceC1471) r2
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r2.mo32(r3, r4, r5, r6, r7, r8, r9)
            goto L9c
        L56:
            r14 = r9[r10]
            int r14 = r14 + r17
            r9[r10] = r14
            r14 = r9[r11]
            int r14 = r14 + r18
            r9[r11] = r14
            boolean r14 = r2 instanceof defpackage.InterfaceC0509
            if (r14 == 0) goto L75
            ᛳᛶᲁᛸ r2 = (defpackage.InterfaceC0509) r2
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r20
            r2.mo37(r3, r4, r5, r6, r7, r8)
            goto L9c
        L75:
            if (r20 != 0) goto L9c
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r2.onNestedScroll(r3, r4, r5, r6, r7)     // Catch: java.lang.AbstractMethodError -> L82
            goto L9c
        L82:
            r0 = move-exception
            r14 = r0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "ViewParent "
            r15.<init>(r0)
            r15.append(r2)
            java.lang.String r0 = " does not implement interface method onNestedScroll"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r15, r14)
        L9c:
            if (r1 == 0) goto Lab
            r3.getLocationInWindow(r1)
            r14 = r1[r10]
            int r14 = r14 - r12
            r1[r10] = r14
            r14 = r1[r11]
            int r14 = r14 - r13
            r1[r11] = r14
        Lab:
            return r11
        Lac:
            return r10
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean m3204(int r7, int r8, int r9, int[] r10, int[] r11) {
            r6 = this;
            boolean r0 = r6.f7930
            r1 = 0
            if (r0 == 0) goto L78
            android.view.ViewParent r0 = r6.m3202(r9)
            if (r0 != 0) goto Ld
            goto L78
        Ld:
            r2 = 1
            if (r7 != 0) goto L1a
            if (r8 == 0) goto L13
            goto L1a
        L13:
            if (r11 == 0) goto L78
            r11[r1] = r1
            r11[r2] = r1
            return r1
        L1a:
            android.view.ViewGroup r3 = r6.f7931
            if (r11 == 0) goto L26
            r3.getLocationInWindow(r11)
            r4 = r11[r1]
            r5 = r11[r2]
            goto L28
        L26:
            r4 = r1
            r5 = r4
        L28:
            if (r10 != 0) goto L33
            int[] r10 = r6.f7929
            if (r10 != 0) goto L33
            r10 = 2
            int[] r10 = new int[r10]
            r6.f7929 = r10
        L33:
            r10[r1] = r1
            r10[r2] = r1
            boolean r6 = r0 instanceof defpackage.InterfaceC0509
            if (r6 == 0) goto L41
            ᛳᛶᲁᛸ r0 = (defpackage.InterfaceC0509) r0
            r0.mo33(r7, r8, r10, r9)
            goto L60
        L41:
            if (r9 != 0) goto L60
            r0.onNestedPreScroll(r3, r7, r8, r10)     // Catch: java.lang.AbstractMethodError -> L47
            goto L60
        L47:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "ViewParent "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r8 = " does not implement interface method onNestedPreScroll"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "ViewParentCompat"
            android.util.Log.e(r8, r7, r6)
        L60:
            if (r11 == 0) goto L6f
            r3.getLocationInWindow(r11)
            r6 = r11[r1]
            int r6 = r6 - r4
            r11[r1] = r6
            r6 = r11[r2]
            int r6 = r6 - r5
            r11[r2] = r6
        L6f:
            r6 = r10[r1]
            if (r6 != 0) goto L77
            r6 = r10[r2]
            if (r6 == 0) goto L78
        L77:
            r1 = r2
        L78:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m3205(float r3, float r4, boolean r5) {
            r2 = this;
            boolean r0 = r2.f7930
            r1 = 0
            if (r0 == 0) goto L2b
            android.view.ViewParent r0 = r2.m3202(r1)
            if (r0 == 0) goto L2b
            android.view.ViewGroup r2 = r2.f7931
            boolean r2 = r0.onNestedFling(r2, r3, r4, r5)     // Catch: java.lang.AbstractMethodError -> L12
            return r2
        L12:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ViewParent "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " does not implement interface method onNestedFling"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ViewParentCompat"
            android.util.Log.e(r4, r3, r2)
        L2b:
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean m3206(float r3, float r4) {
            r2 = this;
            boolean r0 = r2.f7930
            r1 = 0
            if (r0 == 0) goto L2b
            android.view.ViewParent r0 = r2.m3202(r1)
            if (r0 == 0) goto L2b
            android.view.ViewGroup r2 = r2.f7931
            boolean r2 = r0.onNestedPreFling(r2, r3, r4)     // Catch: java.lang.AbstractMethodError -> L12
            return r2
        L12:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ViewParent "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " does not implement interface method onNestedPreFling"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ViewParentCompat"
            android.util.Log.e(r4, r3, r2)
        L2b:
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean m3207(int r1) {
            r0 = this;
            android.view.ViewParent r0 = r0.m3202(r1)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean m3208(int r12, int r13) {
            r11 = this;
            boolean r0 = r11.m3207(r13)
            r1 = 1
            if (r0 == 0) goto L9
            goto L73
        L9:
            boolean r0 = r11.f7930
            r2 = 0
            if (r0 == 0) goto L80
            android.view.ViewGroup r0 = r11.f7931
            android.view.ViewParent r3 = r0.getParent()
            r4 = r0
        L15:
            if (r3 == 0) goto L80
            boolean r5 = r3 instanceof defpackage.InterfaceC0509
            java.lang.String r6 = "ViewParent "
            java.lang.String r7 = "ViewParentCompat"
            if (r5 == 0) goto L27
            r8 = r3
            ᛳᛶᲁᛸ r8 = (defpackage.InterfaceC0509) r8
            boolean r8 = r8.mo38(r4, r0, r12, r13)
            goto L44
        L27:
            if (r13 != 0) goto L43
            boolean r8 = r3.onStartNestedScroll(r4, r0, r12)     // Catch: java.lang.AbstractMethodError -> L2e
            goto L44
        L2e:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            r9.append(r3)
            java.lang.String r10 = " does not implement interface method onStartNestedScroll"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r7, r9, r8)
        L43:
            r8 = r2
        L44:
            if (r8 == 0) goto L74
            if (r13 == 0) goto L4e
            if (r13 == r1) goto L4b
            goto L50
        L4b:
            r11.f7933 = r3
            goto L50
        L4e:
            r11.f7932 = r3
        L50:
            if (r5 == 0) goto L58
            ᛳᛶᲁᛸ r3 = (defpackage.InterfaceC0509) r3
            r3.mo35(r4, r0, r12, r13)
            goto L73
        L58:
            if (r13 != 0) goto L73
            r3.onNestedScrollAccepted(r4, r0, r12)     // Catch: java.lang.AbstractMethodError -> L5e
            goto L73
        L5e:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            r12.append(r3)
            java.lang.String r13 = " does not implement interface method onNestedScrollAccepted"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r7, r12, r11)
        L73:
            return r1
        L74:
            boolean r5 = r3 instanceof android.view.View
            if (r5 == 0) goto L7b
            r4 = r3
            android.view.View r4 = (android.view.View) r4
        L7b:
            android.view.ViewParent r3 = r3.getParent()
            goto L15
        L80:
            return r2
    }
}
