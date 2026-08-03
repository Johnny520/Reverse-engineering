package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,165:1\n52#2,21:166\n52#2,21:187\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n67#1:166,21\n81#1:187,21\n*E\n"})
public abstract class AbstractC2370 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.AbstractC2370.C2371 f7760 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.AbstractC2370 f7761 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.C4701 f7762 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.AbstractC2370 f7763 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۤ$ۥ, reason: contains not printable characters */
    public static final class C2371 {
        public C2371() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C2371(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC3421(name = "get")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.AbstractC2370 m10945(@Yue.InterfaceC4418 java.nio.file.FileSystem r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥۡۢۢۧ r0 = new Yue.ۥۡۢۢۧ
                r0.<init>(r2)
                return r0
        }
    }

    static {
            Yue.ۥ۠ۡۨۤ$ۥ r0 = new Yue.ۥ۠ۡۨۤ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.AbstractC2370.f7760 = r0
            java.lang.String r0 = "java.nio.file.Files"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L13
            Yue.ۥۡۢۢۨ r0 = new Yue.ۥۡۢۢۨ     // Catch: java.lang.ClassNotFoundException -> L13
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L13
            goto L18
        L13:
            Yue.ۥ۠ۦۢ r0 = new Yue.ۥ۠ۦۢ
            r0.<init>()
        L18:
            Yue.AbstractC2370.f7761 = r0
            Yue.ۥۣۡۧۧ$ۥ r0 = Yue.C4701.f14928
            java.lang.String r2 = "java.io.tmpdir"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.String r3 = "getProperty(...)"
            Yue.C3329.m13905(r2, r3)
            r3 = 0
            r4 = 1
            Yue.ۥۣۡۧۧ r0 = Yue.C4701.C4702.m18672(r0, r2, r3, r4, r1)
            Yue.AbstractC2370.f7762 = r0
            Yue.ۥۡۦۦۡ r0 = new Yue.ۥۡۦۦۡ
            java.lang.Class<Yue.ۥۡۦۦۡ> r1 = Yue.C5350.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            java.lang.String r1 = "getClassLoader(...)"
            Yue.C3329.m13905(r2, r1)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            Yue.AbstractC2370.f7763 = r0
            return
    }

    public AbstractC2370() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m10906(Yue.AbstractC2370 r1, Yue.C4701 r2, boolean r3, Yue.InterfaceC2825 r4, int r5, java.lang.Object r6) throws java.io.IOException {
            if (r6 != 0) goto L48
            r5 = r5 & 2
            if (r5 == 0) goto L7
            r3 = 0
        L7:
            java.lang.String r5 = "file"
            Yue.C3329.m13906(r2, r5)
            java.lang.String r5 = "writerAction"
            Yue.C3329.m13906(r4, r5)
            Yue.ۥۣۢ۟ۡ r1 = r1.mo10943(r2, r3)
            Yue.ۥۣۣ۟۟ r1 = Yue.C4603.m18379(r1)
            r2 = 0
            r3 = 1
            java.lang.Object r4 = r4.invoke(r1)     // Catch: java.lang.Throwable -> L2d
            Yue.C3249.m13687(r3)
            if (r1 == 0) goto L29
            r1.close()     // Catch: java.lang.Throwable -> L28
            goto L29
        L28:
            r2 = move-exception
        L29:
            Yue.C3249.m13686(r3)
            goto L41
        L2d:
            r4 = move-exception
            Yue.C3249.m13687(r3)
            if (r1 == 0) goto L3b
            r1.close()     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r1 = move-exception
            Yue.C2268.m10468(r4, r1)
        L3b:
            Yue.C3249.m13686(r3)
            r0 = r4
            r4 = r2
            r2 = r0
        L41:
            if (r2 != 0) goto L47
            Yue.C3329.m13903(r4)
            return r4
        L47:
            throw r2
        L48:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: write"
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5794 m10907(Yue.AbstractC2370 r0, Yue.C4701 r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            Yue.ۥۣۢ۟ۡ r0 = r0.mo10919(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: appendingSink"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m10908(Yue.AbstractC2370 r0, Yue.C4701 r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.m10924(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: createDirectories"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m10909(Yue.AbstractC2370 r0, Yue.C4701 r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.mo10926(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: createDirectory"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m10910(Yue.AbstractC2370 r0, Yue.C4701 r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.mo10929(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: delete"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m10911(Yue.AbstractC2370 r0, Yue.C4701 r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.m10931(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: deleteRecursively"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC3421(name = "get")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final Yue.AbstractC2370 m10912(@Yue.InterfaceC4418 java.nio.file.FileSystem r1) {
            Yue.ۥ۠ۡۨۤ$ۥ r0 = Yue.AbstractC2370.f7760
            Yue.ۥ۠ۡۨۤ r1 = r0.m10945(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5609 m10913(Yue.AbstractC2370 r0, Yue.C4701 r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            Yue.ۥۡۨۢ r0 = r0.mo10936(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: listRecursively"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ Yue.AbstractC2355 m10914(Yue.AbstractC2370 r1, Yue.C4701 r2, boolean r3, boolean r4, int r5, java.lang.Object r6) throws java.io.IOException {
            if (r6 != 0) goto L12
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L8
            r3 = r0
        L8:
            r5 = r5 & 4
            if (r5 == 0) goto Ld
            r4 = r0
        Ld:
            Yue.ۥ۠ۡۧۧ r1 = r1.mo10941(r2, r3, r4)
            return r1
        L12:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: openReadWrite"
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5794 m10915(Yue.AbstractC2370 r0, Yue.C4701 r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            Yue.ۥۣۢ۟ۡ r0 = r0.mo10943(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: sink"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC3421(name = "-read")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final <T> T m10916(@Yue.InterfaceC4418 Yue.C4701 r4, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC0849, ? extends T> r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "readerAction"
            Yue.C3329.m13906(r5, r0)
            Yue.ۥۣۢ۟ۦ r4 = r3.mo10944(r4)
            Yue.ۥۣۣ۟۠ r4 = Yue.C4603.m18380(r4)
            r0 = 1
            r1 = 0
            java.lang.Object r5 = r5.invoke(r4)     // Catch: java.lang.Throwable -> L26
            Yue.C3249.m13687(r0)
            if (r4 == 0) goto L22
            r4.close()     // Catch: java.lang.Throwable -> L21
            goto L22
        L21:
            r1 = move-exception
        L22:
            Yue.C3249.m13686(r0)
            goto L3a
        L26:
            r5 = move-exception
            Yue.C3249.m13687(r0)
            if (r4 == 0) goto L34
            r4.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r4 = move-exception
            Yue.C2268.m10468(r5, r4)
        L34:
            Yue.C3249.m13686(r0)
            r2 = r1
            r1 = r5
            r5 = r2
        L3a:
            if (r1 != 0) goto L40
            Yue.C3329.m13903(r5)
            return r5
        L40:
            throw r1
    }

    @Yue.InterfaceC3421(name = "-write")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final <T> T m10917(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC0848, ? extends T> r5) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "writerAction"
            Yue.C3329.m13906(r5, r0)
            Yue.ۥۣۢ۟ۡ r3 = r2.mo10943(r3, r4)
            Yue.ۥۣۣ۟۟ r3 = Yue.C4603.m18379(r3)
            r4 = 1
            r0 = 0
            java.lang.Object r5 = r5.invoke(r3)     // Catch: java.lang.Throwable -> L26
            Yue.C3249.m13687(r4)
            if (r3 == 0) goto L22
            r3.close()     // Catch: java.lang.Throwable -> L21
            goto L22
        L21:
            r0 = move-exception
        L22:
            Yue.C3249.m13686(r4)
            goto L3a
        L26:
            r5 = move-exception
            Yue.C3249.m13687(r4)
            if (r3 == 0) goto L34
            r3.close()     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r3 = move-exception
            Yue.C2268.m10468(r5, r3)
        L34:
            Yue.C3249.m13686(r4)
            r1 = r0
            r0 = r5
            r5 = r1
        L3a:
            if (r0 != 0) goto L40
            Yue.C3329.m13903(r5)
            return r5
        L40:
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC5794 m10918(@Yue.InterfaceC4418 Yue.C4701 r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            Yue.ۥۣۢ۟ۡ r2 = r1.mo10919(r2, r0)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract Yue.InterfaceC5794 mo10919(@Yue.InterfaceC4418 Yue.C4701 r1, boolean r2) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract void mo10920(@Yue.InterfaceC4418 Yue.C4701 r1, @Yue.InterfaceC4418 Yue.C4701 r2) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract Yue.C4701 mo10921(@Yue.InterfaceC4418 Yue.C4701 r1) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m10922(@Yue.InterfaceC4418 Yue.C4701 r2, @Yue.InterfaceC4418 Yue.C4701 r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r3, r0)
            Yue.C0007.m128(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m10923(@Yue.InterfaceC4418 Yue.C4701 r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            r1.m10924(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m10924(@Yue.InterfaceC4418 Yue.C4701 r2, boolean r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r2, r0)
            Yue.C0007.m129(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m10925(@Yue.InterfaceC4418 Yue.C4701 r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            r1.mo10926(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public abstract void mo10926(@Yue.InterfaceC4418 Yue.C4701 r1, boolean r2) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public abstract void mo10927(@Yue.InterfaceC4418 Yue.C4701 r1, @Yue.InterfaceC4418 Yue.C4701 r2) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m10928(@Yue.InterfaceC4418 Yue.C4701 r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            r1.mo10929(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public abstract void mo10929(@Yue.InterfaceC4418 Yue.C4701 r1, boolean r2) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m10930(@Yue.InterfaceC4418 Yue.C4701 r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "fileOrDirectory"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            r1.m10931(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m10931(@Yue.InterfaceC4418 Yue.C4701 r2, boolean r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "fileOrDirectory"
            Yue.C3329.m13906(r2, r0)
            Yue.C0007.m130(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean m10932(@Yue.InterfaceC4418 Yue.C4701 r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r2, r0)
            boolean r2 = Yue.C0007.m131(r1, r2)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public abstract java.util.List<Yue.C4701> mo10933(@Yue.InterfaceC4418 Yue.C4701 r1) throws java.io.IOException;

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public abstract java.util.List<Yue.C4701> mo10934(@Yue.InterfaceC4418 Yue.C4701 r1);

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final Yue.InterfaceC5609<Yue.C4701> m10935(@Yue.InterfaceC4418 Yue.C4701 r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            Yue.ۥۡۨۢ r2 = r1.mo10936(r2, r0)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public Yue.InterfaceC5609<Yue.C4701> mo10936(@Yue.InterfaceC4418 Yue.C4701 r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۡۨۢ r2 = Yue.C0007.m132(r1, r2, r3)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final Yue.C2359 m10937(@Yue.InterfaceC4418 Yue.C4701 r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۡۨ r2 = Yue.C0007.m133(r1, r2)
            return r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public abstract Yue.C2359 mo10938(@Yue.InterfaceC4418 Yue.C4701 r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public abstract Yue.AbstractC2355 mo10939(@Yue.InterfaceC4418 Yue.C4701 r1) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final Yue.AbstractC2355 m10940(@Yue.InterfaceC4418 Yue.C4701 r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            Yue.ۥ۠ۡۧۧ r2 = r1.mo10941(r2, r0, r0)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public abstract Yue.AbstractC2355 mo10941(@Yue.InterfaceC4418 Yue.C4701 r1, boolean r2, boolean r3) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final Yue.InterfaceC5794 m10942(@Yue.InterfaceC4418 Yue.C4701 r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            Yue.ۥۣۢ۟ۡ r2 = r1.mo10943(r2, r0)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public abstract Yue.InterfaceC5794 mo10943(@Yue.InterfaceC4418 Yue.C4701 r1, boolean r2) throws java.io.IOException;

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public abstract Yue.InterfaceC5839 mo10944(@Yue.InterfaceC4418 Yue.C4701 r1) throws java.io.IOException;
}
