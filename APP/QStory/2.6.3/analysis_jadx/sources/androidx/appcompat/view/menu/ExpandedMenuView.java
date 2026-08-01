package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.C0108;
import p190.C7800;
import p190.InterfaceC7788;
import p190.InterfaceC7801;
import p190.MenuC7802;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC7801, InterfaceC7788, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final int[] f370 = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public MenuC7802 f371;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0108 c0108M354 = C0108.m354(R.attr.listViewStyle, 0, context, attributeSet, f370);
        TypedArray typedArray = (TypedArray) c0108M354.f320;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0108M354.m390(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0108M354.m390(1));
        }
        c0108M354.m363();
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
        mo459((C7800) getAdapter().getItem(i));
    }

    @Override // p190.InterfaceC7801
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo459(C7800 c7800) {
        return this.f371.m13162(c7800, null, 0);
    }

    @Override // p190.InterfaceC7788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo460(MenuC7802 menuC7802) {
        this.f371 = menuC7802;
    }
}
