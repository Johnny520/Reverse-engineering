package p353xg;

import p068eh.AbstractC0921a;
import p249qg.AbstractC3603v;

/* JADX INFO: renamed from: xg.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5812i extends AbstractRunnableC5811h {

    /* JADX INFO: renamed from: i */
    public final Runnable f23590i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5812i(Runnable runnable, long j3, boolean z9) {
        super(j3, z9);
        this.f23590i = runnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f23590i.run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f23590i;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(AbstractC3603v.m7556j(runnable));
        sb2.append(", ");
        sb2.append(this.f23588g);
        sb2.append(", ");
        return AbstractC0921a.m2254q(sb2, this.f23589h ? "Blocking" : "Non-blocking", ']');
    }
}
