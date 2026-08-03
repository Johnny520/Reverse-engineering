package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3324
public abstract class AbstractC1001<T> implements Yue.InterfaceC2855<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.InterfaceC1632 f2877;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public final int f2878;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.EnumC0847 f2879;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۡ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    public static final class C1002 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC1662, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f2880;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f2881;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2466<T> f2882;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC1001<T> f2883;

        public C1002(Yue.InterfaceC2466<? super T> r1, Yue.AbstractC1001<T> r2, Yue.InterfaceC1598<? super Yue.AbstractC1001.C1002> r3) {
                r0 = this;
                r0.f2882 = r1
                r0.f2883 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r4, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r5) {
                r3 = this;
                Yue.ۥ۟ۤۡ۠$ۥ r0 = new Yue.ۥ۟ۤۡ۠$ۥ
                Yue.ۥۣۣ۠ۢ<T> r1 = r3.f2882
                Yue.ۥ۟ۤۡ۠<T> r2 = r3.f2883
                r0.<init>(r1, r2, r5)
                r0.f2881 = r4
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۟ۤۡ۠$ۥ r1 = (Yue.AbstractC1001.C1002) r1
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
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r4.f2880
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C5391.m20403(r5)
                goto L2f
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                Yue.C5391.m20403(r5)
                java.lang.Object r5 = r4.f2881
                Yue.ۥ۟ۧۧۥ r5 = (Yue.InterfaceC1662) r5
                Yue.ۥۣۣ۠ۢ<T> r1 = r4.f2882
                Yue.ۥ۟ۤۡ۠<T> r3 = r4.f2883
                Yue.ۥۡۦۡۡ r5 = r3.mo5528(r5)
                r4.f2880 = r2
                java.lang.Object r5 = Yue.C2472.m11563(r1, r5, r4)
                if (r5 != r0) goto L2f
                return r0
            L2f:
                Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
                return r5
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۡ۠$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class C1003 extends Yue.AbstractC6067 implements Yue.InterfaceC2839<Yue.InterfaceC4951<? super T>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f2884;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f2885;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC1001<T> f2886;

        public C1003(Yue.AbstractC1001<T> r1, Yue.InterfaceC1598<? super Yue.AbstractC1001.C1003> r2) {
                r0 = this;
                r0.f2886 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4418
        public final Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
                r2 = this;
                Yue.ۥ۟ۤۡ۠$ۥ۟ r0 = new Yue.ۥ۟ۤۡ۠$ۥ۟
                Yue.ۥ۟ۤۡ۠<T> r1 = r2.f2886
                r0.<init>(r1, r4)
                r0.f2885 = r3
                return r0
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥۡۥۡۤ r1 = (Yue.InterfaceC4951) r1
                Yue.ۥ۟ۧۤۢ r2 = (Yue.InterfaceC1598) r2
                java.lang.Object r1 = r0.m5536(r1, r2)
                return r1
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = Yue.C3341.m13947()
                int r1 = r3.f2884
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
                java.lang.Object r4 = r3.f2885
                Yue.ۥۡۥۡۤ r4 = (Yue.InterfaceC4951) r4
                Yue.ۥ۟ۤۡ۠<T> r1 = r3.f2886
                r3.f2884 = r2
                java.lang.Object r4 = r1.mo5253(r4, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016
                return r4
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final java.lang.Object m5536(@Yue.InterfaceC4418 Yue.InterfaceC4951<? super T> r1, @Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r2) {
                r0 = this;
                Yue.ۥ۟ۧۤۢ r1 = r0.create(r1, r2)
                Yue.ۥ۟ۤۡ۠$ۥ۟ r1 = (Yue.AbstractC1001.C1003) r1
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }
    }

    public AbstractC1001(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, int r2, @Yue.InterfaceC4418 Yue.EnumC0847 r3) {
            r0 = this;
            r0.<init>()
            r0.f2877 = r1
            r0.f2878 = r2
            r0.f2879 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m5532(Yue.AbstractC1001 r2, Yue.InterfaceC2466 r3, Yue.InterfaceC1598 r4) {
            Yue.ۥ۟ۤۡ۠$ۥ r0 = new Yue.ۥ۟ۤۡ۠$ۥ
            r1 = 0
            r0.<init>(r3, r2, r1)
            java.lang.Object r2 = Yue.C1663.m8007(r0, r4)
            java.lang.Object r3 = Yue.C3341.m13947()
            if (r2 != r3) goto L11
            return r2
        L11:
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
            return r2
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = r10.mo5526()
            if (r1 == 0) goto Lf
            r0.add(r1)
        Lf:
            Yue.ۥ۟ۧۦۥ r1 = r10.f2877
            Yue.ۥ۠۠ۧۦ r2 = Yue.C2141.f6728
            if (r1 == r2) goto L2b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "context="
            r1.append(r2)
            Yue.ۥ۟ۧۦۥ r2 = r10.f2877
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L2b:
            int r1 = r10.f2878
            r2 = -3
            if (r1 == r2) goto L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "capacity="
            r1.append(r2)
            int r2 = r10.f2878
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L46:
            Yue.ۥۣۣ۟ r1 = r10.f2879
            Yue.ۥۣۣ۟ r2 = Yue.EnumC0847.f2389
            if (r1 == r2) goto L62
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onBufferOverflow="
            r1.append(r2)
            Yue.ۥۣۣ۟ r2 = r10.f2879
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L62:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = Yue.C1758.m8350(r10)
            r9.append(r1)
            r1 = 91
            r9.append(r1)
            r7 = 62
            r8 = 0
            java.lang.String r1 = ", "
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r0 = Yue.C1219.m6398(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r9.append(r0)
            r0 = 93
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            return r0
    }

    @Override // Yue.InterfaceC2464
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ */
    public java.lang.Object mo392(@Yue.InterfaceC4418 Yue.InterfaceC2466<? super T> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2) {
            r0 = this;
            java.lang.Object r1 = m5532(r0, r1, r2)
            return r1
    }

    @Override // Yue.InterfaceC2855
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.InterfaceC2464<T> mo5533(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2, int r3, @Yue.InterfaceC4418 Yue.EnumC0847 r4) {
            r1 = this;
            Yue.ۥ۟ۧۦۥ r0 = r1.f2877
            Yue.ۥ۟ۧۦۥ r2 = r2.plus(r0)
            Yue.ۥۣۣ۟ r0 = Yue.EnumC0847.f2389
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f2878
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            Yue.ۥۣۣ۟ r4 = r1.f2879
        L25:
            Yue.ۥ۟ۧۦۥ r0 = r1.f2877
            boolean r0 = Yue.C3329.m13897(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f2878
            if (r3 != r0) goto L36
            Yue.ۥۣۣ۟ r0 = r1.f2879
            if (r4 != r0) goto L36
            return r1
        L36:
            Yue.ۥ۟ۤۡ۠ r2 = r1.mo5254(r2, r3, r4)
            return r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public java.lang.String mo5526() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public abstract java.lang.Object mo5253(@Yue.InterfaceC4418 Yue.InterfaceC4951<? super T> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2);

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public abstract Yue.AbstractC1001<T> mo5254(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, int r2, @Yue.InterfaceC4418 Yue.EnumC0847 r3);

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public Yue.InterfaceC2464<T> mo5527() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.InterfaceC2839<Yue.InterfaceC4951<? super T>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> m5534() {
            r2 = this;
            Yue.ۥ۟ۤۡ۠$ۥ۟ r0 = new Yue.ۥ۟ۤۡ۠$ۥ۟
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m5535() {
            r2 = this;
            int r0 = r2.f2878
            r1 = -3
            if (r0 != r1) goto L6
            r0 = -2
        L6:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public Yue.InterfaceC5242<T> mo5528(@Yue.InterfaceC4418 Yue.InterfaceC1662 r10) {
            r9 = this;
            Yue.ۥ۟ۧۦۥ r1 = r9.f2877
            int r2 = r9.m5535()
            Yue.ۥۣۣ۟ r3 = r9.f2879
            Yue.ۥ۟ۧۨ r4 = Yue.EnumC1666.f5154
            Yue.ۥۣ۠ۢۢ r6 = r9.m5534()
            r7 = 16
            r8 = 0
            r5 = 0
            r0 = r10
            Yue.ۥۡۦۡۡ r10 = Yue.C4946.m19337(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }
}
