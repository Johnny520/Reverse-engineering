package p190;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7798 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f21207;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LayoutInflater f21208;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f21209;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f21210;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f21211 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final MenuC7802 f21212;

    public C7798(MenuC7802 menuC7802, LayoutInflater layoutInflater, boolean z, int i) {
        this.f21209 = z;
        this.f21208 = layoutInflater;
        this.f21212 = menuC7802;
        this.f21207 = i;
        m13149();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM13167;
        boolean z = this.f21209;
        MenuC7802 menuC7802 = this.f21212;
        if (z) {
            menuC7802.m13168();
            arrayListM13167 = menuC7802.f21254;
        } else {
            arrayListM13167 = menuC7802.m13167();
        }
        return this.f21211 < 0 ? arrayListM13167.size() : arrayListM13167.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f21208.inflate(this.f21207, viewGroup, false);
        }
        int i2 = getItem(i).f21242;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f21242 : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f21212.mo13129() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC7787 interfaceC7787 = (InterfaceC7787) view;
        if (this.f21210) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC7787.mo454(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m13149();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7800 getItem(int i) {
        ArrayList arrayListM13167;
        boolean z = this.f21209;
        MenuC7802 menuC7802 = this.f21212;
        if (z) {
            menuC7802.m13168();
            arrayListM13167 = menuC7802.f21254;
        } else {
            arrayListM13167 = menuC7802.m13167();
        }
        int i2 = this.f21211;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C7800) arrayListM13167.get(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13149() {
        MenuC7802 menuC7802 = this.f21212;
        C7800 c7800 = menuC7802.f21247;
        if (c7800 != null) {
            menuC7802.m13168();
            ArrayList arrayList = menuC7802.f21254;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C7800) arrayList.get(i)) == c7800) {
                    this.f21211 = i;
                    return;
                }
            }
        }
        this.f21211 = -1;
    }
}
