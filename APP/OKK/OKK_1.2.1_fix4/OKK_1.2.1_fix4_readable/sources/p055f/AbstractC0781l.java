package p055f;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: f.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0781l implements InterfaceC0787r, InterfaceC0785p, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f2833a;

    /* JADX INFO: renamed from: m */
    public static int m2021m(ListAdapter listAdapter, Context context, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i4 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m2022u(MenuC0779j menuC0779j) {
        int size = menuC0779j.f2790f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = menuC0779j.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: c */
    public final boolean mo2023c(MenuItemC0780k menuItemC0780k) {
        return false;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: h */
    public final void mo2024h(Context context, MenuC0779j menuC0779j) {
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: i */
    public final boolean mo2025i(MenuItemC0780k menuItemC0780k) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo1984l(MenuC0779j menuC0779j);

    /* JADX INFO: renamed from: n */
    public abstract void mo1985n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo1986o(boolean z2);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0776g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0776g) listAdapter).f2778a.m2010p((MenuItem) listAdapter.getItem(i2), this, (this instanceof ViewOnKeyListenerC0775f) ^ true ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo1987p(int i2);

    /* JADX INFO: renamed from: q */
    public abstract void mo1988q(int i2);

    /* JADX INFO: renamed from: r */
    public abstract void mo1989r(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: s */
    public abstract void mo1990s(boolean z2);

    /* JADX INFO: renamed from: t */
    public abstract void mo1991t(int i2);
}
