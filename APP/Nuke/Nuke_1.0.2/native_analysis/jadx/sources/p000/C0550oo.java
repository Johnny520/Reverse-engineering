package p000;

/* JADX INFO: renamed from: oo */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0550oo {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f7737n = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f7738a;

    /* JADX INFO: renamed from: b */
    public final boolean f7739b;

    /* JADX INFO: renamed from: c */
    public final int f7740c;

    /* JADX INFO: renamed from: d */
    public final int f7741d;

    /* JADX INFO: renamed from: e */
    public final boolean f7742e;

    /* JADX INFO: renamed from: f */
    public final boolean f7743f;

    /* JADX INFO: renamed from: g */
    public final boolean f7744g;

    /* JADX INFO: renamed from: h */
    public final int f7745h;

    /* JADX INFO: renamed from: i */
    public final int f7746i;

    /* JADX INFO: renamed from: j */
    public final boolean f7747j;

    /* JADX INFO: renamed from: k */
    public final boolean f7748k;

    /* JADX INFO: renamed from: l */
    public final boolean f7749l;

    /* JADX INFO: renamed from: m */
    public String f7750m;

    static {
        long jM3895G;
        C0953z8 c0953z8 = ad0.f155i;
        ed0 ed0Var = ed0.SECONDS;
        if (ed0Var.compareTo(ed0Var) <= 0) {
            int i = cd0.f1486a;
            jM3895G = 4294967294000000000L;
        } else {
            jM3895G = pp0.m3895G(2147483647L, ed0Var);
        }
        long jM135f = ad0.m135f(jM3895G, ed0Var);
        if (jM135f >= 0) {
            return;
        }
        C0676s.m4647f("maxStale < 0: ", jM135f);
    }

    public C0550oo(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f7738a = z;
        this.f7739b = z2;
        this.f7740c = i;
        this.f7741d = i2;
        this.f7742e = z3;
        this.f7743f = z4;
        this.f7744g = z5;
        this.f7745h = i3;
        this.f7746i = i4;
        this.f7747j = z6;
        this.f7748k = z7;
        this.f7749l = z8;
        this.f7750m = str;
    }

    public final String toString() {
        String str = this.f7750m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f7738a) {
            sb.append("no-cache, ");
        }
        if (this.f7739b) {
            sb.append("no-store, ");
        }
        int i = this.f7740c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f7741d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f7742e) {
            sb.append("private, ");
        }
        if (this.f7743f) {
            sb.append("public, ");
        }
        if (this.f7744g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f7745h;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f7746i;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f7747j) {
            sb.append("only-if-cached, ");
        }
        if (this.f7748k) {
            sb.append("no-transform, ");
        }
        if (this.f7749l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String string = sb.toString();
        this.f7750m = string;
        return string;
    }
}
