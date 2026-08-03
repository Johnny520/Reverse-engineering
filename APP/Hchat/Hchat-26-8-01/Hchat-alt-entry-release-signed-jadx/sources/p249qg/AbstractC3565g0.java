package p249qg;

import tf.C4164k;

/* JADX INFO: renamed from: qg.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3565g0 extends AbstractC3591p {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f11568l = 0;

    /* JADX INFO: renamed from: i */
    public long f11569i;

    /* JADX INFO: renamed from: j */
    public boolean f11570j;

    /* JADX INFO: renamed from: k */
    public C4164k f11571k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m7522A(AbstractC3550b0 abstractC3550b0) {
        C4164k c4164k = this.f11571k;
        if (c4164k == null) {
            c4164k = new C4164k();
            this.f11571k = c4164k;
        }
        c4164k.addLast(abstractC3550b0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m7523B(boolean z9) {
        this.f11569i = (z9 ? 4294967296L : 1L) + this.f11569i;
        if (z9) {
            return;
        }
        this.f11570j = true;
    }

    /* JADX INFO: renamed from: C */
    public abstract long mo7524C();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final boolean m7525D() {
        C4164k c4164k = this.f11571k;
        if (c4164k == null) {
            return false;
        }
        AbstractC3550b0 abstractC3550b0 = (AbstractC3550b0) (c4164k.isEmpty() ? null : c4164k.removeFirst());
        if (abstractC3550b0 == null) {
            return false;
        }
        abstractC3550b0.run();
        return true;
    }

    public abstract void shutdown();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m7526z(boolean z9) {
        long j3 = this.f11569i - (z9 ? 4294967296L : 1L);
        this.f11569i = j3;
        if (j3 <= 0 && this.f11570j) {
            shutdown();
        }
    }
}
