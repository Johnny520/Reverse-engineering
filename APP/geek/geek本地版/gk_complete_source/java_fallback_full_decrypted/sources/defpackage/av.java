package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class av extends defpackage.kh {
    public final int m;
    public final int n;
    public defpackage.nu o;
    public defpackage.ou p;

    public av(android.content.Context r3, boolean r4) {
            r2 = this;
            r2.<init>(r3, r4)
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            r4 = 1
            int r3 = defpackage.zu.a(r3)
            r0 = 22
            r1 = 21
            if (r4 != r3) goto L1b
            r2.m = r1
            r2.n = r0
            return
        L1b:
            r2.m = r0
            r2.n = r1
            return
    }

    @Override // defpackage.kh, android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent r5) {
            r4 = this;
            nu r0 = r4.o
            if (r0 == 0) goto L5a
            android.widget.ListAdapter r0 = r4.getAdapter()
            boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
            if (r1 == 0) goto L19
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            int r1 = r0.getHeadersCount()
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            hu r0 = (defpackage.hu) r0
            goto L1c
        L19:
            hu r0 = (defpackage.hu) r0
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
            ou r1 = r0.b(r2)
            goto L44
        L43:
            r1 = 0
        L44:
            ou r2 = r4.p
            if (r2 == r1) goto L5a
            ku r0 = r0.a
            if (r2 == 0) goto L51
            nu r3 = r4.o
            r3.p(r0, r2)
        L51:
            r4.p = r1
            if (r1 == 0) goto L5a
            nu r2 = r4.o
            r2.r(r0, r1)
        L5a:
            boolean r5 = super.onHoverEvent(r5)
            return r5
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
            r4 = this;
            android.view.View r0 = r4.getSelectedView()
            androidx.appcompat.view.menu.ListMenuItemView r0 = (androidx.appcompat.view.menu.ListMenuItemView) r0
            r1 = 1
            if (r0 == 0) goto L29
            int r2 = r4.m
            if (r5 != r2) goto L29
            boolean r5 = r0.isEnabled()
            if (r5 == 0) goto L28
            ou r5 = r0.getItemData()
            boolean r5 = r5.hasSubMenu()
            if (r5 == 0) goto L28
            int r5 = r4.getSelectedItemPosition()
            long r2 = r4.getSelectedItemId()
            r4.performItemClick(r0, r5, r2)
        L28:
            return r1
        L29:
            if (r0 == 0) goto L4d
            int r0 = r4.n
            if (r5 != r0) goto L4d
            r5 = -1
            r4.setSelection(r5)
            android.widget.ListAdapter r5 = r4.getAdapter()
            boolean r6 = r5 instanceof android.widget.HeaderViewListAdapter
            if (r6 == 0) goto L44
            android.widget.HeaderViewListAdapter r5 = (android.widget.HeaderViewListAdapter) r5
            android.widget.ListAdapter r5 = r5.getWrappedAdapter()
            hu r5 = (defpackage.hu) r5
            goto L46
        L44:
            hu r5 = (defpackage.hu) r5
        L46:
            ku r5 = r5.a
            r6 = 0
            r5.c(r6)
            return r1
        L4d:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
    }

    public void setHoverListener(defpackage.nu r1) {
            r0 = this;
            r0.o = r1
            return
    }

    @Override // defpackage.kh, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setSelector(r1)
            return
    }
}
