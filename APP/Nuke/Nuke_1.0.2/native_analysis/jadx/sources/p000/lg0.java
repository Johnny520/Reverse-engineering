package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lg0 extends c20 {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f6106m = 0;

    /* JADX INFO: renamed from: j */
    public long f6107j;

    /* JADX INFO: renamed from: k */
    public boolean f6108k;

    /* JADX INFO: renamed from: l */
    public C0017ag f6109l;

    /* JADX INFO: renamed from: G */
    public final void m2904G(boolean z) {
        long j = this.f6107j - (z ? 4294967296L : 1L);
        this.f6107j = j;
        if (j <= 0 && this.f6108k) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m2905H(m90 m90Var) {
        C0017ag c0017ag = this.f6109l;
        if (c0017ag == null) {
            c0017ag = new C0017ag();
            this.f6109l = c0017ag;
        }
        c0017ag.addLast(m90Var);
    }

    /* JADX INFO: renamed from: I */
    public final void m2906I(boolean z) {
        this.f6107j = (z ? 4294967296L : 1L) + this.f6107j;
        if (z) {
            return;
        }
        this.f6108k = true;
    }

    /* JADX INFO: renamed from: J */
    public abstract long mo2907J();

    /* JADX INFO: renamed from: K */
    public final boolean m2908K() {
        C0017ag c0017ag = this.f6109l;
        if (c0017ag == null) {
            return false;
        }
        m90 m90Var = (m90) (c0017ag.isEmpty() ? null : c0017ag.removeFirst());
        if (m90Var == null) {
            return false;
        }
        m90Var.run();
        return true;
    }

    public abstract void shutdown();
}
