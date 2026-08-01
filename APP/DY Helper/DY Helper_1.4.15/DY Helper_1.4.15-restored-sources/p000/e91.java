package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class e91 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3447;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.viewpager.widget.PagerTabStrip f3448;

    public /* synthetic */ e91(androidx.viewpager.widget.PagerTabStrip r1, int r2) {
            r0 = this;
            r0.f3447 = r2
            r0.f3448 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r1) {
            r0 = this;
            int r1 = r0.f3447
            switch(r1) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            androidx.viewpager.widget.PagerTabStrip r0 = r0.f3448
            androidx.viewpager.widget.ViewPager r0 = r0.f1219
            int r1 = r0.getCurrentItem()
            int r1 = r1 + 1
            r0.setCurrentItem(r1)
            return
        L13:
            androidx.viewpager.widget.PagerTabStrip r0 = r0.f3448
            androidx.viewpager.widget.ViewPager r0 = r0.f1219
            int r1 = r0.getCurrentItem()
            int r1 = r1 + (-1)
            r0.setCurrentItem(r1)
            return
    }
}
