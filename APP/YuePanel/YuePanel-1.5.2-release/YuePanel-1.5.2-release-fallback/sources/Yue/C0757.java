package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0757 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۧ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(27)
    public static class C0758 {
        public C0758() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.graphics.Bitmap m4649(android.graphics.Bitmap r3) {
                android.graphics.Bitmap$Config r0 = r3.getConfig()
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
                if (r0 != r1) goto L19
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 31
                if (r1 < r2) goto L14
                android.graphics.Bitmap$Config r0 = Yue.C0757.C0760.m4653(r3)
            L14:
                r1 = 1
                android.graphics.Bitmap r3 = r3.copy(r0, r1)
            L19:
                return r3
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.graphics.Bitmap m4650(int r3, int r4, android.graphics.Bitmap r5, boolean r6) {
                android.graphics.Bitmap$Config r0 = r5.getConfig()
                android.graphics.ColorSpace r1 = r5.getColorSpace()
                android.graphics.ColorSpace$Named r2 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
                android.graphics.ColorSpace r2 = android.graphics.ColorSpace.get(r2)
                if (r6 == 0) goto L1e
                android.graphics.ColorSpace r6 = r5.getColorSpace()
                boolean r6 = r6.equals(r2)
                if (r6 != 0) goto L1e
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
                r1 = r2
                goto L32
            L1e:
                android.graphics.Bitmap$Config r6 = r5.getConfig()
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
                if (r6 != r2) goto L32
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                int r6 = android.os.Build.VERSION.SDK_INT
                r2 = 31
                if (r6 < r2) goto L32
                android.graphics.Bitmap$Config r0 = Yue.C0757.C0760.m4653(r5)
            L32:
                boolean r5 = r5.hasAlpha()
                android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r0, r5, r1)
                return r3
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m4651(android.graphics.Bitmap r3) {
                android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
                android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
                android.graphics.Bitmap$Config r1 = r3.getConfig()
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGBA_F16
                if (r1 != r2) goto L1a
                android.graphics.ColorSpace r3 = r3.getColorSpace()
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L1a
                r3 = 1
                goto L1b
            L1a:
                r3 = 0
            L1b:
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۧ۠$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C0759 {
        public C0759() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m4652(android.graphics.Paint r1) {
                android.graphics.BlendMode r0 = android.graphics.BlendMode.SRC
                r1.setBlendMode(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۧ۠$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(31)
    public static class C0760 {
        public C0760() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.graphics.Bitmap.Config m4653(android.graphics.Bitmap r1) {
                android.hardware.HardwareBuffer r1 = r1.getHardwareBuffer()
                int r1 = r1.getFormat()
                r0 = 22
                if (r1 != r0) goto Lf
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16
                return r1
            Lf:
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
                return r1
        }
    }

    public C0757() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.graphics.Bitmap m4644(@Yue.InterfaceC4410 android.graphics.Bitmap r21, int r22, int r23, @Yue.InterfaceC4544 android.graphics.Rect r24, boolean r25) {
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            if (r1 <= 0) goto L20e
            if (r2 <= 0) goto L20e
            if (r3 == 0) goto L35
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L2d
            int r4 = r3.left
            if (r4 < 0) goto L2d
            int r4 = r3.right
            int r5 = r21.getWidth()
            if (r4 > r5) goto L2d
            int r4 = r3.top
            if (r4 < 0) goto L2d
            int r4 = r3.bottom
            int r5 = r21.getHeight()
            if (r4 > r5) goto L2d
            goto L35
        L2d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "srcRect must be contained by srcBm!"
            r0.<init>(r1)
            throw r0
        L35:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 27
            if (r4 < r5) goto L40
            android.graphics.Bitmap r6 = Yue.C0757.C0758.m4649(r21)
            goto L41
        L40:
            r6 = r0
        L41:
            if (r3 == 0) goto L48
            int r7 = r24.width()
            goto L4c
        L48:
            int r7 = r21.getWidth()
        L4c:
            if (r3 == 0) goto L53
            int r8 = r24.height()
            goto L57
        L53:
            int r8 = r21.getHeight()
        L57:
            float r9 = (float) r1
            float r10 = (float) r7
            float r9 = r9 / r10
            float r10 = (float) r2
            float r11 = (float) r8
            float r10 = r10 / r11
            if (r3 == 0) goto L62
            int r12 = r3.left
            goto L63
        L62:
            r12 = 0
        L63:
            if (r3 == 0) goto L68
            int r3 = r3.top
            goto L69
        L68:
            r3 = 0
        L69:
            r13 = 1
            if (r12 != 0) goto L8c
            if (r3 != 0) goto L8c
            int r14 = r21.getWidth()
            if (r1 != r14) goto L8c
            int r14 = r21.getHeight()
            if (r2 != r14) goto L8c
            boolean r1 = r21.isMutable()
            if (r1 == 0) goto L8b
            if (r0 != r6) goto L8b
            android.graphics.Bitmap$Config r1 = r21.getConfig()
            android.graphics.Bitmap r0 = r0.copy(r1, r13)
            return r0
        L8b:
            return r6
        L8c:
            android.graphics.Paint r14 = new android.graphics.Paint
            r14.<init>(r13)
            r14.setFilterBitmap(r13)
            r15 = 29
            if (r4 < r15) goto L9c
            Yue.C0757.C0759.m4652(r14)
            goto La6
        L9c:
            android.graphics.PorterDuffXfermode r15 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC
            r15.<init>(r11)
            r14.setXfermode(r15)
        La6:
            if (r7 != r1) goto Lbf
            if (r8 != r2) goto Lbf
            android.graphics.Bitmap$Config r0 = r6.getConfig()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r2, r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            int r2 = -r12
            float r2 = (float) r2
            int r3 = -r3
            float r3 = (float) r3
            r1.drawBitmap(r6, r2, r3, r14)
            return r0
        Lbf:
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r16 = java.lang.Math.log(r16)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 <= 0) goto Lda
            r24 = r14
            double r13 = (double) r9
            double r13 = java.lang.Math.log(r13)
            double r13 = r13 / r16
            double r13 = java.lang.Math.ceil(r13)
        Ld8:
            int r9 = (int) r13
            goto Le8
        Lda:
            r24 = r14
            double r13 = (double) r9
            double r13 = java.lang.Math.log(r13)
            double r13 = r13 / r16
            double r13 = java.lang.Math.floor(r13)
            goto Ld8
        Le8:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto Lf9
            double r10 = (double) r10
            double r10 = java.lang.Math.log(r10)
            double r10 = r10 / r16
            double r10 = java.lang.Math.ceil(r10)
        Lf7:
            int r10 = (int) r10
            goto L105
        Lf9:
            double r10 = (double) r10
            double r10 = java.lang.Math.log(r10)
            double r10 = r10 / r16
            double r10 = java.lang.Math.floor(r10)
            goto Lf7
        L105:
            if (r25 == 0) goto L13b
            if (r4 < r5) goto L13b
            boolean r4 = Yue.C0757.C0758.m4651(r21)
            if (r4 != 0) goto L13b
            r4 = 1
            if (r9 <= 0) goto L117
            int r11 = m4648(r7, r1, r4, r9)
            goto L118
        L117:
            r11 = r7
        L118:
            if (r10 <= 0) goto L11f
            int r13 = m4648(r8, r2, r4, r10)
            goto L120
        L11f:
            r13 = r8
        L120:
            android.graphics.Bitmap r11 = Yue.C0757.C0758.m4650(r11, r13, r0, r4)
            android.graphics.Canvas r13 = new android.graphics.Canvas
            r13.<init>(r11)
            int r12 = -r12
            float r12 = (float) r12
            int r3 = -r3
            float r3 = (float) r3
            r14 = r24
            r13.drawBitmap(r6, r12, r3, r14)
            r13 = r4
            r3 = 0
            r12 = 0
            r20 = r11
            r11 = r6
            r6 = r20
            goto L140
        L13b:
            r14 = r24
            r4 = 1
            r11 = 0
            r13 = 0
        L140:
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>(r12, r3, r7, r8)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r12 = r9
            r16 = r10
        L14d:
            if (r12 != 0) goto L15a
            if (r16 == 0) goto L152
            goto L15a
        L152:
            if (r11 == r0) goto L159
            if (r11 == 0) goto L159
            r11.recycle()
        L159:
            return r6
        L15a:
            if (r12 >= 0) goto L15f
            int r12 = r12 + 1
            goto L163
        L15f:
            if (r12 <= 0) goto L163
            int r12 = r12 + (-1)
        L163:
            if (r16 >= 0) goto L16a
            int r16 = r16 + 1
        L167:
            r4 = r16
            goto L16f
        L16a:
            if (r16 <= 0) goto L167
            int r16 = r16 + (-1)
            goto L167
        L16f:
            int r5 = m4648(r7, r1, r12, r9)
            r24 = r14
            int r14 = m4648(r8, r2, r4, r10)
            r18 = r15
            r15 = 0
            r3.set(r15, r15, r5, r14)
            if (r12 != 0) goto L185
            if (r4 != 0) goto L185
            r5 = 1
            goto L186
        L185:
            r5 = r15
        L186:
            if (r11 == 0) goto L196
            int r14 = r11.getWidth()
            if (r14 != r1) goto L196
            int r14 = r11.getHeight()
            if (r14 != r2) goto L196
            r14 = 1
            goto L197
        L196:
            r14 = r15
        L197:
            if (r11 == 0) goto L1b9
            if (r11 == r0) goto L1b9
            if (r25 == 0) goto L1ac
            int r15 = android.os.Build.VERSION.SDK_INT
            r19 = r3
            r3 = 27
            if (r15 < r3) goto L1ae
            boolean r3 = Yue.C0757.C0758.m4651(r11)
            if (r3 == 0) goto L1bb
            goto L1ae
        L1ac:
            r19 = r3
        L1ae:
            if (r5 == 0) goto L1b5
            if (r14 == 0) goto L1bb
            if (r13 == 0) goto L1b5
            goto L1bb
        L1b5:
            r3 = r11
            r15 = 27
            goto L1ee
        L1b9:
            r19 = r3
        L1bb:
            if (r11 == r0) goto L1c2
            if (r11 == 0) goto L1c2
            r11.recycle()
        L1c2:
            if (r12 <= 0) goto L1c6
            r3 = r13
            goto L1c7
        L1c6:
            r3 = r12
        L1c7:
            int r3 = m4648(r7, r1, r3, r9)
            if (r4 <= 0) goto L1cf
            r11 = r13
            goto L1d0
        L1cf:
            r11 = r4
        L1d0:
            int r11 = m4648(r8, r2, r11, r10)
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 27
            if (r14 < r15) goto L1e6
            if (r25 == 0) goto L1e0
            if (r5 != 0) goto L1e0
            r5 = 1
            goto L1e1
        L1e0:
            r5 = 0
        L1e1:
            android.graphics.Bitmap r3 = Yue.C0757.C0758.m4650(r3, r11, r0, r5)
            goto L1ee
        L1e6:
            android.graphics.Bitmap$Config r5 = r6.getConfig()
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r11, r5)
        L1ee:
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r3)
            r11 = r24
            r14 = r18
            r15 = r19
            r5.drawBitmap(r6, r14, r15, r11)
            r14.set(r15)
            r16 = r4
            r4 = 1
            r5 = 27
            r20 = r6
            r6 = r3
            r3 = r15
            r15 = r14
            r14 = r11
            r11 = r20
            goto L14d
        L20e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "dstW and dstH must be > 0!"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m4645(@Yue.InterfaceC4410 android.graphics.Bitmap r0) {
            int r0 = r0.getAllocationByteCount()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m4646(@Yue.InterfaceC4410 android.graphics.Bitmap r0) {
            boolean r0 = r0.hasMipMap()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m4647(@Yue.InterfaceC4410 android.graphics.Bitmap r0, boolean r1) {
            r0.setHasMipMap(r1)
            return
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m4648(int r1, int r2, int r3, int r4) {
            if (r3 != 0) goto L3
            return r2
        L3:
            r0 = 1
            if (r3 <= 0) goto Lb
            int r4 = r4 - r3
            int r2 = r0 << r4
            int r1 = r1 * r2
            return r1
        Lb:
            int r1 = -r3
            int r1 = r1 - r0
            int r1 = r2 << r1
            return r1
    }
}
