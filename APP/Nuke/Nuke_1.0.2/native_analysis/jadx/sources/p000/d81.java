package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d81 implements gu2 {

    /* JADX INFO: renamed from: h */
    public final nx1 f1909h;

    /* JADX INFO: renamed from: i */
    public int f1910i;

    public d81(int i) {
        int i2 = (i / 30) * 30;
        this.f1909h = new nx1(ci0.m799X(Math.max(i2 - 100, 0), i2 + 130), C0700sn.f10216T);
        this.f1910i = i;
    }

    @Override // p000.gu2
    public final Object getValue() {
        return (c11) this.f1909h.getValue();
    }
}
