package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class no1 {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final String author;
    private final int id;
    private final boolean isAlwaysShow;
    private final String message;

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
            b12 b12Var = new b12("nuke.data.model.Notice", aVar, 4);
            b12Var.l("message", false);
            b12Var.l("author", false);
            b12Var.l("id", false);
            b12Var.l("isAlwaysShow", false);
            descriptor = b12Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // defpackage.qo0
        public final w41[] b() {
            nv2 nv2Var = nv2.a;
            return new w41[]{nv2Var, nv2Var, f11.a, ll.a};
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
        public final no1 a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            vx vxVarB = y40Var.b(yo2Var);
            int i = 0;
            int iU = 0;
            boolean zQ = false;
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
                    strN2 = vxVarB.n(yo2Var, 1);
                    i |= 2;
                } else if (iJ == 2) {
                    iU = vxVarB.u(yo2Var, 2);
                    i |= 4;
                } else {
                    if (iJ != 3) {
                        throw new e83(iJ);
                    }
                    zQ = vxVarB.q(yo2Var, 3);
                    i |= 8;
                }
            }
            vxVarB.a(yo2Var);
            return new no1(i, strN, strN2, iU, zQ, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: d(Lve0;Ljava/lang/Object;)V */
        @Override // defpackage.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void d(ve0 ve0Var, no1 no1Var) {
            ve0Var.getClass();
            no1Var.getClass();
            yo2 yo2Var = descriptor;
            wx wxVarB = ve0Var.b(yo2Var);
            no1.k(no1Var, wxVarB, yo2Var);
            wxVarB.a(yo2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ no1(int i, String str, String str2, int i2, boolean z, dp2 dp2Var) {
        if (15 != (i & 15)) {
            eu.b0(i, 15, a.INSTANCE.e());
            throw null;
        }
        this.message = str;
        this.author = str2;
        this.id = i2;
        this.isAlwaysShow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ no1 f(no1 no1Var, String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = no1Var.message;
        }
        if ((i2 & 2) != 0) {
            str2 = no1Var.author;
        }
        if ((i2 & 4) != 0) {
            i = no1Var.id;
        }
        if ((i2 & 8) != 0) {
            z = no1Var.isAlwaysShow;
        }
        return no1Var.e(str, str2, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final /* synthetic */ void k(no1 no1Var, wx wxVar, yo2 yo2Var) {
        dv2 dv2Var = (dv2) wxVar;
        dv2Var.x(yo2Var, 0, no1Var.message);
        dv2Var.x(yo2Var, 1, no1Var.author);
        dv2Var.u(2, no1Var.id, yo2Var);
        dv2Var.r(yo2Var, 3, no1Var.isAlwaysShow);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        return this.author;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        return this.isAlwaysShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final no1 e(String str, String str2, int i, boolean z) {
        str.getClass();
        str2.getClass();
        return new no1(str, str2, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no1)) {
            return false;
        }
        no1 no1Var = (no1) obj;
        return t11.l(this.message, no1Var.message) && t11.l(this.author, no1Var.author) && this.id == no1Var.id && this.isAlwaysShow == no1Var.isAlwaysShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String g() {
        return this.author;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int h() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Boolean.hashCode(this.isAlwaysShow) + vi0.d(this.id, hk1.f(this.author, this.message.hashCode() * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String i() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j() {
        return this.isAlwaysShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.message;
        String str2 = this.author;
        int i = this.id;
        boolean z = this.isAlwaysShow;
        StringBuilder sbO = vi0.o("Notice(message=", str, ", author=", str2, ", id=");
        sbO.append(i);
        sbO.append(", isAlwaysShow=");
        sbO.append(z);
        sbO.append(")");
        return sbO.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class b {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: no1.b.<init>():void type: THIS */
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

    public no1(String str, String str2, int i, boolean z) {
        str.getClass();
        str2.getClass();
        this.message = str;
        this.author = str2;
        this.id = i;
        this.isAlwaysShow = z;
    }
}
