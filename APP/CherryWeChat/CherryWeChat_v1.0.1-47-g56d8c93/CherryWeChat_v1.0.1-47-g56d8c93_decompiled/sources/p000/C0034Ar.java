package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: renamed from: Ar */
/* JADX INFO: loaded from: classes.dex */
public final class C0034Ar extends C0365Ie {

    /* JADX INFO: renamed from: m */
    public final int f72m;

    /* JADX INFO: renamed from: n */
    public final int f73n;

    /* JADX INFO: renamed from: o */
    public InterfaceC2384pr f74o;

    /* JADX INFO: renamed from: p */
    public C2427qr f75p;

    public C0034Ar(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f72m = 21;
            this.f73n = 22;
        } else {
            this.f72m = 22;
            this.f73n = 21;
        }
    }

    @Override // p000.C0365Ie, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C2070ir c2070ir;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f74o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c2070ir = (C2070ir) headerViewListAdapter.getWrappedAdapter();
            } else {
                c2070ir = (C2070ir) adapter;
                headersCount = 0;
            }
            C2427qr c2427qrM4240b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c2070ir.getCount()) ? null : c2070ir.getItem(i);
            C2427qr c2427qr = this.f75p;
            if (c2427qr != c2427qrM4240b) {
                MenuC2204lr menuC2204lr = c2070ir.f7324a;
                if (c2427qr != null) {
                    this.f74o.mo128e(menuC2204lr, c2427qr);
                }
                this.f75p = c2427qrM4240b;
                if (c2427qrM4240b != null) {
                    this.f74o.mo129i(menuC2204lr, c2427qrM4240b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f72m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f73n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C2070ir) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C2070ir) adapter).f7324a.m4430c(false);
        return true;
    }

    public void setHoverListener(InterfaceC2384pr interfaceC2384pr) {
        this.f74o = interfaceC2384pr;
    }

    @Override // p000.C0365Ie, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
