package p057g;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: g.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0892b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f3167b;

    public /* synthetic */ RunnableC0892b(ActionBarOverlayLayout r1, int r2) {
        this.f3166a = r2;
        this.f3167b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f3166a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ActionBarOverlayLayout r02 = this.f3167b;
        r02.m1121h();
        r02.f1135t = r02.f1118c.animate().translationY(-r02.f1118c.getHeight()).setListener(r02.f1136u);
        return;
    L6:
        ActionBarOverlayLayout r03 = this.f3167b;
        r03.m1121h();
        r03.f1135t = r03.f1118c.animate().translationY(0.0f).setListener(r03.f1136u);
    }
}
