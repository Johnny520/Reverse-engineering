package defpackage;

/* JADX INFO: renamed from: ᛶᲈᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1193 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C0454 f5390 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final float[][] f5391 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final float[] f5392 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final float[][] f5393 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final float[][] f5394 = null;

    static {
            r0 = 3
            float[] r1 = new float[r0]
            r1 = {x0052: FILL_ARRAY_DATA , data: [1053652383, 1059484093, -1118648123} // fill-array
            float[] r2 = new float[r0]
            r2 = {x005c: FILL_ARRAY_DATA , data: [-1098898655, 1067067965, 1027330407} // fill-array
            float[] r3 = new float[r0]
            r3 = {x0066: FILL_ARRAY_DATA , data: [-1157087275, 1028162020, 1064566818} // fill-array
            float[][] r1 = new float[][]{r1, r2, r3}
            defpackage.AbstractC1193.f5393 = r1
            float[] r1 = new float[r0]
            r1 = {x0070: FILL_ARRAY_DATA , data: [1072584765, -1082036021, 1041810539} // fill-array
            float[] r2 = new float[r0]
            r2 = {x007a: FILL_ARRAY_DATA , data: [1053190625, 1059002158, -1139603558} // fill-array
            float[] r3 = new float[r0]
            r3 = {x0084: FILL_ARRAY_DATA , data: [-1132345847, -1123302273, 1065772348} // fill-array
            float[][] r1 = new float[][]{r1, r2, r3}
            defpackage.AbstractC1193.f5394 = r1
            float[] r1 = new float[r0]
            r1 = {x008e: FILL_ARRAY_DATA , data: [1119754256, 1120403456, 1121567769} // fill-array
            defpackage.AbstractC1193.f5392 = r1
            float[] r1 = new float[r0]
            r1 = {x0098: FILL_ARRAY_DATA , data: [1054023191, 1052187149, 1043912633} // fill-array
            float[] r2 = new float[r0]
            r2 = {x00a2: FILL_ARRAY_DATA , data: [1046066128, 1060575065, 1033100696} // fill-array
            float[] r0 = new float[r0]
            r0 = {x00ac: FILL_ARRAY_DATA , data: [1017006063, 1039404073, 1064520140} // fill-array
            float[][] r0 = new float[][]{r1, r2, r0}
            defpackage.AbstractC1193.f5391 = r0
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "NO_OWNER"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.AbstractC1193.f5390 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static com.thegrizzlylabs.sardineandroid.model.Multistatus m2324(defpackage.C0569 r3) {
            m2335(r3)
            ᛶᲈᛸᛳ r0 = r3.f2823
            if (r0 == 0) goto L2b
            java.io.InputStream r3 = r0.m2322()
            java.lang.Class<com.thegrizzlylabs.sardineandroid.model.Multistatus> r0 = com.thegrizzlylabs.sardineandroid.model.Multistatus.class
            org.simpleframework.xml.core.Persister r1 = defpackage.AbstractC0333.m1003()     // Catch: java.lang.Exception -> L18 org.xml.sax.SAXException -> L21
            java.lang.Object r3 = r1.read(r0, r3)     // Catch: java.lang.Exception -> L18 org.xml.sax.SAXException -> L21
            com.thegrizzlylabs.sardineandroid.model.Multistatus r3 = (com.thegrizzlylabs.sardineandroid.model.Multistatus) r3
            return r3
        L18:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Not a valid DAV response"
            r0.<init>(r1, r3)
            throw r0
        L21:
            r3 = move-exception
            java.lang.String r0 = r3.getMessage()
            defpackage.C0086.m548(r0, r3)
            r3 = 0
            return r3
        L2b:
            ᛳᛶᛱᛲ r0 = new ᛳᛶᛱᛲ
            int r1 = r3.f2833
            java.lang.String r3 = r3.f2825
            java.lang.String r2 = "No entity found in response"
            r0.<init>(r2, r1, r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static defpackage.InterfaceC0493 m2325(defpackage.InterfaceC1151 r1, defpackage.InterfaceC1192 r2) {
            ᛶᲈᲇᛶ r0 = r1.getKey()
            boolean r2 = defpackage.AbstractC0498.m1280(r0, r2)
            if (r2 == 0) goto Lc
            ᛲᛶᛳᛱ r1 = defpackage.C0303.f1620
        Lc:
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static float m2326(android.widget.EdgeEffect r2, float r3, float r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            float r2 = defpackage.AbstractC0648.m1479(r2, r3, r4)
            return r2
        Lb:
            r2.onPull(r3, r4)
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static int m2327(float r15) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            return r15
        L9:
            r0 = 1120272384(0x42c60000, float:99.0)
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            r15 = -1
            return r15
        L11:
            r0 = 1098907648(0x41800000, float:16.0)
            float r1 = r15 + r0
            r2 = 1122500608(0x42e80000, float:116.0)
            float r1 = r1 / r2
            r3 = 1090519040(0x41000000, float:8.0)
            int r3 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            r4 = 1147261687(0x4461d2f7, float:903.2963)
            if (r3 <= 0) goto L25
            float r15 = r1 * r1
            float r15 = r15 * r1
            goto L26
        L25:
            float r15 = r15 / r4
        L26:
            float r3 = r1 * r1
            float r3 = r3 * r1
            r5 = 1007753895(0x3c111aa7, float:0.008856452)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 <= 0) goto L34
            r5 = r7
            goto L35
        L34:
            r5 = r6
        L35:
            if (r5 == 0) goto L39
            r8 = r3
            goto L3d
        L39:
            float r8 = r1 * r2
            float r8 = r8 - r0
            float r8 = r8 / r4
        L3d:
            if (r5 == 0) goto L40
            goto L44
        L40:
            float r1 = r1 * r2
            float r1 = r1 - r0
            float r3 = r1 / r4
        L44:
            float[] r0 = defpackage.AbstractC1193.f5392
            r1 = r0[r6]
            float r8 = r8 * r1
            double r9 = (double) r8
            r1 = r0[r7]
            float r15 = r15 * r1
            double r11 = (double) r15
            r15 = 2
            r15 = r0[r15]
            float r3 = r3 * r15
            double r13 = (double) r3
            int r15 = defpackage.AbstractC2116.m3537(r9, r11, r13)
            return r15
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static float m2328() {
            r0 = 4603300005328146291(0x3fe234f72c234f73, double:0.5689655172413793)
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = java.lang.Math.pow(r0, r2)
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final java.lang.String m2329(java.util.Collection r7) {
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L1f
            r5 = 0
            r6 = 56
            java.lang.String r2 = ",\n"
            java.lang.String r3 = "\n"
            java.lang.String r4 = "\n"
            r1 = r7
            java.lang.String r7 = defpackage.AbstractC1107.m2125(r1, r2, r3, r4, r5, r6)
            java.lang.String r7 = defpackage.AbstractC1171.m2268(r7)
            java.lang.String r0 = "},"
            java.lang.String r7 = r7.concat(r0)
            return r7
        L1f:
            java.lang.String r7 = " }"
            return r7
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final byte[] m2330(java.io.InputStream r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            int r1 = r4.available()
            r2 = 8192(0x2000, float:1.148E-41)
            int r1 = java.lang.Math.max(r2, r1)
            r0.<init>(r1)
            byte[] r1 = new byte[r2]
            int r2 = r4.read(r1)
        L15:
            if (r2 < 0) goto L20
            r3 = 0
            r0.write(r1, r3, r2)
            int r2 = r4.read(r1)
            goto L15
        L20:
            byte[] r4 = r0.toByteArray()
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static android.view.View m2331(android.view.View r4, int r5) {
            boolean r0 = r4 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L1d
            android.view.View r3 = r4.getChildAt(r2)
            android.view.View r3 = r3.findViewById(r5)
            if (r3 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Ld
        L1d:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final boolean m2332(java.lang.String r8, java.lang.String r9) {
            boolean r0 = r8.equals(r9)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r8.length()
            r2 = 0
            if (r0 != 0) goto L10
            goto L57
        L10:
            r0 = r2
            r3 = r0
            r4 = r3
        L13:
            int r5 = r8.length()
            if (r0 >= r5) goto L3f
            char r5 = r8.charAt(r0)
            int r6 = r4 + 1
            r7 = 40
            if (r4 != 0) goto L26
            if (r5 == r7) goto L26
            goto L57
        L26:
            if (r5 == r7) goto L39
            r7 = 41
            if (r5 == r7) goto L2d
            goto L3b
        L2d:
            int r3 = r3 + (-1)
            if (r3 != 0) goto L3b
            int r5 = r8.length()
            int r5 = r5 - r1
            if (r4 == r5) goto L3b
            goto L57
        L39:
            int r3 = r3 + 1
        L3b:
            int r0 = r0 + 1
            r4 = r6
            goto L13
        L3f:
            if (r3 != 0) goto L57
            int r0 = r8.length()
            int r0 = r0 - r1
            java.lang.String r8 = r8.substring(r1, r0)
            java.lang.CharSequence r8 = defpackage.AbstractC1347.m2521(r8)
            java.lang.String r8 = r8.toString()
            boolean r8 = defpackage.AbstractC0498.m1280(r8, r9)
            return r8
        L57:
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m2333(defpackage.InterfaceC2023 r3) {
            ᛴᛲᛵᛵ r3 = (defpackage.AbstractC0624) r3
            ᛷᛲᛷᛷ r0 = new ᛷᛲᛷᛷ
            java.lang.String r1 = r3.mo919()
            r2 = 0
            r0.<init>(r1, r2, r3)
            r3.m1435(r0)
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static float m2334(int r6) {
            float r6 = (float) r6
            r0 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 / r0
            r0 = 1025879782(0x3d25aee6, float:0.04045)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r0 > 0) goto L13
            r0 = 1095678034(0x414eb852, float:12.92)
            float r6 = r6 / r0
        L11:
            float r6 = r6 * r1
            return r6
        L13:
            r0 = 1029785518(0x3d6147ae, float:0.055)
            float r6 = r6 + r0
            r0 = 1065814589(0x3f870a3d, float:1.055)
            float r6 = r6 / r0
            double r2 = (double) r6
            r4 = 4612586738567610368(0x4003333340000000, double:2.4000000953674316)
            double r2 = java.lang.Math.pow(r2, r4)
            float r6 = (float) r2
            goto L11
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static void m2335(defpackage.C0569 r3) {
            boolean r0 = r3.f2832
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error contacting "
            r0.<init>(r1)
            ᛳᛵᛴᛴ r1 = r3.f2828
            java.lang.Object r1 = r1.f2401
            ᛳᛸᛲ r1 = (defpackage.C0520) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            ᛳᛶᛱᛲ r1 = new ᛳᛶᛱᛲ
            int r2 = r3.f2833
            java.lang.String r3 = r3.f2825
            r1.<init>(r0, r2, r3)
            throw r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.C2364 m2336(com.bumptech.glide.ComponentCallbacks2C0007 r31, java.util.ArrayList r32) {
            r0 = r31
            ᛸᲈᲇᲁ r1 = r0.f354
            ᲇᛶᛳᛱ r2 = r0.f355
            ᛵᛶᛳᲇ r0 = r0.f352
            android.content.Context r3 = r0.getApplicationContext()
            ᛸᲈᛸᲈ r0 = r0.f4141
            ᲈᲈᛲᲇ r4 = new ᲈᲈᛲᲇ
            r4.<init>()
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            java.lang.String r6 = "BitmapDrawable"
            java.lang.String r7 = "legacy_append"
            java.lang.String r8 = "Animation"
            java.lang.String r9 = "Bitmap"
            ᛱᲈᛷᲁ r10 = new ᛱᲈᛷᲁ
            r10.<init>()
            ᛳᲈᛳᛸ r11 = r4.f10243
            monitor-enter(r11)
            java.util.ArrayList r12 = r11.f2955     // Catch: java.lang.Throwable -> L3b6
            r12.add(r10)     // Catch: java.lang.Throwable -> L3b6
            monitor-exit(r11)
            ᛸᛱᲀᲀ r10 = new ᛸᛱᲀᲀ
            r10.<init>()
            ᛳᲈᛳᛸ r12 = r4.f10243
            monitor-enter(r12)
            java.util.ArrayList r11 = r12.f2955     // Catch: java.lang.Throwable -> L3b3
            r11.add(r10)     // Catch: java.lang.Throwable -> L3b3
            monitor-exit(r12)
            android.content.res.Resources r10 = r3.getResources()
            java.util.ArrayList r11 = r4.m3867()
            ᲀᛷᲁᛶ r12 = new ᲀᛷᲁᛶ
            r12.<init>(r3, r11, r1, r2)
            ᛷᲈᲈ r13 = new ᛷᲈᲈ
            ᲈᛴᛵᲈ r14 = new ᲈᛴᛵᲈ
            r15 = 13
            r14.<init>(r15)
            r13.<init>(r1, r14)
            ᛸᛳᲀᛱ r14 = new ᛸᛳᲀᛱ
            java.util.ArrayList r15 = r4.m3867()
            r16 = r7
            android.util.DisplayMetrics r7 = r10.getDisplayMetrics()
            r14.<init>(r15, r7, r1, r2)
            java.lang.Class<ᲈᛷᛲ> r7 = defpackage.AbstractC2279.class
            java.lang.Object r15 = r0.f7101
            java.util.Map r15 = (java.util.Map) r15
            boolean r7 = r15.containsKey(r7)
            r15 = 1
            if (r7 == 0) goto L80
            ᲀᛲᛲᛶ r7 = new ᲀᛲᛲᛶ
            r7.<init>(r15)
            ᲀᛲᛲᛶ r15 = new ᲀᛲᛲᛶ
            r17 = r7
            r7 = 0
            r15.<init>(r7)
            r7 = r17
        L7d:
            r17 = r0
            goto L91
        L80:
            r7 = 0
            ᛴᛴᛷᛶ r15 = new ᛴᛴᛷᛶ
            r15.<init>(r14, r7)
            ᲇᛲᛷᲈ r7 = new ᲇᛲᛷᲈ
            r17 = r15
            r15 = 2
            r7.<init>(r14, r15, r2)
            r15 = r17
            goto L7d
        L91:
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            r18 = r12
            java.lang.Class<android.graphics.drawable.Drawable> r12 = android.graphics.drawable.Drawable.class
            r19 = r6
            ᛶᲁᲁ r6 = new ᛶᲁᲁ
            r20 = r10
            ᛴᛵᲇᲇ r10 = new ᛴᛵᲇᲇ
            r21 = r13
            r13 = 3
            r10.<init>(r11, r13, r2)
            r13 = 1
            r6.<init>(r10, r13)
            r4.m3868(r8, r0, r12, r6)
            java.lang.Class<java.nio.ByteBuffer> r6 = java.nio.ByteBuffer.class
            ᛶᲁᲁ r10 = new ᛶᲁᲁ
            ᛴᛵᲇᲇ r13 = new ᛴᛵᲇᲇ
            r22 = r1
            r1 = 3
            r13.<init>(r11, r1, r2)
            r1 = 0
            r10.<init>(r13, r1)
            r4.m3868(r8, r6, r12, r10)
            ᲀᲀᲇᲈ r1 = new ᲀᲀᲇᲈ
            r1.<init>(r3)
            ᛳᲁᲁᛵ r10 = new ᛳᲁᲁᛵ
            r10.<init>(r2)
            ᛸᛶᛱᛵ r13 = new ᛸᛶᛱᛵ
            android.graphics.Bitmap$CompressFormat r23 = android.graphics.Bitmap.CompressFormat.JPEG
            r23 = r3
            r3 = 12
            r13.<init>(r3)
            ᲀᛴᛱᛱ r3 = new ᲀᛴᛱᛱ
            r24 = r13
            r13 = 26
            r3.<init>(r13)
            android.content.ContentResolver r13 = r23.getContentResolver()
            r25 = r3
            ᛷᲈᲀ r3 = new ᛷᲈᲀ
            r26 = r13
            r13 = 14
            r3.<init>(r13)
            r4.m3870(r6, r3)
            ᛶᲈᛱᲈ r3 = new ᛶᲈᛱᲈ
            r3.<init>(r2)
            r4.m3870(r0, r3)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            r4.m3868(r9, r6, r3, r15)
            r4.m3868(r9, r0, r3, r7)
            java.lang.String r13 = "robolectric"
            r27 = r1
            java.lang.String r1 = android.os.Build.FINGERPRINT
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L117
            ᛴᛴᛷᛶ r13 = new ᛴᛴᛷᛶ
            r28 = r1
            r1 = 1
            r13.<init>(r14, r1)
            r4.m3868(r9, r5, r3, r13)
            goto L119
        L117:
            r28 = r1
        L119:
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            ᛷᲈᲈ r13 = new ᛷᲈᲈ
            ᲈᛴᛵᲈ r14 = new ᲈᛴᛵᲈ
            r29 = r12
            r12 = 12
            r14.<init>(r12)
            r12 = r22
            r13.<init>(r12, r14)
            r4.m3868(r9, r1, r3, r13)
            r13 = r21
            r4.m3868(r9, r5, r3, r13)
            ᛷᲈᲀ r14 = defpackage.C1403.f6103
            r4.m3869(r3, r3, r14)
            r21 = r1
            ᲈᛵᛱᲁ r1 = new ᲈᛵᛱᲁ
            r22 = r14
            r14 = 1
            r1.<init>(r14)
            r4.m3868(r9, r3, r3, r1)
            r4.m3871(r3, r10)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            ᲇᛲᛷᲈ r14 = new ᲇᛲᛷᲈ
            r30 = r3
            r3 = r20
            r14.<init>(r3, r15)
            r15 = r19
            r4.m3868(r15, r6, r1, r14)
            ᲇᛲᛷᲈ r14 = new ᲇᛲᛷᲈ
            r14.<init>(r3, r7)
            r4.m3868(r15, r0, r1, r14)
            ᲇᛲᛷᲈ r7 = new ᲇᛲᛷᲈ
            r7.<init>(r3, r13)
            r4.m3868(r15, r5, r1, r7)
            ᛴᛵᲇᲇ r7 = new ᛴᛵᲇᲇ
            r13 = 10
            r7.<init>(r12, r13, r10)
            r4.m3871(r1, r7)
            java.lang.Class<ᛶᛴᲁᛱ> r7 = defpackage.C1064.class
            ᛱᛵᛸᛳ r10 = new ᛱᛵᛸᛳ
            r14 = r18
            r10.<init>(r11, r14, r2)
            r4.m3868(r8, r0, r7, r10)
            r4.m3868(r8, r6, r7, r14)
            ᛸᛶᛱᛵ r8 = new ᛸᛶᛱᛵ
            r10 = 26
            r8.<init>(r10)
            r4.m3871(r7, r8)
            java.lang.Class<ᛱᛷᛴᛷ> r8 = defpackage.C0127.class
            r10 = r22
            r4.m3869(r8, r8, r10)
            ᛱᛲᲀᛱ r11 = new ᛱᛲᲀᛱ
            r11.<init>(r12)
            r14 = r30
            r4.m3868(r9, r8, r14, r11)
            java.lang.Class<android.net.Uri> r8 = android.net.Uri.class
            r9 = r16
            r15 = r27
            r11 = r29
            r4.m3868(r9, r8, r11, r15)
            ᲇᛲᛷᲈ r13 = new ᲇᛲᛷᲈ
            r18 = r7
            r7 = 1
            r13.<init>(r15, r7, r12)
            r4.m3868(r9, r8, r14, r13)
            ᛷᛷᛱᛷ r7 = new ᛷᛷᛱᛷ
            r13 = 0
            r7.<init>(r13)
            r4.m3865(r7)
            java.lang.Class<java.io.File> r7 = java.io.File.class
            ᲀᛴᛱᛱ r13 = new ᲀᛴᛱᛱ
            r15 = 15
            r13.<init>(r15)
            r4.m3869(r7, r6, r13)
            ᛱᲇᛵᲈ r13 = new ᛱᲇᛵᲈ
            ᛷᲈᲀ r15 = new ᛷᲈᲀ
            r22 = r12
            r12 = 23
            r15.<init>(r12)
            r13.<init>(r15)
            r4.m3869(r7, r0, r13)
            ᲈᛵᛱᲁ r13 = new ᲈᛵᛱᲁ
            r15 = 0
            r13.<init>(r15)
            r4.m3868(r9, r7, r7, r13)
            ᛱᲇᛵᲈ r13 = new ᛱᲇᛵᲈ
            ᛸᛶᛱᛵ r15 = new ᛸᛶᛱᛵ
            r15.<init>(r12)
            r13.<init>(r15)
            r4.m3869(r7, r5, r13)
            r4.m3869(r7, r7, r10)
            ᲈᛱᛷᛸ r12 = new ᲈᛱᛷᛸ
            r12.<init>(r2)
            r4.m3865(r12)
            java.lang.String r2 = "robolectric"
            r12 = r28
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L20d
            ᛷᛷᛱᛷ r2 = new ᛷᛷᛱᛷ
            r15 = 2
            r2.<init>(r15)
            r4.m3865(r2)
            goto L20e
        L20d:
            r15 = 2
        L20e:
            ᛷᲁᛷᛶ r2 = new ᛷᲁᛷᛶ
            r12 = r23
            r2.<init>(r12, r15)
            ᛷᲁᛷᛶ r13 = new ᛷᲁᛷᛶ
            r15 = 0
            r13.<init>(r12, r15)
            ᛷᲁᛷᛶ r15 = new ᛷᲁᛷᛶ
            r19 = r1
            r1 = 1
            r15.<init>(r12, r1)
            java.lang.Class r1 = java.lang.Integer.TYPE
            r4.m3869(r1, r0, r2)
            r30 = r14
            java.lang.Class<java.lang.Integer> r14 = java.lang.Integer.class
            r4.m3869(r14, r0, r2)
            r2 = r21
            r4.m3869(r1, r2, r13)
            r4.m3869(r14, r2, r13)
            r4.m3869(r1, r11, r15)
            r4.m3869(r14, r11, r15)
            ᛷᲁᛷᛶ r13 = new ᛷᲁᛷᛶ
            r15 = 9
            r13.<init>(r12, r15)
            r4.m3869(r8, r0, r13)
            ᛷᲁᛷᛶ r13 = new ᛷᲁᛷᛶ
            r15 = 8
            r13.<init>(r12, r15)
            r4.m3869(r8, r2, r13)
            ᛷᲁᛶᛲ r13 = new ᛷᲁᛶᛲ
            r15 = 3
            r13.<init>(r3, r15)
            ᛷᲁᛶᛲ r15 = new ᛷᲁᛶᛲ
            r21 = r9
            r9 = 1
            r15.<init>(r3, r9)
            ᛷᲁᛶᛲ r9 = new ᛷᲁᛶᛲ
            r29 = r11
            r11 = 2
            r9.<init>(r3, r11)
            r4.m3869(r14, r8, r13)
            r4.m3869(r1, r8, r13)
            r4.m3869(r14, r2, r15)
            r4.m3869(r1, r2, r15)
            r4.m3869(r14, r0, r9)
            r4.m3869(r1, r0, r9)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            ᛸᲈᛸᲈ r9 = new ᛸᲈᛸᲈ
            r11 = 11
            r9.<init>(r11)
            r4.m3869(r1, r0, r9)
            ᛸᲈᛸᲈ r9 = new ᛸᲈᛸᲈ
            r9.<init>(r11)
            r4.m3869(r8, r0, r9)
            ᛸᛵᛴᛲ r9 = new ᛸᛵᛴᛲ
            r9.<init>()
            r4.m3869(r1, r0, r9)
            ᲁᲁᛷᲈ r9 = new ᲁᲁᛷᲈ
            r13 = 9
            r9.<init>(r13)
            r4.m3869(r1, r5, r9)
            ᲈᛴᛵᲈ r9 = new ᲈᛴᛵᲈ
            r9.<init>(r13)
            r4.m3869(r1, r2, r9)
            ᛱᛲᛶᛳ r1 = new ᛱᛲᛶᛳ
            android.content.res.AssetManager r9 = r12.getAssets()
            r14 = 1
            r1.<init>(r9, r14)
            r4.m3869(r8, r0, r1)
            ᛱᛲᛶᛳ r1 = new ᛱᛲᛶᛳ
            android.content.res.AssetManager r9 = r12.getAssets()
            r15 = 0
            r1.<init>(r9, r15)
            r4.m3869(r8, r2, r1)
            ᛷᲁᛷᛶ r1 = new ᛷᲁᛷᛶ
            r9 = 6
            r1.<init>(r12, r9)
            r4.m3869(r8, r0, r1)
            ᛷᲁᛷᛶ r1 = new ᛷᲁᛷᛶ
            r9 = 7
            r1.<init>(r12, r9)
            r4.m3869(r8, r0, r1)
            ᲀᲀᲈᛷ r1 = new ᲀᲀᲈᛷ
            r1.<init>(r12, r0)
            r4.m3869(r8, r0, r1)
            ᲀᲀᲈᛷ r1 = new ᲀᲀᲈᛷ
            r1.<init>(r12, r5)
            r4.m3869(r8, r5, r1)
            java.lang.Class<ᛸᲇᲈᛸ> r1 = defpackage.AbstractC1592.class
            r9 = r17
            java.lang.Object r9 = r9.f7101
            java.util.Map r9 = (java.util.Map) r9
            boolean r1 = r9.containsKey(r1)
            ᛷᛸᛶᛸ r9 = new ᛷᛸᛶᛸ
            r13 = r26
            r15 = 2
            r9.<init>(r13, r1, r15)
            r4.m3869(r8, r0, r9)
            ᛷᛸᛶᛸ r9 = new ᛷᛸᛶᛸ
            r14 = 1
            r9.<init>(r13, r1, r14)
            r4.m3869(r8, r5, r9)
            ᛷᛸᛶᛸ r5 = new ᛷᛸᛶᛸ
            r15 = 0
            r5.<init>(r13, r1, r15)
            r4.m3869(r8, r2, r5)
            ᲁᲁᛷᲈ r1 = new ᲁᲁᛷᲈ
            r1.<init>(r11)
            r4.m3869(r8, r0, r1)
            java.lang.Class<java.net.URL> r1 = java.net.URL.class
            ᲈᛴᛵᲈ r2 = new ᲈᛴᛵᲈ
            r2.<init>(r11)
            r4.m3869(r1, r0, r2)
            ᛷᲁᛷᛶ r1 = new ᛷᲁᛷᛶ
            r2 = 5
            r1.<init>(r12, r2)
            r4.m3869(r8, r7, r1)
            java.lang.Class<ᲈᛸᛳᛲ> r1 = defpackage.C2302.class
            ᛸᲈᛸᲈ r2 = new ᛸᲈᛸᲈ
            r5 = 26
            r2.<init>(r5)
            r4.m3869(r1, r0, r2)
            java.lang.Class<byte[]> r1 = byte[].class
            ᛷᲈᲀ r2 = new ᛷᲈᲀ
            r5 = 13
            r2.<init>(r5)
            r4.m3869(r1, r6, r2)
            ᛸᛶᛱᛵ r2 = new ᛸᛶᛱᛵ
            r5 = 14
            r2.<init>(r5)
            r4.m3869(r1, r0, r2)
            r4.m3869(r8, r8, r10)
            r11 = r29
            r4.m3869(r11, r11, r10)
            ᲈᛵᛱᲁ r0 = new ᲈᛵᛱᲁ
            r15 = 2
            r0.<init>(r15)
            r9 = r21
            r4.m3868(r9, r11, r11, r0)
            ᛷᲁᛶᛲ r0 = new ᛷᲁᛶᛲ
            r15 = 0
            r0.<init>(r3, r15)
            r2 = r19
            r14 = r30
            r4.m3866(r14, r2, r0)
            r0 = r24
            r4.m3866(r14, r1, r0)
            ᛷᛸᛱᛸ r5 = new ᛷᛸᛱᛸ
            r12 = r22
            r7 = r25
            r8 = 10
            r5.<init>(r12, r0, r7, r8)
            r4.m3866(r11, r1, r5)
            r0 = r18
            r4.m3866(r0, r1, r7)
            ᛷᲈᲈ r0 = new ᛷᲈᲈ
            ᲁᲁᛷᲈ r1 = new ᲁᲁᛷᲈ
            r5 = 12
            r1.<init>(r5)
            r0.<init>(r12, r1)
            java.lang.String r1 = "legacy_append"
            r4.m3868(r1, r6, r14, r0)
            ᲇᛲᛷᲈ r1 = new ᲇᛲᛷᲈ
            r1.<init>(r3, r0)
            java.lang.String r0 = "legacy_append"
            r4.m3868(r0, r6, r2, r1)
            java.util.Iterator r0 = r32.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L3a7
            return r4
        L3a7:
            java.lang.Object r0 = r0.next()
            r0.getClass()
            defpackage.C2264.m3679()
            r0 = 0
            return r0
        L3b3:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L3b3
            throw r0
        L3b6:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L3b6
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static defpackage.InterfaceC1151 m2337(defpackage.InterfaceC1151 r1, defpackage.InterfaceC1192 r2) {
            ᛶᲈᲇᛶ r0 = r1.getKey()
            boolean r2 = defpackage.AbstractC0498.m1280(r0, r2)
            if (r2 == 0) goto Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static float m2338(android.widget.EdgeEffect r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            float r2 = defpackage.AbstractC0648.m1481(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }
}
