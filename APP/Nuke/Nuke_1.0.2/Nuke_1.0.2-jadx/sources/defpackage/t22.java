package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t22 {
    public static final int $stable = 0;
    public static final b Companion = new b(null);
    private final long applyTime;
    private final long deadline;
    private final boolean isPremium;
    private final String premiumKey;

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
            b12 b12Var = new b12("nuke.data.model.Premium", aVar, 4);
            b12Var.l("isPremium", false);
            b12Var.l("premiumKey", false);
            b12Var.l("deadline", false);
            b12Var.l("applyTime", false);
            descriptor = b12Var;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // defpackage.qo0
        public final w41[] b() {
            ed1 ed1Var = ed1.a;
            return new w41[]{ll.a, nv2.a, ed1Var, ed1Var};
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
        public final t22 a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            vx vxVarB = y40Var.b(yo2Var);
            int i = 0;
            boolean zQ = false;
            String strN = null;
            long jZ = 0;
            long jZ2 = 0;
            boolean z = true;
            while (z) {
                int iJ = vxVarB.j(yo2Var);
                if (iJ == -1) {
                    z = false;
                } else if (iJ == 0) {
                    zQ = vxVarB.q(yo2Var, 0);
                    i |= 1;
                } else if (iJ == 1) {
                    strN = vxVarB.n(yo2Var, 1);
                    i |= 2;
                } else if (iJ == 2) {
                    jZ = vxVarB.z(yo2Var, 2);
                    i |= 4;
                } else {
                    if (iJ != 3) {
                        throw new e83(iJ);
                    }
                    jZ2 = vxVarB.z(yo2Var, 3);
                    i |= 8;
                }
            }
            vxVarB.a(yo2Var);
            return new t22(i, zQ, strN, jZ, jZ2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: d(Lve0;Ljava/lang/Object;)V */
        @Override // defpackage.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void d(ve0 ve0Var, t22 t22Var) {
            ve0Var.getClass();
            t22Var.getClass();
            yo2 yo2Var = descriptor;
            wx wxVarB = ve0Var.b(yo2Var);
            t22.k(t22Var, wxVarB, yo2Var);
            wxVarB.a(yo2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ t22(int i, boolean z, String str, long j, long j2, dp2 dp2Var) {
        if (15 != (i & 15)) {
            eu.b0(i, 15, a.INSTANCE.e());
            throw null;
        }
        this.isPremium = z;
        this.premiumKey = str;
        this.deadline = j;
        this.applyTime = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ t22 f(t22 t22Var, boolean z, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = t22Var.isPremium;
        }
        if ((i & 2) != 0) {
            str = t22Var.premiumKey;
        }
        if ((i & 4) != 0) {
            j = t22Var.deadline;
        }
        if ((i & 8) != 0) {
            j2 = t22Var.applyTime;
        }
        long j3 = j2;
        return t22Var.e(z, str, j, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final /* synthetic */ void k(t22 t22Var, wx wxVar, yo2 yo2Var) {
        dv2 dv2Var = (dv2) wxVar;
        dv2Var.r(yo2Var, 0, t22Var.isPremium);
        dv2Var.x(yo2Var, 1, t22Var.premiumKey);
        dv2Var.v(yo2Var, 2, t22Var.deadline);
        dv2Var.v(yo2Var, 3, t22Var.applyTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        return this.isPremium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        return this.premiumKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long c() {
        return this.deadline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long d() {
        return this.applyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final t22 e(boolean z, String str, long j, long j2) {
        str.getClass();
        return new t22(z, str, j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t22)) {
            return false;
        }
        t22 t22Var = (t22) obj;
        return this.isPremium == t22Var.isPremium && t11.l(this.premiumKey, t22Var.premiumKey) && this.deadline == t22Var.deadline && this.applyTime == t22Var.applyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long g() {
        return this.applyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long h() {
        return this.deadline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Long.hashCode(this.applyTime) + hk1.c(hk1.f(this.premiumKey, Boolean.hashCode(this.isPremium) * 31, 31), 31, this.deadline);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String i() {
        return this.premiumKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j() {
        return this.isPremium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "Premium(isPremium=" + this.isPremium + ", premiumKey=" + this.premiumKey + ", deadline=" + this.deadline + ", applyTime=" + this.applyTime + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class b {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: t22.b.<init>():void type: THIS */
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

    public t22(boolean z, String str, long j, long j2) {
        str.getClass();
        this.isPremium = z;
        this.premiumKey = str;
        this.deadline = j;
        this.applyTime = j2;
    }
}
