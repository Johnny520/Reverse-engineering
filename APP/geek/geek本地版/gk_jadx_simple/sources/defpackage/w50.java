package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w50 extends u50 {
    public final Runnable c;

    public w50(Runnable r1, long r2, v50 r4) {
        super(r2, r4);
        this.c = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();     // Catch: Throwable -> L5
        this.b.getClass();
        return;
    L5:
        th = move-exception;
        this.b.getClass();
        throw th;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Task[");
        Runnable r1 = this.c;
        r0.append(r1.getClass().getSimpleName());
        r0.append('@');
        r0.append(ff.s(r1));
        r0.append(", ");
        r0.append(this.a);
        r0.append(", ");
        r0.append(this.b);
        r0.append(']');
        return r0.toString();
    }
}
