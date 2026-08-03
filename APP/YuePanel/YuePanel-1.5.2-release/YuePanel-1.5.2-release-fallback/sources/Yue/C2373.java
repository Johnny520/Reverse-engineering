package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2373 implements Yue.InterfaceC5609<java.io.File> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.io.File f7767;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.EnumC2389 f7768;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.InterfaceC2825<java.io.File, java.lang.Boolean> f7769;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.InterfaceC2825<java.io.File, Yue.C6593> f7770;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.InterfaceC2839<java.io.File, java.io.IOException, Yue.C6593> f7771;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int f7772;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    public static abstract class AbstractC2374 extends Yue.C2373.AbstractC2380 {
        public AbstractC2374(@Yue.InterfaceC4418 java.io.File r2) {
                r1 = this;
                java.lang.String r0 = "rootDir"
                Yue.C3329.m13906(r2, r0)
                r1.<init>(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ۟, reason: contains not printable characters */
    public final class C2375 extends Yue.AbstractC0050<java.io.File> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.ArrayDeque<Yue.C2373.AbstractC2380> f7773;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2373 f7774;

        /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ, reason: contains not printable characters */
        public final class C2376 extends Yue.C2373.AbstractC2374 {

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public boolean f7775;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            @Yue.InterfaceC4543
            public java.io.File[] f7776;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int f7777;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public boolean f7778;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2373.C2375 f7779;

            public C2376(@Yue.InterfaceC4418 Yue.C2373.C2375 r2, java.io.File r3) {
                    r1 = this;
                    java.lang.String r0 = "rootDir"
                    Yue.C3329.m13906(r3, r0)
                    r1.f7779 = r2
                    r1.<init>(r3)
                    return
            }

            @Override // Yue.C2373.AbstractC2380
            @Yue.InterfaceC4543
            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public java.io.File mo10961() {
                    r11 = this;
                    boolean r0 = r11.f7778
                    r1 = 0
                    r2 = 1
                    if (r0 != 0) goto L53
                    java.io.File[] r0 = r11.f7776
                    if (r0 != 0) goto L53
                    Yue.ۥ۠ۡۨۦ$ۥ۟ r0 = r11.f7779
                    Yue.ۥ۠ۡۨۦ r0 = r0.f7774
                    Yue.ۥۣ۠ۡ۟ r0 = Yue.C2373.m10951(r0)
                    if (r0 == 0) goto L25
                    java.io.File r3 = r11.m10962()
                    java.lang.Object r0 = r0.invoke(r3)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L25
                    return r1
                L25:
                    java.io.File r0 = r11.m10962()
                    java.io.File[] r0 = r0.listFiles()
                    r11.f7776 = r0
                    if (r0 != 0) goto L53
                    Yue.ۥ۠ۡۨۦ$ۥ۟ r0 = r11.f7779
                    Yue.ۥ۠ۡۨۦ r0 = r0.f7774
                    Yue.ۥۣ۠ۢۢ r0 = Yue.C2373.m10952(r0)
                    if (r0 == 0) goto L51
                    java.io.File r3 = r11.m10962()
                    Yue.ۥۣ۟۟۠ r10 = new Yue.ۥۣ۟۟۠
                    java.io.File r5 = r11.m10962()
                    r8 = 2
                    r9 = 0
                    r6 = 0
                    java.lang.String r7 = "Cannot list files in a directory"
                    r4 = r10
                    r4.<init>(r5, r6, r7, r8, r9)
                    r0.invoke(r3, r10)
                L51:
                    r11.f7778 = r2
                L53:
                    java.io.File[] r0 = r11.f7776
                    if (r0 == 0) goto L6d
                    int r3 = r11.f7777
                    Yue.C3329.m13903(r0)
                    int r0 = r0.length
                    if (r3 >= r0) goto L6d
                    java.io.File[] r0 = r11.f7776
                    Yue.C3329.m13903(r0)
                    int r1 = r11.f7777
                    int r2 = r1 + 1
                    r11.f7777 = r2
                    r0 = r0[r1]
                    return r0
                L6d:
                    boolean r0 = r11.f7775
                    if (r0 != 0) goto L78
                    r11.f7775 = r2
                    java.io.File r0 = r11.m10962()
                    return r0
                L78:
                    Yue.ۥ۠ۡۨۦ$ۥ۟ r0 = r11.f7779
                    Yue.ۥ۠ۡۨۦ r0 = r0.f7774
                    Yue.ۥۣ۠ۡ۟ r0 = Yue.C2373.m10953(r0)
                    if (r0 == 0) goto L89
                    java.io.File r2 = r11.m10962()
                    r0.invoke(r2)
                L89:
                    return r1
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC5840({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        public final class C2377 extends Yue.C2373.AbstractC2380 {

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public boolean f7780;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2373.C2375 f7781;

            public C2377(@Yue.InterfaceC4418 Yue.C2373.C2375 r2, java.io.File r3) {
                    r1 = this;
                    java.lang.String r0 = "rootFile"
                    Yue.C3329.m13906(r3, r0)
                    r1.f7781 = r2
                    r1.<init>(r3)
                    return
            }

            @Override // Yue.C2373.AbstractC2380
            @Yue.InterfaceC4543
            /* JADX INFO: renamed from: ۥ۟ */
            public java.io.File mo10961() {
                    r1 = this;
                    boolean r0 = r1.f7780
                    if (r0 == 0) goto L6
                    r0 = 0
                    return r0
                L6:
                    r0 = 1
                    r1.f7780 = r0
                    java.io.File r0 = r1.m10962()
                    return r0
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟, reason: contains not printable characters */
        public final class C2378 extends Yue.C2373.AbstractC2374 {

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public boolean f7782;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            @Yue.InterfaceC4543
            public java.io.File[] f7783;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int f7784;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2373.C2375 f7785;

            public C2378(@Yue.InterfaceC4418 Yue.C2373.C2375 r2, java.io.File r3) {
                    r1 = this;
                    java.lang.String r0 = "rootDir"
                    Yue.C3329.m13906(r3, r0)
                    r1.f7785 = r2
                    r1.<init>(r3)
                    return
            }

            @Override // Yue.C2373.AbstractC2380
            @Yue.InterfaceC4543
            /* JADX INFO: renamed from: ۥ۟ */
            public java.io.File mo10961() {
                    r10 = this;
                    boolean r0 = r10.f7782
                    r1 = 0
                    if (r0 != 0) goto L28
                    Yue.ۥ۠ۡۨۦ$ۥ۟ r0 = r10.f7785
                    Yue.ۥ۠ۡۨۦ r0 = r0.f7774
                    Yue.ۥۣ۠ۡ۟ r0 = Yue.C2373.m10951(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.m10962()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r10.f7782 = r0
                    java.io.File r0 = r10.m10962()
                    return r0
                L28:
                    java.io.File[] r0 = r10.f7783
                    if (r0 == 0) goto L47
                    int r2 = r10.f7784
                    Yue.C3329.m13903(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    Yue.ۥ۠ۡۨۦ$ۥ۟ r0 = r10.f7785
                    Yue.ۥ۠ۡۨۦ r0 = r0.f7774
                    Yue.ۥۣ۠ۡ۟ r0 = Yue.C2373.m10953(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r10.m10962()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r10.f7783
                    if (r0 != 0) goto L93
                    java.io.File r0 = r10.m10962()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f7783 = r0
                    if (r0 != 0) goto L77
                    Yue.ۥ۠ۡۨۦ$ۥ۟ r0 = r10.f7785
                    Yue.ۥ۠ۡۨۦ r0 = r0.f7774
                    Yue.ۥۣ۠ۢۢ r0 = Yue.C2373.m10952(r0)
                    if (r0 == 0) goto L77
                    java.io.File r2 = r10.m10962()
                    Yue.ۥۣ۟۟۠ r9 = new Yue.ۥۣ۟۟۠
                    java.io.File r4 = r10.m10962()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L77:
                    java.io.File[] r0 = r10.f7783
                    if (r0 == 0) goto L81
                    Yue.C3329.m13903(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L93
                L81:
                    Yue.ۥ۠ۡۨۦ$ۥ۟ r0 = r10.f7785
                    Yue.ۥ۠ۡۨۦ r0 = r0.f7774
                    Yue.ۥۣ۠ۡ۟ r0 = Yue.C2373.m10953(r0)
                    if (r0 == 0) goto L92
                    java.io.File r2 = r10.m10962()
                    r0.invoke(r2)
                L92:
                    return r1
                L93:
                    java.io.File[] r0 = r10.f7783
                    Yue.C3329.m13903(r0)
                    int r1 = r10.f7784
                    int r2 = r1 + 1
                    r10.f7784 = r2
                    r0 = r0[r1]
                    return r0
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟۟, reason: contains not printable characters */
        public /* synthetic */ class C2379 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public static final /* synthetic */ int[] f7786 = null;

            static {
                    Yue.ۥ۠ۢ۟ۢ[] r0 = Yue.EnumC2389.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Yue.ۥ۠ۢ۟ۢ r1 = Yue.EnumC2389.f7813     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    Yue.ۥ۠ۢ۟ۢ r1 = Yue.EnumC2389.f7814     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    Yue.C2373.C2375.C2379.f7786 = r0
                    return
            }
        }

        public C2375(Yue.C2373 r3) {
                r2 = this;
                r2.f7774 = r3
                r2.<init>()
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r2.f7773 = r0
                java.io.File r1 = Yue.C2373.m10954(r3)
                boolean r1 = r1.isDirectory()
                if (r1 == 0) goto L22
                java.io.File r3 = Yue.C2373.m10954(r3)
                Yue.ۥ۠ۡۨۦ$ۥ r3 = r2.m10959(r3)
                r0.push(r3)
                goto L3c
            L22:
                java.io.File r1 = Yue.C2373.m10954(r3)
                boolean r1 = r1.isFile()
                if (r1 == 0) goto L39
                Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ۟ r1 = new Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ۟
                java.io.File r3 = Yue.C2373.m10954(r3)
                r1.<init>(r2, r3)
                r0.push(r1)
                goto L3c
            L39:
                r2.m395()
            L3c:
                return
        }

        @Override // Yue.AbstractC0050
        /* JADX INFO: renamed from: ۥ */
        public void mo394() {
                r1 = this;
                java.io.File r0 = r1.m10960()
                if (r0 == 0) goto La
                r1.m396(r0)
                goto Ld
            La:
                r1.m395()
            Ld:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final Yue.C2373.AbstractC2374 m10959(java.io.File r3) {
                r2 = this;
                Yue.ۥ۠ۡۨۦ r0 = r2.f7774
                Yue.ۥ۠ۢ۟ۢ r0 = Yue.C2373.m10949(r0)
                int[] r1 = Yue.C2373.C2375.C2379.f7786
                int r0 = r0.ordinal()
                r0 = r1[r0]
                r1 = 1
                if (r0 == r1) goto L20
                r1 = 2
                if (r0 != r1) goto L1a
                Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ r0 = new Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ
                r0.<init>(r2, r3)
                goto L25
            L1a:
                Yue.ۥۣۣۡۢ r3 = new Yue.ۥۣۣۡۢ
                r3.<init>()
                throw r3
            L20:
                Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟ r0 = new Yue.ۥ۠ۡۨۦ$ۥ۟$ۥ۟۟
                r0.<init>(r2, r3)
            L25:
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final java.io.File m10960() {
                r3 = this;
            L0:
                java.util.ArrayDeque<Yue.ۥ۠ۡۨۦ$ۥ۟۟> r0 = r3.f7773
                java.lang.Object r0 = r0.peek()
                Yue.ۥ۠ۡۨۦ$ۥ۟۟ r0 = (Yue.C2373.AbstractC2380) r0
                if (r0 != 0) goto Lc
                r0 = 0
                return r0
            Lc:
                java.io.File r1 = r0.mo10961()
                if (r1 != 0) goto L18
                java.util.ArrayDeque<Yue.ۥ۠ۡۨۦ$ۥ۟۟> r0 = r3.f7773
                r0.pop()
                goto L0
            L18:
                java.io.File r0 = r0.m10962()
                boolean r0 = Yue.C3329.m13897(r1, r0)
                if (r0 != 0) goto L41
                boolean r0 = r1.isDirectory()
                if (r0 == 0) goto L41
                java.util.ArrayDeque<Yue.ۥ۠ۡۨۦ$ۥ۟۟> r0 = r3.f7773
                int r0 = r0.size()
                Yue.ۥ۠ۡۨۦ r2 = r3.f7774
                int r2 = Yue.C2373.m10950(r2)
                if (r0 < r2) goto L37
                goto L41
            L37:
                java.util.ArrayDeque<Yue.ۥ۠ۡۨۦ$ۥ۟۟> r0 = r3.f7773
                Yue.ۥ۠ۡۨۦ$ۥ r1 = r3.m10959(r1)
                r0.push(r1)
                goto L0
            L41:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۨۦ$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC2380 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.io.File f7787;

        public AbstractC2380(@Yue.InterfaceC4418 java.io.File r2) {
                r1 = this;
                java.lang.String r0 = "root"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f7787 = r2
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.io.File m10962() {
                r1 = this;
                java.io.File r0 = r1.f7787
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟ */
        public abstract java.io.File mo10961();
    }

    public C2373(@Yue.InterfaceC4418 java.io.File r11, @Yue.InterfaceC4418 Yue.EnumC2389 r12) {
            r10 = this;
            java.lang.String r0 = "start"
            Yue.C3329.m13906(r11, r0)
            java.lang.String r0 = "direction"
            Yue.C3329.m13906(r12, r0)
            r8 = 32
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public /* synthetic */ C2373(java.io.File r1, Yue.EnumC2389 r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L6
            Yue.ۥ۠ۢ۟ۢ r2 = Yue.EnumC2389.f7813
        L6:
            r0.<init>(r1, r2)
            return
    }

    public C2373(java.io.File r1, Yue.EnumC2389 r2, Yue.InterfaceC2825<? super java.io.File, java.lang.Boolean> r3, Yue.InterfaceC2825<? super java.io.File, Yue.C6593> r4, Yue.InterfaceC2839<? super java.io.File, ? super java.io.IOException, Yue.C6593> r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f7767 = r1
            r0.f7768 = r2
            r0.f7769 = r3
            r0.f7770 = r4
            r0.f7771 = r5
            r0.f7772 = r6
            return
    }

    public /* synthetic */ C2373(java.io.File r8, Yue.EnumC2389 r9, Yue.InterfaceC2825 r10, Yue.InterfaceC2825 r11, Yue.InterfaceC2839 r12, int r13, int r14, Yue.C1769 r15) {
            r7 = this;
            r15 = r14 & 2
            if (r15 == 0) goto L6
            Yue.ۥ۠ۢ۟ۢ r9 = Yue.EnumC2389.f7813
        L6:
            r2 = r9
            r9 = r14 & 32
            if (r9 == 0) goto Le
            r13 = 2147483647(0x7fffffff, float:NaN)
        Le:
            r6 = r13
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.EnumC2389 m10949(Yue.C2373 r0) {
            Yue.ۥ۠ۢ۟ۢ r0 = r0.f7768
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int m10950(Yue.C2373 r0) {
            int r0 = r0.f7772
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2825 m10951(Yue.C2373 r0) {
            Yue.ۥۣ۠ۡ۟<java.io.File, java.lang.Boolean> r0 = r0.f7769
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2839 m10952(Yue.C2373 r0) {
            Yue.ۥۣ۠ۢۢ<java.io.File, java.io.IOException, Yue.ۥۣۢ۠ۤ> r0 = r0.f7771
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2825 m10953(Yue.C2373 r0) {
            Yue.ۥۣ۠ۡ۟<java.io.File, Yue.ۥۣۢ۠ۤ> r0 = r0.f7770
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final /* synthetic */ java.io.File m10954(Yue.C2373 r0) {
            java.io.File r0 = r0.f7767
            return r0
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<java.io.File> iterator() {
            r1 = this;
            Yue.ۥ۠ۡۨۦ$ۥ۟ r0 = new Yue.ۥ۠ۡۨۦ$ۥ۟
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Yue.C2373 m10955(int r9) {
            r8 = this;
            if (r9 <= 0) goto L14
            Yue.ۥ۠ۡۨۦ r7 = new Yue.ۥ۠ۡۨۦ
            java.io.File r1 = r8.f7767
            Yue.ۥ۠ۢ۟ۢ r2 = r8.f7768
            Yue.ۥۣ۠ۡ۟<java.io.File, java.lang.Boolean> r3 = r8.f7769
            Yue.ۥۣ۠ۡ۟<java.io.File, Yue.ۥۣۢ۠ۤ> r4 = r8.f7770
            Yue.ۥۣ۠ۢۢ<java.io.File, java.io.IOException, Yue.ۥۣۢ۠ۤ> r5 = r8.f7771
            r0 = r7
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "depth must be positive, but was "
            r1.append(r2)
            r1.append(r9)
            r9 = 46
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.C2373 m10956(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.io.File, java.lang.Boolean> r9) {
            r8 = this;
            java.lang.String r0 = "function"
            Yue.C3329.m13906(r9, r0)
            Yue.ۥ۠ۡۨۦ r0 = new Yue.ۥ۠ۡۨۦ
            java.io.File r2 = r8.f7767
            Yue.ۥ۠ۢ۟ۢ r3 = r8.f7768
            Yue.ۥۣ۠ۡ۟<java.io.File, Yue.ۥۣۢ۠ۤ> r5 = r8.f7770
            Yue.ۥۣ۠ۢۢ<java.io.File, java.io.IOException, Yue.ۥۣۢ۠ۤ> r6 = r8.f7771
            int r7 = r8.f7772
            r1 = r0
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final Yue.C2373 m10957(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.io.File, ? super java.io.IOException, Yue.C6593> r9) {
            r8 = this;
            java.lang.String r0 = "function"
            Yue.C3329.m13906(r9, r0)
            Yue.ۥ۠ۡۨۦ r0 = new Yue.ۥ۠ۡۨۦ
            java.io.File r2 = r8.f7767
            Yue.ۥ۠ۢ۟ۢ r3 = r8.f7768
            Yue.ۥۣ۠ۡ۟<java.io.File, java.lang.Boolean> r4 = r8.f7769
            Yue.ۥۣ۠ۡ۟<java.io.File, Yue.ۥۣۢ۠ۤ> r5 = r8.f7770
            int r7 = r8.f7772
            r1 = r0
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final Yue.C2373 m10958(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.io.File, Yue.C6593> r9) {
            r8 = this;
            java.lang.String r0 = "function"
            Yue.C3329.m13906(r9, r0)
            Yue.ۥ۠ۡۨۦ r0 = new Yue.ۥ۠ۡۨۦ
            java.io.File r2 = r8.f7767
            Yue.ۥ۠ۢ۟ۢ r3 = r8.f7768
            Yue.ۥۣ۠ۡ۟<java.io.File, java.lang.Boolean> r4 = r8.f7769
            Yue.ۥۣ۠ۢۢ<java.io.File, java.io.IOException, Yue.ۥۣۢ۠ۤ> r6 = r8.f7771
            int r7 = r8.f7772
            r1 = r0
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }
}
