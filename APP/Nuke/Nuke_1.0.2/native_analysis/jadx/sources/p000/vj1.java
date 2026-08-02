package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vj1 {

    /* JADX INFO: renamed from: h */
    public boolean f11990h;

    public vj1(boolean z) {
        this.f11990h = z;
    }

    /* JADX INFO: renamed from: d */
    public final void m5707d() {
        if (!this.f11990h) {
            throw new x70(null, "immutable instance");
        }
    }
}
