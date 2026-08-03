package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1880 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f5810 = 3840;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f5811 = 2160;

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۢۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C1881 {
        public C1881() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static Yue.C1880.C1882 m8808(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.view.Display r2) {
                android.view.Display$Mode r0 = r2.getMode()
                android.graphics.Point r1 = Yue.C1880.m8798(r1, r2)
                if (r1 == 0) goto L17
                boolean r2 = m8811(r0, r1)
                if (r2 == 0) goto L11
                goto L17
            L11:
                Yue.ۥ۠۟ۢۨ$ۥ۟ r2 = new Yue.ۥ۠۟ۢۨ$ۥ۟
                r2.<init>(r0, r1)
                goto L1d
            L17:
                Yue.ۥ۠۟ۢۨ$ۥ۟ r2 = new Yue.ۥ۠۟ۢۨ$ۥ۟
                r1 = 1
                r2.<init>(r0, r1)
            L1d:
                return r2
        }

        @Yue.InterfaceC4410
        @android.annotation.SuppressLint({"ArrayReturn"})
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static Yue.C1880.C1882[] m8809(@Yue.InterfaceC4410 android.content.Context r6, @Yue.InterfaceC4410 android.view.Display r7) {
                android.view.Display$Mode[] r0 = r7.getSupportedModes()
                int r1 = r0.length
                Yue.ۥ۠۟ۢۨ$ۥ۟[] r1 = new Yue.C1880.C1882[r1]
                android.view.Display$Mode r2 = r7.getMode()
                android.graphics.Point r6 = Yue.C1880.m8798(r6, r7)
                r7 = 0
                if (r6 == 0) goto L39
                boolean r3 = m8811(r2, r6)
                if (r3 == 0) goto L19
                goto L39
            L19:
                r3 = r7
            L1a:
                int r4 = r0.length
                if (r3 >= r4) goto L4e
                r4 = r0[r3]
                boolean r4 = m8812(r4, r2)
                if (r4 == 0) goto L2d
                Yue.ۥ۠۟ۢۨ$ۥ۟ r4 = new Yue.ۥ۠۟ۢۨ$ۥ۟
                r5 = r0[r3]
                r4.<init>(r5, r6)
                goto L34
            L2d:
                Yue.ۥ۠۟ۢۨ$ۥ۟ r4 = new Yue.ۥ۠۟ۢۨ$ۥ۟
                r5 = r0[r3]
                r4.<init>(r5, r7)
            L34:
                r1[r3] = r4
                int r3 = r3 + 1
                goto L1a
            L39:
                int r6 = r0.length
                if (r7 >= r6) goto L4e
                r6 = r0[r7]
                boolean r6 = m8812(r6, r2)
                Yue.ۥ۠۟ۢۨ$ۥ۟ r3 = new Yue.ۥ۠۟ۢۨ$ۥ۟
                r4 = r0[r7]
                r3.<init>(r4, r6)
                r1[r7] = r3
                int r7 = r7 + 1
                goto L39
            L4e:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m8810(@Yue.InterfaceC4410 android.view.Display r7) {
                android.view.Display$Mode r0 = r7.getMode()
                android.view.Display$Mode[] r7 = r7.getSupportedModes()
                int r1 = r7.length
                r2 = 0
                r3 = r2
            Lb:
                if (r3 >= r1) goto L28
                r4 = r7[r3]
                int r5 = r0.getPhysicalHeight()
                int r6 = r4.getPhysicalHeight()
                if (r5 < r6) goto L27
                int r5 = r0.getPhysicalWidth()
                int r4 = r4.getPhysicalWidth()
                if (r5 >= r4) goto L24
                goto L27
            L24:
                int r3 = r3 + 1
                goto Lb
            L27:
                return r2
            L28:
                r7 = 1
                return r7
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m8811(android.view.Display.Mode r2, android.graphics.Point r3) {
                int r0 = r2.getPhysicalWidth()
                int r1 = r3.x
                if (r0 != r1) goto L10
                int r0 = r2.getPhysicalHeight()
                int r1 = r3.y
                if (r0 == r1) goto L20
            L10:
                int r0 = r2.getPhysicalWidth()
                int r1 = r3.y
                if (r0 != r1) goto L22
                int r2 = r2.getPhysicalHeight()
                int r3 = r3.x
                if (r2 != r3) goto L22
            L20:
                r2 = 1
                goto L23
            L22:
                r2 = 0
            L23:
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m8812(android.view.Display.Mode r2, android.view.Display.Mode r3) {
                int r0 = r2.getPhysicalWidth()
                int r1 = r3.getPhysicalWidth()
                if (r0 != r1) goto L16
                int r2 = r2.getPhysicalHeight()
                int r3 = r3.getPhysicalHeight()
                if (r2 != r3) goto L16
                r2 = 1
                goto L17
            L16:
                r2 = 0
            L17:
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۢۨ$ۥ۟, reason: contains not printable characters */
    public static final class C1882 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.view.Display.Mode f5812;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.graphics.Point f5813;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean f5814;

        /* JADX INFO: renamed from: Yue.ۥ۠۟ۢۨ$ۥ۟$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC5336(23)
        public static class C1883 {
            public C1883() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Yue.InterfaceC1947
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public static int m8817(android.view.Display.Mode r0) {
                    int r0 = r0.getPhysicalHeight()
                    return r0
            }

            @Yue.InterfaceC1947
            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public static int m8818(android.view.Display.Mode r0) {
                    int r0 = r0.getPhysicalWidth()
                    return r0
            }
        }

        public C1882(@Yue.InterfaceC4410 android.graphics.Point r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "physicalSize == null"
                Yue.C4868.m19182(r2, r0)
                r1.f5813 = r2
                r2 = 0
                r1.f5812 = r2
                r2 = 1
                r1.f5814 = r2
                return
        }

        @Yue.InterfaceC5336(23)
        public C1882(@Yue.InterfaceC4410 android.view.Display.Mode r2, @Yue.InterfaceC4410 android.graphics.Point r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "mode == null, can't wrap a null reference"
                Yue.C4868.m19182(r2, r0)
                java.lang.String r0 = "physicalSize == null"
                Yue.C4868.m19182(r3, r0)
                r1.f5813 = r3
                r1.f5812 = r2
                r2 = 1
                r1.f5814 = r2
                return
        }

        @Yue.InterfaceC5336(23)
        public C1882(@Yue.InterfaceC4410 android.view.Display.Mode r4, boolean r5) {
                r3 = this;
                r3.<init>()
                java.lang.String r0 = "mode == null, can't wrap a null reference"
                Yue.C4868.m19182(r4, r0)
                android.graphics.Point r0 = new android.graphics.Point
                int r1 = Yue.C1880.C1882.C1883.m8818(r4)
                int r2 = Yue.C1880.C1882.C1883.m8817(r4)
                r0.<init>(r1, r2)
                r3.f5813 = r0
                r3.f5812 = r4
                r3.f5814 = r5
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int m8813() {
                r1 = this;
                android.graphics.Point r0 = r1.f5813
                int r0 = r0.y
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int m8814() {
                r1 = this;
                android.graphics.Point r0 = r1.f5813
                int r0 = r0.x
                return r0
        }

        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m8815() {
                r1 = this;
                boolean r0 = r1.f5814
                return r0
        }

        @Yue.InterfaceC4544
        @Yue.InterfaceC5336(23)
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public android.view.Display.Mode m8816() {
                r1 = this;
                android.view.Display$Mode r0 = r1.f5812
                return r0
        }
    }

    public C1880() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.graphics.Point m8798(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.view.Display r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Ld
            java.lang.String r0 = "sys.display-size"
            android.graphics.Point r0 = m8807(r0, r3)
            goto L13
        Ld:
            java.lang.String r0 = "vendor.display-size"
            android.graphics.Point r0 = m8807(r0, r3)
        L13:
            if (r0 == 0) goto L16
            return r0
        L16:
            boolean r2 = m8804(r2)
            r0 = 0
            if (r2 == 0) goto L2c
            boolean r2 = m8803(r3)
            if (r2 == 0) goto L2c
            android.graphics.Point r0 = new android.graphics.Point
            r2 = 3840(0xf00, float:5.381E-42)
            r3 = 2160(0x870, float:3.027E-42)
            r0.<init>(r2, r3)
        L2c:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.graphics.Point m8799(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4410 android.view.Display r1) {
            android.graphics.Point r0 = m8798(r0, r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r1.getRealSize(r0)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C1880.C1882 m8800(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4410 android.view.Display r1) {
            Yue.ۥ۠۟ۢۨ$ۥ۟ r0 = Yue.C1880.C1881.m8808(r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    @android.annotation.SuppressLint({"ArrayReturn"})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C1880.C1882[] m8801(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4410 android.view.Display r1) {
            Yue.ۥ۠۟ۢۨ$ۥ۟[] r0 = Yue.C1880.C1881.m8809(r0, r1)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.String m8802(java.lang.String r3) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = "get"
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Exception -> L1d
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L1d
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L1d
            java.lang.Object r3 = r1.invoke(r0, r3)     // Catch: java.lang.Exception -> L1d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L1d
            return r3
        L1d:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m8803(@Yue.InterfaceC4410 android.view.Display r0) {
            boolean r0 = Yue.C1880.C1881.m8810(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m8804(@Yue.InterfaceC4410 android.content.Context r2) {
            boolean r0 = m8805(r2)
            if (r0 == 0) goto L28
            java.lang.String r0 = "Sony"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "BRAVIA"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L28
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L28
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m8805(@Yue.InterfaceC4410 android.content.Context r1) {
            java.lang.String r0 = "uimode"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.UiModeManager r1 = (android.app.UiModeManager) r1
            if (r1 == 0) goto L13
            int r1 = r1.getCurrentModeType()
            r0 = 4
            if (r1 != r0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static android.graphics.Point m8806(@Yue.InterfaceC4410 java.lang.String r2) throws java.lang.NumberFormatException {
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "x"
            r1 = -1
            java.lang.String[] r2 = r2.split(r0, r1)
            int r0 = r2.length
            r1 = 2
            if (r0 != r1) goto L27
            r0 = 0
            r0 = r2[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r1 = 1
            r2 = r2[r1]
            int r2 = java.lang.Integer.parseInt(r2)
            if (r0 <= 0) goto L27
            if (r2 <= 0) goto L27
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r0, r2)
            return r1
        L27:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            r2.<init>()
            throw r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static android.graphics.Point m8807(@Yue.InterfaceC4410 java.lang.String r1, @Yue.InterfaceC4410 android.view.Display r2) {
            int r2 = r2.getDisplayId()
            r0 = 0
            if (r2 == 0) goto L8
            return r0
        L8:
            java.lang.String r1 = m8802(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L1a
            if (r1 != 0) goto L15
            goto L1a
        L15:
            android.graphics.Point r1 = m8806(r1)     // Catch: java.lang.NumberFormatException -> L1a
            return r1
        L1a:
            return r0
    }
}
