package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nu0 {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final int hostType;
    private final String patchId;
    private final String version;
    private final int versionCode;

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
            b12 b12Var = new b12("nuke.data.model.HostInfo", aVar, 4);
            b12Var.l("version", false);
            b12Var.l("versionCode", false);
            b12Var.l("patchId", false);
            b12Var.l("hostType", false);
            descriptor = b12Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // defpackage.qo0
        public final w41[] b() {
            nv2 nv2Var = nv2.a;
            f11 f11Var = f11.a;
            return new w41[]{nv2Var, f11Var, nv2Var, f11Var};
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
        public final nu0 a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            vx vxVarB = y40Var.b(yo2Var);
            int i = 0;
            int iU = 0;
            int iU2 = 0;
            String strN = null;
            String strN2 = null;
            boolean z = true;
            while (z) {
                int iJ = vxVarB.j(yo2Var);
                if (iJ == -1) {
                    z = false;
                } else if (iJ == 0) {
                    strN = vxVarB.n(yo2Var, 0);
                    i |= 1;
                } else if (iJ == 1) {
                    iU = vxVarB.u(yo2Var, 1);
                    i |= 2;
                } else if (iJ == 2) {
                    strN2 = vxVarB.n(yo2Var, 2);
                    i |= 4;
                } else {
                    if (iJ != 3) {
                        throw new e83(iJ);
                    }
                    iU2 = vxVarB.u(yo2Var, 3);
                    i |= 8;
                }
            }
            vxVarB.a(yo2Var);
            return new nu0(i, strN, iU, strN2, iU2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: d(Lve0;Ljava/lang/Object;)V */
        @Override // defpackage.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void d(ve0 ve0Var, nu0 nu0Var) {
            ve0Var.getClass();
            nu0Var.getClass();
            yo2 yo2Var = descriptor;
            wx wxVarB = ve0Var.b(yo2Var);
            nu0.k(nu0Var, wxVarB, yo2Var);
            wxVarB.a(yo2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ nu0(int i, String str, int i2, String str2, int i3, dp2 dp2Var) {
        if (15 != (i & 15)) {
            eu.b0(i, 15, a.INSTANCE.e());
            throw null;
        }
        this.version = str;
        this.versionCode = i2;
        this.patchId = str2;
        this.hostType = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ nu0 f(nu0 nu0Var, String str, int i, String str2, int i2, int i3, Object obj) {
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
        return nu0Var.e(str, i, str2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final /* synthetic */ void k(nu0 nu0Var, wx wxVar, yo2 yo2Var) {
        dv2 dv2Var = (dv2) wxVar;
        dv2Var.x(yo2Var, 0, nu0Var.version);
        dv2Var.u(1, nu0Var.versionCode, yo2Var);
        dv2Var.x(yo2Var, 2, nu0Var.patchId);
        dv2Var.u(3, nu0Var.hostType, yo2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        return this.versionCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String c() {
        return this.patchId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d() {
        return this.hostType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final nu0 e(String str, int i, String str2, int i2) {
        str.getClass();
        str2.getClass();
        return new nu0(str, i, str2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu0)) {
            return false;
        }
        nu0 nu0Var = (nu0) obj;
        return t11.l(this.version, nu0Var.version) && this.versionCode == nu0Var.versionCode && t11.l(this.patchId, nu0Var.patchId) && this.hostType == nu0Var.hostType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g() {
        return this.hostType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String h() {
        return this.patchId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Integer.hashCode(this.hostType) + hk1.f(this.patchId, vi0.d(this.versionCode, this.version.hashCode() * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String i() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int j() {
        return this.versionCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "HostInfo(version=" + this.version + ", versionCode=" + this.versionCode + ", patchId=" + this.patchId + ", hostType=" + this.hostType + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class b {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: nu0.b.<init>():void type: THIS */
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

    public nu0(String str, int i, String str2, int i2) {
        str.getClass();
        str2.getClass();
        this.version = str;
        this.versionCode = i;
        this.patchId = str2;
        this.hostType = i2;
    }
}
