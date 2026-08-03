package p057g;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: g.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0892b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f3167b;

    public /* synthetic */ RunnableC0892b(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f3166a = i2;
        this.f3167b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3166a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3167b;
                actionBarOverlayLayout.m1121h();
                actionBarOverlayLayout.f1135t = actionBarOverlayLayout.f1118c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1136u);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3167b;
                actionBarOverlayLayout2.m1121h();
                actionBarOverlayLayout2.f1135t = actionBarOverlayLayout2.f1118c.animate().translationY(-actionBarOverlayLayout2.f1118c.getHeight()).setListener(actionBarOverlayLayout2.f1136u);
                break;
        }
    }
}
