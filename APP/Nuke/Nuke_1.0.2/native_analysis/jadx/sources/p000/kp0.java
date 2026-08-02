package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kp0 {
    public static final int $stable = 0;

    @fp2("avatar_url")
    private final String avatarUrl;

    public /* synthetic */ kp0(String str, int i, c50 c50Var) {
        this((i & 1) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ kp0 m2727c(kp0 kp0Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kp0Var.avatarUrl;
        }
        return kp0Var.m2729b(str);
    }

    /* JADX INFO: renamed from: a */
    public final String m2728a() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: b */
    public final kp0 m2729b(String str) {
        return new kp0(str);
    }

    /* JADX INFO: renamed from: d */
    public final String m2730d() {
        return this.avatarUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kp0) && t11.m5086l(this.avatarUrl, ((kp0) obj).avatarUrl);
    }

    public int hashCode() {
        String str = this.avatarUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return vi0.m5691j("GitHubUser(avatarUrl=", this.avatarUrl, ")");
    }

    public kp0(String str) {
        this.avatarUrl = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kp0() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
