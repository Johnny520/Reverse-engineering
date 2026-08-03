package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5495
public interface InterfaceC4364 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۨ$ۥ */
    public static final class C0387 {
        @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated without replacement as an internal method never intended for public use")
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public static Object m1320(@InterfaceC6399 InterfaceC4364 interfaceC4364, long j, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            if (j <= 0) {
                return C8107.f3222;
            }
            C3666 c3666 = new C3666(C5501.m17135(interfaceC4199), 1);
            c3666.mo10020();
            interfaceC4364.mo12618(j, c3666);
            Object objM10039 = c3666.m10039();
            if (objM10039 == C5508.m17142()) {
                C4324.m12513(interfaceC4199);
            }
            return objM10039 == C5508.m17142() ? objM10039 : C8107.f3222;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public static InterfaceC4433 m1321(@InterfaceC6399 InterfaceC4364 interfaceC4364, long j, @InterfaceC6399 Runnable runnable, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
            return C4338.m1303().mo12587(j, runnable, interfaceC4225);
        }
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated without replacement as an internal method never intended for public use")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    Object mo12617(long j, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    InterfaceC4433 mo12587(long j, @InterfaceC6399 Runnable runnable, @InterfaceC6399 InterfaceC4225 interfaceC4225);

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    void mo12618(long j, @InterfaceC6399 InterfaceC3665<? super C8107> interfaceC3665);
}
