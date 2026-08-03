package androidx.emoji2.text;

/* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC0412
@Yue.InterfaceC5336(19)
public final class C7542 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f29071 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f29072 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f29073 = 3;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f29074 = 16;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.emoji2.text.C7527.InterfaceC7541 f29075;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.emoji2.text.C7555 f29076;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public androidx.emoji2.text.C7527.InterfaceC7534 f29077;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean f29078;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final int[] f29079;

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(19)
    public static final class C7543 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final int f29080 = -1;

        public C7543() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m29003(java.lang.CharSequence r5, int r6, int r7) {
                int r0 = r5.length()
                r1 = -1
                if (r6 < 0) goto L3c
                if (r0 >= r6) goto La
                goto L3c
            La:
                if (r7 >= 0) goto Ld
                return r1
            Ld:
                r0 = 0
            Le:
                r2 = r0
            Lf:
                if (r7 != 0) goto L12
                return r6
            L12:
                int r6 = r6 + (-1)
                if (r6 >= 0) goto L1a
                if (r2 == 0) goto L19
                return r1
            L19:
                return r0
            L1a:
                char r3 = r5.charAt(r6)
                if (r2 == 0) goto L2a
                boolean r2 = java.lang.Character.isHighSurrogate(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                int r7 = r7 + (-1)
                goto Le
            L2a:
                boolean r4 = java.lang.Character.isSurrogate(r3)
                if (r4 != 0) goto L33
                int r7 = r7 + (-1)
                goto Lf
            L33:
                boolean r2 = java.lang.Character.isHighSurrogate(r3)
                if (r2 == 0) goto L3a
                return r1
            L3a:
                r2 = 1
                goto Lf
            L3c:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static int m29004(java.lang.CharSequence r6, int r7, int r8) {
                int r0 = r6.length()
                r1 = -1
                if (r7 < 0) goto L40
                if (r0 >= r7) goto La
                goto L40
            La:
                if (r8 >= 0) goto Ld
                return r1
            Ld:
                r2 = 0
            Le:
                r3 = r2
            Lf:
                if (r8 != 0) goto L12
                return r7
            L12:
                if (r7 < r0) goto L18
                if (r3 == 0) goto L17
                return r1
            L17:
                return r0
            L18:
                char r4 = r6.charAt(r7)
                if (r3 == 0) goto L2a
                boolean r3 = java.lang.Character.isLowSurrogate(r4)
                if (r3 != 0) goto L25
                return r1
            L25:
                int r8 = r8 + (-1)
                int r7 = r7 + 1
                goto Le
            L2a:
                boolean r5 = java.lang.Character.isSurrogate(r4)
                if (r5 != 0) goto L35
                int r8 = r8 + (-1)
                int r7 = r7 + 1
                goto Lf
            L35:
                boolean r3 = java.lang.Character.isLowSurrogate(r4)
                if (r3 == 0) goto L3c
                return r1
            L3c:
                int r7 = r7 + 1
                r3 = 1
                goto Lf
            L40:
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟$ۥ۟, reason: contains not printable characters */
    public static class C7544 implements androidx.emoji2.text.C7542.InterfaceC7545<Yue.C6595> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public Yue.C6595 f29081;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final androidx.emoji2.text.C7527.InterfaceC7541 f29082;

        public C7544(@Yue.InterfaceC4544 Yue.C6595 r1, androidx.emoji2.text.C7527.InterfaceC7541 r2) {
                r0 = this;
                r0.<init>()
                r0.f29081 = r1
                r0.f29082 = r2
                return
        }

        @Override // androidx.emoji2.text.C7542.InterfaceC7545
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean mo29005(@Yue.InterfaceC4410 java.lang.CharSequence r4, int r5, int r6, Yue.C6495 r7) {
                r3 = this;
                boolean r0 = r7.m23995()
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                Yue.ۥۣۢ۠ۦ r0 = r3.f29081
                if (r0 != 0) goto L20
                Yue.ۥۣۢ۠ۦ r0 = new Yue.ۥۣۢ۠ۦ
                boolean r2 = r4 instanceof android.text.Spannable
                if (r2 == 0) goto L15
                android.text.Spannable r4 = (android.text.Spannable) r4
                goto L1b
            L15:
                android.text.SpannableString r2 = new android.text.SpannableString
                r2.<init>(r4)
                r4 = r2
            L1b:
                r0.<init>(r4)
                r3.f29081 = r0
            L20:
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۧ r4 = r3.f29082
                Yue.ۥ۠۠ۧ۠ r4 = r4.mo28989(r7)
                Yue.ۥۣۢ۠ۦ r7 = r3.f29081
                r0 = 33
                r7.setSpan(r4, r5, r6, r0)
                return r1
        }

        @Override // androidx.emoji2.text.C7542.InterfaceC7545
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public /* bridge */ /* synthetic */ Yue.C6595 mo29006() {
                r1 = this;
                Yue.ۥۣۢ۠ۦ r0 = r1.m29007()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C6595 m29007() {
                r1 = this;
                Yue.ۥۣۢ۠ۦ r0 = r1.f29081
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC7545<T> {
        /* JADX INFO: renamed from: ۥ */
        boolean mo29005(@Yue.InterfaceC4410 java.lang.CharSequence r1, int r2, int r3, Yue.C6495 r4);

        /* JADX INFO: renamed from: ۥ۟ */
        T mo29006();
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class C7546 implements androidx.emoji2.text.C7542.InterfaceC7545<androidx.emoji2.text.C7542.C7546> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int f29083;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f29084;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29085;

        public C7546(int r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.f29084 = r0
                r1.f29085 = r0
                r1.f29083 = r2
                return
        }

        @Override // androidx.emoji2.text.C7542.InterfaceC7545
        /* JADX INFO: renamed from: ۥ */
        public boolean mo29005(@Yue.InterfaceC4410 java.lang.CharSequence r1, int r2, int r3, Yue.C6495 r4) {
                r0 = this;
                int r1 = r0.f29083
                r4 = 0
                if (r2 > r1) goto Lc
                if (r1 >= r3) goto Lc
                r0.f29084 = r2
                r0.f29085 = r3
                return r4
            Lc:
                if (r3 > r1) goto Lf
                r4 = 1
            Lf:
                return r4
        }

        @Override // androidx.emoji2.text.C7542.InterfaceC7545
        /* JADX INFO: renamed from: ۥ۟ */
        public /* bridge */ /* synthetic */ androidx.emoji2.text.C7542.C7546 mo29006() {
                r1 = this;
                androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟ r0 = r1.m29008()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public androidx.emoji2.text.C7542.C7546 m29008() {
                r0 = this;
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C7547 implements androidx.emoji2.text.C7542.InterfaceC7545<androidx.emoji2.text.C7542.C7547> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f29086;

        public C7547(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.f29086 = r1
                return
        }

        @Override // androidx.emoji2.text.C7542.InterfaceC7545
        /* JADX INFO: renamed from: ۥ */
        public boolean mo29005(@Yue.InterfaceC4410 java.lang.CharSequence r1, int r2, int r3, Yue.C6495 r4) {
                r0 = this;
                java.lang.CharSequence r1 = r1.subSequence(r2, r3)
                java.lang.String r2 = r0.f29086
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                r2 = 1
                if (r1 == 0) goto L12
                r4.m23997(r2)
                r1 = 0
                return r1
            L12:
                return r2
        }

        @Override // androidx.emoji2.text.C7542.InterfaceC7545
        /* JADX INFO: renamed from: ۥ۟ */
        public /* bridge */ /* synthetic */ androidx.emoji2.text.C7542.C7547 mo29006() {
                r1 = this;
                androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟۟ r0 = r1.m29009()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public androidx.emoji2.text.C7542.C7547 m29009() {
                r0 = this;
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C7548 {

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f29087 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f29088 = 2;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f29089;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final androidx.emoji2.text.C7555.C7556 f29090;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public androidx.emoji2.text.C7555.C7556 f29091;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public androidx.emoji2.text.C7555.C7556 f29092;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29093;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29094;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean f29095;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final int[] f29096;

        public C7548(androidx.emoji2.text.C7555.C7556 r2, boolean r3, int[] r4) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f29089 = r0
                r1.f29090 = r2
                r1.f29091 = r2
                r1.f29095 = r3
                r1.f29096 = r4
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m29010(int r1) {
                r0 = 65039(0xfe0f, float:9.1139E-41)
                if (r1 != r0) goto L7
                r1 = 1
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean m29011(int r1) {
                r0 = 65038(0xfe0e, float:9.1138E-41)
                if (r1 != r0) goto L7
                r1 = 1
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int m29012(int r5) {
                r4 = this;
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = r4.f29091
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = r0.m29044(r5)
                int r1 = r4.f29089
                r2 = 1
                r3 = 2
                if (r1 == r3) goto L1a
                if (r0 != 0) goto L13
                int r3 = r4.m29016()
                goto L62
            L13:
                r4.f29089 = r3
                r4.f29091 = r0
                r4.f29094 = r2
                goto L62
            L1a:
                if (r0 == 0) goto L24
                r4.f29091 = r0
                int r0 = r4.f29094
                int r0 = r0 + r2
                r4.f29094 = r0
                goto L62
            L24:
                boolean r0 = m29011(r5)
                if (r0 == 0) goto L2f
                int r3 = r4.m29016()
                goto L62
            L2f:
                boolean r0 = m29010(r5)
                if (r0 == 0) goto L36
                goto L62
            L36:
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = r4.f29091
                Yue.ۥۢۢۤۥ r0 = r0.m29045()
                if (r0 == 0) goto L5e
                int r0 = r4.f29094
                r3 = 3
                if (r0 != r2) goto L56
                boolean r0 = r4.m29017()
                if (r0 == 0) goto L51
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = r4.f29091
                r4.f29092 = r0
                r4.m29016()
                goto L62
            L51:
                int r3 = r4.m29016()
                goto L62
            L56:
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = r4.f29091
                r4.f29092 = r0
                r4.m29016()
                goto L62
            L5e:
                int r3 = r4.m29016()
            L62:
                r4.f29093 = r5
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C6495 m29013() {
                r1 = this;
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = r1.f29091
                Yue.ۥۢۢۤۥ r0 = r0.m29045()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C6495 m29014() {
                r1 = this;
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = r1.f29092
                Yue.ۥۢۢۤۥ r0 = r0.m29045()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean m29015() {
                r2 = this;
                int r0 = r2.f29089
                r1 = 2
                if (r0 != r1) goto L19
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = r2.f29091
                Yue.ۥۢۢۤۥ r0 = r0.m29045()
                if (r0 == 0) goto L19
                int r0 = r2.f29094
                r1 = 1
                if (r0 > r1) goto L1a
                boolean r0 = r2.m29017()
                if (r0 == 0) goto L19
                goto L1a
            L19:
                r1 = 0
            L1a:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final int m29016() {
                r2 = this;
                r0 = 1
                r2.f29089 = r0
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r1 = r2.f29090
                r2.f29091 = r1
                r1 = 0
                r2.f29094 = r1
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final boolean m29017() {
                r4 = this;
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = r4.f29091
                Yue.ۥۢۢۤۥ r0 = r0.m29045()
                boolean r0 = r0.m23994()
                r1 = 1
                if (r0 == 0) goto Le
                return r1
            Le:
                int r0 = r4.f29093
                boolean r0 = m29010(r0)
                if (r0 == 0) goto L17
                return r1
            L17:
                boolean r0 = r4.f29095
                r2 = 0
                if (r0 == 0) goto L34
                int[] r0 = r4.f29096
                if (r0 != 0) goto L21
                return r1
            L21:
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = r4.f29091
                Yue.ۥۢۢۤۥ r0 = r0.m29045()
                int r0 = r0.m23984(r2)
                int[] r3 = r4.f29096
                int r0 = java.util.Arrays.binarySearch(r3, r0)
                if (r0 >= 0) goto L34
                return r1
            L34:
                return r2
        }
    }

    public C7542(@Yue.InterfaceC4410 androidx.emoji2.text.C7555 r1, @Yue.InterfaceC4410 androidx.emoji2.text.C7527.InterfaceC7541 r2, @Yue.InterfaceC4410 androidx.emoji2.text.C7527.InterfaceC7534 r3, boolean r4, @Yue.InterfaceC4544 int[] r5, @Yue.InterfaceC4410 java.util.Set<int[]> r6) {
            r0 = this;
            r0.<init>()
            r0.f29075 = r2
            r0.f29076 = r1
            r0.f29077 = r3
            r0.f29078 = r4
            r0.f29079 = r5
            r0.m29000(r6)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m28990(@Yue.InterfaceC4410 android.text.Editable r6, @Yue.InterfaceC4410 android.view.KeyEvent r7, boolean r8) {
            boolean r7 = m28994(r7)
            r0 = 0
            if (r7 == 0) goto L8
            return r0
        L8:
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            boolean r2 = m28993(r7, r1)
            if (r2 == 0) goto L17
            return r0
        L17:
            java.lang.Class<Yue.ۥ۠۠ۧ۠> r2 = Yue.AbstractC2131.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            Yue.ۥ۠۠ۧ۠[] r1 = (Yue.AbstractC2131[]) r1
            if (r1 == 0) goto L46
            int r2 = r1.length
            if (r2 <= 0) goto L46
            int r2 = r1.length
            r3 = r0
        L26:
            if (r3 >= r2) goto L46
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L36
            if (r5 == r7) goto L3e
        L36:
            if (r8 != 0) goto L3a
            if (r4 == r7) goto L3e
        L3a:
            if (r7 <= r5) goto L43
            if (r7 >= r4) goto L43
        L3e:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L43:
            int r3 = r3 + 1
            goto L26
        L46:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m28991(@Yue.InterfaceC4410 android.view.inputmethod.InputConnection r5, @Yue.InterfaceC4410 android.text.Editable r6, @Yue.InterfaceC3281(from = 0) int r7, @Yue.InterfaceC3281(from = 0) int r8, boolean r9) {
            r0 = 0
            if (r6 == 0) goto L7f
            if (r5 != 0) goto L7
            goto L7f
        L7:
            if (r7 < 0) goto L7f
            if (r8 >= 0) goto Ld
            goto L7f
        Ld:
            int r1 = android.text.Selection.getSelectionStart(r6)
            int r2 = android.text.Selection.getSelectionEnd(r6)
            boolean r3 = m28993(r1, r2)
            if (r3 == 0) goto L1c
            return r0
        L1c:
            if (r9 == 0) goto L34
            int r7 = java.lang.Math.max(r7, r0)
            int r7 = androidx.emoji2.text.C7542.C7543.m29003(r6, r1, r7)
            int r8 = java.lang.Math.max(r8, r0)
            int r8 = androidx.emoji2.text.C7542.C7543.m29004(r6, r2, r8)
            r9 = -1
            if (r7 == r9) goto L33
            if (r8 != r9) goto L42
        L33:
            return r0
        L34:
            int r1 = r1 - r7
            int r7 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r8
            int r8 = r6.length()
            int r8 = java.lang.Math.min(r2, r8)
        L42:
            java.lang.Class<Yue.ۥ۠۠ۧ۠> r9 = Yue.AbstractC2131.class
            java.lang.Object[] r9 = r6.getSpans(r7, r8, r9)
            Yue.ۥ۠۠ۧ۠[] r9 = (Yue.AbstractC2131[]) r9
            if (r9 == 0) goto L7f
            int r1 = r9.length
            if (r1 <= 0) goto L7f
            int r1 = r9.length
            r2 = r0
        L51:
            if (r2 >= r1) goto L68
            r3 = r9[r2]
            int r4 = r6.getSpanStart(r3)
            int r3 = r6.getSpanEnd(r3)
            int r7 = java.lang.Math.min(r4, r7)
            int r8 = java.lang.Math.max(r3, r8)
            int r2 = r2 + 1
            goto L51
        L68:
            int r7 = java.lang.Math.max(r7, r0)
            int r9 = r6.length()
            int r8 = java.lang.Math.min(r8, r9)
            r5.beginBatchEdit()
            r6.delete(r7, r8)
            r5.endBatchEdit()
            r5 = 1
            return r5
        L7f:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m28992(@Yue.InterfaceC4410 android.text.Editable r3, int r4, @Yue.InterfaceC4410 android.view.KeyEvent r5) {
            r0 = 67
            r1 = 1
            r2 = 0
            if (r4 == r0) goto L11
            r0 = 112(0x70, float:1.57E-43)
            if (r4 == r0) goto Lc
            r4 = r2
            goto L15
        Lc:
            boolean r4 = m28990(r3, r5, r1)
            goto L15
        L11:
            boolean r4 = m28990(r3, r5, r2)
        L15:
            if (r4 == 0) goto L1b
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r3)
            return r1
        L1b:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m28993(int r1, int r2) {
            r0 = -1
            if (r1 == r0) goto La
            if (r2 == r0) goto La
            if (r1 == r2) goto L8
            goto La
        L8:
            r1 = 0
            goto Lb
        La:
            r1 = 1
        Lb:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m28994(@Yue.InterfaceC4410 android.view.KeyEvent r0) {
            int r0 = r0.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int m28995(@Yue.InterfaceC4410 java.lang.CharSequence r10, @Yue.InterfaceC3281(from = 0) int r11) {
            r9 = this;
            if (r11 < 0) goto L49
            int r0 = r10.length()
            if (r11 < r0) goto L9
            goto L49
        L9:
            boolean r0 = r10 instanceof android.text.Spanned
            r1 = 0
            if (r0 == 0) goto L25
            r0 = r10
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r2 = r11 + 1
            java.lang.Class<Yue.ۥ۠۠ۧ۠> r3 = Yue.AbstractC2131.class
            java.lang.Object[] r2 = r0.getSpans(r11, r2, r3)
            Yue.ۥ۠۠ۧ۠[] r2 = (Yue.AbstractC2131[]) r2
            int r3 = r2.length
            if (r3 <= 0) goto L25
            r10 = r2[r1]
            int r10 = r0.getSpanEnd(r10)
            return r10
        L25:
            int r0 = r11 + (-16)
            int r4 = java.lang.Math.max(r1, r0)
            int r0 = r10.length()
            int r1 = r11 + 16
            int r5 = java.lang.Math.min(r0, r1)
            androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟ r8 = new androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟
            r8.<init>(r11)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 1
            r2 = r9
            r3 = r10
            java.lang.Object r10 = r2.m29002(r3, r4, r5, r6, r7, r8)
            androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟ r10 = (androidx.emoji2.text.C7542.C7546) r10
            int r10 = r10.f29085
            return r10
        L49:
            r10 = -1
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m28996(@Yue.InterfaceC4410 java.lang.CharSequence r2) {
            r1 = this;
            androidx.emoji2.text.ۥ۟۟۟۠ r0 = r1.f29076
            int r0 = r0.m29040()
            int r2 = r1.m28997(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m28997(@Yue.InterfaceC4410 java.lang.CharSequence r12, int r13) {
            r11 = this;
            androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟۠ r0 = new androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟۠
            androidx.emoji2.text.ۥ۟۟۟۠ r1 = r11.f29076
            androidx.emoji2.text.ۥ۟۟۟۠$ۥ r1 = r1.m29041()
            boolean r2 = r11.f29078
            int[] r3 = r11.f29079
            r0.<init>(r1, r2, r3)
            int r1 = r12.length()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        L17:
            r6 = 2
            r7 = 1
            if (r3 >= r1) goto L53
            int r8 = java.lang.Character.codePointAt(r12, r3)
            int r9 = r0.m29012(r8)
            Yue.ۥۢۢۤۥ r10 = r0.m29013()
            if (r9 == r7) goto L42
            if (r9 == r6) goto L3c
            r6 = 3
            if (r9 == r6) goto L2f
            goto L48
        L2f:
            Yue.ۥۢۢۤۥ r10 = r0.m29014()
            short r6 = r10.m23986()
            if (r6 > r13) goto L48
            int r4 = r4 + 1
            goto L48
        L3c:
            int r6 = java.lang.Character.charCount(r8)
            int r3 = r3 + r6
            goto L48
        L42:
            int r5 = java.lang.Character.charCount(r8)
            int r3 = r3 + r5
            r5 = r2
        L48:
            if (r10 == 0) goto L17
            short r6 = r10.m23986()
            if (r6 > r13) goto L17
            int r5 = r5 + 1
            goto L17
        L53:
            if (r4 == 0) goto L56
            return r6
        L56:
            boolean r12 = r0.m29015()
            if (r12 == 0) goto L67
            Yue.ۥۢۢۤۥ r12 = r0.m29013()
            short r12 = r12.m23986()
            if (r12 > r13) goto L67
            return r7
        L67:
            if (r5 != 0) goto L6a
            return r2
        L6a:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m28998(@Yue.InterfaceC4410 java.lang.CharSequence r10, @Yue.InterfaceC3281(from = 0) int r11) {
            r9 = this;
            if (r11 < 0) goto L49
            int r0 = r10.length()
            if (r11 < r0) goto L9
            goto L49
        L9:
            boolean r0 = r10 instanceof android.text.Spanned
            r1 = 0
            if (r0 == 0) goto L25
            r0 = r10
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r2 = r11 + 1
            java.lang.Class<Yue.ۥ۠۠ۧ۠> r3 = Yue.AbstractC2131.class
            java.lang.Object[] r2 = r0.getSpans(r11, r2, r3)
            Yue.ۥ۠۠ۧ۠[] r2 = (Yue.AbstractC2131[]) r2
            int r3 = r2.length
            if (r3 <= 0) goto L25
            r10 = r2[r1]
            int r10 = r0.getSpanStart(r10)
            return r10
        L25:
            int r0 = r11 + (-16)
            int r4 = java.lang.Math.max(r1, r0)
            int r0 = r10.length()
            int r1 = r11 + 16
            int r5 = java.lang.Math.min(r0, r1)
            androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟ r8 = new androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟
            r8.<init>(r11)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 1
            r2 = r9
            r3 = r10
            java.lang.Object r10 = r2.m29002(r3, r4, r5, r6, r7, r8)
            androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟ r10 = (androidx.emoji2.text.C7542.C7546) r10
            int r10 = r10.f29084
            return r10
        L49:
            r10 = -1
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m28999(java.lang.CharSequence r3, int r4, int r5, Yue.C6495 r6) {
            r2 = this;
            int r0 = r6.m23987()
            if (r0 != 0) goto L13
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟۠ r0 = r2.f29077
            short r1 = r6.m23991()
            boolean r3 = r0.mo28934(r3, r4, r5, r1)
            r6.m23998(r3)
        L13:
            int r3 = r6.m23987()
            r4 = 2
            if (r3 != r4) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m29000(@Yue.InterfaceC4410 java.util.Set<int[]> r9) {
            r8 = this;
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.Iterator r9 = r9.iterator()
        Lb:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r9.next()
            int[] r0 = (int[]) r0
            java.lang.String r2 = new java.lang.String
            int r1 = r0.length
            r3 = 0
            r2.<init>(r0, r3, r1)
            androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟۟ r7 = new androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟۟
            r7.<init>(r2)
            int r4 = r2.length()
            r5 = 1
            r6 = 1
            r1 = r8
            r1.m29002(r2, r3, r4, r5, r6, r7)
            goto Lb
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.lang.CharSequence m29001(@Yue.InterfaceC4410 java.lang.CharSequence r11, @Yue.InterfaceC3281(from = 0) int r12, @Yue.InterfaceC3281(from = 0) int r13, @Yue.InterfaceC3281(from = 0) int r14, boolean r15) {
            r10 = this;
            boolean r0 = r11 instanceof Yue.C5841
            if (r0 == 0) goto La
            r1 = r11
            Yue.ۥۣۢ۟ۨ r1 = (Yue.C5841) r1
            r1.m21705()
        La:
            java.lang.Class<Yue.ۥ۠۠ۧ۠> r1 = Yue.AbstractC2131.class
            if (r0 != 0) goto L2f
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L13
            goto L2f
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2d
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L2a
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch: java.lang.Throwable -> L2a
            if (r2 > r13) goto L2d
            Yue.ۥۣۢ۠ۦ r2 = new Yue.ۥۣۢ۠ۦ     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L2a
            goto L37
        L2a:
            r12 = move-exception
            goto Lb2
        L2d:
            r2 = 0
            goto L37
        L2f:
            Yue.ۥۣۢ۠ۦ r2 = new Yue.ۥۣۢ۠ۦ     // Catch: java.lang.Throwable -> L2a
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a
        L37:
            r3 = 0
            if (r2 == 0) goto L63
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch: java.lang.Throwable -> L2a
            Yue.ۥ۠۠ۧ۠[] r4 = (Yue.AbstractC2131[]) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L63
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            if (r5 <= 0) goto L63
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            r6 = r3
        L47:
            if (r6 >= r5) goto L63
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L2a
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> L2a
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 == r13) goto L58
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> L2a
        L58:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L2a
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6 + 1
            goto L47
        L63:
            r4 = r13
            if (r12 == r4) goto La9
            int r13 = r11.length()     // Catch: java.lang.Throwable -> L2a
            if (r12 < r13) goto L6d
            goto La9
        L6d:
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r13) goto L80
            if (r2 == 0) goto L80
            int r13 = r2.length()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r13 = r2.getSpans(r3, r13, r1)     // Catch: java.lang.Throwable -> L2a
            Yue.ۥ۠۠ۧ۠[] r13 = (Yue.AbstractC2131[]) r13     // Catch: java.lang.Throwable -> L2a
            int r13 = r13.length     // Catch: java.lang.Throwable -> L2a
            int r14 = r14 - r13
        L80:
            r5 = r14
            androidx.emoji2.text.ۥ۟۟۟$ۥ۟ r7 = new androidx.emoji2.text.ۥ۟۟۟$ۥ۟     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۧ r13 = r10.f29075     // Catch: java.lang.Throwable -> L2a
            r7.<init>(r2, r13)     // Catch: java.lang.Throwable -> L2a
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r15
            java.lang.Object r12 = r1.m29002(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2a
            Yue.ۥۣۢ۠ۦ r12 = (Yue.C6595) r12     // Catch: java.lang.Throwable -> L2a
            if (r12 == 0) goto La0
            android.text.Spannable r12 = r12.m25387()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L9f
            Yue.ۥۣۢ۟ۨ r11 = (Yue.C5841) r11
            r11.m21707()
        L9f:
            return r12
        La0:
            if (r0 == 0) goto La8
            r12 = r11
            Yue.ۥۣۢ۟ۨ r12 = (Yue.C5841) r12
            r12.m21707()
        La8:
            return r11
        La9:
            if (r0 == 0) goto Lb1
            r12 = r11
            Yue.ۥۣۢ۟ۨ r12 = (Yue.C5841) r12
            r12.m21707()
        Lb1:
            return r11
        Lb2:
            if (r0 == 0) goto Lb9
            Yue.ۥۣۢ۟ۨ r11 = (Yue.C5841) r11
            r11.m21707()
        Lb9:
            throw r12
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final <T> T m29002(@Yue.InterfaceC4410 java.lang.CharSequence r9, @Yue.InterfaceC3281(from = 0) int r10, @Yue.InterfaceC3281(from = 0) int r11, @Yue.InterfaceC3281(from = 0) int r12, boolean r13, androidx.emoji2.text.C7542.InterfaceC7545<T> r14) {
            r8 = this;
            androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟۠ r0 = new androidx.emoji2.text.ۥ۟۟۟$ۥ۟۟۟۠
            androidx.emoji2.text.ۥ۟۟۟۠ r1 = r8.f29076
            androidx.emoji2.text.ۥ۟۟۟۠$ۥ r1 = r1.m29041()
            boolean r2 = r8.f29078
            int[] r3 = r8.f29079
            r0.<init>(r1, r2, r3)
            int r1 = java.lang.Character.codePointAt(r9, r10)
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r3
            r2 = r1
        L18:
            r1 = r10
        L19:
            if (r10 >= r11) goto L61
            if (r4 >= r12) goto L61
            if (r5 == 0) goto L61
            int r6 = r0.m29012(r2)
            if (r6 == r3) goto L4f
            r7 = 2
            if (r6 == r7) goto L43
            r7 = 3
            if (r6 == r7) goto L2c
            goto L19
        L2c:
            if (r13 != 0) goto L38
            Yue.ۥۢۢۤۥ r6 = r0.m29014()
            boolean r6 = r8.m28999(r9, r1, r10, r6)
            if (r6 != 0) goto L18
        L38:
            Yue.ۥۢۢۤۥ r5 = r0.m29014()
            boolean r5 = r14.mo29005(r9, r1, r10, r5)
            int r4 = r4 + 1
            goto L18
        L43:
            int r6 = java.lang.Character.charCount(r2)
            int r10 = r10 + r6
            if (r10 >= r11) goto L19
            int r2 = java.lang.Character.codePointAt(r9, r10)
            goto L19
        L4f:
            int r10 = java.lang.Character.codePointAt(r9, r1)
            int r10 = java.lang.Character.charCount(r10)
            int r1 = r1 + r10
            if (r1 >= r11) goto L5f
            int r10 = java.lang.Character.codePointAt(r9, r1)
            r2 = r10
        L5f:
            r10 = r1
            goto L19
        L61:
            boolean r11 = r0.m29015()
            if (r11 == 0) goto L7e
            if (r4 >= r12) goto L7e
            if (r5 == 0) goto L7e
            if (r13 != 0) goto L77
            Yue.ۥۢۢۤۥ r11 = r0.m29013()
            boolean r11 = r8.m28999(r9, r1, r10, r11)
            if (r11 != 0) goto L7e
        L77:
            Yue.ۥۢۢۤۥ r11 = r0.m29013()
            r14.mo29005(r9, r1, r10, r11)
        L7e:
            java.lang.Object r9 = r14.mo29006()
            return r9
    }
}
