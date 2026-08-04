package yyds;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᲁᲀᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2309 extends BaseAdapter {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int f11313;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f11314;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final LayoutInflater f11315;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final MenuC0836 f11316;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean f11317;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f11318 = -1;

    public C2309(MenuC0836 menuC0836, LayoutInflater layoutInflater, boolean z, int i) {
        this.f11317 = z;
        this.f11315 = layoutInflater;
        this.f11316 = menuC0836;
        this.f11313 = i;
        m4319();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM1911;
        boolean z = this.f11317;
        MenuC0836 menuC0836 = this.f11316;
        if (z) {
            menuC0836.m1898();
            arrayListM1911 = menuC0836.f3838;
        } else {
            arrayListM1911 = menuC0836.m1911();
        }
        return this.f11318 < 0 ? arrayListM1911.size() : arrayListM1911.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f11315.inflate(this.f11313, viewGroup, false);
        }
        int i2 = getItem(i).f5278;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f5278 : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f11316.mo1897() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC2468 interfaceC2468 = (InterfaceC2468) view;
        if (this.f11314) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC2468.mo26(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m4319();
        super.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4319() {
        MenuC0836 menuC0836 = this.f11316;
        C1148 c1148 = menuC0836.f3827;
        if (c1148 != null) {
            menuC0836.m1898();
            ArrayList arrayList = menuC0836.f3838;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1148) arrayList.get(i)) == c1148) {
                    this.f11318 = i;
                    return;
                }
            }
        }
        this.f11318 = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C1148 getItem(int i) {
        ArrayList arrayListM1911;
        boolean z = this.f11317;
        MenuC0836 menuC0836 = this.f11316;
        if (z) {
            menuC0836.m1898();
            arrayListM1911 = menuC0836.f3838;
        } else {
            arrayListM1911 = menuC0836.m1911();
        }
        int i2 = this.f11318;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1148) arrayListM1911.get(i);
    }
}
