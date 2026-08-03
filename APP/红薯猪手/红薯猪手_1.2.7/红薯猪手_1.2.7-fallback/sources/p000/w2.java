package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w2 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String m450(android.app.Activity r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x0048: FILL_ARRAY_DATA , data: [39, 65, 41, -45, 121} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x0050: FILL_ARRAY_DATA , data: [120, 37, 72, -89, 24, 60} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]
            r1 = 0
            r4[r1] = r0
            r1 = 0
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L40
            r7 = 0
            r3 = r9
            r5 = r10
            r6 = r11
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L40
            if (r8 == 0) goto L3a
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L3a
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L37
            r8.close()
            return r9
        L37:
            r9 = move-exception
            r1 = r8
            goto L42
        L3a:
            if (r8 == 0) goto L3f
            r8.close()
        L3f:
            return r1
        L40:
            r8 = move-exception
            r9 = r8
        L42:
            if (r1 == 0) goto L47
            r1.close()
        L47:
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.String m451(android.app.Activity r16, android.net.Uri r17) {
            r0 = r16
            r7 = r17
            r8 = 0
            if (r7 != 0) goto L9
            goto L399
        L9:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 7
            r9 = 5
            r10 = 0
            r11 = 1
            r12 = 6
            if (r1 >= r2) goto L15a
            boolean r4 = android.provider.DocumentsContract.isDocumentUri(r16, r17)
            if (r4 == 0) goto L15a
            r4 = 37
            byte[] r5 = new byte[r4]
            r5 = {x039a: FILL_ARRAY_DATA , data: [-1, -41, -95, -110, -20, -124, -8, -54, -93, -43, -23, -60, -7, -64, -72, -39, -1, -124, -3, -44, -65, -56, -30, -104, -3, -33, -87, -110, -23, -123, -1, -51, -95, -39, -29, -98, -17} // fill-array
            byte[] r6 = new byte[r12]
            r6 = {x03b2: FILL_ARRAY_DATA , data: [-100, -72, -52, -68, -115, -22} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            java.lang.String r6 = r17.getAuthority()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L89
            java.lang.String r4 = android.provider.DocumentsContract.getDocumentId(r17)
            byte[] r5 = new byte[r11]
            r6 = -48
            r5[r10] = r6
            byte[] r6 = new byte[r12]
            r6 = {x03ba: FILL_ARRAY_DATA , data: [-22, 20, 9, 15, -89, 77} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            java.lang.String[] r4 = r4.split(r5)
            r5 = r4[r10]
            byte[] r6 = new byte[r3]
            r6 = {x03c2: FILL_ARRAY_DATA , data: [39, -25, 106, 17, 24, -24, 46} // fill-array
            byte[] r13 = new byte[r12]
            r13 = {x03ca: FILL_ARRAY_DATA , data: [87, -107, 3, 124, 121, -102} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r13)
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L15a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            r0.append(r1)
            byte[] r1 = new byte[r11]
            r2 = 59
            r1[r10] = r2
            byte[] r2 = new byte[r12]
            r2 = {x03d2: FILL_ARRAY_DATA , data: [20, -122, 12, 55, -40, -14} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            r0.append(r1)
            r1 = r4[r11]
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L89:
            r5 = 41
            byte[] r5 = new byte[r5]
            r5 = {x03da: FILL_ARRAY_DATA , data: [-19, 107, 112, 20, -97, 67, -22, 118, 114, 83, -102, 3, -2, 118, 114, 76, -105, 73, -21, 118, 110, 20, -102, 66, -7, 106, 113, 85, -97, 73, -3, 42, 121, 85, -99, 88, -29, 97, 115, 78, -115} // fill-array
            byte[] r6 = new byte[r12]
            r6 = {x03f4: FILL_ARRAY_DATA , data: [-114, 4, 29, 58, -2, 45} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            java.lang.String r6 = r17.getAuthority()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lcc
            java.lang.String r1 = android.provider.DocumentsContract.getDocumentId(r17)
            r2 = 36
            byte[] r2 = new byte[r2]
            r2 = {x03fc: FILL_ARRAY_DATA , data: [-109, -113, -110, 61, 124, -95, -124, -38, -45, 102, 125, -96, -121, -114, -112, 38, 120, -85, -125, -49, -116, 60, 123, -93, -103, -125, -93, 45, 118, -72, -98, -116, -109, 40, 125, -68} // fill-array
            byte[] r3 = new byte[r12]
            r3 = {x0412: FILL_ARRAY_DATA , data: [-16, -32, -4, 73, 25, -49} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r3 = r1.longValue()
            android.net.Uri r1 = android.content.ContentUris.withAppendedId(r2, r3)
            java.lang.String r0 = m450(r0, r1, r8, r8)
            return r0
        Lcc:
            byte[] r4 = new byte[r4]
            r4 = {x041a: FILL_ARRAY_DATA , data: [93, -48, -23, 5, -37, -8, 90, -51, -21, 66, -34, -72, 78, -51, -21, 93, -45, -14, 91, -51, -9, 5, -41, -13, 90, -42, -27, 5, -34, -7, 93, -54, -23, 78, -44, -30, 77} // fill-array
            byte[] r5 = new byte[r12]
            r5 = {x0432: FILL_ARRAY_DATA , data: [62, -65, -124, 43, -70, -106} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r5)
            java.lang.String r5 = r17.getAuthority()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L15a
            java.lang.String r1 = android.provider.DocumentsContract.getDocumentId(r17)
            byte[] r2 = new byte[r11]
            r3 = -121(0xffffffffffffff87, float:NaN)
            r2[r10] = r3
            byte[] r3 = new byte[r12]
            r3 = {x043a: FILL_ARRAY_DATA , data: [-67, 125, -115, -56, -28, 69} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            java.lang.String[] r1 = r1.split(r2)
            r2 = r1[r10]
            byte[] r3 = new byte[r9]
            r3 = {x0442: FILL_ARRAY_DATA , data: [-19, 69, 72, 46, -37} // fill-array
            byte[] r4 = new byte[r12]
            r4 = {x044a: FILL_ARRAY_DATA , data: [-124, 40, 41, 73, -66, -11} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r4)
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L114
            android.net.Uri r8 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L141
        L114:
            byte[] r3 = new byte[r9]
            r3 = {x0452: FILL_ARRAY_DATA , data: [-122, 45, 120, 53, -95} // fill-array
            byte[] r4 = new byte[r12]
            r4 = {x045a: FILL_ARRAY_DATA , data: [-16, 68, 28, 80, -50, 116} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r4)
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L12b
            android.net.Uri r8 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L141
        L12b:
            byte[] r3 = new byte[r9]
            r3 = {x0462: FILL_ARRAY_DATA , data: [-73, 21, -34, -111, -52} // fill-array
            byte[] r4 = new byte[r12]
            r4 = {x046a: FILL_ARRAY_DATA , data: [-42, 96, -70, -8, -93, 107} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r4)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L141
            android.net.Uri r8 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        L141:
            byte[] r2 = new byte[r9]
            r2 = {x0472: FILL_ARRAY_DATA , data: [-37, 57, 85, -5, -33} // fill-array
            byte[] r3 = new byte[r12]
            r3 = {x047a: FILL_ARRAY_DATA , data: [-124, 80, 49, -58, -32, 75} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            java.lang.String[] r3 = new java.lang.String[r11]
            r1 = r1[r11]
            r3[r10] = r1
            java.lang.String r0 = m450(r0, r8, r2, r3)
            return r0
        L15a:
            r13 = 47
            r14 = 4
            if (r1 < r2) goto L23e
            java.lang.String r1 = r17.getScheme()
            byte[] r2 = new byte[r14]
            r2 = {x0482: FILL_ARRAY_DATA , data: [5, -118, -59, -122} // fill-array
            byte[] r4 = new byte[r12]
            r4 = {x0488: FILL_ARRAY_DATA , data: [99, -29, -87, -29, -114, -106} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r4)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L182
            java.io.File r8 = new java.io.File
            java.lang.String r0 = r17.getPath()
            r8.<init>(r0)
            goto L239
        L182:
            java.lang.String r1 = r17.getScheme()
            byte[] r2 = new byte[r3]
            r2 = {x0490: FILL_ARRAY_DATA , data: [88, -70, 56, 74, -30, 14, 79} // fill-array
            byte[] r3 = new byte[r12]
            r3 = {x0498: FILL_ARRAY_DATA , data: [59, -43, 86, 62, -121, 96} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L239
            android.content.ContentResolver r15 = r16.getContentResolver()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r15
            r2 = r17
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L239
            r2 = 13
            byte[] r2 = new byte[r2]
            r2 = {x04a0: FILL_ARRAY_DATA , data: [114, -15, 48, -31, -117, -97, 76, -20, 6, -4, -102, -98, 72} // fill-array
            byte[] r3 = new byte[r12]
            r3 = {x04ac: FILL_ARRAY_DATA , data: [45, -107, 89, -110, -5, -13} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            int r2 = r1.getColumnIndex(r2)
            java.lang.String r1 = r1.getString(r2)
            java.io.InputStream r2 = r15.openInputStream(r7)     // Catch: java.io.IOException -> L235
            java.io.File r3 = new java.io.File     // Catch: java.io.IOException -> L235
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L235
            r4.<init>()     // Catch: java.io.IOException -> L235
            java.io.File r0 = r16.getExternalCacheDir()     // Catch: java.io.IOException -> L235
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.io.IOException -> L235
            r4.append(r0)     // Catch: java.io.IOException -> L235
            byte[] r0 = new byte[r11]     // Catch: java.io.IOException -> L235
            r0[r10] = r10     // Catch: java.io.IOException -> L235
            byte[] r5 = new byte[r12]     // Catch: java.io.IOException -> L235
            r5[r10] = r13     // Catch: java.io.IOException -> L235
            r6 = -100
            r5[r11] = r6     // Catch: java.io.IOException -> L235
            r6 = 2
            r7 = -76
            r5[r6] = r7     // Catch: java.io.IOException -> L235
            r6 = 3
            r7 = -22
            r5[r6] = r7     // Catch: java.io.IOException -> L235
            r6 = -60
            r5[r14] = r6     // Catch: java.io.IOException -> L235
            r6 = 72
            r5[r9] = r6     // Catch: java.io.IOException -> L235
            java.lang.String r0 = p000.oa.m332(r0, r5)     // Catch: java.io.IOException -> L235
            r4.append(r0)     // Catch: java.io.IOException -> L235
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L235
            r4.append(r5)     // Catch: java.io.IOException -> L235
            java.lang.String r0 = r4.toString()     // Catch: java.io.IOException -> L235
            r3.<init>(r0)     // Catch: java.io.IOException -> L235
            boolean r0 = r3.exists()     // Catch: java.io.IOException -> L235
            if (r0 != 0) goto L219
            r3.mkdir()     // Catch: java.io.IOException -> L235
        L219:
            java.io.File r4 = new java.io.File     // Catch: java.io.IOException -> L235
            java.lang.String r0 = r3.getPath()     // Catch: java.io.IOException -> L235
            r4.<init>(r0, r1)     // Catch: java.io.IOException -> L235
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L235
            r0.<init>(r4)     // Catch: java.io.IOException -> L235
            android.os.FileUtils.copy(r2, r0)     // Catch: java.io.IOException -> L235
            r0.close()     // Catch: java.io.IOException -> L232
            r2.close()     // Catch: java.io.IOException -> L232
            r8 = r4
            goto L239
        L232:
            r0 = move-exception
            r8 = r4
            goto L236
        L235:
            r0 = move-exception
        L236:
            r0.printStackTrace()
        L239:
            java.lang.String r0 = r8.getAbsolutePath()
            return r0
        L23e:
            byte[] r1 = new byte[r3]
            r1 = {x04b4: FILL_ARRAY_DATA , data: [-9, -93, 12, 79, -63, 3, -32} // fill-array
            byte[] r2 = new byte[r12]
            r2 = {x04bc: FILL_ARRAY_DATA , data: [-108, -52, 98, 59, -92, 109} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            java.lang.String r2 = r17.getScheme()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L37c
            r1 = 38
            byte[] r1 = new byte[r1]
            r1 = {x04c4: FILL_ARRAY_DATA , data: [93, 42, 82, 46, 112, -111, 81, 34, 83, 101, 57, -97, 80, 33, 77, 111, 126, -102, 16, 36, 79, 112, 100, -48, 78, 45, 80, 116, 120, -115, 16, 38, 80, 110, 99, -101, 80, 49} // fill-array
            byte[] r2 = new byte[r12]
            r2 = {x04dc: FILL_ARRAY_DATA , data: [62, 69, 63, 0, 23, -2} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            java.lang.String r2 = r17.getAuthority()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L275
            java.lang.String r0 = r17.getLastPathSegment()
            return r0
        L275:
            r15 = -1
            java.lang.String r1 = r17.getScheme()
            if (r1 != 0) goto L27d
            goto L291
        L27d:
            byte[] r2 = new byte[r14]
            r2 = {x04e4: FILL_ARRAY_DATA , data: [75, 26, -85, 95} // fill-array
            byte[] r4 = new byte[r12]
            r4 = {x04ea: FILL_ARRAY_DATA , data: [45, 115, -57, 58, 57, -36} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r4)
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L296
        L291:
            java.lang.String r1 = r17.getPath()
            goto L2f1
        L296:
            byte[] r2 = new byte[r3]
            r2 = {x04f2: FILL_ARRAY_DATA , data: [-104, 41, 122, 127, 64, -10, -113} // fill-array
            byte[] r3 = new byte[r12]
            r3 = {x04fa: FILL_ARRAY_DATA , data: [-5, 70, 20, 11, 37, -104} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2f0
            java.lang.String[] r3 = new java.lang.String[r11]
            byte[] r1 = new byte[r9]
            r1 = {x0502: FILL_ARRAY_DATA , data: [-25, -25, -61, -43, -35} // fill-array
            byte[] r2 = new byte[r12]
            r2 = {x050a: FILL_ARRAY_DATA , data: [-72, -125, -94, -95, -68, 19} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            r3[r10] = r1
            android.content.ContentResolver r1 = r16.getContentResolver()
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r17
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2f0
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L2ea
            byte[] r2 = new byte[r9]
            r2 = {x0512: FILL_ARRAY_DATA , data: [82, -58, -85, -53, -20} // fill-array
            byte[] r3 = new byte[r12]
            r3 = {x051a: FILL_ARRAY_DATA , data: [13, -94, -54, -65, -115, -69} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            int r2 = r1.getColumnIndex(r2)
            if (r2 <= r15) goto L2ea
            java.lang.String r2 = r1.getString(r2)
            goto L2eb
        L2ea:
            r2 = r8
        L2eb:
            r1.close()
            r1 = r2
            goto L2f1
        L2f0:
            r1 = r8
        L2f1:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L2fa
            r8 = r1
            goto L37b
        L2fa:
            android.content.Context r1 = r16.getApplicationContext()
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = r17.getPath()
            int r3 = r2.lastIndexOf(r13)
            if (r3 == r15) goto L312
            int r3 = r3 + r11
            java.lang.String r2 = r2.substring(r3)
            goto L313
        L312:
            r2 = r8
        L313:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L37b
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            android.content.ContentResolver r0 = r16.getContentResolver()     // Catch: java.lang.Exception -> L373
            java.io.InputStream r0 = r0.openInputStream(r7)     // Catch: java.lang.Exception -> L373
            if (r0 != 0) goto L33d
            goto L377
        L33d:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L373
            r1.<init>(r3)     // Catch: java.lang.Exception -> L373
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r4 = new byte[r2]     // Catch: java.lang.Exception -> L373
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L373
            r5.<init>(r0, r2)     // Catch: java.lang.Exception -> L373
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L373
            r6.<init>(r1, r2)     // Catch: java.lang.Exception -> L373
        L350:
            int r7 = r5.read(r4, r10, r2)     // Catch: java.lang.Throwable -> L35e java.lang.Exception -> L366
            if (r7 == r15) goto L35a
            r6.write(r4, r10, r7)     // Catch: java.lang.Throwable -> L35e java.lang.Exception -> L366
            goto L350
        L35a:
            r6.flush()     // Catch: java.lang.Throwable -> L35e java.lang.Exception -> L366
            goto L366
        L35e:
            r0 = move-exception
            r6.close()     // Catch: java.lang.Exception -> L365
            r5.close()     // Catch: java.lang.Exception -> L365
        L365:
            throw r0     // Catch: java.lang.Exception -> L373
        L366:
            r6.close()     // Catch: java.lang.Exception -> L36c
            r5.close()     // Catch: java.lang.Exception -> L36c
        L36c:
            r0.close()     // Catch: java.lang.Exception -> L373
            r1.close()     // Catch: java.lang.Exception -> L373
            goto L377
        L373:
            r0 = move-exception
            r0.printStackTrace()
        L377:
            java.lang.String r8 = r3.getAbsolutePath()
        L37b:
            return r8
        L37c:
            byte[] r0 = new byte[r14]
            r0 = {x0522: FILL_ARRAY_DATA , data: [-17, 105, -20, 66} // fill-array
            byte[] r1 = new byte[r12]
            r1 = {x0528: FILL_ARRAY_DATA , data: [-119, 0, -128, 39, -125, 61} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            java.lang.String r1 = r17.getScheme()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L399
            java.lang.String r0 = r17.getPath()
            return r0
        L399:
            return r8
    }
}
