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
    public static final int[] f3697b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a */
    public MenuC2204lr f3698a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C2656w4 c2656w4M5186A = C2656w4.m5186A(context, attributeSet, f3697b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c2656w4M5186A.f9196b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c2656w4M5186A.m5210q(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c2656w4M5186A.m5210q(1));
        }
        c2656w4M5186A.m5195E();
    }

    @Override // p000.InterfaceC2161kr
    /* JADX INFO: renamed from: a */
    public final boolean mo2074a(C2427qr c2427qr) {
        return this.f3698a.m4436q(c2427qr, null, 0);
    }

    @Override // p000.InterfaceC0292Gr
    /* JADX INFO: renamed from: b */
    public final void mo591b(MenuC2204lr menuC2204lr) {
        this.f3698a = menuC2204lr;
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
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo2074a((C2427qr) getAdapter().getItem(i));
    }
}
