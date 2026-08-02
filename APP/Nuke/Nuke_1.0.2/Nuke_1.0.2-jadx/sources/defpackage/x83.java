package defpackage;

import defpackage.nu0;
import defpackage.o70;
import defpackage.t22;
import nuke.module.wechat.ai.AIChatConfig;

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
    public static final b Companion = new b(null);
    public static final int $stable = (nu0.$stable | o70.$stable) | t22.$stable;

    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    @j70
    public static final /* synthetic */ class a implements qo0 {
        public static final int $stable = 0;
        public static final a INSTANCE;
        private static final yo2 descriptor;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            a aVar = new a();
            INSTANCE = aVar;
            b12 b12Var = new b12("nuke.data.model.User", aVar, 9);
            b12Var.l("premium", false);
            b12Var.l("deviceInfo", false);
            b12Var.l("hostInfo", false);
            b12Var.l("loginUin", false);
            b12Var.l("nickname", false);
            b12Var.l("lastLoginTime", false);
            b12Var.l("config", true);
            b12Var.l("cookies", true);
            b12Var.l("avatarFilePath", true);
            descriptor = b12Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // defpackage.qo0
        public final w41[] b() {
            nv2 nv2Var = nv2.a;
            return new w41[]{t22.a.INSTANCE, o70.a.INSTANCE, nu0.a.INSTANCE, nv2Var, nv2Var, ed1.a, nv2Var, nv2Var, nv2Var};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // defpackage.qo0
        public /* bridge */ w41[] c() {
            return p40.l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // defpackage.w41
        public final yo2 e() {
            return descriptor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: a(Ly40;)Ljava/lang/Object; */
        @Override // defpackage.w41
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final x83 a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            vx vxVarB = y40Var.b(yo2Var);
            int i = 0;
            t22 t22Var = null;
            o70 o70Var = null;
            nu0 nu0Var = null;
            String strN = null;
            String strN2 = null;
            String strN3 = null;
            String strN4 = null;
            String strN5 = null;
            long jZ = 0;
            boolean z = true;
            while (z) {
                int iJ = vxVarB.j(yo2Var);
                switch (iJ) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        t22Var = (t22) vxVarB.t(yo2Var, 0, t22.a.INSTANCE, t22Var);
                        i |= 1;
                        break;
                    case 1:
                        o70Var = (o70) vxVarB.t(yo2Var, 1, o70.a.INSTANCE, o70Var);
                        i |= 2;
                        break;
                    case 2:
                        nu0Var = (nu0) vxVarB.t(yo2Var, 2, nu0.a.INSTANCE, nu0Var);
                        i |= 4;
                        break;
                    case 3:
                        strN = vxVarB.n(yo2Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        strN2 = vxVarB.n(yo2Var, 4);
                        i |= 16;
                        break;
                    case 5:
                        jZ = vxVarB.z(yo2Var, 5);
                        i |= 32;
                        break;
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        strN3 = vxVarB.n(yo2Var, 6);
                        i |= 64;
                        break;
                    case 7:
                        strN4 = vxVarB.n(yo2Var, 7);
                        i |= 128;
                        break;
                    case 8:
                        strN5 = vxVarB.n(yo2Var, 8);
                        i |= 256;
                        break;
                    default:
                        throw new e83(iJ);
                }
            }
            vxVarB.a(yo2Var);
            return new x83(i, t22Var, o70Var, nu0Var, strN, strN2, jZ, strN3, strN4, strN5, (dp2) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: d(Lve0;Ljava/lang/Object;)V */
        @Override // defpackage.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void d(ve0 ve0Var, x83 x83Var) {
            ve0Var.getClass();
            x83Var.getClass();
            yo2 yo2Var = descriptor;
            wx wxVarB = ve0Var.b(yo2Var);
            x83.u(x83Var, wxVarB, yo2Var);
            wxVarB.a(yo2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ x83(int i, t22 t22Var, o70 o70Var, nu0 nu0Var, String str, String str2, long j, String str3, String str4, String str5, dp2 dp2Var) {
        if (63 != (i & 63)) {
            eu.b0(i, 63, a.INSTANCE.e());
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ x83 k(x83 x83Var, t22 t22Var, o70 o70Var, nu0 nu0Var, String str, String str2, long j, String str3, String str4, String str5, int i, Object obj) {
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
        return x83Var.j(t22Var, o70Var, nu0Var2, str8, str9, j2, str7, str4, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final /* synthetic */ void u(x83 x83Var, wx wxVar, yo2 yo2Var) {
        dv2 dv2Var = (dv2) wxVar;
        dv2Var.w(yo2Var, 0, t22.a.INSTANCE, x83Var.premium);
        dv2Var.w(yo2Var, 1, o70.a.INSTANCE, x83Var.deviceInfo);
        dv2Var.w(yo2Var, 2, nu0.a.INSTANCE, x83Var.hostInfo);
        dv2Var.x(yo2Var, 3, x83Var.loginUin);
        dv2Var.x(yo2Var, 4, x83Var.nickname);
        dv2Var.v(yo2Var, 5, x83Var.lastLoginTime);
        if (dv2Var.d(yo2Var) || !t11.l(x83Var.config, "")) {
            dv2Var.x(yo2Var, 6, x83Var.config);
        }
        if (dv2Var.d(yo2Var) || !t11.l(x83Var.cookies, "")) {
            dv2Var.x(yo2Var, 7, x83Var.cookies);
        }
        if (!dv2Var.d(yo2Var) && t11.l(x83Var.avatarFilePath, "")) {
            return;
        }
        dv2Var.x(yo2Var, 8, x83Var.avatarFilePath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final t22 a() {
        return this.premium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o70 b() {
        return this.deviceInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final nu0 c() {
        return this.hostInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d() {
        return this.loginUin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String e() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x83)) {
            return false;
        }
        x83 x83Var = (x83) obj;
        return t11.l(this.premium, x83Var.premium) && t11.l(this.deviceInfo, x83Var.deviceInfo) && t11.l(this.hostInfo, x83Var.hostInfo) && t11.l(this.loginUin, x83Var.loginUin) && t11.l(this.nickname, x83Var.nickname) && this.lastLoginTime == x83Var.lastLoginTime && t11.l(this.config, x83Var.config) && t11.l(this.cookies, x83Var.cookies) && t11.l(this.avatarFilePath, x83Var.avatarFilePath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long f() {
        return this.lastLoginTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String g() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String h() {
        return this.cookies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.avatarFilePath.hashCode() + hk1.f(this.cookies, hk1.f(this.config, hk1.c(hk1.f(this.nickname, hk1.f(this.loginUin, (this.hostInfo.hashCode() + ((this.deviceInfo.hashCode() + (this.premium.hashCode() * 31)) * 31)) * 31, 31), 31), 31, this.lastLoginTime), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String i() {
        return this.avatarFilePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x83 j(t22 t22Var, o70 o70Var, nu0 nu0Var, String str, String str2, long j, String str3, String str4, String str5) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String l() {
        return this.avatarFilePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String m() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String n() {
        return this.cookies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o70 o() {
        return this.deviceInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final nu0 p() {
        return this.hostInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long q() {
        return this.lastLoginTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String r() {
        return this.loginUin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String s() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final t22 t() {
        return this.premium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        hk1.o(sb, ", config=", str3, ", cookies=", str4);
        sb.append(", avatarFilePath=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class b {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: x83.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(c50 c50Var) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final w41 serializer() {
            return a.INSTANCE;
        }

        private b() {
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r2v0 t22)
  (r3v0 o70)
  (r4v0 nu0)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (r7v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r12v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(t22, o70, nu0, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:73) call: x83.<init>(t22, o70, nu0, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ x83(t22 t22Var, o70 o70Var, nu0 nu0Var, String str, String str2, long j, String str3, String str4, String str5, int i, c50 c50Var) {
        this(t22Var, o70Var, nu0Var, str, str2, j, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5);
    }
}
