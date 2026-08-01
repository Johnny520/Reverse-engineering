package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p206.C8627;
import p206.C8629;
import p206.MenuC8631;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1014 extends C1024 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC1028 f1018;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final int f1019;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int f1020;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C8629 f1021;

    public C1014(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f1020 = 21;
            this.f1019 = 22;
        } else {
            this.f1020 = 22;
            this.f1019 = 21;
        }
    }

    @Override // androidx.appcompat.widget.C1024, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C8627 c8627;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f1018 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c8627 = (C8627) headerViewListAdapter.getWrappedAdapter();
            } else {
                c8627 = (C8627) adapter;
                headersCount = 0;
            }
            C8629 c8629M13707 = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c8627.getCount()) ? null : c8627.getItem(i);
            C8629 c8629 = this.f1021;
            if (c8629 != c8629M13707) {
                MenuC8631 menuC8631 = c8627.f21557;
                if (c8629 != null) {
                    this.f1018.mo1186(menuC8631, c8629);
                }
                this.f1021 = c8629M13707;
                if (c8629M13707 != null) {
                    this.f1018.mo1184(menuC8631, c8629M13707);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f1020) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f1019) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C8627) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C8627) adapter).f21557.m13713(false);
        return true;
    }

    public void setHoverListener(InterfaceC1028 interfaceC1028) {
        this.f1018 = interfaceC1028;
    }

    @Override // androidx.appcompat.widget.C1024, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
