package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC1003k;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0997e extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final C0998f f3777a;

    /* JADX INFO: renamed from: b */
    public int f3778b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f3779c;

    /* JADX INFO: renamed from: d */
    public final boolean f3780d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f3781e;

    /* JADX INFO: renamed from: f */
    public final int f3782f;

    public C0997e(C0998f c0998f, LayoutInflater layoutInflater, boolean z, int i) {
        this.f3780d = z;
        this.f3781e = layoutInflater;
        this.f3777a = c0998f;
        this.f3782f = i;
        m2314b();
    }

    /* JADX INFO: renamed from: b */
    public final void m2314b() {
        C0998f c0998f = this.f3777a;
        C1000h c1000h = c0998f.f3805v;
        if (c1000h != null) {
            c0998f.m2324i();
            ArrayList<C1000h> arrayList = c0998f.f3793j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == c1000h) {
                    this.f3778b = i;
                    return;
                }
            }
        }
        this.f3778b = -1;
    }

    /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C1000h getItem(int i) {
        ArrayList<C1000h> arrayListM2327l;
        C0998f c0998f = this.f3777a;
        if (this.f3780d) {
            c0998f.m2324i();
            arrayListM2327l = c0998f.f3793j;
        } else {
            arrayListM2327l = c0998f.m2327l();
        }
        int i2 = this.f3778b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListM2327l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<C1000h> arrayListM2327l;
        C0998f c0998f = this.f3777a;
        if (this.f3780d) {
            c0998f.m2324i();
            arrayListM2327l = c0998f.f3793j;
        } else {
            arrayListM2327l = c0998f.m2327l();
        }
        return this.f3778b < 0 ? arrayListM2327l.size() : arrayListM2327l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f3781e.inflate(this.f3782f, viewGroup, false);
        }
        int i2 = getItem(i).f3815b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f3815b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3777a.mo2328m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC1003k.a aVar = (InterfaceC1003k.a) view;
        if (this.f3779c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo2300b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m2314b();
        super.notifyDataSetChanged();
    }
}
