package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1284#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
public class C2395 extends Yue.C2394 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۧ$ۥ, reason: contains not printable characters */
    public static final class C2396 extends Yue.AbstractC3560 implements Yue.InterfaceC2839 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C2395.C2396 f7818 = null;

        static {
                Yue.ۥ۠ۢ۟ۧ$ۥ r0 = new Yue.ۥ۠ۢ۟ۧ$ۥ
                r0.<init>()
                Yue.C2395.C2396.f7818 = r0
                return
        }

        public C2396() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.io.File r1 = (java.io.File) r1
                java.io.IOException r2 = (java.io.IOException) r2
                java.lang.Void r1 = r0.m11069(r1, r2)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Void m11069(@Yue.InterfaceC4418 java.io.File r2, @Yue.InterfaceC4418 java.io.IOException r3) {
                r1 = this;
                java.lang.String r0 = "<anonymous parameter 0>"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r2 = "exception"
                Yue.C3329.m13906(r3, r2)
                throw r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۧ$ۥ۟, reason: contains not printable characters */
    public static final class C2397 extends Yue.AbstractC3560 implements Yue.InterfaceC2839<java.io.File, java.io.IOException, Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2839<java.io.File, java.io.IOException, Yue.EnumC4614> f7819;

        public C2397(Yue.InterfaceC2839<? super java.io.File, ? super java.io.IOException, ? extends Yue.EnumC4614> r1) {
                r0 = this;
                r0.f7819 = r1
                r1 = 2
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.io.File r1, java.io.IOException r2) {
                r0 = this;
                java.io.File r1 = (java.io.File) r1
                java.io.IOException r2 = (java.io.IOException) r2
                r0.m11070(r1, r2)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m11070(@Yue.InterfaceC4418 java.io.File r2, @Yue.InterfaceC4418 java.io.IOException r3) {
                r1 = this;
                java.lang.String r0 = "f"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "e"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥۣ۠ۢۢ<java.io.File, java.io.IOException, Yue.ۥۣۡۡۨ> r0 = r1.f7819
                java.lang.Object r3 = r0.invoke(r2, r3)
                Yue.ۥۣۡۡۨ r0 = Yue.EnumC4614.f14720
                if (r3 == r0) goto L15
                return
            L15:
                Yue.ۥۢۡ۟ۨ r3 = new Yue.ۥۢۡ۟ۨ
                r3.<init>(r2)
                throw r3
        }
    }

    public C2395() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final boolean m11041(@Yue.InterfaceC4418 java.io.File r11, @Yue.InterfaceC4418 java.io.File r12, boolean r13, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.io.File, ? super java.io.IOException, ? extends Yue.EnumC4614> r14) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r11, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r12, r0)
            java.lang.String r0 = "onError"
            Yue.C3329.m13906(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2e
            Yue.ۥۣۡۢۢ r12 = new Yue.ۥۣۡۢۢ
            r7 = 2
            r8 = 0
            r5 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.invoke(r11, r12)
            Yue.ۥۣۡۡۨ r12 = Yue.EnumC4614.f14720
            if (r11 == r12) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            return r1
        L2e:
            Yue.ۥ۠ۡۨۦ r0 = Yue.C2394.m11040(r11)     // Catch: Yue.C6136 -> Ld7
            Yue.ۥ۠ۢ۟ۧ$ۥ۟ r3 = new Yue.ۥ۠ۢ۟ۧ$ۥ۟     // Catch: Yue.C6136 -> Ld7
            r3.<init>(r14)     // Catch: Yue.C6136 -> Ld7
            Yue.ۥ۠ۡۨۦ r0 = r0.m10957(r3)     // Catch: Yue.C6136 -> Ld7
            java.util.Iterator r0 = r0.iterator()     // Catch: Yue.C6136 -> Ld7
        L3f:
            boolean r3 = r0.hasNext()     // Catch: Yue.C6136 -> Ld7
            if (r3 == 0) goto Ld6
            java.lang.Object r3 = r0.next()     // Catch: Yue.C6136 -> Ld7
            java.io.File r3 = (java.io.File) r3     // Catch: Yue.C6136 -> Ld7
            boolean r4 = r3.exists()     // Catch: Yue.C6136 -> Ld7
            if (r4 != 0) goto L66
            Yue.ۥۣۡۢۢ r10 = new Yue.ۥۣۡۢۢ     // Catch: Yue.C6136 -> Ld7
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r6 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: Yue.C6136 -> Ld7
            java.lang.Object r3 = r14.invoke(r3, r10)     // Catch: Yue.C6136 -> Ld7
            Yue.ۥۣۡۡۨ r4 = Yue.EnumC4614.f14720     // Catch: Yue.C6136 -> Ld7
            if (r3 != r4) goto L3f
            return r2
        L66:
            java.lang.String r4 = m11067(r3, r11)     // Catch: Yue.C6136 -> Ld7
            java.io.File r5 = new java.io.File     // Catch: Yue.C6136 -> Ld7
            r5.<init>(r12, r4)     // Catch: Yue.C6136 -> Ld7
            boolean r4 = r5.exists()     // Catch: Yue.C6136 -> Ld7
            if (r4 == 0) goto La7
            boolean r4 = r3.isDirectory()     // Catch: Yue.C6136 -> Ld7
            if (r4 == 0) goto L81
            boolean r4 = r5.isDirectory()     // Catch: Yue.C6136 -> Ld7
            if (r4 != 0) goto La7
        L81:
            if (r13 != 0) goto L84
            goto L97
        L84:
            boolean r4 = r5.isDirectory()     // Catch: Yue.C6136 -> Ld7
            if (r4 == 0) goto L91
            boolean r4 = m11049(r5)     // Catch: Yue.C6136 -> Ld7
            if (r4 != 0) goto La7
            goto L97
        L91:
            boolean r4 = r5.delete()     // Catch: Yue.C6136 -> Ld7
            if (r4 != 0) goto La7
        L97:
            Yue.ۥ۠ۡۧۦ r4 = new Yue.ۥ۠ۡۧۦ     // Catch: Yue.C6136 -> Ld7
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch: Yue.C6136 -> Ld7
            java.lang.Object r3 = r14.invoke(r5, r4)     // Catch: Yue.C6136 -> Ld7
            Yue.ۥۣۡۡۨ r4 = Yue.EnumC4614.f14720     // Catch: Yue.C6136 -> Ld7
            if (r3 != r4) goto L3f
            return r2
        La7:
            boolean r4 = r3.isDirectory()     // Catch: Yue.C6136 -> Ld7
            if (r4 == 0) goto Lb1
            r5.mkdirs()     // Catch: Yue.C6136 -> Ld7
            goto L3f
        Lb1:
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = m11044(r4, r5, r6, r7, r8, r9)     // Catch: Yue.C6136 -> Ld7
            long r4 = r4.length()     // Catch: Yue.C6136 -> Ld7
            long r6 = r3.length()     // Catch: Yue.C6136 -> Ld7
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L3f
            java.io.IOException r4 = new java.io.IOException     // Catch: Yue.C6136 -> Ld7
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch: Yue.C6136 -> Ld7
            java.lang.Object r3 = r14.invoke(r3, r4)     // Catch: Yue.C6136 -> Ld7
            Yue.ۥۣۡۡۨ r4 = Yue.EnumC4614.f14720     // Catch: Yue.C6136 -> Ld7
            if (r3 != r4) goto L3f
            return r2
        Ld6:
            return r1
        Ld7:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ boolean m11042(java.io.File r0, java.io.File r1, boolean r2, Yue.InterfaceC2839 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            Yue.ۥ۠ۢ۟ۧ$ۥ r3 = Yue.C2395.C2396.f7818
        Lb:
            boolean r0 = m11041(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final java.io.File m11043(@Yue.InterfaceC4418 java.io.File r6, @Yue.InterfaceC4418 java.io.File r7, boolean r8, int r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r7, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L71
            boolean r0 = r7.exists()
            if (r0 == 0) goto L2f
            if (r8 == 0) goto L27
            boolean r8 = r7.delete()
            if (r8 == 0) goto L1f
            goto L2f
        L1f:
            Yue.ۥ۠ۡۧۦ r8 = new Yue.ۥ۠ۡۧۦ
            java.lang.String r9 = "Tried to overwrite the destination, but failed to delete it."
            r8.<init>(r6, r7, r9)
            throw r8
        L27:
            Yue.ۥ۠ۡۧۦ r8 = new Yue.ۥ۠ۡۧۦ
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L2f:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L44
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L3c
            goto L61
        L3c:
            Yue.ۥ۠ۡۨۥ r8 = new Yue.ۥ۠ۡۨۥ
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L44:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L4d
            r8.mkdirs()
        L4d:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L62
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L62
            Yue.C0877.m5023(r8, r6, r9)     // Catch: java.lang.Throwable -> L64
            r9 = 0
            Yue.C1173.m6114(r6, r9)     // Catch: java.lang.Throwable -> L62
            Yue.C1173.m6114(r8, r9)
        L61:
            return r7
        L62:
            r6 = move-exception
            goto L6b
        L64:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L66
        L66:
            r9 = move-exception
            Yue.C1173.m6114(r6, r7)     // Catch: java.lang.Throwable -> L62
            throw r9     // Catch: java.lang.Throwable -> L62
        L6b:
            throw r6     // Catch: java.lang.Throwable -> L6c
        L6c:
            r7 = move-exception
            Yue.C1173.m6114(r8, r6)
            throw r7
        L71:
            Yue.ۥۣۡۢۢ r7 = new Yue.ۥۣۡۢۢ
            r4 = 2
            r5 = 0
            r2 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static /* synthetic */ java.io.File m11044(java.io.File r0, java.io.File r1, boolean r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 8192(0x2000, float:1.148E-41)
        Lb:
            java.io.File r0 = m11043(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final java.io.File m11045(@Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4543 java.lang.String r2, @Yue.InterfaceC4543 java.io.File r3) {
            java.lang.String r0 = "prefix"
            Yue.C3329.m13906(r1, r0)
            java.io.File r1 = java.io.File.createTempFile(r1, r2, r3)
            r1.delete()
            boolean r2 = r1.mkdir()
            if (r2 == 0) goto L18
            java.lang.String r2 = "dir"
            Yue.C3329.m13905(r1, r2)
            return r1
        L18:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Unable to create temporary directory "
            r3.append(r0)
            r3.append(r1)
            r1 = 46
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static /* synthetic */ java.io.File m11046(java.lang.String r1, java.lang.String r2, java.io.File r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "tmp"
        L6:
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto Lc
            r2 = r0
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = r0
        L11:
            java.io.File r1 = m11045(r1, r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final java.io.File m11047(@Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4543 java.lang.String r2, @Yue.InterfaceC4543 java.io.File r3) {
            java.lang.String r0 = "prefix"
            Yue.C3329.m13906(r1, r0)
            java.io.File r1 = java.io.File.createTempFile(r1, r2, r3)
            java.lang.String r2 = "createTempFile(prefix, suffix, directory)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static /* synthetic */ java.io.File m11048(java.lang.String r1, java.lang.String r2, java.io.File r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "tmp"
        L6:
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto Lc
            r2 = r0
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = r0
        L11:
            java.io.File r1 = m11047(r1, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final boolean m11049(@Yue.InterfaceC4418 java.io.File r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥ۠ۡۨۦ r4 = Yue.C2394.m11039(r4)
            java.util.Iterator r4 = r4.iterator()
            r0 = 1
        Le:
            r1 = r0
        Lf:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r4.next()
            java.io.File r2 = (java.io.File) r2
            boolean r3 = r2.delete()
            if (r3 != 0) goto L27
            boolean r2 = r2.exists()
            if (r2 != 0) goto L2a
        L27:
            if (r1 == 0) goto L2a
            goto Le
        L2a:
            r1 = 0
            goto Lf
        L2c:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m11050(@Yue.InterfaceC4418 java.io.File r3, @Yue.InterfaceC4418 java.io.File r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥ۠ۡۨ۠ r0 = Yue.C2391.m11006(r3)
            Yue.ۥ۠ۡۨ۠ r1 = Yue.C2391.m11006(r4)
            boolean r2 = r1.m10876()
            if (r2 == 0) goto L1d
            boolean r3 = Yue.C3329.m13897(r3, r4)
            return r3
        L1d:
            int r3 = r0.m10875()
            int r4 = r1.m10875()
            int r3 = r3 - r4
            if (r3 >= 0) goto L2a
            r3 = 0
            goto L3e
        L2a:
            java.util.List r4 = r0.m10874()
            int r0 = r0.m10875()
            java.util.List r3 = r4.subList(r3, r0)
            java.util.List r4 = r1.m10874()
            boolean r3 = r3.equals(r4)
        L3e:
            return r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final boolean m11051(@Yue.InterfaceC4418 java.io.File r1, @Yue.InterfaceC4418 java.lang.String r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r1 = m11050(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String m11052(@Yue.InterfaceC4418 java.io.File r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "name"
            Yue.C3329.m13905(r2, r0)
            r0 = 46
            java.lang.String r1 = ""
            java.lang.String r2 = Yue.C5989.m22467(r2, r0, r1)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String m11053(@Yue.InterfaceC4418 java.io.File r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            char r2 = java.io.File.separatorChar
            r0 = 47
            java.lang.String r1 = "path"
            java.lang.String r7 = r7.getPath()
            Yue.C3329.m13905(r7, r1)
            if (r2 == r0) goto L1e
            r5 = 4
            r6 = 0
            r3 = 47
            r4 = 0
            r1 = r7
            java.lang.String r7 = Yue.C5988.m22304(r1, r2, r3, r4, r5, r6)
        L1e:
            return r7
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final java.lang.String m11054(@Yue.InterfaceC4418 java.io.File r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "name"
            Yue.C3329.m13905(r3, r0)
            r0 = 0
            r1 = 2
            java.lang.String r2 = "."
            java.lang.String r3 = Yue.C5989.m22478(r3, r2, r0, r1, r0)
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final java.io.File m11055(@Yue.InterfaceC4418 java.io.File r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r10, r0)
            Yue.ۥ۠ۡۨ۠ r10 = Yue.C2391.m11006(r10)
            java.io.File r0 = r10.m10872()
            java.util.List r10 = r10.m10874()
            java.util.List r1 = m11057(r10)
            java.lang.String r2 = java.io.File.separator
            java.lang.String r10 = "separator"
            Yue.C3329.m13905(r2, r10)
            r8 = 62
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r10 = Yue.C1219.m6398(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.io.File r10 = m11062(r0, r10)
            return r10
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final Yue.C2361 m11056(Yue.C2361 r2) {
            Yue.ۥ۠ۡۨ۠ r0 = new Yue.ۥ۠ۡۨ۠
            java.io.File r1 = r2.m10872()
            java.util.List r2 = r2.m10874()
            java.util.List r2 = m11057(r2)
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final java.util.List<java.io.File> m11057(java.util.List<? extends java.io.File> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r4.next()
            java.io.File r1 = (java.io.File) r1
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "."
            boolean r3 = Yue.C3329.m13897(r2, r3)
            if (r3 != 0) goto Ld
            java.lang.String r3 = ".."
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 == 0) goto L51
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L4d
            java.lang.Object r2 = Yue.C1219.m6401(r0)
            java.io.File r2 = (java.io.File) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 != 0) goto L4d
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            goto Ld
        L4d:
            r0.add(r1)
            goto Ld
        L51:
            r0.add(r1)
            goto Ld
        L55:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final java.io.File m11058(@Yue.InterfaceC4418 java.io.File r1, @Yue.InterfaceC4418 java.io.File r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "base"
            Yue.C3329.m13906(r2, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = m11067(r1, r2)
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final java.io.File m11059(@Yue.InterfaceC4418 java.io.File r1, @Yue.InterfaceC4418 java.io.File r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "base"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r1 = m11068(r1, r2)
            if (r1 == 0) goto L16
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final java.io.File m11060(@Yue.InterfaceC4418 java.io.File r1, @Yue.InterfaceC4418 java.io.File r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "base"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = m11068(r1, r2)
            if (r2 == 0) goto L15
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
        L15:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final java.io.File m11061(@Yue.InterfaceC4418 java.io.File r4, @Yue.InterfaceC4418 java.io.File r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "relative"
            Yue.C3329.m13906(r5, r0)
            boolean r0 = Yue.C2391.m11004(r5)
            if (r0 == 0) goto L11
            return r5
        L11:
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "this.toString()"
            Yue.C3329.m13905(r4, r0)
            int r0 = r4.length()
            if (r0 != 0) goto L21
            goto L2c
        L21:
            char r0 = java.io.File.separatorChar
            r1 = 2
            r2 = 0
            r3 = 0
            boolean r1 = Yue.C5989.m22347(r4, r0, r3, r1, r2)
            if (r1 == 0) goto L41
        L2c:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            goto L59
        L41:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            r0 = r1
        L59:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final java.io.File m11062(@Yue.InterfaceC4418 java.io.File r1, @Yue.InterfaceC4418 java.lang.String r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "relative"
            Yue.C3329.m13906(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r1 = m11061(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final java.io.File m11063(@Yue.InterfaceC4418 java.io.File r2, @Yue.InterfaceC4418 java.io.File r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "relative"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۠ۡۨ۠ r2 = Yue.C2391.m11006(r2)
            int r0 = r2.m10875()
            if (r0 != 0) goto L1c
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ".."
            r0.<init>(r1)
            goto L27
        L1c:
            int r0 = r2.m10875()
            int r0 = r0 + (-1)
            r1 = 0
            java.io.File r0 = r2.m10877(r1, r0)
        L27:
            java.io.File r2 = r2.m10872()
            java.io.File r2 = m11061(r2, r0)
            java.io.File r2 = m11061(r2, r3)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final java.io.File m11064(@Yue.InterfaceC4418 java.io.File r1, @Yue.InterfaceC4418 java.lang.String r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "relative"
            Yue.C3329.m13906(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r1 = m11063(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final boolean m11065(@Yue.InterfaceC4418 java.io.File r3, @Yue.InterfaceC4418 java.io.File r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥ۠ۡۨ۠ r3 = Yue.C2391.m11006(r3)
            Yue.ۥ۠ۡۨ۠ r4 = Yue.C2391.m11006(r4)
            java.io.File r0 = r3.m10872()
            java.io.File r1 = r4.m10872()
            boolean r0 = Yue.C3329.m13897(r0, r1)
            r1 = 0
            if (r0 != 0) goto L22
            return r1
        L22:
            int r0 = r3.m10875()
            int r2 = r4.m10875()
            if (r0 >= r2) goto L2d
            goto L41
        L2d:
            java.util.List r3 = r3.m10874()
            int r0 = r4.m10875()
            java.util.List r3 = r3.subList(r1, r0)
            java.util.List r4 = r4.m10874()
            boolean r1 = r3.equals(r4)
        L41:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final boolean m11066(@Yue.InterfaceC4418 java.io.File r1, @Yue.InterfaceC4418 java.lang.String r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r1 = m11065(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final java.lang.String m11067(@Yue.InterfaceC4418 java.io.File r3, @Yue.InterfaceC4418 java.io.File r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "base"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = m11068(r3, r4)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "this and base files have different roots: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " and "
            r1.append(r3)
            r1.append(r4)
            r3 = 46
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final java.lang.String m11068(java.io.File r17, java.io.File r18) {
            Yue.ۥ۠ۡۨ۠ r0 = Yue.C2391.m11006(r17)
            Yue.ۥ۠ۡۨ۠ r0 = m11056(r0)
            Yue.ۥ۠ۡۨ۠ r1 = Yue.C2391.m11006(r18)
            Yue.ۥ۠ۡۨ۠ r1 = m11056(r1)
            java.io.File r2 = r0.m10872()
            java.io.File r3 = r1.m10872()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            r3 = 0
            if (r2 != 0) goto L20
            return r3
        L20:
            int r2 = r1.m10875()
            int r4 = r0.m10875()
            int r5 = java.lang.Math.min(r4, r2)
            r6 = 0
        L2d:
            if (r6 >= r5) goto L48
            java.util.List r7 = r0.m10874()
            java.lang.Object r7 = r7.get(r6)
            java.util.List r8 = r1.m10874()
            java.lang.Object r8 = r8.get(r6)
            boolean r7 = Yue.C3329.m13897(r7, r8)
            if (r7 == 0) goto L48
            int r6 = r6 + 1
            goto L2d
        L48:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r7 = r2 + (-1)
            if (r6 > r7) goto L77
        L51:
            java.util.List r8 = r1.m10874()
            java.lang.Object r8 = r8.get(r7)
            java.io.File r8 = (java.io.File) r8
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = ".."
            boolean r8 = Yue.C3329.m13897(r8, r9)
            if (r8 == 0) goto L68
            return r3
        L68:
            r5.append(r9)
            if (r7 == r6) goto L72
            char r8 = java.io.File.separatorChar
            r5.append(r8)
        L72:
            if (r7 == r6) goto L77
            int r7 = r7 + (-1)
            goto L51
        L77:
            if (r6 >= r4) goto L9c
            if (r6 >= r2) goto L80
            char r1 = java.io.File.separatorChar
            r5.append(r1)
        L80:
            java.util.List r0 = r0.m10874()
            java.util.List r7 = Yue.C1219.m6336(r0, r6)
            java.lang.String r9 = java.io.File.separator
            java.lang.String r0 = "separator"
            Yue.C3329.m13905(r9, r0)
            r15 = 124(0x7c, float:1.74E-43)
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r8 = r5
            Yue.C1219.m6396(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L9c:
            java.lang.String r0 = r5.toString()
            return r0
    }
}
