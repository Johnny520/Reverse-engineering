package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tw0 {

    /* JADX INFO: renamed from: a */
    public final String f10976a;

    /* JADX INFO: renamed from: b */
    public final js0 f10977b;

    /* JADX INFO: renamed from: c */
    public final pw0 f10978c;

    /* JADX INFO: renamed from: d */
    public final long f10979d;

    /* JADX INFO: renamed from: e */
    public final x62 f10980e;

    /* JADX INFO: renamed from: f */
    public final long f10981f;

    /* JADX INFO: renamed from: g */
    public final boolean f10982g;

    /* JADX INFO: renamed from: h */
    public final boolean f10983h;

    /* JADX INFO: renamed from: i */
    public final boolean f10984i;

    public tw0(String str, js0 js0Var, pw0 pw0Var, long j, x62 x62Var, long j2, boolean z, boolean z2, boolean z3) {
        this.f10976a = str;
        this.f10977b = js0Var;
        this.f10978c = pw0Var;
        this.f10979d = j;
        this.f10980e = x62Var;
        this.f10981f = j2;
        this.f10982g = z;
        this.f10983h = z2;
        this.f10984i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw0)) {
            return false;
        }
        tw0 tw0Var = (tw0) obj;
        return this.f10976a.equals(tw0Var.f10976a) && this.f10977b.equals(tw0Var.f10977b) && t11.m5086l(this.f10978c, tw0Var.f10978c) && this.f10979d == tw0Var.f10979d && this.f10980e == tw0Var.f10980e && this.f10981f == tw0Var.f10981f && this.f10982g == tw0Var.f10982g && this.f10983h == tw0Var.f10983h && this.f10984i == tw0Var.f10984i;
    }

    public final int hashCode() {
        int iHashCode = ((this.f10976a.hashCode() * 31) + Arrays.hashCode(this.f10977b.f5194h)) * 31;
        pw0 pw0Var = this.f10978c;
        return Boolean.hashCode(this.f10984i) + hk1.m2205d(hk1.m2205d(hk1.m2204c((this.f10980e.hashCode() + hk1.m2204c((iHashCode + (pw0Var == null ? 0 : pw0Var.hashCode())) * 31, 31, this.f10979d)) * 31, 31, this.f10981f), 31, this.f10982g), 31, this.f10983h);
    }

    public final String toString() {
        return "HttpOptions(method=" + this.f10976a + ", headers=" + this.f10977b + ", body=" + this.f10978c + ", timeoutMillis=" + this.f10979d + ", redirect=" + this.f10980e + ", maxBytes=" + this.f10981f + ", overwrite=" + this.f10982g + ", createParents=" + this.f10983h + ", requireSuccess=" + this.f10984i + ")";
    }
}
