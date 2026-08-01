package p068h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.p055lu.wxmask272.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: h.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0589h extends BaseAdapter {

    /* JADX INFO: renamed from: b */
    public int f2015b = -1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0590i f2016c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0589h(C0590i c0590i) {
        this.f2016c = c0590i;
        m1175a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1175a() {
        MenuC0594m menuC0594m = this.f2016c.f2019d;
        C0596o c0596o = menuC0594m.f2051v;
        if (c0596o != null) {
            menuC0594m.m1187i();
            ArrayList arrayList = menuC0594m.f2039j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0596o) arrayList.get(i2)) == c0596o) {
                    this.f2015b = i2;
                    return;
                }
            }
        }
        this.f2015b = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0596o getItem(int i2) {
        C0590i c0590i = this.f2016c;
        MenuC0594m menuC0594m = c0590i.f2019d;
        menuC0594m.m1187i();
        ArrayList arrayList = menuC0594m.f2039j;
        c0590i.getClass();
        int i3 = this.f2015b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C0596o) arrayList.get(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final int getCount() {
        C0590i c0590i = this.f2016c;
        MenuC0594m menuC0594m = c0590i.f2019d;
        menuC0594m.m1187i();
        int size = menuC0594m.f2039j.size();
        c0590i.getClass();
        return this.f2015b < 0 ? size : size - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2016c.f2018c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0576A) view).mo645c(getItem(i2));
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m1175a();
        super.notifyDataSetChanged();
    }
}
