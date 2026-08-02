package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tq2 {
    public static final int $stable = 0;
    public static final C0745b Companion = new C0745b(null);
    private final String challenge;
    private final String message;

    /* JADX INFO: renamed from: tq2$a */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    @j70
    public static final /* synthetic */ class C0744a implements qo0 {
        public static final int $stable = 0;
        public static final C0744a INSTANCE;
        private static final yo2 descriptor;

        static {
            C0744a c0744a = new C0744a();
            INSTANCE = c0744a;
            b12 b12Var = new b12("nuke.data.model.SignedData", c0744a, 2);
            b12Var.m359l("challenge", false);
            b12Var.m359l("message", false);
            descriptor = b12Var;
        }

        private C0744a() {
        }

        @Override // p000.qo0
        /* JADX INFO: renamed from: b */
        public final w41[] mo166b() {
            nv2 nv2Var = nv2.f7346a;
            return new w41[]{nv2Var, nv2Var};
        }

        @Override // p000.qo0
        /* JADX INFO: renamed from: c */
        public /* bridge */ w41[] mo3344c() {
            return p40.f7976l;
        }

        @Override // p000.w41
        /* JADX INFO: renamed from: e */
        public final yo2 mo168e() {
            return descriptor;
        }

        @Override // p000.w41
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final tq2 mo165a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
            dp2 dp2Var = null;
            boolean z = true;
            int i = 0;
            String strMo4563n = null;
            String strMo4563n2 = null;
            while (z) {
                int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
                if (iMo901j == -1) {
                    z = false;
                } else if (iMo901j == 0) {
                    strMo4563n = interfaceC0826vxMo895b.mo4563n(yo2Var, 0);
                    i |= 1;
                } else {
                    if (iMo901j != 1) {
                        throw new e83(iMo901j);
                    }
                    strMo4563n2 = interfaceC0826vxMo895b.mo4563n(yo2Var, 1);
                    i |= 2;
                }
            }
            interfaceC0826vxMo895b.mo894a(yo2Var);
            return new tq2(i, strMo4563n, strMo4563n2, dp2Var);
        }

        @Override // p000.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo167d(ve0 ve0Var, tq2 tq2Var) {
            ve0Var.getClass();
            tq2Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
            tq2.m5379g(tq2Var, interfaceC0863wxMo1177b, yo2Var);
            interfaceC0863wxMo1177b.mo1176a(yo2Var);
        }
    }

    public /* synthetic */ tq2(int i, String str, String str2, dp2 dp2Var) {
        if (3 != (i & 3)) {
            AbstractC0179eu.m1449b0(i, 3, C0744a.INSTANCE.mo168e());
            throw null;
        }
        this.challenge = str;
        this.message = str2;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ tq2 m5378d(tq2 tq2Var, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tq2Var.challenge;
        }
        if ((i & 2) != 0) {
            str2 = tq2Var.message;
        }
        return tq2Var.m5382c(str, str2);
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ void m5379g(tq2 tq2Var, InterfaceC0863wx interfaceC0863wx, yo2 yo2Var) {
        dv2 dv2Var = (dv2) interfaceC0863wx;
        dv2Var.m1199x(yo2Var, 0, tq2Var.challenge);
        dv2Var.m1199x(yo2Var, 1, tq2Var.message);
    }

    /* JADX INFO: renamed from: a */
    public final String m5380a() {
        return this.challenge;
    }

    /* JADX INFO: renamed from: b */
    public final String m5381b() {
        return this.message;
    }

    /* JADX INFO: renamed from: c */
    public final tq2 m5382c(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new tq2(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public final String m5383e() {
        return this.challenge;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq2)) {
            return false;
        }
        tq2 tq2Var = (tq2) obj;
        return t11.m5086l(this.challenge, tq2Var.challenge) && t11.m5086l(this.message, tq2Var.message);
    }

    /* JADX INFO: renamed from: f */
    public final String m5384f() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (this.challenge.hashCode() * 31);
    }

    public String toString() {
        return vi0.m5692k("SignedData(challenge=", this.challenge, ", message=", this.message, ")");
    }

    /* JADX INFO: renamed from: tq2$b */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class C0745b {
        public /* synthetic */ C0745b(c50 c50Var) {
            this();
        }

        public final w41 serializer() {
            return C0744a.INSTANCE;
        }

        private C0745b() {
        }
    }

    public tq2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.challenge = str;
        this.message = str2;
    }
}
