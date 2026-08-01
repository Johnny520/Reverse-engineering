package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.C0955;
import p206.C8629;
import p206.InterfaceC8617;
import p206.InterfaceC8630;
import p206.MenuC8631;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC8630, InterfaceC8617, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final int[] f715 = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public MenuC8631 f716;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0955 c0955M914 = C0955.m914(R.attr.listViewStyle, 0, context, attributeSet, f715);
        TypedArray typedArray = (TypedArray) c0955M914.f665;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0955M914.m950(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0955M914.m950(1));
        }
        c0955M914.m923();
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
        mo1019((C8629) getAdapter().getItem(i));
    }

    @Override // p206.InterfaceC8630
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo1019(C8629 c8629) {
        return this.f716.m13721(c8629, null, 0);
    }

    @Override // p206.InterfaceC8617
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo1020(MenuC8631 menuC8631) {
        this.f716 = menuC8631;
    }
}
