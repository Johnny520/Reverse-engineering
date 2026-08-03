package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۣۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,175:1\n52#2,5:176\n52#2,21:181\n60#2,10:202\n57#2,2:212\n71#2,2:214\n52#2,21:216\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n102#1:176,5\n103#1:181,21\n102#1:202,10\n102#1:212,2\n102#1:214,2\n132#1:216,21\n*E\n"})
public final class C7181 extends Yue.AbstractC2370 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C7181.C7182 f24776 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C4701 f24777 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C4701 f24778;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.AbstractC2370 f24779;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.Map<Yue.C4701, Yue.C7180> f24780;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.String f24781;

    /* JADX INFO: renamed from: Yue.ۥۢۦۣۧ$ۥ, reason: contains not printable characters */
    public static final class C7182 {
        public C7182() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C7182(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C4701 m27657() {
                r1 = this;
                Yue.ۥۣۡۧۧ r0 = Yue.C7181.m27654()
                return r0
        }
    }

    static {
            Yue.ۥۢۦۣۧ$ۥ r0 = new Yue.ۥۢۦۣۧ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C7181.f24776 = r0
            Yue.ۥۣۡۧۧ$ۥ r0 = Yue.C4701.f14928
            r2 = 0
            r3 = 1
            java.lang.String r4 = "/"
            Yue.ۥۣۡۧۧ r0 = Yue.C4701.C4702.m18672(r0, r4, r2, r3, r1)
            Yue.C7181.f24777 = r0
            return
    }

    public C7181(@Yue.InterfaceC4418 Yue.C4701 r2, @Yue.InterfaceC4418 Yue.AbstractC2370 r3, @Yue.InterfaceC4418 java.util.Map<Yue.C4701, Yue.C7180> r4, @Yue.InterfaceC4543 java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "zipPath"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "fileSystem"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "entries"
            Yue.C3329.m13906(r4, r0)
            r1.<init>()
            r1.f24778 = r2
            r1.f24779 = r3
            r1.f24780 = r4
            r1.f24781 = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C4701 m27654() {
            Yue.ۥۣۡۧۧ r0 = Yue.C7181.f24777
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    private final java.util.List<Yue.C4701> m27655(Yue.C4701 r3, boolean r4) {
            r2 = this;
            Yue.ۥۣۡۧۧ r0 = r2.m27656(r3)
            java.util.Map<Yue.ۥۣۡۧۧ, Yue.ۥۢۦۣۦ> r1 = r2.f24780
            java.lang.Object r0 = r1.get(r0)
            Yue.ۥۢۦۣۦ r0 = (Yue.C7180) r0
            if (r0 != 0) goto L29
            if (r4 != 0) goto L12
            r3 = 0
            return r3
        L12:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "not a directory: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L29:
            java.util.List r3 = r0.m27645()
            java.util.List r3 = Yue.C1219.m6537(r3)
            return r3
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Yue.InterfaceC5794 mo10919(@Yue.InterfaceC4418 Yue.C4701 r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "file"
            Yue.C3329.m13906(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo10920(@Yue.InterfaceC4418 Yue.C4701 r2, @Yue.InterfaceC4418 Yue.C4701 r3) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "target"
            Yue.C3329.m13906(r3, r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "zip file systems are read-only"
            r2.<init>(r3)
            throw r2
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.C4701 mo10921(@Yue.InterfaceC4418 Yue.C4701 r3) {
            r2 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۣۡۧۧ r0 = r2.m27656(r3)
            java.util.Map<Yue.ۥۣۡۧۧ, Yue.ۥۢۦۣۦ> r1 = r2.f24780
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L12
            return r0
        L12:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo10926(@Yue.InterfaceC4418 Yue.C4701 r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "dir"
            Yue.C3329.m13906(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo10927(@Yue.InterfaceC4418 Yue.C4701 r2, @Yue.InterfaceC4418 Yue.C4701 r3) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "target"
            Yue.C3329.m13906(r3, r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "zip file systems are read-only"
            r2.<init>(r3)
            throw r2
    }

    @Override // Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo10929(@Yue.InterfaceC4418 Yue.C4701 r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "path"
            Yue.C3329.m13906(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public java.util.List<Yue.C4701> mo10933(@Yue.InterfaceC4418 Yue.C4701 r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r2, r0)
            r0 = 1
            java.util.List r2 = r1.m27655(r2, r0)
            Yue.C3329.m13903(r2)
            return r2
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public java.util.List<Yue.C4701> mo10934(@Yue.InterfaceC4418 Yue.C4701 r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            java.util.List r2 = r1.m27655(r2, r0)
            return r2
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public Yue.C2359 mo10938(@Yue.InterfaceC4418 Yue.C4701 r14) {
            r13 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r14, r0)
            Yue.ۥۣۡۧۧ r14 = r13.m27656(r14)
            java.util.Map<Yue.ۥۣۡۧۧ, Yue.ۥۢۦۣۦ> r0 = r13.f24780
            java.lang.Object r14 = r0.get(r14)
            Yue.ۥۢۦۣۦ r14 = (Yue.C7180) r14
            r0 = 0
            if (r14 != 0) goto L15
            return r0
        L15:
            Yue.ۥ۠ۡۨ r12 = new Yue.ۥ۠ۡۨ
            boolean r1 = r14.m27653()
            r2 = r1 ^ 1
            boolean r3 = r14.m27653()
            boolean r1 = r14.m27653()
            if (r1 == 0) goto L29
            r5 = r0
            goto L32
        L29:
            long r4 = r14.m27652()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r5 = r1
        L32:
            java.lang.Long r7 = r14.m27650()
            r10 = 128(0x80, float:1.8E-43)
            r11 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            long r1 = r14.m27651()
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L4c
            return r12
        L4c:
            Yue.ۥ۠ۡۨۤ r1 = r13.f24779
            Yue.ۥۣۡۧۧ r2 = r13.f24778
            Yue.ۥ۠ۡۧۧ r1 = r1.mo10939(r2)
            long r2 = r14.m27651()     // Catch: java.lang.Throwable -> L7a
            Yue.ۥۣۢ۟ۦ r14 = r1.m10831(r2)     // Catch: java.lang.Throwable -> L7a
            Yue.ۥۣۣ۟۠ r14 = Yue.C4603.m18380(r14)     // Catch: java.lang.Throwable -> L7a
            Yue.ۥ۠ۡۨ r2 = Yue.C7183.m27666(r14, r12)     // Catch: java.lang.Throwable -> L6e
            if (r14 == 0) goto L6c
            r14.close()     // Catch: java.lang.Throwable -> L6a
            goto L6c
        L6a:
            r14 = move-exception
            goto L7e
        L6c:
            r14 = r0
            goto L7e
        L6e:
            r2 = move-exception
            if (r14 == 0) goto L7c
            r14.close()     // Catch: java.lang.Throwable -> L75
            goto L7c
        L75:
            r14 = move-exception
            Yue.C2268.m10468(r2, r14)     // Catch: java.lang.Throwable -> L7a
            goto L7c
        L7a:
            r14 = move-exception
            goto L8c
        L7c:
            r14 = r2
            r2 = r0
        L7e:
            if (r14 != 0) goto L8b
            Yue.C3329.m13903(r2)     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L98
            r1.close()     // Catch: java.lang.Throwable -> L89
            goto L98
        L89:
            r0 = move-exception
            goto L98
        L8b:
            throw r14     // Catch: java.lang.Throwable -> L7a
        L8c:
            if (r1 == 0) goto L96
            r1.close()     // Catch: java.lang.Throwable -> L92
            goto L96
        L92:
            r1 = move-exception
            Yue.C2268.m10468(r14, r1)
        L96:
            r2 = r0
            r0 = r14
        L98:
            if (r0 != 0) goto L9e
            Yue.C3329.m13903(r2)
            return r2
        L9e:
            throw r0
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public Yue.AbstractC2355 mo10939(@Yue.InterfaceC4418 Yue.C4701 r2) {
            r1 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "not implemented yet!"
            r2.<init>(r0)
            throw r2
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public Yue.AbstractC2355 mo10941(@Yue.InterfaceC4418 Yue.C4701 r1, boolean r2, boolean r3) {
            r0 = this;
            java.lang.String r2 = "file"
            Yue.C3329.m13906(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip entries are not writable"
            r1.<init>(r2)
            throw r1
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public Yue.InterfaceC5794 mo10943(@Yue.InterfaceC4418 Yue.C4701 r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "file"
            Yue.C3329.m13906(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public Yue.InterfaceC5839 mo10944(@Yue.InterfaceC4418 Yue.C4701 r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r8, r0)
            Yue.ۥۣۡۧۧ r0 = r7.m27656(r8)
            java.util.Map<Yue.ۥۣۡۧۧ, Yue.ۥۢۦۣۦ> r1 = r7.f24780
            java.lang.Object r0 = r1.get(r0)
            Yue.ۥۢۦۣۦ r0 = (Yue.C7180) r0
            if (r0 == 0) goto L77
            Yue.ۥ۠ۡۨۤ r8 = r7.f24779
            Yue.ۥۣۡۧۧ r1 = r7.f24778
            Yue.ۥ۠ۡۧۧ r8 = r8.mo10939(r1)
            r1 = 0
            long r2 = r0.m27651()     // Catch: java.lang.Throwable -> L30
            Yue.ۥۣۢ۟ۦ r2 = r8.m10831(r2)     // Catch: java.lang.Throwable -> L30
            Yue.ۥۣۣ۟۠ r2 = Yue.C4603.m18380(r2)     // Catch: java.lang.Throwable -> L30
            if (r8 == 0) goto L3e
            r8.close()     // Catch: java.lang.Throwable -> L2e
            goto L3e
        L2e:
            r1 = move-exception
            goto L3e
        L30:
            r2 = move-exception
            if (r8 == 0) goto L3b
            r8.close()     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r8 = move-exception
            Yue.C2268.m10468(r2, r8)
        L3b:
            r6 = r2
            r2 = r1
            r1 = r6
        L3e:
            if (r1 != 0) goto L76
            Yue.C3329.m13903(r2)
            Yue.C7183.m27669(r2)
            int r8 = r0.m27648()
            r1 = 1
            if (r8 != 0) goto L57
            Yue.ۥ۠ۢۡۧ r8 = new Yue.ۥ۠ۢۡۧ
            long r3 = r0.m27652()
            r8.<init>(r2, r3, r1)
            goto L75
        L57:
            Yue.ۥ۠ۥۡۨ r8 = new Yue.ۥ۠ۥۡۨ
            Yue.ۥ۠ۢۡۧ r3 = new Yue.ۥ۠ۢۡۧ
            long r4 = r0.m27647()
            r3.<init>(r2, r4, r1)
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>(r1)
            r8.<init>(r3, r2)
            Yue.ۥ۠ۢۡۧ r1 = new Yue.ۥ۠ۢۡۧ
            long r2 = r0.m27652()
            r0 = 0
            r1.<init>(r8, r2, r0)
            r8 = r1
        L75:
            return r8
        L76:
            throw r1
        L77:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such file: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final Yue.C4701 m27656(Yue.C4701 r3) {
            r2 = this;
            Yue.ۥۣۡۧۧ r0 = Yue.C7181.f24777
            r1 = 1
            Yue.ۥۣۡۧۧ r3 = r0.m18665(r3, r1)
            return r3
    }
}
