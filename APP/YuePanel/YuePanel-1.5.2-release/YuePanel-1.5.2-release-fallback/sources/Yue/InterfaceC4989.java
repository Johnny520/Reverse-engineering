package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۣۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4989 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.InterfaceC4989.C4990 f15849 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.InterfaceC4989 f15850 = null;

    /* JADX INFO: renamed from: Yue.ۥۡۥۣۤ$ۥ, reason: contains not printable characters */
    public static final class C4990 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.InterfaceC4989.C4990 f15851 = null;

        /* JADX INFO: renamed from: Yue.ۥۡۥۣۤ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C4991 implements Yue.InterfaceC4989 {
            public C4991() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // Yue.InterfaceC4989
            /* JADX INFO: renamed from: ۥ */
            public boolean mo19411(int r1, @Yue.InterfaceC4418 java.util.List<Yue.C2992> r2) {
                    r0 = this;
                    java.lang.String r1 = "requestHeaders"
                    Yue.C3329.m13906(r2, r1)
                    r1 = 1
                    return r1
            }

            @Override // Yue.InterfaceC4989
            /* JADX INFO: renamed from: ۥ۟ */
            public boolean mo19412(int r1, @Yue.InterfaceC4418 Yue.InterfaceC0849 r2, int r3, boolean r4) throws java.io.IOException {
                    r0 = this;
                    java.lang.String r1 = "source"
                    Yue.C3329.m13906(r2, r1)
                    long r3 = (long) r3
                    r2.skip(r3)
                    r1 = 1
                    return r1
            }

            @Override // Yue.InterfaceC4989
            /* JADX INFO: renamed from: ۥ۟۟ */
            public boolean mo19413(int r1, @Yue.InterfaceC4418 java.util.List<Yue.C2992> r2, boolean r3) {
                    r0 = this;
                    java.lang.String r1 = "responseHeaders"
                    Yue.C3329.m13906(r2, r1)
                    r1 = 1
                    return r1
            }

            @Override // Yue.InterfaceC4989
            /* JADX INFO: renamed from: ۥ۟۟۟ */
            public void mo19414(int r1, @Yue.InterfaceC4418 Yue.EnumC2176 r2) {
                    r0 = this;
                    java.lang.String r1 = "errorCode"
                    Yue.C3329.m13906(r2, r1)
                    return
            }
        }

        static {
                Yue.ۥۡۥۣۤ$ۥ r0 = new Yue.ۥۡۥۣۤ$ۥ
                r0.<init>()
                Yue.InterfaceC4989.C4990.f15851 = r0
                return
        }

        public C4990() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥۡۥۣۤ$ۥ r0 = Yue.InterfaceC4989.C4990.f15851
            Yue.InterfaceC4989.f15849 = r0
            Yue.ۥۡۥۣۤ$ۥ$ۥ r0 = new Yue.ۥۡۥۣۤ$ۥ$ۥ
            r0.<init>()
            Yue.InterfaceC4989.f15850 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    boolean mo19411(int r1, @Yue.InterfaceC4418 java.util.List<Yue.C2992> r2);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    boolean mo19412(int r1, @Yue.InterfaceC4418 Yue.InterfaceC0849 r2, int r3, boolean r4) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    boolean mo19413(int r1, @Yue.InterfaceC4418 java.util.List<Yue.C2992> r2, boolean r3);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    void mo19414(int r1, @Yue.InterfaceC4418 Yue.EnumC2176 r2);
}
