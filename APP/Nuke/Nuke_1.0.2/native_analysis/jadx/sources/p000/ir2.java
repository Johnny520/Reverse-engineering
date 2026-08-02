package p000;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ir2 implements y12 {

    /* JADX INFO: renamed from: a */
    public final sd1 f4768a;

    /* JADX INFO: renamed from: b */
    public int f4769b;

    /* JADX INFO: renamed from: c */
    public Bitmap.Config f4770c;

    public ir2(sd1 sd1Var) {
        this.f4768a = sd1Var;
    }

    @Override // p000.y12
    /* JADX INFO: renamed from: a */
    public final void mo2390a() {
        this.f4768a.m4875g(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ir2) {
            ir2 ir2Var = (ir2) obj;
            if (this.f4769b == ir2Var.f4769b && b93.m495b(this.f4770c, ir2Var.f4770c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4769b * 31;
        Bitmap.Config config = this.f4770c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return jr2.m2551c(this.f4769b, this.f4770c);
    }
}
