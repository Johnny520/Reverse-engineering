package androidx.profileinstaller;

/* JADX INFO: renamed from: androidx.profileinstaller.ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(19)
public class C7652 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.content.res.AssetManager f29466;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.util.concurrent.Executor f29467;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final androidx.profileinstaller.C7653.InterfaceC7657 f29468;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final byte[] f29469;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.io.File f29470;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.lang.String f29471;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.lang.String f29472;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.lang.String f29473;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f29474;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public Yue.C1829[] f29475;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public byte[] f29476;

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public C7652(@Yue.InterfaceC4410 android.content.res.AssetManager r2, @Yue.InterfaceC4410 java.util.concurrent.Executor r3, @Yue.InterfaceC4410 androidx.profileinstaller.C7653.InterfaceC7657 r4, @Yue.InterfaceC4410 java.lang.String r5, @Yue.InterfaceC4410 java.lang.String r6, @Yue.InterfaceC4410 java.lang.String r7, @Yue.InterfaceC4410 java.io.File r8) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f29474 = r0
            r1.f29466 = r2
            r1.f29467 = r3
            r1.f29468 = r4
            r1.f29471 = r5
            r1.f29472 = r6
            r1.f29473 = r7
            r1.f29470 = r8
            byte[] r2 = m29540()
            r1.f29469 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m29539(androidx.profileinstaller.C7652 r0, int r1, java.lang.Object r2) {
            r0.m29546(r1, r2)
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static byte[] m29540() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            if (r0 <= r1) goto L8
            return r2
        L8:
            switch(r0) {
                case 26: goto L15;
                case 27: goto L12;
                case 28: goto Lf;
                case 29: goto Lf;
                case 30: goto Lf;
                case 31: goto Lc;
                case 32: goto Lc;
                case 33: goto Lc;
                case 34: goto Lc;
                default: goto Lb;
            }
        Lb:
            return r2
        Lc:
            byte[] r0 = Yue.C4961.f15807
            return r0
        Lf:
            byte[] r0 = Yue.C4961.f15808
            return r0
        L12:
            byte[] r0 = Yue.C4961.f15809
            return r0
        L15:
            byte[] r0 = Yue.C4961.f15810
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m29541() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            if (r0 <= r1) goto L8
            return r2
        L8:
            switch(r0) {
                case 31: goto Lc;
                case 32: goto Lc;
                case 33: goto Lc;
                case 34: goto Lc;
                default: goto Lb;
            }
        Lb:
            return r2
        Lc:
            r0 = 1
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final androidx.profileinstaller.C7652 m29542(Yue.C1829[] r4, byte[] r5) {
            r3 = this;
            r0 = 0
            android.content.res.AssetManager r1 = r3.f29466     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
            java.lang.String r2 = r3.f29473     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
            java.io.InputStream r1 = r3.m29547(r1, r2)     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
            if (r1 == 0) goto L2b
            byte[] r2 = Yue.C4960.f15806     // Catch: java.lang.Throwable -> L21
            byte[] r2 = Yue.C4960.m19357(r1, r2)     // Catch: java.lang.Throwable -> L21
            Yue.ۥ۠۟۟ۦ[] r4 = Yue.C4960.m19359(r1, r2, r5, r4)     // Catch: java.lang.Throwable -> L21
            r3.f29475 = r4     // Catch: java.lang.Throwable -> L21
            r1.close()     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
            return r3
        L1b:
            r4 = move-exception
            goto L31
        L1d:
            r4 = move-exception
            goto L3b
        L1f:
            r4 = move-exception
            goto L42
        L21:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
        L2a:
            throw r4     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
        L2b:
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.lang.IllegalStateException -> L1b java.io.IOException -> L1d java.io.FileNotFoundException -> L1f
            goto L49
        L31:
            r3.f29475 = r0
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r5 = r3.f29468
            r1 = 8
            r5.mo29520(r1, r4)
            goto L49
        L3b:
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r5 = r3.f29468
            r1 = 7
            r5.mo29520(r1, r4)
            goto L49
        L42:
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r5 = r3.f29468
            r1 = 9
            r5.mo29520(r1, r4)
        L49:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m29543() {
            r2 = this;
            boolean r0 = r2.f29474
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m29544() {
            r4 = this;
            byte[] r0 = r4.f29469
            r1 = 0
            if (r0 != 0) goto L10
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r4.m29550(r2, r0)
            return r1
        L10:
            java.io.File r0 = r4.f29470
            boolean r0 = r0.exists()
            r2 = 0
            r3 = 4
            if (r0 == 0) goto L26
            java.io.File r0 = r4.f29470
            boolean r0 = r0.canWrite()
            if (r0 != 0) goto L2b
            r4.m29550(r3, r2)
            return r1
        L26:
            java.io.File r0 = r4.f29470     // Catch: java.io.IOException -> L2f
            r0.createNewFile()     // Catch: java.io.IOException -> L2f
        L2b:
            r0 = 1
            r4.f29474 = r0
            return r0
        L2f:
            r4.m29550(r3, r2)
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.io.InputStream m29545(android.content.res.AssetManager r3) {
            r2 = this;
            java.lang.String r0 = r2.f29472     // Catch: java.io.IOException -> L7 java.io.FileNotFoundException -> L9
            java.io.InputStream r3 = r2.m29547(r3, r0)     // Catch: java.io.IOException -> L7 java.io.FileNotFoundException -> L9
            goto L19
        L7:
            r3 = move-exception
            goto Lb
        L9:
            r3 = move-exception
            goto L12
        Lb:
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r0 = r2.f29468
            r1 = 7
            r0.mo29520(r1, r3)
            goto L18
        L12:
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r0 = r2.f29468
            r1 = 6
            r0.mo29520(r1, r3)
        L18:
            r3 = 0
        L19:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final /* synthetic */ void m29546(int r2, java.lang.Object r3) {
            r1 = this;
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r0 = r1.f29468
            r0.mo29520(r2, r3)
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.io.InputStream m29547(android.content.res.AssetManager r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            android.content.res.AssetFileDescriptor r2 = r2.openFd(r3)     // Catch: java.io.FileNotFoundException -> L9
            java.io.FileInputStream r2 = r2.createInputStream()     // Catch: java.io.FileNotFoundException -> L9
            goto L20
        L9:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            r3 = 0
            if (r2 == 0) goto L1f
            java.lang.String r0 = "compressed"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L1f
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r2 = r1.f29468
            r0 = 5
            r2.mo29519(r0, r3)
        L1f:
            r2 = r3
        L20:
            return r2
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public androidx.profileinstaller.C7652 m29548() {
            r2 = this;
            r2.m29543()
            byte[] r0 = r2.f29469
            if (r0 != 0) goto L8
            return r2
        L8:
            android.content.res.AssetManager r0 = r2.f29466
            java.io.InputStream r0 = r2.m29545(r0)
            if (r0 == 0) goto L16
            Yue.ۥ۠۟۟ۦ[] r0 = r2.m29549(r0)
            r2.f29475 = r0
        L16:
            Yue.ۥ۠۟۟ۦ[] r0 = r2.f29475
            if (r0 == 0) goto L29
            boolean r1 = m29541()
            if (r1 == 0) goto L29
            byte[] r1 = r2.f29469
            androidx.profileinstaller.ۥ۟ r0 = r2.m29542(r0, r1)
            if (r0 == 0) goto L29
            return r0
        L29:
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.C1829[] m29549(java.io.InputStream r5) {
            r4 = this;
            r0 = 7
            byte[] r1 = Yue.C4960.f15805     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1a java.io.IOException -> L1c
            byte[] r1 = Yue.C4960.m19357(r5, r1)     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1a java.io.IOException -> L1c
            java.lang.String r2 = r4.f29471     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1a java.io.IOException -> L1c
            Yue.ۥ۠۟۟ۦ[] r1 = Yue.C4960.m19365(r5, r1, r2)     // Catch: java.lang.Throwable -> L18 java.lang.IllegalStateException -> L1a java.io.IOException -> L1c
            r5.close()     // Catch: java.io.IOException -> L11
            goto L39
        L11:
            r5 = move-exception
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r2 = r4.f29468
            r2.mo29520(r0, r5)
            goto L39
        L18:
            r1 = move-exception
            goto L3a
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r1 = move-exception
            goto L30
        L1e:
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r2 = r4.f29468     // Catch: java.lang.Throwable -> L18
            r3 = 8
            r2.mo29520(r3, r1)     // Catch: java.lang.Throwable -> L18
            r5.close()     // Catch: java.io.IOException -> L29
            goto L38
        L29:
            r5 = move-exception
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r1 = r4.f29468
            r1.mo29520(r0, r5)
            goto L38
        L30:
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r2 = r4.f29468     // Catch: java.lang.Throwable -> L18
            r2.mo29520(r0, r1)     // Catch: java.lang.Throwable -> L18
            r5.close()     // Catch: java.io.IOException -> L29
        L38:
            r1 = 0
        L39:
            return r1
        L3a:
            r5.close()     // Catch: java.io.IOException -> L3e
            goto L44
        L3e:
            r5 = move-exception
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r2 = r4.f29468
            r2.mo29520(r0, r5)
        L44:
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m29550(int r3, @Yue.InterfaceC4544 java.lang.Object r4) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.f29467
            Yue.ۥ۠۟۟ r1 = new Yue.ۥ۠۟۟
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public androidx.profileinstaller.C7652 m29551() {
            r4 = this;
            Yue.ۥ۠۟۟ۦ[] r0 = r4.f29475
            byte[] r1 = r4.f29469
            if (r0 == 0) goto L50
            if (r1 != 0) goto L9
            goto L50
        L9:
            r4.m29543()
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.IllegalStateException -> L27 java.io.IOException -> L29
            r3.<init>()     // Catch: java.lang.IllegalStateException -> L27 java.io.IOException -> L29
            Yue.C4960.m19373(r3, r1)     // Catch: java.lang.Throwable -> L2b
            boolean r0 = Yue.C4960.m19370(r3, r1, r0)     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L2d
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r0 = r4.f29468     // Catch: java.lang.Throwable -> L2b
            r1 = 5
            r0.mo29520(r1, r2)     // Catch: java.lang.Throwable -> L2b
            r4.f29475 = r2     // Catch: java.lang.Throwable -> L2b
            r3.close()     // Catch: java.lang.IllegalStateException -> L27 java.io.IOException -> L29
            return r4
        L27:
            r0 = move-exception
            goto L40
        L29:
            r0 = move-exception
            goto L48
        L2b:
            r0 = move-exception
            goto L37
        L2d:
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L2b
            r4.f29476 = r0     // Catch: java.lang.Throwable -> L2b
            r3.close()     // Catch: java.lang.IllegalStateException -> L27 java.io.IOException -> L29
            goto L4e
        L37:
            r3.close()     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.IllegalStateException -> L27 java.io.IOException -> L29
        L3f:
            throw r0     // Catch: java.lang.IllegalStateException -> L27 java.io.IOException -> L29
        L40:
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r1 = r4.f29468
            r3 = 8
            r1.mo29520(r3, r0)
            goto L4e
        L48:
            androidx.profileinstaller.ۥ۟۟$ۥ۟۟۟ r1 = r4.f29468
            r3 = 7
            r1.mo29520(r3, r0)
        L4e:
            r4.f29475 = r2
        L50:
            return r4
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m29552() {
            r5 = this;
            byte[] r0 = r5.f29476
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r5.m29543()
            r2 = 0
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2e
            java.io.File r4 = r5.f29470     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            Yue.C2151.m10101(r3, r0)     // Catch: java.lang.Throwable -> L30
            r4 = 1
            r5.m29550(r4, r2)     // Catch: java.lang.Throwable -> L30
            r0.close()     // Catch: java.lang.Throwable -> L2e
            r3.close()     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c
            r5.f29476 = r2
            r5.f29475 = r2
            return r4
        L28:
            r0 = move-exception
            goto L52
        L2a:
            r0 = move-exception
            goto L43
        L2c:
            r0 = move-exception
            goto L4c
        L2e:
            r0 = move-exception
            goto L3a
        L30:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L2e
        L39:
            throw r4     // Catch: java.lang.Throwable -> L2e
        L3a:
            r3.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c
        L42:
            throw r0     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a java.io.FileNotFoundException -> L2c
        L43:
            r3 = 7
            r5.m29550(r3, r0)     // Catch: java.lang.Throwable -> L28
        L47:
            r5.f29476 = r2
            r5.f29475 = r2
            goto L51
        L4c:
            r3 = 6
            r5.m29550(r3, r0)     // Catch: java.lang.Throwable -> L28
            goto L47
        L51:
            return r1
        L52:
            r5.f29476 = r2
            r5.f29475 = r2
            throw r0
    }
}
