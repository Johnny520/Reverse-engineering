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
    public static int m5176m(ListAdapter r10, Context r11, int r12) {
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

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: d */
    public final boolean mo215d(C2427qr r1) {
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: f */
    public final boolean mo217f(C2427qr r1) {
        return false;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: i */
    public final void mo220i(Context r1, MenuC2204lr r2) {
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo1945l(MenuC2204lr r1);

    /* JADX INFO: renamed from: n */
    public abstract void mo1946n(View r1);

    /* JADX INFO: renamed from: o */
    public abstract void mo1947o(boolean r1);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        ListAdapter r12 = (ListAdapter) r1.getAdapter();
        if ((r12 instanceof HeaderViewListAdapter) == false) goto L5;
        C2070ir r22 = (C2070ir) ((HeaderViewListAdapter) r12).getWrappedAdapter();
    L6:
        MenuC2204lr r23 = r22.f7324a;
        MenuItem r13 = (MenuItem) r12.getItem(r3);
        if ((this instanceof ViewOnKeyListenerC1125a7) == true) goto L9;
        int r32 = 0;
    L10:
        r23.m4436q(r13, this, r32);
        return;
    L9:
        r32 = 4;
        goto L10
    L5:
        r22 = (C2070ir) r12;
        goto L6
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo1948p(int r1);

    /* JADX INFO: renamed from: q */
    public abstract void mo1949q(int r1);

    /* JADX INFO: renamed from: r */
    public abstract void mo1950r(PopupWindow.OnDismissListener r1);

    /* JADX INFO: renamed from: s */
    public abstract void mo1951s(boolean r1);

    /* JADX INFO: renamed from: t */
    public abstract void mo1952t(int r1);
}
