package p190;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7794 implements InterfaceC7777, InterfaceC7790, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Rect f21202;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m13147(ListAdapter listAdapter, Context context, int i) {
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
        (listAdapter instanceof HeaderViewListAdapter ? (C7798) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C7798) listAdapter).f21212.m13162((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC7781) ? 0 : 4);
    }

    public abstract void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener);

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo610(C7800 c7800) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract void mo13133(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract void mo13134(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract void mo13135(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public abstract void mo13136(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public abstract void mo13137(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract void mo13138(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract void mo13139(MenuC7802 menuC7802);

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo615(C7800 c7800) {
        return false;
    }

    @Override // p190.InterfaceC7790
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo611(Context context, MenuC7802 menuC7802) {
    }
}
