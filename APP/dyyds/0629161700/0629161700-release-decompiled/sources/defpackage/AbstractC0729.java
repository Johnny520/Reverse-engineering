package defpackage;

/* JADX INFO: renamed from: ᛴᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0729 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.lang.Object f3459 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1777 f3460 = null;

    static {
            ᲀᲇᲈᛴ r0 = new ᲀᲇᲈᛴ
            r1 = 12
            r0.<init>(r1)
            defpackage.AbstractC0729.f3460 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.AbstractC0729.f3459 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final java.lang.String m1635(defpackage.C0024 r2, int r3) {
            java.lang.String[] r2 = r2.f466
            int r0 = r3 * 2
            int r0 = r0 + 1
            java.lang.Object r2 = defpackage.AbstractC2315.m3767(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Lf
            return r2
        Lf:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "value["
            r0.<init>(r1)
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final boolean m1636(char r2, char r3, boolean r4) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            char r2 = java.lang.Character.toUpperCase(r2)
            char r3 = java.lang.Character.toUpperCase(r3)
            if (r2 == r3) goto L1e
            char r2 = java.lang.Character.toLowerCase(r2)
            char r3 = java.lang.Character.toLowerCase(r3)
            if (r2 != r3) goto L1d
            goto L1e
        L1d:
            return r1
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final defpackage.InterfaceC1925 m1637(defpackage.InterfaceC0493 r1) {
            ᲀᛴᛱᛱ r0 = defpackage.C1654.f7364
            ᛶᲁᛳᲈ r1 = r1.mo970(r0)
            boolean r0 = r1 instanceof defpackage.InterfaceC1925
            if (r0 == 0) goto Ld
            ᲁᲁᛴᛸ r1 = (defpackage.InterfaceC1925) r1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 != 0) goto L12
            ᲁᲁᛴᛸ r1 = defpackage.AbstractC0164.f1140
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static defpackage.C0162 m1638(defpackage.InterfaceC1612 r7, android.graphics.drawable.Drawable r8, int r9, int r10) {
            android.graphics.drawable.Drawable r8 = r8.getCurrent()
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 0
            if (r0 == 0) goto L11
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r8 = r8.getBitmap()
            goto L9d
        L11:
            boolean r0 = r8 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r0 != 0) goto L9c
            java.lang.String r0 = "Unable to draw "
            r3 = 5
            java.lang.String r4 = "DrawableToBitmap"
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 != r5) goto L41
            int r6 = r8.getIntrinsicWidth()
            if (r6 > 0) goto L41
            boolean r9 = android.util.Log.isLoggable(r4, r3)
            if (r9 == 0) goto L3f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.w(r4, r8)
        L3f:
            r8 = r2
            goto L95
        L41:
            if (r10 != r5) goto L64
            int r5 = r8.getIntrinsicHeight()
            if (r5 > 0) goto L64
            boolean r9 = android.util.Log.isLoggable(r4, r3)
            if (r9 == 0) goto L3f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.w(r4, r8)
            goto L3f
        L64:
            int r0 = r8.getIntrinsicWidth()
            if (r0 <= 0) goto L6e
            int r9 = r8.getIntrinsicWidth()
        L6e:
            int r0 = r8.getIntrinsicHeight()
            if (r0 <= 0) goto L78
            int r10 = r8.getIntrinsicHeight()
        L78:
            java.util.concurrent.locks.Lock r0 = defpackage.AbstractC1538.f6792
            r0.lock()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = r7.mo1254(r9, r10, r3)
            android.graphics.Canvas r4 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L97
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L97
            r8.setBounds(r1, r1, r9, r10)     // Catch: java.lang.Throwable -> L97
            r8.draw(r4)     // Catch: java.lang.Throwable -> L97
            r4.setBitmap(r2)     // Catch: java.lang.Throwable -> L97
            r0.unlock()
            r8 = r3
        L95:
            r1 = 1
            goto L9d
        L97:
            r7 = move-exception
            r0.unlock()
            throw r7
        L9c:
            r8 = r2
        L9d:
            if (r1 == 0) goto La0
            goto La2
        La0:
            ᲀᲇᲈᛴ r7 = defpackage.AbstractC0729.f3460
        La2:
            ᛱᲀᛴᲁ r7 = defpackage.C0162.m691(r7, r8)
            return r7
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static boolean m1639(char r1) {
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 != 0) goto Lf
            boolean r1 = java.lang.Character.isSpaceChar(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public static final long m1640(long r8) {
            ᛷᲈᲀ r0 = defpackage.AbstractC0984.f4413
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r3 = 1
            if (r2 <= 0) goto Lb
            r2 = r3
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 != r3) goto Lba
            r4 = 999999(0xf423f, double:4.94065E-318)
            ᛸᛸᲁᛵ r2 = defpackage.EnumC1551.f6876
            long r4 = defpackage.AbstractC0498.m1279(r4, r2)
            int r2 = (int) r8
            r2 = r2 & r3
            int r6 = (int) r4
            r6 = r6 & r3
            if (r2 != r6) goto L8f
            r6 = 1000000(0xf4240, double:4.940656E-318)
            if (r2 != 0) goto L42
            long r8 = r8 >> r3
            long r0 = r4 >> r3
            long r8 = r8 + r0
            r0 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L3c
            r0 = 4611686018427000000(0x3ffffffffffa14c0, double:1.999999999913868)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3c
            long r8 = r8 << r3
            int r0 = defpackage.AbstractC1556.f6889
            goto La0
        L3c:
            long r8 = r8 / r6
            long r8 = defpackage.AbstractC0498.m1273(r8)
            goto La0
        L42:
            long r8 = r8 >> r3
            long r4 = r4 >> r3
            long r8 = defpackage.AbstractC0498.m1277(r8, r4)
            r4 = 9223372036854759646(0x7fffffffffffc0de, double:NaN)
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 == 0) goto L89
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 == 0) goto L84
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L64
            goto L84
        L64:
            r0 = -4611686018426(0xfffffbce4217d286, double:NaN)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L7b
            r0 = 4611686018427(0x431bde82d7b, double:2.278475631111E-311)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L7b
            long r8 = r8 * r6
            long r8 = r8 << r3
            int r0 = defpackage.AbstractC1556.f6889
            goto La0
        L7b:
            long r8 = defpackage.AbstractC1754.m3138(r8)
            long r8 = defpackage.AbstractC0498.m1273(r8)
            goto La0
        L84:
            long r8 = defpackage.AbstractC0498.m1273(r8)
            goto La0
        L89:
            java.lang.String r8 = "Summing infinite durations of different signs yields an undefined result."
            defpackage.C2264.m3684(r8)
            return r0
        L8f:
            if (r2 != r3) goto L99
            long r8 = r8 >> r3
            long r0 = r4 >> r3
            long r8 = defpackage.AbstractC0984.m1926(r8, r0)
            goto La0
        L99:
            long r0 = r4 >> r3
            long r8 = r8 >> r3
            long r8 = defpackage.AbstractC0984.m1926(r0, r8)
        La0:
            int r0 = (int) r8
            r0 = r0 & r3
            if (r0 != r3) goto Lb3
            long r0 = defpackage.AbstractC0984.f4412
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb3
            long r0 = defpackage.AbstractC0984.f4411
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto Lb1
            goto Lb3
        Lb1:
            long r8 = r8 >> r3
            return r8
        Lb3:
            ᛸᛸᲁᛵ r0 = defpackage.EnumC1551.f6875
            long r8 = defpackage.AbstractC0984.m1927(r8, r0)
            return r8
        Lba:
            if (r2 != 0) goto Lbd
            return r0
        Lbd:
            ᛸᛵᛳᲀ r8 = new ᛸᛵᛳᲀ
            r8.<init>()
            throw r8
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C0024 m1641(defpackage.C0588 r2) {
            ᛱᛱᛷᛳ r0 = new ᛱᛱᛷᛳ
            java.util.ArrayList r2 = r2.f2955
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r2 = r2.toArray(r1)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.<init>(r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final void m1642(java.lang.String r5) {
            int r0 = r5.length()
            if (r0 <= 0) goto L5b
            int r0 = r5.length()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L5a
            char r2 = r5.charAt(r1)
            r3 = 33
            if (r3 > r2) goto L1c
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 >= r3) goto L1c
            int r1 = r1 + 1
            goto Lb
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected char 0x"
            r0.<init>(r3)
            r3 = 16
            m1643(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r3 = r2.length()
            r4 = 2
            if (r3 >= r4) goto L39
            java.lang.String r3 = "0"
            java.lang.String r2 = r3.concat(r2)
        L39:
            r0.append(r2)
            java.lang.String r2 = " at "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " in header name: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L5a:
            return
        L5b:
            java.lang.String r5 = "name is empty"
            defpackage.C2264.m3684(r5)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m1643(int r5) {
            r0 = 2
            if (r0 > r5) goto L8
            r1 = 37
            if (r5 >= r1) goto L8
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            ᛱᛵᲇᲇ r2 = new ᛱᛵᲇᲇ
            r3 = 36
            r4 = 1
            r2.<init>(r0, r3, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "radix "
            r0.<init>(r3)
            r0.append(r5)
            java.lang.String r5 = " was not in valid range "
            r0.append(r5)
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            r1.<init>(r5)
            throw r1
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final java.lang.Object m1644(long r3, defpackage.AbstractC1016 r5) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L7
            goto L2f
        L7:
            ᲈᛶᛳᛷ r0 = new ᲈᛶᛳᛷ
            ᛱᛸᛲᲀ r5 = defpackage.AbstractC0397.m1142(r5)
            r1 = 1
            r0.<init>(r1, r5)
            r0.m3660()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L26
            ᛳᛵᲈᛵ r5 = r0.f9598
            ᲁᲁᛴᛸ r5 = m1637(r5)
            r5.mo571(r3, r0)
        L26:
            java.lang.Object r3 = r0.m3654()
            ᛴᛵ r4 = defpackage.EnumC0670.f3246
            if (r3 != r4) goto L2f
            return r3
        L2f:
            ᲁᲀᛱᲁ r3 = defpackage.C1907.f8270
            return r3
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static final void m1645(java.lang.String r5, java.lang.String r6) {
            int r0 = r5.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L70
            char r2 = r5.charAt(r1)
            r3 = 9
            if (r2 == r3) goto L6d
            r3 = 32
            if (r3 > r2) goto L18
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 >= r3) goto L18
            goto L6d
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected char 0x"
            r0.<init>(r3)
            r3 = 16
            m1643(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r3 = r2.length()
            r4 = 2
            if (r3 >= r4) goto L35
            java.lang.String r3 = "0"
            java.lang.String r2 = r3.concat(r2)
        L35:
            r0.append(r2)
            java.lang.String r2 = " at "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " value"
            r0.append(r1)
            boolean r6 = defpackage.AbstractC0709.m1609(r6)
            if (r6 == 0) goto L56
            java.lang.String r5 = ""
            goto L5c
        L56:
            java.lang.String r6 = ": "
            java.lang.String r5 = r6.concat(r5)
        L5c:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L6d:
            int r1 = r1 + 1
            goto L5
        L70:
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static final defpackage.C2278 m1646(defpackage.InterfaceC1661 r13, java.lang.String r14, boolean r15) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PRAGMA index_xinfo(`"
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r1 = "`)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            ᛲᛳᲇᛱ r13 = r13.mo892(r0)
            java.lang.String r0 = "seqno"
            int r0 = defpackage.AbstractC1592.m2880(r13, r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = "cid"
            int r1 = defpackage.AbstractC1592.m2880(r13, r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "name"
            int r2 = defpackage.AbstractC1592.m2880(r13, r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = "desc"
            int r3 = defpackage.AbstractC1592.m2880(r13, r3)     // Catch: java.lang.Throwable -> L69
            r4 = -1
            r5 = 0
            if (r0 == r4) goto Lf2
            if (r1 == r4) goto Lf2
            if (r2 == r4) goto Lf2
            if (r3 != r4) goto L3b
            goto Lf2
        L3b:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L69
            r4.<init>()     // Catch: java.lang.Throwable -> L69
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L69
            r6.<init>()     // Catch: java.lang.Throwable -> L69
        L45:
            boolean r7 = r13.mo530()     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L7d
            long r7 = r13.getLong(r1)     // Catch: java.lang.Throwable -> L69
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L69
            if (r7 >= 0) goto L53
            goto L45
        L53:
            long r7 = r13.getLong(r0)     // Catch: java.lang.Throwable -> L69
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L69
            java.lang.String r8 = r13.mo526(r2)     // Catch: java.lang.Throwable -> L69
            long r9 = r13.getLong(r3)     // Catch: java.lang.Throwable -> L69
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L6c
            java.lang.String r9 = "DESC"
            goto L6e
        L69:
            r14 = move-exception
            goto Lf6
        L6c:
            java.lang.String r9 = "ASC"
        L6e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L69
            r4.put(r10, r8)     // Catch: java.lang.Throwable -> L69
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L69
            r6.put(r7, r9)     // Catch: java.lang.Throwable -> L69
            goto L45
        L7d:
            java.util.Set r0 = r4.entrySet()     // Catch: java.lang.Throwable -> L69
            ᲇᛵᲀᲇ r1 = new ᲇᛵᲀᲇ     // Catch: java.lang.Throwable -> L69
            r2 = 14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L69
            java.util.List r0 = defpackage.AbstractC1107.m2116(r0, r1)     // Catch: java.lang.Throwable -> L69
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L69
            int r2 = defpackage.AbstractC0575.m1369(r0)     // Catch: java.lang.Throwable -> L69
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
        L99:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L69
            r1.add(r2)     // Catch: java.lang.Throwable -> L69
            goto L99
        Laf:
            java.util.List r0 = defpackage.AbstractC1107.m2113(r1)     // Catch: java.lang.Throwable -> L69
            java.util.Set r1 = r6.entrySet()     // Catch: java.lang.Throwable -> L69
            ᲇᛵᲀᲇ r2 = new ᲇᛵᲀᲇ     // Catch: java.lang.Throwable -> L69
            r3 = 15
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L69
            java.util.List r1 = defpackage.AbstractC1107.m2116(r1, r2)     // Catch: java.lang.Throwable -> L69
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L69
            int r3 = defpackage.AbstractC0575.m1369(r1)     // Catch: java.lang.Throwable -> L69
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L69
        Lcf:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto Le5
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L69
            r2.add(r3)     // Catch: java.lang.Throwable -> L69
            goto Lcf
        Le5:
            java.util.List r1 = defpackage.AbstractC1107.m2113(r2)     // Catch: java.lang.Throwable -> L69
            ᲈᛶᲈᲈ r2 = new ᲈᛶᲈᲈ     // Catch: java.lang.Throwable -> L69
            r2.<init>(r14, r15, r0, r1)     // Catch: java.lang.Throwable -> L69
            defpackage.AbstractC0209.m772(r13, r5)
            return r2
        Lf2:
            defpackage.AbstractC0209.m772(r13, r5)
            return r5
        Lf6:
            throw r14     // Catch: java.lang.Throwable -> Lf7
        Lf7:
            r15 = move-exception
            defpackage.AbstractC0209.m772(r13, r14)
            throw r15
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public static final kotlin.Pair m1647(java.lang.String r1, java.lang.String r2) {
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final void m1648(android.view.View r3) {
            ᲀᛶᛴᛲ r0 = new ᲀᛶᛴᛲ
            r0.<init>()
            ᲈᛷᛲᛳ r1 = new ᲈᛷᛲᛳ
            r1.<init>(r3, r0)
            r1.f9636 = r0
            r0.f7507 = r1
        Le:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r0.next()
            android.view.View r3 = (android.view.View) r3
            r1 = 1711866625(0x66090301, float:1.617549E23)
            java.lang.Object r2 = r3.getTag(r1)
            ᛴᛷᛱᛱ r2 = (defpackage.C0701) r2
            if (r2 != 0) goto L2d
            ᛴᛷᛱᛱ r2 = new ᛴᛷᛱᛱ
            r2.<init>()
            r3.setTag(r1, r2)
        L2d:
            java.util.ArrayList r3 = r2.f3352
            int r1 = defpackage.AbstractC0425.m1184(r3)
            r2 = -1
            if (r2 < r1) goto L37
            goto Le
        L37:
            java.lang.Object r3 = r3.get(r1)
            r3.getClass()
            defpackage.C2264.m3679()
        L41:
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final java.lang.String m1649(defpackage.C0024 r2, int r3) {
            java.lang.String[] r2 = r2.f466
            int r0 = r3 * 2
            java.lang.Object r2 = defpackage.AbstractC2315.m3767(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Ld
            return r2
        Ld:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "name["
            r0.<init>(r1)
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static final java.util.List m1650(defpackage.InterfaceC0270 r10) {
            java.lang.String r0 = "id"
            int r0 = defpackage.AbstractC1592.m2880(r10, r0)
            java.lang.String r1 = "seq"
            int r1 = defpackage.AbstractC1592.m2880(r10, r1)
            java.lang.String r2 = "from"
            int r2 = defpackage.AbstractC1592.m2880(r10, r2)
            java.lang.String r3 = "to"
            int r3 = defpackage.AbstractC1592.m2880(r10, r3)
            ᛱᲇᲀᛲ r4 = defpackage.AbstractC0425.m1189()
        L1c:
            boolean r5 = r10.mo530()
            if (r5 == 0) goto L3d
            ᲇᛲᛴᛵ r5 = new ᲇᛲᛴᛵ
            long r6 = r10.getLong(r0)
            int r6 = (int) r6
            long r7 = r10.getLong(r1)
            int r7 = (int) r7
            java.lang.String r8 = r10.mo526(r2)
            java.lang.String r9 = r10.mo526(r3)
            r5.<init>(r6, r7, r8, r9)
            r4.add(r5)
            goto L1c
        L3d:
            ᛱᲇᲀᛲ r10 = defpackage.AbstractC0425.m1197(r4)
            java.util.List r10 = defpackage.AbstractC1107.m2111(r10)
            return r10
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final defpackage.C0588 m1651(defpackage.C0024 r2) {
            ᛳᲈᛳᛸ r0 = new ᛳᲈᛳᛸ
            r1 = 2
            r0.<init>(r1)
            java.util.ArrayList r1 = r0.f2955
            java.lang.String[] r2 = r2.f466
            defpackage.AbstractC1376.m2543(r1, r2)
            return r0
    }
}
