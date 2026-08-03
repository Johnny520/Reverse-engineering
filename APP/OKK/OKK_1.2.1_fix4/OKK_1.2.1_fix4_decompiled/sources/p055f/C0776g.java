package p055f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: f.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0776g extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final MenuC0779j f2778a;

    /* JADX INFO: renamed from: b */
    public int f2779b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f2780c;

    /* JADX INFO: renamed from: d */
    public final boolean f2781d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f2782e;

    /* JADX INFO: renamed from: f */
    public final int f2783f;

    public C0776g(MenuC0779j menuC0779j, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f2781d = z2;
        this.f2782e = layoutInflater;
        this.f2778a = menuC0779j;
        this.f2783f = i2;
        m1993a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1993a() {
        MenuC0779j menuC0779j = this.f2778a;
        MenuItemC0780k menuItemC0780k = menuC0779j.f2803s;
        if (menuItemC0780k != null) {
            menuC0779j.m2003i();
            ArrayList arrayList = menuC0779j.f2794j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((MenuItemC0780k) arrayList.get(i2)) == menuItemC0780k) {
                    this.f2779b = i2;
                    return;
                }
            }
        }
        this.f2779b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MenuItemC0780k getItem(int i2) {
        ArrayList arrayListM2005k;
        boolean z2 = this.f2781d;
        MenuC0779j menuC0779j = this.f2778a;
        if (z2) {
            menuC0779j.m2003i();
            arrayListM2005k = menuC0779j.f2794j;
        } else {
            arrayListM2005k = menuC0779j.m2005k();
        }
        int i3 = this.f2779b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (MenuItemC0780k) arrayListM2005k.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM2005k;
        boolean z2 = this.f2781d;
        MenuC0779j menuC0779j = this.f2778a;
        if (z2) {
            menuC0779j.m2003i();
            arrayListM2005k = menuC0779j.f2794j;
        } else {
            arrayListM2005k = menuC0779j.m2005k();
        }
        return this.f2779b < 0 ? arrayListM2005k.size() : arrayListM2005k.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2782e.inflate(this.f2783f, viewGroup, false);
        }
        int i3 = getItem(i2).f2808b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f2808b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2778a.mo2006l() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0786q interfaceC0786q = (InterfaceC0786q) view;
        if (this.f2780c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0786q.mo1113c(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m1993a();
        super.notifyDataSetChanged();
    }
}
