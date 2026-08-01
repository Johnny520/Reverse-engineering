package p000;

/* JADX INFO: renamed from: at */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0030at extends AbstractC0692rk {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f260i = 0;

    /* JADX INFO: renamed from: f */
    public long f261f;

    /* JADX INFO: renamed from: g */
    public boolean f262g;

    /* JADX INFO: renamed from: h */
    public C0917x8 f263h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m201j(boolean z) {
        long j = this.f261f - (z ? 4294967296L : 1L);
        this.f261f = j;
        if (j <= 0 && this.f262g) {
            shutdown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m202k(AbstractC0253go abstractC0253go) {
        C0917x8 c0917x8 = this.f263h;
        if (c0917x8 == null) {
            c0917x8 = new C0917x8();
            this.f263h = c0917x8;
        }
        c0917x8.addLast(abstractC0253go);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m203m(boolean z) {
        this.f261f = (z ? 4294967296L : 1L) + this.f261f;
        if (z) {
            return;
        }
        this.f262g = true;
    }

    /* JADX INFO: renamed from: q */
    public abstract long mo204q();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final boolean m205s() {
        C0917x8 c0917x8 = this.f263h;
        if (c0917x8 == null) {
            return false;
        }
        AbstractC0253go abstractC0253go = (AbstractC0253go) (c0917x8.isEmpty() ? null : c0917x8.removeFirst());
        if (abstractC0253go == null) {
            return false;
        }
        abstractC0253go.run();
        return true;
    }

    public abstract void shutdown();
}
