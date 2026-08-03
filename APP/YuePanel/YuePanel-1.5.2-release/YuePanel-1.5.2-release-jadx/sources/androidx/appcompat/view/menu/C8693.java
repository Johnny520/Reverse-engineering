package androidx.appcompat.view.menu;

import Yue.InterfaceC7144;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC8700;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C8693 extends BaseAdapter {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C8694 f26023;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f26024 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f26025;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean f26026;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final LayoutInflater f26027;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final int f26028;

    public C8693(C8694 c8694, LayoutInflater layoutInflater, boolean z, int i) {
        this.f26026 = z;
        this.f26027 = layoutInflater;
        this.f26023 = c8694;
        this.f26028 = i;
        m4647();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f26024 < 0 ? (this.f26026 ? this.f26023.getNonActionItems() : this.f26023.getVisibleItems()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f26027.inflate(this.f26028, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f26023.isGroupDividerEnabled() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC8700.InterfaceC1608 interfaceC1608 = (InterfaceC8700.InterfaceC1608) view;
        if (this.f26025) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1608.initialize(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m4647();
        super.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4647() {
        C8697 expandedItem = this.f26023.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<C8697> nonActionItems = this.f26023.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (nonActionItems.get(i) == expandedItem) {
                    this.f26024 = i;
                    return;
                }
            }
        }
        this.f26024 = -1;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public C8694 m4648() {
        return this.f26023;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m29013() {
        return this.f26025;
    }

    /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C8697 getItem(int i) {
        ArrayList<C8697> nonActionItems = this.f26026 ? this.f26023.getNonActionItems() : this.f26023.getVisibleItems();
        int i2 = this.f26024;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return nonActionItems.get(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29015(boolean z) {
        this.f26025 = z;
    }
}
