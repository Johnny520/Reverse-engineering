package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oo0 {

    /* JADX INFO: renamed from: a */
    public static final no0 f4599a;

    /* JADX INFO: renamed from: b */
    public static final zn0 f4600b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        no0 no0Var = new no0(0);
        f4599a = no0Var;
        f4600b = new zn0(0, 0, 0, 0, 0, 0, C0496n2.f4140T, new d90(1), p30.m2995e(C0220fs.f1799d), no0Var, AbstractC0654qj.m3255b(0, 0, 15));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m2938a(zn0 zn0Var, int i) {
        int i2 = zn0Var.f7939c;
        int i3 = zn0Var.f7938b;
        long j = ((long) i) * ((long) (i2 + i3));
        int i4 = -zn0Var.f7942f;
        int i5 = zn0Var.f7940d;
        long j2 = ((j + ((long) i4)) + ((long) i5)) - ((long) i2);
        int iM5599g = (int) (zn0Var.f7941e == um0.f6265e ? zn0Var.m5599g() >> 32 : zn0Var.m5599g() & 4294967295L);
        long jM4907n = j2 - ((long) (iM5599g - w60.m4907n(zn0Var.f7950n.m2630i(iM5599g, i3, i4, i5), 0, iM5599g)));
        if (jM4907n < 0) {
            return 0L;
        }
        return jM4907n;
    }
}
