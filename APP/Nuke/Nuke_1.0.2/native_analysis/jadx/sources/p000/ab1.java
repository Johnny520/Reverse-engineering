package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ab1 implements dm0 {

    /* JADX INFO: renamed from: a */
    public final float f132a;

    public ab1(float f) {
        this.f132a = f;
    }

    @Override // p000.dm0
    /* JADX INFO: renamed from: a */
    public final float mo123a(float f) {
        return f / this.f132a;
    }

    @Override // p000.dm0
    /* JADX INFO: renamed from: b */
    public final float mo124b(float f) {
        return f * this.f132a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab1) && Float.compare(this.f132a, ((ab1) obj).f132a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f132a);
    }

    public final String toString() {
        return vi0.m5693l(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f132a, ')');
    }
}
