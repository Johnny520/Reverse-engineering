package p000;

/* JADX INFO: renamed from: Ga */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0275Ga implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f892a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractActivityC2148ki f893b;

    public /* synthetic */ RunnableC0275Ga(AbstractActivityC2148ki r1, int r2) {
        this.f892a = r2;
        this.f893b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f892a) {
            case 0: goto L17;
            default: goto L19;
        };
    L17:
        this.f893b.invalidateMenu();
        return;
    L19:
        AbstractActivityC0833Ta.access$onBackPressed$s1027565324(this.f893b);     // Catch: NullPointerException -> L7 IllegalStateException -> L12
    L21:
        return;
    L12:
        e = move-exception;
        if (AbstractC0585Nj.m1134a(e.getMessage(), "Can not perform this action after onSaveInstanceState") == false) goto L16;
        return;
    L16:
        throw e;
    L7:
        e = move-exception;
        if (AbstractC0585Nj.m1134a(e.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference") == true) goto L22;
        throw e;
    }
}
