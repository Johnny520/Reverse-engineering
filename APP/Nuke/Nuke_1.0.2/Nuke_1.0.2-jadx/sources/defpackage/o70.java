package defpackage;

import me.dartcv.nuke.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o70 {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String abi;
    private final String brand;
    private final String model;
    private final int release;
    private final int sdk;

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
            b12 b12Var = new b12("nuke.data.model.DeviceInfo", aVar, 5);
            b12Var.l("abi", false);
            b12Var.l("sdk", false);
            b12Var.l(BuildConfig.BUILD_TYPE, false);
            b12Var.l("brand", false);
            b12Var.l("model", false);
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
            return new w41[]{nv2Var, f11Var, f11Var, nv2Var, nv2Var};
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
        public final o70 a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            vx vxVarB = y40Var.b(yo2Var);
            int i = 0;
            int iU = 0;
            int iU2 = 0;
            String strN = null;
            String strN2 = null;
            String strN3 = null;
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
                    iU2 = vxVarB.u(yo2Var, 2);
                    i |= 4;
                } else if (iJ == 3) {
                    strN2 = vxVarB.n(yo2Var, 3);
                    i |= 8;
                } else {
                    if (iJ != 4) {
                        throw new e83(iJ);
                    }
                    strN3 = vxVarB.n(yo2Var, 4);
                    i |= 16;
                }
            }
            vxVarB.a(yo2Var);
            return new o70(i, strN, iU, iU2, strN2, strN3, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: d(Lve0;Ljava/lang/Object;)V */
        @Override // defpackage.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void d(ve0 ve0Var, o70 o70Var) {
            ve0Var.getClass();
            o70Var.getClass();
            yo2 yo2Var = descriptor;
            wx wxVarB = ve0Var.b(yo2Var);
            o70.m(o70Var, wxVarB, yo2Var);
            wxVarB.a(yo2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ o70(int i, String str, int i2, int i3, String str2, String str3, dp2 dp2Var) {
        if (31 != (i & 31)) {
            eu.b0(i, 31, a.INSTANCE.e());
            throw null;
        }
        this.abi = str;
        this.sdk = i2;
        this.release = i3;
        this.brand = str2;
        this.model = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ o70 g(o70 o70Var, String str, int i, int i2, String str2, String str3, int i3, Object obj) {
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
        return o70Var.f(str, i, i4, str2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final /* synthetic */ void m(o70 o70Var, wx wxVar, yo2 yo2Var) {
        dv2 dv2Var = (dv2) wxVar;
        dv2Var.x(yo2Var, 0, o70Var.abi);
        dv2Var.u(1, o70Var.sdk, yo2Var);
        dv2Var.u(2, o70Var.release, yo2Var);
        dv2Var.x(yo2Var, 3, o70Var.brand);
        dv2Var.x(yo2Var, 4, o70Var.model);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        return this.abi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        return this.sdk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c() {
        return this.release;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d() {
        return this.brand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String e() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o70)) {
            return false;
        }
        o70 o70Var = (o70) obj;
        return t11.l(this.abi, o70Var.abi) && this.sdk == o70Var.sdk && this.release == o70Var.release && t11.l(this.brand, o70Var.brand) && t11.l(this.model, o70Var.model);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o70 f(String str, int i, int i2, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new o70(str, i, i2, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String h() {
        return this.abi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.model.hashCode() + hk1.f(this.brand, vi0.d(this.release, vi0.d(this.sdk, this.abi.hashCode() * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String i() {
        return this.brand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String j() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int k() {
        return this.release;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int l() {
        return this.sdk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        return hk1.j(sb, str3, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class b {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: o70.b.<init>():void type: THIS */
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
