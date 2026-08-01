package androidx.appcompat.view.menu;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements defpackage.InterfaceC0705, defpackage.InterfaceC2132, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final int[] f27 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.MenuC1701 f28;

    static {
            r0 = 16842964(0x10100d4, float:2.3694152E-38)
            r1 = 16843049(0x1010129, float:2.369439E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.view.menu.ExpandedMenuView.f27 = r0
            return
    }

    public ExpandedMenuView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r2.setOnItemClickListener(r2)
            int[] r0 = androidx.appcompat.view.menu.ExpandedMenuView.f27
            r1 = 16842868(0x1010074, float:2.3693883E-38)
            ᛷᛸᛱᛸ r3 = defpackage.C1326.m2454(r3, r4, r0, r1)
            java.lang.Object r4 = r3.f5856
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = 0
            boolean r1 = r4.hasValue(r0)
            if (r1 == 0) goto L21
            android.graphics.drawable.Drawable r0 = r3.m2470(r0)
            r2.setBackgroundDrawable(r0)
        L21:
            r0 = 1
            boolean r4 = r4.hasValue(r0)
            if (r4 == 0) goto L2f
            android.graphics.drawable.Drawable r4 = r3.m2470(r0)
            r2.setDivider(r4)
        L2f:
            r3.m2469()
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
            ᛲᛲᛶᲁ r1 = (defpackage.C0254) r1
            r0.mo16(r1)
            return
    }

    @Override // defpackage.InterfaceC0705
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean mo16(defpackage.C0254 r3) {
            r2 = this;
            ᲀᛷᛱᲇ r2 = r2.f28
            r0 = 0
            r1 = 0
            boolean r2 = r2.m3085(r3, r1, r0)
            return r2
    }

    @Override // defpackage.InterfaceC2132
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void mo17(defpackage.MenuC1701 r1) {
            r0 = this;
            r0.f28 = r1
            return
    }
}
