package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nNioSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioSystemFileSystem.kt\nokio/NioSystemFileSystem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public class C4391 extends Yue.C3430 {
    public C4391() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.C3430
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "NioSystemFileSystem"
            return r0
    }

    @Override // Yue.C3430, Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo10920(@Yue.InterfaceC4418 Yue.C4701 r4, @Yue.InterfaceC4418 Yue.C4701 r5) {
            r3 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r5, r0)
            java.nio.file.Path r4 = r4.m18669()     // Catch: java.nio.file.NoSuchFileException -> L23 java.lang.UnsupportedOperationException -> L25
            java.nio.file.Path r5 = r5.m18669()     // Catch: java.nio.file.NoSuchFileException -> L23 java.lang.UnsupportedOperationException -> L25
            r0 = 2
            java.nio.file.CopyOption[] r0 = new java.nio.file.CopyOption[r0]     // Catch: java.nio.file.NoSuchFileException -> L23 java.lang.UnsupportedOperationException -> L25
            java.nio.file.StandardCopyOption r1 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch: java.nio.file.NoSuchFileException -> L23 java.lang.UnsupportedOperationException -> L25
            r2 = 0
            r0[r2] = r1     // Catch: java.nio.file.NoSuchFileException -> L23 java.lang.UnsupportedOperationException -> L25
            java.nio.file.StandardCopyOption r1 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.nio.file.NoSuchFileException -> L23 java.lang.UnsupportedOperationException -> L25
            r2 = 1
            r0[r2] = r1     // Catch: java.nio.file.NoSuchFileException -> L23 java.lang.UnsupportedOperationException -> L25
            java.nio.file.Files.move(r4, r5, r0)     // Catch: java.nio.file.NoSuchFileException -> L23 java.lang.UnsupportedOperationException -> L25
            return
        L23:
            r4 = move-exception
            goto L2d
        L25:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "atomic move not supported"
            r4.<init>(r5)
            throw r4
        L2d:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r4 = r4.getMessage()
            r5.<init>(r4)
            throw r5
    }

    @Override // Yue.C3430, Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo10927(@Yue.InterfaceC4418 Yue.C4701 r2, @Yue.InterfaceC4418 Yue.C4701 r3) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r3, r0)
            java.nio.file.Path r2 = r2.m18669()
            java.nio.file.Path r3 = r3.m18669()
            r0 = 0
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r0]
            java.nio.file.Files.createSymbolicLink(r2, r3, r0)
            return
    }

    @Override // Yue.C3430, Yue.AbstractC2370
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public Yue.C2359 mo10938(@Yue.InterfaceC4418 Yue.C4701 r2) {
            r1 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r2, r0)
            java.nio.file.Path r2 = r2.m18669()
            Yue.ۥ۠ۡۨ r2 = r1.m17263(r2)
            return r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final Yue.C2359 m17263(@Yue.InterfaceC4418 java.nio.file.Path r15) {
            r14 = this;
            java.lang.String r0 = "nioPath"
            Yue.C3329.m13906(r15, r0)
            r0 = 0
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r1 = java.nio.file.attribute.BasicFileAttributes.class
            java.nio.file.LinkOption r2 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Throwable -> L6b
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[]{r2}     // Catch: java.lang.Throwable -> L6b
            java.nio.file.attribute.BasicFileAttributes r1 = java.nio.file.Files.readAttributes(r15, r1, r2)     // Catch: java.lang.Throwable -> L6b
            boolean r2 = r1.isSymbolicLink()
            if (r2 == 0) goto L1d
            java.nio.file.Path r15 = java.nio.file.Files.readSymbolicLink(r15)
            goto L1e
        L1d:
            r15 = r0
        L1e:
            Yue.ۥ۠ۡۨ r13 = new Yue.ۥ۠ۡۨ
            boolean r3 = r1.isRegularFile()
            boolean r4 = r1.isDirectory()
            if (r15 == 0) goto L34
            Yue.ۥۣۡۧۧ$ۥ r2 = Yue.C4701.f14928
            r5 = 0
            r6 = 1
            Yue.ۥۣۡۧۧ r15 = Yue.C4701.C4702.m18673(r2, r15, r5, r6, r0)
            r5 = r15
            goto L35
        L34:
            r5 = r0
        L35:
            long r6 = r1.size()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.nio.file.attribute.FileTime r15 = r1.creationTime()
            if (r15 == 0) goto L49
            java.lang.Long r15 = r14.m17264(r15)
            r7 = r15
            goto L4a
        L49:
            r7 = r0
        L4a:
            java.nio.file.attribute.FileTime r15 = r1.lastModifiedTime()
            if (r15 == 0) goto L56
            java.lang.Long r15 = r14.m17264(r15)
            r8 = r15
            goto L57
        L56:
            r8 = r0
        L57:
            java.nio.file.attribute.FileTime r15 = r1.lastAccessTime()
            if (r15 == 0) goto L61
            java.lang.Long r0 = r14.m17264(r15)
        L61:
            r9 = r0
            r11 = 128(0x80, float:1.8E-43)
            r12 = 0
            r10 = 0
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        L6b:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final java.lang.Long m17264(java.nio.file.attribute.FileTime r5) {
            r4 = this;
            long r0 = r5.toMillis()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r0 = r5.longValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L14
        L13:
            r5 = 0
        L14:
            return r5
    }
}
