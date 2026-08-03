package p000;

/* JADX INFO: renamed from: ug */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2588ug extends AbstractC1217bc {

    /* JADX INFO: renamed from: b */
    public long f8957b;

    /* JADX INFO: renamed from: c */
    public boolean f8958c;

    /* JADX INFO: renamed from: d */
    public C0134D4 f8959d;

    /* JADX INFO: renamed from: A */
    public void mo1322A(long j, AbstractRunnableC2459rg abstractRunnableC2459rg) {
        RunnableC0664Pc.f2120h.m5030G(j, abstractRunnableC2459rg);
    }

    public abstract void shutdown();

    /* JADX INFO: renamed from: w */
    public final void m5095w() {
        long j = this.f8957b - 4294967296L;
        this.f8957b = j;
        if (j <= 0 && this.f8958c) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: x */
    public abstract Thread mo1325x();

    /* JADX INFO: renamed from: y */
    public final void m5096y(boolean z) {
        this.f8957b = (z ? 4294967296L : 1L) + this.f8957b;
        if (z) {
            return;
        }
        this.f8958c = true;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m5097z() {
        C0134D4 c0134d4 = this.f8959d;
        if (c0134d4 == null) {
            return false;
        }
        AbstractC1455ge abstractC1455ge = (AbstractC1455ge) (c0134d4.isEmpty() ? null : c0134d4.removeFirst());
        if (abstractC1455ge == null) {
            return false;
        }
        abstractC1455ge.run();
        return true;
    }
}
