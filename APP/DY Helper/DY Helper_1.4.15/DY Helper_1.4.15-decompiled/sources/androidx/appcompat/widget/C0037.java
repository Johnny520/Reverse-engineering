package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.κ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0037 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ androidx.appcompat.widget.ScrollingTabContainerView f853;

    public C0037(androidx.appcompat.widget.ScrollingTabContainerView r1) {
            r0 = this;
            r0.f853 = r1
            r0.<init>()
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r0 = this;
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r0.f853
            androidx.appcompat.widget.LinearLayoutCompat r0 = r0.f638
            int r0 = r0.getChildCount()
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r1) {
            r0 = this;
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r0.f853
            androidx.appcompat.widget.LinearLayoutCompat r0 = r0.f638
            android.view.View r0 = r0.getChildAt(r1)
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) r0
            r0.getClass()
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            long r0 = (long) r1
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            r3 = 0
            if (r2 != 0) goto L12
            r0.getItem(r1)
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r1 = new androidx.appcompat.widget.ScrollingTabContainerView$TabView
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r0.f853
            android.content.Context r2 = r0.getContext()
            r1.<init>(r0, r2)
            throw r3
        L12:
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r2 = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) r2
            r0.getItem(r1)
            throw r3
    }
}
