package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2819 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {185}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"})
    @Yue.InterfaceC5840({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt$reportWhenComplete$1\n*L\n1#1,190:1\n*E\n"})
    public static final class C2820 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f9206;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f9207;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f9208;

        public C2820(Yue.InterfaceC1598<? super Yue.C2819.C2820> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f9207 = r2
                int r2 = r1.f9208
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f9208 = r2
                r2 = 0
                java.lang.Object r2 = Yue.C2819.m12277(r2, r2, r1)
                return r2
        }
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.Object m12277(@Yue.InterfaceC4418 Yue.C2818 r4, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r6) {
            boolean r0 = r6 instanceof Yue.C2819.C2820
            if (r0 == 0) goto L13
            r0 = r6
            Yue.ۥۣ۠۠ۥ$ۥ r0 = (Yue.C2819.C2820) r0
            int r1 = r0.f9208
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9208 = r1
            goto L18
        L13:
            Yue.ۥۣ۠۠ۥ$ۥ r0 = new Yue.ۥۣ۠۠ۥ$ۥ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9207
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f9208
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f9206
            Yue.ۥۣ۠۠ۤ r4 = (Yue.C2818) r4
            Yue.C5391.m20403(r6)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L5d
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            Yue.C5391.m20403(r6)
            r4.m12271()
            boolean r6 = r4.m12273()
            if (r6 == 0) goto L46
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            return r4
        L46:
            r0.f9206 = r4     // Catch: java.lang.Throwable -> L2d
            r0.f9208 = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L51
            return r1
        L51:
            Yue.C3249.m13687(r3)
            r4.m12276()
            Yue.C3249.m13686(r3)
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            return r4
        L5d:
            Yue.C3249.m13687(r3)
            r4.m12276()
            Yue.C3249.m13686(r3)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.Object m12278(Yue.C2818 r1, Yue.InterfaceC2825<? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r2, Yue.InterfaceC1598<? super Yue.C6593> r3) {
            r1.m12271()
            boolean r0 = r1.m12273()
            if (r0 == 0) goto Lc
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
        Lc:
            r0 = 1
            r2.invoke(r3)     // Catch: java.lang.Throwable -> L1c
            Yue.C3249.m13687(r0)
            r1.m12276()
            Yue.C3249.m13686(r0)
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
        L1c:
            r2 = move-exception
            Yue.C3249.m13687(r0)
            r1.m12276()
            Yue.C3249.m13686(r0)
            throw r2
    }
}
