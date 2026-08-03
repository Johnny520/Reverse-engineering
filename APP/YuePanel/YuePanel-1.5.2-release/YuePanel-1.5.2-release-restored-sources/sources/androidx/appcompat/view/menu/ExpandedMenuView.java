package androidx.appcompat.view.menu;

import Yue.C7837;
import Yue.InterfaceC7144;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C8694;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements C8694.InterfaceC1604, InterfaceC8700, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int[] f25940 = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C8694 f25941;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f25942;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700
    public int getWindowAnimations() {
        return this.f25942;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700
    public void initialize(C8694 c8694) {
        this.f25941 = c8694;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo4638((C8697) getAdapter().getItem(i));
    }

    @Override // androidx.appcompat.view.menu.C8694.InterfaceC1604
    /* JADX INFO: renamed from: ۥ */
    public boolean mo4638(C8697 c8697) {
        return this.f25941.performItemAction(c8697, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C7837 c7837M24869 = C7837.m24869(context, attributeSet, f25940, i, 0);
        if (c7837M24869.m24896(0)) {
            setBackgroundDrawable(c7837M24869.m24875(0));
        }
        if (c7837M24869.m24896(1)) {
            setDivider(c7837M24869.m24875(1));
        }
        c7837M24869.m24899();
    }
}
