package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q83 {
    public static final int $stable = 0;
    public static final C0610b Companion = new C0610b(null);
    private final String downloadUrl;
    private final boolean isFocusUpdate;
    private final String lastVersion;
    private final String limitVersion;
    private final String message;
    private final long updateTime;

    /* JADX INFO: renamed from: q83$a */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    @j70
    public static final /* synthetic */ class C0609a implements qo0 {
        public static final int $stable = 0;
        public static final C0609a INSTANCE;
        private static final yo2 descriptor;

        static {
            C0609a c0609a = new C0609a();
            INSTANCE = c0609a;
            b12 b12Var = new b12("nuke.data.model.Update", c0609a, 6);
            b12Var.m359l("lastVersion", false);
            b12Var.m359l("limitVersion", false);
            b12Var.m359l("updateTime", false);
            b12Var.m359l("message", false);
            b12Var.m359l("downloadUrl", false);
            b12Var.m359l("isFocusUpdate", false);
            descriptor = b12Var;
        }

        private C0609a() {
        }

        @Override // p000.qo0
        /* JADX INFO: renamed from: b */
        public final w41[] mo166b() {
            nv2 nv2Var = nv2.f7346a;
            return new w41[]{nv2Var, nv2Var, ed1.f2399a, nv2Var, nv2Var, C0428ll.f6184a};
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
        public final q83 mo165a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
            int i = 0;
            boolean zMo4565q = false;
            String strMo4563n = null;
            String strMo4563n2 = null;
            String strMo4563n3 = null;
            String strMo4563n4 = null;
            long jMo4568z = 0;
            boolean z = true;
            while (z) {
                int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
                switch (iMo901j) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strMo4563n = interfaceC0826vxMo895b.mo4563n(yo2Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        strMo4563n2 = interfaceC0826vxMo895b.mo4563n(yo2Var, 1);
                        i |= 2;
                        break;
                    case 2:
                        jMo4568z = interfaceC0826vxMo895b.mo4568z(yo2Var, 2);
                        i |= 4;
                        break;
                    case 3:
                        strMo4563n3 = interfaceC0826vxMo895b.mo4563n(yo2Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        strMo4563n4 = interfaceC0826vxMo895b.mo4563n(yo2Var, 4);
                        i |= 16;
                        break;
                    case 5:
                        zMo4565q = interfaceC0826vxMo895b.mo4565q(yo2Var, 5);
                        i |= 32;
                        break;
                    default:
                        throw new e83(iMo901j);
                }
            }
            interfaceC0826vxMo895b.mo894a(yo2Var);
            return new q83(i, strMo4563n, strMo4563n2, jMo4568z, strMo4563n3, strMo4563n4, zMo4565q, null);
        }

        @Override // p000.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo167d(ve0 ve0Var, q83 q83Var) {
            ve0Var.getClass();
            q83Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
            q83.m4069o(q83Var, interfaceC0863wxMo1177b, yo2Var);
            interfaceC0863wxMo1177b.mo1176a(yo2Var);
        }
    }

    public /* synthetic */ q83(int i, String str, String str2, long j, String str3, String str4, boolean z, dp2 dp2Var) {
        if (63 != (i & 63)) {
            AbstractC0179eu.m1449b0(i, 63, C0609a.INSTANCE.mo168e());
            throw null;
        }
        this.lastVersion = str;
        this.limitVersion = str2;
        this.updateTime = j;
        this.message = str3;
        this.downloadUrl = str4;
        this.isFocusUpdate = z;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ q83 m4068h(q83 q83Var, String str, String str2, long j, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = q83Var.lastVersion;
        }
        if ((i & 2) != 0) {
            str2 = q83Var.limitVersion;
        }
        if ((i & 4) != 0) {
            j = q83Var.updateTime;
        }
        if ((i & 8) != 0) {
            str3 = q83Var.message;
        }
        if ((i & 16) != 0) {
            str4 = q83Var.downloadUrl;
        }
        if ((i & 32) != 0) {
            z = q83Var.isFocusUpdate;
        }
        boolean z2 = z;
        String str5 = str3;
        long j2 = j;
        return q83Var.m4076g(str, str2, j2, str5, str4, z2);
    }

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ void m4069o(q83 q83Var, InterfaceC0863wx interfaceC0863wx, yo2 yo2Var) {
        dv2 dv2Var = (dv2) interfaceC0863wx;
        dv2Var.m1199x(yo2Var, 0, q83Var.lastVersion);
        dv2Var.m1199x(yo2Var, 1, q83Var.limitVersion);
        dv2Var.m1197v(yo2Var, 2, q83Var.updateTime);
        dv2Var.m1199x(yo2Var, 3, q83Var.message);
        dv2Var.m1199x(yo2Var, 4, q83Var.downloadUrl);
        dv2Var.m1193r(yo2Var, 5, q83Var.isFocusUpdate);
    }

    /* JADX INFO: renamed from: a */
    public final String m4070a() {
        return this.lastVersion;
    }

    /* JADX INFO: renamed from: b */
    public final String m4071b() {
        return this.limitVersion;
    }

    /* JADX INFO: renamed from: c */
    public final long m4072c() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: d */
    public final String m4073d() {
        return this.message;
    }

    /* JADX INFO: renamed from: e */
    public final String m4074e() {
        return this.downloadUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q83)) {
            return false;
        }
        q83 q83Var = (q83) obj;
        return t11.m5086l(this.lastVersion, q83Var.lastVersion) && t11.m5086l(this.limitVersion, q83Var.limitVersion) && this.updateTime == q83Var.updateTime && t11.m5086l(this.message, q83Var.message) && t11.m5086l(this.downloadUrl, q83Var.downloadUrl) && this.isFocusUpdate == q83Var.isFocusUpdate;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4075f() {
        return this.isFocusUpdate;
    }

    /* JADX INFO: renamed from: g */
    public final q83 m4076g(String str, String str2, long j, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new q83(str, str2, j, str3, str4, z);
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFocusUpdate) + hk1.m2207f(this.downloadUrl, hk1.m2207f(this.message, hk1.m2204c(hk1.m2207f(this.limitVersion, this.lastVersion.hashCode() * 31, 31), 31, this.updateTime), 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m4077i() {
        return this.downloadUrl;
    }

    /* JADX INFO: renamed from: j */
    public final String m4078j() {
        return this.lastVersion;
    }

    /* JADX INFO: renamed from: k */
    public final String m4079k() {
        return this.limitVersion;
    }

    /* JADX INFO: renamed from: l */
    public final String m4080l() {
        return this.message;
    }

    /* JADX INFO: renamed from: m */
    public final long m4081m() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4082n() {
        return this.isFocusUpdate;
    }

    public String toString() {
        String str = this.lastVersion;
        String str2 = this.limitVersion;
        long j = this.updateTime;
        String str3 = this.message;
        String str4 = this.downloadUrl;
        boolean z = this.isFocusUpdate;
        StringBuilder sbM5696o = vi0.m5696o("Update(lastVersion=", str, ", limitVersion=", str2, ", updateTime=");
        sbM5696o.append(j);
        sbM5696o.append(", message=");
        sbM5696o.append(str3);
        sbM5696o.append(", downloadUrl=");
        sbM5696o.append(str4);
        sbM5696o.append(", isFocusUpdate=");
        sbM5696o.append(z);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }

    /* JADX INFO: renamed from: q83$b */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class C0610b {
        public /* synthetic */ C0610b(c50 c50Var) {
            this();
        }

        public final w41 serializer() {
            return C0609a.INSTANCE;
        }

        private C0610b() {
        }
    }

    public q83(String str, String str2, long j, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.lastVersion = str;
        this.limitVersion = str2;
        this.updateTime = j;
        this.message = str3;
        this.downloadUrl = str4;
        this.isFocusUpdate = z;
    }
}
