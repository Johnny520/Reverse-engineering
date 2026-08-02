package p000;

import nuke.module.wechat.p002ai.AIChatConfig;
import p000.nu0;
import p000.o70;
import p000.t22;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x83 {
    private final String avatarFilePath;
    private final String config;
    private final String cookies;
    private final o70 deviceInfo;
    private final nu0 hostInfo;
    private final long lastLoginTime;
    private final String loginUin;
    private final String nickname;
    private final t22 premium;
    public static final C0877b Companion = new C0877b(null);
    public static final int $stable = (nu0.$stable | o70.$stable) | t22.$stable;

    /* JADX INFO: renamed from: x83$a */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    @j70
    public static final /* synthetic */ class C0876a implements qo0 {
        public static final int $stable = 0;
        public static final C0876a INSTANCE;
        private static final yo2 descriptor;

        static {
            C0876a c0876a = new C0876a();
            INSTANCE = c0876a;
            b12 b12Var = new b12("nuke.data.model.User", c0876a, 9);
            b12Var.m359l("premium", false);
            b12Var.m359l("deviceInfo", false);
            b12Var.m359l("hostInfo", false);
            b12Var.m359l("loginUin", false);
            b12Var.m359l("nickname", false);
            b12Var.m359l("lastLoginTime", false);
            b12Var.m359l("config", true);
            b12Var.m359l("cookies", true);
            b12Var.m359l("avatarFilePath", true);
            descriptor = b12Var;
        }

        private C0876a() {
        }

        @Override // p000.qo0
        /* JADX INFO: renamed from: b */
        public final w41[] mo166b() {
            nv2 nv2Var = nv2.f7346a;
            return new w41[]{t22.C0718a.INSTANCE, o70.C0532a.INSTANCE, nu0.C0514a.INSTANCE, nv2Var, nv2Var, ed1.f2399a, nv2Var, nv2Var, nv2Var};
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
        public final x83 mo165a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
            int i = 0;
            t22 t22Var = null;
            o70 o70Var = null;
            nu0 nu0Var = null;
            String strMo4563n = null;
            String strMo4563n2 = null;
            String strMo4563n3 = null;
            String strMo4563n4 = null;
            String strMo4563n5 = null;
            long jMo4568z = 0;
            boolean z = true;
            while (z) {
                int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
                switch (iMo901j) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        t22Var = (t22) interfaceC0826vxMo895b.mo907t(yo2Var, 0, t22.C0718a.INSTANCE, t22Var);
                        i |= 1;
                        break;
                    case 1:
                        o70Var = (o70) interfaceC0826vxMo895b.mo907t(yo2Var, 1, o70.C0532a.INSTANCE, o70Var);
                        i |= 2;
                        break;
                    case 2:
                        nu0Var = (nu0) interfaceC0826vxMo895b.mo907t(yo2Var, 2, nu0.C0514a.INSTANCE, nu0Var);
                        i |= 4;
                        break;
                    case 3:
                        strMo4563n = interfaceC0826vxMo895b.mo4563n(yo2Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        strMo4563n2 = interfaceC0826vxMo895b.mo4563n(yo2Var, 4);
                        i |= 16;
                        break;
                    case 5:
                        jMo4568z = interfaceC0826vxMo895b.mo4568z(yo2Var, 5);
                        i |= 32;
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        strMo4563n3 = interfaceC0826vxMo895b.mo4563n(yo2Var, 6);
                        i |= 64;
                        break;
                    case 7:
                        strMo4563n4 = interfaceC0826vxMo895b.mo4563n(yo2Var, 7);
                        i |= 128;
                        break;
                    case 8:
                        strMo4563n5 = interfaceC0826vxMo895b.mo4563n(yo2Var, 8);
                        i |= 256;
                        break;
                    default:
                        throw new e83(iMo901j);
                }
            }
            interfaceC0826vxMo895b.mo894a(yo2Var);
            return new x83(i, t22Var, o70Var, nu0Var, strMo4563n, strMo4563n2, jMo4568z, strMo4563n3, strMo4563n4, strMo4563n5, (dp2) null);
        }

        @Override // p000.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo167d(ve0 ve0Var, x83 x83Var) {
            ve0Var.getClass();
            x83Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
            x83.m6053u(x83Var, interfaceC0863wxMo1177b, yo2Var);
            interfaceC0863wxMo1177b.mo1176a(yo2Var);
        }
    }

    public /* synthetic */ x83(int i, t22 t22Var, o70 o70Var, nu0 nu0Var, String str, String str2, long j, String str3, String str4, String str5, dp2 dp2Var) {
        if (63 != (i & 63)) {
            AbstractC0179eu.m1449b0(i, 63, C0876a.INSTANCE.mo168e());
            throw null;
        }
        this.premium = t22Var;
        this.deviceInfo = o70Var;
        this.hostInfo = nu0Var;
        this.loginUin = str;
        this.nickname = str2;
        this.lastLoginTime = j;
        if ((i & 64) == 0) {
            this.config = "";
        } else {
            this.config = str3;
        }
        if ((i & 128) == 0) {
            this.cookies = "";
        } else {
            this.cookies = str4;
        }
        if ((i & 256) == 0) {
            this.avatarFilePath = "";
        } else {
            this.avatarFilePath = str5;
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ x83 m6052k(x83 x83Var, t22 t22Var, o70 o70Var, nu0 nu0Var, String str, String str2, long j, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            t22Var = x83Var.premium;
        }
        if ((i & 2) != 0) {
            o70Var = x83Var.deviceInfo;
        }
        if ((i & 4) != 0) {
            nu0Var = x83Var.hostInfo;
        }
        if ((i & 8) != 0) {
            str = x83Var.loginUin;
        }
        if ((i & 16) != 0) {
            str2 = x83Var.nickname;
        }
        if ((i & 32) != 0) {
            j = x83Var.lastLoginTime;
        }
        if ((i & 64) != 0) {
            str3 = x83Var.config;
        }
        if ((i & 128) != 0) {
            str4 = x83Var.cookies;
        }
        if ((i & 256) != 0) {
            str5 = x83Var.avatarFilePath;
        }
        String str6 = str5;
        String str7 = str3;
        long j2 = j;
        String str8 = str;
        String str9 = str2;
        nu0 nu0Var2 = nu0Var;
        return x83Var.m6063j(t22Var, o70Var, nu0Var2, str8, str9, j2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ void m6053u(x83 x83Var, InterfaceC0863wx interfaceC0863wx, yo2 yo2Var) {
        dv2 dv2Var = (dv2) interfaceC0863wx;
        dv2Var.m1198w(yo2Var, 0, t22.C0718a.INSTANCE, x83Var.premium);
        dv2Var.m1198w(yo2Var, 1, o70.C0532a.INSTANCE, x83Var.deviceInfo);
        dv2Var.m1198w(yo2Var, 2, nu0.C0514a.INSTANCE, x83Var.hostInfo);
        dv2Var.m1199x(yo2Var, 3, x83Var.loginUin);
        dv2Var.m1199x(yo2Var, 4, x83Var.nickname);
        dv2Var.m1197v(yo2Var, 5, x83Var.lastLoginTime);
        if (dv2Var.mo1179d(yo2Var) || !t11.m5086l(x83Var.config, "")) {
            dv2Var.m1199x(yo2Var, 6, x83Var.config);
        }
        if (dv2Var.mo1179d(yo2Var) || !t11.m5086l(x83Var.cookies, "")) {
            dv2Var.m1199x(yo2Var, 7, x83Var.cookies);
        }
        if (!dv2Var.mo1179d(yo2Var) && t11.m5086l(x83Var.avatarFilePath, "")) {
            return;
        }
        dv2Var.m1199x(yo2Var, 8, x83Var.avatarFilePath);
    }

    /* JADX INFO: renamed from: a */
    public final t22 m6054a() {
        return this.premium;
    }

    /* JADX INFO: renamed from: b */
    public final o70 m6055b() {
        return this.deviceInfo;
    }

    /* JADX INFO: renamed from: c */
    public final nu0 m6056c() {
        return this.hostInfo;
    }

    /* JADX INFO: renamed from: d */
    public final String m6057d() {
        return this.loginUin;
    }

    /* JADX INFO: renamed from: e */
    public final String m6058e() {
        return this.nickname;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x83)) {
            return false;
        }
        x83 x83Var = (x83) obj;
        return t11.m5086l(this.premium, x83Var.premium) && t11.m5086l(this.deviceInfo, x83Var.deviceInfo) && t11.m5086l(this.hostInfo, x83Var.hostInfo) && t11.m5086l(this.loginUin, x83Var.loginUin) && t11.m5086l(this.nickname, x83Var.nickname) && this.lastLoginTime == x83Var.lastLoginTime && t11.m5086l(this.config, x83Var.config) && t11.m5086l(this.cookies, x83Var.cookies) && t11.m5086l(this.avatarFilePath, x83Var.avatarFilePath);
    }

    /* JADX INFO: renamed from: f */
    public final long m6059f() {
        return this.lastLoginTime;
    }

    /* JADX INFO: renamed from: g */
    public final String m6060g() {
        return this.config;
    }

    /* JADX INFO: renamed from: h */
    public final String m6061h() {
        return this.cookies;
    }

    public int hashCode() {
        return this.avatarFilePath.hashCode() + hk1.m2207f(this.cookies, hk1.m2207f(this.config, hk1.m2204c(hk1.m2207f(this.nickname, hk1.m2207f(this.loginUin, (this.hostInfo.hashCode() + ((this.deviceInfo.hashCode() + (this.premium.hashCode() * 31)) * 31)) * 31, 31), 31), 31, this.lastLoginTime), 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m6062i() {
        return this.avatarFilePath;
    }

    /* JADX INFO: renamed from: j */
    public final x83 m6063j(t22 t22Var, o70 o70Var, nu0 nu0Var, String str, String str2, long j, String str3, String str4, String str5) {
        t22Var.getClass();
        o70Var.getClass();
        nu0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new x83(t22Var, o70Var, nu0Var, str, str2, j, str3, str4, str5);
    }

    /* JADX INFO: renamed from: l */
    public final String m6064l() {
        return this.avatarFilePath;
    }

    /* JADX INFO: renamed from: m */
    public final String m6065m() {
        return this.config;
    }

    /* JADX INFO: renamed from: n */
    public final String m6066n() {
        return this.cookies;
    }

    /* JADX INFO: renamed from: o */
    public final o70 m6067o() {
        return this.deviceInfo;
    }

    /* JADX INFO: renamed from: p */
    public final nu0 m6068p() {
        return this.hostInfo;
    }

    /* JADX INFO: renamed from: q */
    public final long m6069q() {
        return this.lastLoginTime;
    }

    /* JADX INFO: renamed from: r */
    public final String m6070r() {
        return this.loginUin;
    }

    /* JADX INFO: renamed from: s */
    public final String m6071s() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: t */
    public final t22 m6072t() {
        return this.premium;
    }

    public String toString() {
        t22 t22Var = this.premium;
        o70 o70Var = this.deviceInfo;
        nu0 nu0Var = this.hostInfo;
        String str = this.loginUin;
        String str2 = this.nickname;
        long j = this.lastLoginTime;
        String str3 = this.config;
        String str4 = this.cookies;
        String str5 = this.avatarFilePath;
        StringBuilder sb = new StringBuilder("User(premium=");
        sb.append(t22Var);
        sb.append(", deviceInfo=");
        sb.append(o70Var);
        sb.append(", hostInfo=");
        sb.append(nu0Var);
        sb.append(", loginUin=");
        sb.append(str);
        sb.append(", nickname=");
        sb.append(str2);
        sb.append(", lastLoginTime=");
        sb.append(j);
        hk1.m2216o(sb, ", config=", str3, ", cookies=", str4);
        sb.append(", avatarFilePath=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: x83$b */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class C0877b {
        public /* synthetic */ C0877b(c50 c50Var) {
            this();
        }

        public final w41 serializer() {
            return C0876a.INSTANCE;
        }

        private C0877b() {
        }
    }

    public x83(t22 t22Var, o70 o70Var, nu0 nu0Var, String str, String str2, long j, String str3, String str4, String str5) {
        t22Var.getClass();
        o70Var.getClass();
        nu0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.premium = t22Var;
        this.deviceInfo = o70Var;
        this.hostInfo = nu0Var;
        this.loginUin = str;
        this.nickname = str2;
        this.lastLoginTime = j;
        this.config = str3;
        this.cookies = str4;
        this.avatarFilePath = str5;
    }

    public /* synthetic */ x83(t22 t22Var, o70 o70Var, nu0 nu0Var, String str, String str2, long j, String str3, String str4, String str5, int i, c50 c50Var) {
        this(t22Var, o70Var, nu0Var, str, str2, j, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5);
    }
}
