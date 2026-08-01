package defpackage;

/* JADX INFO: renamed from: ᛱᲈᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0222 implements defpackage.InterfaceC1215 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final int[] f1350 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final byte[] f1351 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final byte[] f1352 = null;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)
            java.lang.String r2 = "Exif\u0000\u0000"
            byte[] r1 = r2.getBytes(r1)
            defpackage.C0222.f1351 = r1
            java.lang.String r1 = "MPF"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            byte[] r0 = r1.getBytes(r0)
            defpackage.C0222.f1352 = r0
            r0 = 13
            int[] r0 = new int[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8} // fill-array
            defpackage.C0222.f1350 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static com.bumptech.glide.load.ImageHeaderParser$ImageType m794(defpackage.InterfaceC0565 r8) {
            int r0 = r8.mo660()     // Catch: defpackage.C0198 -> L102
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto Lc
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG     // Catch: defpackage.C0198 -> L102
            return r8
        Lc:
            int r0 = r0 << 8
            short r1 = r8.mo658()     // Catch: defpackage.C0198 -> L102
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L1b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF     // Catch: defpackage.C0198 -> L102
            return r8
        L1b:
            int r0 = r0 << 8
            short r1 = r8.mo658()     // Catch: defpackage.C0198 -> L102
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L3c
            r0 = 21
            r8.skip(r0)     // Catch: defpackage.C0198 -> L102
            short r8 = r8.mo658()     // Catch: defpackage.C0198 -> L39
            r0 = 3
            if (r8 < r0) goto L36
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A     // Catch: defpackage.C0198 -> L39
            return r8
        L36:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG     // Catch: defpackage.C0198 -> L39
            return r8
        L39:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG     // Catch: defpackage.C0198 -> L102
            return r8
        L3c:
            r1 = 1380533830(0x52494646, float:2.1611685E11)
            r2 = 4
            if (r0 == r1) goto La1
            int r1 = r8.mo660()     // Catch: defpackage.C0198 -> L102
            int r1 = r1 << 16
            int r4 = r8.mo660()     // Catch: defpackage.C0198 -> L102
            r1 = r1 | r4
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            if (r1 == r4) goto L56
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch: defpackage.C0198 -> L102
            return r8
        L56:
            int r1 = r8.mo660()     // Catch: defpackage.C0198 -> L102
            int r1 = r1 << 16
            int r4 = r8.mo660()     // Catch: defpackage.C0198 -> L102
            r1 = r1 | r4
            r4 = 1635150195(0x61766973, float:2.8409359E20)
            if (r1 != r4) goto L69
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF     // Catch: defpackage.C0198 -> L102
            return r8
        L69:
            r5 = 0
            r6 = 1635150182(0x61766966, float:2.8409336E20)
            r7 = 1
            if (r1 != r6) goto L72
            r1 = r7
            goto L73
        L72:
            r1 = r5
        L73:
            r8.skip(r2)     // Catch: defpackage.C0198 -> L102
            int r0 = r0 + (-16)
            int r2 = r0 % 4
            if (r2 != 0) goto L99
        L7c:
            r2 = 5
            if (r5 >= r2) goto L99
            if (r0 <= 0) goto L99
            int r2 = r8.mo660()     // Catch: defpackage.C0198 -> L102
            int r2 = r2 << 16
            int r3 = r8.mo660()     // Catch: defpackage.C0198 -> L102
            r2 = r2 | r3
            if (r2 != r4) goto L91
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF     // Catch: defpackage.C0198 -> L102
            return r8
        L91:
            if (r2 != r6) goto L94
            r1 = r7
        L94:
            int r5 = r5 + 1
            int r0 = r0 + (-4)
            goto L7c
        L99:
            if (r1 == 0) goto L9e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.AVIF     // Catch: defpackage.C0198 -> L102
            return r8
        L9e:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch: defpackage.C0198 -> L102
            return r8
        La1:
            r8.skip(r2)     // Catch: defpackage.C0198 -> L102
            int r0 = r8.mo660()     // Catch: defpackage.C0198 -> L102
            int r0 = r0 << 16
            int r1 = r8.mo660()     // Catch: defpackage.C0198 -> L102
            r0 = r0 | r1
            r1 = 1464156752(0x57454250, float:2.168886E14)
            if (r0 == r1) goto Lb7
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch: defpackage.C0198 -> L102
            return r8
        Lb7:
            int r0 = r8.mo660()     // Catch: defpackage.C0198 -> L102
            int r0 = r0 << 16
            int r1 = r8.mo660()     // Catch: defpackage.C0198 -> L102
            r0 = r0 | r1
            r1 = r0 & (-256(0xffffffffffffff00, float:NaN))
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r1 == r4) goto Lcc
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch: defpackage.C0198 -> L102
            return r8
        Lcc:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 88
            if (r0 != r1) goto Lea
            r8.skip(r2)     // Catch: defpackage.C0198 -> L102
            short r8 = r8.mo658()     // Catch: defpackage.C0198 -> L102
            r0 = r8 & 2
            if (r0 == 0) goto Le0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_WEBP     // Catch: defpackage.C0198 -> L102
            return r8
        Le0:
            r8 = r8 & 16
            if (r8 == 0) goto Le7
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A     // Catch: defpackage.C0198 -> L102
            return r8
        Le7:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch: defpackage.C0198 -> L102
            return r8
        Lea:
            r1 = 76
            if (r0 != r1) goto Lff
            r8.skip(r2)     // Catch: defpackage.C0198 -> L102
            short r8 = r8.mo658()     // Catch: defpackage.C0198 -> L102
            r8 = r8 & 8
            if (r8 == 0) goto Lfc
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A     // Catch: defpackage.C0198 -> L102
            return r8
        Lfc:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch: defpackage.C0198 -> L102
            return r8
        Lff:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch: defpackage.C0198 -> L102
            return r8
        L102:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            return r8
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static int m795(defpackage.InterfaceC0565 r9, int r10) {
        L0:
            short r0 = r9.mo658()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L24
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L86
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unknown segmentId="
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L24:
            short r0 = r9.mo658()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L2d
            goto L86
        L2d:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L4e
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L86
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Found MARKER_EOI in "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r10 = " segment"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L4e:
            int r1 = r9.mo660()
            int r1 = r1 + (-2)
            if (r0 == r10) goto L87
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L86
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unable to skip enough data, type: "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r10 = ", wanted to skip: "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r10 = ", but actually skipped: "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L86:
            return r3
        L87:
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static int m796(defpackage.InterfaceC0565 r13, byte[] r14, int r15) {
            int r13 = r13.mo659(r15, r14)
            r0 = -1
            r1 = 3
            java.lang.String r2 = "DfltImageHeaderParser"
            if (r13 == r15) goto L2a
            boolean r14 = android.util.Log.isLoggable(r2, r1)
            if (r14 == 0) goto L1b7
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to read exif segment data, length: "
            r14.<init>(r1)
            r14.append(r15)
            java.lang.String r15 = ", actually read: "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            android.util.Log.d(r2, r13)
            return r0
        L2a:
            byte[] r13 = defpackage.C0222.f1351
            boolean r13 = m798(r14, r15, r13)
            if (r13 == 0) goto L1ac
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.wrap(r14)
            java.nio.ByteOrder r14 = java.nio.ByteOrder.BIG_ENDIAN
            java.nio.ByteBuffer r13 = r13.order(r14)
            java.nio.Buffer r13 = r13.limit(r15)
            java.nio.ByteBuffer r13 = (java.nio.ByteBuffer) r13
            int r14 = r13.remaining()
            r15 = 6
            int r14 = r14 - r15
            r3 = 2
            if (r14 < r3) goto L50
            short r14 = r13.getShort(r15)
            goto L51
        L50:
            r14 = r0
        L51:
            r15 = 18761(0x4949, float:2.629E-41)
            if (r14 == r15) goto L76
            r15 = 19789(0x4d4d, float:2.773E-41)
            if (r14 == r15) goto L73
            boolean r15 = android.util.Log.isLoggable(r2, r1)
            if (r15 == 0) goto L70
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown endianness = "
            r15.<init>(r4)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            android.util.Log.d(r2, r14)
        L70:
            java.nio.ByteOrder r14 = java.nio.ByteOrder.BIG_ENDIAN
            goto L78
        L73:
            java.nio.ByteOrder r14 = java.nio.ByteOrder.BIG_ENDIAN
            goto L78
        L76:
            java.nio.ByteOrder r14 = java.nio.ByteOrder.LITTLE_ENDIAN
        L78:
            r13.order(r14)
            int r14 = r13.remaining()
            r15 = 10
            int r14 = r14 - r15
            r4 = 4
            if (r14 < r4) goto L8a
            int r14 = r13.getInt(r15)
            goto L8b
        L8a:
            r14 = r0
        L8b:
            int r15 = r14 + 6
            int r5 = r13.remaining()
            int r5 = r5 - r15
            if (r5 < r3) goto L99
            short r15 = r13.getShort(r15)
            goto L9a
        L99:
            r15 = r0
        L9a:
            r5 = 0
        L9b:
            if (r5 >= r15) goto L1b7
            int r6 = r14 + 8
            int r7 = r5 * 12
            int r7 = r7 + r6
            int r6 = r13.remaining()
            int r6 = r6 - r7
            if (r6 < r3) goto Lae
            short r6 = r13.getShort(r7)
            goto Laf
        Lae:
            r6 = r0
        Laf:
            r8 = 274(0x112, float:3.84E-43)
            if (r6 == r8) goto Lb5
            goto L1a8
        Lb5:
            int r8 = r7 + 2
            int r9 = r13.remaining()
            int r9 = r9 - r8
            if (r9 < r3) goto Lc3
            short r8 = r13.getShort(r8)
            goto Lc4
        Lc3:
            r8 = r0
        Lc4:
            r9 = 1
            if (r8 < r9) goto L191
            r9 = 12
            if (r8 <= r9) goto Lcd
            goto L191
        Lcd:
            int r9 = r7 + 4
            int r10 = r13.remaining()
            int r10 = r10 - r9
            if (r10 < r4) goto Ldb
            int r9 = r13.getInt(r9)
            goto Ldc
        Ldb:
            r9 = r0
        Ldc:
            if (r9 >= 0) goto Leb
            boolean r6 = android.util.Log.isLoggable(r2, r1)
            if (r6 == 0) goto L1a8
            java.lang.String r6 = "Negative tiff component count"
            android.util.Log.d(r2, r6)
            goto L1a8
        Leb:
            boolean r10 = android.util.Log.isLoggable(r2, r1)
            java.lang.String r11 = " tagType="
            if (r10 == 0) goto L11a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "Got tagIndex="
            r10.<init>(r12)
            r10.append(r5)
            r10.append(r11)
            r10.append(r6)
            java.lang.String r12 = " formatCode="
            r10.append(r12)
            r10.append(r8)
            java.lang.String r12 = " componentCount="
            r10.append(r12)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r2, r10)
        L11a:
            int[] r10 = defpackage.C0222.f1350
            r10 = r10[r8]
            int r9 = r9 + r10
            if (r9 <= r4) goto L13a
            boolean r6 = android.util.Log.isLoggable(r2, r1)
            if (r6 == 0) goto L1a8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Got byte count > 4, not orientation, continuing, formatCode="
            r6.<init>(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r2, r6)
            goto L1a8
        L13a:
            int r7 = r7 + 8
            if (r7 < 0) goto L173
            int r8 = r13.remaining()
            if (r7 <= r8) goto L145
            goto L173
        L145:
            if (r9 < 0) goto L15b
            int r9 = r9 + r7
            int r8 = r13.remaining()
            if (r9 <= r8) goto L14f
            goto L15b
        L14f:
            int r14 = r13.remaining()
            int r14 = r14 - r7
            if (r14 < r3) goto L15a
            short r0 = r13.getShort(r7)
        L15a:
            return r0
        L15b:
            boolean r7 = android.util.Log.isLoggable(r2, r1)
            if (r7 == 0) goto L1a8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Illegal number of bytes for TI tag data tagType="
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.d(r2, r6)
            goto L1a8
        L173:
            boolean r8 = android.util.Log.isLoggable(r2, r1)
            if (r8 == 0) goto L1a8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Illegal tagValueOffset="
            r8.<init>(r9)
            r8.append(r7)
            r8.append(r11)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.util.Log.d(r2, r6)
            goto L1a8
        L191:
            boolean r6 = android.util.Log.isLoggable(r2, r1)
            if (r6 == 0) goto L1a8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Got invalid format code = "
            r6.<init>(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r2, r6)
        L1a8:
            int r5 = r5 + 1
            goto L9b
        L1ac:
            boolean r13 = android.util.Log.isLoggable(r2, r1)
            if (r13 == 0) goto L1b7
            java.lang.String r13 = "Missing jpeg exif preamble"
            android.util.Log.d(r2, r13)
        L1b7:
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static boolean m797(defpackage.InterfaceC0565 r8, defpackage.C2063 r9) {
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = m794(r8)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG
            r2 = 0
            if (r0 == r1) goto La
            goto L6a
        La:
            r0 = 226(0xe2, float:3.17E-43)
            int r1 = m795(r8, r0)
        L10:
            java.lang.String r3 = "DfltImageHeaderParser"
            if (r1 <= 0) goto L5e
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Object r4 = r9.m3464(r4, r1)
            byte[] r4 = (byte[]) r4
            int r5 = r8.mo659(r1, r4)     // Catch: java.lang.Throwable -> L59
            if (r5 == r1) goto L44
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r3, r6)     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L42
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            java.lang.String r7 = "Unable to read APP2 segment data, length: "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L59
            r6.append(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = ", actually read: "
            r6.append(r1)     // Catch: java.lang.Throwable -> L59
            r6.append(r5)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L59
            android.util.Log.d(r3, r1)     // Catch: java.lang.Throwable -> L59
        L42:
            r1 = r2
            goto L4a
        L44:
            byte[] r3 = defpackage.C0222.f1352     // Catch: java.lang.Throwable -> L59
            boolean r1 = m798(r4, r1, r3)     // Catch: java.lang.Throwable -> L59
        L4a:
            if (r1 == 0) goto L51
            r9.m3468(r4)
            r8 = 1
            return r8
        L51:
            r9.m3468(r4)
            int r1 = m795(r8, r0)
            goto L10
        L59:
            r8 = move-exception
            r9.m3468(r4)
            throw r8
        L5e:
            r8 = 2
            boolean r8 = android.util.Log.isLoggable(r3, r8)
            if (r8 == 0) goto L6a
            java.lang.String r8 = "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found"
            android.util.Log.v(r3, r8)
        L6a:
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static boolean m798(byte[] r4, int r5, byte[] r6) {
            r0 = 0
            if (r4 == 0) goto La
            if (r6 == 0) goto La
            int r1 = r6.length
            if (r5 <= r1) goto La
            r5 = 1
            goto Lb
        La:
            r5 = r0
        Lb:
            if (r5 == 0) goto L1b
            r1 = r0
        Le:
            int r2 = r6.length
            if (r1 >= r2) goto L1b
            r2 = r4[r1]
            r3 = r6[r1]
            if (r2 == r3) goto L18
            return r0
        L18:
            int r1 = r1 + 1
            goto Le
        L1b:
            return r5
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static int m799(defpackage.InterfaceC0565 r7, defpackage.C2063 r8) {
            java.lang.String r0 = "Parser doesn't handle magic number: "
            r1 = -1
            int r2 = r7.mo660()     // Catch: defpackage.C0198 -> L59
            r3 = 65496(0xffd8, float:9.178E-41)
            r4 = r2 & r3
            r5 = 3
            java.lang.String r6 = "DfltImageHeaderParser"
            if (r4 == r3) goto L30
            r3 = 19789(0x4d4d, float:2.773E-41)
            if (r2 == r3) goto L30
            r3 = 18761(0x4949, float:2.629E-41)
            if (r2 != r3) goto L1a
            goto L30
        L1a:
            boolean r7 = android.util.Log.isLoggable(r6, r5)     // Catch: defpackage.C0198 -> L59
            if (r7 == 0) goto L59
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: defpackage.C0198 -> L59
            r7.<init>(r0)     // Catch: defpackage.C0198 -> L59
            r7.append(r2)     // Catch: defpackage.C0198 -> L59
            java.lang.String r7 = r7.toString()     // Catch: defpackage.C0198 -> L59
            android.util.Log.d(r6, r7)     // Catch: defpackage.C0198 -> L59
            return r1
        L30:
            r0 = 225(0xe1, float:3.15E-43)
            int r0 = m795(r7, r0)     // Catch: defpackage.C0198 -> L59
            if (r0 != r1) goto L44
            boolean r7 = android.util.Log.isLoggable(r6, r5)     // Catch: defpackage.C0198 -> L59
            if (r7 == 0) goto L59
            java.lang.String r7 = "Failed to parse exif segment length, or exif segment not found"
            android.util.Log.d(r6, r7)     // Catch: defpackage.C0198 -> L59
            return r1
        L44:
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r2 = r8.m3464(r2, r0)     // Catch: defpackage.C0198 -> L59
            byte[] r2 = (byte[]) r2     // Catch: defpackage.C0198 -> L59
            int r7 = m796(r7, r2, r0)     // Catch: java.lang.Throwable -> L54
            r8.m3468(r2)     // Catch: defpackage.C0198 -> L59
            return r7
        L54:
            r7 = move-exception
            r8.m3468(r2)     // Catch: defpackage.C0198 -> L59
            throw r7     // Catch: defpackage.C0198 -> L59
        L59:
            return r1
    }

    @Override // defpackage.InterfaceC1215
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean mo800(java.io.InputStream r2, defpackage.C2063 r3) {
            r1 = this;
            ᛸᲈᛸᲈ r1 = new ᛸᲈᛸᲈ
            r0 = 12
            r1.<init>(r0, r2)
            java.lang.String r2 = "Argument must not be null"
            defpackage.C0292.m944(r3, r2)
            boolean r1 = m797(r1, r3)
            return r1
    }

    @Override // defpackage.InterfaceC1215
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int mo801(java.nio.ByteBuffer r2, defpackage.C2063 r3) {
            r1 = this;
            ᛱᛸᛲ r1 = new ᛱᛸᛲ
            r0 = 1
            r1.<init>(r2, r0)
            java.lang.String r2 = "Argument must not be null"
            defpackage.C0292.m944(r3, r2)
            int r1 = m799(r1, r3)
            return r1
    }

    @Override // defpackage.InterfaceC1215
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean mo802(java.nio.ByteBuffer r2, defpackage.C2063 r3) {
            r1 = this;
            ᛱᛸᛲ r1 = new ᛱᛸᛲ
            r0 = 1
            r1.<init>(r2, r0)
            java.lang.String r2 = "Argument must not be null"
            defpackage.C0292.m944(r3, r2)
            boolean r1 = m797(r1, r3)
            return r1
    }

    @Override // defpackage.InterfaceC1215
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final com.bumptech.glide.load.ImageHeaderParser$ImageType mo803(java.nio.ByteBuffer r2) {
            r1 = this;
            ᛱᛸᛲ r1 = new ᛱᛸᛲ
            java.lang.String r0 = "Argument must not be null"
            defpackage.C0292.m944(r2, r0)
            r0 = 1
            r1.<init>(r2, r0)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = m794(r1)
            return r1
    }

    @Override // defpackage.InterfaceC1215
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int mo804(java.io.InputStream r2, defpackage.C2063 r3) {
            r1 = this;
            ᛸᲈᛸᲈ r1 = new ᛸᲈᛸᲈ
            r0 = 12
            r1.<init>(r0, r2)
            java.lang.String r2 = "Argument must not be null"
            defpackage.C0292.m944(r3, r2)
            int r1 = m799(r1, r3)
            return r1
    }

    @Override // defpackage.InterfaceC1215
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final com.bumptech.glide.load.ImageHeaderParser$ImageType mo805(java.io.InputStream r2) {
            r1 = this;
            ᛸᲈᛸᲈ r1 = new ᛸᲈᛸᲈ
            r0 = 12
            r1.<init>(r0, r2)
            com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = m794(r1)
            return r1
    }
}
