package Yue;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C8693;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8697;
import androidx.appcompat.view.menu.InterfaceC8699;
import androidx.appcompat.view.menu.InterfaceC8700;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6162 implements InterfaceC7462, InterfaceC8699, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Rect f15071;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m19012(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static boolean m19013(C8694 c8694) {
        int size = c8694.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c8694.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static C8693 m19014(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C8693) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C8693) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean collapseItemActionView(C8694 c8694, C8697 c8697) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public boolean expandItemActionView(C8694 c8694, C8697 c8697) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public InterfaceC8700 getMenuView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8699
    public void initForMenu(@InterfaceC6391 Context context, @InterfaceC6490 C8694 c8694) {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m19014(listAdapter).f26023.performItemAction((MenuItem) listAdapter.getItem(i), this, mo19015() ? 0 : 4);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract void mo2665(C8694 c8694);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo19015() {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Rect m19016() {
        return this.f15071;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract void mo19017(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m19018(Rect rect) {
        this.f15071 = rect;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract void mo19019(boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public abstract void mo19020(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public abstract void mo19021(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public abstract void mo19022(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public abstract void mo19023(boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public abstract void mo19024(int i);
}
