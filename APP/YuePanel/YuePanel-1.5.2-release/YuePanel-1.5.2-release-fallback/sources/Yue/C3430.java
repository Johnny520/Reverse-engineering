package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n11400#2,3:159\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:159,3\n*E\n"})
public class C3430 extends Yue.AbstractC2370 {
    public C3430() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    private final java.util.List<Yue.C4701> m14202(Yue.C4701 r5, boolean r6) {
            r4 = this;
            java.io.File r0 = r5.m18668()
            java.lang.String[] r1 = r0.list()
            if (r1 != 0) goto L42
            if (r6 == 0) goto L40
            boolean r6 = r0.exists()
            if (r6 != 0) goto L29
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no such file: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L29:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to list "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L40:
            r5 = 0
            return r5
        L42:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r1.length
            r2 = 0
        L49:
            if (r2 >= r0) goto L5a
            r3 = r1[r2]
            Yue.C3329.m13903(r3)
            Yue.ۥۣۡۧۧ r3 = r5.m18666(r3)
            r6.add(r3)
            int r2 = r2 + 1
            goto L49
        L5a:
            Yue.C1215.m6242(r6)
            return r6
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "JvmSystemFileSystem"
            return r0
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Yue.InterfaceC5794 mo10919(@Yue.InterfaceC4418 Yue.C4701 r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r2, r0)
            if (r3 == 0) goto La
            r1.m14204(r2)
        La:
            java.io.File r2 = r2.m18668()
            r3 = 1
            Yue.ۥۣۢ۟ۡ r2 = Yue.C4603.m18390(r2, r3)
            return r2
    }

    @Override // Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo10920(@Yue.InterfaceC4418 Yue.C4701 r4, @Yue.InterfaceC4418 Yue.C4701 r5) {
            r3 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r5, r0)
            java.io.File r0 = r4.m18668()
            java.io.File r1 = r5.m18668()
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto L19
            return
        L19:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to move "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " to "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.C4701 mo10921(@Yue.InterfaceC4418 Yue.C4701 r5) {
            r4 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r5, r0)
            java.io.File r5 = r5.m18668()
            java.io.File r5 = r5.getCanonicalFile()
            boolean r0 = r5.exists()
            if (r0 == 0) goto L20
            Yue.ۥۣۡۧۧ$ۥ r0 = Yue.C4701.f14928
            Yue.C3329.m13903(r5)
            r1 = 1
            r2 = 0
            r3 = 0
            Yue.ۥۣۡۧۧ r5 = Yue.C4701.C4702.m18671(r0, r5, r3, r1, r2)
            return r5
        L20:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r0 = "no such file"
            r5.<init>(r0)
            throw r5
    }

    @Override // Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo10926(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r3, r0)
            java.io.File r0 = r3.m18668()
            boolean r0 = r0.mkdir()
            if (r0 != 0) goto L4d
            Yue.ۥ۠ۡۨ r0 = r2.mo10938(r3)
            if (r0 == 0) goto L36
            boolean r0 = r0.m10864()
            r1 = 1
            if (r0 != r1) goto L36
            if (r4 != 0) goto L1f
            return
        L1f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " already exists."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L36:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to create directory: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L4d:
            return
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
            java.lang.String r3 = "unsupported"
            r2.<init>(r3)
            throw r2
    }

    @Override // Yue.AbstractC2370
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo10929(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4d
            java.io.File r0 = r3.m18668()
            boolean r1 = r0.delete()
            if (r1 != 0) goto L4c
            boolean r0 = r0.exists()
            if (r0 != 0) goto L35
            if (r4 != 0) goto L1e
            goto L4c
        L1e:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no such file: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L35:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to delete "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L4c:
            return
        L4d:
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException
            java.lang.String r4 = "interrupted"
            r3.<init>(r4)
            throw r3
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public java.util.List<Yue.C4701> mo10933(@Yue.InterfaceC4418 Yue.C4701 r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r2, r0)
            r0 = 1
            java.util.List r2 = r1.m14202(r2, r0)
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
            java.util.List r2 = r1.m14202(r2, r0)
            return r2
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public Yue.C2359 mo10938(@Yue.InterfaceC4418 Yue.C4701 r13) {
            r12 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r13, r0)
            java.io.File r13 = r13.m18668()
            boolean r1 = r13.isFile()
            boolean r2 = r13.isDirectory()
            long r3 = r13.lastModified()
            long r5 = r13.length()
            if (r1 != 0) goto L2f
            if (r2 != 0) goto L2f
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L2f
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L2f
            boolean r13 = r13.exists()
            if (r13 != 0) goto L2f
            r13 = 0
            return r13
        L2f:
            Yue.ۥ۠ۡۨ r13 = new Yue.ۥ۠ۡۨ
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r9 = 128(0x80, float:1.8E-43)
            r10 = 0
            r3 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r0 = r13
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r13
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public Yue.AbstractC2355 mo10939(@Yue.InterfaceC4418 Yue.C4701 r4) {
            r3 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥ۠ۦ۠ۨ r0 = new Yue.ۥ۠ۦ۠ۨ
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.io.File r4 = r4.m18668()
            java.lang.String r2 = "r"
            r1.<init>(r4, r2)
            r4 = 0
            r0.<init>(r4, r1)
            return r0
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public Yue.AbstractC2355 mo10941(@Yue.InterfaceC4418 Yue.C4701 r2, boolean r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r2, r0)
            if (r3 == 0) goto L16
            if (r4 != 0) goto La
            goto L16
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot require mustCreate and mustExist at the same time."
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L16:
            if (r3 == 0) goto L1b
            r1.m14203(r2)
        L1b:
            if (r4 == 0) goto L20
            r1.m14204(r2)
        L20:
            Yue.ۥ۠ۦ۠ۨ r3 = new Yue.ۥ۠ۦ۠ۨ
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile
            java.io.File r2 = r2.m18668()
            java.lang.String r0 = "rw"
            r4.<init>(r2, r0)
            r2 = 1
            r3.<init>(r2, r4)
            return r3
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public Yue.InterfaceC5794 mo10943(@Yue.InterfaceC4418 Yue.C4701 r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r3, r0)
            if (r4 == 0) goto La
            r2.m14203(r3)
        La:
            java.io.File r3 = r3.m18668()
            r4 = 1
            r0 = 0
            r1 = 0
            Yue.ۥۣۢ۟ۡ r3 = Yue.C4603.m18394(r3, r1, r4, r0)
            return r3
    }

    @Override // Yue.AbstractC2370
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public Yue.InterfaceC5839 mo10944(@Yue.InterfaceC4418 Yue.C4701 r2) {
            r1 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r2, r0)
            java.io.File r2 = r2.m18668()
            Yue.ۥۣۢ۟ۦ r2 = Yue.C4603.m18395(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final void m14203(Yue.C4701 r3) {
            r2 = this;
            boolean r0 = r2.m10932(r3)
            if (r0 != 0) goto L7
            return
        L7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " already exists."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m14204(Yue.C4701 r3) {
            r2 = this;
            boolean r0 = r2.m10932(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " doesn't exist."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
