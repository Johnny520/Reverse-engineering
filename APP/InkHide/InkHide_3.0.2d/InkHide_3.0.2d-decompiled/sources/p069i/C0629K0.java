package p069i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p068h.C0591j;
import p068h.C0596o;
import p068h.MenuC0594m;

/* JADX INFO: renamed from: i.K0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0629K0 extends C0717t0 {

    /* JADX INFO: renamed from: o */
    public final int f2162o;

    /* JADX INFO: renamed from: p */
    public final int f2163p;

    /* JADX INFO: renamed from: q */
    public InterfaceC0621G0 f2164q;

    /* JADX INFO: renamed from: r */
    public C0596o f2165r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0629K0(Context context, boolean z2) {
        super(context, z2);
        if (1 == AbstractC0627J0.m1234a(context.getResources().getConfiguration())) {
            this.f2162o = 21;
            this.f2163p = 22;
        } else {
            this.f2162o = 22;
            this.f2163p = 21;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.C0717t0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0591j c0591j;
        int headersCount;
        int iPointToPosition;
        int i2;
        if (this.f2164q != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c0591j = (C0591j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0591j = (C0591j) adapter;
                headersCount = 0;
            }
            C0596o c0596oM1181b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = iPointToPosition - headersCount) < 0 || i2 >= c0591j.getCount()) ? null : c0591j.getItem(i2);
            C0596o c0596o = this.f2165r;
            if (c0596o != c0596oM1181b) {
                MenuC0594m menuC0594m = c0591j.f2023b;
                if (c0596o != null) {
                    this.f2164q.mo149u(menuC0594m, c0596o);
                }
                this.f2165r = c0596oM1181b;
                if (c0596oM1181b != null) {
                    this.f2164q.mo147s(menuC0594m, c0596oM1181b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f2162o) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f2163p) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0591j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0591j) adapter).f2023b.m1184c(false);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHoverListener(InterfaceC0621G0 interfaceC0621G0) {
        this.f2164q = interfaceC0621G0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.C0717t0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
