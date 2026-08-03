package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p018J0.C0234d;
import p055f.InterfaceC0778i;
import p055f.MenuItemC0780k;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0778i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public static final int[] f1074a = null;

    static {
        f1074a = new int[]{R.attr.background, R.attr.divider};
    }

    public ExpandedMenuView(Context r4, AttributeSet r5) {
        super(r4, r5);
        setOnItemClickListener(this);
        C0234d r42 = C0234d.m638s(r4, r5, f1074a, R.attr.listViewStyle, 0);
        TypedArray r52 = (TypedArray) r42.f475c;
        if (r52.hasValue(0) == false) goto L6;
        setBackgroundDrawable(r42.m646i(0));
    L6:
        if (r52.hasValue(1) == false) goto L8;
        setDivider(r42.m646i(1));
    L8:
        r42.m657u();
    }

    @Override // p055f.InterfaceC0778i
    /* JADX INFO: renamed from: a */
    public final boolean mo1116a(MenuItemC0780k r1) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        MenuItemC0780k r12 = (MenuItemC0780k) getAdapter().getItem(r3);
        throw null;
    }
}
