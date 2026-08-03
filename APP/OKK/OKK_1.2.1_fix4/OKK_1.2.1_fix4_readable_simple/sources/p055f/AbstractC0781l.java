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
    public static int m2021m(ListAdapter r10, Context r11, int r12) {
        int r02 = 0;
        int r1 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int r2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int r3 = r10.getCount();
        int r5 = 0;
        int r6 = 0;
        FrameLayout r7 = null;
        View r8 = null;
    L3:
        if (r02 >= r3) goto L15;
        int r9 = r10.getItemViewType(r02);
        if (r9 == r6) goto L7;
        r8 = null;
        r6 = r9;
    L7:
        if (r7 != null) goto L9;
        r7 = new FrameLayout(r11);
    L9:
        r8 = r10.getView(r02, r8, r7);
        r8.measure(r1, r2);
        int r92 = r8.getMeasuredWidth();
        if (r92 >= r12) goto L11;
        if (r92 <= r5) goto L14;
        r5 = r92;
    L14:
        r02 = r02 + 1;
        goto L3
    L11:
        return r12;
    L15:
        return r5;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m2022u(MenuC0779j r5) {
        int r02 = r5.f2790f.size();
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L15;
        MenuItem r3 = r5.getItem(r2);
        if (r3.isVisible() == false) goto L9;
        if (r3.getIcon() == null) goto L9;
        return true;
    L9:
        r2 = r2 + 1;
        goto L3
    L15:
        return false;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: c */
    public final boolean mo2023c(MenuItemC0780k r1) {
        return false;
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: h */
    public final void mo2024h(Context r1, MenuC0779j r2) {
    }

    @Override // p055f.InterfaceC0785p
    /* JADX INFO: renamed from: i */
    public final boolean mo2025i(MenuItemC0780k r1) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo1984l(MenuC0779j r1);

    /* JADX INFO: renamed from: n */
    public abstract void mo1985n(View r1);

    /* JADX INFO: renamed from: o */
    public abstract void mo1986o(boolean r1);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        ListAdapter r12 = (ListAdapter) r1.getAdapter();
        if ((r12 instanceof HeaderViewListAdapter) == false) goto L5;
        C0776g r22 = (C0776g) ((HeaderViewListAdapter) r12).getWrappedAdapter();
    L6:
        MenuC0779j r23 = r22.f2778a;
        MenuItem r13 = (MenuItem) r12.getItem(r3);
        if ((!(this instanceof ViewOnKeyListenerC0775f)) == false) goto L9;
        int r32 = 0;
    L10:
        r23.m2010p(r13, this, r32);
        return;
    L9:
        r32 = 4;
        goto L10
    L5:
        r22 = (C0776g) r12;
        goto L6
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo1987p(int r1);

    /* JADX INFO: renamed from: q */
    public abstract void mo1988q(int r1);

    /* JADX INFO: renamed from: r */
    public abstract void mo1989r(PopupWindow.OnDismissListener r1);

    /* JADX INFO: renamed from: s */
    public abstract void mo1990s(boolean r1);

    /* JADX INFO: renamed from: t */
    public abstract void mo1991t(int r1);
}
