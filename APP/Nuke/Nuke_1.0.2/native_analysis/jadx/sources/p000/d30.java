package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d30 extends i30 {

    /* JADX INFO: renamed from: i */
    public static final d30 f1846i = new d30(Float.floatToIntBits(0.0f));

    static {
        Float.floatToIntBits(1.0f);
        Float.floatToIntBits(2.0f);
    }

    @Override // p000.w53
    /* JADX INFO: renamed from: a */
    public final o43 mo22a() {
        return o43.f7512r;
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return Float.toString(Float.intBitsToFloat(this.f4250h));
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: f */
    public final String mo24f() {
        return "float";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("float{0x");
        int i = this.f4250h;
        sb.append(pp0.m3899K(i));
        sb.append(" / ");
        sb.append(Float.intBitsToFloat(i));
        sb.append('}');
        return sb.toString();
    }
}
