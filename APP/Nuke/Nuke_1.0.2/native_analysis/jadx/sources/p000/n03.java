package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n03 {

    /* JADX INFO: renamed from: c */
    public static final n03 f6960c = new n03(rg3.m4450D(0), rg3.m4450D(0));

    /* JADX INFO: renamed from: a */
    public final long f6961a;

    /* JADX INFO: renamed from: b */
    public final long f6962b;

    public n03(long j, long j2) {
        this.f6961a = j;
        this.f6962b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n03)) {
            return false;
        }
        n03 n03Var = (n03) obj;
        return p13.m3673a(this.f6961a, n03Var.f6961a) && p13.m3673a(this.f6962b, n03Var.f6962b);
    }

    public final int hashCode() {
        q13[] q13VarArr = p13.f7927b;
        return Long.hashCode(this.f6962b) + (Long.hashCode(this.f6961a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) p13.m3676d(this.f6961a)) + ", restLine=" + ((Object) p13.m3676d(this.f6962b)) + ')';
    }
}
