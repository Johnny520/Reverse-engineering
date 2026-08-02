package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m00 {

    /* JADX INFO: renamed from: a */
    public final long f6419a;

    /* JADX INFO: renamed from: b */
    public final long f6420b;

    /* JADX INFO: renamed from: c */
    public final long f6421c;

    /* JADX INFO: renamed from: d */
    public final long f6422d;

    /* JADX INFO: renamed from: e */
    public final long f6423e;

    public m00(long j, long j2, long j3, long j4, long j5) {
        this.f6419a = j;
        this.f6420b = j2;
        this.f6421c = j3;
        this.f6422d = j4;
        this.f6423e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m00)) {
            return false;
        }
        m00 m00Var = (m00) obj;
        return C0363ju.m2566c(this.f6419a, m00Var.f6419a) && C0363ju.m2566c(this.f6420b, m00Var.f6420b) && C0363ju.m2566c(this.f6421c, m00Var.f6421c) && C0363ju.m2566c(this.f6422d, m00Var.f6422d) && C0363ju.m2566c(this.f6423e, m00Var.f6423e);
    }

    public final int hashCode() {
        int i = C0363ju.f5218h;
        return Long.hashCode(this.f6423e) + hk1.m2204c(hk1.m2204c(hk1.m2204c(Long.hashCode(this.f6419a) * 31, 31, this.f6420b), 31, this.f6421c), 31, this.f6422d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        hk1.m2213l(this.f6419a, sb, ", textColor=");
        hk1.m2213l(this.f6420b, sb, ", iconColor=");
        hk1.m2213l(this.f6421c, sb, ", disabledTextColor=");
        hk1.m2213l(this.f6422d, sb, ", disabledIconColor=");
        sb.append((Object) C0363ju.m2572i(this.f6423e));
        sb.append(')');
        return sb.toString();
    }
}
