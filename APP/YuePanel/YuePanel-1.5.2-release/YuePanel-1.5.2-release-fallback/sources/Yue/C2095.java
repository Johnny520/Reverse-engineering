package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
public final class C2095 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f6621 = 16777216;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f6622 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String[] f6623 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f6624 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f6625 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f6626 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f6627 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f6628 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f6629 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC6959
    public static final int f6630 = 2048;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC6959
    public static final int f6631 = 1024;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۤۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(30)
    public static class C2096 {
        public C2096() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.CharSequence m9772(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r0, int r1) {
                java.lang.CharSequence r0 = r0.getInitialSelectedText(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.lang.CharSequence m9773(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r0, int r1, int r2) {
                java.lang.CharSequence r0 = r0.getInitialTextAfterCursor(r1, r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static java.lang.CharSequence m9774(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r0, int r1, int r2) {
                java.lang.CharSequence r0 = r0.getInitialTextBeforeCursor(r1, r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m9775(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r0, java.lang.CharSequence r1, int r2) {
                r0.setInitialSurroundingSubText(r1, r2)
                return
        }
    }

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            Yue.C2095.f6623 = r0
            return
    }

    @java.lang.Deprecated
    public C2095() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String[] m9758(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r0) {
            java.lang.String[] r0 = r0.contentMimeTypes
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.lang.String[] r0 = Yue.C2095.f6623
        L7:
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.CharSequence m9759(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.CharSequence r6 = Yue.C2095.C2096.m9772(r6, r7)
            return r6
        Lb:
            android.os.Bundle r0 = r6.extras
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            int r0 = r6.initialSelStart
            int r2 = r6.initialSelEnd
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r6.initialSelStart
            int r3 = r6.initialSelEnd
            int r2 = java.lang.Math.max(r2, r3)
            android.os.Bundle r3 = r6.extras
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"
            int r3 = r3.getInt(r4)
            android.os.Bundle r4 = r6.extras
            java.lang.String r5 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"
            int r4 = r4.getInt(r5)
            int r2 = r2 - r0
            int r0 = r6.initialSelStart
            if (r0 < 0) goto L58
            int r0 = r6.initialSelEnd
            if (r0 < 0) goto L58
            int r0 = r4 - r3
            if (r0 == r2) goto L3f
            goto L58
        L3f:
            android.os.Bundle r6 = r6.extras
            java.lang.String r0 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            java.lang.CharSequence r6 = r6.getCharSequence(r0)
            if (r6 != 0) goto L4a
            return r1
        L4a:
            r7 = r7 & 1
            if (r7 == 0) goto L53
            java.lang.CharSequence r6 = r6.subSequence(r3, r4)
            goto L57
        L53:
            java.lang.String r6 = android.text.TextUtils.substring(r6, r3, r4)
        L57:
            return r6
        L58:
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.CharSequence m9760(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r3, int r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.CharSequence r3 = Yue.C2095.C2096.m9773(r3, r4, r5)
            return r3
        Lb:
            android.os.Bundle r0 = r3.extras
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            java.lang.CharSequence r0 = r0.getCharSequence(r2)
            if (r0 != 0) goto L1a
            return r1
        L1a:
            android.os.Bundle r3 = r3.extras
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"
            int r3 = r3.getInt(r1)
            int r1 = r0.length()
            int r1 = r1 - r3
            int r4 = java.lang.Math.min(r4, r1)
            r5 = r5 & 1
            if (r5 == 0) goto L35
            int r4 = r4 + r3
            java.lang.CharSequence r3 = r0.subSequence(r3, r4)
            goto L3a
        L35:
            int r4 = r4 + r3
            java.lang.String r3 = android.text.TextUtils.substring(r0, r3, r4)
        L3a:
            return r3
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.CharSequence m9761(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r3, int r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.CharSequence r3 = Yue.C2095.C2096.m9774(r3, r4, r5)
            return r3
        Lb:
            android.os.Bundle r0 = r3.extras
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            java.lang.CharSequence r0 = r0.getCharSequence(r2)
            if (r0 != 0) goto L1a
            return r1
        L1a:
            android.os.Bundle r3 = r3.extras
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"
            int r3 = r3.getInt(r1)
            int r4 = java.lang.Math.min(r4, r3)
            r5 = r5 & 1
            if (r5 == 0) goto L31
            int r4 = r3 - r4
            java.lang.CharSequence r3 = r0.subSequence(r4, r3)
            goto L37
        L31:
            int r4 = r3 - r4
            java.lang.String r3 = android.text.TextUtils.substring(r0, r4, r3)
        L37:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m9762(android.view.inputmethod.EditorInfo r0) {
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m9763(java.lang.CharSequence r1, int r2, int r3) {
            if (r3 == 0) goto L10
            r0 = 1
            if (r3 == r0) goto L7
            r1 = 0
            return r1
        L7:
            char r1 = r1.charAt(r2)
            boolean r1 = java.lang.Character.isHighSurrogate(r1)
            return r1
        L10:
            char r1 = r1.charAt(r2)
            boolean r1 = java.lang.Character.isLowSurrogate(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m9764(int r1) {
            r1 = r1 & 4095(0xfff, float:5.738E-42)
            r0 = 129(0x81, float:1.81E-43)
            if (r1 == r0) goto L11
            r0 = 225(0xe1, float:3.15E-43)
            if (r1 == r0) goto L11
            r0 = 18
            if (r1 != r0) goto Lf
            goto L11
        Lf:
            r1 = 0
            goto L12
        L11:
            r1 = 1
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m9765(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r1) {
            android.os.Bundle r1 = r1.extras
            if (r1 != 0) goto L6
            r1 = 0
            return r1
        L6:
            java.lang.String r0 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"
            boolean r1 = r1.getBoolean(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m9766(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r0, @Yue.InterfaceC4544 java.lang.String[] r1) {
            r0.contentMimeTypes = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m9767(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r5, @Yue.InterfaceC4410 java.lang.CharSequence r6, int r7) {
            Yue.C4868.m19181(r6)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            Yue.C2095.C2096.m9775(r5, r6, r7)
            return
        Ld:
            int r0 = r5.initialSelStart
            int r1 = r5.initialSelEnd
            if (r0 <= r1) goto L16
            int r2 = r1 - r7
            goto L18
        L16:
            int r2 = r0 - r7
        L18:
            if (r0 <= r1) goto L1c
            int r0 = r0 - r7
            goto L1e
        L1c:
            int r0 = r1 - r7
        L1e:
            int r1 = r6.length()
            r3 = 0
            r4 = 0
            if (r7 < 0) goto L43
            if (r2 < 0) goto L43
            if (r0 <= r1) goto L2b
            goto L43
        L2b:
            int r7 = r5.inputType
            boolean r7 = m9764(r7)
            if (r7 == 0) goto L37
            m9770(r5, r3, r4, r4)
            return
        L37:
            r7 = 2048(0x800, float:2.87E-42)
            if (r1 > r7) goto L3f
            m9770(r5, r6, r2, r0)
            return
        L3f:
            m9771(r5, r6, r2, r0)
            return
        L43:
            m9770(r5, r3, r4, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m9768(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r3, @Yue.InterfaceC4410 java.lang.CharSequence r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto Lb
            Yue.C2095.C2096.m9775(r3, r4, r2)
            goto Le
        Lb:
            m9767(r3, r4, r2)
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m9769(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r1, boolean r2) {
            android.os.Bundle r0 = r1.extras
            if (r0 != 0) goto Lb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.extras = r0
        Lb:
            android.os.Bundle r1 = r1.extras
            java.lang.String r0 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"
            r1.putBoolean(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m9770(android.view.inputmethod.EditorInfo r2, java.lang.CharSequence r3, int r4, int r5) {
            android.os.Bundle r0 = r2.extras
            if (r0 != 0) goto Lb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.extras = r0
        Lb:
            if (r3 == 0) goto L13
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r3)
            goto L14
        L13:
            r0 = 0
        L14:
            android.os.Bundle r3 = r2.extras
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            r3.putCharSequence(r1, r0)
            android.os.Bundle r3 = r2.extras
            java.lang.String r0 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"
            r3.putInt(r0, r4)
            android.os.Bundle r2 = r2.extras
            java.lang.String r3 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"
            r2.putInt(r3, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m9771(android.view.inputmethod.EditorInfo r10, java.lang.CharSequence r11, int r12, int r13) {
            r0 = 1
            int r1 = r13 - r12
            r2 = 1024(0x400, float:1.435E-42)
            r3 = 0
            if (r1 <= r2) goto La
            r2 = r3
            goto Lb
        La:
            r2 = r1
        Lb:
            int r4 = r11.length()
            int r4 = r4 - r13
            int r5 = 2048 - r2
            r6 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r8 = (double) r5
            double r8 = r8 * r6
            int r6 = (int) r8
            int r6 = java.lang.Math.min(r12, r6)
            int r6 = r5 - r6
            int r4 = java.lang.Math.min(r4, r6)
            int r5 = r5 - r4
            int r5 = java.lang.Math.min(r12, r5)
            int r12 = r12 - r5
            boolean r6 = m9763(r11, r12, r3)
            if (r6 == 0) goto L32
            int r12 = r12 + r0
            int r5 = r5 - r0
        L32:
            int r6 = r13 + r4
            int r6 = r6 - r0
            boolean r6 = m9763(r11, r6, r0)
            if (r6 == 0) goto L3c
            int r4 = r4 - r0
        L3c:
            int r6 = r5 + r2
            int r6 = r6 + r4
            if (r2 == r1) goto L58
            int r1 = r12 + r5
            java.lang.CharSequence r12 = r11.subSequence(r12, r1)
            int r4 = r4 + r13
            java.lang.CharSequence r11 = r11.subSequence(r13, r4)
            r13 = 2
            java.lang.CharSequence[] r13 = new java.lang.CharSequence[r13]
            r13[r3] = r12
            r13[r0] = r11
            java.lang.CharSequence r11 = android.text.TextUtils.concat(r13)
            goto L5d
        L58:
            int r6 = r6 + r12
            java.lang.CharSequence r11 = r11.subSequence(r12, r6)
        L5d:
            int r2 = r2 + r5
            m9770(r10, r11, r5, r2)
            return
    }
}
