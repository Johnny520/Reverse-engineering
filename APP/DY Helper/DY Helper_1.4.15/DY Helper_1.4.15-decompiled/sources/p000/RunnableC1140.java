package p000;

/* JADX INFO: renamed from: ｊ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1140 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13487;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f13488;

    public /* synthetic */ RunnableC1140(androidx.appcompat.widget.ActionBarOverlayLayout r1, int r2) {
            r0 = this;
            r0.f13487 = r2
            r0.f13488 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f13487
            switch(r0) {
                case 0: goto L25;
                default: goto L5;
            }
        L5:
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r2.f13488
            r2.m255()
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f500
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.appcompat.widget.ActionBarContainer r1 = r2.f500
            int r1 = r1.getHeight()
            int r1 = -r1
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            ｉ r1 = r2.f492
            android.view.ViewPropertyAnimator r0 = r0.setListener(r1)
            r2.f491 = r0
            return
        L25:
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r2.f13488
            r2.m255()
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f500
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            ｉ r1 = r2.f492
            android.view.ViewPropertyAnimator r0 = r0.setListener(r1)
            r2.f491 = r0
            return
    }
}
