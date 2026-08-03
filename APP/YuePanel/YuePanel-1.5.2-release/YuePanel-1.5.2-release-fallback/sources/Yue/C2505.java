package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2505 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {"destination"}, s = {"L$0"})
    public static final class C2506<T, C extends java.util.Collection<? super T>> extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f8364;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f8365;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f8366;

        public C2506(Yue.InterfaceC1598<? super Yue.C2505.C2506> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f8365 = r2
                int r2 = r1.f8366
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f8366 = r2
                r2 = 0
                java.lang.Object r2 = Yue.C2472.m11650(r2, r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤ۠$ۥ۟, reason: contains not printable characters */
    public static final class C2507<T> implements Yue.InterfaceC2466 {

        /* JADX INFO: Incorrect field signature: TC; */
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.Collection f8367;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public C2507(java.util.Collection r1) {
                r0 = this;
                r0.f8367 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC2466
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public final java.lang.Object mo5352(T r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                java.util.Collection r2 = r0.f8367
                r2.add(r1)
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
                return r1
        }
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object m11694(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r4, @Yue.InterfaceC4418 C r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super C> r6) {
            boolean r0 = r6 instanceof Yue.C2505.C2506
            if (r0 == 0) goto L13
            r0 = r6
            Yue.ۥ۠ۢۤ۠$ۥ r0 = (Yue.C2505.C2506) r0
            int r1 = r0.f8366
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8366 = r1
            goto L18
        L13:
            Yue.ۥ۠ۢۤ۠$ۥ r0 = new Yue.ۥ۠ۢۤ۠$ۥ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8365
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f8366
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f8364
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            Yue.C5391.m20403(r6)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            Yue.C5391.m20403(r6)
            Yue.ۥ۠ۢۤ۠$ۥ۟ r6 = new Yue.ۥ۠ۢۤ۠$ۥ۟
            r6.<init>(r5)
            r0.f8364 = r5
            r0.f8366 = r3
            java.lang.Object r4 = r4.mo392(r6, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            return r5
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> java.lang.Object m11695(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 java.util.List<T> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super java.util.List<? extends T>> r2) {
            java.lang.Object r0 = Yue.C2472.m11650(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m11696(Yue.InterfaceC2464 r0, java.util.List r1, Yue.InterfaceC1598 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L9:
            java.lang.Object r0 = Yue.C2472.m11651(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> java.lang.Object m11697(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r0, @Yue.InterfaceC4418 java.util.Set<T> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super java.util.Set<? extends T>> r2) {
            java.lang.Object r0 = Yue.C2472.m11650(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m11698(Yue.InterfaceC2464 r0, java.util.Set r1, Yue.InterfaceC1598 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L9
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
        L9:
            java.lang.Object r0 = Yue.C2472.m11653(r0, r1, r2)
            return r0
    }
}
