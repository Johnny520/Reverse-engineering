package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0932<T> extends Yue.InterfaceC1598<T> {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨ۟$ۥ, reason: contains not printable characters */
    public static final class C0933 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ boolean m5310(Yue.InterfaceC0932 r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lc
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                boolean r0 = r0.mo5298(r1)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ java.lang.Object m5311(Yue.InterfaceC0932 r0, java.lang.Object r1, java.lang.Object r2, int r3, java.lang.Object r4) {
                if (r4 != 0) goto Lc
                r3 = r3 & 2
                if (r3 == 0) goto L7
                r2 = 0
            L7:
                java.lang.Object r0 = r0.mo5302(r1, r2)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: tryResume"
                r0.<init>(r1)
                throw r0
        }
    }

    boolean isCancelled();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    boolean mo5298(@Yue.InterfaceC4543 java.lang.Throwable r1);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    boolean mo5299();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    boolean mo5300();

    @Yue.InterfaceC2302
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    void mo5301(T r1, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r2);

    @Yue.InterfaceC3324
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    java.lang.Object mo5302(T r1, @Yue.InterfaceC4543 java.lang.Object r2);

    @Yue.InterfaceC2302
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    void mo5303(@Yue.InterfaceC4418 Yue.AbstractC1643 r1, T r2);

    @Yue.InterfaceC2302
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    void mo5304(@Yue.InterfaceC4418 Yue.AbstractC1643 r1, @Yue.InterfaceC4418 java.lang.Throwable r2);

    @Yue.InterfaceC3324
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    java.lang.Object mo5305(@Yue.InterfaceC4418 java.lang.Throwable r1);

    @Yue.InterfaceC3324
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    java.lang.Object mo5306(T r1, @Yue.InterfaceC4543 java.lang.Object r2, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r3);

    @Yue.InterfaceC3324
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    void mo5307();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    void mo5308(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r1);

    @Yue.InterfaceC3324
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    void mo5309(@Yue.InterfaceC4418 java.lang.Object r1);
}
