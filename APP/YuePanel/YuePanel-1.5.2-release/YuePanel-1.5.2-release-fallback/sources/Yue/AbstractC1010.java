package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1010<S, T> extends Yue.AbstractC1001<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.InterfaceC2464<S> f2903;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    public static final class C1011 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC2466<? super T>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f2904;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f2905;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC1010<S, T> f2906;

        public C1011(Yue.AbstractC1010<S, T> r1, Yue.InterfaceC1598<? super Yue.AbstractC1010.C1011> r2) {
                r0 = this;
                r0.f2906 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                Yue.ۥ۟ۤۡۤ$ۥ r0 = new Yue.ۥ۟ۤۡۤ$ۥ
                Yue.ۥ۟ۤۡۤ<S, T> r1 = r2.f2906
                r0.<init>(r1, r4)
                r0.f2905 = r3
                return r0
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC2466) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m5549(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r3.f2904
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r4)
                goto L29
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                Yue.C5391.m20403(r4)
                java.lang.Object r4 = r3.f2905
                Yue.ۥۣۣ۠ۢ r4 = (Yue.InterfaceC2466) r4
                Yue.ۥ۟ۤۡۤ<S, T> r1 = r3.f2906
                r3.f2904 = r2
                java.lang.Object r4 = r1.mo5548(r4, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
                return r4
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m5549(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۟ۤۡۤ$ۥ r1 = (Yue.AbstractC1010.C1011) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    public AbstractC1010(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends S> r1, @Yue.InterfaceC4418 Yue.InterfaceC1632 r2, int r3, @Yue.InterfaceC4418 Yue.EnumC0847 r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.f2903 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m5544(Yue.AbstractC1010 r0, Yue.InterfaceC2466 r1, Yue.InterfaceC1632 r2, Yue.InterfaceC1598 r3) {
            java.lang.Object r0 = r0.m5547(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m5545(Yue.AbstractC1010 r4, Yue.InterfaceC2466 r5, Yue.InterfaceC1598 r6) {
            int r0 = r4.f2878
            r1 = -3
            if (r0 != r1) goto L41
            Yue.ۥ۟ۧۦۥ r0 = r6.getContext()
            Yue.ۥ۟ۧۦۥ r1 = r4.f2877
            Yue.ۥ۟ۧۦۥ r1 = r0.plus(r1)
            boolean r2 = Yue.C3329.m13897(r1, r0)
            if (r2 == 0) goto L23
            java.lang.Object r4 = r4.mo5548(r5, r6)
            java.lang.Object r5 = Yue.C3341.m13947()
            if (r4 != r5) goto L20
            return r4
        L20:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            return r4
        L23:
            Yue.ۥ۟ۧۤۥ$ۥ۟ r2 = Yue.InterfaceC1601.f5016
            Yue.ۥ۟ۧۦۥ$ۥ۟ r3 = r1.get(r2)
            Yue.ۥ۟ۧۦۥ$ۥ۟ r0 = r0.get(r2)
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto L41
            java.lang.Object r4 = r4.m5547(r5, r1, r6)
            java.lang.Object r5 = Yue.C3341.m13947()
            if (r4 != r5) goto L3e
            return r4
        L3e:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            return r4
        L41:
            java.lang.Object r4 = super.mo392(r5, r6)
            java.lang.Object r5 = Yue.C3341.m13947()
            if (r4 != r5) goto L4c
            return r4
        L4c:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m5546(Yue.AbstractC1010 r1, Yue.InterfaceC4951 r2, Yue.InterfaceC1598 r3) {
            Yue.ۥۡۨۡۧ r0 = new Yue.ۥۡۨۡۧ
            r0.<init>(r2)
            java.lang.Object r1 = r1.mo5548(r0, r3)
            java.lang.Object r2 = Yue.C3341.m13947()
            if (r1 != r2) goto L10
            return r1
        L10:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            Yue.ۥۣ۠ۢۡ<S> r1 = r2.f2903
            r0.append(r1)
            java.lang.String r1 = " -> "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC1001, Yue.InterfaceC2464
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ */
    public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2) {
            r0 = this;
            java.lang.Object r1 = m5545(r0, r1, r2)
            return r1
    }

    @Override // Yue.AbstractC1001
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public java.lang.Object mo5253(@Yue.InterfaceC4418 Yue.InterfaceC4951<? super T> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2) {
            r0 = this;
            java.lang.Object r1 = m5546(r0, r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final java.lang.Object m5547(Yue.InterfaceC2466<? super T> r9, Yue.InterfaceC1632 r10, Yue.InterfaceC1598<? super Yue.C6593> r11) {
            r8 = this;
            Yue.ۥ۟ۧۦۥ r0 = r11.getContext()
            Yue.ۥۣۣ۠ۢ r2 = Yue.C1005.m5538(r9, r0)
            Yue.ۥ۟ۤۡۤ$ۥ r4 = new Yue.ۥ۟ۤۡۤ$ۥ
            r9 = 0
            r4.<init>(r8, r9)
            r6 = 4
            r7 = 0
            r3 = 0
            r1 = r10
            r5 = r11
            java.lang.Object r9 = Yue.C1005.m5541(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r10 = Yue.C3341.m13947()
            if (r9 != r10) goto L1e
            return r9
        L1e:
            Yue.ۥۣۢ۠ۤ r9 = Yue.C6593.f23016
            return r9
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public abstract java.lang.Object mo5548(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2);
}
