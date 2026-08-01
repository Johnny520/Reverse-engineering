package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲀᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1178 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0547 f3789 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final java.lang.Object f3790 = null;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static long f3791;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0547 f3792 = null;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static int f3793;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static boolean f3794;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static long f3795;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static long f3796;

    static {
            xhss.ᛶᛲᛷᛵ r0 = new xhss.ᛶᛲᛷᛵ
            java.lang.String r1 = "UNDEFINED"
            r2 = 2
            r0.<init>(r1, r2)
            xhss.AbstractC1178.f3792 = r0
            xhss.ᛶᛲᛷᛵ r0 = new xhss.ᛶᛲᛷᛵ
            java.lang.String r1 = "REUSABLE_CLAIMED"
            r0.<init>(r1, r2)
            xhss.AbstractC1178.f3789 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            xhss.AbstractC1178.f3790 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static void m1865(java.lang.String r3) {
            int r0 = r3.length()
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r0 > r1) goto L9
            return
        L9:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 0
            r2 = 30
            java.lang.String r3 = r3.substring(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number string too large: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "..."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public static final void m1866(java.util.logging.Logger r1, xhss.AbstractC0458 r2, xhss.C1081 r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = r3.f3480
            r0.<init>(r3)
            r3 = 32
            r0.append(r3)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r4 = "%-22s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            java.lang.String r2 = r2.f1638
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.fine(r2)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public static java.math.BigDecimal m1867(java.lang.String r5) {
            m1865(r5)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r5)
            int r1 = r0.scale()
            long r1 = (long) r1
            long r1 = java.lang.Math.abs(r1)
            r3 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L18
            return r0
        L18:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Number has unsupported scale: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public static xhss.C1035 m1868() {
            r0 = -174333184280645(0xffff6171e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -174449148397637(0xffff6156e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            if (r1 == 0) goto L56
            boolean r3 = xhss.AbstractC0120.m342(r1)
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r2 = 6
            r3 = 0
            int r0 = xhss.AbstractC0120.m350(r1, r0, r3, r3, r2)
            r2 = -1
            if (r0 != r2) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r3, r4)
            if (r0 != r2) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r2
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto Ld6
            xhss.ᛳᛵᛲᛳ r3 = xhss.C0267.f986
            xhss.ᛵᛲᛴᛵ r1 = r1.m89(r3)
            r3 = -256757901658181(0xffff167ae47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r3 = xhss.AbstractC0390.m778(r3)
            r4 = -70459400226885(0xffffbfeae47a77bb, double:NaN)
            xhss.ᲁᛶᛷ r4 = xhss.AbstractC0390.m773(r4)
            r5 = -70519529769029(0xffffbfdce47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r5)
            r6 = -70592544213061(0xffffbfcbe47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            r4.m1579(r5)
            r5 = -70665558657093(0xffffbfbae47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r5)
            xhss.C0960.m1572(r4, r5)
            r3.f2133 = r4
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto Lb9
            xhss.ᲈᛴᲀᛲ r1 = new xhss.ᲈᛴᲀᛲ
            r1.<init>()
            goto Lc9
        Lb9:
            java.lang.Object r4 = r1.first()
            xhss.ᲇᛸᛳᛸ r4 = (xhss.C1062) r4
            java.lang.Object r4 = r4.f3094
            org.luckypray.dexkit.DexKitBridge r4 = (org.luckypray.dexkit.DexKitBridge) r4
            r3.f2131 = r1
            xhss.ᲈᛴᲀᛲ r1 = r4.m86(r3)
        Lc9:
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto Ld6
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto Ld7
        Ld6:
            r1 = r2
        Ld7:
            r3 = 1
            if (r1 != 0) goto Lf4
            long r5 = xhss.AbstractC1178.f3791
            long r5 = r5 + r3
            xhss.AbstractC1178.f3791 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = -174453443364933(0xffff6155e47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r3)
            r1.<init>(r3)
            r3 = 39
            xhss.AbstractC0390.m791(r1, r0, r3)
            return r2
        Lf4:
            java.lang.String r2 = r1.toString()
            int r5 = r2.length()
            if (r5 <= 0) goto L11d
            long r5 = xhss.AbstractC1178.f3795
            long r5 = r5 + r3
            xhss.AbstractC1178.f3795 = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -174603767220293(0xffff6132e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -174745501141061(0xffff6111e47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        L11d:
            return r1
    }

    /* JADX INFO: renamed from: ᛳᛸᛵᲀ, reason: contains not printable characters */
    public static final void m1869(java.lang.Object r10, xhss.InterfaceC0038 r11) {
            boolean r0 = r11 instanceof xhss.C0817
            if (r0 == 0) goto Lac
            xhss.ᛸᲇᲁᛱ r11 = (xhss.C0817) r11
            xhss.ᛲᛶᲇᲇ r0 = r11.f2653
            xhss.ᛸᛴᛳᛷ r1 = r11.f2656
            xhss.ᛴᛵᛳᛵ r2 = r1.f2508
            java.lang.Throwable r3 = xhss.AbstractC0134.m364(r10)
            if (r3 != 0) goto L14
            r4 = r10
            goto L1a
        L14:
            xhss.ᛷᲁᲇᛷ r4 = new xhss.ᛷᲁᲇᛷ
            r5 = 0
            r4.<init>(r3, r5)
        L1a:
            boolean r3 = r0.mo441(r2)
            r5 = 1
            if (r3 == 0) goto L29
            r11.f2655 = r4
            r11.f3380 = r5
            r0.mo359(r2, r11)
            return
        L29:
            xhss.ᛵᛸᛲᛲ r0 = xhss.AbstractC0863.m1439()
            long r6 = r0.f1825
            r8 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L4b
            r11.f2655 = r4
            r11.f3380 = r5
            xhss.ᛸᲀᛷᛷ r10 = r0.f1826
            if (r10 != 0) goto L47
            xhss.ᛸᲀᛷᛷ r10 = new xhss.ᛸᲀᛷᛷ
            r10.<init>()
            r0.f1826 = r10
        L47:
            r10.addLast(r11)
            goto La6
        L4b:
            r0.m910(r5)
            xhss.ᛳᛴᲀᲁ r3 = xhss.C0263.f977     // Catch: java.lang.Throwable -> L6b
            xhss.ᛳᛵᲈᛲ r3 = r2.mo442(r3)     // Catch: java.lang.Throwable -> L6b
            xhss.ᛸᛷᛳᲈ r3 = (xhss.AbstractC0784) r3     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L6d
            boolean r4 = r3.m1333()     // Catch: java.lang.Throwable -> L6b
            if (r4 != 0) goto L6d
            java.util.concurrent.CancellationException r10 = r3.m1343()     // Catch: java.lang.Throwable -> L6b
            xhss.ᲈᛳᛱᲇ r1 = new xhss.ᲈᛳᛱᲇ     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L6b
            r11.mo152(r1)     // Catch: java.lang.Throwable -> L6b
            goto L8b
        L6b:
            r10 = move-exception
            goto La2
        L6d:
            java.lang.Object r3 = r11.f2654     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r3 = xhss.C0614.m1072(r2, r3)     // Catch: java.lang.Throwable -> L6b
            xhss.ᛶᛲᛷᛵ r4 = xhss.C0614.f2112     // Catch: java.lang.Throwable -> L6b
            if (r3 == r4) goto L7c
            xhss.ᲈᲇᛵ r4 = xhss.AbstractC0485.m891(r1, r2, r3)     // Catch: java.lang.Throwable -> L6b
            goto L7d
        L7c:
            r4 = 0
        L7d:
            r1.mo152(r10)     // Catch: java.lang.Throwable -> L95
            if (r4 == 0) goto L88
            boolean r10 = r4.m1917()     // Catch: java.lang.Throwable -> L6b
            if (r10 == 0) goto L8b
        L88:
            xhss.C0614.m1065(r2, r3)     // Catch: java.lang.Throwable -> L6b
        L8b:
            boolean r10 = r0.m918()     // Catch: java.lang.Throwable -> L6b
            if (r10 != 0) goto L8b
        L91:
            r0.m911()
            goto La6
        L95:
            r10 = move-exception
            if (r4 == 0) goto L9e
            boolean r1 = r4.m1917()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto La1
        L9e:
            xhss.C0614.m1065(r2, r3)     // Catch: java.lang.Throwable -> L6b
        La1:
            throw r10     // Catch: java.lang.Throwable -> L6b
        La2:
            r11.m1713(r10)     // Catch: java.lang.Throwable -> La7
            goto L91
        La6:
            return
        La7:
            r10 = move-exception
            r0.m911()
            throw r10
        Lac:
            r11.mo152(r10)
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static xhss.C0289 m1870(java.lang.String r5) {
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
            int r4 = xhss.AbstractC0060.m192(r4)
            int r4 = r4 << 4
            int r3 = r3 + 1
            char r3 = r5.charAt(r3)
            int r3 = xhss.AbstractC0060.m192(r3)
            int r3 = r3 + r4
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L11
        L30:
            xhss.ᛳᛶᲈᲈ r5 = new xhss.ᛳᛶᲈᲈ
            r5.<init>(r1)
            return r5
        L36:
            java.lang.String r0 = "Unexpected hex string: "
            java.lang.String r5 = r0.concat(r5)
            xhss.C0532.m946(r5)
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static xhss.C1035 m1871() {
            r0 = -152231282575429(0xffff758be47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -152295707084869(0xffff757ce47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            if (r1 == 0) goto L56
            boolean r3 = xhss.AbstractC0120.m342(r1)
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r2 = 6
            r3 = 0
            int r0 = xhss.AbstractC0120.m350(r1, r0, r3, r3, r2)
            r2 = -1
            if (r0 != r2) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r3, r4)
            if (r0 != r2) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r2
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto Lbe
            r3 = -67233879787589(0xffffc2d9e47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r3 = xhss.AbstractC0390.m778(r3)
            r4 = -200661333805125(0xffff497fe47a77bb, double:NaN)
            xhss.ᲁᛶᛷ r4 = xhss.AbstractC0390.m773(r4)
            r5 = -200721463347269(0xffff4971e47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r5)
            r6 = -200773002954821(0xffff4965e47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            r7 = -200841722431557(0xffff4955e47a77bb, double:NaN)
            java.lang.String r7 = xhss.AbstractC0775.m1313(r7)
            r8 = -200876082169925(0xffff494de47a77bb, double:NaN)
            java.lang.String r8 = xhss.AbstractC0775.m1313(r8)
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8}
            r4.m1576(r5)
            r3.f2133 = r4
            xhss.ᲈᛴᲀᛲ r1 = r1.m86(r3)
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto Lbe
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto Lbf
        Lbe:
            r1 = r2
        Lbf:
            r3 = 1
            if (r1 != 0) goto Ldc
            long r5 = xhss.AbstractC1178.f3791
            long r5 = r5 + r3
            xhss.AbstractC1178.f3791 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = -152300002052165(0xffff757be47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r3)
            r1.<init>(r3)
            r3 = 39
            xhss.AbstractC0390.m791(r1, r0, r3)
            return r2
        Ldc:
            java.lang.String r2 = r1.toString()
            int r5 = r2.length()
            if (r5 <= 0) goto L105
            long r5 = xhss.AbstractC1178.f3795
            long r5 = r5 + r3
            xhss.AbstractC1178.f3795 = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -152450325907525(0xffff7558e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -152592059828293(0xffff7537e47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        L105:
            return r1
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static xhss.C1035 m1872() {
            r0 = -176180020217925(0xffff5fc3e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -176300279302213(0xffff5fa7e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L56
            boolean r4 = xhss.AbstractC0120.m342(r1)
            if (r4 != 0) goto L2a
            goto L2b
        L2a:
            r1 = r3
        L2b:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r3 = 6
            r4 = 0
            int r0 = xhss.AbstractC0120.m350(r1, r0, r4, r4, r3)
            r3 = -1
            if (r0 != r3) goto L3e
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3e:
            int r0 = r0 + r2
            r2 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r4, r2)
            if (r0 != r3) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r3
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto Lcc
            r4 = -111961669208133(0xffff9a2be47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r4 = xhss.AbstractC0390.m778(r4)
            r5 = -128480113428549(0xffff8b25e47a77bb, double:NaN)
            xhss.ᲁᛶᛷ r5 = xhss.AbstractC0390.m773(r5)
            r6 = -128540242970693(0xffff8b17e47a77bb, double:NaN)
            r8 = -128583192643653(0xffff8b0de47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0390.m790(r6, r8, r5)
            xhss.C0960.m1573(r5, r6)
            r5.m1578(r2)
            r6 = -128746401400901(0xffff8ae7e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r6)
            xhss.C0960.m1572(r5, r2)
            r6 = -128767876237381(0xffff8ae2e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r6)
            r6 = -128840890681413(0xffff8ad1e47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            java.lang.String[] r2 = new java.lang.String[]{r2, r6}
            r5.m1576(r2)
            r4.f2133 = r5
            xhss.ᲈᛴᲀᛲ r1 = r1.m86(r4)
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto Lcc
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto Lcd
        Lcc:
            r1 = r3
        Lcd:
            r4 = 1
            if (r1 != 0) goto Lea
            long r1 = xhss.AbstractC1178.f3791
            long r1 = r1 + r4
            xhss.AbstractC1178.f3791 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r4 = -176304574269509(0xffff5fa6e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r4)
            r1.<init>(r2)
            r2 = 39
            xhss.AbstractC0390.m791(r1, r0, r2)
            return r3
        Lea:
            java.lang.String r2 = r1.toString()
            int r3 = r2.length()
            if (r3 <= 0) goto L113
            long r6 = xhss.AbstractC1178.f3795
            long r6 = r6 + r4
            xhss.AbstractC1178.f3795 = r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -176454898124869(0xffff5f83e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -176596632045637(0xffff5f62e47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        L113:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final java.lang.String m1873(long r18) {
            r0 = -999500000(0xffffffffc46cd720, double:NaN)
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            java.lang.String r1 = " s "
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            r4 = 500000000(0x1dcd6500, double:2.47032823E-315)
            if (r0 > 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r4 = r18 - r4
            long r4 = r4 / r2
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto Laa
        L23:
            r6 = -999500(0xfffffffffff0bfb4, double:NaN)
            int r0 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            java.lang.String r6 = " ms"
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = 500000(0x7a120, double:2.47033E-318)
            if (r0 > 0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r18 - r9
            long r1 = r1 / r7
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto Laa
        L45:
            r11 = 0
            int r0 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            java.lang.String r11 = " µs"
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = 500(0x1f4, double:2.47E-321)
            if (r0 > 0) goto L64
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r18 - r14
            long r1 = r1 / r12
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            goto Laa
        L64:
            r16 = 999500(0xf404c, double:4.938186E-318)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L7e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r18 + r14
            long r1 = r1 / r12
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            goto Laa
        L7e:
            r11 = 999500000(0x3b9328e0, double:4.93818613E-315)
            int r0 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r0 >= 0) goto L98
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r18 + r9
            long r1 = r1 / r7
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto Laa
        L98:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r4 = r18 + r4
            long r4 = r4 / r2
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        Laa:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "%6s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static void m1874(java.lang.Throwable r2, java.lang.Throwable r3) {
            if (r2 == r3) goto L1e
            java.lang.Integer r0 = xhss.AbstractC0567.f1999
            if (r0 == 0) goto L1b
            int r0 = r0.intValue()
            r1 = 19
            if (r0 < r1) goto Lf
            goto L1b
        Lf:
            java.lang.reflect.Method r0 = xhss.AbstractC0975.f3176
            if (r0 == 0) goto L1e
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.invoke(r2, r3)
            return
        L1b:
            r2.addSuppressed(r3)
        L1e:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static xhss.C1035 m1875() {
            r0 = -193561752864837(0xffff4ff4e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -193746436458565(0xffff4fc9e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L56
            boolean r4 = xhss.AbstractC0120.m342(r1)
            if (r4 != 0) goto L2a
            goto L2b
        L2a:
            r1 = r3
        L2b:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r3 = 6
            int r0 = xhss.AbstractC0120.m350(r1, r0, r2, r2, r3)
            r3 = -1
            if (r0 != r3) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r2, r4)
            if (r0 != r3) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r3
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto Lba
            r4 = -200987751319621(0xffff4933e47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r4 = xhss.AbstractC0390.m778(r4)
            r5 = -83657834727493(0xffffb3e9e47a77bb, double:NaN)
            xhss.ᲁᛶᛷ r5 = xhss.AbstractC0390.m773(r5)
            r6 = -83717964269637(0xffffb3dbe47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            xhss.C0960.m1573(r5, r6)
            r6 = -83885467994181(0xffffb3b4e47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            xhss.C0960.m1571(r5, r6)
            r6 = -84014317013061(0xffffb396e47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            xhss.C0960.m1572(r5, r6)
            r5.m1578(r2)
            r4.f2133 = r5
            xhss.ᲈᛴᲀᛲ r1 = r1.m86(r4)
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto Lba
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto Lbb
        Lba:
            r1 = r3
        Lbb:
            r4 = 1
            if (r1 != 0) goto Ld8
            long r1 = xhss.AbstractC1178.f3791
            long r1 = r1 + r4
            xhss.AbstractC1178.f3791 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r4 = -193750731425861(0xffff4fc8e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r4)
            r1.<init>(r2)
            r2 = 39
            xhss.AbstractC0390.m791(r1, r0, r2)
            return r3
        Ld8:
            java.lang.String r2 = r1.toString()
            int r3 = r2.length()
            if (r3 <= 0) goto L101
            long r6 = xhss.AbstractC1178.f3795
            long r6 = r6 + r4
            xhss.AbstractC1178.f3795 = r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -193901055281221(0xffff4fa5e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -194042789201989(0xffff4f84e47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        L101:
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public static xhss.C1047 m1876() {
            r0 = -187235266037829(0xffff55b5e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -187329755318341(0xffff559fe47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            if (r1 == 0) goto L56
            boolean r3 = xhss.AbstractC0120.m342(r1)
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r2 = 6
            r3 = 0
            int r0 = xhss.AbstractC0120.m350(r1, r0, r3, r3, r2)
            r2 = -1
            if (r0 != r2) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r3, r4)
            if (r0 != r2) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛶᛳᛵ r0 = (xhss.C1047) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r2
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto L81
            xhss.ᛲᛷᛵᲁ r3 = xhss.C0188.f738
            xhss.ᛵᛲᛴᛵ r1 = r1.m89(r3)
            java.lang.Object r1 = r1.m1225()
            xhss.ᲇᛸᛳᛸ r1 = (xhss.C1062) r1
            if (r1 == 0) goto L81
            xhss.ᲇᛶᛳᛵ r1 = r1.m1721()
            goto L82
        L81:
            r1 = r2
        L82:
            r3 = 1
            if (r1 != 0) goto L9f
            long r5 = xhss.AbstractC1178.f3791
            long r5 = r5 + r3
            xhss.AbstractC1178.f3791 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = -187334050285637(0xffff559ee47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r3)
            r1.<init>(r3)
            r3 = 39
            xhss.AbstractC0390.m791(r1, r0, r3)
            return r2
        L9f:
            java.lang.String r2 = r1.f3370
            java.lang.String r2 = xhss.AbstractC0021.m124(r2)
            int r5 = r2.length()
            if (r5 <= 0) goto Lca
            long r5 = xhss.AbstractC1178.f3795
            long r5 = r5 + r3
            xhss.AbstractC1178.f3795 = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -187484374140997(0xffff557be47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -187626108061765(0xffff555ae47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        Lca:
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static xhss.C1035 m1877() {
            r0 = -157703070910533(0xffff7091e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -157767495419973(0xffff7082e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            if (r1 == 0) goto L56
            boolean r3 = xhss.AbstractC0120.m342(r1)
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r2 = 6
            r3 = 0
            int r0 = xhss.AbstractC0120.m350(r1, r0, r3, r3, r2)
            r2 = -1
            if (r0 != r2) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r3, r4)
            if (r0 != r2) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r2
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto Lc1
            r3 = -134454412937285(0xffff85b6e47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r3 = xhss.AbstractC0390.m778(r3)
            xhss.ᲁᛶᛷ r4 = new xhss.ᲁᛶᛷ
            r4.<init>()
            r5 = -210587003226181(0xffff4078e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r5)
            r5 = 8
            xhss.C0960.m1574(r4, r5)
            r5 = -210647132768325(0xffff406ae47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r5)
            xhss.C0960.m1572(r4, r5)
            r5 = -210836111329349(0xffff403ee47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r5)
            r6 = -210939190544453(0xffff4026e47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            r4.m1579(r5)
            r3.f2133 = r4
            xhss.ᲈᛴᲀᛲ r1 = r1.m86(r3)
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto Lc1
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto Lc2
        Lc1:
            r1 = r2
        Lc2:
            r3 = 1
            if (r1 != 0) goto Ldf
            long r5 = xhss.AbstractC1178.f3791
            long r5 = r5 + r3
            xhss.AbstractC1178.f3791 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = -157771790387269(0xffff7081e47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r3)
            r1.<init>(r3)
            r3 = 39
            xhss.AbstractC0390.m791(r1, r0, r3)
            return r2
        Ldf:
            java.lang.String r2 = r1.toString()
            int r5 = r2.length()
            if (r5 <= 0) goto L108
            long r5 = xhss.AbstractC1178.f3795
            long r5 = r5 + r3
            xhss.AbstractC1178.f3795 = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -157922114242629(0xffff705ee47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -158063848163397(0xffff703de47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        L108:
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static xhss.C1035 m1878() {
            r0 = -194059969071173(0xffff4f80e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -194188818090053(0xffff4f62e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L56
            boolean r4 = xhss.AbstractC0120.m342(r1)
            if (r4 != 0) goto L2a
            goto L2b
        L2a:
            r1 = r3
        L2b:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r3 = 6
            int r0 = xhss.AbstractC0120.m350(r1, r0, r2, r2, r3)
            r3 = -1
            if (r0 != r3) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r2, r4)
            if (r0 != r3) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r3
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto Ld0
            xhss.ᛲᛱᲀᛵ r4 = xhss.C0127.f582
            xhss.ᛵᛲᛴᛵ r1 = r1.m89(r4)
            r4 = -114478520043589(0xffff97e1e47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r4 = xhss.AbstractC0390.m778(r4)
            r5 = -113327468808261(0xffff98ede47a77bb, double:NaN)
            xhss.ᲁᛶᛷ r5 = xhss.AbstractC0390.m773(r5)
            r6 = -113387598350405(0xffff98dfe47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            xhss.C0960.m1572(r5, r6)
            r5.m1578(r2)
            r6 = -113409073186885(0xffff98dae47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r6)
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r5.m1576(r2)
            r4.f2133 = r5
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Lb3
            xhss.ᲈᛴᲀᛲ r1 = new xhss.ᲈᛴᲀᛲ
            r1.<init>()
            goto Lc3
        Lb3:
            java.lang.Object r2 = r1.first()
            xhss.ᲇᛸᛳᛸ r2 = (xhss.C1062) r2
            java.lang.Object r2 = r2.f3094
            org.luckypray.dexkit.DexKitBridge r2 = (org.luckypray.dexkit.DexKitBridge) r2
            r4.f2131 = r1
            xhss.ᲈᛴᲀᛲ r1 = r2.m86(r4)
        Lc3:
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto Ld0
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto Ld1
        Ld0:
            r1 = r3
        Ld1:
            r4 = 1
            if (r1 != 0) goto Lee
            long r1 = xhss.AbstractC1178.f3791
            long r1 = r1 + r4
            xhss.AbstractC1178.f3791 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r4 = -194193113057349(0xffff4f61e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r4)
            r1.<init>(r2)
            r2 = 39
            xhss.AbstractC0390.m791(r1, r0, r2)
            return r3
        Lee:
            java.lang.String r2 = r1.toString()
            int r3 = r2.length()
            if (r3 <= 0) goto L117
            long r6 = xhss.AbstractC1178.f3795
            long r6 = r6 + r4
            xhss.AbstractC1178.f3795 = r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -194343436912709(0xffff4f3ee47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -194485170833477(0xffff4f1de47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        L117:
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public static xhss.C1035 m1879() {
            r0 = -189833721251909(0xffff5358e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -189966865238085(0xffff5339e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 4
            java.lang.String r3 = ":"
            r4 = 6
            java.lang.String r5 = "->"
            r6 = 0
            r7 = 1
            r8 = -1
            r9 = 0
            if (r1 == 0) goto L56
            boolean r10 = xhss.AbstractC0120.m342(r1)
            if (r10 != 0) goto L32
            goto L33
        L32:
            r1 = r9
        L33:
            if (r1 == 0) goto L56
            int r0 = xhss.AbstractC0120.m350(r1, r5, r6, r6, r4)
            if (r0 != r8) goto L41
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L41:
            int r0 = r0 + r7
            int r0 = xhss.AbstractC0120.m350(r1, r3, r0, r6, r2)
            if (r0 != r8) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r9
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            r10 = 39
            r11 = 1
            if (r1 == 0) goto L155
            r13 = -188931778119749(0xffff542ae47a77bb, double:NaN)
            java.lang.String r13 = xhss.AbstractC0775.m1313(r13)
            com.tencent.mmkv.MMKV r14 = xhss.C0210.m475()
            r15 = -189077807007813(0xffff5408e47a77bb, double:NaN)
            java.lang.String r15 = xhss.AbstractC0775.m1313(r15)
            java.lang.String r14 = r14.getString(r13, r15)
            if (r14 == 0) goto Lba
            boolean r15 = xhss.AbstractC0120.m342(r14)
            if (r15 != 0) goto L95
            goto L96
        L95:
            r14 = r9
        L96:
            if (r14 == 0) goto Lba
            int r4 = xhss.AbstractC0120.m350(r14, r5, r6, r6, r4)
            if (r4 != r8) goto La4
            xhss.ᲇᛶᛳᛵ r2 = new xhss.ᲇᛶᛳᛵ
            r2.<init>(r14)
            goto Lb6
        La4:
            int r4 = r4 + r7
            int r2 = xhss.AbstractC0120.m350(r14, r3, r4, r6, r2)
            if (r2 != r8) goto Lb1
            xhss.ᲇᛴᲇᛴ r2 = new xhss.ᲇᛴᲇᛴ
            r2.<init>(r14)
            goto Lb6
        Lb1:
            xhss.ᛷᛲᛲᛲ r2 = new xhss.ᛷᛲᛲᛲ
            r2.<init>(r14)
        Lb6:
            xhss.ᲇᛴᲇᛴ r2 = (xhss.C1035) r2
            goto L130
        Lba:
            org.luckypray.dexkit.DexKitBridge r2 = xhss.C1085.f3503
            if (r2 != 0) goto Lca
            com.xingin.xhss.ModuleMain r2 = xhss.C1085.m1755()
            boolean r2 = r2.m82()
            if (r2 != 0) goto Lca
        Lc8:
            r2 = r9
            goto L130
        Lca:
            org.luckypray.dexkit.DexKitBridge r2 = xhss.C1085.f3503
            if (r2 == 0) goto Led
            r3 = -82279150225477(0xffffb52ae47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r3 = xhss.AbstractC0390.m778(r3)
            xhss.ᛲᛷᛵᲁ r4 = xhss.C0188.f742
            r3.m1080(r4)
            xhss.ᲈᛴᲀᛲ r2 = r2.m86(r3)
            java.lang.Object r2 = r2.m1225()
            xhss.ᛳᛸᛸᛵ r2 = (xhss.C0303) r2
            if (r2 == 0) goto Led
            xhss.ᲇᛴᲇᛴ r2 = r2.m631()
            goto Lee
        Led:
            r2 = r9
        Lee:
            if (r2 != 0) goto L107
            long r2 = xhss.AbstractC1178.f3791
            long r2 = r2 + r11
            xhss.AbstractC1178.f3791 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = -189082101975109(0xffff5407e47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r3)
            r2.<init>(r3)
            xhss.AbstractC0390.m791(r2, r13, r10)
            goto Lc8
        L107:
            java.lang.String r3 = r2.toString()
            int r4 = r3.length()
            if (r4 <= 0) goto L130
            long r4 = xhss.AbstractC1178.f3795
            long r4 = r4 + r11
            xhss.AbstractC1178.f3795 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = -189232425830469(0xffff53e4e47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r5)
            r4.<init>(r5)
            r5 = -189374159751237(0xffff53c3e47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r4 = xhss.AbstractC0390.m779(r4, r13, r5, r3)
            r4.putString(r13, r3)
        L130:
            if (r2 != 0) goto L133
            goto L155
        L133:
            r3 = -54868668942405(0xffffce18e47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r3 = xhss.AbstractC0390.m778(r3)
            xhss.ᛵᛸᲈᛵ r4 = new xhss.ᛵᛸᲈᛵ
            r4.<init>(r7, r2)
            r3.m1080(r4)
            xhss.ᲈᛴᲀᛲ r1 = r1.m86(r3)
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto L155
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto L156
        L155:
            r1 = r9
        L156:
            if (r1 != 0) goto L16f
            long r1 = xhss.AbstractC1178.f3791
            long r1 = r1 + r11
            xhss.AbstractC1178.f3791 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -189971160205381(0xffff5338e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            r1.<init>(r2)
            xhss.AbstractC0390.m791(r1, r0, r10)
            return r9
        L16f:
            java.lang.String r2 = r1.toString()
            int r3 = r2.length()
            if (r3 <= 0) goto L198
            long r3 = xhss.AbstractC1178.f3795
            long r3 = r3 + r11
            xhss.AbstractC1178.f3795 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -190121484060741(0xffff5315e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -190263217981509(0xffff52f4e47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        L198:
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static xhss.C1035 m1880() {
            r0 = -196022769125445(0xffff4db7e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -196134438275141(0xffff4d9de47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            if (r1 == 0) goto L56
            boolean r3 = xhss.AbstractC0120.m342(r1)
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r2 = 6
            r3 = 0
            int r0 = xhss.AbstractC0120.m350(r1, r0, r3, r3, r2)
            r2 = -1
            if (r0 != r2) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r3, r4)
            if (r0 != r2) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r2
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto Lcf
            r3 = -90529782401093(0xffffada9e47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r3 = xhss.AbstractC0390.m778(r3)
            xhss.ᲁᛶᛷ r4 = new xhss.ᲁᛶᛷ
            r4.<init>()
            r5 = -231971645392965(0xffff2d05e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r5)
            r5 = 5
            r4.m1578(r5)
            r5 = -232031774935109(0xffff2cf7e47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r5)
            r6 = -232134854150213(0xffff2cdfe47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            r7 = -232220753496133(0xffff2ccbe47a77bb, double:NaN)
            java.lang.String r7 = xhss.AbstractC0775.m1313(r7)
            r8 = -232276588070981(0xffff2cbee47a77bb, double:NaN)
            java.lang.String r8 = xhss.AbstractC0775.m1313(r8)
            r9 = -232349602515013(0xffff2cade47a77bb, double:NaN)
            java.lang.String r9 = xhss.AbstractC0775.m1313(r9)
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9}
            r4.m1576(r5)
            r3.f2133 = r4
            xhss.ᲈᛴᲀᛲ r1 = r1.m86(r3)
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto Lcf
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto Ld0
        Lcf:
            r1 = r2
        Ld0:
            r3 = 1
            if (r1 != 0) goto Led
            long r5 = xhss.AbstractC1178.f3791
            long r5 = r5 + r3
            xhss.AbstractC1178.f3791 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = -196138733242437(0xffff4d9ce47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r3)
            r1.<init>(r3)
            r3 = 39
            xhss.AbstractC0390.m791(r1, r0, r3)
            return r2
        Led:
            java.lang.String r2 = r1.toString()
            int r5 = r2.length()
            if (r5 <= 0) goto L116
            long r5 = xhss.AbstractC1178.f3795
            long r5 = r5 + r3
            xhss.AbstractC1178.f3795 = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -196289057097797(0xffff4d79e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -196430791018565(0xffff4d58e47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        L116:
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static xhss.C1035 m1881() {
            r0 = -190280397850693(0xffff52f0e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -190460786477125(0xffff52c6e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            if (r1 == 0) goto L56
            boolean r3 = xhss.AbstractC0120.m342(r1)
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r2 = 6
            r3 = 0
            int r0 = xhss.AbstractC0120.m350(r1, r0, r3, r3, r2)
            r2 = -1
            if (r0 != r2) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r3, r4)
            if (r0 != r2) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r2
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto L8d
            r3 = -133659843987525(0xffff866fe47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r3 = xhss.AbstractC0390.m778(r3)
            xhss.ᛴᲈᲁᲇ r4 = xhss.C0434.f1527
            r3.m1080(r4)
            xhss.ᲈᛴᲀᛲ r1 = r1.m86(r3)
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto L8d
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto L8e
        L8d:
            r1 = r2
        L8e:
            r3 = 1
            if (r1 != 0) goto Lab
            long r5 = xhss.AbstractC1178.f3791
            long r5 = r5 + r3
            xhss.AbstractC1178.f3791 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = -190465081444421(0xffff52c5e47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r3)
            r1.<init>(r3)
            r3 = 39
            xhss.AbstractC0390.m791(r1, r0, r3)
            return r2
        Lab:
            java.lang.String r2 = r1.toString()
            int r5 = r2.length()
            if (r5 <= 0) goto Ld4
            long r5 = xhss.AbstractC1178.f3795
            long r5 = r5 + r3
            xhss.AbstractC1178.f3795 = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -190615405299781(0xffff52a2e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -190757139220549(0xffff5281e47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        Ld4:
            return r1
    }

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public static xhss.C1035 m1882() {
            r0 = -182429197633605(0xffff5a14e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -182588111423557(0xffff59efe47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L56
            boolean r4 = xhss.AbstractC0120.m342(r1)
            if (r4 != 0) goto L2a
            goto L2b
        L2a:
            r1 = r3
        L2b:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r3 = 6
            int r0 = xhss.AbstractC0120.m350(r1, r0, r2, r2, r3)
            r3 = -1
            if (r0 != r3) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r2, r4)
            if (r0 != r3) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r3
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto Lae
            r4 = -63793610983493(0xffffc5fae47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r4 = xhss.AbstractC0390.m778(r4)
            r5 = -250676227967045(0xffff1c02e47a77bb, double:NaN)
            xhss.ᲁᛶᛷ r5 = xhss.AbstractC0390.m773(r5)
            r6 = -250736357509189(0xffff1bf4e47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            xhss.C0960.m1573(r5, r6)
            r5.m1578(r2)
            r6 = -251092839794757(0xffff1ba1e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r6)
            xhss.C0960.m1572(r5, r2)
            r4.f2133 = r5
            xhss.ᲈᛴᲀᛲ r1 = r1.m86(r4)
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto Lae
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto Laf
        Lae:
            r1 = r3
        Laf:
            r4 = 1
            if (r1 != 0) goto Lcc
            long r1 = xhss.AbstractC1178.f3791
            long r1 = r1 + r4
            xhss.AbstractC1178.f3791 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r4 = -182592406390853(0xffff59eee47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r4)
            r1.<init>(r2)
            r2 = 39
            xhss.AbstractC0390.m791(r1, r0, r2)
            return r3
        Lcc:
            java.lang.String r2 = r1.toString()
            int r3 = r2.length()
            if (r3 <= 0) goto Lf5
            long r6 = xhss.AbstractC1178.f3795
            long r6 = r6 + r4
            xhss.AbstractC1178.f3795 = r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -182742730246213(0xffff59cbe47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -182884464166981(0xffff59aae47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        Lf5:
            return r1
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public static xhss.C1035 m1883() {
            r0 = -189391339620421(0xffff53bfe47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -189520188639301(0xffff53a1e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            if (r1 == 0) goto L56
            boolean r3 = xhss.AbstractC0120.m342(r1)
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r2 = 6
            r3 = 0
            int r0 = xhss.AbstractC0120.m350(r1, r0, r3, r3, r2)
            r2 = -1
            if (r0 != r2) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r3, r4)
            if (r0 != r2) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r2
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto L8d
            r3 = -133797282940997(0xffff864fe47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r3 = xhss.AbstractC0390.m778(r3)
            xhss.ᛳᛵᛲᛳ r4 = xhss.C0267.f994
            r3.m1080(r4)
            xhss.ᲈᛴᲀᛲ r1 = r1.m86(r3)
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto L8d
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto L8e
        L8d:
            r1 = r2
        L8e:
            r3 = 1
            if (r1 != 0) goto Lab
            long r5 = xhss.AbstractC1178.f3791
            long r5 = r5 + r3
            xhss.AbstractC1178.f3791 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = -189524483606597(0xffff53a0e47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r3)
            r1.<init>(r3)
            r3 = 39
            xhss.AbstractC0390.m791(r1, r0, r3)
            return r2
        Lab:
            java.lang.String r2 = r1.toString()
            int r5 = r2.length()
            if (r5 <= 0) goto Ld4
            long r5 = xhss.AbstractC1178.f3795
            long r5 = r5 + r3
            xhss.AbstractC1178.f3795 = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -189674807461957(0xffff537de47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -189816541382725(0xffff535ce47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        Ld4:
            return r1
    }

    /* JADX INFO: renamed from: ᲁᛴᛴᛸ, reason: contains not printable characters */
    public static void m1884(java.lang.Object r4) {
            if (r4 != 0) goto L3
            return
        L3:
            int r0 = xhss.AbstractC1178.f3793
            int r0 = r0 + 1
            xhss.AbstractC1178.f3793 = r0
            xhss.ᲇᲁᛱᛸ r0 = xhss.C1085.f3497
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -14633415313477(0xfffff2b0e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            r1.<init>(r2)
            int r2 = xhss.AbstractC1178.f3793
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = -14676364986437(0xfffff2a6e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            r0.getClass()
            java.lang.String r0 = xhss.C1085.m1767(r1, r2)
            java.io.File r0 = xhss.C1085.m1757(r0)
            xhss.ᲈᛲᛶᛴ r1 = xhss.AbstractC0744.m1288()
            java.lang.String r4 = r1.m1818(r4)
            java.nio.charset.Charset r1 = xhss.AbstractC0619.f2136
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r0)
            xhss.C0614.m1076(r2, r4, r1)     // Catch: java.lang.Throwable -> L4c
            r2.close()
            return
        L4c:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0 = move-exception
            xhss.AbstractC0561.m1003(r2, r4)
            throw r0
    }

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public static xhss.C0630 m1885() {
            r0 = -181991110969413(0xffff5a7ae47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -182115665020997(0xffff5a5de47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L56
            boolean r4 = xhss.AbstractC0120.m342(r1)
            if (r4 != 0) goto L2a
            goto L2b
        L2a:
            r1 = r3
        L2b:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r3 = 6
            int r0 = xhss.AbstractC0120.m350(r1, r0, r2, r2, r3)
            r3 = -1
            if (r0 != r3) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r2, r4)
            if (r0 != r3) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᛷᛲᛲᛲ r0 = (xhss.C0630) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r3
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto Lbf
            xhss.ᲀᛶᛴᛲ r4 = xhss.C0867.f2804
            xhss.ᛵᛲᛴᛵ r1 = r1.m89(r4)
            java.lang.Object r1 = r1.m1225()
            xhss.ᲇᛸᛳᛸ r1 = (xhss.C1062) r1
            if (r1 == 0) goto Lbf
            xhss.ᛶᲈᛷᲁ r4 = new xhss.ᛶᲈᛷᲁ
            r4.<init>(r2)
            r5 = -280521955706949(0xffff00dde47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r5)
            xhss.ᛴᲁᛶᲁ r2 = new xhss.ᛴᲁᛶᲁ
            r2.<init>()
            r5 = -131989101709381(0xffff87f4e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r5)
            r5 = -132049231251525(0xffff87e6e47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r5)
            xhss.C0410.m801(r2, r5)
            r4.f2133 = r2
            java.util.List r2 = java.util.Collections.singletonList(r1)
            r4.f2131 = r2
            java.lang.Object r1 = r1.f3094
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            xhss.ᲈᛶᲀᛱ r1 = r1.m87(r4)
            java.lang.Object r1 = r1.m1225()
            xhss.ᲀᛷᲀᲇ r1 = (xhss.C0877) r1
            if (r1 == 0) goto Lbf
            xhss.ᛷᛲᛲᛲ r1 = r1.m1443()
            goto Lc0
        Lbf:
            r1 = r3
        Lc0:
            r4 = 1
            if (r1 != 0) goto Ldd
            long r1 = xhss.AbstractC1178.f3791
            long r1 = r1 + r4
            xhss.AbstractC1178.f3791 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r4 = -182119959988293(0xffff5a5ce47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r4)
            r1.<init>(r2)
            r2 = 39
            xhss.AbstractC0390.m791(r1, r0, r2)
            return r3
        Ldd:
            java.lang.String r2 = r1.toString()
            int r3 = r2.length()
            if (r3 <= 0) goto L106
            long r6 = xhss.AbstractC1178.f3795
            long r6 = r6 + r4
            xhss.AbstractC1178.f3795 = r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -182270283843653(0xffff5a39e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -182412017764421(0xffff5a18e47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        L106:
            return r1
    }

    /* JADX INFO: renamed from: ᲁᲁᛴᲁ, reason: contains not printable characters */
    public static final java.lang.Object m1886(java.lang.Object r1) {
            boolean r0 = r1 instanceof xhss.C0711
            if (r0 == 0) goto Le
            xhss.ᛷᲁᲇᛷ r1 = (xhss.C0711) r1
            java.lang.Throwable r1 = r1.f2385
            xhss.ᲈᛳᛱᲇ r0 = new xhss.ᲈᛳᛱᲇ
            r0.<init>(r1)
            return r0
        Le:
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static xhss.C0289 m1887(java.lang.String r2) {
            xhss.ᛳᛶᲈᲈ r0 = new xhss.ᛳᛶᲈᲈ
            java.nio.charset.Charset r1 = xhss.AbstractC0619.f2136
            byte[] r1 = r2.getBytes(r1)
            r0.<init>(r1)
            r0.f1120 = r2
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static xhss.C1035 m1888() {
            r0 = -196447970887749(0xffff4d54e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -196576819906629(0xffff4d36e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            if (r1 == 0) goto L56
            boolean r3 = xhss.AbstractC0120.m342(r1)
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r2 = 6
            r3 = 0
            int r0 = xhss.AbstractC0120.m350(r1, r0, r3, r3, r2)
            r2 = -1
            if (r0 != r2) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r3, r4)
            if (r0 != r2) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r2
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto L8d
            r3 = -95301491066949(0xffffa952e47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r3 = xhss.AbstractC0390.m778(r3)
            xhss.ᛲᛷᛵᲁ r4 = xhss.C0188.f727
            r3.m1080(r4)
            xhss.ᲈᛴᲀᛲ r1 = r1.m86(r3)
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto L8d
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto L8e
        L8d:
            r1 = r2
        L8e:
            r3 = 1
            if (r1 != 0) goto Lab
            long r5 = xhss.AbstractC1178.f3791
            long r5 = r5 + r3
            xhss.AbstractC1178.f3791 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = -196581114873925(0xffff4d35e47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r3)
            r1.<init>(r3)
            r3 = 39
            xhss.AbstractC0390.m791(r1, r0, r3)
            return r2
        Lab:
            java.lang.String r2 = r1.toString()
            int r5 = r2.length()
            if (r5 <= 0) goto Ld4
            long r5 = xhss.AbstractC1178.f3795
            long r5 = r5 + r3
            xhss.AbstractC1178.f3795 = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -196731438729285(0xffff4d12e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -196873172650053(0xffff4cf1e47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        Ld4:
            return r1
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public static xhss.C1035 m1889() {
            r0 = -157312228886597(0xffff70ece47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -157389538297925(0xffff70dae47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L56
            boolean r4 = xhss.AbstractC0120.m342(r1)
            if (r4 != 0) goto L2a
            goto L2b
        L2a:
            r1 = r3
        L2b:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r3 = 6
            int r0 = xhss.AbstractC0120.m350(r1, r0, r2, r2, r3)
            r3 = -1
            if (r0 != r3) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r2, r4)
            if (r0 != r3) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r3
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto Lb8
            r4 = -239028276660293(0xffff269ae47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r4 = xhss.AbstractC0390.m778(r4)
            r5 = -134097930651717(0xffff8609e47a77bb, double:NaN)
            xhss.ᲁᛶᛷ r5 = xhss.AbstractC0390.m773(r5)
            r6 = -134158060193861(0xffff85fbe47a77bb, double:NaN)
            java.lang.String r6 = xhss.AbstractC0775.m1313(r6)
            r7 = -134226779670597(0xffff85ebe47a77bb, double:NaN)
            java.lang.String r7 = xhss.AbstractC0775.m1313(r7)
            r8 = -134291204180037(0xffff85dce47a77bb, double:NaN)
            java.lang.String r8 = xhss.AbstractC0775.m1313(r8)
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8}
            r5.m1576(r6)
            r5.m1578(r2)
            r4.f2133 = r5
            xhss.ᲈᛴᲀᛲ r1 = r1.m86(r4)
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto Lb8
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto Lb9
        Lb8:
            r1 = r3
        Lb9:
            r4 = 1
            if (r1 != 0) goto Ld6
            long r1 = xhss.AbstractC1178.f3791
            long r1 = r1 + r4
            xhss.AbstractC1178.f3791 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r4 = -157393833265221(0xffff70d9e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r4)
            r1.<init>(r2)
            r2 = 39
            xhss.AbstractC0390.m791(r1, r0, r2)
            return r3
        Ld6:
            java.lang.String r2 = r1.toString()
            int r3 = r2.length()
            if (r3 <= 0) goto Lff
            long r6 = xhss.AbstractC1178.f3795
            long r6 = r6 + r4
            xhss.AbstractC1178.f3795 = r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -157544157120581(0xffff70b6e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -157685891041349(0xffff7095e47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        Lff:
            return r1
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static xhss.C1035 m1890() {
            r0 = -192311917381701(0xffff5117e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.ᛲᲁᲁᲁ r1 = xhss.C0210.f781
            r1.getClass()
            com.tencent.mmkv.MMKV r1 = xhss.C0210.m475()
            r2 = -192466536204357(0xffff50f3e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            java.lang.String r1 = r1.getString(r0, r2)
            r2 = 0
            if (r1 == 0) goto L56
            boolean r3 = xhss.AbstractC0120.m342(r1)
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L56
            java.lang.String r0 = "->"
            r2 = 6
            r3 = 0
            int r0 = xhss.AbstractC0120.m350(r1, r0, r3, r3, r2)
            r2 = -1
            if (r0 != r2) goto L3d
            xhss.ᲇᛶᛳᛵ r0 = new xhss.ᲇᛶᛳᛵ
            r0.<init>(r1)
            goto L53
        L3d:
            int r0 = r0 + 1
            r4 = 4
            java.lang.String r5 = ":"
            int r0 = xhss.AbstractC0120.m350(r1, r5, r0, r3, r4)
            if (r0 != r2) goto L4e
            xhss.ᲇᛴᲇᛴ r0 = new xhss.ᲇᛴᲇᛴ
            r0.<init>(r1)
            goto L53
        L4e:
            xhss.ᛷᛲᛲᛲ r0 = new xhss.ᛷᛲᛲᛲ
            r0.<init>(r1)
        L53:
            xhss.ᲇᛴᲇᛴ r0 = (xhss.C1035) r0
            return r0
        L56:
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 != 0) goto L6a
            com.xingin.xhss.ModuleMain r1 = xhss.C1085.m1755()
            boolean r1 = r1.m82()
            if (r1 != 0) goto L6a
            return r2
        L6a:
            org.luckypray.dexkit.DexKitBridge r1 = xhss.C1085.f3503
            if (r1 == 0) goto L8d
            r3 = -34785401866309(0xffffe05ce47a77bb, double:NaN)
            xhss.ᛶᲈᛷᲁ r3 = xhss.AbstractC0390.m778(r3)
            xhss.ᛴᲈᲁᲇ r4 = xhss.C0434.f1547
            r3.m1080(r4)
            xhss.ᲈᛴᲀᛲ r1 = r1.m86(r3)
            java.lang.Object r1 = r1.m1225()
            xhss.ᛳᛸᛸᛵ r1 = (xhss.C0303) r1
            if (r1 == 0) goto L8d
            xhss.ᲇᛴᲇᛴ r1 = r1.m631()
            goto L8e
        L8d:
            r1 = r2
        L8e:
            r3 = 1
            if (r1 != 0) goto Lab
            long r5 = xhss.AbstractC1178.f3791
            long r5 = r5 + r3
            xhss.AbstractC1178.f3791 = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = -192470831171653(0xffff50f2e47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r3)
            r1.<init>(r3)
            r3 = 39
            xhss.AbstractC0390.m791(r1, r0, r3)
            return r2
        Lab:
            java.lang.String r2 = r1.toString()
            int r5 = r2.length()
            if (r5 <= 0) goto Ld4
            long r5 = xhss.AbstractC1178.f3795
            long r5 = r5 + r3
            xhss.AbstractC1178.f3795 = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -192621155027013(0xffff50cfe47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            r3.<init>(r4)
            r4 = -192762888947781(0xffff50aee47a77bb, double:NaN)
            com.tencent.mmkv.MMKV r3 = xhss.AbstractC0390.m779(r3, r0, r4, r2)
            r3.putString(r0, r2)
        Ld4:
            return r1
    }

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ */
    public abstract boolean mo796(java.lang.Class r1);

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ */
    public abstract java.lang.String[] mo797(java.lang.Class r1);

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public abstract java.lang.reflect.Constructor mo798(java.lang.Class r1);

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public abstract java.lang.reflect.Method mo799(java.lang.Class r1, java.lang.reflect.Field r2);
}
