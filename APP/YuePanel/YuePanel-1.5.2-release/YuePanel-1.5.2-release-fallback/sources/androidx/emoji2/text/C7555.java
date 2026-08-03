package androidx.emoji2.text;

/* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC0412
@Yue.InterfaceC5336(19)
public final class C7555 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f29113 = 1024;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f29114 = "EmojiCompat.MetadataRepo.create";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final Yue.C4205 f29115;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final char[] f29116;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.emoji2.text.C7555.C7556 f29117;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.graphics.Typeface f29118;

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟۟۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static class C7556 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.util.SparseArray<androidx.emoji2.text.C7555.C7556> f29119;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C6495 f29120;

        public C7556() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        public C7556(int r2) {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>(r2)
                r1.f29119 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.emoji2.text.C7555.C7556 m29044(int r2) {
                r1 = this;
                android.util.SparseArray<androidx.emoji2.text.ۥ۟۟۟۠$ۥ> r0 = r1.f29119
                if (r0 != 0) goto L6
                r2 = 0
                goto Lc
            L6:
                java.lang.Object r2 = r0.get(r2)
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r2 = (androidx.emoji2.text.C7555.C7556) r2
            Lc:
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C6495 m29045() {
                r1 = this;
                Yue.ۥۢۢۤۥ r0 = r1.f29120
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29046(@Yue.InterfaceC4410 Yue.C6495 r4, int r5, int r6) {
                r3 = this;
                int r0 = r4.m23984(r5)
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = r3.m29044(r0)
                if (r0 != 0) goto L18
                androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = new androidx.emoji2.text.ۥ۟۟۟۠$ۥ
                r0.<init>()
                android.util.SparseArray<androidx.emoji2.text.ۥ۟۟۟۠$ۥ> r1 = r3.f29119
                int r2 = r4.m23984(r5)
                r1.put(r2, r0)
            L18:
                if (r6 <= r5) goto L20
                int r5 = r5 + 1
                r0.m29046(r4, r5, r6)
                goto L22
            L20:
                r0.f29120 = r4
            L22:
                return
        }
    }

    public C7555(@Yue.InterfaceC4410 android.graphics.Typeface r2, @Yue.InterfaceC4410 Yue.C4205 r3) {
            r1 = this;
            r1.<init>()
            r1.f29118 = r2
            r1.f29115 = r3
            androidx.emoji2.text.ۥ۟۟۟۠$ۥ r2 = new androidx.emoji2.text.ۥ۟۟۟۠$ۥ
            r0 = 1024(0x400, float:1.435E-42)
            r2.<init>(r0)
            r1.f29117 = r2
            int r2 = r3.m16409()
            int r2 = r2 * 2
            char[] r2 = new char[r2]
            r1.f29116 = r2
            r1.m29037(r3)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static androidx.emoji2.text.C7555 m29033(@Yue.InterfaceC4410 android.content.res.AssetManager r2, @Yue.InterfaceC4410 java.lang.String r3) throws java.io.IOException {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            Yue.C6388.m23593(r0)     // Catch: java.lang.Throwable -> L16
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r2, r3)     // Catch: java.lang.Throwable -> L16
            androidx.emoji2.text.ۥ۟۟۟۠ r1 = new androidx.emoji2.text.ۥ۟۟۟۠     // Catch: java.lang.Throwable -> L16
            Yue.ۥۡۡ۠ۦ r2 = Yue.C4207.m16420(r2, r3)     // Catch: java.lang.Throwable -> L16
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L16
            Yue.C6388.m23595()
            return r1
        L16:
            r2 = move-exception
            Yue.C6388.m23595()
            throw r2
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20025})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static androidx.emoji2.text.C7555 m29034(@Yue.InterfaceC4410 android.graphics.Typeface r2) {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            Yue.C6388.m23593(r0)     // Catch: java.lang.Throwable -> L13
            androidx.emoji2.text.ۥ۟۟۟۠ r0 = new androidx.emoji2.text.ۥ۟۟۟۠     // Catch: java.lang.Throwable -> L13
            Yue.ۥۡۡ۠ۦ r1 = new Yue.ۥۡۡ۠ۦ     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L13
            Yue.C6388.m23595()
            return r0
        L13:
            r2 = move-exception
            Yue.C6388.m23595()
            throw r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static androidx.emoji2.text.C7555 m29035(@Yue.InterfaceC4410 android.graphics.Typeface r1, @Yue.InterfaceC4410 java.io.InputStream r2) throws java.io.IOException {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            Yue.C6388.m23593(r0)     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.ۥ۟۟۟۠ r0 = new androidx.emoji2.text.ۥ۟۟۟۠     // Catch: java.lang.Throwable -> L12
            Yue.ۥۡۡ۠ۦ r2 = Yue.C4207.m16421(r2)     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L12
            Yue.C6388.m23595()
            return r0
        L12:
            r1 = move-exception
            Yue.C6388.m23595()
            throw r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static androidx.emoji2.text.C7555 m29036(@Yue.InterfaceC4410 android.graphics.Typeface r1, @Yue.InterfaceC4410 java.nio.ByteBuffer r2) throws java.io.IOException {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            Yue.C6388.m23593(r0)     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.ۥ۟۟۟۠ r0 = new androidx.emoji2.text.ۥ۟۟۟۠     // Catch: java.lang.Throwable -> L12
            Yue.ۥۡۡ۠ۦ r2 = Yue.C4207.m16422(r2)     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L12
            Yue.C6388.m23595()
            return r0
        L12:
            r1 = move-exception
            Yue.C6388.m23595()
            throw r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m29037(Yue.C4205 r6) {
            r5 = this;
            int r6 = r6.m16409()
            r0 = 0
        L5:
            if (r0 >= r6) goto L1d
            Yue.ۥۢۢۤۥ r1 = new Yue.ۥۢۢۤۥ
            r1.<init>(r5, r0)
            int r2 = r1.m23989()
            char[] r3 = r5.f29116
            int r4 = r0 * 2
            java.lang.Character.toChars(r2, r3, r4)
            r5.m29043(r1)
            int r0 = r0 + 1
            goto L5
        L1d:
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public char[] m29038() {
            r1 = this;
            char[] r0 = r1.f29116
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.C4205 m29039() {
            r1 = this;
            Yue.ۥۡۡ۠ۦ r0 = r1.f29115
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m29040() {
            r1 = this;
            Yue.ۥۡۡ۠ۦ r0 = r1.f29115
            int r0 = r0.m16415()
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public androidx.emoji2.text.C7555.C7556 m29041() {
            r1 = this;
            androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = r1.f29117
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public android.graphics.Typeface m29042() {
            r1 = this;
            android.graphics.Typeface r0 = r1.f29118
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m29043(@Yue.InterfaceC4410 Yue.C6495 r5) {
            r4 = this;
            java.lang.String r0 = "emoji metadata cannot be null"
            Yue.C4868.m19182(r5, r0)
            int r0 = r5.m23985()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto Lf
            r0 = r2
            goto L10
        Lf:
            r0 = r1
        L10:
            java.lang.String r3 = "invalid metadata codepoint length"
            Yue.C4868.m19171(r0, r3)
            androidx.emoji2.text.ۥ۟۟۟۠$ۥ r0 = r4.f29117
            int r3 = r5.m23985()
            int r3 = r3 - r2
            r0.m29046(r5, r1, r3)
            return
    }
}
