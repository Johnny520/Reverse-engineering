package p085r;

import android.graphics.Insets;

/* JADX INFO: renamed from: r.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0811c {

    /* JADX INFO: renamed from: e */
    public static final C0811c f2711e = new C0811c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f2712a;

    /* JADX INFO: renamed from: b */
    public final int f2713b;

    /* JADX INFO: renamed from: c */
    public final int f2714c;

    /* JADX INFO: renamed from: d */
    public final int f2715d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0811c(int i2, int i3, int i4, int i5) {
        this.f2712a = i2;
        this.f2713b = i3;
        this.f2714c = i4;
        this.f2715d = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0811c m1479a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f2711e : new C0811c(i2, i3, i4, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Insets m1480b() {
        return AbstractC0810b.m1478a(this.f2712a, this.f2713b, this.f2714c, this.f2715d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0811c.class != obj.getClass()) {
            return false;
        }
        C0811c c0811c = (C0811c) obj;
        return this.f2715d == c0811c.f2715d && this.f2712a == c0811c.f2712a && this.f2714c == c0811c.f2714c && this.f2713b == c0811c.f2713b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((((this.f2712a * 31) + this.f2713b) * 31) + this.f2714c) * 31) + this.f2715d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Insets{left=" + this.f2712a + ", top=" + this.f2713b + ", right=" + this.f2714c + ", bottom=" + this.f2715d + '}';
    }
}
