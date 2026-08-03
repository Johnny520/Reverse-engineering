package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5813 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class C5814<T> extends Yue.AbstractC5386 implements Yue.InterfaceC2839<Yue.AbstractC5611<? super java.util.List<? extends T>>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public java.lang.Object f21327;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public java.lang.Object f21328;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f21329;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f21330;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f21331;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ int f21332;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final /* synthetic */ int f21333;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.Iterator<T> f21334;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final /* synthetic */ boolean f21335;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public final /* synthetic */ boolean f21336;

        public C5814(int r1, int r2, java.util.Iterator<? extends T> r3, boolean r4, boolean r5, Yue.InterfaceC1598<? super Yue.C5813.C5814> r6) {
                r0 = this;
                r0.f21332 = r1
                r0.f21333 = r2
                r0.f21334 = r3
                r0.f21335 = r4
                r0.f21336 = r5
                r1 = 2
                r0.<init>(r1, r6)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r9, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r10) {
                r8 = this;
                Yue.ۥۢ۟ۢ۟$ۥ r7 = new Yue.ۥۢ۟ۢ۟$ۥ
                int r1 = r8.f21332
                int r2 = r8.f21333
                java.util.Iterator<T> r3 = r8.f21334
                boolean r4 = r8.f21335
                boolean r5 = r8.f21336
                r0 = r7
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7.f21331 = r9
                return r7
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥۡۨۢ۠ r1 = (Yue.AbstractC5611) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m21662(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r10.f21330
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L57
                if (r1 == r6) goto L44
                if (r1 == r5) goto L3f
                if (r1 == r4) goto L2e
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                goto L3f
            L19:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L21:
                java.lang.Object r1 = r10.f21327
                Yue.ۥۡۧ۟ۧ r1 = (Yue.C5426) r1
                java.lang.Object r4 = r10.f21331
                Yue.ۥۡۨۢ۠ r4 = (Yue.AbstractC5611) r4
                Yue.C5391.m20403(r11)
                goto L149
            L2e:
                java.lang.Object r1 = r10.f21328
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r10.f21327
                Yue.ۥۡۧ۟ۧ r5 = (Yue.C5426) r5
                java.lang.Object r8 = r10.f21331
                Yue.ۥۡۨۢ۠ r8 = (Yue.AbstractC5611) r8
                Yue.C5391.m20403(r11)
                goto L11b
            L3f:
                Yue.C5391.m20403(r11)
                goto L165
            L44:
                int r1 = r10.f21329
                java.lang.Object r2 = r10.f21328
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r3 = r10.f21327
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r4 = r10.f21331
                Yue.ۥۡۨۢ۠ r4 = (Yue.AbstractC5611) r4
                Yue.C5391.m20403(r11)
            L55:
                r11 = r1
                goto La5
            L57:
                Yue.C5391.m20403(r11)
                java.lang.Object r11 = r10.f21331
                Yue.ۥۡۨۢ۠ r11 = (Yue.AbstractC5611) r11
                int r1 = r10.f21332
                r8 = 1024(0x400, float:1.435E-42)
                int r1 = Yue.C5196.m19521(r1, r8)
                int r8 = r10.f21333
                int r9 = r10.f21332
                int r8 = r8 - r9
                if (r8 < 0) goto Ld9
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                java.util.Iterator<T> r1 = r10.f21334
                r3 = 0
                r4 = r11
                r11 = r3
                r3 = r2
                r2 = r1
                r1 = r8
            L7a:
                boolean r8 = r2.hasNext()
                if (r8 == 0) goto Lb7
                java.lang.Object r8 = r2.next()
                if (r11 <= 0) goto L89
                int r11 = r11 + (-1)
                goto L7a
            L89:
                r3.add(r8)
                int r8 = r3.size()
                int r9 = r10.f21332
                if (r8 != r9) goto L7a
                r10.f21331 = r4
                r10.f21327 = r3
                r10.f21328 = r2
                r10.f21329 = r1
                r10.f21330 = r6
                java.lang.Object r11 = r4.mo20973(r3, r10)
                if (r11 != r0) goto L55
                return r0
            La5:
                boolean r1 = r10.f21335
                if (r1 == 0) goto Lad
                r3.clear()
                goto Lb5
            Lad:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r10.f21332
                r1.<init>(r3)
                r3 = r1
            Lb5:
                r1 = r11
                goto L7a
            Lb7:
                boolean r11 = r3.isEmpty()
                r11 = r11 ^ r6
                if (r11 == 0) goto L165
                boolean r11 = r10.f21336
                if (r11 != 0) goto Lca
                int r11 = r3.size()
                int r1 = r10.f21332
                if (r11 != r1) goto L165
            Lca:
                r10.f21331 = r7
                r10.f21327 = r7
                r10.f21328 = r7
                r10.f21330 = r5
                java.lang.Object r11 = r4.mo20973(r3, r10)
                if (r11 != r0) goto L165
                return r0
            Ld9:
                Yue.ۥۡۧ۟ۧ r5 = new Yue.ۥۡۧ۟ۧ
                r5.<init>(r1)
                java.util.Iterator<T> r1 = r10.f21334
                r8 = r11
            Le1:
                boolean r11 = r1.hasNext()
                if (r11 == 0) goto L121
                java.lang.Object r11 = r1.next()
                r5.m20452(r11)
                boolean r11 = r5.m20455()
                if (r11 == 0) goto Le1
                int r11 = r5.size()
                int r9 = r10.f21332
                if (r11 >= r9) goto L101
                Yue.ۥۡۧ۟ۧ r5 = r5.m20453(r9)
                goto Le1
            L101:
                boolean r11 = r10.f21335
                if (r11 == 0) goto L107
                r11 = r5
                goto L10c
            L107:
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>(r5)
            L10c:
                r10.f21331 = r8
                r10.f21327 = r5
                r10.f21328 = r1
                r10.f21330 = r4
                java.lang.Object r11 = r8.mo20973(r11, r10)
                if (r11 != r0) goto L11b
                return r0
            L11b:
                int r11 = r10.f21333
                r5.m20456(r11)
                goto Le1
            L121:
                boolean r11 = r10.f21336
                if (r11 == 0) goto L165
                r1 = r5
                r4 = r8
            L127:
                int r11 = r1.size()
                int r5 = r10.f21333
                if (r11 <= r5) goto L14f
                boolean r11 = r10.f21335
                if (r11 == 0) goto L135
                r11 = r1
                goto L13a
            L135:
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>(r1)
            L13a:
                r10.f21331 = r4
                r10.f21327 = r1
                r10.f21328 = r7
                r10.f21330 = r3
                java.lang.Object r11 = r4.mo20973(r11, r10)
                if (r11 != r0) goto L149
                return r0
            L149:
                int r11 = r10.f21333
                r1.m20456(r11)
                goto L127
            L14f:
                boolean r11 = r1.isEmpty()
                r11 = r11 ^ r6
                if (r11 == 0) goto L165
                r10.f21331 = r7
                r10.f21327 = r7
                r10.f21328 = r7
                r10.f21330 = r2
                java.lang.Object r11 = r4.mo20973(r1, r10)
                if (r11 != r0) goto L165
                return r0
            L165:
                Yue.ۥۣۢ۠ۤ r11 = Yue.C6593.f23016
                return r11
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m21662(@Yue.InterfaceC4418 Yue.AbstractC5611<? super java.util.List<? extends T>> r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥۢ۟ۢ۟$ۥ r1 = (Yue.C5813.C5814) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢ۟$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,680:1\n19#2:681\n*E\n"})
    public static final class C5815<T> implements Yue.InterfaceC5609<java.util.List<? extends T>> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC5609 f21337;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ int f21338;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ int f21339;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ boolean f21340;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ boolean f21341;

        public C5815(Yue.InterfaceC5609 r1, int r2, int r3, boolean r4, boolean r5) {
                r0 = this;
                r0.f21337 = r1
                r0.f21338 = r2
                r0.f21339 = r3
                r0.f21340 = r4
                r0.f21341 = r5
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5609
        @Yue.InterfaceC4418
        public java.util.Iterator<java.util.List<? extends T>> iterator() {
                r5 = this;
                Yue.ۥۡۨۢ r0 = r5.f21337
                java.util.Iterator r0 = r0.iterator()
                int r1 = r5.f21338
                int r2 = r5.f21339
                boolean r3 = r5.f21340
                boolean r4 = r5.f21341
                java.util.Iterator r0 = Yue.C5813.m21660(r0, r1, r2, r3, r4)
                return r0
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m21659(int r3, int r4) {
            if (r3 <= 0) goto L5
            if (r4 <= 0) goto L5
            return
        L5:
            java.lang.String r0 = " must be greater than zero."
            if (r3 == r4) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Both size "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " and step "
            r1.append(r3)
            r1.append(r4)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            goto L3a
        L26:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "size "
            r4.append(r1)
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
        L3a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> java.util.Iterator<java.util.List<T>> m21660(@Yue.InterfaceC4418 java.util.Iterator<? extends T> r8, int r9, int r10, boolean r11, boolean r12) {
            java.lang.String r0 = "iterator"
            Yue.C3329.m13906(r8, r0)
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto Le
            Yue.ۥ۠۠ۧۨ r8 = Yue.C2143.f6731
            return r8
        Le:
            Yue.ۥۢ۟ۢ۟$ۥ r7 = new Yue.ۥۢ۟ۢ۟$ۥ
            r6 = 0
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r8
            r4 = r12
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.Iterator r8 = Yue.C5613.m20981(r7)
            return r8
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC5609<java.util.List<T>> m21661(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r7, int r8, int r9, boolean r10, boolean r11) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            m21659(r8, r9)
            Yue.ۥۢ۟ۢ۟$ۥ۟ r0 = new Yue.ۥۢ۟ۢ۟$ۥ۟
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }
}
