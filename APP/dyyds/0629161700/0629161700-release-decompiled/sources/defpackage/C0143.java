package defpackage;

/* JADX INFO: renamed from: ᛱᛸᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0143 {
    static {
            r0 = -1155144623758894(0xfffbe566ef0961d2, double:NaN)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static android.graphics.Bitmap m664(android.media.Image r18) {
            int r3 = r18.getWidth()
            int r7 = r18.getHeight()
            android.media.Image$Plane[] r0 = r18.getPlanes()
            r1 = 0
            r0 = r0[r1]
            android.media.Image$Plane[] r2 = r18.getPlanes()
            r4 = 1
            r2 = r2[r4]
            android.media.Image$Plane[] r4 = r18.getPlanes()
            r5 = 2
            r4 = r4[r5]
            java.nio.ByteBuffer r5 = r0.getBuffer()
            java.nio.ByteBuffer r6 = r2.getBuffer()
            java.nio.ByteBuffer r4 = r4.getBuffer()
            int r0 = r0.getRowStride()
            int r8 = r2.getRowStride()
            int r2 = r2.getPixelStride()
            int r9 = r3 * r7
            int[] r9 = new int[r9]
            r10 = r1
        L3a:
            if (r10 >= r7) goto La5
            r11 = r1
        L3d:
            if (r11 >= r3) goto La1
            int r12 = r10 * r0
            int r12 = r12 + r11
            int r13 = r10 / 2
            int r14 = r11 / 2
            int r13 = r13 * r8
            int r14 = r14 * r2
            int r14 = r14 + r13
            byte r12 = r5.get(r12)
            r13 = 255(0xff, float:3.57E-43)
            r12 = r12 & r13
            float r12 = (float) r12
            byte r15 = r6.get(r14)
            r15 = r15 & r13
            float r15 = (float) r15
            r16 = 1124073472(0x43000000, float:128.0)
            float r15 = r15 - r16
            byte r14 = r4.get(r14)
            r14 = r14 & r13
            float r14 = (float) r14
            float r14 = r14 - r16
            r16 = 1068462915(0x3faf7343, float:1.370705)
            float r16 = r16 * r14
            float r1 = r16 + r12
            int r1 = (int) r1
            r16 = 1051516476(0x3eacde3c, float:0.337633)
            float r16 = r16 * r15
            float r16 = r12 - r16
            r17 = 1060286514(0x3f32b032, float:0.698001)
            float r14 = r14 * r17
            float r14 = r16 - r14
            int r14 = (int) r14
            r16 = 1071497418(0x3fddc0ca, float:1.732446)
            float r15 = r15 * r16
            float r15 = r15 + r12
            int r12 = (int) r15
            r15 = 0
            int r1 = defpackage.AbstractC1754.m3135(r1, r15, r13)
            int r14 = defpackage.AbstractC1754.m3135(r14, r15, r13)
            int r12 = defpackage.AbstractC1754.m3135(r12, r15, r13)
            int r13 = r10 * r3
            int r13 = r13 + r11
            int r1 = r1 << 16
            r16 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 | r16
            int r14 = r14 << 8
            r1 = r1 | r14
            r1 = r1 | r12
            r9[r13] = r1
            int r11 = r11 + 1
            r1 = r15
            goto L3d
        La1:
            r15 = r1
            int r10 = r10 + 1
            goto L3a
        La5:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r7, r0)
            r1 = -1154947055263278(0xfffbe594ef0961d2, double:NaN)
            r4 = 0
            r5 = 0
            r2 = 0
            r6 = r3
            r1 = r9
            r0.setPixels(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static android.graphics.Bitmap m665(android.media.Image r5) {
            r0 = 0
            int r1 = r5.getFormat()     // Catch: java.lang.Exception -> Le
            r2 = 35
            if (r1 != r2) goto L10
            android.graphics.Bitmap r5 = m664(r5)     // Catch: java.lang.Exception -> Le
            return r5
        Le:
            r5 = move-exception
            goto L35
        L10:
            ᛲᲀᛱᲁ r1 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> Le
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le
            r2.<init>()     // Catch: java.lang.Exception -> Le
            r3 = -1154788141473326(0xfffbe5b9ef0961d2, double:NaN)
            java.lang.String r3 = "不支持的图像格式: "     // Catch: java.lang.Exception -> Le
            r2.append(r3)     // Catch: java.lang.Exception -> Le
            int r5 = r5.getFormat()     // Catch: java.lang.Exception -> Le
            r2.append(r5)     // Catch: java.lang.Exception -> Le
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> Le
            r1.getClass()     // Catch: java.lang.Exception -> Le
            defpackage.C0346.m1040(r5)     // Catch: java.lang.Exception -> Le
            return r0
        L35:
            r1 = -1154835386113582(0xfffbe5aeef0961d2, double:NaN)
            java.lang.String r1 = "HeifToGifConverter"
            r2 = -1154916990492206(0xfffbe59bef0961d2, double:NaN)
            java.lang.String r2 = "图像转换失败"
            android.util.Log.e(r1, r2, r5)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m666(java.util.ArrayList r10, int[] r11, java.io.File r12) {
            r9 = this;
            java.io.FileOutputStream r9 = new java.io.FileOutputStream
            r9.<init>(r12)
            java.io.BufferedOutputStream r12 = new java.io.BufferedOutputStream
            r0 = 65536(0x10000, float:9.1835E-41)
            r12.<init>(r9, r0)
            r0 = 0
            ᛸᛶᲈ r1 = new ᛸᛶᲈ     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            java.io.BufferedOutputStream r2 = r1.f6707     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r3 = 10
            r1.f6702 = r3     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r4 = -1155488221142574(0xfffbe516ef0961d2, double:NaN)
            r6 = 1
            java.lang.String r4 = "GIF89a"     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L44
            java.nio.charset.Charset r5 = defpackage.AbstractC1422.f6221     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L44
            byte[] r4 = r4.getBytes(r5)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L44
            r7 = -1155775983951406(0xfffbe4d3ef0961d2, double:NaN)
            r2.write(r4)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L44
            r1.f6710 = r6     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L44
        L35:
            int r4 = r10.size()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r5 = r0
        L3a:
            if (r5 >= r4) goto L59
            if (r5 < 0) goto L48
            int r7 = r11.length     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r5 >= r7) goto L48
            r7 = r11[r5]     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            goto L4a
        L44:
            r10 = move-exception
            goto L90
        L46:
            r10 = move-exception
            goto L74
        L48:
            r7 = 100
        L4a:
            int r7 = r7 / r3
            r1.f6704 = r7     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            java.lang.Object r7 = r10.get(r5)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r1.m2767(r7)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            int r5 = r5 + 1
            goto L3a
        L59:
            boolean r10 = r1.f6710     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            if (r10 != 0) goto L5e
            goto L6c
        L5e:
            r10 = 59
            r2.write(r10)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L6c
            r2.flush()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L6c
            r1.f6710 = r0     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L6c
            r1.f6705 = r0     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L6c
            r1.f6703 = r6     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L6c
        L6c:
            r12.close()     // Catch: java.lang.Exception -> L6f
        L6f:
            r9.close()     // Catch: java.lang.Exception -> L72
        L72:
            r0 = r6
            goto L8f
        L74:
            r1 = -1155024364674606(0xfffbe582ef0961d2, double:NaN)
            java.lang.String r11 = "HeifToGifConverter"     // Catch: java.lang.Throwable -> L44
            r1 = -1155105969053230(0xfffbe56fef0961d2, double:NaN)
            java.lang.String r1 = "GIF 编码异常"     // Catch: java.lang.Throwable -> L44
            android.util.Log.e(r11, r1, r10)     // Catch: java.lang.Throwable -> L44
            r12.close()     // Catch: java.lang.Exception -> L8c
        L8c:
            r9.close()     // Catch: java.lang.Exception -> L8f
        L8f:
            return r0
        L90:
            r12.close()     // Catch: java.lang.Exception -> L93
        L93:
            r9.close()     // Catch: java.lang.Exception -> L96
        L96:
            throw r10
    }
}
