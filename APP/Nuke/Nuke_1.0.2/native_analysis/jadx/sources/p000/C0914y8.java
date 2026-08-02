package p000;

/* JADX INFO: renamed from: y8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0914y8 implements m02 {

    /* JADX INFO: renamed from: h */
    public final int f13341h;

    public C0914y8(int i) {
        this.f13341h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0914y8) && this.f13341h == ((C0914y8) obj).f13341h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13341h);
    }

    public final String toString() {
        return vi0.m5694m(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f13341h, ')');
    }
}
