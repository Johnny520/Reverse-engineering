package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ljx.wechatmod.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: cr */
/* JADX INFO: loaded from: classes.dex */
public final class C0124cr extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public int f1315a = -1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0160dr f1316b;

    public C0124cr(C0160dr c0160dr) {
        this.f1316b = c0160dr;
        m808a();
    }

    /* JADX INFO: renamed from: a */
    public final void m808a() {
        MenuC0424ku menuC0424ku = this.f1316b.f1624c;
        C0572ou c0572ou = menuC0424ku.f2971v;
        if (c0572ou != null) {
            menuC0424ku.m1721i();
            ArrayList arrayList = menuC0424ku.f2959j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0572ou) arrayList.get(i)) == c0572ou) {
                    this.f1315a = i;
                    return;
                }
            }
        }
        this.f1315a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0572ou getItem(int i) {
        C0160dr c0160dr = this.f1316b;
        MenuC0424ku menuC0424ku = c0160dr.f1624c;
        menuC0424ku.m1721i();
        ArrayList arrayList = menuC0424ku.f2959j;
        c0160dr.getClass();
        int i2 = this.f1315a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0572ou) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0160dr c0160dr = this.f1316b;
        MenuC0424ku menuC0424ku = c0160dr.f1624c;
        menuC0424ku.m1721i();
        int size = menuC0424ku.f2959j.size();
        c0160dr.getClass();
        return this.f1315a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1316b.f1623b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0201ev) view).mo134c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m808a();
        super.notifyDataSetChanged();
    }
}
