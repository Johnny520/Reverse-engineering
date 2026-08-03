package p000;

/* JADX INFO: renamed from: f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1398f8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4960a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0693Q4 f4961b;

    public /* synthetic */ RunnableC1398f8(C0693Q4 r1, int r2) {
        this.f4960a = r2;
        this.f4961b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f4960a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f4961b.mo6a();
        return;
    L6:
        this.f4961b.mo6a();
    }
}
