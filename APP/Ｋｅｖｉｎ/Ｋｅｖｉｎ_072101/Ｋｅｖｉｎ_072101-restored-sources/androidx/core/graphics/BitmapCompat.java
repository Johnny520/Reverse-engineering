package androidx.core.graphics;

/* JADX INFO: loaded from: classes2.dex */
public final class BitmapCompat {

    static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean hasMipMap(android.graphics.Bitmap r1) {
                boolean r0 = r1.hasMipMap()
                return r0
        }

        static void setHasMipMap(android.graphics.Bitmap r0, boolean r1) {
                r0.setHasMipMap(r1)
                return
        }
    }

    static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getAllocationByteCount(android.graphics.Bitmap r1) {
                int r0 = r1.getAllocationByteCount()
                return r0
        }
    }

    static class Api27Impl {
        private Api27Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Bitmap copyBitmapIfHardware(android.graphics.Bitmap r3) {
                android.graphics.Bitmap$Config r0 = r3.getConfig()
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
                if (r0 != r1) goto L1a
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 31
                if (r1 < r2) goto L14
                android.graphics.Bitmap$Config r0 = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(r3)
            L14:
                r1 = 1
                android.graphics.Bitmap r1 = r3.copy(r0, r1)
                return r1
            L1a:
                return r3
        }

        static android.graphics.Bitmap createBitmapWithSourceColorspace(int r5, int r6, android.graphics.Bitmap r7, boolean r8) {
                android.graphics.Bitmap$Config r0 = r7.getConfig()
                android.graphics.ColorSpace r1 = r7.getColorSpace()
                android.graphics.ColorSpace$Named r2 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
                android.graphics.ColorSpace r2 = android.graphics.ColorSpace.get(r2)
                if (r8 == 0) goto L1e
                android.graphics.ColorSpace r3 = r7.getColorSpace()
                boolean r3 = r3.equals(r2)
                if (r3 != 0) goto L1e
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
                r1 = r2
                goto L32
            L1e:
                android.graphics.Bitmap$Config r3 = r7.getConfig()
                android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.HARDWARE
                if (r3 != r4) goto L32
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 31
                if (r3 < r4) goto L32
                android.graphics.Bitmap$Config r0 = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(r7)
            L32:
                boolean r3 = r7.hasAlpha()
                android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r5, r6, r0, r3, r1)
                return r3
        }

        static boolean isAlreadyF16AndLinear(android.graphics.Bitmap r3) {
                android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
                android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
                android.graphics.Bitmap$Config r1 = r3.getConfig()
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGBA_F16
                if (r1 != r2) goto L1a
                android.graphics.ColorSpace r1 = r3.getColorSpace()
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L1a
                r1 = 1
                goto L1b
            L1a:
                r1 = 0
            L1b:
                return r1
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setPaintBlendMode(android.graphics.Paint r1) {
                android.graphics.BlendMode r0 = android.graphics.BlendMode.SRC
                r1.setBlendMode(r0)
                return
        }
    }

    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Bitmap.Config getHardwareBitmapConfig(android.graphics.Bitmap r2) {
                android.hardware.HardwareBuffer r0 = r2.getHardwareBuffer()
                int r0 = r0.getFormat()
                r1 = 22
                if (r0 != r1) goto Lf
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
                return r0
            Lf:
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                return r0
        }
    }

    private BitmapCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Bitmap createScaledBitmap(android.graphics.Bitmap r30, int r31, int r32, android.graphics.Rect r33, boolean r34) {
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            if (r1 <= 0) goto L24f
            if (r2 <= 0) goto L24f
            if (r3 == 0) goto L35
            boolean r4 = r33.isEmpty()
            if (r4 != 0) goto L2d
            int r4 = r3.left
            if (r4 < 0) goto L2d
            int r4 = r3.right
            int r5 = r30.getWidth()
            if (r4 > r5) goto L2d
            int r4 = r3.top
            if (r4 < 0) goto L2d
            int r4 = r3.bottom
            int r5 = r30.getHeight()
            if (r4 > r5) goto L2d
            goto L35
        L2d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "srcRect must be contained by srcBm!"
            r4.<init>(r5)
            throw r4
        L35:
            r4 = r30
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 27
            if (r5 < r6) goto L41
            android.graphics.Bitmap r4 = androidx.core.graphics.BitmapCompat.Api27Impl.copyBitmapIfHardware(r30)
        L41:
            if (r3 == 0) goto L48
            int r5 = r33.width()
            goto L4c
        L48:
            int r5 = r30.getWidth()
        L4c:
            if (r3 == 0) goto L53
            int r7 = r33.height()
            goto L57
        L53:
            int r7 = r30.getHeight()
        L57:
            float r8 = (float) r1
            float r9 = (float) r5
            float r8 = r8 / r9
            float r9 = (float) r2
            float r10 = (float) r7
            float r9 = r9 / r10
            if (r3 == 0) goto L62
            int r11 = r3.left
            goto L63
        L62:
            r11 = 0
        L63:
            if (r3 == 0) goto L68
            int r12 = r3.top
            goto L69
        L68:
            r12 = 0
        L69:
            r13 = 1
            if (r11 != 0) goto L8c
            if (r12 != 0) goto L8c
            int r14 = r30.getWidth()
            if (r1 != r14) goto L8c
            int r14 = r30.getHeight()
            if (r2 != r14) goto L8c
            boolean r6 = r30.isMutable()
            if (r6 == 0) goto L8b
            if (r0 != r4) goto L8b
            android.graphics.Bitmap$Config r6 = r30.getConfig()
            android.graphics.Bitmap r6 = r0.copy(r6, r13)
            return r6
        L8b:
            return r4
        L8c:
            android.graphics.Paint r14 = new android.graphics.Paint
            r14.<init>(r13)
            r14.setFilterBitmap(r13)
            int r15 = android.os.Build.VERSION.SDK_INT
            r10 = 29
            if (r15 < r10) goto L9e
            androidx.core.graphics.BitmapCompat.Api29Impl.setPaintBlendMode(r14)
            goto La8
        L9e:
            android.graphics.PorterDuffXfermode r10 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r15 = android.graphics.PorterDuff.Mode.SRC
            r10.<init>(r15)
            r14.setXfermode(r10)
        La8:
            if (r5 != r1) goto Lc1
            if (r7 != r2) goto Lc1
            android.graphics.Bitmap$Config r6 = r4.getConfig()
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r1, r2, r6)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r6)
            int r13 = -r11
            float r13 = (float) r13
            int r15 = -r12
            float r15 = (float) r15
            r10.drawBitmap(r4, r13, r15, r14)
            return r6
        Lc1:
            r17 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r17 = java.lang.Math.log(r17)
            r10 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 <= 0) goto Ldb
            r15 = r14
            double r13 = (double) r8
            double r13 = java.lang.Math.log(r13)
            double r13 = r13 / r17
            double r13 = java.lang.Math.ceil(r13)
            int r13 = (int) r13
            goto Le8
        Ldb:
            r15 = r14
            double r13 = (double) r8
            double r13 = java.lang.Math.log(r13)
            double r13 = r13 / r17
            double r13 = java.lang.Math.floor(r13)
            int r13 = (int) r13
        Le8:
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 <= 0) goto Lfb
            r10 = r7
            double r6 = (double) r9
            double r6 = java.lang.Math.log(r6)
            double r6 = r6 / r17
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            goto L108
        Lfb:
            r10 = r7
            double r6 = (double) r9
            double r6 = java.lang.Math.log(r6)
            double r6 = r6 / r17
            double r6 = java.lang.Math.floor(r6)
            int r6 = (int) r6
        L108:
            r7 = r13
            r20 = r6
            r21 = 0
            r22 = 0
            if (r34 == 0) goto L16a
            int r14 = android.os.Build.VERSION.SDK_INT
            r3 = 27
            if (r14 < r3) goto L161
            boolean r3 = androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(r30)
            if (r3 != 0) goto L161
            if (r13 <= 0) goto L126
            r3 = 1
            int r19 = sizeAtStep(r5, r1, r3, r7)
            goto L129
        L126:
            r3 = 1
            r19 = r5
        L129:
            r23 = r19
            if (r6 <= 0) goto L134
            r14 = r20
            int r20 = sizeAtStep(r10, r2, r3, r14)
            goto L138
        L134:
            r14 = r20
            r20 = r10
        L138:
            r24 = r20
            r20 = r6
            r6 = r23
            r23 = r8
            r8 = r24
            r24 = r9
            android.graphics.Bitmap r9 = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(r6, r8, r0, r3)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r9)
            r25 = r6
            int r6 = -r11
            float r6 = (float) r6
            r26 = r8
            int r8 = -r12
            float r8 = (float) r8
            r3.drawBitmap(r4, r6, r8, r15)
            r11 = 0
            r12 = 0
            r6 = r9
            r21 = r4
            r4 = r6
            r22 = 1
            goto L172
        L161:
            r23 = r8
            r24 = r9
            r14 = r20
            r20 = r6
            goto L172
        L16a:
            r23 = r8
            r24 = r9
            r14 = r20
            r20 = r6
        L172:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r11, r12, r5, r10)
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r8 = r21
        L17e:
            if (r13 != 0) goto L18b
            if (r20 == 0) goto L183
            goto L18b
        L183:
            if (r8 == r0) goto L18a
            if (r8 == 0) goto L18a
            r8.recycle()
        L18a:
            return r4
        L18b:
            if (r13 >= 0) goto L190
            int r13 = r13 + 1
            goto L194
        L190:
            if (r13 <= 0) goto L194
            int r13 = r13 + (-1)
        L194:
            if (r20 >= 0) goto L19b
            int r20 = r20 + 1
            r9 = r20
            goto L1a4
        L19b:
            if (r20 <= 0) goto L1a2
            int r20 = r20 + (-1)
            r9 = r20
            goto L1a4
        L1a2:
            r9 = r20
        L1a4:
            r20 = r11
            int r11 = sizeAtStep(r5, r1, r13, r7)
            r21 = r12
            int r12 = sizeAtStep(r10, r2, r9, r14)
            r25 = r3
            r3 = 0
            r6.set(r3, r3, r11, r12)
            if (r13 != 0) goto L1bd
            if (r9 != 0) goto L1bd
            r16 = 1
            goto L1bf
        L1bd:
            r16 = r3
        L1bf:
            if (r8 == 0) goto L1cf
            int r3 = r8.getWidth()
            if (r3 != r1) goto L1cf
            int r3 = r8.getHeight()
            if (r3 != r2) goto L1cf
            r3 = 1
            goto L1d0
        L1cf:
            r3 = 0
        L1d0:
            if (r8 == 0) goto L1f7
            if (r8 == r0) goto L1f7
            if (r34 == 0) goto L1e7
            r27 = r11
            int r11 = android.os.Build.VERSION.SDK_INT
            r28 = r12
            r12 = 27
            if (r11 < r12) goto L1eb
            boolean r12 = androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(r8)
            if (r12 == 0) goto L1f1
            goto L1eb
        L1e7:
            r27 = r11
            r28 = r12
        L1eb:
            if (r16 == 0) goto L1f2
            if (r3 == 0) goto L1f1
            if (r22 == 0) goto L1f2
        L1f1:
            goto L1fb
        L1f2:
            r29 = r3
            r3 = 27
            goto L232
        L1f7:
            r27 = r11
            r28 = r12
        L1fb:
            if (r8 == r0) goto L202
            if (r8 == 0) goto L202
            r8.recycle()
        L202:
            r12 = r22
            if (r13 <= 0) goto L208
            r11 = r12
            goto L209
        L208:
            r11 = r13
        L209:
            int r11 = sizeAtStep(r5, r1, r11, r7)
            if (r9 <= 0) goto L211
            r1 = r12
            goto L212
        L211:
            r1 = r9
        L212:
            int r1 = sizeAtStep(r10, r2, r1, r14)
            int r2 = android.os.Build.VERSION.SDK_INT
            r29 = r3
            r3 = 27
            if (r2 < r3) goto L22a
            if (r34 == 0) goto L224
            if (r16 != 0) goto L224
            r2 = 1
            goto L225
        L224:
            r2 = 0
        L225:
            android.graphics.Bitmap r8 = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(r11, r1, r0, r2)
            goto L232
        L22a:
            android.graphics.Bitmap$Config r2 = r4.getConfig()
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r11, r1, r2)
        L232:
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r8)
            r2 = r25
            r1.drawBitmap(r4, r2, r6, r15)
            r11 = r4
            r4 = r8
            r8 = r11
            r2.set(r6)
            r1 = r31
            r3 = r2
            r11 = r20
            r12 = r21
            r2 = r32
            r20 = r9
            goto L17e
        L24f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "dstW and dstH must be > 0!"
            r1.<init>(r2)
            throw r1
    }

    public static int getAllocationByteCount(android.graphics.Bitmap r1) {
            int r0 = androidx.core.graphics.BitmapCompat.Api19Impl.getAllocationByteCount(r1)
            return r0
    }

    public static boolean hasMipMap(android.graphics.Bitmap r1) {
            boolean r0 = androidx.core.graphics.BitmapCompat.Api17Impl.hasMipMap(r1)
            return r0
    }

    public static void setHasMipMap(android.graphics.Bitmap r0, boolean r1) {
            androidx.core.graphics.BitmapCompat.Api17Impl.setHasMipMap(r0, r1)
            return
    }

    static int sizeAtStep(int r2, int r3, int r4, int r5) {
            if (r4 != 0) goto L3
            return r3
        L3:
            r0 = 1
            if (r4 <= 0) goto Lb
            int r1 = r5 - r4
            int r0 = r0 << r1
            int r0 = r0 * r2
            return r0
        Lb:
            int r1 = -r4
            int r1 = r1 - r0
            int r0 = r3 << r1
            return r0
    }
}
