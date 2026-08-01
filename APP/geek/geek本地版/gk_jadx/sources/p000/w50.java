package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w50 extends u50 {

    /* JADX INFO: renamed from: c */
    public final Runnable f4921c;

    public w50(Runnable runnable, long j, v50 v50Var) {
        super(j, v50Var);
        this.f4921c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4921c.run();
        } finally {
            this.f4669b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f4921c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0222ff.m1197s(runnable));
        sb.append(", ");
        sb.append(this.f4668a);
        sb.append(", ");
        sb.append(this.f4669b);
        sb.append(']');
        return sb.toString();
    }
}
