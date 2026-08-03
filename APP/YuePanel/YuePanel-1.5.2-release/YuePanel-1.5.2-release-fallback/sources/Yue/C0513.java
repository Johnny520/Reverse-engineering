package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0513 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.String f1295 = "ACTVAutoSizeHelper";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final android.graphics.RectF f1296 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f1297 = 12;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f1298 = 112;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f1299 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    @android.annotation.SuppressLint({"BanConcurrentHashMap"})
    public static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> f1300 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final float f1301 = -1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f1302 = 1048576;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f1303;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean f1304;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f1305;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f1306;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f1307;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int[] f1308;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f1309;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public android.text.TextPaint f1310;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.widget.TextView f1311;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final android.content.Context f1312;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final Yue.C0513.C0517 f1313;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static final class C0514 {
        public C0514() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.text.StaticLayout m1845(@Yue.InterfaceC4410 java.lang.CharSequence r2, @Yue.InterfaceC4410 android.text.Layout.Alignment r3, int r4, int r5, @Yue.InterfaceC4410 android.widget.TextView r6, @Yue.InterfaceC4410 android.text.TextPaint r7, @Yue.InterfaceC4410 Yue.C0513.C0517 r8) {
                int r0 = r2.length()
                r1 = 0
                android.text.StaticLayout$Builder r2 = android.text.StaticLayout.Builder.obtain(r2, r1, r0, r7, r4)
                android.text.StaticLayout$Builder r3 = r2.setAlignment(r3)
                float r4 = r6.getLineSpacingExtra()
                float r7 = r6.getLineSpacingMultiplier()
                android.text.StaticLayout$Builder r3 = r3.setLineSpacing(r4, r7)
                boolean r4 = r6.getIncludeFontPadding()
                android.text.StaticLayout$Builder r3 = r3.setIncludePad(r4)
                int r4 = r6.getBreakStrategy()
                android.text.StaticLayout$Builder r3 = r3.setBreakStrategy(r4)
                int r4 = r6.getHyphenationFrequency()
                android.text.StaticLayout$Builder r3 = r3.setHyphenationFrequency(r4)
                r4 = -1
                if (r5 != r4) goto L37
                r5 = 2147483647(0x7fffffff, float:NaN)
            L37:
                r3.setMaxLines(r5)
                r8.mo1846(r2, r6)     // Catch: java.lang.ClassCastException -> L3e
                goto L45
            L3e:
                java.lang.String r3 = "ACTVAutoSizeHelper"
                java.lang.String r4 = "Failed to obtain TextDirectionHeuristic, auto size may be incorrect"
                android.util.Log.w(r3, r4)
            L45:
                android.text.StaticLayout r2 = r2.build()
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ۟$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C0515 extends Yue.C0513.C0517 {
        public C0515() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.C0513.C0517
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo1846(android.text.StaticLayout.Builder r3, android.widget.TextView r4) {
                r2 = this;
                java.lang.String r0 = "getTextDirectionHeuristic"
                android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                java.lang.Object r4 = Yue.C0513.m1820(r4, r0, r1)
                android.text.TextDirectionHeuristic r4 = (android.text.TextDirectionHeuristic) r4
                r3.setTextDirection(r4)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ۟$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C0516 extends Yue.C0513.C0515 {
        public C0516() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.C0513.C0515, Yue.C0513.C0517
        /* JADX INFO: renamed from: ۥ */
        public void mo1846(android.text.StaticLayout.Builder r1, android.widget.TextView r2) {
                r0 = this;
                android.text.TextDirectionHeuristic r2 = Yue.C0518.m1848(r2)
                r1.setTextDirection(r2)
                return
        }

        @Override // Yue.C0513.C0517
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean mo1847(android.widget.TextView r1) {
                r0 = this;
                boolean r1 = Yue.C0519.m1849(r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class C0517 {
        public C0517() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public void mo1846(android.text.StaticLayout.Builder r1, android.widget.TextView r2) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo1847(android.widget.TextView r3) {
                r2 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                java.lang.String r1 = "getHorizontallyScrolling"
                java.lang.Object r3 = Yue.C0513.m1820(r3, r1, r0)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                return r3
        }
    }

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            Yue.C0513.f1296 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            Yue.C0513.f1300 = r0
            return
    }

    public C0513(@Yue.InterfaceC4410 android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1303 = r0
            r2.f1304 = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f1305 = r1
            r2.f1306 = r1
            r2.f1307 = r1
            int[] r1 = new int[r0]
            r2.f1308 = r1
            r2.f1309 = r0
            r2.f1311 = r3
            android.content.Context r3 = r3.getContext()
            r2.f1312 = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 < r0) goto L2c
            Yue.ۥ۟ۡۤ۟$ۥ۟۟ r3 = new Yue.ۥ۟ۡۤ۟$ۥ۟۟
            r3.<init>()
            r2.f1313 = r3
            goto L33
        L2c:
            Yue.ۥ۟ۡۤ۟$ۥ۟ r3 = new Yue.ۥ۟ۡۤ۟$ۥ۟
            r3.<init>()
            r2.f1313 = r3
        L33:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static java.lang.reflect.Method m1819(@Yue.InterfaceC4410 java.lang.String r4) {
            r0 = 0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r1 = Yue.C0513.f1300     // Catch: java.lang.Exception -> L1d
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Exception -> L1d
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Exception -> L1d
            if (r1 != 0) goto L1f
            java.lang.Class<android.widget.TextView> r1 = android.widget.TextView.class
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r0)     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L1f
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L1d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r2 = Yue.C0513.f1300     // Catch: java.lang.Exception -> L1d
            r2.put(r4, r1)     // Catch: java.lang.Exception -> L1d
            goto L1f
        L1d:
            r1 = move-exception
            goto L20
        L1f:
            return r1
        L20:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to retrieve TextView#"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = "() method"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r2 = "ACTVAutoSizeHelper"
            android.util.Log.w(r2, r4, r1)
            return r0
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static <T> T m1820(@Yue.InterfaceC4410 java.lang.Object r3, @Yue.InterfaceC4410 java.lang.String r4, @Yue.InterfaceC4410 T r5) {
            java.lang.reflect.Method r0 = m1819(r4)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Lc
            r1 = 0
            java.lang.Object r5 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> La java.lang.Exception -> Lc
            goto L2a
        La:
            r3 = move-exception
            goto Le
        Lc:
            r3 = move-exception
            goto Lf
        Le:
            throw r3
        Lf:
            java.lang.String r0 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to invoke TextView#"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "() method"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.util.Log.w(r0, r4, r3)
        L2a:
            return r5
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m1821() {
            r3 = this;
            boolean r0 = r3.m1832()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r3.f1304
            if (r0 == 0) goto L7d
            android.widget.TextView r0 = r3.f1311
            int r0 = r0.getMeasuredHeight()
            if (r0 <= 0) goto L7c
            android.widget.TextView r0 = r3.f1311
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L1c
            goto L7c
        L1c:
            Yue.ۥ۟ۡۤ۟$ۥ۟۟۟ r0 = r3.f1313
            android.widget.TextView r1 = r3.f1311
            boolean r0 = r0.mo1847(r1)
            if (r0 == 0) goto L29
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L3d
        L29:
            android.widget.TextView r0 = r3.f1311
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r1 = r3.f1311
            int r1 = r1.getTotalPaddingLeft()
            int r0 = r0 - r1
            android.widget.TextView r1 = r3.f1311
            int r1 = r1.getTotalPaddingRight()
            int r0 = r0 - r1
        L3d:
            android.widget.TextView r1 = r3.f1311
            int r1 = r1.getHeight()
            android.widget.TextView r2 = r3.f1311
            int r2 = r2.getCompoundPaddingBottom()
            int r1 = r1 - r2
            android.widget.TextView r2 = r3.f1311
            int r2 = r2.getCompoundPaddingTop()
            int r1 = r1 - r2
            if (r0 <= 0) goto L7c
            if (r1 > 0) goto L56
            goto L7c
        L56:
            android.graphics.RectF r2 = Yue.C0513.f1296
            monitor-enter(r2)
            r2.setEmpty()     // Catch: java.lang.Throwable -> L76
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L76
            r2.right = r0     // Catch: java.lang.Throwable -> L76
            float r0 = (float) r1     // Catch: java.lang.Throwable -> L76
            r2.bottom = r0     // Catch: java.lang.Throwable -> L76
            int r0 = r3.m1825(r2)     // Catch: java.lang.Throwable -> L76
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L76
            android.widget.TextView r1 = r3.f1311     // Catch: java.lang.Throwable -> L76
            float r1 = r1.getTextSize()     // Catch: java.lang.Throwable -> L76
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L78
            r1 = 0
            r3.m1838(r1, r0)     // Catch: java.lang.Throwable -> L76
            goto L78
        L76:
            r0 = move-exception
            goto L7a
        L78:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            goto L7d
        L7a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            throw r0
        L7c:
            return
        L7d:
            r0 = 1
            r3.f1304 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int[] m1822(int[] r7) {
            r6 = this;
            int r0 = r7.length
            if (r0 != 0) goto L4
            return r7
        L4:
            java.util.Arrays.sort(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r0) goto L28
            r4 = r7[r3]
            if (r4 <= 0) goto L25
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            int r5 = java.util.Collections.binarySearch(r1, r5)
            if (r5 >= 0) goto L25
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L25:
            int r3 = r3 + 1
            goto Le
        L28:
            int r3 = r1.size()
            if (r0 != r3) goto L2f
            return r7
        L2f:
            int r7 = r1.size()
            int[] r0 = new int[r7]
        L35:
            if (r2 >= r7) goto L46
            java.lang.Object r3 = r1.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L35
        L46:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m1823() {
            r2 = this;
            r0 = 0
            r2.f1303 = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f1306 = r1
            r2.f1307 = r1
            r2.f1305 = r1
            int[] r1 = new int[r0]
            r2.f1308 = r1
            r2.f1304 = r0
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.text.StaticLayout m1824(@Yue.InterfaceC4410 java.lang.CharSequence r8, @Yue.InterfaceC4410 android.text.Layout.Alignment r9, int r10, int r11) {
            r7 = this;
            android.widget.TextView r4 = r7.f1311
            android.text.TextPaint r5 = r7.f1310
            Yue.ۥ۟ۡۤ۟$ۥ۟۟۟ r6 = r7.f1313
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            android.text.StaticLayout r8 = Yue.C0513.C0514.m1845(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m1825(android.graphics.RectF r6) {
            r5 = this;
            int[] r0 = r5.f1308
            int r0 = r0.length
            if (r0 == 0) goto L27
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L8:
            if (r1 > r0) goto L22
            int r2 = r1 + r0
            int r2 = r2 / 2
            int[] r3 = r5.f1308
            r3 = r3[r2]
            boolean r3 = r5.m1842(r3, r6)
            if (r3 == 0) goto L1e
            int r2 = r2 + 1
            r4 = r2
            r2 = r1
            r1 = r4
            goto L8
        L1e:
            int r2 = r2 + (-1)
            r0 = r2
            goto L8
        L22:
            int[] r6 = r5.f1308
            r6 = r6[r2]
            return r6
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "No available text sizes to choose from."
            r6.<init>(r0)
            throw r6
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m1826() {
            r1 = this;
            float r0 = r1.f1307
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m1827() {
            r1 = this;
            float r0 = r1.f1306
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m1828() {
            r1 = this;
            float r0 = r1.f1305
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int[] m1829() {
            r1 = this;
            int[] r0 = r1.f1308
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m1830() {
            r1 = this;
            int r0 = r1.f1303
            return r0
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m1831(int r3) {
            r2 = this;
            android.text.TextPaint r0 = r2.f1310
            if (r0 != 0) goto Lc
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r2.f1310 = r0
            goto Lf
        Lc:
            r0.reset()
        Lf:
            android.text.TextPaint r0 = r2.f1310
            android.widget.TextView r1 = r2.f1311
            android.text.TextPaint r1 = r1.getPaint()
            r0.set(r1)
            android.text.TextPaint r0 = r2.f1310
            float r3 = (float) r3
            r0.setTextSize(r3)
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m1832() {
            r1 = this;
            boolean r0 = r1.m1843()
            if (r0 == 0) goto Lc
            int r0 = r1.f1303
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m1833(@Yue.InterfaceC4544 android.util.AttributeSet r11, int r12) {
            r10 = this;
            android.content.Context r0 = r10.f1312
            int[] r1 = Yue.C5058.C5071.f17662
            r2 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r11, r1, r12, r2)
            android.widget.TextView r3 = r10.f1311
            android.content.Context r4 = r3.getContext()
            int[] r5 = Yue.C5058.C5071.f17662
            r9 = 0
            r6 = r11
            r7 = r0
            r8 = r12
            Yue.C6794.m26221(r3, r4, r5, r6, r7, r8, r9)
            int r11 = Yue.C5058.C5071.f17668
            boolean r11 = r0.hasValue(r11)
            if (r11 == 0) goto L28
            int r11 = Yue.C5058.C5071.f17668
            int r11 = r0.getInt(r11, r2)
            r10.f1303 = r11
        L28:
            int r11 = Yue.C5058.C5071.f17667
            boolean r11 = r0.hasValue(r11)
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r11 == 0) goto L39
            int r11 = Yue.C5058.C5071.f17667
            float r11 = r0.getDimension(r11, r12)
            goto L3a
        L39:
            r11 = r12
        L3a:
            int r1 = Yue.C5058.C5071.f17665
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L49
            int r1 = Yue.C5058.C5071.f17665
            float r1 = r0.getDimension(r1, r12)
            goto L4a
        L49:
            r1 = r12
        L4a:
            int r3 = Yue.C5058.C5071.f17664
            boolean r3 = r0.hasValue(r3)
            if (r3 == 0) goto L59
            int r3 = Yue.C5058.C5071.f17664
            float r3 = r0.getDimension(r3, r12)
            goto L5a
        L59:
            r3 = r12
        L5a:
            int r4 = Yue.C5058.C5071.f17666
            boolean r4 = r0.hasValue(r4)
            if (r4 == 0) goto L78
            int r4 = Yue.C5058.C5071.f17666
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L78
            android.content.res.Resources r5 = r0.getResources()
            android.content.res.TypedArray r4 = r5.obtainTypedArray(r4)
            r10.m1840(r4)
            r4.recycle()
        L78:
            r0.recycle()
            boolean r0 = r10.m1843()
            if (r0 == 0) goto Lb6
            int r0 = r10.f1303
            r2 = 1
            if (r0 != r2) goto Lb8
            boolean r0 = r10.f1309
            if (r0 != 0) goto Lb2
            android.content.Context r0 = r10.f1312
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r2 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            r4 = 2
            if (r2 != 0) goto L9f
            r1 = 1094713344(0x41400000, float:12.0)
            float r1 = android.util.TypedValue.applyDimension(r4, r1, r0)
        L9f:
            int r2 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r2 != 0) goto La9
            r2 = 1121976320(0x42e00000, float:112.0)
            float r3 = android.util.TypedValue.applyDimension(r4, r2, r0)
        La9:
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 != 0) goto Laf
            r11 = 1065353216(0x3f800000, float:1.0)
        Laf:
            r10.m1844(r1, r3, r11)
        Lb2:
            r10.m1839()
            goto Lb8
        Lb6:
            r10.f1303 = r2
        Lb8:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m1834(int r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = r1.m1843()
            if (r0 == 0) goto L2b
            android.content.Context r0 = r1.f1312
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = (float) r2
            float r2 = android.util.TypedValue.applyDimension(r5, r2, r0)
            float r3 = (float) r3
            float r3 = android.util.TypedValue.applyDimension(r5, r3, r0)
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r5, r4, r0)
            r1.m1844(r2, r3, r4)
            boolean r2 = r1.m1839()
            if (r2 == 0) goto L2b
            r1.m1821()
        L2b:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m1835(@Yue.InterfaceC4410 int[] r6, int r7) throws java.lang.IllegalArgumentException {
            r5 = this;
            boolean r0 = r5.m1843()
            if (r0 == 0) goto L62
            int r0 = r6.length
            r1 = 0
            if (r0 <= 0) goto L57
            int[] r2 = new int[r0]
            if (r7 != 0) goto L13
            int[] r2 = java.util.Arrays.copyOf(r6, r0)
            goto L2f
        L13:
            android.content.Context r3 = r5.f1312
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
        L1d:
            if (r1 >= r0) goto L2f
            r4 = r6[r1]
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r7, r4, r3)
            int r4 = java.lang.Math.round(r4)
            r2[r1] = r4
            int r1 = r1 + 1
            goto L1d
        L2f:
            int[] r7 = r5.m1822(r2)
            r5.f1308 = r7
            boolean r7 = r5.m1841()
            if (r7 == 0) goto L3c
            goto L59
        L3c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "None of the preset sizes is valid: "
            r0.append(r1)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L57:
            r5.f1309 = r1
        L59:
            boolean r6 = r5.m1839()
            if (r6 == 0) goto L62
            r5.m1821()
        L62:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m1836(int r4) {
            r3 = this;
            boolean r0 = r3.m1843()
            if (r0 == 0) goto L4b
            if (r4 == 0) goto L48
            r0 = 1
            if (r4 != r0) goto L31
            android.content.Context r4 = r3.f1312
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r0 = 1094713344(0x41400000, float:12.0)
            r1 = 2
            float r0 = android.util.TypedValue.applyDimension(r1, r0, r4)
            r2 = 1121976320(0x42e00000, float:112.0)
            float r4 = android.util.TypedValue.applyDimension(r1, r2, r4)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.m1844(r0, r4, r1)
            boolean r4 = r3.m1839()
            if (r4 == 0) goto L4b
            r3.m1821()
            goto L4b
        L31:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown auto-size text type: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L48:
            r3.m1823()
        L4b:
            return
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m1837(float r4) {
            r3 = this;
            android.widget.TextView r0 = r3.f1311
            android.text.TextPaint r0 = r0.getPaint()
            float r0 = r0.getTextSize()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L51
            android.widget.TextView r0 = r3.f1311
            android.text.TextPaint r0 = r0.getPaint()
            r0.setTextSize(r4)
            android.widget.TextView r4 = r3.f1311
            boolean r4 = r4.isInLayout()
            android.widget.TextView r0 = r3.f1311
            android.text.Layout r0 = r0.getLayout()
            if (r0 == 0) goto L51
            r0 = 0
            r3.f1304 = r0
            java.lang.String r0 = "nullLayouts"
            java.lang.reflect.Method r0 = m1819(r0)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L3f
            android.widget.TextView r1 = r3.f1311     // Catch: java.lang.Exception -> L37
            r2 = 0
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L37
            goto L3f
        L37:
            r0 = move-exception
            java.lang.String r1 = "ACTVAutoSizeHelper"
            java.lang.String r2 = "Failed to invoke TextView#nullLayouts() method"
            android.util.Log.w(r1, r2, r0)
        L3f:
            if (r4 != 0) goto L47
            android.widget.TextView r4 = r3.f1311
            r4.requestLayout()
            goto L4c
        L47:
            android.widget.TextView r4 = r3.f1311
            r4.forceLayout()
        L4c:
            android.widget.TextView r4 = r3.f1311
            r4.invalidate()
        L51:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m1838(int r2, float r3) {
            r1 = this;
            android.content.Context r0 = r1.f1312
            if (r0 != 0) goto L9
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            goto Ld
        L9:
            android.content.res.Resources r0 = r0.getResources()
        Ld:
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r2, r3, r0)
            r1.m1837(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m1839() {
            r7 = this;
            boolean r0 = r7.m1843()
            r1 = 0
            if (r0 == 0) goto L41
            int r0 = r7.f1303
            r2 = 1
            if (r0 != r2) goto L41
            boolean r0 = r7.f1309
            if (r0 == 0) goto L15
            int[] r0 = r7.f1308
            int r0 = r0.length
            if (r0 != 0) goto L3e
        L15:
            float r0 = r7.f1307
            float r3 = r7.f1306
            float r0 = r0 - r3
            float r3 = r7.f1305
            float r0 = r0 / r3
            double r3 = (double) r0
            double r3 = java.lang.Math.floor(r3)
            int r0 = (int) r3
            int r0 = r0 + r2
            int[] r3 = new int[r0]
        L26:
            if (r1 >= r0) goto L38
            float r4 = r7.f1306
            float r5 = (float) r1
            float r6 = r7.f1305
            float r5 = r5 * r6
            float r4 = r4 + r5
            int r4 = java.lang.Math.round(r4)
            r3[r1] = r4
            int r1 = r1 + 1
            goto L26
        L38:
            int[] r0 = r7.m1822(r3)
            r7.f1308 = r0
        L3e:
            r7.f1304 = r2
            goto L43
        L41:
            r7.f1304 = r1
        L43:
            boolean r0 = r7.f1304
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m1840(android.content.res.TypedArray r5) {
            r4 = this;
            int r0 = r5.length()
            int[] r1 = new int[r0]
            if (r0 <= 0) goto L1e
            r2 = 0
        L9:
            if (r2 >= r0) goto L15
            r3 = -1
            int r3 = r5.getDimensionPixelSize(r2, r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L15:
            int[] r5 = r4.m1822(r1)
            r4.f1308 = r5
            r4.m1841()
        L1e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean m1841() {
            r5 = this;
            int[] r0 = r5.f1308
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L9
            r4 = r3
            goto La
        L9:
            r4 = r2
        La:
            r5.f1309 = r4
            if (r4 == 0) goto L1f
            r5.f1303 = r3
            r2 = r0[r2]
            float r2 = (float) r2
            r5.f1306 = r2
            int r1 = r1 - r3
            r0 = r0[r1]
            float r0 = (float) r0
            r5.f1307 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.f1305 = r0
        L1f:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean m1842(int r6, android.graphics.RectF r7) {
            r5 = this;
            android.widget.TextView r0 = r5.f1311
            java.lang.CharSequence r0 = r0.getText()
            android.widget.TextView r1 = r5.f1311
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            if (r1 == 0) goto L17
            android.widget.TextView r2 = r5.f1311
            java.lang.CharSequence r1 = r1.getTransformation(r0, r2)
            if (r1 == 0) goto L17
            r0 = r1
        L17:
            android.widget.TextView r1 = r5.f1311
            int r1 = r1.getMaxLines()
            r5.m1831(r6)
            android.widget.TextView r6 = r5.f1311
            java.lang.String r2 = "getLayoutAlignment"
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.Object r6 = m1820(r6, r2, r3)
            android.text.Layout$Alignment r6 = (android.text.Layout.Alignment) r6
            float r2 = r7.right
            int r2 = java.lang.Math.round(r2)
            android.text.StaticLayout r6 = r5.m1824(r0, r6, r2, r1)
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L51
            int r2 = r6.getLineCount()
            if (r2 > r1) goto L50
            int r1 = r6.getLineCount()
            int r1 = r1 - r4
            int r1 = r6.getLineEnd(r1)
            int r0 = r0.length()
            if (r1 == r0) goto L51
        L50:
            return r3
        L51:
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r7 = r7.bottom
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L5d
            return r3
        L5d:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean m1843() {
            r1 = this;
            android.widget.TextView r0 = r1.f1311
            boolean r0 = r0 instanceof Yue.C0459
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m1844(float r4, float r5, float r6) throws java.lang.IllegalArgumentException {
            r3 = this;
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            java.lang.String r2 = "px) is less or equal to (0px)"
            if (r1 <= 0) goto L5a
            int r1 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r1 <= 0) goto L36
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1c
            r0 = 1
            r3.f1303 = r0
            r3.f1306 = r4
            r3.f1307 = r5
            r3.f1305 = r6
            r4 = 0
            r3.f1309 = r4
            return
        L1c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "The auto-size step granularity ("
            r5.append(r0)
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Maximum auto-size text size ("
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "px) is less or equal to minimum auto-size text size ("
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = "px)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4)
            throw r6
        L5a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Minimum auto-size text size ("
            r6.append(r0)
            r6.append(r4)
            r6.append(r2)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }
}
