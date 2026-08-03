package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0911<T> extends Yue.C1004<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2839<Yue.InterfaceC4951<? super T>, Yue.InterfaceC1598<? super Yue.C6593>, java.lang.Object> f2654;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۦۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC1744(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {336}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    public static final class C0912 extends Yue.AbstractC1600 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.Object f2655;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ java.lang.Object f2656;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0911<T> f2657;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f2658;

        public C0912(Yue.C0911<T> r1, Yue.InterfaceC1598<? super Yue.C0911.C0912> r2) {
                r0 = this;
                r0.f2657 = r1
                r0.<init>(r2)
                return
        }

        @Override // Yue.AbstractC0730
        @Yue.InterfaceC4543
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                r1 = this;
                r1.f2656 = r2
                int r2 = r1.f2658
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f2658 = r2
                Yue.ۥۣ۟ۦۨ<T> r2 = r1.f2657
                r0 = 0
                java.lang.Object r2 = r2.mo5253(r0, r1)
                return r2
        }
    }

    public C0911(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC4951<? super T>, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r1, @Yue.InterfaceC4418 Yue.InterfaceC1632 r2, int r3, @Yue.InterfaceC4418 Yue.EnumC0847 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.f2654 = r1
            return
    }

    public /* synthetic */ C0911(Yue.InterfaceC2839 r1, Yue.InterfaceC1632 r2, int r3, Yue.EnumC0847 r4, int r5, Yue.C1769 r6) {
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

    @Override // Yue.C1004, Yue.AbstractC1001
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.lang.Object mo5253(@Yue.InterfaceC4418 Yue.InterfaceC4951<? super T> r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r6) {
            r4 = this;
            boolean r0 = r6 instanceof Yue.C0911.C0912
            if (r0 == 0) goto L13
            r0 = r6
            Yue.ۥۣ۟ۦۨ$ۥ r0 = (Yue.C0911.C0912) r0
            int r1 = r0.f2658
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2658 = r1
            goto L18
        L13:
            Yue.ۥۣ۟ۦۨ$ۥ r0 = new Yue.ۥۣ۟ۦۨ$ۥ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2656
            java.lang.Object r1 = Yue.C3341.m13947()
            int r2 = r0.f2658
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f2655
            Yue.ۥۡۥۡۤ r5 = (Yue.InterfaceC4951) r5
            Yue.C5391.m20403(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            Yue.C5391.m20403(r6)
            r0.f2655 = r5
            r0.f2658 = r3
            java.lang.Object r6 = super.mo5253(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.mo499()
            if (r5 == 0) goto L4c
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
    }

    @Override // Yue.C1004, Yue.AbstractC1001
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.AbstractC1001<T> mo5254(@Yue.InterfaceC4418 Yue.InterfaceC1632 r3, int r4, @Yue.InterfaceC4418 Yue.EnumC0847 r5) {
            r2 = this;
            Yue.ۥۣ۟ۦۨ r0 = new Yue.ۥۣ۟ۦۨ
            Yue.ۥۣ۠ۢۢ<Yue.ۥۡۥۡۤ<? super T>, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r1 = r2.f2654
            r0.<init>(r1, r3, r4, r5)
            return r0
    }
}
