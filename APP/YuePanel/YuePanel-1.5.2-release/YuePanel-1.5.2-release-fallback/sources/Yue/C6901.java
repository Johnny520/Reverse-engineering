package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6901 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f24142 = "ViewParentCompat";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int[] f24143;

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C6902 {
        public C6902() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m26708(android.view.ViewParent r0, android.view.View r1, float r2, float r3, boolean r4) {
                boolean r0 = r0.onNestedFling(r1, r2, r3, r4)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m26709(android.view.ViewParent r0, android.view.View r1, float r2, float r3) {
                boolean r0 = r0.onNestedPreFling(r1, r2, r3)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m26710(android.view.ViewParent r0, android.view.View r1, int r2, int r3, int[] r4) {
                r0.onNestedPreScroll(r1, r2, r3, r4)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m26711(android.view.ViewParent r0, android.view.View r1, int r2, int r3, int r4, int r5) {
                r0.onNestedScroll(r1, r2, r3, r4, r5)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m26712(android.view.ViewParent r0, android.view.View r1, android.view.View r2, int r3) {
                r0.onNestedScrollAccepted(r1, r2, r3)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean m26713(android.view.ViewParent r0, android.view.View r1, android.view.View r2, int r3) {
                boolean r0 = r0.onStartNestedScroll(r1, r2, r3)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m26714(android.view.ViewParent r0, android.view.View r1) {
                r0.onStopNestedScroll(r1)
                return
        }
    }

    public C6901() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int[] m26692() {
            int[] r0 = Yue.C6901.f24143
            if (r0 != 0) goto La
            r0 = 2
            int[] r0 = new int[r0]
            Yue.C6901.f24143 = r0
            goto L10
        La:
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
        L10:
            int[] r0 = Yue.C6901.f24143
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m26693(@Yue.InterfaceC4410 android.view.ViewParent r0, @Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 android.view.View r2, int r3) {
            r0.notifySubtreeAccessibilityStateChanged(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m26694(@Yue.InterfaceC4410 android.view.ViewParent r0, @Yue.InterfaceC4410 android.view.View r1, float r2, float r3, boolean r4) {
            boolean r0 = Yue.C6901.C6902.m26708(r0, r1, r2, r3, r4)     // Catch: java.lang.AbstractMethodError -> L5
            return r0
        L5:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ViewParent "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " does not implement interface method onNestedFling"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r0, r1)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m26695(@Yue.InterfaceC4410 android.view.ViewParent r0, @Yue.InterfaceC4410 android.view.View r1, float r2, float r3) {
            boolean r0 = Yue.C6901.C6902.m26709(r0, r1, r2, r3)     // Catch: java.lang.AbstractMethodError -> L5
            return r0
        L5:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ViewParent "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " does not implement interface method onNestedPreFling"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r0, r1)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m26696(@Yue.InterfaceC4410 android.view.ViewParent r6, @Yue.InterfaceC4410 android.view.View r7, int r8, int r9, @Yue.InterfaceC4410 int[] r10) {
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            m26697(r0, r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m26697(@Yue.InterfaceC4410 android.view.ViewParent r7, @Yue.InterfaceC4410 android.view.View r8, int r9, int r10, @Yue.InterfaceC4410 int[] r11, int r12) {
            boolean r0 = r7 instanceof Yue.InterfaceC4384
            if (r0 == 0) goto L10
            r1 = r7
            Yue.ۥۡۢۢۡ r1 = (Yue.InterfaceC4384) r1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.onNestedPreScroll(r2, r3, r4, r5, r6)
            goto L32
        L10:
            if (r12 != 0) goto L32
            Yue.C6901.C6902.m26710(r7, r8, r9, r10, r11)     // Catch: java.lang.AbstractMethodError -> L16
            goto L32
        L16:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "ViewParent "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = " does not implement interface method onNestedPreScroll"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = "ViewParentCompat"
            android.util.Log.e(r9, r7, r8)
        L32:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m26698(@Yue.InterfaceC4410 android.view.ViewParent r8, @Yue.InterfaceC4410 android.view.View r9, int r10, int r11, int r12, int r13) {
            r6 = 0
            int[] r7 = m26692()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            m26700(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m26699(@Yue.InterfaceC4410 android.view.ViewParent r8, @Yue.InterfaceC4410 android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            int[] r7 = m26692()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            m26700(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m26700(@Yue.InterfaceC4410 android.view.ViewParent r10, @Yue.InterfaceC4410 android.view.View r11, int r12, int r13, int r14, int r15, int r16, @Yue.InterfaceC4410 int[] r17) {
            r1 = r10
            boolean r0 = r1 instanceof Yue.InterfaceC4385
            if (r0 == 0) goto L14
            Yue.ۥۡۢۢۢ r1 = (Yue.InterfaceC4385) r1
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.onNestedScroll(r2, r3, r4, r5, r6, r7, r8)
            goto L55
        L14:
            r0 = 0
            r2 = r17[r0]
            int r2 = r2 + r14
            r17[r0] = r2
            r0 = 1
            r2 = r17[r0]
            int r2 = r2 + r15
            r17[r0] = r2
            boolean r0 = r1 instanceof Yue.InterfaceC4384
            if (r0 == 0) goto L32
            r3 = r1
            Yue.ۥۡۢۢۡ r3 = (Yue.InterfaceC4384) r3
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r3.onNestedScroll(r4, r5, r6, r7, r8, r9)
            goto L55
        L32:
            if (r16 != 0) goto L55
            Yue.C6901.C6902.m26711(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.AbstractMethodError -> L38
            goto L55
        L38:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "ViewParent "
            r0.append(r3)
            r0.append(r10)
            java.lang.String r1 = " does not implement interface method onNestedScroll"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ViewParentCompat"
            android.util.Log.e(r1, r0, r2)
        L55:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m26701(@Yue.InterfaceC4410 android.view.ViewParent r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.View r3, int r4) {
            r0 = 0
            m26702(r1, r2, r3, r4, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m26702(@Yue.InterfaceC4410 android.view.ViewParent r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.View r3, int r4, int r5) {
            boolean r0 = r1 instanceof Yue.InterfaceC4384
            if (r0 == 0) goto La
            Yue.ۥۡۢۢۡ r1 = (Yue.InterfaceC4384) r1
            r1.onNestedScrollAccepted(r2, r3, r4, r5)
            goto L2c
        La:
            if (r5 != 0) goto L2c
            Yue.C6901.C6902.m26712(r1, r2, r3, r4)     // Catch: java.lang.AbstractMethodError -> L10
            goto L2c
        L10:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ViewParent "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " does not implement interface method onNestedScrollAccepted"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "ViewParentCompat"
            android.util.Log.e(r3, r1, r2)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m26703(@Yue.InterfaceC4410 android.view.ViewParent r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.View r3, int r4) {
            r0 = 0
            boolean r1 = m26704(r1, r2, r3, r4, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m26704(@Yue.InterfaceC4410 android.view.ViewParent r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.View r3, int r4, int r5) {
            boolean r0 = r1 instanceof Yue.InterfaceC4384
            if (r0 == 0) goto Lb
            Yue.ۥۡۢۢۡ r1 = (Yue.InterfaceC4384) r1
            boolean r1 = r1.onStartNestedScroll(r2, r3, r4, r5)
            return r1
        Lb:
            if (r5 != 0) goto L2e
            boolean r1 = Yue.C6901.C6902.m26713(r1, r2, r3, r4)     // Catch: java.lang.AbstractMethodError -> L12
            return r1
        L12:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ViewParent "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " does not implement interface method onStartNestedScroll"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "ViewParentCompat"
            android.util.Log.e(r3, r1, r2)
        L2e:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m26705(@Yue.InterfaceC4410 android.view.ViewParent r1, @Yue.InterfaceC4410 android.view.View r2) {
            r0 = 0
            m26706(r1, r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m26706(@Yue.InterfaceC4410 android.view.ViewParent r1, @Yue.InterfaceC4410 android.view.View r2, int r3) {
            boolean r0 = r1 instanceof Yue.InterfaceC4384
            if (r0 == 0) goto La
            Yue.ۥۡۢۢۡ r1 = (Yue.InterfaceC4384) r1
            r1.onStopNestedScroll(r2, r3)
            goto L2c
        La:
            if (r3 != 0) goto L2c
            Yue.C6901.C6902.m26714(r1, r2)     // Catch: java.lang.AbstractMethodError -> L10
            goto L2c
        L10:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "ViewParent "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r1 = " does not implement interface method onStopNestedScroll"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "ViewParentCompat"
            android.util.Log.e(r3, r1, r2)
        L2c:
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m26707(android.view.ViewParent r0, android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            boolean r0 = r0.requestSendAccessibilityEvent(r1, r2)
            return r0
    }
}
