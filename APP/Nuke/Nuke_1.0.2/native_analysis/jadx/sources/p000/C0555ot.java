package p000;

/* JADX INFO: renamed from: ot */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0555ot {
    public static final int $stable = 8;
    private final C0512nt environment;
    private final String message;

    public /* synthetic */ C0555ot(String str, C0512nt c0512nt, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : c0512nt);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0555ot m3633d(C0555ot c0555ot, String str, C0512nt c0512nt, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c0555ot.message;
        }
        if ((i & 2) != 0) {
            c0512nt = c0555ot.environment;
        }
        return c0555ot.m3636c(str, c0512nt);
    }

    /* JADX INFO: renamed from: a */
    public final String m3634a() {
        return this.message;
    }

    /* JADX INFO: renamed from: b */
    public final C0512nt m3635b() {
        return this.environment;
    }

    /* JADX INFO: renamed from: c */
    public final C0555ot m3636c(String str, C0512nt c0512nt) {
        return new C0555ot(str, c0512nt);
    }

    /* JADX INFO: renamed from: e */
    public final C0512nt m3637e() {
        return this.environment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0555ot)) {
            return false;
        }
        C0555ot c0555ot = (C0555ot) obj;
        return t11.m5086l(this.message, c0555ot.message) && t11.m5086l(this.environment, c0555ot.environment);
    }

    /* JADX INFO: renamed from: f */
    public final String m3638f() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C0512nt c0512nt = this.environment;
        return iHashCode + (c0512nt != null ? c0512nt.hashCode() : 0);
    }

    public String toString() {
        return "ClientReportRequest(message=" + this.message + ", environment=" + this.environment + ")";
    }

    public C0555ot(String str, C0512nt c0512nt) {
        this.message = str;
        this.environment = c0512nt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0555ot() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
