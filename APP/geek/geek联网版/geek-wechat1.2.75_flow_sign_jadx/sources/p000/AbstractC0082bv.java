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

/* JADX INFO: renamed from: bv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0082bv implements y30, InterfaceC0462lv, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f782a;

    /* JADX INFO: renamed from: m */
    public static int m529m(ListAdapter listAdapter, Context context, int i) {
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

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: d */
    public final boolean mo530d(C0869wu c0869wu) {
        return false;
    }

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: g */
    public final boolean mo531g(C0869wu c0869wu) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo533l(MenuC0646qu menuC0646qu);

    /* JADX INFO: renamed from: n */
    public abstract void mo534n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo535o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0535nu) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0535nu) listAdapter).f3348a.m2173q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC0179e9) ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo536p(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo537q(int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo538r(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: s */
    public abstract void mo539s(boolean z);

    /* JADX INFO: renamed from: t */
    public abstract void mo540t(int i);

    @Override // p000.InterfaceC0462lv
    /* JADX INFO: renamed from: i */
    public final void mo532i(Context context, MenuC0646qu menuC0646qu) {
    }
}
