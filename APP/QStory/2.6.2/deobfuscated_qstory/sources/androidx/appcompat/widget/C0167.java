package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p190.C7797;
import p190.C7799;
import p190.MenuC7801;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0167 extends C0177 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC0181 f673;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int f674;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int f675;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C7799 f676;

    public C0167(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f675 = 21;
            this.f674 = 22;
        } else {
            this.f675 = 22;
            this.f674 = 21;
        }
    }

    @Override // androidx.appcompat.widget.C0177, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C7797 c7797;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f673 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c7797 = (C7797) headerViewListAdapter.getWrappedAdapter();
            } else {
                c7797 = (C7797) adapter;
                headersCount = 0;
            }
            C7799 c7799M13120 = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c7797.getCount()) ? null : c7797.getItem(i);
            C7799 c7799 = this.f676;
            if (c7799 != c7799M13120) {
                MenuC7801 menuC7801 = c7797.f21215;
                if (c7799 != null) {
                    this.f673.mo625(menuC7801, c7799);
                }
                this.f676 = c7799M13120;
                if (c7799M13120 != null) {
                    this.f673.mo623(menuC7801, c7799M13120);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f675) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f674) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C7797) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C7797) adapter).f21215.m13126(false);
        return true;
    }

    public void setHoverListener(InterfaceC0181 interfaceC0181) {
        this.f673 = interfaceC0181;
    }

    @Override // androidx.appcompat.widget.C0177, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
