package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q83 {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String downloadUrl;
    private final boolean isFocusUpdate;
    private final String lastVersion;
    private final String limitVersion;
    private final String message;
    private final long updateTime;

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
            b12 b12Var = new b12("nuke.data.model.Update", aVar, 6);
            b12Var.l("lastVersion", false);
            b12Var.l("limitVersion", false);
            b12Var.l("updateTime", false);
            b12Var.l("message", false);
            b12Var.l("downloadUrl", false);
            b12Var.l("isFocusUpdate", false);
            descriptor = b12Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // defpackage.qo0
        public final w41[] b() {
            nv2 nv2Var = nv2.a;
            return new w41[]{nv2Var, nv2Var, ed1.a, nv2Var, nv2Var, ll.a};
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
        public final q83 a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            vx vxVarB = y40Var.b(yo2Var);
            int i = 0;
            boolean zQ = false;
            String strN = null;
            String strN2 = null;
            String strN3 = null;
            String strN4 = null;
            long jZ = 0;
            boolean z = true;
            while (z) {
                int iJ = vxVarB.j(yo2Var);
                switch (iJ) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strN = vxVarB.n(yo2Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        strN2 = vxVarB.n(yo2Var, 1);
                        i |= 2;
                        break;
                    case 2:
                        jZ = vxVarB.z(yo2Var, 2);
                        i |= 4;
                        break;
                    case 3:
                        strN3 = vxVarB.n(yo2Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        strN4 = vxVarB.n(yo2Var, 4);
                        i |= 16;
                        break;
                    case 5:
                        zQ = vxVarB.q(yo2Var, 5);
                        i |= 32;
                        break;
                    default:
                        throw new e83(iJ);
                }
            }
            vxVarB.a(yo2Var);
            return new q83(i, strN, strN2, jZ, strN3, strN4, zQ, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: d(Lve0;Ljava/lang/Object;)V */
        @Override // defpackage.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void d(ve0 ve0Var, q83 q83Var) {
            ve0Var.getClass();
            q83Var.getClass();
            yo2 yo2Var = descriptor;
            wx wxVarB = ve0Var.b(yo2Var);
            q83.o(q83Var, wxVarB, yo2Var);
            wxVarB.a(yo2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ q83(int i, String str, String str2, long j, String str3, String str4, boolean z, dp2 dp2Var) {
        if (63 != (i & 63)) {
            eu.b0(i, 63, a.INSTANCE.e());
            throw null;
        }
        this.lastVersion = str;
        this.limitVersion = str2;
        this.updateTime = j;
        this.message = str3;
        this.downloadUrl = str4;
        this.isFocusUpdate = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ q83 h(q83 q83Var, String str, String str2, long j, String str3, String str4, boolean z, int i, Object obj) {
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
        return q83Var.g(str, str2, j2, str5, str4, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final /* synthetic */ void o(q83 q83Var, wx wxVar, yo2 yo2Var) {
        dv2 dv2Var = (dv2) wxVar;
        dv2Var.x(yo2Var, 0, q83Var.lastVersion);
        dv2Var.x(yo2Var, 1, q83Var.limitVersion);
        dv2Var.v(yo2Var, 2, q83Var.updateTime);
        dv2Var.x(yo2Var, 3, q83Var.message);
        dv2Var.x(yo2Var, 4, q83Var.downloadUrl);
        dv2Var.r(yo2Var, 5, q83Var.isFocusUpdate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        return this.lastVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        return this.limitVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long c() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String e() {
        return this.downloadUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q83)) {
            return false;
        }
        q83 q83Var = (q83) obj;
        return t11.l(this.lastVersion, q83Var.lastVersion) && t11.l(this.limitVersion, q83Var.limitVersion) && this.updateTime == q83Var.updateTime && t11.l(this.message, q83Var.message) && t11.l(this.downloadUrl, q83Var.downloadUrl) && this.isFocusUpdate == q83Var.isFocusUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f() {
        return this.isFocusUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q83 g(String str, String str2, long j, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new q83(str, str2, j, str3, str4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Boolean.hashCode(this.isFocusUpdate) + hk1.f(this.downloadUrl, hk1.f(this.message, hk1.c(hk1.f(this.limitVersion, this.lastVersion.hashCode() * 31, 31), 31, this.updateTime), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String i() {
        return this.downloadUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String j() {
        return this.lastVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String k() {
        return this.limitVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String l() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long m() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean n() {
        return this.isFocusUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.lastVersion;
        String str2 = this.limitVersion;
        long j = this.updateTime;
        String str3 = this.message;
        String str4 = this.downloadUrl;
        boolean z = this.isFocusUpdate;
        StringBuilder sbO = vi0.o("Update(lastVersion=", str, ", limitVersion=", str2, ", updateTime=");
        sbO.append(j);
        sbO.append(", message=");
        sbO.append(str3);
        sbO.append(", downloadUrl=");
        sbO.append(str4);
        sbO.append(", isFocusUpdate=");
        sbO.append(z);
        sbO.append(")");
        return sbO.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class b {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: q83.b.<init>():void type: THIS */
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
