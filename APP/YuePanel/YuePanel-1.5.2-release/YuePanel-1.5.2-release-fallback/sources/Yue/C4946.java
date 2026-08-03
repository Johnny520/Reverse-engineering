package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4946 {

    /* JADX INFO: renamed from: Yue.ۥۡۥۡۢ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {153}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    public static final class C4947 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f15783;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public java.lang.Object f15784;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f15785;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f15786;

        public C4947(Yue.InterfaceC1598<? super Yue.C4946.C4947> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f15785 = r2
                int r2 = r1.f15786
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f15786 = r2
                r2 = 0
                java.lang.Object r2 = Yue.C4946.m19332(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥۡۢ$ۥ۟, reason: contains not printable characters */
    public static final class C4948 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C4946.C4948 f15787 = null;

        static {
                Yue.ۥۡۥۡۢ$ۥ۟ r0 = new Yue.ۥۡۥۡۢ$ۥ۟
                r0.<init>()
                Yue.C4946.C4948.f15787 = r0
                return
        }

        public C4948() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ Yue.C6593 invoke() {
                r1 = this;
                r1.invoke2()
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥۡۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C4949 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Throwable, Yue.C6593> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC0932<Yue.C6593> f15788;

        public C4949(Yue.InterfaceC0932<? super Yue.C6593> r1) {
                r0 = this;
                r0.f15788 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.m19340(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m19340(@Yue.InterfaceC4543 java.lang.Throwable r2) {
                r1 = this;
                Yue.ۥۣ۟ۨ۟<Yue.ۥۣۢ۠ۤ> r2 = r1.f15788
                Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                java.lang.Object r0 = Yue.C5388.m20377(r0)
                r2.resumeWith(r0)
                return
        }
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.Object m19332(@Yue.InterfaceC4418 Yue.InterfaceC4951<?> r4, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r6) {
            boolean r0 = r6 instanceof Yue.C4946.C4947
            if (r0 == 0) goto L13
            r0 = r6
            Yue.ۥۡۥۡۢ$ۥ r0 = (Yue.C4946.C4947) r0
            int r1 = r0.f15786
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15786 = r1
            goto L18
        L13:
            Yue.ۥۡۥۡۢ$ۥ r0 = new Yue.ۥۡۥۡۢ$ۥ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15785
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f15786
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f15784
            r5 = r4
            Yue.ۥۣ۠۠ۨ r5 = (Yue.InterfaceC2823) r5
            java.lang.Object r4 = r0.f15783
            Yue.ۥۡۥۡۤ r4 = (Yue.InterfaceC4951) r4
            Yue.C5391.m20403(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            Yue.C5391.m20403(r6)
            Yue.ۥ۟ۧۦۥ r6 = r0.getContext()
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r2 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f15783 = r4     // Catch: java.lang.Throwable -> L32
            r0.f15784 = r5     // Catch: java.lang.Throwable -> L32
            r0.f15786 = r3     // Catch: java.lang.Throwable -> L32
            Yue.ۥۣ۟ۨ۠ r6 = new Yue.ۥۣ۟ۨ۠     // Catch: java.lang.Throwable -> L32
            Yue.ۥ۟ۧۤۢ r2 = Yue.C3332.m13940(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.mo5307()     // Catch: java.lang.Throwable -> L32
            Yue.ۥۡۥۡۢ$ۥ۟۟ r2 = new Yue.ۥۡۥۡۢ$ۥ۟۟     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.mo498(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.m5329()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = Yue.C3341.m13947()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            Yue.C1757.m8349(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m19333(Yue.InterfaceC4951 r0, Yue.InterfaceC2823 r1, Yue.InterfaceC1598 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            Yue.ۥۡۥۡۢ$ۥ۟ r1 = Yue.C4946.C4948.f15787
        L6:
            java.lang.Object r0 = m19332(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <E> Yue.InterfaceC5242<E> m19334(@Yue.InterfaceC4418 Yue.InterfaceC1662 r2, @Yue.InterfaceC4418 Yue.InterfaceC1632 r3, int r4, @Yue.InterfaceC4418 Yue.EnumC0847 r5, @Yue.InterfaceC4418 Yue.EnumC1666 r6, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r7, @Yue.InterfaceC4418 @Yue.InterfaceC0861 Yue.InterfaceC2839<? super Yue.InterfaceC4951<? super E>, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r8) {
            r0 = 0
            r1 = 4
            Yue.ۥ۟ۤ۠ۨ r4 = Yue.C1021.m5555(r4, r5, r0, r1, r0)
            Yue.ۥ۟ۧۦۥ r2 = Yue.C1639.m7918(r2, r3)
            Yue.ۥۡۥۣۡ r3 = new Yue.ۥۡۥۣۡ
            r3.<init>(r2, r4)
            if (r7 == 0) goto L14
            r3.mo13981(r7)
        L14:
            r3.m379(r6, r3, r8)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3324
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <E> Yue.InterfaceC5242<E> m19335(@Yue.InterfaceC4418 Yue.InterfaceC1662 r7, @Yue.InterfaceC4418 Yue.InterfaceC1632 r8, int r9, @Yue.InterfaceC4418 Yue.EnumC1666 r10, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r11, @Yue.InterfaceC4418 @Yue.InterfaceC0861 Yue.InterfaceC2839<? super Yue.InterfaceC4951<? super E>, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r12) {
            Yue.ۥۣۣ۟ r3 = Yue.EnumC0847.f2389
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            Yue.ۥۡۦۡۡ r7 = m19334(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC2302
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <E> Yue.InterfaceC5242<E> m19336(@Yue.InterfaceC4418 Yue.InterfaceC1662 r7, @Yue.InterfaceC4418 Yue.InterfaceC1632 r8, int r9, @Yue.InterfaceC4418 @Yue.InterfaceC0861 Yue.InterfaceC2839<? super Yue.InterfaceC4951<? super E>, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r10) {
            Yue.ۥۣۣ۟ r3 = Yue.EnumC0847.f2389
            Yue.ۥ۟ۧۨ r4 = Yue.EnumC1666.f5152
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r10
            Yue.ۥۡۦۡۡ r7 = m19334(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5242 m19337(Yue.InterfaceC1662 r7, Yue.InterfaceC1632 r8, int r9, Yue.EnumC0847 r10, Yue.EnumC1666 r11, Yue.InterfaceC2825 r12, Yue.InterfaceC2839 r13, int r14, java.lang.Object r15) {
            r15 = r14 & 1
            if (r15 == 0) goto L6
            Yue.ۥ۠۠ۧۦ r8 = Yue.C2141.f6728
        L6:
            r1 = r8
            r8 = r14 & 2
            if (r8 == 0) goto Lc
            r9 = 0
        Lc:
            r2 = r9
            r8 = r14 & 4
            if (r8 == 0) goto L13
            Yue.ۥۣۣ۟ r10 = Yue.EnumC0847.f2389
        L13:
            r3 = r10
            r8 = r14 & 8
            if (r8 == 0) goto L1a
            Yue.ۥ۟ۧۨ r11 = Yue.EnumC1666.f5152
        L1a:
            r4 = r11
            r8 = r14 & 16
            if (r8 == 0) goto L20
            r12 = 0
        L20:
            r5 = r12
            r0 = r7
            r6 = r13
            Yue.ۥۡۦۡۡ r7 = m19334(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5242 m19338(Yue.InterfaceC1662 r6, Yue.InterfaceC1632 r7, int r8, Yue.EnumC1666 r9, Yue.InterfaceC2825 r10, Yue.InterfaceC2839 r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto L6
            Yue.ۥ۠۠ۧۦ r7 = Yue.C2141.f6728
        L6:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Lc
            r8 = 0
        Lc:
            r2 = r8
            r7 = r12 & 4
            if (r7 == 0) goto L13
            Yue.ۥ۟ۧۨ r9 = Yue.EnumC1666.f5152
        L13:
            r3 = r9
            r7 = r12 & 8
            if (r7 == 0) goto L19
            r10 = 0
        L19:
            r4 = r10
            r0 = r6
            r5 = r11
            Yue.ۥۡۦۡۡ r6 = m19335(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5242 m19339(Yue.InterfaceC1662 r0, Yue.InterfaceC1632 r1, int r2, Yue.InterfaceC2839 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            Yue.ۥ۠۠ۧۦ r1 = Yue.C2141.f6728
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            r2 = 0
        Lb:
            Yue.ۥۡۦۡۡ r0 = m19336(r0, r1, r2, r3)
            return r0
    }
}
