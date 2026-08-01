package p190;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7780 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C7779 f21137;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21138 = -1;

    public C7780(C7779 c7779) {
        this.f21137 = c7779;
        m13141();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C7779 c7779 = this.f21137;
        MenuC7802 menuC7802 = c7779.f21135;
        menuC7802.m13168();
        int size = menuC7802.f21254.size();
        c7779.getClass();
        return this.f21138 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f21137.f21134.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC7787) view).mo454(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m13141();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7800 getItem(int i) {
        C7779 c7779 = this.f21137;
        MenuC7802 menuC7802 = c7779.f21135;
        menuC7802.m13168();
        ArrayList arrayList = menuC7802.f21254;
        c7779.getClass();
        int i2 = this.f21138;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C7800) arrayList.get(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13141() {
        MenuC7802 menuC7802 = this.f21137.f21135;
        C7800 c7800 = menuC7802.f21247;
        if (c7800 != null) {
            menuC7802.m13168();
            ArrayList arrayList = menuC7802.f21254;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C7800) arrayList.get(i)) == c7800) {
                    this.f21138 = i;
                    return;
                }
            }
        }
        this.f21138 = -1;
    }
}
