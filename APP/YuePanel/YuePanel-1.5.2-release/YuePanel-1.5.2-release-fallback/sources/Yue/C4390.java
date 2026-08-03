package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nNioFileSystemWrappingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,192:1\n1620#2,3:193\n1#3:196\n37#4,2:197\n37#4,2:199\n37#4,2:201\n*S KotlinDebug\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n*L\n77#1:193,3\n104#1:197,2\n125#1:199,2\n138#1:201,2\n*E\n"})
public final class C4390 extends Yue.C4391 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.nio.file.FileSystem f13952;

    public C4390(@Yue.InterfaceC4418 java.nio.file.FileSystem r2) {
            r1 = this;
            java.lang.String r0 = "nioFileSystem"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f13952 = r2
            return
    }

    @Override // Yue.C4391, Yue.C3430
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.nio.file.FileSystem r0 = r1.f13952
            java.lang.Class r0 = r0.getClass()
            Yue.ۥ۠ۦۢۢ r0 = Yue.C5277.m19888(r0)
            java.lang.String r0 = r0.getSimpleName()
            Yue.C3329.m13903(r0)
            return r0
    }

    @Override // Yue.C3430, Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Yue.InterfaceC5794 mo10919(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r3, r0)
            java.util.List r0 = Yue.C1207.m6188()
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.APPEND
            r0.add(r1)
            if (r4 != 0) goto L15
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.CREATE
            r0.add(r4)
        L15:
            java.util.List r4 = Yue.C1207.m6180(r0)
            java.nio.file.Path r3 = r2.m17262(r3)
            r0 = 0
            java.nio.file.StandardOpenOption[] r0 = new java.nio.file.StandardOpenOption[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.nio.file.StandardOpenOption[] r4 = (java.nio.file.StandardOpenOption[]) r4
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r3 = java.nio.file.Files.newOutputStream(r3, r4)
            java.lang.String r4 = "newOutputStream(this, *options)"
            Yue.C3329.m13905(r3, r4)
            Yue.ۥۣۢ۟ۡ r3 = Yue.C4603.m18391(r3)
            return r3
    }

    @Override // Yue.C4391, Yue.C3430, Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo10920(@Yue.InterfaceC4418 Yue.C4701 r5, @Yue.InterfaceC4418 Yue.C4701 r6) {
            r4 = this;
            r0 = 2
            java.lang.String r1 = "source"
            Yue.C3329.m13906(r5, r1)
            java.lang.String r1 = "target"
            Yue.C3329.m13906(r6, r1)
            java.nio.file.Path r5 = r4.m17262(r5)     // Catch: java.nio.file.NoSuchFileException -> L2f java.lang.UnsupportedOperationException -> L31
            java.nio.file.Path r6 = r4.m17262(r6)     // Catch: java.nio.file.NoSuchFileException -> L2f java.lang.UnsupportedOperationException -> L31
            java.nio.file.CopyOption[] r1 = new java.nio.file.CopyOption[r0]     // Catch: java.nio.file.NoSuchFileException -> L2f java.lang.UnsupportedOperationException -> L31
            java.nio.file.StandardCopyOption r2 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch: java.nio.file.NoSuchFileException -> L2f java.lang.UnsupportedOperationException -> L31
            r3 = 0
            r1[r3] = r2     // Catch: java.nio.file.NoSuchFileException -> L2f java.lang.UnsupportedOperationException -> L31
            java.nio.file.StandardCopyOption r2 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.nio.file.NoSuchFileException -> L2f java.lang.UnsupportedOperationException -> L31
            r3 = 1
            r1[r3] = r2     // Catch: java.nio.file.NoSuchFileException -> L2f java.lang.UnsupportedOperationException -> L31
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.nio.file.NoSuchFileException -> L2f java.lang.UnsupportedOperationException -> L31
            java.nio.file.CopyOption[] r0 = (java.nio.file.CopyOption[]) r0     // Catch: java.nio.file.NoSuchFileException -> L2f java.lang.UnsupportedOperationException -> L31
            java.nio.file.Path r5 = java.nio.file.Files.move(r5, r6, r0)     // Catch: java.nio.file.NoSuchFileException -> L2f java.lang.UnsupportedOperationException -> L31
            java.lang.String r6 = "move(this, target, *options)"
            Yue.C3329.m13905(r5, r6)     // Catch: java.nio.file.NoSuchFileException -> L2f java.lang.UnsupportedOperationException -> L31
            return
        L2f:
            r5 = move-exception
            goto L39
        L31:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "atomic move not supported"
            r5.<init>(r6)
            throw r5
        L39:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r5 = r5.getMessage()
            r6.<init>(r5)
            throw r6
    }

    @Override // Yue.C3430, Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.C4701 mo10921(@Yue.InterfaceC4418 Yue.C4701 r6) {
            r5 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r6, r0)
            Yue.ۥۣۡۧۧ$ۥ r0 = Yue.C4701.f14928     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.Path r1 = r5.m17262(r6)     // Catch: java.nio.file.NoSuchFileException -> L1e
            r2 = 0
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r2]     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.Path r1 = r1.toRealPath(r3)     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.lang.String r3 = "toRealPath(...)"
            Yue.C3329.m13905(r1, r3)     // Catch: java.nio.file.NoSuchFileException -> L1e
            r3 = 1
            r4 = 0
            Yue.ۥۣۡۧۧ r6 = Yue.C4701.C4702.m18673(r0, r1, r2, r3, r4)     // Catch: java.nio.file.NoSuchFileException -> L1e
            return r6
        L1e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such file: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    @Override // Yue.C3430, Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo10926(@Yue.InterfaceC4418 Yue.C4701 r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥ۠ۡۨ r0 = r3.mo10938(r4)
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.m10864()
            r2 = 1
            if (r0 != r2) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L31
            if (r5 != 0) goto L1a
            goto L31
        L1a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " already exists."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L31:
            java.nio.file.Path r5 = r3.m17262(r4)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L47
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0     // Catch: java.io.IOException -> L47
            java.nio.file.Path r5 = java.nio.file.Files.createDirectory(r5, r0)     // Catch: java.io.IOException -> L47
            java.lang.String r0 = "createDirectory(this, *attributes)"
            Yue.C3329.m13905(r5, r0)     // Catch: java.io.IOException -> L47
            return
        L47:
            r5 = move-exception
            if (r2 == 0) goto L4b
            return
        L4b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to create directory: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r5)
            throw r0
    }

    @Override // Yue.C4391, Yue.C3430, Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo10927(@Yue.InterfaceC4418 Yue.C4701 r3, @Yue.InterfaceC4418 Yue.C4701 r4) {
            r2 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r4, r0)
            java.nio.file.Path r3 = r2.m17262(r3)
            java.nio.file.Path r4 = r2.m17262(r4)
            r0 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0
            java.nio.file.Path r3 = java.nio.file.Files.createSymbolicLink(r3, r4, r0)
            java.lang.String r4 = "createSymbolicLink(this, target, *attributes)"
            Yue.C3329.m13905(r3, r4)
            return
    }

    @Override // Yue.C3430, Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo10929(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L54
            java.nio.file.Path r0 = r2.m17262(r3)
            java.nio.file.Files.delete(r0)     // Catch: java.io.IOException -> L13 java.nio.file.NoSuchFileException -> L3a
            goto L3c
        L13:
            r4 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r4]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
            boolean r4 = java.nio.file.Files.exists(r0, r4)
            if (r4 != 0) goto L23
            goto L3c
        L23:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to delete "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L3a:
            if (r4 != 0) goto L3d
        L3c:
            return
        L3d:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no such file: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L54:
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException
            java.lang.String r4 = "interrupted"
            r3.<init>(r4)
            throw r3
    }

    @Override // Yue.C3430, Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public java.util.List<Yue.C4701> mo10933(@Yue.InterfaceC4418 Yue.C4701 r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r2, r0)
            r0 = 1
            java.util.List r2 = r1.m17261(r2, r0)
            Yue.C3329.m13903(r2)
            return r2
    }

    @Override // Yue.C3430, Yue.AbstractC2370
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public java.util.List<Yue.C4701> mo10934(@Yue.InterfaceC4418 Yue.C4701 r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            java.util.List r2 = r1.m17261(r2, r0)
            return r2
    }

    @Override // Yue.C4391, Yue.C3430, Yue.AbstractC2370
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public Yue.C2359 mo10938(@Yue.InterfaceC4418 Yue.C4701 r2) {
            r1 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r2, r0)
            java.nio.file.Path r2 = r1.m17262(r2)
            Yue.ۥ۠ۡۨ r2 = r1.m17263(r2)
            return r2
    }

    @Override // Yue.C3430, Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public Yue.AbstractC2355 mo10939(@Yue.InterfaceC4418 Yue.C4701 r5) {
            r4 = this;
            r0 = 0
            java.lang.String r1 = "file"
            Yue.C3329.m13906(r5, r1)
            java.nio.file.Path r1 = r4.m17262(r5)     // Catch: java.nio.file.NoSuchFileException -> L1e
            r2 = 1
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r2]     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.StandardOpenOption r3 = java.nio.file.StandardOpenOption.READ     // Catch: java.nio.file.NoSuchFileException -> L1e
            r2[r0] = r3     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.channels.FileChannel r5 = java.nio.channels.FileChannel.open(r1, r2)     // Catch: java.nio.file.NoSuchFileException -> L1e
            Yue.ۥۡۢۢۦ r1 = new Yue.ۥۡۢۢۦ
            Yue.C3329.m13903(r5)
            r1.<init>(r0, r5)
            return r1
        L1e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such file: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    @Override // Yue.C3430, Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public Yue.AbstractC2355 mo10941(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r3, r0)
            if (r4 == 0) goto L16
            if (r5 != 0) goto La
            goto L16
        La:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Cannot require mustCreate and mustExist at the same time."
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L16:
            java.util.List r0 = Yue.C1207.m6188()
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.READ
            r0.add(r1)
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.WRITE
            r0.add(r1)
            if (r4 == 0) goto L2c
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.CREATE_NEW
            r0.add(r4)
            goto L33
        L2c:
            if (r5 != 0) goto L33
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.CREATE
            r0.add(r4)
        L33:
            java.util.List r4 = Yue.C1207.m6180(r0)
            java.nio.file.Path r5 = r2.m17262(r3)     // Catch: java.nio.file.NoSuchFileException -> L59
            r0 = 0
            java.nio.file.StandardOpenOption[] r0 = new java.nio.file.StandardOpenOption[r0]     // Catch: java.nio.file.NoSuchFileException -> L59
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch: java.nio.file.NoSuchFileException -> L59
            java.nio.file.StandardOpenOption[] r4 = (java.nio.file.StandardOpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L59
            int r0 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L59
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.nio.file.NoSuchFileException -> L59
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L59
            java.nio.channels.FileChannel r3 = java.nio.channels.FileChannel.open(r5, r4)     // Catch: java.nio.file.NoSuchFileException -> L59
            Yue.ۥۡۢۢۦ r4 = new Yue.ۥۡۢۢۦ
            Yue.C3329.m13903(r3)
            r5 = 1
            r4.<init>(r5, r3)
            return r4
        L59:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "no such file: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // Yue.C3430, Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public Yue.InterfaceC5794 mo10943(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r3, r0)
            java.util.List r0 = Yue.C1207.m6188()
            if (r4 == 0) goto L10
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.CREATE_NEW
            r0.add(r4)
        L10:
            java.util.List r4 = Yue.C1207.m6180(r0)
            java.nio.file.Path r0 = r2.m17262(r3)     // Catch: java.nio.file.NoSuchFileException -> L3d
            r1 = 0
            java.nio.file.StandardOpenOption[] r1 = new java.nio.file.StandardOpenOption[r1]     // Catch: java.nio.file.NoSuchFileException -> L3d
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch: java.nio.file.NoSuchFileException -> L3d
            java.nio.file.StandardOpenOption[] r4 = (java.nio.file.StandardOpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L3d
            int r1 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L3d
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.nio.file.NoSuchFileException -> L3d
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L3d
            int r1 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L3d
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.nio.file.NoSuchFileException -> L3d
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L3d
            java.io.OutputStream r4 = java.nio.file.Files.newOutputStream(r0, r4)     // Catch: java.nio.file.NoSuchFileException -> L3d
            java.lang.String r0 = "newOutputStream(this, *options)"
            Yue.C3329.m13905(r4, r0)     // Catch: java.nio.file.NoSuchFileException -> L3d
            Yue.ۥۣۢ۟ۡ r3 = Yue.C4603.m18391(r4)     // Catch: java.nio.file.NoSuchFileException -> L3d
            return r3
        L3d:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no such file: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // Yue.C3430, Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public Yue.InterfaceC5839 mo10944(@Yue.InterfaceC4418 Yue.C4701 r4) {
            r3 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r4, r0)
            java.nio.file.Path r0 = r3.m17262(r4)     // Catch: java.nio.file.NoSuchFileException -> L20
            r1 = 0
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r1]     // Catch: java.nio.file.NoSuchFileException -> L20
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)     // Catch: java.nio.file.NoSuchFileException -> L20
            java.nio.file.OpenOption[] r1 = (java.nio.file.OpenOption[]) r1     // Catch: java.nio.file.NoSuchFileException -> L20
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r0, r1)     // Catch: java.nio.file.NoSuchFileException -> L20
            java.lang.String r1 = "newInputStream(this, *options)"
            Yue.C3329.m13905(r0, r1)     // Catch: java.nio.file.NoSuchFileException -> L20
            Yue.ۥۣۢ۟ۦ r4 = Yue.C4603.m18396(r0)     // Catch: java.nio.file.NoSuchFileException -> L20
            return r4
        L20:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such file: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final java.util.List<Yue.C4701> m17261(Yue.C4701 r6, boolean r7) {
            r5 = this;
            java.nio.file.Path r0 = r5.m17262(r6)
            r1 = 0
            r2 = 1
            r3 = 0
            java.util.List r6 = Yue.C4736.m18878(r0, r3, r2, r3)     // Catch: java.lang.Exception -> L2e
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L14:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r6.next()
            java.nio.file.Path r0 = (java.nio.file.Path) r0
            Yue.ۥۣۡۧۧ$ۥ r4 = Yue.C4701.f14928
            Yue.ۥۣۡۧۧ r0 = Yue.C4701.C4702.m18673(r4, r0, r1, r2, r3)
            r7.add(r0)
            goto L14
        L2a:
            Yue.C1215.m6242(r7)
            return r7
        L2e:
            if (r7 == 0) goto L6c
            java.nio.file.LinkOption[] r7 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
            java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
            boolean r7 = java.nio.file.Files.exists(r0, r7)
            if (r7 != 0) goto L55
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no such file: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L55:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to list "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L6c:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final java.nio.file.Path m17262(Yue.C4701 r3) {
            r2 = this;
            java.nio.file.FileSystem r0 = r2.f13952
            java.lang.String r3 = r3.toString()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r3 = r0.getPath(r3, r1)
            java.lang.String r0 = "getPath(...)"
            Yue.C3329.m13905(r3, r0)
            return r3
    }
}
