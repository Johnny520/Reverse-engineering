package p108V3;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: V3.U */
/* JADX INFO: loaded from: classes.dex */
public final class C1547U {

    /* JADX INFO: renamed from: a */
    public final float f5382a;

    /* JADX INFO: renamed from: b */
    public final float f5383b;

    /* JADX INFO: renamed from: c */
    public final float f5384c;

    public C1547U(float f2, float f5, float f6) {
        this.f5382a = f2;
        this.f5383b = f5;
        this.f5384c = f6;
    }

    /* JADX INFO: renamed from: a */
    public static C1547U m2842a(C1547U c1547u, float f2, float f5, float f6, int i5) {
        if ((i5 & 1) != 0) {
            f2 = c1547u.f5382a;
        }
        if ((i5 & 2) != 0) {
            f5 = c1547u.f5383b;
        }
        if ((i5 & 4) != 0) {
            f6 = c1547u.f5384c;
        }
        c1547u.getClass();
        return new C1547U(f2, f5, f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1547U)) {
            return false;
        }
        C1547U c1547u = (C1547U) obj;
        return Float.compare(this.f5382a, c1547u.f5382a) == 0 && Float.compare(this.f5383b, c1547u.f5383b) == 0 && Float.compare(this.f5384c, c1547u.f5384c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5384c) + AbstractC0231b.m390a(this.f5383b, Float.hashCode(this.f5382a) * 31, 31);
    }

    public final String toString() {
        return "ThemeHsvColor(hue=" + this.f5382a + ", saturation=" + this.f5383b + ", value=" + this.f5384c + ")";
    }
}
