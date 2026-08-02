package p000;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kd3 {

    /* JADX INFO: renamed from: a */
    public final int f5475a;

    /* JADX INFO: renamed from: b */
    public final String f5476b;

    /* JADX INFO: renamed from: c */
    public final xm0 f5477c;

    public kd3(int i, xm0 xm0Var, String str) {
        this.f5475a = i;
        this.f5476b = str;
        this.f5477c = xm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd3)) {
            return false;
        }
        kd3 kd3Var = (kd3) obj;
        return this.f5475a == kd3Var.f5475a && this.f5476b.equals(kd3Var.f5476b) && this.f5477c.equals(kd3Var.f5477c);
    }

    public final int hashCode() {
        return this.f5477c.hashCode() + vi0.m5685d(R.drawable.ic_github_mark_24, hk1.m2207f(this.f5476b, Integer.hashCode(this.f5475a) * 31, 31), 31);
    }

    public final String toString() {
        return "MenuItem(id=" + this.f5475a + ", title=" + this.f5476b + ", iconRes=2030501894, onClick=" + this.f5477c + ")";
    }
}
