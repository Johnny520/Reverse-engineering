package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bu1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1843;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.TextView f1844;

    public /* synthetic */ bu1(android.widget.TextView r1, int r2) {
            r0 = this;
            r0.f1843 = r2
            r0.f1844 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f1843
            android.widget.TextView r2 = r2.f1844
            switch(r0) {
                case 0: goto L2e;
                case 1: goto Ld;
                default: goto L7;
            }
        L7:
            java.lang.String r0 = "正在刷新下载链接..."
            r2.setText(r0)
            return
        Ld:
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r2.scaleX(r0)
            android.view.ViewPropertyAnimator r2 = r2.scaleY(r0)
            r0 = 120(0x78, double:5.93E-322)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            android.view.ViewPropertyAnimator r2 = r2.setInterpolator(r0)
            r2.start()
            return
        L2e:
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r2.alpha(r0)
            r0 = 140(0x8c, double:6.9E-322)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            r2.start()
            return
    }
}
