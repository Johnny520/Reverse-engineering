package p000;

/* JADX INFO: renamed from: jA */
/* JADX INFO: loaded from: classes.dex */
public final class C2089jA extends AbstractRunnableC1532iA {

    /* JADX INFO: renamed from: c */
    public final Runnable f7357c;

    public C2089jA(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f7357c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7357c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f7357c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0148Dc.m278l(runnable));
        sb.append(", ");
        sb.append(this.f5414a);
        sb.append(", ");
        return AbstractC2374ph.m4815l(sb, this.f5415b ? "Blocking" : "Non-blocking", ']');
    }
}
