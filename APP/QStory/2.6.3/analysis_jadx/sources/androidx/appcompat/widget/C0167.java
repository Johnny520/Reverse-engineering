package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p190.C7798;
import p190.C7800;
import p190.MenuC7802;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0167 extends C0177 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC0181 f673;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int f674;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int f675;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C7800 f676;

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
        C7798 c7798;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f673 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c7798 = (C7798) headerViewListAdapter.getWrappedAdapter();
            } else {
                c7798 = (C7798) adapter;
                headersCount = 0;
            }
            C7800 c7800M13148 = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c7798.getCount()) ? null : c7798.getItem(i);
            C7800 c7800 = this.f676;
            if (c7800 != c7800M13148) {
                MenuC7802 menuC7802 = c7798.f21212;
                if (c7800 != null) {
                    this.f673.mo626(menuC7802, c7800);
                }
                this.f676 = c7800M13148;
                if (c7800M13148 != null) {
                    this.f673.mo624(menuC7802, c7800M13148);
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
        (adapter instanceof HeaderViewListAdapter ? (C7798) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C7798) adapter).f21212.m13154(false);
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
