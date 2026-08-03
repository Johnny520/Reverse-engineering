package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5464 {

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۢ$ۥ, reason: contains not printable characters */
    public static final class C5465 extends Yue.AbstractC3560 implements Yue.InterfaceC2839<java.lang.Integer, Yue.InterfaceC1632.InterfaceC1635, java.lang.Integer> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5460<?> f20270;

        public C5465(Yue.C5460<?> r1) {
                r0 = this;
                r0.f20270 = r1
                r1 = 2
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer r1, Yue.InterfaceC1632.InterfaceC1635 r2) {
                r0 = this;
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                Yue.ۥ۟ۧۦۥ$ۥ۟ r2 = (Yue.InterfaceC1632.InterfaceC1635) r2
                java.lang.Integer r1 = r0.m20622(r1, r2)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Integer m20622(int r4, @Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1635 r5) {
                r3 = this;
                Yue.ۥ۟ۧۦۥ$ۥ۟۟ r0 = r5.getKey()
                Yue.ۥۡۧۢ۠<?> r1 = r3.f20270
                Yue.ۥ۟ۧۦۥ r1 = r1.f20263
                Yue.ۥ۟ۧۦۥ$ۥ۟ r1 = r1.get(r0)
                Yue.ۥ۠ۦ۟ۡ$ۥ۟ r2 = Yue.InterfaceC3383.f10824
                if (r0 == r2) goto L1c
                if (r5 == r1) goto L15
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L17
            L15:
                int r4 = r4 + 1
            L17:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                return r4
            L1c:
                Yue.ۥ۠ۦ۟ۡ r1 = (Yue.InterfaceC3383) r1
                Yue.ۥ۠ۦ۟ۡ r5 = (Yue.InterfaceC3383) r5
                Yue.ۥ۠ۦ۟ۡ r5 = Yue.C5464.m20620(r5, r1)
                if (r5 != r1) goto L30
                if (r1 != 0) goto L29
                goto L2b
            L29:
                int r4 = r4 + 1
            L2b:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                return r4
            L30:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = ", expected child of "
                r0.append(r5)
                r0.append(r1)
                java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۧۢۢ$ۥ۟, reason: contains not printable characters */
    public static final class C5466<T> implements Yue.InterfaceC2464<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2839<Yue.InterfaceC2466<? super T>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> f20271;

        /* JADX INFO: renamed from: Yue.ۥۡۧۢۢ$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C5467 extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f20272;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C5464.C5466 f20273;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f20274;

            public C5467(Yue.C5464.C5466 r1, Yue.InterfaceC1598<? super Yue.C5464.C5466.C5467> r2) {
                    r0 = this;
                    r0.f20273 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f20272 = r2
                    int r2 = r1.f20274
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f20274 = r2
                    Yue.ۥۡۧۢۢ$ۥ۟ r2 = r1.f20273
                    r0 = 0
                    java.lang.Object r2 = r2.mo392(r0, r1)
                    return r2
            }
        }

        public C5466(Yue.InterfaceC2839<? super Yue.InterfaceC2466<? super T>, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r1) {
                r0 = this;
                r0.f20271 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2464
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ */
        public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
                r1 = this;
                Yue.ۥۣ۠ۢۢ<Yue.ۥۣۣ۠ۢ<? super T>, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r0 = r1.f20271
                java.lang.Object r2 = r0.invoke(r2, r3)
                java.lang.Object r3 = Yue.C3341.m13947()
                if (r2 != r3) goto Ld
                return r2
            Ld:
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                return r2
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public java.lang.Object m20623(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
                r1 = this;
                r0 = 4
                Yue.C3249.m13688(r0)
                Yue.ۥۡۧۢۢ$ۥ۟$ۥ r0 = new Yue.ۥۡۧۢۢ$ۥ۟$ۥ
                r0.<init>(r1, r3)
                r0 = 5
                Yue.C3249.m13688(r0)
                Yue.ۥۣ۠ۢۢ<Yue.ۥۣۣ۠ۢ<? super T>, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r0 = r1.f20271
                r0.invoke(r2, r3)
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                return r2
        }
    }

    @Yue.InterfaceC3421(name = "checkContext")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m20619(@Yue.InterfaceC4418 Yue.C5460<?> r3, @Yue.InterfaceC4418 Yue.InterfaceC1632 r4) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            Yue.ۥۡۧۢۢ$ۥ r1 = new Yue.ۥۡۧۢۢ$ۥ
            r1.<init>(r3)
            java.lang.Object r0 = r4.fold(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r3.f20264
            if (r0 != r1) goto L19
            return
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Flow invariant is violated:\n\t\tFlow was collected in "
            r1.append(r2)
            Yue.ۥ۟ۧۦۥ r3 = r3.f20263
            r1.append(r3)
            java.lang.String r3 = ",\n\t\tbut emission happened in "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final Yue.InterfaceC3383 m20620(@Yue.InterfaceC4543 Yue.InterfaceC3383 r1, @Yue.InterfaceC4543 Yue.InterfaceC3383 r2) {
        L0:
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            if (r1 != r2) goto L7
            return r1
        L7:
            boolean r0 = r1 instanceof Yue.C5512
            if (r0 != 0) goto Lc
            return r1
        Lc:
            Yue.ۥۡۧۥ r1 = (Yue.C5512) r1
            Yue.ۥ۠ۦ۟ۡ r1 = r1.m20745()
            goto L0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m20621(@Yue.InterfaceC4418 @Yue.InterfaceC0861 Yue.InterfaceC2839<? super Yue.InterfaceC2466<? super T>, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r1) {
            Yue.ۥۡۧۢۢ$ۥ۟ r0 = new Yue.ۥۡۧۢۢ$ۥ۟
            r0.<init>(r1)
            return r0
    }
}
