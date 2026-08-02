package p000;

/* JADX INFO: renamed from: qv */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0633qv implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9177h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractActivityC0144dw f9178i;

    public /* synthetic */ RunnableC0633qv(AbstractActivityC0144dw abstractActivityC0144dw, int i) {
        this.f9177h = i;
        this.f9178i = abstractActivityC0144dw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9177h;
        AbstractActivityC0144dw abstractActivityC0144dw = this.f9178i;
        switch (i) {
            case 0:
                AbstractActivityC0144dw.m1203d(abstractActivityC0144dw);
                break;
            default:
                abstractActivityC0144dw.invalidateMenu();
                break;
        }
    }
}
