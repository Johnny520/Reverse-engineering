package p000;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class i20 {

    /* JADX INFO: renamed from: e */
    public static final i20 f2403e = new i20(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f2404a;

    /* JADX INFO: renamed from: b */
    public final int f2405b;

    /* JADX INFO: renamed from: c */
    public final int f2406c;

    /* JADX INFO: renamed from: d */
    public final int f2407d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i20(int i, int i2, int i3, int i4) {
        this.f2404a = i;
        this.f2405b = i2;
        this.f2406c = i3;
        this.f2407d = i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static i20 m1512a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f2403e : new i20(i, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static i20 m1513b(Insets insets) {
        return m1512a(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Insets m1514c() {
        return Insets.of(this.f2404a, this.f2405b, this.f2406c, this.f2407d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i20.class != obj.getClass()) {
            return false;
        }
        i20 i20Var = (i20) obj;
        return this.f2407d == i20Var.f2407d && this.f2404a == i20Var.f2404a && this.f2406c == i20Var.f2406c && this.f2405b == i20Var.f2405b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((((this.f2404a * 31) + this.f2405b) * 31) + this.f2406c) * 31) + this.f2407d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Insets{left=" + this.f2404a + ", top=" + this.f2405b + ", right=" + this.f2406c + ", bottom=" + this.f2407d + '}';
    }
}
