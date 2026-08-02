package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ea3 {
    /* JADX INFO: renamed from: a */
    public static final long m1314a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static void m1315b(String str, xm0 xm0Var) {
        f23 f23Var = new f23(xm0Var);
        f23Var.setDaemon(true);
        f23Var.setName(str);
        f23Var.start();
    }
}
