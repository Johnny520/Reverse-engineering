package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class t70 implements w31 {

    /* JADX INFO: renamed from: d */
    public final gp0 f5938d;

    /* JADX INFO: renamed from: e */
    public int f5939e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t70(int i) {
        int i2 = (i / 30) * 30;
        this.f5938d = new gp0(w60.m4893O(Math.max(i2 - 100, 0), i2 + 130), C0496n2.f4141U);
        this.f5939e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4190a(int i) {
        if (i != this.f5939e) {
            this.f5939e = i;
            int i2 = (i / 30) * 30;
            this.f5938d.setValue(w60.m4893O(Math.max(i2 - 100, 0), i2 + 130));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.w31
    public final Object getValue() {
        return (z20) this.f5938d.getValue();
    }
}
