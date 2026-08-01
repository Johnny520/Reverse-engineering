package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class tu implements r30, dv, AdapterView.OnItemClickListener {
    public Rect a;

    public static int m(ListAdapter r10, Context r11, int r12) {
        int r0 = 0;
        int r1 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int r2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int r3 = r10.getCount();
        int r5 = 0;
        int r6 = 0;
        FrameLayout r7 = null;
        View r8 = null;
    L3:
        if (r0 >= r3) goto L15;
        int r9 = r10.getItemViewType(r0);
        if (r9 == r6) goto L7;
        r8 = null;
        r6 = r9;
    L7:
        if (r7 != null) goto L9;
        r7 = new FrameLayout(r11);
    L9:
        r8 = r10.getView(r0, r8, r7);
        r8.measure(r1, r2);
        int r92 = r8.getMeasuredWidth();
        if (r92 >= r12) goto L11;
        if (r92 <= r5) goto L14;
        r5 = r92;
    L14:
        r0 = r0 + 1;
        goto L3
    L11:
        return r12;
    L15:
        return r5;
    }

    @Override // defpackage.dv
    public final boolean d(ou r1) {
        return false;
    }

    @Override // defpackage.dv
    public final boolean g(ou r1) {
        return false;
    }

    public abstract void l(ku r1);

    public abstract void n(View r1);

    public abstract void o(boolean r1);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        ListAdapter r12 = (ListAdapter) r1.getAdapter();
        if ((r12 instanceof HeaderViewListAdapter) == false) goto L5;
        hu r22 = (hu) ((HeaderViewListAdapter) r12).getWrappedAdapter();
    L6:
        ku r23 = r22.a;
        MenuItem r13 = (MenuItem) r12.getItem(r3);
        if ((this instanceof t8) == true) goto L9;
        int r32 = 0;
    L10:
        r23.q(r13, this, r32);
        return;
    L9:
        r32 = 4;
        goto L10
    L5:
        r22 = (hu) r12;
        goto L6
    }

    public abstract void p(int r1);

    public abstract void q(int r1);

    public abstract void r(PopupWindow.OnDismissListener r1);

    public abstract void s(boolean r1);

    public abstract void t(int r1);

    @Override // defpackage.dv
    public final void i(Context r1, ku r2) {
    }
}
