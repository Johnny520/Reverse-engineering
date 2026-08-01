package defpackage;

/* JADX INFO: renamed from: ᲀᛶᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1694 {
    static {
            r0 = -1150866836332078(0xfffbe94aef0961d2, double:NaN)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C2194 m3073(java.io.File r36, java.io.File r37) {
            r35 = this;
            java.lang.String r1 = r36.getAbsolutePath()
            r2 = -1149810274377262(0xfffbea40ef0961d2, double:NaN)
            r2 = -1148715057716782(0xfffbeb3fef0961d2, double:NaN)
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r2 = r0.exists()
            r4 = 3
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L5a
            long r9 = r0.length()
            r11 = 12
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 >= 0) goto L2d
            goto L5a
        L2d:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            r9 = -1148753712422446(0xfffbeb36ef0961d2, double:NaN)
            java.lang.String r9 = "r"
            r2.<init>(r0, r9)
            r0 = 4
            byte[] r9 = new byte[r0]     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            r2.readFully(r9)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            java.nio.charset.Charset r13 = defpackage.AbstractC1422.f6219     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            r10.<init>(r9, r13)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            r14 = -1148762302357038(0xfffbeb34ef0961d2, double:NaN)
            java.lang.String r9 = "RIFF"     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            boolean r9 = r10.equals(r9)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            if (r9 != 0) goto L5f
        L57:
            r2.close()
        L5a:
            r35 = 2
        L5c:
            r14 = 0
            goto L263
        L5f:
            long r9 = defpackage.AbstractC1628.m2952(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            byte[] r14 = new byte[r0]     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            r2.readFully(r14)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            java.lang.String r15 = new java.lang.String     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            r15.<init>(r14, r13)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            r13 = -1148783777193518(0xfffbeb2fef0961d2, double:NaN)
            java.lang.String r13 = "WEBP"     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            boolean r13 = r15.equals(r13)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            if (r13 != 0) goto L7d
            goto L57
        L7d:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            r13.<init>()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            long r9 = r9 + r11
            r15 = r7
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r21 = r19
        L8e:
            long r11 = r2.getFilePointer()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 >= 0) goto L24a
            long r11 = r2.getFilePointer()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            r22 = 8
            long r11 = r11 + r22
            long r22 = r2.length()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            int r11 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r11 > 0) goto L24a
            r2.getFilePointer()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            byte[] r11 = new byte[r0]     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            r2.readFully(r11)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            java.nio.charset.Charset r14 = defpackage.AbstractC1422.f6219     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            r12.<init>(r11, r14)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L246
            r35 = 2
            long r5 = defpackage.AbstractC1628.m2952(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            long r22 = r2.getFilePointer()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r11 = r12.hashCode()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r24 = 10
            switch(r11) {
                case 2013713: goto L1fd;
                case 2013830: goto L19d;
                case 2640674: goto L11b;
                case 2640718: goto L10a;
                case 2640730: goto Lca;
                default: goto Lc8;
            }     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
        Lc8:
            goto L239
        Lca:
            r26 = -1148805252029998(0xfffbeb2aef0961d2, double:NaN)
            java.lang.String r11 = "VP8X"     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r11 != 0) goto Ldb
            goto L239
        Ldb:
            int r11 = (r5 > r24 ? 1 : (r5 == r24 ? 0 : -1))
            if (r11 < 0) goto L239
            byte r11 = r2.readByte()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r2.skipBytes(r4)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r12 = r11 & 2
            if (r12 == 0) goto Lec
            r15 = r8
            goto Led
        Lec:
            r15 = r7
        Led:
            r11 = r11 & 16
            if (r11 == 0) goto Lf4
            r21 = r8
            goto Lf6
        Lf4:
            r21 = r7
        Lf6:
            int r11 = defpackage.AbstractC1628.m2950(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r16 = r11 + 1
            int r11 = defpackage.AbstractC1628.m2950(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r17 = r11 + 1
            goto L239
        L104:
            r0 = move-exception
            goto L25f
        L107:
            r0 = move-exception
            goto L257
        L10a:
            r26 = -1148826726866478(0xfffbeb25ef0961d2, double:NaN)
            java.lang.String r11 = "VP8L"     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r11 != 0) goto L12c
            goto L239
        L11b:
            r26 = -1148869676539438(0xfffbeb1bef0961d2, double:NaN)
            java.lang.String r11 = "VP8 "     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r11 != 0) goto L12c
            goto L239
        L12c:
            if (r15 != 0) goto L239
            boolean r11 = r13.isEmpty()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r11 == 0) goto L239
            r26 = -1148912626212398(0xfffbeb11ef0961d2, double:NaN)
            java.lang.String r11 = "VP8 "     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r11 == 0) goto L163
            int r11 = (r5 > r24 ? 1 : (r5 == r24 ? 0 : -1))
            if (r11 < 0) goto L163
            r2.skipBytes(r4)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r2.skipBytes(r4)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r11 = defpackage.AbstractC1628.m2970(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r11 = r11 & 16383(0x3fff, float:2.2957E-41)
            int r12 = defpackage.AbstractC1628.m2970(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r12 = r12 & 16383(0x3fff, float:2.2957E-41)
            if (r16 != 0) goto L15d
            r16 = r11
        L15d:
            if (r17 != 0) goto L239
            r17 = r12
            goto L239
        L163:
            r24 = -1148934101048878(0xfffbeb0cef0961d2, double:NaN)
            java.lang.String r11 = "VP8L"     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r11 == 0) goto L239
            r11 = 5
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 < 0) goto L239
            r2.skipBytes(r8)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            long r11 = defpackage.AbstractC1628.m2952(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r11 = (int) r11     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r12 = r11 & 16383(0x3fff, float:2.2957E-41)
            int r12 = r12 + r8
            int r14 = r11 >> 14
            r14 = r14 & 16383(0x3fff, float:2.2957E-41)
            int r14 = r14 + r8
            if (r16 != 0) goto L18c
            r16 = r12
        L18c:
            if (r17 != 0) goto L190
            r17 = r14
        L190:
            int r11 = r11 >> 28
            r11 = r11 & r8
            if (r11 == 0) goto L199
            r21 = r8
            goto L239
        L199:
            r21 = r7
            goto L239
        L19d:
            r24 = -1148848201702958(0xfffbeb20ef0961d2, double:NaN)
            java.lang.String r11 = "ANMF"     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r11 != 0) goto L1ae
            goto L239
        L1ae:
            r11 = 16
            int r14 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r14 < 0) goto L239
            int r14 = defpackage.AbstractC1628.m2950(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r25 = r14 * 2
            int r14 = defpackage.AbstractC1628.m2950(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r26 = r14 * 2
            int r14 = defpackage.AbstractC1628.m2950(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r27 = r14 + 1
            int r14 = defpackage.AbstractC1628.m2950(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r28 = r14 + 1
            int r14 = defpackage.AbstractC1628.m2950(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            byte r20 = r2.readByte()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r24 = r20 & 1
            if (r24 == 0) goto L1db
            r31 = r8
            goto L1dd
        L1db:
            r31 = r7
        L1dd:
            r20 = r20 & 2
            if (r20 == 0) goto L1e4
            r30 = r8
            goto L1e6
        L1e4:
            r30 = r7
        L1e6:
            long r32 = r22 + r11
            int r11 = (int) r5     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            int r34 = r11 + (-16)
            if (r14 > 0) goto L1f0
            r29 = 100
            goto L1f2
        L1f0:
            r29 = r14
        L1f2:
            ᛳᛷᛵᛴ r24 = new ᛳᛷᛵᛴ     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r34)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r11 = r24
            r13.add(r11)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            goto L239
        L1fd:
            r24 = -1148891151375918(0xfffbeb16ef0961d2, double:NaN)
            java.lang.String r11 = "ANIM"     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            boolean r11 = r12.equals(r11)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            if (r11 != 0) goto L20d
            goto L239
        L20d:
            r11 = 6
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 < 0) goto L239
            byte r11 = r2.readByte()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r12 = r2.readByte()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r14 = r2.readByte()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r14 = r14 & 255(0xff, float:3.57E-43)
            byte r0 = r2.readByte()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            int r14 = r14 << 16
            r0 = r0 | r14
            int r12 = r12 << 8
            r0 = r0 | r12
            r19 = r0 | r11
            int r18 = defpackage.AbstractC1628.m2970(r2)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
        L239:
            long r22 = r22 + r5
            r11 = 2
            long r5 = r5 % r11
            long r5 = r22 + r5
            r2.seek(r5)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r0 = 4
            goto L8e
        L246:
            r0 = move-exception
            r35 = 2
            goto L257
        L24a:
            r35 = 2
            ᲀᛴᛲᲇ r14 = new ᲀᛴᛲᲇ     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r20 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L107
            r2.close()
            goto L263
        L257:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L104
            r2.close()
            goto L5c
        L25f:
            r2.close()
            throw r0
        L263:
            if (r14 != 0) goto L282
            ᲈᛲᲀᛶ r15 = new ᲈᛲᲀᛶ
            r0 = -1149900468690478(0xfffbea2bef0961d2, double:NaN)
            java.lang.String r22 = "WebP 文件解析失败"
            r23 = 62
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            return r15
        L282:
            int r2 = r14.f7399
            java.util.ArrayList r5 = r14.f7403
            boolean r0 = r14.f7401
            if (r0 == 0) goto L610
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L292
            goto L610
        L292:
            int r6 = r14.f7402
            int r9 = r14.f7400
            r10 = -1150055087513134(0xfffbea07ef0961d2, double:NaN)
            java.lang.String r0 = "WebpToGifConverter"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = -1150136691891758(0xfffbe9f4ef0961d2, double:NaN)
            java.lang.String r11 = "WebP: "
            r10.<init>(r11)
            r10.append(r6)
            r11 = 120(0x78, float:1.68E-43)
            r10.append(r11)
            r10.append(r9)
            r11 = -1150166756662830(0xfffbe9edef0961d2, double:NaN)
            java.lang.String r11 = ", "
            r10.append(r11)
            int r11 = r5.size()
            r10.append(r11)
            r11 = -1150179641564718(0xfffbe9eaef0961d2, double:NaN)
            java.lang.String r11 = " 帧, alpha="
            r10.append(r11)
            boolean r11 = r14.f7404
            r10.append(r11)
            r11 = -1150226886204974(0xfffbe9dfef0961d2, double:NaN)
            java.lang.String r11 = ", loop="
            r10.append(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r0, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r6, r9, r0)
            r13 = -1150261245943342(0xfffbe9d7ef0961d2, double:NaN)
            android.graphics.Canvas r15 = new android.graphics.Canvas
            r15.<init>(r12)
            android.graphics.Paint r13 = new android.graphics.Paint
            r13.<init>(r4)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.CLEAR
            r0.<init>(r14)
            r4.setXfermode(r0)
            r12.eraseColor(r7)
            int r14 = r5.size()
            r3 = r7
        L32b:
            if (r3 >= r14) goto L466
            java.lang.Object r0 = r5.get(r3)
            r8 = r0
            ᛳᛷᛵᛴ r8 = (defpackage.C0513) r8
            r16 = -1148955575885358(0xfffbeb07ef0961d2, double:NaN)
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r16 = -1148998525558318(0xfffbeafdef0961d2, double:NaN)
            r24 = r1
            java.lang.String r1 = "r"
            r7.<init>(r0, r1)
            long r0 = r8.f2534     // Catch: java.lang.Throwable -> L365 java.lang.Exception -> L368
            r7.seek(r0)     // Catch: java.lang.Throwable -> L365 java.lang.Exception -> L368
            int r0 = r8.f2535     // Catch: java.lang.Throwable -> L365 java.lang.Exception -> L368
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L365 java.lang.Exception -> L368
            r7.readFully(r0)     // Catch: java.lang.Throwable -> L365 java.lang.Exception -> L368
            byte[] r0 = defpackage.AbstractC1628.m2945(r0, r8)     // Catch: java.lang.Throwable -> L365 java.lang.Exception -> L368
            r7.close()
            goto L370
        L365:
            r0 = move-exception
            goto L462
        L368:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L365
            r7.close()
            r0 = 0
        L370:
            if (r0 != 0) goto L3a6
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r7 = -1150338555354670(0xfffbe9c5ef0961d2, double:NaN)
            java.lang.String r7 = "帧 "
            r1.<init>(r7)
            r1.append(r3)
            r7 = -1150351440256558(0xfffbe9c2ef0961d2, double:NaN)
            java.lang.String r7 = " 读取失败，跳过"
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.getClass()
            defpackage.C0346.m1040(r1)
            r26 = r3
            r20 = r4
            r25 = r5
        L3a1:
            r27 = r6
            r3 = 0
            goto L453
        L3a6:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            r1.inPreferredConfig = r7
            r20 = r4
            int r4 = r0.length
            r25 = r5
            r5 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r5, r4, r1)
            if (r0 != 0) goto L3e7
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r4 = -1150390094962222(0xfffbe9b9ef0961d2, double:NaN)
            java.lang.String r4 = "帧 "
            r1.<init>(r4)
            r1.append(r3)
            r4 = -1150402979864110(0xfffbe9b6ef0961d2, double:NaN)
            java.lang.String r4 = " 解码失败，跳过"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.getClass()
            defpackage.C0346.m1040(r1)
            r26 = r3
            goto L3a1
        L3e7:
            android.graphics.Rect r1 = new android.graphics.Rect
            int r4 = r8.f2539
            int r5 = r8.f2540
            r26 = r3
            int r3 = r8.f2538
            int r3 = r3 + r4
            r27 = r6
            int r6 = r8.f2537
            int r6 = r6 + r5
            r1.<init>(r4, r5, r3, r6)
            boolean r3 = r8.f2541
            if (r3 == 0) goto L41b
            int r3 = r1.left
            float r3 = (float) r3
            int r4 = r1.top
            float r4 = (float) r4
            int r5 = r1.right
            float r5 = (float) r5
            int r6 = r1.bottom
            float r6 = (float) r6
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r15.drawRect(r16, r17, r18, r19, r20)
            r3 = 0
            r15.drawBitmap(r0, r3, r1, r13)
        L419:
            r5 = 0
            goto L420
        L41b:
            r3 = 0
            r15.drawBitmap(r0, r3, r1, r13)
            goto L419
        L420:
            android.graphics.Bitmap r4 = r12.copy(r7, r5)
            r10.add(r4)
            int r4 = r8.f2536
            if (r4 <= 0) goto L42c
            goto L42e
        L42c:
            r4 = 100
        L42e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11.add(r4)
            boolean r4 = r8.f2542
            if (r4 == 0) goto L450
            int r4 = r1.left
            float r4 = (float) r4
            int r5 = r1.top
            float r5 = (float) r5
            int r6 = r1.right
            float r6 = (float) r6
            int r1 = r1.bottom
            float r1 = (float) r1
            r19 = r1
            r16 = r4
            r17 = r5
            r18 = r6
            r15.drawRect(r16, r17, r18, r19, r20)
        L450:
            r0.recycle()
        L453:
            int r0 = r26 + 1
            r3 = r0
            r4 = r20
            r1 = r24
            r5 = r25
            r6 = r27
            r7 = 0
            r8 = 1
            goto L32b
        L462:
            r7.close()
            throw r0
        L466:
            r27 = r6
            r12.recycle()
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L48b
            ᲈᛲᲀᛶ r12 = new ᲈᛲᲀᛶ
            r0 = -1150441634569774(0xfffbe9adef0961d2, double:NaN)
            java.lang.String r19 = "没有成功解码任何帧"
            r20 = 62
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            return r12
        L48b:
            r0 = -1150484584242734(0xfffbe9a3ef0961d2, double:NaN)
            java.lang.String r0 = "WebpToGifConverter"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = -1150566188621358(0xfffbe990ef0961d2, double:NaN)
            java.lang.String r3 = "合成 "
            r1.<init>(r3)
            int r3 = r10.size()
            r1.append(r3)
            r3 = -1150583368490542(0xfffbe98cef0961d2, double:NaN)
            java.lang.String r3 = " 帧完成"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            r5 = 0
            java.lang.Object r0 = r10.get(r5)
            r12 = r0
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            int r15 = r12.getWidth()
            int r19 = r12.getHeight()
            int r0 = r15 * r19
            int[] r13 = new int[r0]
            r16 = 0
            r17 = 0
            r14 = 0
            r18 = r15
            r12.getPixels(r13, r14, r15, r16, r17, r18, r19)
            r1 = 0
            r5 = 0
        L4dc:
            if (r5 >= r0) goto L4ed
            r3 = r13[r5]
            int r3 = r3 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 128(0x80, float:1.8E-43)
            if (r3 >= r4) goto L4ea
            int r1 = r1 + 1
        L4ea:
            int r5 = r5 + 1
            goto L4dc
        L4ed:
            double r3 = (double) r1
            double r0 = (double) r0
            double r3 = r3 / r0
            r0 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4fb
            r5 = 1
            goto L4fc
        L4fb:
            r5 = 0
        L4fc:
            r0 = -1150604843327022(0xfffbe987ef0961d2, double:NaN)
            java.lang.String r0 = "WebpToGifConverter"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = -1150686447705646(0xfffbe974ef0961d2, double:NaN)
            java.lang.String r3 = "transparent="
            r1.<init>(r3)
            r1.append(r5)
            r3 = -1150742282280494(0xfffbe967ef0961d2, double:NaN)
            java.lang.String r3 = ", 开始编码 GIF"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            int[] r0 = defpackage.AbstractC1107.m2119(r11)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r3 = r37
            r1.<init>(r3)
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream
            r6 = 65536(0x10000, float:9.1835E-41)
            r4.<init>(r1, r6)
            ᛱᛱᛸᛵ r6 = new ᛱᛱᛸᛵ     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            if (r2 < 0) goto L54b
            r6.f474 = r2     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            goto L54b
        L545:
            r0 = move-exception
            goto L609
        L548:
            r0 = move-exception
            r2 = 0
            goto L596
        L54b:
            r2 = 10
            r6.f470 = r2     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            r6.f468 = r5     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            if (r5 == 0) goto L557
            r2 = r35
            r6.f477 = r2     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
        L557:
            defpackage.C0025.m325(r6, r10)     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            r6.m327()     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            r7 = 0
        L562:
            if (r7 >= r2) goto L57c
            if (r7 < 0) goto L56c
            int r8 = r0.length     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            if (r7 >= r8) goto L56c
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            goto L56e
        L56c:
            r8 = 100
        L56e:
            r6.f472 = r8     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            java.lang.Object r8 = r10.get(r7)     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            r6.m329(r8)     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            int r7 = r7 + 1
            goto L562
        L57c:
            java.io.BufferedOutputStream r0 = r6.f476     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            boolean r2 = r6.f480     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L548
            if (r2 != 0) goto L583
            goto L58e
        L583:
            r2 = 59
            r0.write(r2)     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L58e
            r0.flush()     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L58e
            r2 = 0
            r6.f480 = r2     // Catch: java.lang.Throwable -> L545 java.lang.Exception -> L58e
        L58e:
            r4.close()     // Catch: java.lang.Exception -> L591
        L591:
            r1.close()     // Catch: java.lang.Exception -> L594
        L594:
            r7 = 1
            goto L5ae
        L596:
            ᛲᲀᛱᲁ r6 = defpackage.C0346.f1773     // Catch: java.lang.Throwable -> L545
            r7 = -1150828181626414(0xfffbe953ef0961d2, double:NaN)
            java.lang.String r7 = "GIF 编码异常"     // Catch: java.lang.Throwable -> L545
            r6.getClass()     // Catch: java.lang.Throwable -> L545
            defpackage.C0346.m1038(r7, r0)     // Catch: java.lang.Throwable -> L545
            r4.close()     // Catch: java.lang.Exception -> L5aa
        L5aa:
            r1.close()     // Catch: java.lang.Exception -> L5ad
        L5ad:
            r7 = r2
        L5ae:
            java.util.Iterator r0 = r10.iterator()
        L5b2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5c2
            java.lang.Object r1 = r0.next()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r1.recycle()
            goto L5b2
        L5c2:
            if (r7 == 0) goto L5ef
            boolean r0 = r3.exists()
            if (r0 == 0) goto L5ef
            long r0 = r3.length()
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L5d5
            goto L5ef
        L5d5:
            ᲈᛲᲀᛶ r15 = new ᲈᛲᲀᛶ
            java.lang.String r17 = r3.getPath()
            int r18 = r10.size()
            r22 = 0
            r23 = 64
            r16 = 1
            r21 = r5
            r20 = r9
            r19 = r27
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            return r15
        L5ef:
            r3.delete()
            ᲈᛲᲀᛶ r0 = new ᲈᛲᲀᛶ
            r1 = -1150789526920750(0xfffbe95cef0961d2, double:NaN)
            java.lang.String r7 = "GIF 编码失败"
            r8 = 62
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L609:
            r4.close()     // Catch: java.lang.Exception -> L60c
        L60c:
            r1.close()     // Catch: java.lang.Exception -> L60f
        L60f:
            throw r0
        L610:
            ᲈᛲᲀᛶ r5 = new ᲈᛲᲀᛶ
            r0 = -1149952008298030(0xfffbea1fef0961d2, double:NaN)
            java.lang.String r12 = "不是 Animated WebP 文件或没有帧"
            r13 = 62
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
    }
}
