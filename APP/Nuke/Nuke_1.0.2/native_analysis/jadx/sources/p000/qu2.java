package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qu2 implements pu2 {

    /* JADX INFO: renamed from: h */
    public final C0885xg f9176h = new C0885xg(0);

    /* JADX INFO: renamed from: e */
    public final boolean m4279e(int i) {
        return (this.f9176h.get() & i) != 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m4280f(int i) {
        C0885xg c0885xg;
        int i2;
        do {
            c0885xg = this.f9176h;
            i2 = c0885xg.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!c0885xg.compareAndSet(i2, i2 | i));
    }
}
