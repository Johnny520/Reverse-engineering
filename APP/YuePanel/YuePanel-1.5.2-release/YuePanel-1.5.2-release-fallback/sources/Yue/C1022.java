package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1022<T> extends Yue.AbstractC1001<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Iterable<Yue.InterfaceC2464<T>> f2929;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۢ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class C1023 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f2930;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2464<T> f2931;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5607<T> f2932;

        public C1023(Yue.InterfaceC2464<? extends T> r1, Yue.C5607<T> r2, Yue.InterfaceC1598<? super Yue.C1022.C1023> r3) {
                r0 = this;
                r0.f2931 = r1
                r0.f2932 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                Yue.ۥ۟ۤۢ$ۥ r3 = new Yue.ۥ۟ۤۢ$ۥ
                Yue.ۥۣ۠ۢۡ<T> r0 = r2.f2931
                Yue.ۥۡۨۡۧ<T> r1 = r2.f2932
                r3.<init>(r0, r1, r4)
                return r3
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۟ۤۢ$ۥ r1 = (Yue.C1022.C1023) r1
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
                int r1 = r3.f2930
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
                Yue.ۥۣ۠ۢۡ<T> r4 = r3.f2931
                Yue.ۥۡۨۡۧ<T> r1 = r3.f2932
                r3.f2930 = r2
                java.lang.Object r4 = r4.mo392(r1, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
                return r4
        }
    }

    public C1022(@Yue.InterfaceC4418 java.lang.Iterable<? extends Yue.InterfaceC2464<? extends T>> r1, @Yue.InterfaceC4418 Yue.InterfaceC1632 r2, int r3, @Yue.InterfaceC4418 Yue.EnumC0847 r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.f2929 = r1
            return
    }

    public /* synthetic */ C1022(java.lang.Iterable r1, Yue.InterfaceC1632 r2, int r3, Yue.EnumC0847 r4, int r5, Yue.C1769 r6) {
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L6
            Yue.ۥ۠۠ۧۦ r2 = Yue.C2141.f6728
        L6:
            r6 = r5 & 4
            if (r6 == 0) goto Lb
            r3 = -2
        Lb:
            r5 = r5 & 8
            if (r5 == 0) goto L11
            Yue.ۥۣۣ۟ r4 = Yue.EnumC0847.f2389
        L11:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public java.lang.Object mo5253(@Yue.InterfaceC4418 Yue.InterfaceC4951<? super T> r9, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r10) {
            r8 = this;
            Yue.ۥۡۨۡۧ r10 = new Yue.ۥۡۨۡۧ
            r10.<init>(r9)
            java.lang.Iterable<Yue.ۥۣ۠ۢۡ<T>> r0 = r8.f2929
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            Yue.ۥۣ۠ۢۡ r1 = (Yue.InterfaceC2464) r1
            Yue.ۥ۟ۤۢ$ۥ r5 = new Yue.ۥ۟ۤۢ$ۥ
            r2 = 0
            r5.<init>(r1, r10, r2)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            r2 = r9
            Yue.C0862.m4971(r2, r3, r4, r5, r6, r7)
            goto Lb
        L26:
            Yue.ۥۣۢ۠ۤ r9 = Yue.C6593.f23016
            return r9
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.AbstractC1001<T> mo5254(@Yue.InterfaceC4418 Yue.InterfaceC1632 r3, int r4, @Yue.InterfaceC4418 Yue.EnumC0847 r5) {
            r2 = this;
            Yue.ۥ۟ۤۢ r0 = new Yue.ۥ۟ۤۢ
            java.lang.Iterable<Yue.ۥۣ۠ۢۡ<T>> r1 = r2.f2929
            r0.<init>(r1, r3, r4, r5)
            return r0
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public Yue.InterfaceC5242<T> mo5528(@Yue.InterfaceC4418 Yue.InterfaceC1662 r4) {
            r3 = this;
            Yue.ۥ۟ۧۦۥ r0 = r3.f2877
            int r1 = r3.f2878
            Yue.ۥۣ۠ۢۢ r2 = r3.m5534()
            Yue.ۥۡۦۡۡ r4 = Yue.C4946.m19336(r4, r0, r1, r2)
            return r4
    }
}
