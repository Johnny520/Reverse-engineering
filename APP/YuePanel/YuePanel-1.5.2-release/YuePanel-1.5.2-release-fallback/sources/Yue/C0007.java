package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n52#2,5:156\n52#2,21:161\n60#2,10:182\n57#2,2:192\n71#2,2:194\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,5\n66#1:161,21\n65#1:182,10\n65#1:192,2\n65#1:194,2\n*E\n"})
@Yue.InterfaceC3421(name = "-FileSystem")
public final class C0007 {

    /* JADX INFO: renamed from: Yue.ۥ۟۟۟ۢ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {116, 135, 145}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    public static final class C0008 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f11;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public java.lang.Object f12;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public java.lang.Object f13;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public java.lang.Object f14;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public java.lang.Object f15;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f16;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public boolean f17;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f18;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public int f19;

        public C0008(Yue.InterfaceC1598<? super Yue.C0007.C0008> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r8) {
                r7 = this;
                r7.f18 = r8
                int r8 = r7.f19
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r8 = r8 | r0
                r7.f19 = r8
                r4 = 0
                r5 = 0
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r6 = r7
                java.lang.Object r8 = Yue.C0007.m127(r0, r1, r2, r3, r4, r5, r6)
                return r8
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۟ۢ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0009 extends Yue.AbstractC5386 implements Yue.InterfaceC2839<Yue.AbstractC5611<? super Yue.C4701>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f20;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f21;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC2370 f22;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4701 f23;

        public C0009(Yue.AbstractC2370 r1, Yue.C4701 r2, Yue.InterfaceC1598<? super Yue.C0007.C0009> r3) {
                r0 = this;
                r0.f22 = r1
                r0.f23 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r5) {
                r3 = this;
                Yue.ۥ۟۟۟ۢ$ۥ۟ r0 = new Yue.ۥ۟۟۟ۢ$ۥ۟
                Yue.ۥ۠ۡۨۤ r1 = r3.f22
                Yue.ۥۣۡۧۧ r2 = r3.f23
                r0.<init>(r1, r2, r5)
                r0.f21 = r4
                return r0
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.AbstractC5611<? super Yue.C4701> r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥۡۨۢ۠ r1 = (Yue.AbstractC5611) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m135(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r10.f20
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r11)
                goto L34
            Lf:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L17:
                Yue.C5391.m20403(r11)
                java.lang.Object r11 = r10.f21
                r3 = r11
                Yue.ۥۡۨۢ۠ r3 = (Yue.AbstractC5611) r3
                Yue.ۥ۠ۡۨۤ r4 = r10.f22
                Yue.ۥ۟ۡۧۡ r5 = new Yue.ۥ۟ۡۧۡ
                r5.<init>()
                Yue.ۥۣۡۧۧ r6 = r10.f23
                r10.f20 = r2
                r7 = 0
                r8 = 1
                r9 = r10
                java.lang.Object r11 = Yue.C0007.m127(r3, r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L34
                return r0
            L34:
                Yue.ۥۣۢ۠ۤ r11 = Yue.C6593.f23016
                return r11
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m135(@Yue.InterfaceC4418 Yue.AbstractC5611<? super Yue.C4701> r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۟۟۟ۢ$ۥ۟ r1 = (Yue.C0007.C0009) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۟ۢ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
    public static final class C0010 extends Yue.AbstractC5386 implements Yue.InterfaceC2839<Yue.AbstractC5611<? super Yue.C4701>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public java.lang.Object f24;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public java.lang.Object f25;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f26;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f27;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4701 f28;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC2370 f29;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final /* synthetic */ boolean f30;

        public C0010(Yue.C4701 r1, Yue.AbstractC2370 r2, boolean r3, Yue.InterfaceC1598<? super Yue.C0007.C0010> r4) {
                r0 = this;
                r0.f28 = r1
                r0.f29 = r2
                r0.f30 = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r6) {
                r4 = this;
                Yue.ۥ۟۟۟ۢ$ۥ۟۟ r0 = new Yue.ۥ۟۟۟ۢ$ۥ۟۟
                Yue.ۥۣۡۧۧ r1 = r4.f28
                Yue.ۥ۠ۡۨۤ r2 = r4.f29
                boolean r3 = r4.f30
                r0.<init>(r1, r2, r3, r6)
                r0.f27 = r5
                return r0
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.AbstractC5611<? super Yue.C4701> r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥۡۨۢ۠ r1 = (Yue.AbstractC5611) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m136(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r12) {
                r11 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r11.f26
                r2 = 1
                if (r1 == 0) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r11.f25
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r11.f24
                Yue.ۥ۟ۡۧۡ r3 = (Yue.C0561) r3
                java.lang.Object r4 = r11.f27
                Yue.ۥۡۨۢ۠ r4 = (Yue.AbstractC5611) r4
                Yue.C5391.m20403(r12)
                r12 = r3
                r10 = r4
                goto L45
            L1d:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L25:
                Yue.C5391.m20403(r12)
                java.lang.Object r12 = r11.f27
                Yue.ۥۡۨۢ۠ r12 = (Yue.AbstractC5611) r12
                Yue.ۥ۟ۡۧۡ r1 = new Yue.ۥ۟ۡۧۡ
                r1.<init>()
                Yue.ۥۣۡۧۧ r3 = r11.f28
                r1.addLast(r3)
                Yue.ۥ۠ۡۨۤ r3 = r11.f29
                Yue.ۥۣۡۧۧ r4 = r11.f28
                java.util.List r3 = r3.mo10933(r4)
                java.util.Iterator r3 = r3.iterator()
                r10 = r12
                r12 = r1
                r1 = r3
            L45:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L69
                java.lang.Object r3 = r1.next()
                r6 = r3
                Yue.ۥۣۡۧۧ r6 = (Yue.C4701) r6
                Yue.ۥ۠ۡۨۤ r4 = r11.f29
                boolean r7 = r11.f30
                r11.f27 = r10
                r11.f24 = r12
                r11.f25 = r1
                r11.f26 = r2
                r8 = 0
                r3 = r10
                r5 = r12
                r9 = r11
                java.lang.Object r3 = Yue.C0007.m127(r3, r4, r5, r6, r7, r8, r9)
                if (r3 != r0) goto L45
                return r0
            L69:
                Yue.ۥۣۢ۠ۤ r12 = Yue.C6593.f23016
                return r12
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m136(@Yue.InterfaceC4418 Yue.AbstractC5611<? super Yue.C4701> r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۟۟۟ۢ$ۥ۟۟ r1 = (Yue.C0007.C0010) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.Object m127(@Yue.InterfaceC4418 Yue.AbstractC5611<? super Yue.C4701> r15, @Yue.InterfaceC4418 Yue.AbstractC2370 r16, @Yue.InterfaceC4418 Yue.C0561<Yue.C4701> r17, @Yue.InterfaceC4418 Yue.C4701 r18, boolean r19, boolean r20, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r21) {
            r0 = r15
            r1 = r18
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof Yue.C0007.C0008
            if (r4 == 0) goto L1a
            r4 = r3
            Yue.ۥ۟۟۟ۢ$ۥ r4 = (Yue.C0007.C0008) r4
            int r5 = r4.f19
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1a
            int r5 = r5 - r6
            r4.f19 = r5
            goto L1f
        L1a:
            Yue.ۥ۟۟۟ۢ$ۥ r4 = new Yue.ۥ۟۟۟ۢ$ۥ
            r4.<init>(r3)
        L1f:
            java.lang.Object r3 = r4.f18
            java.lang.Object r5 = Yue.C3341.m13947()
            int r6 = r4.f19
            r7 = 0
            r8 = 3
            r9 = 2
            r10 = 1
            if (r6 == 0) goto L7c
            if (r6 == r10) goto L60
            if (r6 == r9) goto L40
            if (r6 != r8) goto L38
            Yue.C5391.m20403(r3)
            goto L146
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L40:
            boolean r0 = r4.f17
            boolean r1 = r4.f16
            java.lang.Object r2 = r4.f15
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r6 = r4.f14
            Yue.ۥۣۡۧۧ r6 = (Yue.C4701) r6
            java.lang.Object r7 = r4.f13
            Yue.ۥ۟ۡۧۡ r7 = (Yue.C0561) r7
            java.lang.Object r10 = r4.f12
            Yue.ۥ۠ۡۨۤ r10 = (Yue.AbstractC2370) r10
            java.lang.Object r11 = r4.f11
            Yue.ۥۡۨۢ۠ r11 = (Yue.AbstractC5611) r11
            Yue.C5391.m20403(r3)     // Catch: java.lang.Throwable -> L5d
            goto Lef
        L5d:
            r0 = move-exception
            goto L128
        L60:
            boolean r0 = r4.f17
            boolean r1 = r4.f16
            java.lang.Object r2 = r4.f14
            Yue.ۥۣۡۧۧ r2 = (Yue.C4701) r2
            java.lang.Object r6 = r4.f13
            Yue.ۥ۟ۡۧۡ r6 = (Yue.C0561) r6
            java.lang.Object r11 = r4.f12
            Yue.ۥ۠ۡۨۤ r11 = (Yue.AbstractC2370) r11
            java.lang.Object r12 = r4.f11
            Yue.ۥۡۨۢ۠ r12 = (Yue.AbstractC5611) r12
            Yue.C5391.m20403(r3)
            r14 = r2
            r2 = r0
            r0 = r1
            r1 = r14
            goto La5
        L7c:
            Yue.C5391.m20403(r3)
            if (r2 != 0) goto L9c
            r4.f11 = r0
            r3 = r16
            r4.f12 = r3
            r6 = r17
            r4.f13 = r6
            r4.f14 = r1
            r11 = r19
            r4.f16 = r11
            r4.f17 = r2
            r4.f19 = r10
            java.lang.Object r12 = r15.mo20973(r1, r4)
            if (r12 != r5) goto La2
            return r5
        L9c:
            r3 = r16
            r6 = r17
            r11 = r19
        La2:
            r12 = r0
            r0 = r11
            r11 = r3
        La5:
            java.util.List r3 = r11.mo10934(r1)
            if (r3 != 0) goto Laf
            java.util.List r3 = Yue.C1208.m6210()
        Laf:
            boolean r13 = r3.isEmpty()
            r10 = r10 ^ r13
            if (r10 == 0) goto L130
            r10 = r1
        Lb7:
            if (r0 == 0) goto Ld7
            boolean r13 = r6.contains(r10)
            if (r13 != 0) goto Lc0
            goto Ld7
        Lc0:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "symlink cycle at "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Ld7:
            Yue.ۥۣۡۧۧ r13 = m134(r11, r10)
            if (r13 != 0) goto L12c
            if (r0 != 0) goto Le1
            if (r7 != 0) goto L130
        Le1:
            r6.addLast(r10)
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L126
            r7 = r6
            r10 = r11
            r11 = r12
            r6 = r1
            r1 = r0
            r0 = r2
            r2 = r3
        Lef:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L11f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5d
            Yue.ۥۣۡۧۧ r3 = (Yue.C4701) r3     // Catch: java.lang.Throwable -> L5d
            r4.f11 = r11     // Catch: java.lang.Throwable -> L5d
            r4.f12 = r10     // Catch: java.lang.Throwable -> L5d
            r4.f13 = r7     // Catch: java.lang.Throwable -> L5d
            r4.f14 = r6     // Catch: java.lang.Throwable -> L5d
            r4.f15 = r2     // Catch: java.lang.Throwable -> L5d
            r4.f16 = r1     // Catch: java.lang.Throwable -> L5d
            r4.f17 = r0     // Catch: java.lang.Throwable -> L5d
            r4.f19 = r9     // Catch: java.lang.Throwable -> L5d
            r15 = r11
            r16 = r10
            r17 = r7
            r18 = r3
            r19 = r1
            r20 = r0
            r21 = r4
            java.lang.Object r3 = m127(r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L5d
            if (r3 != r5) goto Lef
            return r5
        L11f:
            r7.removeLast()
            r2 = r0
            r1 = r6
            r12 = r11
            goto L130
        L126:
            r0 = move-exception
            r7 = r6
        L128:
            r7.removeLast()
            throw r0
        L12c:
            int r7 = r7 + 1
            r10 = r13
            goto Lb7
        L130:
            if (r2 == 0) goto L149
            r0 = 0
            r4.f11 = r0
            r4.f12 = r0
            r4.f13 = r0
            r4.f14 = r0
            r4.f15 = r0
            r4.f19 = r8
            java.lang.Object r0 = r12.mo20973(r1, r4)
            if (r0 != r5) goto L146
            return r5
        L146:
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
            return r0
        L149:
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m128(@Yue.InterfaceC4418 Yue.AbstractC2370 r4, @Yue.InterfaceC4418 Yue.C4701 r5, @Yue.InterfaceC4418 Yue.C4701 r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r6, r0)
            Yue.ۥۣۢ۟ۦ r5 = r4.mo10944(r5)
            r0 = 0
            Yue.ۥۣۢ۟ۡ r4 = r4.m10942(r6)     // Catch: java.lang.Throwable -> L3a
            Yue.ۥۣۣ۟۟ r4 = Yue.C4603.m18379(r4)     // Catch: java.lang.Throwable -> L3a
            long r1 = r4.mo4815(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L2c
            r4.close()     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r4 = move-exception
            goto L3e
        L2c:
            r4 = r0
            goto L3e
        L2e:
            r6 = move-exception
            if (r4 == 0) goto L3c
            r4.close()     // Catch: java.lang.Throwable -> L35
            goto L3c
        L35:
            r4 = move-exception
            Yue.C2268.m10468(r6, r4)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r4 = move-exception
            goto L54
        L3c:
            r4 = r6
            r6 = r0
        L3e:
            if (r4 != 0) goto L53
            Yue.C3329.m13903(r6)     // Catch: java.lang.Throwable -> L3a
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L3a
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L61
            r5.close()     // Catch: java.lang.Throwable -> L51
            goto L61
        L51:
            r0 = move-exception
            goto L61
        L53:
            throw r4     // Catch: java.lang.Throwable -> L3a
        L54:
            if (r5 == 0) goto L5e
            r5.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r5 = move-exception
            Yue.C2268.m10468(r4, r5)
        L5e:
            r3 = r0
            r0 = r4
            r4 = r3
        L61:
            if (r0 != 0) goto L67
            Yue.C3329.m13903(r4)
            return
        L67:
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m129(@Yue.InterfaceC4418 Yue.AbstractC2370 r3, @Yue.InterfaceC4418 Yue.C4701 r4, boolean r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥ۟ۡۧۡ r0 = new Yue.ۥ۟ۡۧۡ
            r0.<init>()
            r1 = r4
        L10:
            if (r1 == 0) goto L20
            boolean r2 = r3.m10932(r1)
            if (r2 != 0) goto L20
            r0.addFirst(r1)
            Yue.ۥۣۡۧۧ r1 = r1.m18660()
            goto L10
        L20:
            if (r5 == 0) goto L40
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L29
            goto L40
        L29:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " already exists."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L40:
            java.util.Iterator r4 = r0.iterator()
        L44:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L54
            java.lang.Object r5 = r4.next()
            Yue.ۥۣۡۧۧ r5 = (Yue.C4701) r5
            r3.m10925(r5)
            goto L44
        L54:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m130(@Yue.InterfaceC4418 Yue.AbstractC2370 r2, @Yue.InterfaceC4418 Yue.C4701 r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "fileOrDirectory"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۟۟۟ۢ$ۥ۟ r0 = new Yue.ۥ۟۟۟ۢ$ۥ۟
            r1 = 0
            r0.<init>(r2, r3, r1)
            Yue.ۥۡۨۢ r3 = Yue.C5613.m20982(r0)
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r3.next()
            Yue.ۥۣۡۧۧ r0 = (Yue.C4701) r0
            if (r4 == 0) goto L2e
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L2e
            r1 = 1
            goto L2f
        L2e:
            r1 = 0
        L2f:
            r2.mo10929(r0, r1)
            goto L18
        L33:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m131(@Yue.InterfaceC4418 Yue.AbstractC2370 r1, @Yue.InterfaceC4418 Yue.C4701 r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۡۨ r1 = r1.mo10938(r2)
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<Yue.C4701> m132(@Yue.InterfaceC4418 Yue.AbstractC2370 r2, @Yue.InterfaceC4418 Yue.C4701 r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۟۟۟ۢ$ۥ۟۟ r0 = new Yue.ۥ۟۟۟ۢ$ۥ۟۟
            r1 = 0
            r0.<init>(r3, r2, r4, r1)
            Yue.ۥۡۨۢ r2 = Yue.C5613.m20982(r0)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Yue.C2359 m133(@Yue.InterfaceC4418 Yue.AbstractC2370 r2, @Yue.InterfaceC4418 Yue.C4701 r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۠ۡۨ r2 = r2.mo10938(r3)
            if (r2 == 0) goto L11
            return r2
        L11:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no such file: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Yue.C4701 m134(@Yue.InterfaceC4418 Yue.AbstractC2370 r1, @Yue.InterfaceC4418 Yue.C4701 r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۡۨ r1 = r1.m10937(r2)
            Yue.ۥۣۡۧۧ r1 = r1.m10863()
            if (r1 != 0) goto L16
            r1 = 0
            return r1
        L16:
            Yue.ۥۣۡۧۧ r2 = r2.m18660()
            Yue.C3329.m13903(r2)
            Yue.ۥۣۡۧۧ r1 = r2.m18664(r1)
            return r1
    }
}
