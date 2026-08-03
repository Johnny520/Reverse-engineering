package p000;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: s0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2480s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f8715b;

    public /* synthetic */ RunnableC2480s0(ActionBarOverlayLayout r1, int r2) {
        this.f8714a = r2;
        this.f8715b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f8714a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ActionBarOverlayLayout r0 = this.f8715b;
        r0.m2085h();
        r0.f3772w = r0.f3753d.animate().translationY(-r0.f3753d.getHeight()).setListener(r0.f3773x);
        return;
    L6:
        ActionBarOverlayLayout r02 = this.f8715b;
        r02.m2085h();
        r02.f3772w = r02.f3753d.animate().translationY(0.0f).setListener(r02.f3773x);
    }
}
