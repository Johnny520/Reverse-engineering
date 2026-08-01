package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000.C0658r5;
import p000.C0869wu;
import p000.InterfaceC0536nv;
import p000.InterfaceC0609pu;
import p000.MenuC0646qu;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0609pu, InterfaceC0536nv, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public static final int[] f168b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a */
    public MenuC0646qu f169a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0658r5 c0658r5M2226y = C0658r5.m2226y(context, attributeSet, f168b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c0658r5M2226y.f4064b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0658r5M2226y.m2241m(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0658r5M2226y.m2241m(1));
        }
        c0658r5M2226y.m2252z();
    }

    @Override // p000.InterfaceC0609pu
    /* JADX INFO: renamed from: a */
    public final boolean mo122a(C0869wu c0869wu) {
        return this.f169a.m2173q(c0869wu, null, 0);
    }

    @Override // p000.InterfaceC0536nv
    /* JADX INFO: renamed from: b */
    public final void mo123b(MenuC0646qu menuC0646qu) {
        this.f169a = menuC0646qu;
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
        mo122a((C0869wu) getAdapter().getItem(i));
    }
}
