package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC2309
public final class C4716 implements Yue.InterfaceC5609<java.nio.file.Path> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.nio.file.Path f14961;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.EnumC4722[] f14962;

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {184, 190}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @Yue.InterfaceC5840({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n98#1:178,15\n*E\n"})
    public static final class C4717 extends Yue.AbstractC5386 implements Yue.InterfaceC2839<Yue.AbstractC5611<? super java.nio.file.Path>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public java.lang.Object f14963;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public java.lang.Object f14964;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public java.lang.Object f14965;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public java.lang.Object f14966;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public java.lang.Object f14967;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public int f14968;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f14969;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4716 f14970;

        public C4717(Yue.C4716 r1, Yue.InterfaceC1598<? super Yue.C4716.C4717> r2) {
                r0 = this;
                r0.f14970 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                Yue.ۥۣۡۨۧ$ۥ r0 = new Yue.ۥۣۡۨۧ$ۥ
                Yue.ۥۣۡۨۧ r1 = r2.f14970
                r0.<init>(r1, r4)
                r0.f14969 = r3
                return r0
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.AbstractC5611<? super java.nio.file.Path> r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥۡۨۢ۠ r1 = (Yue.AbstractC5611) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m18746(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r12.f14968
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L44
                if (r1 == r4) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r12.f14964
                Yue.ۥ۠۟ۡۥ r1 = (Yue.C1857) r1
                java.lang.Object r5 = r12.f14963
                Yue.ۥ۟ۡۧۡ r5 = (Yue.C0561) r5
                java.lang.Object r6 = r12.f14969
                Yue.ۥۡۨۢ۠ r6 = (Yue.AbstractC5611) r6
                Yue.C5391.m20403(r13)
                goto L7d
            L1f:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L27:
                java.lang.Object r1 = r12.f14967
                java.nio.file.Path r1 = (java.nio.file.Path) r1
                java.lang.Object r5 = r12.f14966
                Yue.ۥۣۡۨۧ r5 = (Yue.C4716) r5
                java.lang.Object r6 = r12.f14965
                Yue.ۥۣۡۨۢ r6 = (Yue.C4709) r6
                java.lang.Object r7 = r12.f14964
                Yue.ۥ۠۟ۡۥ r7 = (Yue.C1857) r7
                java.lang.Object r8 = r12.f14963
                Yue.ۥ۟ۡۧۡ r8 = (Yue.C0561) r8
                java.lang.Object r9 = r12.f14969
                Yue.ۥۡۨۢ۠ r9 = (Yue.AbstractC5611) r9
                Yue.C5391.m20403(r13)
                goto Ld0
            L44:
                Yue.C5391.m20403(r13)
                java.lang.Object r13 = r12.f14969
                Yue.ۥۡۨۢ۠ r13 = (Yue.AbstractC5611) r13
                Yue.ۥ۟ۡۧۡ r1 = new Yue.ۥ۟ۡۧۡ
                r1.<init>()
                Yue.ۥ۠۟ۡۥ r5 = new Yue.ۥ۠۟ۡۥ
                Yue.ۥۣۡۨۧ r6 = r12.f14970
                boolean r6 = Yue.C4716.m18735(r6)
                r5.<init>(r6)
                Yue.ۥۣۡۨۢ r6 = new Yue.ۥۣۡۨۢ
                Yue.ۥۣۡۨۧ r7 = r12.f14970
                java.nio.file.Path r7 = Yue.C4716.m18738(r7)
                Yue.ۥۣۡۨۧ r8 = r12.f14970
                java.nio.file.Path r8 = Yue.C4716.m18738(r8)
                Yue.ۥۣۡۨۧ r9 = r12.f14970
                java.nio.file.LinkOption[] r9 = Yue.C4716.m18737(r9)
                java.lang.Object r8 = Yue.C4719.m18749(r8, r9)
                r6.<init>(r7, r8, r3)
                r1.addLast(r6)
                r6 = r13
                r11 = r5
                r5 = r1
                r1 = r11
            L7d:
                boolean r13 = r5.isEmpty()
                r13 = r13 ^ r4
                if (r13 == 0) goto L128
                java.lang.Object r13 = r5.removeFirst()
                Yue.ۥۣۡۨۢ r13 = (Yue.C4709) r13
                Yue.ۥۣۡۨۧ r7 = r12.f14970
                java.nio.file.Path r8 = r13.m18702()
                java.nio.file.LinkOption[] r9 = Yue.C4716.m18737(r7)
                int r10 = r9.length
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r10)
                java.nio.file.LinkOption[] r9 = (java.nio.file.LinkOption[]) r9
                int r10 = r9.length
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r10)
                java.nio.file.LinkOption[] r9 = (java.nio.file.LinkOption[]) r9
                boolean r9 = java.nio.file.Files.isDirectory(r8, r9)
                if (r9 == 0) goto L101
                boolean r9 = Yue.C4719.m18748(r13)
                if (r9 != 0) goto Lf7
                boolean r9 = Yue.C4716.m18736(r7)
                if (r9 == 0) goto Ld7
                r12.f14969 = r6
                r12.f14963 = r5
                r12.f14964 = r1
                r12.f14965 = r13
                r12.f14966 = r7
                r12.f14967 = r8
                r12.f14968 = r4
                java.lang.Object r9 = r6.mo20973(r8, r12)
                if (r9 != r0) goto Lc9
                return r0
            Lc9:
                r9 = r6
                r6 = r13
                r11 = r7
                r7 = r1
                r1 = r8
                r8 = r5
                r5 = r11
            Ld0:
                r13 = r6
                r6 = r9
                r11 = r8
                r8 = r1
                r1 = r7
                r7 = r5
                r5 = r11
            Ld7:
                java.nio.file.LinkOption[] r7 = Yue.C4716.m18737(r7)
                int r9 = r7.length
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r9)
                java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
                int r9 = r7.length
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r9)
                java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
                boolean r7 = java.nio.file.Files.isDirectory(r8, r7)
                if (r7 == 0) goto L7d
                java.util.List r13 = r1.m8660(r13)
                r5.addAll(r13)
                goto L7d
            Lf7:
                java.nio.file.FileSystemLoopException r13 = new java.nio.file.FileSystemLoopException
                java.lang.String r0 = r8.toString()
                r13.<init>(r0)
                throw r13
            L101:
                java.nio.file.LinkOption r13 = java.nio.file.LinkOption.NOFOLLOW_LINKS
                java.nio.file.LinkOption[] r13 = new java.nio.file.LinkOption[]{r13}
                java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r4)
                java.nio.file.LinkOption[] r13 = (java.nio.file.LinkOption[]) r13
                boolean r13 = java.nio.file.Files.exists(r8, r13)
                if (r13 == 0) goto L7d
                r12.f14969 = r6
                r12.f14963 = r5
                r12.f14964 = r1
                r12.f14965 = r3
                r12.f14966 = r3
                r12.f14967 = r3
                r12.f14968 = r2
                java.lang.Object r13 = r6.mo20973(r8, r12)
                if (r13 != r0) goto L7d
                return r0
            L128:
                Yue.ۥۣۢ۠ۤ r13 = Yue.C6593.f23016
                return r13
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m18746(@Yue.InterfaceC4418 Yue.AbstractC5611<? super java.nio.file.Path> r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥۣۡۨۧ$ۥ r1 = (Yue.C4716.C4717) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۨۧ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {184, 190, 199, 205}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @Yue.InterfaceC5840({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n45#2,15:193\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n67#1:178,15\n78#1:193,15\n*E\n"})
    public static final class C4718 extends Yue.AbstractC5386 implements Yue.InterfaceC2839<Yue.AbstractC5611<? super java.nio.file.Path>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public java.lang.Object f14971;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public java.lang.Object f14972;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public java.lang.Object f14973;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public java.lang.Object f14974;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public java.lang.Object f14975;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public int f14976;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f14977;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4716 f14978;

        public C4718(Yue.C4716 r1, Yue.InterfaceC1598<? super Yue.C4716.C4718> r2) {
                r0 = this;
                r0.f14978 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                Yue.ۥۣۡۨۧ$ۥ۟ r0 = new Yue.ۥۣۡۨۧ$ۥ۟
                Yue.ۥۣۡۨۧ r1 = r2.f14978
                r0.<init>(r1, r4)
                r0.f14977 = r3
                return r0
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.AbstractC5611<? super java.nio.file.Path> r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥۡۨۢ۠ r1 = (Yue.AbstractC5611) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m18747(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r15) {
                r14 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r14.f14976
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 0
                r6 = 1
                if (r1 == 0) goto L69
                if (r1 == r6) goto L4c
                if (r1 == r4) goto L3b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                goto L3b
            L16:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1e:
                java.lang.Object r1 = r14.f14975
                java.nio.file.Path r1 = (java.nio.file.Path) r1
                java.lang.Object r4 = r14.f14974
                Yue.ۥۣۡۨۧ r4 = (Yue.C4716) r4
                java.lang.Object r7 = r14.f14973
                Yue.ۥۣۡۨۢ r7 = (Yue.C4709) r7
                java.lang.Object r8 = r14.f14972
                Yue.ۥ۠۟ۡۥ r8 = (Yue.C1857) r8
                java.lang.Object r9 = r14.f14971
                Yue.ۥ۟ۡۧۡ r9 = (Yue.C0561) r9
                java.lang.Object r10 = r14.f14977
                Yue.ۥۡۨۢ۠ r10 = (Yue.AbstractC5611) r10
                Yue.C5391.m20403(r15)
                goto L1a2
            L3b:
                java.lang.Object r1 = r14.f14972
                Yue.ۥ۠۟ۡۥ r1 = (Yue.C1857) r1
                java.lang.Object r4 = r14.f14971
                Yue.ۥ۟ۡۧۡ r4 = (Yue.C0561) r4
                java.lang.Object r7 = r14.f14977
                Yue.ۥۡۨۢ۠ r7 = (Yue.AbstractC5611) r7
                Yue.C5391.m20403(r15)
                goto L13c
            L4c:
                java.lang.Object r1 = r14.f14975
                java.nio.file.Path r1 = (java.nio.file.Path) r1
                java.lang.Object r4 = r14.f14974
                Yue.ۥۣۡۨۧ r4 = (Yue.C4716) r4
                java.lang.Object r7 = r14.f14973
                Yue.ۥۣۡۨۢ r7 = (Yue.C4709) r7
                java.lang.Object r8 = r14.f14972
                Yue.ۥ۠۟ۡۥ r8 = (Yue.C1857) r8
                java.lang.Object r9 = r14.f14971
                Yue.ۥ۟ۡۧۡ r9 = (Yue.C0561) r9
                java.lang.Object r10 = r14.f14977
                Yue.ۥۡۨۢ۠ r10 = (Yue.AbstractC5611) r10
                Yue.C5391.m20403(r15)
                goto Le2
            L69:
                Yue.C5391.m20403(r15)
                java.lang.Object r15 = r14.f14977
                r7 = r15
                Yue.ۥۡۨۢ۠ r7 = (Yue.AbstractC5611) r7
                Yue.ۥ۟ۡۧۡ r15 = new Yue.ۥ۟ۡۧۡ
                r15.<init>()
                Yue.ۥ۠۟ۡۥ r1 = new Yue.ۥ۠۟ۡۥ
                Yue.ۥۣۡۨۧ r8 = r14.f14978
                boolean r8 = Yue.C4716.m18735(r8)
                r1.<init>(r8)
                Yue.ۥۣۡۨۢ r8 = new Yue.ۥۣۡۨۢ
                Yue.ۥۣۡۨۧ r9 = r14.f14978
                java.nio.file.Path r9 = Yue.C4716.m18738(r9)
                Yue.ۥۣۡۨۧ r10 = r14.f14978
                java.nio.file.Path r10 = Yue.C4716.m18738(r10)
                Yue.ۥۣۡۨۧ r11 = r14.f14978
                java.nio.file.LinkOption[] r11 = Yue.C4716.m18737(r11)
                java.lang.Object r10 = Yue.C4719.m18749(r10, r11)
                r8.<init>(r9, r10, r5)
                Yue.ۥۣۡۨۧ r9 = r14.f14978
                java.nio.file.Path r10 = r8.m18702()
                java.nio.file.LinkOption[] r11 = Yue.C4716.m18737(r9)
                int r12 = r11.length
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)
                java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
                int r12 = r11.length
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)
                java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
                boolean r11 = java.nio.file.Files.isDirectory(r10, r11)
                if (r11 == 0) goto L11b
                boolean r4 = Yue.C4719.m18748(r8)
                if (r4 != 0) goto L111
                boolean r4 = Yue.C4716.m18736(r9)
                if (r4 == 0) goto Le9
                r14.f14977 = r7
                r14.f14971 = r15
                r14.f14972 = r1
                r14.f14973 = r8
                r14.f14974 = r9
                r14.f14975 = r10
                r14.f14976 = r6
                java.lang.Object r4 = r7.mo20973(r10, r14)
                if (r4 != r0) goto Ldb
                return r0
            Ldb:
                r4 = r9
                r9 = r15
                r13 = r8
                r8 = r1
                r1 = r10
                r10 = r7
                r7 = r13
            Le2:
                r15 = r9
                r9 = r4
                r13 = r10
                r10 = r1
                r1 = r8
                r8 = r7
                r7 = r13
            Le9:
                java.nio.file.LinkOption[] r4 = Yue.C4716.m18737(r9)
                int r9 = r4.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r9)
                java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
                int r9 = r4.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r9)
                java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
                boolean r4 = java.nio.file.Files.isDirectory(r10, r4)
                if (r4 == 0) goto L10f
                java.util.List r4 = r1.m8660(r8)
                java.util.Iterator r4 = r4.iterator()
                r8.m18703(r4)
                r15.addLast(r8)
            L10f:
                r4 = r15
                goto L13c
            L111:
                java.nio.file.FileSystemLoopException r15 = new java.nio.file.FileSystemLoopException
                java.lang.String r0 = r10.toString()
                r15.<init>(r0)
                throw r15
            L11b:
                java.nio.file.LinkOption r8 = java.nio.file.LinkOption.NOFOLLOW_LINKS
                java.nio.file.LinkOption[] r8 = new java.nio.file.LinkOption[]{r8}
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
                java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
                boolean r8 = java.nio.file.Files.exists(r10, r8)
                if (r8 == 0) goto L10f
                r14.f14977 = r7
                r14.f14971 = r15
                r14.f14972 = r1
                r14.f14976 = r4
                java.lang.Object r4 = r7.mo20973(r10, r14)
                if (r4 != r0) goto L10f
                return r0
            L13c:
                boolean r15 = r4.isEmpty()
                r15 = r15 ^ r6
                if (r15 == 0) goto L207
                java.lang.Object r15 = r4.m1995()
                Yue.ۥۣۡۨۢ r15 = (Yue.C4709) r15
                java.util.Iterator r15 = r15.m18699()
                Yue.C3329.m13903(r15)
                boolean r8 = r15.hasNext()
                if (r8 == 0) goto L202
                java.lang.Object r15 = r15.next()
                Yue.ۥۣۡۨۢ r15 = (Yue.C4709) r15
                Yue.ۥۣۡۨۧ r8 = r14.f14978
                java.nio.file.Path r9 = r15.m18702()
                java.nio.file.LinkOption[] r10 = Yue.C4716.m18737(r8)
                int r11 = r10.length
                java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)
                java.nio.file.LinkOption[] r10 = (java.nio.file.LinkOption[]) r10
                int r11 = r10.length
                java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)
                java.nio.file.LinkOption[] r10 = (java.nio.file.LinkOption[]) r10
                boolean r10 = java.nio.file.Files.isDirectory(r9, r10)
                if (r10 == 0) goto L1db
                boolean r10 = Yue.C4719.m18748(r15)
                if (r10 != 0) goto L1d1
                boolean r10 = Yue.C4716.m18736(r8)
                if (r10 == 0) goto L1a9
                r14.f14977 = r7
                r14.f14971 = r4
                r14.f14972 = r1
                r14.f14973 = r15
                r14.f14974 = r8
                r14.f14975 = r9
                r14.f14976 = r3
                java.lang.Object r10 = r7.mo20973(r9, r14)
                if (r10 != r0) goto L19b
                return r0
            L19b:
                r10 = r7
                r7 = r15
                r13 = r8
                r8 = r1
                r1 = r9
                r9 = r4
                r4 = r13
            L1a2:
                r15 = r7
                r7 = r10
                r13 = r9
                r9 = r1
                r1 = r8
                r8 = r4
                r4 = r13
            L1a9:
                java.nio.file.LinkOption[] r8 = Yue.C4716.m18737(r8)
                int r10 = r8.length
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r10)
                java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
                int r10 = r8.length
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r10)
                java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
                boolean r8 = java.nio.file.Files.isDirectory(r9, r8)
                if (r8 == 0) goto L13c
                java.util.List r8 = r1.m8660(r15)
                java.util.Iterator r8 = r8.iterator()
                r15.m18703(r8)
                r4.addLast(r15)
                goto L13c
            L1d1:
                java.nio.file.FileSystemLoopException r15 = new java.nio.file.FileSystemLoopException
                java.lang.String r0 = r9.toString()
                r15.<init>(r0)
                throw r15
            L1db:
                java.nio.file.LinkOption r15 = java.nio.file.LinkOption.NOFOLLOW_LINKS
                java.nio.file.LinkOption[] r15 = new java.nio.file.LinkOption[]{r15}
                java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r6)
                java.nio.file.LinkOption[] r15 = (java.nio.file.LinkOption[]) r15
                boolean r15 = java.nio.file.Files.exists(r9, r15)
                if (r15 == 0) goto L13c
                r14.f14977 = r7
                r14.f14971 = r4
                r14.f14972 = r1
                r14.f14973 = r5
                r14.f14974 = r5
                r14.f14975 = r5
                r14.f14976 = r2
                java.lang.Object r15 = r7.mo20973(r9, r14)
                if (r15 != r0) goto L13c
                return r0
            L202:
                r4.removeLast()
                goto L13c
            L207:
                Yue.ۥۣۢ۠ۤ r15 = Yue.C6593.f23016
                return r15
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m18747(@Yue.InterfaceC4418 Yue.AbstractC5611<? super java.nio.file.Path> r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥۣۡۨۧ$ۥ۟ r1 = (Yue.C4716.C4718) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    public C4716(@Yue.InterfaceC4418 java.nio.file.Path r2, @Yue.InterfaceC4418 Yue.EnumC4722[] r3) {
            r1 = this;
            java.lang.String r0 = "start"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f14961 = r2
            r1.f14962 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ boolean m18735(Yue.C4716 r0) {
            boolean r0 = r0.m18741()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ boolean m18736(Yue.C4716 r0) {
            boolean r0 = r0.m18742()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.nio.file.LinkOption[] m18737(Yue.C4716 r0) {
            java.nio.file.LinkOption[] r0 = r0.m18743()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ java.nio.file.Path m18738(Yue.C4716 r0) {
            java.nio.file.Path r0 = r0.f14961
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<java.nio.file.Path> iterator() {
            r1 = this;
            boolean r0 = r1.m18744()
            if (r0 == 0) goto Lb
            java.util.Iterator r0 = r1.m18739()
            goto Lf
        Lb:
            java.util.Iterator r0 = r1.m18740()
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.util.Iterator<java.nio.file.Path> m18739() {
            r2 = this;
            Yue.ۥۣۡۨۧ$ۥ r0 = new Yue.ۥۣۡۨۧ$ۥ
            r1 = 0
            r0.<init>(r2, r1)
            java.util.Iterator r0 = Yue.C5613.m20981(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.util.Iterator<java.nio.file.Path> m18740() {
            r2 = this;
            Yue.ۥۣۡۨۧ$ۥ۟ r0 = new Yue.ۥۣۡۨۧ$ۥ۟
            r1 = 0
            r0.<init>(r2, r1)
            java.util.Iterator r0 = Yue.C5613.m20981(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m18741() {
            r2 = this;
            Yue.ۥۡۤ۟[] r0 = r2.f14962
            Yue.ۥۡۤ۟ r1 = Yue.EnumC4722.f14981
            boolean r0 = Yue.C0595.m2615(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m18742() {
            r2 = this;
            Yue.ۥۡۤ۟[] r0 = r2.f14962
            Yue.ۥۡۤ۟ r1 = Yue.EnumC4722.f14979
            boolean r0 = Yue.C0595.m2615(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final java.nio.file.LinkOption[] m18743() {
            r2 = this;
            Yue.ۥ۠ۧۡۦ r0 = Yue.C3614.f11524
            boolean r1 = r2.m18741()
            java.nio.file.LinkOption[] r0 = r0.m14610(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m18744() {
            r2 = this;
            Yue.ۥۡۤ۟[] r0 = r2.f14962
            Yue.ۥۡۤ۟ r1 = Yue.EnumC4722.f14980
            boolean r0 = Yue.C0595.m2615(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final java.lang.Object m18745(Yue.AbstractC5611<? super java.nio.file.Path> r5, Yue.C4709 r6, Yue.C1857 r7, Yue.InterfaceC2825<? super java.util.List<Yue.C4709>, Yue.C6593> r8, Yue.InterfaceC1598<? super Yue.C6593> r9) {
            r4 = this;
            java.nio.file.Path r0 = r6.m18702()
            java.nio.file.LinkOption[] r1 = m18737(r4)
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = java.nio.file.Files.isDirectory(r0, r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L5d
            boolean r1 = Yue.C4719.m18748(r6)
            if (r1 != 0) goto L53
            boolean r1 = m18736(r4)
            if (r1 == 0) goto L33
            Yue.C3249.m13688(r2)
            r5.mo20973(r0, r9)
            Yue.C3249.m13688(r3)
        L33:
            java.nio.file.LinkOption[] r5 = m18737(r4)
            int r9 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r9)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            int r9 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r9)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            boolean r5 = java.nio.file.Files.isDirectory(r0, r5)
            if (r5 == 0) goto L7b
            java.util.List r5 = r7.m8660(r6)
            r8.invoke(r5)
            goto L7b
        L53:
            java.nio.file.FileSystemLoopException r5 = new java.nio.file.FileSystemLoopException
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L5d:
            java.nio.file.LinkOption r6 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            java.nio.file.LinkOption[] r6 = new java.nio.file.LinkOption[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r3)
            java.nio.file.LinkOption[] r6 = (java.nio.file.LinkOption[]) r6
            boolean r6 = java.nio.file.Files.exists(r0, r6)
            if (r6 == 0) goto L7b
            Yue.C3249.m13688(r2)
            r5.mo20973(r0, r9)
            Yue.C3249.m13688(r3)
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            return r5
        L7b:
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            return r5
    }
}
