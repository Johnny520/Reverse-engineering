package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5599<E> {

    /* JADX INFO: renamed from: Yue.ۥۡۨۡ۠$ۥ, reason: contains not printable characters */
    public static final class C5600 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ boolean m20959(Yue.InterfaceC5599 r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lc
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                boolean r0 = r0.mo492(r1)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: close"
                r0.<init>(r1)
                throw r0
        }

        @Yue.InterfaceC2302
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m20960() {
                return
        }

        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in the favour of 'trySend' method", replaceWith = @Yue.InterfaceC5313(expression = "trySend(element).isSuccess", imports = {}))
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <E> boolean m20961(@Yue.InterfaceC4418 Yue.InterfaceC5599<? super E> r0, E r1) {
                java.lang.Object r0 = r0.mo495(r1)
                boolean r1 = Yue.C1024.m5572(r0)
                if (r1 == 0) goto Lc
                r0 = 1
                return r0
            Lc:
                java.lang.Throwable r0 = Yue.C1024.m5565(r0)
                if (r0 != 0) goto L14
                r0 = 0
                return r0
            L14:
                java.lang.Throwable r0 = Yue.C5912.m21959(r0)
                throw r0
        }
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in the favour of 'trySend' method", replaceWith = @Yue.InterfaceC5313(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E r1);

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    java.lang.Object mo476(E r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r2);

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    Yue.InterfaceC5563<E, Yue.InterfaceC5599<E>> mo488();

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    boolean mo492(@Yue.InterfaceC4543 java.lang.Throwable r1);

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    java.lang.Object mo495(E r1);

    @Yue.InterfaceC2302
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    void mo498(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r1);

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    boolean mo499();
}
