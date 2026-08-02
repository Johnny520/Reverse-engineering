package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class in2 {

    /* JADX INFO: renamed from: a */
    public static final C0383kd f4704a = new C0383kd(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final n43 f4705b = new n43(new ml2(2), new ml2(3));

    /* JADX INFO: renamed from: c */
    public static final long f4706c;

    /* JADX INFO: renamed from: d */
    public static final qt2 f4707d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f4706c = jFloatToRawIntBits;
        f4707d = new qt2(new rs1(jFloatToRawIntBits));
    }
}
