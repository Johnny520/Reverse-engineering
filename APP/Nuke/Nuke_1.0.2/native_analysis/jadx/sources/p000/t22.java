package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t22 {
    public static final int $stable = 0;
    public static final C0719b Companion = new C0719b(null);
    private final long applyTime;
    private final long deadline;
    private final boolean isPremium;
    private final String premiumKey;

    /* JADX INFO: renamed from: t22$a */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    @j70
    public static final /* synthetic */ class C0718a implements qo0 {
        public static final int $stable = 0;
        public static final C0718a INSTANCE;
        private static final yo2 descriptor;

        static {
            C0718a c0718a = new C0718a();
            INSTANCE = c0718a;
            b12 b12Var = new b12("nuke.data.model.Premium", c0718a, 4);
            b12Var.m359l("isPremium", false);
            b12Var.m359l("premiumKey", false);
            b12Var.m359l("deadline", false);
            b12Var.m359l("applyTime", false);
            descriptor = b12Var;
        }

        private C0718a() {
        }

        @Override // p000.qo0
        /* JADX INFO: renamed from: b */
        public final w41[] mo166b() {
            ed1 ed1Var = ed1.f2399a;
            return new w41[]{C0428ll.f6184a, nv2.f7346a, ed1Var, ed1Var};
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
        public final t22 mo165a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
            int i = 0;
            boolean zMo4565q = false;
            String strMo4563n = null;
            long jMo4568z = 0;
            long jMo4568z2 = 0;
            boolean z = true;
            while (z) {
                int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
                if (iMo901j == -1) {
                    z = false;
                } else if (iMo901j == 0) {
                    zMo4565q = interfaceC0826vxMo895b.mo4565q(yo2Var, 0);
                    i |= 1;
                } else if (iMo901j == 1) {
                    strMo4563n = interfaceC0826vxMo895b.mo4563n(yo2Var, 1);
                    i |= 2;
                } else if (iMo901j == 2) {
                    jMo4568z = interfaceC0826vxMo895b.mo4568z(yo2Var, 2);
                    i |= 4;
                } else {
                    if (iMo901j != 3) {
                        throw new e83(iMo901j);
                    }
                    jMo4568z2 = interfaceC0826vxMo895b.mo4568z(yo2Var, 3);
                    i |= 8;
                }
            }
            interfaceC0826vxMo895b.mo894a(yo2Var);
            return new t22(i, zMo4565q, strMo4563n, jMo4568z, jMo4568z2, null);
        }

        @Override // p000.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo167d(ve0 ve0Var, t22 t22Var) {
            ve0Var.getClass();
            t22Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
            t22.m5102k(t22Var, interfaceC0863wxMo1177b, yo2Var);
            interfaceC0863wxMo1177b.mo1176a(yo2Var);
        }
    }

    public /* synthetic */ t22(int i, boolean z, String str, long j, long j2, dp2 dp2Var) {
        if (15 != (i & 15)) {
            AbstractC0179eu.m1449b0(i, 15, C0718a.INSTANCE.mo168e());
            throw null;
        }
        this.isPremium = z;
        this.premiumKey = str;
        this.deadline = j;
        this.applyTime = j2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ t22 m5101f(t22 t22Var, boolean z, String str, long j, long j2, int i, Object obj) {
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
        return t22Var.m5107e(z, str, j, j3);
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ void m5102k(t22 t22Var, InterfaceC0863wx interfaceC0863wx, yo2 yo2Var) {
        dv2 dv2Var = (dv2) interfaceC0863wx;
        dv2Var.m1193r(yo2Var, 0, t22Var.isPremium);
        dv2Var.m1199x(yo2Var, 1, t22Var.premiumKey);
        dv2Var.m1197v(yo2Var, 2, t22Var.deadline);
        dv2Var.m1197v(yo2Var, 3, t22Var.applyTime);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5103a() {
        return this.isPremium;
    }

    /* JADX INFO: renamed from: b */
    public final String m5104b() {
        return this.premiumKey;
    }

    /* JADX INFO: renamed from: c */
    public final long m5105c() {
        return this.deadline;
    }

    /* JADX INFO: renamed from: d */
    public final long m5106d() {
        return this.applyTime;
    }

    /* JADX INFO: renamed from: e */
    public final t22 m5107e(boolean z, String str, long j, long j2) {
        str.getClass();
        return new t22(z, str, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t22)) {
            return false;
        }
        t22 t22Var = (t22) obj;
        return this.isPremium == t22Var.isPremium && t11.m5086l(this.premiumKey, t22Var.premiumKey) && this.deadline == t22Var.deadline && this.applyTime == t22Var.applyTime;
    }

    /* JADX INFO: renamed from: g */
    public final long m5108g() {
        return this.applyTime;
    }

    /* JADX INFO: renamed from: h */
    public final long m5109h() {
        return this.deadline;
    }

    public int hashCode() {
        return Long.hashCode(this.applyTime) + hk1.m2204c(hk1.m2207f(this.premiumKey, Boolean.hashCode(this.isPremium) * 31, 31), 31, this.deadline);
    }

    /* JADX INFO: renamed from: i */
    public final String m5110i() {
        return this.premiumKey;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5111j() {
        return this.isPremium;
    }

    public String toString() {
        return "Premium(isPremium=" + this.isPremium + ", premiumKey=" + this.premiumKey + ", deadline=" + this.deadline + ", applyTime=" + this.applyTime + ")";
    }

    /* JADX INFO: renamed from: t22$b */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class C0719b {
        public /* synthetic */ C0719b(c50 c50Var) {
            this();
        }

        public final w41 serializer() {
            return C0718a.INSTANCE;
        }

        private C0719b() {
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
