package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.C0108;
import p190.C7799;
import p190.InterfaceC7787;
import p190.InterfaceC7800;
import p190.MenuC7801;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC7800, InterfaceC7787, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final int[] f370 = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public MenuC7801 f371;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0108 c0108M353 = C0108.m353(R.attr.listViewStyle, 0, context, attributeSet, f370);
        TypedArray typedArray = (TypedArray) c0108M353.f320;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0108M353.m389(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0108M353.m389(1));
        }
        c0108M353.m362();
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
        mo458((C7799) getAdapter().getItem(i));
    }

    @Override // p190.InterfaceC7800
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo458(C7799 c7799) {
        return this.f371.m13134(c7799, null, 0);
    }

    @Override // p190.InterfaceC7787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo459(MenuC7801 menuC7801) {
        this.f371 = menuC7801;
    }
}
