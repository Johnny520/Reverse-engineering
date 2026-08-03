package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5973 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String[] f21746 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.util.regex.Pattern f21747 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.util.regex.Pattern f21748 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.util.regex.Pattern f21749 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.ThreadLocal<java.util.Stack<java.lang.StringBuilder>> f21750 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f21751 = 8192;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f21752 = 8;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۡۤ$ۥ, reason: contains not printable characters */
    public static class C5974 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.StringBuilder f21753;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.String f21754;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f21755;

        public C5974(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.lang.StringBuilder r0 = Yue.C5973.m22113()
                r1.f21753 = r0
                r0 = 1
                r1.f21755 = r0
                r1.f21754 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C5973.C5974 m22133(java.lang.Object r3) {
                r2 = this;
                java.lang.StringBuilder r0 = r2.f21753
                Yue.C6657.m25635(r0)
                boolean r0 = r2.f21755
                if (r0 != 0) goto L10
                java.lang.StringBuilder r0 = r2.f21753
                java.lang.String r1 = r2.f21754
                r0.append(r1)
            L10:
                java.lang.StringBuilder r0 = r2.f21753
                r0.append(r3)
                r3 = 0
                r2.f21755 = r3
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C5973.C5974 m22134(java.lang.Object r2) {
                r1 = this;
                java.lang.StringBuilder r0 = r1.f21753
                Yue.C6657.m25635(r0)
                java.lang.StringBuilder r0 = r1.f21753
                r0.append(r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public java.lang.String m22135() {
                r2 = this;
                java.lang.StringBuilder r0 = r2.f21753
                java.lang.String r0 = Yue.C5973.m22128(r0)
                r1 = 0
                r2.f21753 = r1
                return r0
        }
    }

    static {
            java.lang.String r19 = "                   "
            java.lang.String r20 = "                    "
            java.lang.String r0 = ""
            java.lang.String r1 = " "
            java.lang.String r2 = "  "
            java.lang.String r3 = "   "
            java.lang.String r4 = "    "
            java.lang.String r5 = "     "
            java.lang.String r6 = "      "
            java.lang.String r7 = "       "
            java.lang.String r8 = "        "
            java.lang.String r9 = "         "
            java.lang.String r10 = "          "
            java.lang.String r11 = "           "
            java.lang.String r12 = "            "
            java.lang.String r13 = "             "
            java.lang.String r14 = "              "
            java.lang.String r15 = "               "
            java.lang.String r16 = "                "
            java.lang.String r17 = "                 "
            java.lang.String r18 = "                  "
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            Yue.C5973.f21746 = r0
            java.lang.String r0 = "^/((\\.{1,2}/)+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            Yue.C5973.f21747 = r0
            java.lang.String r0 = "^[a-zA-Z][a-zA-Z0-9+-.]*:"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            Yue.C5973.f21748 = r0
            java.lang.String r0 = "[\\x00-\\x1f]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            Yue.C5973.f21749 = r0
            Yue.ۥۣۢ۠ۡ r0 = new Yue.ۥۣۢ۠ۡ
            r0.<init>()
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            Yue.C5973.f21750 = r0
            return
    }

    public C5973() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m22112(java.lang.StringBuilder r8, java.lang.String r9, boolean r10) {
            int r0 = r9.length()
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L8:
            if (r2 >= r0) goto L34
            int r5 = r9.codePointAt(r2)
            boolean r6 = m22116(r5)
            r7 = 1
            if (r6 == 0) goto L23
            if (r10 == 0) goto L19
            if (r3 == 0) goto L2e
        L19:
            if (r4 == 0) goto L1c
            goto L2e
        L1c:
            r4 = 32
            r8.append(r4)
            r4 = r7
            goto L2e
        L23:
            boolean r6 = m22119(r5)
            if (r6 != 0) goto L2e
            r8.appendCodePoint(r5)
            r4 = r1
            r3 = r7
        L2e:
            int r5 = java.lang.Character.charCount(r5)
            int r2 = r2 + r5
            goto L8
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.StringBuilder m22113() {
            java.lang.ThreadLocal<java.util.Stack<java.lang.StringBuilder>> r0 = Yue.C5973.f21750
            java.lang.Object r0 = r0.get()
            java.util.Stack r0 = (java.util.Stack) r0
            boolean r1 = r0.empty()
            if (r1 == 0) goto L16
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r1)
            goto L1c
        L16:
            java.lang.Object r0 = r0.pop()
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
        L1c:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m22114(java.lang.String r4, java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L12
            r3 = r5[r2]
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lf
            r4 = 1
            return r4
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m22115(java.lang.String r0, java.lang.String[] r1) {
            int r0 = java.util.Arrays.binarySearch(r1, r0)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m22116(int r1) {
            r0 = 32
            if (r1 == r0) goto L1b
            r0 = 9
            if (r1 == r0) goto L1b
            r0 = 10
            if (r1 == r0) goto L1b
            r0 = 12
            if (r1 == r0) goto L1b
            r0 = 13
            if (r1 == r0) goto L1b
            r0 = 160(0xa0, float:2.24E-43)
            if (r1 != r0) goto L19
            goto L1b
        L19:
            r1 = 0
            goto L1c
        L1b:
            r1 = 1
        L1c:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m22117(java.lang.String r4) {
            Yue.C6657.m25635(r4)
            r0 = 0
            r1 = r0
        L5:
            int r2 = r4.length()
            if (r1 >= r2) goto L17
            char r2 = r4.charAt(r1)
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 <= r3) goto L14
            return r0
        L14:
            int r1 = r1 + 1
            goto L5
        L17:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m22118(java.lang.String r5) {
            r0 = 1
            if (r5 == 0) goto L20
            int r1 = r5.length()
            if (r1 != 0) goto La
            goto L20
        La:
            int r1 = r5.length()
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L20
            int r4 = r5.codePointAt(r3)
            boolean r4 = m22121(r4)
            if (r4 != 0) goto L1d
            return r2
        L1d:
            int r3 = r3 + 1
            goto L10
        L20:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m22119(int r1) {
            r0 = 8203(0x200b, float:1.1495E-41)
            if (r1 == r0) goto Lb
            r0 = 173(0xad, float:2.42E-43)
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m22120(java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L21
            int r1 = r4.length()
            if (r1 != 0) goto La
            goto L21
        La:
            int r1 = r4.length()
            r2 = r0
        Lf:
            if (r2 >= r1) goto L1f
            int r3 = r4.codePointAt(r2)
            boolean r3 = java.lang.Character.isDigit(r3)
            if (r3 != 0) goto L1c
            return r0
        L1c:
            int r2 = r2 + 1
            goto Lf
        L1f:
            r4 = 1
            return r4
        L21:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m22121(int r1) {
            r0 = 32
            if (r1 == r0) goto L17
            r0 = 9
            if (r1 == r0) goto L17
            r0 = 10
            if (r1 == r0) goto L17
            r0 = 12
            if (r1 == r0) goto L17
            r0 = 13
            if (r1 != r0) goto L15
            goto L17
        L15:
            r1 = 0
            goto L18
        L17:
            r1 = 1
        L18:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static java.lang.String m22122(java.util.Collection<?> r0, java.lang.String r1) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r0 = m22123(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static java.lang.String m22123(java.util.Iterator<?> r2, java.lang.String r3) {
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = r0.toString()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L18
            return r0
        L18:
            Yue.ۥۢ۠ۡۤ$ۥ r1 = new Yue.ۥۢ۠ۡۤ$ۥ
            r1.<init>(r3)
            r1.m22133(r0)
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()
            r1.m22133(r3)
            goto L20
        L2e:
            java.lang.String r2 = r1.m22135()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static java.lang.String m22124(java.lang.String[] r0, java.lang.String r1) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r0 = m22122(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static java.lang.String m22125(java.lang.String r2) {
            java.lang.StringBuilder r0 = m22113()
            r1 = 0
            m22112(r0, r2, r1)
            java.lang.String r2 = m22128(r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static java.lang.String m22126(int r1) {
            r0 = 30
            java.lang.String r1 = m22127(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static java.lang.String m22127(int r4, int r5) {
            r0 = 0
            r1 = 1
            if (r4 < 0) goto L6
            r2 = r1
            goto L7
        L6:
            r2 = r0
        L7:
            java.lang.String r3 = "width must be >= 0"
            Yue.C6657.m25629(r2, r3)
            r2 = -1
            if (r5 < r2) goto L10
            goto L11
        L10:
            r1 = r0
        L11:
            Yue.C6657.m25628(r1)
            if (r5 == r2) goto L1a
            int r4 = java.lang.Math.min(r4, r5)
        L1a:
            java.lang.String[] r5 = Yue.C5973.f21746
            int r1 = r5.length
            if (r4 >= r1) goto L22
            r4 = r5[r4]
            return r4
        L22:
            char[] r5 = new char[r4]
        L24:
            if (r0 >= r4) goto L2d
            r1 = 32
            r5[r0] = r1
            int r0 = r0 + 1
            goto L24
        L2d:
            java.lang.String r4 = java.lang.String.valueOf(r5)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static java.lang.String m22128(java.lang.StringBuilder r3) {
            Yue.C6657.m25635(r3)
            java.lang.String r0 = r3.toString()
            int r1 = r3.length()
            r2 = 8192(0x2000, float:1.148E-41)
            if (r1 <= r2) goto L15
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            goto L1d
        L15:
            r1 = 0
            int r2 = r3.length()
            r3.delete(r1, r2)
        L1d:
            java.lang.ThreadLocal<java.util.Stack<java.lang.StringBuilder>> r1 = Yue.C5973.f21750
            java.lang.Object r1 = r1.get()
            java.util.Stack r1 = (java.util.Stack) r1
            r1.push(r3)
        L28:
            int r3 = r1.size()
            r2 = 8
            if (r3 <= r2) goto L34
            r1.pop()
            goto L28
        L34:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static java.lang.String m22129(java.lang.String r1, java.lang.String r2) {
            java.lang.String r1 = m22132(r1)
            java.lang.String r2 = m22132(r2)
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L16
            r0.<init>(r1)     // Catch: java.net.MalformedURLException -> L16
            java.net.URL r1 = m22130(r0, r2)     // Catch: java.net.MalformedURLException -> L20
            java.lang.String r1 = r1.toExternalForm()     // Catch: java.net.MalformedURLException -> L20
            return r1
        L16:
            java.net.URL r1 = new java.net.URL     // Catch: java.net.MalformedURLException -> L20
            r1.<init>(r2)     // Catch: java.net.MalformedURLException -> L20
            java.lang.String r1 = r1.toExternalForm()     // Catch: java.net.MalformedURLException -> L20
            return r1
        L20:
            java.util.regex.Pattern r1 = Yue.C5973.f21748
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.find()
            if (r1 == 0) goto L2d
            goto L2f
        L2d:
            java.lang.String r2 = ""
        L2f:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static java.net.URL m22130(java.net.URL r3, java.lang.String r4) throws java.net.MalformedURLException {
            java.lang.String r4 = m22132(r4)
            java.lang.String r0 = "?"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getPath()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L1f:
            java.net.URL r0 = new java.net.URL
            r0.<init>(r3, r4)
            java.util.regex.Pattern r3 = Yue.C5973.f21747
            java.lang.String r4 = r0.getFile()
            java.util.regex.Matcher r3 = r3.matcher(r4)
            java.lang.String r4 = "/"
            java.lang.String r3 = r3.replaceFirst(r4)
            java.lang.String r4 = r0.getRef()
            if (r4 == 0) goto L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "#"
            r4.append(r3)
            java.lang.String r3 = r0.getRef()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L52:
            java.net.URL r4 = new java.net.URL
            java.lang.String r1 = r0.getProtocol()
            java.lang.String r2 = r0.getHost()
            int r0 = r0.getPort()
            r4.<init>(r1, r2, r0, r3)
            return r4
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static boolean m22131(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto L13
            int r1 = r2.length()
            if (r1 != 0) goto La
            goto L13
        La:
            char r2 = r2.charAt(r0)
            r1 = 10
            if (r2 != r1) goto L13
            r0 = 1
        L13:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static java.lang.String m22132(java.lang.String r1) {
            java.util.regex.Pattern r0 = Yue.C5973.f21749
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r0)
            return r1
    }
}
