package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3618 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String[] f11530 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.util.Comparator<Yue.C3618.C3620> f11531 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C3619 {
        public C3619() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m14631(android.widget.TextView r0, java.util.regex.Pattern r1, java.lang.String r2, java.lang.String[] r3, android.text.util.Linkify.MatchFilter r4, android.text.util.Linkify.TransformFilter r5) {
                android.text.util.Linkify.addLinks(r0, r1, r2, r3, r4, r5)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m14632(android.text.Spannable r0, java.util.regex.Pattern r1, java.lang.String r2, java.lang.String[] r3, android.text.util.Linkify.MatchFilter r4, android.text.util.Linkify.TransformFilter r5) {
                boolean r0 = android.text.util.Linkify.addLinks(r0, r1, r2, r3, r4, r5)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢ۟$ۥ۟, reason: contains not printable characters */
    public static class C3620 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.text.style.URLSpan f11532;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.lang.String f11533;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f11534;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f11535;

        public C3620() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢ۟$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC3621 {
    }

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            Yue.C3618.f11530 = r0
            Yue.ۥ۠ۧۢ r0 = new Yue.ۥ۠ۧۢ
            r0.<init>()
            Yue.C3618.f11531 = r0
            return
    }

    public C3618() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ int m14613(Yue.C3618.C3620 r0, Yue.C3618.C3620 r1) {
            int r0 = m14627(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m14614(@Yue.InterfaceC4410 android.widget.TextView r1) {
            android.text.method.MovementMethod r0 = r1.getMovementMethod()
            boolean r0 = r0 instanceof android.text.method.LinkMovementMethod
            if (r0 != 0) goto L15
            boolean r0 = r1.getLinksClickable()
            if (r0 == 0) goto L15
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m14615(@Yue.InterfaceC4410 android.widget.TextView r7, @Yue.InterfaceC4410 java.util.regex.Pattern r8, @Yue.InterfaceC4544 java.lang.String r9) {
            boolean r0 = m14630()
            if (r0 == 0) goto La
            android.text.util.Linkify.addLinks(r7, r8, r9)
            return
        La:
            r5 = 0
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            m14617(r1, r2, r3, r4, r5, r6)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m14616(@Yue.InterfaceC4410 android.widget.TextView r7, @Yue.InterfaceC4410 java.util.regex.Pattern r8, @Yue.InterfaceC4544 java.lang.String r9, @Yue.InterfaceC4544 android.text.util.Linkify.MatchFilter r10, @Yue.InterfaceC4544 android.text.util.Linkify.TransformFilter r11) {
            boolean r0 = m14630()
            if (r0 == 0) goto La
            android.text.util.Linkify.addLinks(r7, r8, r9, r10, r11)
            return
        La:
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            m14617(r1, r2, r3, r4, r5, r6)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m14617(@Yue.InterfaceC4410 android.widget.TextView r7, @Yue.InterfaceC4410 java.util.regex.Pattern r8, @Yue.InterfaceC4544 java.lang.String r9, @Yue.InterfaceC4544 java.lang.String[] r10, @Yue.InterfaceC4544 android.text.util.Linkify.MatchFilter r11, @Yue.InterfaceC4544 android.text.util.Linkify.TransformFilter r12) {
            boolean r0 = m14630()
            if (r0 == 0) goto La
            Yue.C3618.C3619.m14631(r7, r8, r9, r10, r11, r12)
            return
        La:
            java.lang.CharSequence r0 = r7.getText()
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r0)
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            boolean r8 = m14621(r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L24
            r7.setText(r0)
            m14614(r7)
        L24:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m14618(@Yue.InterfaceC4410 android.text.Spannable r10, int r11) {
            boolean r0 = m14630()
            if (r0 == 0) goto Lb
            boolean r10 = android.text.util.Linkify.addLinks(r10, r11)
            return r10
        Lb:
            r0 = 0
            if (r11 != 0) goto Lf
            return r0
        Lf:
            int r1 = r10.length()
            java.lang.Class<android.text.style.URLSpan> r2 = android.text.style.URLSpan.class
            java.lang.Object[] r1 = r10.getSpans(r0, r1, r2)
            android.text.style.URLSpan[] r1 = (android.text.style.URLSpan[]) r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
        L1e:
            if (r2 < 0) goto L28
            r4 = r1[r2]
            r10.removeSpan(r4)
            int r2 = r2 + (-1)
            goto L1e
        L28:
            r1 = r11 & 4
            if (r1 == 0) goto L30
            r1 = 4
            android.text.util.Linkify.addLinks(r10, r1)
        L30:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r11 & 1
            if (r2 == 0) goto L4d
            java.util.regex.Pattern r6 = Yue.C4739.f15033
            java.lang.String r2 = "https://"
            java.lang.String r4 = "rtsp://"
            java.lang.String r5 = "http://"
            java.lang.String[] r7 = new java.lang.String[]{r5, r2, r4}
            android.text.util.Linkify$MatchFilter r8 = android.text.util.Linkify.sUrlMatchFilter
            r9 = 0
            r4 = r1
            r5 = r10
            m14625(r4, r5, r6, r7, r8, r9)
        L4d:
            r2 = r11 & 2
            if (r2 == 0) goto L60
            java.util.regex.Pattern r6 = Yue.C4739.f15037
            java.lang.String r2 = "mailto:"
            java.lang.String[] r7 = new java.lang.String[]{r2}
            r8 = 0
            r9 = 0
            r4 = r1
            r5 = r10
            m14625(r4, r5, r6, r7, r8, r9)
        L60:
            r11 = r11 & 8
            if (r11 == 0) goto L67
            m14626(r1, r10)
        L67:
            m14629(r1, r10)
            int r11 = r1.size()
            if (r11 != 0) goto L71
            return r0
        L71:
            java.util.Iterator r11 = r1.iterator()
        L75:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r11.next()
            Yue.ۥ۠ۧۢ۟$ۥ۟ r0 = (Yue.C3618.C3620) r0
            android.text.style.URLSpan r1 = r0.f11532
            if (r1 != 0) goto L75
            java.lang.String r1 = r0.f11533
            int r2 = r0.f11534
            int r0 = r0.f11535
            m14623(r1, r2, r0, r10)
            goto L75
        L8f:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m14619(@Yue.InterfaceC4410 android.text.Spannable r6, @Yue.InterfaceC4410 java.util.regex.Pattern r7, @Yue.InterfaceC4544 java.lang.String r8) {
            boolean r0 = m14630()
            if (r0 == 0) goto Lb
            boolean r6 = android.text.util.Linkify.addLinks(r6, r7, r8)
            return r6
        Lb:
            r4 = 0
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            boolean r6 = m14621(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m14620(@Yue.InterfaceC4410 android.text.Spannable r6, @Yue.InterfaceC4410 java.util.regex.Pattern r7, @Yue.InterfaceC4544 java.lang.String r8, @Yue.InterfaceC4544 android.text.util.Linkify.MatchFilter r9, @Yue.InterfaceC4544 android.text.util.Linkify.TransformFilter r10) {
            boolean r0 = m14630()
            if (r0 == 0) goto Lb
            boolean r6 = android.text.util.Linkify.addLinks(r6, r7, r8, r9, r10)
            return r6
        Lb:
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            boolean r6 = m14621(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m14621(@Yue.InterfaceC4410 android.text.Spannable r6, @Yue.InterfaceC4410 java.util.regex.Pattern r7, @Yue.InterfaceC4544 java.lang.String r8, @Yue.InterfaceC4544 java.lang.String[] r9, @Yue.InterfaceC4544 android.text.util.Linkify.MatchFilter r10, @Yue.InterfaceC4544 android.text.util.Linkify.TransformFilter r11) {
            boolean r0 = m14630()
            if (r0 == 0) goto Lb
            boolean r6 = Yue.C3618.C3619.m14632(r6, r7, r8, r9, r10, r11)
            return r6
        Lb:
            java.lang.String r0 = ""
            if (r8 != 0) goto L10
            r8 = r0
        L10:
            r1 = 1
            if (r9 == 0) goto L16
            int r2 = r9.length
            if (r2 >= r1) goto L18
        L16:
            java.lang.String[] r9 = Yue.C3618.f11530
        L18:
            int r2 = r9.length
            int r2 = r2 + r1
            java.lang.String[] r2 = new java.lang.String[r2]
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r3)
            r3 = 0
            r2[r3] = r8
            r8 = r3
        L26:
            int r4 = r9.length
            if (r8 >= r4) goto L3a
            r4 = r9[r8]
            int r8 = r8 + 1
            if (r4 != 0) goto L31
            r4 = r0
            goto L37
        L31:
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
        L37:
            r2[r8] = r4
            goto L26
        L3a:
            java.util.regex.Matcher r7 = r7.matcher(r6)
            r8 = r3
        L3f:
            boolean r9 = r7.find()
            if (r9 == 0) goto L66
            int r9 = r7.start()
            int r0 = r7.end()
            java.lang.String r4 = r7.group(r3)
            if (r10 == 0) goto L58
            boolean r5 = r10.acceptMatch(r6, r9, r0)
            goto L59
        L58:
            r5 = r1
        L59:
            if (r5 == 0) goto L3f
            if (r4 == 0) goto L3f
            java.lang.String r8 = m14628(r4, r2, r7, r11)
            m14623(r8, r9, r0, r6)
            r8 = r1
            goto L3f
        L66:
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m14622(@Yue.InterfaceC4410 android.widget.TextView r4, int r5) {
            boolean r0 = m14630()
            if (r0 == 0) goto Lb
            boolean r4 = android.text.util.Linkify.addLinks(r4, r5)
            return r4
        Lb:
            r0 = 0
            if (r5 != 0) goto Lf
            return r0
        Lf:
            java.lang.CharSequence r1 = r4.getText()
            boolean r2 = r1 instanceof android.text.Spannable
            r3 = 1
            if (r2 == 0) goto L24
            android.text.Spannable r1 = (android.text.Spannable) r1
            boolean r5 = m14618(r1, r5)
            if (r5 == 0) goto L35
            m14614(r4)
            return r3
        L24:
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r1)
            boolean r5 = m14618(r1, r5)
            if (r5 == 0) goto L35
            m14614(r4)
            r4.setText(r1)
            return r3
        L35:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m14623(java.lang.String r1, int r2, int r3, android.text.Spannable r4) {
            android.text.style.URLSpan r0 = new android.text.style.URLSpan
            r0.<init>(r1)
            r1 = 33
            r4.setSpan(r0, r2, r3, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static java.lang.String m14624(java.lang.String r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r2 = android.webkit.WebView.findAddress(r2)
            return r2
        Lb:
            java.lang.String r2 = Yue.C2418.m11154(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m14625(java.util.ArrayList<Yue.C3618.C3620> r4, android.text.Spannable r5, java.util.regex.Pattern r6, java.lang.String[] r7, android.text.util.Linkify.MatchFilter r8, android.text.util.Linkify.TransformFilter r9) {
            java.util.regex.Matcher r6 = r6.matcher(r5)
        L4:
            boolean r0 = r6.find()
            if (r0 == 0) goto L34
            int r0 = r6.start()
            int r1 = r6.end()
            r2 = 0
            java.lang.String r2 = r6.group(r2)
            if (r8 == 0) goto L1f
            boolean r3 = r8.acceptMatch(r5, r0, r1)
            if (r3 == 0) goto L4
        L1f:
            if (r2 == 0) goto L4
            Yue.ۥ۠ۧۢ۟$ۥ۟ r3 = new Yue.ۥ۠ۧۢ۟$ۥ۟
            r3.<init>()
            java.lang.String r2 = m14628(r2, r7, r6, r9)
            r3.f11533 = r2
            r3.f11534 = r0
            r3.f11535 = r1
            r4.add(r3)
            goto L4
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m14626(java.util.ArrayList<Yue.C3618.C3620> r5, android.text.Spannable r6) {
            java.lang.String r6 = r6.toString()
            r0 = 0
        L5:
            java.lang.String r1 = m14624(r6)     // Catch: java.lang.UnsupportedOperationException -> L43
            if (r1 == 0) goto L43
            int r2 = r6.indexOf(r1)     // Catch: java.lang.UnsupportedOperationException -> L43
            if (r2 >= 0) goto L12
            goto L43
        L12:
            Yue.ۥ۠ۧۢ۟$ۥ۟ r3 = new Yue.ۥ۠ۧۢ۟$ۥ۟     // Catch: java.lang.UnsupportedOperationException -> L43
            r3.<init>()     // Catch: java.lang.UnsupportedOperationException -> L43
            int r4 = r1.length()     // Catch: java.lang.UnsupportedOperationException -> L43
            int r4 = r4 + r2
            int r2 = r2 + r0
            r3.f11534 = r2     // Catch: java.lang.UnsupportedOperationException -> L43
            int r0 = r0 + r4
            r3.f11535 = r0     // Catch: java.lang.UnsupportedOperationException -> L43
            java.lang.String r6 = r6.substring(r4)     // Catch: java.lang.UnsupportedOperationException -> L43
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L5 java.lang.UnsupportedOperationException -> L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> L43
            r2.<init>()     // Catch: java.lang.UnsupportedOperationException -> L43
            java.lang.String r4 = "geo:0,0?q="
            r2.append(r4)     // Catch: java.lang.UnsupportedOperationException -> L43
            r2.append(r1)     // Catch: java.lang.UnsupportedOperationException -> L43
            java.lang.String r1 = r2.toString()     // Catch: java.lang.UnsupportedOperationException -> L43
            r3.f11533 = r1     // Catch: java.lang.UnsupportedOperationException -> L43
            r5.add(r3)     // Catch: java.lang.UnsupportedOperationException -> L43
            goto L5
        L43:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ int m14627(Yue.C3618.C3620 r2, Yue.C3618.C3620 r3) {
            int r0 = r2.f11534
            int r1 = r3.f11534
            if (r0 >= r1) goto L8
            r2 = -1
            return r2
        L8:
            if (r0 <= r1) goto Lc
            r2 = 1
            return r2
        Lc:
            int r3 = r3.f11535
            int r2 = r2.f11535
            int r2 = java.lang.Integer.compare(r3, r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static java.lang.String m14628(@Yue.InterfaceC4410 java.lang.String r8, @Yue.InterfaceC4410 java.lang.String[] r9, java.util.regex.Matcher r10, @Yue.InterfaceC4544 android.text.util.Linkify.TransformFilter r11) {
            if (r11 == 0) goto L6
            java.lang.String r8 = r11.transformUrl(r10, r8)
        L6:
            int r10 = r9.length
            r11 = 0
            r6 = r11
        L9:
            if (r6 >= r10) goto L47
            r7 = r9[r6]
            int r5 = r7.length()
            r1 = 1
            r2 = 0
            r4 = 0
            r0 = r8
            r3 = r7
            boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L44
            r4 = 0
            int r5 = r7.length()
            r1 = 0
            r2 = 0
            r0 = r8
            r3 = r7
            boolean r10 = r0.regionMatches(r1, r2, r3, r4, r5)
            r0 = 1
            if (r10 != 0) goto L48
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            int r1 = r7.length()
            java.lang.String r8 = r8.substring(r1)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            goto L48
        L44:
            int r6 = r6 + 1
            goto L9
        L47:
            r0 = r11
        L48:
            if (r0 != 0) goto L5e
            int r10 = r9.length
            if (r10 <= 0) goto L5e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r9 = r9[r11]
            r10.append(r9)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
        L5e:
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m14629(java.util.ArrayList<Yue.C3618.C3620> r10, android.text.Spannable r11) {
            int r0 = r11.length()
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            r2 = 0
            java.lang.Object[] r0 = r11.getSpans(r2, r0, r1)
            android.text.style.URLSpan[] r0 = (android.text.style.URLSpan[]) r0
            int r1 = r0.length
            r3 = r2
        Lf:
            if (r3 >= r1) goto L2c
            r4 = r0[r3]
            Yue.ۥ۠ۧۢ۟$ۥ۟ r5 = new Yue.ۥ۠ۧۢ۟$ۥ۟
            r5.<init>()
            r5.f11532 = r4
            int r6 = r11.getSpanStart(r4)
            r5.f11534 = r6
            int r4 = r11.getSpanEnd(r4)
            r5.f11535 = r4
            r10.add(r5)
            int r3 = r3 + 1
            goto Lf
        L2c:
            java.util.Comparator<Yue.ۥ۠ۧۢ۟$ۥ۟> r0 = Yue.C3618.f11531
            java.util.Collections.sort(r10, r0)
            int r0 = r10.size()
        L35:
            int r1 = r0 + (-1)
            if (r2 >= r1) goto L7d
            java.lang.Object r1 = r10.get(r2)
            Yue.ۥ۠ۧۢ۟$ۥ۟ r1 = (Yue.C3618.C3620) r1
            int r3 = r2 + 1
            java.lang.Object r4 = r10.get(r3)
            Yue.ۥ۠ۧۢ۟$ۥ۟ r4 = (Yue.C3618.C3620) r4
            int r5 = r1.f11534
            int r6 = r4.f11534
            if (r5 > r6) goto L7b
            int r1 = r1.f11535
            if (r1 <= r6) goto L7b
            int r4 = r4.f11535
            r7 = -1
            if (r4 > r1) goto L58
        L56:
            r1 = r3
            goto L66
        L58:
            int r8 = r1 - r5
            int r9 = r4 - r6
            if (r8 <= r9) goto L5f
            goto L56
        L5f:
            int r1 = r1 - r5
            int r4 = r4 - r6
            if (r1 >= r4) goto L65
            r1 = r2
            goto L66
        L65:
            r1 = r7
        L66:
            if (r1 == r7) goto L7b
            java.lang.Object r3 = r10.get(r1)
            Yue.ۥ۠ۧۢ۟$ۥ۟ r3 = (Yue.C3618.C3620) r3
            android.text.style.URLSpan r3 = r3.f11532
            if (r3 == 0) goto L75
            r11.removeSpan(r3)
        L75:
            r10.remove(r1)
            int r0 = r0 + (-1)
            goto L35
        L7b:
            r2 = r3
            goto L35
        L7d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m14630() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
