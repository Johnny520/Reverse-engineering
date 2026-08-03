package p057g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p055f.C0776g;
import p055f.MenuC0779j;
import p055f.MenuItemC0780k;

/* JADX INFO: renamed from: g.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0927s0 extends AbstractC0895c0 {

    /* JADX INFO: renamed from: m */
    public final int f3292m;

    /* JADX INFO: renamed from: n */
    public final int f3293n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0921p0 f3294o;

    /* JADX INFO: renamed from: p */
    public MenuItemC0780k f3295p;

    public C0927s0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f3292m = 21;
            this.f3293n = 22;
        } else {
            this.f3292m = 22;
            this.f3293n = 21;
        }
    }

    @Override // p057g.AbstractC0895c0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0776g c0776g;
        int headersCount;
        int iPointToPosition;
        int i2;
        if (this.f3294o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c0776g = (C0776g) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0776g = (C0776g) adapter;
                headersCount = 0;
            }
            MenuItemC0780k item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = iPointToPosition - headersCount) < 0 || i2 >= c0776g.getCount()) ? null : c0776g.getItem(i2);
            MenuItemC0780k menuItemC0780k = this.f3295p;
            if (menuItemC0780k != item) {
                MenuC0779j menuC0779j = c0776g.f2778a;
                if (menuItemC0780k != null) {
                    this.f3294o.mo349o(menuC0779j, menuItemC0780k);
                }
                this.f3295p = item;
                if (item != null) {
                    this.f3294o.mo353s(menuC0779j, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f3292m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f3293n) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0776g) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0776g) adapter).f2778a.m1997c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0921p0 interfaceC0921p0) {
        this.f3294o = interfaceC0921p0;
    }

    @Override // p057g.AbstractC0895c0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
