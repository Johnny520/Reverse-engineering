package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0499 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f1257 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f1258 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f1259 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f1260 = 3;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.widget.TextView f1261;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C6262 f1262;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C6262 f1263;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.C6262 f1264;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C6262 f1265;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Yue.C6262 f1266;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.C6262 f1267;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.C6262 f1268;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final Yue.C0513 f1269;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f1270;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int f1271;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public android.graphics.Typeface f1272;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean f1273;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ$ۥ, reason: contains not printable characters */
    public class C0500 extends Yue.C5362.AbstractC5368 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ int f1274;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ int f1275;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ java.lang.ref.WeakReference f1276;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0499 f1277;

        public C0500(Yue.C0499 r1, int r2, int r3, java.lang.ref.WeakReference r4) {
                r0 = this;
                r0.f1277 = r1
                r0.f1274 = r2
                r0.f1275 = r3
                r0.f1276 = r4
                r0.<init>()
                return
        }

        @Override // Yue.C5362.AbstractC5368
        public void onFontRetrievalFailed(int r1) {
                r0 = this;
                return
        }

        @Override // Yue.C5362.AbstractC5368
        public void onFontRetrieved(@Yue.InterfaceC4410 android.graphics.Typeface r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto L18
                int r0 = r2.f1274
                r1 = -1
                if (r0 == r1) goto L18
                int r1 = r2.f1275
                r1 = r1 & 2
                if (r1 == 0) goto L13
                r1 = 1
                goto L14
            L13:
                r1 = 0
            L14:
                android.graphics.Typeface r3 = Yue.C0499.C0505.m1810(r3, r0, r1)
            L18:
                Yue.ۥۣ۟ۡۧ r0 = r2.f1277
                java.lang.ref.WeakReference r1 = r2.f1276
                r0.m1787(r1, r3)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ$ۥ۟, reason: contains not printable characters */
    public class RunnableC0501 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ android.widget.TextView f1278;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.graphics.Typeface f1279;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ int f1280;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0499 f1281;

        public RunnableC0501(Yue.C0499 r1, android.widget.TextView r2, android.graphics.Typeface r3, int r4) {
                r0 = this;
                r0.f1281 = r1
                r0.f1278 = r2
                r0.f1279 = r3
                r0.f1280 = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.widget.TextView r0 = r3.f1278
                android.graphics.Typeface r1 = r3.f1279
                int r2 = r3.f1280
                r0.setTypeface(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C0502 {
        public C0502() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.util.Locale m1803(java.lang.String r0) {
                java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C0503 {
        public C0503() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.os.LocaleList m1804(java.lang.String r0) {
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m1805(android.widget.TextView r0, android.os.LocaleList r1) {
                r0.setTextLocales(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C0504 {
        public C0504() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m1806(android.widget.TextView r0) {
                int r0 = r0.getAutoSizeStepGranularity()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m1807(android.widget.TextView r0, int r1, int r2, int r3, int r4) {
                r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m1808(android.widget.TextView r0, int[] r1, int r2) {
                r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m1809(android.widget.TextView r0, java.lang.String r1) {
                boolean r0 = r0.setFontVariationSettings(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۧ$ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C0505 {
        public C0505() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.graphics.Typeface m1810(android.graphics.Typeface r0, int r1, boolean r2) {
                android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1, r2)
                return r0
        }
    }

    public C0499(@Yue.InterfaceC4410 android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1270 = r0
            r0 = -1
            r1.f1271 = r0
            r1.f1261 = r2
            Yue.ۥ۟ۡۤ۟ r0 = new Yue.ۥ۟ۡۤ۟
            r0.<init>(r2)
            r1.f1269 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C6262 m1774(android.content.Context r0, Yue.C0456 r1, int r2) {
            android.content.res.ColorStateList r0 = r1.m1672(r0, r2)
            if (r0 == 0) goto L11
            Yue.ۥۢۡۥۤ r1 = new Yue.ۥۢۡۥۤ
            r1.<init>()
            r2 = 1
            r1.f22319 = r2
            r1.f22316 = r0
            return r1
        L11:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m1775(android.graphics.drawable.Drawable r2, Yue.C6262 r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto Ld
            android.widget.TextView r0 = r1.f1261
            int[] r0 = r0.getDrawableState()
            Yue.C0456.m1669(r2, r3, r0)
        Ld:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m1776() {
            r5 = this;
            Yue.ۥۢۡۥۤ r0 = r5.f1262
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L12
            Yue.ۥۢۡۥۤ r0 = r5.f1263
            if (r0 != 0) goto L12
            Yue.ۥۢۡۥۤ r0 = r5.f1264
            if (r0 != 0) goto L12
            Yue.ۥۢۡۥۤ r0 = r5.f1265
            if (r0 == 0) goto L36
        L12:
            android.widget.TextView r0 = r5.f1261
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()
            r3 = r0[r2]
            Yue.ۥۢۡۥۤ r4 = r5.f1262
            r5.m1775(r3, r4)
            r3 = 1
            r3 = r0[r3]
            Yue.ۥۢۡۥۤ r4 = r5.f1263
            r5.m1775(r3, r4)
            r3 = r0[r1]
            Yue.ۥۢۡۥۤ r4 = r5.f1264
            r5.m1775(r3, r4)
            r3 = 3
            r0 = r0[r3]
            Yue.ۥۢۡۥۤ r3 = r5.f1265
            r5.m1775(r0, r3)
        L36:
            Yue.ۥۢۡۥۤ r0 = r5.f1266
            if (r0 != 0) goto L3e
            Yue.ۥۢۡۥۤ r0 = r5.f1267
            if (r0 == 0) goto L52
        L3e:
            android.widget.TextView r0 = r5.f1261
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r2 = r0[r2]
            Yue.ۥۢۡۥۤ r3 = r5.f1266
            r5.m1775(r2, r3)
            r0 = r0[r1]
            Yue.ۥۢۡۥۤ r1 = r5.f1267
            r5.m1775(r0, r1)
        L52:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m1777() {
            r1 = this;
            Yue.ۥ۟ۡۤ۟ r0 = r1.f1269
            r0.m1821()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m1778() {
            r1 = this;
            Yue.ۥ۟ۡۤ۟ r0 = r1.f1269
            int r0 = r0.m1826()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m1779() {
            r1 = this;
            Yue.ۥ۟ۡۤ۟ r0 = r1.f1269
            int r0 = r0.m1827()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m1780() {
            r1 = this;
            Yue.ۥ۟ۡۤ۟ r0 = r1.f1269
            int r0 = r0.m1828()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int[] m1781() {
            r1 = this;
            Yue.ۥ۟ۡۤ۟ r0 = r1.f1269
            int[] r0 = r0.m1829()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m1782() {
            r1 = this;
            Yue.ۥ۟ۡۤ۟ r0 = r1.f1269
            int r0 = r0.m1830()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public android.content.res.ColorStateList m1783() {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1268
            if (r0 == 0) goto L7
            android.content.res.ColorStateList r0 = r0.f22316
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode m1784() {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1268
            if (r0 == 0) goto L7
            android.graphics.PorterDuff$Mode r0 = r0.f22317
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m1785() {
            r1 = this;
            Yue.ۥ۟ۡۤ۟ r0 = r1.f1269
            boolean r0 = r0.m1832()
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m1786(@Yue.InterfaceC4544 android.util.AttributeSet r17, int r18) {
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r18
            android.widget.TextView r0 = r7.f1261
            android.content.Context r10 = r0.getContext()
            Yue.ۥۣ۟ۡۡ r11 = Yue.C0456.m1666()
            int[] r0 = Yue.C5058.C5071.f17654
            r12 = 0
            Yue.ۥۢۡۥۦ r13 = Yue.C6264.m23339(r10, r8, r0, r9, r12)
            android.widget.TextView r0 = r7.f1261
            android.content.Context r1 = r0.getContext()
            int[] r2 = Yue.C5058.C5071.f17654
            android.content.res.TypedArray r4 = r13.m23367()
            r6 = 0
            r3 = r17
            r5 = r18
            Yue.C6794.m26221(r0, r1, r2, r3, r4, r5, r6)
            int r0 = Yue.C5058.C5071.f17655
            r14 = -1
            int r0 = r13.m23360(r0, r14)
            int r1 = Yue.C5058.C5071.f17658
            boolean r1 = r13.m23368(r1)
            if (r1 == 0) goto L46
            int r1 = Yue.C5058.C5071.f17658
            int r1 = r13.m23360(r1, r12)
            Yue.ۥۢۡۥۤ r1 = m1774(r10, r11, r1)
            r7.f1262 = r1
        L46:
            int r1 = Yue.C5058.C5071.f17656
            boolean r1 = r13.m23368(r1)
            if (r1 == 0) goto L5a
            int r1 = Yue.C5058.C5071.f17656
            int r1 = r13.m23360(r1, r12)
            Yue.ۥۢۡۥۤ r1 = m1774(r10, r11, r1)
            r7.f1263 = r1
        L5a:
            int r1 = Yue.C5058.C5071.f17659
            boolean r1 = r13.m23368(r1)
            if (r1 == 0) goto L6e
            int r1 = Yue.C5058.C5071.f17659
            int r1 = r13.m23360(r1, r12)
            Yue.ۥۢۡۥۤ r1 = m1774(r10, r11, r1)
            r7.f1264 = r1
        L6e:
            int r1 = Yue.C5058.C5071.f17657
            boolean r1 = r13.m23368(r1)
            if (r1 == 0) goto L82
            int r1 = Yue.C5058.C5071.f17657
            int r1 = r13.m23360(r1, r12)
            Yue.ۥۢۡۥۤ r1 = m1774(r10, r11, r1)
            r7.f1265 = r1
        L82:
            int r1 = Yue.C5058.C5071.f17660
            boolean r1 = r13.m23368(r1)
            if (r1 == 0) goto L96
            int r1 = Yue.C5058.C5071.f17660
            int r1 = r13.m23360(r1, r12)
            Yue.ۥۢۡۥۤ r1 = m1774(r10, r11, r1)
            r7.f1266 = r1
        L96:
            int r1 = Yue.C5058.C5071.f17661
            boolean r1 = r13.m23368(r1)
            if (r1 == 0) goto Laa
            int r1 = Yue.C5058.C5071.f17661
            int r1 = r13.m23360(r1, r12)
            Yue.ۥۢۡۥۤ r1 = m1774(r10, r11, r1)
            r7.f1267 = r1
        Laa:
            r13.m23371()
            android.widget.TextView r1 = r7.f1261
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            r2 = 1
            r13 = 0
            if (r0 == r14) goto Lfa
            int[] r3 = Yue.C5058.C5071.f17953
            Yue.ۥۢۡۥۦ r0 = Yue.C6264.m23337(r10, r0, r3)
            if (r1 != 0) goto Ld1
            int r3 = Yue.C5058.C5071.f17968
            boolean r3 = r0.m23368(r3)
            if (r3 == 0) goto Ld1
            int r3 = Yue.C5058.C5071.f17968
            boolean r3 = r0.m23340(r3, r12)
            r4 = r2
            goto Ld3
        Ld1:
            r3 = r12
            r4 = r3
        Ld3:
            r7.m1802(r10, r0)
            int r5 = Yue.C5058.C5071.f17969
            boolean r5 = r0.m23368(r5)
            if (r5 == 0) goto Le5
            int r5 = Yue.C5058.C5071.f17969
            java.lang.String r5 = r0.m23362(r5)
            goto Le6
        Le5:
            r5 = r13
        Le6:
            int r6 = Yue.C5058.C5071.f17967
            boolean r6 = r0.m23368(r6)
            if (r6 == 0) goto Lf5
            int r6 = Yue.C5058.C5071.f17967
            java.lang.String r6 = r0.m23362(r6)
            goto Lf6
        Lf5:
            r6 = r13
        Lf6:
            r0.m23371()
            goto Lfe
        Lfa:
            r3 = r12
            r4 = r3
            r5 = r13
            r6 = r5
        Lfe:
            int[] r0 = Yue.C5058.C5071.f17953
            Yue.ۥۢۡۥۦ r0 = Yue.C6264.m23339(r10, r8, r0, r9, r12)
            if (r1 != 0) goto L115
            int r15 = Yue.C5058.C5071.f17968
            boolean r15 = r0.m23368(r15)
            if (r15 == 0) goto L115
            int r3 = Yue.C5058.C5071.f17968
            boolean r3 = r0.m23340(r3, r12)
            goto L116
        L115:
            r2 = r4
        L116:
            int r4 = android.os.Build.VERSION.SDK_INT
            int r15 = Yue.C5058.C5071.f17969
            boolean r15 = r0.m23368(r15)
            if (r15 == 0) goto L126
            int r5 = Yue.C5058.C5071.f17969
            java.lang.String r5 = r0.m23362(r5)
        L126:
            int r15 = Yue.C5058.C5071.f17967
            boolean r15 = r0.m23368(r15)
            if (r15 == 0) goto L134
            int r6 = Yue.C5058.C5071.f17967
            java.lang.String r6 = r0.m23362(r6)
        L134:
            r15 = 28
            if (r4 < r15) goto L14e
            int r4 = Yue.C5058.C5071.f17954
            boolean r4 = r0.m23368(r4)
            if (r4 == 0) goto L14e
            int r4 = Yue.C5058.C5071.f17954
            int r4 = r0.m23346(r4, r14)
            if (r4 != 0) goto L14e
            android.widget.TextView r4 = r7.f1261
            r15 = 0
            r4.setTextSize(r12, r15)
        L14e:
            r7.m1802(r10, r0)
            r0.m23371()
            if (r1 != 0) goto L15b
            if (r2 == 0) goto L15b
            r7.m1792(r3)
        L15b:
            android.graphics.Typeface r0 = r7.f1272
            if (r0 == 0) goto L170
            int r1 = r7.f1271
            if (r1 != r14) goto L16b
            android.widget.TextView r1 = r7.f1261
            int r2 = r7.f1270
            r1.setTypeface(r0, r2)
            goto L170
        L16b:
            android.widget.TextView r1 = r7.f1261
            r1.setTypeface(r0)
        L170:
            if (r6 == 0) goto L177
            android.widget.TextView r0 = r7.f1261
            Yue.C0499.C0504.m1809(r0, r6)
        L177:
            if (r5 == 0) goto L182
            android.widget.TextView r0 = r7.f1261
            android.os.LocaleList r1 = Yue.C0499.C0503.m1804(r5)
            Yue.C0499.C0503.m1805(r0, r1)
        L182:
            Yue.ۥ۟ۡۤ۟ r0 = r7.f1269
            r0.m1833(r8, r9)
            boolean r0 = Yue.C6928.f24176
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L1c6
            Yue.ۥ۟ۡۤ۟ r0 = r7.f1269
            int r0 = r0.m1830()
            if (r0 == 0) goto L1c6
            Yue.ۥ۟ۡۤ۟ r0 = r7.f1269
            int[] r0 = r0.m1829()
            int r1 = r0.length
            if (r1 <= 0) goto L1c6
            android.widget.TextView r1 = r7.f1261
            int r1 = Yue.C0499.C0504.m1806(r1)
            float r1 = (float) r1
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L1c1
            android.widget.TextView r0 = r7.f1261
            Yue.ۥ۟ۡۤ۟ r1 = r7.f1269
            int r1 = r1.m1827()
            Yue.ۥ۟ۡۤ۟ r2 = r7.f1269
            int r2 = r2.m1826()
            Yue.ۥ۟ۡۤ۟ r3 = r7.f1269
            int r3 = r3.m1828()
            Yue.C0499.C0504.m1807(r0, r1, r2, r3, r12)
            goto L1c6
        L1c1:
            android.widget.TextView r1 = r7.f1261
            Yue.C0499.C0504.m1808(r1, r0, r12)
        L1c6:
            int[] r0 = Yue.C5058.C5071.f17662
            Yue.ۥۢۡۥۦ r8 = Yue.C6264.m23338(r10, r8, r0)
            int r0 = Yue.C5058.C5071.f17671
            int r0 = r8.m23360(r0, r14)
            if (r0 == r14) goto L1da
            android.graphics.drawable.Drawable r0 = r11.m1670(r10, r0)
            r1 = r0
            goto L1db
        L1da:
            r1 = r13
        L1db:
            int r0 = Yue.C5058.C5071.f17676
            int r0 = r8.m23360(r0, r14)
            if (r0 == r14) goto L1e9
            android.graphics.drawable.Drawable r0 = r11.m1670(r10, r0)
            r2 = r0
            goto L1ea
        L1e9:
            r2 = r13
        L1ea:
            int r0 = Yue.C5058.C5071.f17672
            int r0 = r8.m23360(r0, r14)
            if (r0 == r14) goto L1f8
            android.graphics.drawable.Drawable r0 = r11.m1670(r10, r0)
            r3 = r0
            goto L1f9
        L1f8:
            r3 = r13
        L1f9:
            int r0 = Yue.C5058.C5071.f17669
            int r0 = r8.m23360(r0, r14)
            if (r0 == r14) goto L207
            android.graphics.drawable.Drawable r0 = r11.m1670(r10, r0)
            r4 = r0
            goto L208
        L207:
            r4 = r13
        L208:
            int r0 = Yue.C5058.C5071.f17673
            int r0 = r8.m23360(r0, r14)
            if (r0 == r14) goto L216
            android.graphics.drawable.Drawable r0 = r11.m1670(r10, r0)
            r5 = r0
            goto L217
        L216:
            r5 = r13
        L217:
            int r0 = Yue.C5058.C5071.f17670
            int r0 = r8.m23360(r0, r14)
            if (r0 == r14) goto L225
            android.graphics.drawable.Drawable r0 = r11.m1670(r10, r0)
            r6 = r0
            goto L226
        L225:
            r6 = r13
        L226:
            r0 = r16
            r0.m1798(r1, r2, r3, r4, r5, r6)
            int r0 = Yue.C5058.C5071.f17674
            boolean r0 = r8.m23368(r0)
            if (r0 == 0) goto L23e
            int r0 = Yue.C5058.C5071.f17674
            android.content.res.ColorStateList r0 = r8.m23343(r0)
            android.widget.TextView r1 = r7.f1261
            Yue.C6156.m23055(r1, r0)
        L23e:
            int r0 = Yue.C5058.C5071.f17675
            boolean r0 = r8.m23368(r0)
            if (r0 == 0) goto L255
            int r0 = Yue.C5058.C5071.f17675
            int r0 = r8.m23354(r0, r14)
            android.graphics.PorterDuff$Mode r0 = Yue.C2012.m9307(r0, r13)
            android.widget.TextView r1 = r7.f1261
            Yue.C6156.m23056(r1, r0)
        L255:
            int r0 = Yue.C5058.C5071.f17678
            int r0 = r8.m23346(r0, r14)
            int r1 = Yue.C5058.C5071.f17681
            int r1 = r8.m23346(r1, r14)
            int r2 = Yue.C5058.C5071.f17682
            boolean r2 = r8.m23368(r2)
            if (r2 == 0) goto L28c
            int r2 = Yue.C5058.C5071.f17682
            android.util.TypedValue r2 = r8.m23370(r2)
            if (r2 == 0) goto L283
            int r3 = r2.type
            r4 = 5
            if (r3 != r4) goto L283
            int r3 = r2.data
            int r3 = Yue.C6479.m23910(r3)
            int r2 = r2.data
            float r2 = android.util.TypedValue.complexToFloat(r2)
            goto L28e
        L283:
            int r2 = Yue.C5058.C5071.f17682
            int r2 = r8.m23346(r2, r14)
            float r2 = (float) r2
        L28a:
            r3 = r14
            goto L28e
        L28c:
            r2 = r9
            goto L28a
        L28e:
            r8.m23371()
            if (r0 == r14) goto L298
            android.widget.TextView r4 = r7.f1261
            Yue.C6156.m23061(r4, r0)
        L298:
            if (r1 == r14) goto L29f
            android.widget.TextView r0 = r7.f1261
            Yue.C6156.m23062(r0, r1)
        L29f:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L2b1
            if (r3 != r14) goto L2ac
            android.widget.TextView r0 = r7.f1261
            int r1 = (int) r2
            Yue.C6156.m23063(r0, r1)
            goto L2b1
        L2ac:
            android.widget.TextView r0 = r7.f1261
            Yue.C6156.m23064(r0, r3, r2)
        L2b1:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m1787(java.lang.ref.WeakReference<android.widget.TextView> r3, android.graphics.Typeface r4) {
            r2 = this;
            boolean r0 = r2.f1273
            if (r0 == 0) goto L24
            r2.f1272 = r4
            java.lang.Object r3 = r3.get()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L24
            boolean r0 = r3.isAttachedToWindow()
            if (r0 == 0) goto L1f
            int r0 = r2.f1270
            Yue.ۥۣ۟ۡۧ$ۥ۟ r1 = new Yue.ۥۣ۟ۡۧ$ۥ۟
            r1.<init>(r2, r3, r4, r0)
            r3.post(r1)
            goto L24
        L1f:
            int r0 = r2.f1270
            r3.setTypeface(r4, r0)
        L24:
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m1788(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            boolean r1 = Yue.C6928.f24176
            if (r1 != 0) goto L7
            r0.m1777()
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m1789() {
            r0 = this;
            r0.m1776()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m1790(android.content.Context r4, int r5) {
            r3 = this;
            int[] r0 = Yue.C5058.C5071.f17953
            Yue.ۥۢۡۥۦ r5 = Yue.C6264.m23337(r4, r5, r0)
            int r0 = Yue.C5058.C5071.f17968
            boolean r0 = r5.m23368(r0)
            r1 = 0
            if (r0 == 0) goto L18
            int r0 = Yue.C5058.C5071.f17968
            boolean r0 = r5.m23340(r0, r1)
            r3.m1792(r0)
        L18:
            int r0 = Yue.C5058.C5071.f17954
            boolean r0 = r5.m23368(r0)
            if (r0 == 0) goto L2f
            int r0 = Yue.C5058.C5071.f17954
            r2 = -1
            int r0 = r5.m23346(r0, r2)
            if (r0 != 0) goto L2f
            android.widget.TextView r0 = r3.f1261
            r2 = 0
            r0.setTextSize(r1, r2)
        L2f:
            r3.m1802(r4, r5)
            int r4 = Yue.C5058.C5071.f17967
            boolean r4 = r5.m23368(r4)
            if (r4 == 0) goto L47
            int r4 = Yue.C5058.C5071.f17967
            java.lang.String r4 = r5.m23362(r4)
            if (r4 == 0) goto L47
            android.widget.TextView r0 = r3.f1261
            Yue.C0499.C0504.m1809(r0, r4)
        L47:
            r5.m23371()
            android.graphics.Typeface r4 = r3.f1272
            if (r4 == 0) goto L55
            android.widget.TextView r5 = r3.f1261
            int r0 = r3.f1270
            r5.setTypeface(r4, r0)
        L55:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m1791(@Yue.InterfaceC4410 android.widget.TextView r3, @Yue.InterfaceC4544 android.view.inputmethod.InputConnection r4, @Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto Lf
            if (r4 == 0) goto Lf
            java.lang.CharSequence r3 = r3.getText()
            Yue.C2095.m9768(r5, r3)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m1792(boolean r2) {
            r1 = this;
            android.widget.TextView r0 = r1.f1261
            r0.setAllCaps(r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m1793(int r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r1 = this;
            Yue.ۥ۟ۡۤ۟ r0 = r1.f1269
            r0.m1834(r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m1794(@Yue.InterfaceC4410 int[] r2, int r3) throws java.lang.IllegalArgumentException {
            r1 = this;
            Yue.ۥ۟ۡۤ۟ r0 = r1.f1269
            r0.m1835(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m1795(int r2) {
            r1 = this;
            Yue.ۥ۟ۡۤ۟ r0 = r1.f1269
            r0.m1836(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m1796(@Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1268
            if (r0 != 0) goto Lb
            Yue.ۥۢۡۥۤ r0 = new Yue.ۥۢۡۥۤ
            r0.<init>()
            r1.f1268 = r0
        Lb:
            Yue.ۥۢۡۥۤ r0 = r1.f1268
            r0.f22316 = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.f22319 = r2
            r1.m1799()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m1797(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1268
            if (r0 != 0) goto Lb
            Yue.ۥۢۡۥۤ r0 = new Yue.ۥۢۡۥۤ
            r0.<init>()
            r1.f1268 = r0
        Lb:
            Yue.ۥۢۡۥۤ r0 = r1.f1268
            r0.f22317 = r2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            r0.f22318 = r2
            r1.m1799()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m1798(android.graphics.drawable.Drawable r6, android.graphics.drawable.Drawable r7, android.graphics.drawable.Drawable r8, android.graphics.drawable.Drawable r9, android.graphics.drawable.Drawable r10, android.graphics.drawable.Drawable r11) {
            r5 = this;
            r0 = 3
            r1 = 1
            r2 = 0
            r3 = 2
            if (r10 != 0) goto L52
            if (r11 == 0) goto L9
            goto L52
        L9:
            if (r6 != 0) goto L11
            if (r7 != 0) goto L11
            if (r8 != 0) goto L11
            if (r9 == 0) goto L71
        L11:
            android.widget.TextView r10 = r5.f1261
            android.graphics.drawable.Drawable[] r10 = r10.getCompoundDrawablesRelative()
            r11 = r10[r2]
            if (r11 != 0) goto L40
            r4 = r10[r3]
            if (r4 == 0) goto L20
            goto L40
        L20:
            android.widget.TextView r10 = r5.f1261
            android.graphics.drawable.Drawable[] r10 = r10.getCompoundDrawables()
            android.widget.TextView r11 = r5.f1261
            if (r6 == 0) goto L2b
            goto L2d
        L2b:
            r6 = r10[r2]
        L2d:
            if (r7 == 0) goto L30
            goto L32
        L30:
            r7 = r10[r1]
        L32:
            if (r8 == 0) goto L35
            goto L37
        L35:
            r8 = r10[r3]
        L37:
            if (r9 == 0) goto L3a
            goto L3c
        L3a:
            r9 = r10[r0]
        L3c:
            r11.setCompoundDrawablesWithIntrinsicBounds(r6, r7, r8, r9)
            goto L71
        L40:
            if (r7 == 0) goto L43
            goto L45
        L43:
            r7 = r10[r1]
        L45:
            if (r9 == 0) goto L48
            goto L4a
        L48:
            r9 = r10[r0]
        L4a:
            android.widget.TextView r6 = r5.f1261
            r8 = r10[r3]
            r6.setCompoundDrawablesRelativeWithIntrinsicBounds(r11, r7, r8, r9)
            return
        L52:
            android.widget.TextView r6 = r5.f1261
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            if (r10 == 0) goto L5b
            goto L5d
        L5b:
            r10 = r6[r2]
        L5d:
            if (r7 == 0) goto L60
            goto L62
        L60:
            r7 = r6[r1]
        L62:
            if (r11 == 0) goto L65
            goto L67
        L65:
            r11 = r6[r3]
        L67:
            android.widget.TextView r8 = r5.f1261
            if (r9 == 0) goto L6c
            goto L6e
        L6c:
            r9 = r6[r0]
        L6e:
            r8.setCompoundDrawablesRelativeWithIntrinsicBounds(r10, r7, r11, r9)
        L71:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m1799() {
            r1 = this;
            Yue.ۥۢۡۥۤ r0 = r1.f1268
            r1.f1262 = r0
            r1.f1263 = r0
            r1.f1264 = r0
            r1.f1265 = r0
            r1.f1266 = r0
            r1.f1267 = r0
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void m1800(int r2, float r3) {
            r1 = this;
            boolean r0 = Yue.C6928.f24176
            if (r0 != 0) goto Ld
            boolean r0 = r1.m1785()
            if (r0 != 0) goto Ld
            r1.m1801(r2, r3)
        Ld:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m1801(int r2, float r3) {
            r1 = this;
            Yue.ۥ۟ۡۤ۟ r0 = r1.f1269
            r0.m1838(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m1802(android.content.Context r11, Yue.C6264 r12) {
            r10 = this;
            int r0 = Yue.C5058.C5071.f17956
            int r1 = r10.f1270
            int r0 = r12.m23354(r0, r1)
            r10.f1270 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 2
            r2 = -1
            r3 = 28
            if (r0 < r3) goto L21
            int r4 = Yue.C5058.C5071.f17965
            int r4 = r12.m23354(r4, r2)
            r10.f1271 = r4
            if (r4 == r2) goto L21
            int r4 = r10.f1270
            r4 = r4 & r1
            r10.f1270 = r4
        L21:
            int r4 = Yue.C5058.C5071.f17964
            boolean r4 = r12.m23368(r4)
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L5b
            int r4 = Yue.C5058.C5071.f17966
            boolean r4 = r12.m23368(r4)
            if (r4 == 0) goto L34
            goto L5b
        L34:
            int r11 = Yue.C5058.C5071.f17955
            boolean r11 = r12.m23368(r11)
            if (r11 == 0) goto L5a
            r10.f1273 = r6
            int r11 = Yue.C5058.C5071.f17955
            int r11 = r12.m23354(r11, r5)
            if (r11 == r5) goto L56
            if (r11 == r1) goto L51
            r12 = 3
            if (r11 == r12) goto L4c
            goto L5a
        L4c:
            android.graphics.Typeface r11 = android.graphics.Typeface.MONOSPACE
            r10.f1272 = r11
            goto L5a
        L51:
            android.graphics.Typeface r11 = android.graphics.Typeface.SERIF
            r10.f1272 = r11
            goto L5a
        L56:
            android.graphics.Typeface r11 = android.graphics.Typeface.SANS_SERIF
            r10.f1272 = r11
        L5a:
            return
        L5b:
            r4 = 0
            r10.f1272 = r4
            int r4 = Yue.C5058.C5071.f17966
            boolean r4 = r12.m23368(r4)
            if (r4 == 0) goto L69
            int r4 = Yue.C5058.C5071.f17966
            goto L6b
        L69:
            int r4 = Yue.C5058.C5071.f17964
        L6b:
            int r7 = r10.f1271
            int r8 = r10.f1270
            boolean r11 = r11.isRestricted()
            if (r11 != 0) goto Laf
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            android.widget.TextView r9 = r10.f1261
            r11.<init>(r9)
            Yue.ۥۣ۟ۡۧ$ۥ r9 = new Yue.ۥۣ۟ۡۧ$ۥ
            r9.<init>(r10, r7, r8, r11)
            int r11 = r10.f1270     // Catch: java.lang.Throwable -> Laf
            android.graphics.Typeface r11 = r12.m23350(r4, r11, r9)     // Catch: java.lang.Throwable -> Laf
            if (r11 == 0) goto La6
            if (r0 < r3) goto La4
            int r0 = r10.f1271     // Catch: java.lang.Throwable -> Laf
            if (r0 == r2) goto La4
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r6)     // Catch: java.lang.Throwable -> Laf
            int r0 = r10.f1271     // Catch: java.lang.Throwable -> Laf
            int r7 = r10.f1270     // Catch: java.lang.Throwable -> Laf
            r7 = r7 & r1
            if (r7 == 0) goto L9c
            r7 = r5
            goto L9d
        L9c:
            r7 = r6
        L9d:
            android.graphics.Typeface r11 = Yue.C0499.C0505.m1810(r11, r0, r7)     // Catch: java.lang.Throwable -> Laf
            r10.f1272 = r11     // Catch: java.lang.Throwable -> Laf
            goto La6
        La4:
            r10.f1272 = r11     // Catch: java.lang.Throwable -> Laf
        La6:
            android.graphics.Typeface r11 = r10.f1272     // Catch: java.lang.Throwable -> Laf
            if (r11 != 0) goto Lac
            r11 = r5
            goto Lad
        Lac:
            r11 = r6
        Lad:
            r10.f1273 = r11     // Catch: java.lang.Throwable -> Laf
        Laf:
            android.graphics.Typeface r11 = r10.f1272
            if (r11 != 0) goto Ldd
            java.lang.String r11 = r12.m23362(r4)
            if (r11 == 0) goto Ldd
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r3) goto Ld5
            int r12 = r10.f1271
            if (r12 == r2) goto Ld5
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r6)
            int r12 = r10.f1271
            int r0 = r10.f1270
            r0 = r0 & r1
            if (r0 == 0) goto Lcd
            goto Lce
        Lcd:
            r5 = r6
        Lce:
            android.graphics.Typeface r11 = Yue.C0499.C0505.m1810(r11, r12, r5)
            r10.f1272 = r11
            goto Ldd
        Ld5:
            int r12 = r10.f1270
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r12)
            r10.f1272 = r11
        Ldd:
            return
    }
}
