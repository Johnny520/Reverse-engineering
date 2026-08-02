package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tw0 {
    public final String a;
    public final js0 b;
    public final pw0 c;
    public final long d;
    public final x62 e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tw0(String str, js0 js0Var, pw0 pw0Var, long j, x62 x62Var, long j2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = js0Var;
        this.c = pw0Var;
        this.d = j;
        this.e = x62Var;
        this.f = j2;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw0)) {
            return false;
        }
        tw0 tw0Var = (tw0) obj;
        return this.a.equals(tw0Var.a) && this.b.equals(tw0Var.b) && t11.l(this.c, tw0Var.c) && this.d == tw0Var.d && this.e == tw0Var.e && this.f == tw0Var.f && this.g == tw0Var.g && this.h == tw0Var.h && this.i == tw0Var.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + Arrays.hashCode(this.b.h)) * 31;
        pw0 pw0Var = this.c;
        return Boolean.hashCode(this.i) + hk1.d(hk1.d(hk1.c((this.e.hashCode() + hk1.c((iHashCode + (pw0Var == null ? 0 : pw0Var.hashCode())) * 31, 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HttpOptions(method=" + this.a + ", headers=" + this.b + ", body=" + this.c + ", timeoutMillis=" + this.d + ", redirect=" + this.e + ", maxBytes=" + this.f + ", overwrite=" + this.g + ", createParents=" + this.h + ", requireSuccess=" + this.i + ")";
    }
}
