package defpackage;

/* JADX INFO: renamed from: ᛴᲁᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0762 implements defpackage.InterfaceC2045 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C0454 f3551 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0454 f3552 = null;

    static {
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "RESUME_TOKEN"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.AbstractC0762.f3551 = r0
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "NULL"
            r0.<init>(r1, r2)
            defpackage.AbstractC0762.f3552 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final defpackage.InterfaceC0493 m1678(defpackage.InterfaceC0493 r3, defpackage.InterfaceC0493 r4, boolean r5) {
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            ᲇᲈᛱᛸ r0 = new ᲇᲈᛱᛸ
            r1 = 5
            r0.<init>(r1)
            java.lang.Object r0 = r3.mo969(r5, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            ᲇᲈᛱᛸ r2 = new ᲇᲈᛱᛸ
            r2.<init>(r1)
            java.lang.Object r5 = r4.mo969(r5, r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r0 != 0) goto L2a
            if (r5 != 0) goto L2a
            ᛳᛵᲈᛵ r3 = r3.mo971(r4)
            return r3
        L2a:
            ᲇᲈᛱᛸ r0 = new ᲇᲈᛱᛸ
            r1 = 6
            r0.<init>(r1)
            ᛲᛶᛳᛱ r1 = defpackage.C0303.f1620
            java.lang.Object r3 = r3.mo969(r1, r0)
            ᛳᛵᲈᛵ r3 = (defpackage.InterfaceC0493) r3
            if (r5 == 0) goto L46
            ᛳᛵᲈᛵ r4 = (defpackage.InterfaceC0493) r4
            ᲇᲈᛱᛸ r5 = new ᲇᲈᛱᛸ
            r0 = 7
            r5.<init>(r0)
            java.lang.Object r4 = r4.mo969(r1, r5)
        L46:
            ᛳᛵᲈᛵ r4 = (defpackage.InterfaceC0493) r4
            ᛳᛵᲈᛵ r3 = r3.mo971(r4)
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static org.w3c.dom.Element m1679(org.simpleframework.xml.stream.InputNode r5) {
            java.lang.String r0 = r5.getReference()
            java.lang.String r1 = r5.getName()
            java.lang.String r2 = r5.getPrefix()
            r3 = 0
            if (r1 == 0) goto L47
            java.lang.String r4 = ""
            if (r0 != 0) goto L14
            r0 = r4
        L14:
            if (r2 != 0) goto L17
            r2 = r4
        L17:
            javax.xml.parsers.DocumentBuilderFactory r4 = defpackage.AbstractC0333.f1720     // Catch: javax.xml.parsers.ParserConfigurationException -> L3e
            javax.xml.parsers.DocumentBuilder r3 = r4.newDocumentBuilder()     // Catch: javax.xml.parsers.ParserConfigurationException -> L3e
            org.w3c.dom.Document r3 = r3.newDocument()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.String r2 = ":"
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            org.w3c.dom.Element r0 = r3.createElementNS(r0, r1)
            java.lang.String r5 = r5.getValue()
            r0.setTextContent(r5)
            return r0
        L3e:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            defpackage.C0086.m548(r0, r5)
            return r3
        L47:
            java.lang.String r5 = "Local part not allowed to be null"
            defpackage.C2264.m3684(r5)
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final void m1680(java.lang.Object r1) {
            boolean r0 = r1 instanceof defpackage.C0723
            if (r0 != 0) goto L5
            return
        L5:
            ᛴᛸᛲᲀ r1 = (defpackage.C0723) r1
            java.lang.Throwable r1 = r1.f3441
            throw r1
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final java.lang.String m1681(java.lang.Object r0) {
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static defpackage.C0542 m1682(java.lang.String r10, java.lang.Object... r11) {
            r0 = -373022489222702(0xfffeacbcef0961d2, double:NaN)
            boolean r0 = defpackage.AbstractC1347.m2524(r10)
            r1 = 0
            if (r0 == 0) goto L19
            r2 = -373872892747310(0xfffeabf6ef0961d2, double:NaN)
            java.lang.String r0 = "action must not be blank"
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L29
            ᛳᲀᛴᲈ r10 = defpackage.C0542.m1329(r0)
            r0 = -373043964059182(0xfffeacb7ef0961d2, double:NaN)
            return r10
        L29:
            r2 = -373099798634030(0xfffeacaaef0961d2, double:NaN)
            java.lang.String r0 = "nativeInit"     // Catch: java.lang.Throwable -> L11b
            r2 = -373147043274286(0xfffeac9fef0961d2, double:NaN)
            java.lang.String r2 = "0x101"     // Catch: java.lang.Throwable -> L11b
            kotlin.Pair r3 = new kotlin.Pair     // Catch: java.lang.Throwable -> L11b
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L11b
            r4 = -373172813078062(0xfffeac99ef0961d2, double:NaN)
            java.lang.String r0 = "loadConfig"     // Catch: java.lang.Throwable -> L11b
            r4 = -373220057718318(0xfffeac8eef0961d2, double:NaN)
            java.lang.String r2 = "0x102"     // Catch: java.lang.Throwable -> L11b
            kotlin.Pair r4 = new kotlin.Pair     // Catch: java.lang.Throwable -> L11b
            r4.<init>(r0, r2)     // Catch: java.lang.Throwable -> L11b
            r5 = -373245827522094(0xfffeac88ef0961d2, double:NaN)
            java.lang.String r0 = "copyAuthInfo"     // Catch: java.lang.Throwable -> L11b
            r5 = -373301662096942(0xfffeac7bef0961d2, double:NaN)
            java.lang.String r2 = "0x103"     // Catch: java.lang.Throwable -> L11b
            kotlin.Pair r5 = new kotlin.Pair     // Catch: java.lang.Throwable -> L11b
            r5.<init>(r0, r2)     // Catch: java.lang.Throwable -> L11b
            r6 = -373327431900718(0xfffeac75ef0961d2, double:NaN)
            java.lang.String r0 = "decodeAuthInfo"     // Catch: java.lang.Throwable -> L11b
            r6 = -373391856410158(0xfffeac66ef0961d2, double:NaN)
            java.lang.String r2 = "0x104"     // Catch: java.lang.Throwable -> L11b
            kotlin.Pair r6 = new kotlin.Pair     // Catch: java.lang.Throwable -> L11b
            r6.<init>(r0, r2)     // Catch: java.lang.Throwable -> L11b
            r7 = -373417626213934(0xfffeac60ef0961d2, double:NaN)
            java.lang.String r0 = "bind"     // Catch: java.lang.Throwable -> L11b
            r7 = -373439101050414(0xfffeac5bef0961d2, double:NaN)
            java.lang.String r2 = "0x105"     // Catch: java.lang.Throwable -> L11b
            kotlin.Pair r7 = new kotlin.Pair     // Catch: java.lang.Throwable -> L11b
            r7.<init>(r0, r2)     // Catch: java.lang.Throwable -> L11b
            r8 = -373464870854190(0xfffeac55ef0961d2, double:NaN)
            java.lang.String r0 = "loadSo"     // Catch: java.lang.Throwable -> L11b
            r8 = -373494935625262(0xfffeac4eef0961d2, double:NaN)
            java.lang.String r2 = "0x106"     // Catch: java.lang.Throwable -> L11b
            kotlin.Pair r8 = new kotlin.Pair     // Catch: java.lang.Throwable -> L11b
            r8.<init>(r0, r2)     // Catch: java.lang.Throwable -> L11b
            kotlin.Pair[] r0 = new kotlin.Pair[]{r3, r4, r5, r6, r7, r8}     // Catch: java.lang.Throwable -> L11b
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L11b
            r3 = 6
            int r3 = defpackage.AbstractC1893.m3323(r3)     // Catch: java.lang.Throwable -> L11b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L11b
            defpackage.AbstractC1893.m3325(r2, r0)     // Catch: java.lang.Throwable -> L11b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11b
            int r3 = r11.length     // Catch: java.lang.Throwable -> L11b
            r4 = 1
            int r3 = r3 + r4
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L11b
            java.lang.Object r10 = r2.get(r10)     // Catch: java.lang.Throwable -> L11b
            r0.add(r10)     // Catch: java.lang.Throwable -> L11b
            java.util.List r10 = defpackage.AbstractC2315.m3771(r11)     // Catch: java.lang.Throwable -> L11b
            r0.addAll(r10)     // Catch: java.lang.Throwable -> L11b
            r10 = -373842827976238(0xfffeabfdef0961d2, double:NaN)
            int r10 = defpackage.AbstractC0233.f1405     // Catch: java.lang.Throwable -> L11b
            ᛲᲀᛱᲁ r10 = defpackage.C0346.f1773     // Catch: java.lang.Throwable -> L11b
            r10.getClass()     // Catch: java.lang.Throwable -> L11b
            com.ss.android.ugc.awemes.wrapper.ModuleMainWrapper r10 = defpackage.C0346.m1034()     // Catch: java.lang.Throwable -> L11b
            ᛶᲈᛱᲈ r10 = defpackage.AbstractC2279.m3695(r10)     // Catch: java.lang.Throwable -> L11b
            ᛶᛶᛲᛱ r10 = r10.m2298()     // Catch: java.lang.Throwable -> L11b
            r10.m1954()     // Catch: java.lang.Throwable -> L11b
            r2 = -373864302812718(0xfffeabf8ef0961d2, double:NaN)
            java.lang.String r11 = "e"     // Catch: java.lang.Throwable -> L11b
            r10.f4431 = r11     // Catch: java.lang.Throwable -> L11b
            java.util.List r10 = r10.mo1885()     // Catch: java.lang.Throwable -> L11b
            java.lang.Object r10 = defpackage.AbstractC1107.m2122(r10)     // Catch: java.lang.Throwable -> L11b
            ᛱᲁᛲᲁ r10 = (defpackage.C0178) r10     // Catch: java.lang.Throwable -> L11b
            java.lang.Object[] r11 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L11b
            java.lang.Object r10 = r10.m714(r11)     // Catch: java.lang.Throwable -> L11b
            ᛳᲀᛴᲈ r11 = new ᛳᲀᛴᲈ     // Catch: java.lang.Throwable -> L11b
            r11.<init>(r10, r1, r4)     // Catch: java.lang.Throwable -> L11b
            return r11
        L11b:
            r0 = move-exception
            r10 = r0
            boolean r11 = r10 instanceof java.lang.RuntimeException
            if (r11 != 0) goto L127
            boolean r11 = r10 instanceof java.lang.LinkageError
            if (r11 == 0) goto L126
            goto L127
        L126:
            throw r10
        L127:
            java.lang.String r11 = r10.getMessage()
            if (r11 == 0) goto L133
            boolean r0 = defpackage.AbstractC1347.m2524(r11)
            if (r0 == 0) goto L13b
        L133:
            java.lang.Class r10 = r10.getClass()
            java.lang.String r11 = r10.getName()
        L13b:
            ᛳᲀᛴᲈ r10 = defpackage.C0542.m1329(r11)
            return r10
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final java.lang.String m1683(defpackage.InterfaceC0140 r3) {
            boolean r0 = r3 instanceof defpackage.C1395
            if (r0 == 0) goto Lb
            ᛷᲇᲇᲇ r3 = (defpackage.C1395) r3
            java.lang.String r3 = r3.toString()
            return r3
        Lb:
            r0 = 64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            r1.append(r3)     // Catch: java.lang.Throwable -> L24
            r1.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = m1681(r3)     // Catch: java.lang.Throwable -> L24
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L24
            goto L2b
        L24:
            r1 = move-exception
            ᛴᛸᛲᲀ r2 = new ᛴᛸᛲᲀ
            r2.<init>(r1)
            r1 = r2
        L2b:
            java.lang.Throwable r2 = defpackage.C2165.m3569(r1)
            if (r2 != 0) goto L32
            goto L4d
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r3 = m1681(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L4d:
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static defpackage.C0967 m1684() {
            ᛵᲁᛴᛵ r0 = new ᛵᲁᛴᛵ
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final defpackage.InterfaceC0843 m1685(defpackage.InterfaceC2023 r9, boolean r10, defpackage.AbstractC1683 r11) {
            boolean r0 = r9 instanceof defpackage.AbstractC0624
            if (r0 == 0) goto Lb
            ᛴᛲᛵᛵ r9 = (defpackage.AbstractC0624) r9
            ᛵᛲᲇᲇ r9 = r9.m1461(r10, r11)
            return r9
        Lb:
            boolean r0 = r11.mo987()
            ᲁᛲᲇᛲ r1 = new ᲁᛲᲇᛲ
            r7 = 0
            r8 = 4
            r2 = 1
            java.lang.Class<ᲀᛶᛲᛱ> r4 = defpackage.AbstractC1683.class
            java.lang.String r5 = "invoke"
            java.lang.String r6 = "invoke(Ljava/lang/Throwable;)V"
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            ᛴᛲᛵᛵ r9 = (defpackage.AbstractC0624) r9
            if (r0 == 0) goto L28
            ᲈᛶᲁᲈ r11 = new ᲈᛶᲁᲈ
            r11.<init>(r1)
            goto L2d
        L28:
            ᲈᛳᲁᛳ r11 = new ᲈᛳᲁᛳ
            r11.<init>(r1)
        L2d:
            ᛵᛲᲇᲇ r9 = r9.m1461(r10, r11)
            return r9
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static final defpackage.C2292 m1686(defpackage.InterfaceC0140 r2, defpackage.InterfaceC0493 r3, java.lang.Object r4) {
            boolean r0 = r2 instanceof defpackage.InterfaceC1735
            r1 = 0
            if (r0 != 0) goto L6
            goto L28
        L6:
            ᲁᛱᲁᛸ r0 = defpackage.C1803.f7900
            ᛶᲁᛳᲈ r0 = r3.mo970(r0)
            if (r0 == 0) goto L28
            ᲀᲀᛴ r2 = (defpackage.InterfaceC1735) r2
        L10:
            boolean r0 = r2 instanceof defpackage.C0979
            if (r0 == 0) goto L15
            goto L23
        L15:
            ᲀᲀᛴ r2 = r2.mo1504()
            if (r2 != 0) goto L1c
            goto L23
        L1c:
            boolean r0 = r2 instanceof defpackage.C2292
            if (r0 == 0) goto L10
            r1 = r2
            ᲈᛷᛸᛸ r1 = (defpackage.C2292) r1
        L23:
            if (r1 == 0) goto L28
            r1.m3708(r3, r4)
        L28:
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static defpackage.C1128 m1687(java.lang.String r5) {
            int r0 = r5.length()
            int r0 = r0 % 2
            if (r0 != 0) goto L36
            int r0 = r5.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L11:
            if (r2 >= r0) goto L30
            int r3 = r2 * 2
            char r4 = r5.charAt(r3)
            int r4 = defpackage.AbstractC0425.m1198(r4)
            int r4 = r4 << 4
            int r3 = r3 + 1
            char r3 = r5.charAt(r3)
            int r3 = defpackage.AbstractC0425.m1198(r3)
            int r3 = r3 + r4
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L11
        L30:
            ᛶᛸᛸᛶ r5 = new ᛶᛸᛸᛶ
            r5.<init>(r1)
            return r5
        L36:
            java.lang.String r0 = "Unexpected hex string: "
            java.lang.String r5 = r0.concat(r5)
            defpackage.C2264.m3678(r5)
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static defpackage.C1128 m1688(java.lang.String r2) {
            ᛶᛸᛸᛶ r0 = new ᛶᛸᛸᛶ
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6221
            byte[] r1 = r2.getBytes(r1)
            r0.<init>(r1)
            r0.f5018 = r2
            return r0
    }

    @Override // defpackage.InterfaceC2045
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public void mo1689() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC2045
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void mo1690() {
            r0 = this;
            return
    }
}
