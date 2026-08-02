package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class no1 {
    public static final int $stable = 0;
    public static final C0507b Companion = new C0507b(null);
    private final String author;

    /* JADX INFO: renamed from: id */
    private final int f7271id;
    private final boolean isAlwaysShow;
    private final String message;

    /* JADX INFO: renamed from: no1$a */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    @j70
    public static final /* synthetic */ class C0506a implements qo0 {
        public static final int $stable = 0;
        public static final C0506a INSTANCE;
        private static final yo2 descriptor;

        static {
            C0506a c0506a = new C0506a();
            INSTANCE = c0506a;
            b12 b12Var = new b12("nuke.data.model.Notice", c0506a, 4);
            b12Var.m359l("message", false);
            b12Var.m359l("author", false);
            b12Var.m359l("id", false);
            b12Var.m359l("isAlwaysShow", false);
            descriptor = b12Var;
        }

        private C0506a() {
        }

        @Override // p000.qo0
        /* JADX INFO: renamed from: b */
        public final w41[] mo166b() {
            nv2 nv2Var = nv2.f7346a;
            return new w41[]{nv2Var, nv2Var, f11.f2733a, C0428ll.f6184a};
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
        public final no1 mo165a(y40 y40Var) {
            y40Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
            int i = 0;
            int iMo4566u = 0;
            boolean zMo4565q = false;
            String strMo4563n = null;
            String strMo4563n2 = null;
            boolean z = true;
            while (z) {
                int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
                if (iMo901j == -1) {
                    z = false;
                } else if (iMo901j == 0) {
                    strMo4563n = interfaceC0826vxMo895b.mo4563n(yo2Var, 0);
                    i |= 1;
                } else if (iMo901j == 1) {
                    strMo4563n2 = interfaceC0826vxMo895b.mo4563n(yo2Var, 1);
                    i |= 2;
                } else if (iMo901j == 2) {
                    iMo4566u = interfaceC0826vxMo895b.mo4566u(yo2Var, 2);
                    i |= 4;
                } else {
                    if (iMo901j != 3) {
                        throw new e83(iMo901j);
                    }
                    zMo4565q = interfaceC0826vxMo895b.mo4565q(yo2Var, 3);
                    i |= 8;
                }
            }
            interfaceC0826vxMo895b.mo894a(yo2Var);
            return new no1(i, strMo4563n, strMo4563n2, iMo4566u, zMo4565q, null);
        }

        @Override // p000.w41
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void mo167d(ve0 ve0Var, no1 no1Var) {
            ve0Var.getClass();
            no1Var.getClass();
            yo2 yo2Var = descriptor;
            InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
            no1.m3334k(no1Var, interfaceC0863wxMo1177b, yo2Var);
            interfaceC0863wxMo1177b.mo1176a(yo2Var);
        }
    }

    public /* synthetic */ no1(int i, String str, String str2, int i2, boolean z, dp2 dp2Var) {
        if (15 != (i & 15)) {
            AbstractC0179eu.m1449b0(i, 15, C0506a.INSTANCE.mo168e());
            throw null;
        }
        this.message = str;
        this.author = str2;
        this.f7271id = i2;
        this.isAlwaysShow = z;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ no1 m3333f(no1 no1Var, String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = no1Var.message;
        }
        if ((i2 & 2) != 0) {
            str2 = no1Var.author;
        }
        if ((i2 & 4) != 0) {
            i = no1Var.f7271id;
        }
        if ((i2 & 8) != 0) {
            z = no1Var.isAlwaysShow;
        }
        return no1Var.m3339e(str, str2, i, z);
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ void m3334k(no1 no1Var, InterfaceC0863wx interfaceC0863wx, yo2 yo2Var) {
        dv2 dv2Var = (dv2) interfaceC0863wx;
        dv2Var.m1199x(yo2Var, 0, no1Var.message);
        dv2Var.m1199x(yo2Var, 1, no1Var.author);
        dv2Var.m1196u(2, no1Var.f7271id, yo2Var);
        dv2Var.m1193r(yo2Var, 3, no1Var.isAlwaysShow);
    }

    /* JADX INFO: renamed from: a */
    public final String m3335a() {
        return this.message;
    }

    /* JADX INFO: renamed from: b */
    public final String m3336b() {
        return this.author;
    }

    /* JADX INFO: renamed from: c */
    public final int m3337c() {
        return this.f7271id;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3338d() {
        return this.isAlwaysShow;
    }

    /* JADX INFO: renamed from: e */
    public final no1 m3339e(String str, String str2, int i, boolean z) {
        str.getClass();
        str2.getClass();
        return new no1(str, str2, i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no1)) {
            return false;
        }
        no1 no1Var = (no1) obj;
        return t11.m5086l(this.message, no1Var.message) && t11.m5086l(this.author, no1Var.author) && this.f7271id == no1Var.f7271id && this.isAlwaysShow == no1Var.isAlwaysShow;
    }

    /* JADX INFO: renamed from: g */
    public final String m3340g() {
        return this.author;
    }

    /* JADX INFO: renamed from: h */
    public final int m3341h() {
        return this.f7271id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAlwaysShow) + vi0.m5685d(this.f7271id, hk1.m2207f(this.author, this.message.hashCode() * 31, 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m3342i() {
        return this.message;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3343j() {
        return this.isAlwaysShow;
    }

    public String toString() {
        String str = this.message;
        String str2 = this.author;
        int i = this.f7271id;
        boolean z = this.isAlwaysShow;
        StringBuilder sbM5696o = vi0.m5696o("Notice(message=", str, ", author=", str2, ", id=");
        sbM5696o.append(i);
        sbM5696o.append(", isAlwaysShow=");
        sbM5696o.append(z);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }

    /* JADX INFO: renamed from: no1$b */
    /* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
    public static final class C0507b {
        public /* synthetic */ C0507b(c50 c50Var) {
            this();
        }

        public final w41 serializer() {
            return C0506a.INSTANCE;
        }

        private C0507b() {
        }
    }

    public no1(String str, String str2, int i, boolean z) {
        str.getClass();
        str2.getClass();
        this.message = str;
        this.author = str2;
        this.f7271id = i;
        this.isAlwaysShow = z;
    }
}
