package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: renamed from: iv */
/* JADX INFO: loaded from: classes.dex */
public final class C0351iv extends C0485mh {

    /* JADX INFO: renamed from: m */
    public final int f2607m;

    /* JADX INFO: renamed from: n */
    public final int f2608n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0831vu f2609o;

    /* JADX INFO: renamed from: p */
    public C0869wu f2610p;

    public C0351iv(Context context, boolean z) {
        super(context, z);
        if (1 == AbstractC0312hv.m1414a(context.getResources().getConfiguration())) {
            this.f2607m = 21;
            this.f2608n = 22;
        } else {
            this.f2607m = 22;
            this.f2608n = 21;
        }
    }

    @Override // p000.C0485mh, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0535nu c0535nu;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f2609o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c0535nu = (C0535nu) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0535nu = (C0535nu) adapter;
                headersCount = 0;
            }
            C0869wu c0869wuM1962b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c0535nu.getCount()) ? null : c0535nu.getItem(i);
            C0869wu c0869wu = this.f2610p;
            if (c0869wu != c0869wuM1962b) {
                MenuC0646qu menuC0646qu = c0535nu.f3348a;
                if (c0869wu != null) {
                    this.f2609o.mo1636p(menuC0646qu, c0869wu);
                }
                this.f2610p = c0869wuM1962b;
                if (c0869wuM1962b != null) {
                    this.f2609o.mo1637r(menuC0646qu, c0869wuM1962b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2607m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2608n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0535nu) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0535nu) adapter).f3348a.m2167c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0831vu interfaceC0831vu) {
        this.f2609o = interfaceC0831vu;
    }

    @Override // p000.C0485mh, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
