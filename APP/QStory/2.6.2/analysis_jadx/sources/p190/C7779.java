package p190;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7779 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C7778 f21140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21141 = -1;

    public C7779(C7778 c7778) {
        this.f21140 = c7778;
        m13113();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C7778 c7778 = this.f21140;
        MenuC7801 menuC7801 = c7778.f21138;
        menuC7801.m13140();
        int size = menuC7801.f21257.size();
        c7778.getClass();
        return this.f21141 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f21140.f21137.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC7786) view).mo453(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m13113();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7799 getItem(int i) {
        C7778 c7778 = this.f21140;
        MenuC7801 menuC7801 = c7778.f21138;
        menuC7801.m13140();
        ArrayList arrayList = menuC7801.f21257;
        c7778.getClass();
        int i2 = this.f21141;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C7799) arrayList.get(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13113() {
        MenuC7801 menuC7801 = this.f21140.f21138;
        C7799 c7799 = menuC7801.f21250;
        if (c7799 != null) {
            menuC7801.m13140();
            ArrayList arrayList = menuC7801.f21257;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C7799) arrayList.get(i)) == c7799) {
                    this.f21141 = i;
                    return;
                }
            }
        }
        this.f21141 = -1;
    }
}
