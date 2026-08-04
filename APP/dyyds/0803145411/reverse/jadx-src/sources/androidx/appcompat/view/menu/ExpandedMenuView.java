package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import yyds.C0644;
import yyds.C1148;
import yyds.InterfaceC0665;
import yyds.InterfaceC1632;
import yyds.MenuC0836;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1632, InterfaceC0665, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final int[] f57 = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public MenuC0836 f58;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0644 c0644M1535 = C0644.m1535(context, attributeSet, f57, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c0644M1535.f3099;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0644M1535.m1554(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0644M1535.m1554(1));
        }
        c0644M1535.m1568();
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
        mo30((C1148) getAdapter().getItem(i));
    }

    @Override // yyds.InterfaceC1632
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean mo30(C1148 c1148) {
        return this.f58.m1906(c1148, null, 0);
    }

    @Override // yyds.InterfaceC0665
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo31(MenuC0836 menuC0836) {
        this.f58 = menuC0836;
    }
}
