package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xp2 {

    /* JADX INFO: renamed from: a */
    public int f13107a;

    /* JADX INFO: renamed from: b */
    public final int[] f13108b = new int[10];

    /* JADX INFO: renamed from: a */
    public final int m6170a() {
        if ((this.f13107a & 16) != 0) {
            return this.f13108b[4];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: b */
    public final void m6171b(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f13108b;
            if (i >= iArr.length) {
                return;
            }
            this.f13107a = (1 << i) | this.f13107a;
            iArr[i] = i2;
        }
    }
}
