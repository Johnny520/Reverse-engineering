package p000;

/* JADX INFO: renamed from: mj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0487mj extends AbstractC0445le {

    /* JADX INFO: renamed from: c */
    public long f3149c;

    /* JADX INFO: renamed from: d */
    public boolean f3150d;

    /* JADX INFO: renamed from: e */
    public C0400k6 f3151e;

    /* JADX INFO: renamed from: f */
    public final void m1824f() {
        long j = this.f3149c - 4294967296L;
        this.f3149c = j;
        if (j <= 0 && this.f3150d) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract Thread mo1761j();

    /* JADX INFO: renamed from: k */
    public final void m1825k(boolean z) {
        this.f3149c = (z ? 4294967296L : 1L) + this.f3149c;
        if (z) {
            return;
        }
        this.f3150d = true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1826l() {
        C0400k6 c0400k6 = this.f3151e;
        if (c0400k6 == null) {
            return false;
        }
        AbstractC0892xg abstractC0892xg = (AbstractC0892xg) (c0400k6.isEmpty() ? null : c0400k6.removeFirst());
        if (abstractC0892xg == null) {
            return false;
        }
        abstractC0892xg.run();
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void mo1762m(long j, AbstractRunnableC0376jj abstractRunnableC0376jj) {
        RunnableC0446lf.f2999i.m1769r(j, abstractRunnableC0376jj);
    }

    public abstract void shutdown();
}
