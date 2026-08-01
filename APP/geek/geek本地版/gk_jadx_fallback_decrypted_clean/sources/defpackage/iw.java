package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iw {
    public android.view.ViewParent a;
    public android.view.ViewParent b;
    public final android.view.ViewGroup c;
    public boolean d;
    public int[] e;

    public iw(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    public final boolean a(float r4, float r5, boolean r6) {
            r3 = this;
            boolean r0 = r3.d
            r1 = 0
            if (r0 == 0) goto L2b
            android.view.ViewParent r0 = r3.e(r1)
            if (r0 == 0) goto L2b
            android.view.ViewGroup r2 = r3.c
            boolean r4 = defpackage.ua0.a(r0, r2, r4, r5, r6)     // Catch: java.lang.AbstractMethodError -> L12
            return r4
        L12:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "ViewParent "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = " does not implement interface method onNestedFling"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ViewParentCompat"
            android.util.Log.e(r6, r5, r4)
        L2b:
            return r1
    }

    public final boolean b(float r4, float r5) {
            r3 = this;
            boolean r0 = r3.d
            r1 = 0
            if (r0 == 0) goto L2b
            android.view.ViewParent r0 = r3.e(r1)
            if (r0 == 0) goto L2b
            android.view.ViewGroup r2 = r3.c
            boolean r4 = defpackage.ua0.b(r0, r2, r4, r5)     // Catch: java.lang.AbstractMethodError -> L12
            return r4
        L12:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "ViewParent "
            r5.<init>(r2)
            r5.append(r0)
            java.lang.String r0 = " does not implement interface method onNestedPreFling"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r5, r4)
        L2b:
            return r1
    }

    public final boolean c(int r13, int r14, int[] r15, int[] r16, int r17) {
            r12 = this;
            r1 = r16
            r7 = r17
            boolean r0 = r12.d
            r8 = 0
            if (r0 == 0) goto L84
            android.view.ViewParent r2 = r12.e(r7)
            if (r2 != 0) goto L11
            goto L84
        L11:
            r9 = 1
            if (r13 != 0) goto L1e
            if (r14 == 0) goto L17
            goto L1e
        L17:
            if (r1 == 0) goto L84
            r1[r8] = r8
            r1[r9] = r8
            return r8
        L1e:
            android.view.ViewGroup r3 = r12.c
            if (r1 == 0) goto L2c
            r3.getLocationInWindow(r1)
            r0 = r1[r8]
            r4 = r1[r9]
            r10 = r0
            r11 = r4
            goto L2e
        L2c:
            r10 = r8
            r11 = r10
        L2e:
            if (r15 != 0) goto L3b
            int[] r15 = r12.e
            if (r15 != 0) goto L39
            r15 = 2
            int[] r15 = new int[r15]
            r12.e = r15
        L39:
            int[] r15 = r12.e
        L3b:
            r6 = r15
            r6[r8] = r8
            r6[r9] = r8
            boolean r15 = r2 instanceof defpackage.jw
            if (r15 == 0) goto L4c
            jw r2 = (defpackage.jw) r2
            r4 = r13
            r5 = r14
            r2.c(r3, r4, r5, r6, r7)
            goto L6c
        L4c:
            if (r17 != 0) goto L6c
            defpackage.ua0.c(r2, r3, r13, r14, r6)     // Catch: java.lang.AbstractMethodError -> L52
            goto L6c
        L52:
            r0 = move-exception
            r13 = r0
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "ViewParent "
            r14.<init>(r15)
            r14.append(r2)
            java.lang.String r15 = " does not implement interface method onNestedPreScroll"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "ViewParentCompat"
            android.util.Log.e(r15, r14, r13)
        L6c:
            if (r1 == 0) goto L7b
            r3.getLocationInWindow(r1)
            r13 = r1[r8]
            int r13 = r13 - r10
            r1[r8] = r13
            r13 = r1[r9]
            int r13 = r13 - r11
            r1[r9] = r13
        L7b:
            r13 = r6[r8]
            if (r13 != 0) goto L83
            r13 = r6[r9]
            if (r13 == 0) goto L84
        L83:
            r8 = r9
        L84:
            return r8
    }

    public final boolean d(int r15, int r16, int r17, int r18, int[] r19, int r20, int[] r21) {
            r14 = this;
            r1 = r19
            r8 = r20
            boolean r0 = r14.d
            r10 = 0
            if (r0 == 0) goto Lae
            android.view.ViewParent r2 = r14.e(r8)
            if (r2 != 0) goto L11
            goto Lae
        L11:
            r11 = 1
            if (r15 != 0) goto L22
            if (r16 != 0) goto L22
            if (r17 != 0) goto L22
            if (r18 == 0) goto L1b
            goto L22
        L1b:
            if (r1 == 0) goto Lae
            r1[r10] = r10
            r1[r11] = r10
            return r10
        L22:
            android.view.ViewGroup r3 = r14.c
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
            if (r21 != 0) goto L45
            int[] r0 = r14.e
            if (r0 != 0) goto L3d
            r0 = 2
            int[] r0 = new int[r0]
            r14.e = r0
        L3d:
            int[] r0 = r14.e
            r0[r10] = r10
            r0[r11] = r10
            r9 = r0
            goto L47
        L45:
            r9 = r21
        L47:
            boolean r0 = r2 instanceof defpackage.kw
            if (r0 == 0) goto L58
            kw r2 = (defpackage.kw) r2
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r2.d(r3, r4, r5, r6, r7, r8, r9)
            goto L9e
        L58:
            r0 = r9[r10]
            int r0 = r0 + r17
            r9[r10] = r0
            r0 = r9[r11]
            int r0 = r0 + r18
            r9[r11] = r0
            boolean r0 = r2 instanceof defpackage.jw
            if (r0 == 0) goto L77
            jw r2 = (defpackage.jw) r2
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r20
            r2.e(r3, r4, r5, r6, r7, r8)
            goto L9e
        L77:
            if (r20 != 0) goto L9e
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            defpackage.ua0.d(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.AbstractMethodError -> L84
            goto L9e
        L84:
            r0 = move-exception
            r15 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "ViewParent "
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r2 = " does not implement interface method onNestedScroll"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r0, r15)
        L9e:
            if (r1 == 0) goto Lad
            r3.getLocationInWindow(r1)
            r15 = r1[r10]
            int r15 = r15 - r12
            r1[r10] = r15
            r15 = r1[r11]
            int r15 = r15 - r13
            r1[r11] = r15
        Lad:
            return r11
        Lae:
            return r10
    }

    public final android.view.ViewParent e(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            if (r2 == r0) goto L7
            r2 = 0
            return r2
        L7:
            android.view.ViewParent r2 = r1.b
            return r2
        La:
            android.view.ViewParent r2 = r1.a
            return r2
    }

    public final boolean f(int r1) {
            r0 = this;
            android.view.ViewParent r1 = r0.e(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public final boolean g(int r12, int r13) {
            r11 = this;
            boolean r0 = r11.f(r13)
            r1 = 1
            if (r0 == 0) goto L9
            goto L73
        L9:
            boolean r0 = r11.d
            r2 = 0
            if (r0 == 0) goto L80
            android.view.ViewGroup r0 = r11.c
            android.view.ViewParent r3 = r0.getParent()
            r4 = r0
        L15:
            if (r3 == 0) goto L80
            boolean r5 = r3 instanceof defpackage.jw
            java.lang.String r6 = "ViewParent "
            java.lang.String r7 = "ViewParentCompat"
            if (r5 == 0) goto L27
            r8 = r3
            jw r8 = (defpackage.jw) r8
            boolean r8 = r8.f(r4, r0, r12, r13)
            goto L44
        L27:
            if (r13 != 0) goto L43
            boolean r8 = defpackage.ua0.f(r3, r4, r0, r12)     // Catch: java.lang.AbstractMethodError -> L2e
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
            r11.b = r3
            goto L50
        L4e:
            r11.a = r3
        L50:
            if (r5 == 0) goto L58
            jw r3 = (defpackage.jw) r3
            r3.a(r4, r0, r12, r13)
            goto L73
        L58:
            if (r13 != 0) goto L73
            defpackage.ua0.e(r3, r4, r0, r12)     // Catch: java.lang.AbstractMethodError -> L5e
            goto L73
        L5e:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r6)
            r13.append(r3)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            android.util.Log.e(r7, r13, r12)
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

    public final void h(int r5) {
            r4 = this;
            android.view.ViewParent r0 = r4.e(r5)
            if (r0 == 0) goto L3d
            boolean r1 = r0 instanceof defpackage.jw
            android.view.ViewGroup r2 = r4.c
            if (r1 == 0) goto L12
            jw r0 = (defpackage.jw) r0
            r0.b(r2, r5)
            goto L31
        L12:
            if (r5 != 0) goto L31
            defpackage.ua0.g(r0, r2)     // Catch: java.lang.AbstractMethodError -> L18
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
            r4.b = r0
            goto L3d
        L3b:
            r4.a = r0
        L3d:
            return
    }
}
