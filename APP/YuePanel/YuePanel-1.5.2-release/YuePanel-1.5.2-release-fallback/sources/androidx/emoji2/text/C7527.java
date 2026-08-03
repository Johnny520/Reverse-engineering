package androidx.emoji2.text;

/* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC0412
public class C7527 {

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f29020 = "android.support.text.emoji.emojiCompat_metadataVersion";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final java.lang.String f29021 = "android.support.text.emoji.emojiCompat_replaceAll";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f29022 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f29023 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f29024 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f29025 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f29026 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f29027 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f29028 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f29029 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f29030 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f29031 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f29032 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f29033 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static final int f29034 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final java.lang.Object f29035 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.Object f29036 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    @Yue.InterfaceC2947("INSTANCE_LOCK")
    @Yue.InterfaceC4544
    public static volatile androidx.emoji2.text.C7527 f29037 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    @Yue.InterfaceC2947("CONFIG_LOCK")
    public static volatile boolean f29038 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final java.lang.String f29039 = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.util.concurrent.locks.ReadWriteLock f29040;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    @Yue.InterfaceC2947("mInitLock")
    public final java.util.Set<androidx.emoji2.text.C7527.AbstractC7535> f29041;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC2947("mInitLock")
    public volatile int f29042;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.os.Handler f29043;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.emoji2.text.C7527.C7531 f29044;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.emoji2.text.C7527.InterfaceC7538 f29045;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.emoji2.text.C7527.InterfaceC7541 f29046;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean f29047;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean f29048;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final int[] f29049;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean f29050;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int f29051;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int f29052;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final androidx.emoji2.text.C7527.InterfaceC7534 f29053;

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC7528 {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(19)
    public static final class C7529 extends androidx.emoji2.text.C7527.C7531 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public volatile androidx.emoji2.text.C7542 f29054;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public volatile androidx.emoji2.text.C7555 f29055;

        /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟$ۥ, reason: contains not printable characters */
        public class C7530 extends androidx.emoji2.text.C7527.AbstractC7539 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ androidx.emoji2.text.C7527.C7529 f29056;

            public C7530(androidx.emoji2.text.C7527.C7529 r1) {
                    r0 = this;
                    r0.f29056 = r1
                    r0.<init>()
                    return
            }

            @Override // androidx.emoji2.text.C7527.AbstractC7539
            /* JADX INFO: renamed from: ۥ */
            public void mo28919(@Yue.InterfaceC4544 java.lang.Throwable r2) {
                    r1 = this;
                    androidx.emoji2.text.ۥ۟۟$ۥ۟ r0 = r1.f29056
                    androidx.emoji2.text.ۥ۟۟ r0 = r0.f29057
                    r0.m28959(r2)
                    return
            }

            @Override // androidx.emoji2.text.C7527.AbstractC7539
            /* JADX INFO: renamed from: ۥ۟ */
            public void mo28920(@Yue.InterfaceC4410 androidx.emoji2.text.C7555 r2) {
                    r1 = this;
                    androidx.emoji2.text.ۥ۟۟$ۥ۟ r0 = r1.f29056
                    r0.m28977(r2)
                    return
            }
        }

        public C7529(androidx.emoji2.text.C7527 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.emoji2.text.C7527.C7531
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.String mo28968() {
                r1 = this;
                androidx.emoji2.text.ۥ۟۟۟۠ r0 = r1.f29055
                Yue.ۥۡۡ۠ۦ r0 = r0.m29039()
                java.lang.String r0 = r0.m16412()
                if (r0 != 0) goto Le
                java.lang.String r0 = ""
            Le:
                return r0
        }

        @Override // androidx.emoji2.text.C7527.C7531
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int mo28969(@Yue.InterfaceC4410 java.lang.CharSequence r2, int r3) {
                r1 = this;
                androidx.emoji2.text.ۥ۟۟۟ r0 = r1.f29054
                int r2 = r0.m28995(r2, r3)
                return r2
        }

        @Override // androidx.emoji2.text.C7527.C7531
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int mo28970(java.lang.CharSequence r2, int r3) {
                r1 = this;
                androidx.emoji2.text.ۥ۟۟۟ r0 = r1.f29054
                int r2 = r0.m28997(r2, r3)
                return r2
        }

        @Override // androidx.emoji2.text.C7527.C7531
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int mo28971(@Yue.InterfaceC4410 java.lang.CharSequence r2, int r3) {
                r1 = this;
                androidx.emoji2.text.ۥ۟۟۟ r0 = r1.f29054
                int r2 = r0.m28998(r2, r3)
                return r2
        }

        @Override // androidx.emoji2.text.C7527.C7531
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean mo28972(@Yue.InterfaceC4410 java.lang.CharSequence r2) {
                r1 = this;
                androidx.emoji2.text.ۥ۟۟۟ r0 = r1.f29054
                int r2 = r0.m28996(r2)
                r0 = 1
                if (r2 != r0) goto La
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // androidx.emoji2.text.C7527.C7531
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean mo28973(@Yue.InterfaceC4410 java.lang.CharSequence r2, int r3) {
                r1 = this;
                androidx.emoji2.text.ۥ۟۟۟ r0 = r1.f29054
                int r2 = r0.m28997(r2, r3)
                r3 = 1
                if (r2 != r3) goto La
                goto Lb
            La:
                r3 = 0
            Lb:
                return r3
        }

        @Override // androidx.emoji2.text.C7527.C7531
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void mo28974() {
                r2 = this;
                androidx.emoji2.text.ۥ۟۟$ۥ۟$ۥ r0 = new androidx.emoji2.text.ۥ۟۟$ۥ۟$ۥ     // Catch: java.lang.Throwable -> Ld
                r0.<init>(r2)     // Catch: java.lang.Throwable -> Ld
                androidx.emoji2.text.ۥ۟۟ r1 = r2.f29057     // Catch: java.lang.Throwable -> Ld
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۤ r1 = r1.f29045     // Catch: java.lang.Throwable -> Ld
                r1.mo28916(r0)     // Catch: java.lang.Throwable -> Ld
                goto L13
            Ld:
                r0 = move-exception
                androidx.emoji2.text.ۥ۟۟ r1 = r2.f29057
                r1.m28959(r0)
            L13:
                return
        }

        @Override // androidx.emoji2.text.C7527.C7531
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public java.lang.CharSequence mo28975(@Yue.InterfaceC4410 java.lang.CharSequence r7, int r8, int r9, int r10, boolean r11) {
                r6 = this;
                androidx.emoji2.text.ۥ۟۟۟ r0 = r6.f29054
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                java.lang.CharSequence r7 = r0.m29001(r1, r2, r3, r4, r5)
                return r7
        }

        @Override // androidx.emoji2.text.C7527.C7531
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void mo28976(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r4) {
                r3 = this;
                android.os.Bundle r0 = r4.extras
                androidx.emoji2.text.ۥ۟۟۟۠ r1 = r3.f29055
                int r1 = r1.m29040()
                java.lang.String r2 = "android.support.text.emoji.emojiCompat_metadataVersion"
                r0.putInt(r2, r1)
                android.os.Bundle r4 = r4.extras
                androidx.emoji2.text.ۥ۟۟ r0 = r3.f29057
                boolean r0 = r0.f29047
                java.lang.String r1 = "android.support.text.emoji.emojiCompat_replaceAll"
                r4.putBoolean(r1, r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m28977(@Yue.InterfaceC4410 androidx.emoji2.text.C7555 r10) {
                r9 = this;
                if (r10 != 0) goto Lf
                androidx.emoji2.text.ۥ۟۟ r10 = r9.f29057
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "metadataRepo cannot be null"
                r0.<init>(r1)
                r10.m28959(r0)
                return
            Lf:
                r9.f29055 = r10
                androidx.emoji2.text.ۥ۟۟۟ r10 = new androidx.emoji2.text.ۥ۟۟۟
                androidx.emoji2.text.ۥ۟۟۟۠ r3 = r9.f29055
                androidx.emoji2.text.ۥ۟۟ r0 = r9.f29057
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۧ r4 = androidx.emoji2.text.C7527.m28935(r0)
                androidx.emoji2.text.ۥ۟۟ r0 = r9.f29057
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟۠ r5 = androidx.emoji2.text.C7527.m28936(r0)
                androidx.emoji2.text.ۥ۟۟ r0 = r9.f29057
                boolean r6 = r0.f29048
                int[] r7 = r0.f29049
                java.util.Set r8 = Yue.C2116.m10002()
                r2 = r10
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r9.f29054 = r10
                androidx.emoji2.text.ۥ۟۟ r10 = r9.f29057
                r10.m28960()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟, reason: contains not printable characters */
    public static class C7531 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final androidx.emoji2.text.C7527 f29057;

        public C7531(androidx.emoji2.text.C7527 r1) {
                r0 = this;
                r0.<init>()
                r0.f29057 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public java.lang.String mo28968() {
                r1 = this;
                java.lang.String r0 = ""
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int mo28969(@Yue.InterfaceC4410 java.lang.CharSequence r1, @Yue.InterfaceC3281(from = 0) int r2) {
                r0 = this;
                r1 = -1
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo28970(java.lang.CharSequence r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public int mo28971(@Yue.InterfaceC4410 java.lang.CharSequence r1, @Yue.InterfaceC3281(from = 0) int r2) {
                r0 = this;
                r1 = -1
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo28972(@Yue.InterfaceC4410 java.lang.CharSequence r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public boolean mo28973(@Yue.InterfaceC4410 java.lang.CharSequence r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo28974() {
                r1 = this;
                androidx.emoji2.text.ۥ۟۟ r0 = r1.f29057
                r0.m28960()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public java.lang.CharSequence mo28975(@Yue.InterfaceC4410 java.lang.CharSequence r1, @Yue.InterfaceC3281(from = 0) int r2, @Yue.InterfaceC3281(from = 0) int r3, @Yue.InterfaceC3281(from = 0) int r4, boolean r5) {
                r0 = this;
                return r1
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo28976(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC7532 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final androidx.emoji2.text.C7527.InterfaceC7538 f29058;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.emoji2.text.C7527.InterfaceC7541 f29059;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f29060;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29061;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public int[] f29062;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public java.util.Set<androidx.emoji2.text.C7527.AbstractC7535> f29063;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f29064;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f29065;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f29066;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public androidx.emoji2.text.C7527.InterfaceC7534 f29067;

        public AbstractC7532(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.InterfaceC7538 r2) {
                r1 = this;
                r1.<init>()
                r0 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
                r1.f29065 = r0
                r0 = 0
                r1.f29066 = r0
                androidx.emoji2.text.ۥ۟ r0 = new androidx.emoji2.text.ۥ۟
                r0.<init>()
                r1.f29067 = r0
                java.lang.String r0 = "metadataLoader cannot be null."
                Yue.C4868.m19182(r2, r0)
                r1.f29058 = r2
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final androidx.emoji2.text.C7527.InterfaceC7538 m28978() {
                r1 = this;
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۤ r0 = r1.f29058
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.emoji2.text.C7527.AbstractC7532 m28979(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.AbstractC7535 r2) {
                r1 = this;
                java.lang.String r0 = "initCallback cannot be null"
                Yue.C4868.m19182(r2, r0)
                java.util.Set<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r0 = r1.f29063
                if (r0 != 0) goto L10
                Yue.ۥ۟ۡۨۦ r0 = new Yue.ۥ۟ۡۨۦ
                r0.<init>()
                r1.f29063 = r0
            L10:
                java.util.Set<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r0 = r1.f29063
                r0.add(r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public androidx.emoji2.text.C7527.AbstractC7532 m28980(@Yue.InterfaceC1230 int r1) {
                r0 = this;
                r0.f29065 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public androidx.emoji2.text.C7527.AbstractC7532 m28981(boolean r1) {
                r0 = this;
                r0.f29064 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public androidx.emoji2.text.C7527.AbstractC7532 m28982(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.InterfaceC7534 r2) {
                r1 = this;
                java.lang.String r0 = "GlyphChecker cannot be null"
                Yue.C4868.m19182(r2, r0)
                r1.f29067 = r2
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public androidx.emoji2.text.C7527.AbstractC7532 m28983(int r1) {
                r0 = this;
                r0.f29066 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public androidx.emoji2.text.C7527.AbstractC7532 m28984(boolean r1) {
                r0 = this;
                r0.f29060 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public androidx.emoji2.text.C7527.AbstractC7532 m28985(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.InterfaceC7541 r1) {
                r0 = this;
                r0.f29059 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public androidx.emoji2.text.C7527.AbstractC7532 m28986(boolean r2) {
                r1 = this;
                r0 = 0
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ r2 = r1.m28987(r2, r0)
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public androidx.emoji2.text.C7527.AbstractC7532 m28987(boolean r4, @Yue.InterfaceC4544 java.util.List<java.lang.Integer> r5) {
                r3 = this;
                r3.f29061 = r4
                if (r4 == 0) goto L31
                if (r5 == 0) goto L31
                int r4 = r5.size()
                int[] r4 = new int[r4]
                r3.f29062 = r4
                java.util.Iterator r4 = r5.iterator()
                r5 = 0
            L13:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L2b
                java.lang.Object r0 = r4.next()
                java.lang.Integer r0 = (java.lang.Integer) r0
                int[] r1 = r3.f29062
                int r2 = r5 + 1
                int r0 = r0.intValue()
                r1[r5] = r0
                r5 = r2
                goto L13
            L2b:
                int[] r4 = r3.f29062
                java.util.Arrays.sort(r4)
                goto L34
            L31:
                r4 = 0
                r3.f29062 = r4
            L34:
                return r3
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public androidx.emoji2.text.C7527.AbstractC7532 m28988(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.AbstractC7535 r2) {
                r1 = this;
                java.lang.String r0 = "initCallback cannot be null"
                Yue.C4868.m19182(r2, r0)
                java.util.Set<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r0 = r1.f29063
                if (r0 == 0) goto Lc
                r0.remove(r2)
            Lc:
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static class C7533 implements androidx.emoji2.text.C7527.InterfaceC7541 {
        public C7533() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.emoji2.text.C7527.InterfaceC7541
        @Yue.InterfaceC4410
        @Yue.InterfaceC5336(19)
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.AbstractC2131 mo28989(@Yue.InterfaceC4410 Yue.C6495 r2) {
                r1 = this;
                Yue.ۥۢۢۤۦ r0 = new Yue.ۥۢۢۤۦ
                r0.<init>(r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public interface InterfaceC7534 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo28934(@Yue.InterfaceC4410 java.lang.CharSequence r1, @Yue.InterfaceC3281(from = 0) int r2, @Yue.InterfaceC3281(from = 0) int r3, @Yue.InterfaceC3281(from = 0) int r4);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static abstract class AbstractC7535 {
        public AbstractC7535() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public void mo22807(@Yue.InterfaceC4544 java.lang.Throwable r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void mo10010() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class RunnableC7536 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final java.util.List<androidx.emoji2.text.C7527.AbstractC7535> f29068;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final java.lang.Throwable f29069;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final int f29070;

        public RunnableC7536(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.AbstractC7535 r2, int r3) {
                r1 = this;
                java.lang.String r0 = "initCallback cannot be null"
                java.lang.Object r2 = Yue.C4868.m19182(r2, r0)
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ r2 = (androidx.emoji2.text.C7527.AbstractC7535) r2
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ[] r2 = new androidx.emoji2.text.C7527.AbstractC7535[]{r2}
                java.util.List r2 = java.util.Arrays.asList(r2)
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public RunnableC7536(@Yue.InterfaceC4410 java.util.Collection<androidx.emoji2.text.C7527.AbstractC7535> r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public RunnableC7536(@Yue.InterfaceC4410 java.util.Collection<androidx.emoji2.text.C7527.AbstractC7535> r2, int r3, @Yue.InterfaceC4544 java.lang.Throwable r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "initCallbacks cannot be null"
                Yue.C4868.m19182(r2, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r2)
                r1.f29068 = r0
                r1.f29070 = r3
                r1.f29069 = r4
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.util.List<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r0 = r4.f29068
                int r0 = r0.size()
                int r1 = r4.f29070
                r2 = 1
                r3 = 0
                if (r1 == r2) goto L1e
            Lc:
                if (r3 >= r0) goto L2e
                java.util.List<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r1 = r4.f29068
                java.lang.Object r1 = r1.get(r3)
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ r1 = (androidx.emoji2.text.C7527.AbstractC7535) r1
                java.lang.Throwable r2 = r4.f29069
                r1.mo22807(r2)
                int r3 = r3 + 1
                goto Lc
            L1e:
                if (r3 >= r0) goto L2e
                java.util.List<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r1 = r4.f29068
                java.lang.Object r1 = r1.get(r3)
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ r1 = (androidx.emoji2.text.C7527.AbstractC7535) r1
                r1.mo10010()
                int r3 = r3 + 1
                goto L1e
            L2e:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC7537 {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public interface InterfaceC7538 {
        /* JADX INFO: renamed from: ۥ */
        void mo28916(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.AbstractC7539 r1);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static abstract class AbstractC7539 {
        public AbstractC7539() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract void mo28919(@Yue.InterfaceC4544 java.lang.Throwable r1);

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract void mo28920(@Yue.InterfaceC4410 androidx.emoji2.text.C7555 r1);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۦ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC7540 {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public interface InterfaceC7541 {
        @Yue.InterfaceC4410
        @Yue.InterfaceC5336(19)
        /* JADX INFO: renamed from: ۥ */
        Yue.AbstractC2131 mo28989(@Yue.InterfaceC4410 Yue.C6495 r1);
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.emoji2.text.C7527.f29035 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.emoji2.text.C7527.f29036 = r0
            return
    }

    public C7527(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.AbstractC7532 r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r2.f29040 = r0
            r0 = 3
            r2.f29042 = r0
            boolean r0 = r3.f29060
            r2.f29047 = r0
            boolean r0 = r3.f29061
            r2.f29048 = r0
            int[] r0 = r3.f29062
            r2.f29049 = r0
            boolean r0 = r3.f29064
            r2.f29050 = r0
            int r0 = r3.f29065
            r2.f29051 = r0
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۤ r0 = r3.f29058
            r2.f29045 = r0
            int r0 = r3.f29066
            r2.f29052 = r0
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟۠ r0 = r3.f29067
            r2.f29053 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f29043 = r0
            Yue.ۥ۟ۡۨۦ r0 = new Yue.ۥ۟ۡۨۦ
            r0.<init>()
            r2.f29041 = r0
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۧ r1 = r3.f29059
            if (r1 == 0) goto L44
            goto L49
        L44:
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟۟ r1 = new androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟۟
            r1.<init>()
        L49:
            r2.f29046 = r1
            java.util.Set<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r1 = r3.f29063
            if (r1 == 0) goto L5a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L5a
            java.util.Set<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r3 = r3.f29063
            r0.addAll(r3)
        L5a:
            androidx.emoji2.text.ۥ۟۟$ۥ۟ r3 = new androidx.emoji2.text.ۥ۟۟$ۥ۟
            r3.<init>(r2)
            r2.f29044 = r3
            r2.m28958()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ androidx.emoji2.text.C7527.InterfaceC7541 m28935(androidx.emoji2.text.C7527 r0) {
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۧ r0 = r0.f29046
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ androidx.emoji2.text.C7527.InterfaceC7534 m28936(androidx.emoji2.text.C7527 r0) {
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟۠ r0 = r0.f29053
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static androidx.emoji2.text.C7527 m28937() {
            java.lang.Object r0 = androidx.emoji2.text.C7527.f29035
            monitor-enter(r0)
            androidx.emoji2.text.ۥ۟۟ r1 = androidx.emoji2.text.C7527.f29037     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r3 = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message."
            Yue.C4868.m19184(r2, r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m28938(@Yue.InterfaceC4410 android.view.inputmethod.InputConnection r0, @Yue.InterfaceC4410 android.text.Editable r1, @Yue.InterfaceC3281(from = 0) int r2, @Yue.InterfaceC3281(from = 0) int r3, boolean r4) {
            boolean r0 = androidx.emoji2.text.C7542.m28991(r0, r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m28939(@Yue.InterfaceC4410 android.text.Editable r0, int r1, @Yue.InterfaceC4410 android.view.KeyEvent r2) {
            boolean r0 = androidx.emoji2.text.C7542.m28992(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static androidx.emoji2.text.C7527 m28940(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = 0
            androidx.emoji2.text.ۥ۟۟ r1 = m28941(r1, r0)
            return r1
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static androidx.emoji2.text.C7527 m28941(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 androidx.emoji2.text.C7521.C7522 r2) {
            boolean r0 = androidx.emoji2.text.C7527.f29038
            if (r0 == 0) goto L7
            androidx.emoji2.text.ۥ۟۟ r1 = androidx.emoji2.text.C7527.f29037
            return r1
        L7:
            if (r2 == 0) goto La
            goto L10
        La:
            androidx.emoji2.text.ۥ$ۥ r2 = new androidx.emoji2.text.ۥ$ۥ
            r0 = 0
            r2.<init>(r0)
        L10:
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ r1 = r2.m28925(r1)
            java.lang.Object r2 = androidx.emoji2.text.C7527.f29036
            monitor-enter(r2)
            boolean r0 = androidx.emoji2.text.C7527.f29038     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L26
            if (r1 == 0) goto L23
            m28942(r1)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r1 = move-exception
            goto L2a
        L23:
            r1 = 1
            androidx.emoji2.text.C7527.f29038 = r1     // Catch: java.lang.Throwable -> L21
        L26:
            androidx.emoji2.text.ۥ۟۟ r1 = androidx.emoji2.text.C7527.f29037     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            return r1
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static androidx.emoji2.text.C7527 m28942(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.AbstractC7532 r2) {
            androidx.emoji2.text.ۥ۟۟ r0 = androidx.emoji2.text.C7527.f29037
            if (r0 != 0) goto L19
            java.lang.Object r1 = androidx.emoji2.text.C7527.f29035
            monitor-enter(r1)
            androidx.emoji2.text.ۥ۟۟ r0 = androidx.emoji2.text.C7527.f29037     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L15
            androidx.emoji2.text.ۥ۟۟ r0 = new androidx.emoji2.text.ۥ۟۟     // Catch: java.lang.Throwable -> L13
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L13
            androidx.emoji2.text.C7527.f29037 = r0     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static boolean m28943() {
            androidx.emoji2.text.ۥ۟۟ r0 = androidx.emoji2.text.C7527.f29037
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static androidx.emoji2.text.C7527 m28944(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.AbstractC7532 r2) {
            java.lang.Object r0 = androidx.emoji2.text.C7527.f29035
            monitor-enter(r0)
            androidx.emoji2.text.ۥ۟۟ r1 = new androidx.emoji2.text.ۥ۟۟     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            androidx.emoji2.text.C7527.f29037 = r1     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20025})
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static androidx.emoji2.text.C7527 m28945(@Yue.InterfaceC4544 androidx.emoji2.text.C7527 r1) {
            java.lang.Object r0 = androidx.emoji2.text.C7527.f29035
            monitor-enter(r0)
            androidx.emoji2.text.C7527.f29037 = r1     // Catch: java.lang.Throwable -> L9
            androidx.emoji2.text.ۥ۟۟ r1 = androidx.emoji2.text.C7527.f29037     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20025})
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m28946(boolean r1) {
            java.lang.Object r0 = androidx.emoji2.text.C7527.f29036
            monitor-enter(r0)
            androidx.emoji2.text.C7527.f29038 = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String m28947() {
            r2 = this;
            boolean r0 = r2.m28956()
            java.lang.String r1 = "Not initialized yet"
            Yue.C4868.m19184(r0, r1)
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟ r0 = r2.f29044
            java.lang.String r0 = r0.mo28968()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m28948(@Yue.InterfaceC4410 java.lang.CharSequence r2, @Yue.InterfaceC3281(from = 0) int r3) {
            r1 = this;
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟ r0 = r1.f29044
            int r2 = r0.mo28969(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m28949(@Yue.InterfaceC4410 java.lang.CharSequence r3, @Yue.InterfaceC3281(from = 0) int r4) {
            r2 = this;
            boolean r0 = r2.m28956()
            java.lang.String r1 = "Not initialized yet"
            Yue.C4868.m19184(r0, r1)
            java.lang.String r0 = "sequence cannot be null"
            Yue.C4868.m19182(r3, r0)
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟ r0 = r2.f29044
            int r3 = r0.mo28970(r3, r4)
            return r3
    }

    @Yue.InterfaceC1230
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m28950() {
            r1 = this;
            int r0 = r1.f29051
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m28951(@Yue.InterfaceC4410 java.lang.CharSequence r2, @Yue.InterfaceC3281(from = 0) int r3) {
            r1 = this;
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟ r0 = r1.f29044
            int r2 = r0.mo28971(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m28952() {
            r2 = this;
            java.util.concurrent.locks.ReadWriteLock r0 = r2.f29040
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            int r0 = r2.f29042     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.ReadWriteLock r1 = r2.f29040
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            return r0
        L15:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r2.f29040
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            throw r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m28953(@Yue.InterfaceC4410 java.lang.CharSequence r3) {
            r2 = this;
            boolean r0 = r2.m28956()
            java.lang.String r1 = "Not initialized yet"
            Yue.C4868.m19184(r0, r1)
            java.lang.String r0 = "sequence cannot be null"
            Yue.C4868.m19182(r3, r0)
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟ r0 = r2.f29044
            boolean r3 = r0.mo28972(r3)
            return r3
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m28954(@Yue.InterfaceC4410 java.lang.CharSequence r3, @Yue.InterfaceC3281(from = 0) int r4) {
            r2 = this;
            boolean r0 = r2.m28956()
            java.lang.String r1 = "Not initialized yet"
            Yue.C4868.m19184(r0, r1)
            java.lang.String r0 = "sequence cannot be null"
            Yue.C4868.m19182(r3, r0)
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟ r0 = r2.f29044
            boolean r3 = r0.mo28973(r3, r4)
            return r3
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m28955() {
            r1 = this;
            boolean r0 = r1.f29050
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final boolean m28956() {
            r2 = this;
            int r0 = r2.m28952()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m28957() {
            r3 = this;
            int r0 = r3.f29052
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L7
            goto L8
        L7:
            r2 = r1
        L8:
            java.lang.String r0 = "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"
            Yue.C4868.m19184(r2, r0)
            boolean r0 = r3.m28956()
            if (r0 == 0) goto L14
            return
        L14:
            java.util.concurrent.locks.ReadWriteLock r0 = r3.f29040
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r3.f29042     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L2b
            java.util.concurrent.locks.ReadWriteLock r0 = r3.f29040
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return
        L2b:
            r3.f29042 = r1     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.locks.ReadWriteLock r0 = r3.f29040
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟ r0 = r3.f29044
            r0.mo28974()
            return
        L3c:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r3.f29040
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m28958() {
            r2 = this;
            java.util.concurrent.locks.ReadWriteLock r0 = r2.f29040
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r2.f29052     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L13
            r0 = 0
            r2.f29042 = r0     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r0 = move-exception
            goto L28
        L13:
            java.util.concurrent.locks.ReadWriteLock r0 = r2.f29040
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            int r0 = r2.m28952()
            if (r0 != 0) goto L27
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟ r0 = r2.f29044
            r0.mo28974()
        L27:
            return
        L28:
            java.util.concurrent.locks.ReadWriteLock r1 = r2.f29040
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m28959(@Yue.InterfaceC4544 java.lang.Throwable r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.ReadWriteLock r1 = r4.f29040
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 2
            r4.f29042 = r1     // Catch: java.lang.Throwable -> L31
            java.util.Set<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r1 = r4.f29041     // Catch: java.lang.Throwable -> L31
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L31
            java.util.Set<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r1 = r4.f29041     // Catch: java.lang.Throwable -> L31
            r1.clear()     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.locks.ReadWriteLock r1 = r4.f29040
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r4.f29043
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۢ r2 = new androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۢ
            int r3 = r4.f29042
            r2.<init>(r0, r3, r5)
            r1.post(r2)
            return
        L31:
            r5 = move-exception
            java.util.concurrent.locks.ReadWriteLock r0 = r4.f29040
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m28960() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.ReadWriteLock r1 = r4.f29040
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 1
            r4.f29042 = r1     // Catch: java.lang.Throwable -> L31
            java.util.Set<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r1 = r4.f29041     // Catch: java.lang.Throwable -> L31
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L31
            java.util.Set<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r1 = r4.f29041     // Catch: java.lang.Throwable -> L31
            r1.clear()     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.locks.ReadWriteLock r1 = r4.f29040
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r4.f29043
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۢ r2 = new androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۢ
            int r3 = r4.f29042
            r2.<init>(r0, r3)
            r1.post(r2)
            return
        L31:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r4.f29040
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public java.lang.CharSequence m28961(@Yue.InterfaceC4544 java.lang.CharSequence r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L5
            r1 = r0
            goto L9
        L5:
            int r1 = r3.length()
        L9:
            java.lang.CharSequence r3 = r2.m28962(r3, r0, r1)
            return r3
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.lang.CharSequence m28962(@Yue.InterfaceC4544 java.lang.CharSequence r2, @Yue.InterfaceC3281(from = 0) int r3, @Yue.InterfaceC3281(from = 0) int r4) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.CharSequence r2 = r1.m28963(r2, r3, r4, r0)
            return r2
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public java.lang.CharSequence m28963(@Yue.InterfaceC4544 java.lang.CharSequence r7, @Yue.InterfaceC3281(from = 0) int r8, @Yue.InterfaceC3281(from = 0) int r9, @Yue.InterfaceC3281(from = 0) int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.CharSequence r7 = r0.m28964(r1, r2, r3, r4, r5)
            return r7
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public java.lang.CharSequence m28964(@Yue.InterfaceC4544 java.lang.CharSequence r8, @Yue.InterfaceC3281(from = 0) int r9, @Yue.InterfaceC3281(from = 0) int r10, @Yue.InterfaceC3281(from = 0) int r11, int r12) {
            r7 = this;
            boolean r0 = r7.m28956()
            java.lang.String r1 = "Not initialized yet"
            Yue.C4868.m19184(r0, r1)
            java.lang.String r0 = "start cannot be negative"
            Yue.C4868.m19179(r9, r0)
            java.lang.String r0 = "end cannot be negative"
            Yue.C4868.m19179(r10, r0)
            java.lang.String r0 = "maxEmojiCount cannot be negative"
            Yue.C4868.m19179(r11, r0)
            r0 = 0
            r1 = 1
            if (r9 > r10) goto L1e
            r2 = r1
            goto L1f
        L1e:
            r2 = r0
        L1f:
            java.lang.String r3 = "start should be <= than end"
            Yue.C4868.m19171(r2, r3)
            if (r8 != 0) goto L28
            r8 = 0
            return r8
        L28:
            int r2 = r8.length()
            if (r9 > r2) goto L30
            r2 = r1
            goto L31
        L30:
            r2 = r0
        L31:
            java.lang.String r3 = "start should be < than charSequence length"
            Yue.C4868.m19171(r2, r3)
            int r2 = r8.length()
            if (r10 > r2) goto L3e
            r2 = r1
            goto L3f
        L3e:
            r2 = r0
        L3f:
            java.lang.String r3 = "end should be < than charSequence length"
            Yue.C4868.m19171(r2, r3)
            int r2 = r8.length()
            if (r2 == 0) goto L61
            if (r9 != r10) goto L4d
            goto L61
        L4d:
            if (r12 == r1) goto L56
            r1 = 2
            if (r12 == r1) goto L54
            boolean r0 = r7.f29047
        L54:
            r6 = r0
            goto L57
        L56:
            r6 = r1
        L57:
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟ r1 = r7.f29044
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.CharSequence r8 = r1.mo28975(r2, r3, r4, r5, r6)
        L61:
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m28965(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.AbstractC7535 r4) {
            r3 = this;
            java.lang.String r0 = "initCallback cannot be null"
            Yue.C4868.m19182(r4, r0)
            java.util.concurrent.locks.ReadWriteLock r0 = r3.f29040
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r3.f29042     // Catch: java.lang.Throwable -> L1f
            r1 = 1
            if (r0 == r1) goto L21
            int r0 = r3.f29042     // Catch: java.lang.Throwable -> L1f
            r1 = 2
            if (r0 != r1) goto L19
            goto L21
        L19:
            java.util.Set<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r0 = r3.f29041     // Catch: java.lang.Throwable -> L1f
            r0.add(r4)     // Catch: java.lang.Throwable -> L1f
            goto L2d
        L1f:
            r4 = move-exception
            goto L37
        L21:
            android.os.Handler r0 = r3.f29043     // Catch: java.lang.Throwable -> L1f
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۢ r1 = new androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۢ     // Catch: java.lang.Throwable -> L1f
            int r2 = r3.f29042     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L1f
            r0.post(r1)     // Catch: java.lang.Throwable -> L1f
        L2d:
            java.util.concurrent.locks.ReadWriteLock r4 = r3.f29040
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.unlock()
            return
        L37:
            java.util.concurrent.locks.ReadWriteLock r0 = r3.f29040
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m28966(@Yue.InterfaceC4410 androidx.emoji2.text.C7527.AbstractC7535 r2) {
            r1 = this;
            java.lang.String r0 = "initCallback cannot be null"
            Yue.C4868.m19182(r2, r0)
            java.util.concurrent.locks.ReadWriteLock r0 = r1.f29040
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            java.util.Set<androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ> r0 = r1.f29041     // Catch: java.lang.Throwable -> L1d
            r0.remove(r2)     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.locks.ReadWriteLock r2 = r1.f29040
            java.util.concurrent.locks.Lock r2 = r2.writeLock()
            r2.unlock()
            return
        L1d:
            r2 = move-exception
            java.util.concurrent.locks.ReadWriteLock r0 = r1.f29040
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m28967(@Yue.InterfaceC4410 android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            boolean r0 = r1.m28956()
            if (r0 == 0) goto L19
            if (r2 != 0) goto L9
            goto L19
        L9:
            android.os.Bundle r0 = r2.extras
            if (r0 != 0) goto L14
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.extras = r0
        L14:
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟ r0 = r1.f29044
            r0.mo28976(r2)
        L19:
            return
    }
}
