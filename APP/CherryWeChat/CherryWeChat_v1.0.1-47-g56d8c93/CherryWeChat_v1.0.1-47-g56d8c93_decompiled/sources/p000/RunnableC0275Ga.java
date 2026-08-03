package p000;

/* JADX INFO: renamed from: Ga */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0275Ga implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f892a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractActivityC2148ki f893b;

    public /* synthetic */ RunnableC0275Ga(AbstractActivityC2148ki abstractActivityC2148ki, int i) {
        this.f892a = i;
        this.f893b = abstractActivityC2148ki;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f892a) {
            case 0:
                this.f893b.invalidateMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!AbstractC0585Nj.m1134a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!AbstractC0585Nj.m1134a(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
