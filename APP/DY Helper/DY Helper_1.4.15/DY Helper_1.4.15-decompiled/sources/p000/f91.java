package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class f91 extends android.database.DataSetObserver implements p000.v92 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ androidx.viewpager.widget.PagerTitleStrip f3832;

    public f91(androidx.viewpager.widget.PagerTitleStrip r1) {
            r0 = this;
            r0.f3832 = r1
            r0.<init>()
            return
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
            r3 = this;
            androidx.viewpager.widget.PagerTitleStrip r3 = r3.f3832
            androidx.viewpager.widget.ViewPager r0 = r3.f1219
            int r0 = r0.getCurrentItem()
            androidx.viewpager.widget.ViewPager r1 = r3.f1219
            r1.getAdapter()
            r3.m555(r0)
            float r0 = r3.f1224
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            androidx.viewpager.widget.ViewPager r1 = r3.f1219
            int r1 = r1.getCurrentItem()
            r2 = 1
            r3.mo553(r1, r0, r2)
            return
    }
}
