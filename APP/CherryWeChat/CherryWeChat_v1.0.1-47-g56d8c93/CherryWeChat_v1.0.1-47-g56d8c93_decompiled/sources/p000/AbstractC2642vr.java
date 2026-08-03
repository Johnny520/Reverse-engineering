package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: vr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2642vr implements InterfaceC2168ky, InterfaceC0163Dr, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f9155a;

    /* JADX INFO: renamed from: m */
    public static int m5176m(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
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

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: d */
    public final boolean mo215d(C2427qr c2427qr) {
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: f */
    public final boolean mo217f(C2427qr c2427qr) {
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: i */
    public final void mo220i(Context context, MenuC2204lr menuC2204lr) {
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo1945l(MenuC2204lr menuC2204lr);

    /* JADX INFO: renamed from: n */
    public abstract void mo1946n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo1947o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C2070ir) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C2070ir) listAdapter).f7324a.m4436q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC1125a7) ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo1948p(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo1949q(int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo1950r(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: s */
    public abstract void mo1951s(boolean z);

    /* JADX INFO: renamed from: t */
    public abstract void mo1952t(int i);
}
