package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d30 extends i30 {
    public static final d30 i = new d30(Float.floatToIntBits(0.0f));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Float.floatToIntBits(1.0f);
        Float.floatToIntBits(2.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w53
    public final o43 a() {
        return o43.r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t23
    public final String b() {
        return Float.toString(Float.intBitsToFloat(this.h));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dz
    public final String f() {
        return "float";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("float{0x");
        int i2 = this.h;
        sb.append(pp0.K(i2));
        sb.append(" / ");
        sb.append(Float.intBitsToFloat(i2));
        sb.append('}');
        return sb.toString();
    }
}
