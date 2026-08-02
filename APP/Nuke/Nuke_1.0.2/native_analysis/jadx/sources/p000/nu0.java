package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nu0 {
    public static final int $stable = 0;
    public static final C0515b Companion = new C0515b(null);
    private final int hostType;
    private final String patchId;
    private final String version;
    private final int versionCode;

    /* JADX INFO: renamed from: nu0$a */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    @j70
    public static final /* synthetic */ class C0514a implements qo0 {
        public static final int $stable = 0;
        public static final C0514a INSTANCE;
        private static final yo2 descriptor;

        static {
            C0514a c0514a = new C0514a();
            INSTANCE = c0514a;
            b12 b12Var = new b12("nuke.data.model.HostInfo", c0514a, 4);
            b12Var.m359l("version", false);
            b12Var.m359l("versionCode", false);
            b12Var.m359l("patchId", false);
            b12Var.m359l("hostType", false);
            descriptor = b12Var;
        }

        private C0514a() {
        }

        @Override // p000.qo0
        /* JADX INFO: renamed from: b */
        public final w41[] mo166b() {
            nv2 nv2Var = nv2.f7346a;
            f11 f11Var = f11.f2733a;
            return new w41[]{nv2Var, f11Var, nv2Var, f11Var};
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
        public final nu0 mo165a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
            int i = 0;
            int iMo4566u = 0;
            int iMo4566u2 = 0;
            String strMo4563n = null;
            String strMo4563n2 = null;
            boolean z = true;
            while (z) {
                int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
                if (iMo901j == -1) {
                    z = false;
                } else if (iMo901j == 0) {
                    strMo4563n = interfaceC0826vxMo895b.mo4563n(yo2Var, 0);
                    i |= 1;
                } else if (iMo901j == 1) {
                    iMo4566u = interfaceC0826vxMo895b.mo4566u(yo2Var, 1);
                    i |= 2;
                } else if (iMo901j == 2) {
                    strMo4563n2 = interfaceC0826vxMo895b.mo4563n(yo2Var, 2);
                    i |= 4;
                } else {
                    if (iMo901j != 3) {
                        throw new e83(iMo901j);
                    }
                    iMo4566u2 = interfaceC0826vxMo895b.mo4566u(yo2Var, 3);
                    i |= 8;
                }
            }
            interfaceC0826vxMo895b.mo894a(yo2Var);
            return new nu0(i, strMo4563n, iMo4566u, strMo4563n2, iMo4566u2, null);
        }

        @Override // p000.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo167d(ve0 ve0Var, nu0 nu0Var) {
            ve0Var.getClass();
            nu0Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
            nu0.m3410k(nu0Var, interfaceC0863wxMo1177b, yo2Var);
            interfaceC0863wxMo1177b.mo1176a(yo2Var);
        }
    }

    public /* synthetic */ nu0(int i, String str, int i2, String str2, int i3, dp2 dp2Var) {
        if (15 != (i & 15)) {
            AbstractC0179eu.m1449b0(i, 15, C0514a.INSTANCE.mo168e());
            throw null;
        }
        this.version = str;
        this.versionCode = i2;
        this.patchId = str2;
        this.hostType = i3;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ nu0 m3409f(nu0 nu0Var, String str, int i, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = nu0Var.version;
        }
        if ((i3 & 2) != 0) {
            i = nu0Var.versionCode;
        }
        if ((i3 & 4) != 0) {
            str2 = nu0Var.patchId;
        }
        if ((i3 & 8) != 0) {
            i2 = nu0Var.hostType;
        }
        return nu0Var.m3415e(str, i, str2, i2);
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ void m3410k(nu0 nu0Var, InterfaceC0863wx interfaceC0863wx, yo2 yo2Var) {
        dv2 dv2Var = (dv2) interfaceC0863wx;
        dv2Var.m1199x(yo2Var, 0, nu0Var.version);
        dv2Var.m1196u(1, nu0Var.versionCode, yo2Var);
        dv2Var.m1199x(yo2Var, 2, nu0Var.patchId);
        dv2Var.m1196u(3, nu0Var.hostType, yo2Var);
    }

    /* JADX INFO: renamed from: a */
    public final String m3411a() {
        return this.version;
    }

    /* JADX INFO: renamed from: b */
    public final int m3412b() {
        return this.versionCode;
    }

    /* JADX INFO: renamed from: c */
    public final String m3413c() {
        return this.patchId;
    }

    /* JADX INFO: renamed from: d */
    public final int m3414d() {
        return this.hostType;
    }

    /* JADX INFO: renamed from: e */
    public final nu0 m3415e(String str, int i, String str2, int i2) {
        str.getClass();
        str2.getClass();
        return new nu0(str, i, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu0)) {
            return false;
        }
        nu0 nu0Var = (nu0) obj;
        return t11.m5086l(this.version, nu0Var.version) && this.versionCode == nu0Var.versionCode && t11.m5086l(this.patchId, nu0Var.patchId) && this.hostType == nu0Var.hostType;
    }

    /* JADX INFO: renamed from: g */
    public final int m3416g() {
        return this.hostType;
    }

    /* JADX INFO: renamed from: h */
    public final String m3417h() {
        return this.patchId;
    }

    public int hashCode() {
        return Integer.hashCode(this.hostType) + hk1.m2207f(this.patchId, vi0.m5685d(this.versionCode, this.version.hashCode() * 31, 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m3418i() {
        return this.version;
    }

    /* JADX INFO: renamed from: j */
    public final int m3419j() {
        return this.versionCode;
    }

    public String toString() {
        return "HostInfo(version=" + this.version + ", versionCode=" + this.versionCode + ", patchId=" + this.patchId + ", hostType=" + this.hostType + ")";
    }

    /* JADX INFO: renamed from: nu0$b */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class C0515b {
        public /* synthetic */ C0515b(c50 c50Var) {
            this();
        }

        public final w41 serializer() {
            return C0514a.INSTANCE;
        }

        private C0515b() {
        }
    }

    public nu0(String str, int i, String str2, int i2) {
        str.getClass();
        str2.getClass();
        this.version = str;
        this.versionCode = i;
        this.patchId = str2;
        this.hostType = i2;
    }
}
