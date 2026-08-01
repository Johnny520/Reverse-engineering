package p190;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7797 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f21210;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LayoutInflater f21211;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f21212;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f21213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f21214 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final MenuC7801 f21215;

    public C7797(MenuC7801 menuC7801, LayoutInflater layoutInflater, boolean z, int i) {
        this.f21212 = z;
        this.f21211 = layoutInflater;
        this.f21215 = menuC7801;
        this.f21210 = i;
        m13121();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM13139;
        boolean z = this.f21212;
        MenuC7801 menuC7801 = this.f21215;
        if (z) {
            menuC7801.m13140();
            arrayListM13139 = menuC7801.f21257;
        } else {
            arrayListM13139 = menuC7801.m13139();
        }
        return this.f21214 < 0 ? arrayListM13139.size() : arrayListM13139.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f21211.inflate(this.f21210, viewGroup, false);
        }
        int i2 = getItem(i).f21245;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f21245 : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f21215.mo13101() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC7786 interfaceC7786 = (InterfaceC7786) view;
        if (this.f21213) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC7786.mo453(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m13121();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7799 getItem(int i) {
        ArrayList arrayListM13139;
        boolean z = this.f21212;
        MenuC7801 menuC7801 = this.f21215;
        if (z) {
            menuC7801.m13140();
            arrayListM13139 = menuC7801.f21257;
        } else {
            arrayListM13139 = menuC7801.m13139();
        }
        int i2 = this.f21214;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C7799) arrayListM13139.get(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13121() {
        MenuC7801 menuC7801 = this.f21215;
        C7799 c7799 = menuC7801.f21250;
        if (c7799 != null) {
            menuC7801.m13140();
            ArrayList arrayList = menuC7801.f21257;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C7799) arrayList.get(i)) == c7799) {
                    this.f21214 = i;
                    return;
                }
            }
        }
        this.f21214 = -1;
    }
}
