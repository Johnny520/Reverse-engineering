package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000.C0572ou;
import p000.C0659r5;
import p000.InterfaceC0238fv;
import p000.InterfaceC0387ju;
import p000.MenuC0424ku;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0387ju, InterfaceC0238fv, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public static final int[] f205b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a */
    public MenuC0424ku f206a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0659r5 c0659r5M2219y = C0659r5.m2219y(context, attributeSet, f205b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c0659r5M2219y.f4209b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0659r5M2219y.m2234m(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0659r5M2219y.m2234m(1));
        }
        c0659r5M2219y.m2245z();
    }

    @Override // p000.InterfaceC0387ju
    /* JADX INFO: renamed from: a */
    public final boolean mo137a(C0572ou c0572ou) {
        return this.f206a.m1724q(c0572ou, null, 0);
    }

    @Override // p000.InterfaceC0238fv
    /* JADX INFO: renamed from: b */
    public final void mo138b(MenuC0424ku menuC0424ku) {
        this.f206a = menuC0424ku;
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
        mo137a((C0572ou) getAdapter().getItem(i));
    }
}
