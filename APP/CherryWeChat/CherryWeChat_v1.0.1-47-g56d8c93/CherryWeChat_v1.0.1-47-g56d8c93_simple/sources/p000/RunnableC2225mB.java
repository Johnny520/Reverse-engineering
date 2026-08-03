package p000;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: mB */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2225mB implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Toolbar f7743b;

    public /* synthetic */ RunnableC2225mB(Toolbar r1, int r2) {
        this.f7742a = r2;
        this.f7743b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f7742a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f7743b.m2109m();
        return;
    L6:
        C2354pB r0 = this.f7743b.f3815M;
        if (r0 != null) goto L9;
        C2427qr r02 = null;
    L10:
        if (r02 == null) goto L13;
        r02.collapseActionView();
        return;
    L13:
        return;
    L9:
        r02 = r0.f8238b;
        goto L10
    }
}
