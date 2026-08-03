package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ir */
/* JADX INFO: loaded from: classes.dex */
public final class C2070ir extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final MenuC2204lr f7324a;

    /* JADX INFO: renamed from: b */
    public int f7325b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f7326c;

    /* JADX INFO: renamed from: d */
    public final boolean f7327d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f7328e;

    /* JADX INFO: renamed from: f */
    public final int f7329f;

    public C2070ir(MenuC2204lr menuC2204lr, LayoutInflater layoutInflater, boolean z, int i) {
        this.f7327d = z;
        this.f7328e = layoutInflater;
        this.f7324a = menuC2204lr;
        this.f7329f = i;
        m4239a();
    }

    /* JADX INFO: renamed from: a */
    public final void m4239a() {
        MenuC2204lr menuC2204lr = this.f7324a;
        C2427qr c2427qr = menuC2204lr.f7681v;
        if (c2427qr != null) {
            menuC2204lr.m4433i();
            ArrayList arrayList = menuC2204lr.f7669j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C2427qr) arrayList.get(i)) == c2427qr) {
                    this.f7325b = i;
                    return;
                }
            }
        }
        this.f7325b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2427qr getItem(int i) {
        ArrayList arrayListM4434l;
        boolean z = this.f7327d;
        MenuC2204lr menuC2204lr = this.f7324a;
        if (z) {
            menuC2204lr.m4433i();
            arrayListM4434l = menuC2204lr.f7669j;
        } else {
            arrayListM4434l = menuC2204lr.m4434l();
        }
        int i2 = this.f7325b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C2427qr) arrayListM4434l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM4434l;
        boolean z = this.f7327d;
        MenuC2204lr menuC2204lr = this.f7324a;
        if (z) {
            menuC2204lr.m4433i();
            arrayListM4434l = menuC2204lr.f7669j;
        } else {
            arrayListM4434l = menuC2204lr.m4434l();
        }
        return this.f7325b < 0 ? arrayListM4434l.size() : arrayListM4434l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f7328e.inflate(this.f7329f, viewGroup, false);
        }
        int i2 = getItem(i).f8493b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f8493b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f7324a.mo431m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC0249Fr interfaceC0249Fr = (InterfaceC0249Fr) view;
        if (this.f7326c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0249Fr.mo521c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m4239a();
        super.notifyDataSetChanged();
    }
}
