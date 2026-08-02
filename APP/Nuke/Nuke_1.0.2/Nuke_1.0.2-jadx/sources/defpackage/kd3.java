package defpackage;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kd3 {
    public final int a;
    public final String b;
    public final xm0 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kd3(int i, xm0 xm0Var, String str) {
        this.a = i;
        this.b = str;
        this.c = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd3)) {
            return false;
        }
        kd3 kd3Var = (kd3) obj;
        return this.a == kd3Var.a && this.b.equals(kd3Var.b) && this.c.equals(kd3Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.c.hashCode() + vi0.d(R.drawable.ic_github_mark_24, hk1.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MenuItem(id=" + this.a + ", title=" + this.b + ", iconRes=2030501894, onClick=" + this.c + ")";
    }
}
