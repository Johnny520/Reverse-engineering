package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface sj0 extends hd {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hd
    default x93 a(n43 n43Var) {
        return new kj1(this);
    }

    float b(long j, float f, float f2, float f3);

    float c(long j, float f, float f2, float f3);

    long d(float f, float f2, float f3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float e(float f, float f2, float f3) {
        return c(d(f, f2, f3), f, f2, f3);
    }
}
