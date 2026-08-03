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
    public static final int[] f1074a = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0234d c0234dM638s = C0234d.m638s(context, attributeSet, f1074a, R.attr.listViewStyle, 0);
        TypedArray typedArray = (TypedArray) c0234dM638s.f475c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0234dM638s.m646i(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0234dM638s.m646i(1));
        }
        c0234dM638s.m657u();
    }

    @Override // p055f.InterfaceC0778i
    /* JADX INFO: renamed from: a */
    public final boolean mo1116a(MenuItemC0780k menuItemC0780k) {
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
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        throw null;
    }
}
