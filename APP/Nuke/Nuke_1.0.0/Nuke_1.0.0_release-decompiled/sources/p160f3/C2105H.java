package p160f3;

/* JADX INFO: renamed from: f3.H */
/* JADX INFO: loaded from: classes.dex */
public final class C2105H extends AbstractRunnableC2106I {

    /* JADX INFO: renamed from: f */
    public final RunnableC2148m0 f7035f;

    public C2105H(long j5, RunnableC2148m0 runnableC2148m0) {
        super(j5);
        this.f7035f = runnableC2148m0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7035f.run();
    }

    @Override // p160f3.AbstractRunnableC2106I
    public final String toString() {
        return super.toString() + this.f7035f;
    }
}
