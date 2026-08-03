package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1018<E> {

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۧ$ۥ, reason: contains not printable characters */
    public static final class C1019 {

        /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۧ$ۥ$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC1744(c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", f = "Channel.kt", i = {0}, l = {584}, m = "next", n = {"this"}, s = {"L$0"})
        public static final class C1020<E> extends Yue.AbstractC1600 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public java.lang.Object f2926;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ java.lang.Object f2927;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f2928;

            public C1020(Yue.InterfaceC1598<? super Yue.InterfaceC1018.C1019.C1020> r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // Yue.AbstractC0730
            @Yue.InterfaceC4543
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r2) {
                    r1 = this;
                    r1.f2927 = r2
                    int r2 = r1.f2928
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.f2928 = r2
                    r2 = 0
                    java.lang.Object r2 = Yue.InterfaceC1018.C1019.m5551(r2, r1)
                    return r2
            }
        }

        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @Yue.InterfaceC3421(name = "next")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ java.lang.Object m5551(Yue.InterfaceC1018 r4, Yue.InterfaceC1598 r5) {
                boolean r0 = r5 instanceof Yue.InterfaceC1018.C1019.C1020
                if (r0 == 0) goto L13
                r0 = r5
                Yue.ۥ۟ۤۡۧ$ۥ$ۥ r0 = (Yue.InterfaceC1018.C1019.C1020) r0
                int r1 = r0.f2928
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f2928 = r1
                goto L18
            L13:
                Yue.ۥ۟ۤۡۧ$ۥ$ۥ r0 = new Yue.ۥ۟ۤۡۧ$ۥ$ۥ
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f2927
                java.lang.Object r1 = Yue.C3341.m13947()
                int r2 = r0.f2928
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.f2926
                Yue.ۥ۟ۤۡۧ r4 = (Yue.InterfaceC1018) r4
                Yue.C5391.m20403(r5)
                goto L43
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                Yue.C5391.m20403(r5)
                r0.f2926 = r4
                r0.f2928 = r3
                java.lang.Object r5 = r4.mo342(r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L50
                java.lang.Object r4 = r4.next()
                return r4
            L50:
                Yue.ۥ۟ۥ۟ۢ r4 = new Yue.ۥ۟ۥ۟ۢ
                java.lang.String r5 = "Channel was closed"
                r4.<init>(r5)
                throw r4
        }
    }

    E next();

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    @Yue.InterfaceC3421(name = "next")
    /* JADX INFO: renamed from: ۥ */
    /* synthetic */ java.lang.Object mo341(Yue.InterfaceC1598 r1);

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟ */
    java.lang.Object mo342(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super java.lang.Boolean> r1);
}
