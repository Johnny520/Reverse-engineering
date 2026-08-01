package p068h;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: h.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0591j extends BaseAdapter {

    /* JADX INFO: renamed from: b */
    public final MenuC0594m f2023b;

    /* JADX INFO: renamed from: c */
    public int f2024c = -1;

    /* JADX INFO: renamed from: d */
    public boolean f2025d;

    /* JADX INFO: renamed from: e */
    public final boolean f2026e;

    /* JADX INFO: renamed from: f */
    public final LayoutInflater f2027f;

    /* JADX INFO: renamed from: g */
    public final int f2028g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0591j(MenuC0594m menuC0594m, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f2026e = z2;
        this.f2027f = layoutInflater;
        this.f2023b = menuC0594m;
        this.f2028g = i2;
        m1180a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1180a() {
        MenuC0594m menuC0594m = this.f2023b;
        C0596o c0596o = menuC0594m.f2051v;
        if (c0596o != null) {
            menuC0594m.m1187i();
            ArrayList arrayList = menuC0594m.f2039j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0596o) arrayList.get(i2)) == c0596o) {
                    this.f2024c = i2;
                    return;
                }
            }
        }
        this.f2024c = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0596o getItem(int i2) {
        ArrayList arrayListM1188l;
        MenuC0594m menuC0594m = this.f2023b;
        if (this.f2026e) {
            menuC0594m.m1187i();
            arrayListM1188l = menuC0594m.f2039j;
        } else {
            arrayListM1188l = menuC0594m.m1188l();
        }
        int i3 = this.f2024c;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C0596o) arrayListM1188l.get(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM1188l;
        MenuC0594m menuC0594m = this.f2023b;
        if (this.f2026e) {
            menuC0594m.m1187i();
            arrayListM1188l = menuC0594m.f2039j;
        } else {
            arrayListM1188l = menuC0594m.m1188l();
        }
        return this.f2024c < 0 ? arrayListM1188l.size() : arrayListM1188l.size() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2027f.inflate(this.f2028g, viewGroup, false);
        }
        int i3 = getItem(i2).f2061b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f2061b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2023b.mo1165m() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0576A interfaceC0576A = (InterfaceC0576A) view;
        if (this.f2025d) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0576A.mo645c(getItem(i2));
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m1180a();
        super.notifyDataSetChanged();
    }
}
