package defpackage;

/* JADX INFO: renamed from: ᛸᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1592 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C1929 f7037 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C2223 f7038 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1487 f7039 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C0454 f7040 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0454 f7041 = null;

    static {
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "UNDEFINED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.AbstractC1592.f7040 = r0
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "REUSABLE_CLAIMED"
            r0.<init>(r1, r2)
            defpackage.AbstractC1592.f7041 = r0
            ᛸᛵᛴᛲ r0 = new ᛸᛵᛴᛲ
            r0.<init>()
            defpackage.AbstractC1592.f7039 = r0
            ᲈᛴᛵᲈ r0 = new ᲈᛴᛵᲈ
            r1 = 7
            r0.<init>(r1)
            defpackage.AbstractC1592.f7038 = r0
            ᲁᲁᛷᲈ r0 = new ᲁᲁᛷᲈ
            r1 = 6
            r0.<init>(r1)
            defpackage.AbstractC1592.f7037 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static void m2872(java.lang.String r5) {
            r0 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r2 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r0 = defpackage.AbstractC0225.m818(r0, r5, r2)
            if (r0 != 0) goto L11
            goto L33
        L11:
            int r0 = r5.length()
            r1 = 0
        L16:
            if (r1 >= r0) goto L33
            int r2 = r1 + 2000
            if (r2 <= r0) goto L1d
            r2 = r0
        L1d:
            java.lang.String r1 = r5.substring(r1, r2)
            r3 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1040(r1)
            r1 = r2
            goto L16
        L33:
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static android.graphics.drawable.Drawable m2873(android.content.Context r1, int r2) {
            ᲇᛶᛸᲈ r0 = defpackage.C2070.m3478()
            android.graphics.drawable.Drawable r1 = r0.m3482(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static boolean m2874(android.app.Activity r1) {
            if (r1 == 0) goto L11
            boolean r0 = r1.isDestroyed()
            if (r0 != 0) goto L11
            boolean r1 = r1.isFinishing()
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static boolean m2875(java.lang.String r6, java.lang.String r7) {
            r0 = 0
            if (r6 == 0) goto L2f
            if (r7 != 0) goto L6
            goto L2f
        L6:
            int r1 = r6.hashCode()
            int r2 = r7.hashCode()
            r3 = 1
            if (r1 != r2) goto L12
            return r3
        L12:
            int r1 = r6.length()
            int r2 = r7.length()
            if (r1 == r2) goto L1d
            return r0
        L1d:
            r2 = r0
        L1e:
            if (r2 >= r1) goto L2e
            char r4 = r6.charAt(r2)
            char r5 = r7.charAt(r2)
            if (r4 == r5) goto L2b
            return r0
        L2b:
            int r2 = r2 + 1
            goto L1e
        L2e:
            return r3
        L2f:
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static final void m2876(defpackage.InterfaceC0140 r10, java.lang.Object r11) {
            boolean r0 = r10 instanceof defpackage.C1395
            if (r0 == 0) goto Lae
            ᛷᲇᲇᲇ r10 = (defpackage.C1395) r10
            ᲁᛲᛱᛵ r0 = r10.f6055
            ᛶᛱᲀᛶ r1 = r10.f6056
            ᛳᛵᲈᛵ r2 = r1.f4527
            java.lang.Throwable r3 = defpackage.C2165.m3569(r11)
            if (r3 != 0) goto L14
            r4 = r11
            goto L1a
        L14:
            ᛱᛸᛳᛱ r4 = new ᛱᛸᛳᛱ
            r5 = 0
            r4.<init>(r3, r5)
        L1a:
            boolean r3 = r0.mo2540(r2)
            r5 = 1
            if (r3 == 0) goto L29
            r10.f6053 = r4
            r10.f3535 = r5
            r0.mo572(r2, r10)
            return
        L29:
            ᛱᛵᛶᲇ r0 = defpackage.AbstractC1054.m2007()
            long r6 = r0.f887
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L4b
            r10.f6053 = r4
            r10.f3535 = r5
            ᛶᲈᛷᛵ r11 = r0.f888
            if (r11 != 0) goto L47
            ᛶᲈᛷᛵ r11 = new ᛶᲈᛷᛵ
            r11.<init>()
            r0.f888 = r11
        L47:
            r11.addLast(r10)
            goto La8
        L4b:
            r0.m575(r5)
            ᛷᲈᲀ r3 = defpackage.C1403.f6097     // Catch: java.lang.Throwable -> L6d
            ᛶᲁᛳᲈ r3 = r2.mo970(r3)     // Catch: java.lang.Throwable -> L6d
            ᲇᛳᛸᛳ r3 = (defpackage.InterfaceC2023) r3     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L6f
            boolean r4 = r3.mo1449()     // Catch: java.lang.Throwable -> L6d
            if (r4 != 0) goto L6f
            ᛴᛲᛵᛵ r3 = (defpackage.AbstractC0624) r3     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.CancellationException r11 = r3.m1448()     // Catch: java.lang.Throwable -> L6d
            ᛴᛸᛲᲀ r1 = new ᛴᛸᛲᲀ     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L6d
            r10.mo662(r1)     // Catch: java.lang.Throwable -> L6d
            goto L8d
        L6d:
            r11 = move-exception
            goto La4
        L6f:
            java.lang.Object r3 = r10.f6054     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r3 = defpackage.C1825.m3215(r2, r3)     // Catch: java.lang.Throwable -> L6d
            ᛳᛴᛵᛱ r4 = defpackage.C1825.f7959     // Catch: java.lang.Throwable -> L6d
            if (r3 == r4) goto L7e
            ᲈᛷᛸᛸ r4 = defpackage.AbstractC0762.m1686(r1, r2, r3)     // Catch: java.lang.Throwable -> L6d
            goto L7f
        L7e:
            r4 = 0
        L7f:
            r1.mo662(r11)     // Catch: java.lang.Throwable -> L97
            if (r4 == 0) goto L8a
            boolean r11 = r4.m3709()     // Catch: java.lang.Throwable -> L6d
            if (r11 == 0) goto L8d
        L8a:
            defpackage.C1825.m3216(r2, r3)     // Catch: java.lang.Throwable -> L6d
        L8d:
            boolean r11 = r0.m577()     // Catch: java.lang.Throwable -> L6d
            if (r11 != 0) goto L8d
        L93:
            r0.m580(r5)
            goto La8
        L97:
            r11 = move-exception
            if (r4 == 0) goto La0
            boolean r1 = r4.m3709()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto La3
        La0:
            defpackage.C1825.m3216(r2, r3)     // Catch: java.lang.Throwable -> L6d
        La3:
            throw r11     // Catch: java.lang.Throwable -> L6d
        La4:
            r10.m1670(r11)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r10 = move-exception
            r0.m580(r5)
            throw r10
        Lae:
            r10.mo662(r11)
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static boolean m2877(java.util.ArrayList r2, defpackage.AbstractC1793 r3) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L7
            goto L27
        L7:
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r2.next()
            ᲁᛱᛲᛳ r0 = (defpackage.AbstractC1793) r0
            java.lang.String r0 = r0.mo1205()
            java.lang.String r1 = r3.mo1205()
            boolean r0 = m2887(r1, r0)
            if (r0 == 0) goto Lb
            r2 = 1
            return r2
        L27:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static java.lang.String m2878(java.security.cert.X509Certificate r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sha256/"
            r0.<init>(r1)
            java.security.PublicKey r9 = r9.getPublicKey()
            byte[] r9 = r9.getEncoded()
            int r1 = r9.length
            int r2 = r9.length
            long r3 = (long) r2
            r5 = 0
            long r7 = (long) r1
            defpackage.AbstractC1171.m2271(r3, r5, r7)
            r2 = 0
            byte[] r9 = defpackage.AbstractC2315.m3773(r9, r2, r1)
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)
            int r3 = r9.length
            r1.update(r9, r2, r3)
            byte[] r9 = r1.digest()
            ᛶᛸᛸᛶ r1 = new ᛶᛸᛸᛶ
            r1.<init>(r9)
            java.lang.String r9 = r1.mo2163()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static boolean m2879(java.lang.String r1, java.util.ArrayList r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L7
            goto L23
        L7:
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()
            ᲁᛱᛲᛳ r0 = (defpackage.AbstractC1793) r0
            java.lang.String r0 = r0.mo1205()
            boolean r0 = m2887(r0, r1)
            if (r0 == 0) goto Lb
            r1 = 1
            return r1
        L23:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final int m2880(defpackage.InterfaceC0270 r5, java.lang.String r6) {
            int r0 = r5.getColumnCount()
            r1 = 0
            r2 = r1
        L6:
            r3 = -1
            if (r2 >= r0) goto L17
            java.lang.String r4 = r5.getColumnName(r2)
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L14
            goto L18
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            r2 = r3
        L18:
            if (r2 < 0) goto L1b
            return r2
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "`"
            r0.<init>(r2)
            r0.append(r6)
            r6 = 96
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            int r0 = r5.getColumnCount()
        L32:
            if (r1 >= r0) goto L42
            java.lang.String r2 = r5.getColumnName(r1)
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L3f
            goto L43
        L3f:
            int r1 = r1 + 1
            goto L32
        L42:
            r1 = r3
        L43:
            if (r1 < 0) goto L46
            return r1
        L46:
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.util.ArrayList m2881(java.lang.Object... r4) {
            int r0 = r4.length
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            int r0 = r4.length
            if (r0 != 0) goto La
            goto L16
        La:
            int r0 = r4.length
            r2 = 0
        Lc:
            if (r2 >= r0) goto L16
            r3 = r4[r2]
            r1.add(r3)
            int r2 = r2 + 1
            goto Lc
        L16:
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final java.lang.Object m2882(defpackage.InterfaceC1008 r2, java.lang.String r3, defpackage.AbstractC1016 r4) {
            ᛴᛳᛷᛸ r0 = new ᛴᛳᛷᛸ
            r1 = 21
            r0.<init>(r1)
            java.lang.Object r2 = r2.mo1906(r3, r0, r4)
            ᛴᛵ r3 = defpackage.EnumC0670.f3246
            if (r2 != r3) goto L10
            return r2
        L10:
            ᲁᲀᛱᲁ r2 = defpackage.C1907.f8270
            return r2
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static final void m2883(java.lang.Object[] r1, int r2, int r3) {
        L0:
            if (r2 >= r3) goto L8
            r0 = 0
            r1[r2] = r0
            int r2 = r2 + 1
            goto L0
        L8:
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static final java.lang.String m2884(java.lang.Object[] r3, int r4, int r5, defpackage.AbstractC1973 r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        Lf:
            if (r1 >= r5) goto L2a
            if (r1 <= 0) goto L18
            java.lang.String r2 = ", "
            r0.append(r2)
        L18:
            int r2 = r4 + r1
            r2 = r3[r2]
            if (r2 != r6) goto L24
            java.lang.String r2 = "(this Collection)"
            r0.append(r2)
            goto L27
        L24:
            r0.append(r2)
        L27:
            int r1 = r1 + 1
            goto Lf
        L2a:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m2885(byte[] r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length
            int r1 = r1 * 2
            r0.<init>(r1)
            r1 = 0
        L9:
            int r2 = r4.length
            if (r1 >= r2) goto L22
            r2 = r4[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "%02x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L9
        L22:
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static long[] m2886(java.io.Serializable r4) {
            boolean r0 = r4 instanceof int[]
            if (r0 == 0) goto L16
            int[] r4 = (int[]) r4
            int r0 = r4.length
            long[] r0 = new long[r0]
            r1 = 0
        La:
            int r2 = r4.length
            if (r1 >= r2) goto L15
            r2 = r4[r1]
            long r2 = (long) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto La
        L15:
            return r0
        L16:
            boolean r0 = r4 instanceof long[]
            if (r0 == 0) goto L1d
            long[] r4 = (long[]) r4
            return r4
        L1d:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static boolean m2887(java.lang.String r5, java.lang.String r6) {
            r0 = 0
            if (r5 == 0) goto L2f
            if (r6 != 0) goto L6
            goto L2f
        L6:
            int r1 = r5.hashCode()
            int r2 = r6.hashCode()
            r3 = 1
            if (r1 != r2) goto L12
            return r3
        L12:
            int r1 = r5.length()
            int r2 = r6.length()
            if (r1 == r2) goto L1d
            return r0
        L1d:
            int r1 = r1 - r3
        L1e:
            if (r1 < 0) goto L2e
            char r2 = r5.charAt(r1)
            char r4 = r6.charAt(r1)
            if (r2 == r4) goto L2b
            return r0
        L2b:
            int r1 = r1 + (-1)
            goto L1e
        L2e:
            return r3
        L2f:
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static defpackage.C1164 m2888(android.content.Context r12) {
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            java.lang.String r1 = "Package manager required to locate emoji font provider"
            defpackage.C1825.m3220(r0, r1)
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
            ᲇᛱᛸᛱ r5 = new ᲇᛱᛸᛱ     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
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
            ᛶᲁᲇᛸ r4 = new ᛶᲁᲇᛸ
            ᛶᲇᲀᲀ r0 = new ᛶᲇᲀᲀ
            r0.<init>(r12, r5)
            r4.<init>(r0)
        L7c:
            return r4
    }
}
