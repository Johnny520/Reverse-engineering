package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC2300
@Yue.InterfaceC1616
@Yue.InterfaceC5792(version = "1.3")
public interface InterfaceC1613 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۥۣ$ۥ, reason: contains not printable characters */
    public static final class C1614 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ Yue.InterfaceC0923 m7835(Yue.InterfaceC1613 r0, Yue.InterfaceC2840 r1, Yue.EnumC3346 r2, int r3, java.lang.Object r4) {
                if (r4 != 0) goto Ld
                r3 = r3 & 2
                if (r3 == 0) goto L8
                Yue.ۥ۠ۥۧۨ r2 = Yue.EnumC3346.f10798
            L8:
                Yue.ۥۣ۟ۧۡ r0 = r0.m7834(r1, r2)
                return r0
            Ld:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: callsInPlace"
                r0.<init>(r1)
                throw r0
        }
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1616
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    Yue.InterfaceC5405 m7831();

    @Yue.InterfaceC4418
    @Yue.InterfaceC1616
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    Yue.InterfaceC5405 m7832(@Yue.InterfaceC4543 java.lang.Object r1);

    @Yue.InterfaceC4418
    @Yue.InterfaceC1616
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    Yue.InterfaceC5407 m7833();

    @Yue.InterfaceC4418
    @Yue.InterfaceC1616
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    <R> Yue.InterfaceC0923 m7834(@Yue.InterfaceC4418 Yue.InterfaceC2840<? extends R> r1, @Yue.InterfaceC4418 Yue.EnumC3346 r2);
}
