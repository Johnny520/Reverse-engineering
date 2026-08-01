package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: hu */
/* JADX INFO: loaded from: classes.dex */
public final class C0311hu extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final MenuC0424ku f2306a;

    /* JADX INFO: renamed from: b */
    public int f2307b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f2308c;

    /* JADX INFO: renamed from: d */
    public final boolean f2309d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f2310e;

    /* JADX INFO: renamed from: f */
    public final int f2311f;

    public C0311hu(MenuC0424ku menuC0424ku, LayoutInflater layoutInflater, boolean z, int i) {
        this.f2309d = z;
        this.f2310e = layoutInflater;
        this.f2306a = menuC0424ku;
        this.f2311f = i;
        m1374a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1374a() {
        MenuC0424ku menuC0424ku = this.f2306a;
        C0572ou c0572ou = menuC0424ku.f2971v;
        if (c0572ou != null) {
            menuC0424ku.m1721i();
            ArrayList arrayList = menuC0424ku.f2959j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0572ou) arrayList.get(i)) == c0572ou) {
                    this.f2307b = i;
                    return;
                }
            }
        }
        this.f2307b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0572ou getItem(int i) {
        ArrayList arrayListM1722l;
        boolean z = this.f2309d;
        MenuC0424ku menuC0424ku = this.f2306a;
        if (z) {
            menuC0424ku.m1721i();
            arrayListM1722l = menuC0424ku.f2959j;
        } else {
            arrayListM1722l = menuC0424ku.m1722l();
        }
        int i2 = this.f2307b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0572ou) arrayListM1722l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM1722l;
        boolean z = this.f2309d;
        MenuC0424ku menuC0424ku = this.f2306a;
        if (z) {
            menuC0424ku.m1721i();
            arrayListM1722l = menuC0424ku.f2959j;
        } else {
            arrayListM1722l = menuC0424ku.m1722l();
        }
        return this.f2307b < 0 ? arrayListM1722l.size() : arrayListM1722l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f2310e.inflate(this.f2311f, viewGroup, false);
        }
        int i2 = getItem(i).f3587b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f3587b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2306a.mo634m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC0201ev interfaceC0201ev = (InterfaceC0201ev) view;
        if (this.f2308c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0201ev.mo134c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m1374a();
        super.notifyDataSetChanged();
    }
}
