package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: nu */
/* JADX INFO: loaded from: classes.dex */
public final class C0535nu extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final MenuC0646qu f3348a;

    /* JADX INFO: renamed from: b */
    public int f3349b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f3350c;

    /* JADX INFO: renamed from: d */
    public final boolean f3351d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f3352e;

    /* JADX INFO: renamed from: f */
    public final int f3353f;

    public C0535nu(MenuC0646qu menuC0646qu, LayoutInflater layoutInflater, boolean z, int i) {
        this.f3351d = z;
        this.f3352e = layoutInflater;
        this.f3348a = menuC0646qu;
        this.f3353f = i;
        m1961a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1961a() {
        MenuC0646qu menuC0646qu = this.f3348a;
        C0869wu c0869wu = menuC0646qu.f3972v;
        if (c0869wu != null) {
            menuC0646qu.m2170i();
            ArrayList arrayList = menuC0646qu.f3960j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0869wu) arrayList.get(i)) == c0869wu) {
                    this.f3349b = i;
                    return;
                }
            }
        }
        this.f3349b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0869wu getItem(int i) {
        ArrayList arrayListM2171l;
        boolean z = this.f3351d;
        MenuC0646qu menuC0646qu = this.f3348a;
        if (z) {
            menuC0646qu.m2170i();
            arrayListM2171l = menuC0646qu.f3960j;
        } else {
            arrayListM2171l = menuC0646qu.m2171l();
        }
        int i2 = this.f3349b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0869wu) arrayListM2171l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM2171l;
        boolean z = this.f3351d;
        MenuC0646qu menuC0646qu = this.f3348a;
        if (z) {
            menuC0646qu.m2170i();
            arrayListM2171l = menuC0646qu.f3960j;
        } else {
            arrayListM2171l = menuC0646qu.m2171l();
        }
        return this.f3349b < 0 ? arrayListM2171l.size() : arrayListM2171l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f3352e.inflate(this.f3353f, viewGroup, false);
        }
        int i2 = getItem(i).f5113b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f5113b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3348a.mo1571m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC0499mv interfaceC0499mv = (InterfaceC0499mv) view;
        if (this.f3350c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0499mv.mo119c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m1961a();
        super.notifyDataSetChanged();
    }
}
