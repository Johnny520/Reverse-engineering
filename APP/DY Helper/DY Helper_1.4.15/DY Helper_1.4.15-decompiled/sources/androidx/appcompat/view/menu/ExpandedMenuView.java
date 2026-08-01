package androidx.appcompat.view.menu;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements p000.hz0, p000.wz0, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ζ */
    public static final int[] f434 = null;

    /* JADX INFO: renamed from: ε */
    public p000.iz0 f435;

    static {
            r0 = 16842964(0x10100d4, float:2.3694152E-38)
            r1 = 16843049(0x1010129, float:2.369439E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.view.menu.ExpandedMenuView.f434 = r0
            return
    }

    public ExpandedMenuView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842868(0x1010074, float:2.3693883E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public ExpandedMenuView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3)
            r1.setOnItemClickListener(r1)
            int[] r0 = androidx.appcompat.view.menu.ExpandedMenuView.f434
            m6 r2 = p000.C0538m6.m3752(r2, r3, r0, r4)
            java.lang.Object r3 = r2.f6967
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 0
            boolean r0 = r3.hasValue(r4)
            if (r0 == 0) goto L1e
            android.graphics.drawable.Drawable r4 = r2.m3754(r4)
            r1.setBackgroundDrawable(r4)
        L1e:
            r4 = 1
            boolean r3 = r3.hasValue(r4)
            if (r3 == 0) goto L2c
            android.graphics.drawable.Drawable r3 = r2.m3754(r4)
            r1.setDivider(r3)
        L2c:
            r2.m3765()
            return
    }

    public int getWindowAnimations() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.setChildrenDrawingCacheEnabled(r0)
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.ListAdapter r1 = r0.getAdapter()
            java.lang.Object r1 = r1.getItem(r3)
            lz0 r1 = (p000.lz0) r1
            r0.mo237(r1)
            return
    }

    @Override // p000.hz0
    /* JADX INFO: renamed from: α */
    public final boolean mo237(p000.lz0 r3) {
            r2 = this;
            iz0 r2 = r2.f435
            r0 = 0
            r1 = 0
            boolean r2 = r2.m2837(r3, r1, r0)
            return r2
    }

    @Override // p000.wz0
    /* JADX INFO: renamed from: β */
    public final void mo238(p000.iz0 r1) {
            r0 = this;
            r0.f435 = r1
            return
    }
}
