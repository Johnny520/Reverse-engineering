package yyds;

/* JADX INFO: renamed from: yyds.ᛳᛶᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0622 extends AbstractRunnableC2764 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Runnable f3013;

    public C0622(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f3013 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3013.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f3013;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC2408.m4457(runnable));
        sb.append(", ");
        sb.append(this.f13496);
        sb.append(", ");
        return AbstractC0897.m2000(sb, this.f13497 ? "Blocking" : "Non-blocking", ']');
    }
}
