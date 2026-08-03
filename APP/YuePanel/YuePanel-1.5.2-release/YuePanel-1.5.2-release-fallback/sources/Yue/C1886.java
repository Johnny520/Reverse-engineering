package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1886 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.view.DisplayCutout f5815;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C1887 {
        public C1887() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.view.DisplayCutout m8829(android.graphics.Rect r1, java.util.List<android.graphics.Rect> r2) {
                android.view.DisplayCutout r0 = new android.view.DisplayCutout
                r0.<init>(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.util.List<android.graphics.Rect> m8830(android.view.DisplayCutout r0) {
                java.util.List r0 = r0.getBoundingRects()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m8831(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetBottom()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static int m8832(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetLeft()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static int m8833(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetRight()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static int m8834(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetTop()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟۠$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C1888 {
        public C1888() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.view.DisplayCutout m8835(android.graphics.Insets r7, android.graphics.Rect r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
                android.view.DisplayCutout r6 = new android.view.DisplayCutout
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟۠$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C1889 {
        public C1889() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.view.DisplayCutout m8836(android.graphics.Insets r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12, android.graphics.Insets r13) {
                android.view.DisplayCutout r7 = new android.view.DisplayCutout
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.graphics.Insets m8837(android.view.DisplayCutout r0) {
                android.graphics.Insets r0 = r0.getWaterfallInsets()
                return r0
        }
    }

    public C1886(@Yue.InterfaceC4410 Yue.C3267 r1, @Yue.InterfaceC4544 android.graphics.Rect r2, @Yue.InterfaceC4544 android.graphics.Rect r3, @Yue.InterfaceC4544 android.graphics.Rect r4, @Yue.InterfaceC4544 android.graphics.Rect r5, @Yue.InterfaceC4410 Yue.C3267 r6) {
            r0 = this;
            android.view.DisplayCutout r1 = m8820(r1, r2, r3, r4, r5, r6)
            r0.<init>(r1)
            return
    }

    public C1886(@Yue.InterfaceC4544 android.graphics.Rect r3, @Yue.InterfaceC4544 java.util.List<android.graphics.Rect> r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.view.DisplayCutout r3 = Yue.C1886.C1887.m8829(r3, r4)
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r2.<init>(r3)
            return
    }

    public C1886(android.view.DisplayCutout r1) {
            r0 = this;
            r0.<init>()
            r0.f5815 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.view.DisplayCutout m8820(@Yue.InterfaceC4410 Yue.C3267 r8, @Yue.InterfaceC4544 android.graphics.Rect r9, @Yue.InterfaceC4544 android.graphics.Rect r10, @Yue.InterfaceC4544 android.graphics.Rect r11, @Yue.InterfaceC4544 android.graphics.Rect r12, @Yue.InterfaceC4410 Yue.C3267 r13) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L17
            android.graphics.Insets r2 = r8.m13731()
            android.graphics.Insets r7 = r13.m13731()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            android.view.DisplayCutout r8 = Yue.C1886.C1889.m8836(r2, r3, r4, r5, r6, r7)
            return r8
        L17:
            r13 = 29
            if (r0 < r13) goto L24
            android.graphics.Insets r8 = r8.m13731()
            android.view.DisplayCutout r8 = Yue.C1886.C1888.m8835(r8, r9, r10, r11, r12)
            return r8
        L24:
            r13 = 28
            if (r0 < r13) goto L53
            android.graphics.Rect r13 = new android.graphics.Rect
            int r0 = r8.f10681
            int r1 = r8.f10682
            int r2 = r8.f10683
            int r8 = r8.f10684
            r13.<init>(r0, r1, r2, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r9 == 0) goto L3f
            r8.add(r9)
        L3f:
            if (r10 == 0) goto L44
            r8.add(r10)
        L44:
            if (r11 == 0) goto L49
            r8.add(r11)
        L49:
            if (r12 == 0) goto L4e
            r8.add(r12)
        L4e:
            android.view.DisplayCutout r8 = Yue.C1886.C1887.m8829(r13, r8)
            return r8
        L53:
            r8 = 0
            return r8
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Yue.C1886 m8821(android.view.DisplayCutout r1) {
            if (r1 != 0) goto L4
            r1 = 0
            goto La
        L4:
            Yue.ۥۣ۠۟۠ r0 = new Yue.ۥۣ۠۟۠
            r0.<init>(r1)
            r1 = r0
        La:
            return r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<Yue.ۥۣ۠۟۠> r1 = Yue.C1886.class
            if (r1 == r0) goto Lf
            goto L1a
        Lf:
            Yue.ۥۣ۠۟۠ r3 = (Yue.C1886) r3
            android.view.DisplayCutout r0 = r2.f5815
            android.view.DisplayCutout r3 = r3.f5815
            boolean r3 = Yue.C4554.m18124(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r1 = this;
            android.view.DisplayCutout r0 = r1.f5815
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = Yue.C1885.m8819(r0)
        La:
            return r0
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DisplayCutoutCompat{"
            r0.append(r1)
            android.view.DisplayCutout r1 = r2.f5815
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.List<android.graphics.Rect> m8822() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.f5815
            java.util.List r0 = Yue.C1886.C1887.m8830(r0)
            return r0
        Ld:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m8823() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.f5815
            int r0 = Yue.C1886.C1887.m8831(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m8824() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.f5815
            int r0 = Yue.C1886.C1887.m8832(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m8825() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.f5815
            int r0 = Yue.C1886.C1887.m8833(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m8826() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.f5815
            int r0 = Yue.C1886.C1887.m8834(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.C3267 m8827() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            android.view.DisplayCutout r0 = r2.f5815
            android.graphics.Insets r0 = Yue.C1886.C1889.m8837(r0)
            Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.m13729(r0)
            return r0
        L11:
            Yue.ۥ۠ۥۣۡ r0 = Yue.C3267.f10680
            return r0
    }

    @Yue.InterfaceC5336(28)
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public android.view.DisplayCutout m8828() {
            r1 = this;
            android.view.DisplayCutout r0 = r1.f5815
            return r0
    }
}
