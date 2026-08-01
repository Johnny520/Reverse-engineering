package defpackage;

/* JADX INFO: renamed from: ᛱᛴᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0069 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final byte[] f769 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final byte[] f770 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final byte[] f771 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final byte[] f772 = null;


    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final byte[] f774 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final byte[] f775 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final byte[] f776 = null;


    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static defpackage.EnumC0630 m512(java.lang.String r2) {
            int r0 = r2.hashCode()
            r1 = 79201641(0x4b88569, float:4.338071E-36)
            if (r0 == r1) goto L3e
            r1 = 79923350(0x4c38896, float:4.5969714E-36)
            if (r0 == r1) goto L33
            switch(r0) {
                case -503070503: goto L28;
                case -503070502: goto L1d;
                case -503070501: goto L12;
                default: goto L11;
            }
        L11:
            goto L49
        L12:
            java.lang.String r0 = "TLSv1.3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            ᛴᛲᲀᛸ r2 = defpackage.EnumC0630.f3128
            return r2
        L1d:
            java.lang.String r0 = "TLSv1.2"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            ᛴᛲᲀᛸ r2 = defpackage.EnumC0630.f3127
            return r2
        L28:
            java.lang.String r0 = "TLSv1.1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            ᛴᛲᲀᛸ r2 = defpackage.EnumC0630.f3129
            return r2
        L33:
            java.lang.String r0 = "TLSv1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            ᛴᛲᲀᛸ r2 = defpackage.EnumC0630.f3130
            return r2
        L3e:
            java.lang.String r0 = "SSLv3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            ᛴᛲᲀᛸ r2 = defpackage.EnumC0630.f3125
            return r2
        L49:
            java.lang.String r0 = "Unexpected TLS version: "
            java.lang.String r2 = r0.concat(r2)
            defpackage.C2264.m3684(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static int m513(int r3) {
            r0 = 1
            if (r3 == r0) goto L3f
            r1 = 2
            if (r3 == r1) goto L3e
            r0 = 4
            if (r3 == r0) goto L3d
            r1 = 8
            if (r3 == r1) goto L3b
            r2 = 16
            if (r3 == r2) goto L3a
            r0 = 32
            if (r3 == r0) goto L38
            r0 = 64
            if (r3 == r0) goto L36
            r0 = 128(0x80, float:1.8E-43)
            if (r3 == r0) goto L34
            r0 = 256(0x100, float:3.59E-43)
            if (r3 == r0) goto L33
            r0 = 512(0x200, float:7.17E-43)
            if (r3 != r0) goto L28
            r3 = 9
            return r3
        L28:
            java.lang.String r0 = "type needs to be >= FIRST and <= LAST, type="
            java.lang.String r3 = defpackage.AbstractC1124.m2145(r3, r0)
            defpackage.C2264.m3684(r3)
            r3 = 0
            return r3
        L33:
            return r1
        L34:
            r3 = 7
            return r3
        L36:
            r3 = 6
            return r3
        L38:
            r3 = 5
            return r3
        L3a:
            return r0
        L3b:
            r3 = 3
            return r3
        L3d:
            return r1
        L3e:
            return r0
        L3f:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static defpackage.InterfaceC0277 m514(defpackage.InterfaceC1781 r4) {
            ᛸᛶᛱᛵ r0 = defpackage.C1500.f6601
            r1 = 2
            int r2 = defpackage.AbstractC0225.m812(r1)
            if (r2 == 0) goto L28
            r3 = 1
            if (r2 == r3) goto L1e
            if (r2 != r1) goto L18
            ᛵᛶᛵᲈ r1 = new ᛵᛶᛵᲈ
            r1.<init>()
            r1.f4151 = r4
            r1.f4150 = r0
            return r1
        L18:
            ᛸᛵᛳᲀ r4 = new ᛸᛵᛳᲀ
            r4.<init>()
            throw r4
        L1e:
            ᲁᛲᛶᛴ r1 = new ᲁᛲᛶᛴ
            r1.<init>()
            r1.f7937 = r4
            r1.f7936 = r0
            return r1
        L28:
            ᛲᲈᛶᲈ r0 = new ᛲᲈᛶᲈ
            r0.<init>(r4)
            return r0
    }


    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static byte[] m516(java.io.RandomAccessFile r10, long r11) {
            r10.seek(r11)
            long r11 = m517(r10)
            r0 = 8
            long r11 = r11 - r0
            r2 = -342906178543150(0xfffec820ef0961d2, double:NaN)
            java.lang.String r2 = "APK Sig Block 42"
            java.nio.charset.Charset r3 = defpackage.AbstractC1422.f6221
            byte[] r2 = r2.getBytes(r3)
            r3 = -342979192987182(0xfffec80fef0961d2, double:NaN)
        L21:
            r3 = 24
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 <= 0) goto L86
            long r3 = r10.getFilePointer()
            r5 = 16
            byte[] r5 = new byte[r5]
            r10.readFully(r5)
            boolean r5 = java.util.Arrays.equals(r5, r2)
            if (r5 != 0) goto L86
            r10.seek(r3)
            long r3 = m517(r10)
            r5 = 4
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L77
            int r7 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r7 > 0) goto L77
            r7 = 4
            byte[] r7 = new byte[r7]
            r10.readFully(r7)
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r7 = r7.order(r8)
            int r7 = r7.getInt()
            long r5 = r3 - r5
            int r5 = (int) r5
            r6 = -262969152(0xfffffffff05368c0, float:-2.6171189E29)
            if (r7 != r6) goto L6b
            byte[] r11 = new byte[r5]
            r10.readFully(r11)
            return r11
        L6b:
            long r6 = r10.getFilePointer()
            long r8 = (long) r5
            long r6 = r6 + r8
            r10.seek(r6)
            long r3 = r3 + r0
            long r11 = r11 - r3
            goto L21
        L77:
            java.lang.Exception r10 = new java.lang.Exception
            r11 = -343039322529326(0xfffec801ef0961d2, double:NaN)
            java.lang.String r11 = "无效的pair长度"
            r10.<init>(r11)
            throw r10
        L86:
            java.lang.Exception r10 = new java.lang.Exception
            r11 = -343082272202286(0xfffec7f7ef0961d2, double:NaN)
            java.lang.String r11 = "未找到v3签名块"
            r10.<init>(r11)
            throw r10
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static long m517(java.io.RandomAccessFile r2) {
            r0 = 8
            byte[] r0 = new byte[r0]
            r2.readFully(r0)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r0)
            long r0 = r2.getLong()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static java.util.ArrayList m518(byte[] r3) {
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r3 = r3.order(r0)
            r3.getInt()
            r3.getInt()
            int r1 = r3.getInt()
            byte[] r1 = new byte[r1]
            r3.get(r1)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r1)
            java.nio.ByteBuffer r3 = r3.order(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r3.getInt()
            int r2 = r3.position()
            int r2 = r2 + r1
            r3.position(r2)
            int r1 = r3.getInt()
            int r2 = r3.position()
            int r2 = r2 + r1
        L3b:
            int r1 = r3.position()
            if (r1 >= r2) goto L4e
            int r1 = r3.getInt()
            byte[] r1 = new byte[r1]
            r3.get(r1)
            r0.add(r1)
            goto L3b
        L4e:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L55
            return r0
        L55:
            java.lang.Exception r3 = new java.lang.Exception
            r0 = -343120926907950(0xfffec7eeef0961d2, double:NaN)
            java.lang.String r0 = "未找到证书"
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C2098 m519(java.lang.Enum[] r1) {
            ᲇᛷᲇᲁ r0 = new ᲇᛷᲇᲁ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static int m520(android.content.Context r6, java.lang.String r7) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r6.getPackageName()
            int r0 = r6.checkPermission(r7, r0, r1)
            r3 = -1
            if (r0 != r3) goto L14
            goto L2f
        L14:
            java.lang.String r7 = android.app.AppOpsManager.permissionToOp(r7)
            r0 = 0
            if (r7 != 0) goto L1c
            goto L71
        L1c:
            if (r2 != 0) goto L30
            android.content.pm.PackageManager r2 = r6.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L2f
            int r4 = r2.length
            if (r4 > 0) goto L2c
            goto L2f
        L2c:
            r2 = r2[r0]
            goto L30
        L2f:
            return r3
        L30:
            int r3 = android.os.Process.myUid()
            java.lang.String r4 = r6.getPackageName()
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            if (r3 != r1) goto L65
            boolean r3 = java.util.Objects.equals(r4, r2)
            if (r3 == 0) goto L65
            java.lang.Object r3 = r6.getSystemService(r5)
            android.app.AppOpsManager r3 = (android.app.AppOpsManager) r3
            int r4 = android.os.Binder.getCallingUid()
            r5 = 1
            if (r3 != 0) goto L51
            r2 = r5
            goto L55
        L51:
            int r2 = r3.checkOpNoThrow(r7, r4, r2)
        L55:
            if (r2 == 0) goto L58
            goto L6f
        L58:
            java.lang.String r6 = r6.getOpPackageName()
            if (r3 != 0) goto L5f
            goto L63
        L5f:
            int r5 = r3.checkOpNoThrow(r7, r1, r6)
        L63:
            r2 = r5
            goto L6f
        L65:
            java.lang.Object r6 = r6.getSystemService(r5)
            android.app.AppOpsManager r6 = (android.app.AppOpsManager) r6
            int r2 = r6.noteProxyOpNoThrow(r7, r2)
        L6f:
            if (r2 != 0) goto L72
        L71:
            return r0
        L72:
            r6 = -2
            return r6
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final int m521(defpackage.InterfaceC1661 r2) {
            java.lang.String r0 = "SELECT changes()"
            ᛲᛳᲇᛱ r2 = r2.mo892(r0)
            r2.mo530()     // Catch: java.lang.Throwable -> L14
            r0 = 0
            long r0 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L14
            int r0 = (int) r0
            r1 = 0
            defpackage.AbstractC0209.m772(r2, r1)
            return r0
        L14:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L16
        L16:
            r1 = move-exception
            defpackage.AbstractC0209.m772(r2, r0)
            throw r1
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static void m522(defpackage.C0682 r11, float r12) {
            java.lang.Object r0 = r11.f3286
            ᛴᲀᛳᲇ r0 = (defpackage.C0744) r0
            java.lang.Object r1 = r11.f3285
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            boolean r2 = r1.getUseCompatPadding()
            boolean r3 = r1.getPreventCornerOverlap()
            float r4 = r0.f3508
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 != 0) goto L1f
            boolean r4 = r0.f3514
            if (r4 != r2) goto L1f
            boolean r4 = r0.f3515
            if (r4 != r3) goto L1f
            goto L2c
        L1f:
            r0.f3508 = r12
            r0.f3514 = r2
            r0.f3515 = r3
            r12 = 0
            r0.m1663(r12)
            r0.invalidateSelf()
        L2c:
            boolean r12 = r1.getUseCompatPadding()
            if (r12 != 0) goto L37
            r12 = 0
            r11.m1552(r12, r12, r12, r12)
            return
        L37:
            java.lang.Object r12 = r11.f3286
            ᛴᲀᛳᲇ r12 = (defpackage.C0744) r12
            float r0 = r12.f3508
            float r12 = r12.f3511
            boolean r2 = r1.getPreventCornerOverlap()
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r2 == 0) goto L51
            double r5 = (double) r0
            double r7 = defpackage.AbstractC1740.f7702
            double r7 = r3 - r7
            double r9 = (double) r12
            double r7 = r7 * r9
            double r7 = r7 + r5
            float r2 = (float) r7
            goto L54
        L51:
            int r2 = defpackage.AbstractC1740.f7703
            r2 = r0
        L54:
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
            boolean r1 = r1.getPreventCornerOverlap()
            r5 = 1069547520(0x3fc00000, float:1.5)
            if (r1 == 0) goto L6c
            float r0 = r0 * r5
            double r0 = (double) r0
            double r5 = defpackage.AbstractC1740.f7702
            double r3 = r3 - r5
            double r5 = (double) r12
            double r3 = r3 * r5
            double r3 = r3 + r0
            float r12 = (float) r3
            goto L6e
        L6c:
            float r12 = r0 * r5
        L6e:
            double r0 = (double) r12
            double r0 = java.lang.Math.ceil(r0)
            int r12 = (int) r0
            r11.m1552(r2, r12, r2, r12)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static long m524(java.io.RandomAccessFile r4, long r5) {
            r0 = 32
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L6a
            r0 = 16
            long r0 = r5 - r0
            r4.seek(r0)
            r0 = 16
            byte[] r0 = new byte[r0]
            r4.readFully(r0)
            r1 = -342519631486510(0xfffec87aef0961d2, double:NaN)
            java.lang.String r1 = "APK Sig Block 42"
            java.nio.charset.Charset r2 = defpackage.AbstractC1422.f6221
            byte[] r1 = r1.getBytes(r2)
            r2 = -342592645930542(0xfffec869ef0961d2, double:NaN)
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L5b
            r0 = 24
            long r0 = r5 - r0
            r4.seek(r0)
            long r0 = m517(r4)
            long r5 = r5 - r0
            r2 = 8
            long r5 = r5 - r2
            r4.seek(r5)
            long r2 = m517(r4)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L4c
            return r5
        L4c:
            java.lang.Exception r4 = new java.lang.Exception
            r5 = -342768739589678(0xfffec840ef0961d2, double:NaN)
            java.lang.String r5 = "apk signing block size mismatch"
            r4.<init>(r5)
            throw r4
        L5b:
            java.lang.Exception r4 = new java.lang.Exception
            r5 = -342652775472686(0xfffec85bef0961d2, double:NaN)
            java.lang.String r5 = "未找到APK Signing Block magic"
            r4.<init>(r5)
            throw r4
        L6a:
            java.lang.Exception r4 = new java.lang.Exception
            r5 = -342420847238702(0xfffec891ef0961d2, double:NaN)
            java.lang.String r5 = "Central Directory偏移量太小"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static long m525(java.io.RandomAccessFile r4) {
            long r0 = r4.length()
            r2 = 22
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L67
            r2 = 65557(0x10015, double:3.23895E-319)
            long r2 = java.lang.Math.min(r0, r2)
            long r0 = r0 - r2
            r4.seek(r0)
            int r0 = (int) r2
            byte[] r1 = new byte[r0]
            r4.readFully(r1)
            int r0 = r0 + (-22)
        L1d:
            r4 = -1
            if (r4 >= r0) goto L58
            r4 = r1[r0]
            r2 = 80
            if (r4 != r2) goto L55
            int r4 = r0 + 1
            r4 = r1[r4]
            r2 = 75
            if (r4 != r2) goto L55
            int r4 = r0 + 2
            r4 = r1[r4]
            r2 = 5
            if (r4 != r2) goto L55
            int r4 = r0 + 3
            r4 = r1[r4]
            r2 = 6
            if (r4 != r2) goto L55
            int r0 = r0 + 16
            r4 = 4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r1, r0, r4)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r4 = r4.order(r0)
            int r4 = r4.getInt()
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
        L55:
            int r0 = r0 + (-1)
            goto L1d
        L58:
            java.lang.Exception r4 = new java.lang.Exception
            r0 = -342300588154414(0xfffec8adef0961d2, double:NaN)
            java.lang.String r0 = "未找到End of Central Directory"
            r4.<init>(r0)
            throw r4
        L67:
            java.lang.Exception r4 = new java.lang.Exception
            r0 = -342231868677678(0xfffec8bdef0961d2, double:NaN)
            java.lang.String r0 = "文件太小，不是有效的APK文件"
            r4.<init>(r0)
            throw r4
    }
}
