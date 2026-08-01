package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e41 implements d41 {

    /* JADX INFO: renamed from: d */
    public final C0238g9 f1296d = new C0238g9(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m782e(int i) {
        return (this.f1296d.get() & i) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m783f(int i) {
        C0238g9 c0238g9;
        int i2;
        do {
            c0238g9 = this.f1296d;
            i2 = c0238g9.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!c0238g9.compareAndSet(i2, i2 | i));
    }
}
