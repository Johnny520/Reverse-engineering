package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b30 extends j30 {

    /* JADX INFO: renamed from: i */
    public static final b30 f544i = new b30(Double.doubleToLongBits(0.0d));

    static {
        Double.doubleToLongBits(1.0d);
    }

    @Override // p000.w53
    /* JADX INFO: renamed from: a */
    public final o43 mo22a() {
        return o43.f7511q;
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return Double.toString(Double.longBitsToDouble(this.f4885h));
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: f */
    public final String mo24f() {
        return "double";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("double{0x");
        long j = this.f4885h;
        sb.append(pp0.m3900L(j));
        sb.append(" / ");
        sb.append(Double.longBitsToDouble(j));
        sb.append('}');
        return sb.toString();
    }
}
