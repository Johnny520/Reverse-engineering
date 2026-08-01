package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class lb1 extends jb1 {

    /* JADX INFO: renamed from: d */
    public final List f3408d;

    /* JADX INFO: renamed from: e */
    public final g31 f3409e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lb1(List list, g31 g31Var) {
        this.f3408d = list;
        this.f3409e = g31Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lb1.class != obj.getClass()) {
            return false;
        }
        lb1 lb1Var = (lb1) obj;
        return this.f3409e.equals(lb1Var.f3409e) && p30.m3002l(this.f3408d, lb1Var.f3408d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC0748t1.m4143a(0.0f, AbstractC0748t1.m4143a(1.0f, AbstractC0748t1.m4143a(0.0f, AbstractC0748t1.m4143a(1.0f, AbstractC0748t1.m4144b(2, AbstractC0748t1.m4144b(0, AbstractC0748t1.m4143a(1.0f, AbstractC0748t1.m4143a(1.0f, AbstractC0748t1.m4143a(1.0f, (this.f3409e.hashCode() + (this.f3408d.hashCode() * 31)) * 31, 961), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
