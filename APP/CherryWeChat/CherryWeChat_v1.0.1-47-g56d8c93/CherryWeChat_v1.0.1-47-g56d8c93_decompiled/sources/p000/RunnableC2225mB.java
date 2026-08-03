package p000;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: mB */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2225mB implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Toolbar f7743b;

    public /* synthetic */ RunnableC2225mB(Toolbar toolbar, int i) {
        this.f7742a = i;
        this.f7743b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7742a) {
            case 0:
                C2354pB c2354pB = this.f7743b.f3815M;
                C2427qr c2427qr = c2354pB == null ? null : c2354pB.f8238b;
                if (c2427qr != null) {
                    c2427qr.collapseActionView();
                }
                break;
            default:
                this.f7743b.m2109m();
                break;
        }
    }
}
