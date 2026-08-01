package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class z61 {

    /* JADX INFO: renamed from: c */
    public static final z61 f7816c = new z61(j50.m1667q(0), j50.m1667q(0));

    /* JADX INFO: renamed from: a */
    public final long f7817a;

    /* JADX INFO: renamed from: b */
    public final long f7818b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z61(long j, long j2) {
        this.f7817a = j;
        this.f7818b = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z61)) {
            return false;
        }
        z61 z61Var = (z61) obj;
        return u71.m4286a(this.f7817a, z61Var.f7817a) && u71.m4286a(this.f7818b, z61Var.f7818b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        v71[] v71VarArr = u71.f6157b;
        return Long.hashCode(this.f7818b) + (Long.hashCode(this.f7817a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) u71.m4289d(this.f7817a)) + ", restLine=" + ((Object) u71.m4289d(this.f7818b)) + ')';
    }
}
