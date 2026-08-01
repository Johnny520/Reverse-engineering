package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.fv;
import defpackage.ju;
import defpackage.ku;
import defpackage.ou;
import defpackage.r5;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements ju, fv, AdapterView.OnItemClickListener {
    public static final int[] b = null;
    public ku a;

    static {
        b = new int[]{R.attr.background, R.attr.divider};
    }

    public ExpandedMenuView(Context r3, AttributeSet r4) {
        super(r3, r4);
        setOnItemClickListener(this);
        r5 r32 = r5.y(r3, r4, b, R.attr.listViewStyle);
        TypedArray r42 = (TypedArray) r32.b;
        if (r42.hasValue(0) == false) goto L6;
        setBackgroundDrawable(r32.m(0));
    L6:
        if (r42.hasValue(1) == false) goto L8;
        setDivider(r32.m(1));
    L8:
        r32.z();
    }

    @Override // defpackage.ju
    public final boolean a(ou r4) {
        return this.a.q(r4, null, 0);
    }

    @Override // defpackage.fv
    public final void b(ku r1) {
        this.a = r1;
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
        a((ou) getAdapter().getItem(r3));
    }
}
