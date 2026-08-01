package p135b;

import p010B3.AbstractActivityC0224c;

/* JADX INFO: renamed from: b.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1814b implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6206d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractActivityC0224c f6207e;

    public /* synthetic */ RunnableC1814b(AbstractActivityC0224c abstractActivityC0224c, int i5) {
        this.f6206d = i5;
        this.f6207e = abstractActivityC0224c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6206d) {
            case 0:
                AbstractActivityC1823k.m3294d(this.f6207e);
                break;
            default:
                this.f6207e.invalidateMenu();
                break;
        }
    }
}
