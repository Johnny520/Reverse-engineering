package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000.C2427qr;
import p000.C2656w4;
import p000.InterfaceC0292Gr;
import p000.InterfaceC2161kr;
import p000.MenuC2204lr;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC2161kr, InterfaceC0292Gr, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public static final int[] f3697b = null;

    /* JADX INFO: renamed from: a */
    public MenuC2204lr f3698a;

    static {
        f3697b = new int[]{R.attr.background, R.attr.divider};
    }

    public ExpandedMenuView(Context r3, AttributeSet r4) {
        super(r3, r4);
        setOnItemClickListener(this);
        C2656w4 r32 = C2656w4.m5186A(r3, r4, f3697b, R.attr.listViewStyle);
        TypedArray r42 = (TypedArray) r32.f9196b;
        if (r42.hasValue(0) == false) goto L6;
        setBackgroundDrawable(r32.m5210q(0));
    L6:
        if (r42.hasValue(1) == false) goto L8;
        setDivider(r32.m5210q(1));
    L8:
        r32.m5195E();
    }

    @Override // p000.InterfaceC2161kr
    /* JADX INFO: renamed from: a */
    public final boolean mo2074a(C2427qr r4) {
        return this.f3698a.m4436q(r4, null, 0);
    }

    @Override // p000.InterfaceC0292Gr
    /* JADX INFO: renamed from: b */
    public final void mo591b(MenuC2204lr r1) {
        this.f3698a = r1;
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
        mo2074a((C2427qr) getAdapter().getItem(r3));
    }
}
