package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g13 {

    /* JADX INFO: renamed from: a */
    public final long f3251a;

    /* JADX INFO: renamed from: b */
    public final long f3252b;

    public g13(long j, long j2) {
        this.f3251a = j;
        this.f3252b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g13)) {
            return false;
        }
        g13 g13Var = (g13) obj;
        return C0363ju.m2566c(this.f3251a, g13Var.f3251a) && C0363ju.m2566c(this.f3252b, g13Var.f3252b);
    }

    public final int hashCode() {
        int i = C0363ju.f5218h;
        return Long.hashCode(this.f3252b) + (Long.hashCode(this.f3251a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        hk1.m2213l(this.f3251a, sb, ", selectionBackgroundColor=");
        sb.append((Object) C0363ju.m2572i(this.f3252b));
        sb.append(')');
        return sb.toString();
    }
}
