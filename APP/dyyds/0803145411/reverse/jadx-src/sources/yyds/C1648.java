package yyds;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: renamed from: yyds.ᛷᲁᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1648 extends C2045 {

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final int f8385;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public C1148 f8386;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public InterfaceC0541 f8387;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final int f8388;

    public C1648(Context context, boolean z) {
        super(context, z);
        if (1 == AbstractC2379.m4423(context.getResources().getConfiguration())) {
            this.f8385 = 21;
            this.f8388 = 22;
        } else {
            this.f8385 = 22;
            this.f8388 = 21;
        }
    }

    @Override // yyds.C2045, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C2309 c2309;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f8387 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c2309 = (C2309) headerViewListAdapter.getWrappedAdapter();
            } else {
                c2309 = (C2309) adapter;
                headersCount = 0;
            }
            C1148 c1148M4320 = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c2309.getCount()) ? null : c2309.getItem(i);
            C1148 c1148 = this.f8386;
            if (c1148 != c1148M4320) {
                MenuC0836 menuC0836 = c2309.f11316;
                if (c1148 != null) {
                    this.f8387.mo395(menuC0836, c1148);
                }
                this.f8386 = c1148M4320;
                if (c1148M4320 != null) {
                    this.f8387.mo390(menuC0836, c1148M4320);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f8385) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f8388) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C2309) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C2309) adapter).f11316.m1914(false);
        return true;
    }

    public void setHoverListener(InterfaceC0541 interfaceC0541) {
        this.f8387 = interfaceC0541;
    }

    @Override // yyds.C2045, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
