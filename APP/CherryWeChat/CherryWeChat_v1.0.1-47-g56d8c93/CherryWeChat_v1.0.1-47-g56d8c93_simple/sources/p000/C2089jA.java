package p000;

/* JADX INFO: renamed from: jA */
/* JADX INFO: loaded from: classes.dex */
public final class C2089jA extends AbstractRunnableC1532iA {

    /* JADX INFO: renamed from: c */
    public final Runnable f7357c;

    public C2089jA(Runnable r1, long r2, boolean r4) {
        super(r2, r4);
        this.f7357c = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7357c.run();
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Task[");
        Runnable r1 = this.f7357c;
        r0.append(r1.getClass().getSimpleName());
        r0.append('@');
        r0.append(AbstractC0148Dc.m278l(r1));
        r0.append(", ");
        r0.append(this.f5414a);
        r0.append(", ");
        if (this.f5415b == false) goto L5;
        String r12 = "Blocking";
    L7:
        return AbstractC2374ph.m4815l(r0, r12, ']');
    L5:
        r12 = "Non-blocking";
        goto L7
    }
}
