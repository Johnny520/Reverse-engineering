package yyds;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: yyds.ᲁᲇᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2356 implements InterfaceC0911, InterfaceC0613, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Rect f11576;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static int m4379(ListAdapter listAdapter, Context context, int i) {
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

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C2309) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C2309) listAdapter).f11316.m1906((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC2374) ? 0 : 4);
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public abstract void mo1513(boolean z);

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public abstract void mo1514(View view);

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final boolean mo1502(C1148 c1148) {
        return false;
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public abstract void mo1516(int i);

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ */
    public abstract void mo1517(boolean z);

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ */
    public abstract void mo1518(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public abstract void mo1519(MenuC0836 menuC0836);

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final boolean mo1506(C1148 c1148) {
        return false;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ */
    public abstract void mo1520(int i);

    @Override // yyds.InterfaceC0613
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1507(Context context, MenuC0836 menuC0836) {
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ */
    public abstract void mo1521(int i);
}
