package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛵᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0473 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final java.lang.Object[] f1702 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final byte[] f1703 = null;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final byte[] f1704 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final int[] f1705 = null;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final byte[] f1706 = null;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final byte[] f1707 = null;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final byte[] f1708 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final byte[] f1709 = null;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final byte[] f1710 = null;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            xhss.AbstractC0473.f1705 = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            xhss.AbstractC0473.f1702 = r0
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x003c: FILL_ARRAY_DATA , data: [48, 49, 53, 0} // fill-array
            xhss.AbstractC0473.f1703 = r1
            byte[] r1 = new byte[r0]
            r1 = {x0042: FILL_ARRAY_DATA , data: [48, 49, 48, 0} // fill-array
            xhss.AbstractC0473.f1709 = r1
            byte[] r1 = new byte[r0]
            r1 = {x0048: FILL_ARRAY_DATA , data: [48, 48, 57, 0} // fill-array
            xhss.AbstractC0473.f1704 = r1
            byte[] r1 = new byte[r0]
            r1 = {x004e: FILL_ARRAY_DATA , data: [48, 48, 53, 0} // fill-array
            xhss.AbstractC0473.f1710 = r1
            byte[] r1 = new byte[r0]
            r1 = {x0054: FILL_ARRAY_DATA , data: [48, 48, 49, 0} // fill-array
            xhss.AbstractC0473.f1708 = r1
            byte[] r1 = new byte[r0]
            r1 = {x005a: FILL_ARRAY_DATA , data: [48, 48, 49, 0} // fill-array
            xhss.AbstractC0473.f1707 = r1
            byte[] r0 = new byte[r0]
            r0 = {x0060: FILL_ARRAY_DATA , data: [48, 48, 50, 0} // fill-array
            xhss.AbstractC0473.f1706 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final int m853(long[] r4, int r5, long r6) {
            int r5 = r5 + (-1)
            r0 = 0
        L3:
            if (r0 > r5) goto L18
            int r1 = r0 + r5
            int r1 = r1 >>> 1
            r2 = r4[r1]
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L12
            int r0 = r1 + 1
            goto L3
        L12:
            if (r2 <= 0) goto L17
            int r5 = r1 + (-1)
            goto L3
        L17:
            return r1
        L18:
            int r4 = ~r0
            return r4
    }

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public static java.lang.String m854(java.lang.String r11) {
            if (r11 != 0) goto L4
            r11 = 0
            return r11
        L4:
            int r0 = r11.length()
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 4
            r2.<init>(r3)
            r4 = 0
            r5 = r4
            r6 = r5
            r7 = r6
        L17:
            r8 = 92
            if (r5 >= r0) goto Lb6
            char r9 = r11.charAt(r5)
            if (r7 == 0) goto L54
            r2.append(r9)
            int r8 = r2.length()
            if (r8 != r3) goto Lb2
            java.lang.String r6 = r2.toString()     // Catch: java.lang.NumberFormatException -> L3f
            r7 = 16
            int r6 = java.lang.Integer.parseInt(r6, r7)     // Catch: java.lang.NumberFormatException -> L3f
            char r6 = (char) r6     // Catch: java.lang.NumberFormatException -> L3f
            r1.write(r6)     // Catch: java.lang.NumberFormatException -> L3f
            r2.setLength(r4)     // Catch: java.lang.NumberFormatException -> L3f
            r6 = r4
            r7 = r6
            goto Lb2
        L3f:
            r11 = move-exception
            xhss.ᛵᛲᛲᲇ r0 = new xhss.ᛵᛲᛲᲇ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to parse unicode value: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r11)
            throw r0
        L54:
            r10 = 1
            if (r6 == 0) goto Lab
            r6 = 34
            if (r9 == r6) goto La6
            r6 = 39
            if (r9 == r6) goto La2
            if (r9 == r8) goto L9e
            r6 = 98
            if (r9 == r6) goto L98
            r6 = 102(0x66, float:1.43E-43)
            if (r9 == r6) goto L92
            r6 = 110(0x6e, float:1.54E-43)
            if (r9 == r6) goto L8c
            r6 = 114(0x72, float:1.6E-43)
            if (r9 == r6) goto L86
            r6 = 116(0x74, float:1.63E-43)
            if (r9 == r6) goto L80
            r6 = 117(0x75, float:1.64E-43)
            if (r9 == r6) goto L7d
            r1.write(r9)
            goto La9
        L7d:
            r6 = r4
            r7 = r10
            goto Lb2
        L80:
            r6 = 9
            r1.write(r6)
            goto La9
        L86:
            r6 = 13
            r1.write(r6)
            goto La9
        L8c:
            r6 = 10
            r1.write(r6)
            goto La9
        L92:
            r6 = 12
            r1.write(r6)
            goto La9
        L98:
            r6 = 8
            r1.write(r6)
            goto La9
        L9e:
            r1.write(r8)
            goto La9
        La2:
            r1.write(r6)
            goto La9
        La6:
            r1.write(r6)
        La9:
            r6 = r4
            goto Lb2
        Lab:
            if (r9 != r8) goto Laf
            r6 = r10
            goto Lb2
        Laf:
            r1.write(r9)
        Lb2:
            int r5 = r5 + 1
            goto L17
        Lb6:
            if (r6 == 0) goto Lbb
            r1.write(r8)
        Lbb:
            java.lang.String r11 = r1.toString()
            return r11
    }

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public static xhss.C0023 m855(int r2, int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 > r0) goto L9
            xhss.ᛱᛲᲇᲀ r2 = xhss.C0023.f203
            xhss.ᛱᛲᲇᲀ r2 = xhss.C0023.f203
            return r2
        L9:
            xhss.ᛱᛲᲇᲀ r0 = new xhss.ᛱᛲᲇᲀ
            r1 = 1
            int r3 = r3 - r1
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static void m856(java.lang.String r0, java.lang.String r1) {
            if (r0 == 0) goto L9
            int r0 = r0.length()
            if (r0 == 0) goto L9
            return
        L9:
            xhss.C0532.m959(r1)
            return
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static xhss.C0973 m857(java.nio.MappedByteBuffer r14) {
            java.nio.ByteBuffer r14 = r14.duplicate()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r14.order(r0)
            int r0 = r14.position()
            int r0 = r0 + 4
            r14.position(r0)
            short r0 = r14.getShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 100
            r2 = 0
            java.lang.String r3 = "Cannot read metadata."
            if (r0 > r1) goto Ld4
            int r1 = r14.position()
            int r1 = r1 + 6
            r14.position(r1)
            r1 = 0
            r4 = r1
        L2c:
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = -1
            if (r4 >= r0) goto L5a
            int r9 = r14.getInt()
            int r10 = r14.position()
            int r10 = r10 + 4
            r14.position(r10)
            int r10 = r14.getInt()
            long r10 = (long) r10
            long r10 = r10 & r5
            int r12 = r14.position()
            int r12 = r12 + 4
            r14.position(r12)
            r12 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r12 != r9) goto L57
            goto L5b
        L57:
            int r4 = r4 + 1
            goto L2c
        L5a:
            r10 = r7
        L5b:
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 == 0) goto Ld0
            int r0 = r14.position()
            long r7 = (long) r0
            long r7 = r10 - r7
            int r0 = (int) r7
            int r4 = r14.position()
            int r4 = r4 + r0
            r14.position(r4)
            int r0 = r14.position()
            int r0 = r0 + 12
            r14.position(r0)
            int r0 = r14.getInt()
            long r7 = (long) r0
            long r7 = r7 & r5
        L7e:
            long r12 = (long) r1
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 >= 0) goto Ld0
            int r0 = r14.getInt()
            int r4 = r14.getInt()
            long r12 = (long) r4
            long r12 = r12 & r5
            r14.getInt()
            r4 = 1164798569(0x456d6a69, float:3798.6506)
            if (r4 == r0) goto L9e
            r4 = 1701669481(0x656d6a69, float:7.0072736E22)
            if (r4 != r0) goto L9b
            goto L9e
        L9b:
            int r1 = r1 + 1
            goto L7e
        L9e:
            long r12 = r12 + r10
            int r0 = (int) r12
            r14.position(r0)
            xhss.ᲁᛸᛱᲀ r0 = new xhss.ᲁᛸᛱᲀ
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r14.order(r1)
            int r1 = r14.position()
            int r1 = r14.getInt(r1)
            int r2 = r14.position()
            int r2 = r2 + r1
            r0.f1739 = r14
            r0.f1737 = r2
            int r14 = r14.getInt(r2)
            int r2 = r2 - r14
            r0.f1738 = r2
            java.lang.Object r14 = r0.f1739
            java.nio.ByteBuffer r14 = (java.nio.ByteBuffer) r14
            short r14 = r14.getShort(r2)
            r0.f1740 = r14
            return r0
        Ld0:
            xhss.C0532.m947(r3)
            return r2
        Ld4:
            xhss.C0532.m947(r3)
            return r2
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static void m858(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            xhss.C0532.m959(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final int m859(int r3, int r4, int[] r5) {
            int r3 = r3 + (-1)
            r0 = 0
        L3:
            if (r0 > r3) goto L16
            int r1 = r0 + r3
            int r1 = r1 >>> 1
            r2 = r5[r1]
            if (r2 >= r4) goto L10
            int r0 = r1 + 1
            goto L3
        L10:
            if (r2 <= r4) goto L15
            int r3 = r1 + (-1)
            goto L3
        L15:
            return r1
        L16:
            int r3 = ~r0
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static java.lang.String m860(java.lang.CharSequence... r7) {
            int r0 = r7.length
            if (r0 != 0) goto L4
            goto L2d
        L4:
            int r0 = r7.length
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L10
            r7 = r7[r2]
            java.lang.String r7 = r7.toString()
            return r7
        L10:
            r0 = -1
            r4 = r0
            r1 = r2
            r3 = r1
        L14:
            int r5 = r7.length
            if (r1 >= r5) goto L2b
            r5 = r7[r1]
            int r5 = r5.length()
            int r3 = r3 + r5
            r6 = -2
            if (r4 == r6) goto L28
            if (r5 <= 0) goto L28
            if (r4 != r0) goto L27
            r4 = r1
            goto L28
        L27:
            r4 = r6
        L28:
            int r1 = r1 + 1
            goto L14
        L2b:
            if (r3 != 0) goto L30
        L2d:
            java.lang.String r7 = ""
            return r7
        L30:
            if (r4 <= 0) goto L39
            r7 = r7[r4]
            java.lang.String r7 = r7.toString()
            return r7
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            int r1 = r7.length
        L3f:
            if (r2 >= r1) goto L49
            r3 = r7[r2]
            r0.append(r3)
            int r2 = r2 + 1
            goto L3f
        L49:
            java.lang.String r7 = r0.toString()
            return r7
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static long m861(long r3) {
            r0 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto La
            return r0
        La:
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L14
            return r0
        L14:
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static final xhss.InterfaceC0022 m862(xhss.AbstractC0784 r7, boolean r8, xhss.AbstractC0381 r9) {
            boolean r0 = r7 instanceof xhss.AbstractC0784
            if (r0 == 0) goto L9
            xhss.ᛱᛲᲁᲇ r7 = r7.m1332(r8, r9)
            return r7
        L9:
            boolean r0 = r9.mo438()
            xhss.ᛳᛸᛱᲇ r1 = new xhss.ᛳᛸᛱᲇ
            java.lang.String r5 = "invoke"
            java.lang.String r6 = "invoke(Ljava/lang/Throwable;)V"
            r2 = 1
            java.lang.Class<xhss.ᛴᛷᛴᲀ> r3 = xhss.AbstractC0381.class
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            if (r0 == 0) goto L22
            xhss.ᛲᛶᲁᲈ r9 = new xhss.ᛲᛶᲁᲈ
            r9.<init>(r1)
            goto L27
        L22:
            xhss.ᛶᲇᛱᛲ r9 = new xhss.ᛶᲇᛱᛲ
            r9.<init>(r1)
        L27:
            xhss.ᛱᛲᲁᲇ r7 = r7.m1332(r8, r9)
            return r7
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static xhss.C0774 m863(android.content.Context r12) {
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            java.lang.String r1 = "Package manager required to locate emoji font provider"
            xhss.AbstractC0060.m191(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
            r1.<init>(r2)
            r2 = 0
            java.util.List r1 = r0.queryIntentContentProviders(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L35
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r3.providerInfo
            if (r3 == 0) goto L19
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L19
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L19
            goto L36
        L35:
            r3 = r4
        L36:
            if (r3 != 0) goto L3a
        L38:
            r5 = r4
            goto L6f
        L3a:
            java.lang.String r6 = r3.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r7 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r1 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r7, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            int r3 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
        L4c:
            if (r2 >= r3) goto L5a
            r5 = r0[r2]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            byte[] r5 = r5.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r1.add(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            int r2 = r2 + 1
            goto L4c
        L5a:
            java.util.List r9 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            xhss.ᛷᛱᛲᲇ r5 = new xhss.ᛷᛱᛲᲇ     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r8 = "emojicompat-emoji-font"
            r10 = 0
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            goto L6f
        L68:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L38
        L6f:
            if (r5 != 0) goto L72
            goto L7c
        L72:
            xhss.ᛸᛶᛱᲀ r4 = new xhss.ᛸᛶᛱᲀ
            xhss.ᛲᛳᛲᛲ r0 = new xhss.ᛲᛳᛲᛲ
            r0.<init>(r12, r5)
            r4.<init>(r0)
        L7c:
            return r4
    }

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public static int m864(java.lang.String r7, int r8, int r9) {
            r9 = r9 & 8
            if (r9 == 0) goto L8
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto Lb
        L8:
            r9 = 2097150(0x1ffffe, float:2.938733E-39)
        Lb:
            long r1 = (long) r8
            r3 = 1
            long r5 = (long) r9
            r0 = r7
            long r7 = m866(r0, r1, r3, r5)
            int r7 = (int) r7
            return r7
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static int m865(int r2, int r3, int r4) {
            if (r3 > r4) goto L9
            if (r2 >= r3) goto L5
            return r3
        L5:
            if (r2 <= r4) goto L8
            return r4
        L8:
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public static final long m866(java.lang.String r4, long r5, long r7, long r9) {
            int r0 = xhss.AbstractC0903.f2932
            java.lang.String r0 = java.lang.System.getProperty(r4)     // Catch: java.lang.SecurityException -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 != 0) goto Lb
            return r5
        Lb:
            java.lang.Long r5 = xhss.AbstractC0264.m586(r0)
            r6 = 39
            java.lang.String r1 = "System property '"
            if (r5 == 0) goto L53
            long r2 = r5.longValue()
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 > 0) goto L22
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 > 0) goto L22
            return r2
        L22:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "' should be in range "
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = ".."
            r0.append(r4)
            r0.append(r9)
            java.lang.String r4 = ", but is '"
            r0.append(r4)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L53:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            r7.append(r4)
            java.lang.String r4 = "' has unrecognized value '"
            r7.append(r4)
            r7.append(r0)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static float m867(float r2) {
            r0 = 1048576000(0x3e800000, float:0.25)
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
            return r0
        L7:
            r0 = 1082130432(0x40800000, float:4.0)
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            return r0
        Le:
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static java.lang.String m868(java.lang.String r2, java.lang.String r3, java.lang.Iterable r4) {
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto Ld
            java.lang.String r2 = ""
            return r2
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.Object r1 = r4.next()
            r0.append(r1)
            r0.append(r3)
        L1f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L36
            r0.append(r2)
            r0.append(r3)
            java.lang.Object r1 = r4.next()
            r0.append(r1)
            r0.append(r3)
            goto L1f
        L36:
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public static xhss.C0953 m869(xhss.C0023 r2, int r3) {
            if (r3 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L1b
            int r0 = r2.f3090
            int r1 = r2.f3091
            int r2 = r2.f3092
            if (r2 <= 0) goto L14
            goto L15
        L14:
            int r3 = -r3
        L15:
            xhss.ᲁᛵᛶᲁ r2 = new xhss.ᲁᛵᛶᲁ
            r2.<init>(r0, r1, r3)
            return r2
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Step must be positive, was: "
            r3.<init>(r0)
            r3.append(r1)
            r0 = 46
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static boolean m870(java.io.File r6) {
            boolean r0 = r6.isDirectory()
            r1 = 1
            if (r0 == 0) goto L25
            java.io.File[] r6 = r6.listFiles()
            r0 = 0
            if (r6 != 0) goto Lf
            return r0
        Lf:
            int r2 = r6.length
            r3 = r0
            r4 = r1
        L12:
            if (r3 >= r2) goto L24
            r5 = r6[r3]
            boolean r5 = m870(r5)
            if (r5 == 0) goto L20
            if (r4 == 0) goto L20
            r4 = r1
            goto L21
        L20:
            r4 = r0
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            return r4
        L25:
            r6.delete()
            return r1
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public abstract void mo871(boolean r1);

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public abstract boolean mo600(xhss.AbstractFutureC1123 r1, xhss.C0734 r2);

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public abstract boolean mo601(xhss.AbstractFutureC1123 r1, xhss.C0926 r2, xhss.C0926 r3);

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public abstract android.text.InputFilter[] mo872(android.text.InputFilter[] r1);

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ */
    public abstract void mo602(xhss.C0926 r1, java.lang.Thread r2);

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ */
    public abstract void mo603(xhss.C0926 r1, xhss.C0926 r2);

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public abstract void mo873(boolean r1);

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public abstract boolean mo604(xhss.AbstractFutureC1123 r1, java.lang.Object r2, java.lang.Object r3);
}
