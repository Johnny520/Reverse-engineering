package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d81 implements gu2 {
    public final nx1 h;
    public int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d81(int i) {
        int i2 = (i / 30) * 30;
        this.h = new nx1(ci0.X(Math.max(i2 - 100, 0), i2 + 130), sn.T);
        this.i = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gu2
    public final Object getValue() {
        return (c11) this.h.getValue();
    }
}
