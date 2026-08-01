package p069i;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: i.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0668d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2271a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f2272b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0668d(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f2271a = i2;
        this.f2272b = actionBarOverlayLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2271a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2272b;
                actionBarOverlayLayout.m666h();
                actionBarOverlayLayout.f999x = actionBarOverlayLayout.f980e.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1000y);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2272b;
                actionBarOverlayLayout2.m666h();
                actionBarOverlayLayout2.f999x = actionBarOverlayLayout2.f980e.animate().translationY(-actionBarOverlayLayout2.f980e.getHeight()).setListener(actionBarOverlayLayout2.f1000y);
                break;
        }
    }
}
