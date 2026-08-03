package p000;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: s0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2480s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f8715b;

    public /* synthetic */ RunnableC2480s0(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f8714a = i;
        this.f8715b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8714a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f8715b;
                actionBarOverlayLayout.m2085h();
                actionBarOverlayLayout.f3772w = actionBarOverlayLayout.f3753d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f3773x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8715b;
                actionBarOverlayLayout2.m2085h();
                actionBarOverlayLayout2.f3772w = actionBarOverlayLayout2.f3753d.animate().translationY(-actionBarOverlayLayout2.f3753d.getHeight()).setListener(actionBarOverlayLayout2.f3773x);
                break;
        }
    }
}
