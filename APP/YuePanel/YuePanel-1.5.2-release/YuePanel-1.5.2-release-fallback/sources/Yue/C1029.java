package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1029 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۢۡ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class C1030 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f2938;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC5599<E> f2939;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ E f2940;

        public C1030(Yue.InterfaceC5599<? super E> r1, E r2, Yue.InterfaceC1598<? super Yue.C1029.C1030> r3) {
                r0 = this;
                r0.f2939 = r1
                r0.f2940 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                Yue.ۥ۟ۤۢۡ$ۥ r3 = new Yue.ۥ۟ۤۢۡ$ۥ
                Yue.ۥۡۨۡ۠<E> r0 = r2.f2939
                E r1 = r2.f2940
                r3.<init>(r0, r1, r4)
                return r3
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۟ۤۢۡ$ۥ r1 = (Yue.C1029.C1030) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.InterfaceC1662 r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۧۥ r1 = (Yue.InterfaceC1662) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r3.f2938
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                Yue.C5391.m20403(r4)
                Yue.ۥۡۨۡ۠<E> r4 = r3.f2939
                E r1 = r3.f2940
                r3.f2938 = r2
                java.lang.Object r4 = r4.mo476(r1, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
                return r4
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۢۡ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class C1031 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C1024<? extends Yue.C6593>>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f2941;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f2942;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC5599<E> f2943;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ E f2944;

        public C1031(Yue.InterfaceC5599<? super E> r1, E r2, Yue.InterfaceC1598<? super Yue.C1029.C1031> r3) {
                r0 = this;
                r0.f2943 = r1
                r0.f2944 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r5) {
                r3 = this;
                Yue.ۥ۟ۤۢۡ$ۥ۟ r0 = new Yue.ۥ۟ۤۢۡ$ۥ۟
                Yue.ۥۡۨۡ۠<E> r1 = r3.f2943
                E r2 = r3.f2944
                r0.<init>(r1, r2, r5)
                r0.f2942 = r4
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C1024<Yue.C6593>> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۟ۤۢۡ$ۥ۟ r1 = (Yue.C1029.C1031) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(Yue.InterfaceC1662 r1, Yue.InterfaceC1598<? super Yue.C1024<? extends Yue.C6593>> r2) {
                r0 = this;
                Yue.ۥ۟ۧۧۥ r1 = (Yue.InterfaceC1662) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r4.f2941
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                Yue.C5391.m20403(r5)     // Catch: java.lang.Throwable -> Lf
                goto L2f
            Lf:
                r5 = move-exception
                goto L36
            L11:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L19:
                Yue.C5391.m20403(r5)
                java.lang.Object r5 = r4.f2942
                Yue.ۥ۟ۧۧۥ r5 = (Yue.InterfaceC1662) r5
                Yue.ۥۡۨۡ۠<E> r5 = r4.f2943
                E r1 = r4.f2944
                Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> Lf
                r4.f2941 = r2     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r5 = r5.mo476(r1, r4)     // Catch: java.lang.Throwable -> Lf
                if (r5 != r0) goto L2f
                return r0
            L2f:
                Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r5 = Yue.C5388.m20377(r5)     // Catch: java.lang.Throwable -> Lf
                goto L40
            L36:
                Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
                java.lang.Object r5 = Yue.C5391.m20390(r5)
                java.lang.Object r5 = Yue.C5388.m20377(r5)
            L40:
                boolean r0 = Yue.C5388.m20385(r5)
                if (r0 == 0) goto L4f
                Yue.ۥ۟ۤۢ۟$ۥ۟ r5 = Yue.C1024.f2933
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                java.lang.Object r5 = r5.m5577(r0)
                goto L59
            L4f:
                Yue.ۥ۟ۤۢ۟$ۥ۟ r0 = Yue.C1024.f2933
                java.lang.Throwable r5 = Yue.C5388.m20380(r5)
                java.lang.Object r5 = r0.m5575(r5)
            L59:
                Yue.ۥ۟ۤۢ۟ r5 = Yue.C1024.m5561(r5)
                return r5
        }
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @Yue.InterfaceC5313(expression = "trySendBlocking(element)", imports = {}))
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <E> void m5648(@Yue.InterfaceC4418 Yue.InterfaceC5599<? super E> r2, E r3) {
            java.lang.Object r0 = r2.mo495(r3)
            boolean r0 = Yue.C1024.m5572(r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            Yue.ۥ۟ۤۢۡ$ۥ r0 = new Yue.ۥ۟ۤۢۡ$ۥ
            r1 = 0
            r0.<init>(r2, r3, r1)
            r2 = 1
            Yue.C0862.m4973(r1, r0, r2, r1)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <E> java.lang.Object m5649(@Yue.InterfaceC4418 Yue.InterfaceC5599<? super E> r2, E r3) {
            java.lang.Object r0 = r2.mo495(r3)
            boolean r1 = r0 instanceof Yue.C1024.C1027
            if (r1 != 0) goto L13
            Yue.ۥۣۢ۠ۤ r0 = (Yue.C6593) r0
            Yue.ۥ۟ۤۢ۟$ۥ۟ r2 = Yue.C1024.f2933
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016
            java.lang.Object r2 = r2.m5577(r3)
            return r2
        L13:
            Yue.ۥ۟ۤۢۡ$ۥ۟ r0 = new Yue.ۥ۟ۤۢۡ$ۥ۟
            r1 = 0
            r0.<init>(r2, r3, r1)
            r2 = 1
            java.lang.Object r2 = Yue.C0862.m4973(r1, r0, r2, r1)
            Yue.ۥ۟ۤۢ۟ r2 = (Yue.C1024) r2
            java.lang.Object r2 = r2.m5574()
            return r2
    }
}
