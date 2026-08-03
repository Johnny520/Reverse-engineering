package p000a;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0997e;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.C1000h;
import androidx.appcompat.view.menu.InterfaceC1002j;
import androidx.appcompat.view.menu.ViewOnKeyListenerC0994b;

/* JADX INFO: renamed from: a.eb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0557eb implements InterfaceC0541de, InterfaceC1002j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f2101a;

    /* JADX INFO: renamed from: m */
    public static int m1394m(ListAdapter listAdapter, Context context, int i) {
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

    /* JADX INFO: renamed from: u */
    public static boolean m1395u(C0998f c0998f) {
        int size = c0998f.f3789f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0998f.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: c */
    public final boolean mo1396c(C1000h c1000h) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: e */
    public final void mo1397e(Context context, C0998f c0998f) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1002j
    /* JADX INFO: renamed from: i */
    public final boolean mo1398i(C1000h c1000h) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo1399l(C0998f c0998f);

    /* JADX INFO: renamed from: n */
    public abstract void mo1400n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo1401o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0997e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0997e) listAdapter).f3777a.m2332q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC0994b) ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo1402p(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo1403q(int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo1404r(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: s */
    public abstract void mo1405s(boolean z);

    /* JADX INFO: renamed from: t */
    public abstract void mo1406t(int i);
}
