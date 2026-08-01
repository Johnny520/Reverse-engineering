package defpackage;

/* JADX INFO: renamed from: ᛶᲇᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1173 implements defpackage.InterfaceC2128, defpackage.InterfaceC0242, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.graphics.Rect f5294;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static int m2274(android.widget.ListAdapter r10, android.content.Context r11, int r12) {
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
            ᛸᛶᛶᲀ r2 = (defpackage.C1510) r2
            goto L17
        L14:
            r2 = r1
            ᛸᛶᛶᲀ r2 = (defpackage.C1510) r2
        L17:
            ᲀᛷᛱᲇ r2 = r2.f6674
            java.lang.Object r1 = r1.getItem(r3)
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            boolean r3 = r0 instanceof defpackage.ViewOnKeyListenerC1423
            if (r3 != 0) goto L25
            r3 = 0
            goto L26
        L25:
            r3 = 4
        L26:
            r2.m3085(r1, r0, r3)
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public abstract void mo2275(defpackage.MenuC1701 r1);

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public abstract void mo2276(int r1);

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public abstract void mo2277(int r1);

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final boolean mo850(defpackage.C0254 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public abstract void mo2278(android.view.View r1);

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo852(defpackage.C0254 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public abstract void mo2279(boolean r1);

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public abstract void mo2280(android.widget.PopupWindow.OnDismissListener r1);

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public abstract void mo2281(boolean r1);

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public abstract void mo2282(int r1);

    @Override // defpackage.InterfaceC0242
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final void mo856(android.content.Context r1, defpackage.MenuC1701 r2) {
            r0 = this;
            return
    }
}
