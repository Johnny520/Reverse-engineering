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

/* JADX INFO: renamed from: tu */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0758tu implements r30, InterfaceC0164dv, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f4619a;

    /* JADX INFO: renamed from: m */
    public static int m2389m(ListAdapter listAdapter, Context context, int i) {
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

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: d */
    public final boolean mo951d(C0572ou c0572ou) {
        return false;
    }

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: g */
    public final boolean mo953g(C0572ou c0572ou) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo2142l(MenuC0424ku menuC0424ku);

    /* JADX INFO: renamed from: n */
    public abstract void mo2143n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo2144o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0311hu) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0311hu) listAdapter).f2306a.m1724q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC0736t8) ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo2145p(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo2146q(int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo2147r(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: s */
    public abstract void mo2148s(boolean z);

    /* JADX INFO: renamed from: t */
    public abstract void mo2149t(int i);

    @Override // p000.InterfaceC0164dv
    /* JADX INFO: renamed from: i */
    public final void mo955i(Context context, MenuC0424ku menuC0424ku) {
    }
}
