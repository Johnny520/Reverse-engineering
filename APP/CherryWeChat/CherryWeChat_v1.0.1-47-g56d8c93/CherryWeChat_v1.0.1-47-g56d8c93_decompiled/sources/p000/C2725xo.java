package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import io.github.cherrywechat.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: xo */
/* JADX INFO: loaded from: classes.dex */
public final class C2725xo extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public int f9309a = -1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2768yo f9310b;

    public C2725xo(C2768yo c2768yo) {
        this.f9310b = c2768yo;
        m5288a();
    }

    /* JADX INFO: renamed from: a */
    public final void m5288a() {
        MenuC2204lr menuC2204lr = this.f9310b.f9411c;
        C2427qr c2427qr = menuC2204lr.f7681v;
        if (c2427qr != null) {
            menuC2204lr.m4433i();
            ArrayList arrayList = menuC2204lr.f7669j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C2427qr) arrayList.get(i)) == c2427qr) {
                    this.f9309a = i;
                    return;
                }
            }
        }
        this.f9309a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2427qr getItem(int i) {
        C2768yo c2768yo = this.f9310b;
        MenuC2204lr menuC2204lr = c2768yo.f9411c;
        menuC2204lr.m4433i();
        ArrayList arrayList = menuC2204lr.f7669j;
        c2768yo.getClass();
        int i2 = this.f9309a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C2427qr) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C2768yo c2768yo = this.f9310b;
        MenuC2204lr menuC2204lr = c2768yo.f9411c;
        menuC2204lr.m4433i();
        int size = menuC2204lr.f7669j.size();
        c2768yo.getClass();
        return this.f9309a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f9310b.f9410b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0249Fr) view).mo521c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m5288a();
        super.notifyDataSetChanged();
    }
}
