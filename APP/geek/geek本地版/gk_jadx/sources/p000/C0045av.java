package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: renamed from: av */
/* JADX INFO: loaded from: classes.dex */
public final class C0045av extends C0411kh {

    /* JADX INFO: renamed from: m */
    public final int f684m;

    /* JADX INFO: renamed from: n */
    public final int f685n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0535nu f686o;

    /* JADX INFO: renamed from: p */
    public C0572ou f687p;

    public C0045av(Context context, boolean z) {
        super(context, z);
        if (1 == AbstractC0980zu.m2839a(context.getResources().getConfiguration())) {
            this.f684m = 21;
            this.f685n = 22;
        } else {
            this.f684m = 22;
            this.f685n = 21;
        }
    }

    @Override // p000.C0411kh, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0311hu c0311hu;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f686o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c0311hu = (C0311hu) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0311hu = (C0311hu) adapter;
                headersCount = 0;
            }
            C0572ou c0572ouM1375b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c0311hu.getCount()) ? null : c0311hu.getItem(i);
            C0572ou c0572ou = this.f687p;
            if (c0572ou != c0572ouM1375b) {
                MenuC0424ku menuC0424ku = c0311hu.f2306a;
                if (c0572ou != null) {
                    this.f686o.mo580p(menuC0424ku, c0572ou);
                }
                this.f687p = c0572ouM1375b;
                if (c0572ouM1375b != null) {
                    this.f686o.mo581r(menuC0424ku, c0572ouM1375b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f684m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f685n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0311hu) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0311hu) adapter).f2306a.m1718c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0535nu interfaceC0535nu) {
        this.f686o = interfaceC0535nu;
    }

    @Override // p000.C0411kh, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
