package p068h;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: h.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0602u implements InterfaceC0579D, InterfaceC0607z, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public Rect f2096b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static int m1202m(ListAdapter listAdapter, Context context, int i2) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m1203u(MenuC0594m menuC0594m) {
        int size = menuC0594m.f2035f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = menuC0594m.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: d */
    public final boolean mo1177d(C0596o c0596o) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: k */
    public final boolean mo1179k(C0596o c0596o) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo1152l(MenuC0594m menuC0594m);

    /* JADX INFO: renamed from: n */
    public abstract void mo1153n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo1154o(boolean z2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0591j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0591j) listAdapter).f2023b.m1190q((MenuItem) listAdapter.getItem(i2), this, !(this instanceof ViewOnKeyListenerC0588g) ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo1155p(int i2);

    /* JADX INFO: renamed from: q */
    public abstract void mo1156q(int i2);

    /* JADX INFO: renamed from: r */
    public abstract void mo1157r(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: s */
    public abstract void mo1158s(boolean z2);

    /* JADX INFO: renamed from: t */
    public abstract void mo1159t(int i2);

    @Override // p068h.InterfaceC0607z
    /* JADX INFO: renamed from: g */
    public final void mo1178g(Context context, MenuC0594m menuC0594m) {
    }
}
