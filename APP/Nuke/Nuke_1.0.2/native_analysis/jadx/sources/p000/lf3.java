package p000;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lf3 {

    /* JADX INFO: renamed from: a */
    public final C0851wl f6101a;

    /* JADX INFO: renamed from: b */
    public final float f6102b;

    public lf3(Rect rect, float f) {
        this.f6101a = new C0851wl(rect);
        this.f6102b = f;
    }

    /* JADX INFO: renamed from: a */
    public final Rect m2903a() {
        C0851wl c0851wl = this.f6101a;
        c0851wl.getClass();
        return new Rect(c0851wl.f12569a, c0851wl.f12570b, c0851wl.f12571c, c0851wl.f12572d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lf3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        lf3 lf3Var = (lf3) obj;
        return t11.m5086l(this.f6101a, lf3Var.f6101a) && this.f6102b == lf3Var.f6102b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6102b) + (this.f6101a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.f6101a);
        sb.append(", density=");
        return vi0.m5693l(sb, this.f6102b, ')');
    }

    public lf3(C0851wl c0851wl, float f) {
        this.f6101a = c0851wl;
        this.f6102b = f;
    }
}
