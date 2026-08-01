package p206;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8627 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f21552;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LayoutInflater f21553;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f21554;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f21555;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f21556 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final MenuC8631 f21557;

    public C8627(MenuC8631 menuC8631, LayoutInflater layoutInflater, boolean z, int i) {
        this.f21554 = z;
        this.f21553 = layoutInflater;
        this.f21557 = menuC8631;
        this.f21552 = i;
        m13708();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM13726;
        boolean z = this.f21554;
        MenuC8631 menuC8631 = this.f21557;
        if (z) {
            menuC8631.m13727();
            arrayListM13726 = menuC8631.f21599;
        } else {
            arrayListM13726 = menuC8631.m13726();
        }
        return this.f21556 < 0 ? arrayListM13726.size() : arrayListM13726.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f21553.inflate(this.f21552, viewGroup, false);
        }
        int i2 = getItem(i).f21587;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f21587 : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f21557.mo13688() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC8616 interfaceC8616 = (InterfaceC8616) view;
        if (this.f21555) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC8616.mo1014(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m13708();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C8629 getItem(int i) {
        ArrayList arrayListM13726;
        boolean z = this.f21554;
        MenuC8631 menuC8631 = this.f21557;
        if (z) {
            menuC8631.m13727();
            arrayListM13726 = menuC8631.f21599;
        } else {
            arrayListM13726 = menuC8631.m13726();
        }
        int i2 = this.f21556;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C8629) arrayListM13726.get(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13708() {
        MenuC8631 menuC8631 = this.f21557;
        C8629 c8629 = menuC8631.f21592;
        if (c8629 != null) {
            menuC8631.m13727();
            ArrayList arrayList = menuC8631.f21599;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C8629) arrayList.get(i)) == c8629) {
                    this.f21556 = i;
                    return;
                }
            }
        }
        this.f21556 = -1;
    }
}
