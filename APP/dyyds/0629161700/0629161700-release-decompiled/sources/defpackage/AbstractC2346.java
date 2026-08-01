package defpackage;

/* JADX INFO: renamed from: ᲈᲇᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2346 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1500 f10108 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final char[] f10109 = null;

    static {
            ᛸᛶᛱᛵ r0 = new ᛸᛶᛱᛵ
            r1 = 22
            r0.<init>(r1)
            defpackage.AbstractC2346.f10108 = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            defpackage.AbstractC2346.f10109 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final boolean m3840(java.lang.String r2, int r3, int r4) {
            int r0 = r3 + 2
            if (r0 >= r4) goto L24
            char r4 = r2.charAt(r3)
            r1 = 37
            if (r4 != r1) goto L24
            r4 = 1
            int r3 = r3 + r4
            char r3 = r2.charAt(r3)
            int r3 = defpackage.AbstractC0709.m1601(r3)
            r1 = -1
            if (r3 == r1) goto L24
            char r2 = r2.charAt(r0)
            int r2 = defpackage.AbstractC0709.m1601(r2)
            if (r2 == r1) goto L24
            return r4
        L24:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static defpackage.C1326 m3841(int r2, defpackage.InterfaceC0702 r3) {
            ᛲᛴᛵᲈ r0 = new ᛲᛴᛵᲈ
            r0.<init>(r2)
            ᛷᛸᛱᛸ r2 = new ᛷᛸᛱᛸ
            ᛸᛶᛱᛵ r1 = defpackage.AbstractC2346.f10108
            r2.<init>(r0, r3, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static java.lang.Class m3842(java.lang.Class r1) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L7
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            return r1
        L7:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto Le
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            return r1
        Le:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r1 != r0) goto L15
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            return r1
        L15:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r1 != r0) goto L1c
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            return r1
        L1c:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L23
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            return r1
        L23:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r1 != r0) goto L2a
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            return r1
        L2a:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r1 != r0) goto L31
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            return r1
        L31:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r1 != r0) goto L38
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            return r1
        L38:
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r1 != r0) goto L3e
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
        L3e:
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static java.lang.String m3843(int r8, int r9, int r10, java.lang.String r11) {
            r0 = r10 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r8 = r1
        L6:
            r0 = r10 & 2
            if (r0 == 0) goto Le
            int r9 = r11.length()
        Le:
            r10 = r10 & 4
            if (r10 == 0) goto L13
            goto L14
        L13:
            r1 = 1
        L14:
            r10 = r8
        L15:
            if (r10 >= r9) goto L7b
            char r0 = r11.charAt(r10)
            r2 = 43
            r3 = 37
            if (r0 == r3) goto L29
            if (r0 != r2) goto L26
            if (r1 == 0) goto L26
            goto L29
        L26:
            int r10 = r10 + 1
            goto L15
        L29:
            ᛸᲁᛵ r0 = new ᛸᲁᛵ
            r0.<init>()
            r0.m2844(r11, r8, r10)
        L31:
            if (r10 >= r9) goto L76
            int r8 = r11.codePointAt(r10)
            if (r8 != r3) goto L61
            int r4 = r10 + 2
            if (r4 >= r9) goto L61
            int r5 = r10 + 1
            char r5 = r11.charAt(r5)
            int r5 = defpackage.AbstractC0709.m1601(r5)
            char r6 = r11.charAt(r4)
            int r6 = defpackage.AbstractC0709.m1601(r6)
            r7 = -1
            if (r5 == r7) goto L6d
            if (r6 == r7) goto L6d
            int r10 = r5 << 4
            int r10 = r10 + r6
            r0.m2855(r10)
            int r8 = java.lang.Character.charCount(r8)
            int r10 = r8 + r4
            goto L31
        L61:
            if (r8 != r2) goto L6d
            if (r1 == 0) goto L6d
            r8 = 32
            r0.m2855(r8)
            int r10 = r10 + 1
            goto L31
        L6d:
            r0.m2841(r8)
            int r8 = java.lang.Character.charCount(r8)
            int r10 = r10 + r8
            goto L31
        L76:
            java.lang.String r8 = r0.m2856()
            return r8
        L7b:
            java.lang.String r8 = r11.substring(r8, r9)
            return r8
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final void m3844(int r2, int r3) {
            if (r2 > r3) goto L3
            return
        L3:
            java.lang.String r0 = "toIndex ("
            java.lang.String r1 = ") is greater than size ("
            defpackage.C1356.m2533(r0, r2, r1, r3)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final void m3845(java.io.Closeable r0, java.lang.Throwable r1) {
            if (r0 == 0) goto L10
            if (r1 != 0) goto L8
            r0.close()
            return
        L8:
            r0.close()     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            defpackage.AbstractC2193.m3595(r1, r0)
        L10:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m3846(int r17, int r18, int r19, java.lang.String r20, java.lang.String r21) {
            r0 = r20
            r1 = r21
            r2 = r19 & 1
            r3 = 0
            if (r2 == 0) goto Lb
            r2 = r3
            goto Ld
        Lb:
            r2 = r17
        Ld:
            r4 = r19 & 2
            if (r4 == 0) goto L16
            int r4 = r0.length()
            goto L18
        L16:
            r4 = r18
        L18:
            r5 = r19 & 8
            r6 = 1
            if (r5 == 0) goto L1f
            r5 = r3
            goto L20
        L1f:
            r5 = r6
        L20:
            r7 = r19 & 16
            if (r7 == 0) goto L26
            r7 = r3
            goto L27
        L26:
            r7 = r6
        L27:
            r8 = r19 & 32
            if (r8 == 0) goto L2d
            r8 = r3
            goto L2e
        L2d:
            r8 = r6
        L2e:
            r9 = r19 & 64
            if (r9 == 0) goto L33
            goto L34
        L33:
            r3 = r6
        L34:
            r6 = r2
        L35:
            if (r6 >= r4) goto L113
            int r9 = r0.codePointAt(r6)
            r10 = 32
            r11 = 128(0x80, float:1.8E-43)
            r12 = 43
            r13 = 37
            r14 = 127(0x7f, float:1.78E-43)
            if (r9 < r10) goto L6b
            if (r9 == r14) goto L6b
            if (r9 < r11) goto L4d
            if (r3 == 0) goto L6b
        L4d:
            char r15 = (char) r9
            boolean r15 = defpackage.AbstractC1347.m2510(r1, r15)
            if (r15 != 0) goto L6b
            if (r9 != r13) goto L60
            if (r5 == 0) goto L6b
            if (r7 == 0) goto L60
            boolean r15 = m3840(r0, r6, r4)
            if (r15 == 0) goto L6b
        L60:
            if (r9 != r12) goto L65
            if (r8 == 0) goto L65
            goto L6b
        L65:
            int r9 = java.lang.Character.charCount(r9)
            int r6 = r6 + r9
            goto L35
        L6b:
            ᛸᲁᛵ r9 = new ᛸᲁᛵ
            r9.<init>()
            r9.m2844(r0, r2, r6)
            r2 = 0
        L74:
            if (r6 >= r4) goto L10e
            int r15 = r0.codePointAt(r6)
            if (r5 == 0) goto L8d
            r13 = 9
            if (r15 == r13) goto Lcb
            r13 = 10
            if (r15 == r13) goto Lcb
            r13 = 12
            if (r15 == r13) goto Lcb
            r13 = 13
            if (r15 != r13) goto L8d
            goto Lcb
        L8d:
            java.lang.String r13 = "+"
            if (r15 != r10) goto L9b
            java.lang.String r11 = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~"
            if (r1 != r11) goto L9b
            r9.m2838(r13)
        L98:
            r11 = 128(0x80, float:1.8E-43)
            goto Lcb
        L9b:
            if (r15 != r12) goto La8
            if (r8 == 0) goto La8
            if (r5 == 0) goto La2
            goto La4
        La2:
            java.lang.String r13 = "%2B"
        La4:
            r9.m2838(r13)
            goto L98
        La8:
            if (r15 < r10) goto Lce
            if (r15 == r14) goto Lce
            r11 = 128(0x80, float:1.8E-43)
            if (r15 < r11) goto Lb2
            if (r3 == 0) goto Ld0
        Lb2:
            char r13 = (char) r15
            boolean r13 = defpackage.AbstractC1347.m2510(r1, r13)
            if (r13 != 0) goto Ld0
            r13 = 37
            if (r15 != r13) goto Lc8
            if (r5 == 0) goto Ld0
            if (r7 == 0) goto Lc8
            boolean r13 = m3840(r0, r6, r4)
            if (r13 != 0) goto Lc8
            goto Ld0
        Lc8:
            r9.m2841(r15)
        Lcb:
            r11 = 37
            goto L102
        Lce:
            r11 = 128(0x80, float:1.8E-43)
        Ld0:
            if (r2 != 0) goto Ld7
            ᛸᲁᛵ r2 = new ᛸᲁᛵ
            r2.<init>()
        Ld7:
            r2.m2841(r15)
        Lda:
            boolean r13 = r2.m2848()
            if (r13 != 0) goto Lcb
            byte r13 = r2.m2831()
            r10 = r13 & 255(0xff, float:3.57E-43)
            r11 = 37
            r9.m2855(r11)
            int r10 = r10 >> 4
            r10 = r10 & 15
            char[] r16 = defpackage.AbstractC2346.f10109
            char r10 = r16[r10]
            r9.m2855(r10)
            r10 = r13 & 15
            char r10 = r16[r10]
            r9.m2855(r10)
            r10 = 32
            r11 = 128(0x80, float:1.8E-43)
            goto Lda
        L102:
            int r10 = java.lang.Character.charCount(r15)
            int r6 = r6 + r10
            r13 = r11
            r10 = 32
            r11 = 128(0x80, float:1.8E-43)
            goto L74
        L10e:
            java.lang.String r0 = r9.m2856()
            return r0
        L113:
            java.lang.String r0 = r0.substring(r2, r4)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final java.lang.Object m3847(defpackage.C0818 r1, defpackage.C0818 r2, defpackage.InterfaceC2087 r3) {
            defpackage.AbstractC1171.m2261(r3)     // Catch: java.lang.Throwable -> L8
            java.lang.Object r2 = r3.mo388(r2, r1)     // Catch: java.lang.Throwable -> L8
            goto L10
        L8:
            r2 = move-exception
            ᛱᛸᛳᛱ r3 = new ᛱᛸᛳᛱ
            r0 = 0
            r3.<init>(r2, r0)
            r2 = r3
        L10:
            ᛴᛵ r3 = defpackage.EnumC0670.f3246
            if (r2 != r3) goto L15
            goto L26
        L15:
            java.lang.Object r1 = r1.m1438(r2)
            ᛳᛴᛵᛱ r2 = defpackage.AbstractC1754.f7747
            if (r1 != r2) goto L1e
            goto L26
        L1e:
            boolean r2 = r1 instanceof defpackage.C0142
            if (r2 != 0) goto L27
            java.lang.Object r3 = defpackage.AbstractC1754.m3154(r1)
        L26:
            return r3
        L27:
            ᛱᛸᛳᛱ r1 = (defpackage.C0142) r1
            java.lang.Throwable r1 = r1.f1092
            throw r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static defpackage.C1045 m3848(javax.net.ssl.SSLSession r6) {
            java.lang.String r0 = r6.getCipherSuite()
            r1 = 0
            if (r0 == 0) goto L65
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L5b
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L5b
            ᲀᛴᛱᛱ r2 = defpackage.C1918.f8351
            ᲁᲀᲇᲀ r0 = r2.m3049(r0)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L55
            java.lang.String r3 = "NONE"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L4f
            ᛴᛲᲀᛸ r1 = defpackage.AbstractC0069.m512(r2)
            java.security.cert.Certificate[] r2 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L38
            java.util.List r2 = defpackage.AbstractC0508.m1290(r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L38
            goto L3a
        L38:
            ᲀᛶᲇ r2 = defpackage.C1698.f7558
        L3a:
            ᛶᛳᛸᛷ r3 = new ᛶᛳᛸᛷ
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            java.util.List r6 = defpackage.AbstractC0508.m1290(r6)
            ᛲᲀ r4 = new ᛲᲀ
            r5 = 9
            r4.<init>(r5, r2)
            r3.<init>(r1, r0, r6, r4)
            return r3
        L4f:
            java.lang.String r6 = "tlsVersion == NONE"
            defpackage.C2264.m3682(r6)
            return r1
        L55:
            java.lang.String r6 = "tlsVersion == null"
            defpackage.C2264.m3676(r6)
            return r1
        L5b:
            java.lang.String r6 = "cipherSuite == "
            java.lang.String r6 = r6.concat(r0)
            defpackage.C2264.m3682(r6)
            return r1
        L65:
            java.lang.String r6 = "cipherSuite == null"
            defpackage.C2264.m3676(r6)
            return r1
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static boolean m3849(android.content.Context r2, java.util.List r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            goto L1e
        L7:
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            r1 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            ᲁᛱᛲᛳ r0 = (defpackage.AbstractC1793) r0
            boolean r0 = r0.mo2347(r2, r1)
            if (r0 != 0) goto Lb
        L1e:
            r2 = 0
            return r2
        L20:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public abstract boolean mo3618(java.lang.Object r1, java.lang.Object r2);

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public abstract boolean mo3619(java.lang.Object r1, java.lang.Object r2);
}
