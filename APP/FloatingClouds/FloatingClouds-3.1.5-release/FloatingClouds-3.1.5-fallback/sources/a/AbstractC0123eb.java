package a;

/* JADX INFO: renamed from: a.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0123eb implements a.InterfaceC0108de, androidx.appcompat.view.menu.j, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.graphics.Rect f460a;

    public static int m(android.widget.ListAdapter r10, android.content.Context r11, int r12) {
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

    public static boolean u(androidx.appcompat.view.menu.f r5) {
            java.util.ArrayList<androidx.appcompat.view.menu.h> r0 = r5.f
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1f
            android.view.MenuItem r3 = r5.getItem(r2)
            boolean r4 = r3.isVisible()
            if (r4 == 0) goto L1c
            android.graphics.drawable.Drawable r3 = r3.getIcon()
            if (r3 == 0) goto L1c
            r5 = 1
            return r5
        L1c:
            int r2 = r2 + 1
            goto L8
        L1f:
            return r1
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c(androidx.appcompat.view.menu.h r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.j
    public final void e(android.content.Context r1, androidx.appcompat.view.menu.f r2) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i(androidx.appcompat.view.menu.h r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public abstract void l(androidx.appcompat.view.menu.f r1);

    public abstract void n(android.view.View r1);

    public abstract void o(boolean r1);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.Adapter r1 = r1.getAdapter()
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            boolean r2 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r2 == 0) goto L14
            r2 = r1
            android.widget.HeaderViewListAdapter r2 = (android.widget.HeaderViewListAdapter) r2
            android.widget.ListAdapter r2 = r2.getWrappedAdapter()
            androidx.appcompat.view.menu.e r2 = (androidx.appcompat.view.menu.e) r2
            goto L17
        L14:
            r2 = r1
            androidx.appcompat.view.menu.e r2 = (androidx.appcompat.view.menu.e) r2
        L17:
            androidx.appcompat.view.menu.f r2 = r2.f821a
            java.lang.Object r1 = r1.getItem(r3)
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            boolean r3 = r0 instanceof androidx.appcompat.view.menu.b
            if (r3 != 0) goto L25
            r3 = 0
            goto L26
        L25:
            r3 = 4
        L26:
            r2.q(r1, r0, r3)
            return
    }

    public abstract void p(int r1);

    public abstract void q(int r1);

    public abstract void r(android.widget.PopupWindow.OnDismissListener r1);

    public abstract void s(boolean r1);

    public abstract void t(int r1);
}
