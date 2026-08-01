package defpackage;

/* JADX INFO: renamed from: ᛶᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1096 extends defpackage.C0398 {

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final int f4898;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public defpackage.InterfaceC1627 f4899;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public defpackage.C0254 f4900;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final int f4901;

    public C1096(android.content.Context r3, boolean r4) {
            r2 = this;
            r2.<init>(r3, r4)
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            r4 = 1
            int r3 = defpackage.AbstractC0291.m937(r3)
            r0 = 22
            r1 = 21
            if (r4 != r3) goto L1b
            r2.f4898 = r1
            r2.f4901 = r0
            return
        L1b:
            r2.f4898 = r0
            r2.f4901 = r1
            return
    }

    @Override // defpackage.C0398, android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r5) {
            r4 = this;
            ᲀᛲᛴᛳ r0 = r4.f4899
            if (r0 == 0) goto L5a
            android.widget.ListAdapter r0 = r4.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            if (r1 == 0) goto L19
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            int r1 = r0.getHeadersCount()
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            ᛸᛶᛶᲀ r0 = (defpackage.C1510) r0
            goto L1c
        L19:
            ᛸᛶᛶᲀ r0 = (defpackage.C1510) r0
            r1 = 0
        L1c:
            int r2 = r5.getAction()
            r3 = 10
            if (r2 == r3) goto L43
            float r2 = r5.getX()
            int r2 = (int) r2
            float r3 = r5.getY()
            int r3 = (int) r3
            int r2 = r4.pointToPosition(r2, r3)
            r3 = -1
            if (r2 == r3) goto L43
            int r2 = r2 - r1
            if (r2 < 0) goto L43
            int r1 = r0.getCount()
            if (r2 >= r1) goto L43
            ᛲᛲᛶᲁ r1 = r0.m2745(r2)
            goto L44
        L43:
            r1 = 0
        L44:
            ᛲᛲᛶᲁ r2 = r4.f4900
            if (r2 == r1) goto L5a
            ᲀᛷᛱᲇ r0 = r0.f6674
            if (r2 == 0) goto L51
            ᲀᛲᛴᛳ r3 = r4.f4899
            r3.mo2905(r0, r2)
        L51:
            r4.f4900 = r1
            if (r1 == 0) goto L5a
            ᲀᛲᛴᛳ r2 = r4.f4899
            r2.mo2894(r0, r1)
        L5a:
            boolean r4 = super.onHoverEvent(r5)
            return r4
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
            r4 = this;
            android.view.View r0 = r4.getSelectedView()
            androidx.appcompat.view.menu.ListMenuItemView r0 = (androidx.appcompat.view.menu.ListMenuItemView) r0
            r1 = 1
            if (r0 == 0) goto L29
            int r2 = r4.f4898
            if (r5 != r2) goto L29
            boolean r5 = r0.isEnabled()
            if (r5 == 0) goto L28
            ᛲᛲᛶᲁ r5 = r0.getItemData()
            boolean r5 = r5.hasSubMenu()
            if (r5 == 0) goto L28
            int r5 = r4.getSelectedItemPosition()
            long r2 = r4.getSelectedItemId()
            r4.performItemClick(r0, r5, r2)
        L28:
            return r1
        L29:
            if (r0 == 0) goto L4d
            int r0 = r4.f4901
            if (r5 != r0) goto L4d
            r5 = -1
            r4.setSelection(r5)
            android.widget.ListAdapter r4 = r4.getAdapter()
            boolean r5 = r4 instanceof android.widget.HeaderViewListAdapter
            if (r5 == 0) goto L44
            android.widget.HeaderViewListAdapter r4 = (android.widget.HeaderViewListAdapter) r4
            android.widget.ListAdapter r4 = r4.getWrappedAdapter()
            ᛸᛶᛶᲀ r4 = (defpackage.C1510) r4
            goto L46
        L44:
            ᛸᛶᛶᲀ r4 = (defpackage.C1510) r4
        L46:
            ᲀᛷᛱᲇ r4 = r4.f6674
            r5 = 0
            r4.m3082(r5)
            return r1
        L4d:
            boolean r4 = super.onKeyDown(r5, r6)
            return r4
    }

    public void setHoverListener(defpackage.InterfaceC1627 r1) {
            r0 = this;
            r0.f4899 = r1
            return
    }

    @Override // defpackage.C0398, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setSelector(r1)
            return
    }
}
