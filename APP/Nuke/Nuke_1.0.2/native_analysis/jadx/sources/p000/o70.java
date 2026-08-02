package p000;

import me.dartcv.nuke.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o70 {
    public static final int $stable = 0;
    public static final C0533b Companion = new C0533b(null);
    private final String abi;
    private final String brand;
    private final String model;
    private final int release;
    private final int sdk;

    /* JADX INFO: renamed from: o70$a */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    @j70
    public static final /* synthetic */ class C0532a implements qo0 {
        public static final int $stable = 0;
        public static final C0532a INSTANCE;
        private static final yo2 descriptor;

        static {
            C0532a c0532a = new C0532a();
            INSTANCE = c0532a;
            b12 b12Var = new b12("nuke.data.model.DeviceInfo", c0532a, 5);
            b12Var.m359l("abi", false);
            b12Var.m359l("sdk", false);
            b12Var.m359l(BuildConfig.BUILD_TYPE, false);
            b12Var.m359l("brand", false);
            b12Var.m359l("model", false);
            descriptor = b12Var;
        }

        private C0532a() {
        }

        @Override // p000.qo0
        /* JADX INFO: renamed from: b */
        public final w41[] mo166b() {
            nv2 nv2Var = nv2.f7346a;
            f11 f11Var = f11.f2733a;
            return new w41[]{nv2Var, f11Var, f11Var, nv2Var, nv2Var};
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
        public final o70 mo165a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
            int i = 0;
            int iMo4566u = 0;
            int iMo4566u2 = 0;
            String strMo4563n = null;
            String strMo4563n2 = null;
            String strMo4563n3 = null;
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
                    iMo4566u2 = interfaceC0826vxMo895b.mo4566u(yo2Var, 2);
                    i |= 4;
                } else if (iMo901j == 3) {
                    strMo4563n2 = interfaceC0826vxMo895b.mo4563n(yo2Var, 3);
                    i |= 8;
                } else {
                    if (iMo901j != 4) {
                        throw new e83(iMo901j);
                    }
                    strMo4563n3 = interfaceC0826vxMo895b.mo4563n(yo2Var, 4);
                    i |= 16;
                }
            }
            interfaceC0826vxMo895b.mo894a(yo2Var);
            return new o70(i, strMo4563n, iMo4566u, iMo4566u2, strMo4563n2, strMo4563n3, null);
        }

        @Override // p000.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo167d(ve0 ve0Var, o70 o70Var) {
            ve0Var.getClass();
            o70Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
            o70.m3524m(o70Var, interfaceC0863wxMo1177b, yo2Var);
            interfaceC0863wxMo1177b.mo1176a(yo2Var);
        }
    }

    public /* synthetic */ o70(int i, String str, int i2, int i3, String str2, String str3, dp2 dp2Var) {
        if (31 != (i & 31)) {
            AbstractC0179eu.m1449b0(i, 31, C0532a.INSTANCE.mo168e());
            throw null;
        }
        this.abi = str;
        this.sdk = i2;
        this.release = i3;
        this.brand = str2;
        this.model = str3;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ o70 m3523g(o70 o70Var, String str, int i, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = o70Var.abi;
        }
        if ((i3 & 2) != 0) {
            i = o70Var.sdk;
        }
        if ((i3 & 4) != 0) {
            i2 = o70Var.release;
        }
        if ((i3 & 8) != 0) {
            str2 = o70Var.brand;
        }
        if ((i3 & 16) != 0) {
            str3 = o70Var.model;
        }
        String str4 = str3;
        int i4 = i2;
        return o70Var.m3530f(str, i, i4, str2, str4);
    }

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ void m3524m(o70 o70Var, InterfaceC0863wx interfaceC0863wx, yo2 yo2Var) {
        dv2 dv2Var = (dv2) interfaceC0863wx;
        dv2Var.m1199x(yo2Var, 0, o70Var.abi);
        dv2Var.m1196u(1, o70Var.sdk, yo2Var);
        dv2Var.m1196u(2, o70Var.release, yo2Var);
        dv2Var.m1199x(yo2Var, 3, o70Var.brand);
        dv2Var.m1199x(yo2Var, 4, o70Var.model);
    }

    /* JADX INFO: renamed from: a */
    public final String m3525a() {
        return this.abi;
    }

    /* JADX INFO: renamed from: b */
    public final int m3526b() {
        return this.sdk;
    }

    /* JADX INFO: renamed from: c */
    public final int m3527c() {
        return this.release;
    }

    /* JADX INFO: renamed from: d */
    public final String m3528d() {
        return this.brand;
    }

    /* JADX INFO: renamed from: e */
    public final String m3529e() {
        return this.model;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o70)) {
            return false;
        }
        o70 o70Var = (o70) obj;
        return t11.m5086l(this.abi, o70Var.abi) && this.sdk == o70Var.sdk && this.release == o70Var.release && t11.m5086l(this.brand, o70Var.brand) && t11.m5086l(this.model, o70Var.model);
    }

    /* JADX INFO: renamed from: f */
    public final o70 m3530f(String str, int i, int i2, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new o70(str, i, i2, str2, str3);
    }

    /* JADX INFO: renamed from: h */
    public final String m3531h() {
        return this.abi;
    }

    public int hashCode() {
        return this.model.hashCode() + hk1.m2207f(this.brand, vi0.m5685d(this.release, vi0.m5685d(this.sdk, this.abi.hashCode() * 31, 31), 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m3532i() {
        return this.brand;
    }

    /* JADX INFO: renamed from: j */
    public final String m3533j() {
        return this.model;
    }

    /* JADX INFO: renamed from: k */
    public final int m3534k() {
        return this.release;
    }

    /* JADX INFO: renamed from: l */
    public final int m3535l() {
        return this.sdk;
    }

    public String toString() {
        String str = this.abi;
        int i = this.sdk;
        int i2 = this.release;
        String str2 = this.brand;
        String str3 = this.model;
        StringBuilder sb = new StringBuilder("DeviceInfo(abi=");
        sb.append(str);
        sb.append(", sdk=");
        sb.append(i);
        sb.append(", release=");
        sb.append(i2);
        sb.append(", brand=");
        sb.append(str2);
        sb.append(", model=");
        return hk1.m2211j(sb, str3, ")");
    }

    /* JADX INFO: renamed from: o70$b */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class C0533b {
        public /* synthetic */ C0533b(c50 c50Var) {
            this();
        }

        public final w41 serializer() {
            return C0532a.INSTANCE;
        }

        private C0533b() {
        }
    }

    public o70(String str, int i, int i2, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.abi = str;
        this.sdk = i;
        this.release = i2;
        this.brand = str2;
        this.model = str3;
    }
}
