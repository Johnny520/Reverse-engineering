package androidx.emoji2.text;

/* JADX INFO: renamed from: androidx.emoji2.text.ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7521 {

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static class C7522 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public static final java.lang.String f29013 = "emoji2.text.DefaultEmojiConfig";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public static final java.lang.String f29014 = "androidx.content.action.LOAD_EMOJI_FONT";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public static final java.lang.String f29015 = "emojicompat-emoji-font";

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final androidx.emoji2.text.C7521.C7523 f29016;

        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
        public C7522(@Yue.InterfaceC4544 androidx.emoji2.text.C7521.C7523 r1) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto L6
                goto La
            L6:
                androidx.emoji2.text.ۥ$ۥ۟ r1 = m28922()
            La:
                r0.f29016 = r1
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static androidx.emoji2.text.C7521.C7523 m28922() {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto Lc
                androidx.emoji2.text.ۥ$ۥ۟۟۟ r0 = new androidx.emoji2.text.ۥ$ۥ۟۟۟
                r0.<init>()
                return r0
            Lc:
                androidx.emoji2.text.ۥ$ۥ۟۟ r0 = new androidx.emoji2.text.ۥ$ۥ۟۟
                r0.<init>()
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final androidx.emoji2.text.C7527.AbstractC7532 m28923(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 Yue.C2719 r3) {
                r1 = this;
                if (r3 != 0) goto L4
                r2 = 0
                return r2
            L4:
                androidx.emoji2.text.ۥ۟۟۟۟ r0 = new androidx.emoji2.text.ۥ۟۟۟۟
                r0.<init>(r2, r3)
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.List<java.util.List<byte[]>> m28924(@Yue.InterfaceC4410 android.content.pm.Signature[] r5) {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                int r1 = r5.length
                r2 = 0
            L7:
                if (r2 >= r1) goto L15
                r3 = r5[r2]
                byte[] r3 = r3.toByteArray()
                r0.add(r3)
                int r2 = r2 + 1
                goto L7
            L15:
                java.util.List r5 = java.util.Collections.singletonList(r0)
                return r5
        }

        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public androidx.emoji2.text.C7527.AbstractC7532 m28925(@Yue.InterfaceC4410 android.content.Context r2) {
                r1 = this;
                Yue.ۥ۠ۢۥۧ r0 = r1.m28929(r2)
                androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ r2 = r1.m28923(r2, r0)
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Yue.C2719 m28926(@Yue.InterfaceC4410 android.content.pm.ProviderInfo r4, @Yue.InterfaceC4410 android.content.pm.PackageManager r5) throws android.content.pm.PackageManager.NameNotFoundException {
                r3 = this;
                java.lang.String r0 = r4.authority
                java.lang.String r4 = r4.packageName
                androidx.emoji2.text.ۥ$ۥ۟ r1 = r3.f29016
                android.content.pm.Signature[] r5 = r1.mo28931(r5, r4)
                java.util.List r5 = r3.m28924(r5)
                Yue.ۥ۠ۢۥۧ r1 = new Yue.ۥ۠ۢۥۧ
                java.lang.String r2 = "emojicompat-emoji-font"
                r1.<init>(r0, r4, r2, r5)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final boolean m28927(@Yue.InterfaceC4544 android.content.pm.ProviderInfo r2) {
                r1 = this;
                if (r2 == 0) goto Ld
                android.content.pm.ApplicationInfo r2 = r2.applicationInfo
                if (r2 == 0) goto Ld
                int r2 = r2.flags
                r0 = 1
                r2 = r2 & r0
                if (r2 != r0) goto Ld
                goto Le
            Ld:
                r0 = 0
            Le:
                return r0
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final android.content.pm.ProviderInfo m28928(@Yue.InterfaceC4410 android.content.pm.PackageManager r4) {
                r3 = this;
                androidx.emoji2.text.ۥ$ۥ۟ r0 = r3.f29016
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
                r1.<init>(r2)
                r2 = 0
                java.util.List r4 = r0.mo28932(r4, r1, r2)
                java.util.Iterator r4 = r4.iterator()
            L12:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L2b
                java.lang.Object r0 = r4.next()
                android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
                androidx.emoji2.text.ۥ$ۥ۟ r1 = r3.f29016
                android.content.pm.ProviderInfo r0 = r1.mo28930(r0)
                boolean r1 = r3.m28927(r0)
                if (r1 == 0) goto L12
                return r0
            L2b:
                r4 = 0
                return r4
        }

        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
        @Yue.InterfaceC6959
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public Yue.C2719 m28929(@Yue.InterfaceC4410 android.content.Context r3) {
                r2 = this;
                android.content.pm.PackageManager r3 = r3.getPackageManager()
                java.lang.String r0 = "Package manager required to locate emoji font provider"
                Yue.C4868.m19182(r3, r0)
                android.content.pm.ProviderInfo r0 = r2.m28928(r3)
                r1 = 0
                if (r0 != 0) goto L11
                return r1
            L11:
                Yue.ۥ۠ۢۥۧ r3 = r2.m28926(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
                return r3
            L16:
                r3 = move-exception
                java.lang.String r0 = "emoji2.text.DefaultEmojiConfig"
                android.util.Log.wtf(r0, r3)
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static class C7523 {
        public C7523() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.content.pm.ProviderInfo mo28930(@Yue.InterfaceC4410 android.content.pm.ResolveInfo r2) {
                r1 = this;
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Unable to get provider info prior to API 19"
                r2.<init>(r0)
                throw r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public android.content.pm.Signature[] mo28931(@Yue.InterfaceC4410 android.content.pm.PackageManager r2, @Yue.InterfaceC4410 java.lang.String r3) throws android.content.pm.PackageManager.NameNotFoundException {
                r1 = this;
                r0 = 64
                android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
                android.content.pm.Signature[] r2 = r2.signatures
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public java.util.List<android.content.pm.ResolveInfo> mo28932(@Yue.InterfaceC4410 android.content.pm.PackageManager r1, @Yue.InterfaceC4410 android.content.Intent r2, int r3) {
                r0 = this;
                java.util.List r1 = java.util.Collections.emptyList()
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC5336(19)
    public static class C7524 extends androidx.emoji2.text.C7521.C7523 {
        public C7524() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.emoji2.text.C7521.C7523
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ */
        public android.content.pm.ProviderInfo mo28930(@Yue.InterfaceC4410 android.content.pm.ResolveInfo r1) {
                r0 = this;
                android.content.pm.ProviderInfo r1 = r1.providerInfo
                return r1
        }

        @Override // androidx.emoji2.text.C7521.C7523
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟ */
        public java.util.List<android.content.pm.ResolveInfo> mo28932(@Yue.InterfaceC4410 android.content.pm.PackageManager r1, @Yue.InterfaceC4410 android.content.Intent r2, int r3) {
                r0 = this;
                java.util.List r1 = r1.queryIntentContentProviders(r2, r3)
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC5336(28)
    public static class C7525 extends androidx.emoji2.text.C7521.C7524 {
        public C7525() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.emoji2.text.C7521.C7523
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟ */
        public android.content.pm.Signature[] mo28931(@Yue.InterfaceC4410 android.content.pm.PackageManager r2, @Yue.InterfaceC4410 java.lang.String r3) throws android.content.pm.PackageManager.NameNotFoundException {
                r1 = this;
                r0 = 64
                android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
                android.content.pm.Signature[] r2 = r2.signatures
                return r2
        }
    }

    public C7521() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static androidx.emoji2.text.C7549 m28921(@Yue.InterfaceC4410 android.content.Context r2) {
            androidx.emoji2.text.ۥ$ۥ r0 = new androidx.emoji2.text.ۥ$ۥ
            r1 = 0
            r0.<init>(r1)
            androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ r2 = r0.m28925(r2)
            androidx.emoji2.text.ۥ۟۟۟۟ r2 = (androidx.emoji2.text.C7549) r2
            return r2
    }
}
