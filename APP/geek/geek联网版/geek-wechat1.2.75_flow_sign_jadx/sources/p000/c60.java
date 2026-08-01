package p000;

/* JADX INFO: loaded from: classes.dex */
public final class c60 extends a60 {

    /* JADX INFO: renamed from: c */
    public final Runnable f821c;

    public c60(Runnable runnable, long j, b60 b60Var) {
        super(j, b60Var);
        this.f821c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f821c.run();
        } finally {
            this.f45b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f821c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0259gf.m1262x(runnable));
        sb.append(", ");
        sb.append(this.f44a);
        sb.append(", ");
        sb.append(this.f45b);
        sb.append(']');
        return sb.toString();
    }
}
