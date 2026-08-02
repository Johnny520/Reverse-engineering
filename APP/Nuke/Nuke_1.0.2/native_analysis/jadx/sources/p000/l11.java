package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l11 {

    /* JADX INFO: renamed from: a */
    public final int f5878a;

    /* JADX INFO: renamed from: b */
    public final int f5879b;

    /* JADX INFO: renamed from: c */
    public final C0043b5 f5880c;

    public l11(int i, int i2, C0043b5 c0043b5) {
        this.f5878a = i;
        this.f5879b = i2;
        this.f5880c = c0043b5;
        if (i < 0) {
            nz0.m3456a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        nz0.m3456a("size should be > 0");
    }
}
