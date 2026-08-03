package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0998f;
import p000a.C0751of;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0998f.b, InterfaceC1003k, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public static final int[] f3705b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a */
    public C0998f f3706a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0751of c0751ofM1768e = C0751of.m1768e(context, attributeSet, f3705b, R.attr.listViewStyle);
        TypedArray typedArray = c0751ofM1768e.f2960b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0751ofM1768e.m1770b(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0751ofM1768e.m1770b(1));
        }
        c0751ofM1768e.m1773f();
    }

    @Override // androidx.appcompat.view.menu.C0998f.b
    /* JADX INFO: renamed from: a */
    public final boolean mo2304a(C1000h c1000h) {
        return this.f3706a.m2332q(c1000h, null, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1003k
    /* JADX INFO: renamed from: c */
    public final void mo2305c(C0998f c0998f) {
        this.f3706a = c0998f;
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
        mo2304a((C1000h) getAdapter().getItem(i));
    }
}
