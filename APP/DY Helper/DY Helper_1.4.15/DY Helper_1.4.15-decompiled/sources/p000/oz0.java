package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class oz0 implements p000.ew1, p000.uz0, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ε */
    public android.graphics.Rect f8360;

    /* JADX INFO: renamed from: ν */
    public static int m4337(android.widget.ListAdapter r10, android.content.Context r11, int r12) {
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r3 = r10.getCount()
            r4 = 0
            r5 = r0
            r6 = r5
            r7 = r4
            r8 = r7
        L12:
            if (r0 >= r3) goto L37
            int r9 = r10.getItemViewType(r0)
            if (r9 == r6) goto L1c
            r8 = r4
            r6 = r9
        L1c:
            if (r7 != 0) goto L23
            android.widget.FrameLayout r7 = new android.widget.FrameLayout
            r7.<init>(r11)
        L23:
            android.view.View r8 = r10.getView(r0, r8, r7)
            r8.measure(r1, r2)
            int r9 = r8.getMeasuredWidth()
            if (r9 < r12) goto L31
            return r12
        L31:
            if (r9 <= r5) goto L34
            r5 = r9
        L34:
            int r0 = r0 + 1
            goto L12
        L37:
            return r5
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.Adapter r1 = r1.getAdapter()
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            boolean r2 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r2 == 0) goto L14
            r2 = r1
            android.widget.HeaderViewListAdapter r2 = (android.widget.HeaderViewListAdapter) r2
            android.widget.ListAdapter r2 = r2.getWrappedAdapter()
            fz0 r2 = (p000.fz0) r2
            goto L17
        L14:
            r2 = r1
            fz0 r2 = (p000.fz0) r2
        L17:
            iz0 r2 = r2.f4174
            java.lang.Object r1 = r1.getItem(r3)
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            boolean r3 = r0 instanceof p000.ViewOnKeyListenerC0393ie
            if (r3 != 0) goto L25
            r3 = 0
            goto L26
        L25:
            r3 = 4
        L26:
            r2.m2837(r1, r0, r3)
            return
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: γ */
    public final boolean mo322(p000.lz0 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: ζ */
    public final boolean mo325(p000.lz0 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.uz0
    /* JADX INFO: renamed from: ι */
    public final void mo328(android.content.Context r1, p000.iz0 r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: μ */
    public abstract void mo2745(p000.iz0 r1);

    /* JADX INFO: renamed from: ξ */
    public abstract void mo2746(android.view.View r1);

    /* JADX INFO: renamed from: ο */
    public abstract void mo2747(boolean r1);

    /* JADX INFO: renamed from: π */
    public abstract void mo2748(int r1);

    /* JADX INFO: renamed from: ρ */
    public abstract void mo2749(int r1);

    /* JADX INFO: renamed from: σ */
    public abstract void mo2750(android.widget.PopupWindow.OnDismissListener r1);

    /* JADX INFO: renamed from: τ */
    public abstract void mo2751(boolean r1);

    /* JADX INFO: renamed from: υ */
    public abstract void mo2752(int r1);
}
