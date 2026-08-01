package p086r0;

/* JADX INFO: renamed from: r0.p0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0930p0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3313a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0842H0 f3314b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0930p0(C0842H0 c0842h0, int i2) {
        this.f3313a = i2;
        this.f3314b = c0842h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3313a) {
            case 0:
                this.f3314b.f2876u = false;
                break;
            default:
                C0842H0 c0842h0 = this.f3314b;
                c0842h0.f2876u = false;
                c0842h0.m1695o1();
                break;
        }
    }
}
