package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7003 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final C1136 f21145;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final C7003 f21146;

    /* JADX INFO: renamed from: ۥ */
    public final C1136 f2624;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C1136 f2625;

    /* JADX INFO: renamed from: Yue.ۥۡۥۨۦ$ۥ */
    public static class C1135 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final C1135 f21147;

        /* JADX INFO: renamed from: ۥ */
        public final C7003 f2626;

        /* JADX INFO: renamed from: ۥ۟ */
        public final C7003 f2627;

        static {
            C7003 c7003 = C7003.f21146;
            f21147 = new C1135(c7003, c7003);
        }

        public C1135(C7003 c7003, C7003 c70032) {
            this.f2626 = c7003;
            this.f2627 = c70032;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1135 c1135 = (C1135) obj;
            if (this.f2626.equals(c1135.f2626)) {
                return this.f2627.equals(c1135.f2627);
            }
            return false;
        }

        public int hashCode() {
            return (this.f2626.hashCode() * 31) + this.f2627.hashCode();
        }

        public String toString() {
            return m3307().toString() + "=" + m3308().toString();
        }

        /* JADX INFO: renamed from: ۥ */
        public C7003 m3307() {
            return this.f2626;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public C7003 m3308() {
            return this.f2627;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥۨۦ$ۥ۟ */
    public static class C1136 {

        /* JADX INFO: renamed from: ۥ */
        public final int f2628;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f2629;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f21148;

        public C1136(int i, int i2, int i3) {
            this.f2628 = i;
            this.f2629 = i2;
            this.f21148 = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1136 c1136 = (C1136) obj;
            return this.f2628 == c1136.f2628 && this.f2629 == c1136.f2629 && this.f21148 == c1136.f21148;
        }

        public int hashCode() {
            return (((this.f2628 * 31) + this.f2629) * 31) + this.f21148;
        }

        public String toString() {
            return this.f2629 + "," + this.f21148 + ":" + this.f2628;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m3310() {
            return this.f21148;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m21636() {
            return this != C7003.f21145;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m21637() {
            return this.f2629;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m21638() {
            return this.f2628;
        }
    }

    static {
        C1136 c1136 = new C1136(-1, -1, -1);
        f21145 = c1136;
        f21146 = new C7003(c1136, c1136);
    }

    public C7003(C1136 c1136, C1136 c11362) {
        this.f2624 = c1136;
        this.f2625 = c11362;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C7003 m21629(AbstractC6381 abstractC6381, boolean z) {
        Object objM9216;
        String str = z ? C7429.f22520 : C7429.f22521;
        if (abstractC6381.mo13697() && (objM9216 = abstractC6381.mo13685().m9216(str)) != null) {
            return (C7003) objM9216;
        }
        return f21146;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7003 c7003 = (C7003) obj;
        if (this.f2624.equals(c7003.f2624)) {
            return this.f2625.equals(c7003.f2625);
        }
        return false;
    }

    public int hashCode() {
        return (this.f2624.hashCode() * 31) + this.f2625.hashCode();
    }

    public String toString() {
        return this.f2624 + "-" + this.f2625;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public C1136 m3306() {
        return this.f2625;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m21630() {
        return this.f2625.f2628;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m21631() {
        if (m21632()) {
            return this.f2624.equals(this.f2625);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m21632() {
        return this != f21146;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C1136 m21633() {
        return this.f2624;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m21634() {
        return this.f2624.f2628;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m21635(AbstractC6381 abstractC6381, boolean z) {
    }
}
