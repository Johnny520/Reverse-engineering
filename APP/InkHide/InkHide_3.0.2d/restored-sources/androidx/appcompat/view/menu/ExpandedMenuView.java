package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p004C.C0064h;
import p068h.C0596o;
import p068h.InterfaceC0577B;
import p068h.InterfaceC0593l;
import p068h.MenuC0594m;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0593l, InterfaceC0577B, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c */
    public static final int[] f926c = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: b */
    public MenuC0594m f927b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0064h c0064hM114t = C0064h.m114t(context, attributeSet, f926c, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c0064hM114t.f309c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0064hM114t.m123m(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0064hM114t.m123m(1));
        }
        c0064hM114t.m130v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0577B
    /* JADX INFO: renamed from: b */
    public final void mo648b(MenuC0594m menuC0594m) {
        this.f927b = menuC0594m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0593l
    /* JADX INFO: renamed from: d */
    public final boolean mo649d(C0596o c0596o) {
        return this.f927b.m1190q(c0596o, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        mo649d((C0596o) getAdapter().getItem(i2));
    }
}
